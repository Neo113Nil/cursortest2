package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ad2 {
    public static final zc2 Companion = new zc2();
    public final String PxuCJdSBwIXG;
    public final int RAsUl2FVSrh6;
    public final boolean TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;
    public final int a92UlCVFR9N8;
    public final String e9gEMXR7LXtO;
    public final String lS5Rgt96tfkO;

    public ad2(String str, String str2, boolean z, int i, String str3, int i2) {
        str.getClass();
        str2.getClass();
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = str2;
        this.TSizfFm2Yiuu = z;
        this.Y1f8riQaR6yg = i;
        this.e9gEMXR7LXtO = str3;
        this.a92UlCVFR9N8 = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.RAsUl2FVSrh6 = ia2.jJwa0q7P5wHq(upperCase, "INT", false) ? 3 : (ia2.jJwa0q7P5wHq(upperCase, "CHAR", false) || ia2.jJwa0q7P5wHq(upperCase, "CLOB", false) || ia2.jJwa0q7P5wHq(upperCase, "TEXT", false)) ? 2 : ia2.jJwa0q7P5wHq(upperCase, "BLOB", false) ? 5 : (ia2.jJwa0q7P5wHq(upperCase, "REAL", false) || ia2.jJwa0q7P5wHq(upperCase, "FLOA", false) || ia2.jJwa0q7P5wHq(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ad2) {
                boolean z = this.Y1f8riQaR6yg > 0;
                ad2 ad2Var = (ad2) obj;
                int i = ad2Var.a92UlCVFR9N8;
                if (z == (ad2Var.Y1f8riQaR6yg > 0) && cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, ad2Var.PxuCJdSBwIXG) && this.TSizfFm2Yiuu == ad2Var.TSizfFm2Yiuu) {
                    String str = ad2Var.e9gEMXR7LXtO;
                    int i2 = this.a92UlCVFR9N8;
                    String str2 = this.e9gEMXR7LXtO;
                    if ((i2 != 1 || i != 2 || str2 == null || vi0.QrzZRwfaDlRX(str2, str)) && ((i2 != 2 || i != 1 || str == null || vi0.QrzZRwfaDlRX(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : vi0.QrzZRwfaDlRX(str2, str))) && this.RAsUl2FVSrh6 == ad2Var.RAsUl2FVSrh6))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.PxuCJdSBwIXG.hashCode() * 31) + this.RAsUl2FVSrh6) * 31) + (this.TSizfFm2Yiuu ? 1231 : 1237)) * 31) + this.Y1f8riQaR6yg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.PxuCJdSBwIXG);
        sb.append("',\n            |   type = '");
        sb.append(this.lS5Rgt96tfkO);
        sb.append("',\n            |   affinity = '");
        sb.append(this.RAsUl2FVSrh6);
        sb.append("',\n            |   notNull = '");
        sb.append(this.TSizfFm2Yiuu);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.Y1f8riQaR6yg);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e9gEMXR7LXtO;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return ja2.POWyO8hTM6YC(ja2.zf8DYfih6EZu(sb.toString()));
    }
}
