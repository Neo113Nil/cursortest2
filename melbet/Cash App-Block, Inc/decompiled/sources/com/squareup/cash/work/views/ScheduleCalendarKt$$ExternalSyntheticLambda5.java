package com.squareup.cash.work.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.money.applets.common.views.InstalledBalanceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.InstalledBalanceAppletTileContentModel;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.views.card.InsightChartKt;
import java.time.LocalDate;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ScheduleCalendarKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ ScheduleCalendarKt$$ExternalSyntheticLambda5(Modifier modifier, LocalDate localDate, boolean z, boolean z2, Set set, Function1 function1, int i) {
        this.$r8$classId = 0;
        this.f$0 = modifier;
        this.f$1 = localDate;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$4 = set;
        this.f$5 = function1;
        this.f$6 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$6;
        Object obj3 = this.f$4;
        Object obj4 = this.f$5;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                SellerCardKt.CalendarDayCell((Modifier) obj6, (LocalDate) obj5, this.f$2, this.f$3, (Set) obj3, (Function1) obj4, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                InputChipKt.InputChipBase((String) obj5, (String) obj3, (Modifier) obj6, (Function0) obj4, this.f$2, this.f$3, (Composer) obj, updateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                InputChipKt.InputChipBase((ComposableLambdaImpl) obj5, (String) obj3, (Modifier) obj6, (Function0) obj4, this.f$2, this.f$3, (Composer) obj, updateChangedFlags3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                SharedUIKt.InstalledBalanceAppletTile((InstalledAppletTileHeaderModel) obj6, (InstalledBalanceAppletTileContentModel) obj5, this.f$2, (Function0) obj3, this.f$3, (InstalledBalanceAppletTileLayoutConfig) obj4, (Composer) obj, updateChangedFlags4);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                InsightChartKt.InteractiveLineChart((ChatCardViewModel.InsightCard.Chart.LineChart) obj6, (ChatCardViewModel.InsightCard.Chart.Legend) obj5, this.f$2, this.f$3, (Function1) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags5);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ScheduleCalendarKt$$ExternalSyntheticLambda5(InstalledAppletTileHeaderModel installedAppletTileHeaderModel, InstalledBalanceAppletTileContentModel installedBalanceAppletTileContentModel, boolean z, Function0 function0, boolean z2, InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig, int i) {
        this.$r8$classId = 3;
        this.f$0 = installedAppletTileHeaderModel;
        this.f$1 = installedBalanceAppletTileContentModel;
        this.f$2 = z;
        this.f$4 = function0;
        this.f$3 = z2;
        this.f$5 = installedBalanceAppletTileLayoutConfig;
        this.f$6 = i;
    }

    public /* synthetic */ ScheduleCalendarKt$$ExternalSyntheticLambda5(ChatCardViewModel.InsightCard.Chart.LineChart lineChart, ChatCardViewModel.InsightCard.Chart.Legend legend, boolean z, boolean z2, Function1 function1, Function1 function12, int i) {
        this.$r8$classId = 4;
        this.f$0 = lineChart;
        this.f$1 = legend;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$5 = function1;
        this.f$4 = function12;
        this.f$6 = i;
    }

    public /* synthetic */ ScheduleCalendarKt$$ExternalSyntheticLambda5(Object obj, String str, Modifier modifier, Function0 function0, boolean z, boolean z2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$4 = str;
        this.f$0 = modifier;
        this.f$5 = function0;
        this.f$2 = z;
        this.f$3 = z2;
        this.f$6 = i;
    }
}
