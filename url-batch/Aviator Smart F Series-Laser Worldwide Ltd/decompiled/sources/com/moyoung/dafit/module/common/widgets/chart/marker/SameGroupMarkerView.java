package com.moyoung.dafit.module.common.widgets.chart.marker;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.utils.e;
import com.moyoung.dafit.module.common.R$id;
import com.moyoung.dafit.module.common.R$layout;
import com.moyoung.dafit.module.common.utils.o;

/* loaded from: classes4.dex */
public class SameGroupMarkerView extends MarkerView {
    private static final int LINE_OFFSET_DP = 56;
    ImageView ivMarkerType;
    ImageView markerVerticalLine;

    public SameGroupMarkerView(Context context, int i8, int i9, int i10) {
        super(context, R$layout.marker_step_same_group);
        this.ivMarkerType = (ImageView) findViewById(R$id.iv_marker_type);
        this.markerVerticalLine = (ImageView) findViewById(R$id.marker_vertical_line);
        this.ivMarkerType.setImageResource(i8);
        this.markerVerticalLine.setBackgroundResource(i9);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.markerVerticalLine.getLayoutParams();
        layoutParams.height = i10 - o.dp2px(context, 56.0f);
        this.markerVerticalLine.setLayoutParams(layoutParams);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.d
    public e getOffset() {
        return new e(-(getWidth() / 2), getHeight() * (-20));
    }
}
