package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.text.TextUtils;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.fk;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TapjoyCache {
    public static final String CACHE_DIRECTORY_NAME = "Tapjoy/Cache/";
    public static final int CACHE_LIMIT = -1;

    /* renamed from: a, reason: collision with root package name */
    private static TapjoyCache f7748a;
    public static boolean unit_test_mode;

    /* renamed from: b, reason: collision with root package name */
    private Context f7749b;

    /* renamed from: c, reason: collision with root package name */
    private TapjoyCacheMap f7750c;

    /* renamed from: d, reason: collision with root package name */
    private Vector f7751d;
    private ExecutorService e;
    private File f;

    public TapjoyCache(Context context) {
        if (f7748a == null || unit_test_mode) {
            f7748a = this;
            this.f7749b = context;
            this.f7750c = new TapjoyCacheMap(context, -1);
            this.f7751d = new Vector();
            this.e = Executors.newFixedThreadPool(5);
            if (Environment.getExternalStorageDirectory() != null) {
                TapjoyUtil.deleteFileOrDirectory(new File(Environment.getExternalStorageDirectory(), "tapjoy"));
                TapjoyUtil.deleteFileOrDirectory(new File(Environment.getExternalStorageDirectory(), "tjcache/tmp/"));
            }
            this.f = new File(this.f7749b.getFilesDir() + "/Tapjoy/Cache/");
            if (!this.f.exists()) {
                if (this.f.mkdirs()) {
                    TapjoyLog.d("TapjoyCache", "Created directory at: " + this.f.getPath());
                } else {
                    TapjoyLog.e("TapjoyCache", "Error initalizing cache");
                    f7748a = null;
                }
            }
            a();
        }
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f7749b.getSharedPreferences(TapjoyConstants.PREF_TAPJOY_CACHE, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            File file = new File(entry.getKey());
            if (file.exists() && file.isFile()) {
                TapjoyCachedAssetData fromRawJSONString = TapjoyCachedAssetData.fromRawJSONString(entry.getValue().toString());
                if (fromRawJSONString != null) {
                    TapjoyLog.d("TapjoyCache", "Loaded Asset: " + fromRawJSONString.getAssetURL());
                    String b2 = b(fromRawJSONString.getAssetURL());
                    if (b2 == null || "".equals(b2) || b2.length() <= 0) {
                        TapjoyLog.e("TapjoyCache", "Removing asset because deserialization failed.");
                        edit.remove(entry.getKey()).apply();
                    } else if (fromRawJSONString.getTimeOfDeathInSeconds() < System.currentTimeMillis() / 1000) {
                        TapjoyLog.d("TapjoyCache", "Asset expired, removing from cache: " + fromRawJSONString.getAssetURL());
                        if (fromRawJSONString.getLocalFilePath() != null && fromRawJSONString.getLocalFilePath().length() > 0) {
                            TapjoyUtil.deleteFileOrDirectory(new File(fromRawJSONString.getLocalFilePath()));
                        }
                    } else {
                        this.f7750c.put(b2, fromRawJSONString);
                    }
                } else {
                    TapjoyLog.e("TapjoyCache", "Removing asset because deserialization failed.");
                    edit.remove(entry.getKey()).apply();
                }
            } else {
                TapjoyLog.d("TapjoyCache", "Removing reference to missing asset: " + entry.getKey());
                edit.remove(entry.getKey()).apply();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.tapjoy.TapjoyCache$1] */
    public void cacheAssetGroup(final JSONArray jSONArray, final TJCacheListener tJCacheListener) {
        if (jSONArray != null && jSONArray.length() > 0) {
            new Thread() { // from class: com.tapjoy.TapjoyCache.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    TapjoyLog.d("TapjoyCache", "Starting to cache asset group size of " + jSONArray.length());
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            Future cacheAssetFromJSONObject = TapjoyCache.this.cacheAssetFromJSONObject(jSONArray.getJSONObject(i));
                            if (cacheAssetFromJSONObject != null) {
                                arrayList.add(cacheAssetFromJSONObject);
                            }
                        } catch (JSONException unused) {
                            TapjoyLog.e("TapjoyCache", "Failed to load JSON object from JSONArray");
                        }
                    }
                    Iterator it = arrayList.iterator();
                    int i2 = 1;
                    while (it.hasNext()) {
                        try {
                        } catch (InterruptedException e) {
                            TapjoyLog.e("TapjoyCache", "Caching thread failed: " + e.toString());
                        } catch (ExecutionException e2) {
                            TapjoyLog.e("TapjoyCache", "Caching thread failed: " + e2.toString());
                        }
                        if (!((Boolean) ((Future) it.next()).get()).booleanValue()) {
                            i2 = 2;
                        }
                    }
                    TapjoyLog.d("TapjoyCache", "Finished caching group");
                    if (tJCacheListener != null) {
                        tJCacheListener.onCachingComplete(i2);
                    }
                }
            }.start();
        } else if (tJCacheListener != null) {
            tJCacheListener.onCachingComplete(1);
        }
    }

    public Future cacheAssetFromJSONObject(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("url");
            Long.valueOf(86400L);
            return cacheAssetFromURL(string, jSONObject.optString(TapjoyConstants.TJC_PLACEMENT_OFFER_ID), Long.valueOf(jSONObject.optLong(TapjoyConstants.TJC_TIME_TO_LIVE)).longValue());
        } catch (JSONException unused) {
            TapjoyLog.e("TapjoyCache", "Required parameters to cache an asset from JSON is not present");
            return null;
        }
    }

    public Future cacheAssetFromURL(String str, String str2, long j) {
        try {
            URL url = new URL(str);
            if (this.f7751d.contains(b(str))) {
                TapjoyLog.d("TapjoyCache", "URL is already in the process of being cached: " + str);
                return null;
            }
            return startCachingThread(url, str2, j);
        } catch (MalformedURLException unused) {
            TapjoyLog.d("TapjoyCache", "Invalid cache assetURL");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str) {
        if (str.startsWith("//")) {
            str = "http:" + str;
        }
        try {
            return new URL(str).getFile();
        } catch (MalformedURLException unused) {
            TapjoyLog.e("TapjoyCache", "Invalid URL " + str);
            return "";
        }
    }

    public Future startCachingThread(URL url, String str, long j) {
        if (url != null) {
            return this.e.submit(new CacheAssetThread(url, str, j));
        }
        return null;
    }

    public void clearTapjoyCache() {
        TapjoyLog.d("TapjoyCache", "Cleaning Tapjoy cache!");
        TapjoyUtil.deleteFileOrDirectory(this.f);
        if (this.f.mkdirs()) {
            TapjoyLog.d("TapjoyCache", "Created new cache directory at: " + this.f.getPath());
        }
        this.f7750c = new TapjoyCacheMap(this.f7749b, -1);
    }

    public boolean removeAssetFromCache(String str) {
        String b2 = b(str);
        return (b2 == "" || this.f7750c.remove((Object) b2) == null) ? false : true;
    }

    public boolean isURLDownloading(String str) {
        String b2;
        return (this.f7751d == null || (b2 = b(str)) == "" || !this.f7751d.contains(b2)) ? false : true;
    }

    public boolean isURLCached(String str) {
        return this.f7750c.get(b(str)) != null;
    }

    public TapjoyCachedAssetData getCachedDataForURL(String str) {
        String b2 = b(str);
        if (b2 != "") {
            return (TapjoyCachedAssetData) this.f7750c.get(b2);
        }
        return null;
    }

    public TapjoyCacheMap getCachedData() {
        return this.f7750c;
    }

    public String getPathOfCachedURL(String str) {
        String b2 = b(str);
        if (b2 == "" || !this.f7750c.containsKey(b2)) {
            return str;
        }
        TapjoyCachedAssetData tapjoyCachedAssetData = (TapjoyCachedAssetData) this.f7750c.get(b2);
        if (new File(tapjoyCachedAssetData.getLocalFilePath()).exists()) {
            return tapjoyCachedAssetData.getLocalURL();
        }
        getInstance().removeAssetFromCache(str);
        return str;
    }

    public String cachedAssetsToJSON() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : this.f7750c.entrySet()) {
            try {
                jSONObject.put(((String) entry.getKey()).toString(), ((TapjoyCachedAssetData) entry.getValue()).toRawJSONString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject.toString();
    }

    public String getCachedOfferIDs() {
        ArrayList arrayList = new ArrayList();
        if (this.f7750c == null) {
            return "";
        }
        Iterator it = this.f7750c.entrySet().iterator();
        while (it.hasNext()) {
            String offerId = ((TapjoyCachedAssetData) ((Map.Entry) it.next()).getValue()).getOfferId();
            if (offerId != null && offerId.length() != 0 && !arrayList.contains(offerId)) {
                arrayList.add(offerId);
            }
        }
        return TextUtils.join(",", arrayList);
    }

    public void printCacheInformation() {
        TapjoyLog.d("TapjoyCache", "------------- Cache Data -------------");
        TapjoyLog.d("TapjoyCache", "Number of files in cache: " + this.f7750c.size());
        TapjoyLog.d("TapjoyCache", "Cache Size: " + TapjoyUtil.fileOrDirectorySize(this.f));
        TapjoyLog.d("TapjoyCache", "--------------------------------------");
    }

    public static TapjoyCache getInstance() {
        return f7748a;
    }

    public static void setInstance(TapjoyCache tapjoyCache) {
        f7748a = tapjoyCache;
    }

    public class CacheAssetThread implements Callable {

        /* renamed from: b, reason: collision with root package name */
        private URL f7756b;

        /* renamed from: c, reason: collision with root package name */
        private String f7757c;

        /* renamed from: d, reason: collision with root package name */
        private long f7758d;

        public CacheAssetThread(URL url, String str, long j) {
            this.f7756b = url;
            this.f7757c = str;
            this.f7758d = j;
            if (this.f7758d <= 0) {
                this.f7758d = 86400L;
            }
            TapjoyCache.this.f7751d.add(TapjoyCache.b(this.f7756b.toString()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v18 */
        /* JADX WARN: Type inference failed for: r5v19 */
        /* JADX WARN: Type inference failed for: r5v20 */
        /* JADX WARN: Type inference failed for: r5v21, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v6 */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            BufferedOutputStream bufferedOutputStream;
            BufferedOutputStream bufferedOutputStream2;
            int responseCode;
            String b2 = TapjoyCache.b(this.f7756b.toString());
            if (TapjoyCache.this.f7750c.containsKey(b2)) {
                if (new File(((TapjoyCachedAssetData) TapjoyCache.this.f7750c.get(b2)).getLocalFilePath()).exists()) {
                    if (this.f7758d != 0) {
                        ((TapjoyCachedAssetData) TapjoyCache.this.f7750c.get(b2)).resetTimeToLive(this.f7758d);
                    } else {
                        ((TapjoyCachedAssetData) TapjoyCache.this.f7750c.get(b2)).resetTimeToLive(86400L);
                    }
                    TapjoyLog.d("TapjoyCache", "Reseting time to live for " + this.f7756b.toString());
                    TapjoyCache.this.f7751d.remove(b2);
                    return true;
                }
                TapjoyCache.getInstance().removeAssetFromCache(b2);
            }
            System.currentTimeMillis();
            try {
                File file = new File(TapjoyCache.this.f + "/" + TapjoyUtil.SHA256(b2));
                BufferedOutputStream bufferedOutputStream3 = "Downloading and caching asset from: " + this.f7756b + " to " + file;
                TapjoyLog.d("TapjoyCache", bufferedOutputStream3);
                BufferedInputStream bufferedInputStream = null;
                try {
                    try {
                        URLConnection a2 = fk.a(this.f7756b);
                        a2.setConnectTimeout(15000);
                        a2.setReadTimeout(30000);
                        a2.connect();
                        if ((a2 instanceof HttpURLConnection) && (responseCode = ((HttpURLConnection) a2).getResponseCode()) != 200) {
                            throw new IOException("Unexpected response code: " + responseCode);
                        }
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(a2.getInputStream());
                        try {
                            bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(file));
                            try {
                                TapjoyUtil.writeFileToDevice(bufferedInputStream2, bufferedOutputStream3);
                                try {
                                    bufferedInputStream2.close();
                                } catch (IOException unused) {
                                }
                                try {
                                    bufferedOutputStream3.close();
                                } catch (IOException unused2) {
                                }
                                TapjoyCachedAssetData tapjoyCachedAssetData = new TapjoyCachedAssetData(this.f7756b.toString(), file.getAbsolutePath(), this.f7758d);
                                if (this.f7757c != null) {
                                    tapjoyCachedAssetData.setOfferID(this.f7757c);
                                }
                                TapjoyCache.this.f7750c.put(b2, tapjoyCachedAssetData);
                                TapjoyCache.this.f7751d.remove(b2);
                                TapjoyLog.d("TapjoyCache", "----- Download complete -----" + tapjoyCachedAssetData.toString());
                                return true;
                            } catch (SocketTimeoutException e) {
                                e = e;
                                bufferedInputStream = bufferedInputStream2;
                                bufferedOutputStream2 = bufferedOutputStream3;
                                TapjoyLog.e("TapjoyCache", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.NETWORK_ERROR, "Network timeout during caching: " + e.toString()));
                                TapjoyCache.this.f7751d.remove(b2);
                                TapjoyUtil.deleteFileOrDirectory(file);
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                if (bufferedOutputStream2 != null) {
                                    try {
                                        bufferedOutputStream2.close();
                                    } catch (IOException unused4) {
                                    }
                                }
                                return false;
                            } catch (Exception e2) {
                                e = e2;
                                bufferedInputStream = bufferedInputStream2;
                                bufferedOutputStream = bufferedOutputStream3;
                                TapjoyLog.e("TapjoyCache", "Error caching asset: " + e.toString());
                                TapjoyCache.this.f7751d.remove(b2);
                                TapjoyUtil.deleteFileOrDirectory(file);
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException unused5) {
                                    }
                                }
                                if (bufferedOutputStream != null) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (IOException unused6) {
                                    }
                                }
                                return false;
                            } catch (Throwable th) {
                                th = th;
                                bufferedInputStream = bufferedInputStream2;
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException unused7) {
                                    }
                                }
                                if (bufferedOutputStream3 == 0) {
                                    throw th;
                                }
                                try {
                                    bufferedOutputStream3.close();
                                    throw th;
                                } catch (IOException unused8) {
                                    throw th;
                                }
                            }
                        } catch (SocketTimeoutException e3) {
                            e = e3;
                            bufferedOutputStream3 = 0;
                        } catch (Exception e4) {
                            e = e4;
                            bufferedOutputStream3 = 0;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream3 = 0;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (SocketTimeoutException e5) {
                    e = e5;
                    bufferedOutputStream2 = null;
                } catch (Exception e6) {
                    e = e6;
                    bufferedOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedOutputStream3 = 0;
                }
            } catch (Exception unused9) {
                TapjoyCache.this.f7751d.remove(b2);
                return false;
            }
        }
    }
}
