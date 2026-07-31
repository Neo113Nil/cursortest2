package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class be2 implements ij2<hj2<Bundle>> {

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f3364a;

    be2(Set<String> set) {
        this.f3364a = set;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<hj2<Bundle>> a() {
        final ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f3364a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return rb3.i(new hj2() { // from class: com.google.android.gms.internal.ads.ae2
            @Override // com.google.android.gms.internal.ads.hj2
            public final void c(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
