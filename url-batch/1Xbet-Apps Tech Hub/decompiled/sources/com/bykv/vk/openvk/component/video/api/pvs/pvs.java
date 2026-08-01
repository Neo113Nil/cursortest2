package com.bykv.vk.openvk.component.video.api.pvs;

import java.io.File;

/* compiled from: ClearVideoCacheModel.java */
/* loaded from: classes.dex */
public class pvs {
    private int icD;
    private File[] pvs;

    public pvs(File[] fileArr, int i) {
        this.pvs = fileArr;
        this.icD = i;
    }

    public File[] pvs() {
        return this.pvs;
    }

    public int icD() {
        return this.icD;
    }
}
