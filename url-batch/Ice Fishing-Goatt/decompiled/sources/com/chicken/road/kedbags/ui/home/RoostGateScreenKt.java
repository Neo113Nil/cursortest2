package com.chicken.road.kedbags.ui.home;

import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.chicken.road.kedbags.R;
import com.chicken.road.kedbags.data.model.EggStatus;
import com.chicken.road.kedbags.data.repository.TreasureRepository;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RoostGateScreen.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\u0016\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u008a\u0084\u0002"}, d2 = {"RoostGateScreen", "", "repository", "Lcom/chicken/road/kedbags/data/repository/TreasureRepository;", "onCatalog", "Lkotlin/Function0;", "onCatalogTag", "Lkotlin/Function1;", "", "onQuiz", "(Lcom/chicken/road/kedbags/data/repository/TreasureRepository;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "statuses", "", "", "Lcom/chicken/road/kedbags/data/model/EggStatus;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoostGateScreenKt {
    static final Unit RoostGateScreen$lambda$15(TreasureRepository treasureRepository, Function0 function0, Function1 function1, Function0 function02, int i, Composer composer, int i2) {
        RoostGateScreen(treasureRepository, function0, function1, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RoostGateScreen(final TreasureRepository repository, final Function0<Unit> onCatalog, final Function1<? super String, Unit> onCatalogTag, final Function0<Unit> onQuiz, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(onCatalog, "onCatalog");
        Intrinsics.checkNotNullParameter(onCatalogTag, "onCatalogTag");
        Intrinsics.checkNotNullParameter(onQuiz, "onQuiz");
        Composer startRestartGroup = composer.startRestartGroup(1702253172);
        ComposerKt.sourceInformation(startRestartGroup, "C(RoostGateScreen)P(3)35@1636L16,37@1685L37,38@1745L35,39@1800L37,39@1841L32,40@1883L36,40@1923L31,42@1965L2291:RoostGateScreen.kt#7iei3s");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(repository) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onCatalog) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(onCatalogTag) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(onQuiz) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1702253172, i2, -1, "com.chicken.road.kedbags.ui.home.RoostGateScreen (RoostGateScreen.kt:33)");
            }
            final RoostGateViewModel roostGateViewModel = new RoostGateViewModel(repository);
            final State collectAsState = SnapshotStateKt.collectAsState(repository.getStatuses(), null, startRestartGroup, 0, 1);
            Pair[] pairArr = new Pair[4];
            pairArr[0] = TuplesKt.to(StringResources_androidKt.stringResource(R.string.open_catalog, startRestartGroup, 0), onCatalog);
            pairArr[1] = TuplesKt.to(StringResources_androidKt.stringResource(R.string.start_quiz, startRestartGroup, 0), onQuiz);
            String stringResource = StringResources_androidKt.stringResource(R.string.lucky_shells, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -517227692, "CC(remember):RoostGateScreen.kt#9igjgp");
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.chicken.road.kedbags.ui.home.RoostGateScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RoostGateScreenKt.RoostGateScreen$lambda$2$lambda$1(Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            pairArr[2] = TuplesKt.to(stringResource, (Function0) rememberedValue);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.road_relics, startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -517225069, "CC(remember):RoostGateScreen.kt#9igjgp");
            boolean z2 = i3 == 256;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.chicken.road.kedbags.ui.home.RoostGateScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RoostGateScreenKt.RoostGateScreen$lambda$4$lambda$3(Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            pairArr[3] = TuplesKt.to(stringResource2, (Function0) rememberedValue2);
            final List listOf = CollectionsKt.listOf((Object[]) pairArr);
            Modifier m674paddingVpY3zN4 = PaddingKt.m674paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6265constructorimpl(20.0f), Dp.m6265constructorimpl(24.0f));
            Arrangement.HorizontalOrVertical m553spacedBy0680j_4 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(16.0f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m553spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m674paddingVpY3zN4);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3316constructorimpl = Updater.m3316constructorimpl(startRestartGroup);
            Updater.m3323setimpl(m3316constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1979000510, "C43@2108L41,43@2173L10,43@2221L11,43@2103L143,44@2260L45,44@2329L11,44@2255L94,47@2488L11,47@2446L62,48@2519L941,45@2358L1102,65@3770L480,59@3469L781:RoostGateScreen.kt#7iei3s");
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_screen_name, startRestartGroup, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getHeadlineLarge(), startRestartGroup, 0, 0, 65530);
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_screen_subtitle, startRestartGroup, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, CardDefaults.INSTANCE.m1492cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(500736908, true, new Function3() { // from class: com.chicken.road.kedbags.ui.home.RoostGateScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return RoostGateScreenKt.RoostGateScreen$lambda$14$lambda$9(RoostGateViewModel.this, collectAsState, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 196614, 26);
            Modifier weight$default = ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            PaddingValues m670PaddingValuesa9UjIt4$default = PaddingKt.m670PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6265constructorimpl(12.0f), 7, null);
            GridCells.Fixed fixed2 = fixed;
            Arrangement.HorizontalOrVertical m553spacedBy0680j_42 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(12.0f));
            Arrangement.HorizontalOrVertical m553spacedBy0680j_43 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(12.0f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -895071042, "CC(remember):RoostGateScreen.kt#9igjgp");
            boolean changed = startRestartGroup.changed(listOf);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: com.chicken.road.kedbags.ui.home.RoostGateScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RoostGateScreenKt.RoostGateScreen$lambda$14$lambda$13$lambda$12(listOf, (LazyGridScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LazyGridDslKt.LazyVerticalGrid(fixed2, weight$default, null, m670PaddingValuesa9UjIt4$default, false, m553spacedBy0680j_42, m553spacedBy0680j_43, null, false, (Function1) rememberedValue3, startRestartGroup, 1772544, 404);
            composer2 = startRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.kedbags.ui.home.RoostGateScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RoostGateScreenKt.RoostGateScreen$lambda$15(TreasureRepository.this, onCatalog, onCatalogTag, onQuiz, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit RoostGateScreen$lambda$2$lambda$1(Function1 function1) {
        function1.invoke("Lucky Shells");
        return Unit.INSTANCE;
    }

    static final Unit RoostGateScreen$lambda$4$lambda$3(Function1 function1) {
        function1.invoke("Road Relics");
        return Unit.INSTANCE;
    }

    static final Unit RoostGateScreen$lambda$14$lambda$9(RoostGateViewModel roostGateViewModel, State state, ColumnScope Card, Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation(composer, "C49@2533L917:RoostGateScreen.kt#7iei3s");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(500736908, i, -1, "com.chicken.road.kedbags.ui.home.RoostGateScreen.<anonymous>.<anonymous> (RoostGateScreen.kt:49)");
            }
            Modifier m673padding3ABfNKs = PaddingKt.m673padding3ABfNKs(Modifier.INSTANCE, Dp.m6265constructorimpl(20.0f));
            Arrangement.HorizontalOrVertical m553spacedBy0680j_4 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(12.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m553spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m673padding3ABfNKs);
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
            Composer m3316constructorimpl = Updater.m3316constructorimpl(composer);
            Updater.m3323setimpl(m3316constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 961074379, "C50@2639L35,50@2698L10,50@2634L86,51@2742L38,51@2737L44,52@2798L638:RoostGateScreen.kt#7iei3s");
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_title, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer, 0, 0, 65534);
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.home_subtitle, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical m553spacedBy0680j_42 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(10.0f));
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m553spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m3316constructorimpl2 = Updater.m3316constructorimpl(composer);
            Updater.m3323setimpl(m3316constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3316constructorimpl2.getInserting() || !Intrinsics.areEqual(m3316constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3316constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3316constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3323setimpl(m3316constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1855505139, "C53@2910L37,53@3018L10,53@2902L138,54@3069L38,54@3205L10,54@3061L166,55@3256L40,55@3396L10,55@3248L170:RoostGateScreen.kt#7iei3s");
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.total_relics, composer, 0) + "\n" + roostGateViewModel.getTotal(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelLarge(), composer, 0, 0, 65532);
            String stringResource = StringResources_androidKt.stringResource(R.string.pinned_relics, composer, 0);
            Collection<EggStatus> values = RoostGateScreen$lambda$0(state).values();
            if ((values instanceof Collection) && values.isEmpty()) {
                i2 = 0;
            } else {
                Iterator<T> it = values.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (((EggStatus) it.next()).getPinned() && (i2 = i2 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            TextKt.m2357Text4IGK_g(stringResource + "\n" + i2, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelLarge(), composer, 0, 0, 65532);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.explored_relics, composer, 0);
            Collection<EggStatus> values2 = RoostGateScreen$lambda$0(state).values();
            if ((values2 instanceof Collection) && values2.isEmpty()) {
                i3 = 0;
            } else {
                Iterator<T> it2 = values2.iterator();
                i3 = 0;
                while (it2.hasNext()) {
                    if (((EggStatus) it2.next()).getExplored() && (i3 = i3 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            TextKt.m2357Text4IGK_g(stringResource2 + "\n" + i3, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelLarge(), composer, 0, 0, 65532);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Map<Integer, EggStatus> RoostGateScreen$lambda$0(State<? extends Map<Integer, EggStatus>> state) {
        return state.getValue();
    }

    static final Unit RoostGateScreen$lambda$14$lambda$13$lambda$12(final List list, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final RoostGateScreenKt$RoostGateScreen$lambda$14$lambda$13$lambda$12$$inlined$items$default$1 roostGateScreenKt$RoostGateScreen$lambda$14$lambda$13$lambda$12$$inlined$items$default$1 = new Function1() { // from class: com.chicken.road.kedbags.ui.home.RoostGateScreenKt$RoostGateScreen$lambda$14$lambda$13$lambda$12$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Pair<? extends String, ? extends Function0<? extends Unit>> pair) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((Pair<? extends String, ? extends Function0<? extends Unit>>) obj);
            }
        };
        LazyVerticalGrid.items(list.size(), null, null, new Function1<Integer, Object>() { // from class: com.chicken.road.kedbags.ui.home.RoostGateScreenKt$RoostGateScreen$lambda$14$lambda$13$lambda$12$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.chicken.road.kedbags.ui.home.RoostGateScreenKt$RoostGateScreen$lambda$14$lambda$13$lambda$12$$inlined$items$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C464@19670L22:LazyGridDsl.kt#7791vq");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyGridItemScope) ? 4 : 2);
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
                    ComposerKt.traceEventStart(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:464)");
                }
                final Pair pair = (Pair) list.get(i);
                composer.startReplaceGroup(1762874038);
                ComposerKt.sourceInformation(composer, "C*68@3894L17,69@3997L11,69@3955L71,70@4045L181,67@3823L403:RoostGateScreen.kt#7iei3s");
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(composer, 749605451, "CC(remember):RoostGateScreen.kt#9igjgp");
                boolean changed = composer.changed(pair);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: com.chicken.road.kedbags.ui.home.RoostGateScreenKt$RoostGateScreen$1$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            pair.getSecond().invoke();
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                CardKt.Card(ClickableKt.m261clickableXHw0xAI$default(fillMaxWidth$default, false, null, null, (Function0) rememberedValue, 7, null), null, CardDefaults.INSTANCE.m1492cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1299010700, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.chicken.road.kedbags.ui.home.RoostGateScreenKt$RoostGateScreen$1$2$1$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Card, Composer composer2, int i4) {
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        ComposerKt.sourceInformation(composer2, "C71@4131L11,71@4185L10,71@4067L141:RoostGateScreen.kt#7iei3s");
                        if ((i4 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1299010700, i4, -1, "com.chicken.road.kedbags.ui.home.RoostGateScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RoostGateScreen.kt:71)");
                        }
                        TextKt.m2357Text4IGK_g(pair.getFirst(), PaddingKt.m673padding3ABfNKs(Modifier.INSTANCE, Dp.m6265constructorimpl(18.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnPrimaryContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer2, 48, 0, 65528);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
