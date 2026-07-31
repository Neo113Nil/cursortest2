package O0;

import android.util.Pair;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class F extends g0 {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1110a;

        static {
            int[] iArr = new int[EnumC0411k.values().length];
            f1110a = iArr;
            try {
                iArr[EnumC0411k.SN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1110a[EnumC0411k.IMEI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1110a[EnumC0411k.UDID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    protected static C0417q a(String str, String str2, String str3, String str4) {
        C0417q a4 = g0.a(str, str2, str3, str4);
        String c4 = C.a().c(AbstractC0403c.d(str2, str3));
        long currentTimeMillis = System.currentTimeMillis();
        String b4 = Q0.b.b(Y.k() + c4 + currentTimeMillis);
        a4.f(String.valueOf(currentTimeMillis));
        a4.g(b4);
        return a4;
    }

    protected static K b(String str, String str2) {
        K b4 = g0.b(str, str2);
        B f4 = C.a().f(str, str2);
        b4.g(C.a().c(AbstractC0403c.d(str, str2)));
        b4.f(AbstractC0403c.p(str, str2));
        b4.c(C.a().i(str, str2));
        int i4 = a.f1110a[f4.a().ordinal()];
        if (i4 == 1) {
            b4.d(f4.b());
            return b4;
        }
        if (i4 == 2) {
            b4.b(f4.b());
            return b4;
        }
        if (i4 != 3) {
            return b4;
        }
        b4.e(f4.b());
        return b4;
    }

    protected static o0 c(String str, String str2, String str3) {
        o0 c4 = g0.c(str, str2, str3);
        Pair h4 = C.a().h(str2, str);
        c4.f((String) h4.first);
        c4.g((String) h4.second);
        c4.h(S.g());
        c4.d(C.a().g(str2, str));
        return c4;
    }

    public static C0423x f(List list, String str, String str2, String str3, String str4) {
        C0423x d4 = g0.d(str, str2);
        if (d4 == null) {
            return null;
        }
        d4.b(a(M.f().b(), str, str2, str3));
        d4.c(b(str, str2));
        d4.d(c(str2, str, str4));
        d4.e(AbstractC0403c.h(str, str2));
        d4.f(list);
        return d4;
    }

    public static Map g(String str, String str2, String str3) {
        Map e4 = g0.e(str, str3);
        Map j4 = AbstractC0403c.j(str, str2);
        if (j4 == null) {
            return e4;
        }
        e4.putAll(j4);
        return e4;
    }
}
