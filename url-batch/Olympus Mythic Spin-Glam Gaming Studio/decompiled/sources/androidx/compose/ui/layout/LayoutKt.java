package androidx.compose.ui.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Layout.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0086\u0002\u0010\u0017\u001a\u00020\u00012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032(\u0010\u000b\u001a$\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0005j\u0002`\n2(\u0010\f\u001a$\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0005j\u0002`\n2(\u0010\r\u001a$\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0005j\u0002`\n2(\u0010\u000e\u001a$\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0005j\u0002`\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2(\u0010\u0016\u001a$\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0007\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0005j\u0002`\u0015H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u001c\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010 \u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "content", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "Landroidx/compose/ui/layout/IntrinsicMeasureBlock;", "minIntrinsicWidthMeasureBlock", "minIntrinsicHeightMeasureBlock", "maxIntrinsicWidthMeasureBlock", "maxIntrinsicHeightMeasureBlock", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureBlock;", "measureBlock", "Layout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/SkippableUpdater;", "Landroidx/compose/ui/node/ComposeUiNode;", "materializerOf", "(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "MultiMeasureLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LayoutKt {
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Layout(final Function2 content, final Function3 minIntrinsicWidthMeasureBlock, final Function3 minIntrinsicHeightMeasureBlock, final Function3 maxIntrinsicWidthMeasureBlock, final Function3 maxIntrinsicHeightMeasureBlock, Modifier modifier, final Function3 measureBlock, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(minIntrinsicWidthMeasureBlock, "minIntrinsicWidthMeasureBlock");
        Intrinsics.checkNotNullParameter(minIntrinsicHeightMeasureBlock, "minIntrinsicHeightMeasureBlock");
        Intrinsics.checkNotNullParameter(maxIntrinsicWidthMeasureBlock, "maxIntrinsicWidthMeasureBlock");
        Intrinsics.checkNotNullParameter(maxIntrinsicHeightMeasureBlock, "maxIntrinsicHeightMeasureBlock");
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        Composer startRestartGroup = composer.startRestartGroup(1164819031);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(minIntrinsicWidthMeasureBlock) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(minIntrinsicHeightMeasureBlock) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(maxIntrinsicWidthMeasureBlock) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changed(maxIntrinsicHeightMeasureBlock) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else if ((458752 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if ((i2 & 64) != 0) {
                i5 = (3670016 & i) == 0 ? startRestartGroup.changed(measureBlock) ? 1048576 : 524288 : 1572864;
                i4 = i3;
                if ((2995931 & i4) == 599186 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public MeasureResult mo37measure3p2s80s(MeasureScope measure, List measurables, long j) {
                            Intrinsics.checkNotNullParameter(measure, "$this$measure");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            return (MeasureResult) Function3.this.invoke(measure, measurables, Constraints.m2475boximpl(j));
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i7) {
                            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            return ((Number) minIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i7))).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i7) {
                            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            return ((Number) minIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i7))).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i7) {
                            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            return ((Number) maxIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i7))).intValue();
                        }

                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i7) {
                            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                            Intrinsics.checkNotNullParameter(measurables, "measurables");
                            return ((Number) maxIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i7))).intValue();
                        }
                    };
                    int i7 = (i4 & 14) | ((i4 >> 12) & 112);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 constructor = companion.getConstructor();
                    Function3 materializerOf = materializerOf(modifier4);
                    int i8 = ((i7 << 9) & 7168) | 6;
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
                    Updater.m1153setimpl(m1149constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
                    Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
                    Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    content.invoke(startRestartGroup, Integer.valueOf((i8 >> 9) & 14));
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i9) {
                        LayoutKt.Layout(Function2.this, minIntrinsicWidthMeasureBlock, minIntrinsicHeightMeasureBlock, maxIntrinsicWidthMeasureBlock, maxIntrinsicHeightMeasureBlock, modifier3, measureBlock, composer2, i | 1, i2);
                    }
                });
                return;
            }
            i3 |= i5;
            i4 = i3;
            if ((2995931 & i4) == 599186) {
            }
            if (i6 != 0) {
            }
            MeasurePolicy measurePolicy2 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public MeasureResult mo37measure3p2s80s(MeasureScope measure, List measurables, long j) {
                    Intrinsics.checkNotNullParameter(measure, "$this$measure");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    return (MeasureResult) Function3.this.invoke(measure, measurables, Constraints.m2475boximpl(j));
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i72) {
                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    return ((Number) minIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i72))).intValue();
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i72) {
                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    return ((Number) minIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i72))).intValue();
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i72) {
                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    return ((Number) maxIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i72))).intValue();
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i72) {
                    Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    return ((Number) maxIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i72))).intValue();
                }
            };
            int i72 = (i4 & 14) | ((i4 >> 12) & 112);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 constructor2 = companion2.getConstructor();
            Function3 materializerOf2 = materializerOf(modifier4);
            int i82 = ((i72 << 9) & 7168) | 6;
            if (startRestartGroup.getApplier() == null) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
            Updater.m1153setimpl(m1149constructorimpl2, measurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl2, density2, companion2.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            content.invoke(startRestartGroup, Integer.valueOf((i82 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            modifier3 = modifier4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 64) != 0) {
        }
        i3 |= i5;
        i4 = i3;
        if ((2995931 & i4) == 599186) {
        }
        if (i6 != 0) {
        }
        MeasurePolicy measurePolicy22 = new MeasurePolicy() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$measurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo37measure3p2s80s(MeasureScope measure, List measurables, long j) {
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return (MeasureResult) Function3.this.invoke(measure, measurables, Constraints.m2475boximpl(j));
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i722) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return ((Number) minIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i722))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i722) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return ((Number) minIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i722))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i722) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return ((Number) maxIntrinsicWidthMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i722))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i722) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return ((Number) maxIntrinsicHeightMeasureBlock.invoke(intrinsicMeasureScope, measurables, Integer.valueOf(i722))).intValue();
            }
        };
        int i722 = (i4 & 14) | ((i4 >> 12) & 112);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection22 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration22 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
        Function0 constructor22 = companion22.getConstructor();
        Function3 materializerOf22 = materializerOf(modifier4);
        int i822 = ((i722 << 9) & 7168) | 6;
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl22 = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl22, measurePolicy22, companion22.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl22, density22, companion22.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl22, layoutDirection22, companion22.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl22, viewConfiguration22, companion22.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf22.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        content.invoke(startRestartGroup, Integer.valueOf((i822 >> 9) & 14));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        modifier3 = modifier4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final Function3 materializerOf(final Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return ComposableLambdaKt.composableLambdaInstance(-1586257396, true, new Function3() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOf$1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                m1951invokeDeg8D_g(((SkippableUpdater) obj).getComposer(), (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            /* renamed from: invoke-Deg8D_g, reason: not valid java name */
            public final void m1951invokeDeg8D_g(@NotNull Composer composer, @Nullable Composer composer2, int i) {
                Intrinsics.checkNotNullParameter(composer, "$this$null");
                Modifier materialize = ComposedModifierKt.materialize(composer2, Modifier.this);
                composer.startReplaceableGroup(509942095);
                Updater.m1153setimpl(Updater.m1149constructorimpl(composer), materialize, ComposeUiNode.INSTANCE.getSetModifier());
                composer.endReplaceableGroup();
            }
        });
    }

    public static final void MultiMeasureLayout(Modifier modifier, final Function2 content, final MeasurePolicy measurePolicy, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        Composer startRestartGroup = composer.startRestartGroup(1949933075);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(content) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(measurePolicy) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier materialize = ComposedModifierKt.materialize(startRestartGroup, modifier);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor$ui_release = LayoutNode.INSTANCE.getConstructor$ui_release();
            int i5 = ((i3 << 3) & 896) | 6;
            startRestartGroup.startReplaceableGroup(-692256719);
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor$ui_release);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1149constructorimpl = Updater.m1149constructorimpl(startRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Updater.m1153setimpl(m1149constructorimpl, materialize, companion.getSetModifier());
            Updater.m1153setimpl(m1149constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1153setimpl(m1149constructorimpl, density, companion.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            Updater.m1152initimpl(m1149constructorimpl, new Function1() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LayoutNode) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull LayoutNode init) {
                    Intrinsics.checkNotNullParameter(init, "$this$init");
                    init.setCanMultiMeasure$ui_release(true);
                }
            });
            startRestartGroup.enableReusing();
            content.invoke(startRestartGroup, Integer.valueOf((i5 >> 6) & 14));
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i6) {
                LayoutKt.MultiMeasureLayout(Modifier.this, content, measurePolicy, composer2, i | 1, i2);
            }
        });
    }
}
