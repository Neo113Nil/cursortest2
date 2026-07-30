package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class e22 extends ah {
    public final transient int[] cpQdD2nAriOS;
    public final transient byte[][] x50lh2ztY7Y5;

    public e22(byte[][] bArr, int[] iArr) {
        super(ah.dgRBjINgWbAK.rtx2ld2ELZv4);
        this.x50lh2ztY7Y5 = bArr;
        this.cpQdD2nAriOS = iArr;
    }

    @Override // defpackage.ah
    public final String OPXfSBeufaJ8(Charset charset) {
        charset.getClass();
        return new ah(r3s1LDPKFs1S()).OPXfSBeufaJ8(charset);
    }

    @Override // defpackage.ah
    public final String PxuCJdSBwIXG() {
        throw null;
    }

    @Override // defpackage.ah
    public final boolean RAsUl2FVSrh6(int i, ah ahVar) {
        ahVar.getClass();
        if (TSizfFm2Yiuu() - i >= 0) {
            int BjEWd04qc7Mw = bs0.BjEWd04qc7Mw(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.cpQdD2nAriOS;
                int i4 = BjEWd04qc7Mw == 0 ? 0 : iArr[BjEWd04qc7Mw - 1];
                int i5 = iArr[BjEWd04qc7Mw] - i4;
                byte[][] bArr = this.x50lh2ztY7Y5;
                int i6 = iArr[bArr.length + BjEWd04qc7Mw];
                int min = Math.min(i, i5 + i4) - i2;
                if (ahVar.rtx2ld2ELZv4(i3, bArr[BjEWd04qc7Mw], (i2 - i4) + i6, min)) {
                    i3 += min;
                    i2 += min;
                    BjEWd04qc7Mw++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ah
    public final int TSizfFm2Yiuu() {
        return this.cpQdD2nAriOS[this.x50lh2ztY7Y5.length - 1];
    }

    @Override // defpackage.ah
    public final String Y1f8riQaR6yg() {
        return new ah(r3s1LDPKFs1S()).Y1f8riQaR6yg();
    }

    @Override // defpackage.ah
    public final byte a92UlCVFR9N8(int i) {
        byte[][] bArr = this.x50lh2ztY7Y5;
        int length = bArr.length - 1;
        int[] iArr = this.cpQdD2nAriOS;
        cs0.cpQdD2nAriOS(iArr[length], i, 1L);
        int BjEWd04qc7Mw = bs0.BjEWd04qc7Mw(this, i);
        return bArr[BjEWd04qc7Mw][(i - (BjEWd04qc7Mw == 0 ? 0 : iArr[BjEWd04qc7Mw - 1])) + iArr[bArr.length + BjEWd04qc7Mw]];
    }

    @Override // defpackage.ah
    public final void cpQdD2nAriOS(yf yfVar, int i) {
        int BjEWd04qc7Mw = bs0.BjEWd04qc7Mw(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.cpQdD2nAriOS;
            int i3 = BjEWd04qc7Mw == 0 ? 0 : iArr[BjEWd04qc7Mw - 1];
            int i4 = iArr[BjEWd04qc7Mw] - i3;
            byte[][] bArr = this.x50lh2ztY7Y5;
            int i5 = iArr[bArr.length + BjEWd04qc7Mw];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            z12 z12Var = new z12(bArr[BjEWd04qc7Mw], i6, i6 + min, true, false);
            z12 z12Var2 = yfVar.rtx2ld2ELZv4;
            if (z12Var2 == null) {
                z12Var.RAsUl2FVSrh6 = z12Var;
                z12Var.a92UlCVFR9N8 = z12Var;
                yfVar.rtx2ld2ELZv4 = z12Var;
            } else {
                z12 z12Var3 = z12Var2.RAsUl2FVSrh6;
                z12Var3.getClass();
                z12Var3.lS5Rgt96tfkO(z12Var);
            }
            i2 += min;
            BjEWd04qc7Mw++;
        }
        yfVar.OPXfSBeufaJ8 += i;
    }

    @Override // defpackage.ah
    public final ah dgRBjINgWbAK() {
        return new ah(r3s1LDPKFs1S()).dgRBjINgWbAK();
    }

    @Override // defpackage.ah
    public final byte[] e9gEMXR7LXtO() {
        return r3s1LDPKFs1S();
    }

    @Override // defpackage.ah
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return ahVar.TSizfFm2Yiuu() == TSizfFm2Yiuu() && RAsUl2FVSrh6(TSizfFm2Yiuu(), ahVar);
    }

    @Override // defpackage.ah
    public final int hashCode() {
        int i = this.OPXfSBeufaJ8;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.x50lh2ztY7Y5;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.cpQdD2nAriOS;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.OPXfSBeufaJ8 = i3;
        return i3;
    }

    @Override // defpackage.ah
    public final ah lS5Rgt96tfkO(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.x50lh2ztY7Y5;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.cpQdD2nAriOS;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new ah(digest);
    }

    public final byte[] r3s1LDPKFs1S() {
        byte[] bArr = new byte[TSizfFm2Yiuu()];
        byte[][] bArr2 = this.x50lh2ztY7Y5;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.cpQdD2nAriOS;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            na.D0aTLcX6Uhyo(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.ah
    public final boolean rtx2ld2ELZv4(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0 && i <= TSizfFm2Yiuu() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int BjEWd04qc7Mw = bs0.BjEWd04qc7Mw(this, i);
            while (i < i4) {
                int[] iArr = this.cpQdD2nAriOS;
                int i5 = BjEWd04qc7Mw == 0 ? 0 : iArr[BjEWd04qc7Mw - 1];
                int i6 = iArr[BjEWd04qc7Mw] - i5;
                byte[][] bArr2 = this.x50lh2ztY7Y5;
                int i7 = iArr[bArr2.length + BjEWd04qc7Mw];
                int min = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[BjEWd04qc7Mw];
                bArr3.getClass();
                for (int i9 = 0; i9 < min; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += min;
                i += min;
                BjEWd04qc7Mw++;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ah
    public final String toString() {
        return new ah(r3s1LDPKFs1S()).toString();
    }

    @Override // defpackage.ah
    public final ah wdg6QnbFHrFF(int i, int i2) {
        if (i < 0) {
            u9.e9gEMXR7LXtO(o0.OPXfSBeufaJ8(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > TSizfFm2Yiuu()) {
            StringBuilder BRwzKIf41E4i = o0.BRwzKIf41E4i(i2, "endIndex=", " > length(");
            BRwzKIf41E4i.append(TSizfFm2Yiuu());
            BRwzKIf41E4i.append(')');
            throw new IllegalArgumentException(BRwzKIf41E4i.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            u9.e9gEMXR7LXtO(o0.rtx2ld2ELZv4(i2, i, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == TSizfFm2Yiuu()) {
            return this;
        }
        if (i == i2) {
            return ah.dgRBjINgWbAK;
        }
        int BjEWd04qc7Mw = bs0.BjEWd04qc7Mw(this, i);
        int BjEWd04qc7Mw2 = bs0.BjEWd04qc7Mw(this, i2 - 1);
        byte[][] bArr = this.x50lh2ztY7Y5;
        byte[][] bArr2 = (byte[][]) na.fRTaYY6FBZcX(bArr, BjEWd04qc7Mw, BjEWd04qc7Mw2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.cpQdD2nAriOS;
        if (BjEWd04qc7Mw <= BjEWd04qc7Mw2) {
            int i4 = BjEWd04qc7Mw;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == BjEWd04qc7Mw2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = BjEWd04qc7Mw != 0 ? iArr2[BjEWd04qc7Mw - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new e22(bArr2, iArr);
    }
}
