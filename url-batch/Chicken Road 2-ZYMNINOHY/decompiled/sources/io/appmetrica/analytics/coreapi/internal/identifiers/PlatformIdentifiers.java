package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PlatformIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    private final SimpleAdvertisingIdGetter f9657a;

    /* renamed from: b, reason: collision with root package name */
    private final AppSetIdProvider f9658b;

    public PlatformIdentifiers(SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider) {
        this.f9657a = simpleAdvertisingIdGetter;
        this.f9658b = appSetIdProvider;
    }

    public static /* synthetic */ PlatformIdentifiers copy$default(PlatformIdentifiers platformIdentifiers, SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            simpleAdvertisingIdGetter = platformIdentifiers.f9657a;
        }
        if ((i4 & 2) != 0) {
            appSetIdProvider = platformIdentifiers.f9658b;
        }
        return platformIdentifiers.copy(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public final SimpleAdvertisingIdGetter component1() {
        return this.f9657a;
    }

    public final AppSetIdProvider component2() {
        return this.f9658b;
    }

    public final PlatformIdentifiers copy(SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider) {
        return new PlatformIdentifiers(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformIdentifiers)) {
            return false;
        }
        PlatformIdentifiers platformIdentifiers = (PlatformIdentifiers) obj;
        return i.a(this.f9657a, platformIdentifiers.f9657a) && i.a(this.f9658b, platformIdentifiers.f9658b);
    }

    public final SimpleAdvertisingIdGetter getAdvIdentifiersProvider() {
        return this.f9657a;
    }

    public final AppSetIdProvider getAppSetIdProvider() {
        return this.f9658b;
    }

    public int hashCode() {
        return this.f9658b.hashCode() + (this.f9657a.hashCode() * 31);
    }

    public String toString() {
        return "PlatformIdentifiers(advIdentifiersProvider=" + this.f9657a + ", appSetIdProvider=" + this.f9658b + ')';
    }
}
