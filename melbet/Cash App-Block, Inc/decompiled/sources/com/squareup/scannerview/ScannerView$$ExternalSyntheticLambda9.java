package com.squareup.scannerview;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraCaptureSession;
import android.view.View;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.scannerview.ScannerView;

/* loaded from: classes8.dex */
public final /* synthetic */ class ScannerView$$ExternalSyntheticLambda9 implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ScannerView f$0;
    public final /* synthetic */ StepResult f$1;
    public final /* synthetic */ Bitmap f$2;

    public /* synthetic */ ScannerView$$ExternalSyntheticLambda9(ScannerView scannerView, StepResult stepResult, Bitmap bitmap) {
        this.f$0 = scannerView;
        this.f$1 = stepResult;
        this.f$2 = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                if (this.f$0.callback != null) {
                    Step step = this.f$1.step;
                    Bitmap bitmap = this.f$2;
                    if (bitmap != null) {
                        bitmap.getWidth();
                        bitmap.getHeight();
                    }
                    step.getClass();
                    break;
                }
                break;
            default:
                int i = ScannerView.$r8$clinit;
                StepResult stepResult = this.f$1;
                stepResult.step.getClass();
                ScannerView scannerView = this.f$0;
                scannerView.getClass();
                Step step2 = stepResult.step;
                scannerView.retakeButton.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(0, step2, scannerView));
                View view = scannerView.usePhotoButton;
                Bitmap bitmap2 = this.f$2;
                view.setOnClickListener(new ScannerView$$ExternalSyntheticLambda12(step2, scannerView, stepResult, bitmap2, 0));
                CameraCaptureSession cameraCaptureSession = scannerView.cameraOperator.captureSession;
                if (cameraCaptureSession == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Capture session has not been configured!");
                    break;
                } else {
                    cameraCaptureSession.stopRepeating();
                    scannerView.flashView.setVisibility(8);
                    scannerView.overlayView.setShowingPreview(true);
                    scannerView.photoPreviewView.setImageBitmap(bitmap2);
                    scannerView.textSetter.setText(step2.previewText, false, true);
                    scannerView.previewButtonsLayout.setVisibility(0);
                    ScannerView.Callback callback = scannerView.callback;
                    if (callback != null) {
                        callback.onPreviewVisibilityChanged(true, step2);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ ScannerView$$ExternalSyntheticLambda9(StepResult stepResult, ScannerView scannerView, Bitmap bitmap) {
        this.f$1 = stepResult;
        this.f$0 = scannerView;
        this.f$2 = bitmap;
    }
}
