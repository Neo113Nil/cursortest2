package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class pw0 {

    /* renamed from: b, reason: collision with root package name */
    public static final pw0 f10395b = new pw0(e73.w());

    /* renamed from: c, reason: collision with root package name */
    public static final my3<pw0> f10396c = new my3() { // from class: com.google.android.gms.internal.ads.ot0
    };

    /* renamed from: a, reason: collision with root package name */
    private final e73<qv0> f10397a;

    public pw0(List<qv0> list) {
        this.f10397a = e73.u(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pw0.class != obj.getClass()) {
            return false;
        }
        return this.f10397a.equals(((pw0) obj).f10397a);
    }

    public final int hashCode() {
        return this.f10397a.hashCode();
    }
}
