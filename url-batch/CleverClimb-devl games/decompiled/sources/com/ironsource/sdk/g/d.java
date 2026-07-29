package com.ironsource.sdk.g;

import android.content.Context;
import com.ironsource.sdk.data.e;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IronSourceStorageUtils.java */
/* loaded from: classes2.dex */
public class d {
    public static String a(Context context) {
        c(context);
        return b(context);
    }

    private static String b(Context context) {
        String g = c.a().g();
        String g2 = a.g();
        if (!g.equalsIgnoreCase(g2)) {
            c.a().e(g2);
            File i = com.ironsource.environment.c.i(context);
            if (i != null) {
                a(i.getAbsolutePath() + File.separator + "supersonicads" + File.separator);
            }
            a(com.ironsource.environment.c.j(context) + File.separator + "supersonicads" + File.separator);
            return c(context);
        }
        return a(context, "supersonicads").getPath();
    }

    private static void a(String str) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (file.isDirectory()) {
                a(file.getAbsolutePath());
                file.delete();
            } else {
                file.delete();
            }
        }
    }

    private static File a(Context context, String str) {
        if (f.h()) {
            File i = com.ironsource.environment.c.i(context);
            if (i != null) {
                return new File(i.getPath() + File.separator + str);
            }
            return new File(com.ironsource.environment.c.j(context) + File.separator + str);
        }
        return new File(com.ironsource.environment.c.j(context) + File.separator + str);
    }

    private static String c(Context context) {
        File a2 = a(context, "supersonicads");
        if (!a2.exists()) {
            a2.mkdir();
        }
        return a2.getPath();
    }

    public static String a(String str, String str2) {
        File file = new File(str, str2);
        if (file.exists() || file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }

    public static synchronized boolean a(String str, String str2, String str3) {
        synchronized (d.class) {
            File file = new File(str, str2);
            if (!file.exists()) {
                return false;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.getName().equalsIgnoreCase(str3)) {
                    return file2.delete();
                }
            }
            return false;
        }
    }

    public static synchronized boolean a(String str, com.ironsource.sdk.data.f fVar) {
        synchronized (d.class) {
            File file = new File(str, fVar.b());
            if (file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    if (file2.isFile() && file2.getName().equalsIgnoreCase(f.a(fVar.a()))) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static boolean b(String str, String str2) {
        return new File(str, str2).exists();
    }

    public static synchronized boolean c(String str, String str2) {
        boolean z;
        synchronized (d.class) {
            File file = new File(str, str2);
            if (a(file)) {
                z = file.delete();
            }
        }
        return z;
    }

    private static boolean a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return true;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                z &= a(file2);
            }
            if (!file2.delete()) {
                z = false;
            }
        }
        return z;
    }

    public static String d(String str, String str2) {
        JSONObject f = f(str, str2);
        try {
            f.put("path", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return f.toString();
    }

    private static JSONObject f(String str, String str2) {
        File file = new File(str, str2);
        JSONObject jSONObject = new JSONObject();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                try {
                    Object b2 = b(file2);
                    if (b2 instanceof JSONArray) {
                        jSONObject.put("files", b(file2));
                    } else if (b2 instanceof JSONObject) {
                        jSONObject.put(file2.getName(), b(file2));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    new b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=" + e.getStackTrace()[0].getMethodName());
                }
            }
        }
        return jSONObject;
    }

    private static Object b(File file) {
        String f;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
        } catch (JSONException e) {
            e.printStackTrace();
            new b().execute("https://www.supersonicads.com/mobile/sdk5/log?method=" + e.getStackTrace()[0].getMethodName());
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                jSONObject.put(file2.getName(), b(file2));
            } else {
                jSONArray.put(file2.getName());
                jSONObject.put("files", jSONArray);
            }
        }
        if (file.isDirectory() && (f = c.a().f(file.getName())) != null) {
            jSONObject.put("lastUpdateTime", f);
        }
        String lowerCase = file.getName().toLowerCase();
        e.d dVar = null;
        if (lowerCase.startsWith(e.d.RewardedVideo.toString().toLowerCase())) {
            dVar = e.d.RewardedVideo;
        } else if (lowerCase.startsWith(e.d.OfferWall.toString().toLowerCase())) {
            dVar = e.d.OfferWall;
        } else if (lowerCase.startsWith(e.d.Interstitial.toString().toLowerCase())) {
            dVar = e.d.Interstitial;
        }
        if (dVar != null) {
            jSONObject.put(f.b("applicationUserId"), f.b(c.a().b(dVar)));
            jSONObject.put(f.b("applicationKey"), f.b(c.a().a(dVar)));
        }
        return jSONObject;
    }

    public static boolean e(String str, String str2) throws Exception {
        return new File(str).renameTo(new File(str2));
    }

    public static int a(byte[] bArr, String str) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            byte[] bArr2 = new byte[102400];
            int i = 0;
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read == -1) {
                    return i;
                }
                fileOutputStream.write(bArr2, 0, read);
                i += read;
            }
        } finally {
            fileOutputStream.close();
            byteArrayInputStream.close();
        }
    }
}
