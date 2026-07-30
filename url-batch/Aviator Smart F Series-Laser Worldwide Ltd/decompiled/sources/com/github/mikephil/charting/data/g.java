package com.github.mikephil.charting.data;

import cn.hutool.core.convert.impl.s;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class g extends c {
    public g() {
    }

    public void setHighlightCircleWidth(float f8) {
        Iterator<v4.e> it = this.mDataSets.iterator();
        if (it.hasNext()) {
            s.a(it.next());
            throw null;
        }
    }

    public g(v4.c... cVarArr) {
        super(cVarArr);
    }

    public g(List<v4.c> list) {
        super(list);
    }
}
