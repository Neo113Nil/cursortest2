package G2;

import A2.n;
import A2.o;
import N2.z;
import Z1.i;
import h2.AbstractC0447i;
import o.J;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f1580a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1581b;

    public a(z zVar) {
        i.f(zVar, "source");
        this.f1581b = zVar;
        this.f1580a = 262144L;
    }

    public o a() {
        n nVar = new n(0);
        while (true) {
            String u3 = ((z) this.f1581b).u(this.f1580a);
            this.f1580a -= u3.length();
            if (u3.length() == 0) {
                return nVar.b();
            }
            int q0 = AbstractC0447i.q0(u3, ':', 1, false, 4);
            if (q0 != -1) {
                String substring = u3.substring(0, q0);
                i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = u3.substring(q0 + 1);
                i.e(substring2, "this as java.lang.String).substring(startIndex)");
                nVar.a(substring, substring2);
            } else if (u3.charAt(0) == ':') {
                String substring3 = u3.substring(1);
                i.e(substring3, "this as java.lang.String).substring(startIndex)");
                nVar.a("", substring3);
            } else {
                nVar.a("", u3);
            }
        }
    }

    public a(J j3) {
        this.f1581b = j3;
        this.f1580a = 0L;
    }
}
