package com.bytedance.sdk.openadsdk.fs;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class fs extends zmn {
    private volatile boolean fb;
    private int fs;
    private int zn;

    public fs(int i, int i2) {
        this.fs = 15;
        this.zn = 3;
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.fs = i;
        this.zn = i2;
    }

    public fs(int i, int i2, boolean z) {
        this.fs = 15;
        this.zn = 3;
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.fs = i;
        this.zn = i2;
        this.fb = z;
    }

    @Override // com.bytedance.sdk.openadsdk.fs.zmn
    protected boolean zmn(long j, int i) {
        return i <= this.fs;
    }

    @Override // com.bytedance.sdk.openadsdk.fs.zmn
    protected boolean zmn(File file, long j, int i) {
        return i <= this.zn;
    }

    @Override // com.bytedance.sdk.openadsdk.fs.zmn
    protected void zmn(List<File> list) {
        if (this.fb) {
            fb(list);
            this.fb = false;
        } else {
            zn(list);
        }
    }

    private void zn(List<File> list) {
        long fs = fs(list);
        int size = list.size();
        if (zmn(fs, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                fs -= length;
            }
            if (zmn(file, fs, size)) {
                return;
            }
        }
    }

    private void fb(List<File> list) {
        long fs;
        int size;
        boolean zmn;
        if (list != null) {
            try {
                if (list.size() == 0 || (zmn = zmn((fs = fs(list)), (size = list.size())))) {
                    return;
                }
                TreeMap treeMap = new TreeMap();
                for (File file : list) {
                    treeMap.put(Long.valueOf(file.lastModified()), file);
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    if (entry != null && !zmn) {
                        ((Long) entry.getKey()).longValue();
                        File file2 = (File) entry.getValue();
                        long length = file2.length();
                        if (file2.delete()) {
                            size--;
                            fs -= length;
                        }
                        if (zmn(file2, fs, size)) {
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
