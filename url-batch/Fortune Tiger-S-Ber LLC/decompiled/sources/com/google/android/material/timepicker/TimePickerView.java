package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.gglhk.bofio.fortunetiger.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f1452w = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Chip f1453v;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        k kVar = new k(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f1246r.add(new i());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f1453v = chip2;
        clockFaceView.N = new j(this);
        m mVar = new m(new GestureDetector(getContext(), new l(this)));
        chip.setOnTouchListener(mVar);
        chip2.setOnTouchListener(mVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(kVar);
        chip2.setOnClickListener(kVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        if (view == this && i4 == 0) {
            this.f1453v.sendAccessibilityEvent(8);
        }
    }
}
