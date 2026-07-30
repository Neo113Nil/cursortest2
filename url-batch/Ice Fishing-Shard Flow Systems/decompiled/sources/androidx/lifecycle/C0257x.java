package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257x {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0249o f3918a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0254u f3919b;

    public final void a(InterfaceC0256w interfaceC0256w, EnumC0248n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        EnumC0249o a7 = event.a();
        EnumC0249o state1 = this.f3918a;
        Intrinsics.checkNotNullParameter(state1, "state1");
        if (a7.compareTo(state1) < 0) {
            state1 = a7;
        }
        this.f3918a = state1;
        this.f3919b.a(interfaceC0256w, event);
        this.f3918a = a7;
    }
}
