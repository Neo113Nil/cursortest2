package com.linecorp.linesdk.internal.nwclient.core;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class JsonResponseParser implements ResponseDataParser<JSONObject> {

    @NonNull
    private final StringResponseParser stringResponseParser;

    public JsonResponseParser() {
        this.stringResponseParser = new StringResponseParser();
    }

    @Override // com.linecorp.linesdk.internal.nwclient.core.ResponseDataParser
    @NonNull
    public JSONObject getResponseData(@NonNull InputStream inputStream) {
        try {
            return new JSONObject(this.stringResponseParser.getResponseData(inputStream));
        } catch (JSONException e4) {
            throw new IOException(e4);
        }
    }

    public JsonResponseParser(@NonNull String str) {
        this.stringResponseParser = new StringResponseParser(str);
    }
}
