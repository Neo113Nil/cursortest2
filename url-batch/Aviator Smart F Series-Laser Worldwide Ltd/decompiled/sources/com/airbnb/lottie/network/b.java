package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import com.baidu.mapapi.http.wrapper.HttpManager;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public class b implements e {
    @Override // com.airbnb.lottie.network.e
    @NonNull
    public c fetchSync(@NonNull String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(HttpManager.HTTP_GET);
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }
}
