package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class erw extends ery {
    private final Random c;
    private final eru d;
    private final erh e;
    private final hsl f;

    public erw(lgc lgcVar, eru eruVar, Random random, erh erhVar, hsl hslVar) {
        super(eruVar.c > 0, lgcVar);
        this.c = random;
        this.d = eruVar;
        this.e = erhVar;
        this.f = hslVar;
    }

    @Override // defpackage.ery
    public final eru a(String str) {
        eru eruVar;
        if (hoq.S(str)) {
            eruVar = this.d;
        } else {
            erh erhVar = this.e;
            long epochMilli = this.f.a().toEpochMilli() - erhVar.d;
            if (epochMilli >= 14400000) {
                long j = epochMilli / 14400000;
                long min = Math.min(j, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = erhVar.a;
                    int i2 = (int) min;
                    sArr[i] = (short) (sArr[i] >> i2);
                    short[] sArr2 = erhVar.b;
                    sArr2[i] = (short) (sArr2[i] >> i2);
                }
                erhVar.d += j * 14400000;
            }
            int hashCode = str.hashCode() * erhVar.c;
            char charAt = str.isEmpty() ? (char) 0 : str.charAt(0);
            int i3 = hashCode >>> 24;
            int length = (hashCode >>> 16) + str.length();
            short[] sArr3 = erhVar.a;
            short[] sArr4 = erhVar.b;
            int i4 = (i3 + charAt) & 255;
            int i5 = length & 255;
            int min2 = Math.min((int) sArr3[i4], (int) sArr4[i5]);
            int i6 = min2 + 1;
            short min3 = (short) Math.min(32767, i6);
            if (sArr3[i4] == min2) {
                sArr3[i4] = min3;
            }
            if (sArr4[i5] == min2) {
                sArr4[i5] = min3;
            }
            double sqrt = i6 < 50 ? Math.sqrt(i6) : i6;
            eruVar = new eru((int) (r13.c / sqrt), this.d.d);
        }
        return eruVar.c(this.c) ? eruVar : eru.b;
    }

    @Override // defpackage.ery
    public final lgc b(eru eruVar) {
        if (eruVar == null || eruVar.equals(this.d)) {
            return this.b;
        }
        jkj k = lgc.a.k();
        int H = a.H(this.b.e);
        if (H == 0) {
            H = 1;
        }
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        lgc lgcVar = (lgc) jkpVar;
        lgcVar.e = H - 1;
        lgcVar.b |= 2;
        if (eruVar.d()) {
            int i = eruVar.c;
            if (!jkpVar.M()) {
                k.t();
            }
            lgc lgcVar2 = (lgc) k.b;
            lgcVar2.c = 2;
            lgcVar2.d = Integer.valueOf(i);
        } else {
            jkj k2 = lga.a.k();
            int i2 = eruVar.c;
            if (!k2.b.M()) {
                k2.t();
            }
            jkp jkpVar2 = k2.b;
            lga lgaVar = (lga) jkpVar2;
            lgaVar.b = 1 | lgaVar.b;
            lgaVar.c = i2;
            int i3 = eruVar.d;
            if (!jkpVar2.M()) {
                k2.t();
            }
            lga lgaVar2 = (lga) k2.b;
            lgaVar2.b |= 2;
            lgaVar2.d = i3;
            if (!k.b.M()) {
                k.t();
            }
            lgc lgcVar3 = (lgc) k.b;
            lga lgaVar3 = (lga) k2.q();
            lgaVar3.getClass();
            lgcVar3.d = lgaVar3;
            lgcVar3.c = 4;
        }
        return (lgc) k.q();
    }

    @Override // defpackage.ery
    public final lgc c(eru eruVar) {
        return this.a ? b(eruVar) : d();
    }
}
