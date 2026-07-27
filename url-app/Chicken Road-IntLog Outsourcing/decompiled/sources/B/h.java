package B;

import G0.F;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r.C1396f;
import r.C1401k;
import x.AbstractC1529d;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final C1396f f120a = new C1396f(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f121b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f122c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1401k f123d;

    static {
        k kVar = new k();
        kVar.f130a = "fonts-androidx";
        kVar.f131b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), kVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f121b = threadPoolExecutor;
        f122c = new Object();
        f123d = new C1401k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g a(String str, Context context, d dVar, int i2) {
        C1396f c1396f = f120a;
        Typeface typeface = (Typeface) c1396f.a(str);
        if (typeface != null) {
            return new g(typeface);
        }
        try {
            F a6 = c.a(context, dVar);
            int i3 = 1;
            i[] iVarArr = (i[]) a6.f754c;
            int i6 = a6.f753b;
            if (i6 != 0) {
                if (i6 == 1) {
                    i3 = -2;
                    if (i3 != 0) {
                        return new g(i3);
                    }
                    Typeface g6 = AbstractC1529d.f12236a.g(context, iVarArr, i2);
                    if (g6 == null) {
                        return new g(-3);
                    }
                    c1396f.b(str, g6);
                    return new g(g6);
                }
                i3 = -3;
                if (i3 != 0) {
                }
            } else {
                if (iVarArr != null && iVarArr.length != 0) {
                    int length = iVarArr.length;
                    i3 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            break;
                        }
                        int i8 = iVarArr[i7].f128e;
                        if (i8 == 0) {
                            i7++;
                        } else if (i8 >= 0) {
                            i3 = i8;
                        }
                    }
                }
                if (i3 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(-1);
        }
    }
}
