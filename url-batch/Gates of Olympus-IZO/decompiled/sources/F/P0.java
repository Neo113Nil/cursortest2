package F;

import I.C0113p;
import b0.AbstractC0259J;
import b0.InterfaceC0263N;
import f.AbstractC0382a;
import h1.C0438i;
import m.AbstractC0600j;
import x.C1048b;
import x.C1050d;

/* loaded from: classes.dex */
public abstract class P0 {

    /* renamed from: a, reason: collision with root package name */
    public static final I.Y0 f1080a = new I.Y0(K.f1038n);

    public static final InterfaceC0263N a(int i3, C0113p c0113p) {
        O0 o02 = (O0) c0113p.k(f1080a);
        switch (AbstractC0600j.a(i3)) {
            case 0:
                return o02.f1078e;
            case 1:
                return b(o02.f1078e);
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return o02.f1074a;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                return b(o02.f1074a);
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                return x.e.f8716a;
            case 5:
                return o02.f1077d;
            case 6:
                C1050d c1050d = o02.f1077d;
                float f3 = (float) 0.0d;
                return C1050d.b(c1050d, new C1048b(f3), null, new C1048b(f3), 6);
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                return b(o02.f1077d);
            case 8:
                return o02.f1076c;
            case AbstractC0382a.f4777a /* 9 */:
                return AbstractC0259J.f4215a;
            case AbstractC0382a.f4779c /* 10 */:
                return o02.f1075b;
            default:
                throw new L1.f();
        }
    }

    public static final C1050d b(C1050d c1050d) {
        float f3 = (float) 0.0d;
        return C1050d.b(c1050d, null, new C1048b(f3), new C1048b(f3), 3);
    }
}
