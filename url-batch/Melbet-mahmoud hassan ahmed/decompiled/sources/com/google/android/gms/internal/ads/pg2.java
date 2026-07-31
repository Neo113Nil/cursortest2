package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class pg2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f10235a;

    public pg2(Boolean bool) {
        this.f10235a = bool;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        Boolean bool = this.f10235a;
        if (bool != null) {
            bundle2.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
