package I0;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import z.InputConnectionC1234B;

/* loaded from: classes.dex */
public final class r extends q {
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            inputConnectionC1234B.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        InputConnectionC1234B inputConnectionC1234B = this.f3081b;
        if (inputConnectionC1234B != null) {
            return inputConnectionC1234B.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
