package D;

import G.C0216p;
import l.AbstractC0784j;
import q.AbstractC1024c;
import v.AbstractC1234e;
import v.C1231b;
import v.C1233d;
import y2.C1338m;

/* renamed from: D.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0146k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final G.Y0 f1872a = new G.Y0(L.f1470p);

    public static final Z.P a(int i2, C0216p c0216p) {
        C0143j1 c0143j1 = (C0143j1) c0216p.k(f1872a);
        switch (AbstractC0784j.d(i2)) {
            case 0:
                return c0143j1.f1866e;
            case 1:
                return b(c0143j1.f1866e);
            case 2:
                return c0143j1.f1862a;
            case 3:
                return b(c0143j1.f1862a);
            case 4:
                return AbstractC1234e.f10972a;
            case 5:
                return c0143j1.f1865d;
            case 6:
                C1233d c1233d = c0143j1.f1865d;
                float f4 = (float) 0.0d;
                return C1233d.b(c1233d, new C1231b(f4), null, new C1231b(f4), 6);
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return b(c0143j1.f1865d);
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                return c0143j1.f1864c;
            case AbstractC1024c.f9242c /* 9 */:
                return Z.K.f4461a;
            case 10:
                return c0143j1.f1863b;
            default:
                throw new C1338m();
        }
    }

    public static final C1233d b(C1233d c1233d) {
        float f4 = (float) 0.0d;
        return C1233d.b(c1233d, null, new C1231b(f4), new C1231b(f4), 3);
    }
}
