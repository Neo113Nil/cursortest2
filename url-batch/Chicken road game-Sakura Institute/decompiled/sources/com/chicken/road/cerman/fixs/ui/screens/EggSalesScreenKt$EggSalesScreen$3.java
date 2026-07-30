package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.EggAltKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.chicken.road.cerman.fixs.data.Chicken;
import com.chicken.road.cerman.fixs.data.EggLog;
import com.chicken.road.cerman.fixs.data.Sale;
import com.chicken.road.cerman.fixs.ui.CommonKt;
import com.chicken.road.cerman.fixs.ui.Fmt;
import com.chicken.road.cerman.fixs.ui.theme.ThemeKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EggSalesScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class EggSalesScreenKt$EggSalesScreen$3 implements Function3<PaddingValues, Composer, Integer, Unit> {
    final /* synthetic */ State<List<Chicken>> $chickens$delegate;
    final /* synthetic */ State<List<EggLog>> $eggs$delegate;
    final /* synthetic */ State<List<Sale>> $sales$delegate;
    final /* synthetic */ MutableState<Integer> $tab$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    EggSalesScreenKt$EggSalesScreen$3(State<? extends List<EggLog>> state, State<? extends List<Chicken>> state2, State<? extends List<Sale>> state3, MutableState<Integer> mutableState) {
        this.$eggs$delegate = state;
        this.$chickens$delegate = state2;
        this.$sales$delegate = state3;
        this.$tab$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues inner, Composer composer, int i) {
        int i2;
        int EggSalesScreen$lambda$5;
        int EggSalesScreen$lambda$52;
        List EggSalesScreen$lambda$2;
        List EggSalesScreen$lambda$1;
        Intrinsics.checkNotNullParameter(inner, "inner");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(inner) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1025079236, i2, -1, "com.chicken.road.cerman.fixs.ui.screens.EggSalesScreen.<anonymous> (EggSalesScreen.kt:78)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(Modifier.INSTANCE, inner), 0.0f, 1, null);
            final State<List<EggLog>> state = this.$eggs$delegate;
            final State<List<Chicken>> state2 = this.$chickens$delegate;
            final State<List<Sale>> state3 = this.$sales$delegate;
            MutableState<Integer> mutableState = this.$tab$delegate;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
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
            Updater.m3340setimpl(m3333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            EggSalesScreen$lambda$5 = EggSalesScreenKt.EggSalesScreen$lambda$5(mutableState);
            TabRowKt.m2277SecondaryTabRowpAZo6Ak(EggSalesScreen$lambda$5, null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getBackground(), 0L, null, null, ComposableLambdaKt.rememberComposableLambda(485276506, true, new EggSalesScreenKt$EggSalesScreen$3$1$1(mutableState), composer, 54), composer, 1572864, 58);
            EggSalesScreen$lambda$52 = EggSalesScreenKt.EggSalesScreen$lambda$5(mutableState);
            if (EggSalesScreen$lambda$52 == 0) {
                composer.startReplaceGroup(395001146);
                EggSalesScreen$lambda$1 = EggSalesScreenKt.EggSalesScreen$lambda$1(state);
                if (EggSalesScreen$lambda$1.isEmpty()) {
                    composer.startReplaceGroup(394988281);
                    CommonKt.EmptyState(EggAltKt.getEggAlt(Icons.Filled.INSTANCE), "No eggs logged", "Tap \"Log eggs\" to record today's collection.", composer, 432);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(395176575);
                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    PaddingValues m674PaddingValues0680j_4 = PaddingKt.m674PaddingValues0680j_4(Dp.m6299constructorimpl(16));
                    Arrangement.HorizontalOrVertical m561spacedBy0680j_4 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(8));
                    composer.startReplaceGroup(-402885517);
                    boolean changed = composer.changed(state) | composer.changed(state2);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$EggSalesScreen$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit invoke$lambda$10$lambda$4$lambda$3;
                                invoke$lambda$10$lambda$4$lambda$3 = EggSalesScreenKt$EggSalesScreen$3.invoke$lambda$10$lambda$4$lambda$3(State.this, state2, (LazyListScope) obj);
                                return invoke$lambda$10$lambda$4$lambda$3;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    LazyDslKt.LazyColumn(fillMaxSize$default2, null, m674PaddingValues0680j_4, false, m561spacedBy0680j_4, null, null, false, (Function1) rememberedValue, composer, 24966, 234);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(396770595);
                EggSalesScreen$lambda$2 = EggSalesScreenKt.EggSalesScreen$lambda$2(state3);
                if (EggSalesScreen$lambda$2.isEmpty()) {
                    composer.startReplaceGroup(396750600);
                    CommonKt.EmptyState(EggAltKt.getEggAlt(Icons.Filled.INSTANCE), "No sales yet", "Record what you sold and to whom.", composer, 432);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(396932570);
                    Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    PaddingValues m674PaddingValues0680j_42 = PaddingKt.m674PaddingValues0680j_4(Dp.m6299constructorimpl(16));
                    Arrangement.HorizontalOrVertical m561spacedBy0680j_42 = Arrangement.INSTANCE.m561spacedBy0680j_4(Dp.m6299constructorimpl(8));
                    composer.startReplaceGroup(-402828872);
                    boolean changed2 = composer.changed(state3) | composer.changed(state2);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$EggSalesScreen$3$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit invoke$lambda$10$lambda$9$lambda$8;
                                invoke$lambda$10$lambda$9$lambda$8 = EggSalesScreenKt$EggSalesScreen$3.invoke$lambda$10$lambda$9$lambda$8(State.this, state2, (LazyListScope) obj);
                                return invoke$lambda$10$lambda$9$lambda$8;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceGroup();
                    LazyDslKt.LazyColumn(fillMaxSize$default3, null, m674PaddingValues0680j_42, false, m561spacedBy0680j_42, null, null, false, (Function1) rememberedValue2, composer, 24966, 234);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$4$lambda$3(State state, final State state2, LazyListScope LazyColumn) {
        final List EggSalesScreen$lambda$1;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        EggSalesScreen$lambda$1 = EggSalesScreenKt.EggSalesScreen$lambda$1(state);
        final Function1 function1 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$EggSalesScreen$3$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object invoke$lambda$10$lambda$4$lambda$3$lambda$0;
                invoke$lambda$10$lambda$4$lambda$3$lambda$0 = EggSalesScreenKt$EggSalesScreen$3.invoke$lambda$10$lambda$4$lambda$3$lambda$0((EggLog) obj);
                return invoke$lambda$10$lambda$4$lambda$3$lambda$0;
            }
        };
        final EggSalesScreenKt$EggSalesScreen$3$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$1 eggSalesScreenKt$EggSalesScreen$3$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$1 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$EggSalesScreen$3$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(EggLog eggLog) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((EggLog) obj);
            }
        };
        LazyColumn.items(EggSalesScreen$lambda$1.size(), new Function1<Integer, Object>() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$EggSalesScreen$3$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(EggSalesScreen$lambda$1.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$EggSalesScreen$3$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(EggSalesScreen$lambda$1.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$EggSalesScreen$3$invoke$lambda$10$lambda$4$lambda$3$$inlined$items$default$4
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
                List EggSalesScreen$lambda$3;
                Object obj;
                String str;
                ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                final EggLog eggLog = (EggLog) EggSalesScreen$lambda$1.get(i);
                composer.startReplaceGroup(2000532061);
                EggSalesScreen$lambda$3 = EggSalesScreenKt.EggSalesScreen$lambda$3(state2);
                Iterator it = EggSalesScreen$lambda$3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    long id = ((Chicken) obj).getId();
                    Long chickenId = eggLog.getChickenId();
                    if (chickenId != null && id == chickenId.longValue()) {
                        break;
                    }
                }
                Chicken chicken = (Chicken) obj;
                if (chicken == null || (str = chicken.getName()) == null) {
                    str = "Whole flock";
                }
                final String str2 = str;
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m964RoundedCornerShape0680j_4(Dp.m6299constructorimpl(16)), CardDefaults.INSTANCE.m1508cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1189789788, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$EggSalesScreen$3$1$2$1$2$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Card, Composer composer2, int i4) {
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i4 & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1189789788, i4, -1, "com.chicken.road.cerman.fixs.ui.screens.EggSalesScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EggSalesScreen.kt:102)");
                            }
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m681padding3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(14)), 0.0f, 1, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            EggLog eggLog2 = EggLog.this;
                            String str3 = str2;
                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer m3333constructorimpl = Updater.m3333constructorimpl(composer2);
                            Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight$default);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer2);
                            Updater.m3340setimpl(m3333constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            TextKt.m2373Text4IGK_g(String.valueOf(str3), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer2, 0, 0, 65534);
                            TextKt.m2373Text4IGK_g(Fmt.INSTANCE.date(eggLog2.getDate()), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            TextKt.m2373Text4IGK_g(eggLog2.getCount() + " eggs", (Modifier) null, ThemeKt.getAmber(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 0, 131026);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composer, 54), composer, 196614, 24);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$EggSalesScreenKt.INSTANCE.m6702getLambda4$app_release(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$10$lambda$4$lambda$3$lambda$0(EggLog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$8(State state, final State state2, LazyListScope LazyColumn) {
        final List EggSalesScreen$lambda$2;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        EggSalesScreen$lambda$2 = EggSalesScreenKt.EggSalesScreen$lambda$2(state);
        final Function1 function1 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$EggSalesScreen$3$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object invoke$lambda$10$lambda$9$lambda$8$lambda$5;
                invoke$lambda$10$lambda$9$lambda$8$lambda$5 = EggSalesScreenKt$EggSalesScreen$3.invoke$lambda$10$lambda$9$lambda$8$lambda$5((Sale) obj);
                return invoke$lambda$10$lambda$9$lambda$8$lambda$5;
            }
        };
        final EggSalesScreenKt$EggSalesScreen$3$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$1 eggSalesScreenKt$EggSalesScreen$3$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$1 = new Function1() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$EggSalesScreen$3$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Sale sale) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((Sale) obj);
            }
        };
        LazyColumn.items(EggSalesScreen$lambda$2.size(), new Function1<Integer, Object>() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$EggSalesScreen$3$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(EggSalesScreen$lambda$2.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$EggSalesScreen$3$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(EggSalesScreen$lambda$2.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$EggSalesScreen$3$invoke$lambda$10$lambda$9$lambda$8$$inlined$items$default$4
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
                List EggSalesScreen$lambda$3;
                Object obj;
                String str;
                ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                final Sale sale = (Sale) EggSalesScreen$lambda$2.get(i);
                composer.startReplaceGroup(2002289017);
                EggSalesScreen$lambda$3 = EggSalesScreenKt.EggSalesScreen$lambda$3(state2);
                Iterator it = EggSalesScreen$lambda$3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    long id = ((Chicken) obj).getId();
                    Long chickenId = sale.getChickenId();
                    if (chickenId != null && id == chickenId.longValue()) {
                        break;
                    }
                }
                Chicken chicken = (Chicken) obj;
                if (chicken == null || (str = chicken.getName()) == null) {
                    str = "Whole flock";
                }
                final String str2 = str;
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m964RoundedCornerShape0680j_4(Dp.m6299constructorimpl(16)), CardDefaults.INSTANCE.m1508cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-37184203, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.ui.screens.EggSalesScreenKt$EggSalesScreen$3$1$3$1$2$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Card, Composer composer2, int i4) {
                        String str3;
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i4 & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-37184203, i4, -1, "com.chicken.road.cerman.fixs.ui.screens.EggSalesScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EggSalesScreen.kt:130)");
                            }
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m681padding3ABfNKs(Modifier.INSTANCE, Dp.m6299constructorimpl(14)), 0.0f, 1, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Sale sale2 = Sale.this;
                            String str4 = str2;
                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer m3333constructorimpl = Updater.m3333constructorimpl(composer2);
                            Updater.m3340setimpl(m3333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3333constructorimpl.getInserting() || !Intrinsics.areEqual(m3333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3340setimpl(m3333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, weight$default);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer m3333constructorimpl2 = Updater.m3333constructorimpl(composer2);
                            Updater.m3340setimpl(m3333constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3340setimpl(m3333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3333constructorimpl2.getInserting() || !Intrinsics.areEqual(m3333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m3333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3340setimpl(m3333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            TextKt.m2373Text4IGK_g(sale2.getSaleType() + " Ã— " + sale2.getQuantity(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer2, 0, 0, 65534);
                            if (sale2.getBuyer().length() > 0) {
                                str3 = " Â· " + sale2.getBuyer();
                            } else {
                                str3 = "";
                            }
                            TextKt.m2373Text4IGK_g(str4 + str3, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                            TextKt.m2373Text4IGK_g(Fmt.INSTANCE.date(sale2.getDate()), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            TextKt.m2373Text4IGK_g(Fmt.INSTANCE.money(sale2.getTotal()), (Modifier) null, ThemeKt.getForest(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 0, 131026);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composer, 54), composer, 196614, 24);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$EggSalesScreenKt.INSTANCE.m6703getLambda5$app_release(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$10$lambda$9$lambda$8$lambda$5(Sale it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.getId());
    }
}
