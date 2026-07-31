package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes3.dex */
public final class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f1083a;
    public final /* synthetic */ C0541u1 b;

    public V0(C0541u1 c0541u1, UserProfile userProfile) {
        this.b = c0541u1;
        this.f1083a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0541u1.a(this.b).reportUserProfile(this.f1083a);
    }
}
