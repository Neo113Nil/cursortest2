package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.profile.UserProfile;

/* loaded from: classes3.dex */
public final class Oh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserProfile f988a;
    public final /* synthetic */ C0231hi b;

    public Oh(C0231hi c0231hi, UserProfile userProfile) {
        this.b = c0231hi;
        this.f988a = userProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.b;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).reportUserProfile(this.f988a);
    }
}
