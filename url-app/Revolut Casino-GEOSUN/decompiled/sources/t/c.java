package t;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2965a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2966b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2967c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2968d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2969e;

    public c(String str, String str2, String str3, List list) {
        this.f2965a = str;
        this.f2966b = str2;
        this.f2967c = str3;
        list.getClass();
        this.f2968d = list;
        this.f2969e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2965a + ", mProviderPackage: " + this.f2966b + ", mQuery: " + this.f2967c + ", mCertificates:");
        int i2 = 0;
        while (true) {
            List list = this.f2968d;
            if (i2 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i2++;
        }
    }
}
