package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class lp extends gp {
    public final boolean TSizfFm2Yiuu;

    public lp(um umVar, boolean z) {
        super(umVar);
        this.TSizfFm2Yiuu = z;
    }

    @Override // defpackage.gp
    public final void TSizfFm2Yiuu(byte b) {
        if (this.TSizfFm2Yiuu) {
            OPXfSBeufaJ8(String.valueOf(b & 255));
        } else {
            RAsUl2FVSrh6(String.valueOf(b & 255));
        }
    }

    @Override // defpackage.gp
    public final void a92UlCVFR9N8(long j) {
        int i = 63;
        String str = "0";
        if (this.TSizfFm2Yiuu) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            OPXfSBeufaJ8(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        RAsUl2FVSrh6(str);
    }

    @Override // defpackage.gp
    public final void e9gEMXR7LXtO(int i) {
        if (this.TSizfFm2Yiuu) {
            OPXfSBeufaJ8(Long.toString(i & 4294967295L, 10));
        } else {
            RAsUl2FVSrh6(Long.toString(i & 4294967295L, 10));
        }
    }

    @Override // defpackage.gp
    public final void rtx2ld2ELZv4(short s) {
        if (this.TSizfFm2Yiuu) {
            OPXfSBeufaJ8(String.valueOf(s & 65535));
        } else {
            RAsUl2FVSrh6(String.valueOf(s & 65535));
        }
    }
}
