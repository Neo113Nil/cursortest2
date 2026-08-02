package com.withpersona.sdk2.inquiry.steps.ui.components;

import com.squareup.workflow1.ui.TextControllerImpl;

/* loaded from: classes9.dex */
public abstract class InputAddressComponentKt {
    public static final void access$copyControllers(InputAddressComponent inputAddressComponent, InputAddressComponent inputAddressComponent2) {
        TextControllerImpl textControllerImpl = inputAddressComponent2.isAddressFieldCollapsed;
        textControllerImpl.getClass();
        inputAddressComponent.isAddressFieldCollapsed = textControllerImpl;
        TextControllerImpl textControllerImpl2 = inputAddressComponent2.textControllerForAddressStreet1;
        textControllerImpl2.getClass();
        inputAddressComponent.textControllerForAddressStreet1 = textControllerImpl2;
        TextControllerImpl textControllerImpl3 = inputAddressComponent2.textControllerForAddressStreet2;
        textControllerImpl3.getClass();
        inputAddressComponent.textControllerForAddressStreet2 = textControllerImpl3;
        TextControllerImpl textControllerImpl4 = inputAddressComponent2.textControllerForAddressCity;
        textControllerImpl4.getClass();
        inputAddressComponent.textControllerForAddressCity = textControllerImpl4;
        TextControllerImpl textControllerImpl5 = inputAddressComponent2.textControllerForAddressSubdivision;
        textControllerImpl5.getClass();
        inputAddressComponent.textControllerForAddressSubdivision = textControllerImpl5;
        TextControllerImpl textControllerImpl6 = inputAddressComponent2.textControllerForAddressPostalCode;
        textControllerImpl6.getClass();
        inputAddressComponent.textControllerForAddressPostalCode = textControllerImpl6;
    }
}
