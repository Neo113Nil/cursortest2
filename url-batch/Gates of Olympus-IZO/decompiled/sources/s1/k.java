package s1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import k.C0523b;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Q0.h f7544a = new Q0.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f7545b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C0523b f7546c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? i.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C0523b b() {
        C0523b c0523b = new C0523b(6);
        f7546c = c0523b;
        Q0.h hVar = f7544a;
        hVar.getClass();
        if (Q0.g.f3108f.n(hVar, null, c0523b)) {
            Q0.g.b(hVar);
        }
        return f7546c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z3) {
        j a3;
        j jVar;
        int i3;
        if (z3 || f7546c == null) {
            synchronized (f7545b) {
                if (!z3) {
                    try {
                        if (f7546c != null) {
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
                                a3 = j.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a3 = null;
                        }
                        if (a3 != null && a3.f7542c == a4 && (i3 = a3.f7541b) != 2) {
                            i5 = i3;
                            if (z3 && z5 && i5 != 1) {
                                i5 = 2;
                            }
                            jVar = new j(1, (a3 == null && a3.f7541b == 2 && i5 == 1 && length < a3.f7543d) ? 3 : i5, a4, length2);
                            if (a3 != null || !a3.equals(jVar)) {
                                jVar.b(file3);
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
                        jVar = new j(1, (a3 == null && a3.f7541b == 2 && i5 == 1 && length < a3.f7543d) ? 3 : i5, a4, length2);
                        if (a3 != null) {
                        }
                        jVar.b(file3);
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
