package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Zh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2992ti f38625b;

    public Zh(C2992ti c2992ti, String str) {
        this.f38625b = c2992ti;
        this.f38624a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f38625b;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).setUserProfileID(this.f38624a);
    }
}
