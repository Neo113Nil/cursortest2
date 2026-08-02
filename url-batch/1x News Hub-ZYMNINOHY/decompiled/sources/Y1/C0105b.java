package Y1;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* renamed from: Y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0105b extends P1.t {
    @Override // P1.t
    public Object readValueOfType(byte b3, ByteBuffer byteBuffer) {
        int i3 = 0;
        if (b3 == -127) {
            Long l3 = (Long) readValue(byteBuffer);
            if (l3 == null) {
                return null;
            }
            int longValue = (int) l3.longValue();
            EnumC0121s.f1884b.getClass();
            EnumC0121s[] values = EnumC0121s.values();
            int length = values.length;
            while (i3 < length) {
                EnumC0121s enumC0121s = values[i3];
                if (enumC0121s.f1889a == longValue) {
                    return enumC0121s;
                }
                i3++;
            }
            return null;
        }
        if (b3 == -126) {
            Long l4 = (Long) readValue(byteBuffer);
            if (l4 == null) {
                return null;
            }
            int longValue2 = (int) l4.longValue();
            EnumC0114k.f1862b.getClass();
            EnumC0114k[] values2 = EnumC0114k.values();
            int length2 = values2.length;
            while (i3 < length2) {
                EnumC0114k enumC0114k = values2[i3];
                if (enumC0114k.f1869a == longValue2) {
                    return enumC0114k;
                }
                i3++;
            }
            return null;
        }
        if (b3 == -125) {
            Long l5 = (Long) readValue(byteBuffer);
            if (l5 == null) {
                return null;
            }
            int longValue3 = (int) l5.longValue();
            EnumC0127y.f1899b.getClass();
            EnumC0127y[] values3 = EnumC0127y.values();
            int length3 = values3.length;
            while (i3 < length3) {
                EnumC0127y enumC0127y = values3[i3];
                if (enumC0127y.f1902a == longValue3) {
                    return enumC0127y;
                }
                i3++;
            }
            return null;
        }
        if (b3 == -124) {
            Long l6 = (Long) readValue(byteBuffer);
            if (l6 == null) {
                return null;
            }
            int longValue4 = (int) l6.longValue();
            O.f1773b.getClass();
            O[] values4 = O.values();
            int length4 = values4.length;
            while (i3 < length4) {
                O o = values4[i3];
                if (o.f1781a == longValue4) {
                    return o;
                }
                i3++;
            }
            return null;
        }
        if (b3 == -123) {
            Long l7 = (Long) readValue(byteBuffer);
            if (l7 == null) {
                return null;
            }
            int longValue5 = (int) l7.longValue();
            EnumC0126x.f1896b.getClass();
            EnumC0126x[] values5 = EnumC0126x.values();
            int length5 = values5.length;
            while (i3 < length5) {
                EnumC0126x enumC0126x = values5[i3];
                if (enumC0126x.f1898a == longValue5) {
                    return enumC0126x;
                }
                i3++;
            }
            return null;
        }
        if (b3 != -122) {
            return super.readValueOfType(b3, byteBuffer);
        }
        Long l8 = (Long) readValue(byteBuffer);
        if (l8 == null) {
            return null;
        }
        int longValue6 = (int) l8.longValue();
        g0.f1856b.getClass();
        g0[] values6 = g0.values();
        int length6 = values6.length;
        while (i3 < length6) {
            g0 g0Var = values6[i3];
            if (g0Var.f1858a == longValue6) {
                return g0Var;
            }
            i3++;
        }
        return null;
    }

    @Override // P1.t
    public void writeValue(ByteArrayOutputStream stream, Object obj) {
        kotlin.jvm.internal.j.e(stream, "stream");
        if (obj instanceof EnumC0121s) {
            stream.write(129);
            writeValue(stream, Long.valueOf(((EnumC0121s) obj).f1889a));
            return;
        }
        if (obj instanceof EnumC0114k) {
            stream.write(130);
            writeValue(stream, Long.valueOf(((EnumC0114k) obj).f1869a));
            return;
        }
        if (obj instanceof EnumC0127y) {
            stream.write(131);
            writeValue(stream, Long.valueOf(((EnumC0127y) obj).f1902a));
            return;
        }
        if (obj instanceof O) {
            stream.write(132);
            writeValue(stream, Long.valueOf(((O) obj).f1781a));
        } else if (obj instanceof EnumC0126x) {
            stream.write(133);
            writeValue(stream, Long.valueOf(((EnumC0126x) obj).f1898a));
        } else if (!(obj instanceof g0)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(134);
            writeValue(stream, Long.valueOf(((g0) obj).f1858a));
        }
    }
}
