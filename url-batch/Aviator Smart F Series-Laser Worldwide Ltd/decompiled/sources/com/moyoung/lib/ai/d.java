package com.moyoung.lib.ai;

import android.util.Log;
import androidx.annotation.NonNull;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public class d implements Interceptor {
    private static final String TAG = "Moyoung OkHttp";

    private boolean isBinaryContent(String str) {
        return str != null && (str.startsWith("audio/") || str.startsWith("image/") || str.startsWith("video/") || str.equals("application/octet-stream") || str.contains("mp3") || str.contains("mpeg") || str.contains("wav"));
    }

    @Override // okhttp3.Interceptor
    @NonNull
    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        if (e.isPrintLog()) {
            Log.d(TAG, "=== HTTP REQUEST ===");
            Log.d(TAG, "Method: " + request.method());
            Log.d(TAG, "URL: " + request.url());
        }
        if (e.isPrintLog()) {
            Log.d(TAG, "Headers:");
        }
        int size = request.headers().size();
        for (int i8 = 0; i8 < size; i8++) {
            if (e.isPrintLog()) {
                Log.d(TAG, request.headers().name(i8) + ": " + request.headers().value(i8));
            }
        }
        if (request.body() != null) {
            okio.c cVar = new okio.c();
            request.body().writeTo(cVar);
            if (e.isPrintLog()) {
                Log.d(TAG, "Body: " + cVar.readUtf8());
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        Response proceed = chain.proceed(request);
        long currentTimeMillis2 = System.currentTimeMillis();
        if (e.isPrintLog()) {
            Log.d(TAG, "=== HTTP RESPONSE ===");
            Log.d(TAG, "Status Code: " + proceed.code());
            Log.d(TAG, "Time: " + (currentTimeMillis2 - currentTimeMillis) + "ms");
        }
        if (e.isPrintLog()) {
            Log.d(TAG, "Response Headers:");
        }
        int size2 = proceed.headers().size();
        for (int i9 = 0; i9 < size2; i9++) {
            if (e.isPrintLog()) {
                Log.d(TAG, proceed.headers().name(i9) + ": " + proceed.headers().value(i9));
            }
        }
        if (proceed.body() == null) {
            return proceed;
        }
        String header = proceed.header("Content-Type", "");
        if (!isBinaryContent(header)) {
            ResponseBody body = proceed.body();
            String string = body.string();
            if (e.isPrintLog()) {
                Log.d(TAG, "Response Body: " + string);
            }
            return proceed.newBuilder().body(ResponseBody.create(string, body.contentType())).build();
        }
        if (!e.isPrintLog()) {
            return proceed;
        }
        Log.d(TAG, "Binary content detected: " + header);
        Log.d(TAG, "Content-Length: " + proceed.body().contentLength());
        return proceed;
    }
}
