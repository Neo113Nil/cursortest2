package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimatedContent.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003?@AB'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R4\u0010,\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R/\u0010/\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0.0-8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R-\u00103\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010.8\u0000@\u0000X\u0080\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001d\u0010\r\u001a\u00020\u000b8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b9\u0010)R\u0014\u0010<\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/Transition;", "transition", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/IntSize;", "fullSize", "currentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculateOffset-emnUabE", "(JJ)J", "calculateOffset", "Landroidx/compose/animation/ContentTransform;", "contentTransform", "Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier$animation_release", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "createSizeAnimationModifier", "Landroidx/compose/animation/core/Transition;", "getTransition$animation_release", "()Landroidx/compose/animation/core/Transition;", "Landroidx/compose/ui/Alignment;", "getContentAlignment$animation_release", "()Landroidx/compose/ui/Alignment;", "setContentAlignment$animation_release", "(Landroidx/compose/ui/Alignment;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection$animation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "measuredSize$delegate", "Landroidx/compose/runtime/MutableState;", "getMeasuredSize-YbymL2g$animation_release", "()J", "setMeasuredSize-ozmzZPI$animation_release", "(J)V", "measuredSize", "", "Landroidx/compose/runtime/State;", "targetSizeMap", "Ljava/util/Map;", "getTargetSizeMap$animation_release", "()Ljava/util/Map;", "animatedSize", "Landroidx/compose/runtime/State;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation_release", "(Landroidx/compose/runtime/State;)V", "getCurrentSize-YbymL2g", "getInitialState", "()Ljava/lang/Object;", "initialState", "getTargetState", "targetState", "ChildData", "SizeModifier", "SlideDirection", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalAnimationApi
/* loaded from: classes12.dex */
public final class AnimatedContentScope<S> implements Transition.Segment<S> {
    private State animatedSize;
    private Alignment contentAlignment;
    private LayoutDirection layoutDirection;

    /* renamed from: measuredSize$delegate, reason: from kotlin metadata */
    private final MutableState measuredSize;
    private final Map targetSizeMap;
    private final Transition transition;

