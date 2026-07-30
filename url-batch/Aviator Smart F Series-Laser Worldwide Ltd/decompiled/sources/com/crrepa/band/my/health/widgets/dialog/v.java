package com.crrepa.band.my.health.widgets.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogPeriodSelectBinding;
import java.util.List;

/* loaded from: classes2.dex */
public class v extends Dialog {
    DialogPeriodSelectBinding binding;
    private boolean isCyclic;
    private boolean isPeriodString;
    private a onDoneClickListener;
    private List<Integer> periodList;
    private List<String> periodStringList;
    private int selectedPosition;

    public interface a {
        void onClick(int i8);
    }

    public v(Context context) {
        super(context, R.style.UserInfoChooceDialog);
        this.isPeriodString = false;
    }

    private void initHourWheelPicker() {
        this.binding.wpPeriod.setData(this.isPeriodString ? this.periodStringList : this.periodList);
        this.binding.wpPeriod.setCyclic(this.isCyclic);
        this.binding.wpPeriod.setSelectedItemPosition(this.selectedPosition);
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
        DialogPeriodSelectBinding inflate = DialogPeriodSelectBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.binding.tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.this.lambda$initView$0(view);
            }
        });
        this.binding.tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v.this.lambda$initView$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        if (this.onDoneClickListener != null) {
            int currentItemPosition = this.binding.wpPeriod.getCurrentItemPosition();
            if (this.isPeriodString) {
                this.onDoneClickListener.onClick(currentItemPosition);
            } else {
                this.onDoneClickListener.onClick(this.periodList.get(currentItemPosition).intValue());
            }
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        initLayout();
        initHourWheelPicker();
    }

    public v setCyclic(boolean z7) {
        this.isCyclic = z7;
        return this;
    }

    public v setOnDoneClickListener(a aVar) {
        this.onDoneClickListener = aVar;
        return this;
    }

    public v setPeriodList(List<Integer> list) {
        this.periodList = list;
        this.isPeriodString = false;
        return this;
    }

    public v setPeriodStringList(List<String> list) {
        this.periodStringList = list;
        this.isPeriodString = true;
        return this;
    }

    public v setSelectedPosition(int i8) {
        this.selectedPosition = i8;
        return this;
    }
}
