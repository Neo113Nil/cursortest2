package com.aviatorvaangu.aviapp46.screens;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import com.aviatorvaangu.aviapp46.components.AppScaffoldKt;
import com.aviatorvaangu.aviapp46.components.ArticleComponentsKt;
import com.aviatorvaangu.aviapp46.components.CardsKt;
import com.aviatorvaangu.aviapp46.components.PromoCardKt;
import com.aviatorvaangu.aviapp46.data.GuideContentKt;
import com.aviatorvaangu.aviapp46.data.GuideTopic;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TopicListScreen.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"TopicListScreen", "", "onAdClick", "Lkotlin/Function0;", "onBack", "onTopic", "Lkotlin/Function1;", "Lcom/aviatorvaangu/aviapp46/data/GuideTopic;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class TopicListScreenKt {
    static final Unit TopicListScreen$lambda$7(Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) {
        TopicListScreen(function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TopicListScreen(final Function0<Unit> onAdClick, final Function0<Unit> onBack, final Function1<? super GuideTopic, Unit> onTopic, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onAdClick, "onAdClick");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onTopic, "onTopic");
        Composer startRestartGroup = composer.startRestartGroup(802715850);
        ComposerKt.sourceInformation(startRestartGroup, "C(TopicListScreen)N(onAdClick,onBack,onTopic)22@1012L685,22@1000L697:TopicListScreen.kt#5vyur7");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(onAdClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onBack) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(onTopic) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(802715850, i2, -1, "com.aviatorvaangu.aviapp46.screens.TopicListScreen (TopicListScreen.kt:21)");
            }
            AppScaffoldKt.AppScaffold(ComposableLambdaKt.rememberComposableLambda(-1493229610, true, new Function2() { // from class: com.aviatorvaangu.aviapp46.screens.TopicListScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopicListScreenKt.TopicListScreen$lambda$6(Function0.this, onAdClick, onTopic, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.aviatorvaangu.aviapp46.screens.TopicListScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TopicListScreenKt.TopicListScreen$lambda$7(Function0.this, onBack, onTopic, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit TopicListScreen$lambda$6(final Function0 function0, final Function0 function02, final Function1 function1, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C27@1204L487,23@1022L669:TopicListScreen.kt#5vyur7");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493229610, i, -1, "com.aviatorvaangu.aviapp46.screens.TopicListScreen.<anonymous> (TopicListScreen.kt:23)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            PaddingValues m813PaddingValues0680j_4 = PaddingKt.m813PaddingValues0680j_4(Dp.m7522constructorimpl(22.0f));
            Arrangement.HorizontalOrVertical m690spacedBy0680j_4 = Arrangement.INSTANCE.m690spacedBy0680j_4(Dp.m7522constructorimpl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -474571715, "CC(remember):TopicListScreen.kt#9igjgp");
            boolean changed = composer.changed(function0) | composer.changed(function02) | composer.changed(function1);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.aviatorvaangu.aviapp46.screens.TopicListScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TopicListScreenKt.TopicListScreen$lambda$6$lambda$5$lambda$4(Function0.this, function02, function1, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyColumn(fillMaxSize$default, null, m813PaddingValues0680j_4, false, m690spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, composer, 24966, 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit TopicListScreen$lambda$6$lambda$5$lambda$4(final Function0 function0, final Function0 function02, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2114303967, true, new Function3() { // from class: com.aviatorvaangu.aviapp46.screens.TopicListScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TopicListScreenKt.TopicListScreen$lambda$6$lambda$5$lambda$4$lambda$0(Function0.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$TopicListScreenKt.INSTANCE.getLambda$1656427594$app(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1344120855, true, new Function3() { // from class: com.aviatorvaangu.aviapp46.screens.TopicListScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TopicListScreenKt.TopicListScreen$lambda$6$lambda$5$lambda$4$lambda$1(Function0.this, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        final List<GuideTopic> guideTopics = GuideContentKt.getGuideTopics();
        LazyColumn.items(guideTopics.size(), null, new Function1<Integer, Object>() { // from class: com.aviatorvaangu.aviapp46.screens.TopicListScreenKt$TopicListScreen$lambda$6$lambda$5$lambda$4$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                guideTopics.get(i);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.aviatorvaangu.aviapp46.screens.TopicListScreenKt$TopicListScreen$lambda$6$lambda$5$lambda$4$$inlined$itemsIndexed$default$3
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "CN(it)214@10668L26:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2039820996, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final GuideTopic guideTopic = (GuideTopic) guideTopics.get(i);
                composer.startReplaceGroup(599748250);
                ComposerKt.sourceInformation(composer, "CN(index,topic)*34@1648L18,34@1580L87:TopicListScreen.kt#5vyur7");
                int i4 = i + 1;
                String title = guideTopic.getTitle();
                ComposerKt.sourceInformationMarkerStart(composer, -673387836, "CC(remember):TopicListScreen.kt#9igjgp");
                boolean changed = composer.changed(function1) | composer.changed(guideTopic);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: com.aviatorvaangu.aviapp46.screens.TopicListScreenKt$TopicListScreen$1$1$1$3$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(guideTopic);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                CardsKt.NumberedGuideCard(i4, title, (Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Unit TopicListScreen$lambda$6$lambda$5$lambda$4$lambda$0(Function0 function0, LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C28@1225L52:TopicListScreen.kt#5vyur7");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2114303967, i, -1, "com.aviatorvaangu.aviapp46.screens.TopicListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TopicListScreen.kt:28)");
            }
            ArticleComponentsKt.TopTitleBar("Aviator Tips", function0, null, composer, 6, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit TopicListScreen$lambda$6$lambda$5$lambda$4$lambda$1(Function0 function0, LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C32@1472L33:TopicListScreen.kt#5vyur7");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1344120855, i, -1, "com.aviatorvaangu.aviapp46.screens.TopicListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TopicListScreen.kt:32)");
            }
            PromoCardKt.PromoCard(null, function0, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
