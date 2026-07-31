package com.bytedance.sdk.openadsdk.core.iv;

import android.os.SystemClock;
import com.ironsource.X3;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class nqi implements com.bytedance.sdk.openadsdk.core.mw.nps.zn {
    private String hhw;
    private long zmn = 0;
    private long fs = 0;
    private int zn = 0;
    private String fb = null;
    private String btk = null;
    private final AtomicBoolean nps = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.mw.nps.zn
    public void zmn(String str) {
        this.hhw = str;
        this.zmn = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.nps.zn
    public void zmn(int i, String str, String str2) {
        this.zn = i;
        this.fb = str;
        this.btk = str2;
        this.fs = SystemClock.elapsedRealtime();
        this.nps.set(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mw.nps.zn
    public void fs(String str) {
        this.btk = str;
        this.fs = SystemClock.elapsedRealtime();
        this.nps.set(true);
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str) {
        if (this.nps.get()) {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, false, str, "success", this.fs - this.zmn, this.btk, this.hhw, 0, null);
        } else {
            com.bytedance.sdk.openadsdk.fb.zn.zmn(nqiVar, false, str, X3.g.e, this.fs - this.zmn, this.btk, this.hhw, this.zn, this.fb);
        }
    }
}
