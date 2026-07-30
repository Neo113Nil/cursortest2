package com.chicken.road.kedbags.ui.detail;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.chicken.road.kedbags.R;
import com.chicken.road.kedbags.data.model.EggStatus;
import com.chicken.road.kedbags.data.model.TreasureEgg;
import com.chicken.road.kedbags.data.repository.TreasureRepository;
import com.chicken.road.kedbags.ui.CommonKt;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EggmarkDossierScreen.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\u0016\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u0005X\u008a\u008e\u0002"}, d2 = {"EggmarkDossierScreen", "", "repository", "Lcom/chicken/road/kedbags/data/repository/TreasureRepository;", "eggId", "", "onBack", "Lkotlin/Function0;", "(Lcom/chicken/road/kedbags/data/repository/TreasureRepository;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "statuses", "", "Lcom/chicken/road/kedbags/data/model/EggStatus;", "tab"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EggmarkDossierScreenKt {
    static final Unit EggmarkDossierScreen$lambda$25(TreasureRepository treasureRepository, int i, Function0 function0, int i2, Composer composer, int i3) {
        EggmarkDossierScreen(treasureRepository, i, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void EggmarkDossierScreen(final TreasureRepository repository, int i, final Function0<Unit> onBack, Composer composer, final int i2) {
        final int i3;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer startRestartGroup = composer.startRestartGroup(2090328006);
        ComposerKt.sourceInformation(startRestartGroup, "C(EggmarkDossierScreen)P(2)46@2044L16,48@2140L33,49@2205L7,51@2271L21,50@2217L3356:EggmarkDossierScreen.kt#ousbnu");
        int i4 = (i2 & 6) == 0 ? (startRestartGroup.changedInstance(repository) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(onBack) ? 256 : 128;
        }
        if ((i4 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2090328006, i4, -1, "com.chicken.road.kedbags.ui.detail.EggmarkDossierScreen (EggmarkDossierScreen.kt:43)");
            }
            final EggmarkDossierViewModel eggmarkDossierViewModel = new EggmarkDossierViewModel(repository);
            for (final TreasureEgg treasureEgg : repository.getEggs()) {
                if (treasureEgg.getId() == i) {
                    EggStatus eggStatus = EggmarkDossierScreen$lambda$1(SnapshotStateKt.collectAsState(repository.getStatuses(), null, startRestartGroup, 0, 1)).get(Integer.valueOf(i));
                    if (eggStatus == null) {
                        eggStatus = repository.statusFor(i);
                    }
                    EggStatus eggStatus2 = eggStatus;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1239469753, "CC(remember):EggmarkDossierScreen.kt#9igjgp");
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final MutableIntState mutableIntState = (MutableIntState) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Context context = (Context) consume;
                    Modifier m674paddingVpY3zN4 = PaddingKt.m674paddingVpY3zN4(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), Dp.m6265constructorimpl(16.0f), Dp.m6265constructorimpl(20.0f));
                    Arrangement.HorizontalOrVertical m553spacedBy0680j_4 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(14.0f));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    int i5 = i4;
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
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1285482653, "C54@2415L506,60@3060L11,60@3018L62,61@3091L560,58@2930L721,71@3691L226,71@3660L257:EggmarkDossierScreen.kt#ousbnu");
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical m553spacedBy0680j_42 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(12.0f));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m553spacedBy0680j_42, centerVertically, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor2);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m3316constructorimpl2 = Updater.m3316constructorimpl(startRestartGroup);
                    Updater.m3323setimpl(m3316constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3323setimpl(m3316constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3316constructorimpl2.getInserting() || !Intrinsics.areEqual(m3316constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m3316constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3316constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3323setimpl(m3316constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -672519113, "C55@2559L275,56@2847L64:EggmarkDossierScreen.kt#ousbnu");
                    Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m3316constructorimpl3 = Updater.m3316constructorimpl(startRestartGroup);
                    Updater.m3323setimpl(m3316constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3323setimpl(m3316constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3316constructorimpl3.getInserting() || !Intrinsics.areEqual(m3316constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m3316constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m3316constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m3323setimpl(m3316constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1636740230, "C55@2594L43,55@2661L10,55@2709L11,55@2589L145,55@2741L47,55@2812L11,55@2736L96:EggmarkDossierScreen.kt#ousbnu");
                    TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.detail_screen_name, startRestartGroup, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getHeadlineSmall(), startRestartGroup, 0, 0, 65530);
                    TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.detail_screen_subtitle, startRestartGroup, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ButtonKt.Button(onBack, null, false, null, null, null, null, null, null, ComposableSingletons$EggmarkDossierScreenKt.INSTANCE.m6560getLambda$1984350404$app(), startRestartGroup, ((i5 >> 6) & 14) | 805306368, 510);
                    startRestartGroup = startRestartGroup;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, CardDefaults.INSTANCE.m1492cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-767656738, true, new Function3() { // from class: com.chicken.road.kedbags.ui.detail.EggmarkDossierScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return EggmarkDossierScreenKt.EggmarkDossierScreen$lambda$24$lambda$9(TreasureEgg.this, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 196614, 26);
                    TabRowKt.m2262TabRowpAZo6Ak(EggmarkDossierScreen$lambda$3(mutableIntState), null, 0L, 0L, null, null, ComposableLambdaKt.rememberComposableLambda(-1597370248, true, new Function2() { // from class: com.chicken.road.kedbags.ui.detail.EggmarkDossierScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EggmarkDossierScreenKt.EggmarkDossierScreen$lambda$24$lambda$14(MutableIntState.this, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 1572864, 62);
                    int EggmarkDossierScreen$lambda$3 = EggmarkDossierScreen$lambda$3(mutableIntState);
                    if (EggmarkDossierScreen$lambda$3 == 0) {
                        i3 = i;
                        startRestartGroup.startReplaceGroup(-1703988602);
                        ComposerKt.sourceInformation(startRestartGroup, "75@3956L406");
                        Arrangement.HorizontalOrVertical m553spacedBy0680j_43 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(12.0f));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(m553spacedBy0680j_43, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor4);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m3316constructorimpl4 = Updater.m3316constructorimpl(startRestartGroup);
                        Updater.m3323setimpl(m3316constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3323setimpl(m3316constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3316constructorimpl4.getInserting() || !Intrinsics.areEqual(m3316constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m3316constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m3316constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m3323setimpl(m3316constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -188685595, "C76@4069L11,76@4032L62,77@4111L237:EggmarkDossierScreen.kt#ousbnu");
                        TextKt.m2357Text4IGK_g(treasureEgg.getLore(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor5);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m3316constructorimpl5 = Updater.m3316constructorimpl(startRestartGroup);
                        Updater.m3323setimpl(m3316constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3323setimpl(m3316constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3316constructorimpl5.getInserting() || !Intrinsics.areEqual(m3316constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            m3316constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            m3316constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        Updater.m3323setimpl(m3316constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -111817488, "C77@4219L29,77@4165L84,77@4256L41,77@4321L11,77@4251L95:EggmarkDossierScreen.kt#ousbnu");
                        boolean explored = eggStatus2.getExplored();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1250531429, "CC(remember):EggmarkDossierScreen.kt#9igjgp");
                        boolean changedInstance = startRestartGroup.changedInstance(eggmarkDossierViewModel) | ((i5 & 112) == 32);
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: com.chicken.road.kedbags.ui.detail.EggmarkDossierScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return EggmarkDossierScreenKt.EggmarkDossierScreen$lambda$24$lambda$18$lambda$17$lambda$16$lambda$15(EggmarkDossierViewModel.this, i3, ((Boolean) obj).booleanValue());
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        CheckboxKt.Checkbox(explored, (Function1) rememberedValue2, null, false, null, null, startRestartGroup, 0, 60);
                        TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.explored_on_road, startRestartGroup, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                    } else if (EggmarkDossierScreen$lambda$3 != 1) {
                        startRestartGroup.startReplaceGroup(-1703943480);
                        ComposerKt.sourceInformation(startRestartGroup, "89@5428L25,89@5373L184");
                        String note = eggStatus2.getNote();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1703941879, "CC(remember):EggmarkDossierScreen.kt#9igjgp");
                        boolean changedInstance2 = startRestartGroup.changedInstance(eggmarkDossierViewModel) | ((i5 & 112) == 32);
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            i3 = i;
                            rememberedValue3 = new Function1() { // from class: com.chicken.road.kedbags.ui.detail.EggmarkDossierScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return EggmarkDossierScreenKt.EggmarkDossierScreen$lambda$24$lambda$23$lambda$22(EggmarkDossierViewModel.this, i3, (String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        } else {
                            i3 = i;
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        OutlinedTextFieldKt.OutlinedTextField(note, (Function1<? super String, Unit>) rememberedValue3, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EggmarkDossierScreenKt.INSTANCE.getLambda$103614294$app(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, 12583296, 0, 0, 8388472);
                        startRestartGroup.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        i3 = i;
                        startRestartGroup.startReplaceGroup(-1703974468);
                        ComposerKt.sourceInformation(startRestartGroup, "79@4380L972");
                        Arrangement.HorizontalOrVertical m553spacedBy0680j_44 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(8.0f));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(m553spacedBy0680j_44, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
                        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor6);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m3316constructorimpl6 = Updater.m3316constructorimpl(startRestartGroup);
                        Updater.m3323setimpl(m3316constructorimpl6, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3323setimpl(m3316constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3316constructorimpl6.getInserting() || !Intrinsics.areEqual(m3316constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            m3316constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            m3316constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        Updater.m3323setimpl(m3316constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1844654199, "C80@4463L41,80@4548L11,80@4455L118,81@4598L42,81@4687L11,81@4590L122,82@4737L40,82@4820L11,82@4729L116,83@4870L44,83@4961L11,83@4862L124,84@5020L267,84@5003L335:EggmarkDossierScreen.kt#ousbnu");
                        TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.hatch_year_label, startRestartGroup, 0) + ": " + treasureEgg.getHatchYear(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
                        TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.glow_rating_label, startRestartGroup, 0) + ": " + treasureEgg.getGlowRating() + "/5", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
                        TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.road_mile_label, startRestartGroup, 0) + ": " + treasureEgg.getRoadMile(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
                        TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.keeper_phrase_label, startRestartGroup, 0) + ": " + treasureEgg.getKeeperPhrase(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2137732420, "CC(remember):EggmarkDossierScreen.kt#9igjgp");
                        boolean changedInstance3 = startRestartGroup.changedInstance(context) | startRestartGroup.changed(treasureEgg);
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Function0() { // from class: com.chicken.road.kedbags.ui.detail.EggmarkDossierScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return EggmarkDossierScreenKt.EggmarkDossierScreen$lambda$24$lambda$21$lambda$20$lambda$19(context, treasureEgg);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ButtonKt.Button((Function0) rememberedValue4, null, false, null, null, null, null, null, null, ComposableSingletons$EggmarkDossierScreenKt.INSTANCE.m6561getLambda$367171671$app(), startRestartGroup, 805306368, 510);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceGroup();
                        Unit unit3 = Unit.INSTANCE;
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        startRestartGroup.skipToGroupEnd();
        i3 = i;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.kedbags.ui.detail.EggmarkDossierScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EggmarkDossierScreenKt.EggmarkDossierScreen$lambda$25(TreasureRepository.this, i3, onBack, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final int EggmarkDossierScreen$lambda$3(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    static final Unit EggmarkDossierScreen$lambda$24$lambda$9(TreasureEgg treasureEgg, ColumnScope Card, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation(composer, "C62@3105L536:EggmarkDossierScreen.kt#ousbnu");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-767656738, i, -1, "com.chicken.road.kedbags.ui.detail.EggmarkDossierScreen.<anonymous>.<anonymous> (EggmarkDossierScreen.kt:62)");
            }
            Modifier m673padding3ABfNKs = PaddingKt.m673padding3ABfNKs(Modifier.INSTANCE, Dp.m6265constructorimpl(16.0f));
            Arrangement.HorizontalOrVertical m553spacedBy0680j_4 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(14.0f));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m553spacedBy0680j_4, centerVertically, composer, 54);
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
            Updater.m3323setimpl(m3316constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1201579821, "C63@3253L38,64@3308L319:EggmarkDossierScreen.kt#ousbnu");
            CommonKt.RelicIcon(treasureEgg.getColorHex(), treasureEgg.getIconGlyph(), null, composer, 0, 4);
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            Arrangement.HorizontalOrVertical m553spacedBy0680j_42 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(4.0f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m553spacedBy0680j_42, Alignment.INSTANCE.getStart(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, weight$default);
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
            Updater.m3323setimpl(m3316constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3316constructorimpl2.getInserting() || !Intrinsics.areEqual(m3316constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3316constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3316constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3323setimpl(m3316constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -667235114, "C65@3445L10,65@3408L59,66@3545L11,66@3488L86,67@3595L14:EggmarkDossierScreen.kt#ousbnu");
            TextKt.m2357Text4IGK_g(treasureEgg.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer, 0, 0, 65534);
            TextKt.m2357Text4IGK_g(treasureEgg.getTag() + " · " + treasureEgg.getRarity(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131066);
            TextKt.m2357Text4IGK_g(treasureEgg.getClue(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
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

    static final Unit EggmarkDossierScreen$lambda$24$lambda$14(final MutableIntState mutableIntState, Composer composer, int i) {
        Composer composer2 = composer;
        ComposerKt.sourceInformation(composer2, "C*72@3849L15,72@3873L31,72@3810L95:EggmarkDossierScreen.kt#ousbnu");
        if ((i & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1597370248, i, -1, "com.chicken.road.kedbags.ui.detail.EggmarkDossierScreen.<anonymous>.<anonymous> (EggmarkDossierScreen.kt:72)");
            }
            final int i2 = 0;
            for (Object obj : CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.overview_tab), Integer.valueOf(R.string.details_tab), Integer.valueOf(R.string.notes_tab)})) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final int intValue = ((Number) obj).intValue();
                boolean z = EggmarkDossierScreen$lambda$3(mutableIntState) == i2;
                ComposerKt.sourceInformationMarkerStart(composer2, 178199919, "CC(remember):EggmarkDossierScreen.kt#9igjgp");
                boolean changed = composer2.changed(i2);
                Object rememberedValue = composer2.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.chicken.road.kedbags.ui.detail.EggmarkDossierScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EggmarkDossierScreenKt.EggmarkDossierScreen$lambda$24$lambda$14$lambda$13$lambda$11$lambda$10(i2, mutableIntState);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                TabKt.m2243TabwqdebIU(z, (Function0) rememberedValue, null, false, ComposableLambdaKt.rememberComposableLambda(-933689178, true, new Function2() { // from class: com.chicken.road.kedbags.ui.detail.EggmarkDossierScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return EggmarkDossierScreenKt.EggmarkDossierScreen$lambda$24$lambda$14$lambda$13$lambda$12(intValue, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer2, 54), null, 0L, 0L, null, composer2, 24576, 492);
                composer2 = composer;
                i2 = i3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit EggmarkDossierScreen$lambda$24$lambda$14$lambda$13$lambda$11$lambda$10(int i, MutableIntState mutableIntState) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }

    static final Unit EggmarkDossierScreen$lambda$24$lambda$14$lambda$13$lambda$12(int i, Composer composer, int i2) {
        ComposerKt.sourceInformation(composer, "C72@3880L21,72@3875L27:EggmarkDossierScreen.kt#ousbnu");
        if ((i2 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-933689178, i2, -1, "com.chicken.road.kedbags.ui.detail.EggmarkDossierScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EggmarkDossierScreen.kt:72)");
            }
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(i, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit EggmarkDossierScreen$lambda$24$lambda$18$lambda$17$lambda$16$lambda$15(EggmarkDossierViewModel eggmarkDossierViewModel, int i, boolean z) {
        eggmarkDossierViewModel.setExplored(i, z);
        return Unit.INSTANCE;
    }

    static final Unit EggmarkDossierScreen$lambda$24$lambda$21$lambda$20$lambda$19(Context context, TreasureEgg treasureEgg) {
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(context.getString(R.string.copied_summary), treasureEgg.getName() + ": " + treasureEgg.getClue()));
        return Unit.INSTANCE;
    }

    static final Unit EggmarkDossierScreen$lambda$24$lambda$23$lambda$22(EggmarkDossierViewModel eggmarkDossierViewModel, int i, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        eggmarkDossierViewModel.setNote(i, it);
        return Unit.INSTANCE;
    }

    private static final Map<Integer, EggStatus> EggmarkDossierScreen$lambda$1(State<? extends Map<Integer, EggStatus>> state) {
        return state.getValue();
    }
}
