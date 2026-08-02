package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes.dex */
public final class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f6676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f6677b;

    public T0(C0815s1 c0815s1, UserProfile userProfile) {
        this.f6677b = c0815s1;
        this.f6676a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f6677b).reportUserProfile(this.f6676a);
    }
}
