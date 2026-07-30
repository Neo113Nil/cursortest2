package com.crrepa.band.my.device.setting.other.presenter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import cn.hutool.core.text.l;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.setting.other.model.BandDisplayTimeChangeEvent;
import com.crrepa.band.my.device.setting.other.model.BandLanguageChangeEvent;
import com.crrepa.band.my.device.setting.other.model.MusicPlayerStateEvent;
import com.crrepa.band.my.device.setting.other.model.PhysiologicalReminderStateEvent;
import com.crrepa.band.my.device.setting.quickresponse.model.BandQuickResponseStateChangeEvent;
import com.crrepa.band.my.health.bloodoxygen.model.BandTimingBloodOxygenStateChangeEvent;
import com.crrepa.band.my.health.bodytemperature.model.BandTimingTempStateChangeEvent;
import com.crrepa.band.my.health.bodytemperature.model.TemperatureUnitChangeEvent;
import com.crrepa.band.my.health.heartrate.model.BandTimingHeartRateStateChangeEvent;
import com.crrepa.band.my.model.BandPeriodTimeModel;
import com.crrepa.band.my.model.DoNotDistrubPeriodModel;
import com.crrepa.band.my.model.QuickViewPeriodModel;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.provider.BandA2DPProvider;
import com.crrepa.band.my.model.band.provider.BandBatterySavingProvider;
import com.crrepa.band.my.model.band.provider.BandDisplayLanguageProvider;
import com.crrepa.band.my.model.band.provider.BandDisplayTimeProvider;
import com.crrepa.band.my.model.band.provider.BandMusicPlayerProvider;
import com.crrepa.band.my.model.band.provider.BandPhysiologcalPeriodProvider;
import com.crrepa.band.my.model.band.provider.BandQuickResponseProvider;
import com.crrepa.band.my.model.band.provider.BandQuickViewProvider;
import com.crrepa.band.my.model.band.provider.BandReminderToMoveProvider;
import com.crrepa.band.my.model.band.provider.BandSosProvider;
import com.crrepa.band.my.model.band.provider.BandStressProvider;
import com.crrepa.band.my.model.band.provider.BandTapToWakeProvider;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.crrepa.band.my.model.band.provider.BandTimingBloodOxygenProvider;
import com.crrepa.band.my.model.band.provider.BandTimingHeartRateProvider;
import com.crrepa.band.my.model.band.provider.BandTimingTempProvider;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.band.provider.BandWeatherProvider;
import com.crrepa.band.my.model.db.DrinkWater;
import com.crrepa.band.my.model.db.HandWashing;
import com.crrepa.band.my.model.db.HeartRateWarning;
import com.crrepa.band.my.model.db.Language;
import com.crrepa.band.my.model.db.PhysiologicalPeriod;
import com.crrepa.band.my.model.db.PhysiologicalRemind;
import com.crrepa.band.my.model.db.proxy.DrinkWaterDaoProxy;
import com.crrepa.band.my.model.db.proxy.HandWashingDaoProxy;
import com.crrepa.band.my.model.db.proxy.HeartRateWarningDaoProxy;
import com.crrepa.band.my.model.db.proxy.LanguageDaoProxy;
import com.crrepa.band.my.model.db.proxy.PhysiologicalPeriodDaoProxy;
import com.crrepa.band.my.model.db.proxy.PhysiologicalRemindDaoProxy;
import com.crrepa.band.my.model.user.provider.DrinkWaterReminderProvider;
import com.crrepa.band.my.model.user.provider.HandWashingReminderProvider;
import com.crrepa.band.my.model.user.provider.HeartRateWarningProvider;
import com.crrepa.band.my.model.user.provider.PhysiologicalPeriodProvider;
import com.crrepa.ble.conn.bean.CRPDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPHandWashingPeriodInfo;
import com.crrepa.ble.conn.bean.CRPPeriodTimeInfo;
import com.crrepa.ble.conn.bean.CRPPhysiologcalPeriodInfo;
import com.crrepa.ble.conn.callback.CRPDevicePeriodTimeCallback;
import com.crrepa.ble.conn.callback.CRPDeviceQuickViewCallback;
import com.crrepa.ble.conn.callback.CRPDeviceSedentaryReminderCallback;
import com.crrepa.ble.conn.callback.CRPDeviceTimeSystemCallback;
import com.crrepa.ble.conn.listener.CRPA2DPConnectStateListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class b implements com.moyoung.dafit.module.common.baseui.f {
    public static final int DEFAULT_DRINK_WATER_COUNT = 8;
    public static final int DEFAULT_DRINK_WATER_PERIOD = 90;
    private static final int DEFAULT_DRINK_WATER_START_HOUR = 8;
    private static final int DEFAULT_DRINK_WATER_START_MINUTE = 0;
    private static final int DEFAULT_HAND_WASHING_COUNT = 4;
    private static final int DEFAULT_HAND_WASHING_PERIOD = 120;
    private Integer displayMenstrualPeriod;
    private Integer displayPhysiologicalPeriod;
    private Date displayStartDate;
    private s1.a view;
    private j timeSystemCallback = new j(this);
    private h quickViewCallback = new h(this);
    private i sedentaryReminderCallback = new i(this);
    private g perdiodTimeCallback = new g(this);
    private PhysiologicalRemind physiologicalRemind = new PhysiologicalRemindDaoProxy().getPhysiologicalRemind();
    private DrinkWater drinkWater = new DrinkWaterDaoProxy().get();
    private HeartRateWarning heartRateWarning = new HeartRateWarningDaoProxy().get();
    private HandWashing handWashing = new HandWashingDaoProxy().get();
    private LanguageDaoProxy languageDaoProxy = new LanguageDaoProxy();
    private boolean requestNotificationListener = false;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(String str) {
            b.this.view.renderTimeSystem(str);
        }
    }

    /* renamed from: com.crrepa.band.my.device.setting.other.presenter.b$b, reason: collision with other inner class name */
    class C0187b implements Consumer {
        C0187b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Boolean bool) {
            b.this.view.renderReminderToMove(bool.booleanValue());
        }
    }

    class c implements Consumer {
        c() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Boolean bool) {
            b.this.view.renderQuickView(bool.booleanValue());
        }
    }

    class d implements Consumer {
        d() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Boolean bool) {
            b.this.view.renderQuickViewPeriodVisible(bool.booleanValue());
        }
    }

    class e implements Consumer {
        e() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(String str) {
            b.this.view.renderDislayLanguage(str);
        }
    }

    class f implements Consumer {
        final /* synthetic */ boolean val$enable;

        f(boolean z7) {
            this.val$enable = z7;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Boolean bool) {
            b.this.view.renderTempTimingMeasureState(this.val$enable);
        }
    }

    static class g implements CRPDevicePeriodTimeCallback {
        private WeakReference<b> weakReference;

        public g(b bVar) {
            this.weakReference = new WeakReference<>(bVar);
        }

        @Override // com.crrepa.ble.conn.callback.CRPDevicePeriodTimeCallback
        public void onPeriodTime(int i8, CRPPeriodTimeInfo cRPPeriodTimeInfo) {
            b bVar = this.weakReference.get();
            if (bVar == null) {
                return;
            }
            BandPeriodTimeModel quickViewPeriodModel = i8 != 1 ? i8 != 2 ? null : new QuickViewPeriodModel() : new DoNotDistrubPeriodModel();
            if (cRPPeriodTimeInfo == null || quickViewPeriodModel == null) {
                return;
            }
            quickViewPeriodModel.setStartHour(cRPPeriodTimeInfo.getStartHour());
            quickViewPeriodModel.setStartMinute(cRPPeriodTimeInfo.getStartMinute());
            quickViewPeriodModel.setEndHour(cRPPeriodTimeInfo.getEndHour());
            quickViewPeriodModel.setEndMinute(cRPPeriodTimeInfo.getEndMinute());
            bVar.showBandPeriodTime(com.moyoung.dafit.module.common.utils.d.get(), i8, quickViewPeriodModel);
            quickViewPeriodModel.savePeriodTime();
        }
    }

    static class h implements CRPDeviceQuickViewCallback {
        private WeakReference<b> weakReference;

        public h(b bVar) {
            this.weakReference = new WeakReference<>(bVar);
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceQuickViewCallback
        public void onQuickView(boolean z7) {
            com.orhanobut.logger.f.d("onQuickView: " + z7);
            b bVar = this.weakReference.get();
            if (bVar == null) {
                return;
            }
            bVar.showBandQuickView(z7);
            BandQuickViewProvider.saveQuickView(z7);
        }
    }

    static class i implements CRPDeviceSedentaryReminderCallback {
        private WeakReference<b> weakReference;

        public i(b bVar) {
            this.weakReference = new WeakReference<>(bVar);
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceSedentaryReminderCallback
        public void onSedentaryReminder(boolean z7) {
            b bVar = this.weakReference.get();
            if (bVar == null) {
                return;
            }
            bVar.showBandReminderToMove(z7);
            BandReminderToMoveProvider.saveBandReminderToMove(z7);
        }
    }

    static class j implements CRPDeviceTimeSystemCallback {
        private WeakReference<b> weakReference;

        public j(b bVar) {
            this.weakReference = new WeakReference<>(bVar);
        }

        @Override // com.crrepa.ble.conn.callback.CRPDeviceTimeSystemCallback
        public void onTimeSystem(int i8) {
            b bVar = this.weakReference.get();
            if (bVar == null) {
                return;
            }
            bVar.showBandTimeSystem(i8);
            BandTimeSystemProvider.saveTimeSystem(i8);
        }
    }

    public b() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    private PhysiologicalPeriod getLastPhysiologicalPeriod() {
        return new PhysiologicalPeriodDaoProxy().getLastPhysiologcalPeriod();
    }

    private boolean hasQuickViewPeriod() {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.hasQuickViewPeriod();
    }

    private boolean isPhysiologcalRemindEnable(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showBandPeriodTime$0(int i8, String str) {
        if (i8 == 1) {
            this.view.renderDoNotDisturbPeriod(str);
        } else {
            if (i8 != 2) {
                return;
            }
            this.view.renderQuickViewEffectivePeriod(str);
        }
    }

    private void renderLocationCityViewVisibility(Context context, boolean z7) {
        if (z7) {
            showLocationCity();
        } else {
            this.view.hideLocationCity();
        }
    }

    private void renderTempTimingMeasure(boolean z7) {
        Observable.just(Boolean.valueOf(z7)).observeOn(AndroidSchedulers.mainThread()).subscribe(new f(z7));
    }

    private void saveDrinkWaterReminder() {
        if (this.drinkWater != null) {
            new DrinkWaterDaoProxy().update(this.drinkWater);
        }
    }

    private void saveHandWashingReminder() {
        if (this.handWashing != null) {
            new HandWashingDaoProxy().update(this.handWashing);
        }
    }

    private void saveHeartRateWarning() {
        if (this.heartRateWarning != null) {
            new HeartRateWarningDaoProxy().update(this.heartRateWarning);
        }
    }

    private void savePhysiologcalRemind() {
        new PhysiologicalRemindDaoProxy().update(this.physiologicalRemind);
    }

    private void sendDrinkWaterReminder() {
        DrinkWater drinkWater = this.drinkWater;
        if (drinkWater == null || drinkWater.getEnable() == null || this.drinkWater.getStartHour() == null || this.drinkWater.getStartMinute() == null || this.drinkWater.getCount() == null || this.drinkWater.getPeriod() == null) {
            return;
        }
        CRPDrinkWaterPeriodInfo cRPDrinkWaterPeriodInfo = new CRPDrinkWaterPeriodInfo();
        cRPDrinkWaterPeriodInfo.setEnable(this.drinkWater.getEnable().booleanValue());
        cRPDrinkWaterPeriodInfo.setStartHour(this.drinkWater.getStartHour().intValue());
        cRPDrinkWaterPeriodInfo.setStartMinute(this.drinkWater.getStartMinute().intValue());
        cRPDrinkWaterPeriodInfo.setCount(this.drinkWater.getCount().intValue());
        cRPDrinkWaterPeriodInfo.setPeriod(this.drinkWater.getPeriod().intValue());
        i4.getInstance().sendDrinkWaterReminder(cRPDrinkWaterPeriodInfo);
    }

    private void sendHeartRateWarning() {
        HeartRateWarning heartRateWarning = this.heartRateWarning;
        if (heartRateWarning == null || heartRateWarning.getEnable() == null || this.heartRateWarning.getHr() == null) {
            return;
        }
        i4.getInstance().sendHeartRateWarning((byte) this.heartRateWarning.getHr().intValue(), this.heartRateWarning.getEnable().booleanValue());
    }

    private void sendPhysiologcalPeriod() {
        PhysiologicalPeriod lastPhysiologicalPeriod = getLastPhysiologicalPeriod();
        if (lastPhysiologicalPeriod == null) {
            return;
        }
        Date lastMenstrualDate = lastPhysiologicalPeriod.getLastMenstrualDate();
        CRPPhysiologcalPeriodInfo cRPPhysiologcalPeriodInfo = new CRPPhysiologcalPeriodInfo();
        cRPPhysiologcalPeriodInfo.setPhysiologcalPeriod(lastPhysiologicalPeriod.getPhysiologicalPeriod().intValue());
        cRPPhysiologcalPeriodInfo.setMenstrualPeriod(lastPhysiologicalPeriod.getMenstrualPeriod().intValue());
        cRPPhysiologcalPeriodInfo.setStartDate(lastMenstrualDate);
        com.orhanobut.logger.f.d("startDate: " + lastMenstrualDate);
        int intValue = this.physiologicalRemind.getHour() != null ? this.physiologicalRemind.getHour().intValue() : 10;
        int intValue2 = this.physiologicalRemind.getMinute() != null ? this.physiologicalRemind.getMinute().intValue() : 0;
        cRPPhysiologcalPeriodInfo.setReminderHour(intValue);
        cRPPhysiologcalPeriodInfo.setReminderMinute(intValue2);
        PhysiologicalRemind physiologicalRemind = new PhysiologicalRemindDaoProxy().getPhysiologicalRemind();
        if (PhysiologicalRemindDaoProxy.isEnable(physiologicalRemind)) {
            cRPPhysiologcalPeriodInfo.setMenstrualReminder(isPhysiologcalRemindEnable(physiologicalRemind.getMenstrual()));
            cRPPhysiologcalPeriodInfo.setOvulationReminder(isPhysiologcalRemindEnable(physiologicalRemind.getOvulation()));
            cRPPhysiologcalPeriodInfo.setOvulationDayReminder(isPhysiologcalRemindEnable(physiologicalRemind.getOvulationDay()));
            cRPPhysiologcalPeriodInfo.setOvulationEndReminder(isPhysiologcalRemindEnable(physiologicalRemind.getOvulationEnd()));
        }
        i4.getInstance().sendPhysiologcalPeriod(cRPPhysiologcalPeriodInfo);
    }

    private void sendTodayWeather(Context context) {
        i4.getInstance().sendWeatherInfo(context);
    }

    private void sendhandWashingReminder() {
        HandWashing handWashing = this.handWashing;
        if (handWashing == null || handWashing.getEnable() == null) {
            return;
        }
        CRPHandWashingPeriodInfo cRPHandWashingPeriodInfo = new CRPHandWashingPeriodInfo();
        cRPHandWashingPeriodInfo.setEnable(this.handWashing.getEnable().booleanValue());
        cRPHandWashingPeriodInfo.setStartHour(this.handWashing.getStartHour().intValue());
        cRPHandWashingPeriodInfo.setStartMinute(this.handWashing.getStartMinute().intValue());
        cRPHandWashingPeriodInfo.setCount(this.handWashing.getCount().intValue());
        cRPHandWashingPeriodInfo.setPeriod(this.handWashing.getPeriod().intValue());
        i4.getInstance().sendHandWashingReminder(cRPHandWashingPeriodInfo);
    }

    private void setQuickViewPeriodVisible(boolean z7) {
        if (this.view == null) {
            return;
        }
        if (!hasQuickViewPeriod()) {
            z7 = false;
        }
        Observable.just(Boolean.valueOf(z7)).observeOn(AndroidSchedulers.mainThread()).subscribe(new d());
    }

    private void showA2DPConnectState() {
        if (BandA2DPProvider.hasA2DP()) {
            this.view.renderA2DPConnectState(BandA2DPProvider.getA2DPConnectState() == CRPA2DPConnectStateListener.A2DPConnectState.CONNECTED);
        }
    }

    @SuppressLint({"CheckResult"})
    private void showBandDisplayLanguage(String str) {
        if (this.view == null || TextUtils.isEmpty(str)) {
            return;
        }
        Observable.just(str).observeOn(AndroidSchedulers.mainThread()).subscribe(new e());
    }

    private void showBandDoNotDistrub(Context context) {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null || !connectBand.hasDoNotDistrubPeriod()) {
            return;
        }
        showBandPeriodTime(context, 1, new DoNotDistrubPeriodModel());
        i4.getInstance().queryDoNotDistrubTime(this.perdiodTimeCallback);
    }

    private void showBandPeriodTime() {
        showBandDoNotDistrub(com.moyoung.dafit.module.common.utils.d.get());
        showQuickViewPeriod(com.moyoung.dafit.module.common.utils.d.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showBandQuickView(boolean z7) {
        if (this.view == null) {
            return;
        }
        if (BandBatterySavingProvider.isBatterySaving()) {
            z7 = false;
        }
        Observable.just(Boolean.valueOf(z7)).observeOn(AndroidSchedulers.mainThread()).subscribe(new c());
        setQuickViewPeriodVisible(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showBandReminderToMove(boolean z7) {
        if (this.view == null) {
            return;
        }
        Observable.just(Boolean.valueOf(z7)).observeOn(AndroidSchedulers.mainThread()).subscribe(new C0187b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showBandTimeSystem(int i8) {
        if (this.view == null) {
            return;
        }
        String[] stringArray = com.moyoung.dafit.module.common.utils.d.get().getResources().getStringArray(R.array.time_system_array);
        if (i8 < 0 || stringArray.length <= i8) {
            return;
        }
        Observable.just(stringArray[i8]).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }

    private void showBatterySaving(boolean z7) {
        if (BandBatterySavingProvider.supportBatterySaving()) {
            this.view.renderBatterySaving(z7);
        }
    }

    private void showDisplayTime() {
        int displayTime = BandDisplayTimeProvider.getDisplayTime();
        if (displayTime != 0) {
            this.view.renderDisplayTime(displayTime);
        }
    }

    private void showDrinkWaterReminder() {
        DrinkWater drinkWater;
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null || !connectBand.hasDrinkWaterReminder() || (drinkWater = this.drinkWater) == null) {
            return;
        }
        if (drinkWater.getEnable() == null) {
            this.drinkWater.setEnable(Boolean.FALSE);
        }
        if (this.drinkWater.getStartHour() == null) {
            this.drinkWater.setStartHour(8);
        }
        if (this.drinkWater.getStartMinute() == null) {
            this.drinkWater.setStartMinute(0);
        }
        if (this.drinkWater.getCount() == null) {
            this.drinkWater.setCount(8);
        }
        if (this.drinkWater.getPeriod() == null) {
            this.drinkWater.setPeriod(90);
        }
        this.view.renderDrinkWaterReminder(this.drinkWater);
    }

    private void showHandWashingReminder() {
        HandWashing handWashing = this.handWashing;
        if (handWashing == null) {
            return;
        }
        if (handWashing.getEnable() == null) {
            this.handWashing.setEnable(Boolean.FALSE);
        }
        if (this.handWashing.getStartHour() == null) {
            this.handWashing.setStartHour(8);
        }
        if (this.handWashing.getStartMinute() == null) {
            this.handWashing.setStartMinute(0);
        }
        if (this.handWashing.getCount() == null) {
            this.handWashing.setCount(4);
        }
        if (this.handWashing.getPeriod() == null) {
            this.handWashing.setPeriod(120);
        }
        this.view.renderHandWashingReminder(this.handWashing);
    }

    private void showHeartRateWarning() {
        HeartRateWarning heartRateWarning = this.heartRateWarning;
        if (heartRateWarning == null) {
            return;
        }
        if (heartRateWarning.getEnable() == null) {
            this.heartRateWarning.setEnable(Boolean.FALSE);
        }
        if (this.heartRateWarning.getHr() == null || this.heartRateWarning.getHr().intValue() <= 0) {
            this.heartRateWarning.setHr(Integer.valueOf(HeartRateWarningProvider.getWarningMaxHeartRate()));
        }
        this.view.renderHeartRateWarning(this.heartRateWarning);
    }

    private void showLastMenstrualDate(Date date) {
        this.view.renderLastMenstrualDate(date);
    }

    private void showLocalBandDisplayLanguage() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand() != null) {
            String languageText = this.languageDaoProxy.getLanguageText(BandDisplayLanguageProvider.getDisplayLanguage());
            if (TextUtils.isEmpty(languageText)) {
                languageText = l.SPACE;
            }
            showBandDisplayLanguage(languageText);
        }
    }

    private void showLocationCity() {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null || connectBand.hasWeather()) {
            showLocationCity(BandWeatherProvider.getLocationCity());
        } else {
            this.view.hideWeatherContent();
        }
    }

    private void showMenstrualPeriod(int i8) {
        this.view.renderMenstrualPeriod(String.valueOf(i8));
    }

    private void showMusicPlayer(Context context) {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().isLyric()) {
            this.view.renderMusicPlayer(BandMusicPlayerProvider.getRealMusicPlayerState() && q1.b.isNotificationEnabled(context));
        }
    }

    private void showPhysiologcalPeriodData() {
        PhysiologicalPeriod lastPhysiologicalPeriod = getLastPhysiologicalPeriod();
        if (lastPhysiologicalPeriod == null) {
            return;
        }
        com.orhanobut.logger.f.d("id: " + lastPhysiologicalPeriod.getId());
        Integer physiologicalPeriod = lastPhysiologicalPeriod.getPhysiologicalPeriod();
        this.displayPhysiologicalPeriod = physiologicalPeriod;
        if (physiologicalPeriod != null) {
            showPhysiologicalPeriod(physiologicalPeriod.intValue());
        }
        Integer menstrualPeriod = lastPhysiologicalPeriod.getMenstrualPeriod();
        this.displayMenstrualPeriod = menstrualPeriod;
        if (menstrualPeriod != null) {
            showMenstrualPeriod(menstrualPeriod.intValue());
        }
        Date lastMenstrualDate = lastPhysiologicalPeriod.getLastMenstrualDate();
        this.displayStartDate = lastMenstrualDate;
        if (lastMenstrualDate != null) {
            showLastMenstrualDate(lastMenstrualDate);
        }
    }

    private void showPhysiologcalReminderTime() {
        if (this.physiologicalRemind.getMinute() == null || this.physiologicalRemind.getHour() == null) {
            return;
        }
        this.view.renderReminderTime(this.physiologicalRemind.getHour().intValue(), this.physiologicalRemind.getMinute().intValue());
    }

    private void showPhysiologicalPeriod(int i8) {
        this.view.renderPhysiologicalCycle(String.valueOf(i8));
    }

    private void showPhysiologicalReminder() {
        if (BandPhysiologcalPeriodProvider.isSupportPhysiologcalPeriod()) {
            this.view.renderPhysiologicalPeriodRemind();
            showPhysiologicalReminderState();
            showPhysiologcalPeriodData();
            showPhysiologcalReminderTime();
        }
    }

    private void showPhysiologicalReminderState() {
        boolean showPhysiologcalPeriod = BandPhysiologcalPeriodProvider.showPhysiologcalPeriod();
        com.orhanobut.logger.f.d("showPhysiologicalReminderState: " + showPhysiologcalPeriod);
        this.view.renderPhysiologicalReminder(showPhysiologcalPeriod);
    }

    private void showQuickResponseState() {
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            i4.getInstance().queryQuickResponsesCount();
        } else if (BandQuickResponseProvider.hasQuickResponse()) {
            this.view.renderQuickResponseState(BandQuickResponseProvider.getResponseState());
        }
    }

    private void showQuickViewPeriod(Context context) {
        if (!hasQuickViewPeriod()) {
            setQuickViewPeriodVisible(false);
        } else {
            showBandPeriodTime(context, 2, new QuickViewPeriodModel());
            i4.getInstance().queryQuickViewTime(this.perdiodTimeCallback);
        }
    }

    private void showResetView() {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null || !connectBand.hasReset()) {
            return;
        }
        this.view.renderResetView();
    }

    private void showSendWeather(Context context) {
        boolean weatherState = BandWeatherProvider.getWeatherState();
        this.view.renderWeather(weatherState);
        renderLocationCityViewVisibility(context, weatherState);
    }

    private void showSos() {
        if (BandSosProvider.hasSos()) {
            this.view.renderSos();
        }
    }

    private void showTapToWake() {
        if (BandTapToWakeProvider.hasTapToWake()) {
            this.view.renderTapToWakeState(BandTapToWakeProvider.getTapToWakeState());
        }
    }

    private void showTimingBloodOxygen() {
        if (BandTimingBloodOxygenProvider.supportTimingBloodOxygen()) {
            this.view.renderTimingBloodOxygen(BandTimingBloodOxygenProvider.getTimingBloodOxygenMode());
        }
    }

    private void showTimingHeartRate() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().hasTimingHeartRate()) {
            showTimingHeartRateInterval(BandTimingHeartRateProvider.getTimingHeartRateInterval());
        }
    }

    private void showTimingHeartRateInterval(int i8) {
        this.view.renderTimingHeartRateTime(i8 * 5);
    }

    private void showTimingStressState() {
        if (BandStressProvider.hasTimingStress()) {
            this.view.renderTimingStress(BandStressProvider.getTimingStressState());
        }
    }

    private void showTimingTemp() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().hasTimingTemp()) {
            this.view.renderTimingTemp(BandTimingTempProvider.getTimingTempState());
        }
    }

    private void showUnitSystem(Context context) {
        if (com.crrepa.band.my.ble.band.utils.g.hasUnitSystem()) {
            this.view.renderUnitSystem(context.getResources().getStringArray(R.array.unit_system_array)[BandUnitSystemProvider.getUnitSystem()]);
        }
    }

    private void showWeatherTempSystem(Context context) {
        if (!c2.d.hasWeatherTempSystem()) {
            this.view.hideWeatherTempSystem();
            return;
        }
        this.view.renderWeatherTempSystem(context.getResources().getStringArray(R.array.temp_system_array)[BandTempSystemProvider.getTempSystem()]);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        try {
            savePhysiologicalPeriod();
            savePhysiologcalRemind();
            sendPhysiologcalPeriod();
            sendHeartRateWarning();
            saveHeartRateWarning();
            sendhandWashingReminder();
            saveHandWashingReminder();
            org.greenrobot.eventbus.c.getDefault().post(new v2.c());
            org.greenrobot.eventbus.c.getDefault().post(new PhysiologicalReminderStateEvent(BandPhysiologcalPeriodProvider.showPhysiologcalPeriod()));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void getBandSetting(Context context) {
        showBandTimeSystem(BandTimeSystemProvider.getTimeSystem(context));
        showBandReminderToMove(BandReminderToMoveProvider.getBandReminderToMove());
        showBandQuickView(BandQuickViewProvider.getQuickView());
        showWeatherTempSystem(context);
        showUnitSystem(context);
        showSendWeather(context);
        showTimingHeartRate();
        showLocalBandDisplayLanguage();
        showPhysiologicalReminder();
        showHeartRateWarning();
        showHandWashingReminder();
        showDisplayTime();
        showTimingTemp();
        showMusicPlayer(context);
        i4 i4Var = i4.getInstance();
        i4Var.queryBandTimeSystem(this.timeSystemCallback);
        i4Var.queryReminderToMove(this.sedentaryReminderCallback);
        i4Var.queryQuickView(this.quickViewCallback);
        showTimingBloodOxygen();
        showResetView();
        showBatterySaving(BandBatterySavingProvider.isBatterySaving());
        showTapToWake();
        showA2DPConnectState();
        showTimingStressState();
        showSos();
    }

    public void getSupportLanguageList() {
        List<Language> supportLanguageList;
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null || (supportLanguageList = connectBand.getSupportLanguageList()) == null) {
            return;
        }
        byte displayLanguage = BandDisplayLanguageProvider.getDisplayLanguage();
        String[] strArr = new String[supportLanguageList.size()];
        int i8 = 0;
        for (int i9 = 0; i9 < supportLanguageList.size(); i9++) {
            Language language = supportLanguageList.get(i9);
            strArr[i9] = language.getLanguageText();
            if (displayLanguage == language.getCmd().longValue()) {
                i8 = i9;
            }
        }
        this.view.renderBandSupportLanguageList(strArr, i8);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandA2DPConnectChangeEvent(l0.a aVar) {
        showA2DPConnectState();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandBatterySavingChangeEvent(l0.c cVar) {
        i4.getInstance().queryQuickView(this.quickViewCallback);
        showBatterySaving(cVar.isEnable());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandDisplayTimeChangeEvent(BandDisplayTimeChangeEvent bandDisplayTimeChangeEvent) {
        showDisplayTime();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandLanguageChangeEvent(BandLanguageChangeEvent bandLanguageChangeEvent) {
        showBandDisplayLanguage(this.languageDaoProxy.getLanguageText(bandLanguageChangeEvent.getDisplayLanguage()));
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandMeasurementSystemChangeEvent(l0.g gVar) {
        showUnitSystem(com.moyoung.dafit.module.common.utils.d.get());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandQuickResponseStateChangeEvent(BandQuickResponseStateChangeEvent bandQuickResponseStateChangeEvent) {
        this.view.renderQuickResponseState(bandQuickResponseStateChangeEvent.isEnable());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandSosStateChangeEventEvent(com.crrepa.band.my.device.setting.sos.a aVar) {
        this.view.renderSos();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandTimingHeartRateChangeEvent(BandTimingHeartRateStateChangeEvent bandTimingHeartRateStateChangeEvent) {
        showTimingHeartRateInterval(bandTimingHeartRateStateChangeEvent.getInterval());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    public void reset() {
        i4.getInstance().reset();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
        showBandPeriodTime();
        if (!this.requestNotificationListener || q1.b.isNotificationEnabled(com.moyoung.dafit.module.common.utils.d.get())) {
            return;
        }
        this.requestNotificationListener = false;
        this.view.renderMusicPlayer(false);
        saveMusicPlayerState(com.moyoung.dafit.module.common.utils.d.get(), false);
    }

    public void saveA2DPConnectState(boolean z7) {
        com.orhanobut.logger.f.d("saveA2DPConnectState: " + z7);
        if (BandA2DPProvider.getA2DPConnectState() == CRPA2DPConnectStateListener.A2DPConnectState.NOT_CONNECTED) {
            this.view.renderA2DPNotConnectHint();
            this.view.renderA2DPConnectState(false);
            return;
        }
        CRPA2DPConnectStateListener.A2DPConnectState a2DPConnectState = z7 ? CRPA2DPConnectStateListener.A2DPConnectState.CONNECTED : CRPA2DPConnectStateListener.A2DPConnectState.DISCONNECTED;
        if (i4.getInstance().sendA2DPConnectState(a2DPConnectState)) {
            BandA2DPProvider.saveA2DPConnectState(a2DPConnectState);
        } else {
            this.view.renderA2DPConnectState(!z7);
        }
    }

    public void saveBandDisplayLanguage(String str) {
        byte languageCmd = this.languageDaoProxy.getLanguageCmd(str);
        if (i4.getInstance().sendBandDisplayLanguage(languageCmd)) {
            showBandDisplayLanguage(str);
            BandDisplayLanguageProvider.saveDisplayLanguage(languageCmd);
            i4.getInstance().sendWorldClockList();
        }
    }

    public void saveBandQuickView(boolean z7) {
        if (BandBatterySavingProvider.isBatterySaving()) {
            showBandQuickView(false);
            this.view.renderDisableQuickView();
        } else if (!i4.getInstance().sendQuickView(z7)) {
            showBandQuickView(!z7);
        } else {
            BandQuickViewProvider.saveQuickView(z7);
            setQuickViewPeriodVisible(z7);
        }
    }

    public void saveBandReminderToMove(boolean z7) {
        if (i4.getInstance().sendReminderToMove(z7)) {
            BandReminderToMoveProvider.saveBandReminderToMove(z7);
        } else {
            showBandReminderToMove(!z7);
        }
    }

    public void saveBandTimeSystem(Context context, int i8) {
        if (i4.getInstance().sendBandTimeSystem((byte) i8)) {
            BandTimeSystemProvider.saveTimeSystem(i8);
        }
        showBandTimeSystem(BandTimeSystemProvider.getTimeSystem(context));
        showBandPeriodTime();
    }

    public void saveBatterySaving(boolean z7) {
        com.orhanobut.logger.f.d("saveBatterySaving: " + z7);
        if (!i4.getInstance().sendBatterySaving(z7)) {
            this.view.renderBatterySaving(!z7);
        } else {
            BandBatterySavingProvider.saveBatterySaving(z7);
            showBandQuickView(BandQuickViewProvider.getQuickView());
        }
    }

    public void saveDisplayTime(int i8) {
        i4.getInstance().sendDisplayTime(i8);
        BandDisplayTimeProvider.saveDisplayTime(i8);
    }

    public void saveDrinkWaterCount(int i8) {
        DrinkWater drinkWater = this.drinkWater;
        if (drinkWater != null) {
            drinkWater.setCount(Integer.valueOf(i8));
        }
    }

    public void saveDrinkWaterPeriod(int i8) {
        DrinkWater drinkWater = this.drinkWater;
        if (drinkWater != null) {
            drinkWater.setPeriod(Integer.valueOf(i8));
        }
    }

    public void saveDrinkWaterReminderStartTime(int i8, int i9) {
        DrinkWater drinkWater = this.drinkWater;
        if (drinkWater != null) {
            drinkWater.setStartHour(Integer.valueOf(i8));
            this.drinkWater.setStartMinute(Integer.valueOf(i9));
        }
    }

    public void saveDrinkWaterReminderState(boolean z7) {
        DrinkWater drinkWater = this.drinkWater;
        if (drinkWater != null) {
            drinkWater.setEnable(Boolean.valueOf(z7));
        }
    }

    public void saveHandWashingCount(int i8) {
        HandWashing handWashing = this.handWashing;
        if (handWashing != null) {
            handWashing.setCount(Integer.valueOf(i8));
        }
    }

    public void saveHandWashingPeriod(int i8) {
        HandWashing handWashing = this.handWashing;
        if (handWashing != null) {
            handWashing.setPeriod(Integer.valueOf(i8));
        }
    }

    public void saveHandWashingReminderStartTime(int i8, int i9) {
        HandWashing handWashing = this.handWashing;
        if (handWashing != null) {
            handWashing.setStartHour(Integer.valueOf(i8));
            this.handWashing.setStartMinute(Integer.valueOf(i9));
        }
    }

    public void saveHandWashingReminderState(boolean z7) {
        HandWashing handWashing = this.handWashing;
        if (handWashing != null) {
            handWashing.setEnable(Boolean.valueOf(z7));
        }
    }

    public void saveHeartRateWarningState(boolean z7) {
        HeartRateWarning heartRateWarning = this.heartRateWarning;
        if (heartRateWarning != null) {
            heartRateWarning.setEnable(Boolean.valueOf(z7));
        }
    }

    public void saveLastMenstrualDate(Date date) {
        this.displayStartDate = date;
        showLastMenstrualDate(date);
    }

    public void saveLocationCity(Context context) {
        showLocationCity();
        sendTodayWeather(context);
    }

    public void saveMaxHeartRate(int i8) {
        HeartRateWarning heartRateWarning = this.heartRateWarning;
        if (heartRateWarning != null) {
            heartRateWarning.setHr(Integer.valueOf(i8));
        }
    }

    public void saveMenstrualPeriod(int i8) {
        this.displayMenstrualPeriod = Integer.valueOf(i8);
        showMenstrualPeriod(i8);
    }

    public void saveMusicPlayerState(Context context, boolean z7) {
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            this.view.renderMusicPlayer(!z7);
            return;
        }
        if (z7 && !q1.b.isNotificationEnabled(context)) {
            this.requestNotificationListener = true;
            this.view.renderNotificationListenerDialog();
        }
        if (!z7) {
            i4.getInstance().closeMusicControl();
        }
        BandMusicPlayerProvider.saveMusicPlayerState(z7);
        com.crrepa.band.my.device.pushmessage.notify.b.updatePlayerState();
        org.greenrobot.eventbus.c.getDefault().post(new MusicPlayerStateEvent());
    }

    public void savePhysiologicalPeriod(int i8) {
        this.displayPhysiologicalPeriod = Integer.valueOf(i8);
        showPhysiologicalPeriod(i8);
    }

    public void savePhysiologicalReminderState(boolean z7) {
        BandPhysiologcalPeriodProvider.savePhysiologcalPeriodState(z7);
        this.physiologicalRemind.setEnable(Boolean.valueOf(z7));
    }

    public void savePhysiologicalReminderTime(int i8, int i9) {
        this.physiologicalRemind.setHour(Integer.valueOf(i8));
        this.physiologicalRemind.setMinute(Integer.valueOf(i9));
        this.view.renderReminderTime(i8, i9);
    }

    public void saveSendWeather(Context context, boolean z7) {
        renderLocationCityViewVisibility(context, z7);
        BandWeatherProvider.saveWeatherState(z7);
        if (z7) {
            sendTodayWeather(context);
        }
    }

    public void saveTapToWakeState(boolean z7) {
        com.orhanobut.logger.f.d("saveTapToWakeState: " + z7);
        if (i4.getInstance().sendTapToWakeState(z7)) {
            BandTapToWakeProvider.saveTapToWakeState(z7);
        } else {
            this.view.renderTapToWakeState(!z7);
        }
    }

    public void saveTempTimingMeasureState(boolean z7) {
        if (!com.crrepa.band.my.ble.band.cmd.d.getInstance().sendTempTimingMeasureState(z7)) {
            renderTempTimingMeasure(!z7);
        } else {
            BandTimingTempProvider.saveTimingTempState(z7);
            org.greenrobot.eventbus.c.getDefault().post(new BandTimingTempStateChangeEvent(z7));
        }
    }

    public void saveTimingBloodOxygenMode(int i8) {
        boolean z7 = i8 != 0;
        if (i4.getInstance().enableTimingBloodOxygen(z7)) {
            this.view.renderTimingBloodOxygen(i8);
            BandTimingBloodOxygenProvider.saveTimingBloodOxygenEnable(z7);
            BandTimingBloodOxygenProvider.saveTimingBloodOxygenMode(i8);
            org.greenrobot.eventbus.c.getDefault().post(new BandTimingBloodOxygenStateChangeEvent(z7));
        }
    }

    public void saveTimingHeartRateInterval(int i8) {
        if (com.crrepa.band.my.ble.band.cmd.d.getInstance().sendTimingHeartRateInterval(i8)) {
            BandTimingHeartRateProvider.saveTimingHeartRateInterval(i8);
            org.greenrobot.eventbus.c.getDefault().post(new BandTimingHeartRateStateChangeEvent(i8));
            if (i8 > 0) {
                this.view.renderContinueHeartRateEnableHint();
                com.crrepa.band.my.ble.band.cmd.d.getInstance().queryTodayHeartRate(1);
            }
        }
    }

    public void saveTimingStressState(boolean z7) {
        BandStressProvider.saveTimingStressState(z7);
        i4.getInstance().sendTimingStressState(z7);
    }

    public void saveUnitSystem(int i8, String str) {
        BandUnitSystemProvider.saveUnitSystem(i8);
        this.view.renderUnitSystem(str);
        i4.getInstance().sendUnitSystem((byte) i8);
    }

    public void saveWeatherTempSystem(Context context, int i8, String str) {
        BandTempSystemProvider.setTempSystem(i8);
        this.view.renderWeatherTempSystem(str);
        sendTodayWeather(context);
        org.greenrobot.eventbus.c.getDefault().post(new TemperatureUnitChangeEvent(i8));
        i4.getInstance().sendTempSystem(i8);
    }

    public void selectDrinkWaterCount() {
        if (this.drinkWater != null) {
            this.view.renderSelectedDrinkWaterReminderCount(DrinkWaterReminderProvider.getDrinkWaterCountList(), DrinkWaterReminderProvider.getDrinkWaterCountPosition(this.drinkWater.getCount().intValue()));
        }
    }

    public void selectDrinkWaterPeriod() {
        if (this.drinkWater != null) {
            this.view.renderSelectedDrinkWaterReminderPeriod(DrinkWaterReminderProvider.getDrinkWaterPeriodList(), DrinkWaterReminderProvider.getDrinkWaterPeriodPosition(this.drinkWater.getPeriod().intValue()));
        }
    }

    public void selectDrinkWaterReminderStartTime() {
        DrinkWater drinkWater = this.drinkWater;
        if (drinkWater != null) {
            this.view.renderSelectedDrinkWaterReminderTime(drinkWater.getStartHour().intValue(), this.drinkWater.getStartMinute().intValue());
        }
    }

    public void selectHandWashingCount() {
        if (this.handWashing != null) {
            this.view.renderSelectedHandWashingReminderCount(HandWashingReminderProvider.getHandWashingCountList(), HandWashingReminderProvider.getHandWashingCountPosition(this.handWashing.getCount().intValue()));
        }
    }

    public void selectHandWashingPeriod() {
        if (this.handWashing != null) {
            this.view.renderSelectedHandWashingReminderPeriod(HandWashingReminderProvider.getHandWashingPeriodList(), HandWashingReminderProvider.getHandWashingPeriodPosition(this.handWashing.getPeriod().intValue()));
        }
    }

    public void selectHandWashingReminderStartTime() {
        HandWashing handWashing = this.handWashing;
        if (handWashing != null) {
            this.view.renderSelectedHandWashingReminderTime(handWashing.getStartHour().intValue(), this.handWashing.getStartMinute().intValue());
        }
    }

    public void selectLastMenstrualDate() {
        Date date = this.displayStartDate;
        if (date == null) {
            date = new Date();
        }
        this.view.renderSelectedLastMenstrualDate(date);
    }

    public void selectMaxHeartRate() {
        if (this.heartRateWarning != null) {
            this.view.renderSelectedHeartRateWarning(HeartRateWarningProvider.getHeartRateWarningList(), HeartRateWarningProvider.getHeartRateWarningPosition(this.heartRateWarning.getHr().intValue()));
        }
    }

    public void selectMenstrualPeriod() {
        PhysiologicalPeriod lastPhysiologicalPeriod = getLastPhysiologicalPeriod();
        this.view.renderSelectedMenstrualPeriod(PhysiologicalPeriodProvider.getMenstrualPeriodList(), PhysiologicalPeriodProvider.getMenstrualPeriodSelectedPosition((lastPhysiologicalPeriod == null || lastPhysiologicalPeriod.getMenstrualPeriod() == null) ? 5 : lastPhysiologicalPeriod.getMenstrualPeriod().intValue()));
    }

    public void selectPhysiologicalCycle() {
        PhysiologicalPeriod lastPhysiologicalPeriod = getLastPhysiologicalPeriod();
        this.view.renderSelectedPhysiologicalCycle(PhysiologicalPeriodProvider.getPhysiologicalCycleList(), PhysiologicalPeriodProvider.getPhysiologicalCycleSelectedPosition((lastPhysiologicalPeriod == null || lastPhysiologicalPeriod.getPhysiologicalPeriod() == null) ? 28 : lastPhysiologicalPeriod.getPhysiologicalPeriod().intValue()));
    }

    public void selectPhysiologicalReminderTime() {
        this.view.renderReminderTimeDialog(this.physiologicalRemind.getHour() != null ? this.physiologicalRemind.getHour().intValue() : 10, this.physiologicalRemind.getMinute() != null ? this.physiologicalRemind.getMinute().intValue() : 0);
    }

    public void setRequestNotificationListener(boolean z7) {
        this.requestNotificationListener = z7;
    }

    public void setView(s1.a aVar) {
        this.view = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showBandPeriodTime(Context context, final int i8, BandPeriodTimeModel bandPeriodTimeModel) {
        if (this.view == null) {
            return;
        }
        String formatBandPeriodTime = m3.a.formatBandPeriodTime(context, bandPeriodTimeModel, i8);
        if (TextUtils.isEmpty(formatBandPeriodTime)) {
            return;
        }
        Observable.just(formatBandPeriodTime).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.setting.other.presenter.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                b.this.lambda$showBandPeriodTime$0(i8, (String) obj);
            }
        });
    }

    public void savePhysiologicalPeriod() {
        PhysiologicalPeriod physiologicalPeriod = new PhysiologicalPeriod();
        physiologicalPeriod.setPhysiologicalPeriod(this.displayPhysiologicalPeriod);
        physiologicalPeriod.setMenstrualPeriod(this.displayMenstrualPeriod);
        physiologicalPeriod.setLastMenstrualDate(this.displayStartDate);
        long insert = new PhysiologicalPeriodDaoProxy().insert(physiologicalPeriod);
        if (insert > 0) {
            w2.b.guideComplete();
        }
        com.orhanobut.logger.f.d("savePhysiologicalPeriod: " + insert);
    }

    private void showLocationCity(String str) {
        s1.a aVar = this.view;
        if (aVar != null) {
            aVar.renderLocationCity(str);
        }
    }
}
