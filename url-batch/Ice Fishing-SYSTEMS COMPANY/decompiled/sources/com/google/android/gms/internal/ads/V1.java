package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class V1 extends Y1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f28198b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28199c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28200d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f28201e;

    /* renamed from: f, reason: collision with root package name */
    public final Y1[] f28202f;

    public V1(String str, boolean z8, boolean z9, String[] strArr, Y1[] y1Arr) {
        super(com.anythink.basead.exoplayer.g.b.d.f7449a);
        this.f28198b = str;
        this.f28199c = z8;
        this.f28200d = z9;
        this.f28201e = strArr;
        this.f28202f = y1Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && V1.class == obj.getClass()) {
            V1 v12 = (V1) obj;
            if (this.f28199c == v12.f28199c && this.f28200d == v12.f28200d && Objects.equals(this.f28198b, v12.f28198b) && Arrays.equals(this.f28201e, v12.f28201e) && Arrays.equals(this.f28202f, v12.f28202f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f28198b.hashCode() + (((((this.f28199c ? 1 : 0) + 527) * 31) + (this.f28200d ? 1 : 0)) * 31);
    }
}
