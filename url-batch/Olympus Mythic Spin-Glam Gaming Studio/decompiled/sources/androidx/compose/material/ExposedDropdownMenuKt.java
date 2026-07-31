package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ExposedDropdownMenuBoxScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.Y3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExposedDropdownMenu.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001aN\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u000f\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a=\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "expanded", "Lkotlin/Function1;", "", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "content", "ExposedDropdownMenuBox", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "", "menuLabel", "expandable", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "Landroid/view/View;", "view", "Landroidx/compose/ui/layout/LayoutCoordinates;", Y3.f, "", "verticalMarginInPx", "onHeightUpdate", "updateHeight", "(Landroid/view/View;Landroidx/compose/ui/layout/LayoutCoordinates;ILkotlin/jvm/functions/Function1;)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ExposedDropdownMenuKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExposedDropdownMenuBox(final boolean z, final Function1 onExpandedChange, Modifier modifier, final Function3 content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object rememberedValue;
        Composer.Companion companion;
        Object rememberedValue2;
        Object rememberedValue3;
        boolean changed;
        Object rememberedValue4;
        Object rememberedValue5;
        boolean changed2;
        Object rememberedValue6;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onExpandedChange, "onExpandedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1456052980);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onExpandedChange) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                final Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                final View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState mutableState = (MutableState) rememberedValue;
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                final MutableState mutableState2 = (MutableState) rememberedValue2;
                final int mo265roundToPx0680j_4 = density.mo265roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new Ref();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                final Ref ref = (Ref) rememberedValue3;
                Integer valueOf = Integer.valueOf(m865ExposedDropdownMenuBox$lambda4(mutableState2));
                Integer valueOf2 = Integer.valueOf(m863ExposedDropdownMenuBox$lambda1(mutableState));
                startRestartGroup.startReplaceableGroup(1618982084);
                changed = startRestartGroup.changed(valueOf2) | startRestartGroup.changed(density) | startRestartGroup.changed(valueOf);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
                        @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                        public void ExposedDropdownMenu(boolean z2, Function0 function0, Modifier modifier4, Function3 function3, Composer composer2, int i5, int i6) {
                            ExposedDropdownMenuBoxScope.DefaultImpls.ExposedDropdownMenu(this, z2, function0, modifier4, function3, composer2, i5, i6);
                        }

                        @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                        public Modifier exposedDropdownSize(Modifier modifier4, boolean z2) {
                            int m865ExposedDropdownMenuBox$lambda4;
                            int m863ExposedDropdownMenuBox$lambda1;
                            Intrinsics.checkNotNullParameter(modifier4, "<this>");
                            Density density2 = Density.this;
                            MutableState mutableState3 = mutableState2;
                            MutableState mutableState4 = mutableState;
                            m865ExposedDropdownMenuBox$lambda4 = ExposedDropdownMenuKt.m865ExposedDropdownMenuBox$lambda4(mutableState3);
                            Modifier m349heightInVpY3zN4$default = SizeKt.m349heightInVpY3zN4$default(modifier4, 0.0f, density2.mo268toDpu2uoSUM(m865ExposedDropdownMenuBox$lambda4), 1, null);
                            if (!z2) {
                                return m349heightInVpY3zN4$default;
                            }
                            m863ExposedDropdownMenuBox$lambda1 = ExposedDropdownMenuKt.m863ExposedDropdownMenuBox$lambda1(mutableState4);
                            return SizeKt.m362width3ABfNKs(m349heightInVpY3zN4$default, density2.mo268toDpu2uoSUM(m863ExposedDropdownMenuBox$lambda1));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceableGroup();
                Object obj = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) rememberedValue4;
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == companion.getEmpty()) {
                    rememberedValue5 = new FocusRequester();
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceableGroup();
                final FocusRequester focusRequester = (FocusRequester) rememberedValue5;
                Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, new Function1() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((LayoutCoordinates) obj2);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LayoutCoordinates it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        ExposedDropdownMenuKt.m864ExposedDropdownMenuBox$lambda2(mutableState, IntSize.m2567getWidthimpl(it.mo1946getSizeYbymL2g()));
                        ref.setValue(it);
                        View rootView = view.getRootView();
                        Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
                        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ref.getValue();
                        int i5 = mo265roundToPx0680j_4;
                        final MutableState<Integer> mutableState3 = mutableState2;
                        ExposedDropdownMenuKt.updateHeight(rootView, layoutCoordinates, i5, new Function1() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke(((Number) obj2).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i6) {
                                ExposedDropdownMenuKt.m866ExposedDropdownMenuBox$lambda5(mutableState3, i6);
                            }
                        });
                    }
                });
                Boolean valueOf3 = Boolean.valueOf(z);
                startRestartGroup.startReplaceableGroup(511388516);
                changed2 = startRestartGroup.changed(valueOf3) | startRestartGroup.changed(onExpandedChange);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue6 == companion.getEmpty()) {
                    rememberedValue6 = new Function0() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public /* bridge */ /* synthetic */ Object mo4828invoke() {
                            m871invoke();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m871invoke() {
                            Function1.this.invoke(Boolean.valueOf(!z));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(expandable(onGloballyPositioned, (Function0) rememberedValue6, Strings_androidKt.m986getString4foXLRw(Strings.INSTANCE.m982getExposedDropdownMenuUdPEhr4(), startRestartGroup, 6)), focusRequester);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0 constructor = companion2.getConstructor();
                Function3 materializerOf = LayoutKt.materializerOf(focusRequester2);
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
                Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl, density2, companion2.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-443225682);
                content.invoke(obj, startRestartGroup, Integer.valueOf((i3 >> 6) & 112));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect(new Function0() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        m872invoke();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m872invoke() {
                        if (z) {
                            focusRequester.requestFocus();
                        }
                    }
                }, startRestartGroup, 0);
                EffectsKt.DisposableEffect(view, new Function1() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final View view2 = view;
                        final Ref<LayoutCoordinates> ref2 = ref;
                        final int i5 = mo265roundToPx0680j_4;
                        final MutableState<Integer> mutableState3 = mutableState2;
                        final OnGlobalLayoutListener onGlobalLayoutListener = new OnGlobalLayoutListener(view2, new Function0() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                                m873invoke();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m873invoke() {
                                View rootView = view2.getRootView();
                                Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
                                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ref2.getValue();
                                int i6 = i5;
                                final MutableState<Integer> mutableState4 = mutableState3;
                                ExposedDropdownMenuKt.updateHeight(rootView, layoutCoordinates, i6, new Function1() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        invoke(((Number) obj2).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(int i7) {
                                        ExposedDropdownMenuKt.m866ExposedDropdownMenuBox$lambda5(mutableState4, i7);
                                    }
                                });
                            }
                        });
                        return new DisposableEffectResult() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                OnGlobalLayoutListener.this.dispose();
                            }
                        };
                    }
                }, startRestartGroup, 8);
                modifier3 = modifier2;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    ExposedDropdownMenuKt.ExposedDropdownMenuBox(z, onExpandedChange, modifier3, content, composer2, i | 1, i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i4 != 0) {
        }
        final Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        final View view2 = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState<Integer> mutableState3 = (MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final MutableState<Integer> mutableState22 = (MutableState) rememberedValue2;
        final int mo265roundToPx0680j_42 = density3.mo265roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final Ref<LayoutCoordinates> ref2 = (Ref) rememberedValue3;
        Integer valueOf4 = Integer.valueOf(m865ExposedDropdownMenuBox$lambda4(mutableState22));
        Integer valueOf22 = Integer.valueOf(m863ExposedDropdownMenuBox$lambda1(mutableState3));
        startRestartGroup.startReplaceableGroup(1618982084);
        changed = startRestartGroup.changed(valueOf22) | startRestartGroup.changed(density3) | startRestartGroup.changed(valueOf4);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue4 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
            @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
            public void ExposedDropdownMenu(boolean z2, Function0 function0, Modifier modifier4, Function3 function3, Composer composer2, int i5, int i6) {
                ExposedDropdownMenuBoxScope.DefaultImpls.ExposedDropdownMenu(this, z2, function0, modifier4, function3, composer2, i5, i6);
            }

            @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
            public Modifier exposedDropdownSize(Modifier modifier4, boolean z2) {
                int m865ExposedDropdownMenuBox$lambda4;
                int m863ExposedDropdownMenuBox$lambda1;
                Intrinsics.checkNotNullParameter(modifier4, "<this>");
                Density density22 = Density.this;
                MutableState mutableState32 = mutableState22;
                MutableState mutableState4 = mutableState3;
                m865ExposedDropdownMenuBox$lambda4 = ExposedDropdownMenuKt.m865ExposedDropdownMenuBox$lambda4(mutableState32);
                Modifier m349heightInVpY3zN4$default = SizeKt.m349heightInVpY3zN4$default(modifier4, 0.0f, density22.mo268toDpu2uoSUM(m865ExposedDropdownMenuBox$lambda4), 1, null);
                if (!z2) {
                    return m349heightInVpY3zN4$default;
                }
                m863ExposedDropdownMenuBox$lambda1 = ExposedDropdownMenuKt.m863ExposedDropdownMenuBox$lambda1(mutableState4);
                return SizeKt.m362width3ABfNKs(m349heightInVpY3zN4$default, density22.mo268toDpu2uoSUM(m863ExposedDropdownMenuBox$lambda1));
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        Object obj2 = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) rememberedValue4;
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final FocusRequester focusRequester3 = (FocusRequester) rememberedValue5;
        Modifier onGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, new Function1() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj22) {
                invoke((LayoutCoordinates) obj22);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ExposedDropdownMenuKt.m864ExposedDropdownMenuBox$lambda2(mutableState3, IntSize.m2567getWidthimpl(it.mo1946getSizeYbymL2g()));
                ref2.setValue(it);
                View rootView = view2.getRootView();
                Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ref2.getValue();
                int i5 = mo265roundToPx0680j_42;
                final MutableState<Integer> mutableState32 = mutableState22;
                ExposedDropdownMenuKt.updateHeight(rootView, layoutCoordinates, i5, new Function1() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj22) {
                        invoke(((Number) obj22).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i6) {
                        ExposedDropdownMenuKt.m866ExposedDropdownMenuBox$lambda5(mutableState32, i6);
                    }
                });
            }
        });
        Boolean valueOf32 = Boolean.valueOf(z);
        startRestartGroup.startReplaceableGroup(511388516);
        changed2 = startRestartGroup.changed(valueOf32) | startRestartGroup.changed(onExpandedChange);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue6 = new Function0() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m871invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m871invoke() {
                Function1.this.invoke(Boolean.valueOf(!z));
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceableGroup();
        Modifier focusRequester22 = FocusRequesterModifierKt.focusRequester(expandable(onGloballyPositioned2, (Function0) rememberedValue6, Strings_androidKt.m986getString4foXLRw(Strings.INSTANCE.m982getExposedDropdownMenuUdPEhr4(), startRestartGroup, 6)), focusRequester3);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density22 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
        Function0 constructor2 = companion22.getConstructor();
        Function3 materializerOf2 = LayoutKt.materializerOf(focusRequester22);
        if (startRestartGroup.getApplier() == null) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1149constructorimpl2 = Updater.m1149constructorimpl(startRestartGroup);
        Updater.m1153setimpl(m1149constructorimpl2, rememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl2, density22, companion22.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion22.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion22.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-443225682);
        content.invoke(obj2, startRestartGroup, Integer.valueOf((i3 >> 6) & 112));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        EffectsKt.SideEffect(new Function0() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m872invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m872invoke() {
                if (z) {
                    focusRequester3.requestFocus();
                }
            }
        }, startRestartGroup, 0);
        EffectsKt.DisposableEffect(view2, new Function1() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final View view22 = view2;
                final Ref<LayoutCoordinates> ref22 = ref2;
                final int i5 = mo265roundToPx0680j_42;
                final MutableState<Integer> mutableState32 = mutableState22;
                final OnGlobalLayoutListener onGlobalLayoutListener = new OnGlobalLayoutListener(view22, new Function0() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        m873invoke();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m873invoke() {
                        View rootView = view22.getRootView();
                        Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
                        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) ref22.getValue();
                        int i6 = i5;
                        final MutableState<Integer> mutableState4 = mutableState32;
                        ExposedDropdownMenuKt.updateHeight(rootView, layoutCoordinates, i6, new Function1() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj22) {
                                invoke(((Number) obj22).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i7) {
                                ExposedDropdownMenuKt.m866ExposedDropdownMenuBox$lambda5(mutableState4, i7);
                            }
                        });
                    }
                });
                return new DisposableEffectResult() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        OnGlobalLayoutListener.this.dispose();
                    }
                };
            }
        }, startRestartGroup, 8);
        modifier3 = modifier2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ExposedDropdownMenuBox$lambda-2, reason: not valid java name */
    public static final void m864ExposedDropdownMenuBox$lambda2(MutableState mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ExposedDropdownMenuBox$lambda-5, reason: not valid java name */
    public static final void m866ExposedDropdownMenuBox$lambda5(MutableState mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final Modifier expandable(Modifier modifier, final Function0 function0, final String str) {
        return SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.INSTANCE, new ExposedDropdownMenuKt$expandable$1(function0, null)), false, new Function1() { // from class: androidx.compose.material.ExposedDropdownMenuKt$expandable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertiesKt.setContentDescription(semantics, str);
                final Function0 function02 = function0;
                SemanticsPropertiesKt.onClick$default(semantics, null, new Function0() { // from class: androidx.compose.material.ExposedDropdownMenuKt$expandable$2.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final Boolean mo4828invoke() {
                        Function0.this.mo4828invoke();
                        return Boolean.TRUE;
                    }
                }, 1, null);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateHeight(View view, LayoutCoordinates layoutCoordinates, int i, Function1 function1) {
        if (layoutCoordinates == null) {
            return;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        function1.invoke(Integer.valueOf(((int) Math.max(LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getTop() - rect.top, (rect.bottom - r1) - LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getBottom())) - i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ExposedDropdownMenuBox$lambda-1, reason: not valid java name */
    public static final int m863ExposedDropdownMenuBox$lambda1(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ExposedDropdownMenuBox$lambda-4, reason: not valid java name */
    public static final int m865ExposedDropdownMenuBox$lambda4(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }
}
