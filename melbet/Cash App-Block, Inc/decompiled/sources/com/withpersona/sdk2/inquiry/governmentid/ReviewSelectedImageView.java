package com.withpersona.sdk2.inquiry.governmentid;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import coil3.RealImageLoader;
import com.squareup.workflow1.ui.AndroidViewRendering;
import com.squareup.workflow1.ui.DecorativeViewFactory;
import com.squareup.workflow1.ui.ViewFactory;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes9.dex */
public final class ReviewSelectedImageView implements AndroidViewRendering {
    public final String body;
    public final String chooseNewPhotoText;
    public final String confirmButtonText;
    public final String error;
    public final String fileMimeType;
    public final String fileName;
    public final String fileToReviewPath;
    public final RealImageLoader imageLoader;
    public final boolean isAutoClassifying;
    public final NavigationState navigationState;
    public final GovernmentIdWorkflow$$ExternalSyntheticLambda0 onBack;
    public final SelfieWorkflow$$ExternalSyntheticLambda2 onCancel;
    public final GovernmentIdWorkflow$$ExternalSyntheticLambda0 onChooseNewPhotoClick;
    public final GovernmentIdWorkflow$$ExternalSyntheticLambda9 onErrorDismissed;
    public final GovernmentIdWorkflow$$ExternalSyntheticLambda6 onUsePhotoClick;
    public final StepStyles.GovernmentIdStepStyle styles;
    public final String title;
    public final DecorativeViewFactory viewFactory;

    public ReviewSelectedImageView(RealImageLoader realImageLoader, String str, String str2, String str3, String str4, String str5, String str6, String str7, NavigationState navigationState, GovernmentIdWorkflow$$ExternalSyntheticLambda6 governmentIdWorkflow$$ExternalSyntheticLambda6, GovernmentIdWorkflow$$ExternalSyntheticLambda0 governmentIdWorkflow$$ExternalSyntheticLambda0, GovernmentIdWorkflow$$ExternalSyntheticLambda0 governmentIdWorkflow$$ExternalSyntheticLambda02, SelfieWorkflow$$ExternalSyntheticLambda2 selfieWorkflow$$ExternalSyntheticLambda2, String str8, GovernmentIdWorkflow$$ExternalSyntheticLambda9 governmentIdWorkflow$$ExternalSyntheticLambda9, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, boolean z) {
        realImageLoader.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        navigationState.getClass();
        this.imageLoader = realImageLoader;
        this.title = str;
        this.body = str2;
        this.confirmButtonText = str3;
        this.chooseNewPhotoText = str4;
        this.fileToReviewPath = str5;
        this.fileMimeType = str6;
        this.fileName = str7;
        this.navigationState = navigationState;
        this.onUsePhotoClick = governmentIdWorkflow$$ExternalSyntheticLambda6;
        this.onChooseNewPhotoClick = governmentIdWorkflow$$ExternalSyntheticLambda0;
        this.onBack = governmentIdWorkflow$$ExternalSyntheticLambda02;
        this.onCancel = selfieWorkflow$$ExternalSyntheticLambda2;
        this.error = str8;
        this.onErrorDismissed = governmentIdWorkflow$$ExternalSyntheticLambda9;
        this.styles = governmentIdStepStyle;
        this.isAutoClassifying = z;
        this.viewFactory = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(ReviewSelectedImageView.class), ReviewSelectedImageView$viewFactory$1.INSTANCE, new HCaptcha$$ExternalSyntheticLambda2(this, 17));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReviewSelectedImageView) {
            ReviewSelectedImageView reviewSelectedImageView = (ReviewSelectedImageView) obj;
            if (Intrinsics.areEqual(this.imageLoader, reviewSelectedImageView.imageLoader) && this.title.equals(reviewSelectedImageView.title) && this.body.equals(reviewSelectedImageView.body) && Intrinsics.areEqual(this.confirmButtonText, reviewSelectedImageView.confirmButtonText) && Intrinsics.areEqual(this.chooseNewPhotoText, reviewSelectedImageView.chooseNewPhotoText) && Intrinsics.areEqual(this.fileToReviewPath, reviewSelectedImageView.fileToReviewPath) && Intrinsics.areEqual(this.fileMimeType, reviewSelectedImageView.fileMimeType) && Intrinsics.areEqual(this.fileName, reviewSelectedImageView.fileName) && Intrinsics.areEqual(this.navigationState, reviewSelectedImageView.navigationState) && this.onUsePhotoClick == reviewSelectedImageView.onUsePhotoClick && this.onChooseNewPhotoClick == reviewSelectedImageView.onChooseNewPhotoClick && this.onBack == reviewSelectedImageView.onBack && this.onCancel == reviewSelectedImageView.onCancel && Intrinsics.areEqual(this.error, reviewSelectedImageView.error) && this.onErrorDismissed == reviewSelectedImageView.onErrorDismissed && Intrinsics.areEqual(this.styles, reviewSelectedImageView.styles) && this.isAutoClassifying == reviewSelectedImageView.isAutoClassifying) {
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
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.imageLoader.hashCode() * 31, 31, this.title), 31, this.body), 31, this.confirmButtonText), 31, this.chooseNewPhotoText), 31, this.fileToReviewPath), 31, this.fileMimeType);
        String str = this.fileName;
        int hashCode = (this.onCancel.hashCode() + ((this.onBack.hashCode() + ((this.onChooseNewPhotoClick.hashCode() + ((this.onUsePhotoClick.hashCode() + ((this.navigationState.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str2 = this.error;
        int hashCode2 = (this.onErrorDismissed.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        return Boolean.hashCode(this.isAutoClassifying) + ((hashCode2 + (governmentIdStepStyle != null ? governmentIdStepStyle.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewSelectedImageView(imageLoader=");
        sb.append(this.imageLoader);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", body=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.body, ", confirmButtonText=", this.confirmButtonText, ", chooseNewPhotoText=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.chooseNewPhotoText, ", fileToReviewPath=", this.fileToReviewPath, ", fileMimeType=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.fileMimeType, ", fileName=", this.fileName, ", navigationState=");
        sb.append(this.navigationState);
        sb.append(", onUsePhotoClick=");
        sb.append(this.onUsePhotoClick);
        sb.append(", onChooseNewPhotoClick=");
        sb.append(this.onChooseNewPhotoClick);
        sb.append(", onBack=");
        sb.append(this.onBack);
        sb.append(", onCancel=");
        sb.append(this.onCancel);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", onErrorDismissed=");
        sb.append(this.onErrorDismissed);
        sb.append(", styles=");
        sb.append(this.styles);
        sb.append(", isAutoClassifying=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isAutoClassifying, ")");
    }
}
