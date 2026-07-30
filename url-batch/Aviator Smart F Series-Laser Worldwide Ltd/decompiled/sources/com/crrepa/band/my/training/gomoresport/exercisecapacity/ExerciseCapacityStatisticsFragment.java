package com.crrepa.band.my.training.gomoresport.exercisecapacity;

import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.FragmentExerciseCapacityStatisticsBinding;
import com.crrepa.band.my.health.widgets.HandleView;
import com.crrepa.band.my.model.db.PerformanceInsights;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.x0;
import com.moyoung.dafit.module.common.widgets.chart.WeightLineChart;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class ExerciseCapacityStatisticsFragment extends BaseVBFragment<FragmentExerciseCapacityStatisticsBinding> {
    private List<Float> chartValueList;
    private int dataType;
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
            ((FragmentExerciseCapacityStatisticsBinding) ((BaseVBFragment) ExerciseCapacityStatisticsFragment.this).binding).handleView.updatePosition(i8, i9);
            ExerciseCapacityStatisticsFragment.this.showScrollHighlight(i8, i9);
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onStarted() {
        }
    }

    public static int findSelectedDateIndex(Date date, List<Date> list, int i8) {
        if (date != null && !x0.isEmpty(list)) {
            for (int i9 = 0; i9 < list.size(); i9++) {
                if (isSameDate(list.get(i9), date, i8)) {
                    return i9;
                }
            }
        }
        return 0;
    }

    private void initChart() {
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.setMaxXLabelCount(com.crrepa.band.my.training.gomoresport.e.getDayCountByTabType(this.tabType, this.selectedDate));
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.init(com.crrepa.band.my.training.gomoresport.e.getDayCountByTabType(this.tabType, this.selectedDate));
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.setXAxisLineColor(R.color.physicalt_assist_4_graph_alpha60);
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.setXAxisLineWidth(1);
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.setXAxisTextColor(R.color.physicalt_assist_5_number);
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.setLeftAxis(3);
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.setYAxisGrid(true, ContextCompat.getColor(requireContext(), R.color.physicalt_assist_4_graph_alpha30), ContextCompat.getColor(requireContext(), R.color.weight_assist_5_number_alpha60));
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.setAnimate();
    }

    private void initHandleView() {
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).handleView.setHandleView(R$drawable.handle_physical_ability);
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).handleView.setHandleLine(R$drawable.line_physical_ability);
    }

    private void initListener() {
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).handleView.setOnHandleDrawChangeListener(new a());
    }

    private static boolean isSameDate(Date date, Date date2, int i8) {
        if (date == null || date2 == null) {
            return false;
        }
        return i8 == 3 ? com.moyoung.dafit.module.common.utils.m.isSameMonth(date, date2) : com.moyoung.dafit.module.common.utils.m.isSameDay(date, date2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderChartData$0(int i8) {
        if (x0.isEmpty(this.chartValueList) || i8 >= this.chartValueList.size()) {
            return;
        }
        float measuredWidth = ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.getMeasuredWidth() / this.chartValueList.size();
        float f8 = (i8 * measuredWidth) + (measuredWidth / 2.0f);
        int measuredWidth2 = ((FragmentExerciseCapacityStatisticsBinding) this.binding).handleView.getMeasuredWidth();
        float f9 = measuredWidth2 / 2.0f;
        int i9 = (int) (f8 - f9);
        int i10 = measuredWidth2 / 2;
        int measuredWidth3 = (int) (((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.getMeasuredWidth() - f9);
        if (i9 < i10) {
            i9 = i10;
        } else if (i9 > measuredWidth3) {
            i9 = measuredWidth3;
        }
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).handleView.updatePosition(i9, i9);
    }

    public static ExerciseCapacityStatisticsFragment newInstance(int i8, int i9, Date date) {
        ExerciseCapacityStatisticsFragment exerciseCapacityStatisticsFragment = new ExerciseCapacityStatisticsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("tab_type", i8);
        bundle.putInt("data_type", i9);
        bundle.putSerializable("selected_date", date);
        exerciseCapacityStatisticsFragment.setArguments(bundle);
        return exerciseCapacityStatisticsFragment;
    }

    private void renderHighlightData(int i8, float f8) {
        this.selectedPosition = i8;
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).llHighlightValue.setVisibility(f8 == 0.0f ? 4 : 0);
        if (f8 == 0.0f) {
            return;
        }
        Date date = this.dateList.get(i8);
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).tvHighlightDate.setText(this.tabType == 3 ? com.moyoung.dafit.module.common.utils.m.format(date, this.dateFormatOfYear) : com.moyoung.dafit.module.common.utils.m.format(date, this.dateFormat));
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).tvHighlightValue.setText(this.dataType == 2 ? com.crrepa.band.my.training.gomoresport.e.secondSpeedToPace(f8) : String.valueOf(f8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showScrollHighlight(int i8, int i9) {
        com.github.mikephil.charting.highlight.d highlightByTouchPoint = ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.getHighlightByTouchPoint((i8 + i9) / 2, 1.0f);
        if (highlightByTouchPoint == null) {
            return;
        }
        int x7 = (int) highlightByTouchPoint.getX();
        VB vb = this.binding;
        com.crrepa.band.my.training.gomoresport.a.updateTargetViewPosition(i8, i9, ((FragmentExerciseCapacityStatisticsBinding) vb).llHighlightValue, ((FragmentExerciseCapacityStatisticsBinding) vb).getRoot());
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
        this.dataType = arguments.getInt("data_type");
        Date date = (Date) arguments.getSerializable("selected_date");
        this.selectedDate = date;
        this.dateList = com.crrepa.band.my.training.gomoresport.e.getDateList(this.tabType, date);
        initChart();
        this.chartValueList = com.crrepa.band.my.training.gomoresport.e.getDataVauleList(this.tabType, this.dataType, this.selectedDate, list);
        List<String> xAxisTextList = com.crrepa.band.my.training.gomoresport.e.getXAxisTextList(this.tabType, this.selectedDate);
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.setXAxisValueFormatter(new f5.d(xAxisTextList, this.tabType));
        float floatValue = ((Float) Collections.max(this.chartValueList)).floatValue();
        float floatValue2 = ((Float) Collections.min(this.chartValueList)).floatValue();
        WeightLineChart weightLineChart = ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart;
        if (floatValue == 0.0f) {
            floatValue = 100.0f;
        }
        weightLineChart.setMaxValue(floatValue);
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.setMinValue(floatValue2);
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.showHideYAxis(x0.isNotEmpty(list));
        com.orhanobut.logger.f.d("renderList ==> lineChart-XData : " + xAxisTextList);
        com.orhanobut.logger.f.d("renderList ==> lineChart-YData : " + this.chartValueList);
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.setWeightData(this.chartValueList, ContextCompat.getColor(requireContext(), R.color.physicalt_assist_4_graph), 1.8f, ContextCompat.getDrawable(requireContext(), R.drawable.fade_physicalt_chart), ContextCompat.getColor(requireContext(), R.color.physicalt_bg_4_data));
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.setVisibility(0);
        final int findSelectedDateIndex = findSelectedDateIndex(this.selectedDate, this.dateList, this.tabType);
        if (findSelectedDateIndex < 0 || findSelectedDateIndex >= this.chartValueList.size()) {
            return;
        }
        renderHighlightData(findSelectedDateIndex, this.chartValueList.get(findSelectedDateIndex).floatValue());
        ((FragmentExerciseCapacityStatisticsBinding) this.binding).chart.post(new Runnable() { // from class: com.crrepa.band.my.training.gomoresport.exercisecapacity.n
            @Override // java.lang.Runnable
            public final void run() {
                ExerciseCapacityStatisticsFragment.this.lambda$renderChartData$0(findSelectedDateIndex);
            }
        });
    }
}
