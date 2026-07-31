package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes3.dex */
public final class Q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f38147a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f38148b;

    public Q0(C2872p1 c2872p1, UserProfile userProfile) {
        this.f38148b = c2872p1;
        this.f38147a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f38148b).reportUserProfile(this.f38147a);
    }
}
