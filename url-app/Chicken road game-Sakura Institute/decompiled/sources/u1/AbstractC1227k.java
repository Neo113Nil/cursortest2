package u1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* renamed from: u1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1227k {

    /* renamed from: a, reason: collision with root package name */
    public static final Q0.i f10925a = new Q0.i();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f10926b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static E1.i f10927c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC1225i.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static E1.i b() {
        E1.i iVar = new E1.i(22);
        f10927c = iVar;
        Q0.i iVar2 = f10925a;
        iVar2.getClass();
        if (Q0.h.f3934l.p(iVar2, null, iVar)) {
            Q0.h.e(iVar2);
        }
        return f10927c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009d, code lost:
    
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(boolean z4, Context context) {
        C1226j a4;
        C1226j c1226j;
        int i2;
        if (z4 || f10927c == null) {
            synchronized (f10926b) {
                if (!z4) {
                    try {
                        if (f10927c != null) {
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
                    boolean z5 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z6 = file2.exists() && length2 > 0;
                    try {
                        long a5 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a4 = C1226j.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a4 = null;
                        }
                        if (a4 != null && a4.f10923c == a5 && (i2 = a4.f10922b) != 2) {
                            i5 = i2;
                            if (z4 && z6 && i5 != 1) {
                                i5 = 2;
                            }
                            c1226j = new C1226j(1, (a4 == null && a4.f10922b == 2 && i5 == 1 && length < a4.f10924d) ? 3 : i5, a5, length2);
                            if (a4 != null || !a4.equals(c1226j)) {
                                c1226j.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z6) {
                            i5 = 2;
                        }
                        if (z4) {
                            i5 = 2;
                        }
                        c1226j = new C1226j(1, (a4 == null && a4.f10922b == 2 && i5 == 1 && length < a4.f10924d) ? 3 : i5, a5, length2);
                        if (a4 != null) {
                        }
                        c1226j.b(file3);
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
