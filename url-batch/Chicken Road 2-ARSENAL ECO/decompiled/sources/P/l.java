package P;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import y1.C0760d;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final r.i f1866a = new r.i();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1867b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C0760d f1868c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? j.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C0760d b() {
        C0760d c0760d = new C0760d();
        f1868c = c0760d;
        r.i iVar = f1866a;
        iVar.getClass();
        if (r.h.f5835k.B(iVar, null, c0760d)) {
            r.h.d(iVar);
        }
        return f1868c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:80)(1:18)|19|(1:79)(1:23)|24|25|26|(2:64|65)(1:28)|29|(9:36|(1:40)|(1:47)|48|(2:56|57)|52|53|54|55)|(1:63)|(1:40)|(3:42|45|47)|48|(1:50)|56|57|52|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009e, code lost:
    
        r6 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z5) {
        k a7;
        k kVar;
        int i7;
        if (z5 || f1868c == null) {
            synchronized (f1867b) {
                if (!z5) {
                    try {
                        if (f1868c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 28 && i8 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i9 = 0;
                    boolean z6 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z7 = file2.exists() && length2 > 0;
                    try {
                        long a8 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a7 = k.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a7 = null;
                        }
                        if (a7 != null && a7.f1864c == a8 && (i7 = a7.f1863b) != 2) {
                            i9 = i7;
                            if (z5 && z7 && i9 != 1) {
                                i9 = 2;
                            }
                            if (a7 != null && a7.f1863b == 2 && i9 == 1 && length < a7.f1865d) {
                                i9 = 3;
                            }
                            kVar = new k(1, i9, a8, length2);
                            if (a7 != null || !a7.equals(kVar)) {
                                kVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z7) {
                            i9 = 2;
                        }
                        if (z5) {
                            i9 = 2;
                        }
                        if (a7 != null) {
                            i9 = 3;
                        }
                        kVar = new k(1, i9, a8, length2);
                        if (a7 != null) {
                        }
                        kVar.b(file3);
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
