package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: AnimateAsState.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aO\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001aK\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0001\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001au\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u00102\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018\"\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00168\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018\"\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00168\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018\"\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018\"\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018\"\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00168\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b#\u0010\u0018\"\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00168\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b%\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "visibilityThreshold", "Lkotlin/Function1;", "", "finishedListener", "Landroidx/compose/runtime/State;", "animateFloatAsState", "(FLandroidx/compose/animation/core/AnimationSpec;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "animateDpAsState-Kz89ssw", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateDpAsState", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "animateValueAsState", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/SpringSpec;", "defaultAnimation", "Landroidx/compose/animation/core/SpringSpec;", "dpDefaultSpring", "Landroidx/compose/ui/geometry/Size;", "sizeDefaultSpring", "Landroidx/compose/ui/geometry/Offset;", "offsetDefaultSpring", "Landroidx/compose/ui/geometry/Rect;", "rectDefaultSpring", "", "intDefaultSpring", "Landroidx/compose/ui/unit/IntOffset;", "intOffsetDefaultSpring", "Landroidx/compose/ui/unit/IntSize;", "intSizeDefaultSpring", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AnimateAsStateKt {
    private static final SpringSpec defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    private static final SpringSpec dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m2505boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.INSTANCE)), 3, null);
    private static final SpringSpec sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m1329boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.INSTANCE)), 3, null);
    private static final SpringSpec offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m1288boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.INSTANCE)), 3, null);
    private static final SpringSpec rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.INSTANCE), 3, null);
    private static final SpringSpec intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(IntCompanionObject.INSTANCE)), 3, null);
    private static final SpringSpec intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m2545boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
    private static final SpringSpec intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m2562boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);

    public static final State animateFloatAsState(float f, AnimationSpec animationSpec, float f2, Function1 function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1091643291);
        if ((i2 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.01f;
        }
        Function1 function12 = (i2 & 8) != 0 ? null : function1;
        composer.startReplaceableGroup(841393485);
        if (animationSpec == defaultAnimation) {
            Float valueOf = Float.valueOf(f2);
            composer.startReplaceableGroup(1157296644);
            boolean changed = composer.changed(valueOf);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, Float.valueOf(f2), 3, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            animationSpec = (AnimationSpec) rememberedValue;
        }
        composer.endReplaceableGroup();
        int i3 = i << 3;
        State animateValueAsState = animateValueAsState(Float.valueOf(f), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), animationSpec, Float.valueOf(f2), function12, composer, (i & 14) | (i3 & 7168) | (i3 & 57344), 0);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    /* renamed from: animateDpAsState-Kz89ssw, reason: not valid java name */
    public static final State m101animateDpAsStateKz89ssw(float f, AnimationSpec animationSpec, Function1 function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(704104481);
        if ((i2 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        State animateValueAsState = animateValueAsState(Dp.m2505boximpl(f), VectorConvertersKt.getVectorConverter(Dp.INSTANCE), animationSpec2, null, function1, composer, (i & 14) | ((i << 3) & 896) | ((i << 6) & 57344), 8);
        composer.endReplaceableGroup();
        return animateValueAsState;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v1 ??, still in use, count: 1, list:
          (r12v1 ?? I:java.lang.Object) from 0x005e: INVOKE (r23v0 ?? I:androidx.compose.runtime.Composer), (r12v1 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:403)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final androidx.compose.runtime.State animateValueAsState(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v1 ??, still in use, count: 1, list:
          (r12v1 ?? I:java.lang.Object) from 0x005e: INVOKE (r23v0 ?? I:androidx.compose.runtime.Composer), (r12v1 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:403)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: animateValueAsState$lambda-3, reason: not valid java name */
    public static final Function1 m102animateValueAsState$lambda3(State state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: animateValueAsState$lambda-4, reason: not valid java name */
    public static final AnimationSpec m103animateValueAsState$lambda4(State state) {
        return (AnimationSpec) state.getValue();
    }
}
