package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class pz0 {
    public static final a31 a = new a31();
    public static final Object b = new Object();
    public static a60 c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? n1.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static a60 b() {
        a60 a60Var = new a60(27);
        c = a60Var;
        a31 a31Var = a;
        a31Var.getClass();
        if (s0.j.t(a31Var, null, a60Var)) {
            s0.c(a31Var);
        }
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:34|35|36|(2:76|77)(1:38)|39|(9:46|(1:50)|(1:57)|58|(2:66|67)|62|63|64|65)|(1:73)(1:(1:75))|(1:50)|(3:52|55|57)|58|(1:60)|66|67|62|63|64|65) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(boolean z, Context context) {
        boolean z2;
        oz0 a2;
        oz0 oz0Var;
        int i;
        if (z || c == null) {
            synchronized (b) {
                if (!z) {
                    if (c != null) {
                        return;
                    }
                }
                int i2 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z2 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z2 = false;
                }
                if (Build.VERSION.SDK_INT == 30) {
                    b();
                    return;
                }
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z3 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z4 = file2.exists() && length2 > 0;
                try {
                    long a3 = a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            a2 = oz0.a(file3);
                        } catch (IOException unused2) {
                            b();
                            return;
                        }
                    } else {
                        a2 = null;
                    }
                    if (a2 != null && a2.c == a3 && (i = a2.b) != 2) {
                        i2 = i;
                        if (z && z4 && i2 != 1) {
                            i2 = 2;
                        }
                        if (a2 != null && a2.b == 2 && i2 == 1 && length < a2.d) {
                            i2 = 3;
                        }
                        oz0Var = new oz0(1, i2, a3, length2);
                        if (a2 != null || !a2.equals(oz0Var)) {
                            oz0Var.b(file3);
                        }
                        b();
                    }
                    if (z3) {
                        i2 = 1;
                    } else if (z4) {
                        i2 = 2;
                    }
                    if (z) {
                        i2 = 2;
                    }
                    if (a2 != null) {
                        i2 = 3;
                    }
                    oz0Var = new oz0(1, i2, a3, length2);
                    if (a2 != null) {
                    }
                    oz0Var.b(file3);
                    b();
                } catch (PackageManager.NameNotFoundException unused3) {
                    b();
                }
            }
        }
    }
}
