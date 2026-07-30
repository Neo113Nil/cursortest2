package com.squareup.picasso;

import androidx.annotation.NonNull;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public interface j {
    @NonNull
    Response load(@NonNull Request request);

    void shutdown();
}
