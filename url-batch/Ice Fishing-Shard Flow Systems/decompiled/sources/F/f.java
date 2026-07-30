package F;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f724a;

    /* renamed from: b, reason: collision with root package name */
    public final String f725b;

    /* renamed from: c, reason: collision with root package name */
    public final String f726c;

    /* renamed from: d, reason: collision with root package name */
    public final List f727d;

    /* renamed from: e, reason: collision with root package name */
    public final String f728e;

    /* renamed from: f, reason: collision with root package name */
    public final String f729f;

    /* renamed from: g, reason: collision with root package name */
    public final String f730g;

    public f(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f724a = str;
        str2.getClass();
        this.f725b = str2;
        this.f726c = str3;
        list.getClass();
        this.f727d = list;
        this.f728e = str4;
        this.f729f = str5;
        this.f730g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f724a + ", mProviderPackage: " + this.f725b + ", mQuery: " + this.f726c + ", mSystemFont: " + this.f728e + ", mVariationSettings: " + this.f729f + ", mCertificates:");
        int i2 = 0;
        while (true) {
            List list = this.f727d;
            if (i2 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i2);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i5), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i2++;
        }
    }
}
