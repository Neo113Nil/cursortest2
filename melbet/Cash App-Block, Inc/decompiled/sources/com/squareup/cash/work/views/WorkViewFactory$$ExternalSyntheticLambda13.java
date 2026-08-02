package com.squareup.cash.work.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.util.DBUtil;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.work.viewmodels.PayHomeViewModel;
import com.squareup.cash.work.views.pay.PayCellViewKt;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class WorkViewFactory$$ExternalSyntheticLambda13 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PayHomeViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ WorkViewFactory$$ExternalSyntheticLambda13(PayHomeViewModel payHomeViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = payHomeViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        PayHomeViewModel payHomeViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    PayCellViewKt.PayHomeView(payHomeViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
                    boolean z = payHomeViewModel instanceof PayHomeViewModel.Loaded;
                    PayHomeViewModel.Loaded loaded = z ? (PayHomeViewModel.Loaded) payHomeViewModel : null;
                    boolean z2 = loaded != null && (loaded.showLinkedAccounts || loaded.showDirectDeposit);
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new PayHomeViewKt$$ExternalSyntheticLambda2(0, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(2091597195, new EducationalSheetKt$$ExternalSyntheticLambda8(z2, loaded, function1, 10), gapComposer2), gapComposer2, 1572918, 44);
                    boolean z3 = payHomeViewModel instanceof PayHomeViewModel.Loading;
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    if (z3) {
                        gapComposer2.startReplaceGroup(-627485478);
                        PayCellViewKt.PayHomeLoading(columnScopeInstance.weight(1.0f, companion, true), gapComposer2, 0);
                        gapComposer2.end(false);
                    } else if (z) {
                        gapComposer2.startReplaceGroup(-627482742);
                        PayCellViewKt.PayHomeContent((PayHomeViewModel.Loaded) payHomeViewModel, function1, columnScopeInstance.weight(1.0f, companion, true), gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        if (!(payHomeViewModel instanceof PayHomeViewModel.Error)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -627486860, false);
                        }
                        gapComposer2.startReplaceGroup(-627479149);
                        Modifier weight = columnScopeInstance.weight(1.0f, companion, true);
                        boolean changed2 = gapComposer2.changed(function1);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new PayHomeViewKt$$ExternalSyntheticLambda2(20, function1);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        PayCellViewKt.PayHomeError(0, gapComposer2, weight, (Function0) rememberedValue2);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
