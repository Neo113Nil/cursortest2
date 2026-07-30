package defpackage;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class je {
    public static final je a = new je();

    public final void a(sc1 sc1Var, gv2 gv2Var, HandwritingGesture handwritingGesture, g53 g53Var, Executor executor, IntConsumer intConsumer, Function1<? super pf0, Unit> function1) {
        int i = sc1Var != null ? fx0.a.i(sc1Var, handwritingGesture, gv2Var, g53Var, function1) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new ie(i, 0, intConsumer));
        } else {
            intConsumer.accept(i);
        }
    }

    public final boolean b(sc1 sc1Var, gv2 gv2Var, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (sc1Var != null) {
            return fx0.a.A(sc1Var, previewableHandwritingGesture, gv2Var, cancellationSignal);
        }
        return false;
    }
}
