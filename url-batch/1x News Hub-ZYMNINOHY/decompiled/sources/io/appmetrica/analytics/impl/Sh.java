package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes.dex */
public final class Sh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f6645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0651li f6646b;

    public Sh(C0651li c0651li, UserProfile userProfile) {
        this.f6646b = c0651li;
        this.f6645a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f6646b;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).reportUserProfile(this.f6645a);
    }
}
