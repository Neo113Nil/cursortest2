package com.crrepa.band.my.health.widgets.dialog;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogTimeSelectBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBDialog;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class TimeSelectDialog extends BaseVBDialog<DialogTimeSelectBinding> {
    private int hourPosition;
    private int hourTypePosition;
    private boolean is12HourTime;
    private boolean isGreater;
    private boolean isToday;
    private boolean isZh;
    private Date limitDate;
    private int limitHour;
    private int limitMinute;
    private int minutePosition;
    private a onDoneClickListener;
    private TimeSelectDialog otherTimeSelectDialog;

    public interface a {
        void onClick(int i8, int i9);
    }

    public TimeSelectDialog(Context context) {
        super(context);
        this.isToday = false;
        this.isGreater = false;
        this.is12HourTime = false;
        this.isZh = false;
    }

    private int getHour() {
        int currentItemPosition = this.is12HourTime ? ((DialogTimeSelectBinding) this.binding).wpTimeHour.getCurrentItemPosition() + 1 : ((DialogTimeSelectBinding) this.binding).wpTimeHour.getCurrentItemPosition();
        if (!this.is12HourTime) {
            return currentItemPosition;
        }
        if ((this.isZh ? ((DialogTimeSelectBinding) this.binding).wpTimeHourType : ((DialogTimeSelectBinding) this.binding).wpTimeHourTypeEn).getCurrentItemPosition() > 0) {
            if (currentItemPosition == 12) {
                return 12;
            }
            return currentItemPosition + 12;
        }
        if (currentItemPosition == 12) {
            return 0;
        }
        return currentItemPosition;
    }

    private int getHourPosition(boolean z7, int i8) {
        if (!z7) {
            return i8;
        }
        int i9 = i8 == 0 ? 11 : i8 - 1;
        return i9 < 12 ? i9 : i9 - 12;
    }

    private int getMinute() {
        return ((DialogTimeSelectBinding) this.binding).wpTimeMinute.getCurrentItemPosition();
    }

    private List<String> getWheelPickerData(int i8, int i9) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = i9; i10 <= i8 + i9; i10++) {
            arrayList.add(i10 < 10 ? "0" + i10 : String.valueOf(i10));
        }
        return arrayList;
    }

    private void init12HourTypeWheelPicker() {
        if (this.isZh) {
            ((DialogTimeSelectBinding) this.binding).wpTimeHourType.setData(Arrays.asList(getContext().getString(R.string.time_am), getContext().getString(R.string.time_pm)));
            ((DialogTimeSelectBinding) this.binding).wpTimeHourType.setVisibility(0);
            ((DialogTimeSelectBinding) this.binding).wpTimeHourType.setSelectedItemPosition(this.hourTypePosition);
        } else {
            ((DialogTimeSelectBinding) this.binding).wpTimeHourTypeEn.setData(Arrays.asList(getContext().getString(R.string.time_am), getContext().getString(R.string.time_pm)));
            ((DialogTimeSelectBinding) this.binding).wpTimeHourTypeEn.setVisibility(0);
            ((DialogTimeSelectBinding) this.binding).wpTimeHourTypeEn.setSelectedItemPosition(this.hourTypePosition);
        }
    }

    private void initHourWheelPicker() {
        if (this.is12HourTime) {
            ((DialogTimeSelectBinding) this.binding).wpTimeHour.setData(getWheelPickerData(11, 1));
        } else {
            ((DialogTimeSelectBinding) this.binding).wpTimeHour.setData(getWheelPickerData(23, 0));
        }
        ((DialogTimeSelectBinding) this.binding).wpTimeHour.setSelectedItemPosition(getHourPosition(this.is12HourTime, this.hourPosition));
    }

    private void initLayout() {
        Window window = getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        attributes.height = (int) (displayMetrics.heightPixels * 0.4d);
        attributes.width = displayMetrics.widthPixels;
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(true);
    }

    private void initMinuteWheelPicker() {
        ((DialogTimeSelectBinding) this.binding).wpTimeMinute.setData(getWheelPickerData(59, 0));
        ((DialogTimeSelectBinding) this.binding).wpTimeMinute.setSelectedItemPosition(this.minutePosition);
    }

    private boolean isInvalidTime() {
        Date timeDate = i3.a.getTimeDate(getHour(), getMinute());
        if (this.isToday) {
            setLimitDate(new Date(), false);
        }
        int milliSecondSpace = (int) ((com.moyoung.dafit.module.common.utils.m.getMilliSecondSpace(this.limitDate, timeDate) / 1000) / 60);
        boolean z7 = this.isGreater;
        return (z7 && milliSecondSpace < 0) || (!z7 && milliSecondSpace > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetListener$0(View view) {
        hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetListener$1(View view) {
        if (this.otherTimeSelectDialog != null) {
            int hour = getHour();
            int minute = getMinute();
            int hour2 = this.otherTimeSelectDialog.getHour();
            int minute2 = this.otherTimeSelectDialog.getMinute();
            if (this.isGreater) {
                if (hour < hour2 || (hour == hour2 && minute <= minute2)) {
                    r0.showShort(R.string.common_time_select_dialog_limit_1);
                    return;
                }
            } else if (hour > hour2 || (hour == hour2 && minute >= minute2)) {
                r0.showShort(R.string.common_time_select_dialog_limit_2);
                return;
            }
        }
        a aVar = this.onDoneClickListener;
        if (aVar != null) {
            aVar.onClick(getHour(), getMinute());
            setSelectedTimePosition(getHour(), getMinute());
        }
        hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetListener$2(WheelPicker wheelPicker, Object obj, int i8) {
        if (isInvalidTime()) {
            ((DialogTimeSelectBinding) this.binding).wpTimeHourType.setSelectedItemPosition(i8 == 0 ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetListener$3(WheelPicker wheelPicker, Object obj, int i8) {
        if (isInvalidTime()) {
            ((DialogTimeSelectBinding) this.binding).wpTimeHourTypeEn.setSelectedItemPosition(i8 == 0 ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetListener$4(WheelPicker wheelPicker, Object obj, int i8) {
        if (this.isToday && isInvalidTime()) {
            if (this.limitHour == getHour()) {
                ((DialogTimeSelectBinding) this.binding).wpTimeMinute.setSelectedItemPosition(this.limitMinute);
            } else {
                ((DialogTimeSelectBinding) this.binding).wpTimeHour.setSelectedItemPosition(getHourPosition(this.is12HourTime, this.limitHour));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetListener$5(WheelPicker wheelPicker, Object obj, int i8) {
        if (this.isToday && isInvalidTime()) {
            ((DialogTimeSelectBinding) this.binding).wpTimeMinute.setSelectedItemPosition(this.limitMinute);
        }
    }

    private void resetListener() {
        ((DialogTimeSelectBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TimeSelectDialog.this.lambda$resetListener$0(view);
            }
        });
        ((DialogTimeSelectBinding) this.binding).tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TimeSelectDialog.this.lambda$resetListener$1(view);
            }
        });
        if (this.limitDate != null) {
            if (this.isZh) {
                ((DialogTimeSelectBinding) this.binding).wpTimeHourType.setOnItemSelectedListener(new WheelPicker.a() { // from class: com.crrepa.band.my.health.widgets.dialog.b0
                    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker.a
                    public final void onItemSelected(WheelPicker wheelPicker, Object obj, int i8) {
                        TimeSelectDialog.this.lambda$resetListener$2(wheelPicker, obj, i8);
                    }
                });
            } else {
                ((DialogTimeSelectBinding) this.binding).wpTimeHourTypeEn.setOnItemSelectedListener(new WheelPicker.a() { // from class: com.crrepa.band.my.health.widgets.dialog.c0
                    @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker.a
                    public final void onItemSelected(WheelPicker wheelPicker, Object obj, int i8) {
                        TimeSelectDialog.this.lambda$resetListener$3(wheelPicker, obj, i8);
                    }
                });
            }
            ((DialogTimeSelectBinding) this.binding).wpTimeHour.setOnItemSelectedListener(new WheelPicker.a() { // from class: com.crrepa.band.my.health.widgets.dialog.d0
                @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker.a
                public final void onItemSelected(WheelPicker wheelPicker, Object obj, int i8) {
                    TimeSelectDialog.this.lambda$resetListener$4(wheelPicker, obj, i8);
                }
            });
            ((DialogTimeSelectBinding) this.binding).wpTimeMinute.setOnItemSelectedListener(new WheelPicker.a() { // from class: com.crrepa.band.my.health.widgets.dialog.e0
                @Override // com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker.a
                public final void onItemSelected(WheelPicker wheelPicker, Object obj, int i8) {
                    TimeSelectDialog.this.lambda$resetListener$5(wheelPicker, obj, i8);
                }
            });
        }
    }

    private void updateWheelPicker() {
        initHourWheelPicker();
        initMinuteWheelPicker();
        this.isZh = com.moyoung.dafit.module.common.utils.u.isZH();
        if (this.is12HourTime) {
            init12HourTypeWheelPicker();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        initLayout();
    }

    public TimeSelectDialog is12HourTime(boolean z7) {
        this.is12HourTime = z7;
        return this;
    }

    public TimeSelectDialog isToday(boolean z7) {
        this.isToday = z7;
        setLimitDate(new Date(), false);
        return this;
    }

    public TimeSelectDialog setLimitDate(Date date, boolean z7) {
        this.limitDate = date;
        this.isGreater = z7;
        this.limitHour = i3.a.getDateHour(date);
        this.limitMinute = i3.a.getDateMinute(date);
        return this;
    }

    public TimeSelectDialog setOnDoneClickListener(a aVar) {
        this.onDoneClickListener = aVar;
        return this;
    }

    public void setOtherTimeSelectDialog(TimeSelectDialog timeSelectDialog) {
        this.otherTimeSelectDialog = timeSelectDialog;
        timeSelectDialog.show();
        this.otherTimeSelectDialog.hide();
    }

    public TimeSelectDialog setSelectedTimePosition(int i8, int i9) {
        this.hourPosition = i8;
        this.minutePosition = i9;
        return this;
    }

    public TimeSelectDialog setSelectedTypePosition(int i8) {
        this.hourTypePosition = i8;
        return this;
    }

    @Override // android.app.Dialog
    public void show() {
        updateWheelPicker();
        TimeSelectDialog timeSelectDialog = this.otherTimeSelectDialog;
        if (timeSelectDialog != null) {
            timeSelectDialog.updateWheelPicker();
        }
        resetListener();
        super.show();
    }
}
