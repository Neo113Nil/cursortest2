package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.Zq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2903Zq {

    /* renamed from: a, reason: collision with root package name */
    public final String f29070a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29071b;

    /* renamed from: c, reason: collision with root package name */
    public int f29072c;

    /* renamed from: d, reason: collision with root package name */
    public long f29073d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f29074e;

    public C2903Zq(String str, String str2, int i, long j9, Integer num) {
        this.f29070a = str;
        this.f29071b = str2;
        this.f29072c = i;
        this.f29073d = j9;
        this.f29074e = num;
    }

    public final String toString() {
        Integer num;
        int i = this.f29072c;
        long j9 = this.f29073d;
        String str = this.f29070a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i).length() + 1 + String.valueOf(j9).length());
        sb.append(str);
        sb.append(com.anythink.core.common.d.j.f12535z);
        sb.append(i);
        sb.append(com.anythink.core.common.d.j.f12535z);
        sb.append(j9);
        String sb2 = sb.toString();
        String str2 = this.f29071b;
        if (!TextUtils.isEmpty(str2)) {
            sb2 = D.y.o(new StringBuilder(sb2.length() + 1 + String.valueOf(str2).length()), sb2, com.anythink.core.common.d.j.f12535z, str2);
        }
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31699j2)).booleanValue() || (num = this.f29074e) == null || TextUtils.isEmpty(str2)) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + num.toString().length());
        sb3.append(sb2);
        sb3.append(com.anythink.core.common.d.j.f12535z);
        sb3.append(num);
        return sb3.toString();
    }
}
