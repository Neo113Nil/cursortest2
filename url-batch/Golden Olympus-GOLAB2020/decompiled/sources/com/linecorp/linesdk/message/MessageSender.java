package com.linecorp.linesdk.message;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MessageSender implements Jsonable {

    @NonNull
    private final String footerIconUrl;
    private final String footerLinkUrl;

    @NonNull
    private final String label;

    public MessageSender(@NonNull String str, @NonNull String str2, String str3) {
        this.label = str;
        this.footerIconUrl = str2;
        this.footerLinkUrl = str3;
    }

    @Override // com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.label);
        jSONObject.put("iconUrl", this.footerIconUrl);
        String str = this.footerLinkUrl;
        if (str != null) {
            jSONObject.put("linkUrl", str);
        }
        return jSONObject;
    }
}
