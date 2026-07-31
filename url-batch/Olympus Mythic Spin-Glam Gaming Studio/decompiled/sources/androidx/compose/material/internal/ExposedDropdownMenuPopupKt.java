package androidx.compose.material.internal;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExposedDropdownMenuPopup.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a<\u0010\u0007\u001a\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\" \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupPositionProvider", "Landroidx/compose/runtime/Composable;", "content", "ExposedDropdownMenuPopup", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopupKt {
    private static final ProvidableCompositionLocal LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$LocalPopupTestTag$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final String mo4828invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }, 1, null);

    public static final void ExposedDropdownMenuPopup(Function0 function0, final PopupPositionProvider popupPositionProvider, final Function2 content, Composer composer, final int i, final int i2) {
        final Function0 function02;
        int i3;
        final LayoutDirection layoutDirection;
        final String str;
        final Function0 function03;
        int i4;
        Composer composer2;
        Object obj;
        Composer composer3;
        Intrinsics.checkNotNullParameter(popupPositionProvider, "popupPositionProvider");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-841446797);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            function02 = function0;
        } else if ((i & 14) == 0) {
            function02 = function0;
            i3 = (startRestartGroup.changed(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(popupPositionProvider) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(content) ? 256 : 128;
        }
        int i6 = i3;
        if ((i6 & 731) != 146 || !startRestartGroup.getSkipping()) {
            Function0 function04 = i5 != 0 ? null : function02;
            View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            String str2 = (String) startRestartGroup.consume(LocalPopupTestTag);
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i6 >> 6) & 14);
            UUID popupId = (UUID) RememberSaveableKt.rememberSaveable(new Object[0], null, null, new Function0() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public final UUID mo4828invoke() {
                    return UUID.randomUUID();
                }
            }, startRestartGroup, 3080, 6);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                Intrinsics.checkNotNullExpressionValue(popupId, "popupId");
                layoutDirection = layoutDirection2;
                str = str2;
                function03 = function04;
                i4 = i6;
                Composer composer4 = startRestartGroup;
                final PopupLayout popupLayout = new PopupLayout(function04, str2, view, density, popupPositionProvider, popupId);
                popupLayout.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(144472904, true, new Function2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((Composer) obj2, ((Number) obj3).intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget
                    @Composable
                    public final void invoke(@Nullable Composer composer5, int i7) {
                        if ((i7 & 11) != 2 || !composer5.getSkipping()) {
                            Modifier semantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    invoke((SemanticsPropertyReceiver) obj2);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                    SemanticsPropertiesKt.popup(semantics);
                                }
                            }, 1, null);
                            final PopupLayout popupLayout2 = PopupLayout.this;
                            Modifier alpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(semantics$default, new Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1.2
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m1061invokeozmzZPI(((IntSize) obj2).getPackedValue());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                                public final void m1061invokeozmzZPI(long j) {
                                    PopupLayout.this.m1063setPopupContentSizefhxjrPA(IntSize.m2562boximpl(j));
                                    PopupLayout.this.updatePosition();
                                }
                            }), PopupLayout.this.getCanCalculatePosition() ? 1.0f : 0.0f);
                            final State<Function2> state = rememberUpdatedState;
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer5, 2080999218, true, new Function2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                    invoke((Composer) obj2, ((Number) obj3).intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget
                                @Composable
                                public final void invoke(@Nullable Composer composer6, int i8) {
                                    Function2 m1058ExposedDropdownMenuPopup$lambda0;
                                    if ((i8 & 11) == 2 && composer6.getSkipping()) {
                                        composer6.skipToGroupEnd();
                                    } else {
                                        m1058ExposedDropdownMenuPopup$lambda0 = ExposedDropdownMenuPopupKt.m1058ExposedDropdownMenuPopup$lambda0(state);
                                        m1058ExposedDropdownMenuPopup$lambda0.invoke(composer6, 0);
                                    }
                                }
                            });
                            composer5.startReplaceableGroup(1769324208);
                            ExposedDropdownMenuPopupKt$SimpleStack$1 exposedDropdownMenuPopupKt$SimpleStack$1 = new MeasurePolicy() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1
                                @Override // androidx.compose.ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo37measure3p2s80s(MeasureScope Layout, List measurables, long j) {
                                    int i8;
                                    int i9;
                                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                                    int size = measurables.size();
                                    if (size == 0) {
                                        return MeasureScope.layout$default(Layout, 0, 0, null, new Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$1
                                            public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                invoke((Placeable.PlacementScope) obj2);
                                                return Unit.INSTANCE;
                                            }
                                        }, 4, null);
                                    }
                                    int i10 = 0;
                                    if (size != 1) {
                                        final ArrayList arrayList = new ArrayList(measurables.size());
                                        int size2 = measurables.size();
                                        for (int i11 = 0; i11 < size2; i11++) {
                                            arrayList.add(((Measurable) measurables.get(i11)).mo1944measureBRTryo0(j));
                                        }
                                        int lastIndex = CollectionsKt.getLastIndex(arrayList);
                                        if (lastIndex >= 0) {
                                            int i12 = 0;
                                            int i13 = 0;
                                            while (true) {
                                                Placeable placeable = (Placeable) arrayList.get(i10);
                                                i12 = Math.max(i12, placeable.getWidth());
                                                i13 = Math.max(i13, placeable.getHeight());
                                                if (i10 == lastIndex) {
                                                    break;
                                                }
                                                i10++;
                                            }
                                            i8 = i12;
                                            i9 = i13;
                                        } else {
                                            i8 = 0;
                                            i9 = 0;
                                        }
                                        return MeasureScope.layout$default(Layout, i8, i9, null, new Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                invoke((Placeable.PlacementScope) obj2);
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
                                                if (lastIndex2 < 0) {
                                                    return;
                                                }
                                                int i14 = 0;
                                                while (true) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, arrayList.get(i14), 0, 0, 0.0f, 4, null);
                                                    if (i14 == lastIndex2) {
                                                        return;
                                                    } else {
                                                        i14++;
                                                    }
                                                }
                                            }
                                        }, 4, null);
                                    }
                                    final Placeable mo1944measureBRTryo0 = ((Measurable) measurables.get(0)).mo1944measureBRTryo0(j);
                                    return MeasureScope.layout$default(Layout, mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$SimpleStack$1$measure$2
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                            invoke((Placeable.PlacementScope) obj2);
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                            Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, 0, 0.0f, 4, null);
                                        }
                                    }, 4, null);
                                }
                            };
                            composer5.startReplaceableGroup(-1323940314);
                            Density density2 = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection3 = (LayoutDirection) composer5.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composer5.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0 constructor = companion.getConstructor();
                            Function3 materializerOf = LayoutKt.materializerOf(alpha);
                            if (composer5.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor);
                            } else {
                                composer5.useNode();
                            }
                            composer5.disableReusing();
                            Composer m1149constructorimpl = Updater.m1149constructorimpl(composer5);
                            Updater.m1153setimpl(m1149constructorimpl, exposedDropdownMenuPopupKt$SimpleStack$1, companion.getSetMeasurePolicy());
                            Updater.m1153setimpl(m1149constructorimpl, density2, companion.getSetDensity());
                            Updater.m1153setimpl(m1149constructorimpl, layoutDirection3, companion.getSetLayoutDirection());
                            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
                            composer5.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer5)), composer5, 0);
                            composer5.startReplaceableGroup(2058660585);
                            composableLambda.invoke(composer5, 6);
                            composer5.endReplaceableGroup();
                            composer5.endNode();
                            composer5.endReplaceableGroup();
                            composer5.endReplaceableGroup();
                            return;
                        }
                        composer5.skipToGroupEnd();
                    }
                }));
                composer4.updateRememberedValue(popupLayout);
                obj = popupLayout;
                composer2 = composer4;
            } else {
                layoutDirection = layoutDirection2;
                str = str2;
                function03 = function04;
                i4 = i6;
                composer2 = startRestartGroup;
                obj = rememberedValue;
            }
            composer2.endReplaceableGroup();
            final PopupLayout popupLayout2 = (PopupLayout) obj;
            EffectsKt.DisposableEffect(popupLayout2, new Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    PopupLayout.this.show();
                    PopupLayout.this.updateParameters(function03, str, layoutDirection);
                    final PopupLayout popupLayout3 = PopupLayout.this;
                    return new DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            PopupLayout.this.disposeComposition();
                            PopupLayout.this.dismiss();
                        }
                    };
                }
            }, composer2, 8);
            EffectsKt.SideEffect(new Function0() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    m1060invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m1060invoke() {
                    PopupLayout.this.updateParameters(function03, str, layoutDirection);
                }
            }, composer2, 0);
            EffectsKt.DisposableEffect(popupPositionProvider, new Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                    PopupLayout.this.setPositionProvider(popupPositionProvider);
                    PopupLayout.this.updatePosition();
                    return new DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    };
                }
            }, composer2, (i4 >> 3) & 14);
            Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((LayoutCoordinates) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull LayoutCoordinates childCoordinates) {
                    Intrinsics.checkNotNullParameter(childCoordinates, "childCoordinates");
                    LayoutCoordinates parentLayoutCoordinates = childCoordinates.getParentLayoutCoordinates();
                    Intrinsics.checkNotNull(parentLayoutCoordinates);
                    long mo1946getSizeYbymL2g = parentLayoutCoordinates.mo1946getSizeYbymL2g();
                    long positionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
                    PopupLayout.this.setParentBounds(IntRectKt.m2561IntRectVbeCjmY(IntOffsetKt.IntOffset(MathKt.roundToInt(Offset.m1297getXimpl(positionInWindow)), MathKt.roundToInt(Offset.m1298getYimpl(positionInWindow))), mo1946getSizeYbymL2g));
                    PopupLayout.this.updatePosition();
                }
            });
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo37measure3p2s80s(MeasureScope Layout, List list, long j) {
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(list, "<anonymous parameter 0>");
                    PopupLayout.this.setParentLayoutDirection(layoutDirection);
                    return MeasureScope.layout$default(Layout, 0, 0, null, new Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6$measure$1
                        public final void invoke(@NotNull Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((Placeable.PlacementScope) obj2);
                            return Unit.INSTANCE;
                        }
                    }, 4, null);
                }
            };
            composer2.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 constructor = companion.getConstructor();
            Function3 materializerOf = LayoutKt.materializerOf(onGloballyPositioned);
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
            Updater.m1153setimpl(m1149constructorimpl, density2, companion.getSetDensity());
            Updater.m1153setimpl(m1149constructorimpl, layoutDirection3, companion.getSetLayoutDirection());
            Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-261830998);
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            function02 = function03;
            composer3 = composer2;
        } else {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                invoke((Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer5, int i7) {
                ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(Function0.this, popupPositionProvider, content, composer5, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ExposedDropdownMenuPopup$lambda-0, reason: not valid java name */
    public static final Function2 m1058ExposedDropdownMenuPopup$lambda0(State state) {
        return (Function2) state.getValue();
    }
}