    public AnimatedContentScope(Transition transition, Alignment contentAlignment, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(contentAlignment, "contentAlignment");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.transition = transition;
        this.contentAlignment = contentAlignment;
        this.layoutDirection = layoutDirection;
        this.measuredSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m2562boximpl(IntSize.INSTANCE.m2571getZeroYbymL2g()), null, 2, null);
        this.targetSizeMap = new LinkedHashMap();
    }

    /* renamed from: getTransition$animation_release, reason: from getter */
    public final Transition getTransition() {
        return this.transition;
    }

    /* renamed from: getContentAlignment$animation_release, reason: from getter */
    public final Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    public final void setContentAlignment$animation_release(Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "<set-?>");
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation_release(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public Object getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public Object getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$SlideDirection;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @Immutable
    public static final class SlideDirection {
        private final int value;
        private static final int Left = m48constructorimpl(0);
        private static final int Right = m48constructorimpl(1);
        private static final int Up = m48constructorimpl(2);
        private static final int Down = m48constructorimpl(3);
        private static final int Start = m48constructorimpl(4);
        private static final int End = m48constructorimpl(5);

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m48constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m49equalsimpl(int i, Object obj) {
            return (obj instanceof SlideDirection) && i == ((SlideDirection) obj).getValue();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m50equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m51hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        public boolean equals(Object obj) {
            return m49equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m51hashCodeimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public String toString() {
            return m52toStringimpl(this.value);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m52toStringimpl(int i) {
            return m50equalsimpl0(i, Left) ? "Left" : m50equalsimpl0(i, Right) ? "Right" : m50equalsimpl0(i, Up) ? "Up" : m50equalsimpl0(i, Down) ? "Down" : m50equalsimpl0(i, Start) ? "Start" : m50equalsimpl0(i, End) ? "End" : "Invalid";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateOffset-emnUabE, reason: not valid java name */
    public final long m40calculateOffsetemnUabE(long fullSize, long currentSize) {
        return this.contentAlignment.mo1228alignKFBX0sM(fullSize, currentSize, LayoutDirection.Ltr);
    }

    /* renamed from: getMeasuredSize-YbymL2g$animation_release, reason: not valid java name */
    public final long m44getMeasuredSizeYbymL2g$animation_release() {
        return ((IntSize) this.measuredSize.getValue()).getPackedValue();
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation_release, reason: not valid java name */
    public final void m45setMeasuredSizeozmzZPI$animation_release(long j) {
        this.measuredSize.setValue(IntSize.m2562boximpl(j));
    }

    /* renamed from: getTargetSizeMap$animation_release, reason: from getter */
    public final Map getTargetSizeMap() {
        return this.targetSizeMap;
    }

    public final void setAnimatedSize$animation_release(State state) {
        this.animatedSize = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentSize-YbymL2g, reason: not valid java name */
    public final long m43getCurrentSizeYbymL2g() {
        State state = this.animatedSize;
        return state != null ? ((IntSize) state.getValue()).getPackedValue() : m44getMeasuredSizeYbymL2g$animation_release();
    }

    /* renamed from: createSizeAnimationModifier$lambda-3, reason: not valid java name */
    private static final void m42createSizeAnimationModifier$lambda3(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public final Modifier createSizeAnimationModifier$animation_release(ContentTransform contentTransform, Composer composer, int i) {
        Modifier modifier;
        Intrinsics.checkNotNullParameter(contentTransform, "contentTransform");
        composer.startReplaceableGroup(-1349251863);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(this);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (Intrinsics.areEqual(this.transition.getCurrentState(), this.transition.getTargetState())) {
            m42createSizeAnimationModifier$lambda3(mutableState, false);
        } else if (rememberUpdatedState.getValue() != null) {
            m42createSizeAnimationModifier$lambda3(mutableState, true);
        }
        if (m41createSizeAnimationModifier$lambda2(mutableState)) {
            Transition.DeferredAnimation createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), null, composer, 64, 2);
            composer.startReplaceableGroup(1157296644);
            boolean changed2 = composer.changed(createDeferredAnimation);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) rememberUpdatedState.getValue();
                rememberedValue2 = ((sizeTransform == null || sizeTransform.getClip()) ? ClipKt.clipToBounds(Modifier.INSTANCE) : Modifier.INSTANCE).then(new SizeModifier(this, createDeferredAnimation, rememberUpdatedState));
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            modifier = (Modifier) rememberedValue2;
        } else {
            this.animatedSize = null;
            modifier = Modifier.INSTANCE;
        }
        composer.endReplaceableGroup();
        return modifier;
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015\"\u0004\b\u0016\u0010\u0005¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "", "isTarget", "<init>", "(Z)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "setTarget", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class ChildData implements ParentDataModifier {
        private boolean isTarget;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChildData) && this.isTarget == ((ChildData) other).isTarget;
        }

        public int hashCode() {
            boolean z = this.isTarget;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public Object modifyParentData(Density density, Object obj) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            return this;
        }

        public String toString() {
            return "ChildData(isTarget=" + this.isTarget + ')';
        }

        public ChildData(boolean z) {
            this.isTarget = z;
        }

        /* renamed from: isTarget, reason: from getter */
        public final boolean getIsTarget() {
            return this.isTarget;
        }

        public final void setTarget(boolean z) {
            this.isTarget = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0083\u0004\u0018\u00002\u00020\u0001B8\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0014\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013R0\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/AnimatedContentScope$SizeModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeAnimation", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "<init>", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/runtime/State;", "getSizeTransform", "()Landroidx/compose/runtime/State;", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @ExperimentalAnimationApi
    final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {
        private final Transition.DeferredAnimation sizeAnimation;
        private final State sizeTransform;
        final /* synthetic */ AnimatedContentScope this$0;

        public SizeModifier(AnimatedContentScope animatedContentScope, Transition.DeferredAnimation sizeAnimation, State sizeTransform) {
            Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
            Intrinsics.checkNotNullParameter(sizeTransform, "sizeTransform");
            this.this$0 = animatedContentScope;
            this.sizeAnimation = sizeAnimation;
            this.sizeTransform = sizeTransform;
        }

        public final State getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.layout.LayoutModifier
        /* renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult mo46measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(j);
            Transition.DeferredAnimation deferredAnimation = this.sizeAnimation;
            final AnimatedContentScope animatedContentScope = this.this$0;
            Function1 function1 = new Function1() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$size$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final FiniteAnimationSpec<IntSize> invoke(@NotNull Transition.Segment<S> animate) {
                    FiniteAnimationSpec<IntSize> mo96createAnimationSpecTemP2vQ;
                    Intrinsics.checkNotNullParameter(animate, "$this$animate");
                    State state = (State) animatedContentScope.getTargetSizeMap().get(animate.getInitialState());
                    long packedValue = state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.m2571getZeroYbymL2g();
                    State state2 = (State) animatedContentScope.getTargetSizeMap().get(animate.getTargetState());
                    long packedValue2 = state2 != null ? ((IntSize) state2.getValue()).getPackedValue() : IntSize.INSTANCE.m2571getZeroYbymL2g();
                    SizeTransform sizeTransform = (SizeTransform) this.getSizeTransform().getValue();
                    return (sizeTransform == null || (mo96createAnimationSpecTemP2vQ = sizeTransform.mo96createAnimationSpecTemP2vQ(packedValue, packedValue2)) == null) ? AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null) : mo96createAnimationSpecTemP2vQ;
                }
            };
            final AnimatedContentScope animatedContentScope2 = this.this$0;
            State animate = deferredAnimation.animate(function1, new Function1() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$size$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return IntSize.m2562boximpl(m47invokeYEO4UFw(obj));
                }

                /* renamed from: invoke-YEO4UFw, reason: not valid java name */
                public final long m47invokeYEO4UFw(S s) {
                    State state = (State) animatedContentScope2.getTargetSizeMap().get(s);
                    return state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.m2571getZeroYbymL2g();
                }
            });
            this.this$0.setAnimatedSize$animation_release(animate);
            final long mo1228alignKFBX0sM = this.this$0.getContentAlignment().mo1228alignKFBX0sM(IntSizeKt.IntSize(mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight()), ((IntSize) animate.getValue()).getPackedValue(), LayoutDirection.Ltr);
            return MeasureScope.layout$default(measure, IntSize.m2567getWidthimpl(((IntSize) animate.getValue()).getPackedValue()), IntSize.m2566getHeightimpl(((IntSize) animate.getValue()).getPackedValue()), null, new Function1() { // from class: androidx.compose.animation.AnimatedContentScope$SizeModifier$measure$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Placeable.PlacementScope layout) {
                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                    Placeable.PlacementScope.m1961place70tqf50$default(layout, Placeable.this, mo1228alignKFBX0sM, 0.0f, 2, null);
                }
            }, 4, null);
        }
    }

    /* renamed from: createSizeAnimationModifier$lambda-2, reason: not valid java name */
    private static final boolean m41createSizeAnimationModifier$lambda2(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}
