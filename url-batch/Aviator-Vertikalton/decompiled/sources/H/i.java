package H;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final o.f f237a = new o.f(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f238b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f239c;

    /* renamed from: d, reason: collision with root package name */
    public static final o.k f240d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f238b = threadPoolExecutor;
        f239c = new Object();
        f240d = new o.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h a(String str, Context context, e eVar, int i) {
        o.f fVar = f237a;
        Typeface typeface = (Typeface) fVar.a(str);
        if (typeface != null) {
            return new h(typeface);
        }
        try {
            j a2 = d.a(context, eVar);
            int i2 = 1;
            k[] kVarArr = (k[]) a2.f242b;
            int i3 = a2.f241a;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = -2;
                    if (i2 != 0) {
                        return new h(i2);
                    }
                    Typeface p2 = C.h.f165a.p(context, kVarArr, i);
                    if (p2 == null) {
                        return new h(-3);
                    }
                    fVar.b(str, p2);
                    return new h(p2);
                }
                i2 = -3;
                if (i2 != 0) {
                }
            } else {
                if (kVarArr != null && kVarArr.length != 0) {
                    int length = kVarArr.length;
                    i2 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        int i5 = kVarArr[i4].f247e;
                        if (i5 == 0) {
                            i4++;
                        } else if (i5 >= 0) {
                            i2 = i5;
                        }
                    }
                }
                if (i2 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new h(-1);
        }
    }
}
