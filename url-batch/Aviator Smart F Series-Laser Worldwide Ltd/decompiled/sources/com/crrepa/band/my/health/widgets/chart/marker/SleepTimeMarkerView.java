package com.crrepa.band.my.health.widgets.chart.marker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;
import com.crrepa.band.aviator.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.d;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.widgets.chart.marker.BaseMarkerView;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class SleepTimeMarkerView extends BaseMarkerView {
    TextView tvMarkerContent;

    public SleepTimeMarkerView(Context context, int i8) {
        super(context, R.layout.text_marker_view);
        this.tvMarkerContent = (TextView) findViewById(R.id.tv_marker_content);
        setBgColor(i8);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.d
    public void refreshContent(Entry entry, d dVar) {
        String str;
        int y7 = (int) dVar.getY();
        if (y7 > 0) {
            str = (y7 / 60) + getContext().getString(R.string.hour) + n.format(y7 % 60, n.TWO_INTEGERS_PATTERN) + getContext().getString(R.string.minute);
        } else {
            str = null;
        }
        this.tvMarkerContent.setText(str);
        super.refreshContent(entry, dVar);
    }
}
