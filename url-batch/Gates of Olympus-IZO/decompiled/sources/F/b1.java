package F;

import I.C0113p;
import f.AbstractC0382a;
import h1.C0438i;
import m.AbstractC0600j;

/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final I.Y0 f1200a = new I.Y0(K.f1040q);

    public static final B0.C a(int i3, C0113p c0113p) {
        a1 a1Var = (a1) c0113p.k(f1200a);
        switch (AbstractC0600j.a(i3)) {
            case 0:
                return a1Var.f1193j;
            case 1:
                return a1Var.f1194k;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return a1Var.f1195l;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                return a1Var.f1184a;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                return a1Var.f1185b;
            case 5:
                return a1Var.f1186c;
            case 6:
                return a1Var.f1187d;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                return a1Var.f1188e;
            case 8:
                return a1Var.f1189f;
            case AbstractC0382a.f4777a /* 9 */:
                return a1Var.f1196m;
            case AbstractC0382a.f4779c /* 10 */:
                return a1Var.f1197n;
            case 11:
                return a1Var.f1198o;
            case 12:
                return a1Var.f1190g;
            case 13:
                return a1Var.f1191h;
            case 14:
                return a1Var.f1192i;
            default:
                throw new L1.f();
        }
    }
}
