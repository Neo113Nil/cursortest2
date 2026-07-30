package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class QF extends XC {
    public static final AbstractC4006uK j(GK gk) {
        String D8;
        int B8 = gk.B();
        AbstractC4006uK m8 = m(gk, B8);
        if (m8 == null) {
            return l(gk, B8);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            int i = gk.f25151z;
            if (i == 0) {
                i = gk.b();
            }
            String str = null;
            if (i == 2 || i == 4 || i == 17) {
                if (m8 instanceof C3952tK) {
                    int i4 = gk.f25151z;
                    if (i4 == 0) {
                        i4 = gk.b();
                    }
                    if (i4 != 4) {
                        throw gk.K("END_ARRAY");
                    }
                    int i9 = gk.f25142D;
                    gk.f25142D = i9 - 1;
                    int[] iArr = gk.f25144F;
                    int i10 = i9 - 2;
                    iArr[i10] = iArr[i10] + 1;
                    gk.f25151z = 0;
                } else {
                    int i11 = gk.f25151z;
                    if (i11 == 0) {
                        i11 = gk.b();
                    }
                    if (i11 != 2) {
                        throw gk.K("END_OBJECT");
                    }
                    int i12 = gk.f25142D;
                    int i13 = i12 - 1;
                    gk.f25142D = i13;
                    gk.f25143E[i13] = null;
                    int[] iArr2 = gk.f25144F;
                    int i14 = i12 - 2;
                    iArr2[i14] = iArr2[i14] + 1;
                    gk.f25151z = 0;
                }
                if (arrayDeque.isEmpty()) {
                    return m8;
                }
                m8 = (AbstractC4006uK) arrayDeque.removeLast();
            } else {
                if (m8 instanceof C4114wK) {
                    int i15 = gk.f25151z;
                    if (i15 == 0) {
                        i15 = gk.b();
                    }
                    if (i15 == 14) {
                        D8 = gk.E();
                    } else if (i15 == 12) {
                        D8 = gk.D('\'');
                    } else {
                        if (i15 != 13) {
                            throw gk.K("a name");
                        }
                        D8 = gk.D('\"');
                    }
                    str = D8;
                    gk.f25151z = 0;
                    gk.f25143E[gk.f25142D - 1] = str;
                    if (!YD.b(str)) {
                        throw new IOException("illegal characters in string");
                    }
                }
                int B9 = gk.B();
                AbstractC4006uK m9 = m(gk, B9);
                AbstractC4006uK l9 = m9 == null ? l(gk, B9) : m9;
                if (m8 instanceof C3952tK) {
                    ((C3952tK) m8).f34396n.add(l9);
                } else {
                    C4114wK c4114wK = (C4114wK) m8;
                    if (c4114wK.f34974n.containsKey(str)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(str)));
                    }
                    c4114wK.f34974n.put(str, l9);
                }
                if (m9 != null) {
                    arrayDeque.addLast(m8);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    m8 = l9;
                } else {
                    continue;
                }
            }
        }
    }

    public static void k(HK hk, AbstractC4006uK abstractC4006uK) {
        if (abstractC4006uK == null || (abstractC4006uK instanceof C4060vK)) {
            hk.b();
            return;
        }
        boolean z8 = abstractC4006uK instanceof C4222yK;
        androidx.fragment.app.Y y6 = hk.f25354n;
        if (z8) {
            C4222yK d2 = abstractC4006uK.d();
            Serializable serializable = d2.f35341n;
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    boolean booleanValue = serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(d2.a());
                    hk.z();
                    hk.C();
                    y6.write(true != booleanValue ? "false" : "true");
                    return;
                }
                String a9 = d2.a();
                if (a9 == null) {
                    hk.b();
                    return;
                }
                hk.z();
                hk.C();
                hk.A(a9);
                return;
            }
            Number e6 = d2.e();
            if (e6 == null) {
                hk.b();
                return;
            }
            hk.z();
            String obj = e6.toString();
            Class<?> cls = e6.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                    if (hk.f25352A != 1) {
                        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
                    }
                } else if (cls != Float.class && cls != Double.class && !HK.f25350C.matcher(obj).matches()) {
                    String valueOf = String.valueOf(cls);
                    throw new IllegalArgumentException(com.anythink.basead.b.c.i.q(new StringBuilder(valueOf.length() + 47 + obj.length()), "String created by ", valueOf, " is not a valid JSON number: ", obj));
                }
            }
            hk.C();
            y6.append((CharSequence) obj);
            return;
        }
        boolean z9 = abstractC4006uK instanceof C3952tK;
        if (z9) {
            hk.z();
            hk.C();
            int i = hk.f25356v;
            int[] iArr = hk.f25355u;
            if (i == iArr.length) {
                hk.f25355u = Arrays.copyOf(iArr, i + i);
            }
            int[] iArr2 = hk.f25355u;
            int i4 = hk.f25356v;
            hk.f25356v = i4 + 1;
            iArr2[i4] = 1;
            y6.write(91);
            if (!z9) {
                throw new IllegalStateException("Not a JSON Array: ".concat(abstractC4006uK.toString()));
            }
            Iterator it = ((C3952tK) abstractC4006uK).f34396n.iterator();
            while (it.hasNext()) {
                k(hk, (AbstractC4006uK) it.next());
            }
            hk.g(1, 2, ']');
            return;
        }
        if (!(abstractC4006uK instanceof C4114wK)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(abstractC4006uK.getClass())));
        }
        hk.z();
        hk.C();
        int i9 = hk.f25356v;
        int[] iArr3 = hk.f25355u;
        if (i9 == iArr3.length) {
            hk.f25355u = Arrays.copyOf(iArr3, i9 + i9);
        }
        int[] iArr4 = hk.f25355u;
        int i10 = hk.f25356v;
        hk.f25356v = i10 + 1;
        iArr4[i10] = 3;
        y6.write(123);
        Iterator it2 = ((CK) abstractC4006uK.c().f34974n.entrySet()).iterator();
        while (((BK) it2).hasNext()) {
            DK a10 = ((BK) it2).a();
            String str = (String) a10.getKey();
            Objects.requireNonNull(str, "name == null");
            if (hk.f25353B != null) {
                throw new IllegalStateException("Already wrote a name, expecting a value.");
            }
            int j9 = hk.j();
            if (j9 != 3 && j9 != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            hk.f25353B = str;
            k(hk, (AbstractC4006uK) a10.getValue());
        }
        hk.g(3, 5, '}');
    }

    public static final AbstractC4006uK l(GK gk, int i) {
        int i4 = i - 1;
        if (i4 == 5) {
            String j9 = gk.j();
            if (YD.b(j9)) {
                return new C4222yK(j9);
            }
            throw new IOException("illegal characters in string");
        }
        if (i4 == 6) {
            return new C4222yK(new RF(gk.j()));
        }
        boolean z8 = true;
        if (i4 != 7) {
            if (i4 != 8) {
                throw new IllegalStateException("Unexpected token: ".concat(AbstractC4161xD.a(i)));
            }
            int i9 = gk.f25151z;
            if (i9 == 0) {
                i9 = gk.b();
            }
            if (i9 != 7) {
                throw gk.K("null");
            }
            gk.f25151z = 0;
            int[] iArr = gk.f25144F;
            int i10 = gk.f25142D - 1;
            iArr[i10] = iArr[i10] + 1;
            return C4060vK.f34753n;
        }
        int i11 = gk.f25151z;
        if (i11 == 0) {
            i11 = gk.b();
        }
        if (i11 == 5) {
            gk.f25151z = 0;
            int[] iArr2 = gk.f25144F;
            int i12 = gk.f25142D - 1;
            iArr2[i12] = iArr2[i12] + 1;
        } else {
            if (i11 != 6) {
                throw gk.K("a boolean");
            }
            gk.f25151z = 0;
            int[] iArr3 = gk.f25144F;
            int i13 = gk.f25142D - 1;
            iArr3[i13] = iArr3[i13] + 1;
            z8 = false;
        }
        return new C4222yK(Boolean.valueOf(z8));
    }

    public static final AbstractC4006uK m(GK gk, int i) {
        int i4 = i - 1;
        if (i4 == 0) {
            int i9 = gk.f25151z;
            if (i9 == 0) {
                i9 = gk.b();
            }
            if (i9 != 3) {
                throw gk.K("BEGIN_ARRAY");
            }
            gk.F(1);
            gk.f25144F[gk.f25142D - 1] = 0;
            gk.f25151z = 0;
            return new C3952tK();
        }
        if (i4 != 2) {
            return null;
        }
        int i10 = gk.f25151z;
        if (i10 == 0) {
            i10 = gk.b();
        }
        if (i10 != 1) {
            throw gk.K("BEGIN_OBJECT");
        }
        gk.F(3);
        gk.f25151z = 0;
        return new C4114wK();
    }
}
