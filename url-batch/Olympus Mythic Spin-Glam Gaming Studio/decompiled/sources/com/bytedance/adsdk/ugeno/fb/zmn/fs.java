package com.bytedance.adsdk.ugeno.fb.zmn;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes13.dex */
public class fs implements zn {
    private List<fb> zmn = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.fb.zmn.zn
    public void zmn(fb fbVar) {
        this.zmn.add(fbVar);
    }

    @Override // com.bytedance.adsdk.ugeno.fb.zmn.zn
    public void zmn(String str) {
        if (this.zmn.isEmpty()) {
            return;
        }
        Iterator<fb> it = this.zmn.iterator();
        while (it.hasNext()) {
            it.next().zmn(str);
        }
    }
}
