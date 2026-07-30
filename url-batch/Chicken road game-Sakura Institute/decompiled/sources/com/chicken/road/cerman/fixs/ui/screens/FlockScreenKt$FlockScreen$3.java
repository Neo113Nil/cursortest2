package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.LocalFloristKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.chicken.road.cerman.fixs.Routes;
import com.chicken.road.cerman.fixs.data.Chicken;
import com.chicken.road.cerman.fixs.ui.CommonKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlockScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FlockScreenKt$FlockScreen$3 implements Function3<PaddingValues, Composer, Integer, Unit> {
    final /* synthetic */ State<List<Chicken>> $chickens$delegate;
    final /* synthetic */ NavController $nav;

    /* JADX WARN: Multi-variable type inference failed */
    FlockScreenKt$FlockScreen$3(State<? extends List<Chicken>> state, NavController navController) {
        this.$chickens$delegate = state;
        this.$nav = navController;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues inner, Composer composer, int i) {
        int i2;
        List FlockScreen$lambda$1;
        Intrinsics.checkNotNullParameter(inner, "inner");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(inner) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(970435924, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.FlockScreen.<anonymous> (FlockScreen.kt:80)");
            }
            FlockScreen$lambda$1 = FlockScreenKt.FlockScreen$lambda$1(this.$chickens$delegate);
            if (FlockScreen$lambda$1.isEmpty()) {
                composer.startReplaceGroup(-994076790);
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, inner), 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m3333constructorimpl = Updater.m3333constructorimpl(composer);
                Updater.m3340setimpl(m3333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                CommonKt.EmptyState(LocalFloristKt.getLocalFlorist(Icons.Filled.INSTANCE), "No chickens yet", "Tap \"Add chicken\" to start tracking your flock.", composer, 432);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-993770231);
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, inner), 0.0f, 1, null);
                PaddingValues m674PaddingValues0680j_4 = PaddingKt.m674PaddingValues0680j_4(Dp.m6299constructorimpl(16));
                Arrangement.HorizontalOrVertical m561spacedBy0680j_4 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(10));
                composer.startReplaceGroup(1353424329);
                boolean changed = composer.changed(this.$chickens$delegate) | composer.changedInstance(this.$nav);
                final State<List<Chicken>> state = this.$chickens$delegate;
                final NavController navController = this.$nav;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$FlockScreen$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$5$lambda$4;
                            invoke$lambda$5$lambda$4 = FlockScreenKt$FlockScreen$3.invoke$lambda$5$lambda$4(State.this, navController, (LazyListScope) obj);
                            return invoke$lambda$5$lambda$4;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyColumn(fillMaxSize$default2, null, m674PaddingValues0680j_4, false, m561spacedBy0680j_4, null, null, false, (Function1) rememberedValue, composer, 24960, 234);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(State state, final NavController navController, LazyListScope LazyColumn) {
        final List FlockScreen$lambda$1;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        FlockScreen$lambda$1 = FlockScreenKt.FlockScreen$lambda$1(state);
        final Function1 function1 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$FlockScreen$3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object invoke$lambda$5$lambda$4$lambda$1;
                invoke$lambda$5$lambda$4$lambda$1 = FlockScreenKt$FlockScreen$3.invoke$lambda$5$lambda$4$lambda$1((Chicken) obj);
                return invoke$lambda$5$lambda$4$lambda$1;
            }
        };
        final FlockScreenKt$FlockScreen$3$invoke$lambda$5$lambda$4$$inlined$items$default$1 flockScreenKt$FlockScreen$3$invoke$lambda$5$lambda$4$$inlined$items$default$1 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$FlockScreen$3$invoke$lambda$5$lambda$4$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Chicken chicken) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((Chicken) obj);
            }
        };
        LazyColumn.items(FlockScreen$lambda$1.size(), new Function1<Integer, Object>() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$FlockScreen$3$invoke$lambda$5$lambda$4$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(FlockScreen$lambda$1.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$FlockScreen$3$invoke$lambda$5$lambda$4$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(FlockScreen$lambda$1.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$FlockScreen$3$invoke$lambda$5$lambda$4$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & 147) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                final Chicken chicken = (Chicken) FlockScreen$lambda$1.get(i);
                composer.startReplaceGroup(142323235);
                composer.startReplaceGroup(4591506);
                boolean changedInstance = composer.changedInstance(navController) | composer.changed(chicken);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final NavController navController2 = navController;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.FlockScreenKt$FlockScreen$3$2$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            NavController.navigate$default(NavController.this, Routes.INSTANCE.chicken(chicken.getId()), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                FlockScreenKt.ChickenRow(chicken, (Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$FlockScreenKt.INSTANCE.m6718getLambda3$app_release(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$5$lambda$4$lambda$1(Chicken it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.getId());
    }
}
