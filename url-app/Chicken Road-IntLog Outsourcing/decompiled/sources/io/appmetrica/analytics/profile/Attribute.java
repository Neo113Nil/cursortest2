package io.appmetrica.analytics.profile;

import b2.AbstractC0279e;
import io.appmetrica.analytics.impl.C0523an;
import io.appmetrica.analytics.impl.C0995t4;
import io.appmetrica.analytics.impl.C1106xb;
import io.appmetrica.analytics.impl.Nb;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Attribute {
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    public static BooleanAttribute customBoolean(String str) {
        return new BooleanAttribute(str, new C1106xb(), new Nb(new C0995t4(100)));
    }

    public static CounterAttribute customCounter(String str) {
        return new CounterAttribute(str, new C1106xb(), new Nb(new C0995t4(100)));
    }

    public static NumberAttribute customNumber(String str) {
        return new NumberAttribute(str, new C1106xb(), new Nb(new C0995t4(100)));
    }

    public static StringAttribute customString(String str) {
        return new StringAttribute(str, new C0523an(200, AbstractC0279e.f("String attribute \"", str, "\""), PublicLogger.getAnonymousInstance()), new C1106xb(), new Nb(new C0995t4(100)));
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
}
