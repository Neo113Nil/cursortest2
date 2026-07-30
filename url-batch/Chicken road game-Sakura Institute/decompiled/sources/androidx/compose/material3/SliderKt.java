package androidx.compose.material3;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.internal.DragGestureDetectorCopyKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0098\u0001\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\u0019\b\u0002\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0019\b\u0002\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$H\u0007¢\u0006\u0002\u0010'\u001aä\u0001\u0010\u0016\u001a\u00020\u00172\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)\u0012\u0004\u0012\u00020\u00170#2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010.2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\u0019\b\u0002\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0019\b\u0002\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\b\b\u0003\u0010/\u001a\u000200H\u0007¢\u0006\u0002\u00101\u001a\u007f\u0010\u0016\u001a\u00020\u00172\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\u0018\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)\u0012\u0004\u0012\u00020\u00170#2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)2\b\b\u0003\u0010/\u001a\u0002002\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010.2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007¢\u0006\u0002\u00102\u001a\u0080\u0001\u00103\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$H\u0003¢\u0006\u0002\u00104\u001as\u00105\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u0002062\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u00107\u001a\u00020 2\u0019\b\u0002\u00108\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0019\b\u0002\u0010&\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$H\u0007¢\u0006\u0002\u00109\u001a³\u0001\u00105\u001a\u00020\u00172\u0006\u0010(\u001a\u00020*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00170#2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010.2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u00107\u001a\u00020 2\b\b\u0003\u0010/\u001a\u0002002\u0019\b\u0002\u00108\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0019\b\u0002\u0010&\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)H\u0007¢\u0006\u0002\u0010:\u001a}\u00105\u001a\u00020\u00172\u0006\u0010(\u001a\u00020*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00170#2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020*0)2\b\b\u0003\u0010/\u001a\u0002002\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010.2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u00107\u001a\u00020 H\u0007¢\u0006\u0002\u0010;\u001a_\u0010<\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u0002062\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u00107\u001a\u00020 2\u0017\u00108\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00170#¢\u0006\u0002\b$H\u0003¢\u0006\u0002\u0010=\u001a\u001d\u0010>\u001a\u00020\u00112\u0006\u0010?\u001a\u00020*2\u0006\u0010@\u001a\u00020*H\u0001¢\u0006\u0002\u0010A\u001a\u001b\u0010>\u001a\u00020\u00112\f\u0010B\u001a\b\u0012\u0004\u0012\u00020*0)H\u0001¢\u0006\u0002\u0010C\u001a \u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020*2\u0006\u0010F\u001a\u00020*2\u0006\u0010G\u001a\u00020*H\u0002\u001a:\u0010H\u001a\u00020\u00112\u0006\u0010I\u001a\u00020*2\u0006\u0010J\u001a\u00020*2\u0006\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020*2\u0006\u0010M\u001a\u00020*H\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a0\u0010H\u001a\u00020*2\u0006\u0010I\u001a\u00020*2\u0006\u0010J\u001a\u00020*2\u0006\u0010P\u001a\u00020*2\u0006\u0010L\u001a\u00020*2\u0006\u0010M\u001a\u00020*H\u0002\u001a(\u0010Q\u001a\u00020*2\u0006\u0010R\u001a\u00020*2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020*2\u0006\u0010V\u001a\u00020*H\u0002\u001a\u0010\u0010W\u001a\u00020T2\u0006\u0010/\u001a\u000200H\u0002\u001a5\u0010X\u001a\u0010\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020*\u0018\u00010Y*\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_H\u0082@ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a\u001c\u0010b\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0010H\u0002\u001a,\u0010c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u0010H\u0003\u001a\u001c\u0010d\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0010H\u0002\u001a\u001c\u0010e\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0018\u001a\u0002062\u0006\u0010\u001c\u001a\u00020\u0010H\u0002\u001a$\u0010f\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0018\u001a\u0002062\u0006\u00107\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u0010H\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\"\u0010\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u0016\u0010\t\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\r\u0010\u000b\"\u0010\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u001e\u0010\u000f\u001a\u00020\u0010*\u00020\u00118@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006g"}, d2 = {"SliderRangeTolerance", "", "ThumbHeight", "Landroidx/compose/ui/unit/Dp;", "F", "ThumbSize", "Landroidx/compose/ui/unit/DpSize;", "J", "ThumbTrackGapSize", "ThumbWidth", "getThumbWidth", "()F", "TrackHeight", "getTrackHeight", "TrackInsideCornerSize", "isSpecified", "", "Landroidx/compose/material3/SliderRange;", "isSpecified-If1S1O4$annotations", "(J)V", "isSpecified-If1S1O4", "(J)Z", "RangeSlider", "", "state", "Landroidx/compose/material3/RangeSliderState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/SliderColors;", "startInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "endInteractionSource", "startThumb", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "endThumb", "track", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "value", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "onValueChange", "valueRange", "onValueChangeFinished", "Lkotlin/Function0;", "steps", "", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;III)V", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSliderImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RangeSliderState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Slider", "Landroidx/compose/material3/SliderState;", "interactionSource", "thumb", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;ILkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/Composer;III)V", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SliderImpl", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderState;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "SliderRange", "start", "endInclusive", "(FF)J", "range", "(Lkotlin/ranges/ClosedFloatingPointRange;)J", "calcFraction", "a", "b", "pos", "scale", "a1", "b1", "x", "a2", "b2", "scale-ziovWd0", "(FFJFF)J", "x1", "snapValueToTick", "current", "tickFractions", "", "minPx", "maxPx", "stepsToTickFractions", "awaitSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "awaitSlop-8vUncbI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rangeSliderEndThumbSemantics", "rangeSliderPressDragModifier", "rangeSliderStartThumbSemantics", "sliderSemantics", "sliderTapModifier", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderKt {
    private static final double SliderRangeTolerance = 1.0E-4d;
    private static final float ThumbHeight;
    private static final long ThumbSize;
    private static final float ThumbTrackGapSize;
    private static final float ThumbWidth;
    private static final float TrackHeight = SliderTokens.INSTANCE.m3177getInactiveTrackHeightD9Ej5fM();
    private static final float TrackInsideCornerSize;

    /* renamed from: isSpecified-If1S1O4$annotations, reason: not valid java name */
    public static /* synthetic */ void m2186isSpecifiedIf1S1O4$annotations(long j) {
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final Function1<? super Float, Unit> function1, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        final boolean z2;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i7;
        int i8;
        int i9;
        Function0<Unit> function02;
        int i10;
        SliderColors sliderColors2;
        final MutableInteractionSource mutableInteractionSource2;
        int i11;
        int i12;
        final SliderColors sliderColors3;
        Function0<Unit> function03;
        final Function0<Unit> function04;
        final boolean z3;
        final SliderColors sliderColors4;
        final Modifier modifier3;
        final int i13;
        final MutableInteractionSource mutableInteractionSource3;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        ScopeUpdateScope endRestartGroup;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-202044027);
        ComposerKt.sourceInformation(startRestartGroup, "C(Slider)P(7,4,3,1,8,6,5)167@8058L8,168@8118L39,179@8458L181,186@8657L122,170@8166L652:Slider.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    z2 = z;
                    i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            closedFloatingPointRange2 = closedFloatingPointRange;
                            if (startRestartGroup.changed(closedFloatingPointRange2)) {
                                i15 = 16384;
                                i4 |= i15;
                            }
                        } else {
                            closedFloatingPointRange2 = closedFloatingPointRange;
                        }
                        i15 = 8192;
                        i4 |= i15;
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i2) == 0) {
                        i8 = i;
                        i4 |= startRestartGroup.changed(i8) ? 131072 : 65536;
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((1572864 & i2) == 0) {
                            function02 = function0;
                            i4 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                            if ((i2 & 12582912) == 0) {
                                if ((i3 & 128) == 0 && startRestartGroup.changed(sliderColors)) {
                                    i14 = 8388608;
                                    i4 |= i14;
                                }
                                i14 = 4194304;
                                i4 |= i14;
                            }
                            i10 = i3 & 256;
                            if (i10 == 0) {
                                i4 |= 100663296;
                            } else if ((i2 & 100663296) == 0) {
                                i4 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i4 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i5 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i6 != 0) {
                                        z2 = true;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                        closedFloatingPointRange2 = RangesKt.rangeTo(0.0f, 1.0f);
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i9 != 0) {
                                        function02 = null;
                                    }
                                    if ((i3 & 128) == 0) {
                                        sliderColors2 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                        i4 &= -29360129;
                                    } else {
                                        sliderColors2 = sliderColors;
                                    }
                                    if (i10 == 0) {
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -403669397, "CC(remember):Slider.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    } else {
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    i11 = i4;
                                    i12 = i8;
                                    sliderColors3 = sliderColors2;
                                    function03 = function02;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    i11 = i4;
                                    i12 = i8;
                                    function03 = function02;
                                    sliderColors3 = sliderColors;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-202044027, i11, -1, "androidx.compose.material3.Slider (Slider.kt:169)");
                                }
                                int i16 = i11 >> 6;
                                Slider(f, function1, modifier2, z2, function03, sliderColors3, mutableInteractionSource2, i12, ComposableLambdaKt.rememberComposableLambda(308249025, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                                        invoke(sliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(SliderState sliderState, Composer composer2, int i17) {
                                        ComposerKt.sourceInformation(composer2, "C180@8487L142:Slider.kt#uh7d8r");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(308249025, i17, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:180)");
                                        }
                                        SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors3, z2, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1843234110, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                                        invoke(sliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(SliderState sliderState, Composer composer2, int i17) {
                                        ComposerKt.sourceInformation(composer2, "C187@8701L68:Slider.kt#uh7d8r");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1843234110, i17, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:187)");
                                        }
                                        SliderDefaults.INSTANCE.m2174Track4EFweAY(sliderState, (Modifier) null, z2, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i17 & 14) | 100663296, 242);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54), closedFloatingPointRange2, startRestartGroup, (i11 & 14) | 905969664 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i16) | (458752 & i16) | (i16 & 3670016) | ((i11 << 6) & 29360128), (i11 >> 12) & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function04 = function03;
                                z3 = z2;
                                sliderColors4 = sliderColors3;
                                modifier3 = modifier2;
                                i13 = i12;
                                ClosedFloatingPointRange<Float> closedFloatingPointRange4 = closedFloatingPointRange2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                closedFloatingPointRange3 = closedFloatingPointRange4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z3 = z2;
                                closedFloatingPointRange3 = closedFloatingPointRange2;
                                i13 = i8;
                                function04 = function02;
                                sliderColors4 = sliderColors;
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i17) {
                                        SliderKt.Slider(f, function1, modifier3, z3, closedFloatingPointRange3, i13, function04, sliderColors4, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        function02 = function0;
                        if ((i2 & 12582912) == 0) {
                        }
                        i10 = i3 & 256;
                        if (i10 == 0) {
                        }
                        if ((i4 & 38347923) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if ((i3 & 128) == 0) {
                        }
                        if (i10 == 0) {
                        }
                        i11 = i4;
                        i12 = i8;
                        sliderColors3 = sliderColors2;
                        function03 = function02;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i162 = i11 >> 6;
                        Slider(f, function1, modifier2, z2, function03, sliderColors3, mutableInteractionSource2, i12, ComposableLambdaKt.rememberComposableLambda(308249025, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                                invoke(sliderState, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(SliderState sliderState, Composer composer2, int i17) {
                                ComposerKt.sourceInformation(composer2, "C180@8487L142:Slider.kt#uh7d8r");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(308249025, i17, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:180)");
                                }
                                SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors3, z2, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1843234110, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                                invoke(sliderState, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(SliderState sliderState, Composer composer2, int i17) {
                                ComposerKt.sourceInformation(composer2, "C187@8701L68:Slider.kt#uh7d8r");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1843234110, i17, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:187)");
                                }
                                SliderDefaults.INSTANCE.m2174Track4EFweAY(sliderState, (Modifier) null, z2, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i17 & 14) | 100663296, 242);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), closedFloatingPointRange2, startRestartGroup, (i11 & 14) | 905969664 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i162) | (458752 & i162) | (i162 & 3670016) | ((i11 << 6) & 29360128), (i11 >> 12) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function04 = function03;
                        z3 = z2;
                        sliderColors4 = sliderColors3;
                        modifier3 = modifier2;
                        i13 = i12;
                        ClosedFloatingPointRange<Float> closedFloatingPointRange42 = closedFloatingPointRange2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        closedFloatingPointRange3 = closedFloatingPointRange42;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i;
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    function02 = function0;
                    if ((i2 & 12582912) == 0) {
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                    }
                    if ((i4 & 38347923) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i3 & 128) == 0) {
                    }
                    if (i10 == 0) {
                    }
                    i11 = i4;
                    i12 = i8;
                    sliderColors3 = sliderColors2;
                    function03 = function02;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1622 = i11 >> 6;
                    Slider(f, function1, modifier2, z2, function03, sliderColors3, mutableInteractionSource2, i12, ComposableLambdaKt.rememberComposableLambda(308249025, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                            invoke(sliderState, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(SliderState sliderState, Composer composer2, int i17) {
                            ComposerKt.sourceInformation(composer2, "C180@8487L142:Slider.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(308249025, i17, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:180)");
                            }
                            SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors3, z2, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1843234110, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                            invoke(sliderState, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(SliderState sliderState, Composer composer2, int i17) {
                            ComposerKt.sourceInformation(composer2, "C187@8701L68:Slider.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1843234110, i17, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:187)");
                            }
                            SliderDefaults.INSTANCE.m2174Track4EFweAY(sliderState, (Modifier) null, z2, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i17 & 14) | 100663296, 242);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), closedFloatingPointRange2, startRestartGroup, (i11 & 14) | 905969664 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i1622) | (458752 & i1622) | (i1622 & 3670016) | ((i11 << 6) & 29360128), (i11 >> 12) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function04 = function03;
                    z3 = z2;
                    sliderColors4 = sliderColors3;
                    modifier3 = modifier2;
                    i13 = i12;
                    ClosedFloatingPointRange<Float> closedFloatingPointRange422 = closedFloatingPointRange2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    closedFloatingPointRange3 = closedFloatingPointRange422;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z2 = z;
                if ((i2 & 24576) != 0) {
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i;
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                function02 = function0;
                if ((i2 & 12582912) == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                if ((i4 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i7 != 0) {
                }
                if (i9 != 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if (i10 == 0) {
                }
                i11 = i4;
                i12 = i8;
                sliderColors3 = sliderColors2;
                function03 = function02;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i16222 = i11 >> 6;
                Slider(f, function1, modifier2, z2, function03, sliderColors3, mutableInteractionSource2, i12, ComposableLambdaKt.rememberComposableLambda(308249025, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                        invoke(sliderState, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(SliderState sliderState, Composer composer2, int i17) {
                        ComposerKt.sourceInformation(composer2, "C180@8487L142:Slider.kt#uh7d8r");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(308249025, i17, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:180)");
                        }
                        SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors3, z2, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1843234110, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                        invoke(sliderState, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(SliderState sliderState, Composer composer2, int i17) {
                        ComposerKt.sourceInformation(composer2, "C187@8701L68:Slider.kt#uh7d8r");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1843234110, i17, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:187)");
                        }
                        SliderDefaults.INSTANCE.m2174Track4EFweAY(sliderState, (Modifier) null, z2, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i17 & 14) | 100663296, 242);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), closedFloatingPointRange2, startRestartGroup, (i11 & 14) | 905969664 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i16222) | (458752 & i16222) | (i16222 & 3670016) | ((i11 << 6) & 29360128), (i11 >> 12) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                function04 = function03;
                z3 = z2;
                sliderColors4 = sliderColors3;
                modifier3 = modifier2;
                i13 = i12;
                ClosedFloatingPointRange<Float> closedFloatingPointRange4222 = closedFloatingPointRange2;
                mutableInteractionSource3 = mutableInteractionSource2;
                closedFloatingPointRange3 = closedFloatingPointRange4222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z2 = z;
            if ((i2 & 24576) != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i;
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            function02 = function0;
            if ((i2 & 12582912) == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            if ((i4 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if (i10 == 0) {
            }
            i11 = i4;
            i12 = i8;
            sliderColors3 = sliderColors2;
            function03 = function02;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i162222 = i11 >> 6;
            Slider(f, function1, modifier2, z2, function03, sliderColors3, mutableInteractionSource2, i12, ComposableLambdaKt.rememberComposableLambda(308249025, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                    invoke(sliderState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(SliderState sliderState, Composer composer2, int i17) {
                    ComposerKt.sourceInformation(composer2, "C180@8487L142:Slider.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(308249025, i17, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:180)");
                    }
                    SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors3, z2, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1843234110, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                    invoke(sliderState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(SliderState sliderState, Composer composer2, int i17) {
                    ComposerKt.sourceInformation(composer2, "C187@8701L68:Slider.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1843234110, i17, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:187)");
                    }
                    SliderDefaults.INSTANCE.m2174Track4EFweAY(sliderState, (Modifier) null, z2, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i17 & 14) | 100663296, 242);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), closedFloatingPointRange2, startRestartGroup, (i11 & 14) | 905969664 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i162222) | (458752 & i162222) | (i162222 & 3670016) | ((i11 << 6) & 29360128), (i11 >> 12) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            function04 = function03;
            z3 = z2;
            sliderColors4 = sliderColors3;
            modifier3 = modifier2;
            i13 = i12;
            ClosedFloatingPointRange<Float> closedFloatingPointRange42222 = closedFloatingPointRange2;
            mutableInteractionSource3 = mutableInteractionSource2;
            closedFloatingPointRange3 = closedFloatingPointRange42222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z2 = z;
        if ((i2 & 24576) != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i;
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        function02 = function0;
        if ((i2 & 12582912) == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        if ((i4 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if (i10 == 0) {
        }
        i11 = i4;
        i12 = i8;
        sliderColors3 = sliderColors2;
        function03 = function02;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1622222 = i11 >> 6;
        Slider(f, function1, modifier2, z2, function03, sliderColors3, mutableInteractionSource2, i12, ComposableLambdaKt.rememberComposableLambda(308249025, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                invoke(sliderState, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(SliderState sliderState, Composer composer2, int i17) {
                ComposerKt.sourceInformation(composer2, "C180@8487L142:Slider.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(308249025, i17, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:180)");
                }
                SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors3, z2, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1843234110, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                invoke(sliderState, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(SliderState sliderState, Composer composer2, int i17) {
                ComposerKt.sourceInformation(composer2, "C187@8701L68:Slider.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1843234110, i17, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:187)");
                }
                SliderDefaults.INSTANCE.m2174Track4EFweAY(sliderState, (Modifier) null, z2, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i17 & 14) | 100663296, 242);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), closedFloatingPointRange2, startRestartGroup, (i11 & 14) | 905969664 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i1622222) | (458752 & i1622222) | (i1622222 & 3670016) | ((i11 << 6) & 29360128), (i11 >> 12) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        function04 = function03;
        z3 = z2;
        sliderColors4 = sliderColors3;
        modifier3 = modifier2;
        i13 = i12;
        ClosedFloatingPointRange<Float> closedFloatingPointRange422222 = closedFloatingPointRange2;
        mutableInteractionSource3 = mutableInteractionSource2;
        closedFloatingPointRange3 = closedFloatingPointRange422222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final float f, final Function1<? super Float, Unit> function1, Modifier modifier, boolean z, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, int i, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, ClosedFloatingPointRange<Float> closedFloatingPointRange, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        Function0<Unit> function02;
        SliderColors sliderColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier.Companion companion;
        final boolean z2;
        Function0<Unit> function03;
        final SliderColors sliderColors3;
        final MutableInteractionSource mutableInteractionSource2;
        int i13;
        ComposableLambda composableLambda;
        ComposableLambda rememberComposableLambda;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i14;
        int i15;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function33;
        int i16;
        SliderColors sliderColors4;
        boolean z3;
        Object rememberedValue;
        final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function34;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        final Function0<Unit> function04;
        final SliderColors sliderColors5;
        final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function35;
        final boolean z4;
        final int i17;
        ScopeUpdateScope endRestartGroup;
        int i18;
        int i19;
        Composer startRestartGroup = composer.startRestartGroup(1191170377);
        ComposerKt.sourceInformation(startRestartGroup, "C(Slider)P(9,4,3,1,5)256@12184L8,257@12244L39,259@12372L157,266@12578L114,272@12779L92,278@12998L184:Slider.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i20 = i4 & 4;
        if (i20 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    function02 = function0;
                    i5 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    if ((196608 & i2) != 0) {
                        if ((i4 & 32) == 0) {
                            sliderColors2 = sliderColors;
                            if (startRestartGroup.changed(sliderColors2)) {
                                i19 = 131072;
                                i5 |= i19;
                            }
                        } else {
                            sliderColors2 = sliderColors;
                        }
                        i19 = 65536;
                        i5 |= i19;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i8 = i4 & 64;
                    if (i8 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                    }
                    i9 = i4 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                    }
                    i10 = i4 & 256;
                    if (i10 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= startRestartGroup.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i11 = i4 & 512;
                    if (i11 == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i5 |= startRestartGroup.changedInstance(function32) ? 536870912 : 268435456;
                    }
                    if ((i3 & 6) != 0) {
                        if ((i4 & 1024) == 0 && startRestartGroup.changed(closedFloatingPointRange)) {
                            i18 = 4;
                            i12 = i3 | i18;
                        }
                        i18 = 2;
                        i12 = i3 | i18;
                    } else {
                        i12 = i3;
                    }
                    if ((i5 & 306783379) == 306783378 || (i12 & 3) != 2 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i20 == 0 ? Modifier.INSTANCE : modifier;
                            z2 = i6 == 0 ? true : z;
                            function03 = i7 == 0 ? null : function02;
                            if ((i4 & 32) == 0) {
                                sliderColors3 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                i5 &= -458753;
                            } else {
                                sliderColors3 = sliderColors2;
                            }
                            if (i8 == 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -403537365, "CC(remember):Slider.kt#9igjgp");
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            int i21 = i9 == 0 ? 0 : i;
                            if (i10 == 0) {
                                i13 = i21;
                                composableLambda = ComposableLambdaKt.rememberComposableLambda(-1756326375, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$6
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                                        invoke(sliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(SliderState sliderState, Composer composer2, int i22) {
                                        ComposerKt.sourceInformation(composer2, "C260@12397L126:Slider.kt#uh7d8r");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1756326375, i22, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:260)");
                                        }
                                        SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors3, z2, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54);
                            } else {
                                i13 = i21;
                                composableLambda = function3;
                            }
                            rememberComposableLambda = i11 == 0 ? ComposableLambdaKt.rememberComposableLambda(2083675534, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$7
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState, Composer composer2, Integer num) {
                                    invoke(sliderState, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(SliderState sliderState, Composer composer2, int i22) {
                                    ComposerKt.sourceInformation(composer2, "C267@12618L68:Slider.kt#uh7d8r");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2083675534, i22, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:267)");
                                    }
                                    SliderDefaults.INSTANCE.m2174Track4EFweAY(sliderState, (Modifier) null, z2, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i22 & 14) | 100663296, 242);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54) : function32;
                            if ((i4 & 1024) == 0) {
                                closedFloatingPointRange2 = RangesKt.rangeTo(0.0f, 1.0f);
                                i12 &= -15;
                            } else {
                                closedFloatingPointRange2 = closedFloatingPointRange;
                            }
                            i14 = i5;
                            i15 = i12;
                            function33 = composableLambda;
                            i16 = i13;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 32) != 0) {
                                i5 &= -458753;
                            }
                            if ((i4 & 1024) != 0) {
                                i12 &= -15;
                            }
                            companion = modifier;
                            z2 = z;
                            i16 = i;
                            rememberComposableLambda = function32;
                            closedFloatingPointRange2 = closedFloatingPointRange;
                            function03 = function02;
                            sliderColors3 = sliderColors2;
                            i15 = i12;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i14 = i5;
                            function33 = function3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            sliderColors4 = sliderColors3;
                        } else {
                            sliderColors4 = sliderColors3;
                            ComposerKt.traceEventStart(1191170377, i14, i15, "androidx.compose.material3.Slider (Slider.kt:270)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -403520192, "CC(remember):Slider.kt#9igjgp");
                        z3 = ((29360128 & i14) != 8388608) | ((((i15 & 14) ^ 6) > 4 && startRestartGroup.changed(closedFloatingPointRange2)) || (i15 & 6) == 4);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new SliderState(f, i16, function03, closedFloatingPointRange2);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        SliderState sliderState = (SliderState) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        sliderState.setOnValueChangeFinished(function03);
                        sliderState.setOnValueChange$material3_release(function1);
                        sliderState.setValue(f);
                        int i22 = i14 >> 9;
                        Slider(sliderState, companion, z2, null, mutableInteractionSource2, function33, rememberComposableLambda, startRestartGroup, ((i14 >> 3) & PointerIconCompat.TYPE_TEXT) | ((i14 >> 6) & 57344) | (458752 & i22) | (i22 & 3670016), 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function34 = rememberComposableLambda;
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        function04 = function03;
                        sliderColors5 = sliderColors4;
                        function35 = function33;
                        z4 = z2;
                        i17 = i16;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier;
                        z4 = z;
                        i17 = i;
                        function35 = function3;
                        function34 = function32;
                        closedFloatingPointRange3 = closedFloatingPointRange;
                        function04 = function02;
                        sliderColors5 = sliderColors2;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final Modifier modifier2 = companion;
                        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i23) {
                                SliderKt.Slider(f, function1, modifier2, z4, function04, sliderColors5, mutableInteractionSource3, i17, function35, function34, closedFloatingPointRange3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                            }
                        });
                        return;
                    }
                    return;
                }
                function02 = function0;
                if ((196608 & i2) != 0) {
                }
                i8 = i4 & 64;
                if (i8 == 0) {
                }
                i9 = i4 & 128;
                if (i9 == 0) {
                }
                i10 = i4 & 256;
                if (i10 == 0) {
                }
                i11 = i4 & 512;
                if (i11 == 0) {
                }
                if ((i3 & 6) != 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i20 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((i4 & 32) == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if ((i4 & 1024) == 0) {
                }
                i14 = i5;
                i15 = i12;
                function33 = composableLambda;
                i16 = i13;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -403520192, "CC(remember):Slider.kt#9igjgp");
                if (((i15 & 14) ^ 6) > 4) {
                    z3 = ((29360128 & i14) != 8388608) | ((((i15 & 14) ^ 6) > 4 && startRestartGroup.changed(closedFloatingPointRange2)) || (i15 & 6) == 4);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z3) {
                    }
                    rememberedValue = new SliderState(f, i16, function03, closedFloatingPointRange2);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    SliderState sliderState2 = (SliderState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    sliderState2.setOnValueChangeFinished(function03);
                    sliderState2.setOnValueChange$material3_release(function1);
                    sliderState2.setValue(f);
                    int i222 = i14 >> 9;
                    Slider(sliderState2, companion, z2, null, mutableInteractionSource2, function33, rememberComposableLambda, startRestartGroup, ((i14 >> 3) & PointerIconCompat.TYPE_TEXT) | ((i14 >> 6) & 57344) | (458752 & i222) | (i222 & 3670016), 8);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function34 = rememberComposableLambda;
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    function04 = function03;
                    sliderColors5 = sliderColors4;
                    function35 = function33;
                    z4 = z2;
                    i17 = i16;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z3 = ((29360128 & i14) != 8388608) | ((((i15 & 14) ^ 6) > 4 && startRestartGroup.changed(closedFloatingPointRange2)) || (i15 & 6) == 4);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                rememberedValue = new SliderState(f, i16, function03, closedFloatingPointRange2);
                startRestartGroup.updateRememberedValue(rememberedValue);
                SliderState sliderState22 = (SliderState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                sliderState22.setOnValueChangeFinished(function03);
                sliderState22.setOnValueChange$material3_release(function1);
                sliderState22.setValue(f);
                int i2222 = i14 >> 9;
                Slider(sliderState22, companion, z2, null, mutableInteractionSource2, function33, rememberComposableLambda, startRestartGroup, ((i14 >> 3) & PointerIconCompat.TYPE_TEXT) | ((i14 >> 6) & 57344) | (458752 & i2222) | (i2222 & 3670016), 8);
                if (ComposerKt.isTraceInProgress()) {
                }
                function34 = rememberComposableLambda;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                function04 = function03;
                sliderColors5 = sliderColors4;
                function35 = function33;
                z4 = z2;
                i17 = i16;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            function02 = function0;
            if ((196608 & i2) != 0) {
            }
            i8 = i4 & 64;
            if (i8 == 0) {
            }
            i9 = i4 & 128;
            if (i9 == 0) {
            }
            i10 = i4 & 256;
            if (i10 == 0) {
            }
            i11 = i4 & 512;
            if (i11 == 0) {
            }
            if ((i3 & 6) != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i20 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((i4 & 32) == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if ((i4 & 1024) == 0) {
            }
            i14 = i5;
            i15 = i12;
            function33 = composableLambda;
            i16 = i13;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -403520192, "CC(remember):Slider.kt#9igjgp");
            z3 = ((29360128 & i14) != 8388608) | ((((i15 & 14) ^ 6) > 4 && startRestartGroup.changed(closedFloatingPointRange2)) || (i15 & 6) == 4);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue = new SliderState(f, i16, function03, closedFloatingPointRange2);
            startRestartGroup.updateRememberedValue(rememberedValue);
            SliderState sliderState222 = (SliderState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            sliderState222.setOnValueChangeFinished(function03);
            sliderState222.setOnValueChange$material3_release(function1);
            sliderState222.setValue(f);
            int i22222 = i14 >> 9;
            Slider(sliderState222, companion, z2, null, mutableInteractionSource2, function33, rememberComposableLambda, startRestartGroup, ((i14 >> 3) & PointerIconCompat.TYPE_TEXT) | ((i14 >> 6) & 57344) | (458752 & i22222) | (i22222 & 3670016), 8);
            if (ComposerKt.isTraceInProgress()) {
            }
            function34 = rememberComposableLambda;
            closedFloatingPointRange3 = closedFloatingPointRange2;
            function04 = function03;
            sliderColors5 = sliderColors4;
            function35 = function33;
            z4 = z2;
            i17 = i16;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        function02 = function0;
        if ((196608 & i2) != 0) {
        }
        i8 = i4 & 64;
        if (i8 == 0) {
        }
        i9 = i4 & 128;
        if (i9 == 0) {
        }
        i10 = i4 & 256;
        if (i10 == 0) {
        }
        i11 = i4 & 512;
        if (i11 == 0) {
        }
        if ((i3 & 6) != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i20 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if ((i4 & 1024) == 0) {
        }
        i14 = i5;
        i15 = i12;
        function33 = composableLambda;
        i16 = i13;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -403520192, "CC(remember):Slider.kt#9igjgp");
        z3 = ((29360128 & i14) != 8388608) | ((((i15 & 14) ^ 6) > 4 && startRestartGroup.changed(closedFloatingPointRange2)) || (i15 & 6) == 4);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue = new SliderState(f, i16, function03, closedFloatingPointRange2);
        startRestartGroup.updateRememberedValue(rememberedValue);
        SliderState sliderState2222 = (SliderState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        sliderState2222.setOnValueChangeFinished(function03);
        sliderState2222.setOnValueChange$material3_release(function1);
        sliderState2222.setValue(f);
        int i222222 = i14 >> 9;
        Slider(sliderState2222, companion, z2, null, mutableInteractionSource2, function33, rememberComposableLambda, startRestartGroup, ((i14 >> 3) & PointerIconCompat.TYPE_TEXT) | ((i14 >> 6) & 57344) | (458752 & i222222) | (i222222 & 3670016), 8);
        if (ComposerKt.isTraceInProgress()) {
        }
        function34 = rememberComposableLambda;
        closedFloatingPointRange3 = closedFloatingPointRange2;
        function04 = function03;
        sliderColors5 = sliderColors4;
        function35 = function33;
        z4 = z2;
        i17 = i16;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z2;
        final SliderColors sliderColors2;
        int i5;
        final MutableInteractionSource mutableInteractionSource2;
        int i6;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function33;
        int i7;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function34;
        Modifier.Companion companion;
        int i8;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> rememberComposableLambda;
        SliderColors sliderColors3;
        MutableInteractionSource mutableInteractionSource3;
        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function35;
        final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function36;
        final SliderColors sliderColors4;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource4;
        final boolean z3;
        final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function37;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1303883986);
        ComposerKt.sourceInformation(startRestartGroup, "C(Slider)P(4,3,1)339@15682L8,340@15742L39,341@15830L157,348@16036L114,354@16217L188:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i9 = 2048;
                            i3 |= i9;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i9 = 1024;
                    i3 |= i9;
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        function33 = function3;
                        i3 |= startRestartGroup.changedInstance(function33) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((1572864 & i) == 0) {
                            function34 = function32;
                            i3 |= startRestartGroup.changedInstance(function34) ? 1048576 : 524288;
                            if ((i3 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        sliderColors2 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    }
                                    if (i5 != 0) {
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -403425429, "CC(remember):Slider.kt#9igjgp");
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                    }
                                    if (i6 != 0) {
                                        function33 = ComposableLambdaKt.rememberComposableLambda(1426271326, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$10
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState2, Composer composer2, Integer num) {
                                                invoke(sliderState2, composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(SliderState sliderState2, Composer composer2, int i11) {
                                                ComposerKt.sourceInformation(composer2, "C342@15855L126:Slider.kt#uh7d8r");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1426271326, i11, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:342)");
                                                }
                                                SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors2, z2, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, startRestartGroup, 54);
                                    }
                                    if (i7 == 0) {
                                        rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(577038345, true, new Function3<SliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$11
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(SliderState sliderState2, Composer composer2, Integer num) {
                                                invoke(sliderState2, composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(SliderState sliderState2, Composer composer2, int i11) {
                                                ComposerKt.sourceInformation(composer2, "C349@16076L68:Slider.kt#uh7d8r");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(577038345, i11, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:349)");
                                                }
                                                SliderDefaults.INSTANCE.m2174Track4EFweAY(sliderState2, (Modifier) null, z2, sliderColors2, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i11 & 14) | 100663296, 242);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, startRestartGroup, 54);
                                        i8 = i3;
                                        sliderColors3 = sliderColors2;
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        function35 = function33;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1303883986, i8, -1, "androidx.compose.material3.Slider (Slider.kt:351)");
                                        }
                                        if (sliderState.getSteps() >= 0) {
                                            throw new IllegalArgumentException("steps should be >= 0".toString());
                                        }
                                        int i11 = i8 >> 3;
                                        SliderImpl(companion, sliderState, z2, mutableInteractionSource3, function35, rememberComposableLambda, startRestartGroup, (i8 & 896) | (i11 & 14) | ((i8 << 3) & 112) | (i11 & 7168) | (57344 & i11) | (i11 & 458752));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        function36 = function35;
                                        sliderColors4 = sliderColors3;
                                        modifier3 = companion;
                                        Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function38 = rememberComposableLambda;
                                        mutableInteractionSource4 = mutableInteractionSource3;
                                        z3 = z2;
                                        function37 = function38;
                                    } else {
                                        i8 = i3;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    i8 = i3;
                                    companion = modifier2;
                                }
                                sliderColors3 = sliderColors2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                function35 = function33;
                                rememberComposableLambda = function34;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (sliderState.getSteps() >= 0) {
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z3 = z2;
                                sliderColors4 = sliderColors2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                function36 = function33;
                                function37 = function34;
                            }
                            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$Slider$13
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i12) {
                                        SliderKt.Slider(SliderState.this, modifier3, z3, sliderColors4, mutableInteractionSource4, function36, function37, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        function34 = function32;
                        if ((i3 & 599187) == 599186) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                    }
                    function33 = function3;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    function34 = function32;
                    if ((i3 & 599187) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function33 = function3;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                function34 = function32;
                if ((i3 & 599187) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function33 = function3;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            function34 = function32;
            if ((i3 & 599187) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function33 = function3;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        function34 = function32;
        if ((i3 & 599187) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(final ClosedFloatingPointRange<Float> closedFloatingPointRange, final Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i, Function0<Unit> function0, SliderColors sliderColors, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        final boolean z2;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        int i7;
        int i8;
        int i9;
        Function0<Unit> function02;
        final SliderColors colors;
        Object rememberedValue;
        Object rememberedValue2;
        final boolean z3;
        final SliderColors sliderColors2;
        final Function0<Unit> function03;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange4;
        final int i10;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-743091416);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSlider)P(6,3,2,1,7,5,4)408@18812L8,410@18884L39,411@18981L39,423@19399L186,430@19606L184,437@19808L199,413@19026L987:Slider.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(closedFloatingPointRange) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    z2 = z;
                    i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16) == 0) {
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            if (startRestartGroup.changed(closedFloatingPointRange3)) {
                                i12 = 16384;
                                i4 |= i12;
                            }
                        } else {
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                        }
                        i12 = 8192;
                        i4 |= i12;
                    } else {
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i2) == 0) {
                        i8 = i;
                        i4 |= startRestartGroup.changed(i8) ? 131072 : 65536;
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((1572864 & i2) == 0) {
                            function02 = function0;
                            i4 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                            if ((i2 & 12582912) == 0) {
                                if ((i3 & 128) == 0 && startRestartGroup.changed(sliderColors)) {
                                    i11 = 8388608;
                                    i4 |= i11;
                                }
                                i11 = 4194304;
                                i4 |= i11;
                            }
                            if ((i4 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i5 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i6 != 0) {
                                        z2 = true;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                        closedFloatingPointRange3 = RangesKt.rangeTo(0.0f, 1.0f);
                                    }
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    if (i9 != 0) {
                                        function02 = null;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                        colors = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                        ClosedFloatingPointRange<Float> closedFloatingPointRange5 = closedFloatingPointRange3;
                                        Function0<Unit> function04 = function02;
                                        int i13 = i4;
                                        int i14 = i8;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-743091416, i13, -1, "androidx.compose.material3.RangeSlider (Slider.kt:409)");
                                        }
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661051042, "CC(remember):Slider.kt#9igjgp");
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661054146, "CC(remember):Slider.kt#9igjgp");
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        final MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue2;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        RangeSlider(closedFloatingPointRange, function1, modifier2, z2, closedFloatingPointRange5, function04, null, mutableInteractionSource, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-811582901, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                                invoke(rangeSliderState, composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                                                ComposerKt.sourceInformation(composer2, "C424@19428L147:Slider.kt#uh7d8r");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-811582901, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:424)");
                                                }
                                                SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, colors, z2, 0L, composer2, 196614, 18);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1832060001, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                                invoke(rangeSliderState, composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                                                ComposerKt.sourceInformation(composer2, "C431@19635L145:Slider.kt#uh7d8r");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1832060001, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
                                                }
                                                SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, colors, z2, 0L, composer2, 196614, 18);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(377064480, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                                invoke(rangeSliderState, composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                                                ComposerKt.sourceInformation(composer2, "C438@19857L140:Slider.kt#uh7d8r");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(377064480, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
                                                }
                                                SliderDefaults.INSTANCE.m2173Track4EFweAY(rangeSliderState, (Modifier) null, z2, colors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i15 & 14) | 100663296, 242);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, startRestartGroup, 54), i14, startRestartGroup, (i13 & 14) | 918552576 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | ((i13 >> 3) & 458752), ((i13 >> 9) & 896) | 54, 64);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        z3 = z2;
                                        sliderColors2 = colors;
                                        function03 = function04;
                                        closedFloatingPointRange4 = closedFloatingPointRange5;
                                        Modifier modifier4 = modifier2;
                                        i10 = i14;
                                        modifier3 = modifier4;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i4 &= -29360129;
                                    }
                                }
                                colors = sliderColors;
                                ClosedFloatingPointRange<Float> closedFloatingPointRange52 = closedFloatingPointRange3;
                                Function0<Unit> function042 = function02;
                                int i132 = i4;
                                int i142 = i8;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661051042, "CC(remember):Slider.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                final MutableInteractionSource mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661054146, "CC(remember):Slider.kt#9igjgp");
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                }
                                final MutableInteractionSource mutableInteractionSource22 = (MutableInteractionSource) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                RangeSlider(closedFloatingPointRange, function1, modifier2, z2, closedFloatingPointRange52, function042, null, mutableInteractionSource3, mutableInteractionSource22, ComposableLambdaKt.rememberComposableLambda(-811582901, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                        invoke(rangeSliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                                        ComposerKt.sourceInformation(composer2, "C424@19428L147:Slider.kt#uh7d8r");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-811582901, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:424)");
                                        }
                                        SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, colors, z2, 0L, composer2, 196614, 18);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1832060001, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                        invoke(rangeSliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                                        ComposerKt.sourceInformation(composer2, "C431@19635L145:Slider.kt#uh7d8r");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1832060001, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
                                        }
                                        SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, colors, z2, 0L, composer2, 196614, 18);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(377064480, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                        invoke(rangeSliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                                        ComposerKt.sourceInformation(composer2, "C438@19857L140:Slider.kt#uh7d8r");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(377064480, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
                                        }
                                        SliderDefaults.INSTANCE.m2173Track4EFweAY(rangeSliderState, (Modifier) null, z2, colors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i15 & 14) | 100663296, 242);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54), i142, startRestartGroup, (i132 & 14) | 918552576 | (i132 & 112) | (i132 & 896) | (i132 & 7168) | (57344 & i132) | ((i132 >> 3) & 458752), ((i132 >> 9) & 896) | 54, 64);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z3 = z2;
                                sliderColors2 = colors;
                                function03 = function042;
                                closedFloatingPointRange4 = closedFloatingPointRange52;
                                Modifier modifier42 = modifier2;
                                i10 = i142;
                                modifier3 = modifier42;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                z3 = z2;
                                closedFloatingPointRange4 = closedFloatingPointRange3;
                                i10 = i8;
                                function03 = function02;
                                sliderColors2 = sliderColors;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i15) {
                                        SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier3, z3, closedFloatingPointRange4, i10, function03, sliderColors2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        function02 = function0;
                        if ((i2 & 12582912) == 0) {
                        }
                        if ((i4 & 4793491) == 4793490) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if ((i3 & 128) != 0) {
                        }
                        colors = sliderColors;
                        ClosedFloatingPointRange<Float> closedFloatingPointRange522 = closedFloatingPointRange3;
                        Function0<Unit> function0422 = function02;
                        int i1322 = i4;
                        int i1422 = i8;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661051042, "CC(remember):Slider.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        final MutableInteractionSource mutableInteractionSource32 = (MutableInteractionSource) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661054146, "CC(remember):Slider.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        final MutableInteractionSource mutableInteractionSource222 = (MutableInteractionSource) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        RangeSlider(closedFloatingPointRange, function1, modifier2, z2, closedFloatingPointRange522, function0422, null, mutableInteractionSource32, mutableInteractionSource222, ComposableLambdaKt.rememberComposableLambda(-811582901, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                invoke(rangeSliderState, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                                ComposerKt.sourceInformation(composer2, "C424@19428L147:Slider.kt#uh7d8r");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-811582901, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:424)");
                                }
                                SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, colors, z2, 0L, composer2, 196614, 18);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1832060001, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                invoke(rangeSliderState, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                                ComposerKt.sourceInformation(composer2, "C431@19635L145:Slider.kt#uh7d8r");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1832060001, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
                                }
                                SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, colors, z2, 0L, composer2, 196614, 18);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(377064480, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                invoke(rangeSliderState, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                                ComposerKt.sourceInformation(composer2, "C438@19857L140:Slider.kt#uh7d8r");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(377064480, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
                                }
                                SliderDefaults.INSTANCE.m2173Track4EFweAY(rangeSliderState, (Modifier) null, z2, colors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i15 & 14) | 100663296, 242);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), i1422, startRestartGroup, (i1322 & 14) | 918552576 | (i1322 & 112) | (i1322 & 896) | (i1322 & 7168) | (57344 & i1322) | ((i1322 >> 3) & 458752), ((i1322 >> 9) & 896) | 54, 64);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z3 = z2;
                        sliderColors2 = colors;
                        function03 = function0422;
                        closedFloatingPointRange4 = closedFloatingPointRange522;
                        Modifier modifier422 = modifier2;
                        i10 = i1422;
                        modifier3 = modifier422;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i;
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    function02 = function0;
                    if ((i2 & 12582912) == 0) {
                    }
                    if ((i4 & 4793491) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i3 & 128) != 0) {
                    }
                    colors = sliderColors;
                    ClosedFloatingPointRange<Float> closedFloatingPointRange5222 = closedFloatingPointRange3;
                    Function0<Unit> function04222 = function02;
                    int i13222 = i4;
                    int i14222 = i8;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661051042, "CC(remember):Slider.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableInteractionSource mutableInteractionSource322 = (MutableInteractionSource) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661054146, "CC(remember):Slider.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableInteractionSource mutableInteractionSource2222 = (MutableInteractionSource) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    RangeSlider(closedFloatingPointRange, function1, modifier2, z2, closedFloatingPointRange5222, function04222, null, mutableInteractionSource322, mutableInteractionSource2222, ComposableLambdaKt.rememberComposableLambda(-811582901, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                            invoke(rangeSliderState, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                            ComposerKt.sourceInformation(composer2, "C424@19428L147:Slider.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-811582901, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:424)");
                            }
                            SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, colors, z2, 0L, composer2, 196614, 18);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1832060001, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                            invoke(rangeSliderState, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                            ComposerKt.sourceInformation(composer2, "C431@19635L145:Slider.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1832060001, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
                            }
                            SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, colors, z2, 0L, composer2, 196614, 18);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(377064480, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                            invoke(rangeSliderState, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                            ComposerKt.sourceInformation(composer2, "C438@19857L140:Slider.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(377064480, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
                            }
                            SliderDefaults.INSTANCE.m2173Track4EFweAY(rangeSliderState, (Modifier) null, z2, colors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i15 & 14) | 100663296, 242);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), i14222, startRestartGroup, (i13222 & 14) | 918552576 | (i13222 & 112) | (i13222 & 896) | (i13222 & 7168) | (57344 & i13222) | ((i13222 >> 3) & 458752), ((i13222 >> 9) & 896) | 54, 64);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z2;
                    sliderColors2 = colors;
                    function03 = function04222;
                    closedFloatingPointRange4 = closedFloatingPointRange5222;
                    Modifier modifier4222 = modifier2;
                    i10 = i14222;
                    modifier3 = modifier4222;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z2 = z;
                if ((i2 & 24576) != 0) {
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i;
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                function02 = function0;
                if ((i2 & 12582912) == 0) {
                }
                if ((i4 & 4793491) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i7 != 0) {
                }
                if (i9 != 0) {
                }
                if ((i3 & 128) != 0) {
                }
                colors = sliderColors;
                ClosedFloatingPointRange<Float> closedFloatingPointRange52222 = closedFloatingPointRange3;
                Function0<Unit> function042222 = function02;
                int i132222 = i4;
                int i142222 = i8;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661051042, "CC(remember):Slider.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final MutableInteractionSource mutableInteractionSource3222 = (MutableInteractionSource) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661054146, "CC(remember):Slider.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                final MutableInteractionSource mutableInteractionSource22222 = (MutableInteractionSource) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                RangeSlider(closedFloatingPointRange, function1, modifier2, z2, closedFloatingPointRange52222, function042222, null, mutableInteractionSource3222, mutableInteractionSource22222, ComposableLambdaKt.rememberComposableLambda(-811582901, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                        invoke(rangeSliderState, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                        ComposerKt.sourceInformation(composer2, "C424@19428L147:Slider.kt#uh7d8r");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-811582901, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:424)");
                        }
                        SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, colors, z2, 0L, composer2, 196614, 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1832060001, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                        invoke(rangeSliderState, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                        ComposerKt.sourceInformation(composer2, "C431@19635L145:Slider.kt#uh7d8r");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1832060001, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
                        }
                        SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, colors, z2, 0L, composer2, 196614, 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(377064480, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                        invoke(rangeSliderState, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                        ComposerKt.sourceInformation(composer2, "C438@19857L140:Slider.kt#uh7d8r");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(377064480, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
                        }
                        SliderDefaults.INSTANCE.m2173Track4EFweAY(rangeSliderState, (Modifier) null, z2, colors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i15 & 14) | 100663296, 242);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), i142222, startRestartGroup, (i132222 & 14) | 918552576 | (i132222 & 112) | (i132222 & 896) | (i132222 & 7168) | (57344 & i132222) | ((i132222 >> 3) & 458752), ((i132222 >> 9) & 896) | 54, 64);
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z2;
                sliderColors2 = colors;
                function03 = function042222;
                closedFloatingPointRange4 = closedFloatingPointRange52222;
                Modifier modifier42222 = modifier2;
                i10 = i142222;
                modifier3 = modifier42222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z2 = z;
            if ((i2 & 24576) != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i;
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            function02 = function0;
            if ((i2 & 12582912) == 0) {
            }
            if ((i4 & 4793491) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i7 != 0) {
            }
            if (i9 != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            colors = sliderColors;
            ClosedFloatingPointRange<Float> closedFloatingPointRange522222 = closedFloatingPointRange3;
            Function0<Unit> function0422222 = function02;
            int i1322222 = i4;
            int i1422222 = i8;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661051042, "CC(remember):Slider.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableInteractionSource mutableInteractionSource32222 = (MutableInteractionSource) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661054146, "CC(remember):Slider.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableInteractionSource mutableInteractionSource222222 = (MutableInteractionSource) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            RangeSlider(closedFloatingPointRange, function1, modifier2, z2, closedFloatingPointRange522222, function0422222, null, mutableInteractionSource32222, mutableInteractionSource222222, ComposableLambdaKt.rememberComposableLambda(-811582901, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                    invoke(rangeSliderState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                    ComposerKt.sourceInformation(composer2, "C424@19428L147:Slider.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-811582901, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:424)");
                    }
                    SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, colors, z2, 0L, composer2, 196614, 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1832060001, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                    invoke(rangeSliderState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                    ComposerKt.sourceInformation(composer2, "C431@19635L145:Slider.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1832060001, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
                    }
                    SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, colors, z2, 0L, composer2, 196614, 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(377064480, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                    invoke(rangeSliderState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                    ComposerKt.sourceInformation(composer2, "C438@19857L140:Slider.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(377064480, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
                    }
                    SliderDefaults.INSTANCE.m2173Track4EFweAY(rangeSliderState, (Modifier) null, z2, colors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i15 & 14) | 100663296, 242);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), i1422222, startRestartGroup, (i1322222 & 14) | 918552576 | (i1322222 & 112) | (i1322222 & 896) | (i1322222 & 7168) | (57344 & i1322222) | ((i1322222 >> 3) & 458752), ((i1322222 >> 9) & 896) | 54, 64);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z2;
            sliderColors2 = colors;
            function03 = function0422222;
            closedFloatingPointRange4 = closedFloatingPointRange522222;
            Modifier modifier422222 = modifier2;
            i10 = i1422222;
            modifier3 = modifier422222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z2 = z;
        if ((i2 & 24576) != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i;
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        function02 = function0;
        if ((i2 & 12582912) == 0) {
        }
        if ((i4 & 4793491) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i7 != 0) {
        }
        if (i9 != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        colors = sliderColors;
        ClosedFloatingPointRange<Float> closedFloatingPointRange5222222 = closedFloatingPointRange3;
        Function0<Unit> function04222222 = function02;
        int i13222222 = i4;
        int i14222222 = i8;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661051042, "CC(remember):Slider.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableInteractionSource mutableInteractionSource322222 = (MutableInteractionSource) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661054146, "CC(remember):Slider.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableInteractionSource mutableInteractionSource2222222 = (MutableInteractionSource) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        RangeSlider(closedFloatingPointRange, function1, modifier2, z2, closedFloatingPointRange5222222, function04222222, null, mutableInteractionSource322222, mutableInteractionSource2222222, ComposableLambdaKt.rememberComposableLambda(-811582901, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                invoke(rangeSliderState, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                ComposerKt.sourceInformation(composer2, "C424@19428L147:Slider.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-811582901, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:424)");
                }
                SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, colors, z2, 0L, composer2, 196614, 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1832060001, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                invoke(rangeSliderState, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                ComposerKt.sourceInformation(composer2, "C431@19635L145:Slider.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1832060001, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:431)");
                }
                SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, colors, z2, 0L, composer2, 196614, 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(377064480, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                invoke(rangeSliderState, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i15) {
                ComposerKt.sourceInformation(composer2, "C438@19857L140:Slider.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(377064480, i15, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:438)");
                }
                SliderDefaults.INSTANCE.m2173Track4EFweAY(rangeSliderState, (Modifier) null, z2, colors, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i15 & 14) | 100663296, 242);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), i14222222, startRestartGroup, (i13222222 & 14) | 918552576 | (i13222222 & 112) | (i13222222 & 896) | (i13222222 & 7168) | (57344 & i13222222) | ((i13222222 >> 3) & 458752), ((i13222222 >> 9) & 896) | 54, 64);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z2;
        sliderColors2 = colors;
        function03 = function04222222;
        closedFloatingPointRange4 = closedFloatingPointRange5222222;
        Modifier modifier4222222 = modifier2;
        i10 = i14222222;
        modifier3 = modifier4222222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x036b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(final ClosedFloatingPointRange<Float> closedFloatingPointRange, final Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange2, Function0<Unit> function0, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, int i, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        final boolean z2;
        Modifier modifier2;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        Function0<Unit> function02;
        final SliderColors sliderColors2;
        final MutableInteractionSource mutableInteractionSource3;
        final MutableInteractionSource mutableInteractionSource4;
        int i15;
        MutableInteractionSource mutableInteractionSource5;
        boolean z3;
        ComposableLambda composableLambda;
        int i16;
        final int i17;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function34;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function35;
        MutableInteractionSource mutableInteractionSource6;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function36;
        Modifier modifier3;
        ClosedFloatingPointRange<Float> closedFloatingPointRange4;
        SliderColors sliderColors3;
        boolean z4;
        Object rememberedValue;
        boolean z5;
        Object rememberedValue2;
        final MutableInteractionSource mutableInteractionSource7;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function37;
        final boolean z6;
        final MutableInteractionSource mutableInteractionSource8;
        final SliderColors sliderColors4;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function38;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange5;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function39;
        final Function0<Unit> function03;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(-1048796133);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSlider)P(11,5,4,1,12,6!1,7!1,8!1,10)511@23750L8,512@23815L39,513@23909L39,514@24007L162,521@24226L160,528@24440L175,538@24684L237,549@25005L44,553@25142L291:Slider.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(closedFloatingPointRange) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i19 = i4 & 4;
        if (i19 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    if ((i4 & 16) == 0 && startRestartGroup.changed(closedFloatingPointRange2)) {
                        i18 = 16384;
                        i5 |= i18;
                    }
                    i18 = 8192;
                    i5 |= i18;
                }
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i5 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    i5 |= ((i4 & 64) == 0 && startRestartGroup.changed(sliderColors)) ? 1048576 : 524288;
                }
                i8 = i4 & 128;
                if (i8 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i5 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                i9 = i4 & 256;
                if (i9 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i5 |= startRestartGroup.changed(mutableInteractionSource2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i10 = i4 & 512;
                if (i10 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i5 |= startRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                }
                i11 = i4 & 1024;
                if (i11 != 0) {
                    i12 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i12 = i3 | (startRestartGroup.changedInstance(function32) ? 4 : 2);
                } else {
                    i12 = i3;
                }
                i13 = i4 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                } else if ((i3 & 48) == 0) {
                    i12 |= startRestartGroup.changedInstance(function33) ? 32 : 16;
                }
                int i20 = i12;
                i14 = i4 & 4096;
                if (i14 != 0) {
                    i20 |= 384;
                } else if ((i3 & 384) == 0) {
                    i20 |= startRestartGroup.changed(i) ? 256 : 128;
                    if ((i5 & 306783379) == 306783378 || (i20 & 147) != 146 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i19 == 0 ? Modifier.INSTANCE : modifier;
                            z2 = i6 == 0 ? true : z;
                            if ((i4 & 16) == 0) {
                                modifier2 = companion;
                                closedFloatingPointRange3 = RangesKt.rangeTo(0.0f, 1.0f);
                                i5 &= -57345;
                            } else {
                                modifier2 = companion;
                                closedFloatingPointRange3 = closedFloatingPointRange2;
                            }
                            function02 = i7 == 0 ? null : function0;
                            ClosedFloatingPointRange<Float> closedFloatingPointRange6 = closedFloatingPointRange3;
                            if ((i4 & 64) == 0) {
                                sliderColors2 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                i5 &= -3670017;
                            } else {
                                sliderColors2 = sliderColors;
                            }
                            if (i8 == 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661208834, "CC(remember):Slider.kt#9igjgp");
                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                mutableInteractionSource3 = (MutableInteractionSource) rememberedValue3;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            if (i9 == 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661211842, "CC(remember):Slider.kt#9igjgp");
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                mutableInteractionSource4 = (MutableInteractionSource) rememberedValue4;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            } else {
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            if (i10 == 0) {
                                Function3<RangeSliderState, Composer, Integer, Unit> function310 = new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$7
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                        invoke(rangeSliderState, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i21) {
                                        ComposerKt.sourceInformation(composer2, "C515@24032L131:Slider.kt#uh7d8r");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1963073082, i21, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:515)");
                                        }
                                        SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors2, z2, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                };
                                i15 = i5;
                                mutableInteractionSource5 = mutableInteractionSource3;
                                z3 = true;
                                composableLambda = ComposableLambdaKt.rememberComposableLambda(-1963073082, true, function310, startRestartGroup, 54);
                            } else {
                                i15 = i5;
                                mutableInteractionSource5 = mutableInteractionSource3;
                                z3 = true;
                                composableLambda = function3;
                            }
                            ComposableLambda rememberComposableLambda = i11 == 0 ? ComposableLambdaKt.rememberComposableLambda(1908709951, z3, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$8
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                    invoke(rangeSliderState, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i21) {
                                    ComposerKt.sourceInformation(composer2, "C522@24251L129:Slider.kt#uh7d8r");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1908709951, i21, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:522)");
                                    }
                                    SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors2, z2, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54) : function32;
                            ComposableLambda rememberComposableLambda2 = i13 == 0 ? ComposableLambdaKt.rememberComposableLambda(-429193201, z3, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$9
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState, Composer composer2, Integer num) {
                                    invoke(rangeSliderState, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RangeSliderState rangeSliderState, Composer composer2, int i21) {
                                    ComposerKt.sourceInformation(composer2, "C529@24485L124:Slider.kt#uh7d8r");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-429193201, i21, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:529)");
                                    }
                                    SliderDefaults.INSTANCE.m2173Track4EFweAY(rangeSliderState, (Modifier) null, z2, sliderColors2, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i21 & 14) | 100663296, 242);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54) : function33;
                            i16 = i15;
                            if (i14 == 0) {
                                function34 = rememberComposableLambda;
                                function35 = rememberComposableLambda2;
                                i17 = 0;
                            } else {
                                i17 = i;
                                function34 = rememberComposableLambda;
                                function35 = rememberComposableLambda2;
                            }
                            mutableInteractionSource6 = mutableInteractionSource4;
                            function36 = composableLambda;
                            modifier3 = modifier2;
                            closedFloatingPointRange4 = closedFloatingPointRange6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i4 & 16) != 0) {
                                i5 &= -57345;
                            }
                            if ((i4 & 64) != 0) {
                                i5 &= -3670017;
                            }
                            modifier3 = modifier;
                            z2 = z;
                            closedFloatingPointRange4 = closedFloatingPointRange2;
                            function02 = function0;
                            sliderColors2 = sliderColors;
                            mutableInteractionSource5 = mutableInteractionSource;
                            mutableInteractionSource6 = mutableInteractionSource2;
                            function36 = function3;
                            function35 = function33;
                            i17 = i;
                            i16 = i5;
                            function34 = function32;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            sliderColors3 = sliderColors2;
                        } else {
                            sliderColors3 = sliderColors2;
                            ComposerKt.traceEventStart(-1048796133, i16, i20, "androidx.compose.material3.RangeSlider (Slider.kt:536)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661236840, "CC(remember):Slider.kt#9igjgp");
                        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function311 = function35;
                        z4 = ((i20 & 896) != 256) | ((((57344 & i16) ^ 24576) <= 16384 && startRestartGroup.changed(closedFloatingPointRange4)) || (i16 & 24576) == 16384);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new RangeSliderState(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i17, function02, closedFloatingPointRange4);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        RangeSliderState rangeSliderState = (RangeSliderState) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        rangeSliderState.setOnValueChangeFinished(function02);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661246919, "CC(remember):Slider.kt#9igjgp");
                        z5 = (i16 & 112) != 32;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z5 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (Function1) new Function1<SliderRange, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$10$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SliderRange sliderRange) {
                                    m2188invokeIf1S1O4(sliderRange.m2202unboximpl());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-If1S1O4, reason: not valid java name */
                                public final void m2188invokeIf1S1O4(long j) {
                                    function1.invoke(RangesKt.rangeTo(SliderRange.m2199getStartimpl(j), SliderRange.m2198getEndInclusiveimpl(j)));
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        rangeSliderState.setOnValueChange$material3_release((Function1) rememberedValue2);
                        rangeSliderState.setActiveRangeStart(closedFloatingPointRange.getStart().floatValue());
                        rangeSliderState.setActiveRangeEnd(closedFloatingPointRange.getEndInclusive().floatValue());
                        int i21 = (i16 >> 3) & PointerIconCompat.TYPE_TEXT;
                        int i22 = i16 >> 9;
                        int i23 = i20 << 21;
                        RangeSlider(rangeSliderState, modifier3, z2, null, mutableInteractionSource5, mutableInteractionSource6, function36, function34, function311, startRestartGroup, (i23 & 234881024) | (i22 & 3670016) | i21 | (57344 & i22) | (458752 & i22) | (29360128 & i23), 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource7 = mutableInteractionSource6;
                        function37 = function36;
                        z6 = z2;
                        mutableInteractionSource8 = mutableInteractionSource5;
                        sliderColors4 = sliderColors3;
                        function38 = function311;
                        closedFloatingPointRange5 = closedFloatingPointRange4;
                        function39 = function34;
                        function03 = function02;
                        modifier4 = modifier3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        z6 = z;
                        closedFloatingPointRange5 = closedFloatingPointRange2;
                        function03 = function0;
                        sliderColors4 = sliderColors;
                        mutableInteractionSource8 = mutableInteractionSource;
                        mutableInteractionSource7 = mutableInteractionSource2;
                        function37 = function3;
                        function39 = function32;
                        function38 = function33;
                        i17 = i;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$11
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i24) {
                                SliderKt.RangeSlider(closedFloatingPointRange, function1, modifier4, z6, closedFloatingPointRange5, function03, sliderColors4, mutableInteractionSource8, mutableInteractionSource7, function37, function39, function38, i17, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i5 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i19 == 0) {
                }
                if (i6 == 0) {
                }
                if ((i4 & 16) == 0) {
                }
                if (i7 == 0) {
                }
                ClosedFloatingPointRange<Float> closedFloatingPointRange62 = closedFloatingPointRange3;
                if ((i4 & 64) == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i13 == 0) {
                }
                i16 = i15;
                if (i14 == 0) {
                }
                mutableInteractionSource6 = mutableInteractionSource4;
                function36 = composableLambda;
                modifier3 = modifier2;
                closedFloatingPointRange4 = closedFloatingPointRange62;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661236840, "CC(remember):Slider.kt#9igjgp");
                Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3112 = function35;
                z4 = ((i20 & 896) != 256) | ((((57344 & i16) ^ 24576) <= 16384 && startRestartGroup.changed(closedFloatingPointRange4)) || (i16 & 24576) == 16384);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                rememberedValue = new RangeSliderState(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i17, function02, closedFloatingPointRange4);
                startRestartGroup.updateRememberedValue(rememberedValue);
                RangeSliderState rangeSliderState2 = (RangeSliderState) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                rangeSliderState2.setOnValueChangeFinished(function02);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661246919, "CC(remember):Slider.kt#9igjgp");
                if ((i16 & 112) != 32) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z5) {
                }
                rememberedValue2 = (Function1) new Function1<SliderRange, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$10$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SliderRange sliderRange) {
                        m2188invokeIf1S1O4(sliderRange.m2202unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-If1S1O4, reason: not valid java name */
                    public final void m2188invokeIf1S1O4(long j) {
                        function1.invoke(RangesKt.rangeTo(SliderRange.m2199getStartimpl(j), SliderRange.m2198getEndInclusiveimpl(j)));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                rangeSliderState2.setOnValueChange$material3_release((Function1) rememberedValue2);
                rangeSliderState2.setActiveRangeStart(closedFloatingPointRange.getStart().floatValue());
                rangeSliderState2.setActiveRangeEnd(closedFloatingPointRange.getEndInclusive().floatValue());
                int i212 = (i16 >> 3) & PointerIconCompat.TYPE_TEXT;
                int i222 = i16 >> 9;
                int i232 = i20 << 21;
                RangeSlider(rangeSliderState2, modifier3, z2, null, mutableInteractionSource5, mutableInteractionSource6, function36, function34, function3112, startRestartGroup, (i232 & 234881024) | (i222 & 3670016) | i212 | (57344 & i222) | (458752 & i222) | (29360128 & i232), 8);
                if (ComposerKt.isTraceInProgress()) {
                }
                mutableInteractionSource7 = mutableInteractionSource6;
                function37 = function36;
                z6 = z2;
                mutableInteractionSource8 = mutableInteractionSource5;
                sliderColors4 = sliderColors3;
                function38 = function3112;
                closedFloatingPointRange5 = closedFloatingPointRange4;
                function39 = function34;
                function03 = function02;
                modifier4 = modifier3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i2 & 24576) == 0) {
            }
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i8 = i4 & 128;
            if (i8 != 0) {
            }
            i9 = i4 & 256;
            if (i9 != 0) {
            }
            i10 = i4 & 512;
            if (i10 != 0) {
            }
            i11 = i4 & 1024;
            if (i11 != 0) {
            }
            i13 = i4 & 2048;
            if (i13 != 0) {
            }
            int i202 = i12;
            i14 = i4 & 4096;
            if (i14 != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i19 == 0) {
            }
            if (i6 == 0) {
            }
            if ((i4 & 16) == 0) {
            }
            if (i7 == 0) {
            }
            ClosedFloatingPointRange<Float> closedFloatingPointRange622 = closedFloatingPointRange3;
            if ((i4 & 64) == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i13 == 0) {
            }
            i16 = i15;
            if (i14 == 0) {
            }
            mutableInteractionSource6 = mutableInteractionSource4;
            function36 = composableLambda;
            modifier3 = modifier2;
            closedFloatingPointRange4 = closedFloatingPointRange622;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661236840, "CC(remember):Slider.kt#9igjgp");
            Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function31122 = function35;
            z4 = ((i202 & 896) != 256) | ((((57344 & i16) ^ 24576) <= 16384 && startRestartGroup.changed(closedFloatingPointRange4)) || (i16 & 24576) == 16384);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue = new RangeSliderState(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i17, function02, closedFloatingPointRange4);
            startRestartGroup.updateRememberedValue(rememberedValue);
            RangeSliderState rangeSliderState22 = (RangeSliderState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            rangeSliderState22.setOnValueChangeFinished(function02);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661246919, "CC(remember):Slider.kt#9igjgp");
            if ((i16 & 112) != 32) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z5) {
            }
            rememberedValue2 = (Function1) new Function1<SliderRange, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$10$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SliderRange sliderRange) {
                    m2188invokeIf1S1O4(sliderRange.m2202unboximpl());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-If1S1O4, reason: not valid java name */
                public final void m2188invokeIf1S1O4(long j) {
                    function1.invoke(RangesKt.rangeTo(SliderRange.m2199getStartimpl(j), SliderRange.m2198getEndInclusiveimpl(j)));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            rangeSliderState22.setOnValueChange$material3_release((Function1) rememberedValue2);
            rangeSliderState22.setActiveRangeStart(closedFloatingPointRange.getStart().floatValue());
            rangeSliderState22.setActiveRangeEnd(closedFloatingPointRange.getEndInclusive().floatValue());
            int i2122 = (i16 >> 3) & PointerIconCompat.TYPE_TEXT;
            int i2222 = i16 >> 9;
            int i2322 = i202 << 21;
            RangeSlider(rangeSliderState22, modifier3, z2, null, mutableInteractionSource5, mutableInteractionSource6, function36, function34, function31122, startRestartGroup, (i2322 & 234881024) | (i2222 & 3670016) | i2122 | (57344 & i2222) | (458752 & i2222) | (29360128 & i2322), 8);
            if (ComposerKt.isTraceInProgress()) {
            }
            mutableInteractionSource7 = mutableInteractionSource6;
            function37 = function36;
            z6 = z2;
            mutableInteractionSource8 = mutableInteractionSource5;
            sliderColors4 = sliderColors3;
            function38 = function31122;
            closedFloatingPointRange5 = closedFloatingPointRange4;
            function39 = function34;
            function03 = function02;
            modifier4 = modifier3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i8 = i4 & 128;
        if (i8 != 0) {
        }
        i9 = i4 & 256;
        if (i9 != 0) {
        }
        i10 = i4 & 512;
        if (i10 != 0) {
        }
        i11 = i4 & 1024;
        if (i11 != 0) {
        }
        i13 = i4 & 2048;
        if (i13 != 0) {
        }
        int i2022 = i12;
        i14 = i4 & 4096;
        if (i14 != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i19 == 0) {
        }
        if (i6 == 0) {
        }
        if ((i4 & 16) == 0) {
        }
        if (i7 == 0) {
        }
        ClosedFloatingPointRange<Float> closedFloatingPointRange6222 = closedFloatingPointRange3;
        if ((i4 & 64) == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i13 == 0) {
        }
        i16 = i15;
        if (i14 == 0) {
        }
        mutableInteractionSource6 = mutableInteractionSource4;
        function36 = composableLambda;
        modifier3 = modifier2;
        closedFloatingPointRange4 = closedFloatingPointRange6222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661236840, "CC(remember):Slider.kt#9igjgp");
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function311222 = function35;
        z4 = ((i2022 & 896) != 256) | ((((57344 & i16) ^ 24576) <= 16384 && startRestartGroup.changed(closedFloatingPointRange4)) || (i16 & 24576) == 16384);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue = new RangeSliderState(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i17, function02, closedFloatingPointRange4);
        startRestartGroup.updateRememberedValue(rememberedValue);
        RangeSliderState rangeSliderState222 = (RangeSliderState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        rangeSliderState222.setOnValueChangeFinished(function02);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661246919, "CC(remember):Slider.kt#9igjgp");
        if ((i16 & 112) != 32) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z5) {
        }
        rememberedValue2 = (Function1) new Function1<SliderRange, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$10$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SliderRange sliderRange) {
                m2188invokeIf1S1O4(sliderRange.m2202unboximpl());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-If1S1O4, reason: not valid java name */
            public final void m2188invokeIf1S1O4(long j) {
                function1.invoke(RangesKt.rangeTo(SliderRange.m2199getStartimpl(j), SliderRange.m2198getEndInclusiveimpl(j)));
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        rangeSliderState222.setOnValueChange$material3_release((Function1) rememberedValue2);
        rangeSliderState222.setActiveRangeStart(closedFloatingPointRange.getStart().floatValue());
        rangeSliderState222.setActiveRangeEnd(closedFloatingPointRange.getEndInclusive().floatValue());
        int i21222 = (i16 >> 3) & PointerIconCompat.TYPE_TEXT;
        int i22222 = i16 >> 9;
        int i23222 = i2022 << 21;
        RangeSlider(rangeSliderState222, modifier3, z2, null, mutableInteractionSource5, mutableInteractionSource6, function36, function34, function311222, startRestartGroup, (i23222 & 234881024) | (i22222 & 3670016) | i21222 | (57344 & i22222) | (458752 & i22222) | (29360128 & i23222), 8);
        if (ComposerKt.isTraceInProgress()) {
        }
        mutableInteractionSource7 = mutableInteractionSource6;
        function37 = function36;
        z6 = z2;
        mutableInteractionSource8 = mutableInteractionSource5;
        sliderColors4 = sliderColors3;
        function38 = function311222;
        closedFloatingPointRange5 = closedFloatingPointRange4;
        function39 = function34;
        function03 = function02;
        modifier4 = modifier3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RangeSlider(final RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        SliderColors sliderColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        MutableInteractionSource mutableInteractionSource4;
        int i7;
        int i8;
        int i9;
        Modifier.Companion companion;
        final boolean z2;
        final SliderColors sliderColors3;
        final MutableInteractionSource mutableInteractionSource5;
        final MutableInteractionSource mutableInteractionSource6;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function34;
        int i10;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function35;
        Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> rememberComposableLambda;
        final MutableInteractionSource mutableInteractionSource7;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function36;
        final boolean z3;
        final MutableInteractionSource mutableInteractionSource8;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function37;
        final Modifier modifier2;
        final SliderColors sliderColors4;
        final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function38;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(511405654);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSlider)P(7,4,1!1,5!1,6)616@28157L8,617@28222L39,618@28316L39,619@28414L162,626@28633L160,633@28847L175,643@29089L295:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(z) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i11 = 2048;
                            i3 |= i11;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i11 = 1024;
                    i3 |= i11;
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource3 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource3) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        mutableInteractionSource4 = mutableInteractionSource2;
                        i3 |= startRestartGroup.changed(mutableInteractionSource4) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changedInstance(function32) ? 8388608 : 4194304;
                        }
                        i9 = i2 & 256;
                        if (i9 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(function33) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i12 != 0 ? Modifier.INSTANCE : modifier;
                                z2 = i4 != 0 ? true : z;
                                if ((i2 & 8) != 0) {
                                    sliderColors3 = SliderDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    i3 &= -7169;
                                } else {
                                    sliderColors3 = sliderColors2;
                                }
                                if (i5 != 0) {
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661349858, "CC(remember):Slider.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    mutableInteractionSource5 = (MutableInteractionSource) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                } else {
                                    mutableInteractionSource5 = mutableInteractionSource3;
                                }
                                if (i6 != 0) {
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1661352866, "CC(remember):Slider.kt#9igjgp");
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    mutableInteractionSource6 = (MutableInteractionSource) rememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                } else {
                                    mutableInteractionSource6 = mutableInteractionSource4;
                                }
                                ComposableLambda rememberComposableLambda2 = i7 != 0 ? ComposableLambdaKt.rememberComposableLambda(1884205643, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$14
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState2, Composer composer2, Integer num) {
                                        invoke(rangeSliderState2, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RangeSliderState rangeSliderState2, Composer composer2, int i13) {
                                        ComposerKt.sourceInformation(composer2, "C620@28439L131:Slider.kt#uh7d8r");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1884205643, i13, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:620)");
                                        }
                                        SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors3, z2, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54) : function3;
                                ComposableLambda rememberComposableLambda3 = i8 != 0 ? ComposableLambdaKt.rememberComposableLambda(1016457138, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$15
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState2, Composer composer2, Integer num) {
                                        invoke(rangeSliderState2, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RangeSliderState rangeSliderState2, Composer composer2, int i13) {
                                        ComposerKt.sourceInformation(composer2, "C627@28658L129:Slider.kt#uh7d8r");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1016457138, i13, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:627)");
                                        }
                                        SliderDefaults.INSTANCE.m2172Thumb9LiSoMs(MutableInteractionSource.this, null, sliderColors3, z2, 0L, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54) : function32;
                                if (i9 != 0) {
                                    i10 = i3;
                                    rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1617375262, true, new Function3<RangeSliderState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$16
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RangeSliderState rangeSliderState2, Composer composer2, Integer num) {
                                            invoke(rangeSliderState2, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RangeSliderState rangeSliderState2, Composer composer2, int i13) {
                                            ComposerKt.sourceInformation(composer2, "C634@28892L124:Slider.kt#uh7d8r");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1617375262, i13, -1, "androidx.compose.material3.RangeSlider.<anonymous> (Slider.kt:634)");
                                            }
                                            SliderDefaults.INSTANCE.m2173Track4EFweAY(rangeSliderState2, (Modifier) null, z2, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, 0.0f, 0.0f, composer2, (i13 & 14) | 100663296, 242);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54);
                                    function34 = rememberComposableLambda3;
                                    function35 = rememberComposableLambda2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(511405654, i10, -1, "androidx.compose.material3.RangeSlider (Slider.kt:640)");
                                    }
                                    if (rangeSliderState.getSteps() >= 0) {
                                        throw new IllegalArgumentException("steps should be >= 0".toString());
                                    }
                                    int i13 = i10 >> 3;
                                    RangeSliderImpl(companion, rangeSliderState, z2, mutableInteractionSource5, mutableInteractionSource6, function35, function34, rememberComposableLambda, startRestartGroup, (i10 & 896) | (i13 & 14) | ((i10 << 3) & 112) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (3670016 & i13) | (i13 & 29360128));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    mutableInteractionSource7 = mutableInteractionSource5;
                                    function36 = rememberComposableLambda;
                                    z3 = z2;
                                    mutableInteractionSource8 = mutableInteractionSource6;
                                    function37 = function34;
                                    modifier2 = companion;
                                    sliderColors4 = sliderColors3;
                                    function38 = function35;
                                } else {
                                    function34 = rememberComposableLambda3;
                                    i10 = i3;
                                    function35 = rememberComposableLambda2;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                companion = modifier;
                                z2 = z;
                                function35 = function3;
                                function34 = function32;
                                i10 = i3;
                                sliderColors3 = sliderColors2;
                                mutableInteractionSource5 = mutableInteractionSource3;
                                mutableInteractionSource6 = mutableInteractionSource4;
                            }
                            rememberComposableLambda = function33;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (rangeSliderState.getSteps() >= 0) {
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z3 = z;
                            function38 = function3;
                            function36 = function33;
                            sliderColors4 = sliderColors2;
                            mutableInteractionSource7 = mutableInteractionSource3;
                            mutableInteractionSource8 = mutableInteractionSource4;
                            function37 = function32;
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSlider$18
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i14) {
                                    SliderKt.RangeSlider(RangeSliderState.this, modifier2, z3, sliderColors4, mutableInteractionSource7, mutableInteractionSource8, function38, function37, function36, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    mutableInteractionSource4 = mutableInteractionSource2;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 256;
                    if (i9 != 0) {
                    }
                    if ((i3 & 38347923) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                }
                mutableInteractionSource3 = mutableInteractionSource;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                mutableInteractionSource4 = mutableInteractionSource2;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                i9 = i2 & 256;
                if (i9 != 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
            }
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource3 = mutableInteractionSource;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            mutableInteractionSource4 = mutableInteractionSource2;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i2 & 256;
            if (i9 != 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource3 = mutableInteractionSource;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        mutableInteractionSource4 = mutableInteractionSource2;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i2 & 256;
        if (i9 != 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SliderImpl(final Modifier modifier, final SliderState sliderState, final boolean z, final MutableInteractionSource mutableInteractionSource, final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function3, final Function3<? super SliderState, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i) {
        int i2;
        Modifier draggable;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1390990089);
        ComposerKt.sourceInformation(startRestartGroup, "C(SliderImpl)P(2,3)665@29717L7,673@30073L28,698@30935L1093,678@30197L1831:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(sliderState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((74899 & i3) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1390990089, i3, -1, "androidx.compose.material3.SliderImpl (Slider.kt:664)");
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            sliderState.setRtl$material3_release(consume == LayoutDirection.Rtl);
            Modifier sliderTapModifier = sliderTapModifier(Modifier.INSTANCE, sliderState, mutableInteractionSource, z);
            Modifier.Companion companion = Modifier.INSTANCE;
            Orientation orientation = Orientation.Horizontal;
            boolean isRtl = sliderState.getIsRtl();
            boolean isDragging$material3_release = sliderState.isDragging$material3_release();
            Modifier.Companion companion2 = companion;
            SliderState sliderState2 = sliderState;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 174725888, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(sliderState);
            SliderKt$SliderImpl$drag$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SliderKt$SliderImpl$drag$1$1(sliderState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            draggable = DraggableKt.draggable(companion2, sliderState2, orientation, (r20 & 4) != 0 ? true : z, (r20 & 8) != 0 ? null : mutableInteractionSource, (r20 & 16) != 0 ? false : isDragging$material3_release, (r20 & 32) != 0 ? DraggableKt.NoOpOnDragStarted : null, (r20 & 64) != 0 ? DraggableKt.NoOpOnDragStopped : (Function3) rememberedValue, (r20 & 128) != 0 ? false : isRtl);
            Modifier then = FocusableKt.focusable(sliderSemantics(SizeKt.m722requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), ThumbWidth, TrackHeight, 0.0f, 0.0f, 12, null), sliderState, z), z, mutableInteractionSource).then(sliderTapModifier).then(draggable);
            composer2 = startRestartGroup;
            ComposerKt.sourceInformationMarkerStart(composer2, 174754537, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance2 = composer2.changedInstance(sliderState);
            MeasurePolicy rememberedValue2 = composer2.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            Measurable measurable = list.get(i4);
                            if (LayoutIdKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                                final Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(j);
                                int size2 = list.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    Measurable measurable2 = list.get(i5);
                                    if (LayoutIdKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                                        final Placeable mo5175measureBRTryo02 = measurable2.mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(ConstraintsKt.m6272offsetNN6EwU$default(j, -mo5175measureBRTryo0.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                                        int width = mo5175measureBRTryo0.getWidth() + mo5175measureBRTryo02.getWidth();
                                        int max = Math.max(mo5175measureBRTryo02.getHeight(), mo5175measureBRTryo0.getHeight());
                                        SliderState.this.updateDimensions$material3_release(mo5175measureBRTryo02.getHeight(), width);
                                        final int width2 = mo5175measureBRTryo0.getWidth() / 2;
                                        final int roundToInt = MathKt.roundToInt(mo5175measureBRTryo02.getWidth() * SliderState.this.getCoercedValueAsFraction$material3_release());
                                        final int height = (max - mo5175measureBRTryo02.getHeight()) / 2;
                                        final int height2 = (max - mo5175measureBRTryo0.getHeight()) / 2;
                                        return MeasureScope.layout$default(measureScope, width, max, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                invoke2(placementScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, width2, height, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo0, roundToInt, height2, 0.0f, 4, null);
                                            }
                                        }, 4, null);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, then);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m3333constructorimpl = Updater.m3333constructorimpl(composer2);
            Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -610171494, "C682@30354L85,680@30227L271,688@30511L74:Slider.kt#uh7d8r");
            Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(Modifier.INSTANCE, SliderComponents.THUMB), null, false, 3, null);
            ComposerKt.sourceInformationMarkerStart(composer2, 534510168, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance3 = composer2.changedInstance(sliderState);
            Object rememberedValue3 = composer2.rememberedValue();
            if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$1$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        m2191invokeozmzZPI(intSize.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m2191invokeozmzZPI(long j) {
                        SliderState.this.setThumbWidth$material3_release(IntSize.m6469getWidthimpl(j));
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(wrapContentWidth$default, (Function1) rememberedValue3);
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, onSizeChanged);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer2);
            Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -469300363, "C686@30472L12:Slider.kt#uh7d8r");
            int i4 = (i3 >> 3) & 14;
            function3.invoke(sliderState, composer2, Integer.valueOf(((i3 >> 9) & 112) | i4));
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, SliderComponents.TRACK);
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, layoutId);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer m3333constructorimpl3 = Updater.m3333constructorimpl(composer2);
            Updater.m3340setimpl(m3333constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl3.getInserting() || !Intrinsics.areEqual(m3333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3340setimpl(m3333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, -469202155, "C688@30571L12:Slider.kt#uh7d8r");
            function32.invoke(sliderState, composer2, Integer.valueOf(((i3 >> 12) & 112) | i4));
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$SliderImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    SliderKt.SliderImpl(Modifier.this, sliderState, z, mutableInteractionSource, function3, function32, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RangeSliderImpl(final Modifier modifier, final RangeSliderState rangeSliderState, final boolean z, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function3, final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function32, final Function3<? super RangeSliderState, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1411725677);
        ComposerKt.sourceInformation(startRestartGroup, "C(RangeSliderImpl)P(3,6!1,4!1,5)736@32503L7,746@32756L35,747@32824L33,784@34404L2230,749@32863L3771:Slider.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(rangeSliderState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function32) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function33) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) != 4793490 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1411725677, i2, -1, "androidx.compose.material3.RangeSliderImpl (Slider.kt:735)");
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            rangeSliderState.setRtl$material3_release(consume == LayoutDirection.Rtl);
            Modifier rangeSliderPressDragModifier = rangeSliderPressDragModifier(Modifier.INSTANCE, rangeSliderState, mutableInteractionSource, mutableInteractionSource2, z);
            Strings.Companion companion = Strings.INSTANCE;
            final String m2655getString2EP1pXo = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.range_start), startRestartGroup, 0);
            Strings.Companion companion2 = Strings.INSTANCE;
            final String m2655getString2EP1pXo2 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.range_end), startRestartGroup, 0);
            Modifier then = SizeKt.m722requiredSizeInqDBjuR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), ThumbWidth, TrackHeight, 0.0f, 0.0f, 12, null).then(rangeSliderPressDragModifier);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1662324209, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(rangeSliderState);
            MeasurePolicy rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            Measurable measurable = list.get(i3);
                            if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                                final Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(j);
                                int size2 = list.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    Measurable measurable2 = list.get(i4);
                                    if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                                        final Placeable mo5175measureBRTryo02 = measurable2.mo5175measureBRTryo0(j);
                                        int size3 = list.size();
                                        for (int i5 = 0; i5 < size3; i5++) {
                                            Measurable measurable3 = list.get(i5);
                                            if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                                final Placeable mo5175measureBRTryo03 = measurable3.mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(ConstraintsKt.m6272offsetNN6EwU$default(j, (-(mo5175measureBRTryo0.getWidth() + mo5175measureBRTryo02.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                                int width = mo5175measureBRTryo03.getWidth() + ((mo5175measureBRTryo0.getWidth() + mo5175measureBRTryo02.getWidth()) / 2);
                                                int max = Math.max(mo5175measureBRTryo03.getHeight(), Math.max(mo5175measureBRTryo0.getHeight(), mo5175measureBRTryo02.getHeight()));
                                                RangeSliderState.this.setTrackHeight$material3_release(mo5175measureBRTryo03.getHeight());
                                                RangeSliderState.this.setTotalWidth$material3_release(width);
                                                RangeSliderState.this.updateMinMaxPx$material3_release();
                                                final int width2 = mo5175measureBRTryo0.getWidth() / 2;
                                                final int roundToInt = MathKt.roundToInt(mo5175measureBRTryo03.getWidth() * RangeSliderState.this.getCoercedActiveRangeStartAsFraction$material3_release());
                                                final int roundToInt2 = MathKt.roundToInt((mo5175measureBRTryo03.getWidth() * RangeSliderState.this.getCoercedActiveRangeEndAsFraction$material3_release()) + ((mo5175measureBRTryo0.getWidth() - mo5175measureBRTryo02.getWidth()) / 2));
                                                final int height = (max - mo5175measureBRTryo03.getHeight()) / 2;
                                                final int height2 = (max - mo5175measureBRTryo0.getHeight()) / 2;
                                                final int height3 = (max - mo5175measureBRTryo02.getHeight()) / 2;
                                                return MeasureScope.layout$default(measureScope, width, max, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                        invoke2(placementScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, width2, height, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo0, roundToInt, height2, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo02, roundToInt2, height3, 0.0f, 4, null);
                                                    }
                                                }, 4, null);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2110426496, "C755@33080L46,757@33259L100,751@32893L598,768@33689L44,770@33864L98,764@33504L586,777@34103L79:Slider.kt#uh7d8r");
            Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(Modifier.INSTANCE, RangeSliderComponents.STARTTHUMB), null, false, 3, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1176461672, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance2 = startRestartGroup.changedInstance(rangeSliderState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        m2189invokeozmzZPI(intSize.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m2189invokeozmzZPI(long j) {
                        RangeSliderState.this.setStartThumbWidth$material3_release(IntSize.m6469getWidthimpl(j));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier rangeSliderStartThumbSemantics = rangeSliderStartThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(wrapContentWidth$default, (Function1) rememberedValue2), rangeSliderState, z);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1176467454, "CC(remember):Slider.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m2655getString2EP1pXo);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m2655getString2EP1pXo);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier focusable = FocusableKt.focusable(SemanticsModifierKt.semantics(rangeSliderStartThumbSemantics, true, (Function1) rememberedValue3), z, mutableInteractionSource);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, focusable);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3333constructorimpl2 = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 259534201, "C762@33460L17:Slider.kt#uh7d8r");
            int i3 = (i2 >> 3) & 14;
            function3.invoke(rangeSliderState, startRestartGroup, Integer.valueOf(((i2 >> 12) & 112) | i3));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier wrapContentWidth$default2 = SizeKt.wrapContentWidth$default(LayoutIdKt.layoutId(Modifier.INSTANCE, RangeSliderComponents.ENDTHUMB), null, false, 3, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1176481158, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance3 = startRestartGroup.changedInstance(rangeSliderState);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$4$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        m2190invokeozmzZPI(intSize.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m2190invokeozmzZPI(long j) {
                        RangeSliderState.this.setEndThumbWidth$material3_release(IntSize.m6469getWidthimpl(j));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier rangeSliderEndThumbSemantics = rangeSliderEndThumbSemantics(OnRemeasuredModifierKt.onSizeChanged(wrapContentWidth$default2, (Function1) rememberedValue4), rangeSliderState, z);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1176486812, "CC(remember):Slider.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(m2655getString2EP1pXo2);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$1$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m2655getString2EP1pXo2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier focusable2 = FocusableKt.focusable(SemanticsModifierKt.semantics(rangeSliderEndThumbSemantics, true, (Function1) rememberedValue5), z, mutableInteractionSource2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, focusable2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3333constructorimpl3 = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl3.getInserting() || !Intrinsics.areEqual(m3333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3340setimpl(m3333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 260130331, "C775@34061L15:Slider.kt#uh7d8r");
            function32.invoke(rangeSliderState, startRestartGroup, Integer.valueOf(((i2 >> 15) & 112) | i3));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, RangeSliderComponents.TRACK);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3333constructorimpl4 = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl4.getInserting() || !Intrinsics.areEqual(m3333constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m3333constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m3333constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m3340setimpl(m3333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 260236382, "C777@34168L12:Slider.kt#uh7d8r");
            function33.invoke(rangeSliderState, startRestartGroup, Integer.valueOf(((i2 >> 18) & 112) | i3));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    SliderKt.RangeSliderImpl(Modifier.this, rangeSliderState, z, mutableInteractionSource, mutableInteractionSource2, function3, function32, function33, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2184awaitSlop8vUncbI(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Continuation<? super Pair<PointerInputChange, Float>> continuation) {
        SliderKt$awaitSlop$1 sliderKt$awaitSlop$1;
        int i2;
        Ref.FloatRef floatRef;
        PointerInputChange pointerInputChange;
        if (continuation instanceof SliderKt$awaitSlop$1) {
            sliderKt$awaitSlop$1 = (SliderKt$awaitSlop$1) continuation;
            if ((sliderKt$awaitSlop$1.label & Integer.MIN_VALUE) != 0) {
                sliderKt$awaitSlop$1.label -= Integer.MIN_VALUE;
                SliderKt$awaitSlop$1 sliderKt$awaitSlop$12 = sliderKt$awaitSlop$1;
                Object obj = sliderKt$awaitSlop$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = sliderKt$awaitSlop$12.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    Function2<PointerInputChange, Float, Unit> function2 = new Function2<PointerInputChange, Float, Unit>() { // from class: androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange2, Float f) {
                            invoke(pointerInputChange2, f.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PointerInputChange pointerInputChange2, float f) {
                            pointerInputChange2.consume();
                            Ref.FloatRef.this.element = f;
                        }
                    };
                    sliderKt$awaitSlop$12.L$0 = floatRef2;
                    sliderKt$awaitSlop$12.label = 1;
                    Object m2573awaitHorizontalPointerSlopOrCancellationgDDlDlE = DragGestureDetectorCopyKt.m2573awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j, i, function2, sliderKt$awaitSlop$12);
                    if (m2573awaitHorizontalPointerSlopOrCancellationgDDlDlE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = m2573awaitHorizontalPointerSlopOrCancellationgDDlDlE;
                    floatRef = floatRef2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    floatRef = (Ref.FloatRef) sliderKt$awaitSlop$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange == null) {
                    return TuplesKt.to(pointerInputChange, Boxing.boxFloat(floatRef.element));
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] stepsToTickFractions(int i) {
        if (i == 0) {
            return new float[0];
        }
        int i2 = i + 2;
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = i3 / (i + 1);
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: scale-ziovWd0, reason: not valid java name */
    public static final long m2187scaleziovWd0(float f, float f2, long j, float f3, float f4) {
        return SliderRange(scale(f, f2, SliderRange.m2199getStartimpl(j), f3, f4), scale(f, f2, SliderRange.m2198getEndInclusiveimpl(j), f3, f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        return RangesKt.coerceIn(f4 == 0.0f ? 0.0f : (f3 - f) / f4, 0.0f, 1.0f);
    }

    private static final Modifier sliderSemantics(Modifier modifier, final SliderState sliderState, final boolean z) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$sliderSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                final SliderState sliderState2 = sliderState;
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt$sliderSemantics$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                        return invoke(f.floatValue());
                    }

                    public final Boolean invoke(float f) {
                        int steps;
                        float coerceIn = RangesKt.coerceIn(f, SliderState.this.getValueRange().getStart().floatValue(), SliderState.this.getValueRange().getEndInclusive().floatValue());
                        boolean z2 = false;
                        if (SliderState.this.getSteps() > 0 && (steps = SliderState.this.getSteps() + 1) >= 0) {
                            float f2 = coerceIn;
                            float f3 = f2;
                            int i = 0;
                            while (true) {
                                float lerp = MathHelpersKt.lerp(SliderState.this.getValueRange().getStart().floatValue(), SliderState.this.getValueRange().getEndInclusive().floatValue(), i / (SliderState.this.getSteps() + 1));
                                float f4 = lerp - coerceIn;
                                if (Math.abs(f4) <= f2) {
                                    f2 = Math.abs(f4);
                                    f3 = lerp;
                                }
                                if (i == steps) {
                                    break;
                                }
                                i++;
                            }
                            coerceIn = f3;
                        }
                        if (coerceIn != SliderState.this.getValue()) {
                            if (coerceIn != SliderState.this.getValue()) {
                                if (SliderState.this.getOnValueChange$material3_release() != null) {
                                    Function1<Float, Unit> onValueChange$material3_release = SliderState.this.getOnValueChange$material3_release();
                                    if (onValueChange$material3_release != null) {
                                        onValueChange$material3_release.invoke(Float.valueOf(coerceIn));
                                    }
                                } else {
                                    SliderState.this.setValue(coerceIn);
                                }
                            }
                            Function0<Unit> onValueChangeFinished = SliderState.this.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
            }
        }, 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), sliderState.getValue(), RangesKt.rangeTo(sliderState.getValueRange().getStart().floatValue(), sliderState.getValueRange().getEndInclusive().floatValue()), sliderState.getSteps());
    }

    private static final Modifier rangeSliderStartThumbSemantics(Modifier modifier, final RangeSliderState rangeSliderState, final boolean z) {
        final ClosedFloatingPointRange<Float> rangeTo = RangesKt.rangeTo(rangeSliderState.getValueRange().getStart().floatValue(), rangeSliderState.getActiveRangeEnd());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$rangeSliderStartThumbSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                final ClosedFloatingPointRange<Float> closedFloatingPointRange = rangeTo;
                final RangeSliderState rangeSliderState2 = rangeSliderState;
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt$rangeSliderStartThumbSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                        return invoke(f.floatValue());
                    }

                    public final Boolean invoke(float f) {
                        int startSteps$material3_release;
                        float coerceIn = RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                        boolean z2 = false;
                        if (rangeSliderState2.getStartSteps$material3_release() > 0 && (startSteps$material3_release = rangeSliderState2.getStartSteps$material3_release() + 1) >= 0) {
                            float f2 = coerceIn;
                            float f3 = f2;
                            int i = 0;
                            while (true) {
                                float lerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i / (rangeSliderState2.getStartSteps$material3_release() + 1));
                                float f4 = lerp - coerceIn;
                                if (Math.abs(f4) <= f2) {
                                    f2 = Math.abs(f4);
                                    f3 = lerp;
                                }
                                if (i == startSteps$material3_release) {
                                    break;
                                }
                                i++;
                            }
                            coerceIn = f3;
                        }
                        if (coerceIn != rangeSliderState2.getActiveRangeStart()) {
                            long SliderRange = SliderKt.SliderRange(coerceIn, rangeSliderState2.getActiveRangeEnd());
                            if (!SliderRange.m2197equalsimpl0(SliderRange, SliderKt.SliderRange(rangeSliderState2.getActiveRangeStart(), rangeSliderState2.getActiveRangeEnd()))) {
                                if (rangeSliderState2.getOnValueChange$material3_release() != null) {
                                    Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState2.getOnValueChange$material3_release();
                                    if (onValueChange$material3_release != null) {
                                        onValueChange$material3_release.invoke(SliderRange.m2194boximpl(SliderRange));
                                    }
                                } else {
                                    rangeSliderState2.setActiveRangeStart(SliderRange.m2199getStartimpl(SliderRange));
                                    rangeSliderState2.setActiveRangeEnd(SliderRange.m2198getEndInclusiveimpl(SliderRange));
                                }
                            }
                            Function0<Unit> onValueChangeFinished = rangeSliderState2.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
            }
        }, 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState.getActiveRangeStart(), rangeTo, rangeSliderState.getStartSteps$material3_release());
    }

    private static final Modifier rangeSliderEndThumbSemantics(Modifier modifier, final RangeSliderState rangeSliderState, final boolean z) {
        final ClosedFloatingPointRange<Float> rangeTo = RangesKt.rangeTo(rangeSliderState.getActiveRangeStart(), rangeSliderState.getValueRange().getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SliderKt$rangeSliderEndThumbSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                final ClosedFloatingPointRange<Float> closedFloatingPointRange = rangeTo;
                final RangeSliderState rangeSliderState2 = rangeSliderState;
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new Function1<Float, Boolean>() { // from class: androidx.compose.material3.SliderKt$rangeSliderEndThumbSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                        return invoke(f.floatValue());
                    }

                    public final Boolean invoke(float f) {
                        int endSteps$material3_release;
                        float coerceIn = RangesKt.coerceIn(f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                        boolean z2 = false;
                        if (rangeSliderState2.getEndSteps$material3_release() > 0 && (endSteps$material3_release = rangeSliderState2.getEndSteps$material3_release() + 1) >= 0) {
                            float f2 = coerceIn;
                            float f3 = f2;
                            int i = 0;
                            while (true) {
                                float lerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i / (rangeSliderState2.getEndSteps$material3_release() + 1));
                                float f4 = lerp - coerceIn;
                                if (Math.abs(f4) <= f2) {
                                    f2 = Math.abs(f4);
                                    f3 = lerp;
                                }
                                if (i == endSteps$material3_release) {
                                    break;
                                }
                                i++;
                            }
                            coerceIn = f3;
                        }
                        if (coerceIn != rangeSliderState2.getActiveRangeEnd()) {
                            long SliderRange = SliderKt.SliderRange(rangeSliderState2.getActiveRangeStart(), coerceIn);
                            if (!SliderRange.m2197equalsimpl0(SliderRange, SliderKt.SliderRange(rangeSliderState2.getActiveRangeStart(), rangeSliderState2.getActiveRangeEnd()))) {
                                if (rangeSliderState2.getOnValueChange$material3_release() != null) {
                                    Function1<SliderRange, Unit> onValueChange$material3_release = rangeSliderState2.getOnValueChange$material3_release();
                                    if (onValueChange$material3_release != null) {
                                        onValueChange$material3_release.invoke(SliderRange.m2194boximpl(SliderRange));
                                    }
                                } else {
                                    rangeSliderState2.setActiveRangeStart(SliderRange.m2199getStartimpl(SliderRange));
                                    rangeSliderState2.setActiveRangeEnd(SliderRange.m2198getEndInclusiveimpl(SliderRange));
                                }
                            }
                            Function0<Unit> onValueChangeFinished = rangeSliderState2.getOnValueChangeFinished();
                            if (onValueChangeFinished != null) {
                                onValueChangeFinished.invoke();
                            }
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                }, 1, null);
            }
        }, 1, null).then(AccessibilityUtilKt.getIncreaseHorizontalSemanticsBounds()), rangeSliderState.getActiveRangeEnd(), rangeTo, rangeSliderState.getEndSteps$material3_release());
    }

    private static final Modifier sliderTapModifier(Modifier modifier, SliderState sliderState, MutableInteractionSource mutableInteractionSource, boolean z) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, sliderState, mutableInteractionSource, new SliderKt$sliderTapModifier$1(sliderState, null)) : modifier;
    }

    private static final Modifier rangeSliderPressDragModifier(Modifier modifier, RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, rangeSliderState}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new SliderKt$rangeSliderPressDragModifier$1(rangeSliderState, mutableInteractionSource, mutableInteractionSource2, null)) : modifier;
    }

    static {
        float m3175getHandleWidthD9Ej5fM = SliderTokens.INSTANCE.m3175getHandleWidthD9Ej5fM();
        ThumbWidth = m3175getHandleWidthD9Ej5fM;
        float m3174getHandleHeightD9Ej5fM = SliderTokens.INSTANCE.m3174getHandleHeightD9Ej5fM();
        ThumbHeight = m3174getHandleHeightD9Ej5fM;
        ThumbSize = DpKt.m6321DpSizeYgX7TsA(m3175getHandleWidthD9Ej5fM, m3174getHandleHeightD9Ej5fM);
        ThumbTrackGapSize = SliderTokens.INSTANCE.m3167getActiveHandleLeadingSpaceD9Ej5fM();
        TrackInsideCornerSize = Dp.m6299constructorimpl(2);
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    public static final float getThumbWidth() {
        return ThumbWidth;
    }

    public static final long SliderRange(float f, float f2) {
        if ((!Float.isNaN(f) || !Float.isNaN(f2)) && f > f2 + SliderRangeTolerance) {
            throw new IllegalArgumentException(("start(" + f + ") must be <= endInclusive(" + f2 + ')').toString());
        }
        return SliderRange.m2195constructorimpl((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public static final long SliderRange(ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        float floatValue = closedFloatingPointRange.getStart().floatValue();
        float floatValue2 = closedFloatingPointRange.getEndInclusive().floatValue();
        if ((!Float.isNaN(floatValue) || !Float.isNaN(floatValue2)) && floatValue > floatValue2 + SliderRangeTolerance) {
            throw new IllegalArgumentException(("ClosedFloatingPointRange<Float>.start(" + floatValue + ") must be <= ClosedFloatingPoint.endInclusive(" + floatValue2 + ')').toString());
        }
        return SliderRange.m2195constructorimpl((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(floatValue2) & 4294967295L));
    }

    /* renamed from: isSpecified-If1S1O4, reason: not valid java name */
    public static final boolean m2185isSpecifiedIf1S1O4(long j) {
        return j != SliderRange.INSTANCE.m2204getUnspecifiedFYbKRX4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    public static final float snapValueToTick(float f, float[] fArr, float f2, float f3) {
        Float valueOf;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float f4 = fArr[0];
            int lastIndex = ArraysKt.getLastIndex(fArr);
            if (lastIndex != 0) {
                float abs = Math.abs(MathHelpersKt.lerp(f2, f3, f4) - f);
                ?? it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    float f5 = fArr[it.nextInt()];
                    float abs2 = Math.abs(MathHelpersKt.lerp(f2, f3, f5) - f);
                    if (Float.compare(abs, abs2) > 0) {
                        f4 = f5;
                        abs = abs2;
                    }
                }
                valueOf = Float.valueOf(f4);
            } else {
                valueOf = Float.valueOf(f4);
            }
        }
        return valueOf != null ? MathHelpersKt.lerp(f2, f3, valueOf.floatValue()) : f;
    }
}
