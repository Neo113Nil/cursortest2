package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3235g2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f30938a;

    /* renamed from: b, reason: collision with root package name */
    public final N0 f30939b;

    /* renamed from: c, reason: collision with root package name */
    public final C4256z0 f30940c;

    /* renamed from: d, reason: collision with root package name */
    public final C3181f3 f30941d;

    /* renamed from: e, reason: collision with root package name */
    public final C f30942e;

    static {
        SB sb = UB.f27942u;
        C3675oC c3675oC = C3675oC.f33115x;
        List list = Collections.EMPTY_LIST;
        C3987u1 c3987u1 = C3987u1.f34507a;
        new C();
        C3181f3 c3181f3 = C3181f3.f30581B;
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ C3235g2(String str, C c4, N0 n02, C4256z0 c4256z0, C3181f3 c3181f3) {
        C3987u1 c3987u1 = C3987u1.f34507a;
        this.f30938a = str;
        this.f30939b = n02;
        this.f30940c = c4256z0;
        this.f30941d = c3181f3;
        this.f30942e = c4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3235g2)) {
            return false;
        }
        C3235g2 c3235g2 = (C3235g2) obj;
        if (!this.f30938a.equals(c3235g2.f30938a) || !this.f30942e.equals(c3235g2.f30942e) || !Objects.equals(this.f30939b, c3235g2.f30939b) || !this.f30940c.equals(c3235g2.f30940c) || !Objects.equals(this.f30941d, c3235g2.f30941d)) {
            return false;
        }
        C3987u1 c3987u1 = C3987u1.f34507a;
        return c3987u1.equals(c3987u1);
    }

    public final int hashCode() {
        int hashCode = this.f30938a.hashCode() * 31;
        N0 n02 = this.f30939b;
        return (this.f30941d.hashCode() + ((this.f30942e.hashCode() + ((this.f30940c.hashCode() + ((hashCode + (n02 != null ? n02.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}
