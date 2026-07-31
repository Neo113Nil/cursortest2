package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.od, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0404od {

    /* renamed from: a, reason: collision with root package name */
    public final C0665z0 f1413a;
    public final C0200gd b;
    public final C0578vd c;
    public final IHandlerExecutor d;

    public C0404od() {
        C0665z0 d = C0088c4.l().d();
        this.f1413a = d;
        this.b = new C0200gd(d);
        this.c = new C0578vd();
        this.d = C0088c4.l().g().a();
    }

    public static final Ja a(C0404od c0404od) {
        c0404od.f1413a.getClass();
        C0640y0 c0640y0 = C0640y0.e;
        Intrinsics.checkNotNull(c0640y0);
        C0302kc i = c0640y0.f().i();
        Intrinsics.checkNotNull(i);
        return i.f1341a;
    }
}
