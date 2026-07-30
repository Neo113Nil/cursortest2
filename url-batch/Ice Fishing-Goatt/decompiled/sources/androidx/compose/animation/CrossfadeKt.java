package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.core.view.PointerIconCompat;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Crossfade.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aN\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001aX\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00140\n2&\u0010\t\u001a\"\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\u0010\u0010\u0017\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002X\u008a\u0084\u0002"}, d2 = {"Crossfade", "", "T", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "label", "", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "contentKey", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animation_release", "alpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CrossfadeKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void Crossfade(final T t, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, String str, final Function3<? super T, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        FiniteAnimationSpec<Float> finiteAnimationSpec2;
        int i5;
        String str2;
        Function3<? super T, ? super Composer, ? super Integer, Unit> function32;
        final Modifier modifier3;
        final FiniteAnimationSpec<Float> finiteAnimationSpec3;
        final String str3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-310686752);
        ComposerKt.sourceInformation(startRestartGroup, "C(Crossfade)P(4,3!1,2)56@2327L36,57@2379L53:Crossfade.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(t) : startRestartGroup.changedInstance(t) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                finiteAnimationSpec2 = finiteAnimationSpec;
                i3 |= startRestartGroup.changedInstance(finiteAnimationSpec2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str2 = str;
                    i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                        function32 = function3;
                    } else {
                        function32 = function3;
                        if ((i & 24576) == 0) {
                            i3 |= startRestartGroup.changedInstance(function32) ? 16384 : 8192;
                        }
                    }
                    if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        TweenSpec tween$default = i4 == 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : finiteAnimationSpec2;
                        String str4 = i5 == 0 ? "Crossfade" : str2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-310686752, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:55)");
                        }
                        Modifier modifier4 = companion;
                        FiniteAnimationSpec<Float> finiteAnimationSpec4 = tween$default;
                        Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str4, startRestartGroup, (i3 & 14) | ((i3 >> 6) & 112), 0), modifier4, finiteAnimationSpec4, (Function1) null, function32, startRestartGroup, i3 & 58352, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        finiteAnimationSpec3 = finiteAnimationSpec4;
                        str3 = str4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        finiteAnimationSpec3 = finiteAnimationSpec2;
                        str3 = str2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
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
                                CrossfadeKt.Crossfade(t, modifier3, finiteAnimationSpec3, str3, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                str2 = str;
                if ((i2 & 16) == 0) {
                }
                if ((i3 & 9363) == 9362) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier42 = companion;
                FiniteAnimationSpec<Float> finiteAnimationSpec42 = tween$default;
                Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str4, startRestartGroup, (i3 & 14) | ((i3 >> 6) & 112), 0), modifier42, finiteAnimationSpec42, (Function1) null, function32, startRestartGroup, i3 & 58352, 4);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
                finiteAnimationSpec3 = finiteAnimationSpec42;
                str3 = str4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            finiteAnimationSpec2 = finiteAnimationSpec;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str2 = str;
            if ((i2 & 16) == 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            if (i6 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier422 = companion;
            FiniteAnimationSpec<Float> finiteAnimationSpec422 = tween$default;
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str4, startRestartGroup, (i3 & 14) | ((i3 >> 6) & 112), 0), modifier422, finiteAnimationSpec422, (Function1) null, function32, startRestartGroup, i3 & 58352, 4);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier422;
            finiteAnimationSpec3 = finiteAnimationSpec422;
            str3 = str4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        finiteAnimationSpec2 = finiteAnimationSpec;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str2 = str;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        if (i6 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier4222 = companion;
        FiniteAnimationSpec<Float> finiteAnimationSpec4222 = tween$default;
        Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(t, str4, startRestartGroup, (i3 & 14) | ((i3 >> 6) & 112), 0), modifier4222, finiteAnimationSpec4222, (Function1) null, function32, startRestartGroup, i3 & 58352, 4);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4222;
        finiteAnimationSpec3 = finiteAnimationSpec4222;
        str3 = str4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Crossfade API now has a new label parameter added.")
    public static final /* synthetic */ void Crossfade(final Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function3 function3, Composer composer, final int i, final int i2) {
        int i3;
        final Function3 function32;
        final Modifier modifier2;
        final FiniteAnimationSpec finiteAnimationSpec2;
        Composer startRestartGroup = composer.startRestartGroup(523603005);
        ComposerKt.sourceInformation(startRestartGroup, "C(Crossfade)P(3,2)72@2790L29,73@2835L53:Crossfade.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(obj) : startRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(finiteAnimationSpec) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i5 != 0) {
                finiteAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            }
            FiniteAnimationSpec finiteAnimationSpec3 = finiteAnimationSpec;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523603005, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:71)");
            }
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(obj, (String) null, startRestartGroup, i3 & 14, 2), modifier3, (FiniteAnimationSpec<Float>) finiteAnimationSpec3, (Function1) null, function3, startRestartGroup, (i3 & PointerIconCompat.TYPE_TEXT) | ((i3 << 3) & 57344), 4);
            function32 = function3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            finiteAnimationSpec2 = finiteAnimationSpec3;
        } else {
            startRestartGroup.skipToGroupEnd();
            function32 = function3;
            finiteAnimationSpec2 = finiteAnimationSpec;
            modifier2 = modifier;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$2
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

                public final void invoke(Composer composer2, int i6) {
                    CrossfadeKt.Crossfade(obj, modifier2, finiteAnimationSpec2, function32, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void Crossfade(final Transition<T> transition, Modifier modifier, FiniteAnimationSpec<Float> finiteAnimationSpec, Function1<? super T, ? extends Object> function1, final Function3<? super T, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        FiniteAnimationSpec<Float> finiteAnimationSpec2;
        int i5;
        Function1<? super T, ? extends Object> function12;
        Object rememberedValue;
        Object rememberedValue2;
        MutableScatterMap mutableScatterMap;
        SnapshotStateList snapshotStateList;
        int currentCompositeKeyHash;
        Composer m3316constructorimpl;
        int size;
        int i6;
        final FiniteAnimationSpec<Float> finiteAnimationSpec3;
        final Function1<? super T, ? extends Object> function13;
        ScopeUpdateScope endRestartGroup;
        final Transition<T> transition2 = transition;
        Composer startRestartGroup = composer.startRestartGroup(679005231);
        ComposerKt.sourceInformation(startRestartGroup, "C(Crossfade)P(3!1,2)104@4422L64,105@4508L61,137@5785L159:Crossfade.kt#xbi5r1");
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(transition2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                finiteAnimationSpec2 = finiteAnimationSpec;
                i3 |= startRestartGroup.changedInstance(finiteAnimationSpec2) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    if ((i2 & 8) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        TweenSpec tween$default = i4 == 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : finiteAnimationSpec2;
                        CrossfadeKt$Crossfade$3 crossfadeKt$Crossfade$3 = i5 == 0 ? new Function1<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                            @Override // kotlin.jvm.functions.Function1
                            public final T invoke(T t) {
                                return t;
                            }
                        } : function12;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(679005231, i3, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:103)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1274683025, "CC(remember):Crossfade.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        Object obj = rememberedValue;
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            SnapshotStateList mutableStateListOf = SnapshotStateKt.mutableStateListOf();
                            mutableStateListOf.add(transition2.getCurrentState());
                            startRestartGroup.updateRememberedValue(mutableStateListOf);
                            obj = mutableStateListOf;
                        }
                        SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1274685774, "CC(remember):Crossfade.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = ScatterMapKt.mutableScatterMapOf();
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        mutableScatterMap = (MutableScatterMap) rememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (!Intrinsics.areEqual(transition2.getCurrentState(), transition2.getTargetState())) {
                            startRestartGroup.startReplaceGroup(860660313);
                            ComposerKt.sourceInformation(startRestartGroup, "");
                            if (snapshotStateList2.size() != 1 || !Intrinsics.areEqual(snapshotStateList2.get(0), transition2.getTargetState())) {
                                startRestartGroup.startReplaceGroup(860794667);
                                ComposerKt.sourceInformation(startRestartGroup, "110@4883L21");
                                SnapshotStateList snapshotStateList3 = snapshotStateList2;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1274697734, "CC(remember):Crossfade.kt#9igjgp");
                                boolean z = (i3 & 14) == 4;
                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (z || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (Function1) new Function1<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Boolean invoke(T t) {
                                            return Boolean.valueOf(!Intrinsics.areEqual(t, transition2.getTargetState()));
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                                            return invoke((CrossfadeKt$Crossfade$4$1<T>) obj2);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                CollectionsKt.removeAll((List) snapshotStateList3, (Function1) rememberedValue3);
                                mutableScatterMap.clear();
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(860984945);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(860990897);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (mutableScatterMap.contains(transition2.getTargetState())) {
                            startRestartGroup.startReplaceGroup(861052122);
                            ComposerKt.sourceInformation(startRestartGroup, "*126@5458L305");
                            SnapshotStateList snapshotStateList4 = snapshotStateList2;
                            Iterator<T> it = snapshotStateList4.iterator();
                            int i8 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i8 = -1;
                                    break;
                                } else if (Intrinsics.areEqual(crossfadeKt$Crossfade$3.invoke(it.next()), crossfadeKt$Crossfade$3.invoke(transition2.getTargetState()))) {
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                            if (i8 == -1) {
                                snapshotStateList2.add(transition2.getTargetState());
                            } else {
                                snapshotStateList2.set(i8, transition2.getTargetState());
                            }
                            mutableScatterMap.clear();
                            int size2 = snapshotStateList4.size();
                            int i9 = 0;
                            while (i9 < size2) {
                                T t = snapshotStateList4.get(i9);
                                mutableScatterMap.set(t, ComposableLambdaKt.rememberComposableLambda(-1426421288, true, new CrossfadeKt$Crossfade$5$1(transition2, tween$default, t, function3), startRestartGroup, 54));
                                i9++;
                                transition2 = transition;
                                snapshotStateList2 = snapshotStateList2;
                            }
                            snapshotStateList = snapshotStateList2;
                            startRestartGroup.endReplaceGroup();
                        } else {
                            snapshotStateList = snapshotStateList2;
                            startRestartGroup.startReplaceGroup(861812273);
                            startRestartGroup.endReplaceGroup();
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
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
                        m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                        Updater.m3323setimpl(m3316constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1517004430, "C:Crossfade.kt#xbi5r1");
                        startRestartGroup.startReplaceGroup(-187482432);
                        ComposerKt.sourceInformation(startRestartGroup, "");
                        SnapshotStateList snapshotStateList5 = snapshotStateList;
                        size = snapshotStateList5.size();
                        for (i6 = 0; i6 < size; i6++) {
                            T t2 = snapshotStateList5.get(i6);
                            startRestartGroup.startMovableGroup(-1081873445, crossfadeKt$Crossfade$3.invoke(t2));
                            ComposerKt.sourceInformation(startRestartGroup, "");
                            Function2 function2 = (Function2) mutableScatterMap.get(t2);
                            if (function2 == null) {
                                startRestartGroup.startReplaceGroup(821713034);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-1081871785);
                                ComposerKt.sourceInformation(startRestartGroup, "140@5906L8");
                                function2.invoke(startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endMovableGroup();
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        finiteAnimationSpec3 = tween$default;
                        function13 = crossfadeKt$Crossfade$3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        finiteAnimationSpec3 = finiteAnimationSpec2;
                        function13 = function12;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
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
                                CrossfadeKt.Crossfade(transition, modifier3, finiteAnimationSpec3, function13, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                function12 = function1;
                if ((i2 & 8) == 0) {
                }
                if ((i3 & 9363) == 9362) {
                }
                if (i7 != 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1274683025, "CC(remember):Crossfade.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                Object obj2 = rememberedValue;
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                SnapshotStateList snapshotStateList22 = (SnapshotStateList) obj2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1274685774, "CC(remember):Crossfade.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                mutableScatterMap = (MutableScatterMap) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (!Intrinsics.areEqual(transition2.getCurrentState(), transition2.getTargetState())) {
                }
                if (mutableScatterMap.contains(transition2.getTargetState())) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
                Updater.m3323setimpl(m3316constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3316constructorimpl.getInserting()) {
                }
                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                Updater.m3323setimpl(m3316constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1517004430, "C:Crossfade.kt#xbi5r1");
                startRestartGroup.startReplaceGroup(-187482432);
                ComposerKt.sourceInformation(startRestartGroup, "");
                SnapshotStateList snapshotStateList52 = snapshotStateList;
                size = snapshotStateList52.size();
                while (i6 < size) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                finiteAnimationSpec3 = tween$default;
                function13 = crossfadeKt$Crossfade$3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            finiteAnimationSpec2 = finiteAnimationSpec;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            function12 = function1;
            if ((i2 & 8) == 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            if (i7 != 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1274683025, "CC(remember):Crossfade.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            Object obj22 = rememberedValue;
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            SnapshotStateList snapshotStateList222 = (SnapshotStateList) obj22;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1274685774, "CC(remember):Crossfade.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            mutableScatterMap = (MutableScatterMap) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (!Intrinsics.areEqual(transition2.getCurrentState(), transition2.getTargetState())) {
            }
            if (mutableScatterMap.contains(transition2.getTargetState())) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
            Updater.m3323setimpl(m3316constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3316constructorimpl.getInserting()) {
            }
            m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            Updater.m3323setimpl(m3316constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1517004430, "C:Crossfade.kt#xbi5r1");
            startRestartGroup.startReplaceGroup(-187482432);
            ComposerKt.sourceInformation(startRestartGroup, "");
            SnapshotStateList snapshotStateList522 = snapshotStateList;
            size = snapshotStateList522.size();
            while (i6 < size) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            finiteAnimationSpec3 = tween$default;
            function13 = crossfadeKt$Crossfade$3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        finiteAnimationSpec2 = finiteAnimationSpec;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        function12 = function1;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        if (i7 != 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1274683025, "CC(remember):Crossfade.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        Object obj222 = rememberedValue;
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        SnapshotStateList snapshotStateList2222 = (SnapshotStateList) obj222;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1274685774, "CC(remember):Crossfade.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        mutableScatterMap = (MutableScatterMap) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (!Intrinsics.areEqual(transition2.getCurrentState(), transition2.getTargetState())) {
        }
        if (mutableScatterMap.contains(transition2.getTargetState())) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
        Updater.m3323setimpl(m3316constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3316constructorimpl.getInserting()) {
        }
        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        Updater.m3323setimpl(m3316constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1517004430, "C:Crossfade.kt#xbi5r1");
        startRestartGroup.startReplaceGroup(-187482432);
        ComposerKt.sourceInformation(startRestartGroup, "");
        SnapshotStateList snapshotStateList5222 = snapshotStateList;
        size = snapshotStateList5222.size();
        while (i6 < size) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        finiteAnimationSpec3 = tween$default;
        function13 = crossfadeKt$Crossfade$3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
