package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes.dex */
public final class Pd {

    /* renamed from: a, reason: collision with root package name */
    public final l2.l f6461a;

    public Pd(Ud ud) {
        this.f6461a = ud;
    }

    public final Qd a(Context context, Xg xg) {
        return new Qd(context, xg, this.f6461a, new Y1.M(16), EnumC0567ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final Qd b(Context context, Xg xg) {
        return new Qd(context, xg, this.f6461a, new Y1.M(17), EnumC0567ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }

    public static final InterfaceC0473el a(E0 e02) {
        return new Nd(e02.f.f5975d);
    }

    public static final InterfaceC0473el b(E0 e02) {
        return new X();
    }
}
