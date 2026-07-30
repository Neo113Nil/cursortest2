package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.internal.Utility;
import defpackage.kf1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AuthenticationTokenManager {
    public static final String ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED";
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_NEW_AUTHENTICATION_TOKEN = "com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN";
    public static final String EXTRA_OLD_AUTHENTICATION_TOKEN = "com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN";
    public static final String SHARED_PREFERENCES_NAME = "com.facebook.AuthenticationTokenManager.SharedPreferences";
    public static final String TAG = "AuthenticationTokenManager";
    private static AuthenticationTokenManager instanceField;
    private final AuthenticationTokenCache authenticationTokenCache;
    private AuthenticationToken currentAuthenticationTokenField;
    private final kf1 localBroadcastManager;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
        }
    }

    public AuthenticationTokenManager(kf1 kf1Var, AuthenticationTokenCache authenticationTokenCache) {
        kf1Var.getClass();
        authenticationTokenCache.getClass();
        this.localBroadcastManager = kf1Var;
        this.authenticationTokenCache = authenticationTokenCache;
    }

    public static final AuthenticationTokenManager getInstance() {
        return Companion.getInstance();
    }

    private final void sendCurrentAuthenticationTokenChangedBroadcastIntent(AuthenticationToken authenticationToken, AuthenticationToken authenticationToken2) {
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), (Class<?>) CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction(ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED);
        intent.putExtra(EXTRA_OLD_AUTHENTICATION_TOKEN, authenticationToken);
        intent.putExtra(EXTRA_NEW_AUTHENTICATION_TOKEN, authenticationToken2);
        this.localBroadcastManager.c(intent);
    }

    private final void setCurrentAuthenticationToken(AuthenticationToken authenticationToken, boolean z) {
        AuthenticationToken currentAuthenticationToken = getCurrentAuthenticationToken();
        this.currentAuthenticationTokenField = authenticationToken;
        if (z) {
            AuthenticationTokenCache authenticationTokenCache = this.authenticationTokenCache;
            if (authenticationToken != null) {
                authenticationTokenCache.save(authenticationToken);
            } else {
                authenticationTokenCache.clear();
                Utility.clearFacebookCookies(FacebookSdk.getApplicationContext());
            }
        }
        if (Utility.areObjectsEqual(currentAuthenticationToken, authenticationToken)) {
            return;
        }
        sendCurrentAuthenticationTokenChangedBroadcastIntent(currentAuthenticationToken, authenticationToken);
    }

    public final void currentAuthenticationTokenChanged() {
        sendCurrentAuthenticationTokenChangedBroadcastIntent(getCurrentAuthenticationToken(), getCurrentAuthenticationToken());
    }

    public final AuthenticationToken getCurrentAuthenticationToken() {
        return this.currentAuthenticationTokenField;
    }

    public final boolean loadCurrentAuthenticationToken() {
        AuthenticationToken load = this.authenticationTokenCache.load();
        if (load == null) {
            return false;
        }
        setCurrentAuthenticationToken(load, false);
        return true;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AuthenticationTokenManager getInstance() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.instanceField;
            if (authenticationTokenManager2 != null) {
                return authenticationTokenManager2;
            }
            synchronized (this) {
                authenticationTokenManager = AuthenticationTokenManager.instanceField;
                if (authenticationTokenManager == null) {
                    kf1 a = kf1.a(FacebookSdk.getApplicationContext());
                    a.getClass();
                    AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(a, new AuthenticationTokenCache());
                    AuthenticationTokenManager.instanceField = authenticationTokenManager3;
                    authenticationTokenManager = authenticationTokenManager3;
                }
            }
            return authenticationTokenManager;
        }

        private Companion() {
        }
    }

    public final void setCurrentAuthenticationToken(AuthenticationToken authenticationToken) {
        setCurrentAuthenticationToken(authenticationToken, true);
    }
}
