package k0;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2133a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2134b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2135c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2136e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2137f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2138g;

    public d(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f2133a = str;
        str2.getClass();
        this.f2134b = str2;
        this.f2135c = str3;
        list.getClass();
        this.d = list;
        this.f2136e = str4;
        this.f2137f = str5;
        this.f2138g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2133a + ", mProviderPackage: " + this.f2134b + ", mQuery: " + this.f2135c + ", mSystemFont: " + this.f2136e + ", mVariationSettings: " + this.f2137f + ", mCertificates:");
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
