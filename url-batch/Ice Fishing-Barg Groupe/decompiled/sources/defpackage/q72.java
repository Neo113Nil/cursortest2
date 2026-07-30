package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class q72 implements Iterable, fu0 {
    public static final o72 Companion = new o72();
    public static final q72 x50lh2ztY7Y5 = new q72(0, 0, 0, null);
    public final long OPXfSBeufaJ8;
    public final long[] dgRBjINgWbAK;
    public final long rtx2ld2ELZv4;
    public final long wdg6QnbFHrFF;

    public q72(long j, long j2, long j3, long[] jArr) {
        this.rtx2ld2ELZv4 = j;
        this.OPXfSBeufaJ8 = j2;
        this.wdg6QnbFHrFF = j3;
        this.dgRBjINgWbAK = jArr;
    }

    public final q72 PxuCJdSBwIXG(q72 q72Var) {
        long[] jArr;
        q72 q72Var2 = this;
        q72 q72Var3 = x50lh2ztY7Y5;
        if (q72Var == q72Var3) {
            return q72Var2;
        }
        if (q72Var2 == q72Var3) {
            return q72Var3;
        }
        long j = q72Var.wdg6QnbFHrFF;
        long j2 = q72Var.wdg6QnbFHrFF;
        long[] jArr2 = q72Var.dgRBjINgWbAK;
        long j3 = q72Var.OPXfSBeufaJ8;
        long j4 = q72Var.rtx2ld2ELZv4;
        long j5 = q72Var2.wdg6QnbFHrFF;
        if (j == j5 && jArr2 == (jArr = q72Var2.dgRBjINgWbAK)) {
            return new q72(q72Var2.rtx2ld2ELZv4 & (~j4), q72Var2.OPXfSBeufaJ8 & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                q72Var2 = q72Var2.lS5Rgt96tfkO(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    q72Var2 = q72Var2.lS5Rgt96tfkO(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    q72Var2 = q72Var2.lS5Rgt96tfkO(i2 + j2 + 64);
                }
            }
        }
        return q72Var2;
    }

    public final boolean TSizfFm2Yiuu(long j) {
        long[] jArr;
        long j2 = j - this.wdg6QnbFHrFF;
        return (cs0.BRwzKIf41E4i(j2, 0L) < 0 || cs0.BRwzKIf41E4i(j2, 64L) >= 0) ? (cs0.BRwzKIf41E4i(j2, 64L) < 0 || cs0.BRwzKIf41E4i(j2, 128L) >= 0) ? cs0.BRwzKIf41E4i(j2, 0L) <= 0 && (jArr = this.dgRBjINgWbAK) != null && kj0.rtx2ld2ELZv4(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.rtx2ld2ELZv4) != 0 : ((1 << ((int) j2)) & this.OPXfSBeufaJ8) != 0;
    }

    public final q72 Y1f8riQaR6yg(q72 q72Var) {
        q72 q72Var2;
        long[] jArr;
        q72 q72Var3 = this;
        q72 q72Var4 = x50lh2ztY7Y5;
        if (q72Var == q72Var4) {
            return q72Var3;
        }
        if (q72Var3 == q72Var4) {
            return q72Var;
        }
        long j = q72Var.wdg6QnbFHrFF;
        long j2 = q72Var.wdg6QnbFHrFF;
        long[] jArr2 = q72Var.dgRBjINgWbAK;
        long j3 = q72Var.OPXfSBeufaJ8;
        long j4 = q72Var.rtx2ld2ELZv4;
        long j5 = q72Var3.wdg6QnbFHrFF;
        long j6 = q72Var3.OPXfSBeufaJ8;
        long j7 = q72Var3.rtx2ld2ELZv4;
        if (j == j5 && jArr2 == (jArr = q72Var3.dgRBjINgWbAK)) {
            return new q72(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = q72Var3.dgRBjINgWbAK;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    q72Var3 = q72Var3.e9gEMXR7LXtO(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        q72Var3 = q72Var3.e9gEMXR7LXtO(i2 + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        q72Var3 = q72Var3.e9gEMXR7LXtO(i + j2 + 64);
                    }
                    i++;
                }
            }
            return q72Var3;
        }
        if (jArr3 != null) {
            q72Var2 = q72Var;
            for (long j9 : jArr3) {
                q72Var2 = q72Var2.e9gEMXR7LXtO(j9);
            }
        } else {
            q72Var2 = q72Var;
        }
        long j10 = q72Var3.wdg6QnbFHrFF;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    q72Var2 = q72Var2.e9gEMXR7LXtO(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    q72Var2 = q72Var2.e9gEMXR7LXtO(i + j10 + 64);
                }
                i++;
            }
        }
        return q72Var2;
    }

    public final q72 e9gEMXR7LXtO(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.wdg6QnbFHrFF;
        long j6 = j - j5;
        long j7 = 0;
        int BRwzKIf41E4i = cs0.BRwzKIf41E4i(j6, 0L);
        long j8 = this.OPXfSBeufaJ8;
        if (BRwzKIf41E4i < 0 || cs0.BRwzKIf41E4i(j6, 64L) >= 0) {
            int BRwzKIf41E4i2 = cs0.BRwzKIf41E4i(j6, 64L);
            long j9 = this.rtx2ld2ELZv4;
            int i2 = 64;
            if (BRwzKIf41E4i2 < 0 || cs0.BRwzKIf41E4i(j6, 128L) >= 0) {
                int BRwzKIf41E4i3 = cs0.BRwzKIf41E4i(j6, 128L);
                long[] jArr3 = this.dgRBjINgWbAK;
                if (BRwzKIf41E4i3 < 0) {
                    if (jArr3 == null) {
                        return new q72(this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, new long[]{j});
                    }
                    int rtx2ld2ELZv4 = kj0.rtx2ld2ELZv4(jArr3, j);
                    if (rtx2ld2ELZv4 < 0) {
                        int i3 = -(rtx2ld2ELZv4 + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        na.JTxCbbCwomzt(jArr3, jArr4, 0, 0, i3);
                        na.JTxCbbCwomzt(jArr3, jArr4, i3 + 1, i3, length);
                        jArr4[i3] = j;
                        return new q72(this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, jArr4);
                    }
                } else if (!TSizfFm2Yiuu(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (cs0.BRwzKIf41E4i(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    b42 b42Var = null;
                    while (true) {
                        if (cs0.BRwzKIf41E4i(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (b42Var == null) {
                                b42Var = new b42(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j8 & (1 << i4)) != j7) {
                                    j4 = j7;
                                    ((g81) b42Var.OPXfSBeufaJ8).PxuCJdSBwIXG(i4 + j5);
                                } else {
                                    j4 = j7;
                                }
                                i4++;
                                j7 = j4;
                            }
                        } else {
                            i = i2;
                        }
                        long j12 = j7;
                        if (j11 == j12) {
                            j2 = j10;
                            j3 = j12;
                            break;
                        }
                        j5 += 64;
                        j7 = j12;
                        j8 = j11;
                        i2 = i;
                        j11 = j7;
                    }
                    if (b42Var != null) {
                        g81 g81Var = (g81) b42Var.OPXfSBeufaJ8;
                        int i5 = g81Var.lS5Rgt96tfkO;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = g81Var.PxuCJdSBwIXG;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                            return new q72(j11, j3, j2, jArr).e9gEMXR7LXtO(j);
                        }
                    }
                    jArr = jArr3;
                    return new q72(j11, j3, j2, jArr).e9gEMXR7LXtO(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new q72(j9 | j13, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, this.dgRBjINgWbAK);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new q72(this.rtx2ld2ELZv4, j8 | j14, this.wdg6QnbFHrFF, this.dgRBjINgWbAK);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return xi0.nLZGh9p8gVSu(new p72(this, null));
    }

    public final q72 lS5Rgt96tfkO(long j) {
        long[] jArr;
        int rtx2ld2ELZv4;
        long[] jArr2;
        long j2 = j - this.wdg6QnbFHrFF;
        if (cs0.BRwzKIf41E4i(j2, 0L) >= 0 && cs0.BRwzKIf41E4i(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.OPXfSBeufaJ8;
            if ((j4 & j3) != 0) {
                return new q72(this.rtx2ld2ELZv4, j4 & (~j3), this.wdg6QnbFHrFF, this.dgRBjINgWbAK);
            }
        } else if (cs0.BRwzKIf41E4i(j2, 64L) >= 0 && cs0.BRwzKIf41E4i(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.rtx2ld2ELZv4;
            if ((j6 & j5) != 0) {
                return new q72(j6 & (~j5), this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, this.dgRBjINgWbAK);
            }
        } else if (cs0.BRwzKIf41E4i(j2, 0L) < 0 && (jArr = this.dgRBjINgWbAK) != null && (rtx2ld2ELZv4 = kj0.rtx2ld2ELZv4(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (rtx2ld2ELZv4 > 0) {
                    na.JTxCbbCwomzt(jArr, jArr3, 0, 0, rtx2ld2ELZv4);
                }
                if (rtx2ld2ELZv4 < i) {
                    na.JTxCbbCwomzt(jArr, jArr3, rtx2ld2ELZv4, rtx2ld2ELZv4 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new q72(this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, jArr2);
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
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
