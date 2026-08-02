package com.withpersona.sdk2.inquiry.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.steps.ui.view.SignatureView;
import com.withpersona.sdk2.inquiry.ui.databinding.Pi2SignatureBottomSheetBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public final /* synthetic */ class SignatureBottomSheetController$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SignatureBottomSheetController f$0;

    public /* synthetic */ SignatureBottomSheetController$$ExternalSyntheticLambda0(SignatureBottomSheetController signatureBottomSheetController, int i) {
        this.$r8$classId = i;
        this.f$0 = signatureBottomSheetController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        SignatureBottomSheetController signatureBottomSheetController = this.f$0;
        switch (i) {
            case 0:
                ViewGroup viewGroup = signatureBottomSheetController.contentView;
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pi2_signature_bottom_sheet, viewGroup, false);
                viewGroup.addView(inflate);
                int i2 = R.id.bottom_sheet;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.bottom_sheet);
                if (frameLayout != null) {
                    i2 = R.id.clear_button;
                    Button button = (Button) ViewBindings.findChildViewById(inflate, R.id.clear_button);
                    if (button != null) {
                        i2 = R.id.close_signature_sheet_button;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, R.id.close_signature_sheet_button);
                        if (imageView != null) {
                            i2 = R.id.flow_layout;
                            if (((Flow) ViewBindings.findChildViewById(inflate, R.id.flow_layout)) != null) {
                                i2 = R.id.save_button;
                                Button button2 = (Button) ViewBindings.findChildViewById(inflate, R.id.save_button);
                                if (button2 != null) {
                                    i2 = R.id.shadow;
                                    View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.shadow);
                                    if (findChildViewById != null) {
                                        i2 = R.id.signature_canvas;
                                        SignatureView signatureView = (SignatureView) ViewBindings.findChildViewById(inflate, R.id.signature_canvas);
                                        if (signatureView != null) {
                                            i2 = R.id.signature_description;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.signature_description);
                                            if (textView != null) {
                                                i2 = R.id.signature_label;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.signature_label);
                                                if (textView2 != null) {
                                                    i2 = R.id.signature_sheet;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.signature_sheet);
                                                    if (constraintLayout != null) {
                                                        return new Pi2SignatureBottomSheetBinding((FrameLayout) inflate, frameLayout, button, imageView, button2, findChildViewById, signatureView, textView, textView2, constraintLayout);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            default:
                Radiography$$ExternalSyntheticLambda1 radiography$$ExternalSyntheticLambda1 = signatureBottomSheetController.currentOnCompleteListener;
                if (radiography$$ExternalSyntheticLambda1 != null) {
                    radiography$$ExternalSyntheticLambda1.invoke(Boolean.TRUE, null);
                }
                signatureBottomSheetController.currentOnCompleteListener = null;
                signatureBottomSheetController.getBinding().signatureCanvas.clearCanvas();
                return Unit.INSTANCE;
        }
    }
}
