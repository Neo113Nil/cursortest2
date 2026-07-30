package com.crrepa.band.my.health.widgets.chart.marker;

import android.content.Context;
import android.widget.TextView;
import com.crrepa.band.aviator.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.d;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.widgets.chart.marker.BaseMarkerView;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes2.dex */
public class TrainingHeartRateMarkView extends BaseMarkerView {
    private final Calendar calendar;
    private final String dateFormat;
    private final Date startDate;
    private final int timeInterval;
    TextView tvHeartRate;

    public TrainingHeartRateMarkView(Context context, Date date, int i8, String str) {
        super(context, R.layout.text_marker_view);
        this.calendar = k.getCalendar();
        this.tvHeartRate = (TextView) findViewById(R.id.tv_marker_content);
        this.startDate = date;
        this.timeInterval = i8;
        this.dateFormat = str;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.d
    public void refreshContent(Entry entry, d dVar) {
        this.calendar.setTime(this.startDate);
        this.calendar.add(13, ((int) dVar.getX()) * this.timeInterval);
        this.tvHeartRate.setText(m.format(this.calendar.getTime(), this.dateFormat) + " - " + n.formatTemp(dVar.getY()));
        super.refreshContent(entry, dVar);
    }
}
