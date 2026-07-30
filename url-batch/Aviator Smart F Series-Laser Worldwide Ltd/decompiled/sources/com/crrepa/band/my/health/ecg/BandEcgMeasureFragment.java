package com.crrepa.band.my.health.ecg;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.FragmentMeasureEcgBinding;
import com.crrepa.band.my.health.base.BaseStatisticsFragment;
import com.crrepa.band.my.health.ecg.ecgbreatheanim.EcgBreatheAnimView;
import com.moyoung.dafit.module.common.utils.r0;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes2.dex */
public class BandEcgMeasureFragment extends BaseStatisticsFragment implements e {
    private FragmentMeasureEcgBinding binding;
    private d bandEcgMeasurePresenter = new d();
    private b animatiorListener = new b(this);

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Integer num) {
            if (BandEcgMeasureFragment.this.binding != null) {
                BandEcgMeasureFragment.this.binding.tvEcgMeasureTitle.setText(num.intValue());
            }
        }
    }

    private static class b implements EcgBreatheAnimView.b {
        private WeakReference<BandEcgMeasureFragment> weakReference;

        public b(BandEcgMeasureFragment bandEcgMeasureFragment) {
            this.weakReference = new WeakReference<>(bandEcgMeasureFragment);
        }

        @Override // com.crrepa.band.my.health.ecg.ecgbreatheanim.EcgBreatheAnimView.b
        public void onBreathChanged(boolean z7) {
            int i8 = z7 ? R.string.inhale : R.string.expiration;
            BandEcgMeasureFragment bandEcgMeasureFragment = this.weakReference.get();
            if (bandEcgMeasureFragment != null) {
                bandEcgMeasureFragment.renderBreathRhythm(i8);
            }
        }
    }

    public static BandEcgMeasureFragment newInstance() {
        return new BandEcgMeasureFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderBreathRhythm(int i8) {
        Observable.just(Integer.valueOf(i8)).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }

    private void setBreathAnimatorListener() {
        this.binding.ecgBreatheView.setAnimatorListener(this.animatiorListener);
    }

    private void showMeasureStep() {
        this.bandEcgMeasurePresenter.startMeasureEcg(getContext());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentMeasureEcgBinding.inflate(layoutInflater, viewGroup, false);
        this.bandEcgMeasurePresenter.setView(this);
        return this.binding.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding.ecgMeasureView.release();
        this.bandEcgMeasurePresenter.destroy();
        this.binding = null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        setActivityTitle(R.string.ecg_measure);
        setActivityMenuVisible(false);
        setBreathAnimatorListener();
        showMeasureStep();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.bandEcgMeasurePresenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.bandEcgMeasurePresenter.resume();
    }

    @Override // com.crrepa.band.my.health.ecg.e
    public void renderConnectBandView() {
        this.binding.tvEcgMeasureTitle.setText(R.string.connect_band);
        this.binding.tvEcgMeasureTip.setText(R.string.wear_band_tip);
        this.binding.ivEcgMeasure.setBackgroundResource(R$drawable.img_ecg_test_0);
        this.binding.ecgMeasureProgressbar.setVisibility(0);
        this.binding.ecgBreatheView.stop();
        this.binding.ecgBreatheView.setVisibility(8);
    }

    @Override // com.crrepa.band.my.health.ecg.e
    public void renderEcgAnalysisView() {
        this.binding.ecgMeasureProgressbar.setVisibility(0);
        this.binding.tvEcgMeasureTitle.setText(R.string.analysing);
        this.binding.tvEcgMeasureTip.setVisibility(8);
        this.binding.ecgBreatheView.stop();
        this.binding.ecgBreatheView.setVisibility(8);
        this.binding.ecgMeasureView.stopDraw();
    }

    @Override // com.crrepa.band.my.health.ecg.e
    public void renderEcgMeasureData(List<Integer> list) {
        this.binding.ecgMeasureView.addEcgData(list);
    }

    @Override // com.crrepa.band.my.health.ecg.e
    public void renderEcgMeasureView() {
        this.binding.tvEcgMeasureTip.setText(R.string.inhale_tip);
        this.binding.ivEcgMeasure.setVisibility(8);
        this.binding.ecgMeasureProgressbar.setVisibility(8);
        this.binding.ecgMeasureView.startDraw();
        this.binding.ecgBreatheView.setVisibility(0);
        this.binding.ecgBreatheView.show();
    }

    @Override // com.crrepa.band.my.health.ecg.e
    public void renderEcgStatisticsView(long j8) {
        startWithPop(BandEcgStatisticsFragment.newInstance(j8));
    }

    @Override // com.crrepa.band.my.health.ecg.e
    public void renderHeartRate(String str) {
        this.binding.tvHeartRate.setText(getString(R.string.ecg_heart_rate) + str + getString(R.string.heart_rate_unit));
    }

    @Override // com.crrepa.band.my.health.ecg.e
    public void renderMeasureFail() {
        r0.showLong(getContext(), getString(R.string.ecg_measure_fail));
        getActivity().finish();
    }

    @Override // com.crrepa.band.my.health.ecg.e
    public void renderPrepareMeasureView() {
        this.binding.tvEcgMeasureTitle.setText(R.string.ecg_prepare_measure);
    }

    @Override // com.crrepa.band.my.health.ecg.e
    public void renderPressElectrodeView() {
        this.binding.tvEcgMeasureTitle.setText(R.string.press_electrode);
        this.binding.tvEcgMeasureTip.setText(R.string.press_electrode_tip);
        this.binding.ivEcgMeasure.setBackgroundResource(R$drawable.img_ecg_test_1);
        this.binding.ecgBreatheView.stop();
        this.binding.ecgBreatheView.setVisibility(8);
    }
}
