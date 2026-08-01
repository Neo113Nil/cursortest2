package com.bytedance.sdk.component.NB.icD;

import com.bytedance.sdk.component.NB.sUS;
import com.bytedance.sdk.component.NB.yiw;
import java.util.Map;

/* compiled from: HttpResponse.java */
/* loaded from: classes.dex */
public class Jd<T> implements sUS {
    private String Jd;
    private yiw NB;
    private int icD;
    Map<String, String> pvs;
    private T vG;

    public Jd(int i, T t, String str) {
        this.icD = i;
        this.vG = t;
        this.Jd = str;
    }

    public Jd(int i, T t, String str, Map<String, String> map) {
        this(i, t, str);
        this.pvs = map;
    }

    @Override // com.bytedance.sdk.component.NB.sUS
    public yiw pvs() {
        return this.NB;
    }

    public void pvs(yiw yiwVar) {
        this.NB = yiwVar;
    }

    @Override // com.bytedance.sdk.component.NB.sUS
    public int icD() {
        return this.icD;
    }

    @Override // com.bytedance.sdk.component.NB.sUS
    public T vG() {
        return this.vG;
    }

    @Override // com.bytedance.sdk.component.NB.sUS
    public String Jd() {
        return this.Jd;
    }

    @Override // com.bytedance.sdk.component.NB.sUS
    public Map<String, String> NB() {
        return this.pvs;
    }
}
