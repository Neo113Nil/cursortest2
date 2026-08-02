package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class AppSetId {

    /* renamed from: a, reason: collision with root package name */
    private final String f9651a;

    /* renamed from: b, reason: collision with root package name */
    private final AppSetIdScope f9652b;

    public AppSetId(String str, AppSetIdScope appSetIdScope) {
        this.f9651a = str;
        this.f9652b = appSetIdScope;
    }

    public static /* synthetic */ AppSetId copy$default(AppSetId appSetId, String str, AppSetIdScope appSetIdScope, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = appSetId.f9651a;
        }
        if ((i4 & 2) != 0) {
            appSetIdScope = appSetId.f9652b;
        }
        return appSetId.copy(str, appSetIdScope);
    }

    public final String component1() {
        return this.f9651a;
    }

    public final AppSetIdScope component2() {
        return this.f9652b;
    }

    public final AppSetId copy(String str, AppSetIdScope appSetIdScope) {
        return new AppSetId(str, appSetIdScope);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return i.a(this.f9651a, appSetId.f9651a) && this.f9652b == appSetId.f9652b;
    }

    public final String getId() {
        return this.f9651a;
    }

    public final AppSetIdScope getScope() {
        return this.f9652b;
    }

    public int hashCode() {
        String str = this.f9651a;
        return this.f9652b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "AppSetId(id=" + this.f9651a + ", scope=" + this.f9652b + ')';
    }
}
