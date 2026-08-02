package com.squareup.cash.tax.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import com.squareup.cash.bitcoin.views.deposits.copy.BitcoinAddressCopySheetViewKt;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsContentKt;
import com.squareup.cash.tax.viewmodels.TaxTooltipViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class TaxToolTipViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ TaxToolTipViewKt$$ExternalSyntheticLambda1(long j, Icons icons, String str, long j2) {
        this.$r8$classId = 2;
        this.f$2 = j;
        this.f$1 = icons;
        this.f$4 = str;
        this.f$3 = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$4;
        Object obj4 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                TaxReturnsViewKt.m3768DesktopToolTipmKWK414((TaxTooltipViewModel) obj4, this.f$2, this.f$3, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(391));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                LegalSectionKt.m2975HorizontalProgressBareopBjH0((Modifier) obj4, this.f$2, this.f$3, (AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader.ProgressBar) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                Icons icons = (Icons) obj4;
                String str = (String) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), this.f$2, RoundedCornerShapeKt.CircleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
                    Trace.m1191Iconww6aTOc(icons, str, (Modifier) null, this.f$3, gapComposer, 0, 4);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                BitcoinAddressCopySheetViewKt.m3416DepositCopyOptionIconeaDK9VM((Icons) obj4, (Modifier) obj3, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                BitcoinPerformanceDetailsContentKt.m3420BitcoinPerformanceDetailsSectionLabeleopBjH0((BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem) obj4, this.f$2, this.f$3, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TaxToolTipViewKt$$ExternalSyntheticLambda1(Icons icons, Modifier modifier, long j, long j2, int i) {
        this.$r8$classId = 3;
        this.f$1 = icons;
        this.f$4 = modifier;
        this.f$2 = j;
        this.f$3 = j2;
    }

    public /* synthetic */ TaxToolTipViewKt$$ExternalSyntheticLambda1(Object obj, long j, long j2, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = obj2;
    }
}
