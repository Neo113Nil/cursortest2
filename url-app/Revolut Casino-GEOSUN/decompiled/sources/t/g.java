package t;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import c0.E;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final k.d f2979a = new k.d(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f2980b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2981c;

    /* renamed from: d, reason: collision with root package name */
    public static final k.i f2982d;

    static {
        j jVar = new j();
        jVar.f2989a = "fonts-androidx";
        jVar.f2990b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), jVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2980b = threadPoolExecutor;
        f2981c = new Object();
        f2982d = new k.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f a(String str, Context context, c cVar, int i2) {
        k.d dVar = f2979a;
        Typeface typeface = (Typeface) dVar.a(str);
        if (typeface != null) {
            return new f(typeface);
        }
        try {
            E a2 = b.a(context, cVar);
            int i3 = 1;
            h[] hVarArr = (h[]) a2.f1668b;
            int i4 = a2.f1667a;
            if (i4 != 0) {
                if (i4 == 1) {
                    i3 = -2;
                    if (i3 != 0) {
                        return new f(i3);
                    }
                    Typeface h2 = p.d.f2812a.h(context, hVarArr, i2);
                    if (h2 == null) {
                        return new f(-3);
                    }
                    dVar.b(str, h2);
                    return new f(h2);
                }
                i3 = -3;
                if (i3 != 0) {
                }
            } else {
                if (hVarArr != null && hVarArr.length != 0) {
                    int length = hVarArr.length;
                    i3 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        int i6 = hVarArr[i5].f2987e;
                        if (i6 == 0) {
                            i5++;
                        } else if (i6 >= 0) {
                            i3 = i6;
                        }
                    }
                }
                if (i3 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        }
    }
}
