package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.activity.BackEventCompat;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: SearchBar.android.kt */
@Metadata(d1 = {"\u0000¾\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0091\u0001\u0010,\u001a\u00020-2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0006\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u0089\u0002\u0010,\u001a\u00020-2\u0006\u0010B\u001a\u00020\u001a2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0006\u0010E\u001a\u0002022\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u0010G\u001a\u0002022\u0015\b\u0002\u0010H\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010I\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010J\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a\u009b\u0001\u0010O\u001a\u00020-2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0006\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\b\b\u0002\u0010P\u001a\u00020Q2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a\u0093\u0002\u0010O\u001a\u00020-2\u0006\u0010B\u001a\u00020\u001a2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0006\u0010E\u001a\u0002022\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u0010G\u001a\u0002022\u0015\b\u0002\u0010H\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010I\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010J\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\b\b\u0002\u0010P\u001a\u00020Q2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\bT\u0010U\u001a»\u0001\u0010V\u001a\u00020-2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020Y0X2\u0006\u0010Z\u001a\u00020[2\u000e\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\b\b\u0002\u00105\u001a\u0002062\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\b\b\u0002\u0010P\u001a\u00020Q2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a\u0094\u0001\u0010b\u001a\u00020-2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020Y0X2\u0006\u0010Z\u001a\u00020[2\u000e\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u0006\u00105\u001a\u0002062\u0006\u0010P\u001a\u00020Q2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0011\u0010c\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0013\u0010=\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b0H\u0003¢\u0006\u0002\u0010d\u001a\"\u0010e\u001a\u00020\u00072\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010f\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u0007H\u0002\u001aD\u0010g\u001a\u00020\u00012\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u00012\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010k\u001a\u00020l2\u0006\u0010f\u001a\u00020\u00072\u0006\u0010m\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010o\u001aN\u0010p\u001a\u00020\u00012\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u00012\b\u0010_\u001a\u0004\u0018\u00010^2\b\u0010\\\u001a\u0004\u0018\u00010^2\u0006\u0010q\u001a\u00020\u00012\u0006\u0010r\u001a\u00020\u00012\u0006\u0010m\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\bs\u0010t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u001d\u001a\u00020\u0015X\u0082\u0004¢\u0006\n\n\u0002\u0010\u0018\u0012\u0004\b\u001e\u0010\u001f\"\u0010\u0010 \u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0010\u0010!\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0016\u0010\"\u001a\u00020\u0015X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b#\u0010\u0017\"\u000e\u0010$\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010%\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0010\u0010&\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u000e\u0010'\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010(\u001a\u00020\u0015X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b)\u0010\u0017\"\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006u²\u0006\n\u0010v\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u0010w\u001a\u000202X\u008a\u0084\u0002"}, d2 = {"AnimationDelayMillis", "", "AnimationEnterDurationMillis", "AnimationEnterEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationEnterFloatSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "AnimationEnterSizeSpec", "Landroidx/compose/ui/unit/IntSize;", "AnimationExitDurationMillis", "AnimationExitEasing", "AnimationExitFloatSpec", "AnimationExitSizeSpec", "AnimationPredictiveBackExitFloatSpec", "DockedEnterTransition", "Landroidx/compose/animation/EnterTransition;", "DockedExitTransition", "Landroidx/compose/animation/ExitTransition;", "DockedExpandedTableMaxHeightScreenRatio", "DockedExpandedTableMinHeight", "Landroidx/compose/ui/unit/Dp;", "getDockedExpandedTableMinHeight", "()F", "F", "LayoutIdInputField", "", "LayoutIdSearchContent", "LayoutIdSurface", "SearchBarCornerRadius", "getSearchBarCornerRadius$annotations", "()V", "SearchBarIconOffsetX", "SearchBarMaxWidth", "SearchBarMinWidth", "getSearchBarMinWidth", "SearchBarPredictiveBackMaxOffsetXRatio", "SearchBarPredictiveBackMaxOffsetY", "SearchBarPredictiveBackMinMargin", "SearchBarPredictiveBackMinScale", "SearchBarVerticalPadding", "getSearchBarVerticalPadding", "UnspecifiedTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "DockedSearchBar", "", "inputField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "expanded", "", "onExpandedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/SearchBarColors;", "tonalElevation", "shadowElevation", "content", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "DockedSearchBar-EQC0FA8", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", SearchIntents.EXTRA_QUERY, "onQueryChange", "onSearch", "active", "onActiveChange", "enabled", "placeholder", "leadingIcon", "trailingIcon", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "DockedSearchBar-eWTbjVg", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBar", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "SearchBar-Y92LkZI", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SearchBar-WuY5d9Q", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBarImpl", "animationProgress", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "finalBackProgress", "Landroidx/compose/runtime/MutableFloatState;", "firstBackEvent", "Landroidx/compose/runtime/MutableState;", "Landroidx/activity/BackEventCompat;", "currentBackEvent", "SearchBarImpl-j1jLAyQ", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBarLayout", "surface", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "calculatePredictiveBackMultiplier", NotificationCompat.CATEGORY_PROGRESS, "calculatePredictiveBackOffsetX", "constraints", "Landroidx/compose/ui/unit/Constraints;", "minMargin", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "predictiveBackMultiplier", "calculatePredictiveBackOffsetX-rOvwMX4", "(JILandroidx/activity/BackEventCompat;Landroidx/compose/ui/unit/LayoutDirection;FF)I", "calculatePredictiveBackOffsetY", "height", "maxOffsetY", "calculatePredictiveBackOffsetY-dzo92Q0", "(JILandroidx/activity/BackEventCompat;Landroidx/activity/BackEventCompat;IIF)I", "material3_release", "useFullScreenShape", "showContent"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchBar_androidKt {
    private static final int AnimationDelayMillis = 100;
    private static final int AnimationEnterDurationMillis = 600;
    private static final CubicBezierEasing AnimationEnterEasing;
    private static final FiniteAnimationSpec<Float> AnimationEnterFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationEnterSizeSpec;
    private static final int AnimationExitDurationMillis = 350;
    private static final CubicBezierEasing AnimationExitEasing;
    private static final FiniteAnimationSpec<Float> AnimationExitFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationExitSizeSpec;
    private static final FiniteAnimationSpec<Float> AnimationPredictiveBackExitFloatSpec;
    private static final EnterTransition DockedEnterTransition;
    private static final ExitTransition DockedExitTransition;
    private static final float DockedExpandedTableMaxHeightScreenRatio = 0.6666667f;
    private static final String LayoutIdInputField = "InputField";
    private static final String LayoutIdSearchContent = "Content";
    private static final String LayoutIdSurface = "Surface";
    private static final float SearchBarPredictiveBackMaxOffsetXRatio = 0.05f;
    private static final float SearchBarPredictiveBackMinMargin;
    private static final float SearchBarPredictiveBackMinScale = 0.9f;
    private static final float SearchBarVerticalPadding;
    private static final TextFieldColors UnspecifiedTextFieldColors = new TextFieldColors(Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), new TextSelectionColors(Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), null), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), Color.INSTANCE.m3876getUnspecified0d7_KjU(), null);
    private static final float SearchBarCornerRadius = Dp.m6299constructorimpl(SearchBarDefaults.INSTANCE.m2098getInputFieldHeightD9Ej5fM() / 2);
    private static final float DockedExpandedTableMinHeight = Dp.m6299constructorimpl(240);
    private static final float SearchBarMinWidth = Dp.m6299constructorimpl(360);
    private static final float SearchBarMaxWidth = Dp.m6299constructorimpl(720);
    private static final float SearchBarIconOffsetX = Dp.m6299constructorimpl(4);
    private static final float SearchBarPredictiveBackMaxOffsetY = Dp.m6299constructorimpl(24);

    private static /* synthetic */ void getSearchBarCornerRadius$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a7  */
    /* renamed from: SearchBar-Y92LkZI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2106SearchBarY92LkZI(final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i4;
        float f3;
        int i5;
        float f4;
        Shape shape3;
        SearchBarColors searchBarColors3;
        WindowInsets windowInsets2;
        Shape shape4;
        int i6;
        float f5;
        Modifier modifier3;
        SearchBarColors searchBarColors4;
        float f6;
        Object rememberedValue;
        Animatable animatable;
        Object rememberedValue2;
        Object rememberedValue3;
        Object rememberedValue4;
        Boolean valueOf;
        boolean changedInstance;
        SearchBar_androidKt$SearchBar$1$1 rememberedValue5;
        Boolean bool;
        Object rememberedValue6;
        boolean changedInstance2;
        Animatable animatable2;
        int i7;
        SearchBar_androidKt$SearchBar$2$1 searchBar_androidKt$SearchBar$2$1;
        final Modifier modifier4;
        final Shape shape5;
        final SearchBarColors searchBarColors5;
        final WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1444649673);
        ComposerKt.sourceInformation(startRestartGroup, "C(SearchBar)P(3,2,5,4,7!1,8:c#ui.unit.Dp,6:c#ui.unit.Dp,9)171@8255L15,172@8320L8,175@8501L12,178@8596L64,179@8689L43,180@8758L51,181@8837L51,183@8919L638,183@8894L663,199@9582L27,200@9656L1062,200@9614L1104,226@10724L458:SearchBar.android.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i10 = 16384;
                        i3 |= i10;
                    }
                } else {
                    shape2 = shape;
                }
                i10 = 8192;
                i3 |= i10;
            } else {
                shape2 = shape;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    searchBarColors2 = searchBarColors;
                    if (startRestartGroup.changed(searchBarColors2)) {
                        i9 = 131072;
                        i3 |= i9;
                    }
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i9 = 65536;
                i3 |= i9;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                f3 = f;
                i3 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                    f4 = f2;
                } else {
                    f4 = f2;
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f4) ? 8388608 : 4194304;
                    }
                }
                if ((i & 100663296) == 0) {
                    if ((i2 & 256) == 0 && startRestartGroup.changed(windowInsets)) {
                        i8 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        i3 |= i8;
                    }
                    i8 = 33554432;
                    i3 |= i8;
                }
                if ((i2 & 512) != 0) {
                    i3 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
                    if ((i3 & 306783379) == 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 16) == 0) {
                                shape3 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i2 & 32) == 0) {
                                searchBarColors3 = SearchBarDefaults.INSTANCE.m2096colorsdgg9oW8(0L, 0L, startRestartGroup, 384, 3);
                                i3 &= -458753;
                            } else {
                                searchBarColors3 = searchBarColors2;
                            }
                            float m2100getTonalElevationD9Ej5fM = i4 == 0 ? SearchBarDefaults.INSTANCE.m2100getTonalElevationD9Ej5fM() : f;
                            if (i5 != 0) {
                                f4 = SearchBarDefaults.INSTANCE.m2099getShadowElevationD9Ej5fM();
                            }
                            if ((i2 & 256) == 0) {
                                shape4 = shape3;
                                i6 = i3 & (-234881025);
                                windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            } else {
                                windowInsets2 = windowInsets;
                                shape4 = shape3;
                                i6 = i3;
                            }
                            f5 = f4;
                            modifier3 = modifier2;
                            searchBarColors4 = searchBarColors3;
                            f6 = m2100getTonalElevationD9Ej5fM;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            windowInsets2 = windowInsets;
                            f5 = f4;
                            modifier3 = modifier2;
                            shape4 = shape2;
                            searchBarColors4 = searchBarColors2;
                            f6 = f3;
                            i6 = i3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1444649673, i6, -1, "androidx.compose.material3.SearchBar (SearchBar.android.kt:177)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626005896, "CC(remember):SearchBar.android.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = AnimatableKt.Animatable$default(z ? 1.0f : 0.0f, 0.0f, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        animatable = (Animatable) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626008851, "CC(remember):SearchBar.android.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626011067, "CC(remember):SearchBar.android.kt#9igjgp");
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        MutableState mutableState = (MutableState) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626013595, "CC(remember):SearchBar.android.kt#9igjgp");
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        MutableState mutableState2 = (MutableState) rememberedValue4;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        valueOf = Boolean.valueOf(z);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626016806, "CC(remember):SearchBar.android.kt#9igjgp");
                        changedInstance = startRestartGroup.changedInstance(animatable) | ((i6 & 112) != 32);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            bool = valueOf;
                            rememberedValue5 = new SearchBar_androidKt$SearchBar$1$1(animatable, z, mutableFloatState, mutableState, mutableState2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        } else {
                            bool = valueOf;
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i12 = (i6 >> 3) & 14;
                        EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, i12);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626037411, "CC(remember):SearchBar.android.kt#9igjgp");
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new MutatorMutex();
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        MutatorMutex mutatorMutex = (MutatorMutex) rememberedValue6;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626040814, "CC(remember):SearchBar.android.kt#9igjgp");
                        changedInstance2 = startRestartGroup.changedInstance(animatable) | ((i6 & 896) != 256);
                        Object rememberedValue7 = startRestartGroup.rememberedValue();
                        if (!changedInstance2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            animatable2 = animatable;
                            i7 = i6;
                            searchBar_androidKt$SearchBar$2$1 = new SearchBar_androidKt$SearchBar$2$1(mutatorMutex, mutableFloatState, animatable2, function1, mutableState, mutableState2, null);
                            startRestartGroup.updateRememberedValue(searchBar_androidKt$SearchBar$2$1);
                        } else {
                            searchBar_androidKt$SearchBar$2$1 = rememberedValue7;
                            animatable2 = animatable;
                            i7 = i6;
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        PredictiveBackHandlerKt.PredictiveBackHandler(z, (Function2) searchBar_androidKt$SearchBar$2$1, startRestartGroup, i12, 0);
                        int i13 = i7 << 6;
                        m2107SearchBarImplj1jLAyQ(animatable2, mutableFloatState, mutableState, mutableState2, modifier3, function2, shape4, searchBarColors4, f6, f5, windowInsets2, function3, startRestartGroup, Animatable.$stable | 3504 | ((i7 << 3) & 57344) | ((i7 << 15) & 458752) | (3670016 & i13) | (29360128 & i13) | (234881024 & i13) | (i13 & 1879048192), (i7 >> 24) & WebSocketProtocol.PAYLOAD_SHORT, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        shape5 = shape4;
                        searchBarColors5 = searchBarColors4;
                        f3 = f6;
                        windowInsets3 = windowInsets2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        windowInsets3 = windowInsets;
                        f5 = f4;
                        modifier4 = modifier2;
                        shape5 = shape2;
                        searchBarColors5 = searchBarColors2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final float f7 = f3;
                        final float f8 = f5;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$3
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
                                SearchBar_androidKt.m2106SearchBarY92LkZI(function2, z, function1, modifier4, shape5, searchBarColors5, f7, f8, windowInsets3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i3 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 256) == 0) {
                }
                f5 = f4;
                modifier3 = modifier2;
                searchBarColors4 = searchBarColors3;
                f6 = m2100getTonalElevationD9Ej5fM;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626005896, "CC(remember):SearchBar.android.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                animatable = (Animatable) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626008851, "CC(remember):SearchBar.android.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626011067, "CC(remember):SearchBar.android.kt#9igjgp");
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState3 = (MutableState) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626013595, "CC(remember):SearchBar.android.kt#9igjgp");
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState22 = (MutableState) rememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                valueOf = Boolean.valueOf(z);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626016806, "CC(remember):SearchBar.android.kt#9igjgp");
                changedInstance = startRestartGroup.changedInstance(animatable) | ((i6 & 112) != 32);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance) {
                }
                bool = valueOf;
                rememberedValue5 = new SearchBar_androidKt$SearchBar$1$1(animatable, z, mutableFloatState2, mutableState3, mutableState22, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i122 = (i6 >> 3) & 14;
                EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, i122);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626037411, "CC(remember):SearchBar.android.kt#9igjgp");
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                }
                MutatorMutex mutatorMutex2 = (MutatorMutex) rememberedValue6;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626040814, "CC(remember):SearchBar.android.kt#9igjgp");
                changedInstance2 = startRestartGroup.changedInstance(animatable) | ((i6 & 896) != 256);
                Object rememberedValue72 = startRestartGroup.rememberedValue();
                if (changedInstance2) {
                }
                animatable2 = animatable;
                i7 = i6;
                searchBar_androidKt$SearchBar$2$1 = new SearchBar_androidKt$SearchBar$2$1(mutatorMutex2, mutableFloatState2, animatable2, function1, mutableState3, mutableState22, null);
                startRestartGroup.updateRememberedValue(searchBar_androidKt$SearchBar$2$1);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                PredictiveBackHandlerKt.PredictiveBackHandler(z, (Function2) searchBar_androidKt$SearchBar$2$1, startRestartGroup, i122, 0);
                int i132 = i7 << 6;
                m2107SearchBarImplj1jLAyQ(animatable2, mutableFloatState2, mutableState3, mutableState22, modifier3, function2, shape4, searchBarColors4, f6, f5, windowInsets2, function3, startRestartGroup, Animatable.$stable | 3504 | ((i7 << 3) & 57344) | ((i7 << 15) & 458752) | (3670016 & i132) | (29360128 & i132) | (234881024 & i132) | (i132 & 1879048192), (i7 >> 24) & WebSocketProtocol.PAYLOAD_SHORT, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                shape5 = shape4;
                searchBarColors5 = searchBarColors4;
                f3 = f6;
                windowInsets3 = windowInsets2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i2 & 512) != 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            f5 = f4;
            modifier3 = modifier2;
            searchBarColors4 = searchBarColors3;
            f6 = m2100getTonalElevationD9Ej5fM;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626005896, "CC(remember):SearchBar.android.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            animatable = (Animatable) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626008851, "CC(remember):SearchBar.android.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            MutableFloatState mutableFloatState22 = (MutableFloatState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626011067, "CC(remember):SearchBar.android.kt#9igjgp");
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState32 = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626013595, "CC(remember):SearchBar.android.kt#9igjgp");
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState222 = (MutableState) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            valueOf = Boolean.valueOf(z);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626016806, "CC(remember):SearchBar.android.kt#9igjgp");
            changedInstance = startRestartGroup.changedInstance(animatable) | ((i6 & 112) != 32);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance) {
            }
            bool = valueOf;
            rememberedValue5 = new SearchBar_androidKt$SearchBar$1$1(animatable, z, mutableFloatState22, mutableState32, mutableState222, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i1222 = (i6 >> 3) & 14;
            EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, i1222);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626037411, "CC(remember):SearchBar.android.kt#9igjgp");
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            }
            MutatorMutex mutatorMutex22 = (MutatorMutex) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626040814, "CC(remember):SearchBar.android.kt#9igjgp");
            changedInstance2 = startRestartGroup.changedInstance(animatable) | ((i6 & 896) != 256);
            Object rememberedValue722 = startRestartGroup.rememberedValue();
            if (changedInstance2) {
            }
            animatable2 = animatable;
            i7 = i6;
            searchBar_androidKt$SearchBar$2$1 = new SearchBar_androidKt$SearchBar$2$1(mutatorMutex22, mutableFloatState22, animatable2, function1, mutableState32, mutableState222, null);
            startRestartGroup.updateRememberedValue(searchBar_androidKt$SearchBar$2$1);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            PredictiveBackHandlerKt.PredictiveBackHandler(z, (Function2) searchBar_androidKt$SearchBar$2$1, startRestartGroup, i1222, 0);
            int i1322 = i7 << 6;
            m2107SearchBarImplj1jLAyQ(animatable2, mutableFloatState22, mutableState32, mutableState222, modifier3, function2, shape4, searchBarColors4, f6, f5, windowInsets2, function3, startRestartGroup, Animatable.$stable | 3504 | ((i7 << 3) & 57344) | ((i7 << 15) & 458752) | (3670016 & i1322) | (29360128 & i1322) | (234881024 & i1322) | (i1322 & 1879048192), (i7 >> 24) & WebSocketProtocol.PAYLOAD_SHORT, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            shape5 = shape4;
            searchBarColors5 = searchBarColors4;
            f3 = f6;
            windowInsets3 = windowInsets2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i2 & 512) != 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        f5 = f4;
        modifier3 = modifier2;
        searchBarColors4 = searchBarColors3;
        f6 = m2100getTonalElevationD9Ej5fM;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626005896, "CC(remember):SearchBar.android.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        animatable = (Animatable) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626008851, "CC(remember):SearchBar.android.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        MutableFloatState mutableFloatState222 = (MutableFloatState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626011067, "CC(remember):SearchBar.android.kt#9igjgp");
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState322 = (MutableState) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626013595, "CC(remember):SearchBar.android.kt#9igjgp");
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState2222 = (MutableState) rememberedValue4;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        valueOf = Boolean.valueOf(z);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626016806, "CC(remember):SearchBar.android.kt#9igjgp");
        changedInstance = startRestartGroup.changedInstance(animatable) | ((i6 & 112) != 32);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (changedInstance) {
        }
        bool = valueOf;
        rememberedValue5 = new SearchBar_androidKt$SearchBar$1$1(animatable, z, mutableFloatState222, mutableState322, mutableState2222, null);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i12222 = (i6 >> 3) & 14;
        EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, i12222);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626037411, "CC(remember):SearchBar.android.kt#9igjgp");
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
        }
        MutatorMutex mutatorMutex222 = (MutatorMutex) rememberedValue6;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 626040814, "CC(remember):SearchBar.android.kt#9igjgp");
        changedInstance2 = startRestartGroup.changedInstance(animatable) | ((i6 & 896) != 256);
        Object rememberedValue7222 = startRestartGroup.rememberedValue();
        if (changedInstance2) {
        }
        animatable2 = animatable;
        i7 = i6;
        searchBar_androidKt$SearchBar$2$1 = new SearchBar_androidKt$SearchBar$2$1(mutatorMutex222, mutableFloatState222, animatable2, function1, mutableState322, mutableState2222, null);
        startRestartGroup.updateRememberedValue(searchBar_androidKt$SearchBar$2$1);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        PredictiveBackHandlerKt.PredictiveBackHandler(z, (Function2) searchBar_androidKt$SearchBar$2$1, startRestartGroup, i12222, 0);
        int i13222 = i7 << 6;
        m2107SearchBarImplj1jLAyQ(animatable2, mutableFloatState222, mutableState322, mutableState2222, modifier3, function2, shape4, searchBarColors4, f6, f5, windowInsets2, function3, startRestartGroup, Animatable.$stable | 3504 | ((i7 << 3) & 57344) | ((i7 << 15) & 458752) | (3670016 & i13222) | (29360128 & i13222) | (234881024 & i13222) | (i13222 & 1879048192), (i7 >> 24) & WebSocketProtocol.PAYLOAD_SHORT, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        shape5 = shape4;
        searchBarColors5 = searchBarColors4;
        f3 = f6;
        windowInsets3 = windowInsets2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f4  */
    /* renamed from: DockedSearchBar-EQC0FA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2103DockedSearchBarEQC0FA8(final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i4;
        float f3;
        int i5;
        Shape shape3;
        int i6;
        SearchBarColors searchBarColors3;
        final float m2100getTonalElevationD9Ej5fM;
        float m2099getShadowElevationD9Ej5fM;
        int i7;
        final SearchBarColors searchBarColors4;
        boolean z2;
        Object rememberedValue;
        final Shape shape4;
        float f4;
        final SearchBarColors searchBarColors5;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1209217899);
        ComposerKt.sourceInformation(startRestartGroup, "C(DockedSearchBar)P(3,2,5,4,7!1,8:c#ui.unit.Dp,6:c#ui.unit.Dp)287@13410L11,288@13471L8,296@13752L38,300@13946L831,293@13658L1119,325@14815L27,325@14783L59:SearchBar.android.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i9 = 16384;
                        i3 |= i9;
                    }
                } else {
                    shape2 = shape;
                }
                i9 = 8192;
                i3 |= i9;
            } else {
                shape2 = shape;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    searchBarColors2 = searchBarColors;
                    if (startRestartGroup.changed(searchBarColors2)) {
                        i8 = 131072;
                        i3 |= i8;
                    }
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i8 = 65536;
                i3 |= i8;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                f3 = f;
            } else {
                f3 = f;
                if ((1572864 & i) == 0) {
                    i3 |= startRestartGroup.changed(f3) ? 1048576 : 524288;
                }
            }
            i5 = i2 & 128;
            if (i5 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
            }
            if ((i2 & 256) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 16) == 0) {
                        shape3 = SearchBarDefaults.INSTANCE.getDockedShape(startRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i2 & 32) == 0) {
                        i6 = i5;
                        searchBarColors3 = SearchBarDefaults.INSTANCE.m2096colorsdgg9oW8(0L, 0L, startRestartGroup, 384, 3);
                        i3 &= -458753;
                    } else {
                        i6 = i5;
                        searchBarColors3 = searchBarColors2;
                    }
                    m2100getTonalElevationD9Ej5fM = i4 == 0 ? SearchBarDefaults.INSTANCE.m2100getTonalElevationD9Ej5fM() : f;
                    m2099getShadowElevationD9Ej5fM = i6 == 0 ? SearchBarDefaults.INSTANCE.m2099getShadowElevationD9Ej5fM() : f2;
                    i7 = i3;
                    searchBarColors4 = searchBarColors3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    m2099getShadowElevationD9Ej5fM = f2;
                    i7 = i3;
                    shape3 = shape2;
                    searchBarColors4 = searchBarColors2;
                    m2100getTonalElevationD9Ej5fM = f3;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1209217899, i7, -1, "androidx.compose.material3.DockedSearchBar (SearchBar.android.kt:292)");
                }
                long m2092getContainerColor0d7_KjU = searchBarColors4.m2092getContainerColor0d7_KjU();
                long m1609contentColorForek8zF_U = ColorSchemeKt.m1609contentColorForek8zF_U(searchBarColors4.m2092getContainerColor0d7_KjU(), startRestartGroup, 0);
                SearchBarColors searchBarColors6 = searchBarColors4;
                int i11 = i7 >> 6;
                int i12 = i7;
                SurfaceKt.m2223SurfaceT9BRK9s(SizeKt.m731width3ABfNKs(ZIndexModifierKt.zIndex(modifier2, 1.0f), SearchBarMinWidth), shape3, m2092getContainerColor0d7_KjU, m1609contentColorForek8zF_U, m2100getTonalElevationD9Ej5fM, m2099getShadowElevationD9Ej5fM, null, ComposableLambdaKt.rememberComposableLambda(878471280, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$1
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

                    public final void invoke(Composer composer2, int i13) {
                        EnterTransition enterTransition;
                        ExitTransition exitTransition;
                        ComposerKt.sourceInformation(composer2, "C301@13956L815:SearchBar.android.kt#uh7d8r");
                        if ((i13 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(878471280, i13, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:301)");
                            }
                            Function2<Composer, Integer, Unit> function22 = function2;
                            boolean z3 = z;
                            final SearchBarColors searchBarColors7 = searchBarColors4;
                            final Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
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
                            Updater.m3340setimpl(m3333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1812191551, "C302@13977L12,308@14165L596,304@14003L758:SearchBar.android.kt#uh7d8r");
                            function22.invoke(composer2, 0);
                            enterTransition = SearchBar_androidKt.DockedEnterTransition;
                            exitTransition = SearchBar_androidKt.DockedExitTransition;
                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z3, (Modifier) null, enterTransition, exitTransition, (String) null, ComposableLambdaKt.rememberComposableLambda(-1743690306, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                    invoke(animatedVisibilityScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i14) {
                                    ComposerKt.sourceInformation(composer3, "C*309@14221L7,311@14299L125,315@14477L76,317@14571L176:SearchBar.android.kt#uh7d8r");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1743690306, i14, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:309)");
                                    }
                                    ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume = composer3.consume(localConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    float m6299constructorimpl = Dp.m6299constructorimpl(((Configuration) consume).screenHeightDp);
                                    ComposerKt.sourceInformationMarkerStart(composer3, 1708554480, "CC(remember):SearchBar.android.kt#9igjgp");
                                    boolean changed = composer3.changed(m6299constructorimpl);
                                    Object rememberedValue2 = composer3.rememberedValue();
                                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = Dp.m6297boximpl(Dp.m6299constructorimpl(m6299constructorimpl * 0.6666667f));
                                        composer3.updateRememberedValue(rememberedValue2);
                                    }
                                    float m6313unboximpl = ((Dp) rememberedValue2).m6313unboximpl();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerStart(composer3, 1708560127, "CC(remember):SearchBar.android.kt#9igjgp");
                                    boolean changed2 = composer3.changed(m6313unboximpl);
                                    Object rememberedValue3 = composer3.rememberedValue();
                                    if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = Dp.m6297boximpl(((Dp) RangesKt.coerceAtMost(Dp.m6297boximpl(SearchBar_androidKt.getDockedExpandedTableMinHeight()), Dp.m6297boximpl(m6313unboximpl))).m6313unboximpl());
                                        composer3.updateRememberedValue(rememberedValue3);
                                    }
                                    float m6313unboximpl2 = ((Dp) rememberedValue3).m6313unboximpl();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Modifier m713heightInVpY3zN4 = SizeKt.m713heightInVpY3zN4(Modifier.INSTANCE, m6313unboximpl2, m6313unboximpl);
                                    SearchBarColors searchBarColors8 = SearchBarColors.this;
                                    Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m713heightInVpY3zN4);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer3);
                                    Updater.m3340setimpl(m3333constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 697724229, "C318@14653L46,319@14720L9:SearchBar.android.kt#uh7d8r");
                                    DividerKt.m1752HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors8.m2093getDividerColor0d7_KjU(), composer3, 0, 3);
                                    function33.invoke(columnScopeInstance2, composer3, 6);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 1600518, 18);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i7 >> 9) & 112) | 12582912 | (i11 & 57344) | (i11 & 458752), 64);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -994322031, "CC(remember):SearchBar.android.kt#9igjgp");
                z2 = (i12 & 896) == 256;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function1.invoke(false);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                BackHandlerKt.BackHandler(z, (Function0) rememberedValue, startRestartGroup, (i12 >> 3) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape3;
                f4 = m2099getShadowElevationD9Ej5fM;
                searchBarColors5 = searchBarColors6;
            } else {
                startRestartGroup.skipToGroupEnd();
                f4 = f2;
                shape4 = shape2;
                searchBarColors5 = searchBarColors2;
                m2100getTonalElevationD9Ej5fM = f3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = modifier2;
                final float f5 = f4;
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$3
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

                    public final void invoke(Composer composer2, int i13) {
                        SearchBar_androidKt.m2103DockedSearchBarEQC0FA8(function2, z, function1, modifier3, shape4, searchBarColors5, m2100getTonalElevationD9Ej5fM, f5, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if (i4 == 0) {
        }
        if (i6 == 0) {
        }
        i7 = i3;
        searchBarColors4 = searchBarColors3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        long m2092getContainerColor0d7_KjU2 = searchBarColors4.m2092getContainerColor0d7_KjU();
        long m1609contentColorForek8zF_U2 = ColorSchemeKt.m1609contentColorForek8zF_U(searchBarColors4.m2092getContainerColor0d7_KjU(), startRestartGroup, 0);
        SearchBarColors searchBarColors62 = searchBarColors4;
        int i112 = i7 >> 6;
        int i122 = i7;
        SurfaceKt.m2223SurfaceT9BRK9s(SizeKt.m731width3ABfNKs(ZIndexModifierKt.zIndex(modifier2, 1.0f), SearchBarMinWidth), shape3, m2092getContainerColor0d7_KjU2, m1609contentColorForek8zF_U2, m2100getTonalElevationD9Ej5fM, m2099getShadowElevationD9Ej5fM, null, ComposableLambdaKt.rememberComposableLambda(878471280, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$1
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

            public final void invoke(Composer composer2, int i13) {
                EnterTransition enterTransition;
                ExitTransition exitTransition;
                ComposerKt.sourceInformation(composer2, "C301@13956L815:SearchBar.android.kt#uh7d8r");
                if ((i13 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(878471280, i13, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:301)");
                    }
                    Function2<Composer, Integer, Unit> function22 = function2;
                    boolean z3 = z;
                    final SearchBarColors searchBarColors7 = searchBarColors4;
                    final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
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
                    Updater.m3340setimpl(m3333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1812191551, "C302@13977L12,308@14165L596,304@14003L758:SearchBar.android.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    enterTransition = SearchBar_androidKt.DockedEnterTransition;
                    exitTransition = SearchBar_androidKt.DockedExitTransition;
                    AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z3, (Modifier) null, enterTransition, exitTransition, (String) null, ComposableLambdaKt.rememberComposableLambda(-1743690306, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                            invoke(animatedVisibilityScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i14) {
                            ComposerKt.sourceInformation(composer3, "C*309@14221L7,311@14299L125,315@14477L76,317@14571L176:SearchBar.android.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1743690306, i14, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:309)");
                            }
                            ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object consume = composer3.consume(localConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            float m6299constructorimpl = Dp.m6299constructorimpl(((Configuration) consume).screenHeightDp);
                            ComposerKt.sourceInformationMarkerStart(composer3, 1708554480, "CC(remember):SearchBar.android.kt#9igjgp");
                            boolean changed = composer3.changed(m6299constructorimpl);
                            Object rememberedValue2 = composer3.rememberedValue();
                            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = Dp.m6297boximpl(Dp.m6299constructorimpl(m6299constructorimpl * 0.6666667f));
                                composer3.updateRememberedValue(rememberedValue2);
                            }
                            float m6313unboximpl = ((Dp) rememberedValue2).m6313unboximpl();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerStart(composer3, 1708560127, "CC(remember):SearchBar.android.kt#9igjgp");
                            boolean changed2 = composer3.changed(m6313unboximpl);
                            Object rememberedValue3 = composer3.rememberedValue();
                            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = Dp.m6297boximpl(((Dp) RangesKt.coerceAtMost(Dp.m6297boximpl(SearchBar_androidKt.getDockedExpandedTableMinHeight()), Dp.m6297boximpl(m6313unboximpl))).m6313unboximpl());
                                composer3.updateRememberedValue(rememberedValue3);
                            }
                            float m6313unboximpl2 = ((Dp) rememberedValue3).m6313unboximpl();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Modifier m713heightInVpY3zN4 = SizeKt.m713heightInVpY3zN4(Modifier.INSTANCE, m6313unboximpl2, m6313unboximpl);
                            SearchBarColors searchBarColors8 = SearchBarColors.this;
                            Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m713heightInVpY3zN4);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer3);
                            Updater.m3340setimpl(m3333constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer3, 697724229, "C318@14653L46,319@14720L9:SearchBar.android.kt#uh7d8r");
                            DividerKt.m1752HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors8.m2093getDividerColor0d7_KjU(), composer3, 0, 3);
                            function33.invoke(columnScopeInstance2, composer3, 6);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 1600518, 18);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, ((i7 >> 9) & 112) | 12582912 | (i112 & 57344) | (i112 & 458752), 64);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -994322031, "CC(remember):SearchBar.android.kt#9igjgp");
        if ((i122 & 896) == 256) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                function1.invoke(false);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        BackHandlerKt.BackHandler(z, (Function0) rememberedValue, startRestartGroup, (i122 >> 3) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape4 = shape3;
        f4 = m2099getShadowElevationD9Ej5fM;
        searchBarColors5 = searchBarColors62;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024e  */
    @Deprecated(message = "Use overload which takes inputField as a parameter", replaceWith = @ReplaceWith(expression = "SearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    windowInsets = windowInsets,\n    content = content,\n)", imports = {}))
    /* renamed from: SearchBar-WuY5d9Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2105SearchBarWuY5d9Q(final String str, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final boolean z, final Function1<? super Boolean, Unit> function13, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, MutableInteractionSource mutableInteractionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Shape shape2;
        int i15;
        int i16;
        int i17;
        SearchBarColors searchBarColors2;
        WindowInsets windowInsets2;
        int i18;
        MutableInteractionSource mutableInteractionSource2;
        SearchBarColors searchBarColors3;
        float f3;
        float f4;
        WindowInsets windowInsets3;
        int i19;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Modifier modifier2;
        int i20;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Shape shape4;
        SearchBarColors searchBarColors4;
        float f5;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i21;
        int i22;
        Composer startRestartGroup = composer.startRestartGroup(1001512593);
        ComposerKt.sourceInformation(startRestartGroup, "C(SearchBar)P(11,8,9!1,7,6,3,10,5,15,13!1,14:c#ui.unit.Dp,12:c#ui.unit.Dp,16,4)737@34012L15,738@34077L8,741@34258L12,746@34418L591,745@34386L925:SearchBar.android.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
            int i23 = 8192;
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changedInstance(function13) ? 16384 : 8192;
                i5 = i3 & 32;
                if (i5 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(modifier) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                    z3 = z2;
                } else {
                    z3 = z2;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= startRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
                }
                if ((i2 & 6) == 0) {
                    if ((i3 & 1024) == 0 && startRestartGroup.changed(shape)) {
                        i22 = 4;
                        i10 = i2 | i22;
                    }
                    i22 = 2;
                    i10 = i2 | i22;
                } else {
                    i10 = i2;
                }
                if ((i2 & 48) == 0) {
                    if ((i3 & 2048) == 0 && startRestartGroup.changed(searchBarColors)) {
                        i21 = 32;
                        i10 |= i21;
                    }
                    i21 = 16;
                    i10 |= i21;
                }
                int i24 = i10;
                i11 = i3 & 4096;
                if (i11 != 0) {
                    i24 |= 384;
                } else if ((i2 & 384) == 0) {
                    i24 |= startRestartGroup.changed(f) ? 256 : 128;
                    i12 = i3 & 8192;
                    if (i12 == 0) {
                        i24 |= 3072;
                    } else if ((i2 & 3072) == 0) {
                        i24 |= startRestartGroup.changed(f2) ? 2048 : 1024;
                        if ((i2 & 24576) == 0) {
                            if ((i3 & 16384) == 0 && startRestartGroup.changed(windowInsets)) {
                                i23 = 16384;
                            }
                            i24 |= i23;
                        }
                        i13 = i3 & 32768;
                        if (i13 != 0) {
                            i24 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i14 = i12;
                            i24 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
                            if ((i3 & 65536) == 0) {
                                i24 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                i24 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                            }
                            int i25 = i4;
                            if ((i4 & 306783379) != 306783378 && (599187 & i24) == 599186 && startRestartGroup.getSkipping()) {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                function29 = function2;
                                function27 = function22;
                                function28 = function23;
                                shape4 = shape;
                                searchBarColors4 = searchBarColors;
                                f5 = f;
                                f4 = f2;
                                windowInsets3 = windowInsets;
                                mutableInteractionSource2 = mutableInteractionSource;
                                z5 = z3;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier;
                                    boolean z6 = i6 == 0 ? true : z3;
                                    Function2<? super Composer, ? super Integer, Unit> function210 = i7 == 0 ? null : function2;
                                    Function2<? super Composer, ? super Integer, Unit> function211 = i8 == 0 ? null : function22;
                                    Function2<? super Composer, ? super Integer, Unit> function212 = i9 == 0 ? null : function23;
                                    if ((i3 & 1024) == 0) {
                                        i24 &= -15;
                                        shape2 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                                    } else {
                                        shape2 = shape;
                                    }
                                    int i26 = i24;
                                    if ((i3 & 2048) == 0) {
                                        i15 = i25;
                                        i16 = i14;
                                        i17 = i11;
                                        searchBarColors2 = SearchBarDefaults.INSTANCE.m2096colorsdgg9oW8(0L, 0L, startRestartGroup, 384, 3);
                                        i26 &= -113;
                                    } else {
                                        i15 = i25;
                                        i16 = i14;
                                        i17 = i11;
                                        searchBarColors2 = searchBarColors;
                                    }
                                    float m2100getTonalElevationD9Ej5fM = i17 == 0 ? SearchBarDefaults.INSTANCE.m2100getTonalElevationD9Ej5fM() : f;
                                    float m2099getShadowElevationD9Ej5fM = i16 == 0 ? SearchBarDefaults.INSTANCE.m2099getShadowElevationD9Ej5fM() : f2;
                                    if ((i3 & 16384) == 0) {
                                        windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                        i18 = i26 & (-57345);
                                    } else {
                                        windowInsets2 = windowInsets;
                                        i18 = i26;
                                    }
                                    if (i13 == 0) {
                                        searchBarColors3 = searchBarColors2;
                                        f3 = m2100getTonalElevationD9Ej5fM;
                                        f4 = m2099getShadowElevationD9Ej5fM;
                                        windowInsets3 = windowInsets2;
                                        i19 = i18;
                                        z4 = z6;
                                        mutableInteractionSource2 = null;
                                    } else {
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        searchBarColors3 = searchBarColors2;
                                        f3 = m2100getTonalElevationD9Ej5fM;
                                        f4 = m2099getShadowElevationD9Ej5fM;
                                        windowInsets3 = windowInsets2;
                                        i19 = i18;
                                        z4 = z6;
                                    }
                                    function24 = function210;
                                    function25 = function211;
                                    shape3 = shape2;
                                    function26 = function212;
                                    modifier2 = modifier4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 1024) != 0) {
                                        i24 &= -15;
                                    }
                                    if ((i3 & 2048) != 0) {
                                        i24 &= -113;
                                    }
                                    if ((i3 & 16384) != 0) {
                                        i24 &= -57345;
                                    }
                                    modifier2 = modifier;
                                    function25 = function22;
                                    function26 = function23;
                                    shape3 = shape;
                                    searchBarColors3 = searchBarColors;
                                    f3 = f;
                                    f4 = f2;
                                    windowInsets3 = windowInsets;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    i15 = i25;
                                    z4 = z3;
                                    i19 = i24;
                                    function24 = function2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    i20 = i15;
                                } else {
                                    i20 = i15;
                                    ComposerKt.traceEventStart(1001512593, i20, i19, "androidx.compose.material3.SearchBar (SearchBar.android.kt:745)");
                                }
                                final SearchBarColors searchBarColors5 = searchBarColors3;
                                final boolean z7 = z4;
                                final Function2<? super Composer, ? super Integer, Unit> function213 = function24;
                                final Function2<? super Composer, ? super Integer, Unit> function214 = function25;
                                final Function2<? super Composer, ? super Integer, Unit> function215 = function26;
                                final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                                boolean z8 = z4;
                                Function2<? super Composer, ? super Integer, Unit> function216 = function24;
                                int i27 = i20 >> 6;
                                int i28 = 6 | (i27 & 112) | (i27 & 896) | (i27 & 7168);
                                int i29 = i19 << 12;
                                m2106SearchBarY92LkZI(ComposableLambdaKt.rememberComposableLambda(-1158111311, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4
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

                                    public final void invoke(Composer composer2, int i30) {
                                        ComposerKt.sourceInformation(composer2, "C747@34450L549:SearchBar.android.kt#uh7d8r");
                                        if ((i30 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1158111311, i30, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:747)");
                                            }
                                            SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z7, function213, function214, function215, SearchBarColors.this.getInputFieldColors(), mutableInteractionSource3, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54), z, function13, modifier2, shape3, searchBarColors3, f3, f4, windowInsets3, function3, startRestartGroup, i28 | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (29360128 & i29) | (i29 & 234881024) | ((i19 << 9) & 1879048192), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function27 = function25;
                                function28 = function26;
                                shape4 = shape3;
                                searchBarColors4 = searchBarColors3;
                                f5 = f3;
                                z5 = z8;
                                function29 = function216;
                                modifier3 = modifier2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Function2<? super Composer, ? super Integer, Unit> function217 = function27;
                                final Function2<? super Composer, ? super Integer, Unit> function218 = function28;
                                final Shape shape5 = shape4;
                                final SearchBarColors searchBarColors6 = searchBarColors4;
                                final float f6 = f5;
                                final float f7 = f4;
                                final WindowInsets windowInsets4 = windowInsets3;
                                final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$5
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

                                    public final void invoke(Composer composer2, int i30) {
                                        SearchBar_androidKt.m2105SearchBarWuY5d9Q(str, function1, function12, z, function13, modifier3, z5, function29, function217, function218, shape5, searchBarColors6, f6, f7, windowInsets4, mutableInteractionSource4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i14 = i12;
                        if ((i3 & 65536) == 0) {
                        }
                        int i252 = i4;
                        if ((i4 & 306783379) != 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        int i262 = i24;
                        if ((i3 & 2048) == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if ((i3 & 16384) == 0) {
                        }
                        if (i13 == 0) {
                        }
                        function24 = function210;
                        function25 = function211;
                        shape3 = shape2;
                        function26 = function212;
                        modifier2 = modifier4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final SearchBarColors searchBarColors52 = searchBarColors3;
                        final boolean z72 = z4;
                        final Function2<? super Composer, ? super Integer, Unit> function2132 = function24;
                        final Function2<? super Composer, ? super Integer, Unit> function2142 = function25;
                        final Function2<? super Composer, ? super Integer, Unit> function2152 = function26;
                        final MutableInteractionSource mutableInteractionSource32 = mutableInteractionSource2;
                        boolean z82 = z4;
                        Function2<? super Composer, ? super Integer, Unit> function2162 = function24;
                        int i272 = i20 >> 6;
                        int i282 = 6 | (i272 & 112) | (i272 & 896) | (i272 & 7168);
                        int i292 = i19 << 12;
                        m2106SearchBarY92LkZI(ComposableLambdaKt.rememberComposableLambda(-1158111311, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4
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

                            public final void invoke(Composer composer2, int i30) {
                                ComposerKt.sourceInformation(composer2, "C747@34450L549:SearchBar.android.kt#uh7d8r");
                                if ((i30 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1158111311, i30, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:747)");
                                    }
                                    SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z72, function2132, function2142, function2152, SearchBarColors.this.getInputFieldColors(), mutableInteractionSource32, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), z, function13, modifier2, shape3, searchBarColors3, f3, f4, windowInsets3, function3, startRestartGroup, i282 | (57344 & i292) | (458752 & i292) | (3670016 & i292) | (29360128 & i292) | (i292 & 234881024) | ((i19 << 9) & 1879048192), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function27 = function25;
                        function28 = function26;
                        shape4 = shape3;
                        searchBarColors4 = searchBarColors3;
                        f5 = f3;
                        z5 = z82;
                        function29 = function2162;
                        modifier3 = modifier2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    i13 = i3 & 32768;
                    if (i13 != 0) {
                    }
                    i14 = i12;
                    if ((i3 & 65536) == 0) {
                    }
                    int i2522 = i4;
                    if ((i4 & 306783379) != 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if ((i3 & 1024) == 0) {
                    }
                    int i2622 = i24;
                    if ((i3 & 2048) == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if ((i3 & 16384) == 0) {
                    }
                    if (i13 == 0) {
                    }
                    function24 = function210;
                    function25 = function211;
                    shape3 = shape2;
                    function26 = function212;
                    modifier2 = modifier4;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final SearchBarColors searchBarColors522 = searchBarColors3;
                    final boolean z722 = z4;
                    final Function2<? super Composer, ? super Integer, Unit> function21322 = function24;
                    final Function2<? super Composer, ? super Integer, Unit> function21422 = function25;
                    final Function2<? super Composer, ? super Integer, Unit> function21522 = function26;
                    final MutableInteractionSource mutableInteractionSource322 = mutableInteractionSource2;
                    boolean z822 = z4;
                    Function2<? super Composer, ? super Integer, Unit> function21622 = function24;
                    int i2722 = i20 >> 6;
                    int i2822 = 6 | (i2722 & 112) | (i2722 & 896) | (i2722 & 7168);
                    int i2922 = i19 << 12;
                    m2106SearchBarY92LkZI(ComposableLambdaKt.rememberComposableLambda(-1158111311, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4
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

                        public final void invoke(Composer composer2, int i30) {
                            ComposerKt.sourceInformation(composer2, "C747@34450L549:SearchBar.android.kt#uh7d8r");
                            if ((i30 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1158111311, i30, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:747)");
                                }
                                SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z722, function21322, function21422, function21522, SearchBarColors.this.getInputFieldColors(), mutableInteractionSource322, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), z, function13, modifier2, shape3, searchBarColors3, f3, f4, windowInsets3, function3, startRestartGroup, i2822 | (57344 & i2922) | (458752 & i2922) | (3670016 & i2922) | (29360128 & i2922) | (i2922 & 234881024) | ((i19 << 9) & 1879048192), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function27 = function25;
                    function28 = function26;
                    shape4 = shape3;
                    searchBarColors4 = searchBarColors3;
                    f5 = f3;
                    z5 = z822;
                    function29 = function21622;
                    modifier3 = modifier2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i12 = i3 & 8192;
                if (i12 == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                i13 = i3 & 32768;
                if (i13 != 0) {
                }
                i14 = i12;
                if ((i3 & 65536) == 0) {
                }
                int i25222 = i4;
                if ((i4 & 306783379) != 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                int i26222 = i24;
                if ((i3 & 2048) == 0) {
                }
                if (i17 == 0) {
                }
                if (i16 == 0) {
                }
                if ((i3 & 16384) == 0) {
                }
                if (i13 == 0) {
                }
                function24 = function210;
                function25 = function211;
                shape3 = shape2;
                function26 = function212;
                modifier2 = modifier4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SearchBarColors searchBarColors5222 = searchBarColors3;
                final boolean z7222 = z4;
                final Function2<? super Composer, ? super Integer, Unit> function213222 = function24;
                final Function2<? super Composer, ? super Integer, Unit> function214222 = function25;
                final Function2<? super Composer, ? super Integer, Unit> function215222 = function26;
                final MutableInteractionSource mutableInteractionSource3222 = mutableInteractionSource2;
                boolean z8222 = z4;
                Function2<? super Composer, ? super Integer, Unit> function216222 = function24;
                int i27222 = i20 >> 6;
                int i28222 = 6 | (i27222 & 112) | (i27222 & 896) | (i27222 & 7168);
                int i29222 = i19 << 12;
                m2106SearchBarY92LkZI(ComposableLambdaKt.rememberComposableLambda(-1158111311, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4
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

                    public final void invoke(Composer composer2, int i30) {
                        ComposerKt.sourceInformation(composer2, "C747@34450L549:SearchBar.android.kt#uh7d8r");
                        if ((i30 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1158111311, i30, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:747)");
                            }
                            SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z7222, function213222, function214222, function215222, SearchBarColors.this.getInputFieldColors(), mutableInteractionSource3222, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), z, function13, modifier2, shape3, searchBarColors3, f3, f4, windowInsets3, function3, startRestartGroup, i28222 | (57344 & i29222) | (458752 & i29222) | (3670016 & i29222) | (29360128 & i29222) | (i29222 & 234881024) | ((i19 << 9) & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                function27 = function25;
                function28 = function26;
                shape4 = shape3;
                searchBarColors4 = searchBarColors3;
                f5 = f3;
                z5 = z8222;
                function29 = function216222;
                modifier3 = modifier2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i3 & 32;
            if (i5 != 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i242 = i10;
            i11 = i3 & 4096;
            if (i11 != 0) {
            }
            i12 = i3 & 8192;
            if (i12 == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i13 = i3 & 32768;
            if (i13 != 0) {
            }
            i14 = i12;
            if ((i3 & 65536) == 0) {
            }
            int i252222 = i4;
            if ((i4 & 306783379) != 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            int i262222 = i242;
            if ((i3 & 2048) == 0) {
            }
            if (i17 == 0) {
            }
            if (i16 == 0) {
            }
            if ((i3 & 16384) == 0) {
            }
            if (i13 == 0) {
            }
            function24 = function210;
            function25 = function211;
            shape3 = shape2;
            function26 = function212;
            modifier2 = modifier4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final SearchBarColors searchBarColors52222 = searchBarColors3;
            final boolean z72222 = z4;
            final Function2<? super Composer, ? super Integer, Unit> function2132222 = function24;
            final Function2<? super Composer, ? super Integer, Unit> function2142222 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function2152222 = function26;
            final MutableInteractionSource mutableInteractionSource32222 = mutableInteractionSource2;
            boolean z82222 = z4;
            Function2<? super Composer, ? super Integer, Unit> function2162222 = function24;
            int i272222 = i20 >> 6;
            int i282222 = 6 | (i272222 & 112) | (i272222 & 896) | (i272222 & 7168);
            int i292222 = i19 << 12;
            m2106SearchBarY92LkZI(ComposableLambdaKt.rememberComposableLambda(-1158111311, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4
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

                public final void invoke(Composer composer2, int i30) {
                    ComposerKt.sourceInformation(composer2, "C747@34450L549:SearchBar.android.kt#uh7d8r");
                    if ((i30 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1158111311, i30, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:747)");
                        }
                        SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z72222, function2132222, function2142222, function2152222, SearchBarColors.this.getInputFieldColors(), mutableInteractionSource32222, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), z, function13, modifier2, shape3, searchBarColors3, f3, f4, windowInsets3, function3, startRestartGroup, i282222 | (57344 & i292222) | (458752 & i292222) | (3670016 & i292222) | (29360128 & i292222) | (i292222 & 234881024) | ((i19 << 9) & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            function27 = function25;
            function28 = function26;
            shape4 = shape3;
            searchBarColors4 = searchBarColors3;
            f5 = f3;
            z5 = z82222;
            function29 = function2162222;
            modifier3 = modifier2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        int i232 = 8192;
        if ((i3 & 16) == 0) {
        }
        i5 = i3 & 32;
        if (i5 != 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i2422 = i10;
        i11 = i3 & 4096;
        if (i11 != 0) {
        }
        i12 = i3 & 8192;
        if (i12 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i13 = i3 & 32768;
        if (i13 != 0) {
        }
        i14 = i12;
        if ((i3 & 65536) == 0) {
        }
        int i2522222 = i4;
        if ((i4 & 306783379) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        int i2622222 = i2422;
        if ((i3 & 2048) == 0) {
        }
        if (i17 == 0) {
        }
        if (i16 == 0) {
        }
        if ((i3 & 16384) == 0) {
        }
        if (i13 == 0) {
        }
        function24 = function210;
        function25 = function211;
        shape3 = shape2;
        function26 = function212;
        modifier2 = modifier4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final SearchBarColors searchBarColors522222 = searchBarColors3;
        final boolean z722222 = z4;
        final Function2<? super Composer, ? super Integer, Unit> function21322222 = function24;
        final Function2<? super Composer, ? super Integer, Unit> function21422222 = function25;
        final Function2<? super Composer, ? super Integer, Unit> function21522222 = function26;
        final MutableInteractionSource mutableInteractionSource322222 = mutableInteractionSource2;
        boolean z822222 = z4;
        Function2<? super Composer, ? super Integer, Unit> function21622222 = function24;
        int i2722222 = i20 >> 6;
        int i2822222 = 6 | (i2722222 & 112) | (i2722222 & 896) | (i2722222 & 7168);
        int i2922222 = i19 << 12;
        m2106SearchBarY92LkZI(ComposableLambdaKt.rememberComposableLambda(-1158111311, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4
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

            public final void invoke(Composer composer2, int i30) {
                ComposerKt.sourceInformation(composer2, "C747@34450L549:SearchBar.android.kt#uh7d8r");
                if ((i30 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1158111311, i30, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:747)");
                    }
                    SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z722222, function21322222, function21422222, function21522222, SearchBarColors.this.getInputFieldColors(), mutableInteractionSource322222, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), z, function13, modifier2, shape3, searchBarColors3, f3, f4, windowInsets3, function3, startRestartGroup, i2822222 | (57344 & i2922222) | (458752 & i2922222) | (3670016 & i2922222) | (29360128 & i2922222) | (i2922222 & 234881024) | ((i19 << 9) & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        function27 = function25;
        function28 = function26;
        shape4 = shape3;
        searchBarColors4 = searchBarColors3;
        f5 = f3;
        z5 = z822222;
        function29 = function21622222;
        modifier3 = modifier2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0267  */
    @Deprecated(message = "Use overload which takes inputField as a parameter", replaceWith = @ReplaceWith(expression = "DockedSearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    content = content,\n)", imports = {}))
    /* renamed from: DockedSearchBar-eWTbjVg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2104DockedSearchBareWTbjVg(final String str, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final boolean z, final Function1<? super Boolean, Unit> function13, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SearchBarColors searchBarColors, float f, float f2, MutableInteractionSource mutableInteractionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Shape shape2;
        int i15;
        int i16;
        int i17;
        int i18;
        SearchBarColors searchBarColors2;
        MutableInteractionSource mutableInteractionSource2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        SearchBarColors searchBarColors3;
        float f3;
        float f4;
        Modifier modifier2;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Shape shape3;
        int i19;
        Composer composer2;
        final Modifier modifier3;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Shape shape4;
        final SearchBarColors searchBarColors4;
        ScopeUpdateScope endRestartGroup;
        int i20;
        int i21;
        Composer startRestartGroup = composer.startRestartGroup(1299054533);
        ComposerKt.sourceInformation(startRestartGroup, "C(DockedSearchBar)P(11,8,9!1,7,6,3,10,5,15,13!1,14:c#ui.unit.Dp,12:c#ui.unit.Dp,4)818@37222L11,819@37283L8,826@37565L591,825@37527L894:SearchBar.android.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changedInstance(function13) ? 16384 : 8192;
                i5 = i3 & 32;
                if (i5 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(modifier) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                    z3 = z2;
                } else {
                    z3 = z2;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= startRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
                }
                if ((i2 & 6) == 0) {
                    if ((i3 & 1024) == 0 && startRestartGroup.changed(shape)) {
                        i21 = 4;
                        i10 = i2 | i21;
                    }
                    i21 = 2;
                    i10 = i2 | i21;
                } else {
                    i10 = i2;
                }
                if ((i2 & 48) == 0) {
                    if ((i3 & 2048) == 0 && startRestartGroup.changed(searchBarColors)) {
                        i20 = 32;
                        i10 |= i20;
                    }
                    i20 = 16;
                    i10 |= i20;
                }
                int i22 = i10;
                i11 = i3 & 4096;
                if (i11 != 0) {
                    i22 |= 384;
                } else if ((i2 & 384) == 0) {
                    i22 |= startRestartGroup.changed(f) ? 256 : 128;
                    i12 = i3 & 8192;
                    if (i12 == 0) {
                        i22 |= 3072;
                    } else if ((i2 & 3072) == 0) {
                        i22 |= startRestartGroup.changed(f2) ? 2048 : 1024;
                        i13 = i3 & 16384;
                        if (i13 != 0) {
                            i22 |= 24576;
                        } else if ((i2 & 24576) == 0) {
                            i22 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                            if ((i3 & 32768) == 0) {
                                i22 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i14 = i13;
                                i22 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                                int i23 = i4;
                                if ((i4 & 306783379) != 306783378 && (74899 & i22) == 74898 && startRestartGroup.getSkipping()) {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier;
                                    function27 = function2;
                                    function28 = function22;
                                    function29 = function23;
                                    shape4 = shape;
                                    f3 = f;
                                    f4 = f2;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    z5 = z3;
                                    composer2 = startRestartGroup;
                                    searchBarColors4 = searchBarColors;
                                } else {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier;
                                        boolean z6 = i6 != 0 ? true : z3;
                                        Function2<? super Composer, ? super Integer, Unit> function210 = i7 != 0 ? null : function2;
                                        Function2<? super Composer, ? super Integer, Unit> function211 = i8 != 0 ? null : function22;
                                        Function2<? super Composer, ? super Integer, Unit> function212 = i9 != 0 ? null : function23;
                                        if ((i3 & 1024) != 0) {
                                            i22 &= -15;
                                            shape2 = SearchBarDefaults.INSTANCE.getDockedShape(startRestartGroup, 6);
                                        } else {
                                            shape2 = shape;
                                        }
                                        int i24 = i22;
                                        if ((i3 & 2048) != 0) {
                                            i15 = i23;
                                            int i25 = i14;
                                            i16 = i12;
                                            i17 = i11;
                                            i18 = i25;
                                            searchBarColors2 = SearchBarDefaults.INSTANCE.m2096colorsdgg9oW8(0L, 0L, startRestartGroup, 384, 3);
                                            i22 = i24 & (-113);
                                        } else {
                                            i15 = i23;
                                            int i26 = i14;
                                            i16 = i12;
                                            i17 = i11;
                                            i18 = i26;
                                            searchBarColors2 = searchBarColors;
                                            i22 = i24;
                                        }
                                        float m2100getTonalElevationD9Ej5fM = i17 != 0 ? SearchBarDefaults.INSTANCE.m2100getTonalElevationD9Ej5fM() : f;
                                        float m2099getShadowElevationD9Ej5fM = i16 != 0 ? SearchBarDefaults.INSTANCE.m2099getShadowElevationD9Ej5fM() : f2;
                                        if (i18 != 0) {
                                            function24 = function212;
                                            searchBarColors3 = searchBarColors2;
                                            f3 = m2100getTonalElevationD9Ej5fM;
                                            f4 = m2099getShadowElevationD9Ej5fM;
                                            modifier2 = modifier4;
                                            z4 = z6;
                                            mutableInteractionSource2 = null;
                                        } else {
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            function24 = function212;
                                            searchBarColors3 = searchBarColors2;
                                            f3 = m2100getTonalElevationD9Ej5fM;
                                            f4 = m2099getShadowElevationD9Ej5fM;
                                            modifier2 = modifier4;
                                            z4 = z6;
                                        }
                                        function25 = function210;
                                        function26 = function211;
                                        shape3 = shape2;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 1024) != 0) {
                                            i22 &= -15;
                                        }
                                        if ((i3 & 2048) != 0) {
                                            i22 &= -113;
                                        }
                                        modifier2 = modifier;
                                        function25 = function2;
                                        function26 = function22;
                                        function24 = function23;
                                        shape3 = shape;
                                        searchBarColors3 = searchBarColors;
                                        f3 = f;
                                        f4 = f2;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        i15 = i23;
                                        z4 = z3;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        i19 = i15;
                                        ComposerKt.traceEventStart(1299054533, i19, i22, "androidx.compose.material3.DockedSearchBar (SearchBar.android.kt:825)");
                                    } else {
                                        i19 = i15;
                                    }
                                    final SearchBarColors searchBarColors5 = searchBarColors3;
                                    final boolean z7 = z4;
                                    final Function2<? super Composer, ? super Integer, Unit> function213 = function25;
                                    final Function2<? super Composer, ? super Integer, Unit> function214 = function26;
                                    final Function2<? super Composer, ? super Integer, Unit> function215 = function24;
                                    final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                                    int i27 = i19 >> 6;
                                    int i28 = i22 << 12;
                                    composer2 = startRestartGroup;
                                    m2103DockedSearchBarEQC0FA8(ComposableLambdaKt.rememberComposableLambda(-303118761, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$4
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

                                        public final void invoke(Composer composer3, int i29) {
                                            ComposerKt.sourceInformation(composer3, "C827@37597L549:SearchBar.android.kt#uh7d8r");
                                            if ((i29 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-303118761, i29, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:827)");
                                                }
                                                SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z7, function213, function214, function215, SearchBarColors.this.getInputFieldColors(), mutableInteractionSource3, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, startRestartGroup, 54), z, function13, modifier2, shape3, searchBarColors3, f3, f4, function3, startRestartGroup, (i27 & 7168) | (i27 & 112) | 6 | (i27 & 896) | (57344 & i28) | (458752 & i28) | (3670016 & i28) | (i28 & 29360128) | ((i22 << 9) & 234881024), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier2;
                                    z5 = z4;
                                    function27 = function25;
                                    function28 = function26;
                                    function29 = function24;
                                    shape4 = shape3;
                                    searchBarColors4 = searchBarColors3;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final float f5 = f3;
                                    final float f6 = f4;
                                    final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$5
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

                                        public final void invoke(Composer composer3, int i29) {
                                            SearchBar_androidKt.m2104DockedSearchBareWTbjVg(str, function1, function12, z, function13, modifier3, z5, function27, function28, function29, shape4, searchBarColors4, f5, f6, mutableInteractionSource4, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i14 = i13;
                            int i232 = i4;
                            if ((i4 & 306783379) != 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
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
                            if ((i3 & 1024) != 0) {
                            }
                            int i242 = i22;
                            if ((i3 & 2048) != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            function25 = function210;
                            function26 = function211;
                            shape3 = shape2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final SearchBarColors searchBarColors52 = searchBarColors3;
                            final boolean z72 = z4;
                            final Function2<? super Composer, ? super Integer, Unit> function2132 = function25;
                            final Function2<? super Composer, ? super Integer, Unit> function2142 = function26;
                            final Function2<? super Composer, ? super Integer, Unit> function2152 = function24;
                            final MutableInteractionSource mutableInteractionSource32 = mutableInteractionSource2;
                            int i272 = i19 >> 6;
                            int i282 = i22 << 12;
                            composer2 = startRestartGroup;
                            m2103DockedSearchBarEQC0FA8(ComposableLambdaKt.rememberComposableLambda(-303118761, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$4
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

                                public final void invoke(Composer composer3, int i29) {
                                    ComposerKt.sourceInformation(composer3, "C827@37597L549:SearchBar.android.kt#uh7d8r");
                                    if ((i29 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-303118761, i29, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:827)");
                                        }
                                        SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z72, function2132, function2142, function2152, SearchBarColors.this.getInputFieldColors(), mutableInteractionSource32, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, startRestartGroup, 54), z, function13, modifier2, shape3, searchBarColors3, f3, f4, function3, startRestartGroup, (i272 & 7168) | (i272 & 112) | 6 | (i272 & 896) | (57344 & i282) | (458752 & i282) | (3670016 & i282) | (i282 & 29360128) | ((i22 << 9) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier2;
                            z5 = z4;
                            function27 = function25;
                            function28 = function26;
                            function29 = function24;
                            shape4 = shape3;
                            searchBarColors4 = searchBarColors3;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        if ((i3 & 32768) == 0) {
                        }
                        i14 = i13;
                        int i2322 = i4;
                        if ((i4 & 306783379) != 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
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
                        if ((i3 & 1024) != 0) {
                        }
                        int i2422 = i22;
                        if ((i3 & 2048) != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        function25 = function210;
                        function26 = function211;
                        shape3 = shape2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final SearchBarColors searchBarColors522 = searchBarColors3;
                        final boolean z722 = z4;
                        final Function2<? super Composer, ? super Integer, Unit> function21322 = function25;
                        final Function2<? super Composer, ? super Integer, Unit> function21422 = function26;
                        final Function2<? super Composer, ? super Integer, Unit> function21522 = function24;
                        final MutableInteractionSource mutableInteractionSource322 = mutableInteractionSource2;
                        int i2722 = i19 >> 6;
                        int i2822 = i22 << 12;
                        composer2 = startRestartGroup;
                        m2103DockedSearchBarEQC0FA8(ComposableLambdaKt.rememberComposableLambda(-303118761, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$4
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

                            public final void invoke(Composer composer3, int i29) {
                                ComposerKt.sourceInformation(composer3, "C827@37597L549:SearchBar.android.kt#uh7d8r");
                                if ((i29 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-303118761, i29, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:827)");
                                    }
                                    SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z722, function21322, function21422, function21522, SearchBarColors.this.getInputFieldColors(), mutableInteractionSource322, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), z, function13, modifier2, shape3, searchBarColors3, f3, f4, function3, startRestartGroup, (i2722 & 7168) | (i2722 & 112) | 6 | (i2722 & 896) | (57344 & i2822) | (458752 & i2822) | (3670016 & i2822) | (i2822 & 29360128) | ((i22 << 9) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier2;
                        z5 = z4;
                        function27 = function25;
                        function28 = function26;
                        function29 = function24;
                        shape4 = shape3;
                        searchBarColors4 = searchBarColors3;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i13 = i3 & 16384;
                    if (i13 != 0) {
                    }
                    if ((i3 & 32768) == 0) {
                    }
                    i14 = i13;
                    int i23222 = i4;
                    if ((i4 & 306783379) != 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
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
                    if ((i3 & 1024) != 0) {
                    }
                    int i24222 = i22;
                    if ((i3 & 2048) != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    function25 = function210;
                    function26 = function211;
                    shape3 = shape2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final SearchBarColors searchBarColors5222 = searchBarColors3;
                    final boolean z7222 = z4;
                    final Function2<? super Composer, ? super Integer, Unit> function213222 = function25;
                    final Function2<? super Composer, ? super Integer, Unit> function214222 = function26;
                    final Function2<? super Composer, ? super Integer, Unit> function215222 = function24;
                    final MutableInteractionSource mutableInteractionSource3222 = mutableInteractionSource2;
                    int i27222 = i19 >> 6;
                    int i28222 = i22 << 12;
                    composer2 = startRestartGroup;
                    m2103DockedSearchBarEQC0FA8(ComposableLambdaKt.rememberComposableLambda(-303118761, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$4
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

                        public final void invoke(Composer composer3, int i29) {
                            ComposerKt.sourceInformation(composer3, "C827@37597L549:SearchBar.android.kt#uh7d8r");
                            if ((i29 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-303118761, i29, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:827)");
                                }
                                SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z7222, function213222, function214222, function215222, SearchBarColors.this.getInputFieldColors(), mutableInteractionSource3222, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), z, function13, modifier2, shape3, searchBarColors3, f3, f4, function3, startRestartGroup, (i27222 & 7168) | (i27222 & 112) | 6 | (i27222 & 896) | (57344 & i28222) | (458752 & i28222) | (3670016 & i28222) | (i28222 & 29360128) | ((i22 << 9) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    z5 = z4;
                    function27 = function25;
                    function28 = function26;
                    function29 = function24;
                    shape4 = shape3;
                    searchBarColors4 = searchBarColors3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i12 = i3 & 8192;
                if (i12 == 0) {
                }
                i13 = i3 & 16384;
                if (i13 != 0) {
                }
                if ((i3 & 32768) == 0) {
                }
                i14 = i13;
                int i232222 = i4;
                if ((i4 & 306783379) != 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
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
                if ((i3 & 1024) != 0) {
                }
                int i242222 = i22;
                if ((i3 & 2048) != 0) {
                }
                if (i17 != 0) {
                }
                if (i16 != 0) {
                }
                if (i18 != 0) {
                }
                function25 = function210;
                function26 = function211;
                shape3 = shape2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SearchBarColors searchBarColors52222 = searchBarColors3;
                final boolean z72222 = z4;
                final Function2<? super Composer, ? super Integer, Unit> function2132222 = function25;
                final Function2<? super Composer, ? super Integer, Unit> function2142222 = function26;
                final Function2<? super Composer, ? super Integer, Unit> function2152222 = function24;
                final MutableInteractionSource mutableInteractionSource32222 = mutableInteractionSource2;
                int i272222 = i19 >> 6;
                int i282222 = i22 << 12;
                composer2 = startRestartGroup;
                m2103DockedSearchBarEQC0FA8(ComposableLambdaKt.rememberComposableLambda(-303118761, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$4
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

                    public final void invoke(Composer composer3, int i29) {
                        ComposerKt.sourceInformation(composer3, "C827@37597L549:SearchBar.android.kt#uh7d8r");
                        if ((i29 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-303118761, i29, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:827)");
                            }
                            SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z72222, function2132222, function2142222, function2152222, SearchBarColors.this.getInputFieldColors(), mutableInteractionSource32222, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), z, function13, modifier2, shape3, searchBarColors3, f3, f4, function3, startRestartGroup, (i272222 & 7168) | (i272222 & 112) | 6 | (i272222 & 896) | (57344 & i282222) | (458752 & i282222) | (3670016 & i282222) | (i282222 & 29360128) | ((i22 << 9) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                z5 = z4;
                function27 = function25;
                function28 = function26;
                function29 = function24;
                shape4 = shape3;
                searchBarColors4 = searchBarColors3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i3 & 32;
            if (i5 != 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i222 = i10;
            i11 = i3 & 4096;
            if (i11 != 0) {
            }
            i12 = i3 & 8192;
            if (i12 == 0) {
            }
            i13 = i3 & 16384;
            if (i13 != 0) {
            }
            if ((i3 & 32768) == 0) {
            }
            i14 = i13;
            int i2322222 = i4;
            if ((i4 & 306783379) != 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
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
            if ((i3 & 1024) != 0) {
            }
            int i2422222 = i222;
            if ((i3 & 2048) != 0) {
            }
            if (i17 != 0) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            function25 = function210;
            function26 = function211;
            shape3 = shape2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final SearchBarColors searchBarColors522222 = searchBarColors3;
            final boolean z722222 = z4;
            final Function2<? super Composer, ? super Integer, Unit> function21322222 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function21422222 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function21522222 = function24;
            final MutableInteractionSource mutableInteractionSource322222 = mutableInteractionSource2;
            int i2722222 = i19 >> 6;
            int i2822222 = i222 << 12;
            composer2 = startRestartGroup;
            m2103DockedSearchBarEQC0FA8(ComposableLambdaKt.rememberComposableLambda(-303118761, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$4
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

                public final void invoke(Composer composer3, int i29) {
                    ComposerKt.sourceInformation(composer3, "C827@37597L549:SearchBar.android.kt#uh7d8r");
                    if ((i29 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-303118761, i29, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:827)");
                        }
                        SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z722222, function21322222, function21422222, function21522222, SearchBarColors.this.getInputFieldColors(), mutableInteractionSource322222, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), z, function13, modifier2, shape3, searchBarColors3, f3, f4, function3, startRestartGroup, (i2722222 & 7168) | (i2722222 & 112) | 6 | (i2722222 & 896) | (57344 & i2822222) | (458752 & i2822222) | (3670016 & i2822222) | (i2822222 & 29360128) | ((i222 << 9) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            z5 = z4;
            function27 = function25;
            function28 = function26;
            function29 = function24;
            shape4 = shape3;
            searchBarColors4 = searchBarColors3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 16) == 0) {
        }
        i5 = i3 & 32;
        if (i5 != 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i2222 = i10;
        i11 = i3 & 4096;
        if (i11 != 0) {
        }
        i12 = i3 & 8192;
        if (i12 == 0) {
        }
        i13 = i3 & 16384;
        if (i13 != 0) {
        }
        if ((i3 & 32768) == 0) {
        }
        i14 = i13;
        int i23222222 = i4;
        if ((i4 & 306783379) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
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
        if ((i3 & 1024) != 0) {
        }
        int i24222222 = i2222;
        if ((i3 & 2048) != 0) {
        }
        if (i17 != 0) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        function25 = function210;
        function26 = function211;
        shape3 = shape2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final SearchBarColors searchBarColors5222222 = searchBarColors3;
        final boolean z7222222 = z4;
        final Function2<? super Composer, ? super Integer, Unit> function213222222 = function25;
        final Function2<? super Composer, ? super Integer, Unit> function214222222 = function26;
        final Function2<? super Composer, ? super Integer, Unit> function215222222 = function24;
        final MutableInteractionSource mutableInteractionSource3222222 = mutableInteractionSource2;
        int i27222222 = i19 >> 6;
        int i28222222 = i2222 << 12;
        composer2 = startRestartGroup;
        m2103DockedSearchBarEQC0FA8(ComposableLambdaKt.rememberComposableLambda(-303118761, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$4
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

            public final void invoke(Composer composer3, int i29) {
                ComposerKt.sourceInformation(composer3, "C827@37597L549:SearchBar.android.kt#uh7d8r");
                if ((i29 & 3) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-303118761, i29, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:827)");
                    }
                    SearchBarDefaults.INSTANCE.InputField(str, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z7222222, function213222222, function214222222, function215222222, SearchBarColors.this.getInputFieldColors(), mutableInteractionSource3222222, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), z, function13, modifier2, shape3, searchBarColors3, f3, f4, function3, startRestartGroup, (i27222222 & 7168) | (i27222222 & 112) | 6 | (i27222222 & 896) | (57344 & i28222222) | (458752 & i28222222) | (3670016 & i28222222) | (i28222222 & 29360128) | ((i2222 << 9) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        z5 = z4;
        function27 = function25;
        function28 = function26;
        function29 = function24;
        shape4 = shape3;
        searchBarColors4 = searchBarColors3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x033a  */
    /* renamed from: SearchBarImpl-j1jLAyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2107SearchBarImplj1jLAyQ(final Animatable<Float, AnimationVector1D> animatable, final MutableFloatState mutableFloatState, final MutableState<BackEventCompat> mutableState, final MutableState<BackEventCompat> mutableState2, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i5;
        int i6;
        int i7;
        int i8;
        float f3;
        WindowInsets windowInsets2;
        int i9;
        Modifier modifier3;
        int i10;
        int i11;
        SearchBarColors searchBarColors3;
        int i12;
        final float m2099getShadowElevationD9Ej5fM;
        WindowInsets windowInsets3;
        final SearchBarColors searchBarColors4;
        final float f4;
        int i13;
        Shape shape3;
        Modifier modifier4;
        Shape inputFieldShape;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        GenericShape genericShape;
        Object rememberedValue3;
        final float f5;
        final float f6;
        final SearchBarColors searchBarColors5;
        final Modifier modifier5;
        final Shape shape4;
        ScopeUpdateScope endRestartGroup;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-440333505);
        ComposerKt.sourceInformation(startRestartGroup, "C(SearchBarImpl)P(!1,4,5,3,7,6,9!1,10:c#ui.unit.Dp,8:c#ui.unit.Dp,11)861@38824L15,862@38889L8,865@39070L12,868@39168L7,870@39228L15,871@39295L15,872@39341L101,876@39475L666,892@40180L333,903@40538L99,916@40970L362:SearchBar.android.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? startRestartGroup.changed(animatable) : startRestartGroup.changedInstance(animatable) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(mutableFloatState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(mutableState) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(mutableState2) ? 2048 : 1024;
        }
        int i16 = i3 & 16;
        if (i16 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if ((i3 & 32) == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
            }
            if ((i & 1572864) != 0) {
                shape2 = shape;
                i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape2)) ? 1048576 : 524288;
            } else {
                shape2 = shape;
            }
            if ((i & 12582912) != 0) {
                if ((i3 & 128) == 0) {
                    searchBarColors2 = searchBarColors;
                    if (startRestartGroup.changed(searchBarColors2)) {
                        i15 = 8388608;
                        i4 |= i15;
                    }
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i15 = 4194304;
                i4 |= i15;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i5 = i3 & 256;
            if (i5 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i6 = i5;
                i4 |= startRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                i7 = i3 & 512;
                if (i7 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i8 = i7;
                    f3 = f2;
                    i4 |= startRestartGroup.changed(f3) ? 536870912 : 268435456;
                    if ((i2 & 6) != 0) {
                        if ((i3 & 1024) == 0) {
                            windowInsets2 = windowInsets;
                            if (startRestartGroup.changed(windowInsets2)) {
                                i14 = 4;
                                i9 = i2 | i14;
                            }
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i14 = 2;
                        i9 = i2 | i14;
                    } else {
                        windowInsets2 = windowInsets;
                        i9 = i2;
                    }
                    if ((i3 & 2048) == 0) {
                        i9 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i9 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
                    }
                    if ((306783379 & i4) == 306783378 || (i9 & 19) != 18 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i16 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 64) != 0) {
                                shape2 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                                i4 &= -3670017;
                            }
                            int i17 = i4;
                            Shape shape5 = shape2;
                            if ((i3 & 128) == 0) {
                                modifier3 = companion;
                                i10 = i6;
                                i11 = i8;
                                searchBarColors3 = SearchBarDefaults.INSTANCE.m2096colorsdgg9oW8(0L, 0L, startRestartGroup, 384, 3);
                                i12 = i17 & (-29360129);
                            } else {
                                modifier3 = companion;
                                i10 = i6;
                                i11 = i8;
                                searchBarColors3 = searchBarColors2;
                                i12 = i17;
                            }
                            float m2100getTonalElevationD9Ej5fM = i10 == 0 ? SearchBarDefaults.INSTANCE.m2100getTonalElevationD9Ej5fM() : f;
                            m2099getShadowElevationD9Ej5fM = i11 == 0 ? SearchBarDefaults.INSTANCE.m2099getShadowElevationD9Ej5fM() : f2;
                            if ((i3 & 1024) == 0) {
                                searchBarColors4 = searchBarColors3;
                                i4 = i12;
                                windowInsets3 = SearchBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                i13 = i9 & (-15);
                                shape3 = shape5;
                                modifier4 = modifier3;
                                f4 = m2100getTonalElevationD9Ej5fM;
                            } else {
                                windowInsets3 = windowInsets;
                                searchBarColors4 = searchBarColors3;
                                i4 = i12;
                                f4 = m2100getTonalElevationD9Ej5fM;
                                i13 = i9;
                                shape3 = shape5;
                                modifier4 = modifier3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 1024) != 0) {
                                i9 &= -15;
                            }
                            windowInsets3 = windowInsets2;
                            m2099getShadowElevationD9Ej5fM = f3;
                            f4 = f;
                            shape3 = shape2;
                            i13 = i9;
                            modifier4 = modifier2;
                            searchBarColors4 = searchBarColors2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-440333505, i4, i13, "androidx.compose.material3.SearchBarImpl (SearchBar.android.kt:867)");
                        }
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Density density = (Density) consume;
                        inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                        Shape fullScreenShape = SearchBarDefaults.INSTANCE.getFullScreenShape(startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1567245043, "CC(remember):SearchBar.android.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$useFullScreenShape$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    return Boolean.valueOf(animatable.getValue().floatValue() == 1.0f);
                                }
                            });
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        State state = (State) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        boolean SearchBarImpl_j1jLAyQ$lambda$9 = SearchBarImpl_j1jLAyQ$lambda$9(state);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1567240190, "CC(remember):SearchBar.android.kt#9igjgp");
                        changed = startRestartGroup.changed(SearchBarImpl_j1jLAyQ$lambda$9) | ((((3670016 & i4) ^ 1572864) <= 1048576 && startRestartGroup.changed(shape3)) || (i4 & 1572864) == 1048576);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            if (!Intrinsics.areEqual(shape3, inputFieldShape)) {
                                genericShape = new GenericShape(new Function3<Path, Size, LayoutDirection, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$animatedShape$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Path path, Size size, LayoutDirection layoutDirection) {
                                        m2112invoke12SF9DM(path, size.getPackedValue(), layoutDirection);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-12SF9DM, reason: not valid java name */
                                    public final void m2112invoke12SF9DM(Path path, long j, LayoutDirection layoutDirection) {
                                        float f7;
                                        Density density2 = Density.this;
                                        Animatable<Float, AnimationVector1D> animatable2 = animatable;
                                        f7 = SearchBar_androidKt.SearchBarCornerRadius;
                                        Path.addRoundRect$default(path, RoundRectKt.m3654RoundRectsniSvfs(androidx.compose.ui.geometry.SizeKt.m3689toRectuvyYCjk(j), CornerRadiusKt.CornerRadius$default(density2.mo373toPx0680j_4(Dp.m6299constructorimpl(f7 * (1 - animatable2.getValue().floatValue()))), 0.0f, 2, null)), null, 2, null);
                                    }
                                });
                            } else {
                                genericShape = SearchBarImpl_j1jLAyQ$lambda$9(state) ? fullScreenShape : shape3;
                            }
                            startRestartGroup.updateRememberedValue(genericShape);
                            rememberedValue2 = genericShape;
                        }
                        final Shape shape6 = (Shape) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-170534294, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$surface$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i18) {
                                ComposerKt.sourceInformation(composer2, "C896@40320L38,893@40194L309:SearchBar.android.kt#uh7d8r");
                                if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-170534294, i18, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.android.kt:893)");
                                    }
                                    SurfaceKt.m2223SurfaceT9BRK9s(null, Shape.this, searchBarColors4.m2092getContainerColor0d7_KjU(), ColorSchemeKt.m1609contentColorForek8zF_U(searchBarColors4.m2092getContainerColor0d7_KjU(), composer2, 0), f4, m2099getShadowElevationD9Ej5fM, null, ComposableSingletons$SearchBar_androidKt.INSTANCE.m1658getLambda2$material3_release(), composer2, 12582912, 65);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1567206741, "CC(remember):SearchBar.android.kt#9igjgp");
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$showContent$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    return Boolean.valueOf(animatable.getValue().floatValue() > 0.0f);
                                }
                            });
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.startReplaceGroup(-1567201454);
                        ComposerKt.sourceInformation(startRestartGroup, "908@40729L215");
                        ComposableLambda rememberComposableLambda2 = !SearchBarImpl_j1jLAyQ$lambda$12((State) rememberedValue3) ? ComposableLambdaKt.rememberComposableLambda(147843820, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$wrappedContent$1
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

                            public final void invoke(Composer composer2, int i18) {
                                ComposerKt.sourceInformation(composer2, "C909@40777L35,909@40747L183:SearchBar.android.kt#uh7d8r");
                                if ((i18 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(147843820, i18, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.android.kt:909)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, -502962614, "CC(remember):SearchBar.android.kt#9igjgp");
                                boolean changedInstance = composer2.changedInstance(animatable);
                                final Animatable<Float, AnimationVector1D> animatable2 = animatable;
                                Object rememberedValue4 = composer2.rememberedValue();
                                if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$wrappedContent$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                            invoke2(graphicsLayerScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                            graphicsLayerScope.setAlpha(animatable2.getValue().floatValue());
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue4);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) rememberedValue4);
                                SearchBarColors searchBarColors6 = searchBarColors4;
                                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, graphicsLayer);
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
                                Updater.m3340setimpl(m3333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, 1608207601, "C910@40836L46,911@40903L9:SearchBar.android.kt#uh7d8r");
                                DividerKt.m1752HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors6.m2093getDividerColor0d7_KjU(), composer2, 0, 3);
                                function32.invoke(columnScopeInstance, composer2, 6);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54) : null;
                        startRestartGroup.endReplaceGroup();
                        float f7 = m2099getShadowElevationD9Ej5fM;
                        float f8 = f4;
                        SearchBarColors searchBarColors6 = searchBarColors4;
                        Shape shape7 = shape3;
                        SearchBarLayout(animatable, mutableFloatState, mutableState, mutableState2, modifier4, windowInsets3, function2, rememberComposableLambda, rememberComposableLambda2, startRestartGroup, Animatable.$stable | 12582912 | (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | ((i13 << 15) & 458752) | ((i4 << 3) & 3670016));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f5 = f7;
                        f6 = f8;
                        searchBarColors5 = searchBarColors6;
                        modifier5 = modifier4;
                        shape4 = shape7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        f6 = f;
                        windowInsets3 = windowInsets2;
                        modifier5 = modifier2;
                        f5 = f3;
                        shape4 = shape2;
                        searchBarColors5 = searchBarColors2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final WindowInsets windowInsets4 = windowInsets3;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$1
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

                            public final void invoke(Composer composer2, int i18) {
                                SearchBar_androidKt.m2107SearchBarImplj1jLAyQ(animatable, mutableFloatState, mutableState, mutableState2, modifier5, function2, shape4, searchBarColors5, f6, f5, windowInsets4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i7;
                f3 = f2;
                if ((i2 & 6) != 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                if ((306783379 & i4) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i16 == 0) {
                }
                if ((i3 & 64) != 0) {
                }
                int i172 = i4;
                Shape shape52 = shape2;
                if ((i3 & 128) == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Density density2 = (Density) consume2;
                inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                Shape fullScreenShape2 = SearchBarDefaults.INSTANCE.getFullScreenShape(startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1567245043, "CC(remember):SearchBar.android.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                State state2 = (State) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                boolean SearchBarImpl_j1jLAyQ$lambda$92 = SearchBarImpl_j1jLAyQ$lambda$9(state2);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1567240190, "CC(remember):SearchBar.android.kt#9igjgp");
                changed = startRestartGroup.changed(SearchBarImpl_j1jLAyQ$lambda$92) | ((((3670016 & i4) ^ 1572864) <= 1048576 && startRestartGroup.changed(shape3)) || (i4 & 1572864) == 1048576);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                if (!Intrinsics.areEqual(shape3, inputFieldShape)) {
                }
                startRestartGroup.updateRememberedValue(genericShape);
                rememberedValue2 = genericShape;
                final Shape shape62 = (Shape) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-170534294, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$surface$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i18) {
                        ComposerKt.sourceInformation(composer2, "C896@40320L38,893@40194L309:SearchBar.android.kt#uh7d8r");
                        if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-170534294, i18, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.android.kt:893)");
                            }
                            SurfaceKt.m2223SurfaceT9BRK9s(null, Shape.this, searchBarColors4.m2092getContainerColor0d7_KjU(), ColorSchemeKt.m1609contentColorForek8zF_U(searchBarColors4.m2092getContainerColor0d7_KjU(), composer2, 0), f4, m2099getShadowElevationD9Ej5fM, null, ComposableSingletons$SearchBar_androidKt.INSTANCE.m1658getLambda2$material3_release(), composer2, 12582912, 65);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1567206741, "CC(remember):SearchBar.android.kt#9igjgp");
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(-1567201454);
                ComposerKt.sourceInformation(startRestartGroup, "908@40729L215");
                if (!SearchBarImpl_j1jLAyQ$lambda$12((State) rememberedValue3)) {
                }
                startRestartGroup.endReplaceGroup();
                float f72 = m2099getShadowElevationD9Ej5fM;
                float f82 = f4;
                SearchBarColors searchBarColors62 = searchBarColors4;
                Shape shape72 = shape3;
                SearchBarLayout(animatable, mutableFloatState, mutableState, mutableState2, modifier4, windowInsets3, function2, rememberComposableLambda3, rememberComposableLambda2, startRestartGroup, Animatable.$stable | 12582912 | (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | ((i13 << 15) & 458752) | ((i4 << 3) & 3670016));
                if (ComposerKt.isTraceInProgress()) {
                }
                f5 = f72;
                f6 = f82;
                searchBarColors5 = searchBarColors62;
                modifier5 = modifier4;
                shape4 = shape72;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i5;
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            i8 = i7;
            f3 = f2;
            if ((i2 & 6) != 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            if ((306783379 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i16 == 0) {
            }
            if ((i3 & 64) != 0) {
            }
            int i1722 = i4;
            Shape shape522 = shape2;
            if ((i3 & 128) == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localDensity22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density22 = (Density) consume22;
            inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
            Shape fullScreenShape22 = SearchBarDefaults.INSTANCE.getFullScreenShape(startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1567245043, "CC(remember):SearchBar.android.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            State state22 = (State) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean SearchBarImpl_j1jLAyQ$lambda$922 = SearchBarImpl_j1jLAyQ$lambda$9(state22);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1567240190, "CC(remember):SearchBar.android.kt#9igjgp");
            changed = startRestartGroup.changed(SearchBarImpl_j1jLAyQ$lambda$922) | ((((3670016 & i4) ^ 1572864) <= 1048576 && startRestartGroup.changed(shape3)) || (i4 & 1572864) == 1048576);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            if (!Intrinsics.areEqual(shape3, inputFieldShape)) {
            }
            startRestartGroup.updateRememberedValue(genericShape);
            rememberedValue2 = genericShape;
            final Shape shape622 = (Shape) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposableLambda rememberComposableLambda32 = ComposableLambdaKt.rememberComposableLambda(-170534294, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$surface$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i18) {
                    ComposerKt.sourceInformation(composer2, "C896@40320L38,893@40194L309:SearchBar.android.kt#uh7d8r");
                    if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-170534294, i18, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.android.kt:893)");
                        }
                        SurfaceKt.m2223SurfaceT9BRK9s(null, Shape.this, searchBarColors4.m2092getContainerColor0d7_KjU(), ColorSchemeKt.m1609contentColorForek8zF_U(searchBarColors4.m2092getContainerColor0d7_KjU(), composer2, 0), f4, m2099getShadowElevationD9Ej5fM, null, ComposableSingletons$SearchBar_androidKt.INSTANCE.m1658getLambda2$material3_release(), composer2, 12582912, 65);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1567206741, "CC(remember):SearchBar.android.kt#9igjgp");
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(-1567201454);
            ComposerKt.sourceInformation(startRestartGroup, "908@40729L215");
            if (!SearchBarImpl_j1jLAyQ$lambda$12((State) rememberedValue3)) {
            }
            startRestartGroup.endReplaceGroup();
            float f722 = m2099getShadowElevationD9Ej5fM;
            float f822 = f4;
            SearchBarColors searchBarColors622 = searchBarColors4;
            Shape shape722 = shape3;
            SearchBarLayout(animatable, mutableFloatState, mutableState, mutableState2, modifier4, windowInsets3, function2, rememberComposableLambda32, rememberComposableLambda2, startRestartGroup, Animatable.$stable | 12582912 | (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | ((i13 << 15) & 458752) | ((i4 << 3) & 3670016));
            if (ComposerKt.isTraceInProgress()) {
            }
            f5 = f722;
            f6 = f822;
            searchBarColors5 = searchBarColors622;
            modifier5 = modifier4;
            shape4 = shape722;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & 32) == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i5 = i3 & 256;
        if (i5 == 0) {
        }
        i6 = i5;
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        f3 = f2;
        if ((i2 & 6) != 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i16 == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        int i17222 = i4;
        Shape shape5222 = shape2;
        if ((i3 & 128) == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localDensity222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density222 = (Density) consume222;
        inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
        Shape fullScreenShape222 = SearchBarDefaults.INSTANCE.getFullScreenShape(startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1567245043, "CC(remember):SearchBar.android.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        State state222 = (State) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        boolean SearchBarImpl_j1jLAyQ$lambda$9222 = SearchBarImpl_j1jLAyQ$lambda$9(state222);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1567240190, "CC(remember):SearchBar.android.kt#9igjgp");
        changed = startRestartGroup.changed(SearchBarImpl_j1jLAyQ$lambda$9222) | ((((3670016 & i4) ^ 1572864) <= 1048576 && startRestartGroup.changed(shape3)) || (i4 & 1572864) == 1048576);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        if (!Intrinsics.areEqual(shape3, inputFieldShape)) {
        }
        startRestartGroup.updateRememberedValue(genericShape);
        rememberedValue2 = genericShape;
        final Shape shape6222 = (Shape) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposableLambda rememberComposableLambda322 = ComposableLambdaKt.rememberComposableLambda(-170534294, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$surface$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i18) {
                ComposerKt.sourceInformation(composer2, "C896@40320L38,893@40194L309:SearchBar.android.kt#uh7d8r");
                if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-170534294, i18, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.android.kt:893)");
                    }
                    SurfaceKt.m2223SurfaceT9BRK9s(null, Shape.this, searchBarColors4.m2092getContainerColor0d7_KjU(), ColorSchemeKt.m1609contentColorForek8zF_U(searchBarColors4.m2092getContainerColor0d7_KjU(), composer2, 0), f4, m2099getShadowElevationD9Ej5fM, null, ComposableSingletons$SearchBar_androidKt.INSTANCE.m1658getLambda2$material3_release(), composer2, 12582912, 65);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1567206741, "CC(remember):SearchBar.android.kt#9igjgp");
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(-1567201454);
        ComposerKt.sourceInformation(startRestartGroup, "908@40729L215");
        if (!SearchBarImpl_j1jLAyQ$lambda$12((State) rememberedValue3)) {
        }
        startRestartGroup.endReplaceGroup();
        float f7222 = m2099getShadowElevationD9Ej5fM;
        float f8222 = f4;
        SearchBarColors searchBarColors6222 = searchBarColors4;
        Shape shape7222 = shape3;
        SearchBarLayout(animatable, mutableFloatState, mutableState, mutableState2, modifier4, windowInsets3, function2, rememberComposableLambda322, rememberComposableLambda2, startRestartGroup, Animatable.$stable | 12582912 | (i4 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | ((i13 << 15) & 458752) | ((i4 << 3) & 3670016));
        if (ComposerKt.isTraceInProgress()) {
        }
        f5 = f7222;
        f6 = f8222;
        searchBarColors5 = searchBarColors6222;
        modifier5 = modifier4;
        shape4 = shape7222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SearchBarLayout(final Animatable<Float, AnimationVector1D> animatable, final MutableFloatState mutableFloatState, final MutableState<BackEventCompat> mutableState, final MutableState<BackEventCompat> mutableState2, final Modifier modifier, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i) {
        int i2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(70029564);
        ComposerKt.sourceInformation(startRestartGroup, "C(SearchBarLayout)P(!1,3,4,2,6,8,5,7)945@42029L34,950@42191L120,965@42827L5009,946@42068L5768:SearchBar.android.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(animatable) : startRestartGroup.changedInstance(animatable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(mutableFloatState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(mutableState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(mutableState2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i4 = i2;
        if ((38347923 & i4) != 38347922 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70029564, i4, -1, "androidx.compose.material3.SearchBarLayout (SearchBar.android.kt:941)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -660147884, "CC(remember):SearchBar.android.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MutableWindowInsets(null, 1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier zIndex = ZIndexModifierKt.zIndex(modifier, 1.0f);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -660142614, "CC(remember):SearchBar.android.kt#9igjgp");
            boolean z = (458752 & i4) == 131072;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets2) {
                        invoke2(windowInsets2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(WindowInsets windowInsets2) {
                        MutableWindowInsets.this.setInsets(WindowInsetsKt.exclude(windowInsets, windowInsets2));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier consumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(zIndex, (Function1) rememberedValue2), windowInsets);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -660117373, "CC(remember):SearchBar.android.kt#9igjgp");
            boolean z2 = ((i4 & 14) == 4 || ((i4 & 8) != 0 && startRestartGroup.changedInstance(animatable))) | ((i4 & 7168) == 2048) | ((i4 & 112) == 32) | ((i4 & 896) == 256);
            MeasurePolicy rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                i3 = i4;
                rememberedValue3 = new MeasurePolicy() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo38measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, final long j) {
                        Measurable measurable;
                        final float calculatePredictiveBackMultiplier;
                        Placeable placeable;
                        int i5;
                        int m6251getMaxHeightimpl;
                        MeasureScope measureScope2 = measureScope;
                        long j2 = j;
                        final float floatValue = animatable.getValue().floatValue();
                        int size = list.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Measurable measurable2 = list.get(i6);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "InputField")) {
                                int size2 = list.size();
                                int i7 = 0;
                                while (i7 < size2) {
                                    Measurable measurable3 = list.get(i7);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "Surface")) {
                                        int size3 = list.size();
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 >= size3) {
                                                measurable = null;
                                                break;
                                            }
                                            measurable = list.get(i8);
                                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Content")) {
                                                break;
                                            }
                                            i8++;
                                        }
                                        Measurable measurable4 = measurable;
                                        final int top = mutableWindowInsets.getTop(measureScope2) + measureScope2.mo367roundToPx0680j_4(SearchBar_androidKt.getSearchBarVerticalPadding());
                                        int i9 = measureScope2.mo367roundToPx0680j_4(SearchBar_androidKt.getSearchBarVerticalPadding());
                                        int m6269constrainWidthK40F9xA = ConstraintsKt.m6269constrainWidthK40F9xA(j2, measurable2.maxIntrinsicWidth(Constraints.m6251getMaxHeightimpl(j)));
                                        int m6268constrainHeightK40F9xA = ConstraintsKt.m6268constrainHeightK40F9xA(j2, measurable2.minIntrinsicHeight(Constraints.m6252getMaxWidthimpl(j)));
                                        int roundToInt = MathKt.roundToInt(Constraints.m6252getMaxWidthimpl(j) * 0.9f);
                                        int roundToInt2 = MathKt.roundToInt(Constraints.m6251getMaxHeightimpl(j) * 0.9f);
                                        calculatePredictiveBackMultiplier = SearchBar_androidKt.calculatePredictiveBackMultiplier(mutableState2.getValue(), floatValue, mutableFloatState.getFloatValue());
                                        int lerp = MathHelpersKt.lerp(m6269constrainWidthK40F9xA, roundToInt, calculatePredictiveBackMultiplier);
                                        int i10 = top + m6268constrainHeightK40F9xA;
                                        int lerp2 = MathHelpersKt.lerp(i10, roundToInt2, calculatePredictiveBackMultiplier);
                                        int m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j);
                                        int m6251getMaxHeightimpl2 = Constraints.m6251getMaxHeightimpl(j);
                                        int lerp3 = MathHelpersKt.lerp(lerp, m6252getMaxWidthimpl, floatValue);
                                        final int lerp4 = MathHelpersKt.lerp(lerp2, m6251getMaxHeightimpl2, floatValue);
                                        final int lerp5 = MathHelpersKt.lerp(top, 0, floatValue);
                                        final int lerp6 = MathHelpersKt.lerp(0, i9, floatValue);
                                        final Placeable mo5175measureBRTryo0 = measurable2.mo5175measureBRTryo0(ConstraintsKt.Constraints(lerp3, m6252getMaxWidthimpl, m6268constrainHeightK40F9xA, m6268constrainHeightK40F9xA));
                                        int width = mo5175measureBRTryo0.getWidth();
                                        final Placeable mo5175measureBRTryo02 = measurable3.mo5175measureBRTryo0(Constraints.INSTANCE.m6262fixedJhjzzOo(width, lerp4 - lerp5));
                                        if (measurable4 != null) {
                                            if (Constraints.m6247getHasBoundedHeightimpl(j)) {
                                                i5 = 0;
                                                m6251getMaxHeightimpl = RangesKt.coerceAtLeast(Constraints.m6251getMaxHeightimpl(j) - (i10 + i9), 0);
                                            } else {
                                                i5 = 0;
                                                m6251getMaxHeightimpl = Constraints.m6251getMaxHeightimpl(j);
                                            }
                                            placeable = measurable4.mo5175measureBRTryo0(ConstraintsKt.Constraints(width, width, i5, m6251getMaxHeightimpl));
                                        } else {
                                            placeable = null;
                                        }
                                        final MutableState<BackEventCompat> mutableState3 = mutableState2;
                                        final MutableState<BackEventCompat> mutableState4 = mutableState;
                                        final Placeable placeable2 = placeable;
                                        return MeasureScope.layout$default(measureScope, width, lerp4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1.1
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
                                                float f;
                                                int m2110calculatePredictiveBackOffsetXrOvwMX4;
                                                float f2;
                                                int m2111calculatePredictiveBackOffsetYdzo92Q0;
                                                MeasureScope measureScope3 = MeasureScope.this;
                                                f = SearchBar_androidKt.SearchBarPredictiveBackMinMargin;
                                                int i11 = measureScope3.mo367roundToPx0680j_4(f);
                                                m2110calculatePredictiveBackOffsetXrOvwMX4 = SearchBar_androidKt.m2110calculatePredictiveBackOffsetXrOvwMX4(j, i11, mutableState3.getValue(), MeasureScope.this.getLayoutDirection(), floatValue, calculatePredictiveBackMultiplier);
                                                long j3 = j;
                                                BackEventCompat value = mutableState3.getValue();
                                                BackEventCompat value2 = mutableState4.getValue();
                                                int i12 = lerp4;
                                                MeasureScope measureScope4 = MeasureScope.this;
                                                f2 = SearchBar_androidKt.SearchBarPredictiveBackMaxOffsetY;
                                                m2111calculatePredictiveBackOffsetYdzo92Q0 = SearchBar_androidKt.m2111calculatePredictiveBackOffsetYdzo92Q0(j3, i11, value, value2, i12, measureScope4.mo367roundToPx0680j_4(f2), calculatePredictiveBackMultiplier);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo02, m2110calculatePredictiveBackOffsetXrOvwMX4, m2111calculatePredictiveBackOffsetYdzo92Q0 + lerp5, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo0, m2110calculatePredictiveBackOffsetXrOvwMX4, m2111calculatePredictiveBackOffsetYdzo92Q0 + top, 0.0f, 4, null);
                                                Placeable placeable3 = placeable2;
                                                if (placeable3 != null) {
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, m2110calculatePredictiveBackOffsetXrOvwMX4, m2111calculatePredictiveBackOffsetYdzo92Q0 + top + mo5175measureBRTryo0.getHeight() + lerp6, 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                    i7++;
                                    measureScope2 = measureScope;
                                    j2 = j;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i6++;
                            measureScope2 = measureScope;
                            j2 = j;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                i3 = i4;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, consumeWindowInsets);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 36789781, "C955@42396L85,956@42494L119:SearchBar.android.kt#uh7d8r");
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutIdSurface);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1442016074, "C955@42470L9:SearchBar.android.kt#uh7d8r");
            function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 21) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier layoutId2 = LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutIdInputField);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId2);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1442132231, "C957@42587L12:SearchBar.android.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 18) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(-1107184481);
            ComposerKt.sourceInformation(startRestartGroup, "*960@42668L127");
            if (function23 != null) {
                Modifier layoutId3 = LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutIdSearchContent);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId3);
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
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1302856683, "C961@42768L9:SearchBar.android.kt#uh7d8r");
                function23.invoke(startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceGroup();
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$4
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

                public final void invoke(Composer composer2, int i5) {
                    SearchBar_androidKt.SearchBarLayout(animatable, mutableFloatState, mutableState, mutableState2, modifier, windowInsets, function2, function22, function23, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackMultiplier(BackEventCompat backEventCompat, float f, float f2) {
        if (backEventCompat == null) {
            return 0.0f;
        }
        if (Float.isNaN(f2)) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        return f / f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetX-rOvwMX4, reason: not valid java name */
    public static final int m2110calculatePredictiveBackOffsetXrOvwMX4(long j, int i, BackEventCompat backEventCompat, LayoutDirection layoutDirection, float f, float f2) {
        if (backEventCompat == null || f2 == 0.0f) {
            return 0;
        }
        return MathKt.roundToInt(((Constraints.m6252getMaxWidthimpl(j) * SearchBarPredictiveBackMaxOffsetXRatio) - i) * (1 - f) * f2 * (backEventCompat.getSwipeEdge() == 0 ? 1 : -1) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetY-dzo92Q0, reason: not valid java name */
    public static final int m2111calculatePredictiveBackOffsetYdzo92Q0(long j, int i, BackEventCompat backEventCompat, BackEventCompat backEventCompat2, int i2, int i3, float f) {
        if (backEventCompat2 == null || backEventCompat == null || f == 0.0f) {
            return 0;
        }
        int min = Math.min(Math.max(0, ((Constraints.m6251getMaxHeightimpl(j) - i2) / 2) - i), i3);
        float touchY = backEventCompat.getTouchY() - backEventCompat2.getTouchY();
        float abs = Math.abs(touchY) / Constraints.m6251getMaxHeightimpl(j);
        return MathKt.roundToInt(MathHelpersKt.lerp(0, min, abs) * f * Math.signum(touchY));
    }

    static {
        float f = 8;
        SearchBarVerticalPadding = Dp.m6299constructorimpl(f);
        SearchBarPredictiveBackMinMargin = Dp.m6299constructorimpl(f);
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        AnimationEnterEasing = easingEmphasizedDecelerateCubicBezier;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        AnimationExitEasing = cubicBezierEasing;
        TweenSpec tween = AnimationSpecKt.tween(AnimationEnterDurationMillis, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterFloatSpec = tween;
        TweenSpec tween2 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitFloatSpec = tween2;
        AnimationPredictiveBackExitFloatSpec = AnimationSpecKt.tween$default(AnimationExitDurationMillis, 0, cubicBezierEasing, 2, null);
        TweenSpec tween3 = AnimationSpecKt.tween(AnimationEnterDurationMillis, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterSizeSpec = tween3;
        TweenSpec tween4 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitSizeSpec = tween4;
        DockedEnterTransition = EnterExitTransitionKt.fadeIn$default(tween, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tween3, null, false, null, 14, null));
        DockedExitTransition = EnterExitTransitionKt.fadeOut$default(tween2, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tween4, null, false, null, 14, null));
    }

    public static final float getDockedExpandedTableMinHeight() {
        return DockedExpandedTableMinHeight;
    }

    public static final float getSearchBarMinWidth() {
        return SearchBarMinWidth;
    }

    public static final float getSearchBarVerticalPadding() {
        return SearchBarVerticalPadding;
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$12(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
