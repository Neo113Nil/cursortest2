package com.crrepa.band.my.health.weight;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.FragmentWeightHomeBinding;
import com.crrepa.band.my.health.weight.model.WeightConst;
import com.crrepa.band.my.health.widgets.HandleView;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.n;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class WeightHomeFragment extends BaseVBFragment<FragmentWeightHomeBinding> implements j3.b {
    private Disposable disposable;
    private final h3.b presenter = new h3.b();
    private boolean isScroll = false;

    class a implements HandleView.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onCompleted() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onDragChange(int i8, int i9) {
            WeightHomeFragment.this.updateHandleViewPosition(i8, i9);
            WeightHomeFragment.this.showScrollHighlight(i8, i9);
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onStarted() {
        }
    }

    private void completeScroll() {
        this.isScroll = false;
        this.disposable = Observable.interval(2L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.health.weight.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WeightHomeFragment.this.lambda$completeScroll$0((Long) obj);
            }
        });
    }

    private void initChart() {
        ((FragmentWeightHomeBinding) this.binding).weightLineChart.setMaxXLabelCount(this.presenter.getXAxisTextListSize());
        ((FragmentWeightHomeBinding) this.binding).weightLineChart.init(this.presenter.getXAxisTextListSize());
        ((FragmentWeightHomeBinding) this.binding).weightLineChart.setXAxisLineColor(R.color.white);
        ((FragmentWeightHomeBinding) this.binding).weightLineChart.setXAxisLineWidth(1);
        ((FragmentWeightHomeBinding) this.binding).weightLineChart.setXAxisTextColor(R.color.white);
        if (getContext() != null) {
            ((FragmentWeightHomeBinding) this.binding).weightLineChart.setLeftAxis(3);
            ((FragmentWeightHomeBinding) this.binding).weightLineChart.setYAxisGrid(true, ContextCompat.getColor(getContext(), R.color.color_weight_home_chart_y_line), ContextCompat.getColor(getContext(), R.color.color_weight_home_chart_y_text));
        }
        ((FragmentWeightHomeBinding) this.binding).weightLineChart.setAnimate();
    }

    private void initHandleView() {
        ((FragmentWeightHomeBinding) this.binding).hrHandleView.setHandleView(R$drawable.handle_weight);
        ((FragmentWeightHomeBinding) this.binding).hrHandleView.setHandleLine(R$drawable.line_handle_weight);
    }

    private void initListener() {
        ((FragmentWeightHomeBinding) this.binding).hrHandleView.setOnHandleDrawChangeListener(new a());
    }

    private void initView() {
        initHandleView();
        initChart();
        this.presenter.getChartData();
        this.presenter.getAverageData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$completeScroll$0(Long l8) {
        if (!this.isScroll) {
            this.presenter.getAverageData(true);
        }
        stopTimer();
    }

    public static WeightHomeFragment newInstance(int i8, Date date) {
        WeightHomeFragment weightHomeFragment = new WeightHomeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(WeightConst.WEIGHT_TAB_TYPE, i8);
        bundle.putSerializable(WeightConst.WEIGHT_DATE, date);
        weightHomeFragment.setArguments(bundle);
        return weightHomeFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showScrollHighlight(int i8, int i9) {
        int x7;
        com.github.mikephil.charting.highlight.d highlightByTouchPoint = ((FragmentWeightHomeBinding) this.binding).weightLineChart.getHighlightByTouchPoint((i8 + i9) / 2, 1.0f);
        if (highlightByTouchPoint == null || (x7 = (int) highlightByTouchPoint.getX()) == this.presenter.getSelectedPosition() || x7 >= this.presenter.getDateListSize()) {
            return;
        }
        float y7 = highlightByTouchPoint.getY();
        this.presenter.setSelectedPosition(x7);
        this.presenter.setSelectedAverageNum(y7);
        this.presenter.getAverageData(false);
    }

    private void startScroll() {
        this.isScroll = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHandleViewPosition(int i8, int i9) {
        ((FragmentWeightHomeBinding) this.binding).hrHandleView.updatePosition(i8, i9);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    public void initBinding() {
        super.initBinding();
        this.presenter.setView(this, getContext());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        stopTimer();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        if (getArguments() != null) {
            this.presenter.initData(getArguments().getInt(WeightConst.WEIGHT_TAB_TYPE), (Date) getArguments().getSerializable(WeightConst.WEIGHT_DATE));
        }
        initView();
        initListener();
    }

    @Override // j3.b
    public void renderWeightChart(List<Float> list, float f8, float f9, boolean z7) {
        List<String> xAxisTextList = this.presenter.getXAxisTextList();
        ((FragmentWeightHomeBinding) this.binding).weightLineChart.setXAxisValueFormatter(new f5.d(xAxisTextList, this.presenter.getTabType()));
        ((FragmentWeightHomeBinding) this.binding).weightLineChart.setMaxValue(f8);
        ((FragmentWeightHomeBinding) this.binding).weightLineChart.setMinValue(f9);
        ((FragmentWeightHomeBinding) this.binding).weightLineChart.showHideYAxis(z7);
        com.orhanobut.logger.f.d("weight ==> lineChart-XData : " + xAxisTextList);
        com.orhanobut.logger.f.d("weight ==> lineChart-YData : " + list);
        if (getContext() != null) {
            ((FragmentWeightHomeBinding) this.binding).weightLineChart.setWeightData(list, ContextCompat.getColor(getContext(), R.color.white), 1.8f, ContextCompat.getDrawable(getContext(), R.drawable.fade_weight_home_chart), ContextCompat.getColor(getContext(), R.color.color_weight));
        }
    }

    @Override // j3.b
    public void showAverageInfo(float f8, String str) {
        com.orhanobut.logger.f.d("weight ==> lineChart-average : " + f8);
        ((FragmentWeightHomeBinding) this.binding).tvWeightNum.setText(f8 == 0.0f ? getString(R.string.data_blank) : n.formatWeight(f8, 2));
        ((FragmentWeightHomeBinding) this.binding).tvWeightUnit.setText(BandUnitSystemProvider.getUnitSystem() == 0 ? R.string.weight_kg : R.string.weight_lb);
        ((FragmentWeightHomeBinding) this.binding).tvWeightDate.setText(str);
    }

    protected void stopTimer() {
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
            this.disposable = null;
        }
    }
}
