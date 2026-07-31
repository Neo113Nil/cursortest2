package com.linecorp.linesdk.message.flex.action;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.message.flex.action.Action;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class UriAction extends Action {

    @NonNull
    private String uri;

    public UriAction(@NonNull String str, String str2) {
        super(Action.Type.URI, str2);
        this.uri = str;
    }

    @Override // com.linecorp.linesdk.message.flex.action.Action, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put("uri", this.uri);
        return jsonObject;
    }

    public UriAction(@NonNull String str) {
        this(str, null);
    }
}
