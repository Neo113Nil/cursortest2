package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.kd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0303kd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0404od f1342a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public C0303kd(C0404od c0404od, int i, String str) {
        this.f1342a = c0404od;
        this.b = i;
        this.c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0404od.a(this.f1342a).a(new G9(this.b, this.c));
    }
}
