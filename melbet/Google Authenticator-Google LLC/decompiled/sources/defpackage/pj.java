package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pj {
    static void a(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(z);
    }

    static void b(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }

    public static boolean c(int i) {
        return (i & 32768) != 0;
    }

    public static boolean d(int i) {
        return (i & 32767) != 0;
    }

    public static boolean e(int i) {
        int i2 = i & (-65537);
        if (i2 != 15 && i2 != 255) {
            return i2 != 32768 ? i2 != 32783 ? i2 == 33023 || i2 == 0 : Build.VERSION.SDK_INT > 29 : Build.VERSION.SDK_INT >= 30;
        }
        return true;
    }

    public static boolean f(int i) {
        return (i & 255) == 255;
    }

    public static /* synthetic */ int g(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static Object h(Bundle bundle, String str, Class cls) {
        Object parcelable;
        if (Build.VERSION.SDK_INT >= 34) {
            parcelable = bundle.getParcelable(str, cls);
            return parcelable;
        }
        Parcelable parcelable2 = bundle.getParcelable(str);
        if (cls.isInstance(parcelable2)) {
            return parcelable2;
        }
        return null;
    }

    public static float i(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int j(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable k(Drawable drawable) {
        return drawable instanceof vm ? ((vm) drawable).a() : drawable;
    }

    public static File l(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean m(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    a.r(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            a.r(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            a.r(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static boolean n(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean m = m(file, inputStream);
                a.r(inputStream);
                return m;
            } catch (Throwable th) {
                th = th;
                a.r(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }
}
