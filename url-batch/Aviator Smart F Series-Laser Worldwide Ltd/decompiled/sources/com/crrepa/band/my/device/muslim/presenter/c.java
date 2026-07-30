package com.crrepa.band.my.device.muslim.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.device.muslim.AllahNamesActivity;
import com.crrepa.band.my.device.muslim.MuslimDirectionActivity;
import com.crrepa.band.my.device.muslim.PrayFragment;
import com.crrepa.band.my.device.muslim.TasbihReminderSettingActivity;
import com.crrepa.band.my.device.muslim.model.BandMuslimPrayMethodChangeEvent;
import com.crrepa.band.my.device.muslim.model.BandMuslimPrayerCompensationChangeEvent;
import com.crrepa.band.my.device.muslim.model.MuslimConst;
import com.crrepa.band.my.device.muslim.model.MuslimFunction;
import com.crrepa.band.my.device.muslim.model.MuslimPray;
import com.crrepa.band.my.device.muslim.utils.d;
import com.crrepa.band.my.training.model.GpsStateChangeEvent;
import com.crrepa.band.my.training.model.LocationCityInfo;
import com.crrepa.band.my.training.utils.e;
import com.crrepa.band.my.training.utils.h;
import com.github.mikephil.charting.utils.i;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.m;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class c implements f {
    private boolean isLocationOpen;
    private Disposable prayTimerSubscribe;
    private com.crrepa.band.my.device.muslim.view.c view;
    private int dateMonthOffset = 0;
    private ArrayList<String> prayTimes = null;
    private ArrayList<Date> dates = new ArrayList<>();
    private int todayPagerIndex = 0;
    private int currentPagerIndex = 0;
    private int nextPrayTimesIndex = 0;
    private int prayTime = 0;
    private boolean isToDirection = false;

    class a implements Observer {
        final /* synthetic */ boolean val$isSkipToToday;

        a(boolean z7) {
            this.val$isSkipToToday = z7;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            th.printStackTrace();
            com.crrepa.band.my.device.muslim.utils.b.setLocationError();
            if (c.this.view != null) {
                c.this.view.renderLocationFailure(true);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
        }

        @Override // io.reactivex.Observer
        public void onNext(LocationCityInfo locationCityInfo) {
            com.orhanobut.logger.f.d("muslim ==> 主页获取 经度：" + locationCityInfo.getLongitude() + " 纬度：" + locationCityInfo.getLatitude());
            if (locationCityInfo.getLatitude() == i.DOUBLE_EPSILON || locationCityInfo.getLongitude() == i.DOUBLE_EPSILON) {
                com.crrepa.band.my.device.muslim.utils.b.setLocationError();
                if (c.this.view != null) {
                    c.this.view.renderLocationFailure(true);
                    return;
                }
                return;
            }
            com.crrepa.band.my.device.muslim.utils.b.latitude = locationCityInfo.getLatitude();
            com.crrepa.band.my.device.muslim.utils.b.longitude = locationCityInfo.getLongitude();
            com.crrepa.band.my.device.muslim.utils.b.getInstance().sendMuslimLocation();
            if (c.this.view != null) {
                c.this.updatePrayTime(this.val$isSkipToToday, false);
            }
        }
    }

    private void changeLocationOpenStatus(boolean z7) {
        if (z7 != this.isLocationOpen) {
            com.orhanobut.logger.f.d("muslim ==> changeLocationOpen: " + z7);
            this.isLocationOpen = z7;
            if (z7) {
                this.view.renderLocationSuccess();
            } else {
                this.view.renderLocationFailure(false);
            }
        }
    }

    private void getCurrentPrayTimes() {
        ArrayList<String> arrayList = this.prayTimes;
        if (arrayList == null || arrayList.isEmpty()) {
            ArrayList<Date> currentMonthDateList = getCurrentMonthDateList();
            for (int i8 = 0; i8 < currentMonthDateList.size(); i8++) {
                if (m.isSameDay(currentMonthDateList.get(i8), new Date())) {
                    this.todayPagerIndex = i8;
                    this.prayTimes = d.getPrayerTimes(currentMonthDateList.get(i8), com.crrepa.band.my.device.muslim.utils.b.latitude, com.crrepa.band.my.device.muslim.utils.b.longitude, com.crrepa.band.my.device.muslim.utils.c.getPrayMethod());
                    return;
                }
            }
        }
    }

    private List<MuslimPray> getMuslimPrayList(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        MuslimPray muslimPray = new MuslimPray();
        muslimPray.setRemind(true);
        muslimPray.setName(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.muslim_pray_time_fajr));
        muslimPray.setTime(arrayList.get(0));
        muslimPray.setCurrent(true);
        muslimPray.setIcon(R$drawable.img_muslim_fajr);
        arrayList2.add(muslimPray);
        MuslimPray muslimPray2 = new MuslimPray();
        muslimPray2.setRemind(true);
        muslimPray2.setName(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.muslim_pray_time_sunrise));
        muslimPray2.setTime(arrayList.get(1));
        muslimPray2.setIcon(R$drawable.img_muslim_sunrise);
        arrayList2.add(muslimPray2);
        MuslimPray muslimPray3 = new MuslimPray();
        muslimPray3.setRemind(true);
        muslimPray3.setName(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.muslim_pray_time_dhuhr));
        muslimPray3.setTime(arrayList.get(2));
        muslimPray3.setIcon(R$drawable.img_muslim_dhuhr);
        arrayList2.add(muslimPray3);
        MuslimPray muslimPray4 = new MuslimPray();
        muslimPray4.setRemind(false);
        muslimPray4.setName(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.muslim_pray_time_asr));
        muslimPray4.setTime(arrayList.get(3));
        muslimPray4.setIcon(R$drawable.img_muslim_asr);
        arrayList2.add(muslimPray4);
        MuslimPray muslimPray5 = new MuslimPray();
        muslimPray5.setRemind(true);
        muslimPray5.setName(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.muslim_pray_time_maghrib));
        muslimPray5.setTime(arrayList.get(4));
        muslimPray5.setIcon(R$drawable.img_muslim_maghrib);
        arrayList2.add(muslimPray5);
        MuslimPray muslimPray6 = new MuslimPray();
        muslimPray6.setRemind(false);
        muslimPray6.setName(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.muslim_pray_time_lsha));
        muslimPray6.setTime(arrayList.get(5));
        muslimPray6.setIcon(R$drawable.img_muslim_lsha);
        arrayList2.add(muslimPray6);
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startCountDown$0(int i8, Long l8) {
        if (this.view == null) {
            stopCountDown();
            return;
        }
        int i9 = this.prayTime + 1;
        this.prayTime = i9;
        if (i9 > i8) {
            this.prayTime = 0;
            updatePrayTime(true, true);
        } else {
            this.view.renderNextPrayCountDown(e.getTrainingTimeStr(com.moyoung.dafit.module.common.utils.d.get(), i8 - (this.prayTime - 1)));
        }
    }

    private void startCountDown(long j8, final int i8) {
        stopCountDown();
        this.prayTime = 0;
        this.prayTimerSubscribe = Observable.interval(j8, 1000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.muslim.presenter.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.this.lambda$startCountDown$0(i8, (Long) obj);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    public ArrayList<Date> getCurrentMonthDateList() {
        ArrayList<Date> arrayList = new ArrayList<>();
        Calendar startCalendarOfMonth = m.getStartCalendarOfMonth(new Date());
        for (int i8 = 0; i8 < startCalendarOfMonth.getActualMaximum(5); i8++) {
            arrayList.add(m.getDateOfOffsetDay(startCalendarOfMonth.getTime(), i8));
        }
        return arrayList;
    }

    public void getFunctionList() {
        ArrayList arrayList = new ArrayList();
        MuslimFunction muslimFunction = new MuslimFunction();
        muslimFunction.setIcon(R$drawable.ic_musilm_tasbih_reminder);
        muslimFunction.setName(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.muslim_tasbih_reminder_title));
        arrayList.add(muslimFunction);
        MuslimFunction muslimFunction2 = new MuslimFunction();
        muslimFunction2.setIcon(R$drawable.ic_musilm_99_names);
        muslimFunction2.setName(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.muslim_allah_names_title));
        arrayList.add(muslimFunction2);
        MuslimFunction muslimFunction3 = new MuslimFunction();
        muslimFunction3.setIcon(R$drawable.ic_musilm_qibla_direction);
        muslimFunction3.setName(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.muslim_qibla_direction_title));
        arrayList.add(muslimFunction3);
        this.view.renderMuslimFunctionList(arrayList);
    }

    public void getNextPray(boolean z7) {
        ArrayList<String> arrayList = new ArrayList<>(this.prayTimes);
        if (arrayList.isEmpty()) {
            return;
        }
        if (z7) {
            this.nextPrayTimesIndex++;
        } else {
            this.nextPrayTimesIndex = d.getNextPrayIndex(arrayList);
        }
        Date date = new Date();
        if (this.nextPrayTimesIndex == arrayList.size()) {
            date = m.getDateOfOffsetDay(new Date(), 1);
            arrayList = d.getPrayerTimes(date, com.crrepa.band.my.device.muslim.utils.b.latitude, com.crrepa.band.my.device.muslim.utils.b.longitude, com.crrepa.band.my.device.muslim.utils.c.getPrayMethod());
            this.nextPrayTimesIndex = 0;
        }
        MuslimPray muslimPray = getMuslimPrayList(arrayList).get(this.nextPrayTimesIndex);
        this.view.renderNextPray(muslimPray);
        long milliSecondSpace = m.getMilliSecondSpace(new Date(), d.getPrayDate(muslimPray.getTime(), date));
        int i8 = (int) (milliSecondSpace / 1000);
        this.view.renderNextPrayCountDown(e.getTrainingTimeStr(com.moyoung.dafit.module.common.utils.d.get(), i8));
        startCountDown(milliSecondSpace % 1000, i8);
    }

    public void getPrayTimeList(Context context, boolean z7, boolean z8) {
        if (z8 || com.crrepa.band.my.device.muslim.utils.b.isLocationError()) {
            h.getLocationAddress(context).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(z7));
        } else {
            updatePrayTime(z7, false);
        }
    }

    public boolean isLocationOpen() {
        return this.isLocationOpen;
    }

    public boolean isToDirection() {
        return this.isToDirection;
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandPrayMethodChangeEvent(BandMuslimPrayMethodChangeEvent bandMuslimPrayMethodChangeEvent) {
        if (!this.isLocationOpen || com.crrepa.band.my.device.muslim.utils.b.isLocationError()) {
            return;
        }
        updatePrayTime(false, false);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandPrayerCompensationChangeEvent(BandMuslimPrayerCompensationChangeEvent bandMuslimPrayerCompensationChangeEvent) {
        if (!this.isLocationOpen || com.crrepa.band.my.device.muslim.utils.b.isLocationError()) {
            return;
        }
        updatePrayTime(false, false);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onGpsStateChangeEvent(GpsStateChangeEvent gpsStateChangeEvent) {
        changeLocationOpenStatus(com.crrepa.band.my.training.utils.i.isEnable(gpsStateChangeEvent.getContext()));
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
        stopCountDown();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
        Disposable disposable = this.prayTimerSubscribe;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        getNextPray(false);
    }

    public void setToDirection(boolean z7) {
        this.isToDirection = z7;
    }

    public void setView(com.crrepa.band.my.device.muslim.view.c cVar, Context context) {
        this.view = cVar;
        org.greenrobot.eventbus.c.getDefault().register(this);
        this.isLocationOpen = com.crrepa.band.my.training.utils.i.isEnable(context);
    }

    public void showCurrentPager(int i8) {
        if (i8 < this.dates.size()) {
            this.currentPagerIndex = i8;
            this.view.renderPageDate(this.dates.get(i8));
        }
    }

    public void showErrorLocationPager(Context context) {
        this.dates = getCurrentMonthDateList();
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < this.dates.size(); i8++) {
            PrayFragment prayFragment = new PrayFragment();
            Bundle bundle = new Bundle();
            Date date = this.dates.get(i8);
            if (m.isSameDay(date, new Date())) {
                this.todayPagerIndex = i8;
                this.prayTimes = new ArrayList<>();
            }
            bundle.putStringArrayList(MuslimConst.MUSLIM_PRAY_TIMES, this.prayTimes);
            bundle.putSerializable(MuslimConst.MUSLIM_PRAY_DATE, date);
            bundle.putInt(MuslimConst.MUSLIM_PRAY_TIME_INDEX, -1);
            prayFragment.setArguments(bundle);
            arrayList.add(prayFragment);
        }
        this.view.renderPrayPager(arrayList);
        this.view.renderPageIndex(this.todayPagerIndex);
        MuslimPray muslimPray = new MuslimPray();
        muslimPray.setIcon(R.drawable.shape_band_item_bg);
        muslimPray.setName(context.getString(R.string.data_blank));
        muslimPray.setTime(null);
        this.view.renderNextPray(muslimPray);
        stopCountDown();
        this.view.renderNextPrayCountDown(null);
    }

    public void startActivity(int i8, Context context) {
        Intent intent;
        if (i8 == 0) {
            intent = new Intent(context, (Class<?>) TasbihReminderSettingActivity.class);
        } else if (i8 == 1) {
            intent = new Intent(context, (Class<?>) AllahNamesActivity.class);
        } else if (i8 != 2) {
            intent = null;
        } else {
            intent = new Intent(context, (Class<?>) MuslimDirectionActivity.class);
            this.isToDirection = true;
        }
        if (intent != null) {
            context.startActivity(intent);
        }
    }

    public void stopCountDown() {
        Disposable disposable = this.prayTimerSubscribe;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.prayTimerSubscribe.dispose();
        this.prayTimerSubscribe = null;
    }

    public void updateMonthDateList(int i8, boolean z7) {
        this.dates = new ArrayList<>();
        this.dateMonthOffset += i8;
        Calendar startCalendarOfMonth = m.getStartCalendarOfMonth(m.getDateOfOffsetMonth(new Date(), this.dateMonthOffset));
        for (int i9 = 0; i9 < startCalendarOfMonth.getActualMaximum(5); i9++) {
            this.dates.add(m.getDateOfOffsetDay(startCalendarOfMonth.getTime(), i9));
        }
        if (!this.isLocationOpen || com.crrepa.band.my.device.muslim.utils.b.isLocationError()) {
            return;
        }
        updatePrayTime(z7, false);
    }

    public void updatePrayTime(boolean z7, boolean z8) {
        int i8;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < this.dates.size(); i9++) {
            PrayFragment prayFragment = new PrayFragment();
            Bundle bundle = new Bundle();
            Date date = this.dates.get(i9);
            ArrayList<String> prayerTimes = d.getPrayerTimes(date, com.crrepa.band.my.device.muslim.utils.b.latitude, com.crrepa.band.my.device.muslim.utils.b.longitude, com.crrepa.band.my.device.muslim.utils.c.getPrayMethod());
            if (m.isSameDay(date, new Date())) {
                this.todayPagerIndex = i9;
                this.prayTimes = prayerTimes;
                if (i9 > 1) {
                    ((PrayFragment) arrayList.get(i9 - 1)).setTodayPrayTime(d.getPrayDate(this.prayTimes.get(0), date));
                }
                if (z8) {
                    i8 = this.nextPrayTimesIndex;
                    bundle.putStringArrayList(MuslimConst.MUSLIM_PRAY_TIMES, prayerTimes);
                    bundle.putSerializable(MuslimConst.MUSLIM_PRAY_DATE, date);
                    bundle.putInt(MuslimConst.MUSLIM_PRAY_TIME_INDEX, i8);
                    prayFragment.setArguments(bundle);
                    arrayList.add(prayFragment);
                }
            }
            i8 = -1;
            bundle.putStringArrayList(MuslimConst.MUSLIM_PRAY_TIMES, prayerTimes);
            bundle.putSerializable(MuslimConst.MUSLIM_PRAY_DATE, date);
            bundle.putInt(MuslimConst.MUSLIM_PRAY_TIME_INDEX, i8);
            prayFragment.setArguments(bundle);
            arrayList.add(prayFragment);
        }
        this.view.renderPrayPager(arrayList);
        this.view.renderPageIndex(z7 ? this.todayPagerIndex : this.currentPagerIndex);
        getNextPray(z8);
    }
}
