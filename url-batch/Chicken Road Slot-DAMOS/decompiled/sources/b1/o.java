package b1;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o implements Iterable, xd.a {

    /* renamed from: s, reason: collision with root package name */
    public static final o f1018s = new o(0, 0, 0, null);

    /* renamed from: d, reason: collision with root package name */
    public final long f1019d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1020e;

    /* renamed from: i, reason: collision with root package name */
    public final long f1021i;

    /* renamed from: r, reason: collision with root package name */
    public final long[] f1022r;

    public o(long j, long j3, long j10, long[] jArr) {
        this.f1019d = j;
        this.f1020e = j3;
        this.f1021i = j10;
        this.f1022r = jArr;
    }

    public final o b(o oVar) {
        o oVar2;
        long j;
        long[] jArr;
        o oVar3 = f1018s;
        if (oVar == oVar3) {
            return this;
        }
        if (this == oVar3) {
            return oVar3;
        }
        long j3 = oVar.f1021i;
        long j10 = oVar.f1021i;
        long[] jArr2 = oVar.f1022r;
        long j11 = oVar.f1020e;
        long j12 = oVar.f1019d;
        long j13 = this.f1021i;
        if (j3 == j13 && jArr2 == (jArr = this.f1022r)) {
            return new o(this.f1019d & (~j12), this.f1020e & (~j11), j13, jArr);
        }
        if (jArr2 != null) {
            oVar2 = this;
            for (long j14 : jArr2) {
                oVar2 = oVar2.c(j14);
            }
        } else {
            oVar2 = this;
        }
        long j15 = 0;
        if (j11 != 0) {
            int i3 = 0;
            while (i3 < 64) {
                if (((1 << i3) & j11) != j15) {
                    j = j15;
                    oVar2 = oVar2.c(i3 + j10);
                } else {
                    j = j15;
                }
                i3++;
                j15 = j;
            }
        }
        long j16 = j15;
        if (j12 != j16) {
            for (int i10 = 0; i10 < 64; i10++) {
                if (((1 << i10) & j12) != j16) {
                    oVar2 = oVar2.c(i10 + j10 + 64);
                }
            }
        }
        return oVar2;
    }

    public final o c(long j) {
        long[] jArr;
        int c10;
        long[] jArr2;
        long j3 = j - this.f1021i;
        long j10 = 0;
        if (Intrinsics.c(j3, j10) >= 0 && Intrinsics.c(j3, 64) < 0) {
            long j11 = 1 << ((int) j3);
            long j12 = this.f1020e;
            if ((j12 & j11) != 0) {
                return new o(this.f1019d, j12 & (~j11), this.f1021i, this.f1022r);
            }
        } else if (Intrinsics.c(j3, 64) >= 0 && Intrinsics.c(j3, 128) < 0) {
            long j13 = 1 << (((int) j3) - 64);
            long j14 = this.f1019d;
            if ((j14 & j13) != 0) {
                return new o(j14 & (~j13), this.f1020e, this.f1021i, this.f1022r);
            }
        } else if (Intrinsics.c(j3, j10) < 0 && (jArr = this.f1022r) != null && (c10 = x.c(jArr, j)) >= 0) {
            int length = jArr.length;
            int i3 = length - 1;
            if (i3 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i3];
                if (c10 > 0) {
                    kotlin.collections.v.e(jArr, jArr3, 0, 0, c10);
                }
                if (c10 < i3) {
                    kotlin.collections.v.e(jArr, jArr3, c10, c10 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new o(this.f1019d, this.f1020e, this.f1021i, jArr2);
        }
        return this;
    }

    public final boolean e(long j) {
        long[] jArr;
        long j3 = j - this.f1021i;
        long j10 = 0;
        return (Intrinsics.c(j3, j10) < 0 || Intrinsics.c(j3, (long) 64) >= 0) ? (Intrinsics.c(j3, (long) 64) < 0 || Intrinsics.c(j3, (long) 128) >= 0) ? Intrinsics.c(j3, j10) <= 0 && (jArr = this.f1022r) != null && x.c(jArr, j) >= 0 : ((1 << (((int) j3) - 64)) & this.f1019d) != 0 : ((1 << ((int) j3)) & this.f1020e) != 0;
    }

    public final o f(o oVar) {
        o oVar2;
        o oVar3;
        long[] jArr;
        o oVar4 = f1018s;
        if (oVar == oVar4) {
            return this;
        }
        if (this == oVar4) {
            return oVar;
        }
        long j = oVar.f1021i;
        long j3 = oVar.f1021i;
        long[] jArr2 = oVar.f1022r;
        long j10 = oVar.f1020e;
        long j11 = oVar.f1019d;
        long j12 = this.f1021i;
        long j13 = this.f1020e;
        long j14 = this.f1019d;
        if (j == j12 && jArr2 == (jArr = this.f1022r)) {
            return new o(j14 | j11, j13 | j10, j12, jArr);
        }
        int i3 = 0;
        long[] jArr3 = this.f1022r;
        if (jArr3 != null) {
            if (jArr2 != null) {
                oVar2 = this;
                for (long j15 : jArr2) {
                    oVar2 = oVar2.g(j15);
                }
            } else {
                oVar2 = this;
            }
            if (j10 != 0) {
                for (int i10 = 0; i10 < 64; i10++) {
                    if (((1 << i10) & j10) != 0) {
                        oVar2 = oVar2.g(i10 + j3);
                    }
                }
            }
            if (j11 != 0) {
                while (i3 < 64) {
                    if (((1 << i3) & j11) != 0) {
                        oVar2 = oVar2.g(i3 + j3 + 64);
                    }
                    i3++;
                }
            }
            return oVar2;
        }
        if (jArr3 != null) {
            oVar3 = oVar;
            for (long j16 : jArr3) {
                oVar3 = oVar3.g(j16);
            }
        } else {
            oVar3 = oVar;
        }
        long j17 = this.f1021i;
        if (j13 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j13) != 0) {
                    oVar3 = oVar3.g(i11 + j17);
                }
            }
        }
        if (j14 != 0) {
            while (i3 < 64) {
                if (((1 << i3) & j14) != 0) {
                    oVar3 = oVar3.g(i3 + j17 + 64);
                }
                i3++;
            }
        }
        return oVar3;
    }

    public final o g(long j) {
        long[] jArr;
        long j3;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j10 = this.f1021i;
        long j11 = j - j10;
        long j12 = 0;
        int c10 = Intrinsics.c(j11, j12);
        long j13 = this.f1020e;
        int i3 = 64;
        long j14 = 0;
        if (c10 < 0 || Intrinsics.c(j11, 64) >= 0) {
            long j15 = 64;
            int c11 = Intrinsics.c(j11, j15);
            long j16 = this.f1019d;
            if (c11 < 0 || Intrinsics.c(j11, 128) >= 0) {
                long j17 = 128;
                int c12 = Intrinsics.c(j11, j17);
                long[] jArr5 = this.f1022r;
                if (c12 < 0) {
                    if (jArr5 == null) {
                        return new o(this.f1019d, this.f1020e, this.f1021i, new long[]{j});
                    }
                    int c13 = x.c(jArr5, j);
                    if (c13 < 0) {
                        int i10 = -(c13 + 1);
                        int length = jArr5.length;
                        long[] jArr6 = new long[length + 1];
                        kotlin.collections.v.e(jArr5, jArr6, 0, 0, i10);
                        kotlin.collections.v.e(jArr5, jArr6, i10 + 1, i10, length);
                        jArr6[i10] = j;
                        return new o(this.f1019d, this.f1020e, this.f1021i, jArr6);
                    }
                } else if (!e(j)) {
                    long j18 = 1;
                    long j19 = ((j + j18) / j15) * j15;
                    if (Intrinsics.c(j19, j12) < 0) {
                        j19 = (Long.MAX_VALUE - j17) + j18;
                    }
                    long j20 = j10;
                    long j21 = j16;
                    d9.c cVar = null;
                    while (true) {
                        if (Intrinsics.c(j20, j19) >= 0) {
                            jArr = jArr5;
                            j3 = j20;
                            j14 = j13;
                            break;
                        }
                        if (j13 != 0) {
                            if (cVar == null) {
                                cVar = new d9.c(jArr5);
                            }
                            int i11 = 0;
                            while (i11 < i3) {
                                if ((j13 & (1 << i11)) != 0) {
                                    jArr4 = jArr5;
                                    ((s.y) cVar.f3701e).a(i11 + j20);
                                } else {
                                    jArr4 = jArr5;
                                }
                                i11++;
                                jArr5 = jArr4;
                                i3 = 64;
                            }
                        }
                        long[] jArr7 = jArr5;
                        if (j21 == 0) {
                            j3 = j19;
                            jArr = jArr7;
                            break;
                        }
                        j20 += j15;
                        jArr5 = jArr7;
                        j13 = j21;
                        i3 = 64;
                        j21 = 0;
                    }
                    if (cVar != null) {
                        s.y yVar = (s.y) cVar.f3701e;
                        int i12 = yVar.f8398b;
                        if (i12 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr8 = new long[i12];
                            long[] jArr9 = yVar.f8397a;
                            for (int i13 = 0; i13 < i12; i13++) {
                                jArr8[i13] = jArr9[i13];
                            }
                            jArr3 = jArr8;
                        }
                        if (jArr3 != null) {
                            jArr2 = jArr3;
                            return new o(j21, j14, j3, jArr2).g(j);
                        }
                    }
                    jArr2 = jArr;
                    return new o(j21, j14, j3, jArr2).g(j);
                }
            } else {
                long j22 = 1 << (((int) j11) - 64);
                if ((j16 & j22) == 0) {
                    return new o(j16 | j22, this.f1020e, this.f1021i, this.f1022r);
                }
            }
        } else {
            long j23 = 1 << ((int) j11);
            if ((j13 & j23) == 0) {
                return new o(this.f1019d, j13 | j23, this.f1021i, this.f1022r);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return de.h.a(new n(this, null));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(kotlin.collections.z.j(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            i3++;
            if (i3 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) obj.toString());
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
