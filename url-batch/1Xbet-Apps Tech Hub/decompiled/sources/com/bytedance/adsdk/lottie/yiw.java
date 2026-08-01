package com.bytedance.adsdk.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.lottie.NB.ny;
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
import org.objectweb.asm.Opcodes;

/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public class yiw {
    private static final Map<String, kj<sUS>> pvs = new HashMap();
    private static final Set<Object> icD = new HashSet();
    private static final byte[] vG = {80, 75, 3, 4};

    public static kj<sUS> pvs(Context context, String str) {
        return pvs(context, str, "url_".concat(String.valueOf(str)));
    }

    public static kj<sUS> pvs(final Context context, final String str, final String str2) {
        return pvs(str2, new Callable<qh<sUS>>() { // from class: com.bytedance.adsdk.lottie.yiw.1
            @Override // java.util.concurrent.Callable
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public qh<sUS> call() throws Exception {
                qh<sUS> pvs2 = NB.pvs(context).pvs(context, str, str2);
                if (str2 != null && pvs2.pvs() != null) {
                    com.bytedance.adsdk.lottie.vG.NB.pvs().pvs(str2, pvs2.pvs());
                }
                return pvs2;
            }
        });
    }

    public static kj<sUS> icD(Context context, String str) {
        return icD(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static kj<sUS> icD(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return pvs(str2, new Callable<qh<sUS>>() { // from class: com.bytedance.adsdk.lottie.yiw.4
            @Override // java.util.concurrent.Callable
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public qh<sUS> call() throws Exception {
                return yiw.vG(applicationContext, str, str2);
            }
        });
    }

    public static qh<sUS> vG(Context context, String str) {
        return vG(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static qh<sUS> vG(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return icD(context.getAssets().open(str), str2);
            }
            return pvs(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new qh<>((Throwable) e);
        }
    }

    public static kj<sUS> pvs(Context context, int i) {
        return pvs(context, i, vG(context, i));
    }

    public static kj<sUS> pvs(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return pvs(str, new Callable<qh<sUS>>() { // from class: com.bytedance.adsdk.lottie.yiw.5
            @Override // java.util.concurrent.Callable
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public qh<sUS> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return yiw.icD(context2, i, str);
            }
        });
    }

    public static qh<sUS> icD(Context context, int i) {
        return icD(context, i, vG(context, i));
    }

    public static qh<sUS> icD(Context context, int i, String str) {
        try {
            return icD(context.getResources().openRawResource(i), vG(context, i));
        } catch (Resources.NotFoundException e) {
            return new qh<>((Throwable) e);
        }
    }

    private static String vG(Context context, int i) {
        return "rawRes" + (pvs(context) ? "_night_" : "_day_") + i;
    }

    private static boolean pvs(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static kj<sUS> pvs(final InputStream inputStream, final String str) {
        return pvs(str, new Callable<qh<sUS>>() { // from class: com.bytedance.adsdk.lottie.yiw.6
            @Override // java.util.concurrent.Callable
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public qh<sUS> call() throws Exception {
                return yiw.icD(inputStream, str);
            }
        });
    }

    public static qh<sUS> icD(InputStream inputStream, String str) {
        return pvs(inputStream, str, true);
    }

    private static qh<sUS> pvs(InputStream inputStream, String str, boolean z) {
        try {
            return pvs(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                com.bytedance.adsdk.lottie.sUS.sUS.pvs(inputStream);
            }
        }
    }

    public static qh<sUS> pvs(JsonReader jsonReader, String str) {
        return pvs(jsonReader, str, true);
    }

    private static qh<sUS> pvs(JsonReader jsonReader, String str, boolean z) {
        try {
            try {
                sUS pvs2 = ny.pvs(jsonReader);
                com.bytedance.adsdk.lottie.vG.NB.pvs().pvs(str, pvs2);
                qh<sUS> qhVar = new qh<>(pvs2);
                if (z) {
                    pvs(jsonReader);
                }
                return qhVar;
            } catch (Exception e) {
                qh<sUS> qhVar2 = new qh<>(e);
                if (z) {
                    pvs(jsonReader);
                }
                return qhVar2;
            }
        } catch (Throwable th) {
            if (z) {
                pvs(jsonReader);
            }
            throw th;
        }
    }

    public static void pvs(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static qh<sUS> pvs(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return icD(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.lottie.sUS.sUS.pvs(zipInputStream);
        }
    }

    private static qh<sUS> icD(Context context, ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            sUS sus = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    sus = pvs(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).pvs();
                } else {
                    if (!name.endsWith(".png") && !name.endsWith(".webp") && !name.endsWith(".jpg") && !name.endsWith(".jpeg")) {
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
                                } finally {
                                }
                            } catch (Throwable unused) {
                                new StringBuilder("Unable to save font ").append(str3).append(" to the temporary file: ").append(str2);
                            }
                            Typeface createFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                new StringBuilder("Failed to delete temp font file ").append(file.getAbsolutePath());
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
            if (sus == null) {
                return new qh<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                Mxy pvs2 = pvs(sus, (String) entry.getKey());
                if (pvs2 != null) {
                    pvs2.pvs(com.bytedance.adsdk.lottie.sUS.sUS.pvs((Bitmap) entry.getValue(), pvs2.pvs(), pvs2.icD()));
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                boolean z = false;
                for (com.bytedance.adsdk.lottie.vG.vG vGVar : sus.qh().values()) {
                    if (vGVar.pvs().equals(entry2.getKey())) {
                        vGVar.pvs((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                }
            }
            if (hashMap.isEmpty()) {
                Iterator<Map.Entry<String, Mxy>> it = sus.kj().entrySet().iterator();
                while (it.hasNext()) {
                    Mxy value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String Jd = value.Jd();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = Opcodes.IF_ICMPNE;
                    if (Jd.startsWith("data:") && Jd.indexOf("base64,") > 0) {
                        try {
                            byte[] decode = Base64.decode(Jd.substring(Jd.indexOf(44) + 1), 0);
                            value.pvs(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, Mxy> entry3 : sus.kj().entrySet()) {
                if (entry3.getValue().sUS() == null) {
                    return new qh<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().Jd()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.lottie.vG.NB.pvs().pvs(str, sus);
            }
            return new qh<>(sus);
        } catch (IOException e) {
            return new qh<>((Throwable) e);
        }
    }

    private static Mxy pvs(sUS sus, String str) {
        for (Mxy mxy : sus.kj().values()) {
            if (mxy.Jd().equals(str)) {
                return mxy;
            }
        }
        return null;
    }

    private static kj<sUS> pvs(final String str, Callable<qh<sUS>> callable) {
        final sUS pvs2 = str == null ? null : com.bytedance.adsdk.lottie.vG.NB.pvs().pvs(str);
        if (pvs2 != null) {
            return new kj<>(new Callable<qh<sUS>>() { // from class: com.bytedance.adsdk.lottie.yiw.7
                @Override // java.util.concurrent.Callable
                /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
                public qh<sUS> call() throws Exception {
                    return new qh<>(sUS.this);
                }
            });
        }
        if (str != null) {
            Map<String, kj<sUS>> map = pvs;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        kj<sUS> kjVar = new kj<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            kjVar.pvs(new Wyp<sUS>() { // from class: com.bytedance.adsdk.lottie.yiw.2
                @Override // com.bytedance.adsdk.lottie.Wyp
                public void pvs(sUS sus) {
                    yiw.pvs.remove(str);
                    atomicBoolean.set(true);
                    if (yiw.pvs.size() == 0) {
                        yiw.icD(true);
                    }
                }
            });
            kjVar.vG(new Wyp<Throwable>() { // from class: com.bytedance.adsdk.lottie.yiw.3
                @Override // com.bytedance.adsdk.lottie.Wyp
                public void pvs(Throwable th) {
                    yiw.pvs.remove(str);
                    atomicBoolean.set(true);
                    if (yiw.pvs.size() == 0) {
                        yiw.icD(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, kj<sUS>> map2 = pvs;
                map2.put(str, kjVar);
                if (map2.size() == 1) {
                    icD(false);
                }
            }
        }
        return kjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void icD(boolean z) {
        ArrayList arrayList = new ArrayList(icD);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
    }
}
