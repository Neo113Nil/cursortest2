package com.facebook;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.internal.ab;
import com.facebook.internal.ac;

/* compiled from: ProfileManager.java */
/* loaded from: classes.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    private static volatile w f6465a;

    /* renamed from: b, reason: collision with root package name */
    private final LocalBroadcastManager f6466b;

    /* renamed from: c, reason: collision with root package name */
    private final v f6467c;

    /* renamed from: d, reason: collision with root package name */
    private Profile f6468d;

    w(LocalBroadcastManager localBroadcastManager, v vVar) {
        ac.a(localBroadcastManager, "localBroadcastManager");
        ac.a(vVar, "profileCache");
        this.f6466b = localBroadcastManager;
        this.f6467c = vVar;
    }

    static w a() {
        if (f6465a == null) {
            synchronized (w.class) {
                if (f6465a == null) {
                    f6465a = new w(LocalBroadcastManager.getInstance(l.f()), new v());
                }
            }
        }
        return f6465a;
    }

    Profile b() {
        return this.f6468d;
    }

    boolean c() {
        Profile a2 = this.f6467c.a();
        if (a2 == null) {
            return false;
        }
        a(a2, false);
        return true;
    }

    void a(Profile profile) {
        a(profile, true);
    }

    private void a(Profile profile, boolean z) {
        Profile profile2 = this.f6468d;
        this.f6468d = profile;
        if (z) {
            if (profile != null) {
                this.f6467c.a(profile);
            } else {
                this.f6467c.b();
            }
        }
        if (ab.a(profile2, profile)) {
            return;
        }
        a(profile2, profile);
    }

    private void a(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f6466b.sendBroadcast(intent);
    }
}
