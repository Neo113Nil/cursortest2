package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.wj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0609wj implements Ra {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f1551a;

    public C0609wj(UserProfile userProfile) {
        this.f1551a = userProfile;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa) {
        sa.reportUserProfile(this.f1551a);
    }
}
