package v;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import g0.C0131a;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k0.C;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final m.d f3069a = new m.d(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f3070b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3071c;

    /* renamed from: d, reason: collision with root package name */
    public static final m.i f3072d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new i());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f3070b = threadPoolExecutor;
        f3071c = new Object();
        f3072d = new m.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e a(String str, Context context, C0131a c0131a, int i2) {
        m.d dVar = f3069a;
        Typeface typeface = (Typeface) dVar.a(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            C a2 = b.a(context, c0131a);
            g[] gVarArr = (g[]) a2.f2648b;
            int i3 = a2.f2647a;
            int i4 = 1;
            if (i3 != 0) {
                if (i3 == 1) {
                    i4 = -2;
                    if (i4 != 0) {
                        return new e(i4);
                    }
                    Typeface l2 = r.d.f2965a.l(context, gVarArr, i2);
                    if (l2 == null) {
                        return new e(-3);
                    }
                    dVar.b(str, l2);
                    return new e(l2);
                }
                i4 = -3;
                if (i4 != 0) {
                }
            } else {
                if (gVarArr != null && gVarArr.length != 0) {
                    int length = gVarArr.length;
                    i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        int i6 = gVarArr[i5].f3077e;
                        if (i6 == 0) {
                            i5++;
                        } else if (i6 >= 0) {
                            i4 = i6;
                        }
                    }
                }
                if (i4 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }
}
