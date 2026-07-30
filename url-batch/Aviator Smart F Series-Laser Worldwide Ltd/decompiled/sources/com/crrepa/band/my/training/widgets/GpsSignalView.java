package com.crrepa.band.my.training.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.crrepa.band.aviator.R;

/* loaded from: classes3.dex */
public class GpsSignalView extends LinearLayout {
    private static final float SIGNAL_LEVEL_1 = 100.0f;
    public static final float SIGNAL_LEVEL_2 = 20.0f;
    private static final float SIGNAL_LEVEL_3 = 10.0f;
    private static final float SIGNAL_LEVEL_4 = 5.0f;
    private int previousSignalLevel;
    private View[] signalLevelArray;

    public GpsSignalView(Context context) {
        this(context, null);
    }

    public void setLocationAccuracy(float f8) {
        int i8 = 100.0f <= f8 ? 1 : 20.0f <= f8 ? 2 : 10.0f < f8 ? 3 : 5.0f < f8 ? 4 : 5;
        if (this.previousSignalLevel == i8) {
            return;
        }
        this.previousSignalLevel = i8;
        int i9 = i8 == 1 ? R.drawable.shape_gps_signal_poor : i8 == 2 ? R.drawable.shape_gps_signal_medium : R.drawable.shape_gps_signal_good;
        int i10 = 0;
        while (true) {
            View[] viewArr = this.signalLevelArray;
            if (i10 >= viewArr.length) {
                return;
            }
            if (i10 < i8) {
                viewArr[i10].setBackgroundResource(i9);
            } else {
                viewArr[i10].setBackgroundResource(R.drawable.shape_gps_signal_null);
            }
            i10++;
        }
    }

    public GpsSignalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GpsSignalView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.previousSignalLevel = -1;
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.view_gps_signal, this);
        this.signalLevelArray = new View[]{inflate.findViewById(R.id.view_gps_signal_1), inflate.findViewById(R.id.view_gps_signal_2), inflate.findViewById(R.id.view_gps_signal_3), inflate.findViewById(R.id.view_gps_signal_4), inflate.findViewById(R.id.view_gps_signal_5)};
    }
}
