package com.stripe.android.uicore.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.core.content.ContextCompat$Api26Impl;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.amountslider.TickersAmountCaptionKt;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsViewKt;
import com.squareup.cash.charting.components.BarChartKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderGraphKt;
import com.squareup.cash.support.views.search.SupportSearchViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class FormLabelKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ int f$3;

    public /* synthetic */ FormLabelKt$$ExternalSyntheticLambda0(int i, Modifier modifier, String str) {
        this.$r8$classId = 1;
        this.f$1 = modifier;
        this.f$0 = str;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                FormLabelKt.FormLabel(Updater.updateChangedFlags(1), this.f$3, composer, this.f$1, this.f$0);
                break;
            case 1:
                AccountToDoKt.AccountSectionHeader(Updater.updateChangedFlags(this.f$3 | 1), composer, this.f$1, this.f$0);
                break;
            case 2:
                TickersAmountCaptionKt.TickersAmountCaption(Updater.updateChangedFlags(this.f$3 | 1), composer, this.f$1, this.f$0);
                break;
            case 3:
                BitcoinPerformanceDetailsViewKt.BitcoinDetailsShimmerRowGroup(this.f$3, Updater.updateChangedFlags(49), composer, this.f$1, this.f$0);
                break;
            case 4:
                BarChartKt.YAxisLabel(Updater.updateChangedFlags(this.f$3 | 1), composer, this.f$1, this.f$0);
                break;
            case 5:
                CustomOrderGraphKt.PriceLine(Updater.updateChangedFlags(this.f$3 | 1), composer, this.f$1, this.f$0);
                break;
            case 6:
                ContextCompat$Api26Impl.EmojiTextView(this.f$3, Updater.updateChangedFlags(1), composer, this.f$1, this.f$0);
                break;
            default:
                SupportSearchViewKt.HeaderRow(Updater.updateChangedFlags(this.f$3 | 1), composer, this.f$1, this.f$0);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FormLabelKt$$ExternalSyntheticLambda0(Modifier modifier, String str, int i, int i2) {
        this.$r8$classId = 6;
        this.f$1 = modifier;
        this.f$0 = str;
        this.f$3 = i;
    }

    public /* synthetic */ FormLabelKt$$ExternalSyntheticLambda0(String str, int i, Modifier modifier, int i2) {
        this.$r8$classId = 3;
        this.f$0 = str;
        this.f$3 = i;
        this.f$1 = modifier;
    }

    public /* synthetic */ FormLabelKt$$ExternalSyntheticLambda0(String str, Modifier modifier, int i, int i2) {
        this.$r8$classId = 0;
        this.f$0 = str;
        this.f$1 = modifier;
        this.f$3 = i2;
    }

    public /* synthetic */ FormLabelKt$$ExternalSyntheticLambda0(String str, Modifier modifier, int i, int i2, byte b) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = modifier;
        this.f$3 = i;
    }
}
