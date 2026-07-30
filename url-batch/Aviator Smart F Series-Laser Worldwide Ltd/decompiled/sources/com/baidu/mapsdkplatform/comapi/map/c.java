package com.baidu.mapsdkplatform.comapi.map;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.mapapi.NetworkUtil;
import com.baidu.mapapi.OpenLogUtil;
import com.baidu.mapapi.http.AsyncHttpClient;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapsdkplatform.comapi.commonutils.c.c;
import com.baidu.mapsdkplatform.comapi.util.SyncSysInfo;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.just.agentweb.DefaultWebClient;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8076a = "c";

    /* renamed from: b, reason: collision with root package name */
    private AsyncHttpClient f8077b;

    class a extends HttpClient.ProtoResultCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f8078a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8079b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC0078c f8080c;

        a(Context context, String str, InterfaceC0078c interfaceC0078c) {
            this.f8078a = context;
            this.f8079b = str;
            this.f8080c = interfaceC0078c;
        }

        @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
        public void onFailed(HttpClient.HttpStateError httpStateError) {
            String a8 = c.this.a(this.f8078a, this.f8079b);
            if (!c.this.b(a8)) {
                a8 = null;
            }
            InterfaceC0078c interfaceC0078c = this.f8080c;
            if (interfaceC0078c != null) {
                interfaceC0078c.onCustomMapStyleLoadFailed(httpStateError.ordinal(), httpStateError.name(), a8);
            }
            if (OpenLogUtil.isMapLogEnable()) {
                com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("CustomMap failed error = " + httpStateError.ordinal());
            }
        }

        @Override // com.baidu.mapapi.http.HttpClient.ProtoResultCallback
        public void onSuccess(String str) {
            c.this.a(this.f8078a, str, this.f8079b, this.f8080c);
            if (OpenLogUtil.isMapLogEnable()) {
                com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("CustomMap result = " + str);
            }
        }
    }

    class b implements c.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f8082a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8083b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC0078c f8084c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f8085d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f8086e;

        b(Context context, String str, InterfaceC0078c interfaceC0078c, String str2, String str3) {
            this.f8082a = context;
            this.f8083b = str;
            this.f8084c = interfaceC0078c;
            this.f8085d = str2;
            this.f8086e = str3;
        }

        @Override // com.baidu.mapsdkplatform.comapi.commonutils.c.c.d
        public void a(File file) {
            boolean a8 = c.this.a(this.f8082a, file, this.f8083b);
            if (OpenLogUtil.isMapLogEnable()) {
                com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("CustomMap loadStyleFile success ret = " + a8);
            }
            if (a8) {
                c.this.a(this.f8082a, this.f8083b, this.f8085d);
                if (this.f8084c != null) {
                    this.f8084c.onCustomMapStyleLoadSuccess(true, c.this.b(this.f8086e) ? this.f8086e : null);
                    return;
                }
                return;
            }
            InterfaceC0078c interfaceC0078c = this.f8084c;
            if (interfaceC0078c != null) {
                interfaceC0078c.onCustomMapStyleLoadFailed(HttpClient.HttpStateError.INNER_ERROR.ordinal(), "UnZipStyleFile onFailed", null);
            }
        }

        @Override // com.baidu.mapsdkplatform.comapi.commonutils.c.c.d
        public void onFailed() {
            InterfaceC0078c interfaceC0078c = this.f8084c;
            if (interfaceC0078c != null) {
                interfaceC0078c.onCustomMapStyleLoadFailed(HttpClient.HttpStateError.INNER_ERROR.ordinal(), "loadStyleFile onFailed", null);
            }
            if (OpenLogUtil.isMapLogEnable()) {
                com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("CustomMap loadStyleFile failed");
            }
        }
    }

    /* renamed from: com.baidu.mapsdkplatform.comapi.map.c$c, reason: collision with other inner class name */
    public interface InterfaceC0078c {
        void onCustomMapStyleLoadFailed(int i8, String str, String str2);

        void onCustomMapStyleLoadSuccess(boolean z7, String str);

        void onPreLoadLastCustomMapStyle(String str);
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final c f8088a = new c(null);
    }

    /* synthetic */ c(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    private c() {
        this.f8077b = new AsyncHttpClient();
    }

    private void b(Context context, String str, String str2, InterfaceC0078c interfaceC0078c) {
        this.f8077b.get(str, new a(context, str2, interfaceC0078c));
    }

    private String b(Context context, String str) {
        if (!b(a(context, str))) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(a(context));
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                String optString = ((JSONObject) jSONArray.opt(i8)).optString(str);
                if (!TextUtils.isEmpty(optString)) {
                    return optString;
                }
            }
            return "";
        } catch (JSONException unused) {
            return "";
        }
    }

    public static c a() {
        return d.f8088a;
    }

    public void a(Context context, String str, InterfaceC0078c interfaceC0078c) {
        a(context, str, true, interfaceC0078c);
    }

    private void a(Context context, String str, boolean z7, InterfaceC0078c interfaceC0078c) {
        String a8 = a(context, str);
        if (!b(a8)) {
            a8 = null;
        }
        if (interfaceC0078c != null) {
            interfaceC0078c.onPreLoadLastCustomMapStyle(a8);
        }
        if (!NetworkUtil.isNetworkAvailable(context)) {
            if (interfaceC0078c != null) {
                HttpClient.HttpStateError httpStateError = HttpClient.HttpStateError.NETWORK_ERROR;
                interfaceC0078c.onCustomMapStyleLoadFailed(httpStateError.ordinal(), httpStateError.name(), a8);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String a9 = a(context, str, z7);
        if (TextUtils.isEmpty(a9)) {
            Log.e(f8076a, "build request url failed");
        } else {
            b(context, a9, str, interfaceC0078c);
        }
    }

    private String a(Context context, String str, boolean z7) {
        if (context == null) {
            return "";
        }
        String b8 = b(context, str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(MapBundleKey.MapObjKey.OBJ_STYLE_ID, str);
        if (z7) {
            linkedHashMap.put("type", "publish");
        } else {
            linkedHashMap.put("type", "edit");
        }
        linkedHashMap.put("md5", b8);
        linkedHashMap.put(BaseParamNames.TOKEN, SyncSysInfo.getAuthToken());
        String str2 = a(linkedHashMap) + SyncSysInfo.getPhoneInfo();
        return a("api.map.baidu.com/sdkproxy/v2/lbs_androidsdk/custom/v2/getjsonstyle") + "?" + (str2 + "&sign=" + AppMD5.getSignMD5String(str2));
    }

    private String a(Map<String, String> map) {
        if (map.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        for (String str : map.keySet()) {
            String encodeUrlParamsValue = AppMD5.encodeUrlParamsValue(map.get(str));
            if (i8 == 0) {
                sb.append(str);
                sb.append("=");
                sb.append(encodeUrlParamsValue);
            } else {
                sb.append("&");
                sb.append(str);
                sb.append("=");
                sb.append(encodeUrlParamsValue);
            }
            i8++;
        }
        return sb.toString();
    }

    private String a(String str) {
        if (HttpClient.isHttpsEnable) {
            return DefaultWebClient.HTTPS_SCHEME + str;
        }
        return DefaultWebClient.HTTP_SCHEME + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, InterfaceC0078c interfaceC0078c) {
        String a8 = a(context, str2);
        String str3 = b(a8) ? a8 : null;
        if (TextUtils.isEmpty(str)) {
            if (interfaceC0078c != null) {
                HttpClient.HttpStateError httpStateError = HttpClient.HttpStateError.SERVER_ERROR;
                interfaceC0078c.onCustomMapStyleLoadFailed(httpStateError.ordinal(), httpStateError.name(), str3);
                return;
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("status");
            String optString = jSONObject.optString("message");
            if (!a(optInt, a8)) {
                if (interfaceC0078c != null) {
                    interfaceC0078c.onCustomMapStyleLoadSuccess(false, str3);
                }
            } else {
                if (optInt != 0) {
                    if (interfaceC0078c != null) {
                        interfaceC0078c.onCustomMapStyleLoadFailed(optInt, optString, str3);
                        return;
                    }
                    return;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null && optJSONObject.length() != 0) {
                    a(context, optJSONObject.optString("pb_url", ""), str2, optJSONObject.optString("md5", ""), interfaceC0078c);
                } else if (interfaceC0078c != null) {
                    interfaceC0078c.onCustomMapStyleLoadFailed(HttpClient.HttpStateError.SERVER_ERROR.ordinal(), "custom style data is null", str3);
                }
            }
        } catch (JSONException unused) {
            if (interfaceC0078c != null) {
                interfaceC0078c.onCustomMapStyleLoadFailed(HttpClient.HttpStateError.INNER_ERROR.ordinal(), "parse response result failed", str3);
            }
        }
    }

    private boolean a(int i8, String str) {
        return (103 == i8 && b(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(Context context, String str) {
        if (context == null) {
            return null;
        }
        return context.getFilesDir().getAbsolutePath() + File.separator + "sc_sty_" + str + ".sty";
    }

    private void a(Context context, String str, String str2, String str3, InterfaceC0078c interfaceC0078c) {
        if (TextUtils.isEmpty(str) || context == null) {
            return;
        }
        String a8 = a(str);
        String a9 = a(context, str2);
        new com.baidu.mapsdkplatform.comapi.commonutils.c.c().a(a8, context.getFilesDir().getAbsolutePath(), str2 + ".zip", 2, new b(context, str2, interfaceC0078c, str3, a9));
    }

    private String a(Context context) {
        BufferedReader bufferedReader = null;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir().getAbsolutePath(), "ver.cfg");
        if (!file.exists()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                        } else {
                            try {
                                break;
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                    } catch (IOException e9) {
                        e = e9;
                        bufferedReader = bufferedReader2;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
                return sb.toString();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e12) {
            e = e12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2) {
        JSONArray jSONArray;
        PrintWriter printWriter;
        if (context == null) {
            return;
        }
        File file = new File(context.getFilesDir().getAbsolutePath(), "ver.cfg");
        String a8 = a(context);
        PrintWriter printWriter2 = null;
        try {
            try {
                if (TextUtils.isEmpty(a8)) {
                    jSONArray = new JSONArray();
                } else {
                    jSONArray = new JSONArray(a8);
                }
                int length = jSONArray.length();
                if (length == 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, str2);
                    jSONArray.put(jSONObject);
                } else {
                    int i8 = 0;
                    JSONObject jSONObject2 = null;
                    while (true) {
                        if (i8 >= length) {
                            i8 = -1;
                            break;
                        }
                        jSONObject2 = (JSONObject) jSONArray.opt(i8);
                        if (jSONObject2 != null && jSONObject2.has(str)) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    if (i8 != -1 && jSONObject2 != null) {
                        jSONObject2.put(str, str2);
                        jSONArray.put(i8, jSONObject2);
                    } else {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(str, str2);
                        jSONArray.put(jSONObject3);
                    }
                }
                printWriter = new PrintWriter(new FileWriter(file.getAbsoluteFile()));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e8) {
            e = e8;
        }
        try {
            printWriter.write(jSONArray.toString());
            printWriter.close();
        } catch (Exception e9) {
            e = e9;
            printWriter2 = printWriter;
            e.printStackTrace();
            if (printWriter2 != null) {
                printWriter2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            printWriter2 = printWriter;
            if (printWriter2 != null) {
                printWriter2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context, File file, String str) {
        ZipFile zipFile;
        if (file == null || context == null) {
            return false;
        }
        ZipFile zipFile2 = null;
        try {
            try {
                try {
                    zipFile = new ZipFile(file.getAbsoluteFile());
                } catch (IOException e8) {
                    Log.e(f8076a, "Close zipFile failed", e8);
                    return false;
                }
            } catch (FileNotFoundException e9) {
                e = e9;
            } catch (IOException e10) {
                e = e10;
            } catch (IllegalStateException e11) {
                e = e11;
            } catch (NullPointerException e12) {
                e = e12;
            } catch (SecurityException e13) {
                e = e13;
            } catch (ZipException e14) {
                e = e14;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            ZipEntry entry = zipFile.getEntry(str + ".sty");
            if (entry == null) {
                try {
                    zipFile.close();
                } catch (IOException e15) {
                    Log.e(f8076a, "Close zipFile failed", e15);
                }
                return false;
            }
            boolean a8 = a(zipFile.getInputStream(entry), new FileOutputStream(new File(a(context, str))));
            file.delete();
            try {
                zipFile.close();
            } catch (IOException e16) {
                Log.e(f8076a, "Close zipFile failed", e16);
            }
            return a8;
        } catch (FileNotFoundException e17) {
            e = e17;
            zipFile2 = zipFile;
            Log.e(f8076a, "unzip style file FileNotFoundException", e);
            if (zipFile2 != null) {
                zipFile2.close();
            }
            return false;
        } catch (IOException e18) {
            e = e18;
            zipFile2 = zipFile;
            Log.e(f8076a, "unzip style file IOException", e);
            if (zipFile2 != null) {
                zipFile2.close();
            }
            return false;
        } catch (IllegalStateException e19) {
            e = e19;
            zipFile2 = zipFile;
            Log.e(f8076a, "unzip style file IllegalStateException", e);
            if (zipFile2 != null) {
                zipFile2.close();
            }
            return false;
        } catch (NullPointerException e20) {
            e = e20;
            zipFile2 = zipFile;
            Log.e(f8076a, "unzip style file NullPointerException", e);
            if (zipFile2 != null) {
                zipFile2.close();
            }
            return false;
        } catch (SecurityException e21) {
            e = e21;
            zipFile2 = zipFile;
            Log.e(f8076a, "unzip style file SecurityException", e);
            if (zipFile2 != null) {
                zipFile2.close();
            }
            return false;
        } catch (ZipException e22) {
            e = e22;
            zipFile2 = zipFile;
            Log.e(f8076a, "unzip style file ZipException", e);
            if (zipFile2 != null) {
                zipFile2.close();
            }
            return false;
        } catch (Exception unused2) {
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                zipFile2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e23) {
                    Log.e(f8076a, "Close zipFile failed", e23);
                }
            }
            throw th;
        }
    }

    private boolean a(InputStream inputStream, FileOutputStream fileOutputStream) {
        if (inputStream == null || fileOutputStream == null) {
            return false;
        }
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            } finally {
            }
        }
        fileOutputStream.flush();
        try {
            inputStream.close();
        } catch (IOException e8) {
            Log.e(f8076a, "Close InputStream error", e8);
        }
        try {
            fileOutputStream.close();
            return true;
        } catch (IOException e9) {
            Log.e(f8076a, "Close OutputStream error", e9);
            return true;
        }
    }
}
