package w0;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k implements Iterable, r6.a {

    /* renamed from: h, reason: collision with root package name */
    public static final k f7527h = new k(0, 0, 0, null);

    /* renamed from: d, reason: collision with root package name */
    public final long f7528d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7529e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7530f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f7531g;

    public k(long j7, long j8, long j9, long[] jArr) {
        this.f7528d = j7;
        this.f7529e = j8;
        this.f7530f = j9;
        this.f7531g = jArr;
    }

    public final k a(k kVar) {
        k kVar2;
        long j7;
        long[] jArr;
        k kVar3 = f7527h;
        if (kVar == kVar3) {
            return this;
        }
        if (this == kVar3) {
            return kVar3;
        }
        long j8 = kVar.f7530f;
        long j9 = kVar.f7530f;
        long[] jArr2 = kVar.f7531g;
        long j10 = kVar.f7529e;
        long j11 = kVar.f7528d;
        long j12 = this.f7530f;
        if (j8 == j12 && jArr2 == (jArr = this.f7531g)) {
            return new k(this.f7528d & (~j11), this.f7529e & (~j10), j12, jArr);
        }
        if (jArr2 != null) {
            kVar2 = this;
            for (long j13 : jArr2) {
                kVar2 = kVar2.b(j13);
            }
        } else {
            kVar2 = this;
        }
        long j14 = 0;
        if (j10 != 0) {
            int i = 0;
            while (i < 64) {
                if (((1 << i) & j10) != j14) {
                    j7 = j14;
                    kVar2 = kVar2.b(i + j9);
                } else {
                    j7 = j14;
                }
                i++;
                j14 = j7;
            }
        }
        long j15 = j14;
        if (j11 != j15) {
            for (int i8 = 0; i8 < 64; i8++) {
                if (((1 << i8) & j11) != j15) {
                    kVar2 = kVar2.b(i8 + j9 + 64);
                }
            }
        }
        return kVar2;
    }

    public final k b(long j7) {
        long[] jArr;
        int c8;
        long[] jArr2;
        long j8 = j7 - this.f7530f;
        long j9 = 0;
        if (q6.i.g(j8, j9) >= 0 && q6.i.g(j8, 64) < 0) {
            long j10 = 1 << ((int) j8);
            long j11 = this.f7529e;
            if ((j11 & j10) != 0) {
                return new k(this.f7528d, j11 & (~j10), this.f7530f, this.f7531g);
            }
        } else if (q6.i.g(j8, 64) >= 0 && q6.i.g(j8, 128) < 0) {
            long j12 = 1 << (((int) j8) - 64);
            long j13 = this.f7528d;
            if ((j13 & j12) != 0) {
                return new k(j13 & (~j12), this.f7529e, this.f7530f, this.f7531g);
            }
        } else if (q6.i.g(j8, j9) < 0 && (jArr = this.f7531g) != null && (c8 = q.c(jArr, j7)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (c8 > 0) {
                    d6.l.G(jArr, jArr3, 0, 0, c8);
                }
                if (c8 < i) {
                    d6.l.G(jArr, jArr3, c8, c8 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new k(this.f7528d, this.f7529e, this.f7530f, jArr2);
        }
        return this;
    }

    public final boolean c(long j7) {
        long[] jArr;
        long j8 = j7 - this.f7530f;
        long j9 = 0;
        return (q6.i.g(j8, j9) < 0 || q6.i.g(j8, (long) 64) >= 0) ? (q6.i.g(j8, (long) 64) < 0 || q6.i.g(j8, (long) 128) >= 0) ? q6.i.g(j8, j9) <= 0 && (jArr = this.f7531g) != null && q.c(jArr, j7) >= 0 : ((1 << (((int) j8) - 64)) & this.f7528d) != 0 : ((1 << ((int) j8)) & this.f7529e) != 0;
    }

    public final k e(k kVar) {
        k kVar2;
        k kVar3;
        long[] jArr;
        k kVar4 = f7527h;
        if (kVar == kVar4) {
            return this;
        }
        if (this == kVar4) {
            return kVar;
        }
        long j7 = kVar.f7530f;
        long j8 = kVar.f7530f;
        long[] jArr2 = kVar.f7531g;
        long j9 = kVar.f7529e;
        long j10 = kVar.f7528d;
        long j11 = this.f7530f;
        long j12 = this.f7529e;
        long j13 = this.f7528d;
        if (j7 == j11 && jArr2 == (jArr = this.f7531g)) {
            return new k(j13 | j10, j12 | j9, j11, jArr);
        }
        int i = 0;
        long[] jArr3 = this.f7531g;
        if (jArr3 != null) {
            if (jArr2 != null) {
                kVar2 = this;
                for (long j14 : jArr2) {
                    kVar2 = kVar2.f(j14);
                }
            } else {
                kVar2 = this;
            }
            if (j9 != 0) {
                for (int i8 = 0; i8 < 64; i8++) {
                    if (((1 << i8) & j9) != 0) {
                        kVar2 = kVar2.f(i8 + j8);
                    }
                }
            }
            if (j10 != 0) {
                while (i < 64) {
                    if (((1 << i) & j10) != 0) {
                        kVar2 = kVar2.f(i + j8 + 64);
                    }
                    i++;
                }
            }
            return kVar2;
        }
        if (jArr3 != null) {
            kVar3 = kVar;
            for (long j15 : jArr3) {
                kVar3 = kVar3.f(j15);
            }
        } else {
            kVar3 = kVar;
        }
        long j16 = this.f7530f;
        if (j12 != 0) {
            for (int i9 = 0; i9 < 64; i9++) {
                if (((1 << i9) & j12) != 0) {
                    kVar3 = kVar3.f(i9 + j16);
                }
            }
        }
        if (j13 != 0) {
            while (i < 64) {
                if (((1 << i) & j13) != 0) {
                    kVar3 = kVar3.f(i + j16 + 64);
                }
                i++;
            }
        }
        return kVar3;
    }

    public final k f(long j7) {
        long[] jArr;
        long j8;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j9 = this.f7530f;
        long j10 = j7 - j9;
        long j11 = 0;
        int g3 = q6.i.g(j10, j11);
        long j12 = this.f7529e;
        int i = 64;
        long j13 = 0;
        if (g3 < 0 || q6.i.g(j10, 64) >= 0) {
            long j14 = 64;
            int g7 = q6.i.g(j10, j14);
            long j15 = this.f7528d;
            if (g7 < 0 || q6.i.g(j10, 128) >= 0) {
                long j16 = 128;
                int g8 = q6.i.g(j10, j16);
                long[] jArr5 = this.f7531g;
                if (g8 < 0) {
                    if (jArr5 == null) {
                        return new k(this.f7528d, this.f7529e, this.f7530f, new long[]{j7});
                    }
                    int c8 = q.c(jArr5, j7);
                    if (c8 < 0) {
                        int i8 = -(c8 + 1);
                        int length = jArr5.length;
                        long[] jArr6 = new long[length + 1];
                        d6.l.G(jArr5, jArr6, 0, 0, i8);
                        d6.l.G(jArr5, jArr6, i8 + 1, i8, length);
                        jArr6[i8] = j7;
                        return new k(this.f7528d, this.f7529e, this.f7530f, jArr6);
                    }
                } else if (!c(j7)) {
                    long j17 = 1;
                    long j18 = ((j7 + j17) / j14) * j14;
                    if (q6.i.g(j18, j11) < 0) {
                        j18 = (Long.MAX_VALUE - j16) + j17;
                    }
                    long j19 = j9;
                    long j20 = j15;
                    q3.k kVar = null;
                    while (true) {
                        if (q6.i.g(j19, j18) >= 0) {
                            jArr = jArr5;
                            j8 = j19;
                            j13 = j12;
                            break;
                        }
                        if (j12 != 0) {
                            if (kVar == null) {
                                kVar = new q3.k(jArr5);
                            }
                            int i9 = 0;
                            while (i9 < i) {
                                if ((j12 & (1 << i9)) != 0) {
                                    jArr4 = jArr5;
                                    ((o.z) kVar.f6119e).a(i9 + j19);
                                } else {
                                    jArr4 = jArr5;
                                }
                                i9++;
                                jArr5 = jArr4;
                                i = 64;
                            }
                        }
                        long[] jArr7 = jArr5;
                        if (j20 == 0) {
                            j8 = j18;
                            jArr = jArr7;
                            break;
                        }
                        j19 += j14;
                        jArr5 = jArr7;
                        j12 = j20;
                        i = 64;
                        j20 = 0;
                    }
                    if (kVar != null) {
                        o.z zVar = (o.z) kVar.f6119e;
                        int i10 = zVar.f5570b;
                        if (i10 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr8 = new long[i10];
                            long[] jArr9 = zVar.f5569a;
                            for (int i11 = 0; i11 < i10; i11++) {
                                jArr8[i11] = jArr9[i11];
                            }
                            jArr3 = jArr8;
                        }
                        if (jArr3 != null) {
                            jArr2 = jArr3;
                            return new k(j20, j13, j8, jArr2).f(j7);
                        }
                    }
                    jArr2 = jArr;
                    return new k(j20, j13, j8, jArr2).f(j7);
                }
            } else {
                long j21 = 1 << (((int) j10) - 64);
                if ((j15 & j21) == 0) {
                    return new k(j15 | j21, this.f7529e, this.f7530f, this.f7531g);
                }
            }
        } else {
            long j22 = 1 << ((int) j10);
            if ((j12 & j22) == 0) {
                return new k(this.f7528d, j12 | j22, this.f7530f, this.f7531g);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return r2.r.E(new j(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(d6.n.M(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = arrayList.get(i8);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
