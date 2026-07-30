package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class et {
    public final boolean OPXfSBeufaJ8;
    public final String PxuCJdSBwIXG;
    public final boolean RAsUl2FVSrh6;
    public final long TSizfFm2Yiuu;
    public final String Y1f8riQaR6yg;
    public final boolean a92UlCVFR9N8;
    public final String e9gEMXR7LXtO;
    public final String lS5Rgt96tfkO;
    public final boolean rtx2ld2ELZv4;
    public final String wdg6QnbFHrFF;
    public static final dt Companion = new dt();
    public static final Pattern dgRBjINgWbAK = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern x50lh2ztY7Y5 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern cpQdD2nAriOS = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern r3s1LDPKFs1S = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public et(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = str2;
        this.TSizfFm2Yiuu = j;
        this.Y1f8riQaR6yg = str3;
        this.e9gEMXR7LXtO = str4;
        this.a92UlCVFR9N8 = z;
        this.RAsUl2FVSrh6 = z2;
        this.rtx2ld2ELZv4 = z3;
        this.OPXfSBeufaJ8 = z4;
        this.wdg6QnbFHrFF = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof et)) {
            return false;
        }
        et etVar = (et) obj;
        return etVar.PxuCJdSBwIXG.equals(this.PxuCJdSBwIXG) && etVar.lS5Rgt96tfkO.equals(this.lS5Rgt96tfkO) && etVar.TSizfFm2Yiuu == this.TSizfFm2Yiuu && etVar.Y1f8riQaR6yg.equals(this.Y1f8riQaR6yg) && etVar.e9gEMXR7LXtO.equals(this.e9gEMXR7LXtO) && etVar.a92UlCVFR9N8 == this.a92UlCVFR9N8 && etVar.RAsUl2FVSrh6 == this.RAsUl2FVSrh6 && etVar.rtx2ld2ELZv4 == this.rtx2ld2ELZv4 && etVar.OPXfSBeufaJ8 == this.OPXfSBeufaJ8 && cs0.wdg6QnbFHrFF(etVar.wdg6QnbFHrFF, this.wdg6QnbFHrFF);
    }

    public final int hashCode() {
        int Y1f8riQaR6yg = o0.Y1f8riQaR6yg(o0.Y1f8riQaR6yg(o0.Y1f8riQaR6yg(o0.Y1f8riQaR6yg((this.e9gEMXR7LXtO.hashCode() + ((this.Y1f8riQaR6yg.hashCode() + o0.TSizfFm2Yiuu((this.lS5Rgt96tfkO.hashCode() + ((this.PxuCJdSBwIXG.hashCode() + 527) * 31)) * 31, 31, this.TSizfFm2Yiuu)) * 31)) * 31, 31, this.a92UlCVFR9N8), 31, this.RAsUl2FVSrh6), 31, this.rtx2ld2ELZv4), 31, this.OPXfSBeufaJ8);
        String str = this.wdg6QnbFHrFF;
        return Y1f8riQaR6yg + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.PxuCJdSBwIXG);
        sb.append('=');
        sb.append(this.lS5Rgt96tfkO);
        if (this.rtx2ld2ELZv4) {
            long j = this.TSizfFm2Yiuu;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) wv.PxuCJdSBwIXG.get()).format(new Date(j));
                format.getClass();
                sb.append(format);
            }
        }
        if (!this.OPXfSBeufaJ8) {
            sb.append("; domain=");
            sb.append(this.Y1f8riQaR6yg);
        }
        sb.append("; path=");
        sb.append(this.e9gEMXR7LXtO);
        if (this.a92UlCVFR9N8) {
            sb.append("; secure");
        }
        if (this.RAsUl2FVSrh6) {
            sb.append("; httponly");
        }
        String str = this.wdg6QnbFHrFF;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        return sb.toString();
    }
}
