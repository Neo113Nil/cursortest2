package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0370n4;
import io.appmetrica.analytics.impl.C0414on;
import io.appmetrica.analytics.impl.C0476rb;
import io.appmetrica.analytics.impl.C0598w8;
import io.appmetrica.analytics.impl.Ce;
import io.appmetrica.analytics.impl.Hb;
import io.appmetrica.analytics.impl.Ym;
import io.appmetrica.analytics.impl.Zk;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class Attribute {
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    public static BooleanAttribute customBoolean(String str) {
        return new BooleanAttribute(str, new C0476rb(), new Hb(new C0370n4(100)));
    }

    public static CounterAttribute customCounter(String str) {
        return new CounterAttribute(str, new C0476rb(), new Hb(new C0370n4(100)));
    }

    public static NumberAttribute customNumber(String str) {
        return new NumberAttribute(str, new C0476rb(), new Hb(new C0370n4(100)));
    }

    public static StringAttribute customString(String str) {
        return new StringAttribute(str, new Ym(200, "String attribute \"" + str + "\"", PublicLogger.getAnonymousInstance()), new C0476rb(), new Hb(new C0370n4(100)));
    }

    public static FirstPartyDataEmailSha256Attribute emailHash() {
        return new FirstPartyDataEmailSha256Attribute(new Zk(new C0598w8()));
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
        return new FirstPartyDataPhoneSha256Attribute(new Zk(new Ce()));
    }

    public static FirstPartyDataTelegramLoginSha256Attribute telegramLoginHash() {
        return new FirstPartyDataTelegramLoginSha256Attribute(new Zk(new C0414on()));
    }
}
