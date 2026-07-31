package M2;

import G2.k;
import G2.l;
import T2.z;
import f2.j;
import n2.AbstractC0730j;
import p.P;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f3480a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3481b;

    public a(z zVar) {
        j.f(zVar, "source");
        this.f3481b = zVar;
        this.f3480a = 262144L;
    }

    public l a() {
        k kVar = new k(0);
        while (true) {
            String u3 = ((z) this.f3481b).u(this.f3480a);
            this.f3480a -= u3.length();
            if (u3.length() == 0) {
                return kVar.b();
            }
            int H3 = AbstractC0730j.H(u3, ':', 1, false, 4);
            if (H3 != -1) {
                String substring = u3.substring(0, H3);
                j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = u3.substring(H3 + 1);
                j.e(substring2, "this as java.lang.String).substring(startIndex)");
                kVar.a(substring, substring2);
            } else if (u3.charAt(0) == ':') {
                String substring3 = u3.substring(1);
                j.e(substring3, "this as java.lang.String).substring(startIndex)");
                kVar.a("", substring3);
            } else {
                kVar.a("", u3);
            }
        }
    }

    public a(P p3) {
        this.f3481b = p3;
        this.f3480a = 0L;
    }
}
