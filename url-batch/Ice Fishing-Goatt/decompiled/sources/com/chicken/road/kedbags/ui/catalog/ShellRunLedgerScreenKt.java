package com.chicken.road.kedbags.ui.catalog;

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
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
import com.chicken.road.kedbags.data.model.TreasureEgg;
import com.chicken.road.kedbags.data.repository.TreasureRepository;
import com.chicken.road.kedbags.ui.CommonKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ShellRunLedgerScreen.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\u0016\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000eX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"ShellRunLedgerScreen", "", "repository", "Lcom/chicken/road/kedbags/data/repository/TreasureRepository;", "initialTag", "", "onBack", "Lkotlin/Function0;", "onDetail", "Lkotlin/Function1;", "", "(Lcom/chicken/road/kedbags/data/repository/TreasureRepository;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app", "statuses", "", "Lcom/chicken/road/kedbags/data/model/EggStatus;", "activeTag", "pinnedOnly", ""}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShellRunLedgerScreenKt {
    static final Unit ShellRunLedgerScreen$lambda$25(TreasureRepository treasureRepository, String str, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        ShellRunLedgerScreen(treasureRepository, str, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ShellRunLedgerScreen(final TreasureRepository repository, final String str, final Function0<Unit> onBack, final Function1<? super Integer, Unit> onDetail, Composer composer, final int i) {
        final MutableState mutableState;
        final MutableState mutableState2;
        Composer composer2;
        EggStatus eggStatus;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onDetail, "onDetail");
        Composer startRestartGroup = composer.startRestartGroup(2111486043);
        ComposerKt.sourceInformation(startRestartGroup, "C(ShellRunLedgerScreen)P(3)40@1788L16,41@1826L39,42@1888L34,43@1954L26,43@1927L53,48@2241L3229:ShellRunLedgerScreen.kt#ref9mo");
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(repository) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(onBack) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(onDetail) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2111486043, i2, -1, "com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreen (ShellRunLedgerScreen.kt:38)");
            }
            final ShellRunLedgerViewModel shellRunLedgerViewModel = new ShellRunLedgerViewModel(repository);
            final State collectAsState = SnapshotStateKt.collectAsState(repository.getStatuses(), null, startRestartGroup, 0, 1);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1913532098, "CC(remember):ShellRunLedgerScreen.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState3 = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1913534077, "CC(remember):ShellRunLedgerScreen.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState4 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1913536181, "CC(remember):ShellRunLedgerScreen.kt#9igjgp");
            boolean z = (i2 & 112) == 32;
            ShellRunLedgerScreenKt$ShellRunLedgerScreen$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (z || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new ShellRunLedgerScreenKt$ShellRunLedgerScreen$1$1(str, mutableState3, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, (i2 >> 3) & 14);
            final List listOf = CollectionsKt.listOf((Object[]) new String[]{"Brood Vaults", "Ember Nests", "Coin Rings", "Road Relics", "Lucky Shells"});
            List<TreasureEgg> eggs = repository.getEggs();
            ArrayList arrayList = new ArrayList();
            for (Object obj : eggs) {
                TreasureEgg treasureEgg = (TreasureEgg) obj;
                if ((ShellRunLedgerScreen$lambda$2(mutableState3) == null || Intrinsics.areEqual(treasureEgg.getTag(), ShellRunLedgerScreen$lambda$2(mutableState3))) && (!ShellRunLedgerScreen$lambda$5(mutableState4) || ((eggStatus = ShellRunLedgerScreen$lambda$0(collectAsState).get(Integer.valueOf(treasureEgg.getId()))) != null && eggStatus.getPinned()))) {
                    arrayList.add(obj);
                }
            }
            final ArrayList arrayList2 = arrayList;
            Modifier m674paddingVpY3zN4 = PaddingKt.m674paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6265constructorimpl(16.0f), Dp.m6265constructorimpl(20.0f));
            Arrangement.HorizontalOrVertical m553spacedBy0680j_4 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(12.0f));
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 583134225, "C49@2379L508,53@2901L38,53@2963L11,53@2896L92,57@3135L208,54@2997L346,62@3352L416,72@4086L1378,68@3898L1566:ShellRunLedgerScreen.kt#ref9mo");
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
            int i3 = i2;
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 335972928, "C50@2523L277,51@2813L64:ShellRunLedgerScreen.kt#ref9mo");
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1177400573, "C50@2558L44,50@2626L10,50@2674L11,50@2553L146,50@2706L48,50@2778L11,50@2701L97:ShellRunLedgerScreen.kt#ref9mo");
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.catalog_screen_name, startRestartGroup, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getHeadlineSmall(), startRestartGroup, 0, 0, 65530);
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.catalog_screen_subtitle, startRestartGroup, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ButtonKt.Button(onBack, null, false, null, null, null, null, null, null, ComposableSingletons$ShellRunLedgerScreenKt.INSTANCE.getLambda$2038090065$app(), startRestartGroup, ((i3 >> 6) & 14) | 805306368, 510);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.trail_filters, startRestartGroup, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
            PaddingValues m670PaddingValuesa9UjIt4$default = PaddingKt.m670PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m6265constructorimpl(8.0f), 0.0f, 11, null);
            Arrangement.HorizontalOrVertical m553spacedBy0680j_43 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(8.0f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 711568757, "CC(remember):ShellRunLedgerScreen.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState3;
                rememberedValue4 = new Function1() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ShellRunLedgerScreenKt.ShellRunLedgerScreen$lambda$24$lambda$14$lambda$13(listOf, mutableState, (LazyListScope) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            } else {
                mutableState = mutableState3;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LazyDslKt.LazyRow(null, null, m670PaddingValuesa9UjIt4$default, false, m553spacedBy0680j_43, null, null, false, (Function1) rememberedValue4, startRestartGroup, 100688256, 235);
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical m553spacedBy0680j_44 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(10.0f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m553spacedBy0680j_44, centerVertically2, startRestartGroup, 54);
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
            Updater.m3323setimpl(m3316constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3323setimpl(m3316constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3316constructorimpl4.getInserting() || !Intrinsics.areEqual(m3316constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m3316constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m3316constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m3323setimpl(m3316constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 764438938, "C63@3476L36,63@3536L11,63@3471L90,64@3621L19,64@3574L67,65@3671L40,65@3654L104:ShellRunLedgerScreen.kt#ref9mo");
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.pinned_only, startRestartGroup, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
            boolean ShellRunLedgerScreen$lambda$5 = ShellRunLedgerScreen$lambda$5(mutableState4);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 578853181, "CC(remember):ShellRunLedgerScreen.kt#9igjgp");
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                mutableState2 = mutableState4;
                rememberedValue5 = new Function1() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ShellRunLedgerScreenKt.ShellRunLedgerScreen$lambda$24$lambda$19$lambda$16$lambda$15(MutableState.this, ((Boolean) obj2).booleanValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            } else {
                mutableState2 = mutableState4;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final MutableState mutableState5 = mutableState2;
            SwitchKt.Switch(ShellRunLedgerScreen$lambda$5, (Function1) rememberedValue5, null, null, false, null, null, startRestartGroup, 48, 124);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 578854802, "CC(remember):ShellRunLedgerScreen.kt#9igjgp");
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function0() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShellRunLedgerScreenKt.ShellRunLedgerScreen$lambda$24$lambda$19$lambda$18$lambda$17(MutableState.this, mutableState5);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ButtonKt.Button((Function0) rememberedValue6, null, false, null, null, null, null, null, null, ComposableSingletons$ShellRunLedgerScreenKt.INSTANCE.getLambda$388671802$app(), startRestartGroup, 805306374, 510);
            Composer composer3 = startRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (arrayList2.isEmpty()) {
                composer3.startReplaceGroup(711589825);
                ComposerKt.sourceInformation(composer3, "67@3802L38,67@3864L11,67@3797L92");
                TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.empty_catalog, composer3, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131066);
                composer3 = composer3;
            } else {
                composer3.startReplaceGroup(580677629);
            }
            composer3.endReplaceGroup();
            Modifier weight$default2 = ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            PaddingValues m670PaddingValuesa9UjIt4$default2 = PaddingKt.m670PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6265constructorimpl(16.0f), 7, null);
            Arrangement.HorizontalOrVertical m553spacedBy0680j_45 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(10.0f));
            ComposerKt.sourceInformationMarkerStart(composer3, 711600359, "CC(remember):ShellRunLedgerScreen.kt#9igjgp");
            boolean changedInstance = composer3.changedInstance(arrayList2) | composer3.changed(collectAsState) | composer3.changedInstance(shellRunLedgerViewModel) | ((i3 & 7168) == 2048);
            Object rememberedValue7 = composer3.rememberedValue();
            if (changedInstance || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function1() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ShellRunLedgerScreenKt.ShellRunLedgerScreen$lambda$24$lambda$23$lambda$22(arrayList2, collectAsState, shellRunLedgerViewModel, onDetail, (LazyListScope) obj2);
                    }
                };
                composer3.updateRememberedValue(rememberedValue7);
            }
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer2 = composer3;
            LazyDslKt.LazyColumn(weight$default2, null, m670PaddingValuesa9UjIt4$default2, false, m553spacedBy0680j_45, null, null, false, (Function1) rememberedValue7, composer2, 24960, 234);
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
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ShellRunLedgerScreenKt.ShellRunLedgerScreen$lambda$25(TreasureRepository.this, str, onBack, onDetail, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ShellRunLedgerScreen$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean ShellRunLedgerScreen$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ShellRunLedgerScreen$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final Unit ShellRunLedgerScreen$lambda$24$lambda$19$lambda$16$lambda$15(MutableState mutableState, boolean z) {
        ShellRunLedgerScreen$lambda$6(mutableState, z);
        return Unit.INSTANCE;
    }

    static final Unit ShellRunLedgerScreen$lambda$24$lambda$19$lambda$18$lambda$17(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue(null);
        ShellRunLedgerScreen$lambda$6(mutableState2, false);
        return Unit.INSTANCE;
    }

    static final Unit ShellRunLedgerScreen$lambda$24$lambda$23$lambda$22(final List list, final State state, final ShellRunLedgerViewModel shellRunLedgerViewModel, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function12 = new Function1() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShellRunLedgerScreenKt.ShellRunLedgerScreen$lambda$24$lambda$23$lambda$22$lambda$20((TreasureEgg) obj);
            }
        };
        final ShellRunLedgerScreenKt$ShellRunLedgerScreen$lambda$24$lambda$23$lambda$22$$inlined$items$default$1 shellRunLedgerScreenKt$ShellRunLedgerScreen$lambda$24$lambda$23$lambda$22$$inlined$items$default$1 = new Function1() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$lambda$24$lambda$23$lambda$22$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(TreasureEgg treasureEgg) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((TreasureEgg) obj);
            }
        };
        LazyColumn.items(list.size(), new Function1<Integer, Object>() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$lambda$24$lambda$23$lambda$22$$inlined$items$default$2
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
        }, new Function1<Integer, Object>() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$lambda$24$lambda$23$lambda$22$$inlined$items$default$3
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
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$lambda$24$lambda$23$lambda$22$$inlined$items$default$4
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
                Map ShellRunLedgerScreen$lambda$0;
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
                final TreasureEgg treasureEgg = (TreasureEgg) list.get(i);
                composer.startReplaceGroup(815677916);
                ComposerKt.sourceInformation(composer, "C*75@4205L1235,75@4200L1240:ShellRunLedgerScreen.kt#ref9mo");
                ShellRunLedgerScreen$lambda$0 = ShellRunLedgerScreenKt.ShellRunLedgerScreen$lambda$0(state);
                final EggStatus eggStatus = (EggStatus) ShellRunLedgerScreen$lambda$0.get(Integer.valueOf(treasureEgg.getId()));
                final ShellRunLedgerViewModel shellRunLedgerViewModel2 = shellRunLedgerViewModel;
                final Function1 function13 = function1;
                CardKt.Card(null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(552392431, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$2$4$1$2$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:48:0x03f0  */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x03fc  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x0524  */
                    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:72:0x0400  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(ColumnScope Card, Composer composer2, int i4) {
                        boolean z;
                        String str;
                        int currentCompositeKeyHash;
                        Composer m3316constructorimpl;
                        boolean changedInstance;
                        Object rememberedValue;
                        boolean changed;
                        Object rememberedValue2;
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        ComposerKt.sourceInformation(composer2, "C76@4227L1195:ShellRunLedgerScreen.kt#ref9mo");
                        if ((i4 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(552392431, i4, -1, "com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShellRunLedgerScreen.kt:76)");
                        }
                        Modifier m673padding3ABfNKs = PaddingKt.m673padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6265constructorimpl(14.0f));
                        Arrangement.HorizontalOrVertical m553spacedBy0680j_4 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(12.0f));
                        final TreasureEgg treasureEgg2 = TreasureEgg.this;
                        final EggStatus eggStatus2 = eggStatus;
                        final ShellRunLedgerViewModel shellRunLedgerViewModel3 = shellRunLedgerViewModel2;
                        final Function1<Integer, Unit> function14 = function13;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m553spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m673padding3ABfNKs);
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
                        Composer m3316constructorimpl2 = Updater.m3316constructorimpl(composer2);
                        Updater.m3323setimpl(m3316constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3323setimpl(m3316constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3316constructorimpl2.getInserting() || !Intrinsics.areEqual(m3316constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m3316constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m3316constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
                        }
                        Updater.m3323setimpl(m3316constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1176515697, "C77@4351L640,85@5016L384:ShellRunLedgerScreen.kt#ref9mo");
                        Arrangement.HorizontalOrVertical m553spacedBy0680j_42 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(12.0f));
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m553spacedBy0680j_42, centerVertically, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
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
                        Composer m3316constructorimpl3 = Updater.m3316constructorimpl(composer2);
                        Updater.m3323setimpl(m3316constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3323setimpl(m3316constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3316constructorimpl3.getInserting() || !Intrinsics.areEqual(m3316constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m3316constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m3316constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash2);
                        }
                        Updater.m3323setimpl(m3316constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 353364047, "C78@4486L38,79@4553L412:ShellRunLedgerScreen.kt#ref9mo");
                        CommonKt.RelicIcon(treasureEgg2.getColorHex(), treasureEgg2.getIconGlyph(), null, composer2, 0, 4);
                        Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, weight$default);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer m3316constructorimpl4 = Updater.m3316constructorimpl(composer2);
                        Updater.m3323setimpl(m3316constructorimpl4, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3323setimpl(m3316constructorimpl4, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3316constructorimpl4.getInserting() || !Intrinsics.areEqual(m3316constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m3316constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m3316constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash3);
                        }
                        Updater.m3323setimpl(m3316constructorimpl4, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 1933605124, "C80@4652L10,80@4615L60,81@4763L11,81@4708L84,82@4912L10,82@4825L110:ShellRunLedgerScreen.kt#ref9mo");
                        TextKt.m2357Text4IGK_g(treasureEgg2.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer2, 0, 0, 65534);
                        TextKt.m2357Text4IGK_g(treasureEgg2.getTag() + " · " + treasureEgg2.getClue(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131066);
                        if (eggStatus2 != null) {
                            z = true;
                            if (eggStatus2.getExplored()) {
                                str = "Explored";
                                TextKt.m2357Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelMedium(), composer2, 0, 0, 65534);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Arrangement.HorizontalOrVertical m553spacedBy0680j_43 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(8.0f));
                                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m553spacedBy0680j_43, Alignment.INSTANCE.getTop(), composer2, 6);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion2);
                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.useNode();
                                } else {
                                    composer2.createNode(constructor4);
                                }
                                m3316constructorimpl = Updater.m3316constructorimpl(composer2);
                                Updater.m3323setimpl(m3316constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                                }
                                Updater.m3323setimpl(m3316constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer2, -1707052363, "C86@5119L27,86@5148L114,86@5102L160,87@5308L20,87@5291L83:ShellRunLedgerScreen.kt#ref9mo");
                                ComposerKt.sourceInformationMarkerStart(composer2, -747802567, "CC(remember):ShellRunLedgerScreen.kt#9igjgp");
                                changedInstance = composer2.changedInstance(shellRunLedgerViewModel3) | composer2.changed(treasureEgg2);
                                rememberedValue = composer2.rememberedValue();
                                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = (Function0) new Function0<Unit>() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$2$4$1$2$1$1$2$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            ShellRunLedgerViewModel.this.togglePinned(treasureEgg2.getId());
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-618257458, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$2$4$1$2$1$1$2$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                        invoke(rowScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RowScope Button, Composer composer3, int i5) {
                                        int i6;
                                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                        ComposerKt.sourceInformation(composer3, "C86@5150L110:ShellRunLedgerScreen.kt#ref9mo");
                                        if ((i5 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-618257458, i5, -1, "com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShellRunLedgerScreen.kt:86)");
                                        }
                                        EggStatus eggStatus3 = EggStatus.this;
                                        if (eggStatus3 == null || !eggStatus3.getPinned()) {
                                            composer3.startReplaceGroup(-1439927792);
                                            ComposerKt.sourceInformation(composer3, "86@5225L34");
                                            i6 = R.string.pin_shine;
                                        } else {
                                            composer3.startReplaceGroup(-1439929134);
                                            ComposerKt.sourceInformation(composer3, "86@5183L36");
                                            i6 = R.string.unpin_shine;
                                        }
                                        String stringResource = StringResources_androidKt.stringResource(i6, composer3, 0);
                                        composer3.endReplaceGroup();
                                        TextKt.m2357Text4IGK_g(stringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 805306368, 510);
                                ComposerKt.sourceInformationMarkerStart(composer2, -747796526, "CC(remember):ShellRunLedgerScreen.kt#9igjgp");
                                changed = composer2.changed(function14) | composer2.changed(treasureEgg2);
                                rememberedValue2 = composer2.rememberedValue();
                                if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$2$4$1$2$1$1$2$3$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            function14.invoke(Integer.valueOf(treasureEgg2.getId()));
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue2);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ButtonKt.Button((Function0) rememberedValue2, null, false, null, null, null, null, null, null, ComposableSingletons$ShellRunLedgerScreenKt.INSTANCE.getLambda$1867172023$app(), composer2, 805306368, 510);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                    return;
                                }
                                ComposerKt.traceEventEnd();
                                return;
                            }
                        } else {
                            z = true;
                        }
                        str = "Unexplored";
                        TextKt.m2357Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelMedium(), composer2, 0, 0, 65534);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Arrangement.HorizontalOrVertical m553spacedBy0680j_432 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(8.0f));
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m553spacedBy0680j_432, Alignment.INSTANCE.getTop(), composer2, 6);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap42 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(composer2, companion22);
                        Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        m3316constructorimpl = Updater.m3316constructorimpl(composer2);
                        Updater.m3323setimpl(m3316constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3316constructorimpl.getInserting()) {
                        }
                        m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash42);
                        Updater.m3323setimpl(m3316constructorimpl, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1707052363, "C86@5119L27,86@5148L114,86@5102L160,87@5308L20,87@5291L83:ShellRunLedgerScreen.kt#ref9mo");
                        ComposerKt.sourceInformationMarkerStart(composer2, -747802567, "CC(remember):ShellRunLedgerScreen.kt#9igjgp");
                        changedInstance = composer2.changedInstance(shellRunLedgerViewModel3) | composer2.changed(treasureEgg2);
                        rememberedValue = composer2.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue = (Function0) new Function0<Unit>() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$2$4$1$2$1$1$2$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ShellRunLedgerViewModel.this.togglePinned(treasureEgg2.getId());
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-618257458, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$2$4$1$2$1$1$2$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope Button, Composer composer3, int i5) {
                                int i6;
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                ComposerKt.sourceInformation(composer3, "C86@5150L110:ShellRunLedgerScreen.kt#ref9mo");
                                if ((i5 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-618257458, i5, -1, "com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShellRunLedgerScreen.kt:86)");
                                }
                                EggStatus eggStatus3 = EggStatus.this;
                                if (eggStatus3 == null || !eggStatus3.getPinned()) {
                                    composer3.startReplaceGroup(-1439927792);
                                    ComposerKt.sourceInformation(composer3, "86@5225L34");
                                    i6 = R.string.pin_shine;
                                } else {
                                    composer3.startReplaceGroup(-1439929134);
                                    ComposerKt.sourceInformation(composer3, "86@5183L36");
                                    i6 = R.string.unpin_shine;
                                }
                                String stringResource = StringResources_androidKt.stringResource(i6, composer3, 0);
                                composer3.endReplaceGroup();
                                TextKt.m2357Text4IGK_g(stringResource, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306368, 510);
                        ComposerKt.sourceInformationMarkerStart(composer2, -747796526, "CC(remember):ShellRunLedgerScreen.kt#9igjgp");
                        changed = composer2.changed(function14) | composer2.changed(treasureEgg2);
                        rememberedValue2 = composer2.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$2$4$1$2$1$1$2$3$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function14.invoke(Integer.valueOf(treasureEgg2.getId()));
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ButtonKt.Button((Function0) rememberedValue2, null, false, null, null, null, null, null, null, ComposableSingletons$ShellRunLedgerScreenKt.INSTANCE.getLambda$1867172023$app(), composer2, 805306368, 510);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Object ShellRunLedgerScreen$lambda$24$lambda$23$lambda$22$lambda$20(TreasureEgg it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Integer, EggStatus> ShellRunLedgerScreen$lambda$0(State<? extends Map<Integer, EggStatus>> state) {
        return state.getValue();
    }

    static final Unit ShellRunLedgerScreen$lambda$24$lambda$14$lambda$13(final List list, final MutableState mutableState, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final ShellRunLedgerScreenKt$ShellRunLedgerScreen$lambda$24$lambda$14$lambda$13$$inlined$items$default$1 shellRunLedgerScreenKt$ShellRunLedgerScreen$lambda$24$lambda$14$lambda$13$$inlined$items$default$1 = new Function1() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$lambda$24$lambda$14$lambda$13$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(String str) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((String) obj);
            }
        };
        LazyRow.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$lambda$24$lambda$14$lambda$13$$inlined$items$default$3
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
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$lambda$24$lambda$14$lambda$13$$inlined$items$default$4
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
                String ShellRunLedgerScreen$lambda$2;
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
                final String str = (String) list.get(i);
                composer.startReplaceGroup(-1092862444);
                ComposerKt.sourceInformation(composer, "C*59@3244L51,59@3305L13,59@3186L133:ShellRunLedgerScreen.kt#ref9mo");
                ShellRunLedgerScreen$lambda$2 = ShellRunLedgerScreenKt.ShellRunLedgerScreen$lambda$2(mutableState);
                boolean areEqual = Intrinsics.areEqual(ShellRunLedgerScreen$lambda$2, str);
                ComposerKt.sourceInformationMarkerStart(composer, -1836367171, "CC(remember):ShellRunLedgerScreen.kt#9igjgp");
                boolean changed = composer.changed(str);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final MutableState mutableState2 = mutableState;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$2$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            String ShellRunLedgerScreen$lambda$22;
                            MutableState<String> mutableState3 = mutableState2;
                            ShellRunLedgerScreen$lambda$22 = ShellRunLedgerScreenKt.ShellRunLedgerScreen$lambda$2(mutableState3);
                            mutableState3.setValue(Intrinsics.areEqual(ShellRunLedgerScreen$lambda$22, str) ? null : str);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ChipKt.ElevatedFilterChip(areEqual, (Function0) rememberedValue, ComposableLambdaKt.rememberComposableLambda(95397965, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreenKt$ShellRunLedgerScreen$2$2$1$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        ComposerKt.sourceInformation(composer2, "C59@3307L9:ShellRunLedgerScreen.kt#ref9mo");
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(95397965, i4, -1, "com.chicken.road.kedbags.ui.catalog.ShellRunLedgerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShellRunLedgerScreen.kt:59)");
                        }
                        TextKt.m2357Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), null, false, null, null, null, null, null, null, null, composer, 384, 0, 4088);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
