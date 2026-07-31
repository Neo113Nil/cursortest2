package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Crossfade.kt */
@Metadata(d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aP\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aj\u0010\u000b\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00072\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "targetState", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/Composable;", "content", "Crossfade", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "", "contentKey", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CrossfadeKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Crossfade(final Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        final FiniteAnimationSpec finiteAnimationSpec2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(523603005);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
            }
            if (i4 == 4 || (i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                FiniteAnimationSpec tween$default = i4 == 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : finiteAnimationSpec;
                Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(obj, (String) null, startRestartGroup, i3 & 14, 2), modifier4, tween$default, null, content, startRestartGroup, (i3 & 112) | 512 | ((i3 << 3) & 57344), 4);
                modifier3 = modifier4;
                finiteAnimationSpec2 = tween$default;
            } else {
                startRestartGroup.skipToGroupEnd();
                finiteAnimationSpec2 = finiteAnimationSpec;
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    CrossfadeKt.Crossfade(obj, modifier3, finiteAnimationSpec2, content, composer2, i | 1, i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if (i4 == 4) {
        }
        if (i5 == 0) {
        }
        if (i4 == 0) {
        }
        Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(obj, (String) null, startRestartGroup, i3 & 14, 2), modifier4, tween$default, null, content, startRestartGroup, (i3 & 112) | 512 | ((i3 << 3) & 57344), 4);
        modifier3 = modifier4;
        finiteAnimationSpec2 = tween$default;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Crossfade(final Transition transition, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Function1 function12;
        Object rememberedValue;
        Composer.Companion companion;
        SnapshotStateList snapshotStateList;
        Object rememberedValue2;
        Map map;
        int size;
        int i6;
        final Function1 function13;
        final Modifier modifier3;
        final FiniteAnimationSpec finiteAnimationSpec2;
        boolean changed;
        Object rememberedValue3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(679005231);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 4;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changed(function12) ? 2048 : 1024;
                if ((i2 & 8) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(content) ? 16384 : 8192;
                }
                int i8 = i3;
                if (i4 == 2 || (46811 & i8) != 9362 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                    FiniteAnimationSpec tween$default = i4 != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : finiteAnimationSpec;
                    if (i5 != 0) {
                        function12 = new Function1() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return obj;
                            }
                        };
                    }
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue = startRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    Object obj = rememberedValue;
                    if (rememberedValue == companion.getEmpty()) {
                        SnapshotStateList mutableStateListOf = SnapshotStateKt.mutableStateListOf();
                        mutableStateListOf.add(transition.getCurrentState());
                        Unit unit = Unit.INSTANCE;
                        startRestartGroup.updateRememberedValue(mutableStateListOf);
                        obj = mutableStateListOf;
                    }
                    startRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) obj;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new LinkedHashMap();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceableGroup();
                    map = (Map) rememberedValue2;
                    startRestartGroup.startReplaceableGroup(-1621449801);
                    if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState()) && (snapshotStateList.size() != 1 || !Intrinsics.areEqual(snapshotStateList.get(0), transition.getTargetState()))) {
                        startRestartGroup.startReplaceableGroup(1157296644);
                        changed = startRestartGroup.changed(transition);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue3 == companion.getEmpty()) {
                            rememberedValue3 = new Function1() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                @NotNull
                                public final Boolean invoke(Object obj2) {
                                    return Boolean.valueOf(!Intrinsics.areEqual(obj2, transition.getTargetState()));
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceableGroup();
                        CollectionsKt.removeAll((List) snapshotStateList, (Function1) rememberedValue3);
                        map.clear();
                    }
                    startRestartGroup.endReplaceableGroup();
                    if (!map.containsKey(transition.getTargetState())) {
                        Iterator<T> it = snapshotStateList.iterator();
                        int i9 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i9 = -1;
                                break;
                            } else if (Intrinsics.areEqual(function12.invoke(it.next()), function12.invoke(transition.getTargetState()))) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                        if (i9 == -1) {
                            snapshotStateList.add(transition.getTargetState());
                        } else {
                            snapshotStateList.set(i9, transition.getTargetState());
                        }
                        map.clear();
                        int size2 = snapshotStateList.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            T t = snapshotStateList.get(i10);
                            Map map2 = map;
                            map2.put(t, ComposableLambdaKt.composableLambda(startRestartGroup, -1426421288, true, new CrossfadeKt$Crossfade$4$1(transition, i8, tween$default, t, content)));
                            i10++;
                            snapshotStateList = snapshotStateList;
                            map = map2;
                        }
                    }
                    Map map3 = map;
                    SnapshotStateList snapshotStateList2 = snapshotStateList;
                    startRestartGroup.startReplaceableGroup(-1990474327);
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(1376089335);
                    Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion2.getConstructor();
                    Function3 materializerOf = LayoutKt.materializerOf(modifier4);
                    if (startRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    startRestartGroup.disableReusing();
                    Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
                    Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion2.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                    startRestartGroup.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-1253629305);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceableGroup(1930908853);
                    size = snapshotStateList2.size();
                    i6 = 0;
                    while (i6 < size) {
                        SnapshotStateList snapshotStateList3 = snapshotStateList2;
                        Object obj2 = snapshotStateList3.get(i6);
                        startRestartGroup.startMovableGroup(-450541954, function12.invoke(obj2));
                        Function2 function2 = (Function2) map3.get(obj2);
                        if (function2 != null) {
                            function2.invoke(startRestartGroup, 0);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        startRestartGroup.endMovableGroup();
                        i6++;
                        snapshotStateList2 = snapshotStateList3;
                    }
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    function13 = function12;
                    modifier3 = modifier4;
                    finiteAnimationSpec2 = tween$default;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    finiteAnimationSpec2 = finiteAnimationSpec;
                    modifier3 = modifier2;
                    function13 = function12;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4) {
                        invoke((Composer) obj3, ((Number) obj4).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i11) {
                        CrossfadeKt.Crossfade(transition, modifier3, finiteAnimationSpec2, function13, content, composer2, i | 1, i2);
                    }
                });
                return;
            }
            function12 = function1;
            if ((i2 & 8) != 0) {
            }
            int i82 = i3;
            if (i4 == 2) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            Object obj3 = rememberedValue;
            if (rememberedValue == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) obj3;
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            map = (Map) rememberedValue2;
            startRestartGroup.startReplaceableGroup(-1621449801);
            if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                startRestartGroup.startReplaceableGroup(1157296644);
                changed = startRestartGroup.changed(transition);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = new Function1() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(Object obj22) {
                        return Boolean.valueOf(!Intrinsics.areEqual(obj22, transition.getTargetState()));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                CollectionsKt.removeAll((List) snapshotStateList, (Function1) rememberedValue3);
                map.clear();
            }
            startRestartGroup.endReplaceableGroup();
            if (!map.containsKey(transition.getTargetState())) {
            }
            Map map32 = map;
            SnapshotStateList snapshotStateList22 = snapshotStateList;
            startRestartGroup.startReplaceableGroup(-1990474327);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1376089335);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0 constructor2 = companion22.getConstructor();
            Function3 materializerOf2 = LayoutKt.materializerOf(modifier4);
            if (startRestartGroup.getApplier() == null) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl2, density2, companion22.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion22.getSetLayoutDirection());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-1253629305);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1930908853);
            size = snapshotStateList22.size();
            i6 = 0;
            while (i6 < size) {
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            function13 = function12;
            modifier3 = modifier4;
            finiteAnimationSpec2 = tween$default;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 != 0) {
        }
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        function12 = function1;
        if ((i2 & 8) != 0) {
        }
        int i822 = i3;
        if (i4 == 2) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        Object obj32 = rememberedValue;
        if (rememberedValue == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        snapshotStateList = (SnapshotStateList) obj32;
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        map = (Map) rememberedValue2;
        startRestartGroup.startReplaceableGroup(-1621449801);
        if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
        }
        startRestartGroup.endReplaceableGroup();
        if (!map.containsKey(transition.getTargetState())) {
        }
        Map map322 = map;
        SnapshotStateList snapshotStateList222 = snapshotStateList;
        startRestartGroup.startReplaceableGroup(-1990474327);
        MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(1376089335);
        Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
        Function0 constructor22 = companion222.getConstructor();
        Function3 materializerOf22 = LayoutKt.materializerOf(modifier4);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl22 = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl22, rememberBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl22, density22, companion222.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl22, layoutDirection22, companion222.getSetLayoutDirection());
        startRestartGroup.enableReusing();
        materializerOf22.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-1253629305);
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1930908853);
        size = snapshotStateList222.size();
        i6 = 0;
        while (i6 < size) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        function13 = function12;
        modifier3 = modifier4;
        finiteAnimationSpec2 = tween$default;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
