package W2;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class n0 extends kotlin.coroutines.a implements InterfaceC0280c0 {

    /* renamed from: e, reason: collision with root package name */
    public static final n0 f4283e = new n0(C0299v.f4296e);

    @Override // W2.InterfaceC0280c0
    public final void a(CancellationException cancellationException) {
    }

    @Override // W2.InterfaceC0280c0
    public final boolean b() {
        return true;
    }

    @Override // W2.InterfaceC0280c0
    public final InterfaceC0289k d(k0 k0Var) {
        return o0.f4289d;
    }

    @Override // W2.InterfaceC0280c0
    public final CancellationException g() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // W2.InterfaceC0280c0
    public final boolean h() {
        return false;
    }

    @Override // W2.InterfaceC0280c0
    public final L j(boolean z4, boolean z5, f0 f0Var) {
        return o0.f4289d;
    }

    @Override // W2.InterfaceC0280c0
    public final L r(Function1 function1) {
        return o0.f4289d;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // W2.InterfaceC0280c0
    public final Object x(E2.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }
}
