package com.squareup.cash.work.views.you;

import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeightKt;
import com.squareup.cash.bitcoin.views.applet.statsandsettings.BitcoinSettingsWidgetViewKt;
import com.squareup.cash.contacts.components.SyncContactsRowKt;
import com.squareup.cash.investingcrypto.components.ordertype.custom.order.CustomOrderPeriodSelectorKt;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.savings.views.SavingsScreenHeaderKt;
import com.squareup.cash.shopping.views.ShopErrorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class WorkYouViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Modifier f$2;

    public /* synthetic */ WorkYouViewKt$$ExternalSyntheticLambda2(Modifier modifier, String str, String str2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = modifier;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = this.f$2;
        String str = this.f$1;
        String str2 = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                WorkYouViewKt.InfoRow(Updater.updateChangedFlags(1), composer, modifier, str2, str);
                break;
            case 1:
                BitcoinSettingsWidgetViewKt.PrimaryAndSecondaryText(Updater.updateChangedFlags(1), composer, modifier, str2, str);
                break;
            case 2:
                FontWeightKt.SheetBody(Updater.updateChangedFlags(385), composer, modifier, str2, str);
                break;
            case 3:
                SyncContactsRowKt.NoContactsFoundCard(Updater.updateChangedFlags(1), composer, modifier, str2, str);
                break;
            case 4:
                CustomOrderPeriodSelectorKt.Header(Updater.updateChangedFlags(1), composer, modifier, str2, str);
                break;
            case 5:
                PickVisualMediaRequestKt.InviteSuccessToast(Updater.updateChangedFlags(7), composer, modifier, str2, str);
                break;
            case 6:
                QuickPayViewKt.SectionHeader(Updater.updateChangedFlags(1), composer, modifier, str2, str);
                break;
            case 7:
                SavingsScreenHeaderKt.IconAndLabel(Updater.updateChangedFlags(1), composer, modifier, str2, str);
                break;
            default:
                ShopErrorKt.ShopEmptyView(Updater.updateChangedFlags(385), composer, modifier, str2, str);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ WorkYouViewKt$$ExternalSyntheticLambda2(String str, String str2, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = modifier;
    }
}
