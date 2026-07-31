package com.bytedance.adsdk.fs;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.fs.btk.nqi;
import com.mobilefuse.sdk.common.BuildConfig;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes14.dex */
public class zg {
    private static final Map<String, mw<nps>> zmn = new HashMap();
    private static final Set<Object> fs = new HashSet();
    private static final byte[] zn = {80, 75, 3, 4};

    public static mw<nps> zmn(Context context, String str) {
        return zmn(context, str, "url_".concat(String.valueOf(str)));
    }

    public static mw<nps> zmn(final Context context, final String str, final String str2) {
        return zmn(str2, new Callable<klz<nps>>() { // from class: com.bytedance.adsdk.fs.zg.1
            @Override // java.util.concurrent.Callable
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public klz<nps> call() throws Exception {
                klz<nps> zmn2 = btk.zmn(context).zmn(context, str, str2);
                if (str2 != null && zmn2.zmn() != null) {
                    com.bytedance.adsdk.fs.zn.btk.zmn().zmn(str2, zmn2.zmn());
                }
                return zmn2;
            }
        });
    }

    public static mw<nps> fs(Context context, String str) {
        return fs(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static mw<nps> fs(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return zmn(str2, new Callable<klz<nps>>() { // from class: com.bytedance.adsdk.fs.zg.4
            @Override // java.util.concurrent.Callable
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public klz<nps> call() throws Exception {
                return zg.zn(applicationContext, str, str2);
            }
        });
    }

    public static klz<nps> zn(Context context, String str) {
        return zn(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static klz<nps> zn(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return fs(context.getAssets().open(str), str2);
            }
            return zmn(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new klz<>((Throwable) e);
        }
    }

    public static mw<nps> zmn(Context context, int i) {
        return zmn(context, i, zn(context, i));
    }

    public static mw<nps> zmn(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return zmn(str, new Callable<klz<nps>>() { // from class: com.bytedance.adsdk.fs.zg.5
            @Override // java.util.concurrent.Callable
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public klz<nps> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return zg.fs(context2, i, str);
            }
        });
    }

    public static klz<nps> fs(Context context, int i) {
        return fs(context, i, zn(context, i));
    }

    public static klz<nps> fs(Context context, int i, String str) {
        try {
            return fs(context.getResources().openRawResource(i), zn(context, i));
        } catch (Resources.NotFoundException e) {
            return new klz<>((Throwable) e);
        }
    }

    private static String zn(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(zmn(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    private static boolean zmn(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static mw<nps> zmn(final InputStream inputStream, final String str) {
        return zmn(str, new Callable<klz<nps>>() { // from class: com.bytedance.adsdk.fs.zg.6
            @Override // java.util.concurrent.Callable
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public klz<nps> call() throws Exception {
                return zg.fs(inputStream, str);
            }
        });
    }

    public static klz<nps> fs(InputStream inputStream, String str) {
        return zmn(inputStream, str, true);
    }

    private static klz<nps> zmn(InputStream inputStream, String str, boolean z) {
        try {
            return zmn(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                com.bytedance.adsdk.fs.hhw.hhw.zmn(inputStream);
            }
        }
    }

    public static klz<nps> zmn(JsonReader jsonReader, String str) {
        return zmn(jsonReader, str, true);
    }

    private static klz<nps> zmn(JsonReader jsonReader, String str, boolean z) {
        try {
            try {
                nps zmn2 = nqi.zmn(jsonReader);
                com.bytedance.adsdk.fs.zn.btk.zmn().zmn(str, zmn2);
                klz<nps> klzVar = new klz<>(zmn2);
                if (z) {
                    zmn(jsonReader);
                }
                return klzVar;
            } catch (Exception e) {
                klz<nps> klzVar2 = new klz<>(e);
                if (z) {
                    zmn(jsonReader);
                }
                return klzVar2;
            }
        } catch (Throwable th) {
            if (z) {
                zmn(jsonReader);
            }
            throw th;
        }
    }

    public static void zmn(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static klz<nps> zmn(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return fs(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.fs.hhw.hhw.zmn(zipInputStream);
        }
    }

    private static klz<nps> fs(Context context, ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            nps npsVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase(BuildConfig.ASSET_MANIFEST_FILENAME)) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    npsVar = zmn(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).zmn();
                } else {
                    if (!name.endsWith(".png") && !name.endsWith(".webp") && !name.endsWith(BrandSafetyUtils.a) && !name.endsWith(".jpeg")) {
                        if (!name.endsWith(".ttf") && !name.endsWith(".otf")) {
                            zipInputStream.closeEntry();
                        }
                        if (name.contains("../")) {
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            String[] split = name.split("/");
                            String str2 = split[split.length - 1];
                            String str3 = str2.split("\\.")[0];
                            File file = new File(context.getCacheDir(), str2);
                            new FileOutputStream(file);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int read = zipInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable th3) {
                                            th.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            Typeface createFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                file.getAbsolutePath();
                            }
                            hashMap2.put(str3, createFromFile);
                        }
                    }
                    if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] split2 = name.split("/");
                        hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (npsVar == null) {
                return new klz<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                iv zmn2 = zmn(npsVar, (String) entry.getKey());
                if (zmn2 != null) {
                    zmn2.zmn(com.bytedance.adsdk.fs.hhw.hhw.zmn((Bitmap) entry.getValue(), zmn2.zmn(), zmn2.fs()));
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                boolean z = false;
                for (com.bytedance.adsdk.fs.zn.zn znVar : npsVar.cn().values()) {
                    if (znVar.zmn().equals(entry2.getKey())) {
                        znVar.zmn((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                }
            }
            if (hashMap.isEmpty()) {
                Iterator<Map.Entry<String, iv>> it = npsVar.cyb().entrySet().iterator();
                while (it.hasNext()) {
                    iv value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String bvs = value.bvs();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (bvs.startsWith("data:") && bvs.indexOf("base64,") > 0) {
                        try {
                            byte[] decode = Base64.decode(bvs.substring(bvs.indexOf(44) + 1), 0);
                            value.zmn(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, iv> entry3 : npsVar.cyb().entrySet()) {
                if (entry3.getValue().rc() == null) {
                    return new klz<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().bvs()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.fs.zn.btk.zmn().zmn(str, npsVar);
            }
            return new klz<>(npsVar);
        } catch (IOException e) {
            return new klz<>((Throwable) e);
        }
    }

    private static iv zmn(nps npsVar, String str) {
        for (iv ivVar : npsVar.cyb().values()) {
            if (ivVar.bvs().equals(str)) {
                return ivVar;
            }
        }
        return null;
    }

    private static mw<nps> zmn(final String str, Callable<klz<nps>> callable) {
        final nps zmn2 = str == null ? null : com.bytedance.adsdk.fs.zn.btk.zmn().zmn(str);
        if (zmn2 != null) {
            return new mw<>(new Callable<klz<nps>>() { // from class: com.bytedance.adsdk.fs.zg.7
                @Override // java.util.concurrent.Callable
                /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
                public klz<nps> call() throws Exception {
                    return new klz<>(nps.this);
                }
            });
        }
        if (str != null) {
            Map<String, mw<nps>> map = zmn;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        mw<nps> mwVar = new mw<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            mwVar.zmn(new rc<nps>() { // from class: com.bytedance.adsdk.fs.zg.2
                @Override // com.bytedance.adsdk.fs.rc
                public void zmn(nps npsVar) {
                    zg.zmn.remove(str);
                    atomicBoolean.set(true);
                    if (zg.zmn.size() == 0) {
                        zg.fs(true);
                    }
                }
            });
            mwVar.zn(new rc<Throwable>() { // from class: com.bytedance.adsdk.fs.zg.3
                @Override // com.bytedance.adsdk.fs.rc
                public void zmn(Throwable th) {
                    zg.zmn.remove(str);
                    atomicBoolean.set(true);
                    if (zg.zmn.size() == 0) {
                        zg.fs(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, mw<nps>> map2 = zmn;
                map2.put(str, mwVar);
                if (map2.size() == 1) {
                    fs(false);
                }
            }
        }
        return mwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fs(boolean z) {
        ArrayList arrayList = new ArrayList(fs);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
    }
}
