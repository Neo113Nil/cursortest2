package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;

/* loaded from: classes.dex */
public class NetworkTaskForSendingDataParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f9889a;

    public NetworkTaskForSendingDataParamsAppender(RequestBodyEncrypter requestBodyEncrypter) {
        this.f9889a = requestBodyEncrypter;
    }

    public void appendEncryptedData(Uri.Builder builder) {
        if (this.f9889a.getEncryptionMode() == RequestBodyEncryptionMode.AES_RSA) {
            builder.appendQueryParameter(CommonUrlParts.ENCRYPTED_REQUEST, "1");
        }
    }
}
