package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import com.facebook.login.LoginClient;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class GetTokenClient extends PlatformServiceClient {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenClient(Context context, LoginClient.Request request) {
        super(context, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REPLY, NativeProtocol.PROTOCOL_VERSION_20121101, request.getApplicationId(), String.valueOf(request.getRedirectURI()), request.getNonce());
        context.getClass();
        request.getClass();
    }

    @Override // com.facebook.internal.PlatformServiceClient
    public void populateRequestBundle(Bundle bundle) {
        bundle.getClass();
    }
}
