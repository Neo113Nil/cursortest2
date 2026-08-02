package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asy extends ate {
    public asy(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        axt axtVar = this.c;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            asq.a().e(axt.a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long h = ksl.h(millis, 900000L);
        long h2 = ksl.h(millis, 900000L);
        if (h < 900000) {
            asq.a().e(axt.a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        axtVar.i = ksl.h(h, 900000L);
        if (h2 < 300000) {
            asq.a().e(axt.a, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (h2 > axtVar.i) {
            asq.a().e(axt.a, "Flex duration greater than interval duration; Changed to " + h);
        }
        axtVar.j = ksl.j(h2, 300000L, axtVar.i);
    }

    @Override // defpackage.ate
    public final /* bridge */ /* synthetic */ bvw a() {
        if (this.a && this.c.k.d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        axt axtVar = this.c;
        if (axtVar.r) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new bvw(this.b, axtVar, this.d);
    }
}
