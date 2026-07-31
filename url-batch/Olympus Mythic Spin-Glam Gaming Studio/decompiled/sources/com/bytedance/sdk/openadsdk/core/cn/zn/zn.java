package com.bytedance.sdk.openadsdk.core.cn.zn;

import com.bytedance.sdk.component.utils.nps;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public class zn extends com.bytedance.sdk.openadsdk.fs.fs {
    public zn(int i, int i2) {
        super(i, i2);
    }

    public zn(int i, int i2, boolean z) {
        super(i, i2);
        this.zmn = z;
    }

    @Override // com.bytedance.sdk.openadsdk.fs.fs, com.bytedance.sdk.openadsdk.fs.zmn
    protected void zmn(List<File> list) {
        int size = list.size();
        if (zmn(0L, size)) {
            return;
        }
        for (File file : list) {
            nps.zn(file);
            size--;
            if (zmn(file, 0L, size)) {
                return;
            }
        }
    }
}
