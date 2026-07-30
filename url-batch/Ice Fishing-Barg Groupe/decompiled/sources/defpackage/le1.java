package defpackage;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class le1 extends ke1 {
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            lt1Var.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        lt1 lt1Var = this.lS5Rgt96tfkO;
        if (lt1Var != null) {
            return lt1Var.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
