package H;

import K.X;
import U.u;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f260b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f261c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f262e;

    /* renamed from: f, reason: collision with root package name */
    public Object f263f;

    public e(o1.l lVar, String str, o1.j jVar, h1.d dVar, Map map) {
        d1.d.e(lVar, "url");
        d1.d.e(str, "method");
        this.f261c = lVar;
        this.f260b = str;
        this.d = jVar;
        this.f262e = map;
    }

    public u a() {
        u uVar = new u();
        uVar.d = new LinkedHashMap();
        uVar.f874a = (o1.l) this.f261c;
        uVar.f875b = (String) this.f260b;
        Map map = (Map) this.f262e;
        uVar.d = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        uVar.f876c = ((o1.j) this.d).c();
        return uVar;
    }

    public String toString() {
        switch (this.f259a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f260b) + ", mProviderPackage: " + ((String) this.f261c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f263f;
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
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb2 = new StringBuilder("Request{method=");
                sb2.append((String) this.f260b);
                sb2.append(", url=");
                sb2.append((o1.l) this.f261c);
                o1.j jVar = (o1.j) this.d;
                if (jVar.size() != 0) {
                    sb2.append(", headers=[");
                    Iterator it = jVar.iterator();
                    int i3 = 0;
                    while (true) {
                        X x2 = (X) it;
                        if (x2.hasNext()) {
                            Object next = x2.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            R0.c cVar = (R0.c) next;
                            String str = (String) cVar.f773a;
                            String str2 = (String) cVar.f774b;
                            if (i3 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(str);
                            sb2.append(':');
                            sb2.append(str2);
                            i3 = i4;
                        } else {
                            sb2.append(']');
                        }
                    }
                }
                Map map = (Map) this.f262e;
                if (!map.isEmpty()) {
                    sb2.append(", tags=");
                    sb2.append(map);
                }
                sb2.append('}');
                String sb3 = sb2.toString();
                d1.d.d(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
        }
    }

    public e(LinearLayout linearLayout, TextView textView, ImageView imageView, LinearLayout linearLayout2, TextView textView2) {
        this.f260b = linearLayout;
        this.f261c = textView;
        this.d = imageView;
        this.f262e = linearLayout2;
        this.f263f = textView2;
    }

    public e(String str, String str2, String str3, List list) {
        str.getClass();
        this.f260b = str;
        str2.getClass();
        this.f261c = str2;
        this.d = str3;
        list.getClass();
        this.f263f = list;
        this.f262e = str + "-" + str2 + "-" + str3;
    }
}
