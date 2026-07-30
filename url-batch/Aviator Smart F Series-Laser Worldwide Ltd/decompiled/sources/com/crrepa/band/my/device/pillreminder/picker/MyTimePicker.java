package com.crrepa.band.my.device.pillreminder.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker;
import com.moyoung.dafit.module.common.utils.n;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MyTimePicker extends LinearLayout {
    private static final int MAX_HOUR_12 = 12;
    private static final int MAX_HOUR_24 = 24;
    private static final int MAX_MINUTES = 60;
    private MyWheelPicker hourWheelPicker;
    private LinearLayout llTimePicker;
    private MyWheelPicker minuteWheelPicker;
    private d onTimeSelectedListener;
    private TextView tvColon;
    private TextView tvTimeHour;
    private TextView tvTimeMinute;
    private boolean wheelIdle;

    class a implements View.OnFocusChangeListener {
        a() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z7) {
            if (z7) {
                MyTimePicker.this.showTimeWheel();
            } else {
                MyTimePicker.this.hideTimeWheel();
            }
        }
    }

    class b implements MyWheelPicker.b {
        b() {
        }

        @Override // com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker.b
        public void onWheelScrollStateChanged(int i8) {
            MyTimePicker myTimePicker = MyTimePicker.this;
            myTimePicker.updateTimeWheelState(myTimePicker.minuteWheelPicker, MyTimePicker.this.tvTimeMinute, i8 == 0);
        }

        @Override // com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker.b
        public void onWheelScrolled(int i8) {
        }

        @Override // com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker.b
        public void onWheelSelected(int i8) {
        }
    }

    class c implements MyWheelPicker.b {
        c() {
        }

        @Override // com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker.b
        public void onWheelScrollStateChanged(int i8) {
            MyTimePicker myTimePicker = MyTimePicker.this;
            myTimePicker.updateTimeWheelState(myTimePicker.hourWheelPicker, MyTimePicker.this.tvTimeHour, i8 == 0);
        }

        @Override // com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker.b
        public void onWheelScrolled(int i8) {
        }

        @Override // com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker.b
        public void onWheelSelected(int i8) {
        }
    }

    public interface d {
        void onItemSelected(MyTimePicker myTimePicker, int i8, int i9);
    }

    public MyTimePicker(Context context) {
        this(context, null);
    }

    private List<String> getTimeList(int i8) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < i8; i9++) {
            arrayList.add(n.format(i9, n.TWO_INTEGERS_PATTERN));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideTimeWheel() {
        setTimeText(getSelectHour(), this.minuteWheelPicker.getCurrentItemPosition());
        this.tvColon.setTextColor(ContextCompat.getColor(getContext(), R.color.black));
        this.hourWheelPicker.setVisibility(8);
        this.minuteWheelPicker.setVisibility(8);
    }

    private void setTimeText(int i8, int i9) {
        this.tvTimeHour.setVisibility(0);
        this.tvTimeMinute.setVisibility(0);
        this.tvTimeHour.setText(n.format(i8, n.TWO_INTEGERS_PATTERN));
        this.tvTimeMinute.setText(n.format(i9, n.TWO_INTEGERS_PATTERN));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTimeWheel() {
        this.tvColon.setTextColor(ContextCompat.getColor(getContext(), R.color.color_refresh));
        this.tvTimeHour.setVisibility(8);
        this.tvTimeMinute.setVisibility(8);
        this.hourWheelPicker.setVisibility(0);
        this.minuteWheelPicker.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTimeWheelState(MyWheelPicker myWheelPicker, TextView textView, boolean z7) {
        if (this.wheelIdle != z7) {
            this.wheelIdle = z7;
            if (!z7) {
                textView.setText(myWheelPicker.getData().get(myWheelPicker.getCurrentItemPosition()).toString());
                this.tvColon.setTextColor(ContextCompat.getColor(getContext(), R.color.black));
                myWheelPicker.setVisibility(8);
                textView.setVisibility(0);
                return;
            }
            myWheelPicker.setVisibility(0);
            textView.setVisibility(8);
            this.tvColon.setTextColor(ContextCompat.getColor(getContext(), R.color.color_refresh));
            d dVar = this.onTimeSelectedListener;
            if (dVar != null) {
                dVar.onItemSelected(this, getSelectHour(), getSelectMinutes());
            }
        }
    }

    public int getSelectHour() {
        return Integer.parseInt(this.hourWheelPicker.getData().get(this.hourWheelPicker.getCurrentItemPosition()).toString());
    }

    public int getSelectMinutes() {
        return this.minuteWheelPicker.getCurrentItemPosition();
    }

    public void setOnTimeSelectedListener(d dVar) {
        this.onTimeSelectedListener = dVar;
    }

    public void setTime(boolean z7, int i8, int i9) {
        ArrayList arrayList = new ArrayList();
        if (z7) {
            arrayList.add(n.format(12.0d, n.TWO_INTEGERS_PATTERN));
            for (int i10 = 1; i10 < 12; i10++) {
                arrayList.add(n.format(i10, n.TWO_INTEGERS_PATTERN));
            }
        } else {
            arrayList.addAll(getTimeList(24));
        }
        this.hourWheelPicker.setData(arrayList);
        this.hourWheelPicker.setSelectedItemPosition(i8);
        this.minuteWheelPicker.setSelectedItemPosition(i9);
        setTimeText(Integer.parseInt((String) arrayList.get(i8)), i9);
    }

    public MyTimePicker(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyTimePicker(Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.wheelIdle = true;
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_time_picker, this);
        this.llTimePicker = (LinearLayout) inflate.findViewById(R.id.ll_time_picker);
        this.hourWheelPicker = (MyWheelPicker) inflate.findViewById(R.id.wp_time_hour);
        this.minuteWheelPicker = (MyWheelPicker) inflate.findViewById(R.id.wp_time_minute);
        this.tvColon = (TextView) inflate.findViewById(R.id.tv_colon);
        this.tvTimeHour = (TextView) inflate.findViewById(R.id.tv_time_hour);
        this.tvTimeMinute = (TextView) inflate.findViewById(R.id.tv_time_minute);
        this.minuteWheelPicker.setData(getTimeList(60));
        this.llTimePicker.setOnFocusChangeListener(new a());
        this.hourWheelPicker.setOnWheelChangeListener(new b());
        this.minuteWheelPicker.setOnWheelChangeListener(new c());
    }
}
