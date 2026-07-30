package com.crrepa.band.my.health.widgets.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogMethodSelectBinding;
import java.util.List;

/* loaded from: classes2.dex */
public class m extends Dialog {
    DialogMethodSelectBinding binding;
    private boolean isCyclic;
    private List<String> methodList;
    private a onDoneClickListener;
    private int selectedPosition;

    public interface a {
        void onClick(String str);
    }

    public m(Context context) {
        super(context, R.style.UserInfoChooceDialog);
    }

    private void initHourWheelPicker() {
        this.binding.wpPeriod.setData(this.methodList);
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
        DialogMethodSelectBinding inflate = DialogMethodSelectBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.binding.tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.this.lambda$initView$0(view);
            }
        });
        this.binding.tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.this.lambda$initView$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        if (this.onDoneClickListener != null) {
            this.onDoneClickListener.onClick(this.methodList.get(this.binding.wpPeriod.getCurrentItemPosition()));
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

    public m setCyclic(boolean z7) {
        this.isCyclic = z7;
        return this;
    }

    public m setMethodList(List<String> list) {
        this.methodList = list;
        return this;
    }

    public m setOnDoneClickListener(a aVar) {
        this.onDoneClickListener = aVar;
        return this;
    }

    public m setSelectedPosition(int i8) {
        this.selectedPosition = i8;
        return this;
    }
}
