package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes.dex */
public final class Nh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f10716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0644gi f10717b;

    public Nh(C0644gi c0644gi, UserProfile userProfile) {
        this.f10717b = c0644gi;
        this.f10716a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f10717b;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).reportUserProfile(this.f10716a);
    }
}
