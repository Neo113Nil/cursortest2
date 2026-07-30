package com.crrepa.band.my.health.widgets.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogScaleViewBinding;
import com.crrepa.band.my.health.widgets.ScaleView;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;

/* loaded from: classes2.dex */
public class o0 extends Dialog {
    DialogScaleViewBinding binding;
    private float defaultNum;
    private a saveClickListener;

    public interface a {
        void onSave(float f8);
    }

    public o0(Context context) {
        super(context, R.style.UserInfoChooceDialog);
    }

    private void initLayout() {
        Window window = getWindow();
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = getContext().getResources().getDisplayMetrics().widthPixels;
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(true);
    }

    private void initScaleView() {
        this.binding.svDialogScaleView.setNowIndex(this.defaultNum);
        this.binding.svDialogScaleView.setMinIndex(UserWeightProvider.getCurrentMinWeight());
        this.binding.svDialogScaleView.setMaxIndex(UserWeightProvider.getCurrentMaxWeight());
        this.binding.svDialogScaleView.setOnScaleChangeListener(new ScaleView.b() { // from class: com.crrepa.band.my.health.widgets.dialog.n0
            @Override // com.crrepa.band.my.health.widgets.ScaleView.b
            public final void OnChange(double d8) {
                o0.this.lambda$initScaleView$2(d8);
            }
        });
    }

    private void initView() {
        DialogScaleViewBinding inflate = DialogScaleViewBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.binding.tvDialogWeightUnit.setText(BandUnitSystemProvider.getUnitSystem() == 0 ? R.string.weight_kg : R.string.weight_lb);
        this.binding.ivDialogClose.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.this.lambda$initView$0(view);
            }
        });
        this.binding.btnDialogSave.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.widgets.dialog.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o0.this.lambda$initView$1(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initScaleView$2(double d8) {
        this.binding.tvDialogWeightNum.setText(com.moyoung.dafit.module.common.utils.n.formatWeight(d8, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1(View view) {
        if (this.saveClickListener != null) {
            this.saveClickListener.onSave(((float) this.binding.svDialogScaleView.getCurrentIndex()) - this.binding.svDialogScaleView.getMinIndex());
        }
        dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        initLayout();
        initScaleView();
    }

    public o0 setDefaultNum(float f8) {
        this.defaultNum = f8;
        return this;
    }

    public o0 setOnSaveClickListener(a aVar) {
        this.saveClickListener = aVar;
        return this;
    }
}
