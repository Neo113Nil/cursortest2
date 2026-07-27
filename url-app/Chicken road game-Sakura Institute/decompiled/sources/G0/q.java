package G0;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import y.InputConnectionC1308B;

/* loaded from: classes.dex */
public final class q extends p {
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            inputConnectionC1308B.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        InputConnectionC1308B inputConnectionC1308B = this.f3077b;
        if (inputConnectionC1308B != null) {
            return inputConnectionC1308B.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
