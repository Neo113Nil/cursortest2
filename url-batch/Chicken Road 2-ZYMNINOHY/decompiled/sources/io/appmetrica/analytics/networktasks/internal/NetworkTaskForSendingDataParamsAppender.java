package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;

/* loaded from: classes.dex */
public class NetworkTaskForSendingDataParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f13332a;

    public NetworkTaskForSendingDataParamsAppender(RequestBodyEncrypter requestBodyEncrypter) {
        this.f13332a = requestBodyEncrypter;
    }

    public void appendEncryptedData(Uri.Builder builder) {
        if (this.f13332a.getEncryptionMode() == RequestBodyEncryptionMode.AES_RSA) {
            builder.appendQueryParameter(CommonUrlParts.ENCRYPTED_REQUEST, "1");
        }
    }
}
