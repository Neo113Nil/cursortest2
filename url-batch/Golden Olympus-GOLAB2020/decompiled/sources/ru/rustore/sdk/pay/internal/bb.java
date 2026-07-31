package ru.rustore.sdk.pay.internal;

import com.ironsource.b9;
import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONObject;
import ru.rustore.sdk.pay.internal.za;

/* loaded from: classes3.dex */
public final class bb {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static za a(JSONObject jSONObject) {
        Object m243constructorimpl;
        String string;
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            string = jSONObject.getJSONObject("action_params").getString(b9.h.f15485j0);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (string != null) {
            switch (string.hashCode()) {
                case -2119002418:
                    if (!string.equals("form_client-validation-error-cardholder")) {
                        break;
                    } else {
                        obj = new za.j(mn.CARDHOLDER);
                        break;
                    }
                case -1738213231:
                    if (!string.equals("form_client-validation-error-cvv")) {
                        break;
                    } else {
                        obj = new za.j(mn.CVV);
                        break;
                    }
                case -317791845:
                    if (!string.equals("form_submit-button-click-all")) {
                        break;
                    } else {
                        obj = za.c.f45326a;
                        break;
                    }
                case 870905595:
                    if (!string.equals("form_client-validation-error")) {
                        break;
                    } else {
                        obj = new za.j(mn.CPG_FORM);
                        break;
                    }
                case 945363587:
                    if (!string.equals("form_server-validation-error")) {
                        break;
                    } else {
                        obj = new za.j(mn.SERVER);
                        break;
                    }
                case 1624149595:
                    if (!string.equals("form_client-validation-error-number")) {
                        break;
                    } else {
                        obj = new za.j(mn.NUMBER);
                        break;
                    }
                case 1949974336:
                    if (!string.equals("form_client-validation-error-date")) {
                        break;
                    } else {
                        obj = new za.j(mn.DATE);
                        break;
                    }
            }
            m243constructorimpl = Result.m243constructorimpl(obj);
            if (Result.d(m243constructorimpl) != null) {
                m243constructorimpl = za.i.f45333a;
            }
            return (za) m243constructorimpl;
        }
        obj = za.i.f45333a;
        m243constructorimpl = Result.m243constructorimpl(obj);
        if (Result.d(m243constructorimpl) != null) {
        }
        return (za) m243constructorimpl;
    }
}
