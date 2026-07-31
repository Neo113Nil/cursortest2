package com.linecorp.linesdk.internal.nwclient.core;

import androidx.annotation.NonNull;
import java.io.InputStream;

/* loaded from: classes2.dex */
public interface ResponseDataParser<T> {
    @NonNull
    T getResponseData(@NonNull InputStream inputStream);
}
