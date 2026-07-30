package y;

import a0.x0;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import s1.l2;
import w.j0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f9715a = new f();

    public final void a(j0 j0Var, x0 x0Var, HandwritingGesture handwritingGesture, l2 l2Var, Executor executor, final IntConsumer intConsumer, q6.c cVar) {
        final int i7 = j0Var != null ? n.f9720a.i(j0Var, handwritingGesture, x0Var, l2Var, cVar) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: y.e
                @Override // java.lang.Runnable
                public final void run() {
                    intConsumer.accept(i7);
                }
            });
        } else {
            intConsumer.accept(i7);
        }
    }

    public final boolean b(j0 j0Var, x0 x0Var, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (j0Var != null) {
            return n.f9720a.A(j0Var, previewableHandwritingGesture, x0Var, cancellationSignal);
        }
        return false;
    }
}
