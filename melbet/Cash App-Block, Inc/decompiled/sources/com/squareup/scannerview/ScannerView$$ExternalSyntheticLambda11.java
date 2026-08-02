package com.squareup.scannerview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.credentials.CredentialManagerImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.android.material.math.MathUtils;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.cash.R;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewEvent;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderDetailsView;
import com.squareup.cash.timeline.viewmodels.TimelineWidgetModel;
import com.squareup.cash.timeline.views.TimelineView;
import com.squareup.scannerview.ScannerView;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.document.DocumentTileAdapter;
import com.withpersona.sdk2.inquiry.governmentid.EnabledIdClass;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdListAdapter;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Output;
import com.withpersona.sdk2.inquiry.internal.cancel.CancelDialogFragment;
import com.withpersona.sdk2.inquiry.internal.databinding.Pi2FragmentWorkflowBinding;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2OldSelfieCameraBinding;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieCameraBinding;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.steps.ui.components.LinkButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SecureTransformationMethod;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpBottomSheetViewModel;
import com.withpersona.sdk2.inquiry.steps.ui.mdoc.MdocRequestMetadata$GoogleWalletRequestMetadata;
import com.withpersona.sdk2.inquiry.steps.ui.view.SignatureView;
import com.withpersona.sdk2.inquiry.ui.SignatureBottomSheetController;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import radiography.Radiography$$ExternalSyntheticLambda1;
import timber.log.Timber;

