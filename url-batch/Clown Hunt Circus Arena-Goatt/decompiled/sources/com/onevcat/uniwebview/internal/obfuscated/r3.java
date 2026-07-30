package com.onevcat.uniwebview.internal.obfuscated;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r3 implements F3 {
    public final com.onevcat.uniwebview.a a;

    public r3(com.onevcat.uniwebview.a webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.a = webView;
    }

    public final void a(H3 method, String parameters) {
        H3 h3;
        Double doubleOrNull;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        com.onevcat.uniwebview.a aVar = this.a;
        if (Intrinsics.areEqual(aVar.g, aVar.b)) {
            this.a.getMessageSender().a(this.a.getName(), method, parameters);
            return;
        }
        com.onevcat.uniwebview.a e = this.a.e();
        if (e != null && e.getPopupPageEventEnabled$uniwebview_release()) {
            int ordinal = method.ordinal();
            if (ordinal == 0) {
                h3 = H3.PopupPageFinished;
            } else if (ordinal == 1) {
                h3 = H3.PopupPageStarted;
            } else if (ordinal == 2) {
                h3 = H3.PopupPageCommitted;
            } else if (ordinal == 3) {
                h3 = H3.PopupPageErrorReceived;
            } else if (ordinal != 4) {
                return;
            } else {
                h3 = H3.PopupPageProgressChanged;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("popupId", this.a.getName());
            int ordinal2 = method.ordinal();
            try {
                if (ordinal2 != 0) {
                    if (ordinal2 == 1 || ordinal2 == 2) {
                        jSONObject.put(ImagesContract.URL, parameters);
                    } else if (ordinal2 != 3) {
                        if (ordinal2 != 4 || (doubleOrNull = StringsKt.toDoubleOrNull(parameters)) == null) {
                            return;
                        } else {
                            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, doubleOrNull.doubleValue());
                        }
                    }
                    G3 rootMessageSender$uniwebview_release = e.getRootMessageSender$uniwebview_release();
                    String messageTargetName$uniwebview_release = e.getMessageTargetName$uniwebview_release();
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "wrapper.toString()");
                    rootMessageSender$uniwebview_release.a(messageTargetName$uniwebview_release, h3, jSONObject2);
                }
                jSONObject.put("payload", new JSONObject(parameters));
                G3 rootMessageSender$uniwebview_release2 = e.getRootMessageSender$uniwebview_release();
                String messageTargetName$uniwebview_release2 = e.getMessageTargetName$uniwebview_release();
                String jSONObject22 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject22, "wrapper.toString()");
                rootMessageSender$uniwebview_release2.a(messageTargetName$uniwebview_release2, h3, jSONObject22);
            } catch (Exception unused) {
            }
        }
    }
}
