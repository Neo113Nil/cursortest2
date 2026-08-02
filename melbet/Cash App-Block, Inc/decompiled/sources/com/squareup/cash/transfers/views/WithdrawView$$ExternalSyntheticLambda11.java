package com.squareup.cash.transfers.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.navigation.NavDestination;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.common.zzj;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class WithdrawView$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;

    public /* synthetic */ WithdrawView$$ExternalSyntheticLambda11(UiScope uiScope, PromotionDetailsViewModel.Loaded loaded, PromotionDetailsViewModel.DetailsPageData.DetailsPageV1 detailsPageV1, Function1 function1, float f, String str, RealImageLoader realImageLoader, Modifier modifier, int i) {
        this.f$0 = uiScope;
        this.f$2 = loaded;
        this.f$4 = detailsPageV1;
        this.f$3 = function1;
        this.f$1 = f;
        this.f$6 = str;
        this.f$5 = realImageLoader;
        this.f$7 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$7;
        Object obj4 = this.f$5;
        Object obj5 = this.f$6;
        Object obj6 = this.f$4;
        Object obj7 = this.f$2;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                WithdrawViewModel withdrawViewModel = (WithdrawViewModel) obj8;
                PaddingValues paddingValues = (PaddingValues) obj7;
                Function0 function0 = (Function0) obj6;
                MoneyFormatter moneyFormatter = (MoneyFormatter) obj4;
                Function0 function02 = (Function0) obj5;
                WithdrawView withdrawView = (WithdrawView) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new TaxWebAppBridge$$ExternalSyntheticLambda1(23);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    NavDestination.Companion.SheetCrossfade(withdrawViewModel, this.f$1, null, (Function1) rememberedValue, Expect_jvmKt.rememberComposableLambda(-1265754495, new SsnViewKt$$ExternalSyntheticLambda7(paddingValues, this.f$3, function0, moneyFormatter, function02, withdrawView, 7), gapComposer), gapComposer, 27648);
                    gapComposer.end(true);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                zzj.m2003HeroImageGHTll3U((UiScope) obj8, (PromotionDetailsViewModel.Loaded) obj7, (PromotionDetailsViewModel.DetailsPageData.DetailsPageV1) obj6, this.f$3, this.f$1, (String) obj5, (RealImageLoader) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(12582913));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ WithdrawView$$ExternalSyntheticLambda11(WithdrawViewModel withdrawViewModel, float f, PaddingValues paddingValues, Function1 function1, Function0 function0, MoneyFormatter moneyFormatter, Function0 function02, WithdrawView withdrawView) {
        this.f$0 = withdrawViewModel;
        this.f$1 = f;
        this.f$2 = paddingValues;
        this.f$3 = function1;
        this.f$4 = function0;
        this.f$5 = moneyFormatter;
        this.f$6 = function02;
        this.f$7 = withdrawView;
    }
}
