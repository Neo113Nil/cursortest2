package com.crrepa.band.my.health.pressure.presenter;

import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.pressure.BaseStressStatisticsFragment;
import com.crrepa.band.my.health.pressure.StressDayStatisticsFragment;
import com.crrepa.band.my.health.pressure.StressMonthStaisticsFragment;
import com.crrepa.band.my.health.pressure.StressWeekStatisticsFragment;
import com.crrepa.band.my.health.pressure.model.BandStressChangeEvent;
import com.crrepa.band.my.model.db.Stress;
import com.crrepa.band.my.model.db.TimingStress;
import com.crrepa.band.my.model.db.proxy.StressDaoProxy;
import com.crrepa.band.my.model.db.proxy.TimingStressDaoProxy;
import com.moyoung.dafit.module.common.utils.s;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class a implements com.moyoung.dafit.module.common.baseui.f {
    public static final int STRESS_MEDIUM_VALUE = 80;
    public static final int STRESS_NORMAL_VALUE = 60;
    public static final int STRESS_RELAXED_VALUE = 30;
    private StressDaoProxy stressDaoProxy = new StressDaoProxy();
    private y2.a view;

    public a() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    private int getStressPercent(int[] iArr, int i8) {
        int i9 = 0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (i10 < i8) {
                i9 += iArr[i10];
            }
        }
        return i9;
    }

    private void showLast7TimesStress(Date date) {
        if (date == null) {
            date = new Date();
        }
        List<Stress> historyList = this.stressDaoProxy.getHistoryList(date, 7);
        if (historyList == null || historyList.isEmpty()) {
            return;
        }
        float[] fArr = new float[7];
        Date[] dateArr = new Date[7];
        for (int i8 = 0; i8 < historyList.size(); i8++) {
            int i9 = 6 - i8;
            Stress stress = historyList.get(i8);
            fArr[i9] = stress.getStress().intValue();
            dateArr[i9] = stress.getDate();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 7; i10++) {
            arrayList.add(Float.valueOf(fArr[i10]));
        }
        this.view.renderLast7TimesStress(arrayList, dateArr);
    }

    private void showStressPercent(List<Integer> list) {
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (Integer num : list) {
            if (num.intValue() > 0) {
                if (num.intValue() < 30) {
                    i8++;
                } else if (num.intValue() < 60) {
                    i9++;
                } else if (num.intValue() < 80) {
                    i10++;
                } else {
                    i11++;
                }
            }
        }
        int i12 = i8 + i9 + i10 + i11;
        if (i12 > 0) {
            int[] iArr = {(i8 * 100) / i12, (i9 * 100) / i12, (i10 * 100) / i12, (i11 * 100) / i12};
            int i13 = 3;
            while (true) {
                if (i13 < 0) {
                    break;
                }
                if (iArr[i13] > 0) {
                    iArr[i13] = 100 - getStressPercent(iArr, i13);
                    break;
                }
                i13--;
            }
            this.view.renderStressPercent(iArr, new int[]{ContextCompat.getColor(com.moyoung.dafit.module.common.utils.d.get(), R.color.color_stress_relaxed), ContextCompat.getColor(com.moyoung.dafit.module.common.utils.d.get(), R.color.color_stress_normal), ContextCompat.getColor(com.moyoung.dafit.module.common.utils.d.get(), R.color.color_stress_medium), ContextCompat.getColor(com.moyoung.dafit.module.common.utils.d.get(), R.color.color_stress_stressed)});
        }
    }

    private void showTimingStress(TimingStress timingStress) {
        List<Integer> arrayList = new ArrayList<>();
        if (timingStress != null) {
            List<Integer> json2List = s.json2List(timingStress.getStress(), Integer[].class);
            if (json2List != null && !json2List.isEmpty()) {
                arrayList = json2List;
            }
            showStressPercent(arrayList);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    public void getStressDetail(Date date, long j8) {
        if (date == null && j8 == -1) {
            return;
        }
        Stress lastStress = j8 == -1 ? this.stressDaoProxy.getLastStress(date) : this.stressDaoProxy.get(j8);
        if (date == null) {
            date = lastStress.getDate();
        }
        if (date == null) {
            date = new Date();
        }
        showStatisticsFragment(date);
        this.view.renderStress(lastStress);
        showTimingStress(new TimingStressDaoProxy().get(date));
        showLast7TimesStress(date);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandStressChangeEvent(BandStressChangeEvent bandStressChangeEvent) {
        this.view.renderMeasureComplete();
        Stress stress = bandStressChangeEvent.getStress();
        if (stress != null) {
            this.view.renderStress(stress);
        }
        showLast7TimesStress(new Date());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(y2.a aVar) {
        this.view = aVar;
    }

    public void showStatisticsFragment(Date date) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(StressDayStatisticsFragment.newInstance(date));
        arrayList.add(BaseStressStatisticsFragment.getInstance(new StressWeekStatisticsFragment(), date));
        arrayList.add(BaseStressStatisticsFragment.getInstance(new StressMonthStaisticsFragment(), date));
        this.view.renderStatisticsFragment(arrayList);
    }
}
