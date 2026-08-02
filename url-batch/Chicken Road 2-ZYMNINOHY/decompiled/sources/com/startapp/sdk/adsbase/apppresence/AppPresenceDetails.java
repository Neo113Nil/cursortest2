package com.startapp.sdk.adsbase.apppresence;

import java.io.Serializable;

/* loaded from: classes.dex */
public class AppPresenceDetails implements Serializable {
    private static final long serialVersionUID = -6732887070965278910L;
    private int adAttempt;
    private int minAppVersion;
    private String packageName;
    private String trackingUrl;
    private boolean isShown = true;
    private boolean appPresence = false;

    public AppPresenceDetails(int i4, int i5, String str, String str2) {
        this.trackingUrl = str;
        this.packageName = str2;
        this.adAttempt = i4;
        this.minAppVersion = i5;
    }

    public final void a(String str) {
        this.trackingUrl = str;
    }

    public final String b() {
        return this.packageName;
    }

    public final String c() {
        return this.trackingUrl;
    }

    public final boolean d() {
        return this.appPresence;
    }

    public final boolean e() {
        return this.isShown;
    }

    public final void a(boolean z) {
        this.appPresence = z;
    }

    public final void b(boolean z) {
        this.isShown = z;
    }

    public final int a() {
        return this.minAppVersion;
    }
}
