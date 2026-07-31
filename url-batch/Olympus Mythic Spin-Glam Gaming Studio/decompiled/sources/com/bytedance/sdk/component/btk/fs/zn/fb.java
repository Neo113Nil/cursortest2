package com.bytedance.sdk.component.btk.fs.zn;

import com.bytedance.sdk.component.btk.rc;
import java.util.Map;

/* loaded from: classes14.dex */
public class fb<T> implements rc {
    private int btk;
    private boolean bvs;
    private T fb;
    private String fs;
    private int hhw;
    private com.bytedance.sdk.component.btk.nps iv;
    private Map<String, String> nps;
    private int rc;
    private boolean zg;
    private String zmn;
    private T zn;

    public fb zmn(zn znVar, T t) {
        this.zn = t;
        this.zmn = znVar.zg();
        this.fs = znVar.zmn();
        this.btk = znVar.fs();
        this.hhw = znVar.zn();
        this.bvs = znVar.klz();
        this.iv = znVar.rt();
        this.rc = znVar.cn();
        return this;
    }

    public fb zmn(zn znVar, T t, Map<String, String> map, boolean z) {
        this.nps = map;
        this.zg = z;
        return zmn(znVar, t);
    }

    @Override // com.bytedance.sdk.component.btk.rc
    public String zmn() {
        return this.fs;
    }

    @Override // com.bytedance.sdk.component.btk.rc
    public T fs() {
        return this.zn;
    }

    @Override // com.bytedance.sdk.component.btk.rc
    public T zn() {
        return this.fb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.btk.rc
    public void zmn(Object obj) {
        this.fb = this.zn;
        this.zn = obj;
    }

    @Override // com.bytedance.sdk.component.btk.rc
    public Map<String, String> fb() {
        return this.nps;
    }

    @Override // com.bytedance.sdk.component.btk.rc
    public boolean btk() {
        return this.zg;
    }

    @Override // com.bytedance.sdk.component.btk.rc
    public boolean hhw() {
        return this.bvs;
    }

    @Override // com.bytedance.sdk.component.btk.rc
    public int nps() {
        return this.rc;
    }
}
