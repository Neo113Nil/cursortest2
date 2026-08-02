package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* loaded from: classes.dex */
public final class s implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f4403a = System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public final AdPreferences.Placement f4404b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4405c;

    public s(AdPreferences.Placement placement, String str) {
        this.f4404b = placement;
        this.f4405c = str == null ? "" : str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = this.f4403a - ((s) obj).f4403a;
        if (j3 > 0) {
            return 1;
        }
        return j3 == 0 ? 0 : -1;
    }
}
