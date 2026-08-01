package com.bytedance.sdk.openadsdk.pvs;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: TotalCountLruDiskFile.java */
/* loaded from: classes2.dex */
public class icD extends pvs {
    private int icD;
    private int pvs;
    private volatile boolean vG;

    public icD(int i, int i2) {
        this.pvs = 15;
        this.icD = 3;
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.pvs = i;
        this.icD = i2;
    }

    public icD(int i, int i2, boolean z) {
        this.pvs = 15;
        this.icD = 3;
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.pvs = i;
        this.icD = i2;
        this.vG = z;
    }

    @Override // com.bytedance.sdk.openadsdk.pvs.pvs
    protected boolean pvs(long j, int i) {
        return i <= this.pvs;
    }

    @Override // com.bytedance.sdk.openadsdk.pvs.pvs
    protected boolean pvs(File file, long j, int i) {
        return i <= this.icD;
    }

    @Override // com.bytedance.sdk.openadsdk.pvs.pvs
    protected void pvs(List<File> list) {
        if (this.vG) {
            Jd(list);
            this.vG = false;
        } else {
            vG(list);
        }
    }

    private void vG(List<File> list) {
        long icD = icD(list);
        int size = list.size();
        if (pvs(icD, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                icD -= length;
            }
            if (pvs(file, icD, size)) {
                return;
            }
        }
    }

    private void Jd(List<File> list) {
        long icD;
        int size;
        boolean pvs;
        if (list != null) {
            try {
                if (list.size() == 0 || (pvs = pvs((icD = icD(list)), (size = list.size())))) {
                    return;
                }
                TreeMap treeMap = new TreeMap();
                for (File file : list) {
                    treeMap.put(Long.valueOf(file.lastModified()), file);
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    if (entry != null && !pvs) {
                        ((Long) entry.getKey()).longValue();
                        File file2 = (File) entry.getValue();
                        long length = file2.length();
                        if (file2.delete()) {
                            size--;
                            icD -= length;
                        }
                        if (pvs(file2, icD, size)) {
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
