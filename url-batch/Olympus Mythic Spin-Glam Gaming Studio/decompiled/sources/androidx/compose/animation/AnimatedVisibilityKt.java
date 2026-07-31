package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnimatedVisibility.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\\\u0010\u000f\u001a\u00020\f*\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0012\u001a\\\u0010\u000f\u001a\u00020\f*\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0014\u001a^\u0010\u000f\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0017\u001ab\u0010\u000f\u001a\u00020\f*\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0018\u001ab\u0010\u000f\u001a\u00020\f*\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0019\u001aj\u0010\u000f\u001a\u00020\f\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u001c\u001aL\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00002\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u001e¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u001f\u001ah\u0010!\u001a\u00020\f\"\u0004\b\u0000\u0010\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0003¢\u0006\u0004\b!\u0010\"\u001a;\u0010%\u001a\u00020$\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010#\u001a\u00028\u0000H\u0003¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"", VastAttributes.VISIBLE, "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/EnterTransition;", "enter", "Landroidx/compose/animation/ExitTransition;", "exit", "", "label", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "", "Landroidx/compose/runtime/Composable;", "content", "AnimatedVisibility", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/MutableTransitionState;", "visibleState", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "T", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "initiallyVisible", "Lkotlin/Function0;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "transition", "AnimatedEnterExitImpl", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "targetState", "Landroidx/compose/animation/EnterExitState;", "targetEnterExit", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AnimatedVisibilityKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(2088733774);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                        if ((i2 & 32) == 0) {
                            i7 = (i & 458752) == 0 ? startRestartGroup.changed(content) ? 131072 : 65536 : 196608;
                            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                EnterTransition plus = i4 == 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                                ExitTransition plus2 = i5 == 0 ? EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                                if (i6 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i9 = i3 << 3;
                                int i10 = (i9 & 57344) | (i9 & 896) | 48 | (i9 & 7168) | (i3 & 458752);
                                modifier2 = modifier3;
                                enterTransition3 = plus;
                                exitTransition3 = plus2;
                                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                    @NotNull
                                    public final Boolean invoke(boolean z2) {
                                        return Boolean.valueOf(z2);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke(((Boolean) obj).booleanValue());
                                    }
                                }, modifier2, enterTransition3, exitTransition3, content, startRestartGroup, i10);
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                enterTransition3 = enterTransition2;
                                exitTransition3 = exitTransition2;
                            }
                            final String str3 = str2;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i11) {
                                    AnimatedVisibilityKt.AnimatedVisibility(z, modifier2, enterTransition3, exitTransition3, str3, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i7;
                        if ((374491 & i3) == 74898) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        int i92 = i3 << 3;
                        int i102 = (i92 & 57344) | (i92 & 896) | 48 | (i92 & 7168) | (i3 & 458752);
                        modifier2 = modifier3;
                        enterTransition3 = plus;
                        exitTransition3 = plus2;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @NotNull
                            public final Boolean invoke(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Boolean) obj).booleanValue());
                            }
                        }, modifier2, enterTransition3, exitTransition3, content, startRestartGroup, i102);
                        final String str32 = str2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((374491 & i3) == 74898) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    int i922 = i3 << 3;
                    int i1022 = (i922 & 57344) | (i922 & 896) | 48 | (i922 & 7168) | (i3 & 458752);
                    modifier2 = modifier3;
                    enterTransition3 = plus;
                    exitTransition3 = plus2;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Boolean) obj).booleanValue());
                        }
                    }, modifier2, enterTransition3, exitTransition3, content, startRestartGroup, i1022);
                    final String str322 = str2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((374491 & i3) == 74898) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                int i9222 = i3 << 3;
                int i10222 = (i9222 & 57344) | (i9222 & 896) | 48 | (i9222 & 7168) | (i3 & 458752);
                modifier2 = modifier3;
                enterTransition3 = plus;
                exitTransition3 = plus2;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Boolean) obj).booleanValue());
                    }
                }, modifier2, enterTransition3, exitTransition3, content, startRestartGroup, i10222);
                final String str3222 = str2;
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
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((374491 & i3) == 74898) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            int i92222 = i3 << 3;
            int i102222 = (i92222 & 57344) | (i92222 & 896) | 48 | (i92222 & 7168) | (i3 & 458752);
            modifier2 = modifier3;
            enterTransition3 = plus;
            exitTransition3 = plus2;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                @NotNull
                public final Boolean invoke(boolean z2) {
                    return Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Boolean) obj).booleanValue());
                }
            }, modifier2, enterTransition3, exitTransition3, content, startRestartGroup, i102222);
            final String str32222 = str2;
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
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((374491 & i3) == 74898) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        int i922222 = i3 << 3;
        int i1022222 = (i922222 & 57344) | (i922222 & 896) | 48 | (i922222 & 7168) | (i3 & 458752);
        modifier2 = modifier3;
        enterTransition3 = plus;
        exitTransition3 = plus2;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
            @NotNull
            public final Boolean invoke(boolean z2) {
                return Boolean.valueOf(z2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Boolean) obj).booleanValue());
            }
        }, modifier2, enterTransition3, exitTransition3, content, startRestartGroup, i1022222);
        final String str322222 = str2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final RowScope rowScope, final boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        final Modifier modifier3;
        final String str3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1741346906);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) == 0) {
                            i7 = (i & 3670016) == 0 ? startRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                            if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                EnterTransition plus = i4 == 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null)) : enterTransition2;
                                ExitTransition plus2 = i5 == 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null)) : exitTransition2;
                                if (i6 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i9 = i3 >> 3;
                                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i9 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                                    @NotNull
                                    public final Boolean invoke(boolean z2) {
                                        return Boolean.valueOf(z2);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke(((Boolean) obj).booleanValue());
                                    }
                                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9 & 458752));
                                modifier3 = modifier4;
                                str3 = str2;
                                enterTransition2 = plus;
                                exitTransition3 = plus2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                exitTransition3 = exitTransition2;
                                str3 = str2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i10) {
                                    AnimatedVisibilityKt.AnimatedVisibility(RowScope.this, z, modifier3, enterTransition2, exitTransition3, str3, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i7;
                        if ((i3 & 2995921) == 599184) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        int i92 = i3 >> 3;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i92 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                            @NotNull
                            public final Boolean invoke(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Boolean) obj).booleanValue());
                            }
                        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92 & 458752));
                        modifier3 = modifier4;
                        str3 = str2;
                        enterTransition2 = plus;
                        exitTransition3 = plus2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    int i922 = i3 >> 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i922 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Boolean) obj).booleanValue());
                        }
                    }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922 & 458752));
                    modifier3 = modifier4;
                    str3 = str2;
                    enterTransition2 = plus;
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
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((i3 & 2995921) == 599184) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                int i9222 = i3 >> 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i9222 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Boolean) obj).booleanValue());
                    }
                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9222 & 458752));
                modifier3 = modifier4;
                str3 = str2;
                enterTransition2 = plus;
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
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((i3 & 2995921) == 599184) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            int i92222 = i3 >> 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i92222 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                @NotNull
                public final Boolean invoke(boolean z2) {
                    return Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Boolean) obj).booleanValue());
                }
            }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92222 & 458752));
            modifier3 = modifier4;
            str3 = str2;
            enterTransition2 = plus;
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
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((i3 & 2995921) == 599184) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        int i922222 = i3 >> 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i922222 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
            @NotNull
            public final Boolean invoke(boolean z2) {
                return Boolean.valueOf(z2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Boolean) obj).booleanValue());
            }
        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922222 & 458752));
        modifier3 = modifier4;
        str3 = str2;
        enterTransition2 = plus;
        exitTransition3 = plus2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final ColumnScope columnScope, final boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        final Modifier modifier3;
        final String str3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1766503102);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) == 0) {
                            i7 = (i & 3670016) == 0 ? startRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                            if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                EnterTransition plus = i4 == 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)) : enterTransition2;
                                ExitTransition plus2 = i5 == 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)) : exitTransition2;
                                if (i6 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i9 = i3 >> 3;
                                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i9 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                                    @NotNull
                                    public final Boolean invoke(boolean z2) {
                                        return Boolean.valueOf(z2);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke(((Boolean) obj).booleanValue());
                                    }
                                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9 & 458752));
                                modifier3 = modifier4;
                                str3 = str2;
                                enterTransition2 = plus;
                                exitTransition3 = plus2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                exitTransition3 = exitTransition2;
                                str3 = str2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i10) {
                                    AnimatedVisibilityKt.AnimatedVisibility(ColumnScope.this, z, modifier3, enterTransition2, exitTransition3, str3, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i7;
                        if ((i3 & 2995921) == 599184) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        int i92 = i3 >> 3;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i92 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                            @NotNull
                            public final Boolean invoke(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Boolean) obj).booleanValue());
                            }
                        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92 & 458752));
                        modifier3 = modifier4;
                        str3 = str2;
                        enterTransition2 = plus;
                        exitTransition3 = plus2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    int i922 = i3 >> 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i922 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @NotNull
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Boolean) obj).booleanValue());
                        }
                    }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922 & 458752));
                    modifier3 = modifier4;
                    str3 = str2;
                    enterTransition2 = plus;
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
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((i3 & 2995921) == 599184) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                int i9222 = i3 >> 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i9222 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    @NotNull
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Boolean) obj).booleanValue());
                    }
                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9222 & 458752));
                modifier3 = modifier4;
                str3 = str2;
                enterTransition2 = plus;
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
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((i3 & 2995921) == 599184) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            int i92222 = i3 >> 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i92222 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                @NotNull
                public final Boolean invoke(boolean z2) {
                    return Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Boolean) obj).booleanValue());
                }
            }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92222 & 458752));
            modifier3 = modifier4;
            str3 = str2;
            enterTransition2 = plus;
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
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((i3 & 2995921) == 599184) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        int i922222 = i3 >> 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i922222 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
            @NotNull
            public final Boolean invoke(boolean z2) {
                return Boolean.valueOf(z2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Boolean) obj).booleanValue());
            }
        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922222 & 458752));
        modifier3 = modifier4;
        str3 = str2;
        enterTransition2 = plus;
        exitTransition3 = plus2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final MutableTransitionState visibleState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        final String str3;
        final Modifier modifier3;
        final ExitTransition exitTransition3;
        final EnterTransition enterTransition3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(visibleState, "visibleState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-222898426);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(visibleState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                        if ((i2 & 32) == 0) {
                            i7 = (i & 458752) == 0 ? startRestartGroup.changed(content) ? 131072 : 65536 : 196608;
                            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                EnterTransition plus = i4 == 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                                ExitTransition plus2 = i5 == 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null)) : exitTransition2;
                                if (i6 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i9 = i3 << 3;
                                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                    @NotNull
                                    public final Boolean invoke(boolean z) {
                                        return Boolean.valueOf(z);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke(((Boolean) obj).booleanValue());
                                    }
                                }, modifier4, plus, plus2, content, startRestartGroup, (i9 & 57344) | (i9 & 896) | 48 | (i9 & 7168) | (i3 & 458752));
                                str3 = str2;
                                modifier3 = modifier4;
                                exitTransition3 = plus2;
                                enterTransition3 = plus;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                enterTransition3 = enterTransition2;
                                exitTransition3 = exitTransition2;
                                str3 = str2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i10) {
                                    AnimatedVisibilityKt.AnimatedVisibility(visibleState, modifier3, enterTransition3, exitTransition3, str3, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i7;
                        if ((374491 & i3) == 74898) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        int i92 = i3 << 3;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @NotNull
                            public final Boolean invoke(boolean z) {
                                return Boolean.valueOf(z);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Boolean) obj).booleanValue());
                            }
                        }, modifier4, plus, plus2, content, startRestartGroup, (i92 & 57344) | (i92 & 896) | 48 | (i92 & 7168) | (i3 & 458752));
                        str3 = str2;
                        modifier3 = modifier4;
                        exitTransition3 = plus2;
                        enterTransition3 = plus;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((374491 & i3) == 74898) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    int i922 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Boolean) obj).booleanValue());
                        }
                    }, modifier4, plus, plus2, content, startRestartGroup, (i922 & 57344) | (i922 & 896) | 48 | (i922 & 7168) | (i3 & 458752));
                    str3 = str2;
                    modifier3 = modifier4;
                    exitTransition3 = plus2;
                    enterTransition3 = plus;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((374491 & i3) == 74898) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                int i9222 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Boolean) obj).booleanValue());
                    }
                }, modifier4, plus, plus2, content, startRestartGroup, (i9222 & 57344) | (i9222 & 896) | 48 | (i9222 & 7168) | (i3 & 458752));
                str3 = str2;
                modifier3 = modifier4;
                exitTransition3 = plus2;
                enterTransition3 = plus;
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
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((374491 & i3) == 74898) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            int i92222 = i3 << 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                @NotNull
                public final Boolean invoke(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Boolean) obj).booleanValue());
                }
            }, modifier4, plus, plus2, content, startRestartGroup, (i92222 & 57344) | (i92222 & 896) | 48 | (i92222 & 7168) | (i3 & 458752));
            str3 = str2;
            modifier3 = modifier4;
            exitTransition3 = plus2;
            enterTransition3 = plus;
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
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((374491 & i3) == 74898) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        int i922222 = i3 << 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
            @NotNull
            public final Boolean invoke(boolean z) {
                return Boolean.valueOf(z);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Boolean) obj).booleanValue());
            }
        }, modifier4, plus, plus2, content, startRestartGroup, (i922222 & 57344) | (i922222 & 896) | 48 | (i922222 & 7168) | (i3 & 458752));
        str3 = str2;
        modifier3 = modifier4;
        exitTransition3 = plus2;
        enterTransition3 = plus;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final RowScope rowScope, final MutableTransitionState visibleState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        final Modifier modifier3;
        final String str3;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(visibleState, "visibleState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(836509870);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(visibleState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) == 0) {
                            i7 = (i & 3670016) == 0 ? startRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                            if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                EnterTransition plus = i4 == 0 ? EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)) : enterTransition2;
                                ExitTransition plus2 = i5 == 0 ? EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                                if (i6 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i9 = i3 >> 3;
                                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i9 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                                    @NotNull
                                    public final Boolean invoke(boolean z) {
                                        return Boolean.valueOf(z);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke(((Boolean) obj).booleanValue());
                                    }
                                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9 & 458752));
                                modifier3 = modifier4;
                                str3 = str2;
                                enterTransition3 = plus;
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
                                return;
                            }
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i10) {
                                    AnimatedVisibilityKt.AnimatedVisibility(RowScope.this, visibleState, modifier3, enterTransition3, exitTransition3, str3, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i7;
                        if ((i3 & 2995921) == 599184) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        int i92 = i3 >> 3;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i92 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                            @NotNull
                            public final Boolean invoke(boolean z) {
                                return Boolean.valueOf(z);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Boolean) obj).booleanValue());
                            }
                        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92 & 458752));
                        modifier3 = modifier4;
                        str3 = str2;
                        enterTransition3 = plus;
                        exitTransition3 = plus2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    int i922 = i3 >> 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i922 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Boolean) obj).booleanValue());
                        }
                    }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922 & 458752));
                    modifier3 = modifier4;
                    str3 = str2;
                    enterTransition3 = plus;
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
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((i3 & 2995921) == 599184) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                int i9222 = i3 >> 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i9222 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Boolean) obj).booleanValue());
                    }
                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9222 & 458752));
                modifier3 = modifier4;
                str3 = str2;
                enterTransition3 = plus;
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
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((i3 & 2995921) == 599184) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            int i92222 = i3 >> 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i92222 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                @NotNull
                public final Boolean invoke(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Boolean) obj).booleanValue());
                }
            }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92222 & 458752));
            modifier3 = modifier4;
            str3 = str2;
            enterTransition3 = plus;
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
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((i3 & 2995921) == 599184) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        int i922222 = i3 >> 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i922222 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
            @NotNull
            public final Boolean invoke(boolean z) {
                return Boolean.valueOf(z);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Boolean) obj).booleanValue());
            }
        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922222 & 458752));
        modifier3 = modifier4;
        str3 = str2;
        enterTransition3 = plus;
        exitTransition3 = plus2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final ColumnScope columnScope, final MutableTransitionState visibleState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        final Modifier modifier3;
        final String str3;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(visibleState, "visibleState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-850656618);
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(visibleState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) == 0) {
                            i7 = (i & 3670016) == 0 ? startRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                            if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                EnterTransition plus = i4 == 0 ? EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)) : enterTransition2;
                                ExitTransition plus2 = i5 == 0 ? EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                                if (i6 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i9 = i3 >> 3;
                                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i9 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                                    @NotNull
                                    public final Boolean invoke(boolean z) {
                                        return Boolean.valueOf(z);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke(((Boolean) obj).booleanValue());
                                    }
                                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9 & 458752));
                                modifier3 = modifier4;
                                str3 = str2;
                                enterTransition3 = plus;
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
                                return;
                            }
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i10) {
                                    AnimatedVisibilityKt.AnimatedVisibility(ColumnScope.this, visibleState, modifier3, enterTransition3, exitTransition3, str3, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i7;
                        if ((i3 & 2995921) == 599184) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        int i92 = i3 >> 3;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i92 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                            @NotNull
                            public final Boolean invoke(boolean z) {
                                return Boolean.valueOf(z);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Boolean) obj).booleanValue());
                            }
                        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92 & 458752));
                        modifier3 = modifier4;
                        str3 = str2;
                        enterTransition3 = plus;
                        exitTransition3 = plus2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    int i922 = i3 >> 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i922 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @NotNull
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return invoke(((Boolean) obj).booleanValue());
                        }
                    }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922 & 458752));
                    modifier3 = modifier4;
                    str3 = str2;
                    enterTransition3 = plus;
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
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((i3 & 2995921) == 599184) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                int i9222 = i3 >> 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i9222 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    @NotNull
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Boolean) obj).booleanValue());
                    }
                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9222 & 458752));
                modifier3 = modifier4;
                str3 = str2;
                enterTransition3 = plus;
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
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((i3 & 2995921) == 599184) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            int i92222 = i3 >> 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i92222 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                @NotNull
                public final Boolean invoke(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Boolean) obj).booleanValue());
                }
            }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92222 & 458752));
            modifier3 = modifier4;
            str3 = str2;
            enterTransition3 = plus;
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
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((i3 & 2995921) == 599184) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        int i922222 = i3 >> 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i922222 & 14) | ((i3 >> 12) & 112), 0), new Function1() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
            @NotNull
            public final Boolean invoke(boolean z) {
                return Boolean.valueOf(z);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Boolean) obj).booleanValue());
            }
        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922222 & 458752));
        modifier3 = modifier4;
        str3 = str2;
        enterTransition3 = plus;
        exitTransition3 = plus2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final Transition transition, final Function1 visible, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        final Modifier modifier3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(visible, "visible");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1031950689);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(visible) ? 32 : 16;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    if ((i2 & 16) != 0) {
                        i6 = (458752 & i) == 0 ? startRestartGroup.changed(content) ? 131072 : 65536 : 196608;
                        if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            EnterTransition plus = i4 != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                            ExitTransition plus2 = i5 != 0 ? EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                            AnimatedEnterExitImpl(transition, visible, modifier4, plus, plus2, content, startRestartGroup, i3 & 524286);
                            modifier3 = modifier4;
                            enterTransition2 = plus;
                            exitTransition3 = plus2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            exitTransition3 = exitTransition2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i8) {
                                AnimatedVisibilityKt.AnimatedVisibility(transition, visible, modifier3, enterTransition2, exitTransition3, content, composer2, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= i6;
                    if ((374491 & i3) == 74898) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    AnimatedEnterExitImpl(transition, visible, modifier4, plus, plus2, content, startRestartGroup, i3 & 524286);
                    modifier3 = modifier4;
                    enterTransition2 = plus;
                    exitTransition3 = plus2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                exitTransition2 = exitTransition;
                if ((i2 & 16) != 0) {
                }
                i3 |= i6;
                if ((374491 & i3) == 74898) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                AnimatedEnterExitImpl(transition, visible, modifier4, plus, plus2, content, startRestartGroup, i3 & 524286);
                modifier3 = modifier4;
                enterTransition2 = plus;
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
            if ((i2 & 16) != 0) {
            }
            i3 |= i6;
            if ((374491 & i3) == 74898) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            AnimatedEnterExitImpl(transition, visible, modifier4, plus, plus2, content, startRestartGroup, i3 & 524286);
            modifier3 = modifier4;
            enterTransition2 = plus;
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
        if ((i2 & 16) != 0) {
        }
        i3 |= i6;
        if ((374491 & i3) == 74898) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        AnimatedEnterExitImpl(transition, visible, modifier4, plus, plus2, content, startRestartGroup, i3 & 524286);
        modifier3 = modifier4;
        enterTransition2 = plus;
        exitTransition3 = plus2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final boolean z, Modifier modifier, final EnterTransition enter, final ExitTransition exit, final boolean z2, final Function2 content, Composer composer, final int i, final int i2) {
        final int i3;
        final Modifier modifier2;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1121582420);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(enter) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(exit) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((458752 & i) == 0) {
                i3 |= startRestartGroup.changed(content) ? 131072 : 65536;
            }
            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                AnimatedVisibility(mutableTransitionState, modifier3, enter, exit, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1996320812, true, new Function3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$16
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return Unit.INSTANCE;
                    }

                    @Composable
                    public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if ((i5 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            Function2.this.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                        }
                    }
                }), startRestartGroup, MutableTransitionState.$stable | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 16);
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$17
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
                    AnimatedVisibilityKt.AnimatedVisibility(z, modifier2, enter, exit, z2, content, composer2, i | 1, i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        if (i4 == 0) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableTransitionState mutableTransitionState2 = (MutableTransitionState) rememberedValue;
        mutableTransitionState2.setTargetState(Boolean.valueOf(z));
        AnimatedVisibility(mutableTransitionState2, modifier3, enter, exit, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1996320812, true, new Function3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$16
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer2, int i5) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if ((i5 & 81) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    Function2.this.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                }
            }
        }), startRestartGroup, MutableTransitionState.$stable | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 16);
        modifier2 = modifier3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedEnterExitImpl(final Transition transition, final Function1 function1, final Modifier modifier, final EnterTransition enterTransition, final ExitTransition exitTransition, final Function3 function3, Composer composer, final int i) {
        int i2;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(808253933);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(enterTransition) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(exitTransition) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(function3) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((374491 & i3) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            int i4 = i3 & 14;
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(transition);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function1.invoke(transition.getCurrentState()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            if (((Boolean) function1.invoke(transition.getTargetState())).booleanValue() || ((Boolean) mutableState.getValue()).booleanValue() || transition.isSeeking()) {
                startRestartGroup.startReplaceableGroup(1215497572);
                int i5 = (i4 | 48) & 14;
                startRestartGroup.startReplaceableGroup(1157296644);
                boolean changed2 = startRestartGroup.changed(transition);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = transition.getCurrentState();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                if (transition.isSeeking()) {
                    rememberedValue2 = transition.getCurrentState();
                }
                startRestartGroup.startReplaceableGroup(-1220581778);
                int i6 = i3 & 126;
                EnterExitState targetEnterExit = targetEnterExit(transition, function1, rememberedValue2, startRestartGroup, i6);
                startRestartGroup.endReplaceableGroup();
                Object targetState = transition.getTargetState();
                startRestartGroup.startReplaceableGroup(-1220581778);
                EnterExitState targetEnterExit2 = targetEnterExit(transition, function1, targetState, startRestartGroup, i6);
                startRestartGroup.endReplaceableGroup();
                Transition createChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, targetEnterExit, targetEnterExit2, "EnterExitTransition", startRestartGroup, i5 | 3072);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(511388516);
                boolean changed3 = startRestartGroup.changed(createChildTransitionInternal) | startRestartGroup.changed(mutableState);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(createChildTransitionInternal, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(createChildTransitionInternal, (Function2) rememberedValue3, startRestartGroup, 0);
                int i7 = (i3 >> 3) & 65520;
                startRestartGroup.startReplaceableGroup(-1967270694);
                Object currentState = createChildTransitionInternal.getCurrentState();
                EnterExitState enterExitState = EnterExitState.Visible;
                if (currentState == enterExitState || createChildTransitionInternal.getTargetState() == enterExitState) {
                    startRestartGroup.startReplaceableGroup(1157296644);
                    boolean changed4 = startRestartGroup.changed(createChildTransitionInternal);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new AnimatedVisibilityScopeImpl(createChildTransitionInternal);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    startRestartGroup.endReplaceableGroup();
                    AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) rememberedValue4;
                    int i8 = i7 >> 3;
                    composer2 = startRestartGroup;
                    Modifier then = modifier.then(EnterExitTransitionKt.createModifier(createChildTransitionInternal, enterTransition, exitTransition, "Built-in", startRestartGroup, 3072 | (i8 & 112) | (i8 & 896)));
                    composer2.startReplaceableGroup(-492369756);
                    Object rememberedValue5 = composer2.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue5;
                    composer2.startReplaceableGroup(-1323940314);
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(then);
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1149constructorimpl = Updater.m1149constructorimpl(composer2);
                    Updater.m1153setimpl(m1149constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(1797450476);
                    function3.invoke(animatedVisibilityScopeImpl, composer2, Integer.valueOf(((i7 >> 9) & 112) | 8));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = startRestartGroup;
                }
                composer2.endReplaceableGroup();
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i9) {
                        AnimatedVisibilityKt.AnimatedEnterExitImpl(transition, function1, modifier, enterTransition, exitTransition, function3, composer3, i | 1);
                    }
                });
                return;
            }
        }
        composer2 = startRestartGroup;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final EnterExitState targetEnterExit(Transition transition, Function1 function1, Object obj, Composer composer, int i) {
        EnterExitState enterExitState;
        composer.startReplaceableGroup(361571134);
        composer.startMovableGroup(-721837481, transition);
        if (transition.isSeeking()) {
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (((Boolean) function1.invoke(transition.getCurrentState())).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        } else {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            if (((Boolean) function1.invoke(transition.getCurrentState())).booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
            }
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        }
        composer.endMovableGroup();
        composer.endReplaceableGroup();
        return enterExitState;
    }
}
