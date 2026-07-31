package com.linecorp.linesdk.internal.nwclient.core;

import androidx.annotation.NonNull;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes2.dex */
public class StringResponseParser implements ResponseDataParser<String> {
    private static final String DEFAULT_CHARSET_NAME = "UTF-8";

    @NonNull
    private final String charsetName;

    public StringResponseParser() {
        this(DEFAULT_CHARSET_NAME);
    }

    public StringResponseParser(@NonNull String str) {
        this.charsetName = str;
    }

    @Override // com.linecorp.linesdk.internal.nwclient.core.ResponseDataParser
    @NonNull
    public String getResponseData(@NonNull InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, this.charsetName));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        bufferedReader2.close();
                        return sb.toString();
                    }
                    sb.append(readLine);
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
