package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class AppSetId {

    /* renamed from: a, reason: collision with root package name */
    private final String f5398a;

    /* renamed from: b, reason: collision with root package name */
    private final AppSetIdScope f5399b;

    public AppSetId(String str, AppSetIdScope appSetIdScope) {
        this.f5398a = str;
        this.f5399b = appSetIdScope;
    }

    public static /* synthetic */ AppSetId copy$default(AppSetId appSetId, String str, AppSetIdScope appSetIdScope, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = appSetId.f5398a;
        }
        if ((i3 & 2) != 0) {
            appSetIdScope = appSetId.f5399b;
        }
        return appSetId.copy(str, appSetIdScope);
    }

    public final String component1() {
        return this.f5398a;
    }

    public final AppSetIdScope component2() {
        return this.f5399b;
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
        return j.a(this.f5398a, appSetId.f5398a) && this.f5399b == appSetId.f5399b;
    }

    public final String getId() {
        return this.f5398a;
    }

    public final AppSetIdScope getScope() {
        return this.f5399b;
    }

    public int hashCode() {
        String str = this.f5398a;
        return this.f5399b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "AppSetId(id=" + this.f5398a + ", scope=" + this.f5399b + ')';
    }
}
