package com.crrepa.band.my.health.widgets.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogDateSelectBinding;
import com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.WheelDatePicker;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes2.dex */
public class f extends Dialog {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    DialogDateSelectBinding binding;
    private b onDoneClickListener;
    private Date selectedDate;

    class a implements WheelDatePicker.a {
        a() {
        }

        @Override // com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.WheelDatePicker.a
        public void onDateSelected(WheelDatePicker wheelDatePicker, Date date) {
            com.orhanobut.logger.f.d("onDateSelected: " + date.toString());
            if (System.currentTimeMillis() < date.getTime()) {
                f.this.showSelectedDate(new Date());
            }
        }
    }

    public interface b {
        void onDoneClick(Date date);
    }

    public f(Context context) {
        super(context, R.style.UserInfoChooceDialog);
        this.selectedDate = new Date();
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

    private void initView() {
        DialogDateSelectBinding inflate = DialogDateSelectBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.binding.tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.this.lambda$initView$0(view);
            }
        });
        this.binding.tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.this.lambda$initView$1(view);
            }
        });
    }

    private void initWheelPicker() {
        this.binding.wpDate.setAtmospheric(true);
        this.binding.wpDate.setCurved(true);
        this.binding.wpDate.setCyclic(false);
        int color = ContextCompat.getColor(getContext(), R.color.grey);
        this.binding.wpDate.setItemTextColor(color);
        this.binding.wpDate.setSelectedItemTextColor(ContextCompat.getColor(getContext(), R.color.black));
        this.binding.wpDate.setIndicator(false);
        this.binding.wpDate.setIndicatorColor(color);
        this.binding.wpDate.setOnDateSelectedListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        if (this.onDoneClickListener != null) {
            this.onDoneClickListener.onDoneClick(this.binding.wpDate.getCurrentDate());
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showSelectedDate(Date date) {
        Calendar calendar = com.moyoung.dafit.module.common.utils.k.getCalendar();
        calendar.setTime(date);
        int i8 = calendar.get(1);
        int i9 = calendar.get(2) + 1;
        int i10 = calendar.get(5);
        this.binding.wpDate.setSelectedYear(i8);
        this.binding.wpDate.setSelectedMonth(i9);
        this.binding.wpDate.setSelectedDay(i10);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        initLayout();
        initWheelPicker();
        showSelectedDate(this.selectedDate);
    }

    public f setOnDoneClickListener(b bVar) {
        this.onDoneClickListener = bVar;
        return this;
    }

    public f setSelectedDate(Date date) {
        this.selectedDate = date;
        return this;
    }
}
