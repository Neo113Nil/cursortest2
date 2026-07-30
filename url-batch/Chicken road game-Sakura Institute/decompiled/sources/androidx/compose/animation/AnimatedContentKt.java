package androidx.compose.animation;

import android.R;
import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a´\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0017\u001aP\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2>\b\u0002\u0010\u001c\u001a8\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0 0\u0014\u001a¬\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020!2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\"\u001a\u0015\u0010#\u001a\u00020\t*\u00020$2\u0006\u0010%\u001a\u00020&H\u0086\u0004\u001a\u0015\u0010'\u001a\u00020\t*\u00020$2\u0006\u0010%\u001a\u00020&H\u0087\u0004¨\u0006("}, d2 = {"AnimatedContent", "", "S", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "label", "", "contentKey", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "", "content", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SizeTransform", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "togetherWith", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "with", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(final S s, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, String str, Function1<? super S, ? extends Object> function12, final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function13;
        int i5;
        Alignment alignment2;
        int i6;
        String str2;
        int i7;
        Function1<? super S, ? extends Object> function14;
        final Alignment topStart;
        final String str3;
        final AnimatedContentKt$AnimatedContent$2 animatedContentKt$AnimatedContent$2;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2132720749);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedContent)P(5,4,6,1,3,2)141@7507L58,142@7581L136:AnimatedContent.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(s) : startRestartGroup.changedInstance(s) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function13 = function1;
                i3 |= startRestartGroup.changedInstance(function13) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    alignment2 = alignment;
                    i3 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            function14 = function12;
                            i3 |= startRestartGroup.changedInstance(function14) ? 131072 : 65536;
                            if ((i2 & 64) == 0) {
                                i3 |= 1572864;
                            } else if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changedInstance(function4) ? 1048576 : 524288;
                                if ((i3 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                                    Modifier.Companion companion = i8 != 0 ? Modifier.INSTANCE : modifier;
                                    if (i4 != 0) {
                                        function13 = new Function1<AnimatedContentTransitionScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final ContentTransform invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m74scaleInL8ZKhE$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                                            }
                                        };
                                    }
                                    topStart = i5 != 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                                    str3 = i6 != 0 ? "AnimatedContent" : str2;
                                    animatedContentKt$AnimatedContent$2 = i7 != 0 ? new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final S invoke(S s2) {
                                            return s2;
                                        }
                                    } : function14;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2132720749, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                    }
                                    Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
                                    int i9 = i3 & 8176;
                                    int i10 = i3 >> 3;
                                    AnimatedContent(updateTransition, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i9 | (57344 & i10) | (i10 & 458752), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = companion;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier2 = modifier;
                                    topStart = alignment2;
                                    str3 = str2;
                                    animatedContentKt$AnimatedContent$2 = function14;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final Modifier modifier3 = modifier2;
                                    final Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function15 = function13;
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
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
                                            AnimatedContentKt.AnimatedContent(s, modifier3, function15, topStart, str3, animatedContentKt$AnimatedContent$2, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if ((i3 & 599187) == 599186) {
                            }
                            if (i8 != 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Transition updateTransition2 = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            int i92 = i3 & 8176;
                            int i102 = i3 >> 3;
                            AnimatedContent(updateTransition2, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i92 | (57344 & i102) | (i102 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = companion;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        function14 = function12;
                        if ((i2 & 64) == 0) {
                        }
                        if ((i3 & 599187) == 599186) {
                        }
                        if (i8 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Transition updateTransition22 = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
                        int i922 = i3 & 8176;
                        int i1022 = i3 >> 3;
                        AnimatedContent(updateTransition22, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i922 | (57344 & i1022) | (i1022 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = companion;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    str2 = str;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    function14 = function12;
                    if ((i2 & 64) == 0) {
                    }
                    if ((i3 & 599187) == 599186) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Transition updateTransition222 = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i9222 = i3 & 8176;
                    int i10222 = i3 >> 3;
                    AnimatedContent(updateTransition222, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i9222 | (57344 & i10222) | (i10222 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                alignment2 = alignment;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function14 = function12;
                if ((i2 & 64) == 0) {
                }
                if ((i3 & 599187) == 599186) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Transition updateTransition2222 = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
                int i92222 = i3 & 8176;
                int i102222 = i3 >> 3;
                AnimatedContent(updateTransition2222, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i92222 | (57344 & i102222) | (i102222 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function13 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function14 = function12;
            if ((i2 & 64) == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Transition updateTransition22222 = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
            int i922222 = i3 & 8176;
            int i1022222 = i3 >> 3;
            AnimatedContent(updateTransition22222, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i922222 | (57344 & i1022222) | (i1022222 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function14 = function12;
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Transition updateTransition222222 = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
        int i9222222 = i3 & 8176;
        int i10222222 = i3 >> 3;
        AnimatedContent(updateTransition222222, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i9222222 | (57344 & i10222222) | (i10222222 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function2 = new Function2<IntSize, IntSize, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentKt$SizeTransform$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
                    return m37invokeTemP2vQ(intSize.getPackedValue(), intSize2.getPackedValue());
                }

                /* renamed from: invoke-TemP2vQ, reason: not valid java name */
                public final SpringSpec<IntSize> m37invokeTemP2vQ(long j, long j2) {
                    return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m6461boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
                }
            };
        }
        return SizeTransform(z, function2);
    }

    public static final SizeTransform SizeTransform(boolean z, Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> function2) {
        return new SizeTransformImpl(z, function2);
    }

    public static final ContentTransform togetherWith(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    @Deprecated(message = "Infix fun EnterTransition.with(ExitTransition) has been renamed to togetherWith", replaceWith = @ReplaceWith(expression = "togetherWith(exit)", imports = {}))
    public static final ContentTransform with(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0285 A[LOOP:2: B:141:0x0283->B:142:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0231 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(final Transition<S> transition, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, Function1<? super S, ? extends Object> function12, final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function13;
        int i5;
        Alignment alignment2;
        int i6;
        Function1<? super S, ? extends Object> function14;
        LayoutDirection layoutDirection;
        boolean z;
        Object rememberedValue;
        final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl;
        boolean z2;
        Object rememberedValue2;
        SnapshotStateList snapshotStateList;
        boolean z3;
        Object rememberedValue3;
        MutableScatterMap mutableScatterMap;
        int size;
        int i7;
        MutableScatterMap mutableScatterMap2;
        SnapshotStateList snapshotStateList2;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function15;
        Alignment alignment3;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3;
        boolean changed;
        ContentTransform rememberedValue4;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function16;
        Object rememberedValue5;
        int currentCompositeKeyHash;
        Composer m3333constructorimpl;
        int size2;
        int i8;
        final Alignment alignment4;
        final Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function17;
        final Function1<? super S, ? extends Object> function18;
        final Modifier modifier3;
        Iterator<T> it;
        int i9;
        int i10;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-114689412);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedContent)P(3,4,1,2)714@34537L7,715@34565L106,719@34759L51,720@34832L69,808@39387L58,809@39479L45,819@39798L52,810@39529L327:AnimatedContent.kt#xbi5r1");
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function13 = function1;
                i3 |= startRestartGroup.changedInstance(function13) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    alignment2 = alignment;
                    i3 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function14 = function12;
                        i3 |= startRestartGroup.changedInstance(function14) ? 16384 : 8192;
                        if ((i2 & 16) != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changedInstance(function4) ? 131072 : 65536;
                            if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function13 = new Function1<AnimatedContentTransitionScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final ContentTransform invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m74scaleInL8ZKhE$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                                        }
                                    };
                                }
                                if (i5 != 0) {
                                    alignment2 = Alignment.INSTANCE.getTopStart();
                                }
                                if (i6 != 0) {
                                    function14 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final S invoke(S s) {
                                            return s;
                                        }
                                    };
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-114689412, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:713)");
                                }
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                layoutDirection = (LayoutDirection) consume;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801903883, "CC(remember):AnimatedContent.kt#9igjgp");
                                int i12 = i3 & 14;
                                z = i12 != 4;
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801897730, "CC(remember):AnimatedContent.kt#9igjgp");
                                z2 = i12 != 4;
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                snapshotStateList = (SnapshotStateList) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801895376, "CC(remember):AnimatedContent.kt#9igjgp");
                                z3 = i12 != 4;
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = ScatterMapKt.mutableScatterMapOf();
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                mutableScatterMap = (MutableScatterMap) rememberedValue3;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (!snapshotStateList.contains(transition.getCurrentState())) {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(transition.getCurrentState());
                                }
                                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                                    if (snapshotStateList.size() != 1 || !Intrinsics.areEqual(snapshotStateList.get(0), transition.getCurrentState())) {
                                        snapshotStateList.clear();
                                        snapshotStateList.add(transition.getCurrentState());
                                    }
                                    if (mutableScatterMap.get_size() != 1 || mutableScatterMap.containsKey(transition.getCurrentState())) {
                                        mutableScatterMap.clear();
                                    }
                                    animatedContentTransitionScopeImpl.setContentAlignment(alignment2);
                                    animatedContentTransitionScopeImpl.setLayoutDirection$animation_release(layoutDirection);
                                }
                                if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState()) && !snapshotStateList.contains(transition.getTargetState())) {
                                    it = snapshotStateList.iterator();
                                    i9 = 0;
                                    while (true) {
                                        if (it.hasNext()) {
                                            i10 = -1;
                                            i9 = -1;
                                            break;
                                        } else {
                                            if (Intrinsics.areEqual(function14.invoke((Object) it.next()), function14.invoke(transition.getTargetState()))) {
                                                i10 = -1;
                                                break;
                                            }
                                            i9++;
                                        }
                                    }
                                    if (i9 != i10) {
                                        snapshotStateList.add(transition.getTargetState());
                                    } else {
                                        snapshotStateList.set(i9, transition.getTargetState());
                                    }
                                }
                                if (mutableScatterMap.containsKey(transition.getTargetState()) || !mutableScatterMap.containsKey(transition.getCurrentState())) {
                                    startRestartGroup.startReplaceGroup(912931457);
                                    ComposerKt.sourceInformation(startRestartGroup, "*756@36778L2565");
                                    mutableScatterMap.clear();
                                    SnapshotStateList snapshotStateList3 = snapshotStateList;
                                    size = snapshotStateList3.size();
                                    i7 = 0;
                                    while (i7 < size) {
                                        final T t = snapshotStateList3.get(i7);
                                        MutableScatterMap mutableScatterMap3 = mutableScatterMap;
                                        final SnapshotStateList snapshotStateList4 = snapshotStateList;
                                        final Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function19 = function13;
                                        mutableScatterMap3.set(t, ComposableLambdaKt.rememberComposableLambda(885640742, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
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

                                            /* JADX WARN: Multi-variable type inference failed */
                                            public final void invoke(Composer composer2, int i13) {
                                                ComposerKt.sourceInformation(composer2, "C757@36814L38,761@37028L323,768@37384L125,779@37953L328,775@37761L25,786@38417L233,791@38669L660,773@37692L1637:AnimatedContent.kt#xbi5r1");
                                                if ((i13 & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(885640742, i13, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:757)");
                                                }
                                                ComposerKt.sourceInformationMarkerStart(composer2, 1908224079, "CC(remember):AnimatedContent.kt#9igjgp");
                                                Function1<AnimatedContentTransitionScope<S>, ContentTransform> function110 = function19;
                                                Object obj = animatedContentTransitionScopeImpl;
                                                ContentTransform rememberedValue6 = composer2.rememberedValue();
                                                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue6 = function110.invoke(obj);
                                                    composer2.updateRememberedValue(rememberedValue6);
                                                }
                                                final ContentTransform contentTransform = (ContentTransform) rememberedValue6;
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                boolean areEqual = Intrinsics.areEqual(transition.getSegment().getTargetState(), t);
                                                ComposerKt.sourceInformationMarkerStart(composer2, 1908231212, "CC(remember):AnimatedContent.kt#9igjgp");
                                                boolean changed2 = composer2.changed(areEqual);
                                                Transition<S> transition2 = transition;
                                                S s = t;
                                                Function1<AnimatedContentTransitionScope<S>, ContentTransform> function111 = function19;
                                                Object obj2 = animatedContentTransitionScopeImpl;
                                                Object rememberedValue7 = composer2.rememberedValue();
                                                if (changed2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue7 = Intrinsics.areEqual(transition2.getSegment().getTargetState(), s) ? ExitTransition.INSTANCE.getNone() : function111.invoke(obj2).getInitialContentExit();
                                                    composer2.updateRememberedValue(rememberedValue7);
                                                }
                                                final ExitTransition exitTransition = (ExitTransition) rememberedValue7;
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerStart(composer2, 1908242406, "CC(remember):AnimatedContent.kt#9igjgp");
                                                S s2 = t;
                                                Transition<S> transition3 = transition;
                                                Object rememberedValue8 = composer2.rememberedValue();
                                                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue8 = new AnimatedContentTransitionScopeImpl.ChildData(Intrinsics.areEqual(s2, transition3.getTargetState()));
                                                    composer2.updateRememberedValue(rememberedValue8);
                                                }
                                                AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) rememberedValue8;
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composer2, 1908260817, "CC(remember):AnimatedContent.kt#9igjgp");
                                                boolean changedInstance = composer2.changedInstance(contentTransform);
                                                Object rememberedValue9 = composer2.rememberedValue();
                                                if (changedInstance || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue9 = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                                            return m36invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                                        }

                                                        /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                                        public final MeasureResult m36invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                                                            final Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(j);
                                                            int width = mo5175measureBRTryo0.getWidth();
                                                            int height = mo5175measureBRTryo0.getHeight();
                                                            final ContentTransform contentTransform2 = ContentTransform.this;
                                                            return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
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
                                                                    placementScope.place(Placeable.this, 0, 0, contentTransform2.getTargetContentZIndex());
                                                                }
                                                            }, 4, null);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(rememberedValue9);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                Modifier layout = LayoutModifierKt.layout(companion, (Function3) rememberedValue9);
                                                childData.setTarget(Intrinsics.areEqual(t, transition.getTargetState()));
                                                Modifier then = layout.then(childData);
                                                Transition<S> transition4 = transition;
                                                ComposerKt.sourceInformationMarkerStart(composer2, 1908254370, "CC(remember):AnimatedContent.kt#9igjgp");
                                                boolean changedInstance2 = composer2.changedInstance(t);
                                                final S s3 = t;
                                                Object rememberedValue10 = composer2.rememberedValue();
                                                if (changedInstance2 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue10 = (Function1) new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Boolean invoke(S s4) {
                                                            return Boolean.valueOf(Intrinsics.areEqual(s4, s3));
                                                        }

                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Boolean invoke(Object obj3) {
                                                            return invoke((AnimatedContentKt$AnimatedContent$6$1$3$1<S>) obj3);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(rememberedValue10);
                                                }
                                                Function1 function112 = (Function1) rememberedValue10;
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerStart(composer2, 1908275570, "CC(remember):AnimatedContent.kt#9igjgp");
                                                boolean changed3 = composer2.changed(exitTransition);
                                                Object rememberedValue11 = composer2.rememberedValue();
                                                if (changed3 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue11 = (Function2) new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                            return Boolean.valueOf(enterExitState == EnterExitState.PostExit && enterExitState2 == EnterExitState.PostExit && !ExitTransition.this.getData().getHold());
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(rememberedValue11);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                final SnapshotStateList<S> snapshotStateList5 = snapshotStateList4;
                                                final S s4 = t;
                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl;
                                                final Function4<AnimatedContentScope, S, Composer, Integer, Unit> function42 = function4;
                                                AnimatedVisibilityKt.AnimatedEnterExitImpl(transition4, function112, then, targetContentEnter, exitTransition, (Function2) rememberedValue11, null, ComposableLambdaKt.rememberComposableLambda(-616195562, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
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
                                                        ComposerKt.sourceInformation(composer3, "C793@38802L230,793@38779L253,*801@39194L43,802@39265L24:AnimatedContent.kt#xbi5r1");
                                                        if ((i14 & 6) == 0) {
                                                            i14 |= (i14 & 8) == 0 ? composer3.changed(animatedVisibilityScope) : composer3.changedInstance(animatedVisibilityScope) ? 4 : 2;
                                                        }
                                                        if ((i14 & 19) == 18 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-616195562, i14, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:793)");
                                                        }
                                                        ComposerKt.sourceInformationMarkerStart(composer3, 641996302, "CC(remember):AnimatedContent.kt#9igjgp");
                                                        boolean changed4 = composer3.changed(snapshotStateList5) | composer3.changedInstance(s4) | composer3.changedInstance(animatedContentTransitionScopeImpl4);
                                                        final SnapshotStateList<S> snapshotStateList6 = snapshotStateList5;
                                                        final S s5 = s4;
                                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl5 = animatedContentTransitionScopeImpl4;
                                                        Object rememberedValue12 = composer3.rememberedValue();
                                                        if (changed4 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue12 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                    final SnapshotStateList<S> snapshotStateList7 = snapshotStateList6;
                                                                    final S s6 = s5;
                                                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl6 = animatedContentTransitionScopeImpl5;
                                                                    return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1
                                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                                        public void dispose() {
                                                                            SnapshotStateList.this.remove(s6);
                                                                            animatedContentTransitionScopeImpl6.getTargetSizeMap$animation_release().remove(s6);
                                                                        }
                                                                    };
                                                                }
                                                            };
                                                            composer3.updateRememberedValue(rememberedValue12);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                                        EffectsKt.DisposableEffect(animatedVisibilityScope, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue12, composer3, i14 & 14);
                                                        MutableScatterMap targetSizeMap$animation_release = animatedContentTransitionScopeImpl4.getTargetSizeMap$animation_release();
                                                        S s6 = s4;
                                                        Intrinsics.checkNotNull(animatedVisibilityScope, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                        targetSizeMap$animation_release.set(s6, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).getTargetSize$animation_release());
                                                        ComposerKt.sourceInformationMarkerStart(composer3, 642008659, "CC(remember):AnimatedContent.kt#9igjgp");
                                                        Object rememberedValue13 = composer3.rememberedValue();
                                                        if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue13 = new AnimatedContentScopeImpl(animatedVisibilityScope);
                                                            composer3.updateRememberedValue(rememberedValue13);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                                        function42.invoke((AnimatedContentScopeImpl) rememberedValue13, s4, composer3, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer2, 54), composer2, 12582912, 64);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, startRestartGroup, 54));
                                        i7++;
                                        alignment2 = alignment2;
                                        mutableScatterMap = mutableScatterMap3;
                                        snapshotStateList = snapshotStateList4;
                                        size = size;
                                        function13 = function13;
                                    }
                                    mutableScatterMap2 = mutableScatterMap;
                                    snapshotStateList2 = snapshotStateList;
                                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                    function15 = function13;
                                    alignment3 = alignment2;
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(915535767);
                                    startRestartGroup.endReplaceGroup();
                                    mutableScatterMap2 = mutableScatterMap;
                                    snapshotStateList2 = snapshotStateList;
                                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                    function15 = function13;
                                    alignment3 = alignment2;
                                }
                                Transition.Segment<S> segment = transition.getSegment();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801749627, "CC(remember):AnimatedContent.kt#9igjgp");
                                animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl2;
                                changed = startRestartGroup.changed(segment) | startRestartGroup.changed(animatedContentTransitionScopeImpl3);
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    function16 = function15;
                                    rememberedValue4 = function16.invoke(animatedContentTransitionScopeImpl3);
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                } else {
                                    function16 = function15;
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Modifier then = modifier4.then(animatedContentTransitionScopeImpl3.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 0));
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801736481, "CC(remember):AnimatedContent.kt#9igjgp");
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl3);
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (AnimatedContentMeasurePolicy) rememberedValue5;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
                                Updater.m3340setimpl(m3333constructorimpl, animatedContentMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1023567688, "C:AnimatedContent.kt#xbi5r1");
                                startRestartGroup.startReplaceGroup(-1491001814);
                                ComposerKt.sourceInformation(startRestartGroup, "");
                                SnapshotStateList snapshotStateList5 = snapshotStateList2;
                                size2 = snapshotStateList5.size();
                                for (i8 = 0; i8 < size2; i8++) {
                                    R.anim animVar = (Object) snapshotStateList5.get(i8);
                                    startRestartGroup.startMovableGroup(1908315325, function14.invoke(animVar));
                                    ComposerKt.sourceInformation(startRestartGroup, "");
                                    Function2 function2 = (Function2) mutableScatterMap2.get(animVar);
                                    if (function2 == null) {
                                        startRestartGroup.startReplaceGroup(-971711888);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        startRestartGroup.startReplaceGroup(1908317105);
                                        ComposerKt.sourceInformation(startRestartGroup, "815@39722L8");
                                        function2.invoke(startRestartGroup, 0);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    startRestartGroup.endMovableGroup();
                                }
                                startRestartGroup.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                alignment4 = alignment3;
                                function17 = function16;
                                function18 = function14;
                                modifier3 = modifier4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                function17 = function13;
                                alignment4 = alignment2;
                                function18 = function14;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
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
                                        AnimatedContentKt.AnimatedContent(transition, modifier3, function17, alignment4, function18, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((74899 & i3) == 74898) {
                        }
                        if (i11 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localLayoutDirection2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        layoutDirection = (LayoutDirection) consume2;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801903883, "CC(remember):AnimatedContent.kt#9igjgp");
                        int i122 = i3 & 14;
                        if (i122 != 4) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z) {
                        }
                        rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801897730, "CC(remember):AnimatedContent.kt#9igjgp");
                        if (i122 != 4) {
                        }
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z2) {
                        }
                        rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        snapshotStateList = (SnapshotStateList) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801895376, "CC(remember):AnimatedContent.kt#9igjgp");
                        if (i122 != 4) {
                        }
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!z3) {
                        }
                        rememberedValue3 = ScatterMapKt.mutableScatterMapOf();
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        mutableScatterMap = (MutableScatterMap) rememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (!snapshotStateList.contains(transition.getCurrentState())) {
                        }
                        if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                        }
                        if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                            it = snapshotStateList.iterator();
                            i9 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                }
                                i9++;
                            }
                            if (i9 != i10) {
                            }
                        }
                        if (mutableScatterMap.containsKey(transition.getTargetState())) {
                        }
                        startRestartGroup.startReplaceGroup(912931457);
                        ComposerKt.sourceInformation(startRestartGroup, "*756@36778L2565");
                        mutableScatterMap.clear();
                        SnapshotStateList snapshotStateList32 = snapshotStateList;
                        size = snapshotStateList32.size();
                        i7 = 0;
                        while (i7 < size) {
                        }
                        mutableScatterMap2 = mutableScatterMap;
                        snapshotStateList2 = snapshotStateList;
                        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                        function15 = function13;
                        alignment3 = alignment2;
                        startRestartGroup.endReplaceGroup();
                        Transition.Segment<S> segment2 = transition.getSegment();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801749627, "CC(remember):AnimatedContent.kt#9igjgp");
                        animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl2;
                        changed = startRestartGroup.changed(segment2) | startRestartGroup.changed(animatedContentTransitionScopeImpl3);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (changed) {
                        }
                        function16 = function15;
                        rememberedValue4 = function16.invoke(animatedContentTransitionScopeImpl3);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier then2 = modifier4.then(animatedContentTransitionScopeImpl3.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 0));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801736481, "CC(remember):AnimatedContent.kt#9igjgp");
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        }
                        AnimatedContentMeasurePolicy animatedContentMeasurePolicy2 = (AnimatedContentMeasurePolicy) rememberedValue5;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                        Updater.m3340setimpl(m3333constructorimpl, animatedContentMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3333constructorimpl.getInserting()) {
                        }
                        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                        Updater.m3340setimpl(m3333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1023567688, "C:AnimatedContent.kt#xbi5r1");
                        startRestartGroup.startReplaceGroup(-1491001814);
                        ComposerKt.sourceInformation(startRestartGroup, "");
                        SnapshotStateList snapshotStateList52 = snapshotStateList2;
                        size2 = snapshotStateList52.size();
                        while (i8 < size2) {
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        alignment4 = alignment3;
                        function17 = function16;
                        function18 = function14;
                        modifier3 = modifier4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function14 = function12;
                    if ((i2 & 16) != 0) {
                    }
                    if ((74899 & i3) == 74898) {
                    }
                    if (i11 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(localLayoutDirection22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    layoutDirection = (LayoutDirection) consume22;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801903883, "CC(remember):AnimatedContent.kt#9igjgp");
                    int i1222 = i3 & 14;
                    if (i1222 != 4) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801897730, "CC(remember):AnimatedContent.kt#9igjgp");
                    if (i1222 != 4) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z2) {
                    }
                    rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    snapshotStateList = (SnapshotStateList) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801895376, "CC(remember):AnimatedContent.kt#9igjgp");
                    if (i1222 != 4) {
                    }
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!z3) {
                    }
                    rememberedValue3 = ScatterMapKt.mutableScatterMapOf();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    mutableScatterMap = (MutableScatterMap) rememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (!snapshotStateList.contains(transition.getCurrentState())) {
                    }
                    if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    }
                    if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    }
                    if (mutableScatterMap.containsKey(transition.getTargetState())) {
                    }
                    startRestartGroup.startReplaceGroup(912931457);
                    ComposerKt.sourceInformation(startRestartGroup, "*756@36778L2565");
                    mutableScatterMap.clear();
                    SnapshotStateList snapshotStateList322 = snapshotStateList;
                    size = snapshotStateList322.size();
                    i7 = 0;
                    while (i7 < size) {
                    }
                    mutableScatterMap2 = mutableScatterMap;
                    snapshotStateList2 = snapshotStateList;
                    animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                    function15 = function13;
                    alignment3 = alignment2;
                    startRestartGroup.endReplaceGroup();
                    Transition.Segment<S> segment22 = transition.getSegment();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801749627, "CC(remember):AnimatedContent.kt#9igjgp");
                    animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl2;
                    changed = startRestartGroup.changed(segment22) | startRestartGroup.changed(animatedContentTransitionScopeImpl3);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    function16 = function15;
                    rememberedValue4 = function16.invoke(animatedContentTransitionScopeImpl3);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier then22 = modifier4.then(animatedContentTransitionScopeImpl3.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 0));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801736481, "CC(remember):AnimatedContent.kt#9igjgp");
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    }
                    AnimatedContentMeasurePolicy animatedContentMeasurePolicy22 = (AnimatedContentMeasurePolicy) rememberedValue5;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                    Updater.m3340setimpl(m3333constructorimpl, animatedContentMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3333constructorimpl.getInserting()) {
                    }
                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                    Updater.m3340setimpl(m3333constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1023567688, "C:AnimatedContent.kt#xbi5r1");
                    startRestartGroup.startReplaceGroup(-1491001814);
                    ComposerKt.sourceInformation(startRestartGroup, "");
                    SnapshotStateList snapshotStateList522 = snapshotStateList2;
                    size2 = snapshotStateList522.size();
                    while (i8 < size2) {
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    alignment4 = alignment3;
                    function17 = function16;
                    function18 = function14;
                    modifier3 = modifier4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                alignment2 = alignment;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                function14 = function12;
                if ((i2 & 16) != 0) {
                }
                if ((74899 & i3) == 74898) {
                }
                if (i11 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(localLayoutDirection222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                layoutDirection = (LayoutDirection) consume222;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801903883, "CC(remember):AnimatedContent.kt#9igjgp");
                int i12222 = i3 & 14;
                if (i12222 != 4) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                startRestartGroup.updateRememberedValue(rememberedValue);
                animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801897730, "CC(remember):AnimatedContent.kt#9igjgp");
                if (i12222 != 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                startRestartGroup.updateRememberedValue(rememberedValue2);
                snapshotStateList = (SnapshotStateList) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801895376, "CC(remember):AnimatedContent.kt#9igjgp");
                if (i12222 != 4) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                rememberedValue3 = ScatterMapKt.mutableScatterMapOf();
                startRestartGroup.updateRememberedValue(rememberedValue3);
                mutableScatterMap = (MutableScatterMap) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (!snapshotStateList.contains(transition.getCurrentState())) {
                }
                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                }
                if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                }
                if (mutableScatterMap.containsKey(transition.getTargetState())) {
                }
                startRestartGroup.startReplaceGroup(912931457);
                ComposerKt.sourceInformation(startRestartGroup, "*756@36778L2565");
                mutableScatterMap.clear();
                SnapshotStateList snapshotStateList3222 = snapshotStateList;
                size = snapshotStateList3222.size();
                i7 = 0;
                while (i7 < size) {
                }
                mutableScatterMap2 = mutableScatterMap;
                snapshotStateList2 = snapshotStateList;
                animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                function15 = function13;
                alignment3 = alignment2;
                startRestartGroup.endReplaceGroup();
                Transition.Segment<S> segment222 = transition.getSegment();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801749627, "CC(remember):AnimatedContent.kt#9igjgp");
                animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl2;
                changed = startRestartGroup.changed(segment222) | startRestartGroup.changed(animatedContentTransitionScopeImpl3);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                function16 = function15;
                rememberedValue4 = function16.invoke(animatedContentTransitionScopeImpl3);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier then222 = modifier4.then(animatedContentTransitionScopeImpl3.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 0));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801736481, "CC(remember):AnimatedContent.kt#9igjgp");
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                }
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy222 = (AnimatedContentMeasurePolicy) rememberedValue5;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, then222);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
                Updater.m3340setimpl(m3333constructorimpl, animatedContentMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3333constructorimpl.getInserting()) {
                }
                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                Updater.m3340setimpl(m3333constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1023567688, "C:AnimatedContent.kt#xbi5r1");
                startRestartGroup.startReplaceGroup(-1491001814);
                ComposerKt.sourceInformation(startRestartGroup, "");
                SnapshotStateList snapshotStateList5222 = snapshotStateList2;
                size2 = snapshotStateList5222.size();
                while (i8 < size2) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                alignment4 = alignment3;
                function17 = function16;
                function18 = function14;
                modifier3 = modifier4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function13 = function1;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            function14 = function12;
            if ((i2 & 16) != 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            if (i11 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2222 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(localLayoutDirection2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            layoutDirection = (LayoutDirection) consume2222;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801903883, "CC(remember):AnimatedContent.kt#9igjgp");
            int i122222 = i3 & 14;
            if (i122222 != 4) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
            startRestartGroup.updateRememberedValue(rememberedValue);
            animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801897730, "CC(remember):AnimatedContent.kt#9igjgp");
            if (i122222 != 4) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
            startRestartGroup.updateRememberedValue(rememberedValue2);
            snapshotStateList = (SnapshotStateList) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801895376, "CC(remember):AnimatedContent.kt#9igjgp");
            if (i122222 != 4) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue3 = ScatterMapKt.mutableScatterMapOf();
            startRestartGroup.updateRememberedValue(rememberedValue3);
            mutableScatterMap = (MutableScatterMap) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (!snapshotStateList.contains(transition.getCurrentState())) {
            }
            if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
            }
            if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
            }
            if (mutableScatterMap.containsKey(transition.getTargetState())) {
            }
            startRestartGroup.startReplaceGroup(912931457);
            ComposerKt.sourceInformation(startRestartGroup, "*756@36778L2565");
            mutableScatterMap.clear();
            SnapshotStateList snapshotStateList32222 = snapshotStateList;
            size = snapshotStateList32222.size();
            i7 = 0;
            while (i7 < size) {
            }
            mutableScatterMap2 = mutableScatterMap;
            snapshotStateList2 = snapshotStateList;
            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
            function15 = function13;
            alignment3 = alignment2;
            startRestartGroup.endReplaceGroup();
            Transition.Segment<S> segment2222 = transition.getSegment();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801749627, "CC(remember):AnimatedContent.kt#9igjgp");
            animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl2;
            changed = startRestartGroup.changed(segment2222) | startRestartGroup.changed(animatedContentTransitionScopeImpl3);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            function16 = function15;
            rememberedValue4 = function16.invoke(animatedContentTransitionScopeImpl3);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier then2222 = modifier4.then(animatedContentTransitionScopeImpl3.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 0));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801736481, "CC(remember):AnimatedContent.kt#9igjgp");
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            AnimatedContentMeasurePolicy animatedContentMeasurePolicy2222 = (AnimatedContentMeasurePolicy) rememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, then2222);
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
            Updater.m3340setimpl(m3333constructorimpl, animatedContentMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3333constructorimpl.getInserting()) {
            }
            m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1023567688, "C:AnimatedContent.kt#xbi5r1");
            startRestartGroup.startReplaceGroup(-1491001814);
            ComposerKt.sourceInformation(startRestartGroup, "");
            SnapshotStateList snapshotStateList52222 = snapshotStateList2;
            size2 = snapshotStateList52222.size();
            while (i8 < size2) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            alignment4 = alignment3;
            function17 = function16;
            function18 = function14;
            modifier3 = modifier4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        function14 = function12;
        if ((i2 & 16) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        if (i11 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(localLayoutDirection22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        layoutDirection = (LayoutDirection) consume22222;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801903883, "CC(remember):AnimatedContent.kt#9igjgp");
        int i1222222 = i3 & 14;
        if (i1222222 != 4) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
        startRestartGroup.updateRememberedValue(rememberedValue);
        animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801897730, "CC(remember):AnimatedContent.kt#9igjgp");
        if (i1222222 != 4) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
        startRestartGroup.updateRememberedValue(rememberedValue2);
        snapshotStateList = (SnapshotStateList) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801895376, "CC(remember):AnimatedContent.kt#9igjgp");
        if (i1222222 != 4) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue3 = ScatterMapKt.mutableScatterMapOf();
        startRestartGroup.updateRememberedValue(rememberedValue3);
        mutableScatterMap = (MutableScatterMap) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (!snapshotStateList.contains(transition.getCurrentState())) {
        }
        if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
        }
        if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
        }
        if (mutableScatterMap.containsKey(transition.getTargetState())) {
        }
        startRestartGroup.startReplaceGroup(912931457);
        ComposerKt.sourceInformation(startRestartGroup, "*756@36778L2565");
        mutableScatterMap.clear();
        SnapshotStateList snapshotStateList322222 = snapshotStateList;
        size = snapshotStateList322222.size();
        i7 = 0;
        while (i7 < size) {
        }
        mutableScatterMap2 = mutableScatterMap;
        snapshotStateList2 = snapshotStateList;
        animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
        function15 = function13;
        alignment3 = alignment2;
        startRestartGroup.endReplaceGroup();
        Transition.Segment<S> segment22222 = transition.getSegment();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801749627, "CC(remember):AnimatedContent.kt#9igjgp");
        animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl2;
        changed = startRestartGroup.changed(segment22222) | startRestartGroup.changed(animatedContentTransitionScopeImpl3);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        function16 = function15;
        rememberedValue4 = function16.invoke(animatedContentTransitionScopeImpl3);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier then22222 = modifier4.then(animatedContentTransitionScopeImpl3.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 0));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801736481, "CC(remember):AnimatedContent.kt#9igjgp");
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        AnimatedContentMeasurePolicy animatedContentMeasurePolicy22222 = (AnimatedContentMeasurePolicy) rememberedValue5;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, then22222);
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3333constructorimpl = Updater.m3333constructorimpl(startRestartGroup);
        Updater.m3340setimpl(m3333constructorimpl, animatedContentMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3333constructorimpl.getInserting()) {
        }
        m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
        Updater.m3340setimpl(m3333constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1023567688, "C:AnimatedContent.kt#xbi5r1");
        startRestartGroup.startReplaceGroup(-1491001814);
        ComposerKt.sourceInformation(startRestartGroup, "");
        SnapshotStateList snapshotStateList522222 = snapshotStateList2;
        size2 = snapshotStateList522222.size();
        while (i8 < size2) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        alignment4 = alignment3;
        function17 = function16;
        function18 = function14;
        modifier3 = modifier4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
