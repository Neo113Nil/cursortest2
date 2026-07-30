package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookSdk;
import com.facebook.internal.CustomTabUtils;
import com.facebook.internal.NativeProtocol;
import com.facebook.login.LoginClient;
import defpackage.kr0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    private final String nameForLogging;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new Parcelable.Creator<KatanaProxyLoginMethodHandler>() { // from class: com.facebook.login.KatanaProxyLoginMethodHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public KatanaProxyLoginMethodHandler[] newArray(int i) {
            return new KatanaProxyLoginMethodHandler[i];
        }
    };

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        loginClient.getClass();
        this.nameForLogging = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean shouldKeepTrackOfMultipleIntents() {
        return true;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler, com.facebook.login.LoginMethodHandler
    public int tryAuthorize(LoginClient.Request request) {
        request.getClass();
        boolean z = FacebookSdk.ignoreAppSwitchToLoggedOut && CustomTabUtils.getChromePackage() != null && request.getLoginBehavior().allowsCustomTabAuth();
        String e2e = LoginClient.Companion.getE2E();
        kr0 activity = getLoginClient().getActivity();
        String applicationId = request.getApplicationId();
        Set<String> permissions = request.getPermissions();
        boolean isRerequest = request.isRerequest();
        boolean hasPublishPermission = request.hasPublishPermission();
        DefaultAudience defaultAudience = request.getDefaultAudience();
        if (defaultAudience == null) {
            defaultAudience = DefaultAudience.NONE;
        }
        DefaultAudience defaultAudience2 = defaultAudience;
        String clientState = getClientState(request.getAuthId());
        String authType = request.getAuthType();
        String messengerPageId = request.getMessengerPageId();
        boolean resetMessengerState = request.getResetMessengerState();
        boolean isFamilyLogin = request.isFamilyLogin();
        boolean shouldSkipAccountDeduplication = request.shouldSkipAccountDeduplication();
        String nonce = request.getNonce();
        String codeChallenge = request.getCodeChallenge();
        CodeChallengeMethod codeChallengeMethod = request.getCodeChallengeMethod();
        List<Intent> createProxyAuthIntents = NativeProtocol.createProxyAuthIntents(activity, applicationId, permissions, e2e, isRerequest, hasPublishPermission, defaultAudience2, clientState, authType, z, messengerPageId, resetMessengerState, isFamilyLogin, shouldSkipAccountDeduplication, nonce, codeChallenge, codeChallengeMethod != null ? codeChallengeMethod.name() : null, request.getRedirectURI(), request.getIntentUriPackageTarget(), request.getForceConfirmation(), request.getAndroidSsoContext());
        addLoggingExtra("e2e", e2e);
        Iterator<Intent> it = createProxyAuthIntents.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            if (tryIntent(it.next(), LoginClient.Companion.getLoginRequestCode())) {
                return i;
            }
        }
        return 0;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
        parcel.getClass();
        this.nameForLogging = "katana_proxy_auth";
    }
}
