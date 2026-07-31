package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Drawer.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class DrawerKt$BottomDrawer$1 extends Lambda implements Function3 {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2 $content;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ Function3 $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ BottomDrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ long $scrimColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DrawerKt$BottomDrawer$1(boolean z, BottomDrawerState bottomDrawerState, Function2 function2, int i, long j, Shape shape, long j2, long j3, float f, CoroutineScope coroutineScope, Function3 function3) {
        super(3);
        this.$gesturesEnabled = z;
        this.$drawerState = bottomDrawerState;
        this.$content = function2;
        this.$$dirty = i;
        this.$scrimColor = j;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j2;
        this.$drawerContentColor = j3;
        this.$drawerElevation = f;
        this.$scope = coroutineScope;
        this.$drawerContent = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i) {
        int i2;
        Modifier m998swipeablepPrIpRY;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        float m2486getMaxHeightimpl = Constraints.m2486getMaxHeightimpl(BoxWithConstraints.getConstraints());
        Object valueOf = Float.valueOf(m2486getMaxHeightimpl);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(valueOf);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(m2486getMaxHeightimpl), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) rememberedValue;
        boolean z = Constraints.m2487getMaxWidthimpl(BoxWithConstraints.getConstraints()) > Constraints.m2486getMaxHeightimpl(BoxWithConstraints.getConstraints());
        float f = 0.5f * m2486getMaxHeightimpl;
        float max = Math.max(0.0f, m2486getMaxHeightimpl - m850invoke$lambda1(mutableState));
        Map mapOf = (m850invoke$lambda1(mutableState) < f || z) ? MapsKt.mapOf(TuplesKt.to(Float.valueOf(m2486getMaxHeightimpl), BottomDrawerValue.Closed), TuplesKt.to(Float.valueOf(max), BottomDrawerValue.Expanded)) : MapsKt.mapOf(TuplesKt.to(Float.valueOf(m2486getMaxHeightimpl), BottomDrawerValue.Closed), TuplesKt.to(Float.valueOf(f), BottomDrawerValue.Open), TuplesKt.to(Float.valueOf(max), BottomDrawerValue.Expanded));
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier m361sizeInqDBjuR0$default = SizeKt.m361sizeInqDBjuR0$default(companion, 0.0f, 0.0f, density.mo268toDpu2uoSUM(Constraints.m2487getMaxWidthimpl(BoxWithConstraints.getConstraints())), density.mo268toDpu2uoSUM(Constraints.m2486getMaxHeightimpl(BoxWithConstraints.getConstraints())), 3, null);
        m998swipeablepPrIpRY = SwipeableKt.m998swipeablepPrIpRY(companion.then(this.$gesturesEnabled ? NestedScrollModifierKt.nestedScroll$default(companion, this.$drawerState.getNestedScrollConnection(), null, 2, null) : companion), this.$drawerState, mapOf, Orientation.Vertical, (r26 & 8) != 0 ? true : this.$gesturesEnabled, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new Function2() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final FixedThreshold invoke(Object obj2, Object obj22) {
                return new FixedThreshold(Dp.m2507constructorimpl(56), null);
            }
        } : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m997getVelocityThresholdD9Ej5fM() : 0.0f);
        Function2 function2 = this.$content;
        final int i3 = this.$$dirty;
        long j = this.$scrimColor;
        final BottomDrawerState bottomDrawerState = this.$drawerState;
        Shape shape = this.$drawerShape;
        long j2 = this.$drawerBackgroundColor;
        long j3 = this.$drawerContentColor;
        float f2 = this.$drawerElevation;
        final boolean z2 = this.$gesturesEnabled;
        final CoroutineScope coroutineScope = this.$scope;
        final Function3 function3 = this.$drawerContent;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0 constructor = companion2.getConstructor();
        Function3 materializerOf = LayoutKt.materializerOf(m998swipeablepPrIpRY);
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m1149constructorimpl = Updater.m1149constructorimpl(composer);
        Updater.m1153setimpl(m1149constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m1153setimpl(m1149constructorimpl, density2, companion2.getSetDensity());
        Updater.m1153setimpl(m1149constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m1153setimpl(m1149constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer.startReplaceableGroup(-1660053078);
        function2.invoke(composer, Integer.valueOf((i3 >> 27) & 14));
        DrawerKt.m842BottomDrawerScrim3JVO9M(j, new Function0() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m852invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m852invoke() {
                if (z2 && ((Boolean) bottomDrawerState.getConfirmStateChange().invoke(BottomDrawerValue.Closed)).booleanValue()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(bottomDrawerState, null), 3, null);
                }
            }

            /* compiled from: Drawer.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1", f = "Drawer.kt", l = {TTAdConstant.STYLE_SIZE_RADIO_9_16}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2 {
                final /* synthetic */ BottomDrawerState $drawerState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(BottomDrawerState bottomDrawerState, Continuation continuation) {
                    super(2, continuation);
                    this.$drawerState = bottomDrawerState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass1(this.$drawerState, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        BottomDrawerState bottomDrawerState = this.$drawerState;
                        this.label = 1;
                        if (bottomDrawerState.close(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }, bottomDrawerState.getTargetValue() != BottomDrawerValue.Closed, composer, (i3 >> 24) & 14);
        final String m986getString4foXLRw = Strings_androidKt.m986getString4foXLRw(Strings.INSTANCE.m983getNavigationMenuUdPEhr4(), composer, 6);
        composer.startReplaceableGroup(1157296644);
        boolean changed2 = composer.changed(bottomDrawerState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function1() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$2$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return IntOffset.m2545boximpl(m853invokeBjo55l4((Density) obj));
                }

                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                public final long m853invokeBjo55l4(@NotNull Density offset) {
                    Intrinsics.checkNotNullParameter(offset, "$this$offset");
                    return IntOffsetKt.IntOffset(0, MathKt.roundToInt(((Number) BottomDrawerState.this.getOffset().getValue()).floatValue()));
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier offset = OffsetKt.offset(m361sizeInqDBjuR0$default, (Function1) rememberedValue2);
        composer.startReplaceableGroup(1157296644);
        boolean changed3 = composer.changed(mutableState);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LayoutCoordinates) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull LayoutCoordinates position) {
                    Intrinsics.checkNotNullParameter(position, "position");
                    DrawerKt$BottomDrawer$1.m851invoke$lambda2(mutableState, IntSize.m2566getHeightimpl(position.mo1946getSizeYbymL2g()));
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        int i4 = i3 >> 12;
        SurfaceKt.m988SurfaceFjzlyU(SemanticsModifierKt.semantics$default(OnGloballyPositionedModifierKt.onGloballyPositioned(offset, (Function1) rememberedValue3), false, new Function1() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4
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
                SemanticsPropertiesKt.setPaneTitle(semantics, m986getString4foXLRw);
                if (bottomDrawerState.isOpen()) {
                    final BottomDrawerState bottomDrawerState2 = bottomDrawerState;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    SemanticsPropertiesKt.dismiss$default(semantics, null, new Function0() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        /* renamed from: invoke */
                        public final Boolean mo4828invoke() {
                            if (((Boolean) BottomDrawerState.this.getConfirmStateChange().invoke(BottomDrawerValue.Closed)).booleanValue()) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C00341(BottomDrawerState.this, null), 3, null);
                            }
                            return Boolean.TRUE;
                        }

                        /* compiled from: Drawer.kt */
                        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                        @DebugMetadata(c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1", f = "Drawer.kt", l = {580}, m = "invokeSuspend")
                        /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C00341 extends SuspendLambda implements Function2 {
                            final /* synthetic */ BottomDrawerState $drawerState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C00341(BottomDrawerState bottomDrawerState, Continuation continuation) {
                                super(2, continuation);
                                this.$drawerState = bottomDrawerState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                                return new C00341(this.$drawerState, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            @Nullable
                            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                                return ((C00341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    BottomDrawerState bottomDrawerState = this.$drawerState;
                                    this.label = 1;
                                    if (bottomDrawerState.close(this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, 1, null);
                }
            }
        }, 1, null), shape, j2, j3, null, f2, ComposableLambdaKt.composableLambda(composer, 457750254, true, new Function2() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$5
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
            public final void invoke(@Nullable Composer composer2, int i5) {
                if ((i5 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                Function3 function32 = Function3.this;
                int i6 = (i3 << 9) & 7168;
                composer2.startReplaceableGroup(-483455358);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0 constructor2 = companion4.getConstructor();
                Function3 materializerOf2 = LayoutKt.materializerOf(companion3);
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer m1149constructorimpl2 = Updater.m1149constructorimpl(composer2);
                Updater.m1153setimpl(m1149constructorimpl2, columnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m1153setimpl(m1149constructorimpl2, density3, companion4.getSetDensity());
                Updater.m1153setimpl(m1149constructorimpl2, layoutDirection2, companion4.getSetLayoutDirection());
                Updater.m1153setimpl(m1149constructorimpl2, viewConfiguration2, companion4.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1125boximpl(SkippableUpdater.m1126constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-1163856341);
                function32.invoke(ColumnScopeInstance.INSTANCE, composer2, Integer.valueOf(((i6 >> 6) & 112) | 6));
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
        }), composer, ((i3 >> 9) & 112) | 1572864 | (i4 & 896) | (i4 & 7168) | (458752 & i3), 16);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2, reason: not valid java name */
    public static final void m851invoke$lambda2(MutableState mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* renamed from: invoke$lambda-1, reason: not valid java name */
    private static final float m850invoke$lambda1(MutableState mutableState) {
        return ((Number) mutableState.getValue()).floatValue();
    }
}
