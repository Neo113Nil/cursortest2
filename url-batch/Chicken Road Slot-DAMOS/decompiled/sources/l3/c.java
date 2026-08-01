package l3;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f5834a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5835b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5836c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5837d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5838e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5839f;
    public final String g;

    public c(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f5834a = str;
        str2.getClass();
        this.f5835b = str2;
        this.f5836c = str3;
        list.getClass();
        this.f5837d = list;
        this.f5838e = str4;
        this.f5839f = str5;
        this.g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f5834a + ", mProviderPackage: " + this.f5835b + ", mQuery: " + this.f5836c + ", mSystemFont: " + this.f5838e + ", mVariationSettings: " + this.f5839f + ", mCertificates:");
        int i3 = 0;
        while (true) {
            List list = this.f5837d;
            if (i3 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i3);
            for (int i10 = 0; i10 < list2.size(); i10++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i3++;
        }
    }
}
