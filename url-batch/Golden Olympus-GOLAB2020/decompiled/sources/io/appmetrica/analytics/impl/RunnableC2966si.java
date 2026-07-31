package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.si, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2966si implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2992ti f39809c;

    public RunnableC2966si(C2992ti c2992ti, String str, String str2) {
        this.f39809c = c2992ti;
        this.f39807a = str;
        this.f39808b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f39809c;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).reportEvent(this.f39807a, this.f39808b);
    }
}
