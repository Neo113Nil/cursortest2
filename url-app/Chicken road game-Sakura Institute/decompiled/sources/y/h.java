package y;

import A.a0;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import s0.P0;
import w.P;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f11481a = new h();

    public final void a(P p4, a0 a0Var, HandwritingGesture handwritingGesture, P0 p02, Executor executor, final IntConsumer intConsumer, Function1<? super G0.i, Unit> function1) {
        final int i2 = p4 != null ? r.f11491a.i(p4, handwritingGesture, a0Var, p02, function1) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: y.g
                @Override // java.lang.Runnable
                public final void run() {
                    intConsumer.accept(i2);
                }
            });
        } else {
            intConsumer.accept(i2);
        }
    }

    public final boolean b(P p4, a0 a0Var, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (p4 != null) {
            return r.f11491a.A(p4, previewableHandwritingGesture, a0Var, cancellationSignal);
        }
        return false;
    }
}
