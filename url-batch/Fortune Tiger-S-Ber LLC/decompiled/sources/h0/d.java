package h0;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f1979a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1980b;
    public final String c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1981d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1982e;

    public d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f1979a = str;
        str2.getClass();
        this.f1980b = str2;
        this.c = str3;
        list.getClass();
        this.f1981d = list;
        this.f1982e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1979a + ", mProviderPackage: " + this.f1980b + ", mQuery: " + this.c + ", mCertificates:");
        int i4 = 0;
        while (true) {
            List list = this.f1981d;
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
