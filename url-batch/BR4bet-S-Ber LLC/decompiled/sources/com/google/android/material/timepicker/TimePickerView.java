package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.moontiko.really.admiralcasino.R;
import defpackage.ot;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int w = 0;
    public final Chip v;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        f fVar = new f();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.r.add(new d());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.v = chip2;
        clockFaceView.N = new e(this);
        ot otVar = new ot(1, new GestureDetector(getContext(), new g()));
        chip.setOnTouchListener(otVar);
        chip2.setOnTouchListener(otVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(fVar);
        chip2.setOnClickListener(fVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.v.sendAccessibilityEvent(8);
        }
    }
}
