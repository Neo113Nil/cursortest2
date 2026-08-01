package k0;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2281a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2282b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2283c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2284e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2285f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2286g;

    public d(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f2281a = str;
        str2.getClass();
        this.f2282b = str2;
        this.f2283c = str3;
        list.getClass();
        this.d = list;
        this.f2284e = str4;
        this.f2285f = str5;
        this.f2286g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2281a + ", mProviderPackage: " + this.f2282b + ", mQuery: " + this.f2283c + ", mSystemFont: " + this.f2284e + ", mVariationSettings: " + this.f2285f + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i4 = 0; i4 < list2.size(); i4++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
