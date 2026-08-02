package com.withpersona.sdk2.inquiry.permissions;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.workflow1.ui.AndroidViewRendering;
import com.squareup.workflow1.ui.DecorativeViewFactory;
import com.squareup.workflow1.ui.ViewFactory;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes9.dex */
public final class OldBottomSheetDialogView implements AndroidViewRendering {
    public final String messageText;
    public final String negativeButtonText;
    public final Function0 onNegativeButtonClick;
    public final Function0 onPositiveButtonClick;
    public final String positiveButtonText;
    public final StepStyle styles;
    public final String titleText;
    public final DecorativeViewFactory viewFactory;

    public OldBottomSheetDialogView(String str, String str2, String str3, StepStyle stepStyle, Function0 function0, String str4, Function0 function02) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.titleText = str;
        this.messageText = str2;
        this.positiveButtonText = str3;
        this.styles = stepStyle;
        this.onPositiveButtonClick = function0;
        this.negativeButtonText = str4;
        this.onNegativeButtonClick = function02;
        this.viewFactory = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(OldBottomSheetDialogView.class), OldBottomSheetDialogView$viewFactory$1.INSTANCE, new HCaptcha$$ExternalSyntheticLambda2(this, 28));
    }

    @Override // com.squareup.workflow1.ui.AndroidViewRendering
    public final ViewFactory getViewFactory() {
        return this.viewFactory;
    }
}
