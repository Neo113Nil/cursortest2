package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class LoginStatusClient extends PlatformServiceClient {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_TOAST_DURATION_MS = 5000;
    private final String graphApiVersion;
    private final String loggerRef;
    private final long toastDurationMs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginStatusClient(Context context, String str, String str2, String str3, String str4, long j, String str5) {
        super(context, NativeProtocol.MESSAGE_GET_LOGIN_STATUS_REQUEST, NativeProtocol.MESSAGE_GET_LOGIN_STATUS_REPLY, NativeProtocol.PROTOCOL_VERSION_20170411, str, str2, str5);
        context.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.loggerRef = str3;
        this.graphApiVersion = str4;
        this.toastDurationMs = j;
    }

    @Override // com.facebook.internal.PlatformServiceClient
    public void populateRequestBundle(Bundle bundle) {
        bundle.getClass();
        bundle.putString(NativeProtocol.EXTRA_LOGGER_REF, this.loggerRef);
        bundle.putString(NativeProtocol.EXTRA_GRAPH_API_VERSION, this.graphApiVersion);
        bundle.putLong(NativeProtocol.EXTRA_TOAST_DURATION_MS, this.toastDurationMs);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LoginStatusClient newInstance$facebook_common_release(Context context, String str, String str2, String str3, String str4, long j, String str5) {
            context.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            return new LoginStatusClient(context, str, str2, str3, str4, j, str5);
        }

        private Companion() {
        }
    }
}
