package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zh2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final String f15110a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15111b;

    public zh2(String str, String str2) {
        this.f15110a = str;
        this.f15111b = str2;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        bundle.putString("request_id", ((Boolean) sw.c().b(m10.f8270o5)).booleanValue() ? this.f15111b : this.f15110a);
    }
}
