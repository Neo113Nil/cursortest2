package v1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import m1.w;

/* renamed from: v1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1168j {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.h f9776a = new S0.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f9777b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static w f9778c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC1166h.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static w b() {
        w wVar = new w(7);
        f9778c = wVar;
        S0.h hVar = f9776a;
        hVar.getClass();
        if (S0.g.f4301f.s(hVar, null, wVar)) {
            S0.g.b(hVar);
        }
        return f9778c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z3) {
        C1167i a3;
        C1167i c1167i;
        int i3;
        if (z3 || f9778c == null) {
            synchronized (f9777b) {
                if (!z3) {
                    try {
                        if (f9778c != null) {
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
                    boolean z4 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z5 = file2.exists() && length2 > 0;
                    try {
                        long a4 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a3 = C1167i.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a3 = null;
                        }
                        if (a3 != null && a3.f9774c == a4 && (i3 = a3.f9773b) != 2) {
                            i5 = i3;
                            if (z3 && z5 && i5 != 1) {
                                i5 = 2;
                            }
                            c1167i = new C1167i(1, (a3 == null && a3.f9773b == 2 && i5 == 1 && length < a3.f9775d) ? 3 : i5, a4, length2);
                            if (a3 != null || !a3.equals(c1167i)) {
                                c1167i.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z5) {
                            i5 = 2;
                        }
                        if (z3) {
                            i5 = 2;
                        }
                        c1167i = new C1167i(1, (a3 == null && a3.f9773b == 2 && i5 == 1 && length < a3.f9775d) ? 3 : i5, a4, length2);
                        if (a3 != null) {
                        }
                        c1167i.b(file3);
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
