package com.bytedance.adsdk.fs.zn.zmn;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
abstract class rt<V, O> implements mw<V, O> {
    final List<com.bytedance.adsdk.fs.nps.zmn<V>> zmn;

    rt(List<com.bytedance.adsdk.fs.nps.zmn<V>> list) {
        this.zmn = list;
    }

    @Override // com.bytedance.adsdk.fs.zn.zmn.mw
    public List<com.bytedance.adsdk.fs.nps.zmn<V>> zn() {
        return this.zmn;
    }

    @Override // com.bytedance.adsdk.fs.zn.zmn.mw
    public boolean fs() {
        return this.zmn.isEmpty() || (this.zmn.size() == 1 && this.zmn.get(0).btk());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.zmn.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.zmn.toArray()));
        }
        return sb.toString();
    }
}
