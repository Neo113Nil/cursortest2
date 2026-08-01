package com.bytedance.sdk.openadsdk.core.video.icD;

import com.bytedance.sdk.component.utils.sUS;
import java.io.File;
import java.util.List;

/* compiled from: TotalCountLruDiskDir.java */
/* loaded from: classes2.dex */
public class vG extends com.bytedance.sdk.openadsdk.pvs.icD {
    public vG(int i, int i2) {
        super(i, i2);
    }

    @Override // com.bytedance.sdk.openadsdk.pvs.icD, com.bytedance.sdk.openadsdk.pvs.pvs
    protected void pvs(List<File> list) {
        int size = list.size();
        if (pvs(0L, size)) {
            return;
        }
        for (File file : list) {
            sUS.vG(file);
            size--;
            if (pvs(file, 0L, size)) {
                return;
            }
        }
    }
}
