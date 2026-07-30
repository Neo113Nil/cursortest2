package com.crrepa.band.my.health.widgets;

import android.content.Context;
import android.widget.TextView;
import com.crrepa.band.aviator.R;
import com.github.mikephil.charting.data.Entry;
import com.moyoung.dafit.module.common.widgets.chart.marker.BaseMarkerView;

/* loaded from: classes2.dex */
public class HeartRateMarkerView extends BaseMarkerView {
    private int startTime;
    private int timeInterval;
    TextView tvHeartRate;

    public HeartRateMarkerView(Context context, int i8, int i9) {
        super(context, R.layout.text_marker_view);
        this.tvHeartRate = (TextView) findViewById(R.id.tv_marker_content);
        this.startTime = i8;
        this.timeInterval = i9;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.d
    public void refreshContent(Entry entry, com.github.mikephil.charting.highlight.d dVar) {
        int x7 = this.startTime + (((int) dVar.getX()) * this.timeInterval);
        String formatTemp = com.moyoung.dafit.module.common.utils.n.formatTemp(dVar.getY());
        com.orhanobut.logger.f.d("heartRate: " + formatTemp);
        this.tvHeartRate.setText(m3.a.formatPeriodTime(getContext(), x7 / 60, x7 % 60) + " - " + formatTemp);
        super.refreshContent(entry, dVar);
    }
}
