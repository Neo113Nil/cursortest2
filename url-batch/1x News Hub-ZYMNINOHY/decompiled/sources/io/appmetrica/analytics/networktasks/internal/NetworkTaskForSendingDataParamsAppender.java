package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;

/* loaded from: classes.dex */
public class NetworkTaskForSendingDataParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f8913a;

    public NetworkTaskForSendingDataParamsAppender(RequestBodyEncrypter requestBodyEncrypter) {
        this.f8913a = requestBodyEncrypter;
    }

    public void appendEncryptedData(Uri.Builder builder) {
        if (this.f8913a.getEncryptionMode() == RequestBodyEncryptionMode.AES_RSA) {
            builder.appendQueryParameter(CommonUrlParts.ENCRYPTED_REQUEST, "1");
        }
    }
}
