package d6;

import Q4.j;
import X5.n;
import kotlin.jvm.internal.i;
import n6.q;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final n6.h f3970a;

    /* renamed from: b, reason: collision with root package name */
    public long f3971b;

    public a(q source) {
        i.e(source, "source");
        this.f3970a = source;
        this.f3971b = 262144L;
    }

    public final n a() {
        j jVar = new j(2);
        while (true) {
            String w5 = this.f3970a.w(this.f3971b);
            this.f3971b -= w5.length();
            if (w5.length() == 0) {
                return jVar.c();
            }
            int Q6 = F5.j.Q(w5, ':', 1, 4);
            if (Q6 != -1) {
                String substring = w5.substring(0, Q6);
                i.d(substring, "substring(...)");
                String substring2 = w5.substring(Q6 + 1);
                i.d(substring2, "substring(...)");
                i6.g.j(jVar, substring, substring2);
            } else if (w5.charAt(0) == ':') {
                String substring3 = w5.substring(1);
                i.d(substring3, "substring(...)");
                i6.g.j(jVar, "", substring3);
            } else {
                i6.g.j(jVar, "", w5);
            }
        }
    }
}
