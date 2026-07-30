package s1;

import com.crrepa.band.my.model.db.DrinkWater;
import com.crrepa.band.my.model.db.HandWashing;
import com.crrepa.band.my.model.db.HeartRateWarning;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    void hideLocationCity();

    void hideWeatherContent();

    void hideWeatherTempSystem();

    void renderA2DPConnectState(boolean z7);

    void renderA2DPNotConnectHint();

    void renderBandSupportLanguageList(String[] strArr, int i8);

    void renderBatterySaving(boolean z7);

    void renderContinueHeartRateEnableHint();

    void renderDisableQuickView();

    void renderDislayLanguage(String str);

    void renderDisplayTime(int i8);

    void renderDoNotDisturbPeriod(String str);

    void renderDrinkWaterReminder(DrinkWater drinkWater);

    void renderHandWashingReminder(HandWashing handWashing);

    void renderHeartRateWarning(HeartRateWarning heartRateWarning);

    void renderLastMenstrualDate(Date date);

    void renderLocationCity(String str);

    void renderMenstrualPeriod(String str);

    void renderMusicPlayer(boolean z7);

    void renderNotificationListenerDialog();

    void renderPhysiologicalCycle(String str);

    void renderPhysiologicalPeriodRemind();

    void renderPhysiologicalReminder(boolean z7);

    void renderQuickResponseState(boolean z7);

    void renderQuickView(boolean z7);

    void renderQuickViewEffectivePeriod(String str);

    void renderQuickViewPeriodVisible(boolean z7);

    void renderReminderTime(int i8, int i9);

    void renderReminderTimeDialog(int i8, int i9);

    void renderReminderToMove(boolean z7);

    void renderResetView();

    void renderSelectedDrinkWaterReminderCount(List<Integer> list, int i8);

    void renderSelectedDrinkWaterReminderPeriod(List<Integer> list, int i8);

    void renderSelectedDrinkWaterReminderTime(int i8, int i9);

    void renderSelectedHandWashingReminderCount(List<Integer> list, int i8);

    void renderSelectedHandWashingReminderPeriod(List<Integer> list, int i8);

    void renderSelectedHandWashingReminderTime(int i8, int i9);

    void renderSelectedHeartRateWarning(List<Integer> list, int i8);

    void renderSelectedLastMenstrualDate(Date date);

    void renderSelectedMenstrualPeriod(List<Integer> list, int i8);

    void renderSelectedPhysiologicalCycle(List<Integer> list, int i8);

    void renderSos();

    void renderTapToWakeState(boolean z7);

    void renderTempTimingMeasureState(boolean z7);

    void renderTimeSystem(String str);

    void renderTimingBloodOxygen(int i8);

    void renderTimingHeartRateTime(int i8);

    void renderTimingStress(boolean z7);

    void renderTimingTemp(boolean z7);

    void renderUnitSystem(String str);

    void renderWeather(boolean z7);

    void renderWeatherTempSystem(String str);
}
