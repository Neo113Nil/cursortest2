package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f26409a;

    /* renamed from: b, reason: collision with root package name */
    public final List f26410b;

    /* renamed from: c, reason: collision with root package name */
    public final C3675oC f26411c;

    static {
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public N0(Uri uri, C3675oC c3675oC) {
        List list = Collections.EMPTY_LIST;
        this.f26409a = uri;
        ArrayList arrayList = K4.f25873a;
        this.f26410b = list;
        this.f26411c = c3675oC;
        SB sb = UB.f27942u;
        AbstractC2720Pd.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        if (c3675oC.f33117w <= 0) {
            UB.p(objArr, 0);
        } else {
            c3675oC.get(0);
            throw new ClassCastException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n02 = (N0) obj;
        return this.f26409a.equals(n02.f26409a) && this.f26410b.equals(n02.f26410b) && this.f26411c.equals(n02.f26411c);
    }

    public final int hashCode() {
        return (int) (((this.f26411c.hashCode() + ((this.f26410b.hashCode() + (this.f26409a.hashCode() * 923521)) * 961)) * 31 * 31) + com.anythink.basead.exoplayer.b.f6539b);
    }
}
