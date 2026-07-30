package com.crrepa.band.my.device.pillreminder.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$styleable;
import com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MyNumberPicker extends LinearLayout {
    private static final int WHEEL_MODE_FOCUS = 0;
    private static final int WHEEL_MODE_SHOW = 1;
    private static final int WHEEL_TYPE_DEFAULT = 0;
    private static final int WHEEL_TYPE_WATER = 1;
    private LinearLayout llNumberPicker;
    private MyWheelPicker numberWheelPicker;
    private TextView tvNumber;

    public MyNumberPicker(Context context) {
        this(context, null);
    }

    private void hideTimeWheel() {
        this.tvNumber.setText(String.valueOf(getSelectNumber()));
        this.tvNumber.setVisibility(0);
        this.numberWheelPicker.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, boolean z7) {
        if (z7) {
            showTimeWheel();
        } else {
            hideTimeWheel();
        }
    }

    private void showTimeWheel() {
        this.tvNumber.setVisibility(8);
        this.numberWheelPicker.setVisibility(0);
    }

    public int getSelectNumber() {
        return Integer.parseInt(this.numberWheelPicker.getData().get(this.numberWheelPicker.getCurrentItemPosition()).toString());
    }

    public int getSelectedItemPosition() {
        return this.numberWheelPicker.getCurrentItemPosition();
    }

    public void setData(int i8, int i9, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        while (i8 <= i9) {
            arrayList.add(Integer.valueOf(i8));
            i8 += i10;
        }
        this.numberWheelPicker.setData(arrayList);
        this.numberWheelPicker.setSelectedItemPosition(i11);
        this.tvNumber.setText(String.valueOf(arrayList.get(i11)));
    }

    public void setDataString(List<String> list, int i8) {
        this.numberWheelPicker.setData(list);
        this.numberWheelPicker.setSelectedItemPosition(i8);
        this.tvNumber.setText(list.get(i8));
    }

    public void setOnItemSelectedListener(MyWheelPicker.a aVar) {
        this.numberWheelPicker.setOnItemSelectedListener(aVar);
    }

    public void setSelectedItemPosition(int i8) {
        this.numberWheelPicker.setSelectedItemPosition(i8);
    }

    public MyNumberPicker(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyNumberPicker(Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MyNumberPicker);
        int i9 = obtainStyledAttributes.getInt(0, 0);
        int color = obtainStyledAttributes.getColor(4, ContextCompat.getColor(context, R.color.color_my_picker_text));
        int color2 = obtainStyledAttributes.getColor(2, ContextCompat.getColor(context, R.color.color_refresh));
        int i10 = obtainStyledAttributes.getInt(5, 0);
        boolean z7 = obtainStyledAttributes.getBoolean(3, false);
        boolean z8 = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_number_picker, this);
        this.llNumberPicker = (LinearLayout) inflate.findViewById(R.id.ll_number_picker);
        MyWheelPicker myWheelPicker = (MyWheelPicker) inflate.findViewById(R.id.wp_number);
        this.numberWheelPicker = myWheelPicker;
        myWheelPicker.setItemTextColor(color);
        this.numberWheelPicker.setSelectedItemTextColor(color2);
        this.numberWheelPicker.setCyclic(z8);
        if (z7) {
            this.numberWheelPicker.setTypeface(Typeface.DEFAULT_BOLD);
        }
        this.tvNumber = (TextView) inflate.findViewById(R.id.tv_number);
        if (i9 == 1) {
            this.llNumberPicker.setBackgroundResource(i10 == 1 ? R.drawable.shape_water_setting_bg : R.drawable.shape_time_picker_h);
            showTimeWheel();
        } else {
            this.llNumberPicker.setBackgroundResource(i10 == 1 ? R.drawable.selector_water_setting_bg : R.drawable.selector_time_picker);
            this.llNumberPicker.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.crrepa.band.my.device.pillreminder.picker.c
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z9) {
                    MyNumberPicker.this.lambda$new$0(view, z9);
                }
            });
        }
    }

    public void setData(int i8, int i9, int i10, int i11, String str) {
        String valueOf;
        ArrayList arrayList = new ArrayList();
        while (i8 <= i9) {
            if (i8 < 10) {
                valueOf = str + i8;
            } else {
                valueOf = String.valueOf(i8);
            }
            arrayList.add(valueOf);
            i8 += i10;
        }
        setDataString(arrayList, i11);
    }
}
