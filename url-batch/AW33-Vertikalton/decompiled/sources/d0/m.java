package d0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final p.h f1896a = new p.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1897b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static H0.e f1898c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? k.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static H0.e b() {
        H0.e eVar = new H0.e(21);
        f1898c = eVar;
        p.h hVar = f1896a;
        hVar.getClass();
        if (p.g.f3390f.d(hVar, null, eVar)) {
            p.g.b(hVar);
        }
        return f1898c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z2) {
        l a2;
        l lVar;
        int i;
        if (z2 || f1898c == null) {
            synchronized (f1897b) {
                if (!z2) {
                    try {
                        if (f1898c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i3 = 0;
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long a3 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a2 = l.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a2 = null;
                        }
                        if (a2 != null && a2.f1895c == a3 && (i = a2.f1894b) != 2) {
                            i3 = i;
                            if (z2 && z4 && i3 != 1) {
                                i3 = 2;
                            }
                            lVar = new l(1, (a2 == null && a2.f1894b == 2 && i3 == 1 && length < a2.d) ? 3 : i3, a3, length2);
                            if (a2 != null || !a2.equals(lVar)) {
                                lVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z4) {
                            i3 = 2;
                        }
                        if (z2) {
                            i3 = 2;
                        }
                        lVar = new l(1, (a2 == null && a2.f1894b == 2 && i3 == 1 && length < a2.d) ? 3 : i3, a3, length2);
                        if (a2 != null) {
                        }
                        lVar.b(file3);
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
