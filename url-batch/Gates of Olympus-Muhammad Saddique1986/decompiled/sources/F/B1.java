package F;

import I.C0167p;
import m.AbstractC0625j;
import r.AbstractC0856c;

/* loaded from: classes.dex */
public abstract class B1 {

    /* renamed from: a, reason: collision with root package name */
    public static final I.X0 f1124a = new I.X0(N.f1284q);

    public static final C0.K a(int i3, C0167p c0167p) {
        A1 a12 = (A1) c0167p.k(f1124a);
        switch (AbstractC0625j.b(i3)) {
            case 0:
                return a12.f1109j;
            case 1:
                return a12.f1110k;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return a12.f1111l;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                return a12.f1100a;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                return a12.f1101b;
            case 5:
                return a12.f1102c;
            case 6:
                return a12.f1103d;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return a12.f1104e;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                return a12.f1105f;
            case AbstractC0856c.f8037c /* 9 */:
                return a12.f1112m;
            case AbstractC0856c.f8039e /* 10 */:
                return a12.f1113n;
            case 11:
                return a12.f1114o;
            case 12:
                return a12.f1106g;
            case 13:
                return a12.f1107h;
            case 14:
                return a12.f1108i;
            default:
                throw new C1.c();
        }
    }
}
