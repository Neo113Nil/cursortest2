package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class s implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f7541a = System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public final AdPreferences.Placement f7542b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7543c;

    public s(AdPreferences.Placement placement, String str) {
        this.f7542b = placement;
        this.f7543c = str == null ? "" : str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j4 = this.f7541a - ((s) obj).f7541a;
        if (j4 > 0) {
            return 1;
        }
        return j4 == 0 ? 0 : -1;
    }
}
