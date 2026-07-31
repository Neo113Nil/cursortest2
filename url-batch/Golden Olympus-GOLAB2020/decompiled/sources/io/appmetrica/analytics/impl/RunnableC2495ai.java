package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* renamed from: io.appmetrica.analytics.impl.ai, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2495ai implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f38678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2992ti f38679b;

    public RunnableC2495ai(C2992ti c2992ti, UserProfile userProfile) {
        this.f38679b = c2992ti;
        this.f38678a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f38679b;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).reportUserProfile(this.f38678a);
    }
}
