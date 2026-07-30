package v3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final q2.i f9152a = new q2.i();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f9153b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static m4.f f9154c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? h.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static m4.f b() {
        m4.f fVar = new m4.f();
        f9154c = fVar;
        q2.i iVar = f9152a;
        iVar.getClass();
        if (q2.h.f7506k.r(iVar, null, fVar)) {
            q2.h.g(iVar);
        }
        return f9154c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:80)(1:18)|19|(1:79)(1:23)|24|25|26|(2:64|65)(1:28)|29|(9:36|(1:40)|(1:47)|48|(2:56|57)|52|53|54|55)|(1:63)|(1:40)|(3:42|45|47)|48|(1:50)|56|57|52|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009e, code lost:
    
        r6 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z8) {
        i a3;
        i iVar;
        int i7;
        if (z8 || f9154c == null) {
            synchronized (f9153b) {
                if (!z8) {
                    try {
                        if (f9154c != null) {
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
                    boolean z9 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z10 = file2.exists() && length2 > 0;
                    try {
                        long a9 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a3 = i.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a3 = null;
                        }
                        if (a3 != null && a3.f9150c == a9 && (i7 = a3.f9149b) != 2) {
                            i9 = i7;
                            if (z8 && z10 && i9 != 1) {
                                i9 = 2;
                            }
                            if (a3 != null && a3.f9149b == 2 && i9 == 1 && length < a3.f9151d) {
                                i9 = 3;
                            }
                            iVar = new i(1, i9, a9, length2);
                            if (a3 != null || !a3.equals(iVar)) {
                                iVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z10) {
                            i9 = 2;
                        }
                        if (z8) {
                            i9 = 2;
                        }
                        if (a3 != null) {
                            i9 = 3;
                        }
                        iVar = new i(1, i9, a9, length2);
                        if (a3 != null) {
                        }
                        iVar.b(file3);
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
