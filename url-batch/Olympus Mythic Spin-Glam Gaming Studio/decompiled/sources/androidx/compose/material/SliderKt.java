package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.Strings;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u007f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0081\u0001\u0010\u0016\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aM\u0010\u001c\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001am\u0010$\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0003¢\u0006\u0004\b$\u0010%\u001aI\u0010,\u001a\u00020\u0003*\u00020&2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010)\u001a\u00020'H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001aU\u0010/\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0000H\u0003¢\u0006\u0004\b/\u00100\u001a5\u00104\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0000H\u0002¢\u0006\u0004\b4\u00105\u001a;\u0010?\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0000\u0018\u00010;*\u0002062\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0082@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>\u001a\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b@\u0010A\u001a7\u0010G\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0000H\u0002¢\u0006\u0004\bG\u0010H\u001aC\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u0000H\u0002¢\u0006\u0004\bG\u0010J\u001a'\u0010N\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u00002\u0006\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0000H\u0002¢\u0006\u0004\bN\u0010O\u001aU\u0010T\u001a\u00020\u00032\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00000R2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\bT\u0010U\u001a_\u0010V\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00192\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bV\u0010W\u001aq\u0010_\u001a\u00020\u0005*\u00020\u00052\u0006\u0010Y\u001a\u00020X2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\u00072\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00000[2\u0018\u0010]\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00020[2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00000R2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b_\u0010`\u001a3\u0010c\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020X2\u0006\u00101\u001a\u00020\u00002\u0006\u0010a\u001a\u00020\u00002\u0006\u0010b\u001a\u00020\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\bc\u0010d\u001a\u009f\u0001\u0010i\u001a\u00020\u0005*\u00020\u00052\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00000[2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00000[2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010]\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00020[2\u001e\u0010h\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030g0[H\u0002¢\u0006\u0004\bi\u0010j\"\u001d\u0010k\u001a\u00020'8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0017\u0010o\u001a\u00020'8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bo\u0010l\"\u0017\u0010p\u001a\u00020'8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bp\u0010l\"\u0017\u0010q\u001a\u00020'8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bq\u0010l\"\u001d\u0010r\u001a\u00020'8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\br\u0010l\u001a\u0004\bs\u0010n\"\u0017\u0010t\u001a\u00020'8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bt\u0010l\"\u0017\u0010u\u001a\u00020'8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bu\u0010l\"\u0014\u0010v\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010w\"\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00000x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010z\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006{"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/SliderColors;", "colors", "Slider", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "values", "RangeSlider", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "positionFraction", "", "tickFractions", "width", "SliderImpl", "(ZFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "positionFractionStart", "positionFractionEnd", "startInteractionSource", "endInteractionSource", "startThumbSemantics", "endThumbSemantics", "RangeSliderImpl", "(ZFFLjava/util/List;Landroidx/compose/material/SliderColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/ui/unit/Dp;", "offset", "thumbSize", "SliderThumb-PcYyNuk", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/ui/Modifier;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;ZFLandroidx/compose/runtime/Composer;I)V", "SliderThumb", "thumbPx", "trackStrokeWidth", "Track", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SliderColors;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", "current", "minPx", "maxPx", "snapValueToTick", "(FLjava/util/List;FF)F", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSlop", "stepsToTickFractions", "(I)Ljava/util/List;", "a1", "b1", "x1", "a2", "b2", "scale", "(FFFFF)F", VastAttributes.HORIZONTAL_POSITION, "(FFLkotlin/ranges/ClosedFloatingPointRange;FF)Lkotlin/ranges/ClosedFloatingPointRange;", "a", "b", "pos", "calcFraction", "(FFF)F", "scaleToOffset", "trackRange", "Landroidx/compose/runtime/MutableState;", "valueState", "CorrectValueSideEffect", "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "sliderSemantics", "(Landroidx/compose/ui/Modifier;FLjava/util/List;ZLkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "isRtl", "Landroidx/compose/runtime/State;", "rawOffset", "gestureEndAction", "pressOffset", "sliderTapModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;FZLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Z)Landroidx/compose/ui/Modifier;", "target", "velocity", "animateToTarget", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rawOffsetStart", "rawOffsetEnd", "Lkotlin/Function2;", "onDrag", "rangeSliderPressDragModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;ZZFLkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;", "ThumbRadius", "F", "getThumbRadius", "()F", "ThumbRippleRadius", "ThumbDefaultElevation", "ThumbPressedElevation", "TrackHeight", "getTrackHeight", "SliderHeight", "SliderMinWidth", "DefaultSliderConstraints", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/TweenSpec;", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SliderKt {
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    private static final TweenSpec SliderToTickAnimation;
    private static final float ThumbRadius = Dp.m2507constructorimpl(10);
    private static final float ThumbRippleRadius = Dp.m2507constructorimpl(24);
    private static final float ThumbDefaultElevation = Dp.m2507constructorimpl(1);
    private static final float ThumbPressedElevation = Dp.m2507constructorimpl(6);
    private static final float TrackHeight = Dp.m2507constructorimpl(4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderTapModifier(Modifier modifier, final DraggableState draggableState, final MutableInteractionSource mutableInteractionSource, final float f, final boolean z, final State state, final State state2, final MutableState mutableState, final boolean z2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("sliderTapModifier");
                inspectorInfo.getProperties().set("draggableState", DraggableState.this);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("maxPx", Float.valueOf(f));
                inspectorInfo.getProperties().set("isRtl", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("rawOffset", state);
                inspectorInfo.getProperties().set("gestureEndAction", state2);
                inspectorInfo.getProperties().set("pressOffset", mutableState);
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1945228890);
                if (z2) {
                    composer.startReplaceableGroup(773894976);
                    composer.startReplaceableGroup(-492369756);
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                        composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    composer.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    composer.endReplaceableGroup();
                    composed = SuspendingPointerInputFilterKt.pointerInput(composed, new Object[]{draggableState, mutableInteractionSource, Float.valueOf(f), Boolean.valueOf(z)}, (Function2) new AnonymousClass1(z, f, mutableState, state, coroutineScope, draggableState, state2, null));
                }
                composer.endReplaceableGroup();
                return composed;
            }

            /* compiled from: Slider.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1", f = "Slider.kt", l = {882}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                final /* synthetic */ DraggableState $draggableState;
                final /* synthetic */ State<Function1> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ MutableState<Float> $pressOffset;
                final /* synthetic */ State<Float> $rawOffset;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(boolean z, float f, MutableState<Float> mutableState, State<Float> state, CoroutineScope coroutineScope, DraggableState draggableState, State<? extends Function1> state2, Continuation continuation) {
                    super(2, continuation);
                    this.$isRtl = z;
                    this.$maxPx = f;
                    this.$pressOffset = mutableState;
                    this.$rawOffset = state;
                    this.$scope = coroutineScope;
                    this.$draggableState = draggableState;
                    this.$gestureEndAction = state2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, this.$scope, this.$draggableState, this.$gestureEndAction, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: Slider.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", l = {887}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00441 extends SuspendLambda implements Function3 {
                    final /* synthetic */ boolean $isRtl;
                    final /* synthetic */ float $maxPx;
                    final /* synthetic */ MutableState<Float> $pressOffset;
                    final /* synthetic */ State<Float> $rawOffset;
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00441(boolean z, float f, MutableState<Float> mutableState, State<Float> state, Continuation continuation) {
                        super(3, continuation);
                        this.$isRtl = z;
                        this.$maxPx = f;
                        this.$pressOffset = mutableState;
                        this.$rawOffset = state;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return m966invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).getPackedValue(), (Continuation) obj3);
                    }

                    @Nullable
                    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
                    public final Object m966invoked4ec7I(@NotNull PressGestureScope pressGestureScope, long j, @Nullable Continuation continuation) {
                        C00441 c00441 = new C00441(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, continuation);
                        c00441.L$0 = pressGestureScope;
                        c00441.J$0 = j;
                        return c00441.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        try {
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                                long j = this.J$0;
                                this.$pressOffset.setValue(Boxing.boxFloat((this.$isRtl ? this.$maxPx - Offset.m1297getXimpl(j) : Offset.m1297getXimpl(j)) - ((Number) this.$rawOffset.getValue()).floatValue()));
                                this.label = 1;
                                if (pressGestureScope.awaitRelease(this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                        } catch (GestureCancellationException unused) {
                            this.$pressOffset.setValue(Boxing.boxFloat(0.0f));
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                        C00441 c00441 = new C00441(this.$isRtl, this.$maxPx, this.$pressOffset, this.$rawOffset, null);
                        final CoroutineScope coroutineScope = this.$scope;
                        final DraggableState draggableState = this.$draggableState;
                        final State<Function1> state = this.$gestureEndAction;
                        Function1 function1 = new Function1() { // from class: androidx.compose.material.SliderKt.sliderTapModifier.2.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m967invokek4lQ0M(((Offset) obj2).getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m967invokek4lQ0M(long j) {
                                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C00451(draggableState, state, null), 3, null);
                            }

                            /* compiled from: Slider.kt */
                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1", f = "Slider.kt", l = {894}, m = "invokeSuspend")
                            /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1, reason: invalid class name and collision with other inner class name */
                            static final class C00451 extends SuspendLambda implements Function2 {
                                final /* synthetic */ DraggableState $draggableState;
                                final /* synthetic */ State<Function1> $gestureEndAction;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                C00451(DraggableState draggableState, State<? extends Function1> state, Continuation continuation) {
                                    super(2, continuation);
                                    this.$draggableState = draggableState;
                                    this.$gestureEndAction = state;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                    return new C00451(this.$draggableState, this.$gestureEndAction, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                                    return ((C00451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                /* compiled from: Slider.kt */
                                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                                @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
                                /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$2$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C00461 extends SuspendLambda implements Function2 {
                                    private /* synthetic */ Object L$0;
                                    int label;

                                    C00461(Continuation continuation) {
                                        super(2, continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @NotNull
                                    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                        C00461 c00461 = new C00461(continuation);
                                        c00461.L$0 = obj;
                                        return c00461;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    @Nullable
                                    public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation continuation) {
                                        return ((C00461) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object obj) {
                                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        if (this.label != 0) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                        ((DragScope) this.L$0).dragBy(0.0f);
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        DraggableState draggableState = this.$draggableState;
                                        MutatePriority mutatePriority = MutatePriority.UserInput;
                                        C00461 c00461 = new C00461(null);
                                        this.label = 1;
                                        if (draggableState.drag(mutatePriority, c00461, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    ((Function1) this.$gestureEndAction.getValue()).invoke(Boxing.boxFloat(0.0f));
                                    return Unit.INSTANCE;
                                }
                            }
                        };
                        this.label = 1;
                        if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, c00441, function1, this, 3, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    static {
        float m2507constructorimpl = Dp.m2507constructorimpl(48);
        SliderHeight = m2507constructorimpl;
        float m2507constructorimpl2 = Dp.m2507constructorimpl(144);
        SliderMinWidth = m2507constructorimpl2;
        DefaultSliderConstraints = SizeKt.m349heightInVpY3zN4$default(SizeKt.m364widthInVpY3zN4$default(Modifier.INSTANCE, m2507constructorimpl2, 0.0f, 2, null), 0.0f, m2507constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec(100, 0, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final Function1 onValueChange, Modifier modifier, boolean z, ClosedFloatingPointRange closedFloatingPointRange, int i, Function0 function0, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z2;
        ClosedFloatingPointRange closedFloatingPointRange2;
        int i6;
        int i7;
        int i8;
        Function0 function02;
        int i9;
        Modifier modifier2;
        final ClosedFloatingPointRange closedFloatingPointRange3;
        int i10;
        Function0 function03;
        MutableInteractionSource mutableInteractionSource2;
        int i11;
        SliderColors m960colorsq0g_0yA;
        final int i12;
        final Function0 function04;
        final SliderColors sliderColors2;
        final boolean z3;
        final MutableInteractionSource mutableInteractionSource3;
        final Modifier modifier3;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-1962335196);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        if (startRestartGroup.changed(closedFloatingPointRange2)) {
                            i14 = 16384;
                            i4 |= i14;
                        }
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i14 = 8192;
                    i4 |= i14;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((458752 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((3670016 & i2) == 0) {
                        function02 = function0;
                        i4 |= startRestartGroup.changed(function02) ? 1048576 : 524288;
                        i9 = i3 & 128;
                        if (i9 != 0) {
                            i4 |= 12582912;
                        } else if ((i2 & 29360128) == 0) {
                            i4 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                        }
                        if ((i2 & 234881024) == 0) {
                            if ((i3 & 256) == 0 && startRestartGroup.changed(sliderColors)) {
                                i13 = 67108864;
                                i4 |= i13;
                            }
                            i13 = 33554432;
                            i4 |= i13;
                        }
                        if ((i4 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i15 != 0 ? Modifier.INSTANCE : modifier;
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if ((i3 & 16) != 0) {
                                    closedFloatingPointRange3 = RangesKt.rangeTo(0.0f, 1.0f);
                                    i4 &= -57345;
                                } else {
                                    closedFloatingPointRange3 = closedFloatingPointRange2;
                                }
                                i10 = i6 != 0 ? 0 : i7;
                                function03 = i8 != 0 ? null : function0;
                                if (i9 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if ((i3 & 256) != 0) {
                                    i11 = i4 & (-234881025);
                                    m960colorsq0g_0yA = SliderDefaults.INSTANCE.m960colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, 1023);
                                    startRestartGroup.endDefaults();
                                    if (i10 >= 0) {
                                        throw new IllegalArgumentException("steps should be >= 0");
                                    }
                                    State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onValueChange, startRestartGroup, (i11 >> 3) & 14);
                                    Integer valueOf = Integer.valueOf(i10);
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    boolean changed = startRestartGroup.changed(valueOf);
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = stepsToTickFractions(i10);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    List list = (List) rememberedValue2;
                                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(modifier2);
                                    float f2 = ThumbRadius;
                                    float f3 = 2;
                                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(sliderSemantics(SizeKt.m355requiredSizeInqDBjuR0$default(minimumTouchTargetSize, Dp.m2507constructorimpl(f2 * f3), Dp.m2507constructorimpl(f2 * f3), 0.0f, 0.0f, 12, null), f, list, z2, onValueChange, closedFloatingPointRange3, i10), z2, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 2085116814, true, new SliderKt$Slider$3(closedFloatingPointRange3, i11, f, mutableInteractionSource2, z2, list, m960colorsq0g_0yA, rememberUpdatedState, function03)), startRestartGroup, 3072, 6);
                                    i12 = i10;
                                    function04 = function03;
                                    sliderColors2 = m960colorsq0g_0yA;
                                    z3 = z2;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    modifier3 = modifier2;
                                } else {
                                    i11 = i4;
                                    m960colorsq0g_0yA = sliderColors;
                                    startRestartGroup.endDefaults();
                                    if (i10 >= 0) {
                                    }
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                if ((i3 & 256) != 0) {
                                    int i16 = i4 & (-234881025);
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    m960colorsq0g_0yA = sliderColors;
                                    i11 = i16;
                                    closedFloatingPointRange3 = closedFloatingPointRange2;
                                    i10 = i7;
                                    modifier2 = modifier;
                                    function03 = function0;
                                    startRestartGroup.endDefaults();
                                    if (i10 >= 0) {
                                    }
                                } else {
                                    modifier2 = modifier;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    i11 = i4;
                                    closedFloatingPointRange3 = closedFloatingPointRange2;
                                    i10 = i7;
                                    function03 = function0;
                                    m960colorsq0g_0yA = sliderColors;
                                    startRestartGroup.endDefaults();
                                    if (i10 >= 0) {
                                    }
                                }
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z3 = z2;
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            i12 = i7;
                            function04 = function02;
                            mutableInteractionSource3 = mutableInteractionSource;
                            sliderColors2 = sliderColors;
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SliderKt$Slider$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i17) {
                                SliderKt.Slider(f, onValueChange, modifier3, z3, closedFloatingPointRange3, i12, function04, mutableInteractionSource3, sliderColors2, composer2, i2 | 1, i3);
                            }
                        });
                        return;
                    }
                    function02 = function0;
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    if ((i2 & 234881024) == 0) {
                    }
                    if ((i4 & 191739611) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                function02 = function0;
                i9 = i3 & 128;
                if (i9 != 0) {
                }
                if ((i2 & 234881024) == 0) {
                }
                if ((i4 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i15 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if ((i3 & 256) != 0) {
                }
            }
            z2 = z;
            if ((57344 & i2) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            function02 = function0;
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            if ((i2 & 234881024) == 0) {
            }
            if ((i4 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i15 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((57344 & i2) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        function02 = function0;
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        if ((i2 & 234881024) == 0) {
        }
        if ((i4 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i15 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(final ClosedFloatingPointRange values, final Function1 onValueChange, Modifier modifier, boolean z, ClosedFloatingPointRange closedFloatingPointRange, int i, Function0 function0, SliderColors sliderColors, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        ClosedFloatingPointRange closedFloatingPointRange2;
        int i6;
        int i7;
        int i8;
        SliderColors sliderColors2;
        Modifier modifier3;
        Function0 function02;
        boolean z3;
        ClosedFloatingPointRange closedFloatingPointRange3;
        int i9;
        int i10;
        Object rememberedValue;
        Composer.Companion companion;
        Object rememberedValue2;
        Composer composer2;
        final Modifier modifier4;
        final boolean z4;
        final ClosedFloatingPointRange closedFloatingPointRange4;
        final int i11;
        final Function0 function03;
        final SliderColors sliderColors3;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(-1556183027);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(values) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(onValueChange) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 7168) == 0) {
                z2 = z;
                i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        if (startRestartGroup.changed(closedFloatingPointRange2)) {
                            i13 = 16384;
                            i4 |= i13;
                        }
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i13 = 8192;
                    i4 |= i13;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((458752 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 131072 : 65536;
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(function0) ? 1048576 : 524288;
                    }
                    if ((i2 & 29360128) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changed(sliderColors)) {
                            i12 = 8388608;
                            i4 |= i12;
                        }
                        i12 = 4194304;
                        i4 |= i12;
                    }
                    if ((i4 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i14 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                                closedFloatingPointRange2 = RangesKt.rangeTo(0.0f, 1.0f);
                            }
                            if (i6 != 0) {
                                i7 = 0;
                            }
                            Function0 function04 = i8 == 0 ? null : function0;
                            if ((i3 & 128) == 0) {
                                i4 &= -29360129;
                                modifier3 = modifier5;
                                function02 = function04;
                                sliderColors2 = SliderDefaults.INSTANCE.m960colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 6, 1023);
                            } else {
                                sliderColors2 = sliderColors;
                                modifier3 = modifier5;
                                function02 = function04;
                            }
                            z3 = z2;
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            i9 = i7;
                            i10 = i4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            function02 = function0;
                            sliderColors2 = sliderColors;
                            i10 = i4;
                            modifier3 = modifier2;
                            z3 = z2;
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            i9 = i7;
                        }
                        startRestartGroup.endDefaults();
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue = startRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (rememberedValue == companion.getEmpty()) {
                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == companion.getEmpty()) {
                            rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceableGroup();
                        MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
                        if (i9 >= 0) {
                            throw new IllegalArgumentException("steps should be >= 0");
                        }
                        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onValueChange, startRestartGroup, (i10 >> 3) & 14);
                        Integer valueOf = Integer.valueOf(i9);
                        startRestartGroup.startReplaceableGroup(1157296644);
                        boolean changed = startRestartGroup.changed(valueOf);
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue3 == companion.getEmpty()) {
                            rememberedValue3 = stepsToTickFractions(i9);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceableGroup();
                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(modifier3);
                        float f = ThumbRadius;
                        composer2 = startRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m355requiredSizeInqDBjuR0$default(minimumTouchTargetSize, Dp.m2507constructorimpl(4 * f), Dp.m2507constructorimpl(f * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new SliderKt$RangeSlider$2(closedFloatingPointRange3, values, i10, rememberUpdatedState, mutableInteractionSource, mutableInteractionSource2, z3, (List) rememberedValue3, i9, sliderColors2, function02)), composer2, 3072, 6);
                        modifier4 = modifier3;
                        z4 = z3;
                        closedFloatingPointRange4 = closedFloatingPointRange3;
                        i11 = i9;
                        function03 = function02;
                        sliderColors3 = sliderColors2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        sliderColors3 = sliderColors;
                        modifier4 = modifier2;
                        z4 = z2;
                        closedFloatingPointRange4 = closedFloatingPointRange2;
                        i11 = i7;
                        composer2 = startRestartGroup;
                        function03 = function0;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SliderKt$RangeSlider$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i15) {
                            SliderKt.RangeSlider(ClosedFloatingPointRange.this, onValueChange, modifier4, z4, closedFloatingPointRange4, i11, function03, sliderColors3, composer3, i2 | 1, i3);
                        }
                    });
                    return;
                }
                i7 = i;
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i2 & 29360128) == 0) {
                }
                if ((i4 & 23967451) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i14 == 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i6 != 0) {
                }
                if (i8 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                z3 = z2;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                i9 = i7;
                i10 = i4;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) rememberedValue2;
                if (i9 >= 0) {
                }
            }
            z2 = z;
            if ((57344 & i2) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i;
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            if ((i4 & 23967451) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i14 == 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            z3 = z2;
            closedFloatingPointRange3 = closedFloatingPointRange2;
            i9 = i7;
            i10 = i4;
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource32 = (MutableInteractionSource) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource222 = (MutableInteractionSource) rememberedValue2;
            if (i9 >= 0) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        if ((57344 & i2) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i;
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        if ((i4 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i14 == 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        z3 = z2;
        closedFloatingPointRange3 = closedFloatingPointRange2;
        i9 = i7;
        i10 = i4;
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableInteractionSource mutableInteractionSource322 = (MutableInteractionSource) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableInteractionSource mutableInteractionSource2222 = (MutableInteractionSource) rememberedValue2;
        if (i9 >= 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SliderImpl(final boolean z, final float f, final List list, final SliderColors sliderColors, final float f2, final MutableInteractionSource mutableInteractionSource, final Modifier modifier, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1679682785);
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0 constructor = companion.getConstructor();
        Function3 materializerOf = LayoutKt.materializerOf(then);
        if (startRestartGroup.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(231316251);
        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float mo271toPx0680j_4 = density2.mo271toPx0680j_4(TrackHeight);
        float f3 = ThumbRadius;
        float mo271toPx0680j_42 = density2.mo271toPx0680j_4(f3);
        float mo267toDpu2uoSUM = density2.mo267toDpu2uoSUM(f2);
        float m2507constructorimpl = Dp.m2507constructorimpl(f3 * 2);
        float m2507constructorimpl2 = Dp.m2507constructorimpl(mo267toDpu2uoSUM * f);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        int i2 = i >> 6;
        Track(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), sliderColors, z, 0.0f, f, list, mo271toPx0680j_42, mo271toPx0680j_4, startRestartGroup, (i2 & 112) | 265222 | ((i << 6) & 896) | ((i << 9) & 57344));
        m961SliderThumbPcYyNuk(boxScopeInstance, companion2, m2507constructorimpl2, mutableInteractionSource, sliderColors, z, m2507constructorimpl, startRestartGroup, (i2 & 7168) | 1572918 | ((i << 3) & 57344) | ((i << 15) & 458752));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SliderKt$SliderImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                SliderKt.SliderImpl(z, f, list, sliderColors, f2, mutableInteractionSource, modifier, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RangeSliderImpl(final boolean z, final float f, final float f2, final List list, final SliderColors sliderColors, final float f3, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final Modifier modifier, final Modifier modifier2, final Modifier modifier3, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-278895713);
        Strings.Companion companion = Strings.INSTANCE;
        final String m986getString4foXLRw = Strings_androidKt.m986getString4foXLRw(companion.m985getSliderRangeStartUdPEhr4(), startRestartGroup, 6);
        final String m986getString4foXLRw2 = Strings_androidKt.m986getString4foXLRw(companion.m984getSliderRangeEndUdPEhr4(), startRestartGroup, 6);
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0 constructor = companion3.getConstructor();
        Function3 materializerOf = LayoutKt.materializerOf(then);
        if (startRestartGroup.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl, density, companion3.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(2044256857);
        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float mo271toPx0680j_4 = density2.mo271toPx0680j_4(TrackHeight);
        float f4 = ThumbRadius;
        float mo271toPx0680j_42 = density2.mo271toPx0680j_4(f4);
        float mo267toDpu2uoSUM = density2.mo267toDpu2uoSUM(f3);
        Unit unit = Unit.INSTANCE;
        float m2507constructorimpl = Dp.m2507constructorimpl(f4 * 2);
        float m2507constructorimpl2 = Dp.m2507constructorimpl(mo267toDpu2uoSUM * f);
        float m2507constructorimpl3 = Dp.m2507constructorimpl(mo267toDpu2uoSUM * f2);
        Modifier.Companion companion4 = Modifier.INSTANCE;
        int i3 = i >> 9;
        int i4 = i << 6;
        Track(SizeKt.fillMaxSize$default(boxScopeInstance.align(companion4, companion2.getCenterStart()), 0.0f, 1, null), sliderColors, z, f, f2, list, mo271toPx0680j_42, mo271toPx0680j_4, startRestartGroup, (i3 & 112) | 262144 | (i4 & 896) | (i4 & 7168) | (i4 & 57344));
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(m986getString4foXLRw);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.setContentDescription(semantics, m986getString4foXLRw);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        int i5 = i & 57344;
        int i6 = (i << 15) & 458752;
        m961SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (Function1) rememberedValue), true, mutableInteractionSource).then(modifier2), m2507constructorimpl2, mutableInteractionSource, sliderColors, z, m2507constructorimpl, startRestartGroup, (i3 & 7168) | 1572870 | i5 | i6);
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed2 = startRestartGroup.changed(m986getString4foXLRw2);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SemanticsPropertyReceiver) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    SemanticsPropertiesKt.setContentDescription(semantics, m986getString4foXLRw2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        m961SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (Function1) rememberedValue2), true, mutableInteractionSource2).then(modifier3), m2507constructorimpl3, mutableInteractionSource2, sliderColors, z, m2507constructorimpl, startRestartGroup, ((i >> 12) & 7168) | 1572870 | i5 | i6);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i7) {
                SliderKt.RangeSliderImpl(z, f, f2, list, sliderColors, f3, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SliderThumb-PcYyNuk, reason: not valid java name */
    public static final void m961SliderThumbPcYyNuk(final BoxScope boxScope, final Modifier modifier, final float f, final MutableInteractionSource mutableInteractionSource, final SliderColors sliderColors, final boolean z, final float f2, Composer composer, final int i) {
        int i2;
        float f3;
        Composer startRestartGroup = composer.startRestartGroup(428907178);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(sliderColors) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        if ((2995931 & i2) != 599186 || !startRestartGroup.getSkipping()) {
            Modifier m338paddingqDBjuR0$default = PaddingKt.m338paddingqDBjuR0$default(Modifier.INSTANCE, f, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Modifier align = boxScope.align(m338paddingqDBjuR0$default, companion.getCenterStart());
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 constructor = companion2.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(align);
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-587645648);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (rememberedValue == companion3.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            int i3 = i2 >> 9;
            int i4 = i3 & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(mutableInteractionSource) | startRestartGroup.changed(snapshotStateList);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2) rememberedValue2, startRestartGroup, i4);
            if (!snapshotStateList.isEmpty()) {
                f3 = ThumbPressedElevation;
            } else {
                f3 = ThumbDefaultElevation;
            }
            SpacerKt.Spacer(BackgroundKt.m157backgroundbw27NRU(ShadowKt.m1242shadows4CzXII$default(HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m359sizeVpY3zN4(modifier, f2, f2), mutableInteractionSource, RippleKt.m1075rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, startRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null), z ? f3 : Dp.m2507constructorimpl(0), RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), ((Color) sliderColors.thumbColor(z, startRestartGroup, ((i2 >> 15) & 14) | (i3 & 112)).getValue()).getValue(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SliderKt$SliderThumb$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i5) {
                SliderKt.m961SliderThumbPcYyNuk(BoxScope.this, modifier, f, mutableInteractionSource, sliderColors, z, f2, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Track(final Modifier modifier, final SliderColors sliderColors, final boolean z, final float f, final float f2, final List list, final float f3, final float f4, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1833126050);
        int i2 = ((i >> 6) & 14) | 48 | ((i << 3) & 896);
        final State trackColor = sliderColors.trackColor(z, false, startRestartGroup, i2);
        final State trackColor2 = sliderColors.trackColor(z, true, startRestartGroup, i2);
        final State tickColor = sliderColors.tickColor(z, false, startRestartGroup, i2);
        final State tickColor2 = sliderColors.tickColor(z, true, startRestartGroup, i2);
        CanvasKt.Canvas(modifier, new Function1() { // from class: androidx.compose.material.SliderKt$Track$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull DrawScope Canvas) {
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                boolean z2 = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
                long Offset = OffsetKt.Offset(f3, Offset.m1298getYimpl(Canvas.mo1707getCenterF1C5BW0()));
                long Offset2 = OffsetKt.Offset(Size.m1335getWidthimpl(Canvas.mo1708getSizeNHjbRc()) - f3, Offset.m1298getYimpl(Canvas.mo1707getCenterF1C5BW0()));
                long j = z2 ? Offset2 : Offset;
                long j2 = z2 ? Offset : Offset2;
                long value = ((Color) trackColor.getValue()).getValue();
                float f5 = f4;
                StrokeCap.Companion companion = StrokeCap.INSTANCE;
                long j3 = j2;
                long j4 = j;
                DrawScope.m1698drawLineNGM6Ib0$default(Canvas, value, j, j2, f5, companion.m1595getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                DrawScope.m1698drawLineNGM6Ib0$default(Canvas, ((Color) trackColor2.getValue()).getValue(), OffsetKt.Offset(Offset.m1297getXimpl(j4) + ((Offset.m1297getXimpl(j3) - Offset.m1297getXimpl(j4)) * f), Offset.m1298getYimpl(Canvas.mo1707getCenterF1C5BW0())), OffsetKt.Offset(Offset.m1297getXimpl(j4) + ((Offset.m1297getXimpl(j3) - Offset.m1297getXimpl(j4)) * f2), Offset.m1298getYimpl(Canvas.mo1707getCenterF1C5BW0())), f4, companion.m1595getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                List<Float> list2 = list;
                float f6 = f2;
                float f7 = f;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list2) {
                    float floatValue = ((Number) obj).floatValue();
                    Boolean valueOf = Boolean.valueOf(floatValue > f6 || floatValue < f7);
                    Object obj2 = linkedHashMap.get(valueOf);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(valueOf, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                State<Color> state = tickColor;
                State<Color> state2 = tickColor2;
                float f8 = f4;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list3 = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Offset.m1288boximpl(OffsetKt.Offset(Offset.m1297getXimpl(OffsetKt.m1312lerpWko1d7g(j4, j3, ((Number) it.next()).floatValue())), Offset.m1298getYimpl(Canvas.mo1707getCenterF1C5BW0()))));
                    }
                    long j5 = j4;
                    long j6 = j3;
                    DrawScope.m1701drawPointsF8ZwMP8$default(Canvas, arrayList, PointMode.INSTANCE.m1567getPointsr_lszbg(), ((Color) (booleanValue ? state : state2).getValue()).getValue(), f8, StrokeCap.INSTANCE.m1595getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                    f8 = f8;
                    j4 = j5;
                    j3 = j6;
                }
            }
        }, startRestartGroup, i & 14);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SliderKt$Track$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                SliderKt.Track(Modifier.this, sliderColors, z, f, f2, list, f3, f4, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f, List list, float f2, float f3) {
        Object obj;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(MathHelpersKt.lerp(f2, f3, ((Number) next).floatValue()) - f);
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(MathHelpersKt.lerp(f2, f3, ((Number) next2).floatValue()) - f);
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Float f4 = (Float) obj;
        return f4 != null ? MathHelpersKt.lerp(f2, f3, f4.floatValue()) : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m964awaitSlop8vUncbI(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Continuation continuation) {
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        int i2;
        Ref$FloatRef ref$FloatRef;
        PointerInputChange pointerInputChange;
        if (continuation instanceof SliderKt$awaitSlop$1) {
            sliderKt$awaitSlop$1 = (SliderKt$awaitSlop$1) continuation;
            int i3 = sliderKt$awaitSlop$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sliderKt$awaitSlop$1.label = i3 - Integer.MIN_VALUE;
                SliderKt$awaitSlop$1 sliderKt$awaitSlop$12 = sliderKt$awaitSlop$1;
                Object obj = sliderKt$awaitSlop$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = sliderKt$awaitSlop$12.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    Function2 function2 = new Function2() { // from class: androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((PointerInputChange) obj2, ((Number) obj3).floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull PointerInputChange pointerInput, float f) {
                            Intrinsics.checkNotNullParameter(pointerInput, "pointerInput");
                            pointerInput.consume();
                            Ref$FloatRef.this.element = f;
                        }
                    };
                    sliderKt$awaitSlop$12.L$0 = ref$FloatRef2;
                    sliderKt$awaitSlop$12.label = 1;
                    Object m837awaitHorizontalPointerSlopOrCancellationgDDlDlE = DragGestureDetectorCopyKt.m837awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j, i, function2, sliderKt$awaitSlop$12);
                    if (m837awaitHorizontalPointerSlopOrCancellationgDDlDlE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = m837awaitHorizontalPointerSlopOrCancellationgDDlDlE;
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$FloatRef = (Ref$FloatRef) sliderKt$awaitSlop$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange == null) {
                    return TuplesKt.to(pointerInputChange, Boxing.boxFloat(ref$FloatRef.element));
                }
                return null;
            }
        }
        sliderKt$awaitSlop$1 = new SliderKt$awaitSlop$1(continuation);
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$122 = sliderKt$awaitSlop$1;
        Object obj2 = sliderKt$awaitSlop$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = sliderKt$awaitSlop$122.label;
        if (i2 != 0) {
        }
        pointerInputChange = (PointerInputChange) obj2;
        if (pointerInputChange == null) {
        }
    }

    private static final List stepsToTickFractions(int i) {
        if (i == 0) {
            return CollectionsKt.emptyList();
        }
        int i2 = i + 2;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Float.valueOf(i3 / (i + 1)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange scale(float f, float f2, ClosedFloatingPointRange closedFloatingPointRange, float f3, float f4) {
        return RangesKt.rangeTo(scale(f, f2, ((Number) closedFloatingPointRange.getStart()).floatValue(), f3, f4), scale(f, f2, ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), f3, f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        return RangesKt.coerceIn(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CorrectValueSideEffect(final Function1 function1, final ClosedFloatingPointRange closedFloatingPointRange, final ClosedFloatingPointRange closedFloatingPointRange2, final MutableState mutableState, final float f, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-743965752);
        int i2 = (i & 14) == 0 ? (startRestartGroup.changed(function1) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(closedFloatingPointRange) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(closedFloatingPointRange2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((i2 & 46811) != 9362 || !startRestartGroup.getSkipping()) {
            Object[] objArr = {closedFloatingPointRange, function1, Float.valueOf(f), mutableState, closedFloatingPointRange2};
            startRestartGroup.startReplaceableGroup(-568225417);
            boolean z = false;
            for (int i3 = 0; i3 < 5; i3++) {
                z |= startRestartGroup.changed(objArr[i3]);
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        m965invoke();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m965invoke() {
                        float floatValue = (((Number) ClosedFloatingPointRange.this.getEndInclusive()).floatValue() - ((Number) ClosedFloatingPointRange.this.getStart()).floatValue()) / 1000;
                        float floatValue2 = ((Number) function1.invoke(Float.valueOf(f))).floatValue();
                        if (Math.abs(floatValue2 - ((Number) mutableState.getValue()).floatValue()) <= floatValue || !closedFloatingPointRange2.contains((Comparable) mutableState.getValue())) {
                            return;
                        }
                        mutableState.setValue(Float.valueOf(floatValue2));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i4) {
                SliderKt.CorrectValueSideEffect(Function1.this, closedFloatingPointRange, closedFloatingPointRange2, mutableState, f, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderSemantics(Modifier modifier, float f, final List list, final boolean z, final Function1 function1, final ClosedFloatingPointRange closedFloatingPointRange, final int i) {
        final float coerceIn = RangesKt.coerceIn(f, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                if (!z) {
                    SemanticsPropertiesKt.disabled(semantics);
                }
                final ClosedFloatingPointRange closedFloatingPointRange2 = closedFloatingPointRange;
                final int i2 = i;
                final List<Float> list2 = list;
                final float f2 = coerceIn;
                final Function1 function12 = function1;
                SemanticsPropertiesKt.setProgress$default(semantics, null, new Function1() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).floatValue());
                    }

                    @NotNull
                    public final Boolean invoke(float f3) {
                        boolean z2;
                        Object obj;
                        float coerceIn2 = RangesKt.coerceIn(f3, ((Number) ClosedFloatingPointRange.this.getStart()).floatValue(), ((Number) ClosedFloatingPointRange.this.getEndInclusive()).floatValue());
                        if (i2 > 0) {
                            List<Float> list3 = list2;
                            ClosedFloatingPointRange closedFloatingPointRange3 = ClosedFloatingPointRange.this;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                            Iterator<T> it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Float.valueOf(MathHelpersKt.lerp(((Number) closedFloatingPointRange3.getStart()).floatValue(), ((Number) closedFloatingPointRange3.getEndInclusive()).floatValue(), ((Number) it.next()).floatValue())));
                            }
                            Iterator it2 = arrayList.iterator();
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (it2.hasNext()) {
                                    float abs = Math.abs(((Number) next).floatValue() - coerceIn2);
                                    do {
                                        Object next2 = it2.next();
                                        float abs2 = Math.abs(((Number) next2).floatValue() - coerceIn2);
                                        if (Float.compare(abs, abs2) > 0) {
                                            next = next2;
                                            abs = abs2;
                                        }
                                    } while (it2.hasNext());
                                }
                                obj = next;
                            } else {
                                obj = null;
                            }
                            Float f4 = (Float) obj;
                            if (f4 != null) {
                                coerceIn2 = f4.floatValue();
                            }
                        }
                        if (coerceIn2 == f2) {
                            z2 = false;
                        } else {
                            function12.invoke(Float.valueOf(coerceIn2));
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
            }
        }, 1, null), f, closedFloatingPointRange, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f, float f2, float f3, Continuation continuation) {
        Object drag$default = DraggableState.drag$default(draggableState, null, new SliderKt$animateToTarget$2(f, f2, f3, null), continuation, 1, null);
        return drag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State state, State state2, boolean z, boolean z2, float f, ClosedFloatingPointRange closedFloatingPointRange, State state3, State state4) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f), Boolean.valueOf(z2), closedFloatingPointRange}, (Function2) new SliderKt$rangeSliderPressDragModifier$1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z2, f, state3, null)) : modifier;
    }

    public static final float getThumbRadius() {
        return ThumbRadius;
    }
}
