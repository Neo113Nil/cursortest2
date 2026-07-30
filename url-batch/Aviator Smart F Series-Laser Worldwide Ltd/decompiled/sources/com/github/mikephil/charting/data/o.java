package com.github.mikephil.charting.data;

import cn.hutool.core.convert.impl.s;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class o extends i {
    private List<String> mLabels;

    public o() {
    }

    @Override // com.github.mikephil.charting.data.i
    public Entry getEntryForHighlight(com.github.mikephil.charting.highlight.d dVar) {
        s.a(getDataSetByIndex(dVar.getDataSetIndex()));
        dVar.getX();
        throw null;
    }

    public List<String> getLabels() {
        return this.mLabels;
    }

    public void setLabels(List<String> list) {
        this.mLabels = list;
    }

    public o(List<v4.j> list) {
        super(list);
    }

    public void setLabels(String... strArr) {
        this.mLabels = Arrays.asList(strArr);
    }

    public o(v4.j... jVarArr) {
        super(jVarArr);
    }
}
