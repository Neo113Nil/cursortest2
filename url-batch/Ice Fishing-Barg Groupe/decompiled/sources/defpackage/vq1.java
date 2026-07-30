package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class vq1 {
    public static final hv1 PxuCJdSBwIXG = new hv1();
    public static final Object lS5Rgt96tfkO = new Object();
    public static fb0 TSizfFm2Yiuu = null;

    public static long PxuCJdSBwIXG(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? JLGWdXyAxbxj.PxuCJdSBwIXG(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void TSizfFm2Yiuu(Context context, boolean z) {
        boolean z2;
        uq1 PxuCJdSBwIXG2;
        uq1 uq1Var;
        int i;
        if (z || TSizfFm2Yiuu == null) {
            synchronized (lS5Rgt96tfkO) {
                if (!z) {
                    if (TSizfFm2Yiuu != null) {
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
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long PxuCJdSBwIXG3 = PxuCJdSBwIXG(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                PxuCJdSBwIXG2 = uq1.PxuCJdSBwIXG(file3);
                            } catch (IOException unused2) {
                                lS5Rgt96tfkO();
                                return;
                            }
                        } else {
                            PxuCJdSBwIXG2 = null;
                        }
                        if (PxuCJdSBwIXG2 != null && PxuCJdSBwIXG2.TSizfFm2Yiuu == PxuCJdSBwIXG3 && (i = PxuCJdSBwIXG2.lS5Rgt96tfkO) != 2) {
                            i2 = i;
                            if (z && z4 && i2 != 1) {
                                i2 = 2;
                            }
                            if (PxuCJdSBwIXG2 != null && PxuCJdSBwIXG2.lS5Rgt96tfkO == 2 && i2 == 1 && length < PxuCJdSBwIXG2.Y1f8riQaR6yg) {
                                i2 = 3;
                            }
                            uq1Var = new uq1(1, i2, PxuCJdSBwIXG3, length2);
                            if (PxuCJdSBwIXG2 != null || !PxuCJdSBwIXG2.equals(uq1Var)) {
                                uq1Var.lS5Rgt96tfkO(file3);
                            }
                            lS5Rgt96tfkO();
                            return;
                        }
                        if (z3) {
                            i2 = 1;
                        } else if (z4) {
                            i2 = 2;
                        }
                        if (z) {
                            i2 = 2;
                        }
                        if (PxuCJdSBwIXG2 != null) {
                            i2 = 3;
                        }
                        uq1Var = new uq1(1, i2, PxuCJdSBwIXG3, length2);
                        if (PxuCJdSBwIXG2 != null) {
                        }
                        uq1Var.lS5Rgt96tfkO(file3);
                        lS5Rgt96tfkO();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        lS5Rgt96tfkO();
                        return;
                    }
                }
                lS5Rgt96tfkO();
            }
        }
    }

    public static fb0 lS5Rgt96tfkO() {
        fb0 fb0Var = new fb0(12);
        TSizfFm2Yiuu = fb0Var;
        hv1 hv1Var = PxuCJdSBwIXG;
        hv1Var.getClass();
        if (gGoUzNp9JO5I.cpQdD2nAriOS.wdg6QnbFHrFF(hv1Var, null, fb0Var)) {
            gGoUzNp9JO5I.lS5Rgt96tfkO(hv1Var);
        }
        return TSizfFm2Yiuu;
    }
}
