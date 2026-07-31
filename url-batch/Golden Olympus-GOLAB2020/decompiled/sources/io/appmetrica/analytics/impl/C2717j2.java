package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.j2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2717j2 {

    /* renamed from: a, reason: collision with root package name */
    public final Bc f39251a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f39252b;

    /* renamed from: c, reason: collision with root package name */
    public final long f39253c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39254d = true;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f39255e = new Runnable() { // from class: io.appmetrica.analytics.impl.mp
        @Override // java.lang.Runnable
        public final void run() {
            C2717j2.a(C2717j2.this);
        }
    };

    public C2717j2(Bc bc, IHandlerExecutor iHandlerExecutor, long j4) {
        this.f39251a = bc;
        this.f39252b = iHandlerExecutor;
        this.f39253c = j4;
    }

    public static final void a(C2717j2 c2717j2) {
        Cc cc = c2717j2.f39251a.f37234a;
        Ji ji = cc.f38398h;
        ji.f37841c.a(cc.f38392b.f38817a);
    }
}
