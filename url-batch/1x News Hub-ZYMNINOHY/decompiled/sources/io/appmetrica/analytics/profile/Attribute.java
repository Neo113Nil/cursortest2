package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.impl.C0372an;
import io.appmetrica.analytics.impl.C0844t4;
import io.appmetrica.analytics.impl.C0955xb;
import io.appmetrica.analytics.impl.Nb;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import w0.AbstractC1234c;

/* loaded from: classes.dex */
public final class Attribute {
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    public static BooleanAttribute customBoolean(String str) {
        return new BooleanAttribute(str, new C0955xb(), new Nb(new C0844t4(100)));
    }

    public static CounterAttribute customCounter(String str) {
        return new CounterAttribute(str, new C0955xb(), new Nb(new C0844t4(100)));
    }

    public static NumberAttribute customNumber(String str) {
        return new NumberAttribute(str, new C0955xb(), new Nb(new C0844t4(100)));
    }

    public static StringAttribute customString(String str) {
        return new StringAttribute(str, new C0372an(200, AbstractC1234c.a("String attribute \"", str, "\""), PublicLogger.getAnonymousInstance()), new C0955xb(), new Nb(new C0844t4(100)));
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
