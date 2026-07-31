package com.bytedance.sdk.component.btk.zmn;

import com.bytedance.sdk.component.btk.hhw;
import com.bytedance.sdk.component.btk.nps;
import java.util.Map;

/* loaded from: classes3.dex */
public class zn<T> implements hhw {
    private nps btk;
    private String fb;
    private int fs;
    Map<String, String> zmn;
    private T zn;

    public zn(int i, T t, String str) {
        this.fs = i;
        this.zn = t;
        this.fb = str;
    }

    public zn(int i, T t, String str, Map<String, String> map) {
        this(i, t, str);
        this.zmn = map;
    }

    public void zmn(nps npsVar) {
        this.btk = npsVar;
    }

    @Override // com.bytedance.sdk.component.btk.hhw
    public int zmn() {
        return this.fs;
    }

    @Override // com.bytedance.sdk.component.btk.hhw
    public T fs() {
        return this.zn;
    }

    @Override // com.bytedance.sdk.component.btk.hhw
    public String zn() {
        return this.fb;
    }
}
