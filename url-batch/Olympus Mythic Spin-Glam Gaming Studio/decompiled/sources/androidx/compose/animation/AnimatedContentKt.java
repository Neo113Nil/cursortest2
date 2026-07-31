package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001al\u0010\u000f\u001a\u00020\f\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\u001d\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a>\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0012\u001a\u00020\u00112 \b\u0002\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00140\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u001c\u001a\u00020\u0006*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0087\u0004¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0086\u0001\u0010\u000f\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00042\u001d\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"S", "targetState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/animation/ContentTransform;", "transitionSpec", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "", "Landroidx/compose/runtime/Composable;", "content", "AnimatedContent", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "", "clip", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "sizeAnimationSpec", "Landroidx/compose/animation/SizeTransform;", "SizeTransform", "(ZLkotlin/jvm/functions/Function2;)Landroidx/compose/animation/SizeTransform;", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/ExitTransition;", "exit", "with", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/core/Transition;", "", "contentKey", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AnimatedContentKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedContent(final Object obj, Modifier modifier, Function1 function1, Alignment alignment, final Function4 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1 function12;
        int i5;
        Alignment alignment2;
        final Modifier modifier3;
        final Function1 function13;
        final Alignment alignment3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(2124549995);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changed(function12) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    alignment2 = alignment;
                    i3 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        i3 |= startRestartGroup.changed(content) ? 16384 : 8192;
                    }
                    if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        Function1 function14 = i4 == 0 ? new Function1() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final ContentTransform invoke(@NotNull AnimatedContentScope<Object> animatedContentScope) {
                                Intrinsics.checkNotNullParameter(animatedContentScope, "$this$null");
                                return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m70scaleInL8ZKhE$default(AnimationSpecKt.tween$default(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                            }
                        } : function12;
                        Alignment topStart = i5 == 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                        AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(obj, "AnimatedContent", startRestartGroup, (i3 & 8) | 48 | (i3 & 14), 0), modifier4, function14, topStart, null, content, startRestartGroup, (i3 & 8176) | ((i3 << 3) & 458752), 8);
                        modifier3 = modifier4;
                        function13 = function14;
                        alignment3 = topStart;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        function13 = function12;
                        alignment3 = alignment2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((Composer) obj2, ((Number) obj3).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i7) {
                            AnimatedContentKt.AnimatedContent(obj, modifier3, function13, alignment3, content, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                alignment2 = alignment;
                if ((i2 & 16) == 0) {
                }
                if ((46811 & i3) == 9362) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(obj, "AnimatedContent", startRestartGroup, (i3 & 8) | 48 | (i3 & 14), 0), modifier4, function14, topStart, null, content, startRestartGroup, (i3 & 8176) | ((i3 << 3) & 458752), 8);
                modifier3 = modifier4;
                function13 = function14;
                alignment3 = topStart;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function12 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            if ((i2 & 16) == 0) {
            }
            if ((46811 & i3) == 9362) {
            }
            if (i6 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(obj, "AnimatedContent", startRestartGroup, (i3 & 8) | 48 | (i3 & 14), 0), modifier4, function14, topStart, null, content, startRestartGroup, (i3 & 8176) | ((i3 << 3) & 458752), 8);
            modifier3 = modifier4;
            function13 = function14;
            alignment3 = topStart;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        if ((i2 & 16) == 0) {
        }
        if ((46811 & i3) == 9362) {
        }
        if (i6 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(obj, "AnimatedContent", startRestartGroup, (i3 & 8) | 48 | (i3 & 14), 0), modifier4, function14, topStart, null, content, startRestartGroup, (i3 & 8176) | ((i3 << 3) & 458752), 8);
        modifier3 = modifier4;
        function13 = function14;
        alignment3 = topStart;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function2 = new Function2() { // from class: androidx.compose.animation.AnimatedContentKt$SizeTransform$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return m36invokeTemP2vQ(((IntSize) obj2).getPackedValue(), ((IntSize) obj3).getPackedValue());
                }

                @NotNull
                /* renamed from: invoke-TemP2vQ, reason: not valid java name */
                public final SpringSpec<IntSize> m36invokeTemP2vQ(long j, long j2) {
                    return AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m2562boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);
                }
            };
        }
        return SizeTransform(z, function2);
    }

    public static final SizeTransform SizeTransform(boolean z, Function2 sizeAnimationSpec) {
        Intrinsics.checkNotNullParameter(sizeAnimationSpec, "sizeAnimationSpec");
        return new SizeTransformImpl(z, sizeAnimationSpec);
    }

    public static final ContentTransform with(EnterTransition enterTransition, ExitTransition exit) {
        Intrinsics.checkNotNullParameter(enterTransition, "<this>");
        Intrinsics.checkNotNullParameter(exit, "exit");
        return new ContentTransform(enterTransition, exit, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedContent(final Transition transition, Modifier modifier, Function1 function1, Alignment alignment, Function1 function12, final Function4 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1 function13;
        int i5;
        Alignment alignment2;
        int i6;
        Function1 function14;
        final int i7;
        LayoutDirection layoutDirection;
        boolean changed;
        Object rememberedValue;
        final AnimatedContentScope animatedContentScope;
        boolean changed2;
        Object rememberedValue2;
        SnapshotStateList snapshotStateList;
        boolean changed3;
        Object rememberedValue3;
        Map map;
        boolean changed4;
        Object rememberedValue4;
        Object rememberedValue5;
        final Modifier modifier3;
        final Function1 function15;
        final Function1 function16;
        final Alignment alignment3;
        Iterator<T> it;
        int i8;
        int i9;
        ScopeUpdateScope endRestartGroup;
        int i10;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-114689412);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function13 = function1;
                i3 |= startRestartGroup.changed(function13) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    alignment2 = alignment;
                    i3 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        function14 = function12;
                        i3 |= startRestartGroup.changed(function14) ? 16384 : 8192;
                        if ((i2 & 16) == 0) {
                            i10 = (458752 & i) == 0 ? startRestartGroup.changed(content) ? 131072 : 65536 : 196608;
                            i7 = i3;
                            if ((374491 & i7) == 74898 || !startRestartGroup.getSkipping()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function13 = new Function1() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                                        @Override // kotlin.jvm.functions.Function1
                                        @NotNull
                                        public final ContentTransform invoke(@NotNull AnimatedContentScope<Object> animatedContentScope2) {
                                            Intrinsics.checkNotNullParameter(animatedContentScope2, "$this$null");
                                            return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m70scaleInL8ZKhE$default(AnimationSpecKt.tween$default(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                                        }
                                    };
                                }
                                if (i5 != 0) {
                                    alignment2 = Alignment.INSTANCE.getTopStart();
                                }
                                if (i6 != 0) {
                                    function14 = new Function1() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return obj;
                                        }
                                    };
                                }
                                layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                startRestartGroup.startReplaceableGroup(1157296644);
                                changed = startRestartGroup.changed(transition);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new AnimatedContentScope(transition, alignment2, layoutDirection);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                animatedContentScope = rememberedValue;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                changed2 = startRestartGroup.changed(transition);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                snapshotStateList = (SnapshotStateList) rememberedValue2;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                changed3 = startRestartGroup.changed(transition);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new LinkedHashMap();
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                startRestartGroup.endReplaceableGroup();
                                map = (Map) rememberedValue3;
                                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                                    if (snapshotStateList.size() != 1 || !Intrinsics.areEqual(snapshotStateList.get(0), transition.getCurrentState())) {
                                        snapshotStateList.clear();
                                        snapshotStateList.add(transition.getCurrentState());
                                    }
                                    if (map.size() != 1 || map.containsKey(transition.getCurrentState())) {
                                        map.clear();
                                    }
                                    animatedContentScope.setContentAlignment$animation_release(alignment2);
                                    animatedContentScope.setLayoutDirection$animation_release(layoutDirection);
                                }
                                if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState()) && !snapshotStateList.contains(transition.getTargetState())) {
                                    it = snapshotStateList.iterator();
                                    i8 = 0;
                                    while (true) {
                                        if (it.hasNext()) {
                                            i9 = -1;
                                            i8 = -1;
                                            break;
                                        } else {
                                            if (Intrinsics.areEqual(function14.invoke(it.next()), function14.invoke(transition.getTargetState()))) {
                                                i9 = -1;
                                                break;
                                            }
                                            i8++;
                                        }
                                    }
                                    if (i8 != i9) {
                                        snapshotStateList.add(transition.getTargetState());
                                    } else {
                                        snapshotStateList.set(i8, transition.getTargetState());
                                    }
                                }
                                if (!map.containsKey(transition.getTargetState())) {
                                    map.clear();
                                    int size = snapshotStateList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        final T t = snapshotStateList.get(i12);
                                        Map map2 = map;
                                        final SnapshotStateList snapshotStateList2 = snapshotStateList;
                                        final Function1 function17 = function13;
                                        map2.put(t, ComposableLambdaKt.composableLambda(startRestartGroup, 963631013, true, new Function2() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @ComposableTarget
                                            @Composable
                                            public final void invoke(@Nullable Composer composer2, int i13) {
                                                if ((i13 & 11) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                Function1 function18 = function17;
                                                AnimatedContentScope<Object> animatedContentScope2 = animatedContentScope;
                                                composer2.startReplaceableGroup(-492369756);
                                                Object rememberedValue6 = composer2.rememberedValue();
                                                Composer.Companion companion = Composer.INSTANCE;
                                                if (rememberedValue6 == companion.getEmpty()) {
                                                    rememberedValue6 = (ContentTransform) function18.invoke(animatedContentScope2);
                                                    composer2.updateRememberedValue(rememberedValue6);
                                                }
                                                composer2.endReplaceableGroup();
                                                final ContentTransform contentTransform = (ContentTransform) rememberedValue6;
                                                Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(transition.getSegment().getTargetState(), t));
                                                Function1 function19 = function17;
                                                AnimatedContentScope<Object> animatedContentScope3 = animatedContentScope;
                                                composer2.startReplaceableGroup(1157296644);
                                                boolean changed5 = composer2.changed(valueOf);
                                                Object rememberedValue7 = composer2.rememberedValue();
                                                if (changed5 || rememberedValue7 == companion.getEmpty()) {
                                                    rememberedValue7 = ((ContentTransform) function19.invoke(animatedContentScope3)).getInitialContentExit();
                                                    composer2.updateRememberedValue(rememberedValue7);
                                                }
                                                composer2.endReplaceableGroup();
                                                ExitTransition exitTransition = (ExitTransition) rememberedValue7;
                                                Object obj = t;
                                                Transition<Object> transition2 = transition;
                                                composer2.startReplaceableGroup(-492369756);
                                                Object rememberedValue8 = composer2.rememberedValue();
                                                if (rememberedValue8 == companion.getEmpty()) {
                                                    rememberedValue8 = new AnimatedContentScope.ChildData(Intrinsics.areEqual(obj, transition2.getTargetState()));
                                                    composer2.updateRememberedValue(rememberedValue8);
                                                }
                                                composer2.endReplaceableGroup();
                                                AnimatedContentScope.ChildData childData = (AnimatedContentScope.ChildData) rememberedValue8;
                                                EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
                                                Modifier layout = LayoutModifierKt.layout(Modifier.INSTANCE, new Function3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1.1
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4) {
                                                        return m35invoke3p2s80s((MeasureScope) obj2, (Measurable) obj3, ((Constraints) obj4).getValue());
                                                    }

                                                    @NotNull
                                                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                                    public final MeasureResult m35invoke3p2s80s(@NotNull MeasureScope layout2, @NotNull Measurable measurable, long j) {
                                                        Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                                                        Intrinsics.checkNotNullParameter(measurable, "measurable");
                                                        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(j);
                                                        int width = mo1944measureBRTryo0.getWidth();
                                                        int height = mo1944measureBRTryo0.getHeight();
                                                        final ContentTransform contentTransform2 = ContentTransform.this;
                                                        return MeasureScope.layout$default(layout2, width, height, null, new Function1() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.5.1.1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                                invoke((Placeable.PlacementScope) obj2);
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(@NotNull Placeable.PlacementScope layout3) {
                                                                Intrinsics.checkNotNullParameter(layout3, "$this$layout");
                                                                layout3.place(Placeable.this, 0, 0, contentTransform2.getTargetContentZIndex());
                                                            }
                                                        }, 4, null);
                                                    }
                                                });
                                                childData.setTarget(Intrinsics.areEqual(t, transition.getTargetState()));
                                                Modifier then = layout.then(childData);
                                                Transition<Object> transition3 = transition;
                                                final Object obj2 = t;
                                                Function1 function110 = new Function1() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    @NotNull
                                                    public final Boolean invoke(Object obj3) {
                                                        return Boolean.valueOf(Intrinsics.areEqual(obj3, obj2));
                                                    }
                                                };
                                                final AnimatedContentScope<Object> animatedContentScope4 = animatedContentScope;
                                                final Object obj3 = t;
                                                final Function4 function4 = content;
                                                final int i14 = i7;
                                                final SnapshotStateList<Object> snapshotStateList3 = snapshotStateList2;
                                                AnimatedVisibilityKt.AnimatedVisibility(transition3, function110, then, targetContentEnter, exitTransition, ComposableLambdaKt.composableLambda(composer2, -1816907410, true, new Function3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1.4
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5, Object obj6) {
                                                        invoke((AnimatedVisibilityScope) obj4, (Composer) obj5, ((Number) obj6).intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    @ComposableTarget
                                                    @Composable
                                                    public final void invoke(@NotNull AnimatedVisibilityScope AnimatedVisibility, @Nullable Composer composer3, int i15) {
                                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                        if ((i15 & 14) == 0) {
                                                            i15 |= composer3.changed(AnimatedVisibility) ? 4 : 2;
                                                        }
                                                        if ((i15 & 91) != 18 || !composer3.getSkipping()) {
                                                            final SnapshotStateList<Object> snapshotStateList4 = snapshotStateList3;
                                                            final Object obj4 = obj3;
                                                            final AnimatedContentScope<Object> animatedContentScope5 = animatedContentScope4;
                                                            int i16 = i15 & 14;
                                                            EffectsKt.DisposableEffect(AnimatedVisibility, new Function1() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.5.1.4.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                @NotNull
                                                                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                                                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                                    final SnapshotStateList<Object> snapshotStateList5 = snapshotStateList4;
                                                                    final Object obj5 = obj4;
                                                                    final AnimatedContentScope<Object> animatedContentScope6 = animatedContentScope5;
                                                                    return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$4$1$invoke$$inlined$onDispose$1
                                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                                        public void dispose() {
                                                                            SnapshotStateList.this.remove(obj5);
                                                                            animatedContentScope6.getTargetSizeMap().remove(obj5);
                                                                        }
                                                                    };
                                                                }
                                                            }, composer3, i16);
                                                            animatedContentScope4.getTargetSizeMap().put(obj3, ((AnimatedVisibilityScopeImpl) AnimatedVisibility).getTargetSize());
                                                            function4.invoke(AnimatedVisibility, obj3, composer3, Integer.valueOf(i16 | ((i14 >> 9) & 896)));
                                                            return;
                                                        }
                                                        composer3.skipToGroupEnd();
                                                    }
                                                }), composer2, 196608 | (i7 & 14), 0);
                                            }
                                        }));
                                        i12++;
                                        map = map2;
                                        modifier2 = modifier2;
                                        function13 = function13;
                                        snapshotStateList = snapshotStateList2;
                                        alignment2 = alignment2;
                                    }
                                }
                                Map map3 = map;
                                SnapshotStateList snapshotStateList3 = snapshotStateList;
                                Modifier modifier4 = modifier2;
                                Function1 function18 = function13;
                                Alignment alignment4 = alignment2;
                                Transition.Segment segment = transition.getSegment();
                                startRestartGroup.startReplaceableGroup(511388516);
                                changed4 = startRestartGroup.changed(segment) | startRestartGroup.changed(animatedContentScope);
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = (ContentTransform) function18.invoke(animatedContentScope);
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                startRestartGroup.endReplaceableGroup();
                                Modifier then = modifier4.then(animatedContentScope.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
                                startRestartGroup.startReplaceableGroup(-492369756);
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = new AnimatedContentMeasurePolicy(animatedContentScope);
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                startRestartGroup.endReplaceableGroup();
                                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (AnimatedContentMeasurePolicy) rememberedValue5;
                                startRestartGroup.startReplaceableGroup(-1323940314);
                                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0 constructor = companion.getConstructor();
                                Function3 materializerOf = LayoutKt.materializerOf(then);
                                if (startRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.useNode();
                                } else {
                                    startRestartGroup.createNode(constructor);
                                }
                                startRestartGroup.disableReusing();
                                Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
                                Updater.m1153setimpl(m1149constructorimpl, animatedContentMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                                Updater.m1153setimpl(m1149constructorimpl, layoutDirection2, companion.getSetLayoutDirection());
                                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                                startRestartGroup.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                startRestartGroup.startReplaceableGroup(2058660585);
                                startRestartGroup.startReplaceableGroup(-451584589);
                                for (Object obj : snapshotStateList3) {
                                    startRestartGroup.startMovableGroup(-1739565921, function14.invoke(obj));
                                    Function2 function2 = (Function2) map3.get(obj);
                                    if (function2 != null) {
                                        function2.invoke(startRestartGroup, 0);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    startRestartGroup.endMovableGroup();
                                }
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                modifier3 = modifier4;
                                function15 = function18;
                                function16 = function14;
                                alignment3 = alignment4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                function15 = function13;
                                alignment3 = alignment2;
                                function16 = function14;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$8
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                    invoke((Composer) obj2, ((Number) obj3).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i13) {
                                    AnimatedContentKt.AnimatedContent(transition, modifier3, function15, alignment3, function16, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i10;
                        i7 = i3;
                        if ((374491 & i7) == 74898) {
                        }
                        if (i11 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        startRestartGroup.startReplaceableGroup(1157296644);
                        changed = startRestartGroup.changed(transition);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new AnimatedContentScope(transition, alignment2, layoutDirection);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceableGroup();
                        animatedContentScope = rememberedValue;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        changed2 = startRestartGroup.changed(transition);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceableGroup();
                        snapshotStateList = (SnapshotStateList) rememberedValue2;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        changed3 = startRestartGroup.changed(transition);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue3 = new LinkedHashMap();
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        startRestartGroup.endReplaceableGroup();
                        map = (Map) rememberedValue3;
                        if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                        }
                        if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                            it = snapshotStateList.iterator();
                            i8 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                }
                                i8++;
                            }
                            if (i8 != i9) {
                            }
                        }
                        if (!map.containsKey(transition.getTargetState())) {
                        }
                        Map map32 = map;
                        SnapshotStateList snapshotStateList32 = snapshotStateList;
                        Modifier modifier42 = modifier2;
                        Function1 function182 = function13;
                        Alignment alignment42 = alignment2;
                        Transition.Segment segment2 = transition.getSegment();
                        startRestartGroup.startReplaceableGroup(511388516);
                        changed4 = startRestartGroup.changed(segment2) | startRestartGroup.changed(animatedContentScope);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed4) {
                        }
                        rememberedValue4 = (ContentTransform) function182.invoke(animatedContentScope);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        startRestartGroup.endReplaceableGroup();
                        Modifier then2 = modifier42.then(animatedContentScope.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        AnimatedContentMeasurePolicy animatedContentMeasurePolicy2 = (AnimatedContentMeasurePolicy) rememberedValue5;
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0 constructor2 = companion2.getConstructor();
                        Function3 materializerOf2 = LayoutKt.materializerOf(then2);
                        if (startRestartGroup.getApplier() == null) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        startRestartGroup.disableReusing();
                        Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
                        Updater.m1153setimpl(m1149constructorimpl2, animatedContentMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
                        Updater.m1153setimpl(m1149constructorimpl2, layoutDirection22, companion2.getSetLayoutDirection());
                        Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                        startRestartGroup.enableReusing();
                        materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        startRestartGroup.startReplaceableGroup(-451584589);
                        while (r0.hasNext()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        modifier3 = modifier42;
                        function15 = function182;
                        function16 = function14;
                        alignment3 = alignment42;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    function14 = function12;
                    if ((i2 & 16) == 0) {
                    }
                    i3 |= i10;
                    i7 = i3;
                    if ((374491 & i7) == 74898) {
                    }
                    if (i11 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    startRestartGroup.startReplaceableGroup(1157296644);
                    changed = startRestartGroup.changed(transition);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new AnimatedContentScope(transition, alignment2, layoutDirection);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    animatedContentScope = rememberedValue;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    changed2 = startRestartGroup.changed(transition);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) rememberedValue2;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    changed3 = startRestartGroup.changed(transition);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue3 = new LinkedHashMap();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    map = (Map) rememberedValue3;
                    if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    }
                    if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    }
                    if (!map.containsKey(transition.getTargetState())) {
                    }
                    Map map322 = map;
                    SnapshotStateList snapshotStateList322 = snapshotStateList;
                    Modifier modifier422 = modifier2;
                    Function1 function1822 = function13;
                    Alignment alignment422 = alignment2;
                    Transition.Segment segment22 = transition.getSegment();
                    startRestartGroup.startReplaceableGroup(511388516);
                    changed4 = startRestartGroup.changed(segment22) | startRestartGroup.changed(animatedContentScope);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed4) {
                    }
                    rememberedValue4 = (ContentTransform) function1822.invoke(animatedContentScope);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceableGroup();
                    Modifier then22 = modifier422.then(animatedContentScope.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    AnimatedContentMeasurePolicy animatedContentMeasurePolicy22 = (AnimatedContentMeasurePolicy) rememberedValue5;
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration22 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0 constructor22 = companion22.getConstructor();
                    Function3 materializerOf22 = LayoutKt.materializerOf(then22);
                    if (startRestartGroup.getApplier() == null) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    startRestartGroup.disableReusing();
                    Composer m1149constructorimpl22 = Updater.m1149constructorimpl(startRestartGroup);
                    Updater.m1153setimpl(m1149constructorimpl22, animatedContentMeasurePolicy22, companion22.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl22, density22, companion22.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl22, layoutDirection222, companion22.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl22, viewConfiguration22, companion22.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf22.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-451584589);
                    while (r0.hasNext()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    modifier3 = modifier422;
                    function15 = function1822;
                    function16 = function14;
                    alignment3 = alignment422;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                alignment2 = alignment;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                function14 = function12;
                if ((i2 & 16) == 0) {
                }
                i3 |= i10;
                i7 = i3;
                if ((374491 & i7) == 74898) {
                }
                if (i11 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                startRestartGroup.startReplaceableGroup(1157296644);
                changed = startRestartGroup.changed(transition);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new AnimatedContentScope(transition, alignment2, layoutDirection);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                animatedContentScope = rememberedValue;
                startRestartGroup.startReplaceableGroup(1157296644);
                changed2 = startRestartGroup.changed(transition);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) rememberedValue2;
                startRestartGroup.startReplaceableGroup(1157296644);
                changed3 = startRestartGroup.changed(transition);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue3 = new LinkedHashMap();
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                map = (Map) rememberedValue3;
                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                }
                if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                }
                if (!map.containsKey(transition.getTargetState())) {
                }
                Map map3222 = map;
                SnapshotStateList snapshotStateList3222 = snapshotStateList;
                Modifier modifier4222 = modifier2;
                Function1 function18222 = function13;
                Alignment alignment4222 = alignment2;
                Transition.Segment segment222 = transition.getSegment();
                startRestartGroup.startReplaceableGroup(511388516);
                changed4 = startRestartGroup.changed(segment222) | startRestartGroup.changed(animatedContentScope);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed4) {
                }
                rememberedValue4 = (ContentTransform) function18222.invoke(animatedContentScope);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceableGroup();
                Modifier then222 = modifier4222.then(animatedContentScope.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy222 = (AnimatedContentMeasurePolicy) rememberedValue5;
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
                Function0 constructor222 = companion222.getConstructor();
                Function3 materializerOf222 = LayoutKt.materializerOf(then222);
                if (startRestartGroup.getApplier() == null) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m1149constructorimpl222 = Updater.m1149constructorimpl(startRestartGroup);
                Updater.m1153setimpl(m1149constructorimpl222, animatedContentMeasurePolicy222, companion222.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl222, density222, companion222.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl222, layoutDirection2222, companion222.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl222, viewConfiguration222, companion222.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-451584589);
                while (r0.hasNext()) {
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                modifier3 = modifier4222;
                function15 = function18222;
                function16 = function14;
                alignment3 = alignment4222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
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
            if ((i2 & 16) == 0) {
            }
            i3 |= i10;
            i7 = i3;
            if ((374491 & i7) == 74898) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            startRestartGroup.startReplaceableGroup(1157296644);
            changed = startRestartGroup.changed(transition);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new AnimatedContentScope(transition, alignment2, layoutDirection);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            animatedContentScope = rememberedValue;
            startRestartGroup.startReplaceableGroup(1157296644);
            changed2 = startRestartGroup.changed(transition);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) rememberedValue2;
            startRestartGroup.startReplaceableGroup(1157296644);
            changed3 = startRestartGroup.changed(transition);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue3 = new LinkedHashMap();
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            map = (Map) rememberedValue3;
            if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
            }
            if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
            }
            if (!map.containsKey(transition.getTargetState())) {
            }
            Map map32222 = map;
            SnapshotStateList snapshotStateList32222 = snapshotStateList;
            Modifier modifier42222 = modifier2;
            Function1 function182222 = function13;
            Alignment alignment42222 = alignment2;
            Transition.Segment segment2222 = transition.getSegment();
            startRestartGroup.startReplaceableGroup(511388516);
            changed4 = startRestartGroup.changed(segment2222) | startRestartGroup.changed(animatedContentScope);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue4 = (ContentTransform) function182222.invoke(animatedContentScope);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceableGroup();
            Modifier then2222 = modifier42222.then(animatedContentScope.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            AnimatedContentMeasurePolicy animatedContentMeasurePolicy2222 = (AnimatedContentMeasurePolicy) rememberedValue5;
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection22222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2222 = ComposeUiNode.INSTANCE;
            Function0 constructor2222 = companion2222.getConstructor();
            Function3 materializerOf2222 = LayoutKt.materializerOf(then2222);
            if (startRestartGroup.getApplier() == null) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl2222 = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl2222, animatedContentMeasurePolicy2222, companion2222.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl2222, density2222, companion2222.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl2222, layoutDirection22222, companion2222.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl2222, viewConfiguration2222, companion2222.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-451584589);
            while (r0.hasNext()) {
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            modifier3 = modifier42222;
            function15 = function182222;
            function16 = function14;
            alignment3 = alignment42222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
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
        if ((i2 & 16) == 0) {
        }
        i3 |= i10;
        i7 = i3;
        if ((374491 & i7) == 74898) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        startRestartGroup.startReplaceableGroup(1157296644);
        changed = startRestartGroup.changed(transition);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new AnimatedContentScope(transition, alignment2, layoutDirection);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        animatedContentScope = rememberedValue;
        startRestartGroup.startReplaceableGroup(1157296644);
        changed2 = startRestartGroup.changed(transition);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        snapshotStateList = (SnapshotStateList) rememberedValue2;
        startRestartGroup.startReplaceableGroup(1157296644);
        changed3 = startRestartGroup.changed(transition);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue3 = new LinkedHashMap();
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        map = (Map) rememberedValue3;
        if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
        }
        if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
        }
        if (!map.containsKey(transition.getTargetState())) {
        }
        Map map322222 = map;
        SnapshotStateList snapshotStateList322222 = snapshotStateList;
        Modifier modifier422222 = modifier2;
        Function1 function1822222 = function13;
        Alignment alignment422222 = alignment2;
        Transition.Segment segment22222 = transition.getSegment();
        startRestartGroup.startReplaceableGroup(511388516);
        changed4 = startRestartGroup.changed(segment22222) | startRestartGroup.changed(animatedContentScope);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue4 = (ContentTransform) function1822222.invoke(animatedContentScope);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        Modifier then22222 = modifier422222.then(animatedContentScope.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        AnimatedContentMeasurePolicy animatedContentMeasurePolicy22222 = (AnimatedContentMeasurePolicy) rememberedValue5;
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density22222 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection222222 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration22222 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion22222 = ComposeUiNode.INSTANCE;
        Function0 constructor22222 = companion22222.getConstructor();
        Function3 materializerOf22222 = LayoutKt.materializerOf(then22222);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl22222 = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl22222, animatedContentMeasurePolicy22222, companion22222.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl22222, density22222, companion22222.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl22222, layoutDirection222222, companion22222.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl22222, viewConfiguration22222, companion22222.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf22222.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-451584589);
        while (r0.hasNext()) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        modifier3 = modifier422222;
        function15 = function1822222;
        function16 = function14;
        alignment3 = alignment422222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