/* loaded from: classes9.dex */
public final /* synthetic */ class ScannerView$$ExternalSyntheticLambda11 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ScannerView$$ExternalSyntheticLambda11(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SandboxFlags.ForcedStatus forcedStatus;
        String str;
        Bitmap bitmap;
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                Step step = (Step) obj2;
                ScannerView scannerView = (ScannerView) obj;
                int i2 = ScannerView.$r8$clinit;
                Timber.Forest.i("Choosing to retake photo for step " + step.scanType, new Object[0]);
                scannerView.resetOverlay();
                scannerView.textSetter.setText(step.text, true, true);
                ScannerView.Callback callback = scannerView.callback;
                if (callback != null) {
                    callback.onPreviewVisibilityChanged(false, step);
                }
                scannerView.moveToStep(scannerView.currentStep, false);
                scannerView.isCaptured.set(false);
                scannerView.cameraOperator.setDefaultFlashState$1();
                break;
            case 1:
                TimelineWidgetModel.Item item = (TimelineWidgetModel.Item) obj;
                TimelineView.OnItemClickListener onItemClickListener = ((TimelineView) obj2).onItemClickListener;
                if (onItemClickListener != null) {
                    Object obj3 = item.clickEvent;
                    obj3.getClass();
                    ((AfterPayOrderDetailsView) ((MaterialButton$$ExternalSyntheticLambda3) onItemClickListener).f$0).onEventCallback.invoke((AfterPayOrderDetailsViewEvent) obj3);
                    break;
                }
                break;
            case 2:
                DefaultIoScheduler defaultIoScheduler = ChallengeActivity.WORK_CONTEXT;
                ((ThreeDS2Button) obj2).setClickable(false);
                ((ChallengeActivity) obj).getViewModel$3ds2sdk_release().submit(ChallengeAction.Cancel.INSTANCE);
                break;
            case 3:
                DocumentTileAdapter.Item.DocumentItem documentItem = (DocumentTileAdapter.Item.DocumentItem) obj;
                HCaptcha$$ExternalSyntheticLambda2 hCaptcha$$ExternalSyntheticLambda2 = ((DocumentTileAdapter) obj2).removeDocument;
                if (hCaptcha$$ExternalSyntheticLambda2 != null) {
                    hCaptcha$$ExternalSyntheticLambda2.invoke(documentItem.getDocument());
                    break;
                }
                break;
            case 4:
                ((GovernmentIdListAdapter) obj2).onClick.invoke(((EnabledIdClass) obj).idConfig);
                break;
            case 5:
                CancelDialogFragment cancelDialogFragment = (CancelDialogFragment) obj2;
                InquiryWorkflow$Output.Cancel cancel = (InquiryWorkflow$Output.Cancel) obj;
                cancelDialogFragment.dismiss();
                Fragment parentFragment = cancelDialogFragment.getParentFragment();
                InquiryFragment inquiryFragment = parentFragment instanceof InquiryFragment ? (InquiryFragment) parentFragment : null;
                if (inquiryFragment != null) {
                    inquiryFragment.onCancelClick$inquiry_internal_release(cancel);
                    break;
                }
                break;
            case 6:
                TextSetter textSetter = (TextSetter) obj2;
                Pi2FragmentWorkflowBinding pi2FragmentWorkflowBinding = (Pi2FragmentWorkflowBinding) obj;
                SandboxFlags sandboxFlags = (SandboxFlags) textSetter.textView;
                int ordinal = sandboxFlags.debugForcedStatus.ordinal();
                if (ordinal == 0) {
                    forcedStatus = SandboxFlags.ForcedStatus.Passed;
                } else if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    forcedStatus = SandboxFlags.ForcedStatus.Failed;
                }
                sandboxFlags.debugForcedStatus = forcedStatus;
                SandboxFlags.ForcedStatus forcedStatus2 = ((SandboxFlags) textSetter.textView).debugForcedStatus;
                forcedStatus2.getClass();
                int ordinal2 = forcedStatus2.ordinal();
                if (ordinal2 == 0) {
                    str = "failed";
                } else if (ordinal2 != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    str = "passed";
                }
                Toast.makeText(pi2FragmentWorkflowBinding.floatingActionButton.getRootView().getContext(), "Setting the debug flag to: ".concat(str), 0).show();
                break;
            case 7:
                MathUtils mathUtils = (MathUtils) obj;
                OldSelfieOverlayView oldSelfieOverlayView = ((Pi2OldSelfieCameraBinding) obj2).selfieWindow;
                Pi2CircleMaskView pi2CircleMaskView = (Pi2CircleMaskView) oldSelfieOverlayView.binding.taxWebAppToolbarBackButton;
                if (pi2CircleMaskView.getScaleX() != 5.0f || pi2CircleMaskView.getScaleY() != 5.0f) {
                    ((SelfieWorkflow$Screen$OldCameraScreen$Mode$ManualCaptureWithCountDown) mathUtils).onCaptureClicked.invoke();
                    break;
                } else {
                    Pi2CircleMaskView.close$default((Pi2CircleMaskView) oldSelfieOverlayView.binding.taxWebAppToolbarBackButton, new OldCameraScreenRunner$$ExternalSyntheticLambda0(mathUtils, 2), 1);
                    break;
                }
                break;
            case 8:
                ((Pi2SelfieCameraBinding) obj2).button.setEnabled(false);
                ((StateFlowsKt$$ExternalSyntheticLambda2) obj).invoke();
                break;
            case 9:
                TextInputLayout textInputLayout = (TextInputLayout) obj2;
                String str2 = (String) obj;
                EditText editText = textInputLayout.editText;
                boolean z = (editText != null ? editText.getTransformationMethod() : null) != null;
                EditText editText2 = textInputLayout.editText;
                if (editText2 != null) {
                    editText2.setTransformationMethod(z ? null : new SecureTransformationMethod(str2));
                }
                textInputLayout.setEndIconDrawable(textInputLayout.getContext().getDrawable(z ? R.drawable.pi2_material_ic_visibility_off : R.drawable.pi2_material_ic_visibility_on));
                break;
            case 10:
                SignatureBottomSheetController signatureBottomSheetController = (SignatureBottomSheetController) obj2;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                Radiography$$ExternalSyntheticLambda1 radiography$$ExternalSyntheticLambda1 = signatureBottomSheetController.currentOnCompleteListener;
                if (radiography$$ExternalSyntheticLambda1 != null) {
                    Object obj4 = Boolean.FALSE;
                    SignatureView signatureView = signatureBottomSheetController.getBinding().signatureCanvas;
                    Bitmap bitmap2 = signatureView.signatureBitmap;
                    if (signatureView.signatureRectF.isEmpty() || bitmap2 == null) {
                        bitmap = null;
                    } else {
                        signatureView.updateSignatureRectF();
                        float f = signatureView.signatureRectF.left;
                        Paint paint = signatureView.paint;
                        RectF rectF = new RectF(f - paint.getStrokeWidth(), signatureView.signatureRectF.top - paint.getStrokeWidth(), paint.getStrokeWidth() + signatureView.signatureRectF.right, paint.getStrokeWidth() + signatureView.signatureRectF.bottom);
                        Rect rect = new Rect();
                        rectF.roundOut(rect);
                        Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                        bitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                        bitmap.getClass();
                        Canvas canvas = new Canvas(bitmap);
                        canvas.drawColor(0);
                        canvas.drawBitmap(bitmap2, rect, rect2, (Paint) null);
                    }
                    radiography$$ExternalSyntheticLambda1.invoke(obj4, bitmap);
                }
                signatureBottomSheetController.currentOnCompleteListener = null;
                bottomSheetBehavior.setState(5);
                break;
            case 11:
                UiComponent uiComponent = (UiComponent) obj2;
                View view2 = (View) obj;
                MdocRequestMetadata$GoogleWalletRequestMetadata mdocRequestMetadata$GoogleWalletRequestMetadata = ((MdocComponent) uiComponent).mdocRequestMetadata;
                if (mdocRequestMetadata$GoogleWalletRequestMetadata == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    Context context = view2.getContext();
                    context.getClass();
                    CredentialManagerImpl credentialManagerImpl = new CredentialManagerImpl(context);
                    Context context2 = view2.getContext();
                    context2.getClass();
                    AppCompatActivity activity = ContextUtilsKt.getActivity(context2);
                    if (activity != null) {
                        JobKt.launch$default(ViewModelKt.getCoroutineScope(activity.getLifecycle()), null, null, new FlowKt__LimitKt$transformWhile$1(credentialManagerImpl, view2, mdocRequestMetadata$GoogleWalletRequestMetadata, uiComponent, null, 10), 3);
                        break;
                    }
                }
                break;
            case 12:
                UiWorkflow.Screen.EntryScreen entryScreen = (UiWorkflow.Screen.EntryScreen) obj2;
                UiScreenRunner uiScreenRunner = (UiScreenRunner) obj;
                HelpBottomSheetViewModel helpBottomSheetViewModel = entryScreen.helpBottomSheetViewModel;
                if (helpBottomSheetViewModel != null) {
                    uiScreenRunner.helpBottomSheetController.show(entryScreen.styles, helpBottomSheetViewModel, entryScreen.onHelpBottomSheetDismissed, entryScreen.launchActionFromHelpSheet, entryScreen.launchSecondaryActionFromHelpSheet);
                    break;
                }
                break;
            default:
                try {
                    ((ButtonWithLoadingIndicator) obj).getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((LinkButtonComponent) ((UiComponent) obj2)).link)));
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
