package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.dw0;

/* loaded from: classes3.dex */
final class aw0 {

    /* renamed from: a, reason: collision with root package name */
    public final dw0.b f23497a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23498b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23499c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23500d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23501e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23502f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f23503g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f23504h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f23505i;

    aw0(dw0.b bVar, long j4, long j5, long j6, long j7, boolean z4, boolean z5, boolean z6, boolean z7) {
        boolean z8 = true;
        C2253tf.a(!z7 || z5);
        C2253tf.a(!z6 || z5);
        if (z4 && (z5 || z6 || z7)) {
            z8 = false;
        }
        C2253tf.a(z8);
        this.f23497a = bVar;
        this.f23498b = j4;
        this.f23499c = j5;
        this.f23500d = j6;
        this.f23501e = j7;
        this.f23502f = z4;
        this.f23503g = z5;
        this.f23504h = z6;
        this.f23505i = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aw0.class == obj.getClass()) {
            aw0 aw0Var = (aw0) obj;
            if (this.f23498b == aw0Var.f23498b && this.f23499c == aw0Var.f23499c && this.f23500d == aw0Var.f23500d && this.f23501e == aw0Var.f23501e && this.f23502f == aw0Var.f23502f && this.f23503g == aw0Var.f23503g && this.f23504h == aw0Var.f23504h && this.f23505i == aw0Var.f23505i && u82.a(this.f23497a, aw0Var.f23497a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f23497a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f23498b)) * 31) + ((int) this.f23499c)) * 31) + ((int) this.f23500d)) * 31) + ((int) this.f23501e)) * 31) + (this.f23502f ? 1 : 0)) * 31) + (this.f23503g ? 1 : 0)) * 31) + (this.f23504h ? 1 : 0)) * 31) + (this.f23505i ? 1 : 0);
    }
}
