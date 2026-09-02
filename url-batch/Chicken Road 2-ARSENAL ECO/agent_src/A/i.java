package A;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q.C0586f;
import q.C0591k;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final C0586f f21a = new C0586f(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f22b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f23c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0591k f24d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f22b = threadPoolExecutor;
        f23c = new Object();
        f24d = new C0591k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static h a(String str, Context context, e eVar, int i7) {
        C0586f c0586f = f21a;
        Typeface typeface = (Typeface) c0586f.a(str);
        if (typeface != null) {
            return new h(typeface);
        }
        try {
            j a7 = d.a(context, eVar);
            k[] kVarArr = (k[]) a7.f27c;
            int i8 = a7.f26b;
            int i9 = 1;
            if (i8 != 0) {
                if (i8 == 1) {
                    i9 = -2;
                    if (i9 != 0) {
                        return new h(i9);
                    }
                    Typeface h7 = w.d.f6131a.h(context, kVarArr, i7);
                    if (h7 == null) {
                        return new h(-3);
                    }
                    c0586f.b(str, h7);
                    return new h(h7);
                }
                i9 = -3;
                if (i9 != 0) {
                }
            } else {
                if (kVarArr != null && kVarArr.length != 0) {
                    int length = kVarArr.length;
                    i9 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        int i11 = kVarArr[i10].f32e;
                        if (i11 == 0) {
                            i10++;
                        } else if (i11 >= 0) {
                            i9 = i11;
                        }
                    }
                }
                if (i9 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new h(-1);
        }
    }
}
