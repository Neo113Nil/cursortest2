package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.internal.Validate;
import defpackage.kf1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ProfileTracker {
    private final kf1 broadcastManager;
    private boolean isTracking;
    private final BroadcastReceiver receiver;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class ProfileBroadcastReceiver extends BroadcastReceiver {
        public ProfileBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            if (ProfileManager.ACTION_CURRENT_PROFILE_CHANGED.equals(intent.getAction())) {
                ProfileTracker.this.onCurrentProfileChanged((Profile) intent.getParcelableExtra(ProfileManager.EXTRA_OLD_PROFILE), (Profile) intent.getParcelableExtra(ProfileManager.EXTRA_NEW_PROFILE));
            }
        }
    }

    public ProfileTracker() {
        Validate.sdkInitialized();
        this.receiver = new ProfileBroadcastReceiver();
        kf1 a = kf1.a(FacebookSdk.getApplicationContext());
        a.getClass();
        this.broadcastManager = a;
        startTracking();
    }

    private final void addBroadcastReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ProfileManager.ACTION_CURRENT_PROFILE_CHANGED);
        this.broadcastManager.b(this.receiver, intentFilter);
    }

    public final boolean isTracking() {
        return this.isTracking;
    }

    public abstract void onCurrentProfileChanged(Profile profile, Profile profile2);

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
}
