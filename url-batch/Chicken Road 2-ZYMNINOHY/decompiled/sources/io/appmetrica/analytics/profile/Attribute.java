package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.Be;
import io.appmetrica.analytics.impl.C0785m4;
import io.appmetrica.analytics.impl.C0830nn;
import io.appmetrica.analytics.impl.C0896qb;
import io.appmetrica.analytics.impl.C1022v8;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public final class Attribute {
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    public static BooleanAttribute customBoolean(String str) {
        return new BooleanAttribute(str, new C0896qb(), new Gb(new C0785m4(100)));
    }

    public static CounterAttribute customCounter(String str) {
        return new CounterAttribute(str, new C0896qb(), new Gb(new C0785m4(100)));
    }

    public static NumberAttribute customNumber(String str) {
        return new NumberAttribute(str, new C0896qb(), new Gb(new C0785m4(100)));
    }

    public static StringAttribute customString(String str) {
        return new StringAttribute(str, new Xm(200, AbstractC1514c.a("String attribute \"", str, "\""), PublicLogger.getAnonymousInstance()), new C0896qb(), new Gb(new C0785m4(100)));
    }

    public static FirstPartyDataEmailSha256Attribute emailHash() {
        return new FirstPartyDataEmailSha256Attribute(new Yk(new C1022v8()));
    }

    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    public static NameAttribute name() {
        return new NameAttribute();
    }

    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }

    public static FirstPartyDataPhoneSha256Attribute phoneHash() {
        return new FirstPartyDataPhoneSha256Attribute(new Yk(new Be()));
    }

    public static FirstPartyDataTelegramLoginSha256Attribute telegramLoginHash() {
        return new FirstPartyDataTelegramLoginSha256Attribute(new Yk(new C0830nn()));
    }
}
