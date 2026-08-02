package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jlo implements jlz {
    public static final int[] a = new int[0];
    public static final Unsafe b = jmp.h();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final jll g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final jmj m;

    public jlo(int[] iArr, Object[] objArr, int i, int i2, jll jllVar, int[] iArr2, int i3, int i4, jmj jmjVar, ils ilsVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = jllVar instanceof jkp;
        boolean z = false;
        if (ilsVar != null && (jllVar instanceof jkm)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = jmjVar;
        this.g = jllVar;
    }

    private static void A(Object obj) {
        if (!N(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void B(Object obj, Object obj2, int i) {
        if (K(obj2, i)) {
            long t = t(s(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, t);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + n(i) + " is present but null: " + obj2.toString());
            }
            jlz w = w(i);
            if (!K(obj, i)) {
                if (N(object)) {
                    Object e = w.e();
                    w.h(e, object);
                    unsafe.putObject(obj, t, e);
                } else {
                    unsafe.putObject(obj, t, object);
                }
                E(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, t);
            if (!N(object2)) {
                Object e2 = w.e();
                w.h(e2, object2);
                unsafe.putObject(obj, t, e2);
                object2 = e2;
            }
            w.h(object2, object);
        }
    }

    private final void C(Object obj, Object obj2, int i) {
        int n = n(i);
        if (P(obj2, n, i)) {
            long t = t(s(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, t);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + n(i) + " is present but null: " + obj2.toString());
            }
            jlz w = w(i);
            if (!P(obj, n, i)) {
                if (N(object)) {
                    Object e = w.e();
                    w.h(e, object);
                    unsafe.putObject(obj, t, e);
                } else {
                    unsafe.putObject(obj, t, object);
                }
                F(obj, n, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, t);
            if (!N(object2)) {
                Object e2 = w.e();
                w.h(e2, object2);
                unsafe.putObject(obj, t, e2);
                object2 = e2;
            }
            w.h(object2, object);
        }
    }

    private final void D(Object obj, int i, jjv jjvVar) {
        if (J(i)) {
            jmp.q(obj, t(i), jjvVar.v());
        } else if (this.i) {
            jmp.q(obj, t(i), jjvVar.u());
        } else {
            jmp.q(obj, t(i), jjvVar.o());
        }
    }

    private final void E(Object obj, int i) {
        int q = q(i);
        long j = 1048575 & q;
        if (j == 1048575) {
            return;
        }
        jmp.o(obj, j, (1 << (q >>> 20)) | jmp.c(obj, j));
    }

    private final void F(Object obj, int i, int i2) {
        jmp.o(obj, q(i2) & 1048575, i);
    }

    private final void G(Object obj, int i, Object obj2) {
        b.putObject(obj, t(s(i)), obj2);
        E(obj, i);
    }

    private final void H(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, t(s(i2)), obj2);
        F(obj, i, i2);
    }

    private final boolean I(Object obj, Object obj2, int i) {
        return K(obj, i) == K(obj2, i);
    }

    private static boolean J(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean K(Object obj, int i) {
        int q = q(i);
        long j = 1048575 & q;
        if (j != 1048575) {
            return ((1 << (q >>> 20)) & jmp.c(obj, j)) != 0;
        }
        int s = s(i);
        long t = t(s);
        switch ((s >>> 20) & 255) {
            case 0:
                return Double.doubleToRawLongBits(jmp.a(obj, t)) != 0;
            case 1:
                return Float.floatToRawIntBits(jmp.b(obj, t)) != 0;
            case 2:
                return jmp.d(obj, t) != 0;
            case 3:
                return jmp.d(obj, t) != 0;
            case 4:
                return jmp.c(obj, t) != 0;
            case 5:
                return jmp.d(obj, t) != 0;
            case 6:
                return jmp.c(obj, t) != 0;
            case 7:
                return jmp.s(obj, t);
            case 8:
                Object f = jmp.f(obj, t);
                return f instanceof String ? !((String) f).isEmpty() : f instanceof jjq ? !jjq.d.equals(f) : Q();
            case 9:
                return jmp.f(obj, t) != null;
            case 10:
                return !jjq.d.equals(jmp.f(obj, t));
            case 11:
                return jmp.c(obj, t) != 0;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return jmp.c(obj, t) != 0;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return jmp.c(obj, t) != 0;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return jmp.d(obj, t) != 0;
            case 15:
                return jmp.c(obj, t) != 0;
            case 16:
                return jmp.d(obj, t) != 0;
            case 17:
                return jmp.f(obj, t) != null;
            default:
                return Q();
        }
    }

    private final boolean L(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? K(obj, i) : (i3 & i4) != 0;
    }

    private static boolean M(Object obj, int i, jlz jlzVar) {
        return jlzVar.l(jmp.f(obj, t(i)));
    }

    private static boolean N(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof jkp) {
            return ((jkp) obj).M();
        }
        return true;
    }

    private final boolean O(Object obj, Object obj2, int i) {
        long q = q(i) & 1048575;
        return jmp.c(obj, q) == jmp.c(obj2, q);
    }

    private final boolean P(Object obj, int i, int i2) {
        return jmp.c(obj, (long) (q(i2) & 1048575)) == i;
    }

    private boolean Q() {
        throw new IllegalArgumentException();
    }

    private static final int R(byte[] bArr, int i, int i2, jmr jmrVar, Class cls, jje jjeVar) {
        jmr jmrVar2 = jmr.DOUBLE;
        switch (jmrVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                jjeVar.c = Double.valueOf(jjf.a(bArr, i));
                return i3;
            case 1:
                int i4 = i + 4;
                jjeVar.c = Float.valueOf(jjf.b(bArr, i));
                return i4;
            case 2:
            case 3:
                int p = jjf.p(bArr, i, jjeVar);
                jjeVar.c = Long.valueOf(jjeVar.b);
                return p;
            case 4:
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int m = jjf.m(bArr, i, jjeVar);
                jjeVar.c = Integer.valueOf(jjeVar.a);
                return m;
            case 5:
            case 15:
                int i5 = i + 8;
                jjeVar.c = Long.valueOf(jjf.t(bArr, i));
                return i5;
            case 6:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                int i6 = i + 4;
                jjeVar.c = Integer.valueOf(jjf.d(bArr, i));
                return i6;
            case 7:
                int p2 = jjf.p(bArr, i, jjeVar);
                jjeVar.c = Boolean.valueOf(jjeVar.b != 0);
                return p2;
            case 8:
                return jjf.k(bArr, i, jjeVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return jjf.g(jlt.a.b(cls), bArr, i, i2, jjeVar);
            case 11:
                return jjf.c(bArr, i, jjeVar);
            case 16:
                int m2 = jjf.m(bArr, i, jjeVar);
                int i7 = jjeVar.a;
                int i8 = jju.f;
                jjeVar.c = Integer.valueOf((-(i7 & 1)) ^ (i7 >>> 1));
                return m2;
            case 17:
                int p3 = jjf.p(bArr, i, jjeVar);
                long j = jjeVar.b;
                int i9 = jju.f;
                jjeVar.c = Long.valueOf((-(j & 1)) ^ (j >>> 1));
                return p3;
        }
    }

    private final Object S(Object obj, int i, Object obj2, Object obj3) {
        jks v;
        int n = n(i);
        Object f = jmp.f(obj, t(s(i)));
        if (f == null || (v = v(i)) == null) {
            return obj2;
        }
        iwq d = ily.d(x(i));
        Iterator it = ((jli) f).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!v.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = jmj.f(obj3);
                }
                int v2 = ikk.v(d, entry.getKey(), entry.getValue());
                jjq jjqVar = jjq.d;
                byte[] bArr = new byte[v2];
                jjz S = jjz.S(bArr);
                try {
                    ikk.w(S, d, entry.getKey(), entry.getValue());
                    jmj.b(obj2, n, ilq.a(S, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static final void T(int i, Object obj, ikk ikkVar) {
        if (obj instanceof String) {
            ikkVar.s(i, (String) obj);
        } else {
            ikkVar.d(i, (jjq) obj);
        }
    }

    static jmk d(Object obj) {
        jkp jkpVar = (jkp) obj;
        jmk jmkVar = jkpVar.s;
        if (jmkVar != jmk.a) {
            return jmkVar;
        }
        jmk jmkVar2 = new jmk();
        jkpVar.s = jmkVar2;
        return jmkVar2;
    }

    public static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    private final int n(int i) {
        return this.c[i];
    }

    private static int o(Object obj, long j) {
        return ((Integer) jmp.f(obj, j)).intValue();
    }

    private final int p(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return r(i, 0);
    }

    private final int q(int i) {
        return this.c[i + 2];
    }

    private final int r(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int n = n(i4);
            if (i == n) {
                return i4;
            }
            if (i < n) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final int s(int i) {
        return this.c[i + 1];
    }

    private static long t(int i) {
        return i & 1048575;
    }

    private static long u(Object obj, long j) {
        return ((Long) jmp.f(obj, j)).longValue();
    }

    private final jks v(int i) {
        int i2 = i / 3;
        return (jks) this.d[i2 + i2 + 1];
    }

    private final jlz w(int i) {
        Object[] objArr = this.d;
        int i2 = i / 3;
        int i3 = i2 + i2;
        jlz jlzVar = (jlz) objArr[i3];
        if (jlzVar != null) {
            return jlzVar;
        }
        jlz b2 = jlt.a.b((Class) objArr[i3 + 1]);
        objArr[i3] = b2;
        return b2;
    }

    private final Object x(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private final Object y(Object obj, int i) {
        jlz w = w(i);
        long t = t(s(i));
        if (!K(obj, i)) {
            return w.e();
        }
        Object object = b.getObject(obj, t);
        if (N(object)) {
            return object;
        }
        Object e = w.e();
        if (object != null) {
            w.h(e, object);
        }
        return e;
    }

    private final Object z(Object obj, int i, int i2) {
        jlz w = w(i2);
        if (!P(obj, i, i2)) {
            return w.e();
        }
        Object object = b.getObject(obj, t(s(i2)));
        if (N(object)) {
            return object;
        }
        Object e = w.e();
        if (object != null) {
            w.h(e, object);
        }
        return e;
    }

    @Override // defpackage.jlz
    public final int a(Object obj) {
        int i;
        int numberOfLeadingZeros;
        int J;
        int numberOfLeadingZeros2;
        int c;
        int l;
        int size;
        int l2;
        int numberOfLeadingZeros3;
        int numberOfLeadingZeros4;
        int numberOfLeadingZeros5;
        int size2;
        int numberOfLeadingZeros6;
        int numberOfLeadingZeros7;
        int i2;
        int numberOfLeadingZeros8;
        int numberOfLeadingZeros9;
        jlo jloVar = this;
        Object obj2 = obj;
        Unsafe unsafe = b;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = jloVar.c;
            if (i4 >= iArr.length) {
                int a2 = i6 + jmj.d(obj).a();
                if (!jloVar.h) {
                    return a2;
                }
                jme jmeVar = ils.a(obj).b;
                int size3 = jmeVar.size();
                int i7 = 0;
                for (int i8 = 0; i8 < size3; i8++) {
                    jmb jmbVar = (jmb) jmeVar.a(i8);
                    i7 += jkf.i(jmbVar.c, jmbVar.a);
                }
                return a2 + i7;
            }
            int s = jloVar.s(i4);
            int n = jloVar.n(i4);
            int i9 = iArr[i4 + 2];
            int i10 = i9 & 1048575;
            int i11 = (s >>> 20) & 255;
            if (i11 <= 17) {
                if (i10 != i3) {
                    i5 = i10 == 1048575 ? 0 : unsafe.getInt(obj2, i10);
                    i3 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long t = t(s);
            if (i11 >= jkg.DOUBLE_LIST_PACKED.Z) {
                int i12 = jkg.SINT64_LIST_PACKED.Z;
            }
            switch (i11) {
                case 0:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        i6 += ((352 - (Integer.numberOfLeadingZeros(n << 3) * 9)) >>> 6) + 8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        numberOfLeadingZeros = Integer.numberOfLeadingZeros(n << 3);
                        J = ((352 - (numberOfLeadingZeros * 9)) >>> 6) + 4;
                        i6 += J;
                    }
                    jloVar = this;
                    break;
                case 2:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        J = jjz.J(n, unsafe.getLong(obj2, t));
                        i6 += J;
                    }
                    jloVar = this;
                    break;
                case 3:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        J = jjz.R(n, unsafe.getLong(obj2, t));
                        i6 += J;
                    }
                    jloVar = this;
                    break;
                case 4:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        J = jjz.H(n, unsafe.getInt(obj2, t));
                        i6 += J;
                    }
                    jloVar = this;
                    break;
                case 5:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(n << 3);
                        J = ((352 - (numberOfLeadingZeros2 * 9)) >>> 6) + 8;
                        i6 += J;
                    }
                    jloVar = this;
                    break;
                case 6:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        numberOfLeadingZeros = Integer.numberOfLeadingZeros(n << 3);
                        J = ((352 - (numberOfLeadingZeros * 9)) >>> 6) + 4;
                        i6 += J;
                    }
                    jloVar = this;
                    break;
                case 7:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        J = ((352 - (Integer.numberOfLeadingZeros(n << 3) * 9)) >>> 6) + 1;
                        i6 += J;
                    }
                    jloVar = this;
                    break;
                case 8:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj2, t);
                        J = object instanceof jjq ? jjz.E(n, (jjq) object) : jjz.O(n, (String) object);
                        i6 += J;
                    }
                    jloVar = this;
                    break;
                case 9:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        c = jma.c(n, unsafe.getObject(obj2, t), jloVar.w(i4));
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        J = jjz.E(n, (jjq) unsafe.getObject(obj2, t));
                        i6 += J;
                    }
                    jloVar = this;
                    break;
                case 11:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        J = jjz.Q(n, unsafe.getInt(obj2, t));
                        i6 += J;
                    }
                    jloVar = this;
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        J = jjz.G(n, unsafe.getInt(obj2, t));
                        i6 += J;
                    }
                    jloVar = this;
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        numberOfLeadingZeros = Integer.numberOfLeadingZeros(n << 3);
                        J = ((352 - (numberOfLeadingZeros * 9)) >>> 6) + 4;
                        i6 += J;
                    }
                    jloVar = this;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(n << 3);
                        J = ((352 - (numberOfLeadingZeros2 * 9)) >>> 6) + 8;
                        i6 += J;
                    }
                    jloVar = this;
                    break;
                case 15:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        J = jjz.M(n, unsafe.getInt(obj2, t));
                        i6 += J;
                    }
                    jloVar = this;
                    break;
                case 16:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        J = jjz.N(n, unsafe.getLong(obj2, t));
                        i6 += J;
                    }
                    jloVar = this;
                    break;
                case 17:
                    if (jloVar.L(obj2, i4, i3, i5, i)) {
                        c = jma.a(n, (jll) unsafe.getObject(obj2, t), jloVar.w(i4));
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c = jma.j(n, (List) unsafe.getObject(obj2, t));
                    i6 += c;
                    break;
                case 19:
                    c = jma.i(n, (List) unsafe.getObject(obj2, t));
                    i6 += c;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar = jma.a;
                    if (list.size() != 0) {
                        l = jma.l(list) + (list.size() * ((352 - (Integer.numberOfLeadingZeros(n << 3) * 9)) >>> 6));
                        i6 += l;
                        break;
                    }
                    l = 0;
                    i6 += l;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar2 = jma.a;
                    size = list2.size();
                    if (size != 0) {
                        l2 = jma.l(list2);
                        numberOfLeadingZeros3 = Integer.numberOfLeadingZeros(n << 3);
                        c = l2 + (size * ((352 - (numberOfLeadingZeros3 * 9)) >>> 6));
                        i6 += c;
                        break;
                    }
                    c = 0;
                    i6 += c;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar3 = jma.a;
                    size = list3.size();
                    if (size != 0) {
                        l2 = jma.k(list3);
                        numberOfLeadingZeros3 = Integer.numberOfLeadingZeros(n << 3);
                        c = l2 + (size * ((352 - (numberOfLeadingZeros3 * 9)) >>> 6));
                        i6 += c;
                        break;
                    }
                    c = 0;
                    i6 += c;
                case 23:
                    c = jma.j(n, (List) unsafe.getObject(obj2, t));
                    i6 += c;
                    break;
                case 24:
                    c = jma.i(n, (List) unsafe.getObject(obj2, t));
                    i6 += c;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar4 = jma.a;
                    int size4 = list4.size();
                    if (size4 != 0) {
                        c = size4 * (((352 - (Integer.numberOfLeadingZeros(n << 3) * 9)) >>> 6) + 1);
                        i6 += c;
                        break;
                    }
                    c = 0;
                    i6 += c;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar5 = jma.a;
                    int size5 = list5.size();
                    if (size5 != 0) {
                        boolean z = list5 instanceof jlg;
                        l = ((352 - (Integer.numberOfLeadingZeros(n << 3) * 9)) >>> 6) * size5;
                        if (z) {
                            jlg jlgVar = (jlg) list5;
                            for (int i13 = 0; i13 < size5; i13++) {
                                Object c2 = jlgVar.c();
                                l += c2 instanceof jjq ? jjz.F((jjq) c2) : jjz.P((String) c2);
                            }
                        } else {
                            for (int i14 = 0; i14 < size5; i14++) {
                                Object obj3 = list5.get(i14);
                                l += obj3 instanceof jjq ? jjz.F((jjq) obj3) : jjz.P((String) obj3);
                            }
                        }
                        i6 += l;
                        break;
                    }
                    l = 0;
                    i6 += l;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, t);
                    jlz w = jloVar.w(i4);
                    jmj jmjVar6 = jma.a;
                    int size6 = list6.size();
                    if (size6 != 0) {
                        numberOfLeadingZeros4 = ((352 - (Integer.numberOfLeadingZeros(n << 3) * 9)) >>> 6) * size6;
                        for (int i15 = 0; i15 < size6; i15++) {
                            numberOfLeadingZeros4 += jma.b((jja) list6.get(i15), w);
                        }
                        i6 += numberOfLeadingZeros4;
                        break;
                    }
                    numberOfLeadingZeros4 = 0;
                    i6 += numberOfLeadingZeros4;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar7 = jma.a;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        numberOfLeadingZeros5 = 0;
                    } else {
                        numberOfLeadingZeros5 = size7 * ((352 - (Integer.numberOfLeadingZeros(n << 3) * 9)) >>> 6);
                        for (int i16 = 0; i16 < list7.size(); i16++) {
                            numberOfLeadingZeros5 += jjz.F((jjq) list7.get(i16));
                        }
                    }
                    i6 += numberOfLeadingZeros5;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar8 = jma.a;
                    size = list8.size();
                    if (size != 0) {
                        l2 = jma.f(list8);
                        numberOfLeadingZeros3 = Integer.numberOfLeadingZeros(n << 3);
                        c = l2 + (size * ((352 - (numberOfLeadingZeros3 * 9)) >>> 6));
                        i6 += c;
                        break;
                    }
                    c = 0;
                    i6 += c;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar9 = jma.a;
                    size = list9.size();
                    if (size != 0) {
                        l2 = jma.k(list9);
                        numberOfLeadingZeros3 = Integer.numberOfLeadingZeros(n << 3);
                        c = l2 + (size * ((352 - (numberOfLeadingZeros3 * 9)) >>> 6));
                        i6 += c;
                        break;
                    }
                    c = 0;
                    i6 += c;
                case 31:
                    c = jma.i(n, (List) unsafe.getObject(obj2, t));
                    i6 += c;
                    break;
                case 32:
                    c = jma.j(n, (List) unsafe.getObject(obj2, t));
                    i6 += c;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar10 = jma.a;
                    size = list10.size();
                    if (size != 0) {
                        l2 = jma.d(list10);
                        numberOfLeadingZeros3 = Integer.numberOfLeadingZeros(n << 3);
                        c = l2 + (size * ((352 - (numberOfLeadingZeros3 * 9)) >>> 6));
                        i6 += c;
                        break;
                    }
                    c = 0;
                    i6 += c;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar11 = jma.a;
                    size = list11.size();
                    if (size != 0) {
                        l2 = jma.e(list11);
                        numberOfLeadingZeros3 = Integer.numberOfLeadingZeros(n << 3);
                        c = l2 + (size * ((352 - (numberOfLeadingZeros3 * 9)) >>> 6));
                        i6 += c;
                        break;
                    }
                    c = 0;
                    i6 += c;
                case 35:
                    List list12 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar12 = jma.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        numberOfLeadingZeros6 = Integer.numberOfLeadingZeros(n << 3) * 9;
                        numberOfLeadingZeros7 = Integer.numberOfLeadingZeros(size2);
                        numberOfLeadingZeros5 = ((352 - numberOfLeadingZeros6) >>> 6) + ((352 - (numberOfLeadingZeros7 * 9)) >>> 6) + size2;
                        i6 += numberOfLeadingZeros5;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar13 = jma.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        numberOfLeadingZeros6 = Integer.numberOfLeadingZeros(n << 3) * 9;
                        numberOfLeadingZeros7 = Integer.numberOfLeadingZeros(size2);
                        numberOfLeadingZeros5 = ((352 - numberOfLeadingZeros6) >>> 6) + ((352 - (numberOfLeadingZeros7 * 9)) >>> 6) + size2;
                        i6 += numberOfLeadingZeros5;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = jma.l((List) unsafe.getObject(obj2, t));
                    if (size2 > 0) {
                        numberOfLeadingZeros6 = Integer.numberOfLeadingZeros(n << 3) * 9;
                        numberOfLeadingZeros7 = Integer.numberOfLeadingZeros(size2);
                        numberOfLeadingZeros5 = ((352 - numberOfLeadingZeros6) >>> 6) + ((352 - (numberOfLeadingZeros7 * 9)) >>> 6) + size2;
                        i6 += numberOfLeadingZeros5;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = jma.l((List) unsafe.getObject(obj2, t));
                    if (size2 > 0) {
                        numberOfLeadingZeros6 = Integer.numberOfLeadingZeros(n << 3) * 9;
                        numberOfLeadingZeros7 = Integer.numberOfLeadingZeros(size2);
                        numberOfLeadingZeros5 = ((352 - numberOfLeadingZeros6) >>> 6) + ((352 - (numberOfLeadingZeros7 * 9)) >>> 6) + size2;
                        i6 += numberOfLeadingZeros5;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = jma.k((List) unsafe.getObject(obj2, t));
                    if (size2 > 0) {
                        numberOfLeadingZeros6 = Integer.numberOfLeadingZeros(n << 3) * 9;
                        numberOfLeadingZeros7 = Integer.numberOfLeadingZeros(size2);
                        numberOfLeadingZeros5 = ((352 - numberOfLeadingZeros6) >>> 6) + ((352 - (numberOfLeadingZeros7 * 9)) >>> 6) + size2;
                        i6 += numberOfLeadingZeros5;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar14 = jma.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        numberOfLeadingZeros6 = Integer.numberOfLeadingZeros(n << 3) * 9;
                        numberOfLeadingZeros7 = Integer.numberOfLeadingZeros(size2);
                        numberOfLeadingZeros5 = ((352 - numberOfLeadingZeros6) >>> 6) + ((352 - (numberOfLeadingZeros7 * 9)) >>> 6) + size2;
                        i6 += numberOfLeadingZeros5;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar15 = jma.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        numberOfLeadingZeros6 = Integer.numberOfLeadingZeros(n << 3) * 9;
                        numberOfLeadingZeros7 = Integer.numberOfLeadingZeros(size2);
                        numberOfLeadingZeros5 = ((352 - numberOfLeadingZeros6) >>> 6) + ((352 - (numberOfLeadingZeros7 * 9)) >>> 6) + size2;
                        i6 += numberOfLeadingZeros5;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar16 = jma.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        numberOfLeadingZeros6 = Integer.numberOfLeadingZeros(n << 3) * 9;
                        numberOfLeadingZeros7 = Integer.numberOfLeadingZeros(size2);
                        numberOfLeadingZeros5 = ((352 - numberOfLeadingZeros6) >>> 6) + ((352 - (numberOfLeadingZeros7 * 9)) >>> 6) + size2;
                        i6 += numberOfLeadingZeros5;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = jma.f((List) unsafe.getObject(obj2, t));
                    if (size2 > 0) {
                        numberOfLeadingZeros6 = Integer.numberOfLeadingZeros(n << 3) * 9;
                        numberOfLeadingZeros7 = Integer.numberOfLeadingZeros(size2);
                        numberOfLeadingZeros5 = ((352 - numberOfLeadingZeros6) >>> 6) + ((352 - (numberOfLeadingZeros7 * 9)) >>> 6) + size2;
                        i6 += numberOfLeadingZeros5;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = jma.k((List) unsafe.getObject(obj2, t));
                    if (size2 > 0) {
                        numberOfLeadingZeros6 = Integer.numberOfLeadingZeros(n << 3) * 9;
                        numberOfLeadingZeros7 = Integer.numberOfLeadingZeros(size2);
                        numberOfLeadingZeros5 = ((352 - numberOfLeadingZeros6) >>> 6) + ((352 - (numberOfLeadingZeros7 * 9)) >>> 6) + size2;
                        i6 += numberOfLeadingZeros5;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar17 = jma.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        numberOfLeadingZeros6 = Integer.numberOfLeadingZeros(n << 3) * 9;
                        numberOfLeadingZeros7 = Integer.numberOfLeadingZeros(size2);
                        numberOfLeadingZeros5 = ((352 - numberOfLeadingZeros6) >>> 6) + ((352 - (numberOfLeadingZeros7 * 9)) >>> 6) + size2;
                        i6 += numberOfLeadingZeros5;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(obj2, t);
                    jmj jmjVar18 = jma.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        numberOfLeadingZeros6 = Integer.numberOfLeadingZeros(n << 3) * 9;
                        numberOfLeadingZeros7 = Integer.numberOfLeadingZeros(size2);
                        numberOfLeadingZeros5 = ((352 - numberOfLeadingZeros6) >>> 6) + ((352 - (numberOfLeadingZeros7 * 9)) >>> 6) + size2;
                        i6 += numberOfLeadingZeros5;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = jma.d((List) unsafe.getObject(obj2, t));
                    if (size2 > 0) {
                        numberOfLeadingZeros6 = Integer.numberOfLeadingZeros(n << 3) * 9;
                        numberOfLeadingZeros7 = Integer.numberOfLeadingZeros(size2);
                        numberOfLeadingZeros5 = ((352 - numberOfLeadingZeros6) >>> 6) + ((352 - (numberOfLeadingZeros7 * 9)) >>> 6) + size2;
                        i6 += numberOfLeadingZeros5;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = jma.e((List) unsafe.getObject(obj2, t));
                    if (size2 > 0) {
                        numberOfLeadingZeros6 = Integer.numberOfLeadingZeros(n << 3) * 9;
                        numberOfLeadingZeros7 = Integer.numberOfLeadingZeros(size2);
                        numberOfLeadingZeros5 = ((352 - numberOfLeadingZeros6) >>> 6) + ((352 - (numberOfLeadingZeros7 * 9)) >>> 6) + size2;
                        i6 += numberOfLeadingZeros5;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(obj2, t);
                    jlz w2 = jloVar.w(i4);
                    jmj jmjVar19 = jma.a;
                    int size8 = list19.size();
                    if (size8 == 0) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        for (int i17 = 0; i17 < size8; i17++) {
                            i2 += jma.a(n, (jll) list19.get(i17), w2);
                        }
                    }
                    i6 += i2;
                    break;
                case 50:
                    jli jliVar = (jli) unsafe.getObject(obj2, t);
                    ikk ikkVar = (ikk) jloVar.x(i4);
                    if (!jliVar.isEmpty()) {
                        numberOfLeadingZeros4 = 0;
                        for (Map.Entry entry : jliVar.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            int numberOfLeadingZeros10 = Integer.numberOfLeadingZeros(n << 3) * 9;
                            int v = ikk.v((iwq) ikkVar.a, key, value);
                            numberOfLeadingZeros4 += ((352 - numberOfLeadingZeros10) >>> 6) + ((352 - (Integer.numberOfLeadingZeros(v) * 9)) >>> 6) + v;
                        }
                        i6 += numberOfLeadingZeros4;
                        break;
                    }
                    numberOfLeadingZeros4 = 0;
                    i6 += numberOfLeadingZeros4;
                case 51:
                    if (jloVar.P(obj2, n, i4)) {
                        numberOfLeadingZeros8 = Integer.numberOfLeadingZeros(n << 3);
                        c = ((352 - (numberOfLeadingZeros8 * 9)) >>> 6) + 8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (jloVar.P(obj2, n, i4)) {
                        numberOfLeadingZeros9 = Integer.numberOfLeadingZeros(n << 3);
                        c = ((352 - (numberOfLeadingZeros9 * 9)) >>> 6) + 4;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (jloVar.P(obj2, n, i4)) {
                        c = jjz.J(n, u(obj2, t));
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (jloVar.P(obj2, n, i4)) {
                        c = jjz.R(n, u(obj2, t));
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (jloVar.P(obj2, n, i4)) {
                        c = jjz.H(n, o(obj2, t));
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (jloVar.P(obj2, n, i4)) {
                        numberOfLeadingZeros8 = Integer.numberOfLeadingZeros(n << 3);
                        c = ((352 - (numberOfLeadingZeros8 * 9)) >>> 6) + 8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (jloVar.P(obj2, n, i4)) {
                        numberOfLeadingZeros9 = Integer.numberOfLeadingZeros(n << 3);
                        c = ((352 - (numberOfLeadingZeros9 * 9)) >>> 6) + 4;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (jloVar.P(obj2, n, i4)) {
                        c = ((352 - (Integer.numberOfLeadingZeros(n << 3) * 9)) >>> 6) + 1;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (jloVar.P(obj2, n, i4)) {
                        Object object2 = unsafe.getObject(obj2, t);
                        c = object2 instanceof jjq ? jjz.E(n, (jjq) object2) : jjz.O(n, (String) object2);
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (jloVar.P(obj2, n, i4)) {
                        c = jma.c(n, unsafe.getObject(obj2, t), jloVar.w(i4));
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (jloVar.P(obj2, n, i4)) {
                        c = jjz.E(n, (jjq) unsafe.getObject(obj2, t));
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (jloVar.P(obj2, n, i4)) {
                        c = jjz.Q(n, o(obj2, t));
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (jloVar.P(obj2, n, i4)) {
                        c = jjz.G(n, o(obj2, t));
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (jloVar.P(obj2, n, i4)) {
                        numberOfLeadingZeros9 = Integer.numberOfLeadingZeros(n << 3);
                        c = ((352 - (numberOfLeadingZeros9 * 9)) >>> 6) + 4;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (jloVar.P(obj2, n, i4)) {
                        numberOfLeadingZeros8 = Integer.numberOfLeadingZeros(n << 3);
                        c = ((352 - (numberOfLeadingZeros8 * 9)) >>> 6) + 8;
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (jloVar.P(obj2, n, i4)) {
                        c = jjz.M(n, o(obj2, t));
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (jloVar.P(obj2, n, i4)) {
                        c = jjz.N(n, u(obj2, t));
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (jloVar.P(obj2, n, i4)) {
                        c = jma.a(n, (jll) unsafe.getObject(obj2, t), jloVar.w(i4));
                        i6 += c;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            obj2 = obj;
        }
    }

    @Override // defpackage.jlz
    public final int b(Object obj) {
        int i;
        int i2 = 0;
        for (int i3 = 0; i3 < this.c.length; i3 += 3) {
            int s = s(i3);
            int i4 = (s >>> 20) & 255;
            if (i4 <= 50 || i4 >= 69) {
                long t = t(s);
                int i5 = 37;
                switch (i4) {
                    case 0:
                        i = i2 * 53;
                        i5 = jky.a(Double.doubleToLongBits(jmp.a(obj, t)));
                        i2 = i + i5;
                        break;
                    case 1:
                        i = i2 * 53;
                        i5 = Float.floatToIntBits(jmp.b(obj, t));
                        i2 = i + i5;
                        break;
                    case 2:
                        i = i2 * 53;
                        i5 = jky.a(jmp.d(obj, t));
                        i2 = i + i5;
                        break;
                    case 3:
                        i = i2 * 53;
                        i5 = jky.a(jmp.d(obj, t));
                        i2 = i + i5;
                        break;
                    case 4:
                        i = i2 * 53;
                        i5 = jmp.c(obj, t);
                        i2 = i + i5;
                        break;
                    case 5:
                        i = i2 * 53;
                        i5 = jky.a(jmp.d(obj, t));
                        i2 = i + i5;
                        break;
                    case 6:
                        i = i2 * 53;
                        i5 = jmp.c(obj, t);
                        i2 = i + i5;
                        break;
                    case 7:
                        i = i2 * 53;
                        boolean s2 = jmp.s(obj, t);
                        byte[] bArr = jky.a;
                        i5 = a.m(s2);
                        i2 = i + i5;
                        break;
                    case 8:
                        i = i2 * 53;
                        i5 = ((String) jmp.f(obj, t)).hashCode();
                        i2 = i + i5;
                        break;
                    case 9:
                        i = i2 * 53;
                        Object f = jmp.f(obj, t);
                        if (f != null) {
                            i5 = f.hashCode();
                        }
                        i2 = i + i5;
                        break;
                    case 10:
                        i = i2 * 53;
                        i5 = jmp.f(obj, t).hashCode();
                        i2 = i + i5;
                        break;
                    case 11:
                        i = i2 * 53;
                        i5 = jmp.c(obj, t);
                        i2 = i + i5;
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        i = i2 * 53;
                        i5 = jmp.c(obj, t);
                        i2 = i + i5;
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        i = i2 * 53;
                        i5 = jmp.c(obj, t);
                        i2 = i + i5;
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        i = i2 * 53;
                        i5 = jky.a(jmp.d(obj, t));
                        i2 = i + i5;
                        break;
                    case 15:
                        i = i2 * 53;
                        i5 = jmp.c(obj, t);
                        i2 = i + i5;
                        break;
                    case 16:
                        i = i2 * 53;
                        i5 = jky.a(jmp.d(obj, t));
                        i2 = i + i5;
                        break;
                    case 17:
                        i = i2 * 53;
                        Object f2 = jmp.f(obj, t);
                        if (f2 != null) {
                            i5 = f2.hashCode();
                        }
                        i2 = i + i5;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i = i2 * 53;
                        i5 = jmp.f(obj, t).hashCode();
                        i2 = i + i5;
                        break;
                    case 50:
                        i = i2 * 53;
                        i5 = jmp.f(obj, t).hashCode();
                        i2 = i + i5;
                        break;
                }
            }
        }
        int i6 = this.l;
        while (true) {
            int[] iArr = this.j;
            if (i6 >= iArr.length) {
                int hashCode = (i2 * 53) + jmj.d(obj).hashCode();
                return this.h ? (hashCode * 53) + ils.a(obj).hashCode() : hashCode;
            }
            int i7 = iArr[i6];
            if (!P(obj, 0, i7)) {
                i2 = (i2 * 53) + jmp.f(obj, t(s(i7))).hashCode();
            }
            i6++;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int c(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, defpackage.jje r41) {
        /*
            Method dump skipped, instructions count: 4062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlo.c(java.lang.Object, byte[], int, int, int, jje):int");
    }

    @Override // defpackage.jlz
    public final Object e() {
        return ((jkp) this.g).p();
    }

    @Override // defpackage.jlz
    public final void g(Object obj) {
        if (N(obj)) {
            if (obj instanceof jkp) {
                jkp jkpVar = (jkp) obj;
                jkpVar.J(Integer.MAX_VALUE);
                jkpVar.r = 0;
                jkpVar.H();
            }
            int[] iArr = this.c;
            for (int i = 0; i < iArr.length; i += 3) {
                int s = s(i);
                long t = t(s);
                int i2 = (s >>> 20) & 255;
                if (i2 != 9) {
                    if (i2 != 60 && i2 != 68) {
                        switch (i2) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ilw.a(obj, t).b();
                                break;
                            case 50:
                                Unsafe unsafe = b;
                                Object object = unsafe.getObject(obj, t);
                                if (object != null) {
                                    ((jli) object).c();
                                    unsafe.putObject(obj, t, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (P(obj, n(i), i)) {
                        w(i).g(b.getObject(obj, t));
                    }
                }
                if (K(obj, i)) {
                    w(i).g(b.getObject(obj, t));
                }
            }
            jmj.g(obj);
            if (this.h) {
                ils.d(obj);
            }
        }
    }

    @Override // defpackage.jlz
    public final void h(Object obj, Object obj2) {
        A(obj);
        obj2.getClass();
        for (int i = 0; i < this.c.length; i += 3) {
            int s = s(i);
            long t = t(s);
            int n = n(i);
            switch ((s >>> 20) & 255) {
                case 0:
                    if (K(obj2, i)) {
                        jmp.m(obj, t, jmp.a(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (K(obj2, i)) {
                        jmp.n(obj, t, jmp.b(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (K(obj2, i)) {
                        jmp.p(obj, t, jmp.d(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (K(obj2, i)) {
                        jmp.p(obj, t, jmp.d(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (K(obj2, i)) {
                        jmp.o(obj, t, jmp.c(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (K(obj2, i)) {
                        jmp.p(obj, t, jmp.d(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (K(obj2, i)) {
                        jmp.o(obj, t, jmp.c(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (K(obj2, i)) {
                        jmp.j(obj, t, jmp.s(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (K(obj2, i)) {
                        jmp.q(obj, t, jmp.f(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    B(obj, obj2, i);
                    break;
                case 10:
                    if (K(obj2, i)) {
                        jmp.q(obj, t, jmp.f(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (K(obj2, i)) {
                        jmp.o(obj, t, jmp.c(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    if (K(obj2, i)) {
                        jmp.o(obj, t, jmp.c(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    if (K(obj2, i)) {
                        jmp.o(obj, t, jmp.c(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    if (K(obj2, i)) {
                        jmp.p(obj, t, jmp.d(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (K(obj2, i)) {
                        jmp.o(obj, t, jmp.c(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (K(obj2, i)) {
                        jmp.p(obj, t, jmp.d(obj2, t));
                        E(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    B(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    jkx a2 = ilw.a(obj, t);
                    jkx a3 = ilw.a(obj2, t);
                    int size = a2.size();
                    int size2 = a3.size();
                    if (size > 0 && size2 > 0) {
                        if (!a2.c()) {
                            a2 = a2.d(size2 + size);
                        }
                        a2.addAll(a3);
                    }
                    if (size > 0) {
                        a3 = a2;
                    }
                    jmp.q(obj, t, a3);
                    break;
                case 50:
                    jmj jmjVar = jma.a;
                    jmp.q(obj, t, ily.a(jmp.f(obj, t), jmp.f(obj2, t)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (P(obj2, n, i)) {
                        jmp.q(obj, t, jmp.f(obj2, t));
                        F(obj, n, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    C(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (P(obj2, n, i)) {
                        jmp.q(obj, t, jmp.f(obj2, t));
                        F(obj, n, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    C(obj, obj2, i);
                    break;
            }
        }
        jma.n(obj, obj2);
        if (this.h) {
            jma.m(obj, obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0789 A[Catch: all -> 0x0785, TRY_ENTER, TryCatch #0 {all -> 0x0785, blocks: (B:3:0x0011, B:376:0x0035, B:394:0x0045, B:395:0x0049, B:397:0x0051, B:398:0x0059, B:404:0x0167, B:409:0x0194, B:411:0x0178, B:413:0x0182, B:415:0x005f, B:417:0x0069, B:419:0x0073, B:421:0x007d, B:400:0x0087, B:401:0x008e, B:423:0x008f, B:425:0x0099, B:456:0x009f, B:459:0x00ac, B:461:0x00bb, B:462:0x00c8, B:465:0x00cd, B:427:0x00d9, B:430:0x00e6, B:432:0x00f5, B:433:0x0102, B:436:0x0107, B:438:0x011b, B:440:0x0120, B:442:0x0129, B:444:0x0132, B:446:0x013b, B:448:0x0144, B:450:0x014d, B:452:0x0156, B:454:0x015f, B:467:0x019d, B:468:0x01a0, B:382:0x01a3, B:383:0x01a7, B:469:0x003b, B:7:0x01be, B:362:0x01cd, B:363:0x076d, B:134:0x0789, B:135:0x078e, B:11:0x01d3, B:15:0x01e5, B:18:0x01f9, B:21:0x020d, B:24:0x0221, B:27:0x0235, B:29:0x023f, B:36:0x0246, B:33:0x024c, B:40:0x025c, B:43:0x0270, B:46:0x0280, B:49:0x0292, B:52:0x029a, B:55:0x02ae, B:58:0x02c2, B:61:0x02d6, B:64:0x02ea, B:67:0x02fe, B:70:0x0312, B:73:0x0326, B:76:0x033a, B:78:0x034c, B:79:0x0365, B:81:0x0381, B:126:0x03e1, B:118:0x03ee, B:119:0x03f5, B:148:0x0354, B:150:0x035a, B:152:0x03f9, B:154:0x040b, B:156:0x041d, B:158:0x0421, B:161:0x0429, B:167:0x042d, B:168:0x0432, B:170:0x0433, B:173:0x0440, B:176:0x044d, B:179:0x045a, B:182:0x0467, B:185:0x047c, B:188:0x0489, B:191:0x0496, B:194:0x04a3, B:197:0x04b0, B:200:0x04bd, B:203:0x04ca, B:206:0x04d7, B:209:0x04e4, B:212:0x04f1, B:215:0x04fe, B:218:0x050b, B:221:0x0518, B:224:0x0525, B:227:0x053a, B:230:0x0547, B:232:0x0555, B:234:0x0567, B:237:0x0571, B:242:0x0575, B:243:0x057a, B:245:0x057b, B:247:0x058d, B:249:0x059f, B:251:0x05a3, B:254:0x05ab, B:260:0x05af, B:261:0x05b4, B:263:0x05b5, B:269:0x05bb, B:266:0x05c8, B:272:0x05d6, B:275:0x05e3, B:278:0x05f0, B:281:0x05fd, B:284:0x060a, B:287:0x0617, B:290:0x0624, B:293:0x0631, B:296:0x063e, B:299:0x0650, B:302:0x0660, B:305:0x0670, B:308:0x0680, B:311:0x0690, B:313:0x069a, B:320:0x06a1, B:317:0x06a7, B:324:0x06b3, B:327:0x06c3, B:330:0x06d3, B:333:0x06e5, B:336:0x06ed, B:339:0x06fd, B:342:0x070d, B:345:0x071d, B:348:0x072d, B:351:0x073d, B:354:0x074d, B:357:0x075d), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0795 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0173  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // defpackage.jlz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Object obj, jjv jjvVar, jkd jkdVar) {
        Object t;
        int ordinal;
        Object j;
        Object obj2;
        Object obj3;
        jkdVar.getClass();
        A(obj);
        ?? r10 = 0;
        Object obj4 = null;
        jkf jkfVar = null;
        while (true) {
            try {
                int c = jjvVar.c();
                int p = p(c);
                jmj jmjVar = this.m;
                int i = Integer.MAX_VALUE;
                if (p >= 0) {
                    int s = s(p);
                    switch ((s >>> 20) & 255) {
                        case 0:
                            jmp.m(obj, t(s), jjvVar.a());
                            E(obj, p);
                        case 1:
                            jmp.n(obj, t(s), jjvVar.b());
                            E(obj, p);
                        case 2:
                            jmp.p(obj, t(s), jjvVar.k());
                            E(obj, p);
                        case 3:
                            jmp.p(obj, t(s), jjvVar.n());
                            E(obj, p);
                        case 4:
                            jmp.o(obj, t(s), jjvVar.f());
                            E(obj, p);
                        case 5:
                            jmp.p(obj, t(s), jjvVar.j());
                            E(obj, p);
                        case 6:
                            jmp.o(obj, t(s), jjvVar.e());
                            E(obj, p);
                        case 7:
                            jmp.j(obj, t(s), jjvVar.O());
                            E(obj, p);
                        case 8:
                            D(obj, s, jjvVar);
                            E(obj, p);
                        case 9:
                            jll jllVar = (jll) y(obj, p);
                            jjvVar.x(jllVar, w(p), jkdVar);
                            G(obj, p, jllVar);
                        case 10:
                            jmp.q(obj, t(s), jjvVar.o());
                            E(obj, p);
                        case 11:
                            jmp.o(obj, t(s), jjvVar.i());
                            E(obj, p);
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            int d = jjvVar.d();
                            jks v = v(p);
                            if (v != null && !v.a(d)) {
                                obj4 = jma.o(obj, c, d, obj4);
                            }
                            jmp.o(obj, t(s), d);
                            E(obj, p);
                            break;
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            jmp.o(obj, t(s), jjvVar.g());
                            E(obj, p);
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            jmp.p(obj, t(s), jjvVar.l());
                            E(obj, p);
                        case 15:
                            jmp.o(obj, t(s), jjvVar.h());
                            E(obj, p);
                        case 16:
                            jmp.p(obj, t(s), jjvVar.m());
                            E(obj, p);
                        case 17:
                            jll jllVar2 = (jll) y(obj, p);
                            jjvVar.w(jllVar2, w(p), jkdVar);
                            G(obj, p, jllVar2);
                        case 18:
                            jjvVar.z(ilw.b(obj, t(s)));
                        case 19:
                            jjvVar.D(ilw.b(obj, t(s)));
                        case 20:
                            jjvVar.F(ilw.b(obj, t(s)));
                        case 21:
                            jjvVar.M(ilw.b(obj, t(s)));
                        case 22:
                            jjvVar.E(ilw.b(obj, t(s)));
                        case 23:
                            jjvVar.C(ilw.b(obj, t(s)));
                        case 24:
                            jjvVar.B(ilw.b(obj, t(s)));
                        case 25:
                            jjvVar.y(ilw.b(obj, t(s)));
                        case 26:
                            if (J(s)) {
                                jjvVar.K(ilw.b(obj, t(s)), true);
                            } else {
                                jjvVar.K(ilw.b(obj, t(s)), false);
                            }
                        case 27:
                            jlz w = w(p);
                            List b2 = ilw.b(obj, t(s));
                            int i2 = jjvVar.a;
                            if ((i2 & 7) != 2) {
                                throw new jlc();
                            }
                            while (true) {
                                b2.add(jjvVar.s(w, jkdVar));
                                Object obj5 = jjvVar.d;
                                if (!((jju) obj5).G() && jjvVar.c == 0) {
                                    int q = ((jju) obj5).q();
                                    if (q != i2) {
                                        jjvVar.c = q;
                                    }
                                }
                            }
                            break;
                        case 28:
                            List b3 = ilw.b(obj, t(s));
                            if ((jjvVar.a & 7) != 2) {
                                throw new jlc();
                            }
                            while (true) {
                                b3.add(jjvVar.o());
                                Object obj6 = jjvVar.d;
                                if (((jju) obj6).G()) {
                                    break;
                                }
                                int q2 = ((jju) obj6).q();
                                if (q2 != jjvVar.a) {
                                    jjvVar.c = q2;
                                }
                            }
                            break;
                        case 29:
                            jjvVar.L(ilw.b(obj, t(s)));
                        case 30:
                            List b4 = ilw.b(obj, t(s));
                            jjvVar.A(b4);
                            obj4 = jma.g(obj, c, b4, v(p), obj4, jmjVar);
                        case 31:
                            jjvVar.G(ilw.b(obj, t(s)));
                        case 32:
                            jjvVar.H(ilw.b(obj, t(s)));
                        case 33:
                            jjvVar.I(ilw.b(obj, t(s)));
                        case 34:
                            jjvVar.J(ilw.b(obj, t(s)));
                        case 35:
                            jjvVar.z(ilw.b(obj, t(s)));
                        case 36:
                            jjvVar.D(ilw.b(obj, t(s)));
                        case 37:
                            jjvVar.F(ilw.b(obj, t(s)));
                        case 38:
                            jjvVar.M(ilw.b(obj, t(s)));
                        case 39:
                            jjvVar.E(ilw.b(obj, t(s)));
                        case 40:
                            jjvVar.C(ilw.b(obj, t(s)));
                        case 41:
                            jjvVar.B(ilw.b(obj, t(s)));
                        case 42:
                            jjvVar.y(ilw.b(obj, t(s)));
                        case 43:
                            jjvVar.L(ilw.b(obj, t(s)));
                        case 44:
                            List b5 = ilw.b(obj, t(s));
                            jjvVar.A(b5);
                            obj4 = jma.g(obj, c, b5, v(p), obj4, jmjVar);
                        case 45:
                            jjvVar.G(ilw.b(obj, t(s)));
                        case 46:
                            jjvVar.H(ilw.b(obj, t(s)));
                        case 47:
                            jjvVar.I(ilw.b(obj, t(s)));
                        case 48:
                            jjvVar.J(ilw.b(obj, t(s)));
                        case 49:
                            long t2 = t(s);
                            jlz w2 = w(p);
                            List b6 = ilw.b(obj, t2);
                            int i3 = jjvVar.a;
                            if ((i3 & 7) != 3) {
                                throw new jlc();
                            }
                            while (true) {
                                b6.add(jjvVar.r(w2, jkdVar));
                                Object obj7 = jjvVar.d;
                                if (!((jju) obj7).G() && jjvVar.c == 0) {
                                    int q3 = ((jju) obj7).q();
                                    if (q3 != i3) {
                                        jjvVar.c = q3;
                                    }
                                }
                            }
                            break;
                        case 50:
                            Object x = x(p);
                            long t3 = t(s(p));
                            Object f = jmp.f(obj, t3);
                            if (f == null) {
                                f = ily.c();
                                jmp.q(obj, t3, f);
                            } else if (ily.b(f)) {
                                Object c2 = ily.c();
                                ily.a(c2, f);
                                jmp.q(obj, t3, c2);
                                f = c2;
                            }
                            jli jliVar = (jli) f;
                            iwq d2 = ily.d(x);
                            jjvVar.N(2);
                            Object obj8 = jjvVar.d;
                            int f2 = ((jju) obj8).f(((jju) obj8).r());
                            Object obj9 = d2.c;
                            try {
                                Object obj10 = d2.a;
                                Object obj11 = obj9;
                                Object obj12 = obj10;
                                while (true) {
                                    try {
                                        int c3 = jjvVar.c();
                                        if (c3 == i) {
                                            r10 = 0;
                                            obj2 = obj11;
                                            obj3 = obj12;
                                        } else if (((jju) obj8).G()) {
                                            obj2 = obj11;
                                            obj3 = obj12;
                                            r10 = 0;
                                        } else {
                                            if (c3 == 1) {
                                                obj11 = jjvVar.q((jmr) d2.d, null, null);
                                            } else if (c3 != 2) {
                                                try {
                                                    if (!jjvVar.P()) {
                                                        throw new jld("Unable to parse map entry.");
                                                        break;
                                                    }
                                                } catch (jlc e) {
                                                    if (!jjvVar.P()) {
                                                        throw new jld(e, null);
                                                    }
                                                }
                                            } else {
                                                obj12 = jjvVar.q((jmr) d2.b, obj10.getClass(), jkdVar);
                                            }
                                            i = Integer.MAX_VALUE;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                    }
                                }
                            } catch (jlc unused) {
                                r10 = 0;
                                if (obj4 == null) {
                                    obj4 = jmj.f(obj);
                                }
                                if (jmjVar.a(obj4, jjvVar, 0)) {
                                    if (obj4 != null) {
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            try {
                                jliVar.put(obj2, obj3);
                                ((jju) jjvVar.d).E(f2);
                            } catch (Throwable th2) {
                                th = th2;
                                ((jju) jjvVar.d).E(f2);
                                throw th;
                            }
                        case 51:
                            jmp.q(obj, t(s), Double.valueOf(jjvVar.a()));
                            F(obj, c, p);
                        case 52:
                            jmp.q(obj, t(s), Float.valueOf(jjvVar.b()));
                            F(obj, c, p);
                        case 53:
                            jmp.q(obj, t(s), Long.valueOf(jjvVar.k()));
                            F(obj, c, p);
                        case 54:
                            jmp.q(obj, t(s), Long.valueOf(jjvVar.n()));
                            F(obj, c, p);
                        case 55:
                            jmp.q(obj, t(s), Integer.valueOf(jjvVar.f()));
                            F(obj, c, p);
                        case 56:
                            jmp.q(obj, t(s), Long.valueOf(jjvVar.j()));
                            F(obj, c, p);
                        case 57:
                            jmp.q(obj, t(s), Integer.valueOf(jjvVar.e()));
                            F(obj, c, p);
                        case 58:
                            jmp.q(obj, t(s), Boolean.valueOf(jjvVar.O()));
                            F(obj, c, p);
                        case 59:
                            D(obj, s, jjvVar);
                            F(obj, c, p);
                        case 60:
                            jll jllVar3 = (jll) z(obj, c, p);
                            jjvVar.x(jllVar3, w(p), jkdVar);
                            H(obj, c, p, jllVar3);
                        case 61:
                            jmp.q(obj, t(s), jjvVar.o());
                            F(obj, c, p);
                        case 62:
                            jmp.q(obj, t(s), Integer.valueOf(jjvVar.i()));
                            F(obj, c, p);
                        case 63:
                            int d3 = jjvVar.d();
                            jks v2 = v(p);
                            if (v2 != null && !v2.a(d3)) {
                                obj4 = jma.o(obj, c, d3, obj4);
                            }
                            jmp.q(obj, t(s), Integer.valueOf(d3));
                            F(obj, c, p);
                            break;
                        case 64:
                            jmp.q(obj, t(s), Integer.valueOf(jjvVar.g()));
                            F(obj, c, p);
                        case 65:
                            jmp.q(obj, t(s), Long.valueOf(jjvVar.l()));
                            F(obj, c, p);
                        case 66:
                            jmp.q(obj, t(s), Integer.valueOf(jjvVar.h()));
                            F(obj, c, p);
                        case 67:
                            jmp.q(obj, t(s), Long.valueOf(jjvVar.m()));
                            F(obj, c, p);
                        case 68:
                            jll jllVar4 = (jll) z(obj, c, p);
                            jjvVar.w(jllVar4, w(p), jkdVar);
                            H(obj, c, p, jllVar4);
                        default:
                            if (obj4 == null) {
                                try {
                                    obj4 = jmj.f(obj);
                                } catch (jlc unused2) {
                                    if (obj4 == null) {
                                    }
                                    if (jmjVar.a(obj4, jjvVar, 0)) {
                                    }
                                }
                            }
                            if (!jmjVar.a(obj4, jjvVar, 0)) {
                                for (int i4 = this.k; i4 < this.l; i4++) {
                                    obj4 = S(obj, this.j[i4], obj4, obj);
                                }
                                break;
                            }
                            break;
                    }
                } else if (c == Integer.MAX_VALUE) {
                    for (int i5 = this.k; i5 < this.l; i5++) {
                        obj4 = S(obj, this.j[i5], obj4, obj);
                    }
                } else {
                    iwq b7 = !this.h ? r10 : jkdVar.b(this.g, c);
                    if (b7 != null) {
                        if (jkfVar == null) {
                            jkfVar = ils.b(obj);
                        }
                        if (b7.b() == jmr.ENUM) {
                            jjvVar.f();
                            throw r10;
                        }
                        switch (b7.b().ordinal()) {
                            case 0:
                                t = Double.valueOf(jjvVar.a());
                                ordinal = b7.b().ordinal();
                                if ((ordinal != 9 || ordinal == 10) && (j = jkfVar.j((jko) b7.c)) != null) {
                                    byte[] bArr = jky.a;
                                    t = ((jll) j).C().d((jll) t).r();
                                }
                                jkfVar.k((jko) b7.c, t);
                                break;
                            case 1:
                                t = Float.valueOf(jjvVar.b());
                                ordinal = b7.b().ordinal();
                                if (ordinal != 9) {
                                    break;
                                }
                                byte[] bArr2 = jky.a;
                                t = ((jll) j).C().d((jll) t).r();
                                jkfVar.k((jko) b7.c, t);
                                break;
                            case 2:
                                t = Long.valueOf(jjvVar.k());
                                ordinal = b7.b().ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr22 = jky.a;
                                t = ((jll) j).C().d((jll) t).r();
                                jkfVar.k((jko) b7.c, t);
                                break;
                            case 3:
                                t = Long.valueOf(jjvVar.n());
                                ordinal = b7.b().ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr222 = jky.a;
                                t = ((jll) j).C().d((jll) t).r();
                                jkfVar.k((jko) b7.c, t);
                                break;
                            case 4:
                                t = Integer.valueOf(jjvVar.f());
                                ordinal = b7.b().ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr2222 = jky.a;
                                t = ((jll) j).C().d((jll) t).r();
                                jkfVar.k((jko) b7.c, t);
                                break;
                            case 5:
                                t = Long.valueOf(jjvVar.j());
                                ordinal = b7.b().ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr22222 = jky.a;
                                t = ((jll) j).C().d((jll) t).r();
                                jkfVar.k((jko) b7.c, t);
                                break;
                            case 6:
                                t = Integer.valueOf(jjvVar.e());
                                ordinal = b7.b().ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr222222 = jky.a;
                                t = ((jll) j).C().d((jll) t).r();
                                jkfVar.k((jko) b7.c, t);
                                break;
                            case 7:
                                t = Boolean.valueOf(jjvVar.O());
                                ordinal = b7.b().ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr2222222 = jky.a;
                                t = ((jll) j).C().d((jll) t).r();
                                jkfVar.k((jko) b7.c, t);
                                break;
                            case 8:
                                t = jjvVar.u();
                                ordinal = b7.b().ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr22222222 = jky.a;
                                t = ((jll) j).C().d((jll) t).r();
                                jkfVar.k((jko) b7.c, t);
                                break;
                            case 9:
                                Object obj13 = b7.c;
                                Object j2 = jkfVar.j((jko) obj13);
                                if (j2 instanceof jkp) {
                                    jkp jkpVar = (jkp) j2;
                                    jlz a2 = jlt.a.a(jkpVar);
                                    if (!jkpVar.M()) {
                                        Object e2 = a2.e();
                                        a2.h(e2, j2);
                                        jkfVar.k((jko) obj13, e2);
                                        j2 = e2;
                                    }
                                    jjvVar.w(j2, a2, jkdVar);
                                    break;
                                } else {
                                    Class<?> cls = b7.a.getClass();
                                    jjvVar.N(3);
                                    t = jjvVar.r(jlt.a.b(cls), jkdVar);
                                    ordinal = b7.b().ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222 = jky.a;
                                    t = ((jll) j).C().d((jll) t).r();
                                    jkfVar.k((jko) b7.c, t);
                                    break;
                                }
                                break;
                            case 10:
                                Object obj14 = b7.c;
                                Object j3 = jkfVar.j((jko) obj14);
                                if (j3 instanceof jkp) {
                                    jkp jkpVar2 = (jkp) j3;
                                    jlz a3 = jlt.a.a(jkpVar2);
                                    if (!jkpVar2.M()) {
                                        Object e3 = a3.e();
                                        a3.h(e3, j3);
                                        jkfVar.k((jko) obj14, e3);
                                        j3 = e3;
                                    }
                                    jjvVar.x(j3, a3, jkdVar);
                                    break;
                                } else {
                                    t = jjvVar.t(b7.a.getClass(), jkdVar);
                                    ordinal = b7.b().ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222222 = jky.a;
                                    t = ((jll) j).C().d((jll) t).r();
                                    jkfVar.k((jko) b7.c, t);
                                    break;
                                }
                                break;
                            case 11:
                                t = jjvVar.o();
                                ordinal = b7.b().ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr22222222222 = jky.a;
                                t = ((jll) j).C().d((jll) t).r();
                                jkfVar.k((jko) b7.c, t);
                                break;
                            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                                t = Integer.valueOf(jjvVar.i());
                                ordinal = b7.b().ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr222222222222 = jky.a;
                                t = ((jll) j).C().d((jll) t).r();
                                jkfVar.k((jko) b7.c, t);
                                break;
                            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                                throw new IllegalStateException("Shouldn't reach here.");
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                t = Integer.valueOf(jjvVar.g());
                                ordinal = b7.b().ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr2222222222222 = jky.a;
                                t = ((jll) j).C().d((jll) t).r();
                                jkfVar.k((jko) b7.c, t);
                                break;
                            case 15:
                                t = Long.valueOf(jjvVar.l());
                                ordinal = b7.b().ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr22222222222222 = jky.a;
                                t = ((jll) j).C().d((jll) t).r();
                                jkfVar.k((jko) b7.c, t);
                                break;
                            case 16:
                                t = Integer.valueOf(jjvVar.h());
                                ordinal = b7.b().ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr222222222222222 = jky.a;
                                t = ((jll) j).C().d((jll) t).r();
                                jkfVar.k((jko) b7.c, t);
                                break;
                            case 17:
                                t = Long.valueOf(jjvVar.m());
                                ordinal = b7.b().ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr2222222222222222 = jky.a;
                                t = ((jll) j).C().d((jll) t).r();
                                jkfVar.k((jko) b7.c, t);
                                break;
                            default:
                                t = r10;
                                ordinal = b7.b().ordinal();
                                if (ordinal != 9) {
                                }
                                byte[] bArr22222222222222222 = jky.a;
                                t = ((jll) j).C().d((jll) t).r();
                                jkfVar.k((jko) b7.c, t);
                                break;
                        }
                    } else {
                        if (obj4 == null) {
                            obj4 = jmj.f(obj);
                        }
                        if (!jmjVar.a(obj4, jjvVar, 0)) {
                            for (int i6 = this.k; i6 < this.l; i6++) {
                                obj4 = S(obj, this.j[i6], obj4, obj);
                            }
                        }
                    }
                }
            } finally {
                for (int i7 = this.k; i7 < this.l; i7++) {
                    obj4 = S(obj, this.j[i7], obj4, obj);
                }
                if (obj4 != null) {
                    jmj.e(obj, (jmk) obj4);
                }
            }
        }
    }

    @Override // defpackage.jlz
    public final void j(Object obj, byte[] bArr, int i, int i2, jje jjeVar) {
        c(obj, bArr, i, i2, 0, jjeVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x01c1, code lost:
    
        continue;
     */
    @Override // defpackage.jlz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(Object obj, Object obj2) {
        boolean h;
        for (int i = 0; i < this.c.length; i += 3) {
            int s = s(i);
            int i2 = (s >>> 20) & 255;
            if (i2 <= 50 || i2 >= 69) {
                long t = t(s);
                switch (i2) {
                    case 0:
                        if (I(obj, obj2, i) && Double.doubleToLongBits(jmp.a(obj, t)) == Double.doubleToLongBits(jmp.a(obj2, t))) {
                            continue;
                        }
                        return false;
                    case 1:
                        if (I(obj, obj2, i) && Float.floatToIntBits(jmp.b(obj, t)) == Float.floatToIntBits(jmp.b(obj2, t))) {
                            continue;
                        }
                        return false;
                    case 2:
                        if (I(obj, obj2, i) && jmp.d(obj, t) == jmp.d(obj2, t)) {
                            continue;
                        }
                        return false;
                    case 3:
                        if (I(obj, obj2, i) && jmp.d(obj, t) == jmp.d(obj2, t)) {
                            continue;
                        }
                        return false;
                    case 4:
                        if (I(obj, obj2, i) && jmp.c(obj, t) == jmp.c(obj2, t)) {
                            continue;
                        }
                        return false;
                    case 5:
                        if (I(obj, obj2, i) && jmp.d(obj, t) == jmp.d(obj2, t)) {
                            continue;
                        }
                        return false;
                    case 6:
                        if (I(obj, obj2, i) && jmp.c(obj, t) == jmp.c(obj2, t)) {
                            continue;
                        }
                        return false;
                    case 7:
                        if (I(obj, obj2, i) && jmp.s(obj, t) == jmp.s(obj2, t)) {
                            continue;
                        }
                        return false;
                    case 8:
                        if (I(obj, obj2, i) && jma.h(jmp.f(obj, t), jmp.f(obj2, t))) {
                            continue;
                        }
                        return false;
                    case 9:
                        if (I(obj, obj2, i) && jma.h(jmp.f(obj, t), jmp.f(obj2, t))) {
                            continue;
                        }
                        return false;
                    case 10:
                        if (I(obj, obj2, i) && jma.h(jmp.f(obj, t), jmp.f(obj2, t))) {
                            continue;
                        }
                        return false;
                    case 11:
                        if (I(obj, obj2, i) && jmp.c(obj, t) == jmp.c(obj2, t)) {
                            continue;
                        }
                        return false;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        if (I(obj, obj2, i) && jmp.c(obj, t) == jmp.c(obj2, t)) {
                            continue;
                        }
                        return false;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        if (I(obj, obj2, i) && jmp.c(obj, t) == jmp.c(obj2, t)) {
                            continue;
                        }
                        return false;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        if (I(obj, obj2, i) && jmp.d(obj, t) == jmp.d(obj2, t)) {
                            continue;
                        }
                        return false;
                    case 15:
                        if (I(obj, obj2, i) && jmp.c(obj, t) == jmp.c(obj2, t)) {
                            continue;
                        }
                        return false;
                    case 16:
                        if (I(obj, obj2, i) && jmp.d(obj, t) == jmp.d(obj2, t)) {
                            continue;
                        }
                        return false;
                    case 17:
                        if (I(obj, obj2, i) && jma.h(jmp.f(obj, t), jmp.f(obj2, t))) {
                            continue;
                        }
                        return false;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        h = jma.h(jmp.f(obj, t), jmp.f(obj2, t));
                        break;
                    case 50:
                        h = jma.h(jmp.f(obj, t), jmp.f(obj2, t));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        if (O(obj, obj2, i) && jma.h(jmp.f(obj, t), jmp.f(obj2, t))) {
                            continue;
                        }
                        return false;
                }
                if (!h) {
                    return false;
                }
            }
        }
        int i3 = this.l;
        while (true) {
            int[] iArr = this.j;
            if (i3 >= iArr.length) {
                if (!jmj.d(obj).equals(jmj.d(obj2))) {
                    return false;
                }
                if (this.h) {
                    return ils.a(obj).equals(ils.a(obj2));
                }
                return true;
            }
            int i4 = iArr[i3];
            if (!O(obj, obj2, i4)) {
                return false;
            }
            if (!P(obj, 0, i4)) {
                long t2 = t(s(i4));
                if (!jma.h(jmp.f(obj, t2), jmp.f(obj2, t2))) {
                    return false;
                }
            }
            i3++;
        }
    }

    @Override // defpackage.jlz
    public final boolean l(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.k) {
            int i6 = this.j[i3];
            int s = this.s(i6);
            int i7 = this.c[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i4 = b.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i5;
                i2 = i4;
            }
            jlo jloVar = this;
            Object obj2 = obj;
            if ((268435456 & s) != 0 && !jloVar.L(obj2, i6, i, i2, i9)) {
                return false;
            }
            int i10 = (s >>> 20) & 255;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (jloVar.P(obj2, jloVar.n(i6), i6) && !M(obj2, s, jloVar.w(i6))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 != 50) {
                            continue;
                        } else {
                            jli jliVar = (jli) jmp.f(obj2, t(s));
                            if (jliVar.isEmpty()) {
                                continue;
                            } else {
                                if (((jmr) ily.d(jloVar.x(i6)).b).s == jms.i) {
                                    jlz jlzVar = null;
                                    for (Object obj3 : jliVar.values()) {
                                        if (jlzVar == null) {
                                            jlzVar = jlt.a.b(((jkp) obj3).getClass());
                                        }
                                        if (!jlzVar.l(obj3)) {
                                            return false;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
                List list = (List) jmp.f(obj2, t(s));
                if (list.isEmpty()) {
                    continue;
                } else {
                    jlz w = jloVar.w(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!w.l(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (jloVar.L(obj2, i6, i, i2, i9) && !M(obj2, s, jloVar.w(i6))) {
                return false;
            }
            i3++;
            this = jloVar;
            obj = obj2;
            i5 = i;
            i4 = i2;
        }
        return !this.h || ils.a(obj).h();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:272:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // defpackage.jlz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(Object obj, ikk ikkVar) {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        boolean z;
        Map.Entry entry2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        jlo jloVar = this;
        if (jloVar.h) {
            jkf a2 = ils.a(obj);
            if (!a2.g()) {
                Iterator d = a2.d();
                entry = (Map.Entry) d.next();
                it = d;
                iArr = jloVar.c;
                Unsafe unsafe = b;
                int i7 = 1048575;
                int i8 = 1048575;
                i = 0;
                int i9 = 0;
                while (i < iArr.length) {
                    int s = jloVar.s(i);
                    int n = jloVar.n(i);
                    int i10 = (s >>> 20) & 255;
                    if (i10 <= 17) {
                        int i11 = iArr[i + 2];
                        z = true;
                        int i12 = i11 & i7;
                        if (i12 != i8) {
                            i9 = i12 == i7 ? 0 : unsafe.getInt(obj, i12);
                            i8 = i12;
                        }
                        int i13 = 1 << (i11 >>> 20);
                        entry2 = entry;
                        i2 = i8;
                        i3 = i9;
                        i4 = i13;
                    } else {
                        z = true;
                        entry2 = entry;
                        i2 = i8;
                        i3 = i9;
                        i4 = 0;
                    }
                    while (entry2 != null && ((jko) entry2.getKey()).a <= n) {
                        ils.e(ikkVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long t = t(s);
                    switch (i10) {
                        case 0:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.e(n, jmp.a(obj, t));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.i(n, jmp.b(obj, t));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.l(n, unsafe.getLong(obj, t));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.u(n, unsafe.getLong(obj, t));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.k(n, unsafe.getInt(obj, t));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.h(n, unsafe.getLong(obj, t));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.g(n, unsafe.getInt(obj, t));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.c(n, jmp.s(obj, t));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                T(n, unsafe.getObject(obj, t), ikkVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.m(n, unsafe.getObject(obj, t), jloVar.w(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.d(n, (jjq) unsafe.getObject(obj, t));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.t(n, unsafe.getInt(obj, t));
                                break;
                            } else {
                                break;
                            }
                        case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.f(n, unsafe.getInt(obj, t));
                                break;
                            } else {
                                break;
                            }
                        case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.o(n, unsafe.getInt(obj, t));
                                break;
                            } else {
                                break;
                            }
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.p(n, unsafe.getLong(obj, t));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.q(n, unsafe.getInt(obj, t));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.r(n, unsafe.getLong(obj, t));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (jloVar.L(obj, i, i2, i3, i4)) {
                                ikkVar.j(n, unsafe.getObject(obj, t), jloVar.w(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            i5 = i2;
                            jma.q(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, false);
                            i2 = i5;
                            break;
                        case 19:
                            i5 = i2;
                            jma.r(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, false);
                            i2 = i5;
                            break;
                        case 20:
                            i5 = i2;
                            jma.y(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, false);
                            i2 = i5;
                            break;
                        case 21:
                            i5 = i2;
                            jma.y(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, false);
                            i2 = i5;
                            break;
                        case 22:
                            i5 = i2;
                            jma.v(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, false);
                            i2 = i5;
                            break;
                        case 23:
                            i5 = i2;
                            jma.x(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, false);
                            i2 = i5;
                            break;
                        case 24:
                            i5 = i2;
                            jma.w(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, false);
                            i2 = i5;
                            break;
                        case 25:
                            i5 = i2;
                            jma.p(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, false);
                            i2 = i5;
                            break;
                        case 26:
                            i6 = i2;
                            int n2 = jloVar.n(i);
                            List list = (List) unsafe.getObject(obj, t);
                            jmj jmjVar = jma.a;
                            if (list != null && !list.isEmpty()) {
                                if (list instanceof jlg) {
                                    jlg jlgVar = (jlg) list;
                                    for (int i14 = 0; i14 < list.size(); i14++) {
                                        Object c = jlgVar.c();
                                        if (c instanceof String) {
                                            ((jjz) ikkVar.a).r(n2, (String) c);
                                        } else {
                                            ((jjz) ikkVar.a).g(n2, (jjq) c);
                                        }
                                    }
                                } else {
                                    for (int i15 = 0; i15 < list.size(); i15++) {
                                        ((jjz) ikkVar.a).r(n2, (String) list.get(i15));
                                    }
                                }
                            }
                            i2 = i6;
                            break;
                        case 27:
                            i6 = i2;
                            int n3 = jloVar.n(i);
                            List list2 = (List) unsafe.getObject(obj, t);
                            jlz w = jloVar.w(i);
                            jmj jmjVar2 = jma.a;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i16 = 0; i16 < list2.size(); i16++) {
                                    ikkVar.m(n3, list2.get(i16), w);
                                }
                            }
                            i2 = i6;
                            break;
                        case 28:
                            i6 = i2;
                            int n4 = jloVar.n(i);
                            List list3 = (List) unsafe.getObject(obj, t);
                            jmj jmjVar3 = jma.a;
                            if (list3 != null && !list3.isEmpty()) {
                                for (int i17 = 0; i17 < list3.size(); i17++) {
                                    ((jjz) ikkVar.a).g(n4, (jjq) list3.get(i17));
                                }
                            }
                            i2 = i6;
                            break;
                        case 29:
                            i5 = i2;
                            jma.u(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, false);
                            i2 = i5;
                            break;
                        case 30:
                            i5 = i2;
                            jma.v(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, false);
                            i2 = i5;
                            break;
                        case 31:
                            i5 = i2;
                            jma.w(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, false);
                            i2 = i5;
                            break;
                        case 32:
                            i5 = i2;
                            jma.x(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, false);
                            i2 = i5;
                            break;
                        case 33:
                            i5 = i2;
                            jma.s(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, false);
                            i2 = i5;
                            break;
                        case 34:
                            i5 = i2;
                            jma.t(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, false);
                            i2 = i5;
                            break;
                        case 35:
                            i6 = i2;
                            jma.q(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, z);
                            i2 = i6;
                            break;
                        case 36:
                            i6 = i2;
                            jma.r(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, z);
                            i2 = i6;
                            break;
                        case 37:
                            i6 = i2;
                            jma.y(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, z);
                            i2 = i6;
                            break;
                        case 38:
                            i6 = i2;
                            jma.y(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, z);
                            i2 = i6;
                            break;
                        case 39:
                            i6 = i2;
                            jma.v(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, z);
                            i2 = i6;
                            break;
                        case 40:
                            i6 = i2;
                            jma.x(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, z);
                            i2 = i6;
                            break;
                        case 41:
                            i6 = i2;
                            jma.w(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, z);
                            i2 = i6;
                            break;
                        case 42:
                            i6 = i2;
                            jma.p(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, z);
                            i2 = i6;
                            break;
                        case 43:
                            i6 = i2;
                            jma.u(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, z);
                            i2 = i6;
                            break;
                        case 44:
                            i6 = i2;
                            jma.v(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, z);
                            i2 = i6;
                            break;
                        case 45:
                            i6 = i2;
                            jma.w(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, z);
                            i2 = i6;
                            break;
                        case 46:
                            i6 = i2;
                            jma.x(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, z);
                            i2 = i6;
                            break;
                        case 47:
                            i6 = i2;
                            jma.s(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, z);
                            i2 = i6;
                            break;
                        case 48:
                            i6 = i2;
                            jma.t(jloVar.n(i), (List) unsafe.getObject(obj, t), ikkVar, z);
                            i2 = i6;
                            break;
                        case 49:
                            i6 = i2;
                            int n5 = jloVar.n(i);
                            List list4 = (List) unsafe.getObject(obj, t);
                            jlz w2 = jloVar.w(i);
                            jmj jmjVar4 = jma.a;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i18 = 0; i18 < list4.size(); i18++) {
                                    ikkVar.j(n5, list4.get(i18), w2);
                                }
                            }
                            i2 = i6;
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, t);
                            if (object != null) {
                                iwq d2 = ily.d(jloVar.x(i));
                                Iterator it2 = ((jli) object).entrySet().iterator();
                                while (it2.hasNext()) {
                                    Map.Entry entry3 = (Map.Entry) it2.next();
                                    jjz jjzVar = (jjz) ikkVar.a;
                                    jjzVar.t(n, 2);
                                    jjzVar.v(ikk.v(d2, entry3.getKey(), entry3.getValue()));
                                    ikk.w(jjzVar, d2, entry3.getKey(), entry3.getValue());
                                    i2 = i2;
                                }
                            }
                            break;
                        case 51:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.e(n, ((Double) jmp.f(obj, t)).doubleValue());
                            }
                            break;
                        case 52:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.i(n, ((Float) jmp.f(obj, t)).floatValue());
                            }
                            break;
                        case 53:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.l(n, u(obj, t));
                            }
                            break;
                        case 54:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.u(n, u(obj, t));
                            }
                            break;
                        case 55:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.k(n, o(obj, t));
                            }
                            break;
                        case 56:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.h(n, u(obj, t));
                            }
                            break;
                        case 57:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.g(n, o(obj, t));
                            }
                            break;
                        case 58:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.c(n, ((Boolean) jmp.f(obj, t)).booleanValue());
                            }
                            break;
                        case 59:
                            if (jloVar.P(obj, n, i)) {
                                T(n, unsafe.getObject(obj, t), ikkVar);
                            }
                            break;
                        case 60:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.m(n, unsafe.getObject(obj, t), jloVar.w(i));
                            }
                            break;
                        case 61:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.d(n, (jjq) unsafe.getObject(obj, t));
                            }
                            break;
                        case 62:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.t(n, o(obj, t));
                            }
                            break;
                        case 63:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.f(n, o(obj, t));
                            }
                            break;
                        case 64:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.o(n, o(obj, t));
                            }
                            break;
                        case 65:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.p(n, u(obj, t));
                            }
                            break;
                        case 66:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.q(n, o(obj, t));
                            }
                            break;
                        case 67:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.r(n, u(obj, t));
                            }
                            break;
                        case 68:
                            if (jloVar.P(obj, n, i)) {
                                ikkVar.j(n, unsafe.getObject(obj, t), jloVar.w(i));
                            }
                            break;
                    }
                    i += 3;
                    i7 = 1048575;
                    jloVar = this;
                    i9 = i3;
                    i8 = i2;
                    entry = entry2;
                }
                while (entry != null) {
                    ils.e(ikkVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                jmj.d(obj).f(ikkVar);
            }
        }
        entry = null;
        it = null;
        iArr = jloVar.c;
        Unsafe unsafe2 = b;
        int i72 = 1048575;
        int i82 = 1048575;
        i = 0;
        int i92 = 0;
        while (i < iArr.length) {
        }
        while (entry != null) {
        }
        jmj.d(obj).f(ikkVar);
    }
}
