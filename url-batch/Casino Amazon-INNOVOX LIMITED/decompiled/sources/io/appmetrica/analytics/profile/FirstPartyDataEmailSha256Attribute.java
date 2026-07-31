package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0066b8;
import io.appmetrica.analytics.impl.C0370n4;
import io.appmetrica.analytics.impl.C0519t4;
import io.appmetrica.analytics.impl.C0546u6;
import io.appmetrica.analytics.impl.Hb;
import io.appmetrica.analytics.impl.InterfaceC0185fo;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Ym;
import io.appmetrica.analytics.impl.Zk;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class FirstPartyDataEmailSha256Attribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0546u6 f1684a = new C0546u6("appmetrica_1pd_email_sha256", new C0066b8(), new Hb(new C0370n4(100)));
    private final Zk b;

    FirstPartyDataEmailSha256Attribute(Zk zk) {
        this.b = zk;
    }

    public UserProfileUpdate<? extends InterfaceC0185fo> withEmailValues(String... strArr) {
        return withEmailValues(Arrays.asList(strArr));
    }

    public UserProfileUpdate<? extends InterfaceC0185fo> withEmailValues(Iterable<String> iterable) {
        String str = this.f1684a.c;
        ArrayList a2 = this.b.a(iterable);
        Ym ym = new Ym(200, "First party data emails attribute", PublicLogger.getAnonymousInstance());
        C0546u6 c0546u6 = this.f1684a;
        return new UserProfileUpdate<>(new Xm(str, a2, 10, ym, c0546u6.f1510a, new C0519t4(c0546u6.b)));
    }
}
