package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a\u0094\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0080\u0001\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u009a\u0001\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012.\b\u0002\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0086\u0001\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a \u0001\u0010+\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2,\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0003ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u0094\u0001\u0010.\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u001c\u001a\u0080\u0001\u00100\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u001f\u001a\u0090\u0001\u00102\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102.\b\u0002\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u001f\u001an\u00104\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a~\u00107\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102,\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000¢\u0006\u0004\b8\u00106\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "TabRowIndicatorSpec", "PrimaryScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "Landroidx/compose/material3/TabIndicatorScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "divider", "Lkotlin/Function0;", "tabs", "PrimaryScrollableTabRow-qhFBPw4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PrimaryTabRow", "PrimaryTabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "", "Landroidx/compose/material3/TabPosition;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "tabPositions", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRowImpl", "ScrollableTabRowImpl-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ScrollableTabRowWithSubcomposeImpl", "ScrollableTabRowWithSubcomposeImpl-qhFBPw4", "(ILkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "SecondaryScrollableTabRow", "SecondaryScrollableTabRow-qhFBPw4", "SecondaryTabRow", "SecondaryTabRow-pAZo6Ak", "TabRow", "TabRow-pAZo6Ak", "TabRowImpl", "TabRowImpl-DTcfvLk", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabRowWithSubcomposeImpl", "TabRowWithSubcomposeImpl-DTcfvLk", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m6299constructorimpl(90);
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final AnimationSpec<Dp> TabRowIndicatorSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:104:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0082  */
    /* renamed from: PrimaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2272PrimaryTabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Modifier.Companion companion;
        long j5;
        ComposableLambda rememberComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> m1662getLambda1$material3_release;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1884787284);
        ComposerKt.sourceInformation(startRestartGroup, "C(PrimaryTabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)154@7555L21,155@7619L19,156@7698L189,165@8005L76:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i8 = 256;
                        i4 |= i8;
                    }
                } else {
                    j3 = j;
                }
                i8 = 128;
                i4 |= i8;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i7 = 2048;
                        i4 |= i7;
                    }
                } else {
                    j4 = j2;
                }
                i7 = 1024;
                i4 |= i7;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                function32 = function3;
                i4 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    function23 = function2;
                    i4 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        if ((i4 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i9 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    j3 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    j5 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                    i4 &= -7169;
                                } else {
                                    j5 = j4;
                                }
                                rememberComposableLambda = i5 != 0 ? ComposableLambdaKt.rememberComposableLambda(-2021049253, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, Integer num) {
                                        invoke(tabIndicatorScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, int i10) {
                                        int i11;
                                        ComposerKt.sourceInformation(composer2, "C157@7723L158:TabRow.kt#uh7d8r");
                                        if ((i10 & 6) == 0) {
                                            i11 = ((i10 & 8) == 0 ? composer2.changed(tabIndicatorScope) : composer2.changedInstance(tabIndicatorScope) ? 4 : 2) | i10;
                                        } else {
                                            i11 = i10;
                                        }
                                        if ((i11 & 19) != 18 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2021049253, i11, -1, "androidx.compose.material3.PrimaryTabRow.<anonymous> (TabRow.kt:157)");
                                            }
                                            TabRowDefaults.INSTANCE.m2267PrimaryIndicator10LGxhE(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, true), Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM(), 0.0f, 0L, null, composer2, 196656, 28);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54) : function32;
                                if (i6 != 0) {
                                    m1662getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1662getLambda1$material3_release();
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1884787284, i4, -1, "androidx.compose.material3.PrimaryTabRow (TabRow.kt:164)");
                                    }
                                    m2279TabRowImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1662getLambda1$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = companion;
                                    function32 = rememberComposableLambda;
                                    function23 = m1662getLambda1$material3_release;
                                    j4 = j5;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                companion = modifier;
                                j5 = j4;
                                rememberComposableLambda = function32;
                            }
                            m1662getLambda1$material3_release = function23;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            m2279TabRowImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1662getLambda1$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = companion;
                            function32 = rememberComposableLambda;
                            function23 = m1662getLambda1$material3_release;
                            j4 = j5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final long j6 = j3;
                            final long j7 = j4;
                            final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                            final Function2<? super Composer, ? super Integer, Unit> function24 = function23;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryTabRow$2
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
                                    TabRowKt.m2272PrimaryTabRowpAZo6Ak(i, modifier3, j6, j7, function33, function24, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i4 & 599187) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    m1662getLambda1$material3_release = function23;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    m2279TabRowImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1662getLambda1$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    function32 = rememberComposableLambda;
                    function23 = m1662getLambda1$material3_release;
                    j4 = j5;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function23 = function2;
                if ((i3 & 64) == 0) {
                }
                if ((i4 & 599187) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                m1662getLambda1$material3_release = function23;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m2279TabRowImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1662getLambda1$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                function32 = rememberComposableLambda;
                function23 = m1662getLambda1$material3_release;
                j4 = j5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function32 = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((i3 & 64) == 0) {
            }
            if ((i4 & 599187) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            m1662getLambda1$material3_release = function23;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            m2279TabRowImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1662getLambda1$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            function32 = rememberComposableLambda;
            function23 = m1662getLambda1$material3_release;
            j4 = j5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((i3 & 64) == 0) {
        }
        if ((i4 & 599187) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        m1662getLambda1$material3_release = function23;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        m2279TabRowImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1662getLambda1$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        function32 = rememberComposableLambda;
        function23 = m1662getLambda1$material3_release;
        j4 = j5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0082  */
    /* renamed from: SecondaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2277SecondaryTabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Modifier.Companion companion;
        long j5;
        ComposableLambda rememberComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> m1663getLambda2$material3_release;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1909540706);
        ComposerKt.sourceInformation(startRestartGroup, "C(SecondaryTabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)208@10501L23,209@10567L21,211@10668L160,219@10946L76:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i8 = 256;
                        i4 |= i8;
                    }
                } else {
                    j3 = j;
                }
                i8 = 128;
                i4 |= i8;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i7 = 2048;
                        i4 |= i7;
                    }
                } else {
                    j4 = j2;
                }
                i7 = 1024;
                i4 |= i7;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                function32 = function3;
                i4 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    function23 = function2;
                    i4 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        if ((i4 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i9 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    j3 = TabRowDefaults.INSTANCE.getSecondaryContainerColor(startRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    j5 = TabRowDefaults.INSTANCE.getSecondaryContentColor(startRestartGroup, 6);
                                    i4 &= -7169;
                                } else {
                                    j5 = j4;
                                }
                                rememberComposableLambda = i5 != 0 ? ComposableLambdaKt.rememberComposableLambda(286693261, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, Integer num) {
                                        invoke(tabIndicatorScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, int i10) {
                                        ComposerKt.sourceInformation(composer2, "C212@10697L121:TabRow.kt#uh7d8r");
                                        if ((i10 & 6) == 0) {
                                            i10 |= (i10 & 8) == 0 ? composer2.changed(tabIndicatorScope) : composer2.changedInstance(tabIndicatorScope) ? 4 : 2;
                                        }
                                        if ((i10 & 19) != 18 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(286693261, i10, -1, "androidx.compose.material3.SecondaryTabRow.<anonymous> (TabRow.kt:212)");
                                            }
                                            TabRowDefaults.INSTANCE.m2268SecondaryIndicator9IZ8Weo(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, false), 0.0f, 0L, composer2, 3072, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54) : function32;
                                if (i6 != 0) {
                                    m1663getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1663getLambda2$material3_release();
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1909540706, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:218)");
                                    }
                                    m2279TabRowImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1663getLambda2$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = companion;
                                    function32 = rememberComposableLambda;
                                    function23 = m1663getLambda2$material3_release;
                                    j4 = j5;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                companion = modifier;
                                j5 = j4;
                                rememberComposableLambda = function32;
                            }
                            m1663getLambda2$material3_release = function23;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            m2279TabRowImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1663getLambda2$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = companion;
                            function32 = rememberComposableLambda;
                            function23 = m1663getLambda2$material3_release;
                            j4 = j5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final long j6 = j3;
                            final long j7 = j4;
                            final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                            final Function2<? super Composer, ? super Integer, Unit> function24 = function23;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryTabRow$2
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
                                    TabRowKt.m2277SecondaryTabRowpAZo6Ak(i, modifier3, j6, j7, function33, function24, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i4 & 599187) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    m1663getLambda2$material3_release = function23;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    m2279TabRowImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1663getLambda2$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    function32 = rememberComposableLambda;
                    function23 = m1663getLambda2$material3_release;
                    j4 = j5;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function23 = function2;
                if ((i3 & 64) == 0) {
                }
                if ((i4 & 599187) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                m1663getLambda2$material3_release = function23;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m2279TabRowImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1663getLambda2$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                function32 = rememberComposableLambda;
                function23 = m1663getLambda2$material3_release;
                j4 = j5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function32 = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((i3 & 64) == 0) {
            }
            if ((i4 & 599187) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            m1663getLambda2$material3_release = function23;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            m2279TabRowImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1663getLambda2$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            function32 = rememberComposableLambda;
            function23 = m1663getLambda2$material3_release;
            j4 = j5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((i3 & 64) == 0) {
        }
        if ((i4 & 599187) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        m1663getLambda2$material3_release = function23;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        m2279TabRowImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1663getLambda2$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        function32 = rememberComposableLambda;
        function23 = m1663getLambda2$material3_release;
        j4 = j5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0082  */
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2278TabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Modifier.Companion companion;
        long j5;
        ComposableLambda rememberComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> m1664getLambda3$material3_release;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1199178586);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)302@15283L21,303@15347L19,305@15459L246,315@15823L90:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i8 = 256;
                        i4 |= i8;
                    }
                } else {
                    j3 = j;
                }
                i8 = 128;
                i4 |= i8;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i7 = 2048;
                        i4 |= i7;
                    }
                } else {
                    j4 = j2;
                }
                i7 = 1024;
                i4 |= i7;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                function32 = function3;
                i4 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    function23 = function2;
                    i4 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        if ((i4 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i9 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    j3 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    j5 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                    i4 &= -7169;
                                } else {
                                    j5 = j4;
                                }
                                rememberComposableLambda = i5 != 0 ? ComposableLambdaKt.rememberComposableLambda(-2052073983, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                        invoke((List<TabPosition>) list, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(List<TabPosition> list, Composer composer2, int i10) {
                                        ComposerKt.sourceInformation(composer2, "C307@15564L117:TabRow.kt#uh7d8r");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2052073983, i10, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:306)");
                                        }
                                        if (i < list.size()) {
                                            TabRowDefaults.INSTANCE.m2268SecondaryIndicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54) : function32;
                                if (i6 != 0) {
                                    m1664getLambda3$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1664getLambda3$material3_release();
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1199178586, i4, -1, "androidx.compose.material3.TabRow (TabRow.kt:314)");
                                    }
                                    m2280TabRowWithSubcomposeImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1664getLambda3$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = companion;
                                    function32 = rememberComposableLambda;
                                    function23 = m1664getLambda3$material3_release;
                                    j4 = j5;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                companion = modifier;
                                j5 = j4;
                                rememberComposableLambda = function32;
                            }
                            m1664getLambda3$material3_release = function23;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            m2280TabRowWithSubcomposeImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1664getLambda3$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = companion;
                            function32 = rememberComposableLambda;
                            function23 = m1664getLambda3$material3_release;
                            j4 = j5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final long j6 = j3;
                            final long j7 = j4;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = function32;
                            final Function2<? super Composer, ? super Integer, Unit> function24 = function23;
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
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
                                    TabRowKt.m2278TabRowpAZo6Ak(i, modifier3, j6, j7, function33, function24, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i4 & 599187) == 599186) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    m1664getLambda3$material3_release = function23;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    m2280TabRowWithSubcomposeImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1664getLambda3$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    function32 = rememberComposableLambda;
                    function23 = m1664getLambda3$material3_release;
                    j4 = j5;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function23 = function2;
                if ((i3 & 64) == 0) {
                }
                if ((i4 & 599187) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                m1664getLambda3$material3_release = function23;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m2280TabRowWithSubcomposeImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1664getLambda3$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                function32 = rememberComposableLambda;
                function23 = m1664getLambda3$material3_release;
                j4 = j5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function32 = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((i3 & 64) == 0) {
            }
            if ((i4 & 599187) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            m1664getLambda3$material3_release = function23;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            m2280TabRowWithSubcomposeImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1664getLambda3$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            function32 = rememberComposableLambda;
            function23 = m1664getLambda3$material3_release;
            j4 = j5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((i3 & 64) == 0) {
        }
        if ((i4 & 599187) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        m1664getLambda3$material3_release = function23;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        m2280TabRowWithSubcomposeImplDTcfvLk(companion, j3, j5, rememberComposableLambda, m1664getLambda3$material3_release, function22, startRestartGroup, (i4 >> 3) & 524286);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        function32 = rememberComposableLambda;
        function23 = m1664getLambda3$material3_release;
        j4 = j5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017d  */
    /* renamed from: PrimaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2271PrimaryScrollableTabRowqhFBPw4(final int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        int i7;
        ScrollState scrollState2;
        int i8;
        ComposableLambda composableLambda;
        Function2<? super Composer, ? super Integer, Unit> m1665getLambda4$material3_release;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32;
        Modifier modifier2;
        ScrollState scrollState3;
        float f3;
        long j5;
        long j6;
        Composer composer2;
        final Modifier modifier3;
        final ScrollState scrollState4;
        final long j7;
        final long j8;
        final float f4;
        final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1763241113);
        ComposerKt.sourceInformation(startRestartGroup, "C(PrimaryScrollableTabRow)P(7,5,6,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)357@18289L21,358@18355L21,359@18419L19,362@18589L198,371@18905L328:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0 && startRestartGroup.changed(scrollState)) {
                    i11 = 256;
                    i4 |= i11;
                }
                i11 = 128;
                i4 |= i11;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i10 = 2048;
                        i4 |= i10;
                    }
                } else {
                    j3 = j;
                }
                i10 = 1024;
                i4 |= i10;
            } else {
                j3 = j;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i9 = 16384;
                        i4 |= i9;
                    }
                } else {
                    j4 = j2;
                }
                i9 = 8192;
                i4 |= i9;
            } else {
                j4 = j2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i4 |= startRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    if ((i4 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i12 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 4) == 0) {
                                scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                i4 &= -897;
                            } else {
                                scrollState2 = scrollState;
                            }
                            if ((i3 & 8) != 0) {
                                j3 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                j4 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                i4 &= -57345;
                            }
                            float m2269getScrollableTabRowEdgeStartPaddingD9Ej5fM = i5 == 0 ? TabRowDefaults.INSTANCE.m2269getScrollableTabRowEdgeStartPaddingD9Ej5fM() : f2;
                            if (i6 == 0) {
                                i8 = i4;
                                composableLambda = ComposableLambdaKt.rememberComposableLambda(1601820568, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryScrollableTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, Integer num) {
                                        invoke(tabIndicatorScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, int i13) {
                                        int i14;
                                        ComposerKt.sourceInformation(composer3, "C363@18618L159:TabRow.kt#uh7d8r");
                                        if ((i13 & 6) == 0) {
                                            i14 = ((i13 & 8) == 0 ? composer3.changed(tabIndicatorScope) : composer3.changedInstance(tabIndicatorScope) ? 4 : 2) | i13;
                                        } else {
                                            i14 = i13;
                                        }
                                        if ((i14 & 19) != 18 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1601820568, i14, -1, "androidx.compose.material3.PrimaryScrollableTabRow.<anonymous> (TabRow.kt:363)");
                                            }
                                            TabRowDefaults.INSTANCE.m2267PrimaryIndicator10LGxhE(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, true), Dp.INSTANCE.m6319getUnspecifiedD9Ej5fM(), 0.0f, 0L, null, composer3, 196656, 28);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54);
                            } else {
                                i8 = i4;
                                composableLambda = function3;
                            }
                            m1665getLambda4$material3_release = i7 == 0 ? ComposableSingletons$TabRowKt.INSTANCE.m1665getLambda4$material3_release() : function2;
                            function32 = composableLambda;
                            modifier2 = companion;
                            scrollState3 = scrollState2;
                            f3 = m2269getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                            j5 = j3;
                            j6 = j4;
                            i4 = i8;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            modifier2 = modifier;
                            scrollState3 = scrollState;
                            function32 = function3;
                            m1665getLambda4$material3_release = function2;
                            j5 = j3;
                            j6 = j4;
                            f3 = f2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1763241113, i4, -1, "androidx.compose.material3.PrimaryScrollableTabRow (TabRow.kt:370)");
                        }
                        int i13 = i4 >> 3;
                        composer2 = startRestartGroup;
                        m2274ScrollableTabRowImplsKfQg0A(i, modifier2, j5, j6, f3, scrollState3, function32, m1665getLambda4$material3_release, function22, startRestartGroup, (i4 & WebSocketProtocol.PAYLOAD_SHORT) | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | ((i4 << 9) & 458752) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        scrollState4 = scrollState3;
                        j7 = j5;
                        j8 = j6;
                        f4 = f3;
                        function33 = function32;
                        function23 = m1665getLambda4$material3_release;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        scrollState4 = scrollState;
                        function33 = function3;
                        j7 = j3;
                        j8 = j4;
                        f4 = f2;
                        composer2 = startRestartGroup;
                        function23 = function2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryScrollableTabRow$2
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

                            public final void invoke(Composer composer3, int i14) {
                                TabRowKt.m2271PrimaryScrollableTabRowqhFBPw4(i, modifier3, scrollState4, j7, j8, f4, function33, function23, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i4 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if ((i3 & 4) == 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                function32 = composableLambda;
                modifier2 = companion;
                scrollState3 = scrollState2;
                f3 = m2269getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                j5 = j3;
                j6 = j4;
                i4 = i8;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i132 = i4 >> 3;
                composer2 = startRestartGroup;
                m2274ScrollableTabRowImplsKfQg0A(i, modifier2, j5, j6, f3, scrollState3, function32, m1665getLambda4$material3_release, function22, startRestartGroup, (i4 & WebSocketProtocol.PAYLOAD_SHORT) | (i132 & 896) | (i132 & 7168) | (i132 & 57344) | ((i4 << 9) & 458752) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                scrollState4 = scrollState3;
                j7 = j5;
                j8 = j6;
                f4 = f3;
                function33 = function32;
                function23 = m1665getLambda4$material3_release;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i4 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if ((i3 & 4) == 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            function32 = composableLambda;
            modifier2 = companion;
            scrollState3 = scrollState2;
            f3 = m2269getScrollableTabRowEdgeStartPaddingD9Ej5fM;
            j5 = j3;
            j6 = j4;
            i4 = i8;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1322 = i4 >> 3;
            composer2 = startRestartGroup;
            m2274ScrollableTabRowImplsKfQg0A(i, modifier2, j5, j6, f3, scrollState3, function32, m1665getLambda4$material3_release, function22, startRestartGroup, (i4 & WebSocketProtocol.PAYLOAD_SHORT) | (i1322 & 896) | (i1322 & 7168) | (i1322 & 57344) | ((i4 << 9) & 458752) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            scrollState4 = scrollState3;
            j7 = j5;
            j8 = j6;
            f4 = f3;
            function33 = function32;
            function23 = m1665getLambda4$material3_release;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i4 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        function32 = composableLambda;
        modifier2 = companion;
        scrollState3 = scrollState2;
        f3 = m2269getScrollableTabRowEdgeStartPaddingD9Ej5fM;
        j5 = j3;
        j6 = j4;
        i4 = i8;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i13222 = i4 >> 3;
        composer2 = startRestartGroup;
        m2274ScrollableTabRowImplsKfQg0A(i, modifier2, j5, j6, f3, scrollState3, function32, m1665getLambda4$material3_release, function22, startRestartGroup, (i4 & WebSocketProtocol.PAYLOAD_SHORT) | (i13222 & 896) | (i13222 & 7168) | (i13222 & 57344) | ((i4 << 9) & 458752) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        scrollState4 = scrollState3;
        j7 = j5;
        j8 = j6;
        f4 = f3;
        function33 = function32;
        function23 = m1665getLambda4$material3_release;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017d  */
    /* renamed from: SecondaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2276SecondaryScrollableTabRowqhFBPw4(final int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        int i7;
        ScrollState scrollState2;
        int i8;
        ComposableLambda composableLambda;
        Function2<? super Composer, ? super Integer, Unit> m1666getLambda5$material3_release;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32;
        Modifier modifier2;
        ScrollState scrollState3;
        float f3;
        long j5;
        long j6;
        Composer composer2;
        final Modifier modifier3;
        final ScrollState scrollState4;
        final long j7;
        final long j8;
        final float f4;
        final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1821940917);
        ComposerKt.sourceInformation(startRestartGroup, "C(SecondaryScrollableTabRow)P(7,5,6,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)427@21884L21,428@21950L23,429@22016L21,432@22188L160,440@22466L327:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0 && startRestartGroup.changed(scrollState)) {
                    i11 = 256;
                    i4 |= i11;
                }
                i11 = 128;
                i4 |= i11;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i10 = 2048;
                        i4 |= i10;
                    }
                } else {
                    j3 = j;
                }
                i10 = 1024;
                i4 |= i10;
            } else {
                j3 = j;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i9 = 16384;
                        i4 |= i9;
                    }
                } else {
                    j4 = j2;
                }
                i9 = 8192;
                i4 |= i9;
            } else {
                j4 = j2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i4 |= startRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    if ((i4 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i12 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 4) == 0) {
                                scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                i4 &= -897;
                            } else {
                                scrollState2 = scrollState;
                            }
                            if ((i3 & 8) != 0) {
                                j3 = TabRowDefaults.INSTANCE.getSecondaryContainerColor(startRestartGroup, 6);
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                j4 = TabRowDefaults.INSTANCE.getSecondaryContentColor(startRestartGroup, 6);
                                i4 &= -57345;
                            }
                            float m2269getScrollableTabRowEdgeStartPaddingD9Ej5fM = i5 == 0 ? TabRowDefaults.INSTANCE.m2269getScrollableTabRowEdgeStartPaddingD9Ej5fM() : f2;
                            if (i6 == 0) {
                                i8 = i4;
                                composableLambda = ComposableLambdaKt.rememberComposableLambda(1535842470, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryScrollableTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, Integer num) {
                                        invoke(tabIndicatorScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, int i13) {
                                        ComposerKt.sourceInformation(composer3, "C433@22217L121:TabRow.kt#uh7d8r");
                                        if ((i13 & 6) == 0) {
                                            i13 |= (i13 & 8) == 0 ? composer3.changed(tabIndicatorScope) : composer3.changedInstance(tabIndicatorScope) ? 4 : 2;
                                        }
                                        if ((i13 & 19) != 18 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1535842470, i13, -1, "androidx.compose.material3.SecondaryScrollableTabRow.<anonymous> (TabRow.kt:433)");
                                            }
                                            TabRowDefaults.INSTANCE.m2268SecondaryIndicator9IZ8Weo(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, false), 0.0f, 0L, composer3, 3072, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54);
                            } else {
                                i8 = i4;
                                composableLambda = function3;
                            }
                            m1666getLambda5$material3_release = i7 == 0 ? ComposableSingletons$TabRowKt.INSTANCE.m1666getLambda5$material3_release() : function2;
                            function32 = composableLambda;
                            modifier2 = companion;
                            scrollState3 = scrollState2;
                            f3 = m2269getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                            j5 = j3;
                            j6 = j4;
                            i4 = i8;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            modifier2 = modifier;
                            scrollState3 = scrollState;
                            function32 = function3;
                            m1666getLambda5$material3_release = function2;
                            j5 = j3;
                            j6 = j4;
                            f3 = f2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1821940917, i4, -1, "androidx.compose.material3.SecondaryScrollableTabRow (TabRow.kt:439)");
                        }
                        int i13 = i4 >> 3;
                        composer2 = startRestartGroup;
                        m2274ScrollableTabRowImplsKfQg0A(i, modifier2, j5, j6, f3, scrollState3, function32, m1666getLambda5$material3_release, function22, startRestartGroup, (i4 & WebSocketProtocol.PAYLOAD_SHORT) | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | ((i4 << 9) & 458752) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        scrollState4 = scrollState3;
                        j7 = j5;
                        j8 = j6;
                        f4 = f3;
                        function33 = function32;
                        function23 = m1666getLambda5$material3_release;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        scrollState4 = scrollState;
                        function33 = function3;
                        j7 = j3;
                        j8 = j4;
                        f4 = f2;
                        composer2 = startRestartGroup;
                        function23 = function2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryScrollableTabRow$2
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

                            public final void invoke(Composer composer3, int i14) {
                                TabRowKt.m2276SecondaryScrollableTabRowqhFBPw4(i, modifier3, scrollState4, j7, j8, f4, function33, function23, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i4 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if ((i3 & 4) == 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                function32 = composableLambda;
                modifier2 = companion;
                scrollState3 = scrollState2;
                f3 = m2269getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                j5 = j3;
                j6 = j4;
                i4 = i8;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i132 = i4 >> 3;
                composer2 = startRestartGroup;
                m2274ScrollableTabRowImplsKfQg0A(i, modifier2, j5, j6, f3, scrollState3, function32, m1666getLambda5$material3_release, function22, startRestartGroup, (i4 & WebSocketProtocol.PAYLOAD_SHORT) | (i132 & 896) | (i132 & 7168) | (i132 & 57344) | ((i4 << 9) & 458752) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                scrollState4 = scrollState3;
                j7 = j5;
                j8 = j6;
                f4 = f3;
                function33 = function32;
                function23 = m1666getLambda5$material3_release;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i4 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if ((i3 & 4) == 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            function32 = composableLambda;
            modifier2 = companion;
            scrollState3 = scrollState2;
            f3 = m2269getScrollableTabRowEdgeStartPaddingD9Ej5fM;
            j5 = j3;
            j6 = j4;
            i4 = i8;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1322 = i4 >> 3;
            composer2 = startRestartGroup;
            m2274ScrollableTabRowImplsKfQg0A(i, modifier2, j5, j6, f3, scrollState3, function32, m1666getLambda5$material3_release, function22, startRestartGroup, (i4 & WebSocketProtocol.PAYLOAD_SHORT) | (i1322 & 896) | (i1322 & 7168) | (i1322 & 57344) | ((i4 << 9) & 458752) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024));
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            scrollState4 = scrollState3;
            j7 = j5;
            j8 = j6;
            f4 = f3;
            function33 = function32;
            function23 = m1666getLambda5$material3_release;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i4 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        function32 = composableLambda;
        modifier2 = companion;
        scrollState3 = scrollState2;
        f3 = m2269getScrollableTabRowEdgeStartPaddingD9Ej5fM;
        j5 = j3;
        j6 = j4;
        i4 = i8;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i13222 = i4 >> 3;
        composer2 = startRestartGroup;
        m2274ScrollableTabRowImplsKfQg0A(i, modifier2, j5, j6, f3, scrollState3, function32, m1666getLambda5$material3_release, function22, startRestartGroup, (i4 & WebSocketProtocol.PAYLOAD_SHORT) | (i13222 & 896) | (i13222 & 7168) | (i13222 & 57344) | ((i4 << 9) & 458752) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024));
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        scrollState4 = scrollState3;
        j7 = j5;
        j8 = j6;
        f4 = f3;
        function33 = function32;
        function23 = m1666getLambda5$material3_release;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a1  */
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2273ScrollableTabRowsKfQg0A(final int i, Modifier modifier, long j, long j2, float f, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        final float f3;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-497821003);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollableTabRow)P(6,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)495@25349L21,496@25413L19,499@25596L164,516@26202L21,507@25878L351:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = 256;
                        i4 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = 128;
                i4 |= i9;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i8 = 2048;
                        i4 |= i8;
                    }
                } else {
                    j4 = j2;
                }
                i8 = 1024;
                i4 |= i8;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    function32 = function3;
                    i4 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        if ((i4 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i10 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    j3 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                    j4 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                }
                                if (i5 != 0) {
                                    f2 = TabRowDefaults.INSTANCE.m2269getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                                }
                                if (i6 != 0) {
                                    function32 = ComposableLambdaKt.rememberComposableLambda(-913748678, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                            invoke((List<TabPosition>) list, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(List<TabPosition> list, Composer composer3, int i11) {
                                            ComposerKt.sourceInformation(composer3, "C500@25641L109:TabRow.kt#uh7d8r");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-913748678, i11, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:500)");
                                            }
                                            TabRowDefaults.INSTANCE.m2268SecondaryIndicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer3, 3072, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54);
                                }
                                if (i7 != 0) {
                                    modifier2 = companion;
                                    function23 = ComposableSingletons$TabRowKt.INSTANCE.m1667getLambda6$material3_release();
                                } else {
                                    function23 = function2;
                                    modifier2 = companion;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                modifier2 = modifier;
                                function23 = function2;
                            }
                            long j7 = j3;
                            long j8 = j4;
                            float f4 = f2;
                            Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function32;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-497821003, i4, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:506)");
                            }
                            int i11 = i4 << 3;
                            composer2 = startRestartGroup;
                            m2275ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function34, modifier2, j7, j8, f4, function23, function22, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), startRestartGroup, (i4 & 14) | ((i4 >> 12) & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (i11 & 458752) | (3670016 & i4) | (i4 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            j5 = j7;
                            j6 = j8;
                            f3 = f4;
                            function33 = function34;
                            function24 = function23;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            j5 = j3;
                            j6 = j4;
                            f3 = f2;
                            function33 = function32;
                            composer2 = startRestartGroup;
                            function24 = function2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
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
                                    TabRowKt.m2273ScrollableTabRowsKfQg0A(i, modifier3, j5, j6, f3, function33, function24, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i4 & 4793491) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    long j72 = j3;
                    long j82 = j4;
                    float f42 = f2;
                    Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function342 = function32;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i112 = i4 << 3;
                    composer2 = startRestartGroup;
                    m2275ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function342, modifier2, j72, j82, f42, function23, function22, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), startRestartGroup, (i4 & 14) | ((i4 >> 12) & 112) | (i112 & 896) | (i112 & 7168) | (57344 & i112) | (i112 & 458752) | (3670016 & i4) | (i4 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    j5 = j72;
                    j6 = j82;
                    f3 = f42;
                    function33 = function342;
                    function24 = function23;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function32 = function3;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if ((i4 & 4793491) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                long j722 = j3;
                long j822 = j4;
                float f422 = f2;
                Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3422 = function32;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1122 = i4 << 3;
                composer2 = startRestartGroup;
                m2275ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function3422, modifier2, j722, j822, f422, function23, function22, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), startRestartGroup, (i4 & 14) | ((i4 >> 12) & 112) | (i1122 & 896) | (i1122 & 7168) | (57344 & i1122) | (i1122 & 458752) | (3670016 & i4) | (i4 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                j5 = j722;
                j6 = j822;
                f3 = f422;
                function33 = function3422;
                function24 = function23;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f2 = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function32 = function3;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i4 & 4793491) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            long j7222 = j3;
            long j8222 = j4;
            float f4222 = f2;
            Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34222 = function32;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i11222 = i4 << 3;
            composer2 = startRestartGroup;
            m2275ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function34222, modifier2, j7222, j8222, f4222, function23, function22, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), startRestartGroup, (i4 & 14) | ((i4 >> 12) & 112) | (i11222 & 896) | (i11222 & 7168) | (57344 & i11222) | (i11222 & 458752) | (3670016 & i4) | (i4 & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            j5 = j7222;
            j6 = j8222;
            f3 = f4222;
            function33 = function34222;
            function24 = function23;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function32 = function3;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i4 & 4793491) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        long j72222 = j3;
        long j82222 = j4;
        float f42222 = f2;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function342222 = function32;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i112222 = i4 << 3;
        composer2 = startRestartGroup;
        m2275ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function342222, modifier2, j72222, j82222, f42222, function23, function22, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), startRestartGroup, (i4 & 14) | ((i4 >> 12) & 112) | (i112222 & 896) | (i112222 & 7168) | (57344 & i112222) | (i112222 & 458752) | (3670016 & i4) | (i4 & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        j5 = j72222;
        j6 = j82222;
        f3 = f42222;
        function33 = function342222;
        function24 = function23;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TabRowImpl-DTcfvLk, reason: not valid java name */
    public static final void m2279TabRowImplDTcfvLk(final Modifier modifier, final long j, final long j2, final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1757425411);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabRowImpl)P(4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)575@27973L4041,571@27843L4171:TabRow.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757425411, i2, -1, "androidx.compose.material3.TabRowImpl (TabRow.kt:570)");
            }
            int i3 = i2 << 3;
            SurfaceKt.m2223SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier), null, j, j2, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-65106680, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1
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
                    ComposerKt.sourceInformation(composer2, "C576@27995L1274,617@29457L21,619@29508L2500,611@29279L2729:TabRow.kt#uh7d8r");
                    if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-65106680, i4, -1, "androidx.compose.material3.TabRowImpl.<anonymous> (TabRow.kt:576)");
                        }
                        ComposerKt.sourceInformationMarkerStart(composer2, 1811397697, "CC(remember):TabRow.kt#9igjgp");
                        Object rememberedValue = composer2.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new TabRowKt$TabRowImpl$1$scope$1$1();
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        final TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = (TabRowKt$TabRowImpl$1$scope$1$1) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Function3<TabIndicatorScope, Composer, Integer, Unit> function32 = function3;
                        List listOf = CollectionsKt.listOf((Object[]) new Function2[]{function22, function2, ComposableLambdaKt.rememberComposableLambda(1236693605, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1.1
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
                                ComposerKt.sourceInformation(composer3, "C617@29465L11:TabRow.kt#uh7d8r");
                                if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1236693605, i5, -1, "androidx.compose.material3.TabRowImpl.<anonymous>.<anonymous> (TabRow.kt:617)");
                                }
                                function32.invoke(tabRowKt$TabRowImpl$1$scope$1$1, composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54)});
                        ComposerKt.sourceInformationMarkerStart(composer2, 1811447339, "CC(remember):TabRow.kt#9igjgp");
                        MultiContentMeasurePolicy rememberedValue2 = composer2.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1
                                @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo629measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j3) {
                                    MeasureScope measureScope2 = measureScope;
                                    List<? extends Measurable> list2 = list.get(0);
                                    List<? extends Measurable> list3 = list.get(1);
                                    int i5 = 2;
                                    List<? extends Measurable> list4 = list.get(2);
                                    int m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j3);
                                    int size = list2.size();
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    if (size > 0) {
                                        intRef.element = m6252getMaxWidthimpl / size;
                                    }
                                    int i6 = 0;
                                    int size2 = list2.size();
                                    for (int i7 = 0; i7 < size2; i7++) {
                                        i6 = Integer.valueOf(Math.max(list2.get(i7).maxIntrinsicHeight(intRef.element), i6.intValue()));
                                    }
                                    final int intValue = i6.intValue();
                                    TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$12 = TabRowKt$TabRowImpl$1$scope$1$1.this;
                                    ArrayList arrayList = new ArrayList(size);
                                    int i8 = 0;
                                    while (i8 < size) {
                                        arrayList.add(new TabPosition(Dp.m6299constructorimpl(measureScope2.mo370toDpu2uoSUM(intRef.element) * i8), measureScope2.mo370toDpu2uoSUM(intRef.element), ((Dp) ComparisonsKt.maxOf(Dp.m6297boximpl(Dp.m6299constructorimpl(measureScope2.mo370toDpu2uoSUM(Math.min(list2.get(i8).maxIntrinsicWidth(intValue), intRef.element)) - Dp.m6299constructorimpl(TabKt.getHorizontalTextPadding() * i5))), Dp.m6297boximpl(Dp.m6299constructorimpl(24)))).m6313unboximpl(), null));
                                        i8++;
                                        measureScope2 = measureScope;
                                        i5 = 2;
                                    }
                                    tabRowKt$TabRowImpl$1$scope$1$12.setTabPositions(arrayList);
                                    ArrayList arrayList2 = new ArrayList(list2.size());
                                    int size3 = list2.size();
                                    for (int i9 = 0; i9 < size3; i9++) {
                                        arrayList2.add(list2.get(i9).mo5175measureBRTryo0(Constraints.m6242copyZbe2FdA(j3, intRef.element, intRef.element, intValue, intValue)));
                                    }
                                    final ArrayList arrayList3 = arrayList2;
                                    ArrayList arrayList4 = new ArrayList(list3.size());
                                    int size4 = list3.size();
                                    for (int i10 = 0; i10 < size4; i10++) {
                                        arrayList4.add(list3.get(i10).mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j3, 0, 0, 0, 0, 11, null)));
                                    }
                                    final ArrayList arrayList5 = arrayList4;
                                    ArrayList arrayList6 = new ArrayList(list4.size());
                                    int size5 = list4.size();
                                    for (int i11 = 0; i11 < size5; i11++) {
                                        arrayList6.add(list4.get(i11).mo5175measureBRTryo0(Constraints.m6242copyZbe2FdA(j3, intRef.element, intRef.element, 0, intValue)));
                                    }
                                    final ArrayList arrayList7 = arrayList6;
                                    return MeasureScope.layout$default(measureScope, m6252getMaxWidthimpl, intValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1.2
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
                                            List<Placeable> list5 = arrayList3;
                                            Ref.IntRef intRef2 = intRef;
                                            int size6 = list5.size();
                                            for (int i12 = 0; i12 < size6; i12++) {
                                                Placeable.PlacementScope.placeRelative$default(placementScope, list5.get(i12), i12 * intRef2.element, 0, 0.0f, 4, null);
                                            }
                                            List<Placeable> list6 = arrayList5;
                                            int i13 = intValue;
                                            int size7 = list6.size();
                                            for (int i14 = 0; i14 < size7; i14++) {
                                                Placeable placeable = list6.get(i14);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i13 - placeable.getHeight(), 0.0f, 4, null);
                                            }
                                            List<Placeable> list7 = arrayList7;
                                            int i15 = intValue;
                                            int size8 = list7.size();
                                            for (int i16 = 0; i16 < size8; i16++) {
                                                Placeable placeable2 = list7.get(i16);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, i15 - placeable2.getHeight(), 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerStart(composer2, 1399185516, "CC(Layout)P(!1,2)173@6976L62,170@6862L182:Layout.kt#80mrfh");
                        Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listOf);
                        ComposerKt.sourceInformationMarkerStart(composer2, -290761997, "CC(remember):Layout.kt#9igjgp");
                        Object rememberedValue3 = composer2.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
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
                        combineAsVirtualLayouts.invoke(composer2, 0);
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
            }, startRestartGroup, 54), startRestartGroup, (i3 & 896) | 12582912 | (i3 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$2
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
                    TabRowKt.m2279TabRowImplDTcfvLk(Modifier.this, j, j2, function3, function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScrollableTabRowImpl-sKfQg0A, reason: not valid java name */
    public static final void m2274ScrollableTabRowImplsKfQg0A(final int i, final Modifier modifier, final long j, final long j2, final float f, final ScrollState scrollState, final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1594140035);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollableTabRowImpl)P(7,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,6,4)709@32727L5081,699@32393L5415:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changed(scrollState) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i3 & 38347923) != 38347922 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1594140035, i3, -1, "androidx.compose.material3.ScrollableTabRowImpl (TabRow.kt:698)");
            }
            int i4 = i3;
            SurfaceKt.m2223SurfaceT9BRK9s(ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState, false, null, false, 14, null))), null, j, j2, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1556158104, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1
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
                    ComposerKt.sourceInformation(composer2, "C710@32758L24,712@32827L147,716@32996L1274,756@34410L21,758@34461L3341,751@34280L3522:TabRow.kt#uh7d8r");
                    if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1556158104, i5, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous> (TabRow.kt:710)");
                        }
                        ComposerKt.sourceInformationMarkerStart(composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
                        Object rememberedValue = composer2.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            rememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerStart(composer2, 413417697, "CC(remember):TabRow.kt#9igjgp");
                        boolean changed = composer2.changed(ScrollState.this) | composer2.changed(coroutineScope);
                        ScrollState scrollState2 = ScrollState.this;
                        Object rememberedValue2 = composer2.rememberedValue();
                        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerStart(composer2, 413424232, "CC(remember):TabRow.kt#9igjgp");
                        Object rememberedValue3 = composer2.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new TabRowKt$ScrollableTabRowImpl$1$scope$1$1();
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        final TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1 = (TabRowKt$ScrollableTabRowImpl$1$scope$1$1) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        final Function3<TabIndicatorScope, Composer, Integer, Unit> function32 = function3;
                        List listOf = CollectionsKt.listOf((Object[]) new Function2[]{function22, function2, ComposableLambdaKt.rememberComposableLambda(-1530560661, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1.1
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
                                ComposerKt.sourceInformation(composer3, "C756@34418L11:TabRow.kt#uh7d8r");
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1530560661, i6, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous>.<anonymous> (TabRow.kt:756)");
                                }
                                function32.invoke(tabRowKt$ScrollableTabRowImpl$1$scope$1$1, composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54)});
                        ComposerKt.sourceInformationMarkerStart(composer2, 413473179, "CC(remember):TabRow.kt#9igjgp");
                        boolean changed2 = composer2.changed(f) | composer2.changed(i) | composer2.changedInstance(scrollableTabData);
                        final float f2 = f;
                        final int i6 = i;
                        Object rememberedValue4 = composer2.rememberedValue();
                        if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (MultiContentMeasurePolicy) new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1
                                @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo629measure3p2s80s(final MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j3) {
                                    float f3;
                                    float f4;
                                    List<? extends Measurable> list2 = list.get(0);
                                    List<? extends Measurable> list3 = list.get(1);
                                    List<? extends Measurable> list4 = list.get(2);
                                    final int i7 = measureScope.mo367roundToPx0680j_4(f2);
                                    int size = list2.size();
                                    f3 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                    int i8 = measureScope.mo367roundToPx0680j_4(f3);
                                    int i9 = 0;
                                    int size2 = list2.size();
                                    for (int i10 = 0; i10 < size2; i10++) {
                                        i9 = Integer.valueOf(Math.max(i9.intValue(), list2.get(i10).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                    }
                                    final int intValue = i9.intValue();
                                    int i11 = i7 * 2;
                                    long m6243copyZbe2FdA$default = Constraints.m6243copyZbe2FdA$default(j3, i8, 0, intValue, intValue, 2, null);
                                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                                    floatRef.element = f2;
                                    ArrayList arrayList = new ArrayList(list2.size());
                                    int size3 = list2.size();
                                    for (int i12 = 0; i12 < size3; i12++) {
                                        arrayList.add(list2.get(i12).mo5175measureBRTryo0(m6243copyZbe2FdA$default));
                                    }
                                    final ArrayList arrayList2 = arrayList;
                                    ArrayList arrayList3 = new ArrayList(size);
                                    int i13 = i11;
                                    for (int i14 = 0; i14 < size; i14++) {
                                        f4 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                        float m6313unboximpl = ((Dp) ComparisonsKt.maxOf(Dp.m6297boximpl(f4), Dp.m6297boximpl(measureScope.mo370toDpu2uoSUM(((Placeable) arrayList2.get(i14)).getWidth())))).m6313unboximpl();
                                        i13 += measureScope.mo367roundToPx0680j_4(m6313unboximpl);
                                        TabPosition tabPosition = new TabPosition(floatRef.element, m6313unboximpl, ((Dp) ComparisonsKt.maxOf(Dp.m6297boximpl(Dp.m6299constructorimpl(m6313unboximpl - Dp.m6299constructorimpl(TabKt.getHorizontalTextPadding() * 2))), Dp.m6297boximpl(Dp.m6299constructorimpl(24)))).m6313unboximpl(), null);
                                        floatRef.element = Dp.m6299constructorimpl(floatRef.element + m6313unboximpl);
                                        arrayList3.add(tabPosition);
                                    }
                                    final ArrayList arrayList4 = arrayList3;
                                    tabRowKt$ScrollableTabRowImpl$1$scope$1$1.setTabPositions(arrayList4);
                                    ArrayList arrayList5 = new ArrayList(list3.size());
                                    int size4 = list3.size();
                                    int i15 = 0;
                                    while (i15 < size4) {
                                        arrayList5.add(list3.get(i15).mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j3, i13, i13, 0, 0, 8, null)));
                                        i15++;
                                        size4 = size4;
                                        list3 = list3;
                                    }
                                    final ArrayList arrayList6 = arrayList5;
                                    int i16 = i6;
                                    ArrayList arrayList7 = new ArrayList(list4.size());
                                    int size5 = list4.size();
                                    int i17 = 0;
                                    while (i17 < size5) {
                                        arrayList7.add(list4.get(i17).mo5175measureBRTryo0(Constraints.m6242copyZbe2FdA(j3, 0, measureScope.mo367roundToPx0680j_4(((TabPosition) arrayList4.get(i16)).getWidth()), 0, intValue)));
                                        i17++;
                                        list4 = list4;
                                        i16 = i16;
                                    }
                                    final ArrayList arrayList8 = arrayList7;
                                    final float f5 = f2;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i18 = i6;
                                    return MeasureScope.layout$default(measureScope, i13, intValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1.1
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
                                            Ref.FloatRef.this.element = f5;
                                            List<Placeable> list5 = arrayList2;
                                            MeasureScope measureScope2 = measureScope;
                                            Ref.FloatRef floatRef2 = Ref.FloatRef.this;
                                            List<TabPosition> list6 = arrayList4;
                                            int size6 = list5.size();
                                            for (int i19 = 0; i19 < size6; i19++) {
                                                Placeable.PlacementScope.placeRelative$default(placementScope, list5.get(i19), measureScope2.mo367roundToPx0680j_4(floatRef2.element), 0, 0.0f, 4, null);
                                                floatRef2.element = Dp.m6299constructorimpl(floatRef2.element + list6.get(i19).getWidth());
                                            }
                                            List<Placeable> list7 = arrayList6;
                                            int i20 = intValue;
                                            int size7 = list7.size();
                                            for (int i21 = 0; i21 < size7; i21++) {
                                                Placeable placeable = list7.get(i21);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i20 - placeable.getHeight(), 0.0f, 4, null);
                                            }
                                            List<Placeable> list8 = arrayList8;
                                            MeasureScope measureScope3 = measureScope;
                                            List<TabPosition> list9 = arrayList4;
                                            int i22 = i18;
                                            int i23 = intValue;
                                            int size8 = list8.size();
                                            for (int i24 = 0; i24 < size8; i24++) {
                                                Placeable placeable2 = list8.get(i24);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, Math.max(0, (measureScope3.mo367roundToPx0680j_4(list9.get(i22).getWidth()) - placeable2.getWidth()) / 2), i23 - placeable2.getHeight(), 0.0f, 4, null);
                                            }
                                            scrollableTabData2.onLaidOut(measureScope, i7, arrayList4, i18);
                                        }
                                    }, 4, null);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue4;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerStart(composer2, 1399185516, "CC(Layout)P(!1,2)173@6976L62,170@6862L182:Layout.kt#80mrfh");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Function2<Composer, Integer, Unit> combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listOf);
                        ComposerKt.sourceInformationMarkerStart(composer2, -290761997, "CC(remember):Layout.kt#9igjgp");
                        boolean changed3 = composer2.changed(multiContentMeasurePolicy);
                        Object rememberedValue5 = composer2.rememberedValue();
                        if (changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue5;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
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
                        Updater.m3340setimpl(m3333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        combineAsVirtualLayouts.invoke(composer2, 0);
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
            }, startRestartGroup, 54), startRestartGroup, (i4 & 896) | 12582912 | (i4 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$2
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
                    TabRowKt.m2274ScrollableTabRowImplsKfQg0A(i, modifier, j, j2, f, scrollState, function3, function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TabRowWithSubcomposeImpl-DTcfvLk, reason: not valid java name */
    public static final void m2280TabRowWithSubcomposeImplDTcfvLk(final Modifier modifier, final long j, final long j2, final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-160898917);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabRowWithSubcomposeImpl)P(4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)947@41323L2218,943@41193L2348:TabRow.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160898917, i2, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:942)");
            }
            int i3 = i2 << 3;
            SurfaceKt.m2223SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier), null, j, j2, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1617702432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1
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
                    ComposerKt.sourceInformation(composer2, "C948@41375L2160,948@41333L2202:TabRow.kt#uh7d8r");
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1617702432, i4, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:948)");
                    }
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1807613681, "CC(remember):TabRow.kt#9igjgp");
                    boolean changed = composer2.changed(function22) | composer2.changed(function2) | composer2.changed(function3);
                    final Function2<Composer, Integer, Unit> function23 = function22;
                    final Function2<Composer, Integer, Unit> function24 = function2;
                    final Function3<List<TabPosition>, Composer, Integer, Unit> function32 = function3;
                    Object rememberedValue = composer2.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m2288invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m2288invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j3) {
                                final int m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j3);
                                List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function23);
                                int size = subcompose.size();
                                final Ref.IntRef intRef = new Ref.IntRef();
                                if (size > 0) {
                                    intRef.element = m6252getMaxWidthimpl / size;
                                }
                                int i5 = 0;
                                int size2 = subcompose.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    i5 = Integer.valueOf(Math.max(subcompose.get(i6).maxIntrinsicHeight(intRef.element), i5.intValue()));
                                }
                                final int intValue = i5.intValue();
                                ArrayList arrayList = new ArrayList(subcompose.size());
                                int size3 = subcompose.size();
                                for (int i7 = 0; i7 < size3; i7++) {
                                    arrayList.add(subcompose.get(i7).mo5175measureBRTryo0(Constraints.m6242copyZbe2FdA(j3, intRef.element, intRef.element, intValue, intValue)));
                                }
                                final ArrayList arrayList2 = arrayList;
                                ArrayList arrayList3 = new ArrayList(size);
                                for (int i8 = 0; i8 < size; i8++) {
                                    arrayList3.add(new TabPosition(Dp.m6299constructorimpl(subcomposeMeasureScope.mo370toDpu2uoSUM(intRef.element) * i8), subcomposeMeasureScope.mo370toDpu2uoSUM(intRef.element), ((Dp) ComparisonsKt.maxOf(Dp.m6297boximpl(Dp.m6299constructorimpl(subcomposeMeasureScope.mo370toDpu2uoSUM(Math.min(subcompose.get(i8).maxIntrinsicWidth(intValue), intRef.element)) - Dp.m6299constructorimpl(TabKt.getHorizontalTextPadding() * 2))), Dp.m6297boximpl(Dp.m6299constructorimpl(24)))).m6313unboximpl(), null));
                                }
                                final ArrayList arrayList4 = arrayList3;
                                final Function2<Composer, Integer, Unit> function25 = function24;
                                final Function3<List<TabPosition>, Composer, Integer, Unit> function33 = function32;
                                return MeasureScope.layout$default(subcomposeMeasureScope, m6252getMaxWidthimpl, intValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1.1
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
                                        List<Placeable> list = arrayList2;
                                        Ref.IntRef intRef2 = intRef;
                                        int size4 = list.size();
                                        for (int i9 = 0; i9 < size4; i9++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i9), i9 * intRef2.element, 0, 0.0f, 4, null);
                                        }
                                        List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function25);
                                        long j4 = j3;
                                        int i10 = intValue;
                                        int size5 = subcompose2.size();
                                        for (int i11 = 0; i11 < size5; i11++) {
                                            Placeable mo5175measureBRTryo0 = subcompose2.get(i11).mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j4, 0, 0, 0, 0, 11, null));
                                            Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo0, 0, i10 - mo5175measureBRTryo0.getHeight(), 0.0f, 4, null);
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                        final List<TabPosition> list2 = arrayList4;
                                        List<Measurable> subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1621992604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.TabRowWithSubcomposeImpl.1.1.1.1.3
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
                                                ComposerKt.sourceInformation(composer3, "C994@43328L23:TabRow.kt#uh7d8r");
                                                if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1621992604, i12, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:994)");
                                                }
                                                function34.invoke(list2, composer3, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        int i12 = m6252getMaxWidthimpl;
                                        int i13 = intValue;
                                        int size6 = subcompose3.size();
                                        for (int i14 = 0; i14 < size6; i14++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, subcompose3.get(i14).mo5175measureBRTryo0(Constraints.INSTANCE.m6262fixedJhjzzOo(i12, i13)), 0, 0, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (Function2) rememberedValue, composer2, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 896) | 12582912 | (i3 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$2
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
                    TabRowKt.m2280TabRowWithSubcomposeImplDTcfvLk(Modifier.this, j, j2, function3, function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e1  */
    /* renamed from: ScrollableTabRowWithSubcomposeImpl-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2275ScrollableTabRowWithSubcomposeImplqhFBPw4(final int i, final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, long j, long j2, float f, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final ScrollState scrollState, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        long j3;
        long j4;
        int i6;
        float f2;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> m1668getLambda7$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-955409947);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollableTabRowWithSubcomposeImpl)P(7,4,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp!1,8)1008@43780L21,1009@43844L19,1015@44165L3880,1015@44083L3962:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i9 = 2048;
                            i4 |= i9;
                        }
                    } else {
                        j3 = j;
                    }
                    i9 = 1024;
                    i4 |= i9;
                } else {
                    j3 = j;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i8 = 16384;
                            i4 |= i8;
                        }
                    } else {
                        j4 = j2;
                    }
                    i8 = 8192;
                    i4 |= i8;
                } else {
                    j4 = j2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i2) == 0) {
                    f2 = f;
                    i4 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        if ((i3 & 256) != 0) {
                            i4 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i4 |= startRestartGroup.changed(scrollState) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            if ((i4 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i5 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if ((i3 & 8) != 0) {
                                        j3 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                        i4 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        j4 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                        i4 &= -57345;
                                    }
                                    if (i6 != 0) {
                                        f2 = TabRowDefaults.INSTANCE.m2269getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                                    }
                                    if (i7 != 0) {
                                        m1668getLambda7$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m1668getLambda7$material3_release();
                                        final float f3 = f2;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-955409947, i4, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl (TabRow.kt:1014)");
                                        }
                                        final Function2<? super Composer, ? super Integer, Unit> function24 = m1668getLambda7$material3_release;
                                        int i10 = ((i4 >> 6) & 14) | 12582912;
                                        int i11 = i4 >> 3;
                                        SurfaceKt.m2223SurfaceT9BRK9s(modifier2, null, j3, j4, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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
                                                ComposerKt.sourceInformation(composer2, "C1016@44196L24,1018@44265L147,1027@44663L3376,1021@44421L3618:TabRow.kt#uh7d8r");
                                                if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1572959552, i12, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1016)");
                                                    }
                                                    ComposerKt.sourceInformationMarkerStart(composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                                                    ComposerKt.sourceInformationMarkerStart(composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
                                                    Object rememberedValue = composer2.rememberedValue();
                                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                                        composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                        rememberedValue = compositionScopedCoroutineScopeCanceller;
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerStart(composer2, -702892231, "CC(remember):TabRow.kt#9igjgp");
                                                    boolean changed = composer2.changed(ScrollState.this) | composer2.changed(coroutineScope);
                                                    ScrollState scrollState2 = ScrollState.this;
                                                    Object rememberedValue2 = composer2.rememberedValue();
                                                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                                                        composer2.updateRememberedValue(rememberedValue2);
                                                    }
                                                    final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), ScrollState.this, false, null, false, 14, null)));
                                                    ComposerKt.sourceInformationMarkerStart(composer2, -702876266, "CC(remember):TabRow.kt#9igjgp");
                                                    boolean changed2 = composer2.changed(f3) | composer2.changed(function22) | composer2.changed(function24) | composer2.changed(function3) | composer2.changedInstance(scrollableTabData) | composer2.changed(i);
                                                    final float f4 = f3;
                                                    final Function2<Composer, Integer, Unit> function25 = function22;
                                                    final Function2<Composer, Integer, Unit> function26 = function24;
                                                    final int i13 = i;
                                                    final Function3<List<TabPosition>, Composer, Integer, Unit> function32 = function3;
                                                    Object rememberedValue3 = composer2.rememberedValue();
                                                    if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                                return m2286invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                            }

                                                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                            public final MeasureResult m2286invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                                                float f5;
                                                                f5 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                                                int i14 = subcomposeMeasureScope.mo367roundToPx0680j_4(f5);
                                                                final int i15 = subcomposeMeasureScope.mo367roundToPx0680j_4(f4);
                                                                List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                                int i16 = 0;
                                                                int size = subcompose.size();
                                                                for (int i17 = 0; i17 < size; i17++) {
                                                                    i16 = Integer.valueOf(Math.max(i16.intValue(), subcompose.get(i17).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                                                }
                                                                final int intValue = i16.intValue();
                                                                long m6243copyZbe2FdA$default = Constraints.m6243copyZbe2FdA$default(j5, i14, 0, intValue, intValue, 2, null);
                                                                final ArrayList arrayList = new ArrayList();
                                                                final ArrayList arrayList2 = new ArrayList();
                                                                int size2 = subcompose.size();
                                                                for (int i18 = 0; i18 < size2; i18++) {
                                                                    Measurable measurable = subcompose.get(i18);
                                                                    Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(m6243copyZbe2FdA$default);
                                                                    float m6299constructorimpl = Dp.m6299constructorimpl(subcomposeMeasureScope.mo370toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(mo5175measureBRTryo0.getHeight()), mo5175measureBRTryo0.getWidth())) - Dp.m6299constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                                                    arrayList.add(mo5175measureBRTryo0);
                                                                    arrayList2.add(Dp.m6297boximpl(m6299constructorimpl));
                                                                }
                                                                Integer valueOf = Integer.valueOf(i15 * 2);
                                                                int size3 = arrayList.size();
                                                                for (int i19 = 0; i19 < size3; i19++) {
                                                                    valueOf = Integer.valueOf(valueOf.intValue() + ((Placeable) arrayList.get(i19)).getWidth());
                                                                }
                                                                final int intValue2 = valueOf.intValue();
                                                                final Function2<Composer, Integer, Unit> function27 = function26;
                                                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                                final int i20 = i13;
                                                                final Function3<List<TabPosition>, Composer, Integer, Unit> function33 = function32;
                                                                return MeasureScope.layout$default(subcomposeMeasureScope, intValue2, intValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
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
                                                                        final ArrayList arrayList3 = new ArrayList();
                                                                        int i21 = i15;
                                                                        List<Placeable> list = arrayList;
                                                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                                        List<Dp> list2 = arrayList2;
                                                                        int size4 = list.size();
                                                                        for (int i22 = 0; i22 < size4; i22++) {
                                                                            Placeable placeable = list.get(i22);
                                                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i21, 0, 0.0f, 4, null);
                                                                            arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo370toDpu2uoSUM(i21), subcomposeMeasureScope2.mo370toDpu2uoSUM(placeable.getWidth()), list2.get(i22).m6313unboximpl(), null));
                                                                            i21 += placeable.getWidth();
                                                                        }
                                                                        List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                                        long j6 = j5;
                                                                        int i23 = intValue2;
                                                                        int i24 = intValue;
                                                                        int i25 = 0;
                                                                        for (int size5 = subcompose2.size(); i25 < size5; size5 = size5) {
                                                                            Placeable mo5175measureBRTryo02 = subcompose2.get(i25).mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j6, i23, i23, 0, 0, 8, null));
                                                                            Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo02, 0, i24 - mo5175measureBRTryo02.getHeight(), 0.0f, 4, null);
                                                                            i25++;
                                                                        }
                                                                        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                                        TabSlots tabSlots = TabSlots.Indicator;
                                                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                                                        List<Measurable> subcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
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

                                                                            public final void invoke(Composer composer3, int i26) {
                                                                                ComposerKt.sourceInformation(composer3, "C1094@47573L23:TabRow.kt#uh7d8r");
                                                                                if ((i26 & 3) == 2 && composer3.getSkipping()) {
                                                                                    composer3.skipToGroupEnd();
                                                                                    return;
                                                                                }
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(1734082948, i26, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1094)");
                                                                                }
                                                                                function34.invoke(arrayList3, composer3, 0);
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                }
                                                                            }
                                                                        }));
                                                                        int i26 = intValue2;
                                                                        int i27 = intValue;
                                                                        int size6 = subcompose3.size();
                                                                        for (int i28 = 0; i28 < size6; i28++) {
                                                                            Placeable.PlacementScope.placeRelative$default(placementScope, subcompose3.get(i28).mo5175measureBRTryo0(Constraints.INSTANCE.m6262fixedJhjzzOo(i26, i27)), 0, 0, 0.0f, 4, null);
                                                                        }
                                                                        scrollableTabData2.onLaidOut(subcomposeMeasureScope, i15, arrayList3, i20);
                                                                    }
                                                                }, 4, null);
                                                            }
                                                        };
                                                        composer2.updateRememberedValue(rememberedValue3);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, (Function2) rememberedValue3, composer2, 0, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer2.skipToGroupEnd();
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, i10 | (i11 & 896) | (i11 & 7168), 114);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        f2 = f3;
                                        function23 = m1668getLambda7$material3_release;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 8) != 0) {
                                        i4 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                }
                                m1668getLambda7$material3_release = function2;
                                final float f32 = f2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function242 = m1668getLambda7$material3_release;
                                int i102 = ((i4 >> 6) & 14) | 12582912;
                                int i112 = i4 >> 3;
                                SurfaceKt.m2223SurfaceT9BRK9s(modifier2, null, j3, j4, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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
                                        ComposerKt.sourceInformation(composer2, "C1016@44196L24,1018@44265L147,1027@44663L3376,1021@44421L3618:TabRow.kt#uh7d8r");
                                        if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1572959552, i12, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1016)");
                                            }
                                            ComposerKt.sourceInformationMarkerStart(composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                                            ComposerKt.sourceInformationMarkerStart(composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
                                            Object rememberedValue = composer2.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                rememberedValue = compositionScopedCoroutineScopeCanceller;
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -702892231, "CC(remember):TabRow.kt#9igjgp");
                                            boolean changed = composer2.changed(ScrollState.this) | composer2.changed(coroutineScope);
                                            ScrollState scrollState2 = ScrollState.this;
                                            Object rememberedValue2 = composer2.rememberedValue();
                                            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                                                composer2.updateRememberedValue(rememberedValue2);
                                            }
                                            final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), ScrollState.this, false, null, false, 14, null)));
                                            ComposerKt.sourceInformationMarkerStart(composer2, -702876266, "CC(remember):TabRow.kt#9igjgp");
                                            boolean changed2 = composer2.changed(f32) | composer2.changed(function22) | composer2.changed(function242) | composer2.changed(function3) | composer2.changedInstance(scrollableTabData) | composer2.changed(i);
                                            final float f4 = f32;
                                            final Function2<? super Composer, ? super Integer, Unit> function25 = function22;
                                            final Function2<? super Composer, ? super Integer, Unit> function26 = function242;
                                            final int i13 = i;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32 = function3;
                                            Object rememberedValue3 = composer2.rememberedValue();
                                            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                        return m2286invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                    }

                                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                    public final MeasureResult m2286invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j5) {
                                                        float f5;
                                                        f5 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                                        int i14 = subcomposeMeasureScope.mo367roundToPx0680j_4(f5);
                                                        final int i15 = subcomposeMeasureScope.mo367roundToPx0680j_4(f4);
                                                        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                        int i16 = 0;
                                                        int size = subcompose.size();
                                                        for (int i17 = 0; i17 < size; i17++) {
                                                            i16 = Integer.valueOf(Math.max(i16.intValue(), subcompose.get(i17).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                                        }
                                                        final int intValue = i16.intValue();
                                                        long m6243copyZbe2FdA$default = Constraints.m6243copyZbe2FdA$default(j5, i14, 0, intValue, intValue, 2, null);
                                                        final List<Placeable> arrayList = new ArrayList();
                                                        final List<Dp> arrayList2 = new ArrayList();
                                                        int size2 = subcompose.size();
                                                        for (int i18 = 0; i18 < size2; i18++) {
                                                            Measurable measurable = subcompose.get(i18);
                                                            Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(m6243copyZbe2FdA$default);
                                                            float m6299constructorimpl = Dp.m6299constructorimpl(subcomposeMeasureScope.mo370toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(mo5175measureBRTryo0.getHeight()), mo5175measureBRTryo0.getWidth())) - Dp.m6299constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                                            arrayList.add(mo5175measureBRTryo0);
                                                            arrayList2.add(Dp.m6297boximpl(m6299constructorimpl));
                                                        }
                                                        Integer valueOf = Integer.valueOf(i15 * 2);
                                                        int size3 = arrayList.size();
                                                        for (int i19 = 0; i19 < size3; i19++) {
                                                            valueOf = Integer.valueOf(valueOf.intValue() + ((Placeable) arrayList.get(i19)).getWidth());
                                                        }
                                                        final int intValue2 = valueOf.intValue();
                                                        final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                        final int i20 = i13;
                                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = function32;
                                                        return MeasureScope.layout$default(subcomposeMeasureScope, intValue2, intValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
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
                                                                final List<TabPosition> arrayList3 = new ArrayList();
                                                                int i21 = i15;
                                                                List<Placeable> list = arrayList;
                                                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                                List<Dp> list2 = arrayList2;
                                                                int size4 = list.size();
                                                                for (int i22 = 0; i22 < size4; i22++) {
                                                                    Placeable placeable = list.get(i22);
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i21, 0, 0.0f, 4, null);
                                                                    arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo370toDpu2uoSUM(i21), subcomposeMeasureScope2.mo370toDpu2uoSUM(placeable.getWidth()), list2.get(i22).m6313unboximpl(), null));
                                                                    i21 += placeable.getWidth();
                                                                }
                                                                List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                                long j6 = j5;
                                                                int i23 = intValue2;
                                                                int i24 = intValue;
                                                                int i25 = 0;
                                                                for (int size5 = subcompose2.size(); i25 < size5; size5 = size5) {
                                                                    Placeable mo5175measureBRTryo02 = subcompose2.get(i25).mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j6, i23, i23, 0, 0, 8, null));
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo02, 0, i24 - mo5175measureBRTryo02.getHeight(), 0.0f, 4, null);
                                                                    i25++;
                                                                }
                                                                SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                                TabSlots tabSlots = TabSlots.Indicator;
                                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function33;
                                                                List<Measurable> subcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
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

                                                                    public final void invoke(Composer composer3, int i26) {
                                                                        ComposerKt.sourceInformation(composer3, "C1094@47573L23:TabRow.kt#uh7d8r");
                                                                        if ((i26 & 3) == 2 && composer3.getSkipping()) {
                                                                            composer3.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(1734082948, i26, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1094)");
                                                                        }
                                                                        function34.invoke(arrayList3, composer3, 0);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                        }
                                                                    }
                                                                }));
                                                                int i26 = intValue2;
                                                                int i27 = intValue;
                                                                int size6 = subcompose3.size();
                                                                for (int i28 = 0; i28 < size6; i28++) {
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, subcompose3.get(i28).mo5175measureBRTryo0(Constraints.INSTANCE.m6262fixedJhjzzOo(i26, i27)), 0, 0, 0.0f, 4, null);
                                                                }
                                                                scrollableTabData2.onLaidOut(subcomposeMeasureScope, i15, arrayList3, i20);
                                                            }
                                                        }, 4, null);
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue3);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, (Function2) rememberedValue3, composer2, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54), startRestartGroup, i102 | (i112 & 896) | (i112 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f2 = f32;
                                function23 = m1668getLambda7$material3_release;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function23 = function2;
                            }
                            final Modifier modifier3 = modifier2;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final long j5 = j3;
                                final long j6 = j4;
                                final float f4 = f2;
                                final Function2<? super Composer, ? super Integer, Unit> function25 = function23;
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$2
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
                                        TabRowKt.m2275ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function3, modifier3, j5, j6, f4, function25, function22, scrollState, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i4 & 38347923) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        m1668getLambda7$material3_release = function2;
                        final float f322 = f2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function2422 = m1668getLambda7$material3_release;
                        int i1022 = ((i4 >> 6) & 14) | 12582912;
                        int i1122 = i4 >> 3;
                        SurfaceKt.m2223SurfaceT9BRK9s(modifier2, null, j3, j4, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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
                                ComposerKt.sourceInformation(composer2, "C1016@44196L24,1018@44265L147,1027@44663L3376,1021@44421L3618:TabRow.kt#uh7d8r");
                                if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1572959552, i12, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1016)");
                                    }
                                    ComposerKt.sourceInformationMarkerStart(composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                                    ComposerKt.sourceInformationMarkerStart(composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
                                    Object rememberedValue = composer2.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                        composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                        rememberedValue = compositionScopedCoroutineScopeCanceller;
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -702892231, "CC(remember):TabRow.kt#9igjgp");
                                    boolean changed = composer2.changed(ScrollState.this) | composer2.changed(coroutineScope);
                                    ScrollState scrollState2 = ScrollState.this;
                                    Object rememberedValue2 = composer2.rememberedValue();
                                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                                        composer2.updateRememberedValue(rememberedValue2);
                                    }
                                    final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), ScrollState.this, false, null, false, 14, null)));
                                    ComposerKt.sourceInformationMarkerStart(composer2, -702876266, "CC(remember):TabRow.kt#9igjgp");
                                    boolean changed2 = composer2.changed(f322) | composer2.changed(function22) | composer2.changed(function2422) | composer2.changed(function3) | composer2.changedInstance(scrollableTabData) | composer2.changed(i);
                                    final float f42 = f322;
                                    final Function2<? super Composer, ? super Integer, Unit> function252 = function22;
                                    final Function2<? super Composer, ? super Integer, Unit> function26 = function2422;
                                    final int i13 = i;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32 = function3;
                                    Object rememberedValue3 = composer2.rememberedValue();
                                    if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                return m2286invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                            }

                                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                            public final MeasureResult m2286invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j52) {
                                                float f5;
                                                f5 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                                int i14 = subcomposeMeasureScope.mo367roundToPx0680j_4(f5);
                                                final int i15 = subcomposeMeasureScope.mo367roundToPx0680j_4(f42);
                                                List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function252);
                                                int i16 = 0;
                                                int size = subcompose.size();
                                                for (int i17 = 0; i17 < size; i17++) {
                                                    i16 = Integer.valueOf(Math.max(i16.intValue(), subcompose.get(i17).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                                }
                                                final int intValue = i16.intValue();
                                                long m6243copyZbe2FdA$default = Constraints.m6243copyZbe2FdA$default(j52, i14, 0, intValue, intValue, 2, null);
                                                final List<Placeable> arrayList = new ArrayList();
                                                final List<Dp> arrayList2 = new ArrayList();
                                                int size2 = subcompose.size();
                                                for (int i18 = 0; i18 < size2; i18++) {
                                                    Measurable measurable = subcompose.get(i18);
                                                    Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(m6243copyZbe2FdA$default);
                                                    float m6299constructorimpl = Dp.m6299constructorimpl(subcomposeMeasureScope.mo370toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(mo5175measureBRTryo0.getHeight()), mo5175measureBRTryo0.getWidth())) - Dp.m6299constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                                    arrayList.add(mo5175measureBRTryo0);
                                                    arrayList2.add(Dp.m6297boximpl(m6299constructorimpl));
                                                }
                                                Integer valueOf = Integer.valueOf(i15 * 2);
                                                int size3 = arrayList.size();
                                                for (int i19 = 0; i19 < size3; i19++) {
                                                    valueOf = Integer.valueOf(valueOf.intValue() + ((Placeable) arrayList.get(i19)).getWidth());
                                                }
                                                final int intValue2 = valueOf.intValue();
                                                final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                final int i20 = i13;
                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = function32;
                                                return MeasureScope.layout$default(subcomposeMeasureScope, intValue2, intValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
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
                                                        final List<TabPosition> arrayList3 = new ArrayList();
                                                        int i21 = i15;
                                                        List<Placeable> list = arrayList;
                                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                        List<Dp> list2 = arrayList2;
                                                        int size4 = list.size();
                                                        for (int i22 = 0; i22 < size4; i22++) {
                                                            Placeable placeable = list.get(i22);
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i21, 0, 0.0f, 4, null);
                                                            arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo370toDpu2uoSUM(i21), subcomposeMeasureScope2.mo370toDpu2uoSUM(placeable.getWidth()), list2.get(i22).m6313unboximpl(), null));
                                                            i21 += placeable.getWidth();
                                                        }
                                                        List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                        long j62 = j52;
                                                        int i23 = intValue2;
                                                        int i24 = intValue;
                                                        int i25 = 0;
                                                        for (int size5 = subcompose2.size(); i25 < size5; size5 = size5) {
                                                            Placeable mo5175measureBRTryo02 = subcompose2.get(i25).mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j62, i23, i23, 0, 0, 8, null));
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo02, 0, i24 - mo5175measureBRTryo02.getHeight(), 0.0f, 4, null);
                                                            i25++;
                                                        }
                                                        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                        TabSlots tabSlots = TabSlots.Indicator;
                                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function33;
                                                        List<Measurable> subcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
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

                                                            public final void invoke(Composer composer3, int i26) {
                                                                ComposerKt.sourceInformation(composer3, "C1094@47573L23:TabRow.kt#uh7d8r");
                                                                if ((i26 & 3) == 2 && composer3.getSkipping()) {
                                                                    composer3.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1734082948, i26, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1094)");
                                                                }
                                                                function34.invoke(arrayList3, composer3, 0);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }));
                                                        int i26 = intValue2;
                                                        int i27 = intValue;
                                                        int size6 = subcompose3.size();
                                                        for (int i28 = 0; i28 < size6; i28++) {
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, subcompose3.get(i28).mo5175measureBRTryo0(Constraints.INSTANCE.m6262fixedJhjzzOo(i26, i27)), 0, 0, 0.0f, 4, null);
                                                        }
                                                        scrollableTabData2.onLaidOut(subcomposeMeasureScope, i15, arrayList3, i20);
                                                    }
                                                }, 4, null);
                                            }
                                        };
                                        composer2.updateRememberedValue(rememberedValue3);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, (Function2) rememberedValue3, composer2, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), startRestartGroup, i1022 | (i1122 & 896) | (i1122 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        f2 = f322;
                        function23 = m1668getLambda7$material3_release;
                        final Modifier modifier32 = modifier2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i3 & 256) != 0) {
                    }
                    if ((i4 & 38347923) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    m1668getLambda7$material3_release = function2;
                    final float f3222 = f2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function24222 = m1668getLambda7$material3_release;
                    int i10222 = ((i4 >> 6) & 14) | 12582912;
                    int i11222 = i4 >> 3;
                    SurfaceKt.m2223SurfaceT9BRK9s(modifier2, null, j3, j4, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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
                            ComposerKt.sourceInformation(composer2, "C1016@44196L24,1018@44265L147,1027@44663L3376,1021@44421L3618:TabRow.kt#uh7d8r");
                            if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1572959552, i12, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1016)");
                                }
                                ComposerKt.sourceInformationMarkerStart(composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                                ComposerKt.sourceInformationMarkerStart(composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
                                Object rememberedValue = composer2.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                    composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerStart(composer2, -702892231, "CC(remember):TabRow.kt#9igjgp");
                                boolean changed = composer2.changed(ScrollState.this) | composer2.changed(coroutineScope);
                                ScrollState scrollState2 = ScrollState.this;
                                Object rememberedValue2 = composer2.rememberedValue();
                                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                                    composer2.updateRememberedValue(rememberedValue2);
                                }
                                final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), ScrollState.this, false, null, false, 14, null)));
                                ComposerKt.sourceInformationMarkerStart(composer2, -702876266, "CC(remember):TabRow.kt#9igjgp");
                                boolean changed2 = composer2.changed(f3222) | composer2.changed(function22) | composer2.changed(function24222) | composer2.changed(function3) | composer2.changedInstance(scrollableTabData) | composer2.changed(i);
                                final float f42 = f3222;
                                final Function2<? super Composer, ? super Integer, Unit> function252 = function22;
                                final Function2<? super Composer, ? super Integer, Unit> function26 = function24222;
                                final int i13 = i;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32 = function3;
                                Object rememberedValue3 = composer2.rememberedValue();
                                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                            return m2286invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                        }

                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                        public final MeasureResult m2286invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j52) {
                                            float f5;
                                            f5 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                            int i14 = subcomposeMeasureScope.mo367roundToPx0680j_4(f5);
                                            final int i15 = subcomposeMeasureScope.mo367roundToPx0680j_4(f42);
                                            List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function252);
                                            int i16 = 0;
                                            int size = subcompose.size();
                                            for (int i17 = 0; i17 < size; i17++) {
                                                i16 = Integer.valueOf(Math.max(i16.intValue(), subcompose.get(i17).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                            }
                                            final int intValue = i16.intValue();
                                            long m6243copyZbe2FdA$default = Constraints.m6243copyZbe2FdA$default(j52, i14, 0, intValue, intValue, 2, null);
                                            final List<Placeable> arrayList = new ArrayList();
                                            final List<Dp> arrayList2 = new ArrayList();
                                            int size2 = subcompose.size();
                                            for (int i18 = 0; i18 < size2; i18++) {
                                                Measurable measurable = subcompose.get(i18);
                                                Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(m6243copyZbe2FdA$default);
                                                float m6299constructorimpl = Dp.m6299constructorimpl(subcomposeMeasureScope.mo370toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(mo5175measureBRTryo0.getHeight()), mo5175measureBRTryo0.getWidth())) - Dp.m6299constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                                arrayList.add(mo5175measureBRTryo0);
                                                arrayList2.add(Dp.m6297boximpl(m6299constructorimpl));
                                            }
                                            Integer valueOf = Integer.valueOf(i15 * 2);
                                            int size3 = arrayList.size();
                                            for (int i19 = 0; i19 < size3; i19++) {
                                                valueOf = Integer.valueOf(valueOf.intValue() + ((Placeable) arrayList.get(i19)).getWidth());
                                            }
                                            final int intValue2 = valueOf.intValue();
                                            final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                            final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                            final int i20 = i13;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = function32;
                                            return MeasureScope.layout$default(subcomposeMeasureScope, intValue2, intValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
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
                                                    final List<TabPosition> arrayList3 = new ArrayList();
                                                    int i21 = i15;
                                                    List<Placeable> list = arrayList;
                                                    SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                    List<Dp> list2 = arrayList2;
                                                    int size4 = list.size();
                                                    for (int i22 = 0; i22 < size4; i22++) {
                                                        Placeable placeable = list.get(i22);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i21, 0, 0.0f, 4, null);
                                                        arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo370toDpu2uoSUM(i21), subcomposeMeasureScope2.mo370toDpu2uoSUM(placeable.getWidth()), list2.get(i22).m6313unboximpl(), null));
                                                        i21 += placeable.getWidth();
                                                    }
                                                    List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                    long j62 = j52;
                                                    int i23 = intValue2;
                                                    int i24 = intValue;
                                                    int i25 = 0;
                                                    for (int size5 = subcompose2.size(); i25 < size5; size5 = size5) {
                                                        Placeable mo5175measureBRTryo02 = subcompose2.get(i25).mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j62, i23, i23, 0, 0, 8, null));
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo02, 0, i24 - mo5175measureBRTryo02.getHeight(), 0.0f, 4, null);
                                                        i25++;
                                                    }
                                                    SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function33;
                                                    List<Measurable> subcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
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

                                                        public final void invoke(Composer composer3, int i26) {
                                                            ComposerKt.sourceInformation(composer3, "C1094@47573L23:TabRow.kt#uh7d8r");
                                                            if ((i26 & 3) == 2 && composer3.getSkipping()) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1734082948, i26, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1094)");
                                                            }
                                                            function34.invoke(arrayList3, composer3, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }));
                                                    int i26 = intValue2;
                                                    int i27 = intValue;
                                                    int size6 = subcompose3.size();
                                                    for (int i28 = 0; i28 < size6; i28++) {
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, subcompose3.get(i28).mo5175measureBRTryo0(Constraints.INSTANCE.m6262fixedJhjzzOo(i26, i27)), 0, 0, 0.0f, 4, null);
                                                    }
                                                    scrollableTabData2.onLaidOut(subcomposeMeasureScope, i15, arrayList3, i20);
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue3);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, (Function2) rememberedValue3, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), startRestartGroup, i10222 | (i11222 & 896) | (i11222 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f2 = f3222;
                    function23 = m1668getLambda7$material3_release;
                    final Modifier modifier322 = modifier2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                f2 = f;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if ((i3 & 256) != 0) {
                }
                if ((i4 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                m1668getLambda7$material3_release = function2;
                final float f32222 = f2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Function2<? super Composer, ? super Integer, Unit> function242222 = m1668getLambda7$material3_release;
                int i102222 = ((i4 >> 6) & 14) | 12582912;
                int i112222 = i4 >> 3;
                SurfaceKt.m2223SurfaceT9BRK9s(modifier2, null, j3, j4, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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
                        ComposerKt.sourceInformation(composer2, "C1016@44196L24,1018@44265L147,1027@44663L3376,1021@44421L3618:TabRow.kt#uh7d8r");
                        if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1572959552, i12, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1016)");
                            }
                            ComposerKt.sourceInformationMarkerStart(composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
                            Object rememberedValue = composer2.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerStart(composer2, -702892231, "CC(remember):TabRow.kt#9igjgp");
                            boolean changed = composer2.changed(ScrollState.this) | composer2.changed(coroutineScope);
                            ScrollState scrollState2 = ScrollState.this;
                            Object rememberedValue2 = composer2.rememberedValue();
                            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                                composer2.updateRememberedValue(rememberedValue2);
                            }
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), ScrollState.this, false, null, false, 14, null)));
                            ComposerKt.sourceInformationMarkerStart(composer2, -702876266, "CC(remember):TabRow.kt#9igjgp");
                            boolean changed2 = composer2.changed(f32222) | composer2.changed(function22) | composer2.changed(function242222) | composer2.changed(function3) | composer2.changedInstance(scrollableTabData) | composer2.changed(i);
                            final float f42 = f32222;
                            final Function2<? super Composer, ? super Integer, Unit> function252 = function22;
                            final Function2<? super Composer, ? super Integer, Unit> function26 = function242222;
                            final int i13 = i;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32 = function3;
                            Object rememberedValue3 = composer2.rememberedValue();
                            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                        return m2286invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                    }

                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final MeasureResult m2286invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j52) {
                                        float f5;
                                        f5 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                        int i14 = subcomposeMeasureScope.mo367roundToPx0680j_4(f5);
                                        final int i15 = subcomposeMeasureScope.mo367roundToPx0680j_4(f42);
                                        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function252);
                                        int i16 = 0;
                                        int size = subcompose.size();
                                        for (int i17 = 0; i17 < size; i17++) {
                                            i16 = Integer.valueOf(Math.max(i16.intValue(), subcompose.get(i17).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                        }
                                        final int intValue = i16.intValue();
                                        long m6243copyZbe2FdA$default = Constraints.m6243copyZbe2FdA$default(j52, i14, 0, intValue, intValue, 2, null);
                                        final List<Placeable> arrayList = new ArrayList();
                                        final List<Dp> arrayList2 = new ArrayList();
                                        int size2 = subcompose.size();
                                        for (int i18 = 0; i18 < size2; i18++) {
                                            Measurable measurable = subcompose.get(i18);
                                            Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(m6243copyZbe2FdA$default);
                                            float m6299constructorimpl = Dp.m6299constructorimpl(subcomposeMeasureScope.mo370toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(mo5175measureBRTryo0.getHeight()), mo5175measureBRTryo0.getWidth())) - Dp.m6299constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                            arrayList.add(mo5175measureBRTryo0);
                                            arrayList2.add(Dp.m6297boximpl(m6299constructorimpl));
                                        }
                                        Integer valueOf = Integer.valueOf(i15 * 2);
                                        int size3 = arrayList.size();
                                        for (int i19 = 0; i19 < size3; i19++) {
                                            valueOf = Integer.valueOf(valueOf.intValue() + ((Placeable) arrayList.get(i19)).getWidth());
                                        }
                                        final int intValue2 = valueOf.intValue();
                                        final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                        final int i20 = i13;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = function32;
                                        return MeasureScope.layout$default(subcomposeMeasureScope, intValue2, intValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
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
                                                final List<TabPosition> arrayList3 = new ArrayList();
                                                int i21 = i15;
                                                List<Placeable> list = arrayList;
                                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                List<Dp> list2 = arrayList2;
                                                int size4 = list.size();
                                                for (int i22 = 0; i22 < size4; i22++) {
                                                    Placeable placeable = list.get(i22);
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i21, 0, 0.0f, 4, null);
                                                    arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo370toDpu2uoSUM(i21), subcomposeMeasureScope2.mo370toDpu2uoSUM(placeable.getWidth()), list2.get(i22).m6313unboximpl(), null));
                                                    i21 += placeable.getWidth();
                                                }
                                                List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                long j62 = j52;
                                                int i23 = intValue2;
                                                int i24 = intValue;
                                                int i25 = 0;
                                                for (int size5 = subcompose2.size(); i25 < size5; size5 = size5) {
                                                    Placeable mo5175measureBRTryo02 = subcompose2.get(i25).mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j62, i23, i23, 0, 0, 8, null));
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo02, 0, i24 - mo5175measureBRTryo02.getHeight(), 0.0f, 4, null);
                                                    i25++;
                                                }
                                                SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function33;
                                                List<Measurable> subcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
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

                                                    public final void invoke(Composer composer3, int i26) {
                                                        ComposerKt.sourceInformation(composer3, "C1094@47573L23:TabRow.kt#uh7d8r");
                                                        if ((i26 & 3) == 2 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1734082948, i26, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1094)");
                                                        }
                                                        function34.invoke(arrayList3, composer3, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }));
                                                int i26 = intValue2;
                                                int i27 = intValue;
                                                int size6 = subcompose3.size();
                                                for (int i28 = 0; i28 < size6; i28++) {
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, subcompose3.get(i28).mo5175measureBRTryo0(Constraints.INSTANCE.m6262fixedJhjzzOo(i26, i27)), 0, 0, 0.0f, 4, null);
                                                }
                                                scrollableTabData2.onLaidOut(subcomposeMeasureScope, i15, arrayList3, i20);
                                            }
                                        }, 4, null);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue3);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, (Function2) rememberedValue3, composer2, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, i102222 | (i112222 & 896) | (i112222 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                }
                f2 = f32222;
                function23 = m1668getLambda7$material3_release;
                final Modifier modifier3222 = modifier2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            f2 = f;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i4 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            m1668getLambda7$material3_release = function2;
            final float f322222 = f2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final Function2<? super Composer, ? super Integer, Unit> function2422222 = m1668getLambda7$material3_release;
            int i1022222 = ((i4 >> 6) & 14) | 12582912;
            int i1122222 = i4 >> 3;
            SurfaceKt.m2223SurfaceT9BRK9s(modifier2, null, j3, j4, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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
                    ComposerKt.sourceInformation(composer2, "C1016@44196L24,1018@44265L147,1027@44663L3376,1021@44421L3618:TabRow.kt#uh7d8r");
                    if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1572959552, i12, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1016)");
                        }
                        ComposerKt.sourceInformationMarkerStart(composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
                        Object rememberedValue = composer2.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            rememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerStart(composer2, -702892231, "CC(remember):TabRow.kt#9igjgp");
                        boolean changed = composer2.changed(ScrollState.this) | composer2.changed(coroutineScope);
                        ScrollState scrollState2 = ScrollState.this;
                        Object rememberedValue2 = composer2.rememberedValue();
                        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), ScrollState.this, false, null, false, 14, null)));
                        ComposerKt.sourceInformationMarkerStart(composer2, -702876266, "CC(remember):TabRow.kt#9igjgp");
                        boolean changed2 = composer2.changed(f322222) | composer2.changed(function22) | composer2.changed(function2422222) | composer2.changed(function3) | composer2.changedInstance(scrollableTabData) | composer2.changed(i);
                        final float f42 = f322222;
                        final Function2<? super Composer, ? super Integer, Unit> function252 = function22;
                        final Function2<? super Composer, ? super Integer, Unit> function26 = function2422222;
                        final int i13 = i;
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32 = function3;
                        Object rememberedValue3 = composer2.rememberedValue();
                        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                    return m2286invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m2286invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j52) {
                                    float f5;
                                    f5 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                    int i14 = subcomposeMeasureScope.mo367roundToPx0680j_4(f5);
                                    final int i15 = subcomposeMeasureScope.mo367roundToPx0680j_4(f42);
                                    List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function252);
                                    int i16 = 0;
                                    int size = subcompose.size();
                                    for (int i17 = 0; i17 < size; i17++) {
                                        i16 = Integer.valueOf(Math.max(i16.intValue(), subcompose.get(i17).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                    }
                                    final int intValue = i16.intValue();
                                    long m6243copyZbe2FdA$default = Constraints.m6243copyZbe2FdA$default(j52, i14, 0, intValue, intValue, 2, null);
                                    final List<Placeable> arrayList = new ArrayList();
                                    final List<Dp> arrayList2 = new ArrayList();
                                    int size2 = subcompose.size();
                                    for (int i18 = 0; i18 < size2; i18++) {
                                        Measurable measurable = subcompose.get(i18);
                                        Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(m6243copyZbe2FdA$default);
                                        float m6299constructorimpl = Dp.m6299constructorimpl(subcomposeMeasureScope.mo370toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(mo5175measureBRTryo0.getHeight()), mo5175measureBRTryo0.getWidth())) - Dp.m6299constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                        arrayList.add(mo5175measureBRTryo0);
                                        arrayList2.add(Dp.m6297boximpl(m6299constructorimpl));
                                    }
                                    Integer valueOf = Integer.valueOf(i15 * 2);
                                    int size3 = arrayList.size();
                                    for (int i19 = 0; i19 < size3; i19++) {
                                        valueOf = Integer.valueOf(valueOf.intValue() + ((Placeable) arrayList.get(i19)).getWidth());
                                    }
                                    final int intValue2 = valueOf.intValue();
                                    final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i20 = i13;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = function32;
                                    return MeasureScope.layout$default(subcomposeMeasureScope, intValue2, intValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
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
                                            final List<TabPosition> arrayList3 = new ArrayList();
                                            int i21 = i15;
                                            List<Placeable> list = arrayList;
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                            List<Dp> list2 = arrayList2;
                                            int size4 = list.size();
                                            for (int i22 = 0; i22 < size4; i22++) {
                                                Placeable placeable = list.get(i22);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i21, 0, 0.0f, 4, null);
                                                arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo370toDpu2uoSUM(i21), subcomposeMeasureScope2.mo370toDpu2uoSUM(placeable.getWidth()), list2.get(i22).m6313unboximpl(), null));
                                                i21 += placeable.getWidth();
                                            }
                                            List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                            long j62 = j52;
                                            int i23 = intValue2;
                                            int i24 = intValue;
                                            int i25 = 0;
                                            for (int size5 = subcompose2.size(); i25 < size5; size5 = size5) {
                                                Placeable mo5175measureBRTryo02 = subcompose2.get(i25).mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j62, i23, i23, 0, 0, 8, null));
                                                Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo02, 0, i24 - mo5175measureBRTryo02.getHeight(), 0.0f, 4, null);
                                                i25++;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function33;
                                            List<Measurable> subcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
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

                                                public final void invoke(Composer composer3, int i26) {
                                                    ComposerKt.sourceInformation(composer3, "C1094@47573L23:TabRow.kt#uh7d8r");
                                                    if ((i26 & 3) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1734082948, i26, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1094)");
                                                    }
                                                    function34.invoke(arrayList3, composer3, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }));
                                            int i26 = intValue2;
                                            int i27 = intValue;
                                            int size6 = subcompose3.size();
                                            for (int i28 = 0; i28 < size6; i28++) {
                                                Placeable.PlacementScope.placeRelative$default(placementScope, subcompose3.get(i28).mo5175measureBRTryo0(Constraints.INSTANCE.m6262fixedJhjzzOo(i26, i27)), 0, 0, 0.0f, 4, null);
                                            }
                                            scrollableTabData2.onLaidOut(subcomposeMeasureScope, i15, arrayList3, i20);
                                        }
                                    }, 4, null);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, (Function2) rememberedValue3, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, i1022222 | (i1122222 & 896) | (i1122222 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
            }
            f2 = f322222;
            function23 = m1668getLambda7$material3_release;
            final Modifier modifier32222 = modifier2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        f2 = f;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i4 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        m1668getLambda7$material3_release = function2;
        final float f3222222 = f2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final Function2<? super Composer, ? super Integer, Unit> function24222222 = m1668getLambda7$material3_release;
        int i10222222 = ((i4 >> 6) & 14) | 12582912;
        int i11222222 = i4 >> 3;
        SurfaceKt.m2223SurfaceT9BRK9s(modifier2, null, j3, j4, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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
                ComposerKt.sourceInformation(composer2, "C1016@44196L24,1018@44265L147,1027@44663L3376,1021@44421L3618:TabRow.kt#uh7d8r");
                if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1572959552, i12, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1016)");
                    }
                    ComposerKt.sourceInformationMarkerStart(composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
                    Object rememberedValue = composer2.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerStart(composer2, -702892231, "CC(remember):TabRow.kt#9igjgp");
                    boolean changed = composer2.changed(ScrollState.this) | composer2.changed(coroutineScope);
                    ScrollState scrollState2 = ScrollState.this;
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), ScrollState.this, false, null, false, 14, null)));
                    ComposerKt.sourceInformationMarkerStart(composer2, -702876266, "CC(remember):TabRow.kt#9igjgp");
                    boolean changed2 = composer2.changed(f3222222) | composer2.changed(function22) | composer2.changed(function24222222) | composer2.changed(function3) | composer2.changedInstance(scrollableTabData) | composer2.changed(i);
                    final float f42 = f3222222;
                    final Function2<? super Composer, ? super Integer, Unit> function252 = function22;
                    final Function2<? super Composer, ? super Integer, Unit> function26 = function24222222;
                    final int i13 = i;
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32 = function3;
                    Object rememberedValue3 = composer2.rememberedValue();
                    if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m2286invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m2286invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j52) {
                                float f5;
                                f5 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                int i14 = subcomposeMeasureScope.mo367roundToPx0680j_4(f5);
                                final int i15 = subcomposeMeasureScope.mo367roundToPx0680j_4(f42);
                                List<Measurable> subcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function252);
                                int i16 = 0;
                                int size = subcompose.size();
                                for (int i17 = 0; i17 < size; i17++) {
                                    i16 = Integer.valueOf(Math.max(i16.intValue(), subcompose.get(i17).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                }
                                final int intValue = i16.intValue();
                                long m6243copyZbe2FdA$default = Constraints.m6243copyZbe2FdA$default(j52, i14, 0, intValue, intValue, 2, null);
                                final List<Placeable> arrayList = new ArrayList();
                                final List<Dp> arrayList2 = new ArrayList();
                                int size2 = subcompose.size();
                                for (int i18 = 0; i18 < size2; i18++) {
                                    Measurable measurable = subcompose.get(i18);
                                    Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(m6243copyZbe2FdA$default);
                                    float m6299constructorimpl = Dp.m6299constructorimpl(subcomposeMeasureScope.mo370toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(mo5175measureBRTryo0.getHeight()), mo5175measureBRTryo0.getWidth())) - Dp.m6299constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                    arrayList.add(mo5175measureBRTryo0);
                                    arrayList2.add(Dp.m6297boximpl(m6299constructorimpl));
                                }
                                Integer valueOf = Integer.valueOf(i15 * 2);
                                int size3 = arrayList.size();
                                for (int i19 = 0; i19 < size3; i19++) {
                                    valueOf = Integer.valueOf(valueOf.intValue() + ((Placeable) arrayList.get(i19)).getWidth());
                                }
                                final int intValue2 = valueOf.intValue();
                                final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i20 = i13;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = function32;
                                return MeasureScope.layout$default(subcomposeMeasureScope, intValue2, intValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
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
                                        final List<TabPosition> arrayList3 = new ArrayList();
                                        int i21 = i15;
                                        List<Placeable> list = arrayList;
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        List<Dp> list2 = arrayList2;
                                        int size4 = list.size();
                                        for (int i22 = 0; i22 < size4; i22++) {
                                            Placeable placeable = list.get(i22);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i21, 0, 0.0f, 4, null);
                                            arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo370toDpu2uoSUM(i21), subcomposeMeasureScope2.mo370toDpu2uoSUM(placeable.getWidth()), list2.get(i22).m6313unboximpl(), null));
                                            i21 += placeable.getWidth();
                                        }
                                        List<Measurable> subcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                        long j62 = j52;
                                        int i23 = intValue2;
                                        int i24 = intValue;
                                        int i25 = 0;
                                        for (int size5 = subcompose2.size(); i25 < size5; size5 = size5) {
                                            Placeable mo5175measureBRTryo02 = subcompose2.get(i25).mo5175measureBRTryo0(Constraints.m6243copyZbe2FdA$default(j62, i23, i23, 0, 0, 8, null));
                                            Placeable.PlacementScope.placeRelative$default(placementScope, mo5175measureBRTryo02, 0, i24 - mo5175measureBRTryo02.getHeight(), 0.0f, 4, null);
                                            i25++;
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function33;
                                        List<Measurable> subcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
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

                                            public final void invoke(Composer composer3, int i26) {
                                                ComposerKt.sourceInformation(composer3, "C1094@47573L23:TabRow.kt#uh7d8r");
                                                if ((i26 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1734082948, i26, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1094)");
                                                }
                                                function34.invoke(arrayList3, composer3, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        int i26 = intValue2;
                                        int i27 = intValue;
                                        int size6 = subcompose3.size();
                                        for (int i28 = 0; i28 < size6; i28++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, subcompose3.get(i28).mo5175measureBRTryo0(Constraints.INSTANCE.m6262fixedJhjzzOo(i26, i27)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut(subcomposeMeasureScope, i15, arrayList3, i20);
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, (Function2) rememberedValue3, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, i10222222 | (i11222222 & 896) | (i11222222 & 7168), 114);
        if (ComposerKt.isTraceInProgress()) {
        }
        f2 = f3222222;
        function23 = m1668getLambda7$material3_release;
        final Modifier modifier322222 = modifier2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
