package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0479a8;
import io.appmetrica.analytics.impl.C0785m4;
import io.appmetrica.analytics.impl.C0940s4;
import io.appmetrica.analytics.impl.C0968t6;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.InterfaceC0598eo;
import io.appmetrica.analytics.impl.Wm;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class FirstPartyDataEmailSha256Attribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0968t6 f13374a = new C0968t6("appmetrica_1pd_email_sha256", new C0479a8(), new Gb(new C0785m4(100)));

    /* renamed from: b, reason: collision with root package name */
    private final Yk f13375b;

    public FirstPartyDataEmailSha256Attribute(Yk yk) {
        this.f13375b = yk;
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withEmailValues(String... strArr) {
        return withEmailValues(Arrays.asList(strArr));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withEmailValues(Iterable<String> iterable) {
        String str = this.f13374a.f12770c;
        ArrayList a3 = this.f13375b.a(iterable);
        Xm xm = new Xm(200, "First party data emails attribute", PublicLogger.getAnonymousInstance());
        C0968t6 c0968t6 = this.f13374a;
        return new UserProfileUpdate<>(new Wm(str, a3, 10, xm, c0968t6.f12768a, new C0940s4(c0968t6.f12769b)));
    }
}
