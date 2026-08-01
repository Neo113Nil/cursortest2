package J;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final q.f f370a = new q.f(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f371b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f372c;
    public static final q.k d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new l());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f371b = threadPoolExecutor;
        f372c = new Object();
        d = new q.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g a(String str, Context context, d dVar, int i) {
        q.f fVar = f370a;
        Typeface typeface = (Typeface) fVar.a(str);
        if (typeface != null) {
            return new g(typeface);
        }
        try {
            i a2 = c.a(context, dVar);
            int i2 = 1;
            j[] jVarArr = (j[]) a2.f374b;
            int i3 = a2.f373a;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = -2;
                    if (i2 != 0) {
                        return new g(i2);
                    }
                    Typeface l2 = E.h.f171a.l(context, jVarArr, i);
                    if (l2 == null) {
                        return new g(-3);
                    }
                    fVar.b(str, l2);
                    return new g(l2);
                }
                i2 = -3;
                if (i2 != 0) {
                }
            } else {
                if (jVarArr != null && jVarArr.length != 0) {
                    int length = jVarArr.length;
                    i2 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        int i5 = jVarArr[i4].f378e;
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
            return new g(-1);
        }
    }
}
