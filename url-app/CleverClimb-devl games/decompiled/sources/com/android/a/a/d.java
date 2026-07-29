package com.android.a.a;

import android.os.Bundle;

/* compiled from: ReferrerDetails.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f2254a;

    public d(Bundle bundle) {
        this.f2254a = bundle;
    }

    public String a() {
        return this.f2254a.getString("install_referrer");
    }

    public long b() {
        return this.f2254a.getLong("referrer_click_timestamp_seconds");
    }

    public long c() {
        return this.f2254a.getLong("install_begin_timestamp_seconds");
    }
}
