package com.crrepa.band.my.health.widgets.chart.marker;

import android.content.Context;
import android.widget.TextView;
import com.crrepa.band.aviator.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.d;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.widgets.chart.marker.BaseMarkerView;
import java.util.Date;

/* loaded from: classes2.dex */
public class MeasureDateMarkerView extends BaseMarkerView {
    private final Date[] dateArray;
    private final String timeFormat;
    TextView tvMarkerContent;

    public MeasureDateMarkerView(Context context, Date[] dateArr, String str, int i8) {
        this(context, dateArr, str);
        setBgColor(i8);
    }

    private String getMeasureTime(int i8) {
        Date date;
        Date[] dateArr = this.dateArray;
        if (dateArr.length > i8 && (date = dateArr[i8]) != null) {
            return m.format(date, this.timeFormat);
        }
        return null;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.d
    public void refreshContent(Entry entry, d dVar) {
        this.tvMarkerContent.setText(getMeasureTime((int) dVar.getX()));
        super.refreshContent(entry, dVar);
    }

    public MeasureDateMarkerView(Context context, Date[] dateArr, String str) {
        super(context, R.layout.text_marker_view);
        this.dateArray = dateArr;
        this.timeFormat = str;
        this.tvMarkerContent = (TextView) findViewById(R.id.tv_marker_content);
    }
}
