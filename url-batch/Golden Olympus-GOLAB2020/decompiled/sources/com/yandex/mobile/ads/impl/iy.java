package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes3.dex */
public final class iy {

    /* renamed from: a, reason: collision with root package name */
    public final String f27416a;

    /* renamed from: b, reason: collision with root package name */
    public final yb0 f27417b;

    /* renamed from: c, reason: collision with root package name */
    public final yb0 f27418c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27419d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27420e;

    public iy(String str, yb0 yb0Var, yb0 yb0Var2, int i4, int i5) {
        C2253tf.a(i4 == 0 || i5 == 0);
        this.f27416a = C2253tf.a(str);
        this.f27417b = (yb0) C2253tf.a(yb0Var);
        this.f27418c = (yb0) C2253tf.a(yb0Var2);
        this.f27419d = i4;
        this.f27420e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iy.class == obj.getClass()) {
            iy iyVar = (iy) obj;
            if (this.f27419d == iyVar.f27419d && this.f27420e == iyVar.f27420e && this.f27416a.equals(iyVar.f27416a) && this.f27417b.equals(iyVar.f27417b) && this.f27418c.equals(iyVar.f27418c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f27418c.hashCode() + ((this.f27417b.hashCode() + C1842c3.a(this.f27416a, (((this.f27419d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f27420e) * 31, 31)) * 31);
    }
}
