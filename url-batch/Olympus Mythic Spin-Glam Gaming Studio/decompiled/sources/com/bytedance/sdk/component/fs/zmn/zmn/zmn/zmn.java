package com.bytedance.sdk.component.fs.zmn.zmn.zmn;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes15.dex */
public class zmn extends com.bytedance.sdk.component.fs.zmn.fb {
    public static volatile iv zmn;
    private ExecutorService fb;
    private List<com.bytedance.sdk.component.fs.zmn.fs> fs = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.fs.zmn.fs> zn = new CopyOnWriteArrayList();

    @Override // com.bytedance.sdk.component.fs.zmn.fb
    public int zmn() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fb
    public void zmn(int i) {
    }

    public zmn(ExecutorService executorService) {
        this.fb = executorService;
    }

    public static void zmn(iv ivVar) {
        zmn = ivVar;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fb
    public ExecutorService fs() {
        ExecutorService zmn2 = zmn != null ? zmn.zmn() : null;
        return zmn2 != null ? zmn2 : this.fb;
    }

    public boolean btk() {
        return (zmn == null || zmn.zmn() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fb
    public List<com.bytedance.sdk.component.fs.zmn.fs> zn() {
        return this.fs;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fb
    public List<com.bytedance.sdk.component.fs.zmn.fs> fb() {
        return this.zn;
    }
}
