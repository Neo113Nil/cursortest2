package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yandex.div.core.timer.TimerController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: InfiniteTransition.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J!\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005R\u00020\u0000H\u0000¢\u0006\u0002\b\u0019J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0015H\u0002J!\u0010\u001c\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005R\u00020\u0000H\u0000¢\u0006\u0002\b\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005R\u00020\u00000\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", "", "()V", "animations", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "getAnimations$animation_core_release", "()Landroidx/compose/runtime/collection/MutableVector;", "<set-?>", "", "isRunning", "()Z", "setRunning", "(Z)V", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "refreshChildNeeded", "getRefreshChildNeeded", "setRefreshChildNeeded", "refreshChildNeeded$delegate", "startTimeNanos", "", "addAnimation", "", "animation", "addAnimation$animation_core_release", "onFrame", "playTimeNanos", "removeAnimation", "removeAnimation$animation_core_release", "run", "run$animation_core_release", "(Landroidx/compose/runtime/Composer;I)V", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InfiniteTransition {
    public static final int $stable = 8;
    private final MutableVector animations = new MutableVector(new TransitionAnimationState[16], 0);

    /* renamed from: refreshChildNeeded$delegate, reason: from kotlin metadata */
    private final MutableState refreshChildNeeded = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private long startTimeNanos = Long.MIN_VALUE;

    /* renamed from: isRunning$delegate, reason: from kotlin metadata */
    private final MutableState isRunning = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* compiled from: InfiniteTransition.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B9\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0015R\"\u0010\u0005\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010+\u001a\u00028\u00002\u0006\u0010&\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR.\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b4\u00106\"\u0004\b7\u00108R\"\u00109\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00105\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\"\u0010<\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u0013¨\u0006A"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "initialValue", "targetValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "<init>", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;)V", "", "updateValues", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;)V", "", "playTimeNanos", "onPlayTimeChanged", "(J)V", "skipToEnd", "()V", TimerController.RESET_COMMAND, "Ljava/lang/Object;", "getInitialValue", "()Ljava/lang/Object;", "setInitialValue", "(Ljava/lang/Object;)V", "getTargetValue", "setTargetValue", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/AnimationSpec;)V", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "setValue$animation_core_release", "value", "Landroidx/compose/animation/core/TargetBasedAnimation;", "animation", "Landroidx/compose/animation/core/TargetBasedAnimation;", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "", "isFinished", "Z", "()Z", "setFinished", "(Z)V", "startOnTheNextFrame", "getStartOnTheNextFrame", "setStartOnTheNextFrame", "playTimeNanosOffset", "J", "getPlayTimeNanosOffset", "()J", "setPlayTimeNanosOffset", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private TargetBasedAnimation animation;
        private AnimationSpec animationSpec;
        private Object initialValue;
        private boolean isFinished;
        private long playTimeNanosOffset;
        private boolean startOnTheNextFrame;
        private Object targetValue;
        final /* synthetic */ InfiniteTransition this$0;
        private final TwoWayConverter typeConverter;

        /* renamed from: value$delegate, reason: from kotlin metadata */
        private final MutableState value;

        public TransitionAnimationState(InfiniteTransition infiniteTransition, Object obj, Object obj2, TwoWayConverter typeConverter, AnimationSpec animationSpec) {
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            this.this$0 = infiniteTransition;
            this.initialValue = obj;
            this.targetValue = obj2;
            this.typeConverter = typeConverter;
            this.animationSpec = animationSpec;
            this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
            this.animation = new TargetBasedAnimation(this.animationSpec, typeConverter, this.initialValue, this.targetValue, null, 16, null);
        }

        public final Object getInitialValue() {
            return this.initialValue;
        }

        public final Object getTargetValue() {
            return this.targetValue;
        }

        @Override // androidx.compose.runtime.State
        public Object getValue() {
            return this.value.getValue();
        }

        public void setValue$animation_core_release(Object obj) {
            this.value.setValue(obj);
        }

        /* renamed from: isFinished, reason: from getter */
        public final boolean getIsFinished() {
            return this.isFinished;
        }

        public final void updateValues(Object initialValue, Object targetValue, AnimationSpec animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            this.initialValue = initialValue;
            this.targetValue = targetValue;
            this.animationSpec = animationSpec;
            this.animation = new TargetBasedAnimation(animationSpec, this.typeConverter, initialValue, targetValue, null, 16, null);
            this.this$0.setRefreshChildNeeded(true);
            this.isFinished = false;
            this.startOnTheNextFrame = true;
        }

        public final void onPlayTimeChanged(long playTimeNanos) {
            this.this$0.setRefreshChildNeeded(false);
            if (this.startOnTheNextFrame) {
                this.startOnTheNextFrame = false;
                this.playTimeNanosOffset = playTimeNanos;
            }
            long j = playTimeNanos - this.playTimeNanosOffset;
            setValue$animation_core_release(this.animation.getValueFromNanos(j));
            this.isFinished = this.animation.isFinishedFromNanos(j);
        }

        public final void skipToEnd() {
            setValue$animation_core_release(this.animation.getTargetValue());
            this.startOnTheNextFrame = true;
        }

        public final void reset() {
            this.startOnTheNextFrame = true;
        }
    }

    /* renamed from: getAnimations$animation_core_release, reason: from getter */
    public final MutableVector getAnimations() {
        return this.animations;
    }

    private final boolean getRefreshChildNeeded() {
        return ((Boolean) this.refreshChildNeeded.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRefreshChildNeeded(boolean z) {
        this.refreshChildNeeded.setValue(Boolean.valueOf(z));
    }

    private final boolean isRunning() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    private final void setRunning(boolean z) {
        this.isRunning.setValue(Boolean.valueOf(z));
    }

    public final void addAnimation$animation_core_release(TransitionAnimationState animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.animations.add(animation);
        setRefreshChildNeeded(true);
    }

    public final void removeAnimation$animation_core_release(TransitionAnimationState animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.animations.remove(animation);
    }

    public final void run$animation_core_release(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-318043801);
        if (isRunning() || getRefreshChildNeeded()) {
            EffectsKt.LaunchedEffect(this, new InfiniteTransition$run$1(this, null), startRestartGroup, 8);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.animation.core.InfiniteTransition$run$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                InfiniteTransition.this.run$animation_core_release(composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFrame(long playTimeNanos) {
        boolean z;
        MutableVector mutableVector = this.animations;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            z = true;
            int i = 0;
            do {
                TransitionAnimationState transitionAnimationState = (TransitionAnimationState) content[i];
                if (!transitionAnimationState.getIsFinished()) {
                    transitionAnimationState.onPlayTimeChanged(playTimeNanos);
                }
                if (!transitionAnimationState.getIsFinished()) {
                    z = false;
                }
                i++;
            } while (i < size);
        } else {
            z = true;
        }
        setRunning(!z);
    }
}
