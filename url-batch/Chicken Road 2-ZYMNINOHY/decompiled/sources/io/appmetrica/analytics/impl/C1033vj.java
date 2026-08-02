package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.vj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033vj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f12900a;

    public C1033vj(UserProfile userProfile) {
        this.f12900a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportUserProfile(this.f12900a);
    }
}
