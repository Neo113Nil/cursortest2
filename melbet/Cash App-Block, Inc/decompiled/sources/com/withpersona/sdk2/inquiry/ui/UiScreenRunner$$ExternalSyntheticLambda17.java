package com.withpersona.sdk2.inquiry.ui;

import android.widget.ImageView;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent.AnonymousClass4;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.ui.databinding.Pi2InquiryUiBinding;
import dev.chrisbanes.haze.BlurEffectKt$$ExternalSyntheticLambda1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiScreenRunner$$ExternalSyntheticLambda17 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UiComponent f$0;
    public final /* synthetic */ UiScreenRunner f$1;

    public /* synthetic */ UiScreenRunner$$ExternalSyntheticLambda17(int i, UiComponent uiComponent, UiScreenRunner uiScreenRunner) {
        this.$r8$classId = i;
        this.f$0 = uiComponent;
        this.f$1 = uiScreenRunner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        UiScreenRunner uiScreenRunner = this.f$1;
        UiComponent uiComponent = this.f$0;
        switch (i) {
            case 0:
                UiScreenRunner.updateRendering$lambda$69$showInputSelectBottomSheet$64(uiScreenRunner, ((InputInternationalDbComponent) uiComponent).countrySelectComponent, new UiScreenRunner$$ExternalSyntheticLambda35(uiComponent, 2));
                break;
            case 1:
                InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
                LinkedHashMap linkedHashMap = inputInternationalDbComponent.typesByCountryCode;
                List list = linkedHashMap != null ? (List) linkedHashMap.get(inputInternationalDbComponent.selectedCountry) : null;
                UiScreenRunner.updateRendering$lambda$69$showInputSelectBottomSheet$64(uiScreenRunner, list != null ? inputInternationalDbComponent.new AnonymousClass4(list) : null, new UiScreenRunner$$ExternalSyntheticLambda35(uiComponent, 0));
                break;
            default:
                InputPhoneNumberComponent.AnonymousClass1 anonymousClass1 = ((InputPhoneNumberComponent) uiComponent).countryCodeSelectComponent;
                UiScreenRunner$$ExternalSyntheticLambda35 uiScreenRunner$$ExternalSyntheticLambda35 = new UiScreenRunner$$ExternalSyntheticLambda35(uiComponent, 1);
                if (anonymousClass1 != null) {
                    Pi2InquiryUiBinding pi2InquiryUiBinding = uiScreenRunner.binding;
                    ((ImageView) pi2InquiryUiBinding.navigationBar.binding.navBarBackButton).setEnabled(false);
                    pi2InquiryUiBinding.navigationBar.setImportantForAccessibility(4);
                    pi2InquiryUiBinding.uiStepContainer.setImportantForAccessibility(4);
                    uiScreenRunner.inputSelectBottomSheetController.show(anonymousClass1, new BlurEffectKt$$ExternalSyntheticLambda1(6, uiScreenRunner, uiScreenRunner$$ExternalSyntheticLambda35));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
