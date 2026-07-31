package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public final class xu3 extends cv3 {

    /* renamed from: a, reason: collision with root package name */
    final String f14359a;

    public xu3(String str) {
        this.f14359a = str;
    }

    @Override // com.google.android.gms.internal.ads.cv3
    public final void a(String str) {
        String str2 = this.f14359a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
