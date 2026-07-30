package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import defpackage.kf1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class AuthenticationTokenTracker {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AuthenticationTokenTracker";
    private final kf1 broadcastManager;
    private boolean isTracking;
    private final BroadcastReceiver receiver;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class CurrentAuthenticationTokenBroadcastReceiver extends BroadcastReceiver {
        public CurrentAuthenticationTokenBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            if (AuthenticationTokenManager.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED.equals(intent.getAction())) {
                Utility.logd(AuthenticationTokenTracker.TAG, "AuthenticationTokenChanged");
                AuthenticationTokenTracker.this.onCurrentAuthenticationTokenChanged((AuthenticationToken) intent.getParcelableExtra(AuthenticationTokenManager.EXTRA_OLD_AUTHENTICATION_TOKEN), (AuthenticationToken) intent.getParcelableExtra(AuthenticationTokenManager.EXTRA_NEW_AUTHENTICATION_TOKEN));
            }
        }
    }

    public AuthenticationTokenTracker() {
        Validate.sdkInitialized();
        this.receiver = new CurrentAuthenticationTokenBroadcastReceiver();
        kf1 a = kf1.a(FacebookSdk.getApplicationContext());
        a.getClass();
        this.broadcastManager = a;
        startTracking();
    }

    private final void addBroadcastReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AuthenticationTokenManager.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED);
        this.broadcastManager.b(this.receiver, intentFilter);
    }

    public final boolean isTracking() {
        return this.isTracking;
    }

    public abstract void onCurrentAuthenticationTokenChanged(AuthenticationToken authenticationToken, AuthenticationToken authenticationToken2);

    public final void startTracking() {
        if (this.isTracking) {
            return;
        }
        addBroadcastReceiver();
        this.isTracking = true;
    }

    public final void stopTracking() {
        if (this.isTracking) {
            this.broadcastManager.d(this.receiver);
            this.isTracking = false;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
