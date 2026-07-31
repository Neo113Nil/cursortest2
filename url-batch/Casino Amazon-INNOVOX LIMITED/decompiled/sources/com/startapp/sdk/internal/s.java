package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class s implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f410a = System.currentTimeMillis();
    public final AdPreferences.Placement b;
    public final String c;

    public s(AdPreferences.Placement placement, String str) {
        this.b = placement;
        this.c = str == null ? "" : str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f410a - ((s) obj).f410a;
        if (j > 0) {
            return 1;
        }
        return j == 0 ? 0 : -1;
    }
}
