package com.crrepa.band.my.health.physiologicalcycle;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentPhysiologicalGuideSettingBinding;
import com.crrepa.band.my.health.widgets.dialog.f;
import com.crrepa.band.my.health.widgets.dialog.v;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class PhysiologicalGuideSettingFragment extends BaseVBFragment<FragmentPhysiologicalGuideSettingBinding> implements x2.b {
    boolean isFinish;
    private final com.crrepa.band.my.health.physiologicalcycle.presenter.e presenter = new com.crrepa.band.my.health.physiologicalcycle.presenter.e();

    class a implements v.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.dialog.v.a
        public void onClick(int i8) {
            PhysiologicalGuideSettingFragment.this.savePhysiologicalCycle(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        this.presenter.selectPhysiologicalCycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        this.presenter.selectMenstrualPeriod();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$2(View view) {
        this.presenter.selectLastMenstrualDate();
    }

    public static PhysiologicalGuideSettingFragment newInstance() {
        return new PhysiologicalGuideSettingFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: saveLastMenstrualDate, reason: merged with bridge method [inline-methods] */
    public void lambda$renderSelectedLastMenstrualDate$3(Date date) {
        this.presenter.saveLastMenstrualDate(date);
        boolean isSelectFinish = this.presenter.isSelectFinish();
        this.isFinish = isSelectFinish;
        sendFinishEvent(isSelectFinish);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveMenstrualPeriod(int i8) {
        this.presenter.saveMenstrualPeriod(i8);
        boolean isSelectFinish = this.presenter.isSelectFinish();
        this.isFinish = isSelectFinish;
        sendFinishEvent(isSelectFinish);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void savePhysiologicalCycle(int i8) {
        this.presenter.savePhysiologicalPeriod(i8);
        boolean isSelectFinish = this.presenter.isSelectFinish();
        this.isFinish = isSelectFinish;
        sendFinishEvent(isSelectFinish);
    }

    private void sendFinishEvent(boolean z7) {
        if (z7) {
            org.greenrobot.eventbus.c.getDefault().post(new v2.a(true));
        }
    }

    private void showPeriodDialog(List<Integer> list, int i8, v.a aVar) {
        new v(requireContext()).setPeriodList(list).setSelectedPosition(i8).setOnDoneClickListener(aVar).show();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    @Nullable
    public void initBinding() {
        this.presenter.setView(this);
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((FragmentPhysiologicalGuideSettingBinding) this.binding).llPhysiologicalCycle.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.physiologicalcycle.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhysiologicalGuideSettingFragment.this.lambda$initOnClickListener$0(view);
            }
        });
        ((FragmentPhysiologicalGuideSettingBinding) this.binding).llPhysiologicalMenstrual.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.physiologicalcycle.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhysiologicalGuideSettingFragment.this.lambda$initOnClickListener$1(view);
            }
        });
        ((FragmentPhysiologicalGuideSettingBinding) this.binding).llPhysiologicalLast.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.physiologicalcycle.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhysiologicalGuideSettingFragment.this.lambda$initOnClickListener$2(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onToCalender(v2.c cVar) {
        if (this.isFinish) {
            this.presenter.savePhysiologicalPeriod();
            this.presenter.sendPhysiologicalPeriod();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.presenter.showPhysiologicalPeriodData();
    }

    @Override // x2.b
    public void renderLastMenstrualDate(Date date) {
        ((FragmentPhysiologicalGuideSettingBinding) this.binding).tvPhysiologicalLastDays.setText(com.moyoung.dafit.module.common.utils.m.format(date, getString(R.string.physiological_year_month_day_format)));
    }

    @Override // x2.b
    public void renderMenstrualPeriod(String str) {
        ((FragmentPhysiologicalGuideSettingBinding) this.binding).tvPhysiologicalMenstrualDays.setText(str + cn.hutool.core.text.l.SPACE + getString(R.string.physiological_day));
    }

    @Override // x2.b
    public void renderPhysiologicalCycle(String str) {
        ((FragmentPhysiologicalGuideSettingBinding) this.binding).tvPhysiologicalCycleDays.setText(str + cn.hutool.core.text.l.SPACE + getString(R.string.physiological_day));
    }

    @Override // x2.b
    public void renderSelectedLastMenstrualDate(Date date) {
        new com.crrepa.band.my.health.widgets.dialog.f(requireContext()).setSelectedDate(date).setOnDoneClickListener(new f.b() { // from class: com.crrepa.band.my.health.physiologicalcycle.n
            @Override // com.crrepa.band.my.health.widgets.dialog.f.b
            public final void onDoneClick(Date date2) {
                PhysiologicalGuideSettingFragment.this.lambda$renderSelectedLastMenstrualDate$3(date2);
            }
        }).show();
    }

    @Override // x2.b
    public void renderSelectedMenstrualPeriod(List<Integer> list, int i8) {
        showPeriodDialog(list, i8, new v.a() { // from class: com.crrepa.band.my.health.physiologicalcycle.o
            @Override // com.crrepa.band.my.health.widgets.dialog.v.a
            public final void onClick(int i9) {
                PhysiologicalGuideSettingFragment.this.saveMenstrualPeriod(i9);
            }
        });
    }

    @Override // x2.b
    public void renderSelectedPhysiologicalCycle(List<Integer> list, int i8) {
        showPeriodDialog(list, i8, new a());
    }
}
