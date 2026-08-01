package com.bytedance.sdk.component.NB.vG.pvs;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* compiled from: CacheConfig.java */
/* loaded from: classes.dex */
public class pvs implements com.bytedance.sdk.component.NB.icD, Cloneable {
    private static volatile com.bytedance.sdk.component.NB.icD sUS;
    private boolean Jd;
    private File NB;
    private int icD;
    private long pvs;
    private boolean vG;

    @Override // com.bytedance.sdk.component.NB.icD
    public boolean sUS() {
        return true;
    }

    public pvs(int i, long j, File file) {
        this(i, j, i != 0, j != 0, file);
    }

    public pvs(int i, long j, boolean z, boolean z2, File file) {
        this.pvs = j;
        this.icD = i;
        this.vG = z;
        this.Jd = z2;
        this.NB = file;
    }

    @Override // com.bytedance.sdk.component.NB.icD
    public long pvs() {
        return this.pvs;
    }

    @Override // com.bytedance.sdk.component.NB.icD
    public int icD() {
        return this.icD;
    }

    @Override // com.bytedance.sdk.component.NB.icD
    public boolean vG() {
        return this.vG;
    }

    @Override // com.bytedance.sdk.component.NB.icD
    public boolean Jd() {
        return this.Jd;
    }

    @Override // com.bytedance.sdk.component.NB.icD
    public File NB() {
        return this.NB;
    }

    public static void pvs(Context context, com.bytedance.sdk.component.NB.icD icd) {
        if (icd != null) {
            sUS = icd;
        } else {
            sUS = pvs(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.NB.icD pvs(File file) {
        int min;
        long min2;
        file.mkdirs();
        if (sUS == null) {
            min = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            min2 = Math.min(so() / 16, 41943040L);
        } else {
            min = Math.min(sUS.icD() / 2, 31457280);
            min2 = Math.min(sUS.pvs() / 2, 41943040L);
        }
        return new pvs(Math.max(min, 26214400), Math.max(min2, 20971520L), file);
    }

    public static com.bytedance.sdk.component.NB.icD yiw() {
        return sUS;
    }

    private static long so() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }
}
