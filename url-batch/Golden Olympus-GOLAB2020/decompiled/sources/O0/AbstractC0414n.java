package O0;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: O0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0414n {
    private B a(int i4) {
        String str;
        if (i4 != 0) {
            str = j();
            if (!TextUtils.isEmpty(str)) {
                return new B(EnumC0411k.UDID, str);
            }
        } else {
            str = "";
        }
        return new B(EnumC0411k.EMPTY, str);
    }

    private B e(int i4) {
        String str;
        if ((i4 & 4) != 0) {
            str = j();
            if (!TextUtils.isEmpty(str)) {
                return new B(EnumC0411k.UDID, str);
            }
        } else {
            str = "";
        }
        return new B(EnumC0411k.EMPTY, str);
    }

    private boolean i() {
        C0420u d4 = d0.e().d();
        if (TextUtils.isEmpty(d4.x())) {
            d4.q(S.c());
        }
        return !TextUtils.isEmpty(d4.x());
    }

    private String j() {
        C0420u d4 = d0.e().d();
        if (TextUtils.isEmpty(d4.r())) {
            d4.k(m0.k());
        }
        return d4.r();
    }

    public B b(Context context) {
        String g4 = g();
        if (!TextUtils.isEmpty(g4)) {
            return new B(EnumC0411k.UDID, g4);
        }
        String c4 = c();
        if (!TextUtils.isEmpty(c4)) {
            return new B(EnumC0411k.IMEI, c4);
        }
        boolean i4 = i();
        String f4 = f();
        return !TextUtils.isEmpty(f4) ? i4 ? new B(EnumC0411k.SN, f4) : new B(EnumC0411k.UDID, d(f4)) : i4 ? a(h()) : e(h());
    }

    public abstract String c();

    public abstract String d(String str);

    public abstract String f();

    public abstract String g();

    public abstract int h();
}
