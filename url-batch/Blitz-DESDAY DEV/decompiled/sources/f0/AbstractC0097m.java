package f0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* renamed from: f0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0097m {

    /* renamed from: a, reason: collision with root package name */
    public static final r.h f2178a = new r.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2179b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static L0.e f2180c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0095k.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static L0.e b() {
        L0.e eVar = new L0.e(23);
        f2180c = eVar;
        r.h hVar = f2178a;
        hVar.getClass();
        if (r.g.f3415f.c(hVar, null, eVar)) {
            r.g.b(hVar);
        }
        return f2180c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z2) {
        C0096l a2;
        C0096l c0096l;
        int i;
        if (z2 || f2180c == null) {
            synchronized (f2179b) {
                if (!z2) {
                    try {
                        if (f2180c != null) {
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
                                a2 = C0096l.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a2 = null;
                        }
                        if (a2 != null && a2.f2177c == a3 && (i = a2.f2176b) != 2) {
                            i3 = i;
                            if (z2 && z4 && i3 != 1) {
                                i3 = 2;
                            }
                            c0096l = new C0096l(1, (a2 == null && a2.f2176b == 2 && i3 == 1 && length < a2.d) ? 3 : i3, a3, length2);
                            if (a2 != null || !a2.equals(c0096l)) {
                                c0096l.b(file3);
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
                        c0096l = new C0096l(1, (a2 == null && a2.f2176b == 2 && i3 == 1 && length < a2.d) ? 3 : i3, a3, length2);
                        if (a2 != null) {
                        }
                        c0096l.b(file3);
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
