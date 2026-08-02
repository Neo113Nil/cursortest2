package S;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final r.h f1321a = new r.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1322b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static K0.j f1323c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? j.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static K0.j b() {
        K0.j jVar = new K0.j(23);
        f1323c = jVar;
        r.h hVar = f1321a;
        hVar.getClass();
        if (r.g.f.g(hVar, null, jVar)) {
            r.g.c(hVar);
        }
        return f1323c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:80)(1:18)|19|(1:79)(1:23)|24|25|26|(2:64|65)(1:28)|29|(9:36|(1:40)|(1:47)|48|(2:56|57)|52|53|54|55)|(1:63)|(1:40)|(3:42|45|47)|48|(1:50)|56|57|52|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009e, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z) {
        k a3;
        k kVar;
        int i3;
        if (z || f1323c == null) {
            synchronized (f1322b) {
                if (!z) {
                    try {
                        if (f1323c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 28 && i4 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i5 = 0;
                    boolean z2 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z3 = file2.exists() && length2 > 0;
                    try {
                        long a4 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a3 = k.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a3 = null;
                        }
                        if (a3 != null && a3.f1319c == a4 && (i3 = a3.f1318b) != 2) {
                            i5 = i3;
                            if (z && z3 && i5 != 1) {
                                i5 = 2;
                            }
                            if (a3 != null && a3.f1318b == 2 && i5 == 1 && length < a3.f1320d) {
                                i5 = 3;
                            }
                            kVar = new k(1, i5, a4, length2);
                            if (a3 != null || !a3.equals(kVar)) {
                                kVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z3) {
                            i5 = 2;
                        }
                        if (z) {
                            i5 = 2;
                        }
                        if (a3 != null) {
                            i5 = 3;
                        }
                        kVar = new k(1, i5, a4, length2);
                        if (a3 != null) {
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
