package B;

import android.util.Base64;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f156a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158c;

    /* renamed from: d, reason: collision with root package name */
    public final List f159d;

    /* renamed from: e, reason: collision with root package name */
    public final String f160e;

    /* renamed from: f, reason: collision with root package name */
    public final String f161f;

    /* renamed from: g, reason: collision with root package name */
    public final String f162g;

    public f(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f156a = str;
        str2.getClass();
        this.f157b = str2;
        this.f158c = str3;
        list.getClass();
        this.f159d = list;
        this.f160e = str4;
        this.f161f = str5;
        this.f162g = str + TokenBuilder.TOKEN_DELIMITER + str2 + TokenBuilder.TOKEN_DELIMITER + str3 + TokenBuilder.TOKEN_DELIMITER + str4 + TokenBuilder.TOKEN_DELIMITER + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f156a + ", mProviderPackage: " + this.f157b + ", mQuery: " + this.f158c + ", mSystemFont: " + this.f160e + ", mVariationSettings: " + this.f161f + ", mCertificates:");
        int i4 = 0;
        while (true) {
            List list = this.f159d;
            if (i4 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i4);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i5), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i4++;
        }
    }
}
