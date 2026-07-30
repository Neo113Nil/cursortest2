package com.facebook;

import android.content.Intent;
import com.facebook.internal.Utility;
import defpackage.kf1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ProfileManager {
    public static final String ACTION_CURRENT_PROFILE_CHANGED = "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED";
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_NEW_PROFILE = "com.facebook.sdk.EXTRA_NEW_PROFILE";
    public static final String EXTRA_OLD_PROFILE = "com.facebook.sdk.EXTRA_OLD_PROFILE";
    private static volatile ProfileManager instance;
    private Profile currentProfileField;
    private final kf1 localBroadcastManager;
    private final ProfileCache profileCache;

    public ProfileManager(kf1 kf1Var, ProfileCache profileCache) {
        kf1Var.getClass();
        profileCache.getClass();
        this.localBroadcastManager = kf1Var;
        this.profileCache = profileCache;
    }

    public static final synchronized ProfileManager getInstance() {
        ProfileManager companion;
        synchronized (ProfileManager.class) {
            companion = Companion.getInstance();
        }
        return companion;
    }

    private final void sendCurrentProfileChangedBroadcast(Profile profile, Profile profile2) {
        Intent intent = new Intent(ACTION_CURRENT_PROFILE_CHANGED);
        intent.putExtra(EXTRA_OLD_PROFILE, profile);
        intent.putExtra(EXTRA_NEW_PROFILE, profile2);
        this.localBroadcastManager.c(intent);
    }

    private final void setCurrentProfile(Profile profile, boolean z) {
        Profile profile2 = this.currentProfileField;
        this.currentProfileField = profile;
        if (z) {
            ProfileCache profileCache = this.profileCache;
            if (profile != null) {
                profileCache.save(profile);
            } else {
                profileCache.clear();
            }
        }
        if (Utility.areObjectsEqual(profile2, profile)) {
            return;
        }
        sendCurrentProfileChangedBroadcast(profile2, profile);
    }

    public final Profile getCurrentProfile() {
        return this.currentProfileField;
    }

    public final boolean loadCurrentProfile() {
        Profile load = this.profileCache.load();
        if (load == null) {
            return false;
        }
        setCurrentProfile(load, false);
        return true;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized ProfileManager getInstance() {
            ProfileManager profileManager;
            try {
                if (ProfileManager.instance == null) {
                    kf1 a = kf1.a(FacebookSdk.getApplicationContext());
                    a.getClass();
                    ProfileManager.instance = new ProfileManager(a, new ProfileCache());
                }
                profileManager = ProfileManager.instance;
                if (profileManager == null) {
                    Intrinsics.f("instance");
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
            return profileManager;
        }

        private Companion() {
        }
    }

    public final void setCurrentProfile(Profile profile) {
        setCurrentProfile(profile, true);
    }
}
