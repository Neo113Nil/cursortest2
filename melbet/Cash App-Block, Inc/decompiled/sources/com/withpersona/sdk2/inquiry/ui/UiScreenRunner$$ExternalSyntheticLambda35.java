package com.withpersona.sdk2.inquiry.ui;

import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiScreenRunner$$ExternalSyntheticLambda35 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UiComponent f$0;

    public /* synthetic */ UiScreenRunner$$ExternalSyntheticLambda35(UiComponent uiComponent, int i) {
        this.$r8$classId = i;
        this.f$0 = uiComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        UiComponent uiComponent = this.f$0;
        List list = (List) obj;
        switch (i) {
            case 0:
                list.getClass();
                InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
                inputInternationalDbComponent.idTypeOptionsController.setValue(list);
                inputInternationalDbComponent.idValueController.setTextValue("");
                break;
            case 1:
                list.getClass();
                ((InputPhoneNumberComponent) uiComponent).countryCodeOptionsController.setValue(list);
                break;
            default:
                list.getClass();
                InputInternationalDbComponent inputInternationalDbComponent2 = (InputInternationalDbComponent) uiComponent;
                inputInternationalDbComponent2.countryOptionsController.setValue(list);
                inputInternationalDbComponent2.idTypeOptionsController.setValue(EmptyList.INSTANCE);
                inputInternationalDbComponent2.idValueController.setTextValue("");
                break;
        }
        return Unit.INSTANCE;
    }
}
