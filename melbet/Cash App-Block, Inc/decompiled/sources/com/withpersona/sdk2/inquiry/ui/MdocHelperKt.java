package com.withpersona.sdk2.inquiry.ui;

import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.Credential;
import androidx.credentials.CustomCredential;
import androidx.credentials.DigitalCredential;
import com.withpersona.sdk2.inquiry.steps.ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CancelButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CompleteButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class MdocHelperKt {
    public static final UiModule_ProvideViewBindingsFactory INSTANCE = new UiModule_ProvideViewBindingsFactory(1);
    public static final UiModule_ProvideViewBindingsFactory INSTANCE$1 = new UiModule_ProvideViewBindingsFactory(0);

    public static final String createReusablePersonaUrl(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        String uri = Uri.parse(str).buildUpon().appendQueryParameter("code", str2).appendQueryParameter("component", str3).build().toString();
        uri.getClass();
        return uri;
    }

    public static final String getResponseData(Credential credential) {
        try {
            if (credential instanceof DigitalCredential) {
                return ((DigitalCredential) credential).credentialJson;
            }
            if (!(credential instanceof CustomCredential)) {
                return null;
            }
            byte[] byteArray = ((Bundle) credential.data).getByteArray("identityToken");
            String str = byteArray != null ? new String(byteArray, Charsets.UTF_8) : null;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", new JSONObject(str));
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final UiStepButtonType toButtonType(UiComponent uiComponent) {
        uiComponent.getClass();
        if (uiComponent instanceof ActionButtonComponent) {
            return UiStepButtonType.Action;
        }
        if (uiComponent instanceof CompleteButtonComponent) {
            return UiStepButtonType.Complete;
        }
        if (uiComponent instanceof SubmitButtonComponent) {
            return UiStepButtonType.Submit;
        }
        if (uiComponent instanceof CancelButtonComponent) {
            return UiStepButtonType.Cancel;
        }
        if (uiComponent instanceof ClickableStackComponent) {
            return UiStepButtonType.ClickableStack;
        }
        if (uiComponent instanceof VerifyPersonaButtonComponent) {
            return UiStepButtonType.ReusablePersona;
        }
        if (uiComponent instanceof GovernmentIdNfcScanComponent) {
            return UiStepButtonType.Nfc;
        }
        if (uiComponent instanceof MdocComponent) {
            return UiStepButtonType.Mdoc;
        }
        return null;
    }
}
