package j1;

import a0.C0144j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final r.h f13890a = new r.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f13891b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C0144j f13892c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? i.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static C0144j b() {
        C0144j c0144j = new C0144j(14, false);
        f13892c = c0144j;
        r.h hVar = f13890a;
        hVar.getClass();
        if (r.g.f15108f.h(hVar, null, c0144j)) {
            r.g.c(hVar);
        }
        return f13892c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:80)(1:18)|19|(1:79)(1:23)|24|25|26|(2:64|65)(1:28)|29|(9:36|(1:40)|(1:47)|48|(2:56|57)|52|53|54|55)|(1:63)|(1:40)|(3:42|45|47)|48|(1:50)|56|57|52|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009e, code lost:
    
        r6 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z) {
        j a3;
        j jVar;
        int i4;
        if (z || f13892c == null) {
            synchronized (f13891b) {
                if (!z) {
                    try {
                        if (f13892c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 28 && i5 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i6 = 0;
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
                        if (a3 != null && a3.f13888c == a4 && (i4 = a3.f13887b) != 2) {
                            i6 = i4;
                            if (z && z5 && i6 != 1) {
                                i6 = 2;
                            }
                            if (a3 != null && a3.f13887b == 2 && i6 == 1 && length < a3.f13889d) {
                                i6 = 3;
                            }
                            jVar = new j(1, i6, a4, length2);
                            if (a3 != null || !a3.equals(jVar)) {
                                jVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z5) {
                            i6 = 2;
                        }
                        if (z) {
                            i6 = 2;
                        }
                        if (a3 != null) {
                            i6 = 3;
                        }
                        jVar = new j(1, i6, a4, length2);
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
