package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0093\u0001\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042$\b\u0002\u0010\r\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f2\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u009d\u0001\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00142$\b\u0002\u0010\r\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f2\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\"\u0017\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "indicator", "Lkotlin/Function0;", "divider", "tabs", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "Landroidx/compose/ui/unit/Dp;", "edgePadding", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "ScrollableTabRowMinimumTabWidth", "F", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m2507constructorimpl(90);
    private static final AnimationSpec ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(POBCommonConstants.DEFAULT_MIN_BITRATE, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007b  */
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1023TabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, Function3 function3, Function2 function2, final Function2 tabs, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        Function3 function32;
        int i6;
        Function2 function22;
        Modifier modifier2;
        long j5;
        long j6;
        final Function3 composableLambda;
        final int i7;
        final Function2 m827getLambda1$material_release;
        final Function2 function23;
        final Modifier modifier3;
        final long j7;
        final long j8;
        final Function3 function33;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer startRestartGroup = composer.startRestartGroup(-249175289);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 896) != 0) {
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
            if ((i2 & 7168) != 0) {
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
            } else if ((57344 & i2) == 0) {
                function32 = function3;
                i4 |= startRestartGroup.changed(function32) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((458752 & i2) == 0) {
                    function22 = function2;
                    i4 |= startRestartGroup.changed(function22) ? 131072 : 65536;
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((3670016 & i2) == 0) {
                        i4 |= startRestartGroup.changed(tabs) ? 1048576 : 524288;
                    }
                    if ((2995931 & i4) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i10 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 4) == 0) {
                                j5 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i4 &= -897;
                            } else {
                                j5 = j3;
                            }
                            if ((i3 & 8) == 0) {
                                j6 = ColorsKt.m814contentColorForek8zF_U(j5, startRestartGroup, (i4 >> 6) & 14);
                                i4 &= -7169;
                            } else {
                                j6 = j4;
                            }
                            composableLambda = i5 == 0 ? ComposableLambdaKt.composableLambda(startRestartGroup, -553782708, true, new Function3() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((List<TabPosition>) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i11) {
                                    Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m1017Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                }
                            }) : function32;
                            if (i6 == 0) {
                                i7 = i4;
                                m827getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m827getLambda1$material_release();
                                startRestartGroup.endDefaults();
                                SurfaceKt.m988SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, j5, j6, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, -1961746365, true, new Function2() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                                    public final void invoke(@Nullable Composer composer2, int i11) {
                                        if ((i11 & 11) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        final Function2 function24 = Function2.this;
                                        final Function2 function25 = m827getLambda1$material_release;
                                        final Function3 function34 = composableLambda;
                                        final int i12 = i7;
                                        composer2.startReplaceableGroup(1618982084);
                                        boolean changed = composer2.changed(function24) | composer2.changed(function25) | composer2.changed(function34);
                                        Object rememberedValue = composer2.rememberedValue();
                                        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = new Function2() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                    return m1025invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                                                }

                                                @NotNull
                                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                public final MeasureResult m1025invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                                                    Object next;
                                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                                    final int m2487getMaxWidthimpl = Constraints.m2487getMaxWidthimpl(j9);
                                                    List subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, Function2.this);
                                                    int size = subcompose.size();
                                                    final int i13 = m2487getMaxWidthimpl / size;
                                                    List list = subcompose;
                                                    final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                                    Iterator it = list.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList.add(((Measurable) it.next()).mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j9, i13, i13, 0, 0, 12, null)));
                                                    }
                                                    Iterator it2 = arrayList.iterator();
                                                    if (it2.hasNext()) {
                                                        next = it2.next();
                                                        if (it2.hasNext()) {
                                                            int height = ((Placeable) next).getHeight();
                                                            do {
                                                                Object next2 = it2.next();
                                                                int height2 = ((Placeable) next2).getHeight();
                                                                if (height < height2) {
                                                                    next = next2;
                                                                    height = height2;
                                                                }
                                                            } while (it2.hasNext());
                                                        }
                                                    } else {
                                                        next = null;
                                                    }
                                                    Placeable placeable = (Placeable) next;
                                                    int height3 = placeable != null ? placeable.getHeight() : 0;
                                                    final ArrayList arrayList2 = new ArrayList(size);
                                                    for (int i14 = 0; i14 < size; i14++) {
                                                        arrayList2.add(new TabPosition(Dp.m2507constructorimpl(SubcomposeLayout.mo268toDpu2uoSUM(i13) * i14), SubcomposeLayout.mo268toDpu2uoSUM(i13), null));
                                                    }
                                                    final Function2 function26 = function25;
                                                    final Function3 function35 = function34;
                                                    final int i15 = i12;
                                                    final int i16 = height3;
                                                    return MeasureScope.layout$default(SubcomposeLayout, m2487getMaxWidthimpl, height3, null, new Function1() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                            invoke((Placeable.PlacementScope) obj);
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                            List<Placeable> list2 = arrayList;
                                                            int i17 = i13;
                                                            int i18 = 0;
                                                            for (Object obj : list2) {
                                                                int i19 = i18 + 1;
                                                                if (i18 < 0) {
                                                                    CollectionsKt.throwIndexOverflow();
                                                                }
                                                                Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i18 * i17, 0, 0.0f, 4, null);
                                                                i18 = i19;
                                                            }
                                                            List subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                                            long j10 = j9;
                                                            int i20 = i16;
                                                            Iterator it3 = subcompose2.iterator();
                                                            while (it3.hasNext()) {
                                                                Placeable mo1944measureBRTryo0 = ((Measurable) it3.next()).mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
                                                                Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo0, 0, i20 - mo1944measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                                i20 = i20;
                                                                j10 = j10;
                                                            }
                                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                            TabSlots tabSlots = TabSlots.Indicator;
                                                            final Function3 function36 = function35;
                                                            final List<TabPosition> list3 = arrayList2;
                                                            final int i21 = i15;
                                                            List subcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                                    invoke((Composer) obj2, ((Number) obj3).intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                @Composable
                                                                public final void invoke(@Nullable Composer composer3, int i22) {
                                                                    if ((i22 & 11) == 2 && composer3.getSkipping()) {
                                                                        composer3.skipToGroupEnd();
                                                                    } else {
                                                                        Function3.this.invoke(list3, composer3, Integer.valueOf(((i21 >> 9) & 112) | 8));
                                                                    }
                                                                }
                                                            }));
                                                            int i22 = m2487getMaxWidthimpl;
                                                            int i23 = i16;
                                                            Iterator it4 = subcompose3.iterator();
                                                            while (it4.hasNext()) {
                                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo1944measureBRTryo0(Constraints.INSTANCE.m2495fixedJhjzzOo(i22, i23)), 0, 0, 0.0f, 4, null);
                                                            }
                                                        }
                                                    }, 4, null);
                                                }
                                            };
                                            composer2.updateRememberedValue(rememberedValue);
                                        }
                                        composer2.endReplaceableGroup();
                                        SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (Function2) rememberedValue, composer2, 6, 0);
                                    }
                                }), startRestartGroup, (i7 & 896) | 1572864 | (i7 & 7168), 50);
                                Function3 function34 = composableLambda;
                                function23 = m827getLambda1$material_release;
                                modifier3 = modifier2;
                                j7 = j5;
                                j8 = j6;
                                function33 = function34;
                            } else {
                                i7 = i4;
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
                            i7 = i4;
                            j5 = j3;
                            j6 = j4;
                            composableLambda = function32;
                        }
                        m827getLambda1$material_release = function22;
                        startRestartGroup.endDefaults();
                        SurfaceKt.m988SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, j5, j6, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, -1961746365, true, new Function2() { // from class: androidx.compose.material.TabRowKt$TabRow$2
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
                            public final void invoke(@Nullable Composer composer2, int i11) {
                                if ((i11 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                final Function2 function24 = Function2.this;
                                final Function2 function25 = m827getLambda1$material_release;
                                final Function3 function342 = composableLambda;
                                final int i12 = i7;
                                composer2.startReplaceableGroup(1618982084);
                                boolean changed = composer2.changed(function24) | composer2.changed(function25) | composer2.changed(function342);
                                Object rememberedValue = composer2.rememberedValue();
                                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function2() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            return m1025invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                                        }

                                        @NotNull
                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                        public final MeasureResult m1025invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                                            Object next;
                                            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                            final int m2487getMaxWidthimpl = Constraints.m2487getMaxWidthimpl(j9);
                                            List subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, Function2.this);
                                            int size = subcompose.size();
                                            final int i13 = m2487getMaxWidthimpl / size;
                                            List list = subcompose;
                                            final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                            Iterator it = list.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((Measurable) it.next()).mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j9, i13, i13, 0, 0, 12, null)));
                                            }
                                            Iterator it2 = arrayList.iterator();
                                            if (it2.hasNext()) {
                                                next = it2.next();
                                                if (it2.hasNext()) {
                                                    int height = ((Placeable) next).getHeight();
                                                    do {
                                                        Object next2 = it2.next();
                                                        int height2 = ((Placeable) next2).getHeight();
                                                        if (height < height2) {
                                                            next = next2;
                                                            height = height2;
                                                        }
                                                    } while (it2.hasNext());
                                                }
                                            } else {
                                                next = null;
                                            }
                                            Placeable placeable = (Placeable) next;
                                            int height3 = placeable != null ? placeable.getHeight() : 0;
                                            final List<TabPosition> arrayList2 = new ArrayList(size);
                                            for (int i14 = 0; i14 < size; i14++) {
                                                arrayList2.add(new TabPosition(Dp.m2507constructorimpl(SubcomposeLayout.mo268toDpu2uoSUM(i13) * i14), SubcomposeLayout.mo268toDpu2uoSUM(i13), null));
                                            }
                                            final Function2 function26 = function25;
                                            final Function3 function35 = function342;
                                            final int i15 = i12;
                                            final int i16 = height3;
                                            return MeasureScope.layout$default(SubcomposeLayout, m2487getMaxWidthimpl, height3, null, new Function1() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                    invoke((Placeable.PlacementScope) obj);
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                    List<Placeable> list2 = arrayList;
                                                    int i17 = i13;
                                                    int i18 = 0;
                                                    for (Object obj : list2) {
                                                        int i19 = i18 + 1;
                                                        if (i18 < 0) {
                                                            CollectionsKt.throwIndexOverflow();
                                                        }
                                                        Placeable.PlacementScope.placeRelative$default(layout, (Placeable) obj, i18 * i17, 0, 0.0f, 4, null);
                                                        i18 = i19;
                                                    }
                                                    List subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                                    long j10 = j9;
                                                    int i20 = i16;
                                                    Iterator it3 = subcompose2.iterator();
                                                    while (it3.hasNext()) {
                                                        Placeable mo1944measureBRTryo0 = ((Measurable) it3.next()).mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
                                                        Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo0, 0, i20 - mo1944measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                        i20 = i20;
                                                        j10 = j10;
                                                    }
                                                    SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final Function3 function36 = function35;
                                                    final List<TabPosition> list3 = arrayList2;
                                                    final int i21 = i15;
                                                    List subcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new Function2() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                                            invoke((Composer) obj2, ((Number) obj3).intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer3, int i22) {
                                                            if ((i22 & 11) == 2 && composer3.getSkipping()) {
                                                                composer3.skipToGroupEnd();
                                                            } else {
                                                                Function3.this.invoke(list3, composer3, Integer.valueOf(((i21 >> 9) & 112) | 8));
                                                            }
                                                        }
                                                    }));
                                                    int i22 = m2487getMaxWidthimpl;
                                                    int i23 = i16;
                                                    Iterator it4 = subcompose3.iterator();
                                                    while (it4.hasNext()) {
                                                        Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it4.next()).mo1944measureBRTryo0(Constraints.INSTANCE.m2495fixedJhjzzOo(i22, i23)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (Function2) rememberedValue, composer2, 6, 0);
                            }
                        }), startRestartGroup, (i7 & 896) | 1572864 | (i7 & 7168), 50);
                        Function3 function342 = composableLambda;
                        function23 = m827getLambda1$material_release;
                        modifier3 = modifier2;
                        j7 = j5;
                        j8 = j6;
                        function33 = function342;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        j7 = j3;
                        j8 = j4;
                        function33 = function32;
                        function23 = function22;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabRowKt$TabRow$3
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
                            TabRowKt.m1023TabRowpAZo6Ak(i, modifier3, j7, j8, function33, function23, tabs, composer2, i2 | 1, i3);
                        }
                    });
                    return;
                }
                function22 = function2;
                if ((i3 & 64) == 0) {
                }
                if ((2995931 & i4) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if ((i3 & 4) == 0) {
                }
                if ((i3 & 8) == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
            }
            function32 = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function22 = function2;
            if ((i3 & 64) == 0) {
            }
            if ((2995931 & i4) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if ((i3 & 4) == 0) {
            }
            if ((i3 & 8) == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
        }
        if ((i2 & 896) != 0) {
        }
        if ((i2 & 7168) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function22 = function2;
        if ((i3 & 64) == 0) {
        }
        if ((2995931 & i4) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a6  */
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1022ScrollableTabRowsKfQg0A(final int i, Modifier modifier, long j, long j2, float f, Function3 function3, Function2 function2, final Function2 tabs, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        int i5;
        float f2;
        int i6;
        Function3 function32;
        int i7;
        Modifier modifier2;
        long j4;
        float m1019getScrollableTabRowPaddingD9Ej5fM;
        Function3 composableLambda;
        int i8;
        Function2 m828getLambda2$material_release;
        final Function2 function22;
        final Modifier modifier3;
        final float f3;
        final long j5;
        final long j6;
        final Function3 function33;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer startRestartGroup = composer.startRestartGroup(-1473476840);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 896) == 0) {
                if ((i3 & 4) == 0 && startRestartGroup.changed(j)) {
                    i11 = 256;
                    i4 |= i11;
                }
                i11 = 128;
                i4 |= i11;
            }
            if ((i2 & 7168) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j2;
                    if (startRestartGroup.changed(j3)) {
                        i10 = 2048;
                        i4 |= i10;
                    }
                } else {
                    j3 = j2;
                }
                i10 = 1024;
                i4 |= i10;
            } else {
                j3 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((458752 & i2) == 0) {
                    function32 = function3;
                    i4 |= startRestartGroup.changed(function32) ? 131072 : 65536;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(function2) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = (29360128 & i2) == 0 ? startRestartGroup.changed(tabs) ? 8388608 : 4194304 : 12582912;
                        if ((23967451 & i4) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i12 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    j4 = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                } else {
                                    j4 = j;
                                }
                                if ((i3 & 8) != 0) {
                                    j3 = ColorsKt.m814contentColorForek8zF_U(j4, startRestartGroup, (i4 >> 6) & 14);
                                    i4 &= -7169;
                                }
                                m1019getScrollableTabRowPaddingD9Ej5fM = i5 != 0 ? TabRowDefaults.INSTANCE.m1019getScrollableTabRowPaddingD9Ej5fM() : f2;
                                composableLambda = i6 != 0 ? ComposableLambdaKt.composableLambda(startRestartGroup, -655609869, true, new Function3() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((List<TabPosition>) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget
                                    @Composable
                                    public final void invoke(@NotNull List<TabPosition> tabPositions, @Nullable Composer composer2, int i13) {
                                        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                        tabRowDefaults.m1017Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    }
                                }) : function32;
                                if (i7 != 0) {
                                    i8 = i4;
                                    m828getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m828getLambda2$material_release();
                                    startRestartGroup.endDefaults();
                                    final float f4 = m1019getScrollableTabRowPaddingD9Ej5fM;
                                    final Function2 function23 = m828getLambda2$material_release;
                                    final Function3 function34 = composableLambda;
                                    final int i13 = i8;
                                    SurfaceKt.m988SurfaceFjzlyU(modifier2, null, j4, j3, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new Function2() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                                        public final void invoke(@Nullable Composer composer2, int i14) {
                                            if ((i14 & 11) != 2 || !composer2.getSkipping()) {
                                                ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                                                composer2.startReplaceableGroup(773894976);
                                                composer2.startReplaceableGroup(-492369756);
                                                Object rememberedValue = composer2.rememberedValue();
                                                Composer.Companion companion = Composer.INSTANCE;
                                                if (rememberedValue == companion.getEmpty()) {
                                                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                                    composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                                                }
                                                composer2.endReplaceableGroup();
                                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                                composer2.endReplaceableGroup();
                                                composer2.startReplaceableGroup(511388516);
                                                boolean changed = composer2.changed(rememberScrollState) | composer2.changed(coroutineScope);
                                                Object rememberedValue2 = composer2.rememberedValue();
                                                if (changed || rememberedValue2 == companion.getEmpty()) {
                                                    rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
                                                    composer2.updateRememberedValue(rememberedValue2);
                                                }
                                                composer2.endReplaceableGroup();
                                                final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                                                Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                                                final float f5 = f4;
                                                final Function2 function24 = tabs;
                                                final Function2 function25 = function23;
                                                final int i15 = i;
                                                final Function3 function35 = function34;
                                                final int i16 = i13;
                                                SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new Function2() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        return m1024invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                                                    }

                                                    @NotNull
                                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                    public final MeasureResult m1024invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j7) {
                                                        float f6;
                                                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                                        f6 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                                        int mo265roundToPx0680j_4 = SubcomposeLayout.mo265roundToPx0680j_4(f6);
                                                        final int mo265roundToPx0680j_42 = SubcomposeLayout.mo265roundToPx0680j_4(f5);
                                                        long m2478copyZbe2FdA$default = Constraints.m2478copyZbe2FdA$default(j7, mo265roundToPx0680j_4, 0, 0, 0, 14, null);
                                                        List subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                                        final ArrayList<Placeable> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                                                        Iterator it = subcompose.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList.add(((Measurable) it.next()).mo1944measureBRTryo0(m2478copyZbe2FdA$default));
                                                        }
                                                        final Ref$IntRef ref$IntRef = new Ref$IntRef();
                                                        ref$IntRef.element = mo265roundToPx0680j_42 * 2;
                                                        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                                        for (Placeable placeable : arrayList) {
                                                            ref$IntRef.element += placeable.getWidth();
                                                            ref$IntRef2.element = Math.max(ref$IntRef2.element, placeable.getHeight());
                                                        }
                                                        int i17 = ref$IntRef.element;
                                                        int i18 = ref$IntRef2.element;
                                                        final Function2 function26 = function25;
                                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                        final int i19 = i15;
                                                        final Function3 function36 = function35;
                                                        final int i20 = i16;
                                                        return MeasureScope.layout$default(SubcomposeLayout, i17, i18, null, new Function1() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                                invoke((Placeable.PlacementScope) obj);
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                                final ArrayList arrayList2 = new ArrayList();
                                                                int i21 = mo265roundToPx0680j_42;
                                                                List<Placeable> list = arrayList;
                                                                SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                                int i22 = i21;
                                                                for (Placeable placeable2 : list) {
                                                                    Placeable.PlacementScope.placeRelative$default(layout, placeable2, i22, 0, 0.0f, 4, null);
                                                                    arrayList2.add(new TabPosition(subcomposeMeasureScope.mo268toDpu2uoSUM(i22), subcomposeMeasureScope.mo268toDpu2uoSUM(placeable2.getWidth()), null));
                                                                    i22 += placeable2.getWidth();
                                                                }
                                                                List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                                                long j8 = j7;
                                                                Ref$IntRef ref$IntRef3 = ref$IntRef;
                                                                Ref$IntRef ref$IntRef4 = ref$IntRef2;
                                                                for (Measurable measurable : subcompose2) {
                                                                    int i23 = ref$IntRef3.element;
                                                                    Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j8, i23, i23, 0, 0, 8, null));
                                                                    Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo0, 0, ref$IntRef4.element - mo1944measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                                    ref$IntRef3 = ref$IntRef3;
                                                                    ref$IntRef4 = ref$IntRef4;
                                                                    j8 = j8;
                                                                }
                                                                SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                                                TabSlots tabSlots = TabSlots.Indicator;
                                                                final Function3 function37 = function36;
                                                                final int i24 = i20;
                                                                List subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    @Composable
                                                                    public final void invoke(@Nullable Composer composer3, int i25) {
                                                                        if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                                            composer3.skipToGroupEnd();
                                                                        } else {
                                                                            Function3.this.invoke(arrayList2, composer3, Integer.valueOf(((i24 >> 12) & 112) | 8));
                                                                        }
                                                                    }
                                                                }));
                                                                Ref$IntRef ref$IntRef5 = ref$IntRef;
                                                                Ref$IntRef ref$IntRef6 = ref$IntRef2;
                                                                Iterator it2 = subcompose3.iterator();
                                                                while (it2.hasNext()) {
                                                                    Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo1944measureBRTryo0(Constraints.INSTANCE.m2495fixedJhjzzOo(ref$IntRef5.element, ref$IntRef6.element)), 0, 0, 0.0f, 4, null);
                                                                }
                                                                scrollableTabData2.onLaidOut(SubcomposeLayout, mo265roundToPx0680j_42, arrayList2, i19);
                                                            }
                                                        }, 4, null);
                                                    }
                                                }, composer2, 0, 0);
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }), startRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
                                    Function3 function35 = composableLambda;
                                    function22 = m828getLambda2$material_release;
                                    modifier3 = modifier2;
                                    long j7 = j3;
                                    f3 = m1019getScrollableTabRowPaddingD9Ej5fM;
                                    j5 = j4;
                                    j6 = j7;
                                    function33 = function35;
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
                                j4 = j;
                                m1019getScrollableTabRowPaddingD9Ej5fM = f2;
                                composableLambda = function32;
                            }
                            i8 = i4;
                            m828getLambda2$material_release = function2;
                            startRestartGroup.endDefaults();
                            final float f42 = m1019getScrollableTabRowPaddingD9Ej5fM;
                            final Function2 function232 = m828getLambda2$material_release;
                            final Function3 function342 = composableLambda;
                            final int i132 = i8;
                            SurfaceKt.m988SurfaceFjzlyU(modifier2, null, j4, j3, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new Function2() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                                public final void invoke(@Nullable Composer composer2, int i14) {
                                    if ((i14 & 11) != 2 || !composer2.getSkipping()) {
                                        ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                                        composer2.startReplaceableGroup(773894976);
                                        composer2.startReplaceableGroup(-492369756);
                                        Object rememberedValue = composer2.rememberedValue();
                                        Composer.Companion companion = Composer.INSTANCE;
                                        if (rememberedValue == companion.getEmpty()) {
                                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                            rememberedValue = compositionScopedCoroutineScopeCanceller;
                                        }
                                        composer2.endReplaceableGroup();
                                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                        composer2.endReplaceableGroup();
                                        composer2.startReplaceableGroup(511388516);
                                        boolean changed = composer2.changed(rememberScrollState) | composer2.changed(coroutineScope);
                                        Object rememberedValue2 = composer2.rememberedValue();
                                        if (changed || rememberedValue2 == companion.getEmpty()) {
                                            rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
                                            composer2.updateRememberedValue(rememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                                        Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                                        final float f5 = f42;
                                        final Function2 function24 = tabs;
                                        final Function2 function25 = function232;
                                        final int i15 = i;
                                        final Function3 function352 = function342;
                                        final int i16 = i132;
                                        SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new Function2() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                return m1024invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                                            }

                                            @NotNull
                                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                            public final MeasureResult m1024invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j72) {
                                                float f6;
                                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                                f6 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                                int mo265roundToPx0680j_4 = SubcomposeLayout.mo265roundToPx0680j_4(f6);
                                                final int mo265roundToPx0680j_42 = SubcomposeLayout.mo265roundToPx0680j_4(f5);
                                                long m2478copyZbe2FdA$default = Constraints.m2478copyZbe2FdA$default(j72, mo265roundToPx0680j_4, 0, 0, 0, 14, null);
                                                List subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                                final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                                                Iterator it = subcompose.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(((Measurable) it.next()).mo1944measureBRTryo0(m2478copyZbe2FdA$default));
                                                }
                                                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                                                ref$IntRef.element = mo265roundToPx0680j_42 * 2;
                                                final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                                for (Placeable placeable : arrayList) {
                                                    ref$IntRef.element += placeable.getWidth();
                                                    ref$IntRef2.element = Math.max(ref$IntRef2.element, placeable.getHeight());
                                                }
                                                int i17 = ref$IntRef.element;
                                                int i18 = ref$IntRef2.element;
                                                final Function2 function26 = function25;
                                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                final int i19 = i15;
                                                final Function3 function36 = function352;
                                                final int i20 = i16;
                                                return MeasureScope.layout$default(SubcomposeLayout, i17, i18, null, new Function1() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        invoke((Placeable.PlacementScope) obj);
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                        final List<TabPosition> arrayList2 = new ArrayList();
                                                        int i21 = mo265roundToPx0680j_42;
                                                        List<Placeable> list = arrayList;
                                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                        int i22 = i21;
                                                        for (Placeable placeable2 : list) {
                                                            Placeable.PlacementScope.placeRelative$default(layout, placeable2, i22, 0, 0.0f, 4, null);
                                                            arrayList2.add(new TabPosition(subcomposeMeasureScope.mo268toDpu2uoSUM(i22), subcomposeMeasureScope.mo268toDpu2uoSUM(placeable2.getWidth()), null));
                                                            i22 += placeable2.getWidth();
                                                        }
                                                        List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                                        long j8 = j72;
                                                        Ref$IntRef ref$IntRef3 = ref$IntRef;
                                                        Ref$IntRef ref$IntRef4 = ref$IntRef2;
                                                        for (Measurable measurable : subcompose2) {
                                                            int i23 = ref$IntRef3.element;
                                                            Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j8, i23, i23, 0, 0, 8, null));
                                                            Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo0, 0, ref$IntRef4.element - mo1944measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                            ref$IntRef3 = ref$IntRef3;
                                                            ref$IntRef4 = ref$IntRef4;
                                                            j8 = j8;
                                                        }
                                                        SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                                        TabSlots tabSlots = TabSlots.Indicator;
                                                        final Function3 function37 = function36;
                                                        final int i24 = i20;
                                                        List subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            @Composable
                                                            public final void invoke(@Nullable Composer composer3, int i25) {
                                                                if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                                    composer3.skipToGroupEnd();
                                                                } else {
                                                                    Function3.this.invoke(arrayList2, composer3, Integer.valueOf(((i24 >> 12) & 112) | 8));
                                                                }
                                                            }
                                                        }));
                                                        Ref$IntRef ref$IntRef5 = ref$IntRef;
                                                        Ref$IntRef ref$IntRef6 = ref$IntRef2;
                                                        Iterator it2 = subcompose3.iterator();
                                                        while (it2.hasNext()) {
                                                            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo1944measureBRTryo0(Constraints.INSTANCE.m2495fixedJhjzzOo(ref$IntRef5.element, ref$IntRef6.element)), 0, 0, 0.0f, 4, null);
                                                        }
                                                        scrollableTabData2.onLaidOut(SubcomposeLayout, mo265roundToPx0680j_42, arrayList2, i19);
                                                    }
                                                }, 4, null);
                                            }
                                        }, composer2, 0, 0);
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), startRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
                            Function3 function352 = composableLambda;
                            function22 = m828getLambda2$material_release;
                            modifier3 = modifier2;
                            long j72 = j3;
                            f3 = m1019getScrollableTabRowPaddingD9Ej5fM;
                            j5 = j4;
                            j6 = j72;
                            function33 = function352;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            j5 = j;
                            function22 = function2;
                            j6 = j3;
                            f3 = f2;
                            function33 = function32;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i14) {
                                TabRowKt.m1022ScrollableTabRowsKfQg0A(i, modifier3, j5, j6, f3, function33, function22, tabs, composer2, i2 | 1, i3);
                            }
                        });
                        return;
                    }
                    i4 |= i9;
                    if ((23967451 & i4) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i12 != 0) {
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
                    i8 = i4;
                    m828getLambda2$material_release = function2;
                    startRestartGroup.endDefaults();
                    final float f422 = m1019getScrollableTabRowPaddingD9Ej5fM;
                    final Function2 function2322 = m828getLambda2$material_release;
                    final Function3 function3422 = composableLambda;
                    final int i1322 = i8;
                    SurfaceKt.m988SurfaceFjzlyU(modifier2, null, j4, j3, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new Function2() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                        public final void invoke(@Nullable Composer composer2, int i14) {
                            if ((i14 & 11) != 2 || !composer2.getSkipping()) {
                                ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                                composer2.startReplaceableGroup(773894976);
                                composer2.startReplaceableGroup(-492369756);
                                Object rememberedValue = composer2.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (rememberedValue == companion.getEmpty()) {
                                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                    composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                                }
                                composer2.endReplaceableGroup();
                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(511388516);
                                boolean changed = composer2.changed(rememberScrollState) | composer2.changed(coroutineScope);
                                Object rememberedValue2 = composer2.rememberedValue();
                                if (changed || rememberedValue2 == companion.getEmpty()) {
                                    rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
                                    composer2.updateRememberedValue(rememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                                Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                                final float f5 = f422;
                                final Function2 function24 = tabs;
                                final Function2 function25 = function2322;
                                final int i15 = i;
                                final Function3 function3522 = function3422;
                                final int i16 = i1322;
                                SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new Function2() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        return m1024invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                                    }

                                    @NotNull
                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final MeasureResult m1024invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j722) {
                                        float f6;
                                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                        f6 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                        int mo265roundToPx0680j_4 = SubcomposeLayout.mo265roundToPx0680j_4(f6);
                                        final int mo265roundToPx0680j_42 = SubcomposeLayout.mo265roundToPx0680j_4(f5);
                                        long m2478copyZbe2FdA$default = Constraints.m2478copyZbe2FdA$default(j722, mo265roundToPx0680j_4, 0, 0, 0, 14, null);
                                        List subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                        final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                                        Iterator it = subcompose.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((Measurable) it.next()).mo1944measureBRTryo0(m2478copyZbe2FdA$default));
                                        }
                                        final Ref$IntRef ref$IntRef = new Ref$IntRef();
                                        ref$IntRef.element = mo265roundToPx0680j_42 * 2;
                                        final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                        for (Placeable placeable : arrayList) {
                                            ref$IntRef.element += placeable.getWidth();
                                            ref$IntRef2.element = Math.max(ref$IntRef2.element, placeable.getHeight());
                                        }
                                        int i17 = ref$IntRef.element;
                                        int i18 = ref$IntRef2.element;
                                        final Function2 function26 = function25;
                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                        final int i19 = i15;
                                        final Function3 function36 = function3522;
                                        final int i20 = i16;
                                        return MeasureScope.layout$default(SubcomposeLayout, i17, i18, null, new Function1() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                invoke((Placeable.PlacementScope) obj);
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                final List<TabPosition> arrayList2 = new ArrayList();
                                                int i21 = mo265roundToPx0680j_42;
                                                List<Placeable> list = arrayList;
                                                SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                int i22 = i21;
                                                for (Placeable placeable2 : list) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeable2, i22, 0, 0.0f, 4, null);
                                                    arrayList2.add(new TabPosition(subcomposeMeasureScope.mo268toDpu2uoSUM(i22), subcomposeMeasureScope.mo268toDpu2uoSUM(placeable2.getWidth()), null));
                                                    i22 += placeable2.getWidth();
                                                }
                                                List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                                long j8 = j722;
                                                Ref$IntRef ref$IntRef3 = ref$IntRef;
                                                Ref$IntRef ref$IntRef4 = ref$IntRef2;
                                                for (Measurable measurable : subcompose2) {
                                                    int i23 = ref$IntRef3.element;
                                                    Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j8, i23, i23, 0, 0, 8, null));
                                                    Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo0, 0, ref$IntRef4.element - mo1944measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    ref$IntRef3 = ref$IntRef3;
                                                    ref$IntRef4 = ref$IntRef4;
                                                    j8 = j8;
                                                }
                                                SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final Function3 function37 = function36;
                                                final int i24 = i20;
                                                List subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    @Composable
                                                    public final void invoke(@Nullable Composer composer3, int i25) {
                                                        if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                        } else {
                                                            Function3.this.invoke(arrayList2, composer3, Integer.valueOf(((i24 >> 12) & 112) | 8));
                                                        }
                                                    }
                                                }));
                                                Ref$IntRef ref$IntRef5 = ref$IntRef;
                                                Ref$IntRef ref$IntRef6 = ref$IntRef2;
                                                Iterator it2 = subcompose3.iterator();
                                                while (it2.hasNext()) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo1944measureBRTryo0(Constraints.INSTANCE.m2495fixedJhjzzOo(ref$IntRef5.element, ref$IntRef6.element)), 0, 0, 0.0f, 4, null);
                                                }
                                                scrollableTabData2.onLaidOut(SubcomposeLayout, mo265roundToPx0680j_42, arrayList2, i19);
                                            }
                                        }, 4, null);
                                    }
                                }, composer2, 0, 0);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
                    Function3 function3522 = composableLambda;
                    function22 = m828getLambda2$material_release;
                    modifier3 = modifier2;
                    long j722 = j3;
                    f3 = m1019getScrollableTabRowPaddingD9Ej5fM;
                    j5 = j4;
                    j6 = j722;
                    function33 = function3522;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function32 = function3;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                i4 |= i9;
                if ((23967451 & i4) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i12 != 0) {
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
                i8 = i4;
                m828getLambda2$material_release = function2;
                startRestartGroup.endDefaults();
                final float f4222 = m1019getScrollableTabRowPaddingD9Ej5fM;
                final Function2 function23222 = m828getLambda2$material_release;
                final Function3 function34222 = composableLambda;
                final int i13222 = i8;
                SurfaceKt.m988SurfaceFjzlyU(modifier2, null, j4, j3, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new Function2() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                    public final void invoke(@Nullable Composer composer2, int i14) {
                        if ((i14 & 11) != 2 || !composer2.getSkipping()) {
                            ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                            composer2.startReplaceableGroup(773894976);
                            composer2.startReplaceableGroup(-492369756);
                            Object rememberedValue = composer2.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (rememberedValue == companion.getEmpty()) {
                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composer2.endReplaceableGroup();
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(511388516);
                            boolean changed = composer2.changed(rememberScrollState) | composer2.changed(coroutineScope);
                            Object rememberedValue2 = composer2.rememberedValue();
                            if (changed || rememberedValue2 == companion.getEmpty()) {
                                rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
                                composer2.updateRememberedValue(rememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                            Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                            final float f5 = f4222;
                            final Function2 function24 = tabs;
                            final Function2 function25 = function23222;
                            final int i15 = i;
                            final Function3 function35222 = function34222;
                            final int i16 = i13222;
                            SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new Function2() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    return m1024invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                                }

                                @NotNull
                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final MeasureResult m1024invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j7222) {
                                    float f6;
                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    f6 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                    int mo265roundToPx0680j_4 = SubcomposeLayout.mo265roundToPx0680j_4(f6);
                                    final int mo265roundToPx0680j_42 = SubcomposeLayout.mo265roundToPx0680j_4(f5);
                                    long m2478copyZbe2FdA$default = Constraints.m2478copyZbe2FdA$default(j7222, mo265roundToPx0680j_4, 0, 0, 0, 14, null);
                                    List subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                    final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                                    Iterator it = subcompose.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Measurable) it.next()).mo1944measureBRTryo0(m2478copyZbe2FdA$default));
                                    }
                                    final Ref$IntRef ref$IntRef = new Ref$IntRef();
                                    ref$IntRef.element = mo265roundToPx0680j_42 * 2;
                                    final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                    for (Placeable placeable : arrayList) {
                                        ref$IntRef.element += placeable.getWidth();
                                        ref$IntRef2.element = Math.max(ref$IntRef2.element, placeable.getHeight());
                                    }
                                    int i17 = ref$IntRef.element;
                                    int i18 = ref$IntRef2.element;
                                    final Function2 function26 = function25;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i19 = i15;
                                    final Function3 function36 = function35222;
                                    final int i20 = i16;
                                    return MeasureScope.layout$default(SubcomposeLayout, i17, i18, null, new Function1() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((Placeable.PlacementScope) obj);
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                            final List<TabPosition> arrayList2 = new ArrayList();
                                            int i21 = mo265roundToPx0680j_42;
                                            List<Placeable> list = arrayList;
                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            int i22 = i21;
                                            for (Placeable placeable2 : list) {
                                                Placeable.PlacementScope.placeRelative$default(layout, placeable2, i22, 0, 0.0f, 4, null);
                                                arrayList2.add(new TabPosition(subcomposeMeasureScope.mo268toDpu2uoSUM(i22), subcomposeMeasureScope.mo268toDpu2uoSUM(placeable2.getWidth()), null));
                                                i22 += placeable2.getWidth();
                                            }
                                            List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                            long j8 = j7222;
                                            Ref$IntRef ref$IntRef3 = ref$IntRef;
                                            Ref$IntRef ref$IntRef4 = ref$IntRef2;
                                            for (Measurable measurable : subcompose2) {
                                                int i23 = ref$IntRef3.element;
                                                Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j8, i23, i23, 0, 0, 8, null));
                                                Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo0, 0, ref$IntRef4.element - mo1944measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                ref$IntRef3 = ref$IntRef3;
                                                ref$IntRef4 = ref$IntRef4;
                                                j8 = j8;
                                            }
                                            SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final Function3 function37 = function36;
                                            final int i24 = i20;
                                            List subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @Composable
                                                public final void invoke(@Nullable Composer composer3, int i25) {
                                                    if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                    } else {
                                                        Function3.this.invoke(arrayList2, composer3, Integer.valueOf(((i24 >> 12) & 112) | 8));
                                                    }
                                                }
                                            }));
                                            Ref$IntRef ref$IntRef5 = ref$IntRef;
                                            Ref$IntRef ref$IntRef6 = ref$IntRef2;
                                            Iterator it2 = subcompose3.iterator();
                                            while (it2.hasNext()) {
                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo1944measureBRTryo0(Constraints.INSTANCE.m2495fixedJhjzzOo(ref$IntRef5.element, ref$IntRef6.element)), 0, 0, 0.0f, 4, null);
                                            }
                                            scrollableTabData2.onLaidOut(SubcomposeLayout, mo265roundToPx0680j_42, arrayList2, i19);
                                        }
                                    }, 4, null);
                                }
                            }, composer2, 0, 0);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
                Function3 function35222 = composableLambda;
                function22 = m828getLambda2$material_release;
                modifier3 = modifier2;
                long j7222 = j3;
                f3 = m1019getScrollableTabRowPaddingD9Ej5fM;
                j5 = j4;
                j6 = j7222;
                function33 = function35222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
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
            if ((i3 & 128) != 0) {
            }
            i4 |= i9;
            if ((23967451 & i4) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i12 != 0) {
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
            i8 = i4;
            m828getLambda2$material_release = function2;
            startRestartGroup.endDefaults();
            final float f42222 = m1019getScrollableTabRowPaddingD9Ej5fM;
            final Function2 function232222 = m828getLambda2$material_release;
            final Function3 function342222 = composableLambda;
            final int i132222 = i8;
            SurfaceKt.m988SurfaceFjzlyU(modifier2, null, j4, j3, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new Function2() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
                public final void invoke(@Nullable Composer composer2, int i14) {
                    if ((i14 & 11) != 2 || !composer2.getSkipping()) {
                        ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        composer2.startReplaceableGroup(773894976);
                        composer2.startReplaceableGroup(-492369756);
                        Object rememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (rememberedValue == companion.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            rememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composer2.endReplaceableGroup();
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(511388516);
                        boolean changed = composer2.changed(rememberScrollState) | composer2.changed(coroutineScope);
                        Object rememberedValue2 = composer2.rememberedValue();
                        if (changed || rememberedValue2 == companion.getEmpty()) {
                            rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                        Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                        final float f5 = f42222;
                        final Function2 function24 = tabs;
                        final Function2 function25 = function232222;
                        final int i15 = i;
                        final Function3 function352222 = function342222;
                        final int i16 = i132222;
                        SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new Function2() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                return m1024invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                            }

                            @NotNull
                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m1024invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j72222) {
                                float f6;
                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                f6 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                                int mo265roundToPx0680j_4 = SubcomposeLayout.mo265roundToPx0680j_4(f6);
                                final int mo265roundToPx0680j_42 = SubcomposeLayout.mo265roundToPx0680j_4(f5);
                                long m2478copyZbe2FdA$default = Constraints.m2478copyZbe2FdA$default(j72222, mo265roundToPx0680j_4, 0, 0, 0, 14, null);
                                List subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                                Iterator it = subcompose.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((Measurable) it.next()).mo1944measureBRTryo0(m2478copyZbe2FdA$default));
                                }
                                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                                ref$IntRef.element = mo265roundToPx0680j_42 * 2;
                                final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                for (Placeable placeable : arrayList) {
                                    ref$IntRef.element += placeable.getWidth();
                                    ref$IntRef2.element = Math.max(ref$IntRef2.element, placeable.getHeight());
                                }
                                int i17 = ref$IntRef.element;
                                int i18 = ref$IntRef2.element;
                                final Function2 function26 = function25;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i19 = i15;
                                final Function3 function36 = function352222;
                                final int i20 = i16;
                                return MeasureScope.layout$default(SubcomposeLayout, i17, i18, null, new Function1() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((Placeable.PlacementScope) obj);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int i21 = mo265roundToPx0680j_42;
                                        List<Placeable> list = arrayList;
                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                        int i22 = i21;
                                        for (Placeable placeable2 : list) {
                                            Placeable.PlacementScope.placeRelative$default(layout, placeable2, i22, 0, 0.0f, 4, null);
                                            arrayList2.add(new TabPosition(subcomposeMeasureScope.mo268toDpu2uoSUM(i22), subcomposeMeasureScope.mo268toDpu2uoSUM(placeable2.getWidth()), null));
                                            i22 += placeable2.getWidth();
                                        }
                                        List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                        long j8 = j72222;
                                        Ref$IntRef ref$IntRef3 = ref$IntRef;
                                        Ref$IntRef ref$IntRef4 = ref$IntRef2;
                                        for (Measurable measurable : subcompose2) {
                                            int i23 = ref$IntRef3.element;
                                            Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j8, i23, i23, 0, 0, 8, null));
                                            Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo0, 0, ref$IntRef4.element - mo1944measureBRTryo0.getHeight(), 0.0f, 4, null);
                                            ref$IntRef3 = ref$IntRef3;
                                            ref$IntRef4 = ref$IntRef4;
                                            j8 = j8;
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3 function37 = function36;
                                        final int i24 = i20;
                                        List subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i25) {
                                                if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                } else {
                                                    Function3.this.invoke(arrayList2, composer3, Integer.valueOf(((i24 >> 12) & 112) | 8));
                                                }
                                            }
                                        }));
                                        Ref$IntRef ref$IntRef5 = ref$IntRef;
                                        Ref$IntRef ref$IntRef6 = ref$IntRef2;
                                        Iterator it2 = subcompose3.iterator();
                                        while (it2.hasNext()) {
                                            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo1944measureBRTryo0(Constraints.INSTANCE.m2495fixedJhjzzOo(ref$IntRef5.element, ref$IntRef6.element)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut(SubcomposeLayout, mo265roundToPx0680j_42, arrayList2, i19);
                                    }
                                }, 4, null);
                            }
                        }, composer2, 0, 0);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
            Function3 function352222 = composableLambda;
            function22 = m828getLambda2$material_release;
            modifier3 = modifier2;
            long j72222 = j3;
            f3 = m1019getScrollableTabRowPaddingD9Ej5fM;
            j5 = j4;
            j6 = j72222;
            function33 = function352222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 896) == 0) {
        }
        if ((i2 & 7168) != 0) {
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
        if ((i3 & 128) != 0) {
        }
        i4 |= i9;
        if ((23967451 & i4) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i12 != 0) {
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
        i8 = i4;
        m828getLambda2$material_release = function2;
        startRestartGroup.endDefaults();
        final float f422222 = m1019getScrollableTabRowPaddingD9Ej5fM;
        final Function2 function2322222 = m828getLambda2$material_release;
        final Function3 function3422222 = composableLambda;
        final int i1322222 = i8;
        SurfaceKt.m988SurfaceFjzlyU(modifier2, null, j4, j3, null, 0.0f, ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new Function2() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
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
            public final void invoke(@Nullable Composer composer2, int i14) {
                if ((i14 & 11) != 2 || !composer2.getSkipping()) {
                    ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                    composer2.startReplaceableGroup(773894976);
                    composer2.startReplaceableGroup(-492369756);
                    Object rememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (rememberedValue == companion.getEmpty()) {
                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    composer2.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(511388516);
                    boolean changed = composer2.changed(rememberScrollState) | composer2.changed(coroutineScope);
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changed || rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                    Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                    final float f5 = f422222;
                    final Function2 function24 = tabs;
                    final Function2 function25 = function2322222;
                    final int i15 = i;
                    final Function3 function3522222 = function3422222;
                    final int i16 = i1322222;
                    SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new Function2() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return m1024invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).getValue());
                        }

                        @NotNull
                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                        public final MeasureResult m1024invoke0kLqBqw(@NotNull final SubcomposeMeasureScope SubcomposeLayout, final long j722222) {
                            float f6;
                            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                            f6 = TabRowKt.ScrollableTabRowMinimumTabWidth;
                            int mo265roundToPx0680j_4 = SubcomposeLayout.mo265roundToPx0680j_4(f6);
                            final int mo265roundToPx0680j_42 = SubcomposeLayout.mo265roundToPx0680j_4(f5);
                            long m2478copyZbe2FdA$default = Constraints.m2478copyZbe2FdA$default(j722222, mo265roundToPx0680j_4, 0, 0, 0, 14, null);
                            List subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                            final List<? extends Placeable> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                            Iterator it = subcompose.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((Measurable) it.next()).mo1944measureBRTryo0(m2478copyZbe2FdA$default));
                            }
                            final Ref$IntRef ref$IntRef = new Ref$IntRef();
                            ref$IntRef.element = mo265roundToPx0680j_42 * 2;
                            final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                            for (Placeable placeable : arrayList) {
                                ref$IntRef.element += placeable.getWidth();
                                ref$IntRef2.element = Math.max(ref$IntRef2.element, placeable.getHeight());
                            }
                            int i17 = ref$IntRef.element;
                            int i18 = ref$IntRef2.element;
                            final Function2 function26 = function25;
                            final ScrollableTabData scrollableTabData2 = scrollableTabData;
                            final int i19 = i15;
                            final Function3 function36 = function3522222;
                            final int i20 = i16;
                            return MeasureScope.layout$default(SubcomposeLayout, i17, i18, null, new Function1() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((Placeable.PlacementScope) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                    final List<TabPosition> arrayList2 = new ArrayList();
                                    int i21 = mo265roundToPx0680j_42;
                                    List<Placeable> list = arrayList;
                                    SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                    int i22 = i21;
                                    for (Placeable placeable2 : list) {
                                        Placeable.PlacementScope.placeRelative$default(layout, placeable2, i22, 0, 0.0f, 4, null);
                                        arrayList2.add(new TabPosition(subcomposeMeasureScope.mo268toDpu2uoSUM(i22), subcomposeMeasureScope.mo268toDpu2uoSUM(placeable2.getWidth()), null));
                                        i22 += placeable2.getWidth();
                                    }
                                    List<Measurable> subcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                    long j8 = j722222;
                                    Ref$IntRef ref$IntRef3 = ref$IntRef;
                                    Ref$IntRef ref$IntRef4 = ref$IntRef2;
                                    for (Measurable measurable : subcompose2) {
                                        int i23 = ref$IntRef3.element;
                                        Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(Constraints.m2478copyZbe2FdA$default(j8, i23, i23, 0, 0, 8, null));
                                        Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo0, 0, ref$IntRef4.element - mo1944measureBRTryo0.getHeight(), 0.0f, 4, null);
                                        ref$IntRef3 = ref$IntRef3;
                                        ref$IntRef4 = ref$IntRef4;
                                        j8 = j8;
                                    }
                                    SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                    TabSlots tabSlots = TabSlots.Indicator;
                                    final Function3 function37 = function36;
                                    final int i24 = i20;
                                    List subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(230769237, true, new Function2() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @Composable
                                        public final void invoke(@Nullable Composer composer3, int i25) {
                                            if ((i25 & 11) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                            } else {
                                                Function3.this.invoke(arrayList2, composer3, Integer.valueOf(((i24 >> 12) & 112) | 8));
                                            }
                                        }
                                    }));
                                    Ref$IntRef ref$IntRef5 = ref$IntRef;
                                    Ref$IntRef ref$IntRef6 = ref$IntRef2;
                                    Iterator it2 = subcompose3.iterator();
                                    while (it2.hasNext()) {
                                        Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it2.next()).mo1944measureBRTryo0(Constraints.INSTANCE.m2495fixedJhjzzOo(ref$IntRef5.element, ref$IntRef6.element)), 0, 0, 0.0f, 4, null);
                                    }
                                    scrollableTabData2.onLaidOut(SubcomposeLayout, mo265roundToPx0680j_42, arrayList2, i19);
                                }
                            }, 4, null);
                        }
                    }, composer2, 0, 0);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
        Function3 function3522222 = composableLambda;
        function22 = m828getLambda2$material_release;
        modifier3 = modifier2;
        long j722222 = j3;
        f3 = m1019getScrollableTabRowPaddingD9Ej5fM;
        j5 = j4;
        j6 = j722222;
        function33 = function3522222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
