package com.crrepa.band.my.health.ecg;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.WebActivity;
import com.crrepa.band.my.databinding.FragmentEcgStatisticsBinding;
import com.crrepa.band.my.health.base.BaseStatisticsFragment;
import java.util.Date;

/* loaded from: classes2.dex */
public class BandEcgStatisticsFragment extends BaseStatisticsFragment implements m {
    private FragmentEcgStatisticsBinding binding;
    private l bandEcgStatisticsPresenter = new l();
    private m3.e heartRateVariabilitySegmentBarFormat = new m3.e();
    private m3.c fatigueSegmentBarFormat = new m3.c();
    private m3.h mentalStressSegmentBarFormat = new m3.h();
    private m3.f heartStrengthSegmentBarFormat = new m3.f();

    private void initView() {
        this.heartRateVariabilitySegmentBarFormat.createBarView(getContext(), this.binding.includeHrVariability.heartRateVariabilitySliderBar);
        this.fatigueSegmentBarFormat.createBarView(getContext(), this.binding.includeEcgFatigue.fatigueSliderBar);
        this.mentalStressSegmentBarFormat.createBarView(getContext(), this.binding.includeEcgMentalStress.mentalStressSliderBar);
        this.mentalStressSegmentBarFormat.createBarView(getContext(), this.binding.includeEcgHeartLoad.heartLoadSliderBar);
        this.heartStrengthSegmentBarFormat.createBarView(getContext(), this.binding.includeEcgHeartStrength.heartStrengthSliderBar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLazyInitView$0(View view) {
        this.bandEcgStatisticsPresenter.startEcgResultActivity(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLazyInitView$1(View view) {
        startWithPop(BandEcgMeasureFragment.newInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onLazyInitView$2(View view) {
        this.bandEcgStatisticsPresenter.seeEcgDiagnosisResult();
    }

    public static BandEcgStatisticsFragment newInstance(long j8) {
        BandEcgStatisticsFragment bandEcgStatisticsFragment = new BandEcgStatisticsFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("statistics_id", j8);
        bandEcgStatisticsFragment.setArguments(bundle);
        return bandEcgStatisticsFragment;
    }

    private void setStatisticsValue(int i8, TextView textView) {
        textView.setText(i8 <= 0 ? getString(R.string.data_blank) : String.valueOf(i8));
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentEcgStatisticsBinding.inflate(layoutInflater, viewGroup, false);
        this.bandEcgStatisticsPresenter.setView(this);
        return this.binding.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.bandEcgStatisticsPresenter.destroy();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        initView();
        setActivityTitle(R.string.ecg);
        setActivityMenuVisible(true);
        this.bandEcgStatisticsPresenter.getLastTimesEcgMeasureResult(getContext(), getArguments().getLong("statistics_id"));
        this.binding.ecgview.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.ecg.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandEcgStatisticsFragment.this.lambda$onLazyInitView$0(view);
            }
        });
        this.binding.btnEcgMeasure.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.ecg.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandEcgStatisticsFragment.this.lambda$onLazyInitView$1(view);
            }
        });
        this.binding.includeEcgAuxiliary.btnSeeEcgDiagnosis.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.ecg.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandEcgStatisticsFragment.this.lambda$onLazyInitView$2(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.bandEcgStatisticsPresenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.bandEcgStatisticsPresenter.resume();
    }

    @Override // com.crrepa.band.my.health.ecg.m
    public void renderAverageHr(int i8) {
        this.binding.includeEcgAnalysis.tvAverageHeartRate.setText(String.valueOf(i8));
    }

    @Override // com.crrepa.band.my.health.ecg.m
    public void renderEcgAnalysis(String str, String[] strArr) {
        this.binding.includeEcgAnalysis.tvEcgAnalysisValue.setText(str);
        if (strArr == null) {
            return;
        }
        this.binding.includeEcgAnalysis.llFindEcg.setVisibility(0);
        if (strArr.length == 1) {
            this.binding.includeEcgAnalysis.tvFindEcg.setVisibility(0);
            this.binding.includeEcgAnalysis.tvFindEcg.setText(strArr[0]);
            this.binding.includeEcgAnalysis.tvFindEcg.setTextSize(12.0f);
        } else if (4 <= strArr.length) {
            this.binding.includeEcgAnalysis.tvFindEcg.setVisibility(0);
            this.binding.includeEcgAnalysis.tvEcgAnalysisDescription1.setVisibility(0);
            this.binding.includeEcgAnalysis.tvEcgAnalysisDescription2.setVisibility(0);
            this.binding.includeEcgAnalysis.tvEcgAnalysisDescription3.setVisibility(0);
            this.binding.includeEcgAnalysis.tvFindEcg.setText(strArr[0]);
            this.binding.includeEcgAnalysis.tvEcgAnalysisDescription1.setText(strArr[1]);
            this.binding.includeEcgAnalysis.tvEcgAnalysisDescription2.setText(strArr[2]);
            this.binding.includeEcgAnalysis.tvEcgAnalysisDescription3.setText(strArr[3]);
        }
    }

    @Override // com.crrepa.band.my.health.ecg.m
    public void renderEcgAnalysisTextColor(int i8) {
        this.binding.includeEcgAnalysis.tvEcgAnalysisValue.setTextColor(i8);
    }

    @Override // com.crrepa.band.my.health.ecg.m
    public void renderEcgData(int[] iArr, int i8, int i9) {
        this.binding.ecgview.setPerGridCount(i8);
        this.binding.ecgview.setPerGridUvValue(i9);
        this.binding.ecgview.setData(iArr);
    }

    @Override // com.crrepa.band.my.health.ecg.m
    public void renderEcgDiagnosisResult(String str) {
        startActivity(WebActivity.getCallingIntent(getContext(), getString(R.string.ecg_auxiliary_beta), str));
    }

    @Override // com.crrepa.band.my.health.ecg.m
    public void renderFatigue(int i8) {
        this.binding.includeEcgFatigue.llEcgFatigue.setVisibility(0);
        setStatisticsValue(i8, this.binding.includeEcgFatigue.tvFatigueValue);
        this.fatigueSegmentBarFormat.setSlider(this.binding.includeEcgFatigue.fatigueSliderBar, i8);
    }

    @Override // com.crrepa.band.my.health.ecg.m
    public void renderHeartLoad(int i8) {
        this.binding.includeEcgHeartLoad.llEcgHeartLoadView.setVisibility(0);
        setStatisticsValue(i8, this.binding.includeEcgHeartLoad.tvHeartLoadValue);
        this.mentalStressSegmentBarFormat.setSlider(this.binding.includeEcgHeartLoad.heartLoadSliderBar, i8);
    }

    @Override // com.crrepa.band.my.health.ecg.m
    public void renderHeartRateVariabilitValue(int i8) {
        this.binding.includeHrVariability.rlHeartRateVariability.setVisibility(0);
        setStatisticsValue(i8, this.binding.includeHrVariability.tvHeartRateVariabilityValue);
        this.heartRateVariabilitySegmentBarFormat.setSlider(i8);
    }

    @Override // com.crrepa.band.my.health.ecg.m
    public void renderHeartStrength(int i8) {
        this.binding.includeEcgHeartStrength.llEcgHeartStrengthView.setVisibility(0);
        setStatisticsValue(i8, this.binding.includeEcgHeartStrength.tvHeartStrengthValue);
        this.heartStrengthSegmentBarFormat.setSlider(this.binding.includeEcgHeartStrength.heartStrengthSliderBar, i8);
    }

    @Override // com.crrepa.band.my.health.ecg.m
    public void renderMeasureDate(Date date) {
        this.binding.includeEcgAnalysis.tvEcgMeasureDate.setText(com.moyoung.dafit.module.common.utils.m.format(date, com.crrepa.band.my.health.base.j.getSyncTimeFormat(getContext())));
    }

    @Override // com.crrepa.band.my.health.ecg.m
    public void renderMeasureTime(int i8) {
        int i9 = i8 / 60;
        int i10 = i8 % 60;
        StringBuilder sb = new StringBuilder();
        if (i9 > 0) {
            sb.append(i9);
            sb.append("’");
        }
        if (i10 > 0) {
            sb.append(i10);
            sb.append("”");
        }
        sb.append(com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN);
        this.binding.includeEcgAnalysis.tvMeasureTime.setText(sb.toString());
    }

    @Override // com.crrepa.band.my.health.ecg.m
    public void renderMentalStress(int i8) {
        this.binding.includeEcgMentalStress.llEcgMentalStressView.setVisibility(0);
        setStatisticsValue(i8, this.binding.includeEcgMentalStress.tvMentalStressValue);
        this.mentalStressSegmentBarFormat.setSlider(this.binding.includeEcgMentalStress.mentalStressSliderBar, i8);
    }

    @Override // com.crrepa.band.my.health.ecg.m
    public void showEcgDiagnosisView() {
        this.binding.includeEcgAuxiliary.llEcgAuxiliaryContent.setVisibility(0);
    }
}
