package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: NavigationDrawer.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001at\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001al\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aQ\u0010\u001f\u001a\u00020\t2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020#2\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010$\u001at\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001at\u0010*\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001c\u001al\u0010*\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010\u001e\u001a`\u0010-\u001a\u00020\t2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010.\u001a\u00020\u00112\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u008e\u0001\u00101\u001a\u00020\t2\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\u0006\u00103\u001a\u00020#2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\t0!2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010!¢\u0006\u0002\b\u00192\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010!¢\u0006\u0002\b\u00192\b\b\u0002\u00107\u001a\u00020\u000f2\b\b\u0002\u00108\u001a\u0002092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0002\u0010<\u001al\u0010=\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010\u001e\u001a=\u0010?\u001a\u00020\t2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010@\u001a>\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020#2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\t0!2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020!2\u0006\u0010E\u001a\u00020\u0011H\u0003ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a \u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\u00022\u0006\u0010K\u001a\u00020\u0002H\u0002\u001a+\u0010L\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020N2\u0014\b\u0002\u0010O\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020#0\u0017H\u0007¢\u0006\u0002\u0010P\u001a\u0014\u0010Q\u001a\u00020\u0002*\u00020R2\u0006\u0010&\u001a\u00020'H\u0002\u001a\u0014\u0010S\u001a\u00020\u0002*\u00020R2\u0006\u0010&\u001a\u00020'H\u0002\u001a\u001c\u0010T\u001a\u00020\r*\u00020\r2\u0006\u0010&\u001a\u00020'2\u0006\u0010U\u001a\u00020#H\u0002\u001a\u001c\u0010V\u001a\u00020\r*\u00020\r2\u0006\u0010&\u001a\u00020'2\u0006\u0010U\u001a\u00020#H\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0002X\u0082D¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006W²\u0006\n\u0010X\u001a\u00020#X\u008a\u008e\u0002²\u0006\n\u0010Y\u001a\u00020\u0002X\u008a\u008e\u0002²\u0006\n\u0010X\u001a\u00020#X\u008a\u008e\u0002"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "DrawerPositionalThreshold", "DrawerVelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "MinimumDrawerWidth", "DismissibleDrawerSheet", "", "drawerState", "Landroidx/compose/material3/DrawerState;", "modifier", "Landroidx/compose/ui/Modifier;", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerContainerColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerTonalElevation", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DismissibleDrawerSheet-Snr_uVM", "(Landroidx/compose/material3/DrawerState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DismissibleDrawerSheet-afqeVBk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DismissibleNavigationDrawer", "drawerContent", "Lkotlin/Function0;", "gesturesEnabled", "", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DrawerSheet", "drawerPredictiveBackState", "Landroidx/compose/material3/DrawerPredictiveBackState;", "DrawerSheet-7zSek6w", "(Landroidx/compose/material3/DrawerPredictiveBackState;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ModalDrawerSheet", "ModalDrawerSheet-Snr_uVM", "ModalDrawerSheet-afqeVBk", "ModalNavigationDrawer", "scrimColor", "ModalNavigationDrawer-FHprtrg", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "NavigationDrawerItem", "label", "selected", "onClick", "icon", "badge", "shape", "colors", "Landroidx/compose/material3/NavigationDrawerItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/NavigationDrawerItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "PermanentDrawerSheet", "PermanentDrawerSheet-afqeVBk", "PermanentNavigationDrawer", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "open", "onClose", "fraction", "color", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "calculateFraction", "a", "b", "pos", "rememberDrawerState", "initialValue", "Landroidx/compose/material3/DrawerValue;", "confirmStateChange", "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;", "calculatePredictiveBackScaleX", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "calculatePredictiveBackScaleY", "predictiveBackDrawerChild", "isRtl", "predictiveBackDrawerContainer", "material3_release", "anchorsInitialized", "minValue"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationDrawerKt {
    private static final float DrawerPositionalThreshold = 0.5f;
    private static final float DrawerVelocityThreshold = Dp.m6299constructorimpl(400);
    private static final float MinimumDrawerWidth = Dp.m6299constructorimpl(240);
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    public static final DrawerState rememberDrawerState(final DrawerValue drawerValue, final Function1<? super DrawerValue, Boolean> function1, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 2098699222, "C(rememberDrawerState)P(1)286@11488L61,286@11424L125:NavigationDrawer.kt#uh7d8r");
        if ((i2 & 2) != 0) {
            function1 = new Function1<DrawerValue, Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(DrawerValue drawerValue2) {
                    return true;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2098699222, i, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:285)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.INSTANCE.Saver(function1);
        ComposerKt.sourceInformationMarkerStart(composer, -666801427, "CC(remember):NavigationDrawer.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(drawerValue)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(function1)) || (i & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<DrawerState>() { // from class: androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final DrawerState invoke() {
                    return new DrawerState(DrawerValue.this, function1);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m3426rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return drawerState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        if ((r37 & 16) != 0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0376  */
    /* renamed from: ModalNavigationDrawer-FHprtrg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1965ModalNavigationDrawerFHprtrg(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, DrawerState drawerState, boolean z, long j, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DrawerState drawerState2;
        int i4;
        boolean z2;
        long j2;
        long j3;
        final DrawerState drawerState3;
        Object rememberedValue;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        final MutableFloatState mutableFloatState;
        int i5;
        boolean changed2;
        Object rememberedValue4;
        Object consume;
        float f;
        Object obj;
        int i6;
        boolean z3;
        int currentCompositeKeyHash;
        Composer m3333constructorimpl;
        int currentCompositeKeyHash2;
        Composer m3333constructorimpl2;
        boolean changedInstance;
        Object rememberedValue5;
        boolean changed3;
        Object rememberedValue6;
        final float f2;
        boolean z4;
        Object rememberedValue7;
        boolean changed4;
        Object rememberedValue8;
        final MutableFloatState mutableFloatState2;
        boolean z5;
        boolean changed5;
        Object rememberedValue9;
        int currentCompositeKeyHash3;
        Composer m3333constructorimpl3;
        final boolean z6;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1169303680);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalNavigationDrawer)P(1,4,2,3,5:c#ui.graphics.Color)316@12708L39,318@12825L10,321@12893L24,322@12943L33,323@13008L7,324@13046L34,325@13101L45,328@13185L33,328@13174L44,330@13257L7,331@13292L3053:NavigationDrawer.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    drawerState2 = drawerState;
                    if (startRestartGroup.changed(drawerState2)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    drawerState2 = drawerState;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                drawerState2 = drawerState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        if (startRestartGroup.changed(j2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        j2 = j;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    j2 = j;
                }
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
                }
                if ((i3 & 74899) == 74898 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                    } else {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            drawerState2 = rememberDrawerState(DrawerValue.Closed, null, startRestartGroup, 6, 2);
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            j2 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                            i3 &= -57345;
                        }
                        final boolean z7 = z2;
                        j3 = j2;
                        int i10 = i3;
                        drawerState3 = drawerState2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1169303680, i10, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:320)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            rememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Strings.Companion companion = Strings.INSTANCE;
                        final String m2655getString2EP1pXo = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Density density = (Density) consume2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2145781231, "CC(remember):NavigationDrawer.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        final MutableState mutableState = (MutableState) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2145779460, "CC(remember):NavigationDrawer.kt#9igjgp");
                        changed = startRestartGroup.changed(density);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        mutableFloatState = (MutableFloatState) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2145776784, "CC(remember):NavigationDrawer.kt#9igjgp");
                        i5 = (i10 & 896) ^ 384;
                        changed2 = ((i5 <= 256 && startRestartGroup.changed(drawerState3)) || (i10 & 384) == 256) | startRestartGroup.changed(density);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    DrawerState.this.setDensity$material3_release(density);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.SideEffect((Function0) rememberedValue4, startRestartGroup, 0);
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        consume = startRestartGroup.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (consume == LayoutDirection.Rtl) {
                            f = 0.0f;
                            obj = null;
                            i6 = 1;
                            z3 = true;
                        } else {
                            f = 0.0f;
                            obj = null;
                            i6 = 1;
                            z3 = false;
                        }
                        Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(SizeKt.fillMaxSize$default(modifier2, f, i6, obj), drawerState3.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, z7, z3, null, 16, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        Modifier modifier3 = modifier2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, anchoredDraggable$default);
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
                        m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                        Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1884917117, "C341@13601L17,344@13695L268,352@13988L70,342@13627L473,358@14209L245,364@14486L623,379@15121L1218,355@14109L2230:NavigationDrawer.kt#uh7d8r");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
                        m3333constructorimpl2 = Updater.m3333constructorimpl(startRestartGroup);
                        Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2020094509, "C341@13607L9:NavigationDrawer.kt#uh7d8r");
                        function22.invoke(startRestartGroup, Integer.valueOf((i10 >> 15) & 14));
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        boolean isOpen = drawerState3.isOpen();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2139013222, "CC(remember):NavigationDrawer.kt#9igjgp");
                        changedInstance = ((i10 & 7168) == 2048) | ((i5 <= 256 && startRestartGroup.changed(drawerState3)) || (i10 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    if (z7 && drawerState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(drawerState3, null), 3, null);
                                    }
                                }

                                /* compiled from: NavigationDrawer.kt */
                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1", f = "NavigationDrawer.kt", i = {}, l = {350}, m = "invokeSuspend", n = {}, s = {})
                                /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1, reason: invalid class name */
                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ DrawerState $drawerState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                                        super(2, continuation);
                                        this.$drawerState = drawerState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new AnonymousClass1(this.$drawerState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            this.label = 1;
                                            if (this.$drawerState.close(this) == coroutine_suspended) {
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
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        Function0 function0 = (Function0) rememberedValue5;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2139004044, "CC(remember):NavigationDrawer.kt#9igjgp");
                        changed3 = startRestartGroup.changed(mutableFloatState) | ((i5 <= 256 && startRestartGroup.changed(drawerState3)) || (i10 & 384) == 256);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!changed3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            f2 = 0.0f;
                            rememberedValue6 = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    float ModalNavigationDrawer_FHprtrg$lambda$5;
                                    float calculateFraction;
                                    ModalNavigationDrawer_FHprtrg$lambda$5 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$5(mutableFloatState);
                                    calculateFraction = NavigationDrawerKt.calculateFraction(ModalNavigationDrawer_FHprtrg$lambda$5, f2, drawerState3.requireOffset$material3_release());
                                    return Float.valueOf(calculateFraction);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        } else {
                            f2 = 0.0f;
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        m1967ScrimBx497Mc(isOpen, function0, (Function0) rememberedValue6, j3, startRestartGroup, (i10 >> 3) & 7168);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2138996797, "CC(remember):NavigationDrawer.kt#9igjgp");
                        z4 = (i5 <= 256 && startRestartGroup.changed(drawerState3)) || (i10 & 384) == 256;
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (!z4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$4$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                                    return IntOffset.m6418boximpl(m1969invokeBjo55l4(density2));
                                }

                                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                public final long m1969invokeBjo55l4(Density density2) {
                                    float currentOffset = DrawerState.this.getCurrentOffset();
                                    return Float.isNaN(currentOffset) ? IntOffset.INSTANCE.m6437getZeronOccac() : IntOffsetKt.IntOffset(MathKt.roundToInt(currentOffset), 0);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier offset = OffsetKt.offset(companion3, (Function1) rememberedValue7);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2138987555, "CC(remember):NavigationDrawer.kt#9igjgp");
                        changed4 = startRestartGroup.changed(m2655getString2EP1pXo) | ((i5 <= 256 && startRestartGroup.changed(drawerState3)) || (i10 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope);
                        rememberedValue8 = startRestartGroup.rememberedValue();
                        if (!changed4 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1
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
                                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo);
                                    if (drawerState3.isOpen()) {
                                        final DrawerState drawerState4 = drawerState3;
                                        final CoroutineScope coroutineScope2 = coroutineScope;
                                        SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                if (DrawerState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C00391(DrawerState.this, null), 3, null);
                                                }
                                                return true;
                                            }

                                            /* compiled from: NavigationDrawer.kt */
                                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                            @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1", f = "NavigationDrawer.kt", i = {}, l = {374}, m = "invokeSuspend", n = {}, s = {})
                                            /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1, reason: invalid class name and collision with other inner class name */
                                            static final class C00391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ DrawerState $drawerState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                C00391(DrawerState drawerState, Continuation<? super C00391> continuation) {
                                                    super(2, continuation);
                                                    this.$drawerState = drawerState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                    return new C00391(this.$drawerState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                    return ((C00391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        this.label = 1;
                                                        if (this.$drawerState.close(this) == coroutine_suspended) {
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
                                        }, 1, null);
                                    }
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue8);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier semantics$default = SemanticsModifierKt.semantics$default(offset, false, (Function1) rememberedValue8, 1, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2138966640, "CC(remember):NavigationDrawer.kt#9igjgp");
                        if ((i5 > 256 || !startRestartGroup.changed(drawerState3)) && (i10 & 384) != 256) {
                            mutableFloatState2 = mutableFloatState;
                            z5 = false;
                        } else {
                            z5 = true;
                            mutableFloatState2 = mutableFloatState;
                        }
                        changed5 = z5 | startRestartGroup.changed(mutableFloatState2);
                        rememberedValue9 = startRestartGroup.rememberedValue();
                        if (!changed5 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            final float f3 = 0.0f;
                            rememberedValue9 = (MeasurePolicy) new MeasurePolicy() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$6$1
                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j4) {
                                    Integer valueOf;
                                    long m6243copyZbe2FdA$default = Constraints.m6243copyZbe2FdA$default(j4, 0, 0, 0, 0, 10, null);
                                    ArrayList arrayList = new ArrayList(list.size());
                                    int size = list.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        arrayList.add(list.get(i11).mo5175measureBRTryo0(m6243copyZbe2FdA$default));
                                    }
                                    final ArrayList arrayList2 = arrayList;
                                    Integer num = null;
                                    int i12 = 1;
                                    if (arrayList2.isEmpty()) {
                                        valueOf = null;
                                    } else {
                                        valueOf = Integer.valueOf(((Placeable) arrayList2.get(0)).getWidth());
                                        int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                                        if (1 <= lastIndex) {
                                            int i13 = 1;
                                            while (true) {
                                                Integer valueOf2 = Integer.valueOf(((Placeable) arrayList2.get(i13)).getWidth());
                                                if (valueOf2.compareTo(valueOf) > 0) {
                                                    valueOf = valueOf2;
                                                }
                                                if (i13 == lastIndex) {
                                                    break;
                                                }
                                                i13++;
                                            }
                                        }
                                    }
                                    Integer num2 = valueOf;
                                    int intValue = num2 != null ? num2.intValue() : 0;
                                    if (!arrayList2.isEmpty()) {
                                        num = Integer.valueOf(((Placeable) arrayList2.get(0)).getHeight());
                                        int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
                                        if (1 <= lastIndex2) {
                                            while (true) {
                                                Integer valueOf3 = Integer.valueOf(((Placeable) arrayList2.get(i12)).getHeight());
                                                if (valueOf3.compareTo(num) > 0) {
                                                    num = valueOf3;
                                                }
                                                if (i12 == lastIndex2) {
                                                    break;
                                                }
                                                i12++;
                                            }
                                        }
                                    }
                                    Integer num3 = num;
                                    int intValue2 = num3 != null ? num3.intValue() : 0;
                                    final DrawerState drawerState4 = DrawerState.this;
                                    final MutableState<Boolean> mutableState2 = mutableState;
                                    final MutableFloatState mutableFloatState3 = mutableFloatState2;
                                    final float f4 = f3;
                                    final int i14 = intValue;
                                    return MeasureScope.layout$default(measureScope, intValue, intValue2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$6$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            boolean ModalNavigationDrawer_FHprtrg$lambda$2;
                                            boolean ModalNavigationDrawer_FHprtrg$lambda$22;
                                            float positionOf = DrawerState.this.getAnchoredDraggableState$material3_release().getAnchors().positionOf(DrawerValue.Closed);
                                            float f5 = -i14;
                                            ModalNavigationDrawer_FHprtrg$lambda$2 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$2(mutableState2);
                                            if (!ModalNavigationDrawer_FHprtrg$lambda$2 || positionOf != f5) {
                                                ModalNavigationDrawer_FHprtrg$lambda$22 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$2(mutableState2);
                                                if (!ModalNavigationDrawer_FHprtrg$lambda$22) {
                                                    NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$3(mutableState2, true);
                                                }
                                                mutableFloatState3.setFloatValue(f5);
                                                AnchoredDraggableState<DrawerValue> anchoredDraggableState$material3_release = DrawerState.this.getAnchoredDraggableState$material3_release();
                                                final float f6 = f4;
                                                final MutableFloatState mutableFloatState4 = mutableFloatState3;
                                                AnchoredDraggableState.updateAnchors$default(anchoredDraggableState$material3_release, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.ModalNavigationDrawer.2.6.1.1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                                        invoke2(draggableAnchorsConfig);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                                        float ModalNavigationDrawer_FHprtrg$lambda$5;
                                                        DrawerValue drawerValue = DrawerValue.Closed;
                                                        ModalNavigationDrawer_FHprtrg$lambda$5 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$5(mutableFloatState4);
                                                        draggableAnchorsConfig.at(drawerValue, ModalNavigationDrawer_FHprtrg$lambda$5);
                                                        draggableAnchorsConfig.at(DrawerValue.Open, f6);
                                                    }
                                                }), null, 2, null);
                                            }
                                            List<Placeable> list2 = arrayList2;
                                            int size2 = list2.size();
                                            for (int i15 = 0; i15 < size2; i15++) {
                                                Placeable.PlacementScope.placeRelative$default(placementScope, list2.get(i15), 0, 0, 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue9);
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue9;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        int i11 = (((i10 & 14) << 6) & 896) | 6;
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
                        m3333constructorimpl3 = Updater.m3333constructorimpl(startRestartGroup);
                        Updater.m3340setimpl(m3333constructorimpl3, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3333constructorimpl3.getInserting() || !Intrinsics.areEqual(m3333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m3340setimpl(m3333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        function2.invoke(startRestartGroup, Integer.valueOf((i11 >> 6) & 14));
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z7;
                        modifier2 = modifier3;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    drawerState3 = drawerState2;
                    z6 = z2;
                    j3 = j2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    final long j4 = j3;
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$3
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
                            NavigationDrawerKt.m1965ModalNavigationDrawerFHprtrg(function2, modifier4, drawerState3, z6, j4, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i3 & 74899) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) == 0) {
            }
            if (i9 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            final boolean z72 = z2;
            j3 = j2;
            int i102 = i3;
            drawerState3 = drawerState2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Strings.Companion companion4 = Strings.INSTANCE;
            final String m2655getString2EP1pXo2 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density2 = (Density) consume22;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2145781231, "CC(remember):NavigationDrawer.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState<Boolean> mutableState2 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2145779460, "CC(remember):NavigationDrawer.kt#9igjgp");
            changed = startRestartGroup.changed(density2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            mutableFloatState = (MutableFloatState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2145776784, "CC(remember):NavigationDrawer.kt#9igjgp");
            i5 = (i102 & 896) ^ 384;
            changed2 = ((i5 <= 256 && startRestartGroup.changed(drawerState3)) || (i102 & 384) == 256) | startRestartGroup.changed(density2);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue4 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    DrawerState.this.setDensity$material3_release(density2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.SideEffect((Function0) rememberedValue4, startRestartGroup, 0);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            consume = startRestartGroup.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (consume == LayoutDirection.Rtl) {
            }
            Modifier anchoredDraggable$default2 = AnchoredDraggableKt.anchoredDraggable$default(SizeKt.fillMaxSize$default(modifier2, f, i6, obj), drawerState3.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, z72, z3, null, 16, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            Modifier modifier32 = modifier2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, anchoredDraggable$default2);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3333constructorimpl.getInserting()) {
            }
            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1884917117, "C341@13601L17,344@13695L268,352@13988L70,342@13627L473,358@14209L245,364@14486L623,379@15121L1218,355@14109L2230:NavigationDrawer.kt#uh7d8r");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier.Companion companion22 = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3333constructorimpl2 = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3333constructorimpl2.getInserting()) {
            }
            m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
            Updater.m3340setimpl(m3333constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2020094509, "C341@13607L9:NavigationDrawer.kt#uh7d8r");
            function22.invoke(startRestartGroup, Integer.valueOf((i102 >> 15) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean isOpen2 = drawerState3.isOpen();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2139013222, "CC(remember):NavigationDrawer.kt#9igjgp");
            changedInstance = ((i102 & 7168) == 2048) | ((i5 <= 256 && startRestartGroup.changed(drawerState3)) || (i102 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope2);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    if (z72 && drawerState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(drawerState3, null), 3, null);
                    }
                }

                /* compiled from: NavigationDrawer.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1", f = "NavigationDrawer.kt", i = {}, l = {350}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ DrawerState $drawerState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$drawerState = drawerState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.$drawerState, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (this.$drawerState.close(this) == coroutine_suspended) {
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
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            Function0 function02 = (Function0) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2139004044, "CC(remember):NavigationDrawer.kt#9igjgp");
            changed3 = startRestartGroup.changed(mutableFloatState) | ((i5 <= 256 && startRestartGroup.changed(drawerState3)) || (i102 & 384) == 256);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (changed3) {
            }
            f2 = 0.0f;
            rememberedValue6 = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Float invoke() {
                    float ModalNavigationDrawer_FHprtrg$lambda$5;
                    float calculateFraction;
                    ModalNavigationDrawer_FHprtrg$lambda$5 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$5(mutableFloatState);
                    calculateFraction = NavigationDrawerKt.calculateFraction(ModalNavigationDrawer_FHprtrg$lambda$5, f2, drawerState3.requireOffset$material3_release());
                    return Float.valueOf(calculateFraction);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue6);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            m1967ScrimBx497Mc(isOpen2, function02, (Function0) rememberedValue6, j3, startRestartGroup, (i102 >> 3) & 7168);
            Modifier.Companion companion32 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2138996797, "CC(remember):NavigationDrawer.kt#9igjgp");
            if (i5 <= 256) {
            }
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue7 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$4$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntOffset invoke(Density density22) {
                    return IntOffset.m6418boximpl(m1969invokeBjo55l4(density22));
                }

                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                public final long m1969invokeBjo55l4(Density density22) {
                    float currentOffset = DrawerState.this.getCurrentOffset();
                    return Float.isNaN(currentOffset) ? IntOffset.INSTANCE.m6437getZeronOccac() : IntOffsetKt.IntOffset(MathKt.roundToInt(currentOffset), 0);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue7);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier offset2 = OffsetKt.offset(companion32, (Function1) rememberedValue7);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2138987555, "CC(remember):NavigationDrawer.kt#9igjgp");
            changed4 = startRestartGroup.changed(m2655getString2EP1pXo2) | ((i5 <= 256 && startRestartGroup.changed(drawerState3)) || (i102 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope2);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue8 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1
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
                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo2);
                    if (drawerState3.isOpen()) {
                        final DrawerState drawerState4 = drawerState3;
                        final CoroutineScope coroutineScope22 = coroutineScope2;
                        SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                if (DrawerState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new C00391(DrawerState.this, null), 3, null);
                                }
                                return true;
                            }

                            /* compiled from: NavigationDrawer.kt */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1", f = "NavigationDrawer.kt", i = {}, l = {374}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C00391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ DrawerState $drawerState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C00391(DrawerState drawerState, Continuation<? super C00391> continuation) {
                                    super(2, continuation);
                                    this.$drawerState = drawerState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C00391(this.$drawerState, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C00391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (this.$drawerState.close(this) == coroutine_suspended) {
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
                        }, 1, null);
                    }
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue8);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics$default2 = SemanticsModifierKt.semantics$default(offset2, false, (Function1) rememberedValue8, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2138966640, "CC(remember):NavigationDrawer.kt#9igjgp");
            if (i5 > 256) {
            }
            mutableFloatState2 = mutableFloatState;
            z5 = false;
            changed5 = z5 | startRestartGroup.changed(mutableFloatState2);
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (!changed5) {
            }
            final float f32 = 0.0f;
            rememberedValue9 = (MeasurePolicy) new MeasurePolicy() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$6$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j42) {
                    Integer valueOf;
                    long m6243copyZbe2FdA$default = Constraints.m6243copyZbe2FdA$default(j42, 0, 0, 0, 0, 10, null);
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i112 = 0; i112 < size; i112++) {
                        arrayList.add(list.get(i112).mo5175measureBRTryo0(m6243copyZbe2FdA$default));
                    }
                    final List<? extends Placeable> arrayList2 = arrayList;
                    Integer num = null;
                    int i12 = 1;
                    if (arrayList2.isEmpty()) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(((Placeable) arrayList2.get(0)).getWidth());
                        int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                        if (1 <= lastIndex) {
                            int i13 = 1;
                            while (true) {
                                Integer valueOf2 = Integer.valueOf(((Placeable) arrayList2.get(i13)).getWidth());
                                if (valueOf2.compareTo(valueOf) > 0) {
                                    valueOf = valueOf2;
                                }
                                if (i13 == lastIndex) {
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                    Integer num2 = valueOf;
                    int intValue = num2 != null ? num2.intValue() : 0;
                    if (!arrayList2.isEmpty()) {
                        num = Integer.valueOf(((Placeable) arrayList2.get(0)).getHeight());
                        int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
                        if (1 <= lastIndex2) {
                            while (true) {
                                Integer valueOf3 = Integer.valueOf(((Placeable) arrayList2.get(i12)).getHeight());
                                if (valueOf3.compareTo(num) > 0) {
                                    num = valueOf3;
                                }
                                if (i12 == lastIndex2) {
                                    break;
                                }
                                i12++;
                            }
                        }
                    }
                    Integer num3 = num;
                    int intValue2 = num3 != null ? num3.intValue() : 0;
                    final DrawerState drawerState4 = DrawerState.this;
                    final MutableState<Boolean> mutableState22 = mutableState2;
                    final MutableFloatState mutableFloatState3 = mutableFloatState2;
                    final float f4 = f32;
                    final int i14 = intValue;
                    return MeasureScope.layout$default(measureScope, intValue, intValue2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$6$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            boolean ModalNavigationDrawer_FHprtrg$lambda$2;
                            boolean ModalNavigationDrawer_FHprtrg$lambda$22;
                            float positionOf = DrawerState.this.getAnchoredDraggableState$material3_release().getAnchors().positionOf(DrawerValue.Closed);
                            float f5 = -i14;
                            ModalNavigationDrawer_FHprtrg$lambda$2 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$2(mutableState22);
                            if (!ModalNavigationDrawer_FHprtrg$lambda$2 || positionOf != f5) {
                                ModalNavigationDrawer_FHprtrg$lambda$22 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$2(mutableState22);
                                if (!ModalNavigationDrawer_FHprtrg$lambda$22) {
                                    NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$3(mutableState22, true);
                                }
                                mutableFloatState3.setFloatValue(f5);
                                AnchoredDraggableState<DrawerValue> anchoredDraggableState$material3_release = DrawerState.this.getAnchoredDraggableState$material3_release();
                                final float f6 = f4;
                                final MutableFloatState mutableFloatState4 = mutableFloatState3;
                                AnchoredDraggableState.updateAnchors$default(anchoredDraggableState$material3_release, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.ModalNavigationDrawer.2.6.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                        invoke2(draggableAnchorsConfig);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                        float ModalNavigationDrawer_FHprtrg$lambda$5;
                                        DrawerValue drawerValue = DrawerValue.Closed;
                                        ModalNavigationDrawer_FHprtrg$lambda$5 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$5(mutableFloatState4);
                                        draggableAnchorsConfig.at(drawerValue, ModalNavigationDrawer_FHprtrg$lambda$5);
                                        draggableAnchorsConfig.at(DrawerValue.Open, f6);
                                    }
                                }), null, 2, null);
                            }
                            List<Placeable> list2 = arrayList2;
                            int size2 = list2.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                Placeable.PlacementScope.placeRelative$default(placementScope, list2.get(i15), 0, 0, 0.0f, 4, null);
                            }
                        }
                    }, 4, null);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue9);
            MeasurePolicy measurePolicy2 = (MeasurePolicy) rememberedValue9;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default2);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            int i112 = (((i102 & 14) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3333constructorimpl3 = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl3, measurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3333constructorimpl3.getInserting()) {
            }
            m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
            Updater.m3340setimpl(m3333constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            function2.invoke(startRestartGroup, Integer.valueOf((i112 >> 6) & 14));
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            z6 = z72;
            modifier2 = modifier32;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if (i9 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        final boolean z722 = z2;
        j3 = j2;
        int i1022 = i3;
        drawerState3 = drawerState2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Strings.Companion companion42 = Strings.INSTANCE;
        final String m2655getString2EP1pXo22 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density22 = (Density) consume222;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2145781231, "CC(remember):NavigationDrawer.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState<Boolean> mutableState22 = (MutableState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2145779460, "CC(remember):NavigationDrawer.kt#9igjgp");
        changed = startRestartGroup.changed(density22);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        mutableFloatState = (MutableFloatState) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2145776784, "CC(remember):NavigationDrawer.kt#9igjgp");
        i5 = (i1022 & 896) ^ 384;
        changed2 = ((i5 <= 256 && startRestartGroup.changed(drawerState3)) || (i1022 & 384) == 256) | startRestartGroup.changed(density22);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue4 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                DrawerState.this.setDensity$material3_release(density22);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.SideEffect((Function0) rememberedValue4, startRestartGroup, 0);
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        consume = startRestartGroup.consume(localLayoutDirection22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (consume == LayoutDirection.Rtl) {
        }
        Modifier anchoredDraggable$default22 = AnchoredDraggableKt.anchoredDraggable$default(SizeKt.fillMaxSize$default(modifier2, f, i6, obj), drawerState3.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, z722, z3, null, 16, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        Modifier modifier322 = modifier2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, anchoredDraggable$default22);
        Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl.getInserting()) {
        }
        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42);
        Updater.m3340setimpl(m3333constructorimpl, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1884917117, "C341@13601L17,344@13695L268,352@13988L70,342@13627L473,358@14209L245,364@14486L623,379@15121L1218,355@14109L2230:NavigationDrawer.kt#uh7d8r");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Modifier.Companion companion222 = Modifier.INSTANCE;
        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3333constructorimpl2 = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl2.getInserting()) {
        }
        m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
        Updater.m3340setimpl(m3333constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2020094509, "C341@13607L9:NavigationDrawer.kt#uh7d8r");
        function22.invoke(startRestartGroup, Integer.valueOf((i1022 >> 15) & 14));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        boolean isOpen22 = drawerState3.isOpen();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2139013222, "CC(remember):NavigationDrawer.kt#9igjgp");
        changedInstance = ((i1022 & 7168) == 2048) | ((i5 <= 256 && startRestartGroup.changed(drawerState3)) || (i1022 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope22);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                if (z722 && drawerState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new AnonymousClass1(drawerState3, null), 3, null);
                }
            }

            /* compiled from: NavigationDrawer.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1", f = "NavigationDrawer.kt", i = {}, l = {350}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ DrawerState $drawerState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(DrawerState drawerState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$drawerState = drawerState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$drawerState, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.$drawerState.close(this) == coroutine_suspended) {
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
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        Function0 function022 = (Function0) rememberedValue5;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2139004044, "CC(remember):NavigationDrawer.kt#9igjgp");
        changed3 = startRestartGroup.changed(mutableFloatState) | ((i5 <= 256 && startRestartGroup.changed(drawerState3)) || (i1022 & 384) == 256);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (changed3) {
        }
        f2 = 0.0f;
        rememberedValue6 = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                float ModalNavigationDrawer_FHprtrg$lambda$5;
                float calculateFraction;
                ModalNavigationDrawer_FHprtrg$lambda$5 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$5(mutableFloatState);
                calculateFraction = NavigationDrawerKt.calculateFraction(ModalNavigationDrawer_FHprtrg$lambda$5, f2, drawerState3.requireOffset$material3_release());
                return Float.valueOf(calculateFraction);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue6);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        m1967ScrimBx497Mc(isOpen22, function022, (Function0) rememberedValue6, j3, startRestartGroup, (i1022 >> 3) & 7168);
        Modifier.Companion companion322 = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2138996797, "CC(remember):NavigationDrawer.kt#9igjgp");
        if (i5 <= 256) {
        }
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue7 = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$4$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ IntOffset invoke(Density density222) {
                return IntOffset.m6418boximpl(m1969invokeBjo55l4(density222));
            }

            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
            public final long m1969invokeBjo55l4(Density density222) {
                float currentOffset = DrawerState.this.getCurrentOffset();
                return Float.isNaN(currentOffset) ? IntOffset.INSTANCE.m6437getZeronOccac() : IntOffsetKt.IntOffset(MathKt.roundToInt(currentOffset), 0);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue7);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier offset22 = OffsetKt.offset(companion322, (Function1) rememberedValue7);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2138987555, "CC(remember):NavigationDrawer.kt#9igjgp");
        changed4 = startRestartGroup.changed(m2655getString2EP1pXo22) | ((i5 <= 256 && startRestartGroup.changed(drawerState3)) || (i1022 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope22);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue8 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1
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
                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo22);
                if (drawerState3.isOpen()) {
                    final DrawerState drawerState4 = drawerState3;
                    final CoroutineScope coroutineScope222 = coroutineScope22;
                    SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            if (DrawerState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope222, null, null, new C00391(DrawerState.this, null), 3, null);
                            }
                            return true;
                        }

                        /* compiled from: NavigationDrawer.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1", f = "NavigationDrawer.kt", i = {}, l = {374}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C00391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ DrawerState $drawerState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C00391(DrawerState drawerState, Continuation<? super C00391> continuation) {
                                super(2, continuation);
                                this.$drawerState = drawerState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C00391(this.$drawerState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C00391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (this.$drawerState.close(this) == coroutine_suspended) {
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
                    }, 1, null);
                }
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue8);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier semantics$default22 = SemanticsModifierKt.semantics$default(offset22, false, (Function1) rememberedValue8, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2138966640, "CC(remember):NavigationDrawer.kt#9igjgp");
        if (i5 > 256) {
        }
        mutableFloatState2 = mutableFloatState;
        z5 = false;
        changed5 = z5 | startRestartGroup.changed(mutableFloatState2);
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (!changed5) {
        }
        final float f322 = 0.0f;
        rememberedValue9 = (MeasurePolicy) new MeasurePolicy() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$6$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j42) {
                Integer valueOf;
                long m6243copyZbe2FdA$default = Constraints.m6243copyZbe2FdA$default(j42, 0, 0, 0, 0, 10, null);
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i1122 = 0; i1122 < size; i1122++) {
                    arrayList.add(list.get(i1122).mo5175measureBRTryo0(m6243copyZbe2FdA$default));
                }
                final List<? extends Placeable> arrayList2 = arrayList;
                Integer num = null;
                int i12 = 1;
                if (arrayList2.isEmpty()) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(((Placeable) arrayList2.get(0)).getWidth());
                    int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                    if (1 <= lastIndex) {
                        int i13 = 1;
                        while (true) {
                            Integer valueOf2 = Integer.valueOf(((Placeable) arrayList2.get(i13)).getWidth());
                            if (valueOf2.compareTo(valueOf) > 0) {
                                valueOf = valueOf2;
                            }
                            if (i13 == lastIndex) {
                                break;
                            }
                            i13++;
                        }
                    }
                }
                Integer num2 = valueOf;
                int intValue = num2 != null ? num2.intValue() : 0;
                if (!arrayList2.isEmpty()) {
                    num = Integer.valueOf(((Placeable) arrayList2.get(0)).getHeight());
                    int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
                    if (1 <= lastIndex2) {
                        while (true) {
                            Integer valueOf3 = Integer.valueOf(((Placeable) arrayList2.get(i12)).getHeight());
                            if (valueOf3.compareTo(num) > 0) {
                                num = valueOf3;
                            }
                            if (i12 == lastIndex2) {
                                break;
                            }
                            i12++;
                        }
                    }
                }
                Integer num3 = num;
                int intValue2 = num3 != null ? num3.intValue() : 0;
                final DrawerState drawerState4 = DrawerState.this;
                final MutableState<Boolean> mutableState222 = mutableState22;
                final MutableFloatState mutableFloatState3 = mutableFloatState2;
                final float f4 = f322;
                final int i14 = intValue;
                return MeasureScope.layout$default(measureScope, intValue, intValue2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalNavigationDrawer$2$6$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        boolean ModalNavigationDrawer_FHprtrg$lambda$2;
                        boolean ModalNavigationDrawer_FHprtrg$lambda$22;
                        float positionOf = DrawerState.this.getAnchoredDraggableState$material3_release().getAnchors().positionOf(DrawerValue.Closed);
                        float f5 = -i14;
                        ModalNavigationDrawer_FHprtrg$lambda$2 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$2(mutableState222);
                        if (!ModalNavigationDrawer_FHprtrg$lambda$2 || positionOf != f5) {
                            ModalNavigationDrawer_FHprtrg$lambda$22 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$2(mutableState222);
                            if (!ModalNavigationDrawer_FHprtrg$lambda$22) {
                                NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$3(mutableState222, true);
                            }
                            mutableFloatState3.setFloatValue(f5);
                            AnchoredDraggableState<DrawerValue> anchoredDraggableState$material3_release = DrawerState.this.getAnchoredDraggableState$material3_release();
                            final float f6 = f4;
                            final MutableFloatState mutableFloatState4 = mutableFloatState3;
                            AnchoredDraggableState.updateAnchors$default(anchoredDraggableState$material3_release, AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.ModalNavigationDrawer.2.6.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                    invoke2(draggableAnchorsConfig);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                    float ModalNavigationDrawer_FHprtrg$lambda$5;
                                    DrawerValue drawerValue = DrawerValue.Closed;
                                    ModalNavigationDrawer_FHprtrg$lambda$5 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$5(mutableFloatState4);
                                    draggableAnchorsConfig.at(drawerValue, ModalNavigationDrawer_FHprtrg$lambda$5);
                                    draggableAnchorsConfig.at(DrawerValue.Open, f6);
                                }
                            }), null, 2, null);
                        }
                        List<Placeable> list2 = arrayList2;
                        int size2 = list2.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            Placeable.PlacementScope.placeRelative$default(placementScope, list2.get(i15), 0, 0, 0.0f, 4, null);
                        }
                    }
                }, 4, null);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue9);
        MeasurePolicy measurePolicy22 = (MeasurePolicy) rememberedValue9;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default22);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        int i1122 = (((i1022 & 14) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3333constructorimpl3 = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl3, measurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl3.getInserting()) {
        }
        m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
        Updater.m3340setimpl(m3333constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        function2.invoke(startRestartGroup, Integer.valueOf((i1122 >> 6) & 14));
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        z6 = z722;
        modifier2 = modifier322;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalNavigationDrawer_FHprtrg$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ModalNavigationDrawer_FHprtrg$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ModalNavigationDrawer_FHprtrg$lambda$5(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x037c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DismissibleNavigationDrawer(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, DrawerState drawerState, boolean z, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final DrawerState drawerState2;
        int i4;
        boolean z2;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        Object rememberedValue3;
        int currentCompositeKeyHash;
        Composer m3333constructorimpl;
        boolean z3;
        MeasurePolicy rememberedValue4;
        int currentCompositeKeyHash2;
        Composer m3333constructorimpl2;
        boolean changed2;
        Object rememberedValue5;
        int currentCompositeKeyHash3;
        Composer m3333constructorimpl3;
        int currentCompositeKeyHash4;
        Composer m3333constructorimpl4;
        final DrawerState drawerState3;
        final boolean z4;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(398812198);
        ComposerKt.sourceInformation(startRestartGroup, "C(DismissibleNavigationDrawer)P(1,4,2,3)434@17575L39,438@17723L34,439@17789L7,440@17812L33,440@17801L44,442@17863L24,443@17913L33,445@17985L7,446@18020L2358:NavigationDrawer.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    drawerState2 = drawerState;
                    if (startRestartGroup.changed(drawerState2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    drawerState2 = drawerState;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                drawerState2 = drawerState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            drawerState2 = rememberDrawerState(DrawerValue.Closed, null, startRestartGroup, 6, 2);
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(398812198, i3, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:437)");
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1034571360, "CC(remember):NavigationDrawer.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final MutableState mutableState = (MutableState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Density density = (Density) consume;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1034574207, "CC(remember):NavigationDrawer.kt#9igjgp");
                    int i7 = (i3 & 896) ^ 384;
                    changed = ((i7 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changed(density);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                DrawerState.this.setDensity$material3_release(density);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                        startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue3 = compositionScopedCoroutineScopeCanceller;
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Strings.Companion companion = Strings.INSTANCE;
                    final String m2655getString2EP1pXo = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    boolean z5 = z2;
                    Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(modifier2, drawerState2.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, z5, consume2 == LayoutDirection.Rtl, null, 16, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    Modifier modifier3 = modifier2;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, anchoredDraggable$default);
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
                    m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                    Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1218087217, "C477@19117L1255,454@18269L2103:NavigationDrawer.kt#uh7d8r");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 99280484, "CC(remember):NavigationDrawer.kt#9igjgp");
                    z3 = (i7 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256;
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!z3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                final Placeable mo5175measureBRTryo0 = list.get(0).mo5175measureBRTryo0(j);
                                final Placeable mo5175measureBRTryo02 = list.get(1).mo5175measureBRTryo0(j);
                                int width = mo5175measureBRTryo02.getWidth();
                                int height = mo5175measureBRTryo02.getHeight();
                                final DrawerState drawerState4 = DrawerState.this;
                                final MutableState<Boolean> mutableState2 = mutableState;
                                return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1.1
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
                                        boolean DismissibleNavigationDrawer$lambda$16;
                                        boolean DismissibleNavigationDrawer$lambda$162;
                                        float positionOf = DrawerState.this.getAnchoredDraggableState$material3_release().getAnchors().positionOf(DrawerValue.Closed);
                                        final float f = -mo5175measureBRTryo0.getWidth();
                                        DismissibleNavigationDrawer$lambda$16 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$16(mutableState2);
                                        if (!DismissibleNavigationDrawer$lambda$16 || positionOf != f) {
                                            DismissibleNavigationDrawer$lambda$162 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$16(mutableState2);
                                            if (!DismissibleNavigationDrawer$lambda$162) {
                                                NavigationDrawerKt.DismissibleNavigationDrawer$lambda$17(mutableState2, true);
                                            }
                                            AnchoredDraggableState.updateAnchors$default(DrawerState.this.getAnchoredDraggableState$material3_release(), AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer.2.2.1.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                                    invoke2(draggableAnchorsConfig);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                                    draggableAnchorsConfig.at(DrawerValue.Closed, f);
                                                    draggableAnchorsConfig.at(DrawerValue.Open, 0.0f);
                                                }
                                            }), null, 2, null);
                                        }
                                        Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo02, mo5175measureBRTryo0.getWidth() + MathKt.roundToInt(DrawerState.this.requireOffset$material3_release()), 0, 0.0f, 4, null);
                                        Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo0, MathKt.roundToInt(DrawerState.this.requireOffset$material3_release()), 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue4;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
                    m3333constructorimpl2 = Updater.m3333constructorimpl(startRestartGroup);
                    Updater.m3340setimpl(m3333constructorimpl2, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 285475168, "C457@18361L623,456@18317L741,475@19075L17:NavigationDrawer.kt#uh7d8r");
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1376263189, "CC(remember):NavigationDrawer.kt#9igjgp");
                    changed2 = startRestartGroup.changed(m2655getString2EP1pXo) | ((i7 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1
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
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo);
                                if (drawerState2.isOpen()) {
                                    final DrawerState drawerState4 = drawerState2;
                                    final CoroutineScope coroutineScope2 = coroutineScope;
                                    SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            if (DrawerState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C00371(DrawerState.this, null), 3, null);
                                            }
                                            return true;
                                        }

                                        /* compiled from: NavigationDrawer.kt */
                                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                        @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1", f = "NavigationDrawer.kt", i = {}, l = {467}, m = "invokeSuspend", n = {}, s = {})
                                        /* renamed from: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                        static final class C00371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ DrawerState $drawerState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            C00371(DrawerState drawerState, Continuation<? super C00371> continuation) {
                                                super(2, continuation);
                                                this.$drawerState = drawerState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                return new C00371(this.$drawerState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                return ((C00371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    this.label = 1;
                                                    if (this.$drawerState.close(this) == coroutine_suspended) {
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
                                    }, 1, null);
                                }
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(companion3, false, (Function1) rememberedValue5, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default);
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
                    m3333constructorimpl3 = Updater.m3333constructorimpl(startRestartGroup);
                    Updater.m3340setimpl(m3333constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3333constructorimpl3.getInserting() || !Intrinsics.areEqual(m3333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m3340setimpl(m3333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 590398649, "C473@19025L15:NavigationDrawer.kt#uh7d8r");
                    function2.invoke(startRestartGroup, Integer.valueOf(i3 & 14));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion4);
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
                    m3333constructorimpl4 = Updater.m3333constructorimpl(startRestartGroup);
                    Updater.m3340setimpl(m3333constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3333constructorimpl4.getInserting() || !Intrinsics.areEqual(m3333constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m3333constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m3333constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m3340setimpl(m3333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 590454015, "C475@19081L9:NavigationDrawer.kt#uh7d8r");
                    function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
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
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    drawerState3 = drawerState2;
                    z4 = z5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    drawerState3 = drawerState2;
                    z4 = z2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3
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

                        public final void invoke(Composer composer2, int i8) {
                            NavigationDrawerKt.DismissibleNavigationDrawer(function2, modifier4, drawerState3, z4, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1034571360, "CC(remember):NavigationDrawer.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState<Boolean> mutableState2 = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density2 = (Density) consume3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1034574207, "CC(remember):NavigationDrawer.kt#9igjgp");
            int i72 = (i3 & 896) ^ 384;
            changed = ((i72 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changed(density2);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    DrawerState.this.setDensity$material3_release(density2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Strings.Companion companion5 = Strings.INSTANCE;
            final String m2655getString2EP1pXo2 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean z52 = z2;
            Modifier anchoredDraggable$default2 = AnchoredDraggableKt.anchoredDraggable$default(modifier2, drawerState2.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, z52, consume22 == LayoutDirection.Rtl, null, 16, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            Modifier modifier32 = modifier2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, anchoredDraggable$default2);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3333constructorimpl.getInserting()) {
            }
            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash5);
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1218087217, "C477@19117L1255,454@18269L2103:NavigationDrawer.kt#uh7d8r");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 99280484, "CC(remember):NavigationDrawer.kt#9igjgp");
            if (i72 <= 256) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue4 = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                    final Placeable mo5175measureBRTryo0 = list.get(0).mo5175measureBRTryo0(j);
                    final Placeable mo5175measureBRTryo02 = list.get(1).mo5175measureBRTryo0(j);
                    int width = mo5175measureBRTryo02.getWidth();
                    int height = mo5175measureBRTryo02.getHeight();
                    final DrawerState drawerState4 = DrawerState.this;
                    final MutableState<Boolean> mutableState22 = mutableState2;
                    return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1.1
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
                            boolean DismissibleNavigationDrawer$lambda$16;
                            boolean DismissibleNavigationDrawer$lambda$162;
                            float positionOf = DrawerState.this.getAnchoredDraggableState$material3_release().getAnchors().positionOf(DrawerValue.Closed);
                            final float f = -mo5175measureBRTryo0.getWidth();
                            DismissibleNavigationDrawer$lambda$16 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$16(mutableState22);
                            if (!DismissibleNavigationDrawer$lambda$16 || positionOf != f) {
                                DismissibleNavigationDrawer$lambda$162 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$16(mutableState22);
                                if (!DismissibleNavigationDrawer$lambda$162) {
                                    NavigationDrawerKt.DismissibleNavigationDrawer$lambda$17(mutableState22, true);
                                }
                                AnchoredDraggableState.updateAnchors$default(DrawerState.this.getAnchoredDraggableState$material3_release(), AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer.2.2.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                        invoke2(draggableAnchorsConfig);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                        draggableAnchorsConfig.at(DrawerValue.Closed, f);
                                        draggableAnchorsConfig.at(DrawerValue.Open, 0.0f);
                                    }
                                }), null, 2, null);
                            }
                            Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo02, mo5175measureBRTryo0.getWidth() + MathKt.roundToInt(DrawerState.this.requireOffset$material3_release()), 0, 0.0f, 4, null);
                            Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo0, MathKt.roundToInt(DrawerState.this.requireOffset$material3_release()), 0, 0.0f, 4, null);
                        }
                    }, 4, null);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            MeasurePolicy measurePolicy2 = (MeasurePolicy) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            Modifier.Companion companion22 = Modifier.INSTANCE;
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3333constructorimpl2 = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl2, measurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3333constructorimpl2.getInserting()) {
            }
            m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
            Updater.m3340setimpl(m3333constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 285475168, "C457@18361L623,456@18317L741,475@19075L17:NavigationDrawer.kt#uh7d8r");
            Modifier.Companion companion32 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1376263189, "CC(remember):NavigationDrawer.kt#9igjgp");
            changed2 = startRestartGroup.changed(m2655getString2EP1pXo2) | ((i72 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope2);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue5 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1
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
                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo2);
                    if (drawerState2.isOpen()) {
                        final DrawerState drawerState4 = drawerState2;
                        final CoroutineScope coroutineScope22 = coroutineScope2;
                        SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                if (DrawerState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope22, null, null, new C00371(DrawerState.this, null), 3, null);
                                }
                                return true;
                            }

                            /* compiled from: NavigationDrawer.kt */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1", f = "NavigationDrawer.kt", i = {}, l = {467}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C00371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ DrawerState $drawerState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C00371(DrawerState drawerState, Continuation<? super C00371> continuation) {
                                    super(2, continuation);
                                    this.$drawerState = drawerState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C00371(this.$drawerState, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C00371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (this.$drawerState.close(this) == coroutine_suspended) {
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
                        }, 1, null);
                    }
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier semantics$default2 = SemanticsModifierKt.semantics$default(companion32, false, (Function1) rememberedValue5, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default2);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3333constructorimpl3 = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl3, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3333constructorimpl3.getInserting()) {
            }
            m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
            Updater.m3340setimpl(m3333constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 590398649, "C473@19025L15:NavigationDrawer.kt#uh7d8r");
            function2.invoke(startRestartGroup, Integer.valueOf(i3 & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier.Companion companion42 = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, companion42);
            Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3333constructorimpl4 = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl4, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3333constructorimpl4.getInserting()) {
            }
            m3333constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m3333constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
            Updater.m3340setimpl(m3333constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 590454015, "C475@19081L9:NavigationDrawer.kt#uh7d8r");
            function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
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
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier32;
            drawerState3 = drawerState2;
            z4 = z52;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1034571360, "CC(remember):NavigationDrawer.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState<Boolean> mutableState22 = (MutableState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density22 = (Density) consume32;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1034574207, "CC(remember):NavigationDrawer.kt#9igjgp");
        int i722 = (i3 & 896) ^ 384;
        changed = ((i722 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changed(density22);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                DrawerState.this.setDensity$material3_release(density22);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Strings.Companion companion52 = Strings.INSTANCE;
        final String m2655getString2EP1pXo22 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localLayoutDirection22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        boolean z522 = z2;
        Modifier anchoredDraggable$default22 = AnchoredDraggableKt.anchoredDraggable$default(modifier2, drawerState2.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, z522, consume222 == LayoutDirection.Rtl, null, 16, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy42 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        Modifier modifier322 = modifier2;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, anchoredDraggable$default22);
        Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl.getInserting()) {
        }
        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash52);
        Updater.m3340setimpl(m3333constructorimpl, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance42 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1218087217, "C477@19117L1255,454@18269L2103:NavigationDrawer.kt#uh7d8r");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 99280484, "CC(remember):NavigationDrawer.kt#9igjgp");
        if (i722 <= 256) {
        }
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue4 = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo38measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                final Placeable mo5175measureBRTryo0 = list.get(0).mo5175measureBRTryo0(j);
                final Placeable mo5175measureBRTryo02 = list.get(1).mo5175measureBRTryo0(j);
                int width = mo5175measureBRTryo02.getWidth();
                int height = mo5175measureBRTryo02.getHeight();
                final DrawerState drawerState4 = DrawerState.this;
                final MutableState<Boolean> mutableState222 = mutableState22;
                return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1.1
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
                        boolean DismissibleNavigationDrawer$lambda$16;
                        boolean DismissibleNavigationDrawer$lambda$162;
                        float positionOf = DrawerState.this.getAnchoredDraggableState$material3_release().getAnchors().positionOf(DrawerValue.Closed);
                        final float f = -mo5175measureBRTryo0.getWidth();
                        DismissibleNavigationDrawer$lambda$16 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$16(mutableState222);
                        if (!DismissibleNavigationDrawer$lambda$16 || positionOf != f) {
                            DismissibleNavigationDrawer$lambda$162 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$16(mutableState222);
                            if (!DismissibleNavigationDrawer$lambda$162) {
                                NavigationDrawerKt.DismissibleNavigationDrawer$lambda$17(mutableState222, true);
                            }
                            AnchoredDraggableState.updateAnchors$default(DrawerState.this.getAnchoredDraggableState$material3_release(), AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer.2.2.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                    invoke2(draggableAnchorsConfig);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                    draggableAnchorsConfig.at(DrawerValue.Closed, f);
                                    draggableAnchorsConfig.at(DrawerValue.Open, 0.0f);
                                }
                            }), null, 2, null);
                        }
                        Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo02, mo5175measureBRTryo0.getWidth() + MathKt.roundToInt(DrawerState.this.requireOffset$material3_release()), 0, 0.0f, 4, null);
                        Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo0, MathKt.roundToInt(DrawerState.this.requireOffset$material3_release()), 0, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        MeasurePolicy measurePolicy22 = (MeasurePolicy) rememberedValue4;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        Modifier.Companion companion222 = Modifier.INSTANCE;
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3333constructorimpl2 = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl2, measurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl2.getInserting()) {
        }
        m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
        Updater.m3340setimpl(m3333constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 285475168, "C457@18361L623,456@18317L741,475@19075L17:NavigationDrawer.kt#uh7d8r");
        Modifier.Companion companion322 = Modifier.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1376263189, "CC(remember):NavigationDrawer.kt#9igjgp");
        changed2 = startRestartGroup.changed(m2655getString2EP1pXo22) | ((i722 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(coroutineScope22);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue5 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1
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
                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo22);
                if (drawerState2.isOpen()) {
                    final DrawerState drawerState4 = drawerState2;
                    final CoroutineScope coroutineScope222 = coroutineScope22;
                    SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            if (DrawerState.this.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope222, null, null, new C00371(DrawerState.this, null), 3, null);
                            }
                            return true;
                        }

                        /* compiled from: NavigationDrawer.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1", f = "NavigationDrawer.kt", i = {}, l = {467}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C00371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ DrawerState $drawerState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C00371(DrawerState drawerState, Continuation<? super C00371> continuation) {
                                super(2, continuation);
                                this.$drawerState = drawerState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C00371(this.$drawerState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C00371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (this.$drawerState.close(this) == coroutine_suspended) {
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
                    }, 1, null);
                }
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier semantics$default22 = SemanticsModifierKt.semantics$default(companion322, false, (Function1) rememberedValue5, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default22);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3333constructorimpl3 = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl3, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl3.getInserting()) {
        }
        m3333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m3333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
        Updater.m3340setimpl(m3333constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 590398649, "C473@19025L15:NavigationDrawer.kt#uh7d8r");
        function2.invoke(startRestartGroup, Integer.valueOf(i3 & 14));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Modifier.Companion companion422 = Modifier.INSTANCE;
        MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, companion422);
        Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3333constructorimpl4 = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl4, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl4, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl4.getInserting()) {
        }
        m3333constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m3333constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash422);
        Updater.m3340setimpl(m3333constructorimpl4, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 590454015, "C475@19081L9:NavigationDrawer.kt#uh7d8r");
        function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
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
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier322;
        drawerState3 = drawerState2;
        z4 = z522;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DismissibleNavigationDrawer$lambda$16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DismissibleNavigationDrawer$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PermanentNavigationDrawer(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer m3333constructorimpl;
        int currentCompositeKeyHash2;
        Composer m3333constructorimpl2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-276843608);
        ComposerKt.sourceInformation(startRestartGroup, "C(PermanentNavigationDrawer)P(1,2)532@21415L85:NavigationDrawer.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-276843608, i3, -1, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:531)");
                }
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -882916661, "C533@21453L15,534@21477L17:NavigationDrawer.kt#uh7d8r");
                function2.invoke(startRestartGroup, Integer.valueOf(i3 & 14));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                m3333constructorimpl2 = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1559720052, "C534@21483L9:NavigationDrawer.kt#uh7d8r");
                function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = companion;
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentNavigationDrawer$2
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
                        NavigationDrawerKt.PermanentNavigationDrawer(function2, modifier3, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl.getInserting()) {
        }
        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
        Updater.m3340setimpl(m3333constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -882916661, "C533@21453L15,534@21477L17:NavigationDrawer.kt#uh7d8r");
        function2.invoke(startRestartGroup, Integer.valueOf(i3 & 14));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Modifier.Companion companion22 = Modifier.INSTANCE;
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3333constructorimpl2 = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl2.getInserting()) {
        }
        m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m3340setimpl(m3333constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1559720052, "C534@21483L9:NavigationDrawer.kt#uh7d8r");
        function22.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c1  */
    /* renamed from: ModalDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1964ModalDrawerSheetafqeVBk(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        long j3;
        long j4;
        float f2;
        WindowInsets windowInsets2;
        Modifier.Companion companion;
        WindowInsets windowInsets3;
        float f3;
        final Shape shape3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1001163336);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalDrawerSheet)P(5,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,6)561@22840L5,562@22896L19,563@22949L37,565@23104L12,568@23174L225:NavigationDrawer.kt#uh7d8r");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                shape2 = shape;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            shape2 = shape;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                j3 = j;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                j4 = j2;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            j4 = j2;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    windowInsets2 = windowInsets;
                    if (startRestartGroup.changed(windowInsets2)) {
                        i4 = 131072;
                        i3 |= i4;
                    }
                } else {
                    windowInsets2 = windowInsets;
                }
                i4 = 65536;
                i3 |= i4;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                        shape2 = DrawerDefaults.INSTANCE.getShape(startRestartGroup, 6);
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        j3 = DrawerDefaults.INSTANCE.getModalContainerColor(startRestartGroup, 6);
                    }
                    if ((i2 & 8) != 0) {
                        long m1609contentColorForek8zF_U = ColorSchemeKt.m1609contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                        i3 &= -7169;
                        j4 = m1609contentColorForek8zF_U;
                    }
                    if (i9 != 0) {
                        f2 = DrawerDefaults.INSTANCE.m1756getModalDrawerElevationD9Ej5fM();
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                        f3 = f2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1001163336, i3, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:567)");
                        }
                        int i10 = i3 << 6;
                        m1962DrawerSheet7zSek6w(null, windowInsets3, companion, shape2, j3, j4, f3, function3, startRestartGroup, ((i3 >> 12) & 112) | 6 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016) | ((i3 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f2 = f3;
                        windowInsets2 = windowInsets3;
                        shape3 = shape2;
                        modifier2 = companion;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    companion = modifier2;
                }
                f3 = f2;
                windowInsets3 = windowInsets2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i102 = i3 << 6;
                m1962DrawerSheet7zSek6w(null, windowInsets3, companion, shape2, j3, j4, f3, function3, startRestartGroup, ((i3 >> 12) & 112) | 6 | (i102 & 896) | (i102 & 7168) | (57344 & i102) | (458752 & i102) | (i102 & 3670016) | ((i3 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f2 = f3;
                windowInsets2 = windowInsets3;
                shape3 = shape2;
                modifier2 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                shape3 = shape2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = modifier2;
                final long j5 = j3;
                final long j6 = j4;
                final float f4 = f2;
                final WindowInsets windowInsets4 = windowInsets2;
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$1
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

                    public final void invoke(Composer composer2, int i11) {
                        NavigationDrawerKt.m1964ModalDrawerSheetafqeVBk(Modifier.this, shape3, j5, j6, f4, windowInsets4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        f2 = f;
        if ((196608 & i) != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i9 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        f3 = f2;
        windowInsets3 = windowInsets2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1022 = i3 << 6;
        m1962DrawerSheet7zSek6w(null, windowInsets3, companion, shape2, j3, j4, f3, function3, startRestartGroup, ((i3 >> 12) & 112) | 6 | (i1022 & 896) | (i1022 & 7168) | (57344 & i1022) | (458752 & i1022) | (i1022 & 3670016) | ((i3 << 3) & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        f2 = f3;
        windowInsets2 = windowInsets3;
        shape3 = shape2;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0180  */
    /* renamed from: ModalDrawerSheet-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1963ModalDrawerSheetSnr_uVM(final DrawerState drawerState, Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        long j3;
        long j4;
        int i4;
        float f2;
        WindowInsets windowInsets2;
        Modifier.Companion companion;
        Shape shape3;
        long j5;
        long j6;
        float m1756getModalDrawerElevationD9Ej5fM;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1513027356);
        ComposerKt.sourceInformation(startRestartGroup, "C(ModalDrawerSheet)P(4,6,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp,7)605@24793L5,606@24849L19,607@24902L37,609@25057L12,612@25168L299,612@25127L340:NavigationDrawer.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(drawerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i7 = 2048;
                        i3 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = 1024;
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    j4 = j2;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                j4 = j2;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i5 = 1048576;
                            i3 |= i5;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i5 = 524288;
                    i3 |= i5;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                    if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i9 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i2 & 4) == 0) {
                                shape3 = DrawerDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                i3 &= -897;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i2 & 8) == 0) {
                                j5 = DrawerDefaults.INSTANCE.getModalContainerColor(startRestartGroup, 6);
                                i3 &= -7169;
                            } else {
                                j5 = j3;
                            }
                            if ((i2 & 16) == 0) {
                                j6 = ColorSchemeKt.m1609contentColorForek8zF_U(j5, startRestartGroup, (i3 >> 9) & 14);
                                i3 &= -57345;
                            } else {
                                j6 = j4;
                            }
                            m1756getModalDrawerElevationD9Ej5fM = i4 == 0 ? DrawerDefaults.INSTANCE.m1756getModalDrawerElevationD9Ej5fM() : f2;
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                windowInsets2 = DrawerDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            companion = modifier;
                            shape3 = shape2;
                            j5 = j3;
                            j6 = j4;
                            m1756getModalDrawerElevationD9Ej5fM = f2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1513027356, i3, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:611)");
                        }
                        final WindowInsets windowInsets3 = windowInsets2;
                        final Modifier modifier3 = companion;
                        final Shape shape4 = shape3;
                        final long j7 = j5;
                        final long j8 = j6;
                        final float f3 = m1756getModalDrawerElevationD9Ej5fM;
                        Modifier modifier4 = companion;
                        NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(1552342929, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                                invoke(drawerPredictiveBackState, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i10) {
                                int i11;
                                ComposerKt.sourceInformation(composer2, "C613@25207L254:NavigationDrawer.kt#uh7d8r");
                                if ((i10 & 6) == 0) {
                                    i11 = i10 | (composer2.changed(drawerPredictiveBackState) ? 4 : 2);
                                } else {
                                    i11 = i10;
                                }
                                if ((i11 & 19) != 18 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1552342929, i11, -1, "androidx.compose.material3.ModalDrawerSheet.<anonymous> (NavigationDrawer.kt:613)");
                                    }
                                    NavigationDrawerKt.m1962DrawerSheet7zSek6w(drawerPredictiveBackState, WindowInsets.this, modifier3, shape4, j7, j8, f3, function3, composer2, i11 & 14, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        shape3 = shape2;
                        j5 = j3;
                        j6 = j4;
                        m1756getModalDrawerElevationD9Ej5fM = f2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier5 = modifier2;
                        final Shape shape5 = shape3;
                        final long j9 = j5;
                        final long j10 = j6;
                        final float f4 = m1756getModalDrawerElevationD9Ej5fM;
                        final WindowInsets windowInsets4 = windowInsets2;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$3
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

                            public final void invoke(Composer composer2, int i10) {
                                NavigationDrawerKt.m1963ModalDrawerSheetSnr_uVM(DrawerState.this, modifier5, shape5, j9, j10, f4, windowInsets4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i3 & 4793491) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final WindowInsets windowInsets32 = windowInsets2;
                final Modifier modifier32 = companion;
                final Shape shape42 = shape3;
                final long j72 = j5;
                final long j82 = j6;
                final float f32 = m1756getModalDrawerElevationD9Ej5fM;
                Modifier modifier42 = companion;
                NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(1552342929, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                        invoke(drawerPredictiveBackState, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i10) {
                        int i11;
                        ComposerKt.sourceInformation(composer2, "C613@25207L254:NavigationDrawer.kt#uh7d8r");
                        if ((i10 & 6) == 0) {
                            i11 = i10 | (composer2.changed(drawerPredictiveBackState) ? 4 : 2);
                        } else {
                            i11 = i10;
                        }
                        if ((i11 & 19) != 18 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1552342929, i11, -1, "androidx.compose.material3.ModalDrawerSheet.<anonymous> (NavigationDrawer.kt:613)");
                            }
                            NavigationDrawerKt.m1962DrawerSheet7zSek6w(drawerPredictiveBackState, WindowInsets.this, modifier32, shape42, j72, j82, f32, function3, composer2, i11 & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            if ((1572864 & i) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if ((i2 & 4) == 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final WindowInsets windowInsets322 = windowInsets2;
            final Modifier modifier322 = companion;
            final Shape shape422 = shape3;
            final long j722 = j5;
            final long j822 = j6;
            final float f322 = m1756getModalDrawerElevationD9Ej5fM;
            Modifier modifier422 = companion;
            NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(1552342929, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                    invoke(drawerPredictiveBackState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i10) {
                    int i11;
                    ComposerKt.sourceInformation(composer2, "C613@25207L254:NavigationDrawer.kt#uh7d8r");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer2.changed(drawerPredictiveBackState) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1552342929, i11, -1, "androidx.compose.material3.ModalDrawerSheet.<anonymous> (NavigationDrawer.kt:613)");
                        }
                        NavigationDrawerKt.m1962DrawerSheet7zSek6w(drawerPredictiveBackState, WindowInsets.this, modifier322, shape422, j722, j822, f322, function3, composer2, i11 & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier422;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        f2 = f;
        if ((1572864 & i) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final WindowInsets windowInsets3222 = windowInsets2;
        final Modifier modifier3222 = companion;
        final Shape shape4222 = shape3;
        final long j7222 = j5;
        final long j8222 = j6;
        final float f3222 = m1756getModalDrawerElevationD9Ej5fM;
        Modifier modifier4222 = companion;
        NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(1552342929, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                invoke(drawerPredictiveBackState, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i10) {
                int i11;
                ComposerKt.sourceInformation(composer2, "C613@25207L254:NavigationDrawer.kt#uh7d8r");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (composer2.changed(drawerPredictiveBackState) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) != 18 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1552342929, i11, -1, "androidx.compose.material3.ModalDrawerSheet.<anonymous> (NavigationDrawer.kt:613)");
                    }
                    NavigationDrawerKt.m1962DrawerSheet7zSek6w(drawerPredictiveBackState, WindowInsets.this, modifier3222, shape4222, j7222, j8222, f3222, function3, composer2, i11 & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 48);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier4222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b4  */
    /* renamed from: DismissibleDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1961DismissibleDrawerSheetafqeVBk(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        long j3;
        long j4;
        int i4;
        float f2;
        WindowInsets windowInsets2;
        Modifier.Companion companion;
        WindowInsets windowInsets3;
        float f3;
        final long j5;
        final WindowInsets windowInsets4;
        final float f4;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-588600583);
        ComposerKt.sourceInformation(startRestartGroup, "C(DismissibleDrawerSheet)P(5,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,6)650@26887L22,651@26943L37,653@27104L12,656@27174L225:NavigationDrawer.kt#uh7d8r");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            shape2 = shape;
            i3 |= startRestartGroup.changed(shape2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    j3 = j;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i5 = 131072;
                            i3 |= i5;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i5 = 65536;
                    i3 |= i5;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                    if ((i3 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i7 == 0 ? Modifier.INSTANCE : modifier;
                            if (i8 != 0) {
                                shape2 = RectangleShapeKt.getRectangleShape();
                            }
                            if ((i2 & 4) != 0) {
                                j3 = DrawerDefaults.INSTANCE.getStandardContainerColor(startRestartGroup, 6);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                j4 = ColorSchemeKt.m1609contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                                i3 &= -7169;
                            }
                            if (i4 != 0) {
                                f2 = DrawerDefaults.INSTANCE.m1754getDismissibleDrawerElevationD9Ej5fM();
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                f3 = f2;
                                long j6 = j4;
                                int i9 = i3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-588600583, i9, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:655)");
                                }
                                int i10 = i9 << 6;
                                m1962DrawerSheet7zSek6w(null, windowInsets3, companion, shape2, j3, j6, f3, function3, startRestartGroup, 6 | ((i9 >> 12) & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016) | ((i9 << 3) & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                j4 = j6;
                                j5 = j3;
                                windowInsets4 = windowInsets3;
                                f4 = f3;
                                modifier2 = companion;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            companion = modifier;
                        }
                        f3 = f2;
                        windowInsets3 = windowInsets2;
                        long j62 = j4;
                        int i92 = i3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i102 = i92 << 6;
                        m1962DrawerSheet7zSek6w(null, windowInsets3, companion, shape2, j3, j62, f3, function3, startRestartGroup, 6 | ((i92 >> 12) & 112) | (i102 & 896) | (i102 & 7168) | (57344 & i102) | (458752 & i102) | (i102 & 3670016) | ((i92 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        j4 = j62;
                        j5 = j3;
                        windowInsets4 = windowInsets3;
                        f4 = f3;
                        modifier2 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        j5 = j3;
                        f4 = f2;
                        windowInsets4 = windowInsets2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        final Shape shape3 = shape2;
                        final long j7 = j4;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$1
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

                            public final void invoke(Composer composer2, int i11) {
                                NavigationDrawerKt.m1961DismissibleDrawerSheetafqeVBk(Modifier.this, shape3, j5, j7, f4, windowInsets4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i3 & 599187) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i7 == 0) {
                }
                if (i8 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                f3 = f2;
                windowInsets3 = windowInsets2;
                long j622 = j4;
                int i922 = i3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1022 = i922 << 6;
                m1962DrawerSheet7zSek6w(null, windowInsets3, companion, shape2, j3, j622, f3, function3, startRestartGroup, 6 | ((i922 >> 12) & 112) | (i1022 & 896) | (i1022 & 7168) | (57344 & i1022) | (458752 & i1022) | (i1022 & 3670016) | ((i922 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                j4 = j622;
                j5 = j3;
                windowInsets4 = windowInsets3;
                f4 = f3;
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            if ((196608 & i) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 == 0) {
            }
            if (i8 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            f3 = f2;
            windowInsets3 = windowInsets2;
            long j6222 = j4;
            int i9222 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i10222 = i9222 << 6;
            m1962DrawerSheet7zSek6w(null, windowInsets3, companion, shape2, j3, j6222, f3, function3, startRestartGroup, 6 | ((i9222 >> 12) & 112) | (i10222 & 896) | (i10222 & 7168) | (57344 & i10222) | (458752 & i10222) | (i10222 & 3670016) | ((i9222 << 3) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            j4 = j6222;
            j5 = j3;
            windowInsets4 = windowInsets3;
            f4 = f3;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        shape2 = shape;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 == 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        f3 = f2;
        windowInsets3 = windowInsets2;
        long j62222 = j4;
        int i92222 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i102222 = i92222 << 6;
        m1962DrawerSheet7zSek6w(null, windowInsets3, companion, shape2, j3, j62222, f3, function3, startRestartGroup, 6 | ((i92222 >> 12) & 112) | (i102222 & 896) | (i102222 & 7168) | (57344 & i102222) | (458752 & i102222) | (i102222 & 3670016) | ((i92222 << 3) & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        j4 = j62222;
        j5 = j3;
        windowInsets4 = windowInsets3;
        f4 = f3;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d9  */
    /* renamed from: DismissibleDrawerSheet-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1960DismissibleDrawerSheetSnr_uVM(final DrawerState drawerState, Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Shape shape2;
        long j3;
        long j4;
        int i5;
        float f2;
        Modifier.Companion companion;
        Shape rectangleShape;
        float m1754getDismissibleDrawerElevationD9Ej5fM;
        WindowInsets windowInsets2;
        Modifier modifier2;
        WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(1473549901);
        ComposerKt.sourceInformation(startRestartGroup, "C(DismissibleDrawerSheet)P(4,6,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp,7)694@28867L22,695@28923L37,697@29084L12,700@29195L299,700@29154L340:NavigationDrawer.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(drawerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                shape2 = shape;
                i3 |= startRestartGroup.changed(shape2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i6 = 2048;
                            i3 |= i6;
                        }
                    } else {
                        j3 = j;
                    }
                    i6 = 1024;
                    i3 |= i6;
                } else {
                    j3 = j;
                }
                if ((i & 24576) == 0) {
                    j4 = j2;
                    i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? 16384 : 8192;
                } else {
                    j4 = j2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    if ((i & 1572864) == 0) {
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(windowInsets)) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                        if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i7 != 0 ? Modifier.INSTANCE : modifier;
                                rectangleShape = i4 != 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                                if ((i2 & 8) != 0) {
                                    j3 = DrawerDefaults.INSTANCE.getStandardContainerColor(startRestartGroup, 6);
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    j4 = ColorSchemeKt.m1609contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                                    i3 &= -57345;
                                }
                                m1754getDismissibleDrawerElevationD9Ej5fM = i5 != 0 ? DrawerDefaults.INSTANCE.m1754getDismissibleDrawerElevationD9Ej5fM() : f2;
                                if ((i2 & 64) != 0) {
                                    windowInsets2 = DrawerDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    i3 &= -3670017;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1473549901, i3, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:699)");
                                    }
                                    final WindowInsets windowInsets4 = windowInsets2;
                                    final Modifier modifier3 = companion;
                                    final Shape shape3 = rectangleShape;
                                    final long j5 = j3;
                                    final long j6 = j4;
                                    final float f3 = m1754getDismissibleDrawerElevationD9Ej5fM;
                                    Modifier modifier4 = companion;
                                    NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(-807955710, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                                            invoke(drawerPredictiveBackState, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i8) {
                                            int i9;
                                            ComposerKt.sourceInformation(composer2, "C701@29234L254:NavigationDrawer.kt#uh7d8r");
                                            if ((i8 & 6) == 0) {
                                                i9 = i8 | (composer2.changed(drawerPredictiveBackState) ? 4 : 2);
                                            } else {
                                                i9 = i8;
                                            }
                                            if ((i9 & 19) != 18 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-807955710, i9, -1, "androidx.compose.material3.DismissibleDrawerSheet.<anonymous> (NavigationDrawer.kt:701)");
                                                }
                                                NavigationDrawerKt.m1962DrawerSheet7zSek6w(drawerPredictiveBackState, WindowInsets.this, modifier3, shape3, j5, j6, f3, function3, composer2, i9 & 14, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier4;
                                    f2 = m1754getDismissibleDrawerElevationD9Ej5fM;
                                    windowInsets3 = windowInsets2;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                companion = modifier;
                                rectangleShape = shape2;
                                m1754getDismissibleDrawerElevationD9Ej5fM = f2;
                            }
                            windowInsets2 = windowInsets;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final WindowInsets windowInsets42 = windowInsets2;
                            final Modifier modifier32 = companion;
                            final Shape shape32 = rectangleShape;
                            final long j52 = j3;
                            final long j62 = j4;
                            final float f32 = m1754getDismissibleDrawerElevationD9Ej5fM;
                            Modifier modifier42 = companion;
                            NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(-807955710, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                                    invoke(drawerPredictiveBackState, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i8) {
                                    int i9;
                                    ComposerKt.sourceInformation(composer2, "C701@29234L254:NavigationDrawer.kt#uh7d8r");
                                    if ((i8 & 6) == 0) {
                                        i9 = i8 | (composer2.changed(drawerPredictiveBackState) ? 4 : 2);
                                    } else {
                                        i9 = i8;
                                    }
                                    if ((i9 & 19) != 18 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-807955710, i9, -1, "androidx.compose.material3.DismissibleDrawerSheet.<anonymous> (NavigationDrawer.kt:701)");
                                        }
                                        NavigationDrawerKt.m1962DrawerSheet7zSek6w(drawerPredictiveBackState, WindowInsets.this, modifier32, shape32, j52, j62, f32, function3, composer2, i9 & 14, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 48);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier42;
                            f2 = m1754getDismissibleDrawerElevationD9Ej5fM;
                            windowInsets3 = windowInsets2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            windowInsets3 = windowInsets;
                            rectangleShape = shape2;
                        }
                        final long j7 = j4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier5 = modifier2;
                            final Shape shape4 = rectangleShape;
                            final long j8 = j3;
                            final float f4 = f2;
                            final WindowInsets windowInsets5 = windowInsets3;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$3
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

                                public final void invoke(Composer composer2, int i8) {
                                    NavigationDrawerKt.m1960DismissibleDrawerSheetSnr_uVM(DrawerState.this, modifier5, shape4, j8, j7, f4, windowInsets5, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i3 & 4793491) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    windowInsets2 = windowInsets;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final WindowInsets windowInsets422 = windowInsets2;
                    final Modifier modifier322 = companion;
                    final Shape shape322 = rectangleShape;
                    final long j522 = j3;
                    final long j622 = j4;
                    final float f322 = m1754getDismissibleDrawerElevationD9Ej5fM;
                    Modifier modifier422 = companion;
                    NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(-807955710, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                            invoke(drawerPredictiveBackState, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i8) {
                            int i9;
                            ComposerKt.sourceInformation(composer2, "C701@29234L254:NavigationDrawer.kt#uh7d8r");
                            if ((i8 & 6) == 0) {
                                i9 = i8 | (composer2.changed(drawerPredictiveBackState) ? 4 : 2);
                            } else {
                                i9 = i8;
                            }
                            if ((i9 & 19) != 18 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-807955710, i9, -1, "androidx.compose.material3.DismissibleDrawerSheet.<anonymous> (NavigationDrawer.kt:701)");
                                }
                                NavigationDrawerKt.m1962DrawerSheet7zSek6w(drawerPredictiveBackState, WindowInsets.this, modifier322, shape322, j522, j622, f322, function3, composer2, i9 & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier422;
                    f2 = m1754getDismissibleDrawerElevationD9Ej5fM;
                    windowInsets3 = windowInsets2;
                    final long j72 = j4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f2 = f;
                if ((i & 1572864) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                windowInsets2 = windowInsets;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final WindowInsets windowInsets4222 = windowInsets2;
                final Modifier modifier3222 = companion;
                final Shape shape3222 = rectangleShape;
                final long j5222 = j3;
                final long j6222 = j4;
                final float f3222 = m1754getDismissibleDrawerElevationD9Ej5fM;
                Modifier modifier4222 = companion;
                NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(-807955710, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                        invoke(drawerPredictiveBackState, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i8) {
                        int i9;
                        ComposerKt.sourceInformation(composer2, "C701@29234L254:NavigationDrawer.kt#uh7d8r");
                        if ((i8 & 6) == 0) {
                            i9 = i8 | (composer2.changed(drawerPredictiveBackState) ? 4 : 2);
                        } else {
                            i9 = i8;
                        }
                        if ((i9 & 19) != 18 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-807955710, i9, -1, "androidx.compose.material3.DismissibleDrawerSheet.<anonymous> (NavigationDrawer.kt:701)");
                            }
                            NavigationDrawerKt.m1962DrawerSheet7zSek6w(drawerPredictiveBackState, WindowInsets.this, modifier3222, shape3222, j5222, j6222, f3222, function3, composer2, i9 & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier4222;
                f2 = m1754getDismissibleDrawerElevationD9Ej5fM;
                windowInsets3 = windowInsets2;
                final long j722 = j4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            shape2 = shape;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((i & 1572864) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            windowInsets2 = windowInsets;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final WindowInsets windowInsets42222 = windowInsets2;
            final Modifier modifier32222 = companion;
            final Shape shape32222 = rectangleShape;
            final long j52222 = j3;
            final long j62222 = j4;
            final float f32222 = m1754getDismissibleDrawerElevationD9Ej5fM;
            Modifier modifier42222 = companion;
            NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(-807955710, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                    invoke(drawerPredictiveBackState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i8) {
                    int i9;
                    ComposerKt.sourceInformation(composer2, "C701@29234L254:NavigationDrawer.kt#uh7d8r");
                    if ((i8 & 6) == 0) {
                        i9 = i8 | (composer2.changed(drawerPredictiveBackState) ? 4 : 2);
                    } else {
                        i9 = i8;
                    }
                    if ((i9 & 19) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-807955710, i9, -1, "androidx.compose.material3.DismissibleDrawerSheet.<anonymous> (NavigationDrawer.kt:701)");
                        }
                        NavigationDrawerKt.m1962DrawerSheet7zSek6w(drawerPredictiveBackState, WindowInsets.this, modifier32222, shape32222, j52222, j62222, f32222, function3, composer2, i9 & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier42222;
            f2 = m1754getDismissibleDrawerElevationD9Ej5fM;
            windowInsets3 = windowInsets2;
            final long j7222 = j4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        shape2 = shape;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((i & 1572864) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        windowInsets2 = windowInsets;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final WindowInsets windowInsets422222 = windowInsets2;
        final Modifier modifier322222 = companion;
        final Shape shape322222 = rectangleShape;
        final long j522222 = j3;
        final long j622222 = j4;
        final float f322222 = m1754getDismissibleDrawerElevationD9Ej5fM;
        Modifier modifier422222 = companion;
        NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(-807955710, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                invoke(drawerPredictiveBackState, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i8) {
                int i9;
                ComposerKt.sourceInformation(composer2, "C701@29234L254:NavigationDrawer.kt#uh7d8r");
                if ((i8 & 6) == 0) {
                    i9 = i8 | (composer2.changed(drawerPredictiveBackState) ? 4 : 2);
                } else {
                    i9 = i8;
                }
                if ((i9 & 19) != 18 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-807955710, i9, -1, "androidx.compose.material3.DismissibleDrawerSheet.<anonymous> (NavigationDrawer.kt:701)");
                    }
                    NavigationDrawerKt.m1962DrawerSheet7zSek6w(drawerPredictiveBackState, WindowInsets.this, modifier322222, shape322222, j522222, j622222, f322222, function3, composer2, i9 & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 48);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier422222;
        f2 = m1754getDismissibleDrawerElevationD9Ej5fM;
        windowInsets3 = windowInsets2;
        final long j72222 = j4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00bf  */
    /* renamed from: PermanentDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1966PermanentDrawerSheetafqeVBk(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        long j3;
        long j4;
        int i4;
        float f2;
        WindowInsets windowInsets2;
        Modifier.Companion companion;
        WindowInsets windowInsets3;
        float f3;
        boolean changed;
        Object rememberedValue;
        final long j5;
        final WindowInsets windowInsets4;
        final float f4;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1733353241);
        ComposerKt.sourceInformation(startRestartGroup, "C(PermanentDrawerSheet)P(5,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,6)734@30666L22,735@30722L37,737@30881L12,740@30972L33,744@31114L30,741@31010L266:NavigationDrawer.kt#uh7d8r");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            shape2 = shape;
            i3 |= startRestartGroup.changed(shape2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    j3 = j;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i5 = 131072;
                            i3 |= i5;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i5 = 65536;
                    i3 |= i5;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                    if ((i3 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i7 == 0 ? Modifier.INSTANCE : modifier;
                            if (i8 != 0) {
                                shape2 = RectangleShapeKt.getRectangleShape();
                            }
                            if ((i2 & 4) != 0) {
                                j3 = DrawerDefaults.INSTANCE.getStandardContainerColor(startRestartGroup, 6);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                j4 = ColorSchemeKt.m1609contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                                i3 &= -7169;
                            }
                            if (i4 != 0) {
                                f2 = DrawerDefaults.INSTANCE.m1757getPermanentDrawerElevationD9Ej5fM();
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                f3 = f2;
                                long j6 = j4;
                                int i9 = i3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1733353241, i9, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:739)");
                                }
                                Strings.Companion companion2 = Strings.INSTANCE;
                                final String m2655getString2EP1pXo = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 391082081, "CC(remember):NavigationDrawer.kt#9igjgp");
                                changed = startRestartGroup.changed(m2655getString2EP1pXo);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1
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
                                            SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i10 = i9 << 6;
                                m1962DrawerSheet7zSek6w(null, windowInsets3, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), shape2, j3, j6, f3, function3, startRestartGroup, ((i9 >> 12) & 112) | 6 | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016) | ((i9 << 3) & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                j4 = j6;
                                j5 = j3;
                                windowInsets4 = windowInsets3;
                                f4 = f3;
                                modifier2 = companion;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            companion = modifier;
                        }
                        f3 = f2;
                        windowInsets3 = windowInsets2;
                        long j62 = j4;
                        int i92 = i3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Strings.Companion companion22 = Strings.INSTANCE;
                        final String m2655getString2EP1pXo2 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 391082081, "CC(remember):NavigationDrawer.kt#9igjgp");
                        changed = startRestartGroup.changed(m2655getString2EP1pXo2);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1
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
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i102 = i92 << 6;
                        m1962DrawerSheet7zSek6w(null, windowInsets3, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), shape2, j3, j62, f3, function3, startRestartGroup, ((i92 >> 12) & 112) | 6 | (i102 & 7168) | (57344 & i102) | (458752 & i102) | (i102 & 3670016) | ((i92 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        j4 = j62;
                        j5 = j3;
                        windowInsets4 = windowInsets3;
                        f4 = f3;
                        modifier2 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        j5 = j3;
                        f4 = f2;
                        windowInsets4 = windowInsets2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        final Shape shape3 = shape2;
                        final long j7 = j4;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$2
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

                            public final void invoke(Composer composer2, int i11) {
                                NavigationDrawerKt.m1966PermanentDrawerSheetafqeVBk(Modifier.this, shape3, j5, j7, f4, windowInsets4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i3 & 599187) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i7 == 0) {
                }
                if (i8 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                f3 = f2;
                windowInsets3 = windowInsets2;
                long j622 = j4;
                int i922 = i3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Strings.Companion companion222 = Strings.INSTANCE;
                final String m2655getString2EP1pXo22 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 391082081, "CC(remember):NavigationDrawer.kt#9igjgp");
                changed = startRestartGroup.changed(m2655getString2EP1pXo22);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1
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
                        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo22);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i1022 = i922 << 6;
                m1962DrawerSheet7zSek6w(null, windowInsets3, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), shape2, j3, j622, f3, function3, startRestartGroup, ((i922 >> 12) & 112) | 6 | (i1022 & 7168) | (57344 & i1022) | (458752 & i1022) | (i1022 & 3670016) | ((i922 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                j4 = j622;
                j5 = j3;
                windowInsets4 = windowInsets3;
                f4 = f3;
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            if ((196608 & i) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 == 0) {
            }
            if (i8 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            f3 = f2;
            windowInsets3 = windowInsets2;
            long j6222 = j4;
            int i9222 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Strings.Companion companion2222 = Strings.INSTANCE;
            final String m2655getString2EP1pXo222 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 391082081, "CC(remember):NavigationDrawer.kt#9igjgp");
            changed = startRestartGroup.changed(m2655getString2EP1pXo222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1
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
                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo222);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i10222 = i9222 << 6;
            m1962DrawerSheet7zSek6w(null, windowInsets3, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), shape2, j3, j6222, f3, function3, startRestartGroup, ((i9222 >> 12) & 112) | 6 | (i10222 & 7168) | (57344 & i10222) | (458752 & i10222) | (i10222 & 3670016) | ((i9222 << 3) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            j4 = j6222;
            j5 = j3;
            windowInsets4 = windowInsets3;
            f4 = f3;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        shape2 = shape;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 == 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        f3 = f2;
        windowInsets3 = windowInsets2;
        long j62222 = j4;
        int i92222 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Strings.Companion companion22222 = Strings.INSTANCE;
        final String m2655getString2EP1pXo2222 = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 391082081, "CC(remember):NavigationDrawer.kt#9igjgp");
        changed = startRestartGroup.changed(m2655getString2EP1pXo2222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1
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
                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, m2655getString2EP1pXo2222);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i102222 = i92222 << 6;
        m1962DrawerSheet7zSek6w(null, windowInsets3, SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), shape2, j3, j62222, f3, function3, startRestartGroup, ((i92222 >> 12) & 112) | 6 | (i102222 & 7168) | (57344 & i102222) | (458752 & i102222) | (i102222 & 3670016) | ((i92222 << 3) & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        j4 = j62222;
        j5 = j3;
        windowInsets4 = windowInsets3;
        f4 = f3;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00bc  */
    /* renamed from: DrawerSheet-7zSek6w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1962DrawerSheet7zSek6w(final DrawerPredictiveBackState drawerPredictiveBackState, final WindowInsets windowInsets, Modifier modifier, Shape shape, long j, long j2, float f, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Shape shape2;
        long j3;
        int i5;
        final float f2;
        long j4;
        int i6;
        long j5;
        long j6;
        Object consume;
        final boolean z;
        final DrawerPredictiveBackState drawerPredictiveBackState2;
        Modifier.Companion companion;
        final Shape shape3;
        final long j7;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-151557245);
        ComposerKt.sourceInformation(startRestartGroup, "C(DrawerSheet)P(3,7,6,4,1:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp)759@31534L22,760@31590L37,764@31790L7,779@32434L545,769@32027L952:NavigationDrawer.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(drawerPredictiveBackState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(windowInsets) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                shape2 = shape;
                i3 |= startRestartGroup.changed(shape2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    j3 = j;
                    i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j3)) ? 16384 : 8192;
                } else {
                    j3 = j;
                }
                if ((196608 & i) == 0) {
                    i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j2)) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
                    }
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            shape2 = RectangleShapeKt.getRectangleShape();
                        }
                        if ((i2 & 16) != 0) {
                            j3 = DrawerDefaults.INSTANCE.getStandardContainerColor(startRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            j4 = ColorSchemeKt.m1609contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 12) & 14);
                            i3 = (-458753) & i3;
                        } else {
                            j4 = j2;
                        }
                        if (i5 != 0) {
                            f2 = DrawerDefaults.INSTANCE.m1757getPermanentDrawerElevationD9Ej5fM();
                        }
                        i6 = i3;
                        j5 = j3;
                        j6 = j4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        j6 = j2;
                        i6 = i3;
                        j5 = j3;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-151557245, i6, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:763)");
                    }
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    consume = startRestartGroup.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (consume == LayoutDirection.Rtl) {
                        drawerPredictiveBackState2 = drawerPredictiveBackState;
                        z = true;
                    } else {
                        z = false;
                        drawerPredictiveBackState2 = drawerPredictiveBackState;
                    }
                    if (drawerPredictiveBackState2 != null) {
                        companion = predictiveBackDrawerContainer(Modifier.INSTANCE, drawerPredictiveBackState2, z);
                    } else {
                        companion = Modifier.INSTANCE;
                    }
                    Modifier modifier3 = modifier2;
                    int i8 = i6 >> 6;
                    SurfaceKt.m2223SurfaceT9BRK9s(SizeKt.fillMaxHeight$default(SizeKt.m730sizeInqDBjuR0$default(modifier3, MinimumDrawerWidth, 0.0f, DrawerDefaults.INSTANCE.m1755getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null).then(companion), 0.0f, 1, null), shape2, j5, j6, f2, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(669057502, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerSheet$1
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

                        public final void invoke(Composer composer2, int i9) {
                            Modifier.Companion companion2;
                            float f3;
                            ComposerKt.sourceInformation(composer2, "C784@32654L319:NavigationDrawer.kt#uh7d8r");
                            if ((i9 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(669057502, i9, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:780)");
                                }
                                if (DrawerPredictiveBackState.this != null) {
                                    companion2 = NavigationDrawerKt.predictiveBackDrawerChild(Modifier.INSTANCE, DrawerPredictiveBackState.this, z);
                                } else {
                                    companion2 = Modifier.INSTANCE;
                                }
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                f3 = NavigationDrawerKt.MinimumDrawerWidth;
                                Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.m730sizeInqDBjuR0$default(companion3, f3, 0.0f, DrawerDefaults.INSTANCE.m1755getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null).then(companion2), windowInsets);
                                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, windowInsetsPadding);
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
                                function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
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
                    }, startRestartGroup, 54), startRestartGroup, (i8 & 112) | 12582912 | (i8 & 896) | (i8 & 7168) | (i8 & 57344), 96);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j3 = j5;
                    shape3 = shape2;
                    j7 = j6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    shape3 = shape2;
                    j7 = j2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    final long j8 = j3;
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerSheet$2
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

                        public final void invoke(Composer composer2, int i9) {
                            NavigationDrawerKt.m1962DrawerSheet7zSek6w(DrawerPredictiveBackState.this, windowInsets, modifier4, shape3, j8, j7, f2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            shape2 = shape;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((4793491 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i5 != 0) {
            }
            i6 = i3;
            j5 = j3;
            j6 = j4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            consume = startRestartGroup.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (consume == LayoutDirection.Rtl) {
            }
            if (drawerPredictiveBackState2 != null) {
            }
            Modifier modifier32 = modifier2;
            int i82 = i6 >> 6;
            SurfaceKt.m2223SurfaceT9BRK9s(SizeKt.fillMaxHeight$default(SizeKt.m730sizeInqDBjuR0$default(modifier32, MinimumDrawerWidth, 0.0f, DrawerDefaults.INSTANCE.m1755getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null).then(companion), 0.0f, 1, null), shape2, j5, j6, f2, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(669057502, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerSheet$1
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

                public final void invoke(Composer composer2, int i9) {
                    Modifier.Companion companion2;
                    float f3;
                    ComposerKt.sourceInformation(composer2, "C784@32654L319:NavigationDrawer.kt#uh7d8r");
                    if ((i9 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(669057502, i9, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:780)");
                        }
                        if (DrawerPredictiveBackState.this != null) {
                            companion2 = NavigationDrawerKt.predictiveBackDrawerChild(Modifier.INSTANCE, DrawerPredictiveBackState.this, z);
                        } else {
                            companion2 = Modifier.INSTANCE;
                        }
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        f3 = NavigationDrawerKt.MinimumDrawerWidth;
                        Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.m730sizeInqDBjuR0$default(companion3, f3, 0.0f, DrawerDefaults.INSTANCE.m1755getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null).then(companion2), windowInsets);
                        Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, windowInsetsPadding);
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
                        function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
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
            }, startRestartGroup, 54), startRestartGroup, (i82 & 112) | 12582912 | (i82 & 896) | (i82 & 7168) | (i82 & 57344), 96);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier32;
            j3 = j5;
            shape3 = shape2;
            j7 = j6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        shape2 = shape;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((4793491 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i5 != 0) {
        }
        i6 = i3;
        j5 = j3;
        j6 = j4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        consume = startRestartGroup.consume(localLayoutDirection22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (consume == LayoutDirection.Rtl) {
        }
        if (drawerPredictiveBackState2 != null) {
        }
        Modifier modifier322 = modifier2;
        int i822 = i6 >> 6;
        SurfaceKt.m2223SurfaceT9BRK9s(SizeKt.fillMaxHeight$default(SizeKt.m730sizeInqDBjuR0$default(modifier322, MinimumDrawerWidth, 0.0f, DrawerDefaults.INSTANCE.m1755getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null).then(companion), 0.0f, 1, null), shape2, j5, j6, f2, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(669057502, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerSheet$1
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

            public final void invoke(Composer composer2, int i9) {
                Modifier.Companion companion2;
                float f3;
                ComposerKt.sourceInformation(composer2, "C784@32654L319:NavigationDrawer.kt#uh7d8r");
                if ((i9 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(669057502, i9, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:780)");
                    }
                    if (DrawerPredictiveBackState.this != null) {
                        companion2 = NavigationDrawerKt.predictiveBackDrawerChild(Modifier.INSTANCE, DrawerPredictiveBackState.this, z);
                    } else {
                        companion2 = Modifier.INSTANCE;
                    }
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    f3 = NavigationDrawerKt.MinimumDrawerWidth;
                    Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.m730sizeInqDBjuR0$default(companion3, f3, 0.0f, DrawerDefaults.INSTANCE.m1755getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null).then(companion2), windowInsets);
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, windowInsetsPadding);
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
                    function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
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
        }, startRestartGroup, 54), startRestartGroup, (i822 & 112) | 12582912 | (i822 & 896) | (i822 & 7168) | (i822 & 57344), 96);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier322;
        j3 = j5;
        shape3 = shape2;
        j7 = j6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final Modifier predictiveBackDrawerContainer(Modifier modifier, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$predictiveBackDrawerContainer$1
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
                float calculatePredictiveBackScaleX;
                float calculatePredictiveBackScaleY;
                calculatePredictiveBackScaleX = NavigationDrawerKt.calculatePredictiveBackScaleX(graphicsLayerScope, DrawerPredictiveBackState.this);
                graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX);
                calculatePredictiveBackScaleY = NavigationDrawerKt.calculatePredictiveBackScaleY(graphicsLayerScope, DrawerPredictiveBackState.this);
                graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY);
                graphicsLayerScope.mo4033setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 1.0f : 0.0f, 0.5f));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier predictiveBackDrawerChild(Modifier modifier, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$predictiveBackDrawerChild$1
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
                float calculatePredictiveBackScaleX;
                float calculatePredictiveBackScaleY;
                calculatePredictiveBackScaleX = NavigationDrawerKt.calculatePredictiveBackScaleX(graphicsLayerScope, DrawerPredictiveBackState.this);
                calculatePredictiveBackScaleY = NavigationDrawerKt.calculatePredictiveBackScaleY(graphicsLayerScope, DrawerPredictiveBackState.this);
                graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX == 0.0f ? 1.0f : calculatePredictiveBackScaleY / calculatePredictiveBackScaleX);
                graphicsLayerScope.mo4033setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 0.0f : 1.0f, 0.0f));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float m3668getWidthimpl = Size.m3668getWidthimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(m3668getWidthimpl) || m3668getWidthimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f + ((drawerPredictiveBackState.getScaleXDistance() * (drawerPredictiveBackState.getSwipeEdgeMatchesDrawer() ? 1 : -1)) / m3668getWidthimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float m3665getHeightimpl = Size.m3665getHeightimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(m3665getHeightimpl) || m3665getHeightimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (drawerPredictiveBackState.getScaleYDistance() / m3665getHeightimpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationDrawerItem(final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, NavigationDrawerItemColors navigationDrawerItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape2;
        int i6;
        Shape shape3;
        NavigationDrawerItemColors navigationDrawerItemColors2;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        Shape shape4;
        NavigationDrawerItemColors navigationDrawerItemColors3;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i7;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Shape shape5;
        final MutableInteractionSource mutableInteractionSource3;
        final Modifier modifier3;
        final NavigationDrawerItemColors navigationDrawerItemColors4;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1304626543);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavigationDrawerItem)P(4,7,6,5,2!1,8)925@38341L5,926@38418L8,938@38801L24,940@38886L884,929@38492L1278:NavigationDrawer.kt#uh7d8r");
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
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function24 = function22;
                i3 |= startRestartGroup.changedInstance(function24) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function25 = function23;
                    i3 |= startRestartGroup.changedInstance(function25) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i9 = 1048576;
                                i3 |= i9;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i9 = 524288;
                        i3 |= i9;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(navigationDrawerItemColors)) {
                            i8 = 8388608;
                            i3 |= i8;
                        }
                        i8 = 4194304;
                        i3 |= i8;
                    }
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i10 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                function24 = null;
                            }
                            if (i5 != 0) {
                                function25 = null;
                            }
                            if ((i2 & 64) == 0) {
                                shape3 = ShapesKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), startRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                shape3 = shape2;
                            }
                            if ((i2 & 128) == 0) {
                                navigationDrawerItemColors2 = NavigationDrawerItemDefaults.INSTANCE.m1959colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 100663296, 255);
                                i3 &= -29360129;
                            } else {
                                navigationDrawerItemColors2 = navigationDrawerItemColors;
                            }
                            if (i6 == 0) {
                                modifier2 = companion;
                                shape4 = shape3;
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                                modifier2 = companion;
                                shape4 = shape3;
                            }
                            navigationDrawerItemColors3 = navigationDrawerItemColors2;
                            function26 = function24;
                            function27 = function25;
                            i7 = i3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            modifier2 = modifier;
                            navigationDrawerItemColors3 = navigationDrawerItemColors;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i7 = i3;
                            function26 = function24;
                            function27 = function25;
                            shape4 = shape2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1304626543, i7, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:928)");
                        }
                        int i11 = i7 >> 3;
                        final Function2<? super Composer, ? super Integer, Unit> function210 = function26;
                        final NavigationDrawerItemColors navigationDrawerItemColors5 = navigationDrawerItemColors3;
                        final Function2<? super Composer, ? super Integer, Unit> function211 = function27;
                        Modifier modifier4 = modifier2;
                        NavigationDrawerItemColors navigationDrawerItemColors6 = navigationDrawerItemColors3;
                        composer2 = startRestartGroup;
                        SurfaceKt.m2224Surfaced85dljk(z, function0, SizeKt.fillMaxWidth$default(SizeKt.m714heightInVpY3zN4$default(SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.m5613setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5600getTabo7Vup1c());
                            }
                        }, 1, null), NavigationDrawerTokens.INSTANCE.m3003getActiveIndicatorHeightD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z, startRestartGroup, (i11 & 14) | ((i7 >> 18) & 112)).getValue().m3850unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(191488423, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$2
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

                            public final void invoke(Composer composer3, int i12) {
                                ComposerKt.sourceInformation(composer3, "C941@38896L868:NavigationDrawer.kt#uh7d8r");
                                if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(191488423, i12, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:941)");
                                    }
                                    Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6299constructorimpl(16), 0.0f, Dp.m6299constructorimpl(24), 0.0f, 10, null);
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function2<Composer, Integer, Unit> function212 = function210;
                                    NavigationDrawerItemColors navigationDrawerItemColors7 = navigationDrawerItemColors5;
                                    boolean z2 = z;
                                    Function2<Composer, Integer, Unit> function213 = function211;
                                    Function2<Composer, Integer, Unit> function214 = function2;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m685paddingqDBjuR0$default);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m3333constructorimpl = Updater.m3333constructorimpl(composer3);
                                    Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1046714334, "C950@39294L203:NavigationDrawer.kt#uh7d8r");
                                    composer3.startReplaceGroup(-449407448);
                                    ComposerKt.sourceInformation(composer3, "946@39101L19,947@39143L78,948@39238L29");
                                    if (function212 != null) {
                                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(navigationDrawerItemColors7.iconColor(z2, composer3, 0).getValue().m3850unboximpl())), function212, composer3, ProvidedValue.$stable);
                                        SpacerKt.Spacer(SizeKt.m731width3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(12)), composer3, 6);
                                    }
                                    composer3.endReplaceGroup();
                                    Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, weight$default);
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
                                    Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 838768153, "C951@39361L19,952@39403L80:NavigationDrawer.kt#uh7d8r");
                                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(navigationDrawerItemColors7.textColor(z2, composer3, 0).getValue().m3850unboximpl())), function214, composer3, ProvidedValue.$stable);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.startReplaceGroup(-449392467);
                                    ComposerKt.sourceInformation(composer3, "955@39547L29,956@39617L20,957@39660L80");
                                    if (function213 != null) {
                                        SpacerKt.Spacer(SizeKt.m731width3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(12)), composer3, 6);
                                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(navigationDrawerItemColors7.badgeColor(z2, composer3, 0).getValue().m3850unboximpl())), function213, composer3, ProvidedValue.$stable);
                                    }
                                    composer3.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), composer2, (i11 & WebSocketProtocol.PAYLOAD_SHORT) | ((i7 >> 6) & 57344), ((i7 >> 24) & 14) | 48, 968);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function28 = function26;
                        function29 = function27;
                        shape5 = shape4;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier3 = modifier4;
                        navigationDrawerItemColors4 = navigationDrawerItemColors6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        mutableInteractionSource3 = mutableInteractionSource;
                        composer2 = startRestartGroup;
                        function28 = function24;
                        function29 = function25;
                        shape5 = shape2;
                        navigationDrawerItemColors4 = navigationDrawerItemColors;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$3
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

                            public final void invoke(Composer composer3, int i12) {
                                NavigationDrawerKt.NavigationDrawerItem(function2, z, function0, modifier3, function28, function29, shape5, navigationDrawerItemColors4, mutableInteractionSource3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                function25 = function23;
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (i6 == 0) {
                }
                navigationDrawerItemColors3 = navigationDrawerItemColors2;
                function26 = function24;
                function27 = function25;
                i7 = i3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i112 = i7 >> 3;
                final Function2<? super Composer, ? super Integer, Unit> function2102 = function26;
                final NavigationDrawerItemColors navigationDrawerItemColors52 = navigationDrawerItemColors3;
                final Function2<? super Composer, ? super Integer, Unit> function2112 = function27;
                Modifier modifier42 = modifier2;
                NavigationDrawerItemColors navigationDrawerItemColors62 = navigationDrawerItemColors3;
                composer2 = startRestartGroup;
                SurfaceKt.m2224Surfaced85dljk(z, function0, SizeKt.fillMaxWidth$default(SizeKt.m714heightInVpY3zN4$default(SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.m5613setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5600getTabo7Vup1c());
                    }
                }, 1, null), NavigationDrawerTokens.INSTANCE.m3003getActiveIndicatorHeightD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z, startRestartGroup, (i112 & 14) | ((i7 >> 18) & 112)).getValue().m3850unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(191488423, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$2
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

                    public final void invoke(Composer composer3, int i12) {
                        ComposerKt.sourceInformation(composer3, "C941@38896L868:NavigationDrawer.kt#uh7d8r");
                        if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(191488423, i12, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:941)");
                            }
                            Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6299constructorimpl(16), 0.0f, Dp.m6299constructorimpl(24), 0.0f, 10, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function212 = function2102;
                            NavigationDrawerItemColors navigationDrawerItemColors7 = navigationDrawerItemColors52;
                            boolean z2 = z;
                            Function2<Composer, Integer, Unit> function213 = function2112;
                            Function2<Composer, Integer, Unit> function214 = function2;
                            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m685paddingqDBjuR0$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer m3333constructorimpl = Updater.m3333constructorimpl(composer3);
                            Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer3, -1046714334, "C950@39294L203:NavigationDrawer.kt#uh7d8r");
                            composer3.startReplaceGroup(-449407448);
                            ComposerKt.sourceInformation(composer3, "946@39101L19,947@39143L78,948@39238L29");
                            if (function212 != null) {
                                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(navigationDrawerItemColors7.iconColor(z2, composer3, 0).getValue().m3850unboximpl())), function212, composer3, ProvidedValue.$stable);
                                SpacerKt.Spacer(SizeKt.m731width3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(12)), composer3, 6);
                            }
                            composer3.endReplaceGroup();
                            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                            ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, weight$default);
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
                            Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer3, 838768153, "C951@39361L19,952@39403L80:NavigationDrawer.kt#uh7d8r");
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(navigationDrawerItemColors7.textColor(z2, composer3, 0).getValue().m3850unboximpl())), function214, composer3, ProvidedValue.$stable);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.startReplaceGroup(-449392467);
                            ComposerKt.sourceInformation(composer3, "955@39547L29,956@39617L20,957@39660L80");
                            if (function213 != null) {
                                SpacerKt.Spacer(SizeKt.m731width3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(12)), composer3, 6);
                                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(navigationDrawerItemColors7.badgeColor(z2, composer3, 0).getValue().m3850unboximpl())), function213, composer3, ProvidedValue.$stable);
                            }
                            composer3.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), composer2, (i112 & WebSocketProtocol.PAYLOAD_SHORT) | ((i7 >> 6) & 57344), ((i7 >> 24) & 14) | 48, 968);
                if (ComposerKt.isTraceInProgress()) {
                }
                function28 = function26;
                function29 = function27;
                shape5 = shape4;
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier3 = modifier42;
                navigationDrawerItemColors4 = navigationDrawerItemColors62;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function24 = function22;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function25 = function23;
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (i6 == 0) {
            }
            navigationDrawerItemColors3 = navigationDrawerItemColors2;
            function26 = function24;
            function27 = function25;
            i7 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1122 = i7 >> 3;
            final Function2<? super Composer, ? super Integer, Unit> function21022 = function26;
            final NavigationDrawerItemColors navigationDrawerItemColors522 = navigationDrawerItemColors3;
            final Function2<? super Composer, ? super Integer, Unit> function21122 = function27;
            Modifier modifier422 = modifier2;
            NavigationDrawerItemColors navigationDrawerItemColors622 = navigationDrawerItemColors3;
            composer2 = startRestartGroup;
            SurfaceKt.m2224Surfaced85dljk(z, function0, SizeKt.fillMaxWidth$default(SizeKt.m714heightInVpY3zN4$default(SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m5613setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5600getTabo7Vup1c());
                }
            }, 1, null), NavigationDrawerTokens.INSTANCE.m3003getActiveIndicatorHeightD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z, startRestartGroup, (i1122 & 14) | ((i7 >> 18) & 112)).getValue().m3850unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(191488423, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$2
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

                public final void invoke(Composer composer3, int i12) {
                    ComposerKt.sourceInformation(composer3, "C941@38896L868:NavigationDrawer.kt#uh7d8r");
                    if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(191488423, i12, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:941)");
                        }
                        Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6299constructorimpl(16), 0.0f, Dp.m6299constructorimpl(24), 0.0f, 10, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function212 = function21022;
                        NavigationDrawerItemColors navigationDrawerItemColors7 = navigationDrawerItemColors522;
                        boolean z2 = z;
                        Function2<Composer, Integer, Unit> function213 = function21122;
                        Function2<Composer, Integer, Unit> function214 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m685paddingqDBjuR0$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3333constructorimpl = Updater.m3333constructorimpl(composer3);
                        Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, -1046714334, "C950@39294L203:NavigationDrawer.kt#uh7d8r");
                        composer3.startReplaceGroup(-449407448);
                        ComposerKt.sourceInformation(composer3, "946@39101L19,947@39143L78,948@39238L29");
                        if (function212 != null) {
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(navigationDrawerItemColors7.iconColor(z2, composer3, 0).getValue().m3850unboximpl())), function212, composer3, ProvidedValue.$stable);
                            SpacerKt.Spacer(SizeKt.m731width3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(12)), composer3, 6);
                        }
                        composer3.endReplaceGroup();
                        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, weight$default);
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
                        Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 838768153, "C951@39361L19,952@39403L80:NavigationDrawer.kt#uh7d8r");
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(navigationDrawerItemColors7.textColor(z2, composer3, 0).getValue().m3850unboximpl())), function214, composer3, ProvidedValue.$stable);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.startReplaceGroup(-449392467);
                        ComposerKt.sourceInformation(composer3, "955@39547L29,956@39617L20,957@39660L80");
                        if (function213 != null) {
                            SpacerKt.Spacer(SizeKt.m731width3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(12)), composer3, 6);
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(navigationDrawerItemColors7.badgeColor(z2, composer3, 0).getValue().m3850unboximpl())), function213, composer3, ProvidedValue.$stable);
                        }
                        composer3.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), composer2, (i1122 & WebSocketProtocol.PAYLOAD_SHORT) | ((i7 >> 6) & 57344), ((i7 >> 24) & 14) | 48, 968);
            if (ComposerKt.isTraceInProgress()) {
            }
            function28 = function26;
            function29 = function27;
            shape5 = shape4;
            mutableInteractionSource3 = mutableInteractionSource2;
            modifier3 = modifier422;
            navigationDrawerItemColors4 = navigationDrawerItemColors622;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function24 = function22;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function25 = function23;
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (i6 == 0) {
        }
        navigationDrawerItemColors3 = navigationDrawerItemColors2;
        function26 = function24;
        function27 = function25;
        i7 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i11222 = i7 >> 3;
        final Function2<? super Composer, ? super Integer, Unit> function210222 = function26;
        final NavigationDrawerItemColors navigationDrawerItemColors5222 = navigationDrawerItemColors3;
        final Function2<? super Composer, ? super Integer, Unit> function211222 = function27;
        Modifier modifier4222 = modifier2;
        NavigationDrawerItemColors navigationDrawerItemColors6222 = navigationDrawerItemColors3;
        composer2 = startRestartGroup;
        SurfaceKt.m2224Surfaced85dljk(z, function0, SizeKt.fillMaxWidth$default(SizeKt.m714heightInVpY3zN4$default(SemanticsModifierKt.semantics$default(modifier2, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                SemanticsPropertiesKt.m5613setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m5600getTabo7Vup1c());
            }
        }, 1, null), NavigationDrawerTokens.INSTANCE.m3003getActiveIndicatorHeightD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), false, shape4, navigationDrawerItemColors3.containerColor(z, startRestartGroup, (i11222 & 14) | ((i7 >> 18) & 112)).getValue().m3850unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(191488423, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$2
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

            public final void invoke(Composer composer3, int i12) {
                ComposerKt.sourceInformation(composer3, "C941@38896L868:NavigationDrawer.kt#uh7d8r");
                if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(191488423, i12, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:941)");
                    }
                    Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6299constructorimpl(16), 0.0f, Dp.m6299constructorimpl(24), 0.0f, 10, null);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function2<Composer, Integer, Unit> function212 = function210222;
                    NavigationDrawerItemColors navigationDrawerItemColors7 = navigationDrawerItemColors5222;
                    boolean z2 = z;
                    Function2<Composer, Integer, Unit> function213 = function211222;
                    Function2<Composer, Integer, Unit> function214 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m685paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer m3333constructorimpl = Updater.m3333constructorimpl(composer3);
                    Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer3, -1046714334, "C950@39294L203:NavigationDrawer.kt#uh7d8r");
                    composer3.startReplaceGroup(-449407448);
                    ComposerKt.sourceInformation(composer3, "946@39101L19,947@39143L78,948@39238L29");
                    if (function212 != null) {
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(navigationDrawerItemColors7.iconColor(z2, composer3, 0).getValue().m3850unboximpl())), function212, composer3, ProvidedValue.$stable);
                        SpacerKt.Spacer(SizeKt.m731width3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(12)), composer3, 6);
                    }
                    composer3.endReplaceGroup();
                    Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, weight$default);
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
                    Updater.m3340setimpl(m3333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer3, 838768153, "C951@39361L19,952@39403L80:NavigationDrawer.kt#uh7d8r");
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(navigationDrawerItemColors7.textColor(z2, composer3, 0).getValue().m3850unboximpl())), function214, composer3, ProvidedValue.$stable);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.startReplaceGroup(-449392467);
                    ComposerKt.sourceInformation(composer3, "955@39547L29,956@39617L20,957@39660L80");
                    if (function213 != null) {
                        SpacerKt.Spacer(SizeKt.m731width3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(12)), composer3, 6);
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(navigationDrawerItemColors7.badgeColor(z2, composer3, 0).getValue().m3850unboximpl())), function213, composer3, ProvidedValue.$stable);
                    }
                    composer3.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), composer2, (i11222 & WebSocketProtocol.PAYLOAD_SHORT) | ((i7 >> 6) & 57344), ((i7 >> 24) & 14) | 48, 968);
        if (ComposerKt.isTraceInProgress()) {
        }
        function28 = function26;
        function29 = function27;
        shape5 = shape4;
        mutableInteractionSource3 = mutableInteractionSource2;
        modifier3 = modifier4222;
        navigationDrawerItemColors4 = navigationDrawerItemColors6222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f, float f2, float f3) {
        return RangesKt.coerceIn((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-Bx497Mc, reason: not valid java name */
    public static final void m1967ScrimBx497Mc(final boolean z, final Function0<Unit> function0, final Function0<Float> function02, final long j, Composer composer, final int i) {
        int i2;
        int i3;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(2106487387);
        ComposerKt.sourceInformation(startRestartGroup, "C(Scrim)P(3,2,1,0:c#ui.graphics.Color)1136@46594L30,1151@47092L39,1151@47041L90:NavigationDrawer.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2106487387, i2, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:1135)");
            }
            Strings.Companion companion2 = Strings.INSTANCE;
            final String m2655getString2EP1pXo = Strings_androidKt.m2655getString2EP1pXo(Strings.m2585constructorimpl(androidx.compose.ui.R.string.close_drawer), startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(-1784754787);
            ComposerKt.sourceInformation(startRestartGroup, "1139@46712L35,1140@46800L187");
            if (z) {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1784753370, "CC(remember):NavigationDrawer.kt#9igjgp");
                int i4 = i2 & 112;
                boolean z2 = i4 == 32;
                NavigationDrawerKt$Scrim$dismissDrawer$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion3, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1784750402, "CC(remember):NavigationDrawer.kt#9igjgp");
                boolean changed = (i4 == 32) | startRestartGroup.changed(m2655getString2EP1pXo);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1
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
                            final Function0<Unit> function03 = function0;
                            SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    function03.invoke();
                                    return true;
                                }
                            }, 1, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                i3 = 1;
                companion = SemanticsModifierKt.semantics(pointerInput, true, (Function1) rememberedValue2);
            } else {
                i3 = 1;
                companion = Modifier.INSTANCE;
            }
            startRestartGroup.endReplaceGroup();
            Modifier then = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, i3, null).then(companion);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1784741206, "CC(remember):NavigationDrawer.kt#9igjgp");
            int i5 = ((i2 & 7168) == 2048 ? i3 : 0) | ((i2 & 896) == 256 ? i3 : 0);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (i5 != 0 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        DrawScope.m4390drawRectnJ9OG0$default(drawScope, j, 0L, 0L, function02.invoke().floatValue(), null, null, 0, 118, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CanvasKt.Canvas(then, (Function1) rememberedValue3, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    NavigationDrawerKt.m1967ScrimBx497Mc(z, function0, function02, j, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
