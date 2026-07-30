package com.github.mikephil.charting.data;

import cn.hutool.core.convert.impl.s;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class p extends c {
    public p() {
    }

    public float getGreatestShapeSize() {
        Iterator<v4.e> it = this.mDataSets.iterator();
        if (!it.hasNext()) {
            return 0.0f;
        }
        s.a(it.next());
        throw null;
    }

    public p(List<v4.k> list) {
        super(list);
    }

    public p(v4.k... kVarArr) {
        super(kVarArr);
    }
}
