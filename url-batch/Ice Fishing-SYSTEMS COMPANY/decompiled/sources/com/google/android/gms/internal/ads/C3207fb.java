package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.fb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3207fb {

    /* renamed from: a, reason: collision with root package name */
    public final int f30725a;

    /* renamed from: b, reason: collision with root package name */
    public final B8 f30726b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30727c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f30728d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f30729e;

    static {
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C3207fb(B8 b82, boolean z8, int[] iArr, boolean[] zArr) {
        int i = b82.f23997a;
        this.f30725a = i;
        PA.n(i == iArr.length && i == zArr.length);
        this.f30726b = b82;
        this.f30727c = z8 && i > 1;
        this.f30728d = (int[]) iArr.clone();
        this.f30729e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3207fb.class == obj.getClass()) {
            C3207fb c3207fb = (C3207fb) obj;
            if (this.f30727c == c3207fb.f30727c && this.f30726b.equals(c3207fb.f30726b) && Arrays.equals(this.f30728d, c3207fb.f30728d) && Arrays.equals(this.f30729e, c3207fb.f30729e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f30729e) + ((Arrays.hashCode(this.f30728d) + (((this.f30726b.hashCode() * 31) + (this.f30727c ? 1 : 0)) * 31)) * 31);
    }
}
