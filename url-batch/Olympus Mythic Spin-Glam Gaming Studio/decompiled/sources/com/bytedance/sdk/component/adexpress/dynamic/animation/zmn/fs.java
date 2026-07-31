package com.bytedance.sdk.component.adexpress.dynamic.animation.zmn;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public class fs implements fkt {
    List<fb> zmn = new ArrayList();

    public fs(View view, List<com.bytedance.sdk.component.adexpress.dynamic.fb.zmn> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fb.zmn> it = list.iterator();
        while (it.hasNext()) {
            fb zmn = zn.zmn().zmn(view, it.next());
            if (zmn != null) {
                this.zmn.add(zmn);
            }
        }
    }

    public void zmn() {
        Iterator<fb> it = this.zmn.iterator();
        while (it.hasNext()) {
            try {
                it.next().zn();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkt
    public void fs() {
        Iterator<fb> it = this.zmn.iterator();
        while (it.hasNext()) {
            try {
                it.next().fs();
            } catch (Exception unused) {
            }
        }
    }
}
