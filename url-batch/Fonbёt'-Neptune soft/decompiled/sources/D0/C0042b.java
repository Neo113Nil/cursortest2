package D0;

import java.nio.ByteBuffer;

/* renamed from: D0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0042b extends w0.o {
    @Override // w0.o
    public Object f(byte b2, ByteBuffer byteBuffer) {
        Q0.h.e(byteBuffer, "buffer");
        int i2 = 0;
        if (b2 == -127) {
            Long l2 = (Long) e(byteBuffer);
            if (l2 == null) {
                return null;
            }
            int longValue = (int) l2.longValue();
            r[] values = r.values();
            int length = values.length;
            while (i2 < length) {
                r rVar = values[i2];
                if (rVar.f405e == longValue) {
                    return rVar;
                }
                i2++;
            }
            return null;
        }
        if (b2 == -126) {
            Long l3 = (Long) e(byteBuffer);
            if (l3 == null) {
                return null;
            }
            int longValue2 = (int) l3.longValue();
            EnumC0051k[] values2 = EnumC0051k.values();
            int length2 = values2.length;
            while (i2 < length2) {
                EnumC0051k enumC0051k = values2[i2];
                if (enumC0051k.f376e == longValue2) {
                    return enumC0051k;
                }
                i2++;
            }
            return null;
        }
        if (b2 == -125) {
            Long l4 = (Long) e(byteBuffer);
            if (l4 == null) {
                return null;
            }
            int longValue3 = (int) l4.longValue();
            EnumC0064y[] values3 = EnumC0064y.values();
            int length3 = values3.length;
            while (i2 < length3) {
                EnumC0064y enumC0064y = values3[i2];
                if (enumC0064y.f420e == longValue3) {
                    return enumC0064y;
                }
                i2++;
            }
            return null;
        }
        if (b2 == -124) {
            Long l5 = (Long) e(byteBuffer);
            if (l5 == null) {
                return null;
            }
            int longValue4 = (int) l5.longValue();
            S[] values4 = S.values();
            int length4 = values4.length;
            while (i2 < length4) {
                S s2 = values4[i2];
                if (s2.f279e == longValue4) {
                    return s2;
                }
                i2++;
            }
            return null;
        }
        if (b2 != -123) {
            return super.f(b2, byteBuffer);
        }
        Long l6 = (Long) e(byteBuffer);
        if (l6 == null) {
            return null;
        }
        int longValue5 = (int) l6.longValue();
        EnumC0063x[] values5 = EnumC0063x.values();
        int length5 = values5.length;
        while (i2 < length5) {
            EnumC0063x enumC0063x = values5[i2];
            if (enumC0063x.f417e == longValue5) {
                return enumC0063x;
            }
            i2++;
        }
        return null;
    }

    @Override // w0.o
    public void k(w0.n nVar, Object obj) {
        if (obj instanceof r) {
            nVar.write(129);
            k(nVar, Integer.valueOf(((r) obj).f405e));
            return;
        }
        if (obj instanceof EnumC0051k) {
            nVar.write(130);
            k(nVar, Integer.valueOf(((EnumC0051k) obj).f376e));
            return;
        }
        if (obj instanceof EnumC0064y) {
            nVar.write(131);
            k(nVar, Integer.valueOf(((EnumC0064y) obj).f420e));
        } else if (obj instanceof S) {
            nVar.write(132);
            k(nVar, Integer.valueOf(((S) obj).f279e));
        } else if (!(obj instanceof EnumC0063x)) {
            super.k(nVar, obj);
        } else {
            nVar.write(133);
            k(nVar, Integer.valueOf(((EnumC0063x) obj).f417e));
        }
    }
}
