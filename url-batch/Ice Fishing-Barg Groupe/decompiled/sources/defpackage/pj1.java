package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pj1 {
    public static final oj1 Companion = new oj1();
    public String PxuCJdSBwIXG;
    public int TSizfFm2Yiuu;
    public int Y1f8riQaR6yg;
    public of0 lS5Rgt96tfkO;

    public final int PxuCJdSBwIXG() {
        of0 of0Var = this.lS5Rgt96tfkO;
        String str = this.PxuCJdSBwIXG;
        if (of0Var == null) {
            return str.length();
        }
        return (of0Var.lS5Rgt96tfkO - of0Var.lS5Rgt96tfkO()) + (str.length() - (this.Y1f8riQaR6yg - this.TSizfFm2Yiuu));
    }

    public final void lS5Rgt96tfkO(int i, int i2, String str) {
        if (i > i2) {
            fp0.PxuCJdSBwIXG("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            fp0.PxuCJdSBwIXG("start must be non-negative, but was " + i);
        }
        of0 of0Var = this.lS5Rgt96tfkO;
        if (of0Var == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(this.PxuCJdSBwIXG.length() - i2, 64);
            String str2 = this.PxuCJdSBwIXG;
            int i3 = i - min;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = this.PxuCJdSBwIXG;
            int i4 = max - min2;
            int i5 = min2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            of0 of0Var2 = new of0();
            of0Var2.lS5Rgt96tfkO = max;
            of0Var2.e9gEMXR7LXtO = cArr;
            of0Var2.TSizfFm2Yiuu = length;
            of0Var2.Y1f8riQaR6yg = i4;
            this.lS5Rgt96tfkO = of0Var2;
            this.TSizfFm2Yiuu = i3;
            this.Y1f8riQaR6yg = i5;
            return;
        }
        int i6 = this.TSizfFm2Yiuu;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > of0Var.lS5Rgt96tfkO - of0Var.lS5Rgt96tfkO()) {
            this.PxuCJdSBwIXG = toString();
            this.lS5Rgt96tfkO = null;
            this.TSizfFm2Yiuu = -1;
            this.Y1f8riQaR6yg = -1;
            lS5Rgt96tfkO(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > of0Var.lS5Rgt96tfkO()) {
            int lS5Rgt96tfkO = length2 - of0Var.lS5Rgt96tfkO();
            int i9 = of0Var.lS5Rgt96tfkO;
            do {
                i9 *= 2;
            } while (i9 - of0Var.lS5Rgt96tfkO < lS5Rgt96tfkO);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) of0Var.e9gEMXR7LXtO, 0, cArr2, 0, of0Var.TSizfFm2Yiuu);
            int i10 = of0Var.lS5Rgt96tfkO;
            int i11 = of0Var.Y1f8riQaR6yg;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) of0Var.e9gEMXR7LXtO, i11, cArr2, i13, (i12 + i11) - i11);
            of0Var.e9gEMXR7LXtO = cArr2;
            of0Var.lS5Rgt96tfkO = i9;
            of0Var.Y1f8riQaR6yg = i13;
        }
        int i14 = of0Var.TSizfFm2Yiuu;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) of0Var.e9gEMXR7LXtO;
            System.arraycopy(cArr3, i8, cArr3, of0Var.Y1f8riQaR6yg - i15, i15);
            of0Var.TSizfFm2Yiuu = i7;
            of0Var.Y1f8riQaR6yg -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int lS5Rgt96tfkO2 = of0Var.lS5Rgt96tfkO() + i7;
            int lS5Rgt96tfkO3 = of0Var.lS5Rgt96tfkO() + i8;
            int i16 = of0Var.Y1f8riQaR6yg;
            int i17 = lS5Rgt96tfkO2 - i16;
            char[] cArr4 = (char[]) of0Var.e9gEMXR7LXtO;
            System.arraycopy(cArr4, i16, cArr4, of0Var.TSizfFm2Yiuu, i17);
            of0Var.TSizfFm2Yiuu += i17;
            of0Var.Y1f8riQaR6yg = lS5Rgt96tfkO3;
        } else {
            of0Var.Y1f8riQaR6yg = of0Var.lS5Rgt96tfkO() + i8;
            of0Var.TSizfFm2Yiuu = i7;
        }
        str.getChars(0, str.length(), (char[]) of0Var.e9gEMXR7LXtO, of0Var.TSizfFm2Yiuu);
        of0Var.TSizfFm2Yiuu = str.length() + of0Var.TSizfFm2Yiuu;
    }

    public final String toString() {
        of0 of0Var = this.lS5Rgt96tfkO;
        String str = this.PxuCJdSBwIXG;
        if (of0Var == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, this.TSizfFm2Yiuu);
        sb.append((char[]) of0Var.e9gEMXR7LXtO, 0, of0Var.TSizfFm2Yiuu);
        char[] cArr = (char[]) of0Var.e9gEMXR7LXtO;
        int i = of0Var.Y1f8riQaR6yg;
        sb.append(cArr, i, of0Var.lS5Rgt96tfkO - i);
        String str2 = this.PxuCJdSBwIXG;
        sb.append((CharSequence) str2, this.Y1f8riQaR6yg, str2.length());
        return sb.toString();
    }
}
