package kotlinx.coroutines.selects;

import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes7.dex */
public final class SelectBuilderImpl extends SelectImplementation {
    public final CancellableContinuationImpl cont;

    public SelectBuilderImpl(TakeUntil$collectSafely$2 takeUntil$collectSafely$2) {
        super(takeUntil$collectSafely$2.getContext());
        this.cont = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(takeUntil$collectSafely$2));
    }
}
