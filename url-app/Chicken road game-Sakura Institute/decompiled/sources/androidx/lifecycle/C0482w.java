package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0482w {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0475o f5491a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0479t f5492b;

    public final void a(InterfaceC0481v interfaceC0481v, EnumC0474n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        EnumC0475o a4 = event.a();
        EnumC0475o state1 = this.f5491a;
        Intrinsics.checkNotNullParameter(state1, "state1");
        if (a4.compareTo(state1) < 0) {
            state1 = a4;
        }
        this.f5491a = state1;
        this.f5492b.b(interfaceC0481v, event);
        this.f5491a = a4;
    }
}
