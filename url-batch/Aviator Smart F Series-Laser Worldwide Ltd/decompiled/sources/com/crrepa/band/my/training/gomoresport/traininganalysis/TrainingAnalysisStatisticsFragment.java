package com.crrepa.band.my.training.gomoresport.traininganalysis;

import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.FragmentTrainingAnalysisStatisticsBinding;
import com.crrepa.band.my.health.widgets.HandleView;
import com.crrepa.band.my.model.db.PerformanceInsights;
import com.crrepa.band.my.training.gomoresport.exercisecapacity.ExerciseCapacityStatisticsFragment;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.x0;
import com.moyoung.dafit.module.common.widgets.chart.WeightLineChart;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class TrainingAnalysisStatisticsFragment extends BaseVBFragment<FragmentTrainingAnalysisStatisticsBinding> {
    private List<Float> chartValueList;
    private String dateFormat;
    private String dateFormatOfYear;
    private List<Date> dateList;
    private Date selectedDate;
    private int selectedPosition = -1;
    private int tabType;

    class a implements HandleView.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onCompleted() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onDragChange(int i8, int i9) {
            ((FragmentTrainingAnalysisStatisticsBinding) ((BaseVBFragment) TrainingAnalysisStatisticsFragment.this).binding).handleView.updatePosition(i8, i9);
            TrainingAnalysisStatisticsFragment.this.showScrollHighlight(i8, i9);
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onStarted() {
        }
    }

    private void initChart() {
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.setMaxXLabelCount(com.crrepa.band.my.training.gomoresport.e.getDayCountByTabType(this.tabType, this.selectedDate));
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.init(com.crrepa.band.my.training.gomoresport.e.getDayCountByTabType(this.tabType, this.selectedDate));
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.setXAxisLineColor(R.color.weight_assist_5_number_alpha60);
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.setXAxisLineWidth(1);
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.setXAxisTextColor(R.color.weight_assist_5_number);
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.setLeftAxis(3);
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.setYAxisGrid(true, ContextCompat.getColor(requireContext(), R.color.weight_assist_4_graph_alpha30), ContextCompat.getColor(requireContext(), R.color.weight_assist_5_number_alpha60));
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.setAnimate();
    }

    private void initHandleView() {
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).handleView.setHandleView(R$drawable.handle_training_analysis);
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).handleView.setHandleLine(R$drawable.line_training_analysis);
    }

    private void initListener() {
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).handleView.setOnHandleDrawChangeListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderChartData$0(int i8) {
        if (x0.isEmpty(this.chartValueList) || i8 >= this.chartValueList.size()) {
            return;
        }
        float measuredWidth = ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.getMeasuredWidth() / this.chartValueList.size();
        float f8 = (i8 * measuredWidth) + (measuredWidth / 2.0f);
        int measuredWidth2 = ((FragmentTrainingAnalysisStatisticsBinding) this.binding).handleView.getMeasuredWidth();
        float f9 = measuredWidth2 / 2.0f;
        int i9 = (int) (f8 - f9);
        int i10 = measuredWidth2 / 2;
        int measuredWidth3 = (int) (((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.getMeasuredWidth() - f9);
        if (i9 < i10) {
            i9 = i10;
        } else if (i9 > measuredWidth3) {
            i9 = measuredWidth3;
        }
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).handleView.updatePosition(i9, i9);
    }

    public static TrainingAnalysisStatisticsFragment newInstance(int i8, int i9, Date date) {
        TrainingAnalysisStatisticsFragment trainingAnalysisStatisticsFragment = new TrainingAnalysisStatisticsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("tab_type", i8);
        bundle.putInt("data_type", i9);
        bundle.putSerializable("selected_date", date);
        trainingAnalysisStatisticsFragment.setArguments(bundle);
        return trainingAnalysisStatisticsFragment;
    }

    private void renderHighlightData(int i8, float f8) {
        this.selectedPosition = i8;
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).llHighlightValue.setVisibility(f8 == 0.0f ? 4 : 0);
        if (f8 == 0.0f) {
            return;
        }
        Date date = this.dateList.get(i8);
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).tvHighlightDate.setText(this.tabType == 3 ? m.format(date, this.dateFormatOfYear) : m.format(date, this.dateFormat));
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).tvHighlightValue.setText(String.valueOf(f8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showScrollHighlight(int i8, int i9) {
        com.github.mikephil.charting.highlight.d highlightByTouchPoint = ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.getHighlightByTouchPoint((i8 + i9) / 2, 1.0f);
        if (highlightByTouchPoint == null) {
            return;
        }
        int x7 = (int) highlightByTouchPoint.getX();
        VB vb = this.binding;
        com.crrepa.band.my.training.gomoresport.a.updateTargetViewPosition(i8, i9, ((FragmentTrainingAnalysisStatisticsBinding) vb).llHighlightValue, ((FragmentTrainingAnalysisStatisticsBinding) vb).getRoot());
        if (x7 == this.selectedPosition || x7 >= this.chartValueList.size()) {
            return;
        }
        renderHighlightData(x7, highlightByTouchPoint.getY());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        super.initBinding();
        this.dateFormat = requireContext().getString(R.string.physiological_year_month_day_format);
        this.dateFormatOfYear = requireContext().getString(R.string.physiological_year_month_format);
        initHandleView();
        initListener();
    }

    public void renderChartData(List<PerformanceInsights> list) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.tabType = arguments.getInt("tab_type");
        int i8 = arguments.getInt("data_type");
        Date date = (Date) arguments.getSerializable("selected_date");
        this.selectedDate = date;
        this.dateList = com.crrepa.band.my.training.gomoresport.e.getDateList(this.tabType, date);
        initChart();
        this.chartValueList = com.crrepa.band.my.training.gomoresport.e.getDataVauleList(this.tabType, i8, this.selectedDate, list);
        List<String> xAxisTextList = com.crrepa.band.my.training.gomoresport.e.getXAxisTextList(this.tabType, this.selectedDate);
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.setXAxisValueFormatter(new f5.d(xAxisTextList, this.tabType));
        float floatValue = ((Float) Collections.max(this.chartValueList)).floatValue();
        float floatValue2 = ((Float) Collections.min(this.chartValueList)).floatValue();
        WeightLineChart weightLineChart = ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart;
        if (floatValue == 0.0f) {
            floatValue = 100.0f;
        }
        weightLineChart.setMaxValue(floatValue);
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.setMinValue(floatValue2);
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.showHideYAxis(x0.isNotEmpty(list));
        com.orhanobut.logger.f.d("renderList ==> lineChart-XData : " + xAxisTextList);
        com.orhanobut.logger.f.d("renderList ==> lineChart-YData : " + this.chartValueList);
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.setWeightData(this.chartValueList, ContextCompat.getColor(requireContext(), R.color.weight_assist_4_graph), 1.8f, ContextCompat.getDrawable(requireContext(), R.drawable.fade_physicalt_chart), ContextCompat.getColor(requireContext(), R.color.analysis_bg_4_data));
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.setVisibility(0);
        final int findSelectedDateIndex = ExerciseCapacityStatisticsFragment.findSelectedDateIndex(this.selectedDate, this.dateList, this.tabType);
        if (findSelectedDateIndex < 0 || findSelectedDateIndex >= this.chartValueList.size()) {
            return;
        }
        renderHighlightData(findSelectedDateIndex, this.chartValueList.get(findSelectedDateIndex).floatValue());
        ((FragmentTrainingAnalysisStatisticsBinding) this.binding).chart.post(new Runnable() { // from class: com.crrepa.band.my.training.gomoresport.traininganalysis.l
            @Override // java.lang.Runnable
            public final void run() {
                TrainingAnalysisStatisticsFragment.this.lambda$renderChartData$0(findSelectedDateIndex);
            }
        });
    }
}
