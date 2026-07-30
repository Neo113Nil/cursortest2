package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlin.ranges.RangesKt;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0083\u0001\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u008f\u0001\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001al\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001ax\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a \u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0007\u001a\u007f\u00104\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u008e\u0001\u00104\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u007f\u0010>\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u0098\u0001\u0010>\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010?\u001a\u00020\u00012\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u007f\u0010B\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u0098\u0001\u0010B\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010?\u001a\u00020\u00012\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010A\u001a\u0092\u0001\u0010D\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010;\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u00107\u001a\u0002082\b\u0010%\u001a\u0004\u0018\u000109H\u0003ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a\u007f\u0010K\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u008e\u0001\u0010K\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\bL\u0010=\u001a£\u0001\u0010M\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020\u001c2\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010E\u001a\u00020F2\u0006\u0010S\u001a\u0002012\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020H2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u0015H\u0003ø\u0001\u0000¢\u0006\u0004\b[\u0010\\\u001aµ\u0001\u0010]\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010E\u001a\u00020F2\u0006\u0010X\u001a\u00020\u00012\u0011\u0010^\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010_\u001a\u00020F2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010?\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u00107\u001a\u0002082\b\u0010%\u001a\u0004\u0018\u000109H\u0003ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a+\u0010b\u001a\u00020/2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u000201H\u0007¢\u0006\u0002\u0010c\u001a+\u0010d\u001a\u00020e2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u000201H\u0007¢\u0006\u0002\u0010f\u001a>\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020e2\u0006\u0010j\u001a\u0002012\u000e\u0010k\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010l2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010nH\u0082@¢\u0006\u0002\u0010o\u001a>\u0010p\u001a\u00020h2\u0006\u0010i\u001a\u00020/2\u0006\u0010j\u001a\u0002012\u000e\u0010k\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010l2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010nH\u0082@¢\u0006\u0002\u0010q\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006r²\u0006\n\u0010s\u001a\u000201X\u008a\u0084\u0002²\u0006\n\u0010t\u001a\u00020\u001cX\u008a\u0084\u0002"}, d2 = {"BottomAppBarHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "BottomAppBarVerticalPadding", "getBottomAppBarVerticalPadding", "()F", "FABHorizontalPadding", "FABVerticalPadding", "LargeTitleBottomPadding", "MediumTitleBottomPadding", "TopAppBarHorizontalPadding", "TopAppBarTitleInset", "TopTitleAlphaEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "getTopTitleAlphaEasing", "()Landroidx/compose/animation/core/CubicBezierEasing;", "BottomAppBar", "", "actions", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "floatingActionButton", "Lkotlin/Function0;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "BottomAppBar-Snr_uVM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;II)V", "scrollBehavior", "Landroidx/compose/material3/BottomAppBarScrollBehavior;", "BottomAppBar-qhFBPw4", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "content", "BottomAppBar-1oL4kX8", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar-e-3WI5M", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBarState", "Landroidx/compose/material3/BottomAppBarState;", "initialHeightOffsetLimit", "", "initialHeightOffset", "initialContentOffset", "CenterAlignedTopAppBar", "title", "navigationIcon", "colors", "Landroidx/compose/material3/TopAppBarColors;", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "expandedHeight", "CenterAlignedTopAppBar-GHTll3U", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "LargeTopAppBar", "collapsedHeight", "LargeTopAppBar-oKE7A98", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "MediumTopAppBar", "MediumTopAppBar-oKE7A98", "SingleRowTopAppBar", "titleTextStyle", "Landroidx/compose/ui/text/TextStyle;", "centeredTitle", "", "SingleRowTopAppBar-cJHQLPU", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "TopAppBar", "TopAppBar-GHTll3U", "TopAppBarLayout", "scrolledOffset", "Landroidx/compose/material3/ScrolledOffset;", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "titleAlpha", "titleVerticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "titleHorizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "titleBottomPadding", "", "hideTitleSemantics", "TopAppBarLayout-kXwM9vE", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/ScrolledOffset;JJJLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TwoRowsTopAppBar", "smallTitle", "smallTitleTextStyle", "TwoRowsTopAppBar-nS6u9G4", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "rememberBottomAppBarState", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomAppBarState;", "rememberTopAppBarState", "Landroidx/compose/material3/TopAppBarState;", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarState;", "settleAppBar", "Landroidx/compose/ui/unit/Velocity;", "state", "velocity", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/material3/TopAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settleAppBarBottom", "(Landroidx/compose/material3/BottomAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release", "colorTransitionFraction", "appBarContainerColor"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt {
    private static final float BottomAppBarHorizontalPadding;
    private static final float BottomAppBarVerticalPadding;
    private static final float FABHorizontalPadding;
    private static final float FABVerticalPadding;
    private static final float LargeTitleBottomPadding;
    private static final float MediumTitleBottomPadding;
    private static final float TopAppBarHorizontalPadding;
    private static final float TopAppBarTitleInset;
    private static final CubicBezierEasing TopTitleAlphaEasing;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006d  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of TopAppBar with expandedHeight parameter")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TopAppBar(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function23;
        int i5;
        Function3 function32;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier.Companion companion;
        int i7;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function3 function33;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        final Function3 function34;
        final Function2 function24;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        final TopAppBarColors topAppBarColors4;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1906353009);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)P(5,2,3!1,6)142@6819L12,143@6881L17,146@6960L306:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
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
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            if (startRestartGroup.changed(windowInsets2)) {
                                i9 = 16384;
                                i3 |= i9;
                            }
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i9 = 8192;
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColors2 = topAppBarColors;
                            if (startRestartGroup.changed(topAppBarColors2)) {
                                i8 = 131072;
                                i3 |= i8;
                            }
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        topAppBarColors2 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        i3 |= startRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function23 = ComposableSingletons$AppBarKt.INSTANCE.m1619getLambda1$material3_release();
                                }
                                if (i5 != 0) {
                                    function32 = ComposableSingletons$AppBarKt.INSTANCE.m1629getLambda2$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                }
                                if (i6 != 0) {
                                    i7 = i3;
                                    topAppBarScrollBehavior3 = null;
                                    function33 = function32;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1906353009, i7, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:146)");
                                    }
                                    int i11 = (i7 & 14) | 24576 | (i7 & 112) | (i7 & 896) | (i7 & 7168);
                                    int i12 = i7 << 3;
                                    m1452TopAppBarGHTll3U(function2, companion, function23, function33, TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM(), windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, startRestartGroup, i11 | (458752 & i12) | (3670016 & i12) | (i12 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    windowInsets2 = windowInsets3;
                                    function34 = function33;
                                    function24 = function23;
                                    topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                                    topAppBarColors4 = topAppBarColors3;
                                    modifier2 = companion;
                                } else {
                                    i7 = i3;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i7 = i3;
                                companion = modifier2;
                            }
                            function33 = function32;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = (i7 & 14) | 24576 | (i7 & 112) | (i7 & 896) | (i7 & 7168);
                            int i122 = i7 << 3;
                            m1452TopAppBarGHTll3U(function2, companion, function23, function33, TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM(), windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, startRestartGroup, i112 | (458752 & i122) | (3670016 & i122) | (i122 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            windowInsets2 = windowInsets3;
                            function34 = function33;
                            function24 = function23;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                            topAppBarColors4 = topAppBarColors3;
                            modifier2 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            function24 = function23;
                            function34 = function32;
                            topAppBarColors4 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final WindowInsets windowInsets4 = windowInsets2;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$1
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
                                    AppBarKt.TopAppBar(function2, modifier3, function24, function34, windowInsets4, topAppBarColors4, topAppBarScrollBehavior4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i3) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                }
                function32 = function3;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
            }
            function23 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e4  */
    /* renamed from: TopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1452TopAppBarGHTll3U(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        float f2;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i7;
        final Modifier.Companion companion;
        final TopAppBarScrollBehavior topAppBarScrollBehavior2;
        final float f3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final TopAppBarColors topAppBarColors3;
        final WindowInsets windowInsets3;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(226148675);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBar)P(6,3,4!1,2:c#ui.unit.Dp,7)204@9890L12,205@9952L17,211@10162L5,208@10031L579:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f2 = f;
                        i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                windowInsets2 = windowInsets;
                                if (startRestartGroup.changed(windowInsets2)) {
                                    i9 = 131072;
                                    i3 |= i9;
                                }
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            i9 = 65536;
                            i3 |= i9;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                topAppBarColors2 = topAppBarColors;
                                if (startRestartGroup.changed(topAppBarColors2)) {
                                    i8 = 1048576;
                                    i3 |= i8;
                                }
                            } else {
                                topAppBarColors2 = topAppBarColors;
                            }
                            i8 = 524288;
                            i3 |= i8;
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? 8388608 : 4194304;
                        }
                        if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i10 != 0 ? Modifier.INSTANCE : modifier;
                                if (i4 != 0) {
                                    function23 = ComposableSingletons$AppBarKt.INSTANCE.m1630getLambda3$material3_release();
                                }
                                if (i5 != 0) {
                                    function32 = ComposableSingletons$AppBarKt.INSTANCE.m1631getLambda4$material3_release();
                                }
                                if (i6 != 0) {
                                    f2 = TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM();
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(startRestartGroup, 6);
                                }
                                if (i7 != 0) {
                                    topAppBarScrollBehavior2 = null;
                                    Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34 = function32;
                                    WindowInsets windowInsets4 = windowInsets2;
                                    TopAppBarColors topAppBarColors4 = topAppBarColors2;
                                    int i11 = i3;
                                    float f4 = f2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(226148675, i11, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:208)");
                                    }
                                    int i12 = i11 << 6;
                                    m1451SingleRowTopAppBarcJHQLPU(companion, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), false, function23, function34, (!Dp.m6304equalsimpl0(f4, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(f4, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM() : f4, windowInsets4, topAppBarColors4, topAppBarScrollBehavior2, startRestartGroup, (57344 & i12) | ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & 112) | (458752 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f3 = f4;
                                    function24 = function23;
                                    topAppBarColors3 = topAppBarColors4;
                                    windowInsets3 = windowInsets4;
                                    function33 = function34;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                companion = modifier;
                            }
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function342 = function32;
                            WindowInsets windowInsets42 = windowInsets2;
                            TopAppBarColors topAppBarColors42 = topAppBarColors2;
                            int i112 = i3;
                            float f42 = f2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i122 = i112 << 6;
                            m1451SingleRowTopAppBarcJHQLPU(companion, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), false, function23, function342, (!Dp.m6304equalsimpl0(f42, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(f42, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM() : f42, windowInsets42, topAppBarColors42, topAppBarScrollBehavior2, startRestartGroup, (57344 & i122) | ((i112 >> 3) & 14) | 3072 | ((i112 << 3) & 112) | (458752 & i122) | (29360128 & i122) | (234881024 & i122) | (i122 & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f3 = f42;
                            function24 = function23;
                            topAppBarColors3 = topAppBarColors42;
                            windowInsets3 = windowInsets42;
                            function33 = function342;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            function24 = function23;
                            function33 = function32;
                            f3 = f2;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBar$2
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
                                    AppBarKt.m1452TopAppBarGHTll3U(function2, companion, function24, function33, f3, windowInsets3, topAppBarColors3, topAppBarScrollBehavior2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    f2 = f;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if ((i3 & 4793491) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3422 = function32;
                    WindowInsets windowInsets422 = windowInsets2;
                    TopAppBarColors topAppBarColors422 = topAppBarColors2;
                    int i1122 = i3;
                    float f422 = f2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1222 = i1122 << 6;
                    m1451SingleRowTopAppBarcJHQLPU(companion, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), false, function23, function3422, (!Dp.m6304equalsimpl0(f422, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(f422, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM() : f422, windowInsets422, topAppBarColors422, topAppBarScrollBehavior2, startRestartGroup, (57344 & i1222) | ((i1122 >> 3) & 14) | 3072 | ((i1122 << 3) & 112) | (458752 & i1222) | (29360128 & i1222) | (234881024 & i1222) | (i1222 & 1879048192), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f3 = f422;
                    function24 = function23;
                    topAppBarColors3 = topAppBarColors422;
                    windowInsets3 = windowInsets422;
                    function33 = function3422;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function32 = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f2 = f;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if (i7 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34222 = function32;
                WindowInsets windowInsets4222 = windowInsets2;
                TopAppBarColors topAppBarColors4222 = topAppBarColors2;
                int i11222 = i3;
                float f4222 = f2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i12222 = i11222 << 6;
                m1451SingleRowTopAppBarcJHQLPU(companion, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), false, function23, function34222, (!Dp.m6304equalsimpl0(f4222, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(f4222, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM() : f4222, windowInsets4222, topAppBarColors4222, topAppBarScrollBehavior2, startRestartGroup, (57344 & i12222) | ((i11222 >> 3) & 14) | 3072 | ((i11222 << 3) & 112) | (458752 & i12222) | (29360128 & i12222) | (234881024 & i12222) | (i12222 & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f3 = f4222;
                function24 = function23;
                topAppBarColors3 = topAppBarColors4222;
                windowInsets3 = windowInsets4222;
                function33 = function34222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f2 = f;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (i7 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function342222 = function32;
            WindowInsets windowInsets42222 = windowInsets2;
            TopAppBarColors topAppBarColors42222 = topAppBarColors2;
            int i112222 = i3;
            float f42222 = f2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i122222 = i112222 << 6;
            m1451SingleRowTopAppBarcJHQLPU(companion, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), false, function23, function342222, (!Dp.m6304equalsimpl0(f42222, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(f42222, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM() : f42222, windowInsets42222, topAppBarColors42222, topAppBarScrollBehavior2, startRestartGroup, (57344 & i122222) | ((i112222 >> 3) & 14) | 3072 | ((i112222 << 3) & 112) | (458752 & i122222) | (29360128 & i122222) | (234881024 & i122222) | (i122222 & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            f3 = f42222;
            function24 = function23;
            topAppBarColors3 = topAppBarColors42222;
            windowInsets3 = windowInsets42222;
            function33 = function342222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i7 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3422222 = function32;
        WindowInsets windowInsets422222 = windowInsets2;
        TopAppBarColors topAppBarColors422222 = topAppBarColors2;
        int i1122222 = i3;
        float f422222 = f2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1222222 = i1122222 << 6;
        m1451SingleRowTopAppBarcJHQLPU(companion, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), false, function23, function3422222, (!Dp.m6304equalsimpl0(f422222, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(f422222, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM() : f422222, windowInsets422222, topAppBarColors422222, topAppBarScrollBehavior2, startRestartGroup, (57344 & i1222222) | ((i1122222 >> 3) & 14) | 3072 | ((i1122222 << 3) & 112) | (458752 & i1222222) | (29360128 & i1222222) | (234881024 & i1222222) | (i1222222 & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        f3 = f422222;
        function24 = function23;
        topAppBarColors3 = topAppBarColors422222;
        windowInsets3 = windowInsets422222;
        function33 = function3422222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006d  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of CenterAlignedTopAppBar with expandedHeight parameter")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void CenterAlignedTopAppBar(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function23;
        int i5;
        Function3 function32;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier.Companion companion;
        int i7;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function3 function33;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        final Function3 function34;
        final Function2 function24;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        final TopAppBarColors topAppBarColors4;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-2139286460);
        ComposerKt.sourceInformation(startRestartGroup, "C(CenterAlignedTopAppBar)P(5,2,3!1,6)269@12968L12,270@13030L30,273@13122L319:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
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
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            if (startRestartGroup.changed(windowInsets2)) {
                                i9 = 16384;
                                i3 |= i9;
                            }
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i9 = 8192;
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColors2 = topAppBarColors;
                            if (startRestartGroup.changed(topAppBarColors2)) {
                                i8 = 131072;
                                i3 |= i8;
                            }
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        topAppBarColors2 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        i3 |= startRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function23 = ComposableSingletons$AppBarKt.INSTANCE.m1632getLambda5$material3_release();
                                }
                                if (i5 != 0) {
                                    function32 = ComposableSingletons$AppBarKt.INSTANCE.m1633getLambda6$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.centerAlignedTopAppBarColors(startRestartGroup, 6);
                                }
                                if (i6 != 0) {
                                    i7 = i3;
                                    topAppBarScrollBehavior3 = null;
                                    function33 = function32;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2139286460, i7, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:273)");
                                    }
                                    int i11 = (i7 & 14) | 24576 | (i7 & 112) | (i7 & 896) | (i7 & 7168);
                                    int i12 = i7 << 3;
                                    m1448CenterAlignedTopAppBarGHTll3U(function2, companion, function23, function33, TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM(), windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, startRestartGroup, i11 | (458752 & i12) | (3670016 & i12) | (i12 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    windowInsets2 = windowInsets3;
                                    function34 = function33;
                                    function24 = function23;
                                    topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                                    topAppBarColors4 = topAppBarColors3;
                                    modifier2 = companion;
                                } else {
                                    i7 = i3;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i7 = i3;
                                companion = modifier2;
                            }
                            function33 = function32;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = (i7 & 14) | 24576 | (i7 & 112) | (i7 & 896) | (i7 & 7168);
                            int i122 = i7 << 3;
                            m1448CenterAlignedTopAppBarGHTll3U(function2, companion, function23, function33, TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM(), windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, startRestartGroup, i112 | (458752 & i122) | (3670016 & i122) | (i122 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            windowInsets2 = windowInsets3;
                            function34 = function33;
                            function24 = function23;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                            topAppBarColors4 = topAppBarColors3;
                            modifier2 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            function24 = function23;
                            function34 = function32;
                            topAppBarColors4 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final WindowInsets windowInsets4 = windowInsets2;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$CenterAlignedTopAppBar$1
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
                                    AppBarKt.CenterAlignedTopAppBar(function2, modifier3, function24, function34, windowInsets4, topAppBarColors4, topAppBarScrollBehavior4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i3) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                }
                function32 = function3;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
            }
            function23 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e4  */
    /* renamed from: CenterAlignedTopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1448CenterAlignedTopAppBarGHTll3U(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        float f2;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i7;
        final Modifier.Companion companion;
        final TopAppBarScrollBehavior topAppBarScrollBehavior2;
        final float f3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final TopAppBarColors topAppBarColors3;
        final WindowInsets windowInsets3;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1952988048);
        ComposerKt.sourceInformation(startRestartGroup, "C(CenterAlignedTopAppBar)P(6,3,4!1,2:c#ui.unit.Dp,7)328@16080L12,329@16142L30,335@16365L5,332@16234L578:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f2 = f;
                        i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                windowInsets2 = windowInsets;
                                if (startRestartGroup.changed(windowInsets2)) {
                                    i9 = 131072;
                                    i3 |= i9;
                                }
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            i9 = 65536;
                            i3 |= i9;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                topAppBarColors2 = topAppBarColors;
                                if (startRestartGroup.changed(topAppBarColors2)) {
                                    i8 = 1048576;
                                    i3 |= i8;
                                }
                            } else {
                                topAppBarColors2 = topAppBarColors;
                            }
                            i8 = 524288;
                            i3 |= i8;
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? 8388608 : 4194304;
                        }
                        if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i10 != 0 ? Modifier.INSTANCE : modifier;
                                if (i4 != 0) {
                                    function23 = ComposableSingletons$AppBarKt.INSTANCE.m1634getLambda7$material3_release();
                                }
                                if (i5 != 0) {
                                    function32 = ComposableSingletons$AppBarKt.INSTANCE.m1635getLambda8$material3_release();
                                }
                                if (i6 != 0) {
                                    f2 = TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM();
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.centerAlignedTopAppBarColors(startRestartGroup, 6);
                                }
                                if (i7 != 0) {
                                    topAppBarScrollBehavior2 = null;
                                    Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34 = function32;
                                    WindowInsets windowInsets4 = windowInsets2;
                                    TopAppBarColors topAppBarColors4 = topAppBarColors2;
                                    int i11 = i3;
                                    float f4 = f2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1952988048, i11, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                                    }
                                    int i12 = i11 << 6;
                                    m1451SingleRowTopAppBarcJHQLPU(companion, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), true, function23, function34, (!Dp.m6304equalsimpl0(f4, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(f4, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM() : f4, windowInsets4, topAppBarColors4, topAppBarScrollBehavior2, startRestartGroup, (57344 & i12) | ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & 112) | (458752 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f3 = f4;
                                    function24 = function23;
                                    topAppBarColors3 = topAppBarColors4;
                                    windowInsets3 = windowInsets4;
                                    function33 = function34;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                companion = modifier;
                            }
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function342 = function32;
                            WindowInsets windowInsets42 = windowInsets2;
                            TopAppBarColors topAppBarColors42 = topAppBarColors2;
                            int i112 = i3;
                            float f42 = f2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i122 = i112 << 6;
                            m1451SingleRowTopAppBarcJHQLPU(companion, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), true, function23, function342, (!Dp.m6304equalsimpl0(f42, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(f42, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM() : f42, windowInsets42, topAppBarColors42, topAppBarScrollBehavior2, startRestartGroup, (57344 & i122) | ((i112 >> 3) & 14) | 3072 | ((i112 << 3) & 112) | (458752 & i122) | (29360128 & i122) | (234881024 & i122) | (i122 & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f3 = f42;
                            function24 = function23;
                            topAppBarColors3 = topAppBarColors42;
                            windowInsets3 = windowInsets42;
                            function33 = function342;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            function24 = function23;
                            function33 = function32;
                            f3 = f2;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$CenterAlignedTopAppBar$2
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
                                    AppBarKt.m1448CenterAlignedTopAppBarGHTll3U(function2, companion, function24, function33, f3, windowInsets3, topAppBarColors3, topAppBarScrollBehavior2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    f2 = f;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if ((i3 & 4793491) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3422 = function32;
                    WindowInsets windowInsets422 = windowInsets2;
                    TopAppBarColors topAppBarColors422 = topAppBarColors2;
                    int i1122 = i3;
                    float f422 = f2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1222 = i1122 << 6;
                    m1451SingleRowTopAppBarcJHQLPU(companion, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), true, function23, function3422, (!Dp.m6304equalsimpl0(f422, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(f422, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM() : f422, windowInsets422, topAppBarColors422, topAppBarScrollBehavior2, startRestartGroup, (57344 & i1222) | ((i1122 >> 3) & 14) | 3072 | ((i1122 << 3) & 112) | (458752 & i1222) | (29360128 & i1222) | (234881024 & i1222) | (i1222 & 1879048192), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f3 = f422;
                    function24 = function23;
                    topAppBarColors3 = topAppBarColors422;
                    windowInsets3 = windowInsets422;
                    function33 = function3422;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function32 = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f2 = f;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if (i7 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34222 = function32;
                WindowInsets windowInsets4222 = windowInsets2;
                TopAppBarColors topAppBarColors4222 = topAppBarColors2;
                int i11222 = i3;
                float f4222 = f2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i12222 = i11222 << 6;
                m1451SingleRowTopAppBarcJHQLPU(companion, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), true, function23, function34222, (!Dp.m6304equalsimpl0(f4222, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(f4222, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM() : f4222, windowInsets4222, topAppBarColors4222, topAppBarScrollBehavior2, startRestartGroup, (57344 & i12222) | ((i11222 >> 3) & 14) | 3072 | ((i11222 << 3) & 112) | (458752 & i12222) | (29360128 & i12222) | (234881024 & i12222) | (i12222 & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f3 = f4222;
                function24 = function23;
                topAppBarColors3 = topAppBarColors4222;
                windowInsets3 = windowInsets4222;
                function33 = function34222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f2 = f;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (i7 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function342222 = function32;
            WindowInsets windowInsets42222 = windowInsets2;
            TopAppBarColors topAppBarColors42222 = topAppBarColors2;
            int i112222 = i3;
            float f42222 = f2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i122222 = i112222 << 6;
            m1451SingleRowTopAppBarcJHQLPU(companion, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), true, function23, function342222, (!Dp.m6304equalsimpl0(f42222, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(f42222, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM() : f42222, windowInsets42222, topAppBarColors42222, topAppBarScrollBehavior2, startRestartGroup, (57344 & i122222) | ((i112222 >> 3) & 14) | 3072 | ((i112222 << 3) & 112) | (458752 & i122222) | (29360128 & i122222) | (234881024 & i122222) | (i122222 & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            f3 = f42222;
            function24 = function23;
            topAppBarColors3 = topAppBarColors42222;
            windowInsets3 = windowInsets42222;
            function33 = function342222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i7 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3422222 = function32;
        WindowInsets windowInsets422222 = windowInsets2;
        TopAppBarColors topAppBarColors422222 = topAppBarColors2;
        int i1122222 = i3;
        float f422222 = f2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1222222 = i1122222 << 6;
        m1451SingleRowTopAppBarcJHQLPU(companion, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), true, function23, function3422222, (!Dp.m6304equalsimpl0(f422222, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(f422222, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2541getTopAppBarExpandedHeightD9Ej5fM() : f422222, windowInsets422222, topAppBarColors422222, topAppBarScrollBehavior2, startRestartGroup, (57344 & i1222222) | ((i1122222 >> 3) & 14) | 3072 | ((i1122222 << 3) & 112) | (458752 & i1222222) | (29360128 & i1222222) | (234881024 & i1222222) | (i1222222 & 1879048192), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        f3 = f422222;
        function24 = function23;
        topAppBarColors3 = topAppBarColors422222;
        windowInsets3 = windowInsets422222;
        function33 = function3422222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006d  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of MediumTopAppBar with collapsedHeight and expandedHeight parameters")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void MediumTopAppBar(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function23;
        int i5;
        Function3 function32;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier.Companion companion;
        int i7;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function3 function33;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        final Function3 function34;
        final Function2 function24;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        final TopAppBarColors topAppBarColors4;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1805417862);
        ComposerKt.sourceInformation(startRestartGroup, "C(MediumTopAppBar)P(5,2,3!1,6)396@19336L12,397@19398L23,400@19483L388:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
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
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            if (startRestartGroup.changed(windowInsets2)) {
                                i9 = 16384;
                                i3 |= i9;
                            }
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i9 = 8192;
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColors2 = topAppBarColors;
                            if (startRestartGroup.changed(topAppBarColors2)) {
                                i8 = 131072;
                                i3 |= i8;
                            }
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        topAppBarColors2 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        i3 |= startRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function23 = ComposableSingletons$AppBarKt.INSTANCE.m1636getLambda9$material3_release();
                                }
                                if (i5 != 0) {
                                    function32 = ComposableSingletons$AppBarKt.INSTANCE.m1620getLambda10$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.mediumTopAppBarColors(startRestartGroup, 6);
                                }
                                if (i6 != 0) {
                                    i7 = i3;
                                    topAppBarScrollBehavior3 = null;
                                    function33 = function32;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1805417862, i7, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:400)");
                                    }
                                    int i11 = (i7 & 14) | 221184 | (i7 & 112) | (i7 & 896) | (i7 & 7168);
                                    int i12 = i7 << 6;
                                    m1450MediumTopAppBaroKE7A98(function2, companion, function23, function33, TopAppBarDefaults.INSTANCE.m2539getMediumAppBarCollapsedHeightD9Ej5fM(), TopAppBarDefaults.INSTANCE.m2540getMediumAppBarExpandedHeightD9Ej5fM(), windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, startRestartGroup, i11 | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    windowInsets2 = windowInsets3;
                                    function34 = function33;
                                    function24 = function23;
                                    topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                                    topAppBarColors4 = topAppBarColors3;
                                    modifier2 = companion;
                                } else {
                                    i7 = i3;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i7 = i3;
                                companion = modifier2;
                            }
                            function33 = function32;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = (i7 & 14) | 221184 | (i7 & 112) | (i7 & 896) | (i7 & 7168);
                            int i122 = i7 << 6;
                            m1450MediumTopAppBaroKE7A98(function2, companion, function23, function33, TopAppBarDefaults.INSTANCE.m2539getMediumAppBarCollapsedHeightD9Ej5fM(), TopAppBarDefaults.INSTANCE.m2540getMediumAppBarExpandedHeightD9Ej5fM(), windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, startRestartGroup, i112 | (3670016 & i122) | (29360128 & i122) | (i122 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            windowInsets2 = windowInsets3;
                            function34 = function33;
                            function24 = function23;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                            topAppBarColors4 = topAppBarColors3;
                            modifier2 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            function24 = function23;
                            function34 = function32;
                            topAppBarColors4 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final WindowInsets windowInsets4 = windowInsets2;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$MediumTopAppBar$1
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
                                    AppBarKt.MediumTopAppBar(function2, modifier3, function24, function34, windowInsets4, topAppBarColors4, topAppBarScrollBehavior4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i3) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                }
                function32 = function3;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
            }
            function23 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019e  */
    /* renamed from: MediumTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1450MediumTopAppBaroKE7A98(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        float f3;
        int i7;
        float f4;
        int i8;
        final Modifier.Companion companion;
        Function2<? super Composer, ? super Integer, Unit> m1621getLambda11$material3_release;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> m1622getLambda12$material3_release;
        float m2539getMediumAppBarCollapsedHeightD9Ej5fM;
        float m2540getMediumAppBarExpandedHeightD9Ej5fM;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        TopAppBarColors topAppBarColors3;
        int i9;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        final float f5;
        final WindowInsets windowInsets3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final float f6;
        final TopAppBarColors topAppBarColors4;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1879191686);
        ComposerKt.sourceInformation(startRestartGroup, "C(MediumTopAppBar)P(7,4,5!1,1:c#ui.unit.Dp,3:c#ui.unit.Dp,8)465@23246L12,466@23308L23,472@23523L5,473@23594L5,469@23393L947:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f3 = f;
                        i3 |= startRestartGroup.changed(f3) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            f4 = f2;
                            i3 |= startRestartGroup.changed(f4) ? 131072 : 65536;
                            if ((i & 1572864) == 0) {
                                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(windowInsets)) ? 1048576 : 524288;
                            }
                            if ((i & 12582912) == 0) {
                                if ((i2 & 128) == 0 && startRestartGroup.changed(topAppBarColors)) {
                                    i10 = 8388608;
                                    i3 |= i10;
                                }
                                i10 = 4194304;
                                i3 |= i10;
                            }
                            i8 = i2 & 256;
                            if (i8 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i11 == 0 ? Modifier.INSTANCE : modifier;
                                    m1621getLambda11$material3_release = i4 == 0 ? ComposableSingletons$AppBarKt.INSTANCE.m1621getLambda11$material3_release() : function23;
                                    m1622getLambda12$material3_release = i5 == 0 ? ComposableSingletons$AppBarKt.INSTANCE.m1622getLambda12$material3_release() : function32;
                                    m2539getMediumAppBarCollapsedHeightD9Ej5fM = i6 == 0 ? TopAppBarDefaults.INSTANCE.m2539getMediumAppBarCollapsedHeightD9Ej5fM() : f3;
                                    m2540getMediumAppBarExpandedHeightD9Ej5fM = i7 == 0 ? TopAppBarDefaults.INSTANCE.m2540getMediumAppBarExpandedHeightD9Ej5fM() : f4;
                                    if ((i2 & 64) == 0) {
                                        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                        i3 &= -3670017;
                                    } else {
                                        windowInsets2 = windowInsets;
                                    }
                                    if ((i2 & 128) == 0) {
                                        topAppBarColors2 = TopAppBarDefaults.INSTANCE.mediumTopAppBarColors(startRestartGroup, 6);
                                        i3 &= -29360129;
                                    } else {
                                        topAppBarColors2 = topAppBarColors;
                                    }
                                    if (i8 == 0) {
                                        int i12 = i3;
                                        topAppBarScrollBehavior2 = null;
                                        topAppBarColors3 = topAppBarColors2;
                                        i9 = i12;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1879191686, i9, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:469)");
                                        }
                                        int i13 = i9 << 12;
                                        m1454TwoRowsTopAppBarnS6u9G4(companion, function2, TypographyKt.getValue(TopAppBarMediumTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), MediumTitleBottomPadding, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), m1621getLambda11$material3_release, m1622getLambda12$material3_release, (!Dp.m6304equalsimpl0(m2539getMediumAppBarCollapsedHeightD9Ej5fM, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(m2539getMediumAppBarCollapsedHeightD9Ej5fM, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2539getMediumAppBarCollapsedHeightD9Ej5fM() : m2539getMediumAppBarCollapsedHeightD9Ej5fM, (!Dp.m6304equalsimpl0(m2540getMediumAppBarExpandedHeightD9Ej5fM, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(m2540getMediumAppBarExpandedHeightD9Ej5fM, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2540getMediumAppBarExpandedHeightD9Ej5fM() : m2540getMediumAppBarExpandedHeightD9Ej5fM, windowInsets2, topAppBarColors3, topAppBarScrollBehavior2, startRestartGroup, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112) | (i13 & 57344) | (i13 & 3670016) | (i13 & 29360128), (i9 >> 18) & 1022, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        f5 = m2539getMediumAppBarCollapsedHeightD9Ej5fM;
                                        windowInsets3 = windowInsets2;
                                        topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                        function24 = m1621getLambda11$material3_release;
                                        function33 = m1622getLambda12$material3_release;
                                        f6 = m2540getMediumAppBarExpandedHeightD9Ej5fM;
                                        topAppBarColors4 = topAppBarColors3;
                                    } else {
                                        topAppBarColors3 = topAppBarColors2;
                                        i9 = i3;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i3 &= -29360129;
                                    }
                                    companion = modifier;
                                    topAppBarColors3 = topAppBarColors;
                                    i9 = i3;
                                    m1621getLambda11$material3_release = function23;
                                    m1622getLambda12$material3_release = function32;
                                    m2539getMediumAppBarCollapsedHeightD9Ej5fM = f3;
                                    m2540getMediumAppBarExpandedHeightD9Ej5fM = f4;
                                    windowInsets2 = windowInsets;
                                }
                                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i132 = i9 << 12;
                                m1454TwoRowsTopAppBarnS6u9G4(companion, function2, TypographyKt.getValue(TopAppBarMediumTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), MediumTitleBottomPadding, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), m1621getLambda11$material3_release, m1622getLambda12$material3_release, (!Dp.m6304equalsimpl0(m2539getMediumAppBarCollapsedHeightD9Ej5fM, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(m2539getMediumAppBarCollapsedHeightD9Ej5fM, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2539getMediumAppBarCollapsedHeightD9Ej5fM() : m2539getMediumAppBarCollapsedHeightD9Ej5fM, (!Dp.m6304equalsimpl0(m2540getMediumAppBarExpandedHeightD9Ej5fM, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(m2540getMediumAppBarExpandedHeightD9Ej5fM, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2540getMediumAppBarExpandedHeightD9Ej5fM() : m2540getMediumAppBarExpandedHeightD9Ej5fM, windowInsets2, topAppBarColors3, topAppBarScrollBehavior2, startRestartGroup, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112) | (i132 & 57344) | (i132 & 3670016) | (i132 & 29360128), (i9 >> 18) & 1022, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f5 = m2539getMediumAppBarCollapsedHeightD9Ej5fM;
                                windowInsets3 = windowInsets2;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                function24 = m1621getLambda11$material3_release;
                                function33 = m1622getLambda12$material3_release;
                                f6 = m2540getMediumAppBarExpandedHeightD9Ej5fM;
                                topAppBarColors4 = topAppBarColors3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                companion = modifier;
                                topAppBarColors4 = topAppBarColors;
                                function24 = function23;
                                function33 = function32;
                                f5 = f3;
                                f6 = f4;
                                windowInsets3 = windowInsets;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                            }
                            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$MediumTopAppBar$2
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
                                        AppBarKt.m1450MediumTopAppBaroKE7A98(function2, companion, function24, function33, f5, f6, windowInsets3, topAppBarColors4, topAppBarScrollBehavior3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        f4 = f2;
                        if ((i & 1572864) == 0) {
                        }
                        if ((i & 12582912) == 0) {
                        }
                        i8 = i2 & 256;
                        if (i8 == 0) {
                        }
                        if ((i3 & 38347923) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                        if (i8 == 0) {
                        }
                    }
                    f3 = f;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    f4 = f2;
                    if ((i & 1572864) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                    }
                    if ((i3 & 38347923) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    if (i8 == 0) {
                    }
                }
                function32 = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f3 = f;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                f4 = f2;
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (i8 == 0) {
                }
            }
            function23 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f3 = f;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            f4 = f2;
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (i8 == 0) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f3 = f;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        f4 = f2;
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (i8 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006d  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of LargeTopAppBar with collapsedHeight and expandedHeight parameters")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LargeTopAppBar(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function23;
        int i5;
        Function3 function32;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier.Companion companion;
        int i7;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function3 function33;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        final Function3 function34;
        final Function2 function24;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        final TopAppBarColors topAppBarColors4;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-474540752);
        ComposerKt.sourceInformation(startRestartGroup, "C(LargeTopAppBar)P(5,2,3!1,6)541@26855L12,542@26917L22,545@27001L385:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
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
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            if (startRestartGroup.changed(windowInsets2)) {
                                i9 = 16384;
                                i3 |= i9;
                            }
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i9 = 8192;
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColors2 = topAppBarColors;
                            if (startRestartGroup.changed(topAppBarColors2)) {
                                i8 = 131072;
                                i3 |= i8;
                            }
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        topAppBarColors2 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                        i3 |= startRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i10 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function23 = ComposableSingletons$AppBarKt.INSTANCE.m1623getLambda13$material3_release();
                                }
                                if (i5 != 0) {
                                    function32 = ComposableSingletons$AppBarKt.INSTANCE.m1624getLambda14$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.largeTopAppBarColors(startRestartGroup, 6);
                                }
                                if (i6 != 0) {
                                    i7 = i3;
                                    topAppBarScrollBehavior3 = null;
                                    function33 = function32;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-474540752, i7, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:545)");
                                    }
                                    int i11 = (i7 & 14) | 221184 | (i7 & 112) | (i7 & 896) | (i7 & 7168);
                                    int i12 = i7 << 6;
                                    m1449LargeTopAppBaroKE7A98(function2, companion, function23, function33, TopAppBarDefaults.INSTANCE.m2537getLargeAppBarCollapsedHeightD9Ej5fM(), TopAppBarDefaults.INSTANCE.m2538getLargeAppBarExpandedHeightD9Ej5fM(), windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, startRestartGroup, i11 | (3670016 & i12) | (29360128 & i12) | (i12 & 234881024), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    windowInsets2 = windowInsets3;
                                    function34 = function33;
                                    function24 = function23;
                                    topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                                    topAppBarColors4 = topAppBarColors3;
                                    modifier2 = companion;
                                } else {
                                    i7 = i3;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i7 = i3;
                                companion = modifier2;
                            }
                            function33 = function32;
                            windowInsets3 = windowInsets2;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = (i7 & 14) | 221184 | (i7 & 112) | (i7 & 896) | (i7 & 7168);
                            int i122 = i7 << 6;
                            m1449LargeTopAppBaroKE7A98(function2, companion, function23, function33, TopAppBarDefaults.INSTANCE.m2537getLargeAppBarCollapsedHeightD9Ej5fM(), TopAppBarDefaults.INSTANCE.m2538getLargeAppBarExpandedHeightD9Ej5fM(), windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, startRestartGroup, i112 | (3670016 & i122) | (29360128 & i122) | (i122 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            windowInsets2 = windowInsets3;
                            function34 = function33;
                            function24 = function23;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                            topAppBarColors4 = topAppBarColors3;
                            modifier2 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            function24 = function23;
                            function34 = function32;
                            topAppBarColors4 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final WindowInsets windowInsets4 = windowInsets2;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$LargeTopAppBar$1
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
                                    AppBarKt.LargeTopAppBar(function2, modifier3, function24, function34, windowInsets4, topAppBarColors4, topAppBarScrollBehavior4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i3) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                }
                function32 = function3;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
            }
            function23 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019e  */
    /* renamed from: LargeTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1449LargeTopAppBaroKE7A98(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        float f3;
        int i7;
        float f4;
        int i8;
        final Modifier.Companion companion;
        Function2<? super Composer, ? super Integer, Unit> m1625getLambda15$material3_release;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> m1626getLambda16$material3_release;
        float m2537getLargeAppBarCollapsedHeightD9Ej5fM;
        float m2538getLargeAppBarExpandedHeightD9Ej5fM;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        TopAppBarColors topAppBarColors3;
        int i9;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        final float f5;
        final WindowInsets windowInsets3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior3;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final float f6;
        final TopAppBarColors topAppBarColors4;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-630005584);
        ComposerKt.sourceInformation(startRestartGroup, "C(LargeTopAppBar)P(7,4,5!1,1:c#ui.unit.Dp,3:c#ui.unit.Dp,8)610@30747L12,611@30809L22,616@30993L5,617@31064L5,614@30893L943:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function32 = function3;
                    i3 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f3 = f;
                        i3 |= startRestartGroup.changed(f3) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            f4 = f2;
                            i3 |= startRestartGroup.changed(f4) ? 131072 : 65536;
                            if ((i & 1572864) == 0) {
                                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(windowInsets)) ? 1048576 : 524288;
                            }
                            if ((i & 12582912) == 0) {
                                if ((i2 & 128) == 0 && startRestartGroup.changed(topAppBarColors)) {
                                    i10 = 8388608;
                                    i3 |= i10;
                                }
                                i10 = 4194304;
                                i3 |= i10;
                            }
                            i8 = i2 & 256;
                            if (i8 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i11 == 0 ? Modifier.INSTANCE : modifier;
                                    m1625getLambda15$material3_release = i4 == 0 ? ComposableSingletons$AppBarKt.INSTANCE.m1625getLambda15$material3_release() : function23;
                                    m1626getLambda16$material3_release = i5 == 0 ? ComposableSingletons$AppBarKt.INSTANCE.m1626getLambda16$material3_release() : function32;
                                    m2537getLargeAppBarCollapsedHeightD9Ej5fM = i6 == 0 ? TopAppBarDefaults.INSTANCE.m2537getLargeAppBarCollapsedHeightD9Ej5fM() : f3;
                                    m2538getLargeAppBarExpandedHeightD9Ej5fM = i7 == 0 ? TopAppBarDefaults.INSTANCE.m2538getLargeAppBarExpandedHeightD9Ej5fM() : f4;
                                    if ((i2 & 64) == 0) {
                                        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                        i3 &= -3670017;
                                    } else {
                                        windowInsets2 = windowInsets;
                                    }
                                    if ((i2 & 128) == 0) {
                                        topAppBarColors2 = TopAppBarDefaults.INSTANCE.largeTopAppBarColors(startRestartGroup, 6);
                                        i3 &= -29360129;
                                    } else {
                                        topAppBarColors2 = topAppBarColors;
                                    }
                                    if (i8 == 0) {
                                        int i12 = i3;
                                        topAppBarScrollBehavior2 = null;
                                        topAppBarColors3 = topAppBarColors2;
                                        i9 = i12;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-630005584, i9, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:614)");
                                        }
                                        int i13 = i9 << 12;
                                        m1454TwoRowsTopAppBarnS6u9G4(companion, function2, TypographyKt.getValue(TopAppBarLargeTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), LargeTitleBottomPadding, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), m1625getLambda15$material3_release, m1626getLambda16$material3_release, (!Dp.m6304equalsimpl0(m2537getLargeAppBarCollapsedHeightD9Ej5fM, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(m2537getLargeAppBarCollapsedHeightD9Ej5fM, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2537getLargeAppBarCollapsedHeightD9Ej5fM() : m2537getLargeAppBarCollapsedHeightD9Ej5fM, (!Dp.m6304equalsimpl0(m2538getLargeAppBarExpandedHeightD9Ej5fM, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(m2538getLargeAppBarExpandedHeightD9Ej5fM, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2538getLargeAppBarExpandedHeightD9Ej5fM() : m2538getLargeAppBarExpandedHeightD9Ej5fM, windowInsets2, topAppBarColors3, topAppBarScrollBehavior2, startRestartGroup, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112) | (i13 & 57344) | (i13 & 3670016) | (i13 & 29360128), (i9 >> 18) & 1022, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        f5 = m2537getLargeAppBarCollapsedHeightD9Ej5fM;
                                        windowInsets3 = windowInsets2;
                                        topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                        function24 = m1625getLambda15$material3_release;
                                        function33 = m1626getLambda16$material3_release;
                                        f6 = m2538getLargeAppBarExpandedHeightD9Ej5fM;
                                        topAppBarColors4 = topAppBarColors3;
                                    } else {
                                        topAppBarColors3 = topAppBarColors2;
                                        i9 = i3;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i3 &= -29360129;
                                    }
                                    companion = modifier;
                                    topAppBarColors3 = topAppBarColors;
                                    i9 = i3;
                                    m1625getLambda15$material3_release = function23;
                                    m1626getLambda16$material3_release = function32;
                                    m2537getLargeAppBarCollapsedHeightD9Ej5fM = f3;
                                    m2538getLargeAppBarExpandedHeightD9Ej5fM = f4;
                                    windowInsets2 = windowInsets;
                                }
                                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i132 = i9 << 12;
                                m1454TwoRowsTopAppBarnS6u9G4(companion, function2, TypographyKt.getValue(TopAppBarLargeTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), LargeTitleBottomPadding, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), startRestartGroup, 6), m1625getLambda15$material3_release, m1626getLambda16$material3_release, (!Dp.m6304equalsimpl0(m2537getLargeAppBarCollapsedHeightD9Ej5fM, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(m2537getLargeAppBarCollapsedHeightD9Ej5fM, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2537getLargeAppBarCollapsedHeightD9Ej5fM() : m2537getLargeAppBarCollapsedHeightD9Ej5fM, (!Dp.m6304equalsimpl0(m2538getLargeAppBarExpandedHeightD9Ej5fM, Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM()) || Dp.m6304equalsimpl0(m2538getLargeAppBarExpandedHeightD9Ej5fM, Dp.INSTANCE.m6318getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m2538getLargeAppBarExpandedHeightD9Ej5fM() : m2538getLargeAppBarExpandedHeightD9Ej5fM, windowInsets2, topAppBarColors3, topAppBarScrollBehavior2, startRestartGroup, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112) | (i132 & 57344) | (i132 & 3670016) | (i132 & 29360128), (i9 >> 18) & 1022, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f5 = m2537getLargeAppBarCollapsedHeightD9Ej5fM;
                                windowInsets3 = windowInsets2;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                function24 = m1625getLambda15$material3_release;
                                function33 = m1626getLambda16$material3_release;
                                f6 = m2538getLargeAppBarExpandedHeightD9Ej5fM;
                                topAppBarColors4 = topAppBarColors3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                companion = modifier;
                                topAppBarColors4 = topAppBarColors;
                                function24 = function23;
                                function33 = function32;
                                f5 = f3;
                                f6 = f4;
                                windowInsets3 = windowInsets;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                            }
                            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$LargeTopAppBar$2
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
                                        AppBarKt.m1449LargeTopAppBaroKE7A98(function2, companion, function24, function33, f5, f6, windowInsets3, topAppBarColors4, topAppBarScrollBehavior3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        f4 = f2;
                        if ((i & 1572864) == 0) {
                        }
                        if ((i & 12582912) == 0) {
                        }
                        i8 = i2 & 256;
                        if (i8 == 0) {
                        }
                        if ((i3 & 38347923) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                        if (i8 == 0) {
                        }
                    }
                    f3 = f;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    f4 = f2;
                    if ((i & 1572864) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                    }
                    if ((i3 & 38347923) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    if (i8 == 0) {
                    }
                }
                function32 = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f3 = f;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                f4 = f2;
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (i8 == 0) {
                }
            }
            function23 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function32 = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f3 = f;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            f4 = f2;
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (i8 == 0) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function32 = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f3 = f;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        f4 = f2;
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (i8 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c4  */
    /* renamed from: BottomAppBar-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1445BottomAppBarSnr_uVM(final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        WindowInsets windowInsets2;
        PaddingValues paddingValues2;
        int i7;
        long j5;
        final WindowInsets windowInsets3;
        final float f3;
        final PaddingValues paddingValues3;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final long j6;
        final long j7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(2141738945);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBar)P(!1,5,4,1:c#ui.graphics.Color,2:c#ui.graphics.Color,6:c#ui.unit.Dp)678@33855L14,679@33897L31,682@34123L12,684@34145L355:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i;
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
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i9 = 2048;
                            i3 |= i9;
                        }
                    } else {
                        j3 = j;
                    }
                    i9 = 1024;
                    i3 |= i9;
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
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(windowInsets)) {
                            i8 = 8388608;
                            i3 |= i8;
                        }
                        i8 = 4194304;
                        i3 |= i8;
                    }
                    if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function22 = null;
                            }
                            if ((i2 & 8) != 0) {
                                j3 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                j4 = ColorSchemeKt.m1609contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                                i3 &= -57345;
                            }
                            if (i5 != 0) {
                                f2 = BottomAppBarDefaults.INSTANCE.m1469getContainerElevationD9Ej5fM();
                            }
                            PaddingValues contentPadding = i6 == 0 ? BottomAppBarDefaults.INSTANCE.getContentPadding() : paddingValues;
                            if ((i2 & 128) == 0) {
                                i7 = i3 & (-29360129);
                                windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                j5 = j4;
                                paddingValues2 = contentPadding;
                                float f4 = f2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2141738945, i7, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:684)");
                                }
                                m1447BottomAppBarqhFBPw4(function3, modifier2, function22, j3, j5, f4, paddingValues2, windowInsets2, null, startRestartGroup, (i7 & 14) | 100663296 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (i7 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                windowInsets3 = windowInsets2;
                                long j8 = j3;
                                f3 = f4;
                                paddingValues3 = paddingValues2;
                                long j9 = j5;
                                modifier3 = modifier2;
                                function23 = function22;
                                j6 = j8;
                                j7 = j9;
                            } else {
                                windowInsets2 = windowInsets;
                                paddingValues2 = contentPadding;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            paddingValues2 = paddingValues;
                            windowInsets2 = windowInsets;
                        }
                        i7 = i3;
                        j5 = j4;
                        float f42 = f2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        m1447BottomAppBarqhFBPw4(function3, modifier2, function22, j3, j5, f42, paddingValues2, windowInsets2, null, startRestartGroup, (i7 & 14) | 100663296 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (3670016 & i7) | (i7 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        windowInsets3 = windowInsets2;
                        long j82 = j3;
                        f3 = f42;
                        paddingValues3 = paddingValues2;
                        long j92 = j5;
                        modifier3 = modifier2;
                        function23 = function22;
                        j6 = j82;
                        j7 = j92;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        windowInsets3 = windowInsets;
                        modifier3 = modifier2;
                        function23 = function22;
                        j6 = j3;
                        j7 = j4;
                        f3 = f2;
                        paddingValues3 = paddingValues;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$1
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
                                AppBarKt.m1445BottomAppBarSnr_uVM(function3, modifier3, function23, j6, j7, f3, paddingValues3, windowInsets3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                f2 = f;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
            }
            function22 = function2;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6  */
    /* renamed from: BottomAppBar-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1447BottomAppBarqhFBPw4(final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        int i7;
        Modifier.Companion companion;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        WindowInsets windowInsets2;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior2;
        float f3;
        int i8;
        PaddingValues paddingValues2;
        PaddingValues paddingValues3;
        WindowInsets windowInsets3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final long j5;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1044837119);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBar)P(!1,5,4,1:c#ui.graphics.Color,2:c#ui.graphics.Color,7:c#ui.unit.Dp!1,8)743@37109L14,744@37151L31,747@37377L12,758@37741L539,750@37455L825:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i;
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
                i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i11 = 2048;
                            i3 |= i11;
                        }
                    } else {
                        j3 = j;
                    }
                    i11 = 1024;
                    i3 |= i11;
                } else {
                    j3 = j;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i10 = 16384;
                            i3 |= i10;
                        }
                    } else {
                        j4 = j2;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    j4 = j2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(paddingValues) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(windowInsets)) {
                            i9 = 8388608;
                            i3 |= i9;
                        }
                        i9 = 4194304;
                        i3 |= i9;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changed(bottomAppBarScrollBehavior) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i12 == 0 ? Modifier.INSTANCE : modifier;
                            function22 = i4 == 0 ? null : function2;
                            if ((i2 & 8) != 0) {
                                j3 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                j4 = ColorSchemeKt.m1609contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                                i3 &= -57345;
                            }
                            float m1469getContainerElevationD9Ej5fM = i5 == 0 ? BottomAppBarDefaults.INSTANCE.m1469getContainerElevationD9Ej5fM() : f2;
                            PaddingValues contentPadding = i6 == 0 ? BottomAppBarDefaults.INSTANCE.getContentPadding() : paddingValues;
                            if ((i2 & 128) == 0) {
                                windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            if (i7 == 0) {
                                f3 = m1469getContainerElevationD9Ej5fM;
                                bottomAppBarScrollBehavior2 = null;
                            } else {
                                bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                                f3 = m1469getContainerElevationD9Ej5fM;
                            }
                            i8 = i3;
                            paddingValues2 = contentPadding;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            companion = modifier;
                            function22 = function2;
                            windowInsets2 = windowInsets;
                            bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                            i8 = i3;
                            f3 = f2;
                            paddingValues2 = paddingValues;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1044837119, i8, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:750)");
                        }
                        int i13 = i8 >> 6;
                        m1446BottomAppBare3WI5M(companion, j3, j4, f3, paddingValues2, windowInsets2, bottomAppBarScrollBehavior2, ComposableLambdaKt.rememberComposableLambda(1566394874, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                                invoke(rowScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope rowScope, Composer composer2, int i14) {
                                int i15;
                                float f4;
                                float f5;
                                ComposerKt.sourceInformation(composer2, "C759@37751L204,766@38012L252:AppBar.kt#uh7d8r");
                                if ((i14 & 6) == 0) {
                                    i15 = i14 | (composer2.changed(rowScope) ? 4 : 2);
                                } else {
                                    i15 = i14;
                                }
                                if ((i15 & 19) != 18 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1566394874, i15, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:759)");
                                    }
                                    Modifier weight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, weight$default);
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
                                    Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                    function32.invoke(RowScopeInstance.INSTANCE, composer2, 6);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (function22 != null) {
                                        Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        f4 = AppBarKt.FABVerticalPadding;
                                        f5 = AppBarKt.FABHorizontalPadding;
                                        Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(fillMaxHeight$default, 0.0f, f4, f5, 0.0f, 9, null);
                                        Alignment topStart = Alignment.INSTANCE.getTopStart();
                                        Function2<Composer, Integer, Unit> function24 = function22;
                                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m685paddingqDBjuR0$default);
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
                                        ComposerKt.sourceInformationMarkerStart(composer2, 553416911, "C771@38228L22:AppBar.kt#uh7d8r");
                                        function24.invoke(composer2, 0);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), startRestartGroup, ((i8 >> 3) & 14) | 12582912 | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (i13 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f2 = f3;
                        long j6 = j4;
                        paddingValues3 = paddingValues2;
                        windowInsets3 = windowInsets2;
                        function23 = function22;
                        j5 = j6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier;
                        function23 = function2;
                        bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                        j5 = j4;
                        paddingValues3 = paddingValues;
                        windowInsets3 = windowInsets;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier2 = companion;
                        final long j7 = j3;
                        final float f4 = f2;
                        final PaddingValues paddingValues4 = paddingValues3;
                        final WindowInsets windowInsets4 = windowInsets3;
                        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior2;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$3
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
                                AppBarKt.m1447BottomAppBarqhFBPw4(function3, modifier2, function23, j7, j5, f4, paddingValues4, windowInsets4, bottomAppBarScrollBehavior3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                f2 = f;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (i7 == 0) {
                }
                i8 = i3;
                paddingValues2 = contentPadding;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i132 = i8 >> 6;
                m1446BottomAppBare3WI5M(companion, j3, j4, f3, paddingValues2, windowInsets2, bottomAppBarScrollBehavior2, ComposableLambdaKt.rememberComposableLambda(1566394874, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope rowScope, Composer composer2, int i14) {
                        int i15;
                        float f42;
                        float f5;
                        ComposerKt.sourceInformation(composer2, "C759@37751L204,766@38012L252:AppBar.kt#uh7d8r");
                        if ((i14 & 6) == 0) {
                            i15 = i14 | (composer2.changed(rowScope) ? 4 : 2);
                        } else {
                            i15 = i14;
                        }
                        if ((i15 & 19) != 18 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1566394874, i15, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:759)");
                            }
                            Modifier weight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, weight$default);
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
                            Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                            function32.invoke(RowScopeInstance.INSTANCE, composer2, 6);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (function22 != null) {
                                Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                                f42 = AppBarKt.FABVerticalPadding;
                                f5 = AppBarKt.FABHorizontalPadding;
                                Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(fillMaxHeight$default, 0.0f, f42, f5, 0.0f, 9, null);
                                Alignment topStart = Alignment.INSTANCE.getTopStart();
                                Function2<Composer, Integer, Unit> function24 = function22;
                                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m685paddingqDBjuR0$default);
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
                                ComposerKt.sourceInformationMarkerStart(composer2, 553416911, "C771@38228L22:AppBar.kt#uh7d8r");
                                function24.invoke(composer2, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i8 >> 3) & 14) | 12582912 | (i132 & 112) | (i132 & 896) | (i132 & 7168) | (57344 & i132) | (458752 & i132) | (i132 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f2 = f3;
                long j62 = j4;
                paddingValues3 = paddingValues2;
                windowInsets3 = windowInsets2;
                function23 = function22;
                j5 = j62;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (i7 == 0) {
            }
            i8 = i3;
            paddingValues2 = contentPadding;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1322 = i8 >> 6;
            m1446BottomAppBare3WI5M(companion, j3, j4, f3, paddingValues2, windowInsets2, bottomAppBarScrollBehavior2, ComposableLambdaKt.rememberComposableLambda(1566394874, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope rowScope, Composer composer2, int i14) {
                    int i15;
                    float f42;
                    float f5;
                    ComposerKt.sourceInformation(composer2, "C759@37751L204,766@38012L252:AppBar.kt#uh7d8r");
                    if ((i14 & 6) == 0) {
                        i15 = i14 | (composer2.changed(rowScope) ? 4 : 2);
                    } else {
                        i15 = i14;
                    }
                    if ((i15 & 19) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1566394874, i15, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:759)");
                        }
                        Modifier weight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, weight$default);
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
                        Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        function32.invoke(RowScopeInstance.INSTANCE, composer2, 6);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (function22 != null) {
                            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                            f42 = AppBarKt.FABVerticalPadding;
                            f5 = AppBarKt.FABHorizontalPadding;
                            Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(fillMaxHeight$default, 0.0f, f42, f5, 0.0f, 9, null);
                            Alignment topStart = Alignment.INSTANCE.getTopStart();
                            Function2<Composer, Integer, Unit> function24 = function22;
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m685paddingqDBjuR0$default);
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
                            ComposerKt.sourceInformationMarkerStart(composer2, 553416911, "C771@38228L22:AppBar.kt#uh7d8r");
                            function24.invoke(composer2, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, ((i8 >> 3) & 14) | 12582912 | (i1322 & 112) | (i1322 & 896) | (i1322 & 7168) | (57344 & i1322) | (458752 & i1322) | (i1322 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            f2 = f3;
            long j622 = j4;
            paddingValues3 = paddingValues2;
            windowInsets3 = windowInsets2;
            function23 = function22;
            j5 = j622;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (i7 == 0) {
        }
        i8 = i3;
        paddingValues2 = contentPadding;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i13222 = i8 >> 6;
        m1446BottomAppBare3WI5M(companion, j3, j4, f3, paddingValues2, windowInsets2, bottomAppBarScrollBehavior2, ComposableLambdaKt.rememberComposableLambda(1566394874, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                invoke(rowScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope rowScope, Composer composer2, int i14) {
                int i15;
                float f42;
                float f5;
                ComposerKt.sourceInformation(composer2, "C759@37751L204,766@38012L252:AppBar.kt#uh7d8r");
                if ((i14 & 6) == 0) {
                    i15 = i14 | (composer2.changed(rowScope) ? 4 : 2);
                } else {
                    i15 = i14;
                }
                if ((i15 & 19) != 18 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1566394874, i15, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:759)");
                    }
                    Modifier weight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, weight$default);
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
                    Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                    function32.invoke(RowScopeInstance.INSTANCE, composer2, 6);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (function22 != null) {
                        Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                        f42 = AppBarKt.FABVerticalPadding;
                        f5 = AppBarKt.FABHorizontalPadding;
                        Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(fillMaxHeight$default, 0.0f, f42, f5, 0.0f, 9, null);
                        Alignment topStart = Alignment.INSTANCE.getTopStart();
                        Function2<Composer, Integer, Unit> function24 = function22;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m685paddingqDBjuR0$default);
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
                        ComposerKt.sourceInformationMarkerStart(composer2, 553416911, "C771@38228L22:AppBar.kt#uh7d8r");
                        function24.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, ((i8 >> 3) & 14) | 12582912 | (i13222 & 112) | (i13222 & 896) | (i13222 & 7168) | (57344 & i13222) | (458752 & i13222) | (i13222 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        f2 = f3;
        long j6222 = j4;
        paddingValues3 = paddingValues2;
        windowInsets3 = windowInsets2;
        function23 = function22;
        j5 = j6222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0087  */
    /* renamed from: BottomAppBar-1oL4kX8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1444BottomAppBar1oL4kX8(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        PaddingValues paddingValues2;
        WindowInsets windowInsets2;
        Modifier.Companion companion;
        int i5;
        PaddingValues paddingValues3;
        WindowInsets windowInsets3;
        float f3;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1391700845);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBar)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp,3,6)807@39959L14,808@40001L31,811@40227L12,814@40294L302:AppBar.kt#uh7d8r");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                j3 = j;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                j4 = j2;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            j4 = j2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i6 = 131072;
                            i3 |= i6;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i6 = 65536;
                    i3 |= i6;
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
                            companion = i9 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i2 & 2) != 0) {
                                j3 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                j4 = ColorSchemeKt.m1609contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            if (i10 != 0) {
                                f2 = BottomAppBarDefaults.INSTANCE.m1469getContainerElevationD9Ej5fM();
                            }
                            if (i4 != 0) {
                                paddingValues2 = BottomAppBarDefaults.INSTANCE.getContentPadding();
                            }
                            if ((i2 & 32) != 0) {
                                i5 = i3 & (-458753);
                                paddingValues3 = paddingValues2;
                                windowInsets3 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                f3 = f2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1391700845, i5, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                                }
                                m1446BottomAppBare3WI5M(companion, j3, j4, f3, paddingValues3, windowInsets3, null, function3, startRestartGroup, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f2 = f3;
                                paddingValues2 = paddingValues3;
                                windowInsets2 = windowInsets3;
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
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            companion = modifier;
                        }
                        i5 = i3;
                        f3 = f2;
                        paddingValues3 = paddingValues2;
                        windowInsets3 = windowInsets2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        m1446BottomAppBare3WI5M(companion, j3, j4, f3, paddingValues3, windowInsets3, null, function3, startRestartGroup, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        f2 = f3;
                        paddingValues2 = paddingValues3;
                        windowInsets2 = windowInsets3;
                        modifier2 = companion;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        final long j5 = j3;
                        final long j6 = j4;
                        final float f4 = f2;
                        final PaddingValues paddingValues4 = paddingValues2;
                        final WindowInsets windowInsets4 = windowInsets2;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$4
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
                                AppBarKt.m1444BottomAppBar1oL4kX8(Modifier.this, j5, j6, f4, paddingValues4, windowInsets4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                if (i9 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                i5 = i3;
                f3 = f2;
                paddingValues3 = paddingValues2;
                windowInsets3 = windowInsets2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m1446BottomAppBare3WI5M(companion, j3, j4, f3, paddingValues3, windowInsets3, null, function3, startRestartGroup, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                f2 = f3;
                paddingValues2 = paddingValues3;
                windowInsets2 = windowInsets3;
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            if ((196608 & i) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            i5 = i3;
            f3 = f2;
            paddingValues3 = paddingValues2;
            windowInsets3 = windowInsets2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            m1446BottomAppBare3WI5M(companion, j3, j4, f3, paddingValues3, windowInsets3, null, function3, startRestartGroup, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            f2 = f3;
            paddingValues2 = paddingValues3;
            windowInsets2 = windowInsets3;
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        if ((196608 & i) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        i5 = i3;
        f3 = f2;
        paddingValues3 = paddingValues2;
        windowInsets3 = windowInsets2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        m1446BottomAppBare3WI5M(companion, j3, j4, f3, paddingValues3, windowInsets3, null, function3, startRestartGroup, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        f2 = f3;
        paddingValues2 = paddingValues3;
        windowInsets2 = windowInsets3;
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bb  */
    /* renamed from: BottomAppBar-e-3WI5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1446BottomAppBare3WI5M(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        long j4;
        float f2;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        Modifier.Companion companion;
        WindowInsets windowInsets2;
        final WindowInsets windowInsets3;
        float f3;
        int i6;
        final PaddingValues paddingValues3;
        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior2;
        Modifier.Companion companion2;
        boolean z;
        Object rememberedValue;
        Modifier modifier2;
        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior3;
        final float f4;
        final long j5;
        final long j6;
        final WindowInsets windowInsets4;
        final PaddingValues paddingValues4;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(422438773);
        ComposerKt.sourceInformation(startRestartGroup, "C(BottomAppBar)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,6:c#ui.unit.Dp,3,7,5)860@42630L14,861@42672L31,864@42898L12,896@44292L5,899@44363L596,911@45008L364,891@44025L1347:AppBar.kt#uh7d8r");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                j3 = j;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i7 = 256;
                    i3 |= i7;
                }
            } else {
                j4 = j2;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            j4 = j2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 16384 : 8192;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(windowInsets)) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(bottomAppBarScrollBehavior) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i9 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 2) != 0) {
                            j3 = BottomAppBarDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            j4 = ColorSchemeKt.m1609contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                        }
                        if (i10 != 0) {
                            f2 = BottomAppBarDefaults.INSTANCE.m1469getContainerElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            paddingValues2 = BottomAppBarDefaults.INSTANCE.getContentPadding();
                        }
                        if ((i2 & 32) != 0) {
                            windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            i3 &= -458753;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        windowInsets3 = windowInsets2;
                        f3 = f2;
                        i6 = i3;
                        paddingValues3 = paddingValues2;
                        if (i5 != 0) {
                            bottomAppBarScrollBehavior2 = null;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(422438773, i6, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:867)");
                            }
                            startRestartGroup.startReplaceGroup(1393560009);
                            ComposerKt.sourceInformation(startRestartGroup, "874@43358L55,874@43335L78,875@43447L289");
                            if (bottomAppBarScrollBehavior2 == null && !bottomAppBarScrollBehavior2.getIsPinned()) {
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Orientation orientation = Orientation.Vertical;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1393566103, "CC(remember):AppBar.kt#9igjgp");
                                int i11 = i6 & 3670016;
                                boolean z2 = i11 == 1048576;
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$appBarDragModifier$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Float f5) {
                                            invoke(f5.floatValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(float f5) {
                                            BottomAppBarState state = BottomAppBarScrollBehavior.this.getState();
                                            state.setHeightOffset(state.getHeightOffset() - f5);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                DraggableState rememberDraggableState = DraggableKt.rememberDraggableState((Function1) rememberedValue2, startRestartGroup, 0);
                                Modifier.Companion companion4 = companion3;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1393569185, "CC(remember):AppBar.kt#9igjgp");
                                boolean z3 = i11 == 1048576;
                                AppBarKt$BottomAppBar$appBarDragModifier$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                                if (z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new AppBarKt$BottomAppBar$appBarDragModifier$2$1(bottomAppBarScrollBehavior2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                companion2 = DraggableKt.draggable(companion4, rememberDraggableState, orientation, (r20 & 4) != 0, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? DraggableKt.NoOpOnDragStarted : null, (r20 & 64) != 0 ? DraggableKt.NoOpOnDragStopped : (Function3) rememberedValue3, (r20 & 128) != 0 ? false : false);
                            } else {
                                companion2 = Modifier.INSTANCE;
                            }
                            startRestartGroup.endReplaceGroup();
                            Shape value = ShapesKt.getValue(BottomAppBarTokens.INSTANCE.getContainerShape(), startRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1393598804, "CC(remember):AppBar.kt#9igjgp");
                            z = (3670016 & i6) != 1048576;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                        return m1458invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                    }

                                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                    public final MeasureResult m1458invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j7) {
                                        BottomAppBarState state;
                                        BottomAppBarScrollBehavior bottomAppBarScrollBehavior4 = BottomAppBarScrollBehavior.this;
                                        BottomAppBarState state2 = bottomAppBarScrollBehavior4 != null ? bottomAppBarScrollBehavior4.getState() : null;
                                        if (state2 != null) {
                                            state2.setHeightOffsetLimit(-measureScope.mo373toPx0680j_4(BottomAppBarTokens.INSTANCE.m2697getContainerHeightD9Ej5fM()));
                                        }
                                        final Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(j7);
                                        float height = mo5175measureBRTryo0.getHeight();
                                        BottomAppBarScrollBehavior bottomAppBarScrollBehavior5 = BottomAppBarScrollBehavior.this;
                                        return MeasureScope.layout$default(measureScope, mo5175measureBRTryo0.getWidth(), MathKt.roundToInt(height + ((bottomAppBarScrollBehavior5 == null || (state = bottomAppBarScrollBehavior5.getState()) == null) ? 0.0f : state.getHeightOffset())), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1.1
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
                                                Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                                            }
                                        }, 4, null);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            modifier2 = companion;
                            PaddingValues paddingValues5 = paddingValues3;
                            int i12 = i6 << 3;
                            int i13 = (i12 & 896) | 12582912 | (i12 & 7168) | (i12 & 57344);
                            BottomAppBarScrollBehavior bottomAppBarScrollBehavior4 = bottomAppBarScrollBehavior2;
                            SurfaceKt.m2223SurfaceT9BRK9s(LayoutModifierKt.layout(companion, (Function3) rememberedValue).then(companion2), value, j3, j4, f3, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1243053520, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$6
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
                                    ComposerKt.sourceInformation(composer2, "C912@45018L348:AppBar.kt#uh7d8r");
                                    if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1243053520, i14, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:912)");
                                        }
                                        Modifier padding = PaddingKt.padding(SizeKt.m712height3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsets.this), BottomAppBarTokens.INSTANCE.m2697getContainerHeightD9Ej5fM()), paddingValues3);
                                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, padding);
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
                                        Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                        function32.invoke(RowScopeInstance.INSTANCE, composer2, 6);
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
                            }, startRestartGroup, 54), startRestartGroup, i13, 96);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            WindowInsets windowInsets5 = windowInsets3;
                            bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior4;
                            f4 = f3;
                            j5 = j3;
                            j6 = j4;
                            windowInsets4 = windowInsets5;
                            paddingValues4 = paddingValues5;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        companion = modifier;
                        windowInsets3 = windowInsets;
                        f3 = f2;
                        i6 = i3;
                        paddingValues3 = paddingValues2;
                    }
                    bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(1393560009);
                    ComposerKt.sourceInformation(startRestartGroup, "874@43358L55,874@43335L78,875@43447L289");
                    if (bottomAppBarScrollBehavior2 == null) {
                    }
                    companion2 = Modifier.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    Shape value2 = ShapesKt.getValue(BottomAppBarTokens.INSTANCE.getContainerShape(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1393598804, "CC(remember):AppBar.kt#9igjgp");
                    if ((3670016 & i6) != 1048576) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                            return m1458invoke3p2s80s(measureScope, measurable, constraints.getValue());
                        }

                        /* renamed from: invoke-3p2s80s, reason: not valid java name */
                        public final MeasureResult m1458invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j7) {
                            BottomAppBarState state;
                            BottomAppBarScrollBehavior bottomAppBarScrollBehavior42 = BottomAppBarScrollBehavior.this;
                            BottomAppBarState state2 = bottomAppBarScrollBehavior42 != null ? bottomAppBarScrollBehavior42.getState() : null;
                            if (state2 != null) {
                                state2.setHeightOffsetLimit(-measureScope.mo373toPx0680j_4(BottomAppBarTokens.INSTANCE.m2697getContainerHeightD9Ej5fM()));
                            }
                            final Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(j7);
                            float height = mo5175measureBRTryo0.getHeight();
                            BottomAppBarScrollBehavior bottomAppBarScrollBehavior5 = BottomAppBarScrollBehavior.this;
                            return MeasureScope.layout$default(measureScope, mo5175measureBRTryo0.getWidth(), MathKt.roundToInt(height + ((bottomAppBarScrollBehavior5 == null || (state = bottomAppBarScrollBehavior5.getState()) == null) ? 0.0f : state.getHeightOffset())), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1.1
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
                                    Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                                }
                            }, 4, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    modifier2 = companion;
                    PaddingValues paddingValues52 = paddingValues3;
                    int i122 = i6 << 3;
                    int i132 = (i122 & 896) | 12582912 | (i122 & 7168) | (i122 & 57344);
                    BottomAppBarScrollBehavior bottomAppBarScrollBehavior42 = bottomAppBarScrollBehavior2;
                    SurfaceKt.m2223SurfaceT9BRK9s(LayoutModifierKt.layout(companion, (Function3) rememberedValue).then(companion2), value2, j3, j4, f3, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1243053520, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$6
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
                            ComposerKt.sourceInformation(composer2, "C912@45018L348:AppBar.kt#uh7d8r");
                            if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1243053520, i14, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:912)");
                                }
                                Modifier padding = PaddingKt.padding(SizeKt.m712height3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsets.this), BottomAppBarTokens.INSTANCE.m2697getContainerHeightD9Ej5fM()), paddingValues3);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, padding);
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
                                Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                function32.invoke(RowScopeInstance.INSTANCE, composer2, 6);
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
                    }, startRestartGroup, 54), startRestartGroup, i132, 96);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    WindowInsets windowInsets52 = windowInsets3;
                    bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior42;
                    f4 = f3;
                    j5 = j3;
                    j6 = j4;
                    windowInsets4 = windowInsets52;
                    paddingValues4 = paddingValues52;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior;
                    j5 = j3;
                    j6 = j4;
                    f4 = f2;
                    paddingValues4 = paddingValues2;
                    windowInsets4 = windowInsets;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$7
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
                            AppBarKt.m1446BottomAppBare3WI5M(Modifier.this, j5, j6, f4, paddingValues4, windowInsets4, bottomAppBarScrollBehavior3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            paddingValues2 = paddingValues;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
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
            if (i9 != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            windowInsets3 = windowInsets2;
            f3 = f2;
            i6 = i3;
            paddingValues3 = paddingValues2;
            if (i5 != 0) {
            }
            bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1393560009);
            ComposerKt.sourceInformation(startRestartGroup, "874@43358L55,874@43335L78,875@43447L289");
            if (bottomAppBarScrollBehavior2 == null) {
            }
            companion2 = Modifier.INSTANCE;
            startRestartGroup.endReplaceGroup();
            Shape value22 = ShapesKt.getValue(BottomAppBarTokens.INSTANCE.getContainerShape(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1393598804, "CC(remember):AppBar.kt#9igjgp");
            if ((3670016 & i6) != 1048576) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                    return m1458invoke3p2s80s(measureScope, measurable, constraints.getValue());
                }

                /* renamed from: invoke-3p2s80s, reason: not valid java name */
                public final MeasureResult m1458invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j7) {
                    BottomAppBarState state;
                    BottomAppBarScrollBehavior bottomAppBarScrollBehavior422 = BottomAppBarScrollBehavior.this;
                    BottomAppBarState state2 = bottomAppBarScrollBehavior422 != null ? bottomAppBarScrollBehavior422.getState() : null;
                    if (state2 != null) {
                        state2.setHeightOffsetLimit(-measureScope.mo373toPx0680j_4(BottomAppBarTokens.INSTANCE.m2697getContainerHeightD9Ej5fM()));
                    }
                    final Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(j7);
                    float height = mo5175measureBRTryo0.getHeight();
                    BottomAppBarScrollBehavior bottomAppBarScrollBehavior5 = BottomAppBarScrollBehavior.this;
                    return MeasureScope.layout$default(measureScope, mo5175measureBRTryo0.getWidth(), MathKt.roundToInt(height + ((bottomAppBarScrollBehavior5 == null || (state = bottomAppBarScrollBehavior5.getState()) == null) ? 0.0f : state.getHeightOffset())), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1.1
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
                            Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                        }
                    }, 4, null);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            modifier2 = companion;
            PaddingValues paddingValues522 = paddingValues3;
            int i1222 = i6 << 3;
            int i1322 = (i1222 & 896) | 12582912 | (i1222 & 7168) | (i1222 & 57344);
            BottomAppBarScrollBehavior bottomAppBarScrollBehavior422 = bottomAppBarScrollBehavior2;
            SurfaceKt.m2223SurfaceT9BRK9s(LayoutModifierKt.layout(companion, (Function3) rememberedValue).then(companion2), value22, j3, j4, f3, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1243053520, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$6
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
                    ComposerKt.sourceInformation(composer2, "C912@45018L348:AppBar.kt#uh7d8r");
                    if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1243053520, i14, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:912)");
                        }
                        Modifier padding = PaddingKt.padding(SizeKt.m712height3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsets.this), BottomAppBarTokens.INSTANCE.m2697getContainerHeightD9Ej5fM()), paddingValues3);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, padding);
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
                        Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        function32.invoke(RowScopeInstance.INSTANCE, composer2, 6);
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
            }, startRestartGroup, 54), startRestartGroup, i1322, 96);
            if (ComposerKt.isTraceInProgress()) {
            }
            WindowInsets windowInsets522 = windowInsets3;
            bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior422;
            f4 = f3;
            j5 = j3;
            j6 = j4;
            windowInsets4 = windowInsets522;
            paddingValues4 = paddingValues522;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
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
        if (i9 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        windowInsets3 = windowInsets2;
        f3 = f2;
        i6 = i3;
        paddingValues3 = paddingValues2;
        if (i5 != 0) {
        }
        bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1393560009);
        ComposerKt.sourceInformation(startRestartGroup, "874@43358L55,874@43335L78,875@43447L289");
        if (bottomAppBarScrollBehavior2 == null) {
        }
        companion2 = Modifier.INSTANCE;
        startRestartGroup.endReplaceGroup();
        Shape value222 = ShapesKt.getValue(BottomAppBarTokens.INSTANCE.getContainerShape(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1393598804, "CC(remember):AppBar.kt#9igjgp");
        if ((3670016 & i6) != 1048576) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m1458invoke3p2s80s(measureScope, measurable, constraints.getValue());
            }

            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m1458invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j7) {
                BottomAppBarState state;
                BottomAppBarScrollBehavior bottomAppBarScrollBehavior4222 = BottomAppBarScrollBehavior.this;
                BottomAppBarState state2 = bottomAppBarScrollBehavior4222 != null ? bottomAppBarScrollBehavior4222.getState() : null;
                if (state2 != null) {
                    state2.setHeightOffsetLimit(-measureScope.mo373toPx0680j_4(BottomAppBarTokens.INSTANCE.m2697getContainerHeightD9Ej5fM()));
                }
                final Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(j7);
                float height = mo5175measureBRTryo0.getHeight();
                BottomAppBarScrollBehavior bottomAppBarScrollBehavior5 = BottomAppBarScrollBehavior.this;
                return MeasureScope.layout$default(measureScope, mo5175measureBRTryo0.getWidth(), MathKt.roundToInt(height + ((bottomAppBarScrollBehavior5 == null || (state = bottomAppBarScrollBehavior5.getState()) == null) ? 0.0f : state.getHeightOffset())), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1.1
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
                        Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                    }
                }, 4, null);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        modifier2 = companion;
        PaddingValues paddingValues5222 = paddingValues3;
        int i12222 = i6 << 3;
        int i13222 = (i12222 & 896) | 12582912 | (i12222 & 7168) | (i12222 & 57344);
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior4222 = bottomAppBarScrollBehavior2;
        SurfaceKt.m2223SurfaceT9BRK9s(LayoutModifierKt.layout(companion, (Function3) rememberedValue).then(companion2), value222, j3, j4, f3, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1243053520, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$6
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
                ComposerKt.sourceInformation(composer2, "C912@45018L348:AppBar.kt#uh7d8r");
                if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1243053520, i14, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:912)");
                    }
                    Modifier padding = PaddingKt.padding(SizeKt.m712height3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsets.this), BottomAppBarTokens.INSTANCE.m2697getContainerHeightD9Ej5fM()), paddingValues3);
                    Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, padding);
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
                    Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                    function32.invoke(RowScopeInstance.INSTANCE, composer2, 6);
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
        }, startRestartGroup, 54), startRestartGroup, i13222, 96);
        if (ComposerKt.isTraceInProgress()) {
        }
        WindowInsets windowInsets5222 = windowInsets3;
        bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior4222;
        f4 = f3;
        j5 = j3;
        j6 = j4;
        windowInsets4 = windowInsets5222;
        paddingValues4 = paddingValues5222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final TopAppBarState rememberTopAppBarState(final float f, final float f2, final float f3, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1801969826, "C(rememberTopAppBarState)P(2,1)1292@62790L99,1292@62743L146:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            f = -3.4028235E38f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1801969826, i, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1291)");
        }
        Object[] objArr = new Object[0];
        Saver<TopAppBarState, ?> saver = TopAppBarState.INSTANCE.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, 1949255933, "CC(remember):AppBar.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(f2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(f3)) || (i & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<TopAppBarState>() { // from class: androidx.compose.material3.AppBarKt$rememberTopAppBarState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TopAppBarState invoke() {
                    return new TopAppBarState(f, f2, f3);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        TopAppBarState topAppBarState = (TopAppBarState) RememberSaveableKt.m3426rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return topAppBarState;
    }

    public static final BottomAppBarState rememberBottomAppBarState(final float f, final float f2, final float f3, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1420874240, "C(rememberBottomAppBarState)P(2,1)1611@75546L102,1611@75496L152:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            f = -3.4028235E38f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1420874240, i, -1, "androidx.compose.material3.rememberBottomAppBarState (AppBar.kt:1610)");
        }
        Object[] objArr = new Object[0];
        Saver<BottomAppBarState, ?> saver = BottomAppBarState.INSTANCE.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, -1399214710, "CC(remember):AppBar.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(f2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(f3)) || (i & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<BottomAppBarState>() { // from class: androidx.compose.material3.AppBarKt$rememberBottomAppBarState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final BottomAppBarState invoke() {
                    return AppBarKt.BottomAppBarState(f, f2, f3);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        BottomAppBarState bottomAppBarState = (BottomAppBarState) RememberSaveableKt.m3426rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return bottomAppBarState;
    }

    public static final BottomAppBarState BottomAppBarState(float f, float f2, float f3) {
        return new BottomAppBarStateImpl(f, f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object settleAppBarBottom(BottomAppBarState bottomAppBarState, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Continuation<? super Velocity> continuation) {
        AppBarKt$settleAppBarBottom$1 appBarKt$settleAppBarBottom$1;
        Object coroutine_suspended;
        int i;
        final Ref.FloatRef floatRef;
        AnimationSpec<Float> animationSpec2;
        AnimationSpec<Float> animationSpec3;
        AnimationState AnimationState$default;
        Float boxFloat;
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1;
        Ref.FloatRef floatRef2;
        final BottomAppBarState bottomAppBarState2 = bottomAppBarState;
        if (continuation instanceof AppBarKt$settleAppBarBottom$1) {
            appBarKt$settleAppBarBottom$1 = (AppBarKt$settleAppBarBottom$1) continuation;
            if ((appBarKt$settleAppBarBottom$1.label & Integer.MIN_VALUE) != 0) {
                appBarKt$settleAppBarBottom$1.label -= Integer.MIN_VALUE;
                Object obj = appBarKt$settleAppBarBottom$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appBarKt$settleAppBarBottom$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (bottomAppBarState.getCollapsedFraction() < 0.01f || bottomAppBarState.getCollapsedFraction() == 1.0f) {
                        return Velocity.m6527boximpl(Velocity.INSTANCE.m6547getZero9UxMQ8M());
                    }
                    floatRef = new Ref.FloatRef();
                    floatRef.element = f;
                    if (decayAnimationSpec == null || Math.abs(f) <= 1.0f) {
                        animationSpec2 = animationSpec;
                    } else {
                        final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                        AnimationState AnimationState$default2 = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                        Function1<AnimationScope<Float, AnimationVector1D>, Unit> function12 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt$settleAppBarBottom$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                invoke2(animationScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                                float floatValue = animationScope.getValue().floatValue() - Ref.FloatRef.this.element;
                                float heightOffset = bottomAppBarState2.getHeightOffset();
                                bottomAppBarState2.setHeightOffset(heightOffset + floatValue);
                                float abs = Math.abs(heightOffset - bottomAppBarState2.getHeightOffset());
                                Ref.FloatRef.this.element = animationScope.getValue().floatValue();
                                floatRef.element = animationScope.getVelocity().floatValue();
                                if (Math.abs(floatValue - abs) > 0.5f) {
                                    animationScope.cancelAnimation();
                                }
                            }
                        };
                        appBarKt$settleAppBarBottom$1.L$0 = bottomAppBarState2;
                        animationSpec2 = animationSpec;
                        appBarKt$settleAppBarBottom$1.L$1 = animationSpec2;
                        appBarKt$settleAppBarBottom$1.L$2 = floatRef;
                        appBarKt$settleAppBarBottom$1.label = 1;
                        if (SuspendAnimationKt.animateDecay$default(AnimationState$default2, decayAnimationSpec, false, function12, appBarKt$settleAppBarBottom$1, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        floatRef2 = (Ref.FloatRef) appBarKt$settleAppBarBottom$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        floatRef = floatRef2;
                        return Velocity.m6527boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
                    }
                    Ref.FloatRef floatRef4 = (Ref.FloatRef) appBarKt$settleAppBarBottom$1.L$2;
                    AnimationSpec<Float> animationSpec4 = (AnimationSpec) appBarKt$settleAppBarBottom$1.L$1;
                    BottomAppBarState bottomAppBarState3 = (BottomAppBarState) appBarKt$settleAppBarBottom$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    floatRef = floatRef4;
                    animationSpec2 = animationSpec4;
                    bottomAppBarState2 = bottomAppBarState3;
                }
                animationSpec3 = animationSpec2;
                if (animationSpec3 != null && bottomAppBarState2.getHeightOffset() < 0.0f && bottomAppBarState2.getHeightOffset() > bottomAppBarState2.getHeightOffsetLimit()) {
                    AnimationState$default = AnimationStateKt.AnimationState$default(bottomAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
                    boxFloat = Boxing.boxFloat(bottomAppBarState2.getCollapsedFraction() >= 0.5f ? 0.0f : bottomAppBarState2.getHeightOffsetLimit());
                    function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt$settleAppBarBottom$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                            invoke2(animationScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                            BottomAppBarState.this.setHeightOffset(animationScope.getValue().floatValue());
                        }
                    };
                    appBarKt$settleAppBarBottom$1.L$0 = floatRef;
                    appBarKt$settleAppBarBottom$1.L$1 = null;
                    appBarKt$settleAppBarBottom$1.L$2 = null;
                    appBarKt$settleAppBarBottom$1.label = 2;
                    if (SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec3, false, function1, appBarKt$settleAppBarBottom$1, 4, null) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef2 = floatRef;
                    floatRef = floatRef2;
                }
                return Velocity.m6527boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
            }
        }
        appBarKt$settleAppBarBottom$1 = new AppBarKt$settleAppBarBottom$1(continuation);
        Object obj2 = appBarKt$settleAppBarBottom$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appBarKt$settleAppBarBottom$1.label;
        if (i != 0) {
        }
        animationSpec3 = animationSpec2;
        if (animationSpec3 != null) {
            AnimationState$default = AnimationStateKt.AnimationState$default(bottomAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
            boxFloat = Boxing.boxFloat(bottomAppBarState2.getCollapsedFraction() >= 0.5f ? 0.0f : bottomAppBarState2.getHeightOffsetLimit());
            function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt$settleAppBarBottom$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                    BottomAppBarState.this.setHeightOffset(animationScope.getValue().floatValue());
                }
            };
            appBarKt$settleAppBarBottom$1.L$0 = floatRef;
            appBarKt$settleAppBarBottom$1.L$1 = null;
            appBarKt$settleAppBarBottom$1.L$2 = null;
            appBarKt$settleAppBarBottom$1.label = 2;
            if (SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec3, false, function1, appBarKt$settleAppBarBottom$1, 4, null) != coroutine_suspended) {
            }
        }
        return Velocity.m6527boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
    }

    public static final float getBottomAppBarVerticalPadding() {
        return BottomAppBarVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015e  */
    /* renamed from: SingleRowTopAppBar-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1451SingleRowTopAppBarcJHQLPU(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function22, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final float f, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier.Companion companion;
        Composer composer2;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(-342194911);
        ComposerKt.sourceInformation(startRestartGroup, "C(SingleRowTopAppBar)P(4,7,8,1,5!1,3:c#ui.unit.Dp,9)*1865@85622L7,1866@85690L284,1866@85679L295,1879@86382L321,1887@86744L178,1894@87005L197,1926@88369L1014,1926@88285L1098:AppBar.kt#uh7d8r");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(textStyle) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(windowInsets) ? 8388608 : 4194304;
            if ((i2 & 256) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changed(topAppBarColors) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            if ((i2 & 512) == 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i3 |= startRestartGroup.changed(topAppBarScrollBehavior) ? 536870912 : 268435456;
            }
            if ((306783379 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion2 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-342194911, i3, -1, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1861)");
                }
                if (!Float.isNaN(f)) {
                    if (!(f == Float.POSITIVE_INFINITY)) {
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float coerceAtLeast = RangesKt.coerceAtLeast(((Density) consume).mo373toPx0680j_4(f), 0.0f);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1193658092, "CC(remember):AppBar.kt#9igjgp");
                        int i5 = i3 & 1879048192;
                        boolean changed = (i5 == 536870912) | startRestartGroup.changed(coerceAtLeast);
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$2$1
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
                                    TopAppBarState state;
                                    TopAppBarScrollBehavior topAppBarScrollBehavior2 = TopAppBarScrollBehavior.this;
                                    if (Intrinsics.areEqual((topAppBarScrollBehavior2 == null || (state = topAppBarScrollBehavior2.getState()) == null) ? null : Float.valueOf(state.getHeightOffsetLimit()), -coerceAtLeast)) {
                                        return;
                                    }
                                    TopAppBarScrollBehavior topAppBarScrollBehavior3 = TopAppBarScrollBehavior.this;
                                    TopAppBarState state2 = topAppBarScrollBehavior3 != null ? topAppBarScrollBehavior3.getState() : null;
                                    if (state2 == null) {
                                        return;
                                    }
                                    state2.setHeightOffsetLimit(-coerceAtLeast);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1193635911, "CC(remember):AppBar.kt#9igjgp");
                        boolean z2 = i5 == 536870912;
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$colorTransitionFraction$2$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    TopAppBarState state;
                                    TopAppBarScrollBehavior topAppBarScrollBehavior2 = TopAppBarScrollBehavior.this;
                                    return Float.valueOf(((topAppBarScrollBehavior2 == null || (state = topAppBarScrollBehavior2.getState()) == null) ? 0.0f : state.getOverlappedFraction()) > 0.01f ? 1.0f : 0.0f);
                                }
                            });
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        State<Color> m114animateColorAsStateeuL9pac = SingleValueAnimationKt.m114animateColorAsStateeuL9pac(topAppBarColors.m2529containerColorvNxB06k$material3_release(SingleRowTopAppBar_cJHQLPU$lambda$9((State) rememberedValue2)), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, null, startRestartGroup, 48, 12);
                        ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1370231018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$actionsRow$1
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

                            public final void invoke(Composer composer3, int i6) {
                                ComposerKt.sourceInformation(composer3, "C1895@87019L173:AppBar.kt#uh7d8r");
                                if ((i6 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1370231018, i6, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1895)");
                                    }
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer3, 54);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, companion3);
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
                                    function32.invoke(RowScopeInstance.INSTANCE, composer3, 6);
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
                        }, startRestartGroup, 54);
                        startRestartGroup.startReplaceGroup(-1193605157);
                        ComposerKt.sourceInformation(startRestartGroup, "1908@87542L55,1908@87519L78,1909@87631L283");
                        if (topAppBarScrollBehavior != null && !topAppBarScrollBehavior.getIsPinned()) {
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Orientation orientation = Orientation.Vertical;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1193599057, "CC(remember):AppBar.kt#9igjgp");
                            boolean z3 = i5 == 536870912;
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                                        invoke(f2.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(float f2) {
                                        TopAppBarState state = TopAppBarScrollBehavior.this.getState();
                                        state.setHeightOffset(state.getHeightOffset() + f2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            DraggableState rememberDraggableState = DraggableKt.rememberDraggableState((Function1) rememberedValue3, startRestartGroup, 0);
                            Modifier.Companion companion4 = companion3;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1193595981, "CC(remember):AppBar.kt#9igjgp");
                            boolean z4 = i5 == 536870912;
                            AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 rememberedValue4 = startRestartGroup.rememberedValue();
                            if (z4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            companion = DraggableKt.draggable(companion4, rememberDraggableState, orientation, (r20 & 4) != 0, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? DraggableKt.NoOpOnDragStarted : null, (r20 & 64) != 0 ? DraggableKt.NoOpOnDragStopped : (Function3) rememberedValue4, (r20 & 128) != 0 ? false : false);
                        } else {
                            companion = Modifier.INSTANCE;
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier modifier4 = companion2;
                        composer2 = startRestartGroup;
                        SurfaceKt.m2223SurfaceT9BRK9s(companion2.then(companion), null, SingleRowTopAppBar_cJHQLPU$lambda$10(m114animateColorAsStateeuL9pac), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1943739546, true, new AppBarKt$SingleRowTopAppBar$3(windowInsets, f, topAppBarScrollBehavior, topAppBarColors, function2, textStyle, z, function22, rememberComposableLambda), composer2, 54), composer2, 12582912, 122);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                    }
                }
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
            }
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = startRestartGroup;
            ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
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

                    public final void invoke(Composer composer3, int i6) {
                        AppBarKt.m1451SingleRowTopAppBarcJHQLPU(Modifier.this, function2, textStyle, z, function22, function3, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        if ((i2 & 256) == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if ((306783379 & i3) == 306783378) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!Float.isNaN(f)) {
        }
        throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c6  */
    /* renamed from: TwoRowsTopAppBar-nS6u9G4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1454TwoRowsTopAppBarnS6u9G4(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final float f, final Function2<? super Composer, ? super Integer, Unit> function22, final TextStyle textStyle2, final Function2<? super Composer, ? super Integer, Unit> function23, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final float f2, final float f3, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier.Companion companion;
        Composer composer2;
        final Modifier modifier2;
        TopAppBarState state;
        Composer startRestartGroup = composer.startRestartGroup(1169193376);
        ComposerKt.sourceInformation(startRestartGroup, "C(TwoRowsTopAppBar)P(4,9,11,10:c#ui.unit.Dp,7,8,5!1,1:c#ui.unit.Dp,3:c#ui.unit.Dp,12)*1984@90586L7,1992@90915L205,1992@90904L216,2008@91751L197,2042@93233L2309,2042@93149L2393:AppBar.kt#uh7d8r");
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(textStyle) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(f) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(textStyle2) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(function23) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(f2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i3 & 512) != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= startRestartGroup.changed(f3) ? 536870912 : 268435456;
                }
                if ((i3 & 1024) != 0) {
                    i5 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i5 = i2 | (startRestartGroup.changed(windowInsets) ? 4 : 2);
                } else {
                    i5 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i5 |= 48;
                } else if ((i2 & 48) == 0) {
                    i5 |= startRestartGroup.changed(topAppBarColors) ? 32 : 16;
                }
                int i7 = i5;
                if ((i3 & 4096) != 0) {
                    i7 |= 384;
                } else if ((i2 & 384) == 0) {
                    i7 |= startRestartGroup.changed(topAppBarScrollBehavior) ? 256 : 128;
                }
                if ((306783379 & i4) == 306783378 || (i7 & 147) != 146 || !startRestartGroup.getSkipping()) {
                    Modifier.Companion companion2 = i6 != 0 ? Modifier.INSTANCE : modifier;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1169193376, i4, i7, "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:1971)");
                    }
                    if (!Float.isNaN(f2)) {
                        if (!(f2 == Float.POSITIVE_INFINITY)) {
                            if (!Float.isNaN(f3)) {
                                if (!(f3 == Float.POSITIVE_INFINITY)) {
                                    if (Dp.m6298compareTo0680j_4(f3, f2) < 0) {
                                        throw new IllegalArgumentException("The expandedHeight is expected to be greater or equal to the collapsedHeight".toString());
                                    }
                                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                                    final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                                    Ref.IntRef intRef = new Ref.IntRef();
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Density density = (Density) consume;
                                    floatRef.element = density.mo373toPx0680j_4(f3);
                                    floatRef2.element = density.mo373toPx0680j_4(f2);
                                    intRef.element = density.mo367roundToPx0680j_4(f);
                                    Unit unit = Unit.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1641215730, "CC(remember):AppBar.kt#9igjgp");
                                    int i8 = i7 & 896;
                                    boolean changed = (i8 == 256) | startRestartGroup.changed(floatRef2.element) | startRestartGroup.changed(floatRef.element);
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$5$1
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
                                                TopAppBarState state2;
                                                TopAppBarScrollBehavior topAppBarScrollBehavior2 = TopAppBarScrollBehavior.this;
                                                if (Intrinsics.areEqual((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? null : Float.valueOf(state2.getHeightOffsetLimit()), floatRef2.element - floatRef.element)) {
                                                    return;
                                                }
                                                TopAppBarScrollBehavior topAppBarScrollBehavior3 = TopAppBarScrollBehavior.this;
                                                TopAppBarState state3 = topAppBarScrollBehavior3 != null ? topAppBarScrollBehavior3.getState() : null;
                                                if (state3 == null) {
                                                    return;
                                                }
                                                state3.setHeightOffsetLimit(floatRef2.element - floatRef.element);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
                                    float collapsedFraction = (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getCollapsedFraction();
                                    long m2529containerColorvNxB06k$material3_release = topAppBarColors.m2529containerColorvNxB06k$material3_release(collapsedFraction);
                                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-89435287, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$actionsRow$1
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

                                        public final void invoke(Composer composer3, int i9) {
                                            ComposerKt.sourceInformation(composer3, "C2009@91765L173:AppBar.kt#uh7d8r");
                                            if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-89435287, i9, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2009)");
                                                }
                                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer3, 54);
                                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, companion3);
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
                                                function32.invoke(RowScopeInstance.INSTANCE, composer3, 6);
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
                                    }, startRestartGroup, 54);
                                    float transform = TopTitleAlphaEasing.transform(collapsedFraction);
                                    float f4 = 1.0f - collapsedFraction;
                                    boolean z = collapsedFraction < 0.5f;
                                    boolean z2 = !z;
                                    startRestartGroup.startReplaceGroup(1641266888);
                                    ComposerKt.sourceInformation(startRestartGroup, "2028@92709L55,2028@92686L78,2029@92798L283");
                                    if (topAppBarScrollBehavior != null && !topAppBarScrollBehavior.getIsPinned()) {
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        Orientation orientation = Orientation.Vertical;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1641272988, "CC(remember):AppBar.kt#9igjgp");
                                        boolean z3 = i8 == 256;
                                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (z3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Float f5) {
                                                    invoke(f5.floatValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(float f5) {
                                                    TopAppBarState state2 = TopAppBarScrollBehavior.this.getState();
                                                    state2.setHeightOffset(state2.getHeightOffset() + f5);
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        DraggableState rememberDraggableState = DraggableKt.rememberDraggableState((Function1) rememberedValue2, startRestartGroup, 0);
                                        Modifier.Companion companion4 = companion3;
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1641276064, "CC(remember):AppBar.kt#9igjgp");
                                        boolean z4 = i8 == 256;
                                        AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (z4 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        companion = DraggableKt.draggable(companion4, rememberDraggableState, orientation, (r20 & 4) != 0, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? DraggableKt.NoOpOnDragStarted : null, (r20 & 64) != 0 ? DraggableKt.NoOpOnDragStopped : (Function3) rememberedValue3, (r20 & 128) != 0 ? false : false);
                                    } else {
                                        companion = Modifier.INSTANCE;
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    Modifier modifier3 = companion2;
                                    composer2 = startRestartGroup;
                                    SurfaceKt.m2223SurfaceT9BRK9s(companion2.then(companion), null, m2529containerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1350062619, true, new AppBarKt$TwoRowsTopAppBar$6(windowInsets, f2, topAppBarColors, function22, textStyle2, transform, z, function23, rememberComposableLambda, f3, topAppBarScrollBehavior, function2, textStyle, f4, intRef, z2), composer2, 54), composer2, 12582912, 122);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                }
                            }
                            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
                        }
                    }
                    throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite".toString());
                }
                startRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                composer2 = startRestartGroup;
                ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$7
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

                        public final void invoke(Composer composer3, int i9) {
                            AppBarKt.m1454TwoRowsTopAppBarnS6u9G4(Modifier.this, function2, textStyle, f, function22, textStyle2, function23, function3, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                    return;
                }
                return;
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            int i72 = i5;
            if ((i3 & 4096) != 0) {
            }
            if ((306783379 & i4) == 306783378) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!Float.isNaN(f2)) {
            }
            throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite".toString());
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        int i722 = i5;
        if ((i3 & 4096) != 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!Float.isNaN(f2)) {
        }
        throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TopAppBarLayout-kXwM9vE, reason: not valid java name */
    public static final void m1453TopAppBarLayoutkXwM9vE(final Modifier modifier, final ScrolledOffset scrolledOffset, final long j, final long j2, final long j3, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final float f, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final int i, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-742442296);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopAppBarLayout)P(3,6,5:c#ui.graphics.Color,10:c#ui.graphics.Color,0:c#ui.graphics.Color,7,12,8,13,11,9,2,4)2163@98873L5882,2135@97725L7030:AppBar.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? startRestartGroup.changed(scrolledOffset) : startRestartGroup.changedInstance(scrolledOffset) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(j3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changed(textStyle) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= startRestartGroup.changed(vertical) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= startRestartGroup.changed(horizontal) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(i) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
        }
        int i6 = i5;
        if ((306783379 & i4) != 306783378 || (i6 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-742442296, i4, i6, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2134)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1539011656, "CC(remember):AppBar.kt#9igjgp");
            boolean z2 = ((i4 & 112) == 32 || ((i4 & 64) != 0 && startRestartGroup.changedInstance(scrolledOffset))) | ((1879048192 & i4) == 536870912) | ((234881024 & i4) == 67108864) | ((i6 & 14) == 4);
            MeasurePolicy rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo38measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, final long j4) {
                        int coerceAtLeast;
                        int m6251getMaxHeightimpl;
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            Measurable measurable = list.get(i7);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "navigationIcon")) {
                                final Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j4, 0, 0, 0, 0, 14, null));
                                int size2 = list.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    Measurable measurable2 = list.get(i8);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "actionIcons")) {
                                        final Placeable mo5175measureBRTryo02 = measurable2.mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j4, 0, 0, 0, 0, 14, null));
                                        if (Constraints.m6252getMaxWidthimpl(j4) == Integer.MAX_VALUE) {
                                            coerceAtLeast = Constraints.m6252getMaxWidthimpl(j4);
                                        } else {
                                            coerceAtLeast = RangesKt.coerceAtLeast((Constraints.m6252getMaxWidthimpl(j4) - mo5175measureBRTryo0.getWidth()) - mo5175measureBRTryo02.getWidth(), 0);
                                        }
                                        int i9 = coerceAtLeast;
                                        int size3 = list.size();
                                        for (int i10 = 0; i10 < size3; i10++) {
                                            Measurable measurable3 = list.get(i10);
                                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "title")) {
                                                final Placeable mo5175measureBRTryo03 = measurable3.mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j4, 0, i9, 0, 0, 12, null));
                                                final int i11 = mo5175measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE ? mo5175measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) : 0;
                                                float offset = ScrolledOffset.this.offset();
                                                int roundToInt = Float.isNaN(offset) ? 0 : MathKt.roundToInt(offset);
                                                if (Constraints.m6251getMaxHeightimpl(j4) == Integer.MAX_VALUE) {
                                                    m6251getMaxHeightimpl = Constraints.m6251getMaxHeightimpl(j4);
                                                } else {
                                                    m6251getMaxHeightimpl = Constraints.m6251getMaxHeightimpl(j4) + roundToInt;
                                                }
                                                final int i12 = m6251getMaxHeightimpl;
                                                int m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j4);
                                                final Arrangement.Horizontal horizontal2 = horizontal;
                                                final Arrangement.Vertical vertical2 = vertical;
                                                final int i13 = i;
                                                return MeasureScope.layout$default(measureScope, m6252getMaxWidthimpl, i12, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1.1
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
                                                        float f2;
                                                        int max;
                                                        int i14;
                                                        int height;
                                                        int m6252getMaxWidthimpl2;
                                                        Placeable placeable = Placeable.this;
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i12 - placeable.getHeight()) / 2, 0.0f, 4, null);
                                                        Placeable placeable2 = mo5175measureBRTryo03;
                                                        Arrangement.Horizontal horizontal3 = horizontal2;
                                                        if (Intrinsics.areEqual(horizontal3, Arrangement.INSTANCE.getCenter())) {
                                                            max = (Constraints.m6252getMaxWidthimpl(j4) - mo5175measureBRTryo03.getWidth()) / 2;
                                                            if (max < Placeable.this.getWidth()) {
                                                                m6252getMaxWidthimpl2 = Placeable.this.getWidth() - max;
                                                            } else if (mo5175measureBRTryo03.getWidth() + max > Constraints.m6252getMaxWidthimpl(j4) - mo5175measureBRTryo02.getWidth()) {
                                                                m6252getMaxWidthimpl2 = (Constraints.m6252getMaxWidthimpl(j4) - mo5175measureBRTryo02.getWidth()) - (mo5175measureBRTryo03.getWidth() + max);
                                                            }
                                                            max += m6252getMaxWidthimpl2;
                                                        } else if (Intrinsics.areEqual(horizontal3, Arrangement.INSTANCE.getEnd())) {
                                                            max = (Constraints.m6252getMaxWidthimpl(j4) - mo5175measureBRTryo03.getWidth()) - mo5175measureBRTryo02.getWidth();
                                                        } else {
                                                            MeasureScope measureScope2 = measureScope;
                                                            f2 = AppBarKt.TopAppBarTitleInset;
                                                            max = Math.max(measureScope2.mo367roundToPx0680j_4(f2), Placeable.this.getWidth());
                                                        }
                                                        int i15 = max;
                                                        Arrangement.Vertical vertical3 = vertical2;
                                                        if (!Intrinsics.areEqual(vertical3, Arrangement.INSTANCE.getCenter())) {
                                                            if (Intrinsics.areEqual(vertical3, Arrangement.INSTANCE.getBottom())) {
                                                                int i16 = i13;
                                                                if (i16 == 0) {
                                                                    height = i12 - mo5175measureBRTryo03.getHeight();
                                                                } else {
                                                                    int height2 = i16 - (mo5175measureBRTryo03.getHeight() - i11);
                                                                    int height3 = mo5175measureBRTryo03.getHeight() + height2;
                                                                    if (height3 > Constraints.m6251getMaxHeightimpl(j4)) {
                                                                        height2 -= height3 - Constraints.m6251getMaxHeightimpl(j4);
                                                                    }
                                                                    i14 = (i12 - mo5175measureBRTryo03.getHeight()) - Math.max(0, height2);
                                                                }
                                                            } else {
                                                                i14 = 0;
                                                            }
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i15, i14, 0.0f, 4, null);
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo02, Constraints.m6252getMaxWidthimpl(j4) - mo5175measureBRTryo02.getWidth(), (i12 - mo5175measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                                        }
                                                        height = (i12 - mo5175measureBRTryo03.getHeight()) / 2;
                                                        i14 = height;
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i15, i14, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo02, Constraints.m6252getMaxWidthimpl(j4) - mo5175measureBRTryo02.getWidth(), (i12 - mo5175measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
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
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 9049318, "C2137@97755L280,2143@98048L502,2155@98563L264:AppBar.kt#uh7d8r");
            Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "navigationIcon");
            float f2 = TopAppBarHorizontalPadding;
            Modifier m685paddingqDBjuR0$default = PaddingKt.m685paddingqDBjuR0$default(layoutId, f2, 0.0f, 0.0f, 0.0f, 14, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m685paddingqDBjuR0$default);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 249765716, "C2138@97858L163:AppBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(j)), function22, startRestartGroup, ProvidedValue.$stable | ((i6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier m683paddingVpY3zN4$default = PaddingKt.m683paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "title"), f2, 0.0f, 2, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            if (z) {
                companion = SemanticsModifierKt.clearAndSetSemantics(companion, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$1$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
            }
            Modifier m4001graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m4001graphicsLayerAp8cVGQ$default(m683paddingVpY3zN4$default.then(companion), 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m4001graphicsLayerAp8cVGQ$default);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 250255454, "C2149@98351L185:AppBar.kt#uh7d8r");
            int i7 = i4 >> 9;
            ProvideContentColorTextStyleKt.m2583ProvideContentColorTextStyle3JVO9M(j2, textStyle, function2, startRestartGroup, ((i4 >> 15) & 112) | (i7 & 14) | (i7 & 896));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier m685paddingqDBjuR0$default2 = PaddingKt.m685paddingqDBjuR0$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m685paddingqDBjuR0$default2);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 250561951, "C2156@98661L152:AppBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3830boximpl(j3)), function23, startRestartGroup, ((i6 >> 6) & 112) | ProvidedValue.$stable);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$3
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
                    AppBarKt.m1453TopAppBarLayoutkXwM9vE(Modifier.this, scrolledOffset, j, j2, j3, function2, textStyle, f, vertical, horizontal, i, z, function22, function23, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object settleAppBar(TopAppBarState topAppBarState, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Continuation<? super Velocity> continuation) {
        AppBarKt$settleAppBar$1 appBarKt$settleAppBar$1;
        Object coroutine_suspended;
        int i;
        final Ref.FloatRef floatRef;
        AnimationSpec<Float> animationSpec2;
        AnimationSpec<Float> animationSpec3;
        AnimationState AnimationState$default;
        Float boxFloat;
        Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1;
        Ref.FloatRef floatRef2;
        final TopAppBarState topAppBarState2 = topAppBarState;
        if (continuation instanceof AppBarKt$settleAppBar$1) {
            appBarKt$settleAppBar$1 = (AppBarKt$settleAppBar$1) continuation;
            if ((appBarKt$settleAppBar$1.label & Integer.MIN_VALUE) != 0) {
                appBarKt$settleAppBar$1.label -= Integer.MIN_VALUE;
                Object obj = appBarKt$settleAppBar$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appBarKt$settleAppBar$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (topAppBarState.getCollapsedFraction() < 0.01f || topAppBarState.getCollapsedFraction() == 1.0f) {
                        return Velocity.m6527boximpl(Velocity.INSTANCE.m6547getZero9UxMQ8M());
                    }
                    floatRef = new Ref.FloatRef();
                    floatRef.element = f;
                    if (decayAnimationSpec == null || Math.abs(f) <= 1.0f) {
                        animationSpec2 = animationSpec;
                    } else {
                        final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                        AnimationState AnimationState$default2 = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                        Function1<AnimationScope<Float, AnimationVector1D>, Unit> function12 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt$settleAppBar$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                                invoke2(animationScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                                float floatValue = animationScope.getValue().floatValue() - Ref.FloatRef.this.element;
                                float heightOffset = topAppBarState2.getHeightOffset();
                                topAppBarState2.setHeightOffset(heightOffset + floatValue);
                                float abs = Math.abs(heightOffset - topAppBarState2.getHeightOffset());
                                Ref.FloatRef.this.element = animationScope.getValue().floatValue();
                                floatRef.element = animationScope.getVelocity().floatValue();
                                if (Math.abs(floatValue - abs) > 0.5f) {
                                    animationScope.cancelAnimation();
                                }
                            }
                        };
                        appBarKt$settleAppBar$1.L$0 = topAppBarState2;
                        animationSpec2 = animationSpec;
                        appBarKt$settleAppBar$1.L$1 = animationSpec2;
                        appBarKt$settleAppBar$1.L$2 = floatRef;
                        appBarKt$settleAppBar$1.label = 1;
                        if (SuspendAnimationKt.animateDecay$default(AnimationState$default2, decayAnimationSpec, false, function12, appBarKt$settleAppBar$1, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        floatRef2 = (Ref.FloatRef) appBarKt$settleAppBar$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        floatRef = floatRef2;
                        return Velocity.m6527boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
                    }
                    Ref.FloatRef floatRef4 = (Ref.FloatRef) appBarKt$settleAppBar$1.L$2;
                    AnimationSpec<Float> animationSpec4 = (AnimationSpec) appBarKt$settleAppBar$1.L$1;
                    TopAppBarState topAppBarState3 = (TopAppBarState) appBarKt$settleAppBar$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    floatRef = floatRef4;
                    animationSpec2 = animationSpec4;
                    topAppBarState2 = topAppBarState3;
                }
                animationSpec3 = animationSpec2;
                if (animationSpec3 != null && topAppBarState2.getHeightOffset() < 0.0f && topAppBarState2.getHeightOffset() > topAppBarState2.getHeightOffsetLimit()) {
                    AnimationState$default = AnimationStateKt.AnimationState$default(topAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
                    boxFloat = Boxing.boxFloat(topAppBarState2.getCollapsedFraction() >= 0.5f ? 0.0f : topAppBarState2.getHeightOffsetLimit());
                    function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt$settleAppBar$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                            invoke2(animationScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                            TopAppBarState.this.setHeightOffset(animationScope.getValue().floatValue());
                        }
                    };
                    appBarKt$settleAppBar$1.L$0 = floatRef;
                    appBarKt$settleAppBar$1.L$1 = null;
                    appBarKt$settleAppBar$1.L$2 = null;
                    appBarKt$settleAppBar$1.label = 2;
                    if (SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec3, false, function1, appBarKt$settleAppBar$1, 4, null) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef2 = floatRef;
                    floatRef = floatRef2;
                }
                return Velocity.m6527boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
            }
        }
        appBarKt$settleAppBar$1 = new AppBarKt$settleAppBar$1(continuation);
        Object obj2 = appBarKt$settleAppBar$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appBarKt$settleAppBar$1.label;
        if (i != 0) {
        }
        animationSpec3 = animationSpec2;
        if (animationSpec3 != null) {
            AnimationState$default = AnimationStateKt.AnimationState$default(topAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
            boxFloat = Boxing.boxFloat(topAppBarState2.getCollapsedFraction() >= 0.5f ? 0.0f : topAppBarState2.getHeightOffsetLimit());
            function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt$settleAppBar$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                    TopAppBarState.this.setHeightOffset(animationScope.getValue().floatValue());
                }
            };
            appBarKt$settleAppBar$1.L$0 = floatRef;
            appBarKt$settleAppBar$1.L$1 = null;
            appBarKt$settleAppBar$1.L$2 = null;
            appBarKt$settleAppBar$1.label = 2;
            if (SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec3, false, function1, appBarKt$settleAppBar$1, 4, null) != coroutine_suspended) {
            }
        }
        return Velocity.m6527boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
    }

    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return TopTitleAlphaEasing;
    }

    private static final float SingleRowTopAppBar_cJHQLPU$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long SingleRowTopAppBar_cJHQLPU$lambda$10(State<Color> state) {
        return state.getValue().m3850unboximpl();
    }

    static {
        float f = 16;
        float f2 = 12;
        float m6299constructorimpl = Dp.m6299constructorimpl(Dp.m6299constructorimpl(f) - Dp.m6299constructorimpl(f2));
        BottomAppBarHorizontalPadding = m6299constructorimpl;
        float m6299constructorimpl2 = Dp.m6299constructorimpl(Dp.m6299constructorimpl(f) - Dp.m6299constructorimpl(f2));
        BottomAppBarVerticalPadding = m6299constructorimpl2;
        FABHorizontalPadding = Dp.m6299constructorimpl(Dp.m6299constructorimpl(f) - m6299constructorimpl);
        FABVerticalPadding = Dp.m6299constructorimpl(Dp.m6299constructorimpl(f2) - m6299constructorimpl2);
        TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        MediumTitleBottomPadding = Dp.m6299constructorimpl(24);
        LargeTitleBottomPadding = Dp.m6299constructorimpl(28);
        float m6299constructorimpl3 = Dp.m6299constructorimpl(4);
        TopAppBarHorizontalPadding = m6299constructorimpl3;
        TopAppBarTitleInset = Dp.m6299constructorimpl(Dp.m6299constructorimpl(f) - m6299constructorimpl3);
    }
}
