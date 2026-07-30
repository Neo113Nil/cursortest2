package com.crrepa.band.my.health.physiologicalcycle;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogTimeSelectBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBDialog;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class YearMonthDialog extends BaseVBDialog<DialogTimeSelectBinding> {
    private int maxMonth;
    private int maxYear;
    private int minMonth;
    private int minYear;
    private int monthPosition;
    private a onDoneClickListener;
    private int yearPosition;

    public interface a {
        void onClick(int i8, int i9);
    }

    public YearMonthDialog(Context context) {
        super(context, R.style.UserInfoChooceDialog);
        this.minYear = context.getResources().getInteger(R.integer.calendar_min_year);
        this.maxYear = context.getResources().getInteger(R.integer.calendar_max_year);
        this.minMonth = context.getResources().getInteger(R.integer.min_month);
        this.maxMonth = context.getResources().getInteger(R.integer.max_month);
    }

    private List getWheelPickerData(int i8, int i9) {
        ArrayList arrayList = new ArrayList();
        while (i8 <= i9) {
            arrayList.add(Integer.valueOf(i8));
            i8++;
        }
        return arrayList;
    }

    private void initHourWheelPicker() {
        ((DialogTimeSelectBinding) this.binding).wpTimeHour.setData(getWheelPickerData(this.minYear, this.maxYear));
        ((DialogTimeSelectBinding) this.binding).wpTimeHour.setSelectedItemPosition(this.yearPosition);
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
        ((DialogTimeSelectBinding) this.binding).wpTimeMinute.setData(getWheelPickerData(this.minMonth, this.maxMonth));
        ((DialogTimeSelectBinding) this.binding).wpTimeMinute.setSelectedItemPosition(this.monthPosition);
    }

    private void initWheelPicker() {
        initHourWheelPicker();
        initMinuteWheelPicker();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        if (this.onDoneClickListener != null) {
            this.onDoneClickListener.onClick(((DialogTimeSelectBinding) this.binding).wpTimeHour.getCurrentItemPosition() + this.minYear, ((DialogTimeSelectBinding) this.binding).wpTimeMinute.getCurrentItemPosition() + this.minMonth);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        dismiss();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        ((DialogTimeSelectBinding) this.binding).tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.physiologicalcycle.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YearMonthDialog.this.lambda$initBinding$0(view);
            }
        });
        ((DialogTimeSelectBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.physiologicalcycle.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YearMonthDialog.this.lambda$initBinding$1(view);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initLayout();
        initWheelPicker();
    }

    public YearMonthDialog setCurrentMonth(int i8) {
        this.monthPosition = i8 - this.minMonth;
        return this;
    }

    public YearMonthDialog setCurrentYear(int i8) {
        this.yearPosition = i8 - this.minYear;
        return this;
    }

    public YearMonthDialog setOnDoneClickListener(a aVar) {
        this.onDoneClickListener = aVar;
        return this;
    }
}
