package com.withpersona.sdk2.inquiry.internal.cancel;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.tracing.Trace;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.play.integrity.internal.ah;
import com.squareup.cash.R;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.scannerview.ScannerView$$ExternalSyntheticLambda11;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.databinding.Pi2CancelModalBinding;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.WindowUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.steps.ui.styling.BottomSheetStylingKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/cancel/CancelDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CancelDialogFragment extends BottomSheetDialogFragment {
    public Pi2CancelModalBinding binding;

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        final BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) onCreateDialog;
        onCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.withpersona.sdk2.inquiry.internal.cancel.CancelDialogFragment$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ViewGroup viewGroup = (ViewGroup) BottomSheetDialog.this.findViewById(R.id.design_bottom_sheet);
                viewGroup.setBackgroundResource(android.R.color.transparent);
                CancelDialogFragment cancelDialogFragment = this;
                Bundle arguments = cancelDialogFragment.getArguments();
                InquiryWorkflow$Output.Cancel cancel = arguments != null ? (InquiryWorkflow$Output.Cancel) SizeKt.getParcelable(arguments, "ARGUMENT_CANCEL_OUTPUT", InquiryWorkflow$Output.Cancel.class) : null;
                StepStyle stepStyle = cancel != null ? cancel.styles : null;
                Pi2CancelModalBinding pi2CancelModalBinding = cancelDialogFragment.binding;
                if (pi2CancelModalBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    throw null;
                }
                ConstraintLayout constraintLayout = pi2CancelModalBinding.bottomSheetContent;
                constraintLayout.getClass();
                BottomSheetStylingKt.applyBottomSheetStyles$default(viewGroup, stepStyle, constraintLayout, null, 12);
            }
        });
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Bundle arguments = getArguments();
        if ((arguments != null ? arguments.getInt("ARGUMENT_THEME", 0) : 0) != 0) {
            Context context = layoutInflater.getContext();
            Bundle arguments2 = getArguments();
            layoutInflater = layoutInflater.cloneInContext(new ContextThemeWrapper(context, arguments2 != null ? arguments2.getInt("ARGUMENT_THEME", 0) : 0));
        }
        View inflate = layoutInflater.inflate(R.layout.pi2_cancel_modal, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i = R.id.close_button;
        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate, R.id.close_button);
        if (personaMaterialButton != null) {
            i = R.id.hintMessage;
            TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.hintMessage);
            if (textView != null) {
                i = R.id.hintTitle;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.hintTitle);
                if (textView2 != null) {
                    i = R.id.retry_button;
                    PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate, R.id.retry_button);
                    if (personaMaterialButton2 != null) {
                        this.binding = new Pi2CancelModalBinding(constraintLayout, constraintLayout, personaMaterialButton, textView, textView2, personaMaterialButton2);
                        constraintLayout.getClass();
                        return constraintLayout;
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        int colorFromAttr$default;
        Integer backgroundColorValue;
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        InquiryWorkflow$Output.Cancel cancel = arguments != null ? (InquiryWorkflow$Output.Cancel) SizeKt.getParcelable(arguments, "ARGUMENT_CANCEL_OUTPUT", InquiryWorkflow$Output.Cancel.class) : null;
        if (cancel == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return;
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(null);
            window.setLayout(-1, -1);
            Trace.setDecorFitsSystemWindows(window, false);
            StepStyle stepStyle = cancel.styles;
            if (stepStyle == null || (backgroundColorValue = stepStyle.getBackgroundColorValue()) == null) {
                Context context = window.getContext();
                context.getClass();
                colorFromAttr$default = ResToolsKt.getColorFromAttr$default(context, R.attr.colorSurface);
            } else {
                colorFromAttr$default = backgroundColorValue.intValue();
            }
            WindowUtilsKt.updateUiColor(window, colorFromAttr$default);
        }
        Pi2CancelModalBinding pi2CancelModalBinding = this.binding;
        if (pi2CancelModalBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        PersonaMaterialButton personaMaterialButton = pi2CancelModalBinding.retryButton;
        PersonaMaterialButton personaMaterialButton2 = pi2CancelModalBinding.closeButton;
        String str = cancel.title;
        if (str != null) {
            pi2CancelModalBinding.hintTitle.setText(str);
        }
        String str2 = cancel.message;
        if (str2 != null) {
            pi2CancelModalBinding.hintMessage.setText(str2);
        }
        String str3 = cancel.cancelButtonText;
        if (str3 != null) {
            personaMaterialButton2.setText(str3);
        }
        String str4 = cancel.resumeButtonText;
        if (str4 != null) {
            personaMaterialButton.setText(str4);
        }
        personaMaterialButton.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(this, 22));
        personaMaterialButton2.setOnClickListener(new ScannerView$$ExternalSyntheticLambda11(5, this, cancel));
        ah.addOneShotPreDrawListenerAndDiscardFrame(personaMaterialButton2, new StateFlowsKt$$ExternalSyntheticLambda2(7, this, cancel, pi2CancelModalBinding));
    }
}
