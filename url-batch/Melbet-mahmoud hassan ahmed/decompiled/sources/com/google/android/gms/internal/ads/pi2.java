package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class pi2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final String f10242a;

    public pi2(String str) {
        this.f10242a = str;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (TextUtils.isEmpty(this.f10242a)) {
            return;
        }
        bundle2.putString("query_info", this.f10242a);
    }
}
