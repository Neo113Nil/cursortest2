package com.yanzhenjie.kalle;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class d {
    private final Map<o, e> mCancelMap = new ConcurrentHashMap();

    public void addCancel(o oVar, e eVar) {
        this.mCancelMap.put(oVar, eVar);
    }

    public void cancel(Object obj) {
        for (Map.Entry<o, e> entry : this.mCancelMap.entrySet()) {
            Object tag = entry.getKey().tag();
            if (obj == tag || (obj != null && obj.equals(tag))) {
                entry.getValue().cancel();
            }
        }
    }

    public void removeCancel(o oVar) {
        this.mCancelMap.remove(oVar);
    }
}
