package z;

import B.a0;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import b.RunnableC0315k;
import e2.InterfaceC0424c;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import u0.O0;
import x.Q;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1243g {

    /* renamed from: a, reason: collision with root package name */
    public static final C1243g f10451a = new C1243g();

    public final void a(Q q3, a0 a0Var, HandwritingGesture handwritingGesture, O0 o02, Executor executor, IntConsumer intConsumer, InterfaceC0424c interfaceC0424c) {
        int i3 = q3 != null ? C1254r.f10463a.i(q3, handwritingGesture, a0Var, o02, interfaceC0424c) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new RunnableC0315k(intConsumer, i3));
        } else {
            intConsumer.accept(i3);
        }
    }

    public final boolean b(Q q3, a0 a0Var, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (q3 != null) {
            return C1254r.f10463a.A(q3, previewableHandwritingGesture, a0Var, cancellationSignal);
        }
        return false;
    }
}
