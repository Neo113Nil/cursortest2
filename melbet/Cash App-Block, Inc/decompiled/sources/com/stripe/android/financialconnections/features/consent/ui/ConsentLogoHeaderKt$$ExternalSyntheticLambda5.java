package com.stripe.android.financialconnections.features.consent.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsContentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ConsentLogoHeaderKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ ConsentLogoHeaderKt$$ExternalSyntheticLambda5(Modifier modifier, long j, long j2, int i) {
        this.f$0 = modifier;
        this.f$1 = j;
        this.f$2 = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ConsentLogoHeaderKt.m4015AnimatedDotsWithFixedGradientRIQooxk((Modifier) obj3, this.f$1, this.f$2, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem bitcoinPerformanceDetailsSectionItem = (BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BitcoinPerformanceDetailsContentKt.m3420BitcoinPerformanceDetailsSectionLabeleopBjH0(bitcoinPerformanceDetailsSectionItem, this.f$1, this.f$2, null, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ConsentLogoHeaderKt$$ExternalSyntheticLambda5(BitcoinPerformanceDetailsContentViewModel.BitcoinPerformanceDetailsSectionItem bitcoinPerformanceDetailsSectionItem, long j, long j2) {
        this.f$0 = bitcoinPerformanceDetailsSectionItem;
        this.f$1 = j;
        this.f$2 = j2;
    }
}
