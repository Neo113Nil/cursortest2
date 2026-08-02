package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import papa.internal.LaunchTracker;
import radiography.Radiography$renderScannableViewTree$1$2;

/* loaded from: classes3.dex */
public interface Job extends CoroutineContext.Element {

    public final class Key implements CoroutineContext.Key {
        public static final /* synthetic */ Key $$INSTANCE = new Key();
    }

    ChildHandle attachChild(JobSupport jobSupport);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    Sequence getChildren();

    LaunchTracker getOnJoin();

    DisposableHandle invokeOnCompletion(Function1 function1);

    DisposableHandle invokeOnCompletion(boolean z, boolean z2, Radiography$renderScannableViewTree$1$2 radiography$renderScannableViewTree$1$2);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(Continuation continuation);

    boolean start();
}
