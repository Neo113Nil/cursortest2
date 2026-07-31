package com.bytedance.sdk.openadsdk.core.mw.fs.zn;

import android.content.Context;

/* loaded from: classes8.dex */
public class fs extends com.bytedance.adsdk.ugeno.fs.zmn<com.bytedance.adsdk.ugeno.bvs.fs.zmn> {
    public fs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fs.zn
    /* renamed from: zn, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.bvs.fs.zmn zmn() {
        zmn zmnVar = new zmn(this.fs);
        zmnVar.zmn(this);
        return zmnVar;
    }

    public com.bytedance.adsdk.ugeno.bvs.fs.zmn fb() {
        return ((zmn) this.btk).getPlayableView();
    }
}
