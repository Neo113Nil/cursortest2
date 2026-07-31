package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ug2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final String f12788a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12789b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12790c;

    public ug2(String str, boolean z6, boolean z7) {
        this.f12788a = str;
        this.f12789b = z6;
        this.f12790c = z7;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!this.f12788a.isEmpty()) {
            bundle2.putString("inspector_extras", this.f12788a);
        }
        bundle2.putInt("test_mode", this.f12789b ? 1 : 0);
        bundle2.putInt("linked_device", this.f12790c ? 1 : 0);
    }
}
