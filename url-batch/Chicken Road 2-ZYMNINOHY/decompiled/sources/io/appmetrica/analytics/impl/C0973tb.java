package io.appmetrica.analytics.impl;

import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.tb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0973tb implements Ha {

    /* renamed from: a, reason: collision with root package name */
    public final Ha f12774a;

    public C0973tb(Ha ha) {
        this.f12774a = ha;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, String str2) {
        this.f12774a.a(str, str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final void b() {
        this.f12774a.b();
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final boolean getBoolean(String str, boolean z) {
        return this.f12774a.getBoolean(str, z);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final int getInt(String str, int i4) {
        return this.f12774a.getInt(str, i4);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final long getLong(String str, long j4) {
        return this.f12774a.getLong(str, j4);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final String getString(String str, String str2) {
        return this.f12774a.getString(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha remove(String str) {
        this.f12774a.remove(str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, long j4) {
        this.f12774a.a(str, j4);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(int i4, String str) {
        this.f12774a.a(i4, str);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, boolean z) {
        this.f12774a.a(str, z);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, float f4) {
        this.f12774a.a(str, f4);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final boolean a(String str) {
        return this.f12774a.a(str);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Set a() {
        return this.f12774a.a();
    }
}
