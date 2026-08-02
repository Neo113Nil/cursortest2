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
public class FirstPartyDataTelegramLoginSha256Attribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0968t6 f13378a = new C0968t6("appmetrica_1pd_telegram_sha256", new C0479a8(), new Gb(new C0785m4(100)));

    /* renamed from: b, reason: collision with root package name */
    private final Yk f13379b;

    public FirstPartyDataTelegramLoginSha256Attribute(Yk yk) {
        this.f13379b = yk;
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withTelegramLoginValues(String... strArr) {
        return withTelegramLoginValues(Arrays.asList(strArr));
    }

    public UserProfileUpdate<? extends InterfaceC0598eo> withTelegramLoginValues(Iterable<String> iterable) {
        String str = this.f13378a.f12770c;
        ArrayList a3 = this.f13379b.a(iterable);
        Xm xm = new Xm(200, "First party data telegram logins attribute", PublicLogger.getAnonymousInstance());
        C0968t6 c0968t6 = this.f13378a;
        return new UserProfileUpdate<>(new Wm(str, a3, 10, xm, c0968t6.f12768a, new C0940s4(c0968t6.f12769b)));
    }
}
