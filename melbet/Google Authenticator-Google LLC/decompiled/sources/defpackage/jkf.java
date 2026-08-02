package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkf {
    public static final jkf a = new jkf(null);
    final jme b = new jme();
    boolean c;
    boolean d;

    private jkf(byte[] bArr) {
        e();
        e();
    }

    public static int a(jmr jmrVar, int i, Object obj) {
        int numberOfLeadingZeros;
        int numberOfLeadingZeros2;
        int i2;
        int numberOfLeadingZeros3 = (352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        if (jmrVar == jmr.GROUP) {
            numberOfLeadingZeros3 += numberOfLeadingZeros3;
        }
        jms jmsVar = jms.a;
        int i3 = 4;
        switch (jmrVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i3 = 8;
                return numberOfLeadingZeros3 + i3;
            case 1:
                ((Float) obj).floatValue();
                return numberOfLeadingZeros3 + i3;
            case 2:
                numberOfLeadingZeros = Long.numberOfLeadingZeros(((Long) obj).longValue());
                i2 = 640 - (numberOfLeadingZeros * 9);
                i3 = i2 >>> 6;
                return numberOfLeadingZeros3 + i3;
            case 3:
                numberOfLeadingZeros = Long.numberOfLeadingZeros(((Long) obj).longValue());
                i2 = 640 - (numberOfLeadingZeros * 9);
                i3 = i2 >>> 6;
                return numberOfLeadingZeros3 + i3;
            case 4:
                i3 = jjz.I(((Integer) obj).intValue());
                return numberOfLeadingZeros3 + i3;
            case 5:
                ((Long) obj).longValue();
                i3 = 8;
                return numberOfLeadingZeros3 + i3;
            case 6:
                ((Integer) obj).intValue();
                return numberOfLeadingZeros3 + i3;
            case 7:
                ((Boolean) obj).booleanValue();
                i3 = 1;
                return numberOfLeadingZeros3 + i3;
            case 8:
                i3 = obj instanceof jjq ? jjz.F((jjq) obj) : jjz.P((String) obj);
                return numberOfLeadingZeros3 + i3;
            case 9:
                i3 = ((jll) obj).j();
                return numberOfLeadingZeros3 + i3;
            case 10:
                i3 = obj instanceof jlb ? ((jlb) obj).a() : jjz.K((jll) obj);
                return numberOfLeadingZeros3 + i3;
            case 11:
                if (obj instanceof jjq) {
                    i3 = jjz.F((jjq) obj);
                } else {
                    int length = ((byte[]) obj).length;
                    i3 = ((352 - (Integer.numberOfLeadingZeros(length) * 9)) >>> 6) + length;
                }
                return numberOfLeadingZeros3 + i3;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                numberOfLeadingZeros2 = Integer.numberOfLeadingZeros(((Integer) obj).intValue());
                i2 = 352 - (numberOfLeadingZeros2 * 9);
                i3 = i2 >>> 6;
                return numberOfLeadingZeros3 + i3;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                i3 = obj instanceof jkr ? jjz.I(((jkr) obj).a()) : jjz.I(((Integer) obj).intValue());
                return numberOfLeadingZeros3 + i3;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((Integer) obj).intValue();
                return numberOfLeadingZeros3 + i3;
            case 15:
                ((Long) obj).longValue();
                i3 = 8;
                return numberOfLeadingZeros3 + i3;
            case 16:
                int intValue = ((Integer) obj).intValue();
                numberOfLeadingZeros2 = Integer.numberOfLeadingZeros((intValue + intValue) ^ (intValue >> 31));
                i2 = 352 - (numberOfLeadingZeros2 * 9);
                i3 = i2 >>> 6;
                return numberOfLeadingZeros3 + i3;
            case 17:
                long longValue = ((Long) obj).longValue();
                numberOfLeadingZeros = Long.numberOfLeadingZeros((longValue + longValue) ^ (longValue >> 63));
                i2 = 640 - (numberOfLeadingZeros * 9);
                i3 = i2 >>> 6;
                return numberOfLeadingZeros3 + i3;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof jlq) {
            return ((jlq) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public static void f(jjz jjzVar, jmr jmrVar, int i, Object obj) {
        if (jmrVar == jmr.GROUP) {
            jjzVar.t(i, 3);
            ((jll) obj).K(jjzVar);
            jjzVar.t(i, 4);
            return;
        }
        jjzVar.t(i, jmrVar.t);
        jms jmsVar = jms.a;
        switch (jmrVar.ordinal()) {
            case 0:
                jjzVar.V(((Double) obj).doubleValue());
                break;
            case 1:
                jjzVar.X(((Float) obj).floatValue());
                break;
            case 2:
                jjzVar.x(((Long) obj).longValue());
                break;
            case 3:
                jjzVar.x(((Long) obj).longValue());
                break;
            case 4:
                jjzVar.n(((Integer) obj).intValue());
                break;
            case 5:
                jjzVar.l(((Long) obj).longValue());
                break;
            case 6:
                jjzVar.j(((Integer) obj).intValue());
                break;
            case 7:
                jjzVar.d(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof jjq)) {
                    jjzVar.s((String) obj);
                    break;
                } else {
                    jjzVar.h((jjq) obj);
                    break;
                }
            case 9:
                ((jll) obj).K(jjzVar);
                break;
            case 10:
                jjzVar.o((jll) obj);
                break;
            case 11:
                if (!(obj instanceof jjq)) {
                    byte[] bArr = (byte[]) obj;
                    jjzVar.y(bArr, bArr.length);
                    break;
                } else {
                    jjzVar.h((jjq) obj);
                    break;
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                jjzVar.v(((Integer) obj).intValue());
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                if (!(obj instanceof jkr)) {
                    jjzVar.n(((Integer) obj).intValue());
                    break;
                } else {
                    jjzVar.n(((jkr) obj).a());
                    break;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                jjzVar.j(((Integer) obj).intValue());
                break;
            case 15:
                jjzVar.l(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                jjzVar.v((intValue + intValue) ^ (intValue >> 31));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                jjzVar.x((longValue + longValue) ^ (longValue >> 63));
                break;
        }
    }

    public static int i(jko jkoVar, Object obj) {
        return a(jkoVar.b, jkoVar.a, obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jkf clone() {
        jkf jkfVar = new jkf();
        jme jmeVar = this.b;
        int size = jmeVar.size();
        for (int i = 0; i < size; i++) {
            jmb jmbVar = (jmb) jmeVar.a(i);
            jkfVar.k(jmbVar.c, jmbVar.a);
        }
        jkfVar.d = this.d;
        return jkfVar;
    }

    public final Iterator d() {
        if (g()) {
            return Collections.emptyIterator();
        }
        boolean z = this.d;
        jme jmeVar = this.b;
        return z ? new jla(jmeVar.entrySet().iterator()) : jmeVar.entrySet().iterator();
    }

    public final void e() {
        if (this.c) {
            return;
        }
        jme jmeVar = this.b;
        int size = jmeVar.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((jmb) jmeVar.a(i)).a;
            if (obj instanceof jkp) {
                ((jkp) obj).G();
            }
        }
        if (!jmeVar.c) {
            jmeVar.c();
            if (jmeVar.a != null) {
                for (int i2 = 0; i2 < jmeVar.b; i2++) {
                    jko jkoVar = ((jmb) jmeVar.a[i2]).c;
                }
            }
            jmeVar.c = true;
        }
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkf)) {
            return false;
        }
        jme jmeVar = this.b;
        jme jmeVar2 = ((jkf) obj).b;
        if (jmeVar.size() != jmeVar2.size() || !jmeVar.keySet().equals(jmeVar2.keySet())) {
            return false;
        }
        for (Map.Entry entry : jmeVar.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = jmeVar2.get(key);
            if (!(value == obj2 ? true : (value == null || obj2 == null) ? false : value instanceof jlb ? value.equals(obj2) : obj2 instanceof jlb ? obj2.equals(value) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    final boolean g() {
        return this.b.isEmpty();
    }

    public final boolean h() {
        jme jmeVar = this.b;
        int size = jmeVar.size();
        for (int i = 0; i < size; i++) {
            jmb jmbVar = (jmb) jmeVar.a(i);
            if (jmbVar.c.a() == jms.i) {
                Object obj = jmbVar.a;
                if (obj instanceof jlm) {
                    if (!((jlm) obj).u()) {
                        return false;
                    }
                } else if (!(obj instanceof jlb)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final Object j(jko jkoVar) {
        Object obj = this.b.get(jkoVar);
        return obj instanceof jlb ? ((jlb) obj).b() : obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if ((r6 instanceof defpackage.jkr) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if ((r6 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r1 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if ((r6 instanceof defpackage.jlb) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(jko jkoVar, Object obj) {
        boolean z;
        obj.getClass();
        jmr jmrVar = jmr.DOUBLE;
        jms jmsVar = jms.a;
        jms jmsVar2 = jkoVar.b.s;
        switch (jmsVar2.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if (!(obj instanceof jjq)) {
                    break;
                }
                if (obj instanceof jlb) {
                    this.d = true;
                }
                this.b.d(jkoVar, obj);
                return;
            case 7:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof jlb) {
                }
                this.b.d(jkoVar, obj);
                return;
            case 8:
                if (!(obj instanceof jll)) {
                    break;
                }
                if (obj instanceof jlb) {
                }
                this.b.d(jkoVar, obj);
                return;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(jkoVar.a), jmsVar2, obj.getClass().getName()));
        }
    }

    public final boolean l(jko jkoVar) {
        return this.b.get(jkoVar) != null;
    }

    private jkf() {
    }
}
