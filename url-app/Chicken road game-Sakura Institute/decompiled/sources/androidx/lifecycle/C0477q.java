package androidx.lifecycle;

import W2.C0299v;
import W2.InterfaceC0280c0;
import W2.InterfaceC0302y;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477q implements InterfaceC0479t, InterfaceC0302y {

    /* renamed from: d, reason: collision with root package name */
    public final C0483x f5488d;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineContext f5489e;

    public C0477q(C0483x lifecycle, CoroutineContext coroutineContext) {
        InterfaceC0280c0 interfaceC0280c0;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f5488d = lifecycle;
        this.f5489e = coroutineContext;
        if (lifecycle.f5496d != EnumC0475o.f5480d || (interfaceC0280c0 = (InterfaceC0280c0) coroutineContext.k(C0299v.f4296e)) == null) {
            return;
        }
        interfaceC0280c0.a(null);
    }

    @Override // androidx.lifecycle.InterfaceC0479t
    public final void b(InterfaceC0481v source, EnumC0474n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        C0483x c0483x = this.f5488d;
        if (c0483x.f5496d.compareTo(EnumC0475o.f5480d) <= 0) {
            c0483x.f(this);
            InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) this.f5489e.k(C0299v.f4296e);
            if (interfaceC0280c0 != null) {
                interfaceC0280c0.a(null);
            }
        }
    }

    @Override // W2.InterfaceC0302y
    public final CoroutineContext q() {
        return this.f5489e;
    }
}
