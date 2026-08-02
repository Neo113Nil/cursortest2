package x;

import D0.O;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m0.D;
import n.C0271d;
import n.C0276i;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0328g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0271d f3579a = new C0271d(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f3580b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3581c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0276i f3582d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0331j());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f3580b = threadPoolExecutor;
        f3581c = new Object();
        f3582d = new C0276i();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0327f a(String str, Context context, O o2, int i2) {
        C0271d c0271d = f3579a;
        Typeface typeface = (Typeface) c0271d.a(str);
        if (typeface != null) {
            return new C0327f(typeface);
        }
        try {
            D a2 = AbstractC0324c.a(context, o2);
            int i3 = 1;
            C0329h[] c0329hArr = (C0329h[]) a2.f3127b;
            int i4 = a2.f3126a;
            if (i4 != 0) {
                if (i4 == 1) {
                    i3 = -2;
                    if (i3 != 0) {
                        return new C0327f(i3);
                    }
                    Typeface d2 = t.e.f3443a.d(context, c0329hArr, i2);
                    if (d2 == null) {
                        return new C0327f(-3);
                    }
                    c0271d.b(str, d2);
                    return new C0327f(d2);
                }
                i3 = -3;
                if (i3 != 0) {
                }
            } else {
                if (c0329hArr != null && c0329hArr.length != 0) {
                    int length = c0329hArr.length;
                    i3 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        int i6 = c0329hArr[i5].f3587e;
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
            return new C0327f(-1);
        }
    }
}
