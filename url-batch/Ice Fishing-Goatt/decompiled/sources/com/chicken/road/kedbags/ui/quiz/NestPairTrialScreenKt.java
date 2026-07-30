package com.chicken.road.kedbags.ui.quiz;

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
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
import com.chicken.road.kedbags.data.model.TreasureEgg;
import com.chicken.road.kedbags.data.repository.TreasureRepository;
import com.chicken.road.kedbags.ui.CommonKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NestPairTrialScreen.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\n\u001a\u00020\tX\u008a\u008e\u0002²\u0006\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u008a\u008e\u0002²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u008a\u008e\u0002"}, d2 = {"NestPairTrialScreen", "", "repository", "Lcom/chicken/road/kedbags/data/repository/TreasureRepository;", "onBack", "Lkotlin/Function0;", "(Lcom/chicken/road/kedbags/data/repository/TreasureRepository;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "started", "", "complete", "cards", "", "Lcom/chicken/road/kedbags/ui/quiz/MemoryCard;", "firstPick", ""}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NestPairTrialScreenKt {
    static final Unit NestPairTrialScreen$lambda$37(TreasureRepository treasureRepository, Function0 function0, int i, Composer composer, int i2) {
        NestPairTrialScreen(treasureRepository, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void NestPairTrialScreen(final TreasureRepository repository, Function0<Unit> onBack, Composer composer, final int i) {
        int i2;
        int i3;
        final Function0<Unit> function0;
        final TreasureRepository treasureRepository;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer startRestartGroup = composer.startRestartGroup(705584837);
        ComposerKt.sourceInformation(startRestartGroup, "C(NestPairTrialScreen)P(1)43@1941L34,44@1996L34,45@2048L52,46@2122L39,79@3482L3056:NestPairTrialScreen.kt#7i8muq");
        if ((i & 6) == 0) {
            i2 = i | (startRestartGroup.changedInstance(repository) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onBack) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            treasureRepository = repository;
            function0 = onBack;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(705584837, i2, -1, "com.chicken.road.kedbags.ui.quiz.NestPairTrialScreen (NestPairTrialScreen.kt:41)");
            }
            final NestPairTrialViewModel nestPairTrialViewModel = new NestPairTrialViewModel(repository);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -537799353, "CC(remember):NestPairTrialScreen.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -537797593, "CC(remember):NestPairTrialScreen.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -537795911, "CC(remember):NestPairTrialScreen.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -537793556, "CC(remember):NestPairTrialScreen.kt#9igjgp");
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final MutableState mutableState4 = (MutableState) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            List<MemoryCard> NestPairTrialScreen$lambda$7 = NestPairTrialScreen$lambda$7(mutableState3);
            if ((NestPairTrialScreen$lambda$7 instanceof Collection) && NestPairTrialScreen$lambda$7.isEmpty()) {
                i3 = 0;
            } else {
                Iterator<T> it = NestPairTrialScreen$lambda$7.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    if (((MemoryCard) it.next()).getMatched() && (i3 = i3 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            int i4 = i3 / 2;
            Modifier m674paddingVpY3zN4 = PaddingKt.m674paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6265constructorimpl(16.0f), Dp.m6265constructorimpl(20.0f));
            Arrangement.HorizontalOrVertical m553spacedBy0680j_4 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(14.0f));
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 306216180, "C80@3620L502:NestPairTrialScreen.kt#7i8muq");
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 415912540, "C81@3764L271,82@4048L64:NestPairTrialScreen.kt#7i8muq");
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -238628961, "C81@3799L41,81@3864L10,81@3912L11,81@3794L143,81@3944L45,81@4013L11,81@3939L94:NestPairTrialScreen.kt#7i8muq");
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.quiz_screen_name, startRestartGroup, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getHeadlineSmall(), startRestartGroup, 0, 0, 65530);
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.quiz_screen_subtitle, startRestartGroup, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ButtonKt.Button(onBack, null, false, null, null, null, null, null, null, ComposableSingletons$NestPairTrialScreenKt.INSTANCE.m6564getLambda$1692300229$app(), startRestartGroup, ((i2 >> 3) & 14) | 805306368, 510);
            function0 = onBack;
            startRestartGroup = startRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (!NestPairTrialScreen$lambda$1(mutableState)) {
                startRestartGroup.startReplaceGroup(306658270);
                ComposerKt.sourceInformation(startRestartGroup, "85@4189L319,85@4159L349");
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1296219550, true, new Function3() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return NestPairTrialScreenKt.NestPairTrialScreen$lambda$36$lambda$24(TreasureRepository.this, mutableState3, mutableState4, mutableState2, mutableState, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 196614, 30);
                startRestartGroup.endReplaceGroup();
                treasureRepository = repository;
            } else if (NestPairTrialScreen$lambda$4(mutableState2)) {
                startRestartGroup.startReplaceGroup(307056372);
                ComposerKt.sourceInformation(startRestartGroup, "87@4557L37,87@4618L10,87@4667L11,87@4552L135,88@4705L39,88@4768L11,88@4700L93,89@4947L128,89@4806L269,90@5105L16,90@5088L79");
                TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.nest_cleared, startRestartGroup, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getHeadlineMedium(), startRestartGroup, 0, 0, 65530);
                TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.matched_relics, startRestartGroup, 0), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
                Arrangement.HorizontalOrVertical m553spacedBy0680j_43 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(6.0f));
                Modifier weight$default2 = ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                PaddingValues m670PaddingValuesa9UjIt4$default = PaddingKt.m670PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6265constructorimpl(12.0f), 7, null);
                Arrangement.HorizontalOrVertical horizontalOrVertical = m553spacedBy0680j_43;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1949580271, "CC(remember):NestPairTrialScreen.kt#9igjgp");
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function1() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NestPairTrialScreenKt.NestPairTrialScreen$lambda$36$lambda$28$lambda$27(MutableState.this, (LazyListScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LazyDslKt.LazyColumn(weight$default2, null, m670PaddingValuesa9UjIt4$default, false, horizontalOrVertical, null, null, false, (Function1) rememberedValue5, startRestartGroup, 100688256, 234);
                startRestartGroup = startRestartGroup;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1949585215, "CC(remember):NestPairTrialScreen.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(repository);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    Function0 function02 = new Function0() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NestPairTrialScreenKt.NestPairTrialScreen$lambda$36$lambda$30$lambda$29(TreasureRepository.this, mutableState3, mutableState4, mutableState2, mutableState);
                        }
                    };
                    treasureRepository = repository;
                    startRestartGroup.updateRememberedValue(function02);
                    rememberedValue6 = function02;
                } else {
                    treasureRepository = repository;
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ButtonKt.Button((Function0) rememberedValue6, null, false, null, null, null, null, null, null, ComposableSingletons$NestPairTrialScreenKt.INSTANCE.getLambda$759964955$app(), startRestartGroup, 805306368, 510);
                startRestartGroup.endReplaceGroup();
            } else {
                treasureRepository = repository;
                startRestartGroup.startReplaceGroup(307718222);
                ComposerKt.sourceInformation(startRestartGroup, "92@5205L39,92@5282L11,92@5197L110,99@5645L877,93@5320L1202");
                TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.progress_label, startRestartGroup, 0) + ": " + i4 + "/6", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131066);
                Modifier weight$default3 = ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                GridCells.Fixed fixed = new GridCells.Fixed(3);
                PaddingValues m670PaddingValuesa9UjIt4$default2 = PaddingKt.m670PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6265constructorimpl(16.0f), 7, null);
                GridCells.Fixed fixed2 = fixed;
                Arrangement.HorizontalOrVertical m553spacedBy0680j_44 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(10.0f));
                Arrangement.HorizontalOrVertical m553spacedBy0680j_45 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(10.0f));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1949603356, "CC(remember):NestPairTrialScreen.kt#9igjgp");
                boolean changedInstance2 = startRestartGroup.changedInstance(nestPairTrialViewModel);
                Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new Function1() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NestPairTrialScreenKt.NestPairTrialScreen$lambda$36$lambda$35$lambda$34(MutableState.this, nestPairTrialViewModel, mutableState2, mutableState4, (LazyGridScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LazyGridDslKt.LazyVerticalGrid(fixed2, weight$default3, null, m670PaddingValuesa9UjIt4$default2, false, m553spacedBy0680j_44, m553spacedBy0680j_45, null, false, (Function1) rememberedValue7, startRestartGroup, 1772544, 404);
                startRestartGroup.endReplaceGroup();
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
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NestPairTrialScreenKt.NestPairTrialScreen$lambda$37(TreasureRepository.this, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean NestPairTrialScreen$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void NestPairTrialScreen$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean NestPairTrialScreen$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void NestPairTrialScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final List<MemoryCard> NestPairTrialScreen$lambda$7(MutableState<List<MemoryCard>> mutableState) {
        return mutableState.getValue();
    }

    private static final Integer NestPairTrialScreen$lambda$10(MutableState<Integer> mutableState) {
        return mutableState.getValue();
    }

    private static final void NestPairTrialScreen$startRound(TreasureRepository treasureRepository, MutableState<List<MemoryCard>> mutableState, MutableState<Integer> mutableState2, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4) {
        List take = CollectionsKt.take(CollectionsKt.shuffled(treasureRepository.getEggs()), 6);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : take) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TreasureEgg treasureEgg = (TreasureEgg) obj;
            int i3 = i * 2;
            CollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) new MemoryCard[]{new MemoryCard(i3, treasureEgg, i, false, false, 24, null), new MemoryCard(i3 + 1, treasureEgg, i, false, false, 24, null)}));
            i = i2;
        }
        mutableState.setValue(CollectionsKt.shuffled(arrayList));
        mutableState2.setValue(null);
        NestPairTrialScreen$lambda$5(mutableState3, false);
        NestPairTrialScreen$lambda$2(mutableState4, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NestPairTrialScreen$pick(NestPairTrialViewModel nestPairTrialViewModel, MutableState<List<MemoryCard>> mutableState, MutableState<Boolean> mutableState2, MutableState<Integer> mutableState3, int i) {
        int i2;
        Object obj;
        int i3;
        TreasureEgg treasureEgg;
        int i4;
        boolean z;
        for (MemoryCard memoryCard : NestPairTrialScreen$lambda$7(mutableState)) {
            if (memoryCard.getKey() == i) {
                if (memoryCard.getMatched() || memoryCard.getRevealed() || NestPairTrialScreen$lambda$4(mutableState2)) {
                    return;
                }
                Integer NestPairTrialScreen$lambda$10 = NestPairTrialScreen$lambda$10(mutableState3);
                if (NestPairTrialScreen$lambda$10 == null) {
                    List<MemoryCard> NestPairTrialScreen$lambda$7 = NestPairTrialScreen$lambda$7(mutableState);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(NestPairTrialScreen$lambda$7, 10));
                    for (MemoryCard memoryCard2 : NestPairTrialScreen$lambda$7) {
                        if (memoryCard2.getKey() == i) {
                            i2 = 23;
                            obj = null;
                            i3 = 0;
                            treasureEgg = null;
                            i4 = 0;
                            z = true;
                        } else if (memoryCard2.getMatched()) {
                            arrayList.add(memoryCard2);
                        } else {
                            i2 = 23;
                            obj = null;
                            i3 = 0;
                            treasureEgg = null;
                            i4 = 0;
                            z = false;
                        }
                        memoryCard2 = MemoryCard.copy$default(memoryCard2, i3, treasureEgg, i4, z, false, i2, obj);
                        arrayList.add(memoryCard2);
                    }
                    mutableState.setValue(arrayList);
                    mutableState3.setValue(Integer.valueOf(i));
                    return;
                }
                for (MemoryCard memoryCard3 : NestPairTrialScreen$lambda$7(mutableState)) {
                    int key = memoryCard3.getKey();
                    if (NestPairTrialScreen$lambda$10 != null && key == NestPairTrialScreen$lambda$10.intValue()) {
                        int pair = memoryCard3.getPair();
                        int i5 = 0;
                        boolean z2 = pair == memoryCard.getPair();
                        List<MemoryCard> NestPairTrialScreen$lambda$72 = NestPairTrialScreen$lambda$7(mutableState);
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(NestPairTrialScreen$lambda$72, 10));
                        for (MemoryCard memoryCard4 : NestPairTrialScreen$lambda$72) {
                            if (memoryCard4.getKey() != i) {
                                int key2 = memoryCard4.getKey();
                                if (NestPairTrialScreen$lambda$10 == null || key2 != NestPairTrialScreen$lambda$10.intValue()) {
                                    if (!memoryCard4.getMatched()) {
                                        memoryCard4 = MemoryCard.copy$default(memoryCard4, 0, null, 0, false, false, 23, null);
                                    }
                                    arrayList2.add(memoryCard4);
                                }
                            }
                            memoryCard4 = MemoryCard.copy$default(memoryCard4, 0, null, 0, true, z2, 7, null);
                            arrayList2.add(memoryCard4);
                        }
                        mutableState.setValue(arrayList2);
                        mutableState3.setValue(null);
                        if (z2) {
                            List<MemoryCard> NestPairTrialScreen$lambda$73 = NestPairTrialScreen$lambda$7(mutableState);
                            if (!(NestPairTrialScreen$lambda$73 instanceof Collection) || !NestPairTrialScreen$lambda$73.isEmpty()) {
                                Iterator<T> it = NestPairTrialScreen$lambda$73.iterator();
                                while (it.hasNext()) {
                                    if (((MemoryCard) it.next()).getMatched() && (i5 = i5 + 1) < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                }
                            }
                            if (i5 + 2 == 12) {
                                NestPairTrialScreen$lambda$5(mutableState2, true);
                                nestPairTrialViewModel.saveScore(6);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    static final Unit NestPairTrialScreen$lambda$36$lambda$24(final TreasureRepository treasureRepository, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, ColumnScope Card, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation(composer, "C85@4191L315:NestPairTrialScreen.kt#7i8muq");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1296219550, i, -1, "com.chicken.road.kedbags.ui.quiz.NestPairTrialScreen.<anonymous>.<anonymous> (NestPairTrialScreen.kt:85)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -1820131277, "C85@4281L43,85@4348L10,85@4276L94,85@4377L42,85@4372L48,85@4439L16,85@4422L82:NestPairTrialScreen.kt#7i8muq");
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.memory_rules_title, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer, 0, 0, 65534);
            TextKt.m2357Text4IGK_g(StringResources_androidKt.stringResource(R.string.memory_rules_body, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            ComposerKt.sourceInformationMarkerStart(composer, 218385756, "CC(remember):NestPairTrialScreen.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(treasureRepository);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                Function0 function0 = new Function0() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NestPairTrialScreenKt.NestPairTrialScreen$lambda$36$lambda$24$lambda$23$lambda$22$lambda$21(TreasureRepository.this, mutableState, mutableState2, mutableState3, mutableState4);
                    }
                };
                composer.updateRememberedValue(function0);
                rememberedValue = function0;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$NestPairTrialScreenKt.INSTANCE.m6563getLambda$1033641540$app(), composer, 805306368, 510);
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

    static final Unit NestPairTrialScreen$lambda$36$lambda$24$lambda$23$lambda$22$lambda$21(TreasureRepository treasureRepository, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        NestPairTrialScreen$startRound(treasureRepository, mutableState, mutableState2, mutableState3, mutableState4);
        return Unit.INSTANCE;
    }

    static final Unit NestPairTrialScreen$lambda$36$lambda$28$lambda$27(MutableState mutableState, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List<MemoryCard> NestPairTrialScreen$lambda$7 = NestPairTrialScreen$lambda$7(mutableState);
        ArrayList arrayList = new ArrayList();
        for (Object obj : NestPairTrialScreen$lambda$7) {
            if (((MemoryCard) obj).getKey() % 2 == 0) {
                arrayList.add(obj);
            }
        }
        final ArrayList arrayList2 = arrayList;
        final NestPairTrialScreenKt$NestPairTrialScreen$lambda$36$lambda$28$lambda$27$$inlined$items$default$1 nestPairTrialScreenKt$NestPairTrialScreen$lambda$36$lambda$28$lambda$27$$inlined$items$default$1 = new Function1() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$NestPairTrialScreen$lambda$36$lambda$28$lambda$27$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(MemoryCard memoryCard) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                return invoke((MemoryCard) obj2);
            }
        };
        LazyColumn.items(arrayList2.size(), null, new Function1<Integer, Object>() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$NestPairTrialScreen$lambda$36$lambda$28$lambda$27$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(arrayList2.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$NestPairTrialScreen$lambda$36$lambda$28$lambda$27$$inlined$items$default$4
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
                MemoryCard memoryCard = (MemoryCard) arrayList2.get(i);
                composer.startReplaceGroup(-466380641);
                ComposerKt.sourceInformation(composer, "C*89@5046L11,89@4991L80:NestPairTrialScreen.kt#7i8muq");
                TextKt.m2357Text4IGK_g("Matched - " + memoryCard.getEgg().getName(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131066);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Unit NestPairTrialScreen$lambda$36$lambda$30$lambda$29(TreasureRepository treasureRepository, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        NestPairTrialScreen$startRound(treasureRepository, mutableState, mutableState2, mutableState3, mutableState4);
        return Unit.INSTANCE;
    }

    static final Unit NestPairTrialScreen$lambda$36$lambda$35$lambda$34(final MutableState mutableState, final NestPairTrialViewModel nestPairTrialViewModel, final MutableState mutableState2, final MutableState mutableState3, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final List<MemoryCard> NestPairTrialScreen$lambda$7 = NestPairTrialScreen$lambda$7(mutableState);
        final Function1 function1 = new Function1() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NestPairTrialScreenKt.NestPairTrialScreen$lambda$36$lambda$35$lambda$34$lambda$31((MemoryCard) obj);
            }
        };
        final NestPairTrialScreenKt$NestPairTrialScreen$lambda$36$lambda$35$lambda$34$$inlined$items$default$1 nestPairTrialScreenKt$NestPairTrialScreen$lambda$36$lambda$35$lambda$34$$inlined$items$default$1 = new Function1() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$NestPairTrialScreen$lambda$36$lambda$35$lambda$34$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(MemoryCard memoryCard) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((MemoryCard) obj);
            }
        };
        LazyVerticalGrid.items(NestPairTrialScreen$lambda$7.size(), new Function1<Integer, Object>() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$NestPairTrialScreen$lambda$36$lambda$35$lambda$34$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(NestPairTrialScreen$lambda$7.get(i));
            }
        }, null, new Function1<Integer, Object>() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$NestPairTrialScreen$lambda$36$lambda$35$lambda$34$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(NestPairTrialScreen$lambda$7.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$NestPairTrialScreen$lambda$36$lambda$35$lambda$34$$inlined$items$default$5
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
                long surface;
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
                final MemoryCard memoryCard = (MemoryCard) NestPairTrialScreen$lambda$7.get(i);
                composer.startReplaceGroup(-763281611);
                ComposerKt.sourceInformation(composer, "C*102@5784L18,103@5850L138,104@6011L479,101@5724L766:NestPairTrialScreen.kt#7i8muq");
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 1637947170, "CC(remember):NestPairTrialScreen.kt#9igjgp");
                boolean changedInstance = composer.changedInstance(nestPairTrialViewModel) | composer.changed(memoryCard);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final NestPairTrialViewModel nestPairTrialViewModel2 = nestPairTrialViewModel;
                    final MutableState mutableState4 = mutableState;
                    final MutableState mutableState5 = mutableState2;
                    final MutableState mutableState6 = mutableState3;
                    rememberedValue = (Function0) new Function0<Unit>() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$NestPairTrialScreen$1$5$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            NestPairTrialScreenKt.NestPairTrialScreen$pick(nestPairTrialViewModel2, mutableState4, mutableState5, mutableState6, MemoryCard.this.getKey());
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier m261clickableXHw0xAI$default = ClickableKt.m261clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue, 7, null);
                CardDefaults cardDefaults = CardDefaults.INSTANCE;
                if (memoryCard.getRevealed() || memoryCard.getMatched()) {
                    composer.startReplaceGroup(1637952119);
                    ComposerKt.sourceInformation(composer, "103@5927L11");
                    surface = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurface();
                } else {
                    composer.startReplaceGroup(1637953369);
                    ComposerKt.sourceInformation(composer, "103@5966L11");
                    surface = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary();
                }
                composer.endReplaceGroup();
                CardKt.Card(m261clickableXHw0xAI$default, null, cardDefaults.m1492cardColorsro_MJ88(surface, 0L, 0L, 0L, composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1506679618, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.chicken.road.kedbags.ui.quiz.NestPairTrialScreenKt$NestPairTrialScreen$1$5$1$2$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Card, Composer composer2, int i4) {
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        ComposerKt.sourceInformation(composer2, "C105@6037L431:NestPairTrialScreen.kt#7i8muq");
                        if ((i4 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1506679618, i4, -1, "com.chicken.road.kedbags.ui.quiz.NestPairTrialScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NestPairTrialScreen.kt:105)");
                        }
                        Modifier m673padding3ABfNKs = PaddingKt.m673padding3ABfNKs(Modifier.INSTANCE, Dp.m6265constructorimpl(10.0f));
                        Arrangement.HorizontalOrVertical m553spacedBy0680j_4 = Arrangement.INSTANCE.m553spacedBy0680j_4(Dp.m6265constructorimpl(6.0f));
                        MemoryCard memoryCard2 = MemoryCard.this;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m553spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
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
                        Composer m3316constructorimpl = Updater.m3316constructorimpl(composer2);
                        Updater.m3323setimpl(m3316constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3323setimpl(m3316constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3316constructorimpl.getInserting() || !Intrinsics.areEqual(m3316constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3316constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3316constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3323setimpl(m3316constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1032881786, "C:NestPairTrialScreen.kt#7i8muq");
                        if (memoryCard2.getRevealed() || memoryCard2.getMatched()) {
                            composer2.startReplaceGroup(-1032852492);
                            ComposerKt.sourceInformation(composer2, "106@6186L48,106@6278L10,106@6236L64");
                            CommonKt.RelicIcon(memoryCard2.getEgg().getColorHex(), memoryCard2.getEgg().getIconGlyph(), null, composer2, 0, 4);
                            TextKt.m2357Text4IGK_g(memoryCard2.getEgg().getName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65534);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1032728988);
                            ComposerKt.sourceInformation(composer2, "106@6367L11,106@6414L10,106@6310L130");
                            TextKt.m2357Text4IGK_g("?", PaddingKt.m673padding3ABfNKs(Modifier.INSTANCE, Dp.m6265constructorimpl(18.0f)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSecondary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getHeadlineMedium(), composer2, 54, 0, 65528);
                            composer2.endReplaceGroup();
                        }
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
                }, composer, 54), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    static final Object NestPairTrialScreen$lambda$36$lambda$35$lambda$34$lambda$31(MemoryCard it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getKey());
    }
}
