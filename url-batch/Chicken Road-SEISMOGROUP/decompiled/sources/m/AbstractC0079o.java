package m;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import f.AbstractFutureC0034g;
import f.C0035h;
import java.io.File;
import java.io.IOException;

/* renamed from: m.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0079o {

    /* renamed from: a, reason: collision with root package name */
    public static final C0035h f1023a = new C0035h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1024b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static A.b f1025c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0077m.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static A.b b() {
        A.b bVar = new A.b(12);
        f1025c = bVar;
        C0035h c0035h = f1023a;
        c0035h.getClass();
        if (AbstractFutureC0034g.f577f.f(c0035h, null, bVar)) {
            AbstractFutureC0034g.b(c0035h);
        }
        return f1025c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z) {
        C0078n a2;
        C0078n c0078n;
        int i2;
        if (z || f1025c == null) {
            synchronized (f1024b) {
                if (!z) {
                    try {
                        if (f1025c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i4 = 0;
                    boolean z2 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z3 = file2.exists() && length2 > 0;
                    try {
                        long a3 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a2 = C0078n.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a2 = null;
                        }
                        if (a2 != null && a2.f1021c == a3 && (i2 = a2.f1020b) != 2) {
                            i4 = i2;
                            if (z && z3 && i4 != 1) {
                                i4 = 2;
                            }
                            c0078n = new C0078n(1, (a2 == null && a2.f1020b == 2 && i4 == 1 && length < a2.f1022d) ? 3 : i4, a3, length2);
                            if (a2 != null || !a2.equals(c0078n)) {
                                c0078n.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z3) {
                            i4 = 2;
                        }
                        if (z) {
                            i4 = 2;
                        }
                        c0078n = new C0078n(1, (a2 == null && a2.f1020b == 2 && i4 == 1 && length < a2.f1022d) ? 3 : i4, a3, length2);
                        if (a2 != null) {
                        }
                        c0078n.b(file3);
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
