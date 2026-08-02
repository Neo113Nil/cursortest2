package com.squareup.scannerview;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.camera.core.LegacySessionConfig;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.android.Views;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes8.dex */
public final /* synthetic */ class ScannerView$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ScannerView f$0;

    public /* synthetic */ ScannerView$$ExternalSyntheticLambda1(ScannerView scannerView, int i) {
        this.$r8$classId = i;
        this.f$0 = scannerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ScannerView scannerView = this.f$0;
        switch (i) {
            case 0:
                RectF rectF = (RectF) obj;
                int i2 = ScannerView.$r8$clinit;
                rectF.getClass();
                scannerView.overlayHeight = MathKt__MathJVMKt.roundToInt(rectF.height());
                scannerView.overlayBottom = (int) rectF.bottom;
                CameraOperator cameraOperator = scannerView.cameraOperator;
                cameraOperator.getClass();
                RectF rectF2 = cameraOperator.targetBounds;
                if (!rectF.equals(rectF2)) {
                    rectF2.set(rectF);
                    if (cameraOperator.previewSurface != null) {
                        cameraOperator.calculateAdjustedTargetBounds();
                        CaptureRequest.Builder builder = cameraOperator.previewRequestBuilder;
                        builder.getClass();
                        CameraOperator.updatePreviewRegions(builder, cameraOperator.cameraInfo);
                        CameraCaptureSession cameraCaptureSession = cameraOperator.captureSession;
                        if (cameraCaptureSession != null) {
                            cameraOperator.configureSession(cameraCaptureSession);
                        }
                    }
                }
                Iterator it = scannerView.viewsToAlignBelowTargetBounds.iterator();
                while (it.hasNext()) {
                    View view = (View) it.next();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = scannerView.flashButtonTopMargin + ((int) rectF.bottom);
                        view.setLayoutParams(marginLayoutParams);
                    }
                }
                scannerView.overlayTopMargin = scannerView.overlayView.topMargin;
                Iterator it2 = scannerView.steps.iterator();
                while (it2.hasNext()) {
                    ((Step) it2.next()).getClass();
                }
                FrameLayout frameLayout = scannerView.photoPreviewContainer;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, scannerView.overlayHeight);
                layoutParams2.setMargins(0, scannerView.overlayTopMargin, 0, 0);
                frameLayout.setLayoutParams(layoutParams2);
                ScannerView.PhotoPreviewView photoPreviewView = scannerView.photoPreviewView;
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(MathKt__MathJVMKt.roundToInt(rectF.width()), scannerView.overlayHeight);
                layoutParams3.setMargins(MathKt__MathJVMKt.roundToInt(rectF.left), 0, MathKt__MathJVMKt.roundToInt(rectF.right), 0);
                photoPreviewView.setLayoutParams(layoutParams3);
                ScannerView.Callback callback = scannerView.callback;
                if (callback != null) {
                    callback.onOverlayBottom(scannerView.overlayBottom);
                }
                break;
            default:
                FlashState flashState = (FlashState) obj;
                int i3 = ScannerView.$r8$clinit;
                flashState.getClass();
                LegacySessionConfig legacySessionConfig = scannerView.flashView;
                ImageButton imageButton = (ImageButton) legacySessionConfig.effects;
                MooncakePillButton mooncakePillButton = (MooncakePillButton) legacySessionConfig.preferredFeatureGroup;
                legacySessionConfig.featureSelectionListenerExecutor = flashState;
                int ordinal = flashState.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        imageButton.setImageDrawable((Drawable) legacySessionConfig.frameRateRange);
                        mooncakePillButton.setStyle(MooncakePillButton.Style.PRIMARY);
                        Views.setCompoundDrawableStart(mooncakePillButton, (Drawable) legacySessionConfig.featureSelectionListener);
                    } else if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        imageButton.setImageDrawable((Drawable) legacySessionConfig.useCases);
                        mooncakePillButton.setStyle(MooncakePillButton.Style.SECONDARY);
                        Views.setCompoundDrawableStart(mooncakePillButton, (Drawable) legacySessionConfig.requiredFeatureGroup);
                    }
                }
                if (legacySessionConfig.isLegacy) {
                    legacySessionConfig.setVisibility(flashState == FlashState.UNAVAILABLE ? 8 : 0);
                }
                ScannerView.Callback callback2 = scannerView.callback;
                if (callback2 != null) {
                    FlashState flashState2 = FlashState.UNAVAILABLE;
                }
                if (callback2 != null) {
                    callback2.onFlashState(flashState);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
