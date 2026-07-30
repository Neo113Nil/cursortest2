package defpackage;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bc0 {
    public final String PxuCJdSBwIXG;
    public final String RAsUl2FVSrh6;
    public final String TSizfFm2Yiuu;
    public final List Y1f8riQaR6yg;
    public final String a92UlCVFR9N8;
    public final String e9gEMXR7LXtO;
    public final String lS5Rgt96tfkO;

    public bc0(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.PxuCJdSBwIXG = str;
        str2.getClass();
        this.lS5Rgt96tfkO = str2;
        this.TSizfFm2Yiuu = str3;
        list.getClass();
        this.Y1f8riQaR6yg = list;
        this.e9gEMXR7LXtO = str4;
        this.a92UlCVFR9N8 = str5;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        sb.append("-");
        sb.append(str4);
        if (str5 != null) {
            int length = str5.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                int codePointAt = str5.codePointAt(i);
                if (!Character.isWhitespace(codePointAt)) {
                    sb.append("-VF");
                    break;
                }
                i += Character.charCount(codePointAt);
            }
        }
        this.RAsUl2FVSrh6 = sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.PxuCJdSBwIXG + ", mProviderPackage: " + this.lS5Rgt96tfkO + ", mQuery: " + this.TSizfFm2Yiuu + ", mSystemFont: " + this.e9gEMXR7LXtO + ", mVariationSettings: " + this.a92UlCVFR9N8 + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.Y1f8riQaR6yg;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
