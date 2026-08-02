package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0776qd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0879ud f8161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8163c;

    public C0776qd(C0879ud c0879ud, int i3, String str) {
        this.f8161a = c0879ud;
        this.f8162b = i3;
        this.f8163c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0879ud.a(this.f8161a).a(new M9(this.f8162b, this.f8163c));
    }
}
