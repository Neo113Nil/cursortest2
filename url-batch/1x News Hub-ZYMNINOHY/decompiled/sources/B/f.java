package B;

import android.util.Base64;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f84a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86c;

    /* renamed from: d, reason: collision with root package name */
    public final List f87d;

    /* renamed from: e, reason: collision with root package name */
    public final String f88e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f89g;

    public f(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f84a = str;
        str2.getClass();
        this.f85b = str2;
        this.f86c = str3;
        list.getClass();
        this.f87d = list;
        this.f88e = str4;
        this.f = str5;
        this.f89g = str + TokenBuilder.TOKEN_DELIMITER + str2 + TokenBuilder.TOKEN_DELIMITER + str3 + TokenBuilder.TOKEN_DELIMITER + str4 + TokenBuilder.TOKEN_DELIMITER + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f84a + ", mProviderPackage: " + this.f85b + ", mQuery: " + this.f86c + ", mSystemFont: " + this.f88e + ", mVariationSettings: " + this.f + ", mCertificates:");
        int i3 = 0;
        while (true) {
            List list = this.f87d;
            if (i3 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i3);
            for (int i4 = 0; i4 < list2.size(); i4++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i3++;
        }
    }
}
