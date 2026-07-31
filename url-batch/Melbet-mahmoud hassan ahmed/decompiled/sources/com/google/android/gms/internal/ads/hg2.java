package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class hg2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    public final String f6241a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6242b;

    public hg2(String str, boolean z6) {
        this.f6241a = str;
        this.f6242b = z6;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("gct", this.f6241a);
        if (this.f6242b) {
            bundle2.putString("de", "1");
        }
    }
}
