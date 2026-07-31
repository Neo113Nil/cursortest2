package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class Xd {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f38523a;

    public Xd(C2545ce c2545ce) {
        this.f38523a = c2545ce;
    }

    public final Yd a(Context context, C2628fh c2628fh) {
        return new Yd(context, c2628fh, this.f38523a, new InterfaceC2652ge() { // from class: io.appmetrica.analytics.impl.Wo
            @Override // io.appmetrica.analytics.impl.InterfaceC2652ge
            public final InterfaceC2498al a(B0 b02) {
                return Xd.a(b02);
            }
        }, EnumC3063wb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final Yd b(Context context, C2628fh c2628fh) {
        return new Yd(context, c2628fh, this.f38523a, new InterfaceC2652ge() { // from class: io.appmetrica.analytics.impl.Xo
            @Override // io.appmetrica.analytics.impl.InterfaceC2652ge
            public final InterfaceC2498al a(B0 b02) {
                return Xd.b(b02);
            }
        }, EnumC3063wb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }

    public static final InterfaceC2498al a(B0 b02) {
        return new Vd(b02.f37202f.f37269d);
    }

    public static final InterfaceC2498al b(B0 b02) {
        return new W();
    }
}
