package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jlp implements jlz {
    private final jll a;
    private final jmj b;
    private final boolean c;

    public jlp(jmj jmjVar, jll jllVar) {
        this.b = jmjVar;
        this.c = jllVar instanceof jkm;
        this.a = jllVar;
    }

    @Override // defpackage.jlz
    public final int a(Object obj) {
        int i;
        int Q;
        int numberOfLeadingZeros;
        int K;
        jmk d = jmj.d(obj);
        int i2 = d.e;
        if (i2 == -1) {
            i2 = 0;
            for (int i3 = 0; i3 < d.b; i3++) {
                int i4 = d.c[i3] >>> 3;
                jjq jjqVar = (jjq) d.d[i3];
                int numberOfLeadingZeros2 = (352 - (Integer.numberOfLeadingZeros(8) * 9)) >>> 6;
                i2 += numberOfLeadingZeros2 + numberOfLeadingZeros2 + jjz.Q(2, i4) + jjz.E(3, jjqVar);
            }
            d.e = i2;
        }
        if (!this.c) {
            return i2;
        }
        jme jmeVar = ils.a(obj).b;
        int size = jmeVar.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            jmb jmbVar = (jmb) jmeVar.a(i6);
            jko jkoVar = jmbVar.c;
            Object obj2 = jmbVar.a;
            if (jkoVar.a() == jms.i) {
                if (obj2 instanceof jlb) {
                    int i7 = jkoVar.a;
                    int numberOfLeadingZeros3 = (352 - (Integer.numberOfLeadingZeros(8) * 9)) >>> 6;
                    Q = numberOfLeadingZeros3 + numberOfLeadingZeros3 + jjz.Q(2, i7);
                    numberOfLeadingZeros = Integer.numberOfLeadingZeros(24) * 9;
                    K = ((jlb) obj2).a();
                } else {
                    int i8 = jkoVar.a;
                    int numberOfLeadingZeros4 = (352 - (Integer.numberOfLeadingZeros(8) * 9)) >>> 6;
                    Q = numberOfLeadingZeros4 + numberOfLeadingZeros4 + jjz.Q(2, i8);
                    numberOfLeadingZeros = Integer.numberOfLeadingZeros(24) * 9;
                    K = jjz.K((jll) obj2);
                }
                i = Q + ((352 - numberOfLeadingZeros) >>> 6) + K;
            } else {
                i = jkf.i(jkoVar, obj2);
            }
            i5 += i;
        }
        return i2 + i5;
    }

    @Override // defpackage.jlz
    public final int b(Object obj) {
        int hashCode = jmj.d(obj).hashCode();
        return this.c ? (hashCode * 53) + ils.a(obj).hashCode() : hashCode;
    }

    @Override // defpackage.jlz
    public final Object e() {
        jll jllVar = this.a;
        return jllVar instanceof jkp ? ((jkp) jllVar).p() : jllVar.B().r();
    }

    @Override // defpackage.jlz
    public final void g(Object obj) {
        jmj.g(obj);
        ils.d(obj);
    }

    @Override // defpackage.jlz
    public final void h(Object obj, Object obj2) {
        jma.n(obj, obj2);
        if (this.c) {
            jma.m(obj, obj2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, jll] */
    @Override // defpackage.jlz
    public final void i(Object obj, jjv jjvVar, jkd jkdVar) {
        jmj jmjVar = this.b;
        jmk f = jmj.f(obj);
        jkf b = ils.b(obj);
        while (jjvVar.c() != Integer.MAX_VALUE) {
            try {
                int i = jjvVar.a;
                boolean z = true;
                if (i == 11) {
                    iwq iwqVar = null;
                    jjq jjqVar = null;
                    int i2 = 0;
                    while (jjvVar.c() != Integer.MAX_VALUE) {
                        int i3 = jjvVar.a;
                        if (i3 != 16) {
                            if (i3 != 26) {
                                if (i3 == 12 || !jjvVar.P()) {
                                    break;
                                }
                            } else if (iwqVar != null) {
                                ils.c(jjvVar, iwqVar, jkdVar, b);
                            } else {
                                jjqVar = jjvVar.o();
                            }
                        } else {
                            i2 = jjvVar.i();
                            iwqVar = jkdVar.b(this.a, i2);
                        }
                    }
                    if (jjvVar.a != 12) {
                        throw new jld("Protocol message end-group tag did not match expected tag.");
                    }
                    if (jjqVar != null) {
                        if (iwqVar != null) {
                            jlk B = iwqVar.a.B();
                            jju f2 = jjqVar.f();
                            B.h(f2, jkdVar);
                            b.k((jko) iwqVar.c, B.r());
                            f2.D(0);
                        } else {
                            jmj.b(f, i2, jjqVar);
                        }
                    }
                } else if ((i & 7) == 2) {
                    iwq b2 = jkdVar.b(this.a, i >>> 3);
                    if (b2 != null) {
                        ils.c(jjvVar, b2, jkdVar, b);
                    } else {
                        z = jmjVar.a(f, jjvVar, 0);
                    }
                } else {
                    z = jjvVar.P();
                }
                if (!z) {
                    break;
                }
            } finally {
                jmj.e(obj, f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7 A[EDGE_INSN: B:24:0x00b7->B:25:0x00b7 BREAK  A[LOOP:1: B:10:0x0063->B:18:0x0063], SYNTHETIC] */
    @Override // defpackage.jlz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Object obj, byte[] bArr, int i, int i2, jje jjeVar) {
        int i3;
        jkp jkpVar = (jkp) obj;
        jmk jmkVar = jkpVar.s;
        if (jmkVar == jmk.a) {
            jmkVar = new jmk();
            jkpVar.s = jmkVar;
        }
        jmk jmkVar2 = jmkVar;
        jkf b = ((jkm) obj).b();
        iwq iwqVar = null;
        while (i < i2) {
            int m = jjf.m(bArr, i, jjeVar);
            int i4 = jjeVar.a;
            if (i4 == 11) {
                int i5 = i2;
                jje jjeVar2 = jjeVar;
                int i6 = 0;
                jjq jjqVar = null;
                while (true) {
                    if (m >= i5) {
                        i3 = m;
                        break;
                    }
                    i3 = jjf.m(bArr, m, jjeVar2);
                    int i7 = jjeVar2.a;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3) {
                            if (iwqVar != null) {
                                m = jjf.g(jlt.a.b(iwqVar.a.getClass()), bArr, i3, i5, jjeVar2);
                                b.k((jko) iwqVar.c, jjeVar2.c);
                            } else if (i9 == 2) {
                                m = jjf.c(bArr, i3, jjeVar2);
                                jjqVar = (jjq) jjeVar2.c;
                            }
                        }
                        if (i7 != 12) {
                            break;
                        } else {
                            m = jjf.s(i7, bArr, i3, i5, jjeVar2);
                        }
                    } else if (i9 == 0) {
                        m = jjf.m(bArr, i3, jjeVar2);
                        i6 = jjeVar2.a;
                        iwqVar = jjeVar2.d.b(this.a, i6);
                    } else if (i7 != 12) {
                    }
                }
                if (jjqVar != null) {
                    jmkVar2.e((i6 << 3) | 2, jjqVar);
                }
                i = i3;
                i2 = i5;
                jjeVar = jjeVar2;
            } else if ((i4 & 7) == 2) {
                iwqVar = jjeVar.d.b(this.a, i4 >>> 3);
                if (iwqVar != null) {
                    i = jjf.g(jlt.a.b(iwqVar.a.getClass()), bArr, m, i2, jjeVar);
                    b.k((jko) iwqVar.c, jjeVar.c);
                } else {
                    i = jjf.l(i4, bArr, m, i2, jmkVar2, jjeVar);
                }
            } else {
                i = jjf.s(i4, bArr, m, i2, jjeVar);
            }
        }
        if (i != i2) {
            throw new jld("Failed to parse the message.");
        }
    }

    @Override // defpackage.jlz
    public final boolean k(Object obj, Object obj2) {
        if (!jmj.d(obj).equals(jmj.d(obj2))) {
            return false;
        }
        if (this.c) {
            return ils.a(obj).equals(ils.a(obj2));
        }
        return true;
    }

    @Override // defpackage.jlz
    public final boolean l(Object obj) {
        return ils.a(obj).h();
    }

    @Override // defpackage.jlz
    public final void m(Object obj, ikk ikkVar) {
        jjq jjqVar;
        Iterator d = ils.a(obj).d();
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            jko jkoVar = (jko) entry.getKey();
            if (jkoVar.a() != jms.i) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof jkz) {
                int i = jkoVar.a;
                jlb jlbVar = (jlb) ((jkz) entry).a.getValue();
                if (jlbVar.a != null) {
                    jjqVar = jlbVar.a;
                } else {
                    synchronized (jlbVar) {
                        if (jlbVar.a != null) {
                            jjqVar = jlbVar.a;
                        } else {
                            jlbVar.a = jlbVar.b.d();
                            jjqVar = jlbVar.a;
                        }
                    }
                }
                ikkVar.n(i, jjqVar);
            } else {
                ikkVar.n(jkoVar.a, entry.getValue());
            }
        }
        jmk d2 = jmj.d(obj);
        for (int i2 = 0; i2 < d2.b; i2++) {
            ikkVar.n(d2.c[i2] >>> 3, d2.d[i2]);
        }
    }
}
