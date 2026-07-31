package com.bytedance.adsdk.ugeno.fb.zmn;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class zmn {
    private volatile Map<String, zn> zmn = new HashMap();

    public zn zmn(String str) {
        if (this.zmn.containsKey(str) && this.zmn.get(str) != null) {
            return this.zmn.get(str);
        }
        fs fsVar = new fs();
        this.zmn.put(str, fsVar);
        return fsVar;
    }

    public void zmn(String str, zn znVar) {
        if (!this.zmn.containsKey(str) || this.zmn.get(str) == null) {
            this.zmn.put(str, znVar);
        }
    }
}
