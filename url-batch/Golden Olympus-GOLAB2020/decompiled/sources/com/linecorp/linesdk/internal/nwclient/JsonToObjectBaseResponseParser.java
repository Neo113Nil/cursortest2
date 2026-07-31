package com.linecorp.linesdk.internal.nwclient;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.internal.nwclient.core.JsonResponseParser;
import com.linecorp.linesdk.internal.nwclient.core.ResponseDataParser;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class JsonToObjectBaseResponseParser<T> implements ResponseDataParser<T> {

    @NonNull
    private final JsonResponseParser jsonResponseParser;

    public JsonToObjectBaseResponseParser() {
        this(new JsonResponseParser());
    }

    @Override // com.linecorp.linesdk.internal.nwclient.core.ResponseDataParser
    @NonNull
    public T getResponseData(@NonNull InputStream inputStream) {
        try {
            return parseJsonToObject(this.jsonResponseParser.getResponseData(inputStream));
        } catch (JSONException e4) {
            throw new IOException(e4);
        }
    }

    @NonNull
    protected abstract T parseJsonToObject(@NonNull JSONObject jSONObject);

    public JsonToObjectBaseResponseParser(@NonNull String str) {
        this(new JsonResponseParser(str));
    }

    JsonToObjectBaseResponseParser(@NonNull JsonResponseParser jsonResponseParser) {
        this.jsonResponseParser = jsonResponseParser;
    }
}
