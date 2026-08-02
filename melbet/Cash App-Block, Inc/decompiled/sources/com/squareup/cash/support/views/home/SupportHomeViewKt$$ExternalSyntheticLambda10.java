package com.squareup.cash.support.views.home;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.local.viewmodels.LocalCheckoutPaymentMethodViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentSectionViewModel;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.offers.viewmodels.OfferDetailsSheetViewModel;
import com.squareup.cash.offers.views.details.OfferDetailsSheetKt;
import com.squareup.cash.offers.views.details.OffersLoadingKt;
import com.squareup.cash.support.viewmodels.SupportHomeViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* loaded from: classes6.dex */
public final /* synthetic */ class SupportHomeViewKt$$ExternalSyntheticLambda10 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ SupportHomeViewKt$$ExternalSyntheticLambda10(Function3 function3, float f, Function1 function1) {
        this.$r8$classId = 2;
        this.f$1 = function3;
        this.f$0 = f;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = this.f$2;
        float f = this.f$0;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                SupportHomeViewModel supportHomeViewModel = (SupportHomeViewModel) obj5;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Composer composer = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                if (booleanValue) {
                    GapComposer gapComposer = (GapComposer) composer;
                    gapComposer.startReplaceGroup(786106038);
                    SupportHomeViewKt.m3754Loading8Feqmps(f, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    GapComposer gapComposer2 = (GapComposer) composer;
                    gapComposer2.startReplaceGroup(786166457);
                    supportHomeViewModel.getClass();
                    SupportHomeViewKt.Loaded((SupportHomeViewModel.Loaded) supportHomeViewModel, function1, gapComposer2, 0);
                    gapComposer2.end(false);
                }
                return Unit.INSTANCE;
            case 1:
                LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel = (LocalCheckoutPaymentSectionViewModel) obj5;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                if (!booleanValue2) {
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    re$$ExternalSyntheticOutline0.m(gapComposer3, -1445540960, companion, f, gapComposer3);
                    gapComposer3.end(false);
                    return Unit.INSTANCE;
                }
                GapComposer gapComposer4 = (GapComposer) composer2;
                gapComposer4.startReplaceGroup(-1445443899);
                gapComposer4.end(false);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer4.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer4.startReusableNode();
                if (gapComposer4.inserting) {
                    gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer4.useNode();
                }
                Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                gapComposer4.startReplaceGroup(518721909);
                List list = localCheckoutPaymentSectionViewModel.paymentMethods;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    LocalCheckoutPaymentMethodViewModel localCheckoutPaymentMethodViewModel = (LocalCheckoutPaymentMethodViewModel) list.get(i2);
                    if (i2 > 0) {
                        gapComposer4.startReplaceGroup(-1314111129);
                        ModalKt.HorizontalDivider(0, 1, gapComposer4, null);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-1314071728);
                        gapComposer4.end(false);
                    }
                    CheckoutTipSectionKt.m1307PaymentMethodItemG3d1Xqg(localCheckoutPaymentMethodViewModel, localCheckoutPaymentSectionViewModel.selectedPaymentMethodToken, function1, gapComposer4, 0);
                }
                gapComposer4.end(false);
                gapComposer4.end(true);
                return Unit.INSTANCE;
            default:
                Function3 function3 = (Function3) obj5;
                OfferDetailsSheetViewModel.FooterSectionViewModel footerSectionViewModel = (OfferDetailsSheetViewModel.FooterSectionViewModel) obj2;
                Composer composer3 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                footerSectionViewModel.getClass();
                if (footerSectionViewModel instanceof OfferDetailsSheetViewModel.FooterSectionViewModel.FooterButtons) {
                    GapComposer gapComposer5 = (GapComposer) composer3;
                    gapComposer5.startReplaceGroup(1523705550);
                    DimensionKt.ButtonCtaGroup(null, false, null, function3, Expect_jvmKt.rememberComposableLambda(-1041517689, new MoneyTabUIKt$$ExternalSyntheticLambda11(18, (Object) footerSectionViewModel, (Object) function1), gapComposer5), gapComposer5, 24576, 7);
                    gapComposer5.end(false);
                } else if (footerSectionViewModel instanceof OfferDetailsSheetViewModel.FooterSectionViewModel.Loading) {
                    GapComposer gapComposer6 = (GapComposer) composer3;
                    gapComposer6.startReplaceGroup(1524025315);
                    OffersLoadingKt.m3679OffersLoadingCt2sIOU(SizeKt.m277height3ABfNKs(companion, f), 20.0f, null, gapComposer6, 48, 4);
                    gapComposer6.end(false);
                } else {
                    if (!(footerSectionViewModel instanceof OfferDetailsSheetViewModel.FooterSectionViewModel.MessageText)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer3, 187697899, false);
                    }
                    GapComposer gapComposer7 = (GapComposer) composer3;
                    gapComposer7.startReplaceGroup(1524145967);
                    OfferDetailsSheetKt.FooterMessage(0, gapComposer7, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), f), ((OfferDetailsSheetViewModel.FooterSectionViewModel.MessageText) footerSectionViewModel).text);
                    gapComposer7.end(false);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SupportHomeViewKt$$ExternalSyntheticLambda10(float f, Object obj, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = f;
        this.f$1 = obj;
        this.f$2 = function1;
    }
}
