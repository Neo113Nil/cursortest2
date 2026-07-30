package com.crrepa.band.my.health.widgets.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogWaterGoalInputBinding;
import com.crrepa.band.my.health.water.util.WaterProvider;

/* loaded from: classes2.dex */
public class k0 extends Dialog {
    private DialogWaterGoalInputBinding binding;
    private int defaultNum;
    private int maxNum;
    private a onInputConfirmListener;

    public interface a {
        void onInput(int i8);
    }

    public k0(@NonNull Context context) {
        super(context, R.style.UserInfoChooceDialog);
        this.defaultNum = 0;
        this.maxNum = 0;
    }

    private void initLayout() {
        Window window = getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = getContext().getResources().getDisplayMetrics().widthPixels;
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(true);
    }

    private void initListener() {
        this.binding.tvGoalInputConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k0.this.lambda$initListener$0(view);
            }
        });
    }

    private void initView() {
        DialogWaterGoalInputBinding inflate = DialogWaterGoalInputBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.binding.tvGoalInputUnit.setText(WaterProvider.getWaterUnit(getContext()));
        this.binding.etGoalInput.setText(String.valueOf(this.defaultNum));
        this.binding.etGoalInput.setHint(String.valueOf(WaterProvider.getDefaultGoal()));
        this.maxNum = WaterProvider.getMaxGoal();
        this.binding.etGoalInput.setFilters(new InputFilter[]{new InputFilter.LengthFilter(String.valueOf(this.maxNum).length())});
        initLayout();
        getWindow().setSoftInputMode(5);
        this.binding.etGoalInput.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(View view) {
        if (this.onInputConfirmListener != null) {
            String obj = this.binding.etGoalInput.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                this.onInputConfirmListener.onInput(WaterProvider.getDefaultGoal());
            } else {
                this.onInputConfirmListener.onInput(Math.min(Integer.parseInt(obj), this.maxNum));
            }
        }
        dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        initListener();
    }

    public k0 setDefaultNum(int i8) {
        this.defaultNum = i8;
        return this;
    }

    public k0 setOnInputConfirmListener(a aVar) {
        this.onInputConfirmListener = aVar;
        return this;
    }
}
