package androidx.compose.runtime;

import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* compiled from: PausableComposition.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R&\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/PausedCompositionImpl;", "Landroidx/compose/runtime/PausedComposition;", "", "markIncomplete$runtime", "()V", "markIncomplete", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/PausedCompositionState;", "Landroidx/compose/runtime/internal/AtomicReference;", "state", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "rememberManager", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "getRememberManager$runtime", "()Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/RecordingApplier;", "", "pausableApplier", "Landroidx/compose/runtime/RecordingApplier;", "getPausableApplier$runtime", "()Landroidx/compose/runtime/RecordingApplier;", "", "isRecomposing$runtime", "()Z", "isRecomposing", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PausedCompositionImpl implements PausedComposition {
    private final RecordingApplier pausableApplier;
    private final RememberEventDispatcher rememberManager;
    private AtomicReference state;

    /* compiled from: PausableComposition.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PausedCompositionState.values().length];
            try {
                iArr[PausedCompositionState.InitialPending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PausedCompositionState.RecomposePending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PausedCompositionState.Recomposing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PausedCompositionState.ApplyPending.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PausedCompositionState.Applied.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PausedCompositionState.Cancelled.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PausedCompositionState.Invalid.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: getRememberManager$runtime, reason: from getter */
    public final RememberEventDispatcher getRememberManager() {
        return this.rememberManager;
    }

    /* renamed from: getPausableApplier$runtime, reason: from getter */
    public final RecordingApplier getPausableApplier() {
        return this.pausableApplier;
    }

    public final boolean isRecomposing$runtime() {
        return this.state.get() == PausedCompositionState.Recomposing;
    }

    public final void markIncomplete$runtime() {
        Object obj = this.state.get();
        PausedCompositionState pausedCompositionState = PausedCompositionState.RecomposePending;
        if (obj == pausedCompositionState) {
            return;
        }
        PausedCompositionState pausedCompositionState2 = PausedCompositionState.ApplyPending;
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.state, pausedCompositionState2, pausedCompositionState)) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("Unexpected state change from: " + pausedCompositionState2 + " to: " + pausedCompositionState + '.');
    }
}
