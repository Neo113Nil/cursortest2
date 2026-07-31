package com.linecorp.linesdk.internal.nwclient;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.internal.nwclient.core.ResponseDataParser;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class NoResultResponseParser implements ResponseDataParser<Object> {
    private static final Object NO_RESULT = new Object();

    NoResultResponseParser() {
    }

    @Override // com.linecorp.linesdk.internal.nwclient.core.ResponseDataParser
    @NonNull
    public Object getResponseData(@NonNull InputStream inputStream) {
        return NO_RESULT;
    }
}
