package retrofit2;

import androidx.compose.runtime.CancellationHandle;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes3.dex */
public final class KotlinExtensions$await$2$1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public Object $this_await;

    public /* synthetic */ KotlinExtensions$await$2$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$this_await = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((Call) this.$this_await).cancel();
                return Unit.INSTANCE;
            case 1:
                ((CancellationHandle) this.$this_await).cancel();
                return Unit.INSTANCE;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) this.$this_await;
                if (pointerInteropFilter != null) {
                    pointerInteropFilter.disallowIntercept = booleanValue;
                }
                return Unit.INSTANCE;
            case 3:
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.$this_await;
                Result.Companion companion = Result.Companion;
                Unit unit = Unit.INSTANCE;
                cancellableContinuationImpl.resumeWith(unit);
                return unit;
            default:
                JobImpl jobImpl = (JobImpl) this.$this_await;
                if (jobImpl.isActive()) {
                    jobImpl.cancelImpl$kotlinx_coroutines_core(new AbortFlowException(jobImpl));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ KotlinExtensions$await$2$1() {
        this.$r8$classId = 2;
    }
}
