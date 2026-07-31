package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Transition.kt */
@Stable
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004lmnoB#\b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0010\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010#\u001a\u00020 2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020 2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b$\u0010\"J)\u0010*\u001a\u00020 2\u0018\u0010'\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030&R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b(\u0010)J)\u0010-\u001a\u00020\u000b2\u0018\u0010'\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030&R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00028\u0000H\u0001¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00028\u0000H\u0001¢\u0006\u0004\b1\u0010/J)\u0010-\u001a\u00020\u000b2\u0018\u00104\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u000303R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b+\u00105R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00106R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u00109R+\u0010\u001a\u001a\u00028\u00002\u0006\u0010:\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R7\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000A2\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000A8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR1\u0010\u001b\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000e8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bH\u0010<\u0012\u0004\bL\u0010\r\u001a\u0004\bI\u0010J\"\u0004\bK\u0010\u0016R+\u0010P\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010<\u001a\u0004\bN\u0010J\"\u0004\bO\u0010\u0016R+\u0010V\u001a\u00020 2\u0006\u0010:\u001a\u00020 8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010<\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR,\u0010X\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030&R\b\u0012\u0004\u0012\u00028\u00000\u00000W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001e\u0010Z\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010YR1\u0010\\\u001a\u00020 2\u0006\u0010:\u001a\u00020 8F@@X\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b[\u0010<\u0012\u0004\b^\u0010\r\u001a\u0004\b\\\u0010S\"\u0004\b]\u0010UR\"\u0010_\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010J\"\u0004\bb\u0010\u0016R\u001b\u0010f\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010JR$\u0010j\u001a\u00028\u00002\u0006\u0010g\u001a\u00028\u00008F@@X\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010>\"\u0004\bi\u0010@R\u0011\u0010k\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bk\u0010S¨\u0006p"}, d2 = {"Landroidx/compose/animation/core/Transition;", "S", "", "Landroidx/compose/animation/core/MutableTransitionState;", "transitionState", "", "label", "<init>", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;)V", "initialState", "(Ljava/lang/Object;Ljava/lang/String;)V", "", "onChildAnimationUpdated", "()V", "", "frameTimeNanos", "", "durationScale", "onFrame$animation_core_release", "(JF)V", "onFrame", "onTransitionStart$animation_core_release", "(J)V", "onTransitionStart", "onTransitionEnd$animation_core_release", "onTransitionEnd", "targetState", "playTimeNanos", "seek", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "setPlaytimeAfterInitialAndTargetStateEstablished", "transition", "", "addTransition$animation_core_release", "(Landroidx/compose/animation/core/Transition;)Z", "addTransition", "removeTransition$animation_core_release", "removeTransition", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "animation", "addAnimation$animation_core_release", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)Z", "addAnimation", "removeAnimation$animation_core_release", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)V", "removeAnimation", "updateTarget$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "updateTarget", "animateTo$animation_core_release", "animateTo", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "deferredAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "Landroidx/compose/animation/core/MutableTransitionState;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "targetState$delegate", "Landroidx/compose/runtime/MutableState;", "getTargetState", "()Ljava/lang/Object;", "setTargetState$animation_core_release", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/Transition$Segment;", "segment$delegate", "getSegment", "()Landroidx/compose/animation/core/Transition$Segment;", "setSegment", "(Landroidx/compose/animation/core/Transition$Segment;)V", "segment", "playTimeNanos$delegate", "getPlayTimeNanos", "()J", "setPlayTimeNanos", "getPlayTimeNanos$annotations", "startTimeNanos$delegate", "getStartTimeNanos", "setStartTimeNanos", "startTimeNanos", "updateChildrenNeeded$delegate", "getUpdateChildrenNeeded$animation_core_release", "()Z", "setUpdateChildrenNeeded$animation_core_release", "(Z)V", "updateChildrenNeeded", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "_animations", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "_transitions", "isSeeking$delegate", "isSeeking", "setSeeking$animation_core_release", "isSeeking$annotations", "lastSeekedTimeNanos", "J", "getLastSeekedTimeNanos$animation_core_release", "setLastSeekedTimeNanos$animation_core_release", "totalDurationNanos$delegate", "Landroidx/compose/runtime/State;", "getTotalDurationNanos", "totalDurationNanos", "value", "getCurrentState", "setCurrentState$animation_core_release", "currentState", "isRunning", "DeferredAnimation", "Segment", "SegmentImpl", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Transition<S> {
    private final SnapshotStateList _animations;
    private final SnapshotStateList _transitions;

    /* renamed from: isSeeking$delegate, reason: from kotlin metadata */
    private final MutableState isSeeking;
    private final String label;
    private long lastSeekedTimeNanos;

    /* renamed from: playTimeNanos$delegate, reason: from kotlin metadata */
    private final MutableState playTimeNanos;

    /* renamed from: segment$delegate, reason: from kotlin metadata */
    private final MutableState segment;

    /* renamed from: startTimeNanos$delegate, reason: from kotlin metadata */
    private final MutableState startTimeNanos;

    /* renamed from: targetState$delegate, reason: from kotlin metadata */
    private final MutableState targetState;

    /* renamed from: totalDurationNanos$delegate, reason: from kotlin metadata */
    private final State totalDurationNanos;
    private final MutableTransitionState transitionState;

    /* renamed from: updateChildrenNeeded$delegate, reason: from kotlin metadata */
    private final MutableState updateChildrenNeeded;

    public Transition(MutableTransitionState transitionState, String str) {
        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
        this.transitionState = transitionState;
        this.label = str;
        this.targetState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.segment = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SegmentImpl(getCurrentState(), getCurrentState()), null, 2, null);
        this.playTimeNanos = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this.startTimeNanos = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.MIN_VALUE, null, 2, null);
        this.updateChildrenNeeded = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this._animations = SnapshotStateKt.mutableStateListOf();
        this._transitions = SnapshotStateKt.mutableStateListOf();
        this.isSeeking = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.totalDurationNanos = SnapshotStateKt.derivedStateOf(new Function0(this) { // from class: androidx.compose.animation.core.Transition$totalDurationNanos$2
            final /* synthetic */ Transition<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Long mo4828invoke() {
                SnapshotStateList snapshotStateList;
                SnapshotStateList snapshotStateList2;
                snapshotStateList = ((Transition) this.this$0)._animations;
                Iterator<T> it = snapshotStateList.iterator();
                long j = 0;
                while (it.hasNext()) {
                    j = Math.max(j, ((Transition.TransitionAnimationState) it.next()).getDurationNanos$animation_core_release());
                }
                snapshotStateList2 = ((Transition) this.this$0)._transitions;
                Iterator<T> it2 = snapshotStateList2.iterator();
                while (it2.hasNext()) {
                    j = Math.max(j, ((Transition) it2.next()).getTotalDurationNanos());
                }
                return Long.valueOf(j);
            }
        });
    }

    public final String getLabel() {
        return this.label;
    }

    public Transition(Object obj, String str) {
        this(new MutableTransitionState(obj), str);
    }

    public final Object getCurrentState() {
        return this.transitionState.getCurrentState();
    }

    public final void setCurrentState$animation_core_release(Object obj) {
        this.transitionState.setCurrentState$animation_core_release(obj);
    }

    public final Object getTargetState() {
        return this.targetState.getValue();
    }

    public final void setTargetState$animation_core_release(Object obj) {
        this.targetState.setValue(obj);
    }

    private final void setSegment(Segment segment) {
        this.segment.setValue(segment);
    }

    public final Segment getSegment() {
        return (Segment) this.segment.getValue();
    }

    public final boolean isRunning() {
        return getStartTimeNanos() != Long.MIN_VALUE;
    }

    public final long getPlayTimeNanos() {
        return ((Number) this.playTimeNanos.getValue()).longValue();
    }

    public final void setPlayTimeNanos(long j) {
        this.playTimeNanos.setValue(Long.valueOf(j));
    }

    private final long getStartTimeNanos() {
        return ((Number) this.startTimeNanos.getValue()).longValue();
    }

    private final void setStartTimeNanos(long j) {
        this.startTimeNanos.setValue(Long.valueOf(j));
    }

    public final boolean getUpdateChildrenNeeded$animation_core_release() {
        return ((Boolean) this.updateChildrenNeeded.getValue()).booleanValue();
    }

    public final void setUpdateChildrenNeeded$animation_core_release(boolean z) {
        this.updateChildrenNeeded.setValue(Boolean.valueOf(z));
    }

    public final boolean isSeeking() {
        return ((Boolean) this.isSeeking.getValue()).booleanValue();
    }

    public final void setSeeking$animation_core_release(boolean z) {
        this.isSeeking.setValue(Boolean.valueOf(z));
    }

    /* renamed from: getLastSeekedTimeNanos$animation_core_release, reason: from getter */
    public final long getLastSeekedTimeNanos() {
        return this.lastSeekedTimeNanos;
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.totalDurationNanos.getValue()).longValue();
    }

    public final void onFrame$animation_core_release(long frameTimeNanos, float durationScale) {
        if (getStartTimeNanos() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(frameTimeNanos);
        }
        setUpdateChildrenNeeded$animation_core_release(false);
        setPlayTimeNanos(frameTimeNanos - getStartTimeNanos());
        boolean z = true;
        for (TransitionAnimationState transitionAnimationState : this._animations) {
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                transitionAnimationState.onPlayTimeChanged$animation_core_release(getPlayTimeNanos(), durationScale);
            }
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                z = false;
            }
        }
        for (Transition transition : this._transitions) {
            if (!Intrinsics.areEqual(transition.getTargetState(), transition.getCurrentState())) {
                transition.onFrame$animation_core_release(getPlayTimeNanos(), durationScale);
            }
            if (!Intrinsics.areEqual(transition.getTargetState(), transition.getCurrentState())) {
                z = false;
            }
        }
        if (z) {
            onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionStart$animation_core_release(long frameTimeNanos) {
        setStartTimeNanos(frameTimeNanos);
        this.transitionState.setRunning$animation_core_release(true);
    }

    public final void onTransitionEnd$animation_core_release() {
        setStartTimeNanos(Long.MIN_VALUE);
        setCurrentState$animation_core_release(getTargetState());
        setPlayTimeNanos(0L);
        this.transitionState.setRunning$animation_core_release(false);
    }

    public final void seek(Object initialState, Object targetState, long playTimeNanos) {
        setStartTimeNanos(Long.MIN_VALUE);
        this.transitionState.setRunning$animation_core_release(false);
        if (!isSeeking() || !Intrinsics.areEqual(getCurrentState(), initialState) || !Intrinsics.areEqual(getTargetState(), targetState)) {
            setCurrentState$animation_core_release(initialState);
            setTargetState$animation_core_release(targetState);
            setSeeking$animation_core_release(true);
            setSegment(new SegmentImpl(initialState, targetState));
        }
        for (Transition transition : this._transitions) {
            if (transition.isSeeking()) {
                transition.seek(transition.getCurrentState(), transition.getTargetState(), playTimeNanos);
            }
        }
        Iterator<T> it = this._animations.iterator();
        while (it.hasNext()) {
            ((TransitionAnimationState) it.next()).seekTo$animation_core_release(playTimeNanos);
        }
        this.lastSeekedTimeNanos = playTimeNanos;
    }

    public final boolean addTransition$animation_core_release(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        return this._transitions.add(transition);
    }

    public final boolean removeTransition$animation_core_release(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        return this._transitions.remove(transition);
    }

    public final boolean addAnimation$animation_core_release(TransitionAnimationState animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        return this._animations.add(animation);
    }

    public final void removeAnimation$animation_core_release(TransitionAnimationState animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this._animations.remove(animation);
    }

    public final void updateTarget$animation_core_release(final Object obj, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-583974681);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (!isSeeking() && !Intrinsics.areEqual(getTargetState(), obj)) {
                setSegment(new SegmentImpl(getTargetState(), obj));
                setCurrentState$animation_core_release(getTargetState());
                setTargetState$animation_core_release(obj);
                if (!isRunning()) {
                    setUpdateChildrenNeeded$animation_core_release(true);
                }
                Iterator<T> it = this._animations.iterator();
                while (it.hasNext()) {
                    ((TransitionAnimationState) it.next()).resetAnimation$animation_core_release();
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2(this) { // from class: androidx.compose.animation.core.Transition$updateTarget$2
            final /* synthetic */ Transition<S> $tmp0_rcvr;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.$tmp0_rcvr = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                this.$tmp0_rcvr.updateTarget$animation_core_release(obj, composer2, i | 1);
            }
        });
    }

    public final void animateTo$animation_core_release(final Object obj, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1493585151);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (!isSeeking()) {
                updateTarget$animation_core_release(obj, startRestartGroup, i2 & 126);
                if (!Intrinsics.areEqual(obj, getCurrentState()) || isRunning() || getUpdateChildrenNeeded$animation_core_release()) {
                    int i3 = (i2 >> 3) & 14;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    boolean changed = startRestartGroup.changed(this);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Transition$animateTo$1$1(this, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(this, (Function2) rememberedValue, startRestartGroup, i3);
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2(this) { // from class: androidx.compose.animation.core.Transition$animateTo$2
            final /* synthetic */ Transition<S> $tmp0_rcvr;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.$tmp0_rcvr = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i4) {
                this.$tmp0_rcvr.animateTo$animation_core_release(obj, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChildAnimationUpdated() {
        setUpdateChildrenNeeded$animation_core_release(true);
        if (isSeeking()) {
            long j = 0;
            for (TransitionAnimationState transitionAnimationState : this._animations) {
                j = Math.max(j, transitionAnimationState.getDurationNanos$animation_core_release());
                transitionAnimationState.seekTo$animation_core_release(this.lastSeekedTimeNanos);
            }
            setUpdateChildrenNeeded$animation_core_release(false);
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b \b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00028\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00028\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0000¢\u0006\u0004\b\"\u0010#J-\u0010'\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00028\u00012\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0000¢\u0006\u0004\b%\u0010&R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R+\u0010\u001f\u001a\u00028\u00012\u0006\u0010.\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R7\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010 8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00107\"\u0004\b8\u00109RC\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020:2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020:8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u00100\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R+\u0010F\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bA\u00100\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER+\u0010K\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bG\u00100\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010\u001aR+\u0010O\u001a\u00020\r2\u0006\u0010.\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bL\u00100\u001a\u0004\bM\u0010C\"\u0004\bN\u0010ER+\u0010S\u001a\u00028\u00012\u0006\u0010.\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bP\u00100\u001a\u0004\bQ\u00102\"\u0004\bR\u00104R\u0016\u0010T\u001a\u00028\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00010 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010I¨\u0006Z"}, d2 = {"Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "initialValue", "initialVelocityVector", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "", "isInterrupted", "", "updateAnimation", "(Ljava/lang/Object;Z)V", "", "playTimeNanos", "", "durationScale", "onPlayTimeChanged$animation_core_release", "(JF)V", "onPlayTimeChanged", "seekTo$animation_core_release", "(J)V", "seekTo", "resetAnimation$animation_core_release", "()V", "resetAnimation", "targetValue", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "updateTargetValue$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateTargetValue", "updateInitialAndTargetValue$animation_core_release", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateInitialAndTargetValue", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "targetValue$delegate", "Landroidx/compose/runtime/MutableState;", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "animationSpec$delegate", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "Landroidx/compose/animation/core/TargetBasedAnimation;", "animation$delegate", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "animation", "isFinished$delegate", "isFinished$animation_core_release", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", "offsetTimeNanos$delegate", "getOffsetTimeNanos", "()J", "setOffsetTimeNanos", "offsetTimeNanos", "needsReset$delegate", "getNeedsReset", "setNeedsReset", "needsReset", "value$delegate", "getValue", "setValue$animation_core_release", "value", "velocityVector", "Landroidx/compose/animation/core/AnimationVector;", "interruptionSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getDurationNanos$animation_core_release", "durationNanos", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @Stable
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        /* renamed from: animation$delegate, reason: from kotlin metadata */
        private final MutableState animation;

        /* renamed from: animationSpec$delegate, reason: from kotlin metadata */
        private final MutableState animationSpec;
        private final FiniteAnimationSpec interruptionSpec;

        /* renamed from: isFinished$delegate, reason: from kotlin metadata */
        private final MutableState isFinished;
        private final String label;

        /* renamed from: needsReset$delegate, reason: from kotlin metadata */
        private final MutableState needsReset;

        /* renamed from: offsetTimeNanos$delegate, reason: from kotlin metadata */
        private final MutableState offsetTimeNanos;

        /* renamed from: targetValue$delegate, reason: from kotlin metadata */
        private final MutableState targetValue;
        final /* synthetic */ Transition this$0;
        private final TwoWayConverter typeConverter;

        /* renamed from: value$delegate, reason: from kotlin metadata */
        private final MutableState value;
        private AnimationVector velocityVector;

        public TransitionAnimationState(Transition transition, Object obj, AnimationVector initialVelocityVector, TwoWayConverter typeConverter, String label) {
            Object obj2;
            Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(label, "label");
            this.this$0 = transition;
            this.typeConverter = typeConverter;
            this.label = label;
            this.targetValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
            this.animationSpec = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.animation = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(getAnimationSpec(), typeConverter, obj, getTargetValue(), initialVelocityVector), null, 2, null);
            this.isFinished = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.offsetTimeNanos = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
            this.needsReset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
            this.velocityVector = initialVelocityVector;
            Float f = (Float) VisibilityThresholdsKt.getVisibilityThresholdMap().get(typeConverter);
            if (f != null) {
                float floatValue = f.floatValue();
                AnimationVector animationVector = (AnimationVector) typeConverter.getConvertToVector().invoke(obj);
                int size = animationVector.getSize();
                for (int i = 0; i < size; i++) {
                    animationVector.set$animation_core_release(i, floatValue);
                }
                obj2 = this.typeConverter.getConvertFromVector().invoke(animationVector);
            } else {
                obj2 = null;
            }
            this.interruptionSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, obj2, 3, null);
        }

        private final Object getTargetValue() {
            return this.targetValue.getValue();
        }

        private final void setTargetValue(Object obj) {
            this.targetValue.setValue(obj);
        }

        private final void setAnimationSpec(FiniteAnimationSpec finiteAnimationSpec) {
            this.animationSpec.setValue(finiteAnimationSpec);
        }

        public final FiniteAnimationSpec getAnimationSpec() {
            return (FiniteAnimationSpec) this.animationSpec.getValue();
        }

        private final void setAnimation(TargetBasedAnimation targetBasedAnimation) {
            this.animation.setValue(targetBasedAnimation);
        }

        public final TargetBasedAnimation getAnimation() {
            return (TargetBasedAnimation) this.animation.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return ((Boolean) this.isFinished.getValue()).booleanValue();
        }

        public final void setFinished$animation_core_release(boolean z) {
            this.isFinished.setValue(Boolean.valueOf(z));
        }

        private final long getOffsetTimeNanos() {
            return ((Number) this.offsetTimeNanos.getValue()).longValue();
        }

        private final void setOffsetTimeNanos(long j) {
            this.offsetTimeNanos.setValue(Long.valueOf(j));
        }

        private final boolean getNeedsReset() {
            return ((Boolean) this.needsReset.getValue()).booleanValue();
        }

        private final void setNeedsReset(boolean z) {
            this.needsReset.setValue(Boolean.valueOf(z));
        }

        @Override // androidx.compose.runtime.State
        public Object getValue() {
            return this.value.getValue();
        }

        public void setValue$animation_core_release(Object obj) {
            this.value.setValue(obj);
        }

        public final long getDurationNanos$animation_core_release() {
            return getAnimation().getDurationNanos();
        }

        public final void onPlayTimeChanged$animation_core_release(long playTimeNanos, float durationScale) {
            long offsetTimeNanos;
            if (durationScale == 0.0f) {
                offsetTimeNanos = getAnimation().getDurationNanos();
            } else {
                offsetTimeNanos = (long) ((playTimeNanos - getOffsetTimeNanos()) / durationScale);
            }
            setValue$animation_core_release(getAnimation().getValueFromNanos(offsetTimeNanos));
            this.velocityVector = getAnimation().getVelocityVectorFromNanos(offsetTimeNanos);
            if (getAnimation().isFinishedFromNanos(offsetTimeNanos)) {
                setFinished$animation_core_release(true);
                setOffsetTimeNanos(0L);
            }
        }

        public final void seekTo$animation_core_release(long playTimeNanos) {
            setValue$animation_core_release(getAnimation().getValueFromNanos(playTimeNanos));
            this.velocityVector = getAnimation().getVelocityVectorFromNanos(playTimeNanos);
        }

        static /* synthetic */ void updateAnimation$default(TransitionAnimationState transitionAnimationState, Object obj, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            if ((i & 2) != 0) {
                z = false;
            }
            transitionAnimationState.updateAnimation(obj, z);
        }

        private final void updateAnimation(Object initialValue, boolean isInterrupted) {
            FiniteAnimationSpec animationSpec;
            if (isInterrupted) {
                animationSpec = getAnimationSpec() instanceof SpringSpec ? getAnimationSpec() : this.interruptionSpec;
            } else {
                animationSpec = getAnimationSpec();
            }
            setAnimation(new TargetBasedAnimation(animationSpec, this.typeConverter, initialValue, getTargetValue(), this.velocityVector));
            this.this$0.onChildAnimationUpdated();
        }

        public final void resetAnimation$animation_core_release() {
            setNeedsReset(true);
        }

        public final void updateTargetValue$animation_core_release(Object targetValue, FiniteAnimationSpec animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            if (!Intrinsics.areEqual(getTargetValue(), targetValue) || getNeedsReset()) {
                setTargetValue(targetValue);
                setAnimationSpec(animationSpec);
                updateAnimation$default(this, null, !isFinished$animation_core_release(), 1, null);
                setFinished$animation_core_release(false);
                setOffsetTimeNanos(this.this$0.getPlayTimeNanos());
                setNeedsReset(false);
            }
        }

        public final void updateInitialAndTargetValue$animation_core_release(Object initialValue, Object targetValue, FiniteAnimationSpec animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            setTargetValue(targetValue);
            setAnimationSpec(animationSpec);
            if (Intrinsics.areEqual(getAnimation().getInitialValue(), initialValue) && Intrinsics.areEqual(getAnimation().getTargetValue(), targetValue)) {
                return;
            }
            updateAnimation$default(this, initialValue, false, 2, null);
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0016\u0010\u0003\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/animation/core/Transition$SegmentImpl;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "initialState", "targetState", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getInitialState", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTargetState", "equals", "", "other", "", "hashCode", "", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class SegmentImpl<S> implements Segment<S> {
        private final Object initialState;
        private final Object targetState;

        public SegmentImpl(Object obj, Object obj2) {
            this.initialState = obj;
            this.targetState = obj2;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public Object getInitialState() {
            return this.initialState;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public Object getTargetState() {
            return this.targetState;
        }

        public boolean equals(Object other) {
            if (other instanceof Segment) {
                Segment segment = (Segment) other;
                if (Intrinsics.areEqual(getInitialState(), segment.getInitialState()) && Intrinsics.areEqual(getTargetState(), segment.getTargetState())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object initialState = getInitialState();
            int hashCode = (initialState != null ? initialState.hashCode() : 0) * 31;
            Object targetState = getTargetState();
            return hashCode + (targetState != null ? targetState.hashCode() : 0);
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001a\u0010\b\u001a\u00020\t*\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0002\u0010\nR\u0012\u0010\u0003\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition$Segment;", "S", "", "initialState", "getInitialState", "()Ljava/lang/Object;", "targetState", "getTargetState", "isTransitioningTo", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Segment<S> {

        /* compiled from: Transition.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        Object getInitialState();

        Object getTargetState();

        default boolean isTransitioningTo(Object obj, Object obj2) {
            return Intrinsics.areEqual(obj, getInitialState()) && Intrinsics.areEqual(obj2, getTargetState());
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001%B%\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJG\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u001e\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cRJ\u0010\u001f\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001dR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "transitionSpec", "targetValueByState", "Landroidx/compose/runtime/State;", "animate", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/State;", "", "setupSeeking$animation_core_release", "()V", "setupSeeking", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "Landroidx/compose/animation/core/Transition;", "data", "Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "getData$animation_core_release", "()Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "setData$animation_core_release", "(Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;)V", "DeferredAnimationData", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @InternalAnimationApi
    public final class DeferredAnimation<T, V extends AnimationVector> {
        private DeferredAnimationData data;
        private final String label;
        final /* synthetic */ Transition this$0;
        private final TwoWayConverter typeConverter;

        public DeferredAnimation(Transition transition, TwoWayConverter typeConverter, String label) {
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(label, "label");
            this.this$0 = transition;
            this.typeConverter = typeConverter;
            this.label = label;
        }

        /* renamed from: getData$animation_core_release, reason: from getter */
        public final DeferredAnimationData getData() {
            return this.data;
        }

        /* compiled from: Transition.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004BY\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u001e\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0011\u0010\u0012R-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R:\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00030\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001f\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "animation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "transitionSpec", "targetValueByState", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "segment", "", "updateAnimationStates", "(Landroidx/compose/animation/core/Transition$Segment;)V", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "getAnimation", "()Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Lkotlin/jvm/functions/Function1;", "getTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "setTransitionSpec", "(Lkotlin/jvm/functions/Function1;)V", "getTargetValueByState", "setTargetValueByState", "getValue", "()Ljava/lang/Object;", "value", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {
            private final TransitionAnimationState animation;
            private Function1 targetValueByState;
            final /* synthetic */ DeferredAnimation this$0;
            private Function1 transitionSpec;

            public DeferredAnimationData(DeferredAnimation deferredAnimation, TransitionAnimationState animation, Function1 transitionSpec, Function1 targetValueByState) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                Intrinsics.checkNotNullParameter(transitionSpec, "transitionSpec");
                Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
                this.this$0 = deferredAnimation;
                this.animation = animation;
                this.transitionSpec = transitionSpec;
                this.targetValueByState = targetValueByState;
            }

            public final TransitionAnimationState getAnimation() {
                return this.animation;
            }

            public final Function1 getTransitionSpec() {
                return this.transitionSpec;
            }

            public final void setTransitionSpec(Function1 function1) {
                Intrinsics.checkNotNullParameter(function1, "<set-?>");
                this.transitionSpec = function1;
            }

            public final Function1 getTargetValueByState() {
                return this.targetValueByState;
            }

            public final void setTargetValueByState(Function1 function1) {
                Intrinsics.checkNotNullParameter(function1, "<set-?>");
                this.targetValueByState = function1;
            }

            public final void updateAnimationStates(Segment segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                Object invoke = this.targetValueByState.invoke(segment.getTargetState());
                if (this.this$0.this$0.isSeeking()) {
                    this.animation.updateInitialAndTargetValue$animation_core_release(this.targetValueByState.invoke(segment.getInitialState()), invoke, (FiniteAnimationSpec) this.transitionSpec.invoke(segment));
                } else {
                    this.animation.updateTargetValue$animation_core_release(invoke, (FiniteAnimationSpec) this.transitionSpec.invoke(segment));
                }
            }

            @Override // androidx.compose.runtime.State
            public Object getValue() {
                updateAnimationStates(this.this$0.this$0.getSegment());
                return this.animation.getValue();
            }
        }

        public final State animate(Function1 transitionSpec, Function1 targetValueByState) {
            Intrinsics.checkNotNullParameter(transitionSpec, "transitionSpec");
            Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
            DeferredAnimationData deferredAnimationData = this.data;
            if (deferredAnimationData == null) {
                Transition transition = this.this$0;
                deferredAnimationData = new DeferredAnimationData(this, new TransitionAnimationState(transition, targetValueByState.invoke(transition.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, targetValueByState.invoke(this.this$0.getCurrentState())), this.typeConverter, this.label), transitionSpec, targetValueByState);
                Transition transition2 = this.this$0;
                this.data = deferredAnimationData;
                transition2.addAnimation$animation_core_release(deferredAnimationData.getAnimation());
            }
            Transition transition3 = this.this$0;
            deferredAnimationData.setTargetValueByState(targetValueByState);
            deferredAnimationData.setTransitionSpec(transitionSpec);
            deferredAnimationData.updateAnimationStates(transition3.getSegment());
            return deferredAnimationData;
        }

        public final void setupSeeking$animation_core_release() {
            DeferredAnimationData deferredAnimationData = this.data;
            if (deferredAnimationData != null) {
                Transition transition = this.this$0;
                deferredAnimationData.getAnimation().updateInitialAndTargetValue$animation_core_release(deferredAnimationData.getTargetValueByState().invoke(transition.getSegment().getInitialState()), deferredAnimationData.getTargetValueByState().invoke(transition.getSegment().getTargetState()), (FiniteAnimationSpec) deferredAnimationData.getTransitionSpec().invoke(transition.getSegment()));
            }
        }
    }

    public final void removeAnimation$animation_core_release(DeferredAnimation deferredAnimation) {
        TransitionAnimationState animation;
        Intrinsics.checkNotNullParameter(deferredAnimation, "deferredAnimation");
        DeferredAnimation.DeferredAnimationData data = deferredAnimation.getData();
        if (data == null || (animation = data.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core_release(animation);
    }
}
