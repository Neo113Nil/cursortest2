package com.crrepa.band.my.device.pillreminder.adapter;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.pillreminder.picker.MyNumberPicker;
import com.crrepa.band.my.device.pillreminder.picker.MyTimePicker;
import com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker;
import com.crrepa.band.my.model.PillReminderTimeModel;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public class PillReminderSetTimeAdapter extends BaseQuickAdapter<PillReminderTimeModel, BaseViewHolder> {
    private static final int MAX_PILL_COUNT = 100;
    private static final int MIN_PILL_COUNT = 1;
    private static final int PILL_COUNT_UNIT = 1;
    private String[] amPm;
    private boolean is12HourTime;

    class a implements MyTimePicker.d {
        final /* synthetic */ PillReminderTimeModel val$item;
        final /* synthetic */ RadioButton val$pmRadioButton;

        a(PillReminderTimeModel pillReminderTimeModel, RadioButton radioButton) {
            this.val$item = pillReminderTimeModel;
            this.val$pmRadioButton = radioButton;
        }

        @Override // com.crrepa.band.my.device.pillreminder.picker.MyTimePicker.d
        public void onItemSelected(MyTimePicker myTimePicker, int i8, int i9) {
            PillReminderTimeModel pillReminderTimeModel = this.val$item;
            PillReminderSetTimeAdapter pillReminderSetTimeAdapter = PillReminderSetTimeAdapter.this;
            pillReminderTimeModel.setTime(pillReminderSetTimeAdapter.getReminderTime(i8, i9, pillReminderSetTimeAdapter.is12HourTime, this.val$pmRadioButton.isChecked()));
        }
    }

    class b implements RadioGroup.OnCheckedChangeListener {
        final /* synthetic */ PillReminderTimeModel val$item;
        final /* synthetic */ MyTimePicker val$reminderTimePicker;

        b(MyTimePicker myTimePicker, PillReminderTimeModel pillReminderTimeModel) {
            this.val$reminderTimePicker = myTimePicker;
            this.val$item = pillReminderTimeModel;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i8) {
            this.val$item.setTime(PillReminderSetTimeAdapter.this.getReminderTime(this.val$reminderTimePicker.getSelectHour(), this.val$reminderTimePicker.getSelectMinutes(), true, i8 == R.id.rbtn_pm));
        }
    }

    class c implements MyWheelPicker.a {
        final /* synthetic */ PillReminderTimeModel val$item;

        c(PillReminderTimeModel pillReminderTimeModel) {
            this.val$item = pillReminderTimeModel;
        }

        @Override // com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker.a
        public void onItemSelected(MyWheelPicker myWheelPicker, Object obj, int i8) {
            this.val$item.setCount(Integer.parseInt(obj.toString()));
        }
    }

    public PillReminderSetTimeAdapter() {
        super(R.layout.item_pill_reminder_set_time);
        this.is12HourTime = BandTimeSystemProvider.is12HourTime();
        this.amPm = new String[2];
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 10);
        this.amPm[0] = calendar.getDisplayName(9, 1, Locale.getDefault());
        calendar.set(11, 20);
        this.amPm[1] = calendar.getDisplayName(9, 1, Locale.getDefault());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getReminderTime(int i8, int i9, boolean z7, boolean z8) {
        if (z7) {
            Calendar calendar = Calendar.getInstance();
            if (z8) {
                calendar.set(9, 1);
            } else {
                calendar.set(9, 0);
            }
            calendar.set(10, i8 % 12);
            i8 = calendar.get(11);
        }
        return (i8 * 60) + i9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, PillReminderTimeModel pillReminderTimeModel) {
        baseViewHolder.setGone(R.id.rg_time_system, !this.is12HourTime);
        baseViewHolder.setText(R.id.rbtn_am, this.amPm[0]);
        baseViewHolder.setText(R.id.rbtn_pm, this.amPm[1]);
        RadioButton radioButton = (RadioButton) baseViewHolder.getView(R.id.rbtn_pm);
        int time = pillReminderTimeModel.getTime();
        int i8 = time / 60;
        if (this.is12HourTime) {
            if (12 <= i8) {
                radioButton.setChecked(true);
            }
            i8 %= 12;
        }
        MyTimePicker myTimePicker = (MyTimePicker) baseViewHolder.getView(R.id.reminder_time_picker);
        myTimePicker.setTime(this.is12HourTime, i8, time % 60);
        myTimePicker.setOnTimeSelectedListener(new a(pillReminderTimeModel, radioButton));
        ((RadioGroup) baseViewHolder.getView(R.id.rg_time_system)).setOnCheckedChangeListener(new b(myTimePicker, pillReminderTimeModel));
        MyNumberPicker myNumberPicker = (MyNumberPicker) baseViewHolder.getView(R.id.pill_count_picker);
        myNumberPicker.setData(1, 100, 1, pillReminderTimeModel.getCount() - 1);
        myNumberPicker.setOnItemSelectedListener(new c(pillReminderTimeModel));
    }
}
