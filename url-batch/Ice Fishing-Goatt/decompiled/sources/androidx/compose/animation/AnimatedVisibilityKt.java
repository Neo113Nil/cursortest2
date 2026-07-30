package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: AnimatedVisibility.kt */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0091\u0001\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0002\u0010\u001a\u001aa\u0010\u001b\u001a\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010 \u001a[\u0010\u001b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010!\u001ak\u0010\"\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0002\u0010#\u001am\u0010\u001b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010$\u001ae\u0010\u001b\u001a\u00020\u0007*\u00020%2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010&\u001a_\u0010\u001b\u001a\u00020\u0007*\u00020%2\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010'\u001ae\u0010\u001b\u001a\u00020\u0007*\u00020(2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010)\u001a_\u0010\u001b\u001a\u00020\u0007*\u00020(2\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010*\u001a9\u0010+\u001a\u00020\u0003\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010,\u001a\u0002H\bH\u0003¢\u0006\u0002\u0010-\"\u001e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006.²\u0006\"\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0013\"\u0004\b\u0000\u0010\bX\u008a\u0084\u0002²\u0006\u0010\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\bX\u008a\u0084\u0002"}, d2 = {"exitFinished", "", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "getExitFinished", "(Landroidx/compose/animation/core/Transition;)Z", "AnimatedEnterExitImpl", "", "T", "transition", "visible", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "shouldDisposeBlock", "Lkotlin/Function2;", "onLookaheadMeasured", "Landroidx/compose/animation/OnLookaheadMeasured;", "content", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function2;Landroidx/compose/animation/OnLookaheadMeasured;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AnimatedVisibility", "visibleState", "Landroidx/compose/animation/core/MutableTransitionState;", "label", "", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AnimatedVisibilityImpl", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "targetEnterExit", "targetState", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;", "animation_release", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        final boolean z2;
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function32;
        final String str3;
        final Modifier modifier3;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2088733774);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)132@6967L32,133@7004L84:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (startRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                        if ((i2 & 32) != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            function32 = function3;
                        } else {
                            function32 = function3;
                            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i3 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                            }
                        }
                        if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            EnterTransition plus = i4 != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                            ExitTransition plus2 = i5 != 0 ? EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                            String str4 = i6 != 0 ? "AnimatedVisibility" : str2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2088733774, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:131)");
                            }
                            int i8 = i3 << 3;
                            Modifier modifier4 = companion;
                            EnterTransition enterTransition4 = plus;
                            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                public final Boolean invoke(boolean z3) {
                                    return Boolean.valueOf(z3);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return invoke(bool.booleanValue());
                                }
                            }, modifier4, enterTransition4, plus2, function32, startRestartGroup, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (i3 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str3 = str4;
                            modifier3 = modifier4;
                            enterTransition3 = enterTransition4;
                            exitTransition3 = plus2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str3 = str2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
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
                                    AnimatedVisibilityKt.AnimatedVisibility(z2, modifier3, enterTransition3, exitTransition3, str3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if ((i2 & 32) != 0) {
                    }
                    if ((74899 & i3) == 74898) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i3 << 3;
                    Modifier modifier42 = companion;
                    EnterTransition enterTransition42 = plus;
                    AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        public final Boolean invoke(boolean z3) {
                            return Boolean.valueOf(z3);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier42, enterTransition42, plus2, function32, startRestartGroup, (i82 & 57344) | (i82 & 896) | 48 | (i82 & 7168) | (i3 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str3 = str4;
                    modifier3 = modifier42;
                    enterTransition3 = enterTransition42;
                    exitTransition3 = plus2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) != 0) {
                }
                if ((74899 & i3) == 74898) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i822 = i3 << 3;
                Modifier modifier422 = companion;
                EnterTransition enterTransition422 = plus;
                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    public final Boolean invoke(boolean z3) {
                        return Boolean.valueOf(z3);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier422, enterTransition422, plus2, function32, startRestartGroup, (i822 & 57344) | (i822 & 896) | 48 | (i822 & 7168) | (i3 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                }
                str3 = str4;
                modifier3 = modifier422;
                enterTransition3 = enterTransition422;
                exitTransition3 = plus2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((i2 & 32) != 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i8222 = i3 << 3;
            Modifier modifier4222 = companion;
            EnterTransition enterTransition4222 = plus;
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                public final Boolean invoke(boolean z3) {
                    return Boolean.valueOf(z3);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier4222, enterTransition4222, plus2, function32, startRestartGroup, (i8222 & 57344) | (i8222 & 896) | 48 | (i8222 & 7168) | (i3 & 458752));
            if (ComposerKt.isTraceInProgress()) {
            }
            str3 = str4;
            modifier3 = modifier4222;
            enterTransition3 = enterTransition4222;
            exitTransition3 = plus2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i2 & 32) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i82222 = i3 << 3;
        Modifier modifier42222 = companion;
        EnterTransition enterTransition42222 = plus;
        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
            public final Boolean invoke(boolean z3) {
                return Boolean.valueOf(z3);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, modifier42222, enterTransition42222, plus2, function32, startRestartGroup, (i82222 & 57344) | (i82222 & 896) | 48 | (i82222 & 7168) | (i3 & 458752));
        if (ComposerKt.isTraceInProgress()) {
        }
        str3 = str4;
        modifier3 = modifier42222;
        enterTransition3 = enterTransition42222;
        exitTransition3 = plus2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final RowScope rowScope, boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        final boolean z2;
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function32;
        final String str3;
        final Modifier modifier3;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1741346906);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)207@11272L32,208@11309L84:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i3 = (startRestartGroup.changed(z2) ? 32 : 16) | i;
            } else {
                i3 = i;
            }
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) != 0) {
                            i3 |= 1572864;
                            function32 = function3;
                        } else {
                            function32 = function3;
                            if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changedInstance(function32) ? 1048576 : 524288;
                            }
                        }
                        if ((599185 & i3) == 599184 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                enterTransition2 = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));
                            }
                            ExitTransition plus = i5 != 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null)) : exitTransition2;
                            String str4 = i6 != 0 ? "AnimatedVisibility" : str2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1741346906, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:206)");
                            }
                            int i8 = i3 >> 3;
                            Modifier modifier4 = companion;
                            EnterTransition enterTransition4 = enterTransition2;
                            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str4, startRestartGroup, (i8 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                                public final Boolean invoke(boolean z3) {
                                    return Boolean.valueOf(z3);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return invoke(bool.booleanValue());
                                }
                            }, modifier4, enterTransition4, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i8));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str3 = str4;
                            modifier3 = modifier4;
                            enterTransition3 = enterTransition4;
                            exitTransition3 = plus;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str3 = str2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
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
                                    AnimatedVisibilityKt.AnimatedVisibility(RowScope.this, z2, modifier3, enterTransition3, exitTransition3, str3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if ((i2 & 32) != 0) {
                    }
                    if ((599185 & i3) == 599184) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i3 >> 3;
                    Modifier modifier42 = companion;
                    EnterTransition enterTransition42 = enterTransition2;
                    AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str4, startRestartGroup, (i82 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        public final Boolean invoke(boolean z3) {
                            return Boolean.valueOf(z3);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier42, enterTransition42, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i82));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str3 = str4;
                    modifier3 = modifier42;
                    enterTransition3 = enterTransition42;
                    exitTransition3 = plus;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) != 0) {
                }
                if ((599185 & i3) == 599184) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i822 = i3 >> 3;
                Modifier modifier422 = companion;
                EnterTransition enterTransition422 = enterTransition2;
                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str4, startRestartGroup, (i822 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                    public final Boolean invoke(boolean z3) {
                        return Boolean.valueOf(z3);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier422, enterTransition422, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i822));
                if (ComposerKt.isTraceInProgress()) {
                }
                str3 = str4;
                modifier3 = modifier422;
                enterTransition3 = enterTransition422;
                exitTransition3 = plus;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((i2 & 32) != 0) {
            }
            if ((599185 & i3) == 599184) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i8222 = i3 >> 3;
            Modifier modifier4222 = companion;
            EnterTransition enterTransition4222 = enterTransition2;
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str4, startRestartGroup, (i8222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                public final Boolean invoke(boolean z3) {
                    return Boolean.valueOf(z3);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier4222, enterTransition4222, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i8222));
            if (ComposerKt.isTraceInProgress()) {
            }
            str3 = str4;
            modifier3 = modifier4222;
            enterTransition3 = enterTransition4222;
            exitTransition3 = plus;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i2 & 32) != 0) {
        }
        if ((599185 & i3) == 599184) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i82222 = i3 >> 3;
        Modifier modifier42222 = companion;
        EnterTransition enterTransition42222 = enterTransition2;
        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str4, startRestartGroup, (i82222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
            public final Boolean invoke(boolean z3) {
                return Boolean.valueOf(z3);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, modifier42222, enterTransition42222, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i82222));
        if (ComposerKt.isTraceInProgress()) {
        }
        str3 = str4;
        modifier3 = modifier42222;
        enterTransition3 = enterTransition42222;
        exitTransition3 = plus;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final ColumnScope columnScope, boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        final boolean z2;
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function32;
        final String str3;
        final Modifier modifier3;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1766503102);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)280@15555L32,281@15592L84:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i3 = (startRestartGroup.changed(z2) ? 32 : 16) | i;
            } else {
                i3 = i;
            }
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) != 0) {
                            i3 |= 1572864;
                            function32 = function3;
                        } else {
                            function32 = function3;
                            if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changedInstance(function32) ? 1048576 : 524288;
                            }
                        }
                        if ((599185 & i3) == 599184 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                enterTransition2 = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));
                            }
                            ExitTransition plus = i5 != 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)) : exitTransition2;
                            String str4 = i6 != 0 ? "AnimatedVisibility" : str2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1766503102, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:279)");
                            }
                            int i8 = i3 >> 3;
                            Modifier modifier4 = companion;
                            EnterTransition enterTransition4 = enterTransition2;
                            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str4, startRestartGroup, (i8 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                                public final Boolean invoke(boolean z3) {
                                    return Boolean.valueOf(z3);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return invoke(bool.booleanValue());
                                }
                            }, modifier4, enterTransition4, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i8));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str3 = str4;
                            modifier3 = modifier4;
                            enterTransition3 = enterTransition4;
                            exitTransition3 = plus;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str3 = str2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
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
                                    AnimatedVisibilityKt.AnimatedVisibility(ColumnScope.this, z2, modifier3, enterTransition3, exitTransition3, str3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if ((i2 & 32) != 0) {
                    }
                    if ((599185 & i3) == 599184) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i3 >> 3;
                    Modifier modifier42 = companion;
                    EnterTransition enterTransition42 = enterTransition2;
                    AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str4, startRestartGroup, (i82 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        public final Boolean invoke(boolean z3) {
                            return Boolean.valueOf(z3);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier42, enterTransition42, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i82));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str3 = str4;
                    modifier3 = modifier42;
                    enterTransition3 = enterTransition42;
                    exitTransition3 = plus;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) != 0) {
                }
                if ((599185 & i3) == 599184) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i822 = i3 >> 3;
                Modifier modifier422 = companion;
                EnterTransition enterTransition422 = enterTransition2;
                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str4, startRestartGroup, (i822 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    public final Boolean invoke(boolean z3) {
                        return Boolean.valueOf(z3);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier422, enterTransition422, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i822));
                if (ComposerKt.isTraceInProgress()) {
                }
                str3 = str4;
                modifier3 = modifier422;
                enterTransition3 = enterTransition422;
                exitTransition3 = plus;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((i2 & 32) != 0) {
            }
            if ((599185 & i3) == 599184) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i8222 = i3 >> 3;
            Modifier modifier4222 = companion;
            EnterTransition enterTransition4222 = enterTransition2;
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str4, startRestartGroup, (i8222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                public final Boolean invoke(boolean z3) {
                    return Boolean.valueOf(z3);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier4222, enterTransition4222, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i8222));
            if (ComposerKt.isTraceInProgress()) {
            }
            str3 = str4;
            modifier3 = modifier4222;
            enterTransition3 = enterTransition4222;
            exitTransition3 = plus;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i2 & 32) != 0) {
        }
        if ((599185 & i3) == 599184) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i82222 = i3 >> 3;
        Modifier modifier42222 = companion;
        EnterTransition enterTransition42222 = enterTransition2;
        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z2), str4, startRestartGroup, (i82222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
            public final Boolean invoke(boolean z3) {
                return Boolean.valueOf(z3);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, modifier42222, enterTransition42222, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i82222));
        if (ComposerKt.isTraceInProgress()) {
        }
        str3 = str4;
        modifier3 = modifier42222;
        enterTransition3 = enterTransition42222;
        exitTransition3 = plus;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function32;
        final String str3;
        final Modifier modifier3;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-222898426);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)385@20955L39,386@20999L84:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(mutableTransitionState) : startRestartGroup.changedInstance(mutableTransitionState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                        if ((i2 & 32) != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            function32 = function3;
                        } else {
                            function32 = function3;
                            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i3 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                            }
                        }
                        if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            EnterTransition plus = i4 != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                            ExitTransition plus2 = i5 != 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null)) : exitTransition2;
                            String str4 = i6 != 0 ? "AnimatedVisibility" : str2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-222898426, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:384)");
                            }
                            int i8 = i3 << 3;
                            Modifier modifier4 = companion;
                            EnterTransition enterTransition4 = plus;
                            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                public final Boolean invoke(boolean z) {
                                    return Boolean.valueOf(z);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return invoke(bool.booleanValue());
                                }
                            }, modifier4, enterTransition4, plus2, function32, startRestartGroup, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (i3 & 458752));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str3 = str4;
                            modifier3 = modifier4;
                            enterTransition3 = enterTransition4;
                            exitTransition3 = plus2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str3 = str2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
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
                                    AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, modifier3, enterTransition3, exitTransition3, str3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if ((i2 & 32) != 0) {
                    }
                    if ((74899 & i3) == 74898) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i3 << 3;
                    Modifier modifier42 = companion;
                    EnterTransition enterTransition42 = plus;
                    AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier42, enterTransition42, plus2, function32, startRestartGroup, (i82 & 57344) | (i82 & 896) | 48 | (i82 & 7168) | (i3 & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str3 = str4;
                    modifier3 = modifier42;
                    enterTransition3 = enterTransition42;
                    exitTransition3 = plus2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) != 0) {
                }
                if ((74899 & i3) == 74898) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i822 = i3 << 3;
                Modifier modifier422 = companion;
                EnterTransition enterTransition422 = plus;
                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier422, enterTransition422, plus2, function32, startRestartGroup, (i822 & 57344) | (i822 & 896) | 48 | (i822 & 7168) | (i3 & 458752));
                if (ComposerKt.isTraceInProgress()) {
                }
                str3 = str4;
                modifier3 = modifier422;
                enterTransition3 = enterTransition422;
                exitTransition3 = plus2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((i2 & 32) != 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i8222 = i3 << 3;
            Modifier modifier4222 = companion;
            EnterTransition enterTransition4222 = plus;
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                public final Boolean invoke(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier4222, enterTransition4222, plus2, function32, startRestartGroup, (i8222 & 57344) | (i8222 & 896) | 48 | (i8222 & 7168) | (i3 & 458752));
            if (ComposerKt.isTraceInProgress()) {
            }
            str3 = str4;
            modifier3 = modifier4222;
            enterTransition3 = enterTransition4222;
            exitTransition3 = plus2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i2 & 32) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i82222 = i3 << 3;
        Modifier modifier42222 = companion;
        EnterTransition enterTransition42222 = plus;
        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
            public final Boolean invoke(boolean z) {
                return Boolean.valueOf(z);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, modifier42222, enterTransition42222, plus2, function32, startRestartGroup, (i82222 & 57344) | (i82222 & 896) | 48 | (i82222 & 7168) | (i3 & 458752));
        if (ComposerKt.isTraceInProgress()) {
        }
        str3 = str4;
        modifier3 = modifier42222;
        enterTransition3 = enterTransition42222;
        exitTransition3 = plus2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final RowScope rowScope, final MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function32;
        final String str3;
        final Modifier modifier3;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(836509870);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)460@25318L39,461@25362L84:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            i3 = ((i & 64) == 0 ? startRestartGroup.changed(mutableTransitionState) : startRestartGroup.changedInstance(mutableTransitionState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) != 0) {
                            i3 |= 1572864;
                            function32 = function3;
                        } else {
                            function32 = function3;
                            if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changedInstance(function32) ? 1048576 : 524288;
                            }
                        }
                        if ((599185 & i3) == 599184 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                enterTransition2 = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                            }
                            ExitTransition plus = i5 != 0 ? EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                            String str4 = i6 != 0 ? "AnimatedVisibility" : str2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(836509870, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:459)");
                            }
                            int i8 = i3 >> 3;
                            Modifier modifier4 = companion;
                            EnterTransition enterTransition4 = enterTransition2;
                            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, MutableTransitionState.$stable | (i8 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                                public final Boolean invoke(boolean z) {
                                    return Boolean.valueOf(z);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return invoke(bool.booleanValue());
                                }
                            }, modifier4, enterTransition4, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i8));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str3 = str4;
                            modifier3 = modifier4;
                            enterTransition3 = enterTransition4;
                            exitTransition3 = plus;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str3 = str2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
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
                                    AnimatedVisibilityKt.AnimatedVisibility(RowScope.this, mutableTransitionState, modifier3, enterTransition3, exitTransition3, str3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if ((i2 & 32) != 0) {
                    }
                    if ((599185 & i3) == 599184) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i3 >> 3;
                    Modifier modifier42 = companion;
                    EnterTransition enterTransition42 = enterTransition2;
                    AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, MutableTransitionState.$stable | (i82 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier42, enterTransition42, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i82));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str3 = str4;
                    modifier3 = modifier42;
                    enterTransition3 = enterTransition42;
                    exitTransition3 = plus;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) != 0) {
                }
                if ((599185 & i3) == 599184) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i822 = i3 >> 3;
                Modifier modifier422 = companion;
                EnterTransition enterTransition422 = enterTransition2;
                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, MutableTransitionState.$stable | (i822 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier422, enterTransition422, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i822));
                if (ComposerKt.isTraceInProgress()) {
                }
                str3 = str4;
                modifier3 = modifier422;
                enterTransition3 = enterTransition422;
                exitTransition3 = plus;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((i2 & 32) != 0) {
            }
            if ((599185 & i3) == 599184) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i8222 = i3 >> 3;
            Modifier modifier4222 = companion;
            EnterTransition enterTransition4222 = enterTransition2;
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, MutableTransitionState.$stable | (i8222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                public final Boolean invoke(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier4222, enterTransition4222, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i8222));
            if (ComposerKt.isTraceInProgress()) {
            }
            str3 = str4;
            modifier3 = modifier4222;
            enterTransition3 = enterTransition4222;
            exitTransition3 = plus;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i2 & 32) != 0) {
        }
        if ((599185 & i3) == 599184) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i82222 = i3 >> 3;
        Modifier modifier42222 = companion;
        EnterTransition enterTransition42222 = enterTransition2;
        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, MutableTransitionState.$stable | (i82222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
            public final Boolean invoke(boolean z) {
                return Boolean.valueOf(z);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, modifier42222, enterTransition42222, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i82222));
        if (ComposerKt.isTraceInProgress()) {
        }
        str3 = str4;
        modifier3 = modifier42222;
        enterTransition3 = enterTransition42222;
        exitTransition3 = plus;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final ColumnScope columnScope, final MutableTransitionState<Boolean> mutableTransitionState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function32;
        final String str3;
        final Modifier modifier3;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-850656618);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)536@29773L39,537@29817L84:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            i3 = ((i & 64) == 0 ? startRestartGroup.changed(mutableTransitionState) : startRestartGroup.changedInstance(mutableTransitionState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) != 0) {
                            i3 |= 1572864;
                            function32 = function3;
                        } else {
                            function32 = function3;
                            if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changedInstance(function32) ? 1048576 : 524288;
                            }
                        }
                        if ((599185 & i3) == 599184 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                enterTransition2 = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                            }
                            ExitTransition plus = i5 != 0 ? EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                            String str4 = i6 != 0 ? "AnimatedVisibility" : str2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-850656618, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:535)");
                            }
                            int i8 = i3 >> 3;
                            Modifier modifier4 = companion;
                            EnterTransition enterTransition4 = enterTransition2;
                            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, MutableTransitionState.$stable | (i8 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                                public final Boolean invoke(boolean z) {
                                    return Boolean.valueOf(z);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return invoke(bool.booleanValue());
                                }
                            }, modifier4, enterTransition4, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i8));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str3 = str4;
                            modifier3 = modifier4;
                            enterTransition3 = enterTransition4;
                            exitTransition3 = plus;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str3 = str2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
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
                                    AnimatedVisibilityKt.AnimatedVisibility(ColumnScope.this, mutableTransitionState, modifier3, enterTransition3, exitTransition3, str3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if ((i2 & 32) != 0) {
                    }
                    if ((599185 & i3) == 599184) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i3 >> 3;
                    Modifier modifier42 = companion;
                    EnterTransition enterTransition42 = enterTransition2;
                    AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, MutableTransitionState.$stable | (i82 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier42, enterTransition42, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i82));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str3 = str4;
                    modifier3 = modifier42;
                    enterTransition3 = enterTransition42;
                    exitTransition3 = plus;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) != 0) {
                }
                if ((599185 & i3) == 599184) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i822 = i3 >> 3;
                Modifier modifier422 = companion;
                EnterTransition enterTransition422 = enterTransition2;
                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, MutableTransitionState.$stable | (i822 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier422, enterTransition422, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i822));
                if (ComposerKt.isTraceInProgress()) {
                }
                str3 = str4;
                modifier3 = modifier422;
                enterTransition3 = enterTransition422;
                exitTransition3 = plus;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((i2 & 32) != 0) {
            }
            if ((599185 & i3) == 599184) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i8222 = i3 >> 3;
            Modifier modifier4222 = companion;
            EnterTransition enterTransition4222 = enterTransition2;
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, MutableTransitionState.$stable | (i8222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                public final Boolean invoke(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier4222, enterTransition4222, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i8222));
            if (ComposerKt.isTraceInProgress()) {
            }
            str3 = str4;
            modifier3 = modifier4222;
            enterTransition3 = enterTransition4222;
            exitTransition3 = plus;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i2 & 32) != 0) {
        }
        if ((599185 & i3) == 599184) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i82222 = i3 >> 3;
        Modifier modifier42222 = companion;
        EnterTransition enterTransition42222 = enterTransition2;
        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, MutableTransitionState.$stable | (i82222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
            public final Boolean invoke(boolean z) {
                return Boolean.valueOf(z);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, modifier42222, enterTransition42222, plus, function32, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i82222));
        if (ComposerKt.isTraceInProgress()) {
        }
        str3 = str4;
        modifier3 = modifier42222;
        enterTransition3 = enterTransition42222;
        exitTransition3 = plus;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void AnimatedVisibility(final Transition<T> transition, final Function1<? super T, Boolean> function1, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Transition<T> transition2;
        int i3;
        Function1<? super T, Boolean> function12;
        final Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function32;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1031950689);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(4,3,1,2)609@34120L79:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
            transition2 = transition;
        } else {
            transition2 = transition;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(transition2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            }
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    if ((i2 & 16) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function32 = function3;
                    } else {
                        function32 = function3;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                        }
                    }
                    if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        EnterTransition plus = i4 == 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                        ExitTransition plus2 = i5 == 0 ? EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1031950689, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:609)");
                        }
                        Modifier modifier3 = companion;
                        EnterTransition enterTransition4 = plus;
                        AnimatedVisibilityImpl(transition2, function12, modifier3, enterTransition4, plus2, function32, startRestartGroup, i3 & 524286);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        enterTransition3 = enterTransition4;
                        exitTransition3 = plus2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        enterTransition3 = enterTransition2;
                        exitTransition3 = exitTransition2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
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

                            public final void invoke(Composer composer2, int i7) {
                                AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier2, enterTransition3, exitTransition3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                exitTransition2 = exitTransition;
                if ((i2 & 16) == 0) {
                }
                if ((74899 & i3) == 74898) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier32 = companion;
                EnterTransition enterTransition42 = plus;
                AnimatedVisibilityImpl(transition2, function12, modifier32, enterTransition42, plus2, function32, startRestartGroup, i3 & 524286);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier32;
                enterTransition3 = enterTransition42;
                exitTransition3 = plus2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            if ((i2 & 16) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            if (i6 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier322 = companion;
            EnterTransition enterTransition422 = plus;
            AnimatedVisibilityImpl(transition2, function12, modifier322, enterTransition422, plus2, function32, startRestartGroup, i3 & 524286);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier322;
            enterTransition3 = enterTransition422;
            exitTransition3 = plus2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        if ((i2 & 16) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        if (i6 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier3222 = companion;
        EnterTransition enterTransition4222 = plus;
        AnimatedVisibilityImpl(transition2, function12, modifier3222, enterTransition4222, plus2, function32, startRestartGroup, i3 & 524286);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3222;
        enterTransition3 = enterTransition4222;
        exitTransition3 = plus2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final <T> void AnimatedVisibilityImpl(final Transition<T> transition, final Function1<? super T, Boolean> function1, final Modifier modifier, final EnterTransition enterTransition, final ExitTransition exitTransition, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        ExitTransition exitTransition2;
        Composer startRestartGroup = composer.startRestartGroup(429978603);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibilityImpl)P(4,5,3,1,2)697@38299L415,694@38181L703:AnimatedVisibility.kt#xbi5r1");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(enterTransition) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            exitTransition2 = exitTransition;
            i2 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
        } else {
            exitTransition2 = exitTransition;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(429978603, i2, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:693)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 689212639, "CC(remember):AnimatedVisibility.kt#9igjgp");
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m62invoke3p2s80s(measureScope, measurable, constraints.getValue());
                    }

                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final MeasureResult m62invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                        long IntSize;
                        final Placeable mo5152measureBRTryo0 = measurable.mo5152measureBRTryo0(j);
                        if (measureScope.isLookingAhead() && !function1.invoke(transition.getTargetState()).booleanValue()) {
                            IntSize = IntSize.INSTANCE.m6440getZeroYbymL2g();
                        } else {
                            IntSize = IntSizeKt.IntSize(mo5152measureBRTryo0.getWidth(), mo5152measureBRTryo0.getHeight());
                        }
                        return MeasureScope.layout$default(measureScope, IntSize.m6435getWidthimpl(IntSize), IntSize.m6434getHeightimpl(IntSize), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.1
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
            AnimatedEnterExitImpl(transition, function1, LayoutModifierKt.layout(modifier, (Function3) rememberedValue), enterTransition, exitTransition2, new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$2
                @Override // kotlin.jvm.functions.Function2
                public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                    return Boolean.valueOf(enterExitState == enterExitState2 && enterExitState2 == EnterExitState.PostExit);
                }
            }, null, function3, startRestartGroup, i3 | 196608 | i4 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3
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
                    AnimatedVisibilityKt.AnimatedVisibilityImpl(transition, function1, modifier, enterTransition, exitTransition, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void AnimatedEnterExitImpl(final Transition<T> transition, final Function1<? super T, Boolean> function1, final Modifier modifier, final EnterTransition enterTransition, final ExitTransition exitTransition, final Function2<? super EnterExitState, ? super EnterExitState, Boolean> function2, OnLookaheadMeasured onLookaheadMeasured, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        EnterTransition enterTransition2;
        ExitTransition exitTransition2;
        int i4;
        OnLookaheadMeasured onLookaheadMeasured2;
        boolean z;
        Object rememberedValue;
        int i5;
        EnterExitState enterExitState;
        int i6;
        Transition createChildTransitionInternal;
        boolean changed;
        AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 rememberedValue2;
        boolean z2;
        Object rememberedValue3;
        Composer composer2;
        Modifier.Companion companion;
        Object rememberedValue4;
        int currentCompositeKeyHash;
        Composer m3316constructorimpl;
        ScopeUpdateScope endRestartGroup;
        final OnLookaheadMeasured onLookaheadMeasured3 = onLookaheadMeasured;
        Composer startRestartGroup = composer.startRestartGroup(-891967166);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedEnterExitImpl)P(6,7,3,1,2,5,4):AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            enterTransition2 = enterTransition;
        } else {
            enterTransition2 = enterTransition;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            exitTransition2 = exitTransition;
        } else {
            exitTransition2 = exitTransition;
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
            }
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        int i7 = i2 & 64;
        int i8 = 1572864;
        if (i7 == 0) {
            if ((i & 1572864) == 0) {
                i8 = (i & 2097152) == 0 ? startRestartGroup.changed(onLookaheadMeasured3) : startRestartGroup.changedInstance(onLookaheadMeasured3) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
            }
            i4 = i3;
            if ((4793491 & i4) == 4793490 || !startRestartGroup.getSkipping()) {
                if (i7 != 0) {
                    onLookaheadMeasured3 = null;
                }
                onLookaheadMeasured2 = onLookaheadMeasured3;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-891967166, i4, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:737)");
                }
                if (!function1.invoke(transition.getTargetState()).booleanValue() || function1.invoke(transition.getCurrentState()).booleanValue() || transition.isSeeking() || transition.getHasInitialValueAnimations()) {
                    startRestartGroup.startReplaceGroup(1787977937);
                    ComposerKt.sourceInformation(startRestartGroup, "741@39659L116,745@39818L40,752@40073L399,747@39898L574");
                    int i9 = i4 & 14;
                    int i10 = i9 | 48;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1215497572, "CC(createChildTransition)1813@74138L36,1814@74198L74,1815@74295L39,1816@74346L63:Transition.kt#pdpnli");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 272027253, "CC(remember):Transition.kt#9igjgp");
                    int i11 = i10 & 14;
                    z = ((i11 ^ 6) <= 4 && startRestartGroup.changed(transition)) || (i10 & 6) == 4;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = transition.getCurrentState();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (transition.isSeeking()) {
                        rememberedValue = transition.getCurrentState();
                    }
                    startRestartGroup.startReplaceGroup(-466616829);
                    ComposerKt.sourceInformation(startRestartGroup, "C742@39737L28:AnimatedVisibility.kt#xbi5r1");
                    if (ComposerKt.isTraceInProgress()) {
                        i5 = i9;
                    } else {
                        i5 = i9;
                        ComposerKt.traceEventStart(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                    }
                    int i12 = i4 & WebSocketProtocol.PAYLOAD_SHORT;
                    EnterExitState targetEnterExit = targetEnterExit(transition, function1, rememberedValue, startRestartGroup, i12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceGroup();
                    T targetState = transition.getTargetState();
                    startRestartGroup.startReplaceGroup(-466616829);
                    ComposerKt.sourceInformation(startRestartGroup, "C742@39737L28:AnimatedVisibility.kt#xbi5r1");
                    if (ComposerKt.isTraceInProgress()) {
                        enterExitState = targetEnterExit;
                    } else {
                        enterExitState = targetEnterExit;
                        ComposerKt.traceEventStart(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                    }
                    EnterExitState targetEnterExit2 = targetEnterExit(transition, function1, targetState, startRestartGroup, i12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceGroup();
                    i6 = i5;
                    createChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, enterExitState, targetEnterExit2, "EnterExitTransition", startRestartGroup, i11 | 3072);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i4 >> 15) & 14);
                    Boolean invoke = function2.invoke(createChildTransitionInternal.getCurrentState(), createChildTransitionInternal.getTargetState());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1581710007, "CC(remember):AnimatedVisibility.kt#9igjgp");
                    changed = startRestartGroup.changed(createChildTransitionInternal) | startRestartGroup.changed(rememberUpdatedState);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(createChildTransitionInternal, rememberUpdatedState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    State produceState = SnapshotStateKt.produceState(invoke, (Function2) rememberedValue2, startRestartGroup, 0);
                    if (getExitFinished(createChildTransitionInternal) || !AnimatedEnterExitImpl$lambda$4(produceState)) {
                        startRestartGroup.startReplaceGroup(1788869559);
                        ComposerKt.sourceInformation(startRestartGroup, "768@40570L69,773@40810L47,794@41913L50,769@40652L1325");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1581725581, "CC(remember):AnimatedVisibility.kt#9igjgp");
                        z2 = i6 != 4;
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new AnimatedVisibilityScopeImpl(createChildTransitionInternal);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i13 = i4 >> 6;
                        onLookaheadMeasured3 = onLookaheadMeasured2;
                        Modifier createModifier = EnterExitTransitionKt.createModifier(createChildTransitionInternal, enterTransition2, exitTransition2, null, "Built-in", startRestartGroup, (i13 & 112) | 24576 | (i13 & 896), 4);
                        composer2 = startRestartGroup;
                        if (onLookaheadMeasured3 == null) {
                            composer2.startReplaceGroup(1789227361);
                            ComposerKt.sourceInformation(composer2, "775@40967L849");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1581739065, "CC(remember):AnimatedVisibility.kt#9igjgp");
                            boolean z3 = (3670016 & i4) == 1048576 || ((i4 & 2097152) != 0 && composer2.changedInstance(onLookaheadMeasured3));
                            Object rememberedValue5 = composer2.rememberedValue();
                            if (z3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                        return m61invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                    }

                                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                    public final MeasureResult m61invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                                        final Placeable mo5152measureBRTryo0 = measurable.mo5152measureBRTryo0(j);
                                        OnLookaheadMeasured onLookaheadMeasured4 = OnLookaheadMeasured.this;
                                        if (measureScope.isLookingAhead()) {
                                            onLookaheadMeasured4.m92invokeozmzZPI(IntSizeKt.IntSize(mo5152measureBRTryo0.getWidth(), mo5152measureBRTryo0.getHeight()));
                                        }
                                        return MeasureScope.layout$default(measureScope, mo5152measureBRTryo0.getWidth(), mo5152measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1$1
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
                                composer2.updateRememberedValue(rememberedValue5);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            companion = LayoutModifierKt.layout(companion2, (Function3) rememberedValue5);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1581766416);
                            composer2.endReplaceGroup();
                            companion = Modifier.INSTANCE;
                        }
                        Modifier then = modifier.then(createModifier.then(companion));
                        ComposerKt.sourceInformationMarkerStart(composer2, 1581768538, "CC(remember):AnimatedVisibility.kt#9igjgp");
                        rememberedValue4 = composer2.rememberedValue();
                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = (AnimatedEnterExitMeasurePolicy) rememberedValue4;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, then);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        m3316constructorimpl = Updater.m3316constructorimpl(composer2);
                        Updater.m3323setimpl(m3316constructorimpl, animatedEnterExitMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, 254461613, "C770@40694L9:AnimatedVisibility.kt#xbi5r1");
                        function3.invoke(animatedVisibilityScopeImpl, composer2, Integer.valueOf((i4 >> 18) & 112));
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1790256282);
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                        onLookaheadMeasured3 = onLookaheadMeasured2;
                    }
                    composer2.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1790262234);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                    onLookaheadMeasured3 = onLookaheadMeasured2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final OnLookaheadMeasured onLookaheadMeasured4 = onLookaheadMeasured3;
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4
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
                        AnimatedVisibilityKt.AnimatedEnterExitImpl(transition, function1, modifier, enterTransition, exitTransition, function2, onLookaheadMeasured4, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= i8;
        if ((i2 & 128) == 0) {
        }
        i4 = i3;
        if ((4793491 & i4) == 4793490) {
        }
        if (i7 != 0) {
        }
        onLookaheadMeasured2 = onLookaheadMeasured3;
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!function1.invoke(transition.getTargetState()).booleanValue()) {
        }
        startRestartGroup.startReplaceGroup(1787977937);
        ComposerKt.sourceInformation(startRestartGroup, "741@39659L116,745@39818L40,752@40073L399,747@39898L574");
        int i92 = i4 & 14;
        int i102 = i92 | 48;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1215497572, "CC(createChildTransition)1813@74138L36,1814@74198L74,1815@74295L39,1816@74346L63:Transition.kt#pdpnli");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 272027253, "CC(remember):Transition.kt#9igjgp");
        int i112 = i102 & 14;
        if ((i112 ^ 6) <= 4) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = transition.getCurrentState();
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (transition.isSeeking()) {
        }
        startRestartGroup.startReplaceGroup(-466616829);
        ComposerKt.sourceInformation(startRestartGroup, "C742@39737L28:AnimatedVisibility.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
        }
        int i122 = i4 & WebSocketProtocol.PAYLOAD_SHORT;
        EnterExitState targetEnterExit3 = targetEnterExit(transition, function1, rememberedValue, startRestartGroup, i122);
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceGroup();
        T targetState2 = transition.getTargetState();
        startRestartGroup.startReplaceGroup(-466616829);
        ComposerKt.sourceInformation(startRestartGroup, "C742@39737L28:AnimatedVisibility.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
        }
        EnterExitState targetEnterExit22 = targetEnterExit(transition, function1, targetState2, startRestartGroup, i122);
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceGroup();
        i6 = i5;
        createChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, enterExitState, targetEnterExit22, "EnterExitTransition", startRestartGroup, i112 | 3072);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i4 >> 15) & 14);
        Boolean invoke2 = function2.invoke(createChildTransitionInternal.getCurrentState(), createChildTransitionInternal.getTargetState());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1581710007, "CC(remember):AnimatedVisibility.kt#9igjgp");
        changed = startRestartGroup.changed(createChildTransitionInternal) | startRestartGroup.changed(rememberUpdatedState2);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(createChildTransitionInternal, rememberUpdatedState2, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        State produceState2 = SnapshotStateKt.produceState(invoke2, (Function2) rememberedValue2, startRestartGroup, 0);
        if (getExitFinished(createChildTransitionInternal)) {
        }
        startRestartGroup.startReplaceGroup(1788869559);
        ComposerKt.sourceInformation(startRestartGroup, "768@40570L69,773@40810L47,794@41913L50,769@40652L1325");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1581725581, "CC(remember):AnimatedVisibility.kt#9igjgp");
        if (i6 != 4) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue3 = new AnimatedVisibilityScopeImpl(createChildTransitionInternal);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl2 = (AnimatedVisibilityScopeImpl) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i132 = i4 >> 6;
        onLookaheadMeasured3 = onLookaheadMeasured2;
        Modifier createModifier2 = EnterExitTransitionKt.createModifier(createChildTransitionInternal, enterTransition2, exitTransition2, null, "Built-in", startRestartGroup, (i132 & 112) | 24576 | (i132 & 896), 4);
        composer2 = startRestartGroup;
        if (onLookaheadMeasured3 == null) {
        }
        Modifier then2 = modifier.then(createModifier2.then(companion));
        ComposerKt.sourceInformationMarkerStart(composer2, 1581768538, "CC(remember):AnimatedVisibility.kt#9igjgp");
        rememberedValue4 = composer2.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy2 = (AnimatedEnterExitMeasurePolicy) rememberedValue4;
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, then2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m3316constructorimpl = Updater.m3316constructorimpl(composer2);
        Updater.m3323setimpl(m3316constructorimpl, animatedEnterExitMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3316constructorimpl.getInserting()) {
        }
        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m3323setimpl(m3316constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, 254461613, "C770@40694L9:AnimatedVisibility.kt#xbi5r1");
        function3.invoke(animatedVisibilityScopeImpl2, composer2, Integer.valueOf((i4 >> 18) & 112));
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceGroup();
        composer2.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getExitFinished(Transition<EnterExitState> transition) {
        return transition.getCurrentState() == EnterExitState.PostExit && transition.getTargetState() == EnterExitState.PostExit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> EnterExitState targetEnterExit(Transition<T> transition, Function1<? super T, Boolean> function1, T t, Composer composer, int i) {
        EnterExitState enterExitState;
        ComposerKt.sourceInformationMarkerStart(composer, 361571134, "C(targetEnterExit)P(1):AnimatedVisibility.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(361571134, i, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:855)");
        }
        composer.startMovableGroup(-902048200, transition);
        ComposerKt.sourceInformation(composer, "");
        if (transition.isSeeking()) {
            composer.startReplaceGroup(2101296683);
            composer.endReplaceGroup();
            if (function1.invoke(t).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        } else {
            composer.startReplaceGroup(2101530516);
            ComposerKt.sourceInformation(composer, "868@44365L34");
            ComposerKt.sourceInformationMarkerStart(composer, -902039492, "CC(remember):AnimatedVisibility.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                mutableState.setValue(true);
            }
            if (function1.invoke(t).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
            composer.endReplaceGroup();
        }
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return enterExitState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<EnterExitState, EnterExitState, Boolean> AnimatedEnterExitImpl$lambda$2(State<? extends Function2<? super EnterExitState, ? super EnterExitState, Boolean>> state) {
        return (Function2) state.getValue();
    }

    private static final boolean AnimatedEnterExitImpl$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
