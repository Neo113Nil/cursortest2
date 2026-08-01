package com.bytedance.sdk.component.adexpress.dynamic.animation.pvs;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AnimationSets.java */
/* loaded from: classes.dex */
public class icD implements com.bytedance.sdk.component.adexpress.dynamic.dynamicview.NB {
    List<Jd> pvs = new ArrayList();

    public icD(View view, List<com.bytedance.sdk.component.adexpress.dynamic.vG.pvs> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.vG.pvs> it = list.iterator();
        while (it.hasNext()) {
            Jd pvs = vG.pvs().pvs(view, it.next());
            if (pvs != null) {
                this.pvs.add(pvs);
            }
        }
    }

    public void pvs() {
        Iterator<Jd> it = this.pvs.iterator();
        while (it.hasNext()) {
            try {
                it.next().vG();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.NB
    public void icD() {
        Iterator<Jd> it = this.pvs.iterator();
        while (it.hasNext()) {
            try {
                it.next().icD();
            } catch (Exception unused) {
            }
        }
    }
}
