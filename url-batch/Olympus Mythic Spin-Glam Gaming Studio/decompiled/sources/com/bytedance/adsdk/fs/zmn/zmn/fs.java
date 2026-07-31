package com.bytedance.adsdk.fs.zmn.zmn;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class fs {
    private final List<phc> zmn = new ArrayList();

    void zmn(phc phcVar) {
        this.zmn.add(phcVar);
    }

    public void zmn(Path path) {
        for (int size = this.zmn.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.fs.hhw.hhw.zmn(path, this.zmn.get(size));
        }
    }
}
