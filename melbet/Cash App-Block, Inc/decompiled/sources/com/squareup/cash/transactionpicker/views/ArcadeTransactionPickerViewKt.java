package com.squareup.cash.transactionpicker.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.paging.ItemSnapshotList;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda41;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda21;
import com.squareup.cash.taptopay.views.TapToPayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.views.TaxReturnsViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tax.views.TaxTooltipView$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.transactionpicker.viewmodels.TransactionPickerViewModel;
import com.squareup.cash.transactionpicker.viewmodels.TransactionViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda11;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.cash.Countries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public abstract class ArcadeTransactionPickerViewKt {
    public static final void LoadedWithLazyColumn(TextSetter textSetter, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(47658586);
        int i2 = (gapComposer.changedInstance(textSetter) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean z = ((i2 & 14) == 4 || gapComposer.changedInstance(textSetter)) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BottomSheet$$ExternalSyntheticLambda3(20, textSetter, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyColumn(fillMaxSize, null, null, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 6, 510);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(textSetter, function1, i, 15);
        }
    }

    public static final void Loading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1905706037);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayKt$$ExternalSyntheticLambda0(i, 18);
        }
    }

    public static final void Transaction(TransactionViewModel transactionViewModel, Function0 function0, Composer composer, int i) {
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1039273253);
        int i2 = i | (gapComposer.changed(transactionViewModel) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = transactionViewModel.title;
            if (str == null) {
                str = "";
            }
            String str2 = transactionViewModel.subtitle;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1724261261, new TaxReturnsViewKt$$ExternalSyntheticLambda5(transactionViewModel, 9), gapComposer);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TaxWebAppBridge$$ExternalSyntheticLambda1(8);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3389CellActivityGZm5OLo(rememberComposableLambda, str, (Function1) rememberedValue, function0, null, null, str2, null, false, 0, 0L, gapComposer, ((i2 << 6) & 7168) | 390, 1968);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxTooltipView$$ExternalSyntheticLambda0(transactionViewModel, function0, i, 27);
        }
    }

    public static final void TransactionPicker(TransactionPickerViewModel transactionPickerViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        transactionPickerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(571112032);
        int i2 = (gapComposer2.changedInstance(transactionPickerViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, navigationBarsPadding);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            NavigationType navigationType = NavigationType.CLOSE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new TaxReturnsView$$ExternalSyntheticLambda0(6, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            DBUtil.TitleBarSub(ComposableSingletons$ArcadeTransactionPickerViewKt.lambda$590748368, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 438, 104);
            if (transactionPickerViewModel instanceof TransactionPickerViewModel.Loaded) {
                gapComposer.startReplaceGroup(1877229387);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(((TransactionPickerViewModel.Loaded) transactionPickerViewModel).outstandingTransactions, 19);
                    gapComposer.updateRememberedValue(appLockMonitor$special$$inlined$map$2);
                    rememberedValue2 = appLockMonitor$special$$inlined$map$2;
                }
                Flow flow = (Flow) rememberedValue2;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(((TransactionPickerViewModel.Loaded) transactionPickerViewModel).completedTransactions, 19);
                    gapComposer.updateRememberedValue(appLockMonitor$special$$inlined$map$22);
                    rememberedValue3 = appLockMonitor$special$$inlined$map$22;
                }
                LazyPagingItems collectAsLazyPagingItems = LazyPagingItemsKt.collectAsLazyPagingItems(flow, gapComposer);
                LazyPagingItems collectAsLazyPagingItems2 = LazyPagingItemsKt.collectAsLazyPagingItems((Flow) rememberedValue3, gapComposer);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = Updater.derivedStateOf(new TaxWebAppBridge$$ExternalSyntheticLambda0(20, collectAsLazyPagingItems, collectAsLazyPagingItems2));
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                String m = re$$ExternalSyntheticOutline0.m(gapComposer, 476217089, R.string.transactions_title, gapComposer, false);
                if (((Boolean) ((State) rememberedValue4).getValue()).booleanValue()) {
                    gapComposer.startReplaceGroup(1877903203);
                    Countries.PageHeader(m, SizeKt.fillMaxWidth(companion, 1.0f), (Function2) null, (String) null, gapComposer, 48, 12);
                    Loading(gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1878081546);
                    LoadedWithLazyColumn(new TextSetter(m, collectAsLazyPagingItems, collectAsLazyPagingItems2), function1, gapComposer, 8 | i3);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            } else {
                if (!transactionPickerViewModel.equals(TransactionPickerViewModel.Loading.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 476195953, false);
                }
                gapComposer.startReplaceGroup(476236991);
                Loading(gapComposer, 0);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(transactionPickerViewModel, function1, i, 14);
        }
    }

    public static final void buildTransactionSection(LazyListScope lazyListScope, String str, int i, LazyPagingItems lazyPagingItems, Function2 function2) {
        if (((ItemSnapshotList) lazyPagingItems.itemSnapshotList$delegate.getValue()).getSize() <= 0) {
            return;
        }
        LazyListScope.item$default(lazyListScope, null, null, new ComposableLambdaImpl(new TabToolbarsKt$$ExternalSyntheticLambda21(i, 13), true, -416745843), 3);
        LazyListScope.items$default(lazyListScope, ((ItemSnapshotList) lazyPagingItems.itemSnapshotList$delegate.getValue()).getSize(), new BottomSheet$$ExternalSyntheticLambda3(19, lazyPagingItems, str), new ComposableLambdaImpl(new PoolDetailsViewKt$$ExternalSyntheticLambda41(11, lazyPagingItems, function2), true, 1853008918), 4);
    }
}
