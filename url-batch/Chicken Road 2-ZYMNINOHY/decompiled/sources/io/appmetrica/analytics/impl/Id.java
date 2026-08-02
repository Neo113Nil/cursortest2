package io.appmetrica.analytics.impl;

import android.content.Context;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class Id {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1339l f10435a;

    public Id(Nd nd) {
        this.f10435a = nd;
    }

    public final Jd a(Context context, Sg sg) {
        return new Jd(context, sg, this.f10435a, new b0.c(25), EnumC0508bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final Jd b(Context context, Sg sg) {
        return new Jd(context, sg, this.f10435a, new b0.c(26), EnumC0508bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }

    public static final InterfaceC0492al a(G0 g02) {
        return new Gd(g02.f10305f.f10351d);
    }

    public static final InterfaceC0492al b(G0 g02) {
        return new X();
    }
}
