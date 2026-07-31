package n3;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f5339a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5340b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5341c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5342d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5343e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5344f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5345g;

    public c(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f5339a = str;
        str2.getClass();
        this.f5340b = str2;
        this.f5341c = str3;
        list.getClass();
        this.f5342d = list;
        this.f5343e = str4;
        this.f5344f = str5;
        this.f5345g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f5339a + ", mProviderPackage: " + this.f5340b + ", mQuery: " + this.f5341c + ", mSystemFont: " + this.f5343e + ", mVariationSettings: " + this.f5344f + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f5342d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i8 = 0; i8 < list2.size(); i8++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i8), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
