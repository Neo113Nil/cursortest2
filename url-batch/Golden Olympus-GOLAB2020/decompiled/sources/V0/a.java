package V0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.common.PackageConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f9468a = Uri.parse("content://com.huawei.hwid");

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f9469b = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", PackageConstants.SERVICES_SIGNATURE_V3};

    private static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        File file = new File(str);
        if (file.exists()) {
            f.f("BksUtil", "The directory  has already exists");
            return 1;
        }
        if (file.mkdirs()) {
            f.b("BksUtil", "create directory  success");
            return 0;
        }
        f.d("BksUtil", "create directory  failed");
        return -1;
    }

    private static String b(Context context) {
        return context.createDeviceProtectedStorageContext().getFilesDir() + File.separator + "aegis";
    }

    private static String c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b4 : bArr) {
            String hexString = Integer.toHexString(b4 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private static void d(InputStream inputStream, Context context) {
        FileOutputStream fileOutputStream;
        if (inputStream == null || context == null) {
            return;
        }
        String b4 = b(context);
        if (!new File(b4).exists()) {
            a(b4);
        }
        File file = new File(b4, "hmsrootcas.bks");
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                f.e("BksUtil", "write output stream ");
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            byte[] bArr = new byte[com.ironsource.mediationsdk.metadata.a.f17688n];
            while (true) {
                int read = inputStream.read(bArr, 0, com.ironsource.mediationsdk.metadata.a.f17688n);
                if (read == -1) {
                    e.c(fileOutputStream);
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            f.d("BksUtil", " IOException");
            e.c(fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            e.c(fileOutputStream2);
            throw th;
        }
    }

    private static byte[] e(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            Log.e("BksUtil", "packageName is null or context is null");
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e4) {
            Log.e("BksUtil", "PackageManager.NameNotFoundException : " + e4.getMessage());
        } catch (Exception e5) {
            Log.e("BksUtil", "get pm exception : " + e5.getMessage());
        }
        return new byte[0];
    }

    private static String f(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return c(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            f.d("BksUtil", "inputstraem exception");
            return "";
        }
    }

    private static void g(Context context) {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            try {
                inputStream = context.getContentResolver().openInputStream(Uri.withAppendedPath(f9468a, "files/hmsrootcas.bks"));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e4) {
            e = e4;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                byteArrayOutputStream.flush();
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            } catch (Exception e5) {
                e = e5;
            }
            try {
                String b4 = h.b("bks_hash", "", context);
                String f4 = f(byteArrayOutputStream.toByteArray());
                if (m(context) && b4.equals(f4)) {
                    f.e("BksUtil", "bks not update");
                    e.b(inputStream);
                    e.c(byteArrayOutputStream);
                    e.b(byteArrayInputStream);
                }
                f.e("BksUtil", "update bks and sp");
                d(byteArrayInputStream, context);
                h.e("bks_hash", f4, context);
                e.b(inputStream);
                e.c(byteArrayOutputStream);
                e.b(byteArrayInputStream);
            } catch (Exception e6) {
                e = e6;
                byteArrayInputStream2 = byteArrayInputStream;
                f.d("BksUtil", "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());
                e.b(inputStream);
                e.c(byteArrayOutputStream);
                e.b(byteArrayInputStream2);
            } catch (Throwable th3) {
                th = th3;
                byteArrayInputStream2 = byteArrayInputStream;
                e.b(inputStream);
                e.c(byteArrayOutputStream);
                e.b(byteArrayInputStream2);
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            byteArrayOutputStream = null;
            f.d("BksUtil", "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());
            e.b(inputStream);
            e.c(byteArrayOutputStream);
            e.b(byteArrayInputStream2);
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            e.b(inputStream);
            e.c(byteArrayOutputStream);
            e.b(byteArrayInputStream2);
            throw th;
        }
    }

    private static boolean h(Context context, String str) {
        return PackageConstants.SERVICES_SIGNATURE_V3.equalsIgnoreCase(k(e(context, str)));
    }

    private static boolean i(String str) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        f.e("BksUtil", "hms version code is : " + str);
        String[] split = str.split("\\.");
        String[] split2 = "4.0.2.300".split("\\.");
        int length = split.length;
        int length2 = split2.length;
        int max = Math.max(length, length2);
        int i4 = 0;
        while (i4 < max) {
            if (i4 < length) {
                try {
                    parseInt = Integer.parseInt(split[i4]);
                } catch (Exception e4) {
                    f.d("BksUtil", " exception : " + e4.getMessage());
                    return i4 >= length2;
                }
            } else {
                parseInt = 0;
            }
            int parseInt2 = i4 < length2 ? Integer.parseInt(split2[i4]) : 0;
            if (parseInt < parseInt2) {
                return false;
            }
            if (parseInt > parseInt2) {
                return true;
            }
            i4++;
        }
        return true;
    }

    private static String j(Context context) {
        return b(context) + File.separator + "hmsrootcas.bks";
    }

    private static String k(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                return c(MessageDigest.getInstance("SHA-256").digest(bArr));
            } catch (NoSuchAlgorithmException e4) {
                Log.e("BksUtil", "NoSuchAlgorithmException" + e4.getMessage());
            }
        }
        return "";
    }

    private static boolean l(Context context, String str) {
        byte[] e4 = e(context, str);
        for (String str2 : f9469b) {
            if (str2.equalsIgnoreCase(k(e4))) {
                return true;
            }
        }
        return false;
    }

    private static boolean m(Context context) {
        return new File(b(context) + File.separator + "hmsrootcas.bks").exists();
    }

    public static synchronized InputStream n(Context context) {
        synchronized (a.class) {
            try {
                f.e("BksUtil", "get bks from tss begin");
                if (context != null) {
                    b.b(context);
                }
                Context a4 = b.a();
                if (a4 == null) {
                    f.d("BksUtil", "context is null");
                    return null;
                }
                if (!i(g.a("com.huawei.hwid")) && !i(g.a(PackageConstants.SERVICES_PACKAGE_ALL_SCENE))) {
                    f.d("BksUtil", "hms version code is too low : " + g.a("com.huawei.hwid"));
                    return null;
                }
                if (!l(a4, "com.huawei.hwid") && !h(a4, PackageConstants.SERVICES_PACKAGE_ALL_SCENE)) {
                    f.d("BksUtil", "hms sign error");
                    return null;
                }
                g(a4);
                return o(a4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static InputStream o(Context context) {
        if (!m(context)) {
            return null;
        }
        f.e("BksUtil", "getFilesBksIS ");
        try {
            return new FileInputStream(j(context));
        } catch (FileNotFoundException unused) {
            f.d("BksUtil", "FileNotFoundExceptio: ");
            return null;
        }
    }
}
