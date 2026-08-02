package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes.dex */
public final class U0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f11030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f11031b;

    public U0(C0963t1 c0963t1, UserProfile userProfile) {
        this.f11031b = c0963t1;
        this.f11030a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f11031b).reportUserProfile(this.f11030a);
    }
}
