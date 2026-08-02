package com.withpersona.sdk2.inquiry.governmentid;

import android.view.View;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.workflow1.ui.AndroidViewRendering;
import com.squareup.workflow1.ui.DecorativeViewFactory;
import com.squareup.workflow1.ui.ViewFactory;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes9.dex */
public final class ChooseCaptureMethodView implements AndroidViewRendering {
    public final String body;
    public final String cameraText;
    public final List captureOptions;
    public View currentPictographAssetView;
    public final String error;
    public final int localAsset;
    public final NavigationState navigationState;
    public final GovernmentIdWorkflow$$ExternalSyntheticLambda0 onBack;
    public final GovernmentIdWorkflow$$ExternalSyntheticLambda6 onCameraCaptureClick;
    public final SelfieWorkflow$$ExternalSyntheticLambda2 onCancel;
    public final GovernmentIdWorkflow$$ExternalSyntheticLambda9 onErrorDismissed;
    public final GovernmentIdWorkflow$$ExternalSyntheticLambda9 onUploadClick;
    public final RemoteImage pictographAsset;
    public final StepStyles.GovernmentIdStepStyle styles;
    public final String title;
    public final String uploadButtonText;
    public final DecorativeViewFactory viewFactory;

    public ChooseCaptureMethodView(List list, String str, String str2, String str3, String str4, NavigationState navigationState, GovernmentIdWorkflow$$ExternalSyntheticLambda6 governmentIdWorkflow$$ExternalSyntheticLambda6, GovernmentIdWorkflow$$ExternalSyntheticLambda9 governmentIdWorkflow$$ExternalSyntheticLambda9, GovernmentIdWorkflow$$ExternalSyntheticLambda0 governmentIdWorkflow$$ExternalSyntheticLambda0, SelfieWorkflow$$ExternalSyntheticLambda2 selfieWorkflow$$ExternalSyntheticLambda2, String str5, GovernmentIdWorkflow$$ExternalSyntheticLambda9 governmentIdWorkflow$$ExternalSyntheticLambda92, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, RemoteImage remoteImage, int i) {
        list.getClass();
        str3.getClass();
        str4.getClass();
        navigationState.getClass();
        this.captureOptions = list;
        this.title = str;
        this.body = str2;
        this.cameraText = str3;
        this.uploadButtonText = str4;
        this.navigationState = navigationState;
        this.onCameraCaptureClick = governmentIdWorkflow$$ExternalSyntheticLambda6;
        this.onUploadClick = governmentIdWorkflow$$ExternalSyntheticLambda9;
        this.onBack = governmentIdWorkflow$$ExternalSyntheticLambda0;
        this.onCancel = selfieWorkflow$$ExternalSyntheticLambda2;
        this.error = str5;
        this.onErrorDismissed = governmentIdWorkflow$$ExternalSyntheticLambda92;
        this.styles = governmentIdStepStyle;
        this.pictographAsset = remoteImage;
        this.localAsset = i;
        this.viewFactory = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(ChooseCaptureMethodView.class), ChooseCaptureMethodView$viewFactory$1.INSTANCE, new HCaptcha$$ExternalSyntheticLambda2(this, 14));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChooseCaptureMethodView) {
            ChooseCaptureMethodView chooseCaptureMethodView = (ChooseCaptureMethodView) obj;
            if (Intrinsics.areEqual(this.captureOptions, chooseCaptureMethodView.captureOptions) && this.title.equals(chooseCaptureMethodView.title) && this.body.equals(chooseCaptureMethodView.body) && Intrinsics.areEqual(this.cameraText, chooseCaptureMethodView.cameraText) && Intrinsics.areEqual(this.uploadButtonText, chooseCaptureMethodView.uploadButtonText) && Intrinsics.areEqual(this.navigationState, chooseCaptureMethodView.navigationState) && this.onCameraCaptureClick == chooseCaptureMethodView.onCameraCaptureClick && this.onUploadClick == chooseCaptureMethodView.onUploadClick && this.onBack == chooseCaptureMethodView.onBack && this.onCancel == chooseCaptureMethodView.onCancel && Intrinsics.areEqual(this.error, chooseCaptureMethodView.error) && this.onErrorDismissed == chooseCaptureMethodView.onErrorDismissed && Intrinsics.areEqual(this.styles, chooseCaptureMethodView.styles) && Intrinsics.areEqual(this.pictographAsset, chooseCaptureMethodView.pictographAsset) && this.localAsset == chooseCaptureMethodView.localAsset) {
                return true;
            }
        }
        return false;
    }

    @Override // com.squareup.workflow1.ui.AndroidViewRendering
    public final ViewFactory getViewFactory() {
        return this.viewFactory;
    }

    public final int hashCode() {
        int hashCode = (this.onCancel.hashCode() + ((this.onBack.hashCode() + ((this.onUploadClick.hashCode() + ((this.onCameraCaptureClick.hashCode() + ((this.navigationState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.captureOptions.hashCode() * 31, 31, this.title), 31, this.body), 31, this.cameraText), 31, this.uploadButtonText)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.error;
        int hashCode2 = (this.onErrorDismissed.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        int hashCode3 = (hashCode2 + (governmentIdStepStyle == null ? 0 : governmentIdStepStyle.hashCode())) * 31;
        RemoteImage remoteImage = this.pictographAsset;
        return Integer.hashCode(this.localAsset) + ((hashCode3 + (remoteImage != null ? remoteImage.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("ChooseCaptureMethodView(captureOptions=", ", title=", this.title, ", body=", this.captureOptions);
        Boxes$$ExternalSyntheticOutline1.m(m, this.body, ", cameraText=", this.cameraText, ", uploadButtonText=");
        m.append(this.uploadButtonText);
        m.append(", navigationState=");
        m.append(this.navigationState);
        m.append(", onCameraCaptureClick=");
        m.append(this.onCameraCaptureClick);
        m.append(", onUploadClick=");
        m.append(this.onUploadClick);
        m.append(", onBack=");
        m.append(this.onBack);
        m.append(", onCancel=");
        m.append(this.onCancel);
        m.append(", error=");
        m.append(this.error);
        m.append(", onErrorDismissed=");
        m.append(this.onErrorDismissed);
        m.append(", styles=");
        m.append(this.styles);
        m.append(", pictographAsset=");
        m.append(this.pictographAsset);
        m.append(", localAsset=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.localAsset, ")", m);
    }
}
