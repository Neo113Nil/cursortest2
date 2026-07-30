package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class DD extends AbstractC4107wD {

    /* renamed from: I, reason: collision with root package name */
    public List f24365I;

    public DD(UB ub, boolean z8) {
        super(ub, z8, true);
        List arrayList;
        if (ub.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = ub.size();
            AbstractC2720Pd.p(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < ub.size(); i++) {
            arrayList.add(null);
        }
        this.f24365I = arrayList;
        w();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4107wD
    public final void s(int i) {
        this.f34963E = null;
        this.f24365I = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4107wD
    public final void x(int i, Object obj) {
        List list = this.f24365I;
        if (list != null) {
            list.set(i, new ED(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4107wD
    public final void y() {
        List<ED> list = this.f24365I;
        if (list != null) {
            int size = list.size();
            AbstractC2720Pd.p(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (ED ed : list) {
                arrayList.add(ed != null ? ed.f24673a : null);
            }
            d(Collections.unmodifiableList(arrayList));
        }
    }
}
