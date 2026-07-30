package com.crrepa.band.my.device.muslim.view;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.DialogAccuracyCalibrationBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBDialog;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class AccuracyCalibrationDialog extends BaseVBDialog<DialogAccuracyCalibrationBinding> {
    public AccuracyCalibrationDialog(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        dismiss();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        ((DialogAccuracyCalibrationBinding) this.binding).givGif.setGifResource(R.raw.img_rectify);
        ((DialogAccuracyCalibrationBinding) this.binding).givGif.start();
        ((DialogAccuracyCalibrationBinding) this.binding).llDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.view.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccuracyCalibrationDialog.this.lambda$initBinding$0(view);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (int) (getContext().getResources().getDisplayMetrics().widthPixels * 0.78d);
        window.setAttributes(attributes);
    }

    public void setSensorState(int i8) {
        f.d("muslim ==> setSensorState: " + i8);
        String string = getContext().getString(R.string.muslim_accuracy_calibration_dialog_accuracy_unreliable);
        if (i8 == -1) {
            string = getContext().getString(R.string.muslim_accuracy_calibration_dialog_accuracy_no_contact);
        } else if (i8 == 0) {
            string = getContext().getString(R.string.muslim_accuracy_calibration_dialog_accuracy_unreliable);
        } else if (i8 == 1) {
            string = getContext().getString(R.string.muslim_accuracy_calibration_dialog_accuracy_low);
        } else if (i8 == 2) {
            string = getContext().getString(R.string.muslim_accuracy_calibration_dialog_accuracy_medium);
        } else if (i8 == 3) {
            string = getContext().getString(R.string.muslim_accuracy_calibration_dialog_accuracy_high);
        }
        ((DialogAccuracyCalibrationBinding) this.binding).tvSensorState.setText(string);
    }
}
