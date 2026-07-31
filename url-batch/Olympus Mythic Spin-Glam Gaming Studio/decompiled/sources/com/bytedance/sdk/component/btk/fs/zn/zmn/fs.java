package com.bytedance.sdk.component.btk.fs.zn.zmn;

import android.content.Context;
import java.io.File;

/* loaded from: classes5.dex */
public class fs implements com.bytedance.sdk.component.btk.fs, Cloneable {
    private static volatile com.bytedance.sdk.component.btk.fs bvs;
    private boolean btk;
    private int fb;
    private int fs;
    private boolean hhw;
    private boolean nps;
    private File zg;
    private long zmn;
    private int zn;

    public fs(int i, int i2, int i3, long j, File file) {
        this(i, i2, i3, j, i2 != 0, j != 0, file);
    }

    public fs(int i, int i2, int i3, long j, boolean z, boolean z2, File file) {
        this.zmn = j;
        this.fs = i;
        this.zn = i2;
        this.fb = i3;
        this.btk = z;
        this.hhw = z2;
        this.zg = file;
        this.nps = i3 != 0;
    }

    @Override // com.bytedance.sdk.component.btk.fs
    public long zmn() {
        return this.zmn;
    }

    @Override // com.bytedance.sdk.component.btk.fs
    public int fs() {
        return this.fs;
    }

    @Override // com.bytedance.sdk.component.btk.fs
    public int zn() {
        return this.zn;
    }

    @Override // com.bytedance.sdk.component.btk.fs
    public int fb() {
        return this.fb;
    }

    @Override // com.bytedance.sdk.component.btk.fs
    public boolean btk() {
        return this.btk;
    }

    @Override // com.bytedance.sdk.component.btk.fs
    public boolean hhw() {
        return this.nps;
    }

    @Override // com.bytedance.sdk.component.btk.fs
    public boolean nps() {
        return this.hhw;
    }

    @Override // com.bytedance.sdk.component.btk.fs
    public File zg() {
        return this.zg;
    }

    public static void zmn(Context context, com.bytedance.sdk.component.btk.fs fsVar) {
        if (fsVar != null) {
            bvs = fsVar;
        } else {
            bvs = zmn(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.btk.fs zmn(File file) {
        long zmn;
        int zn;
        int fb;
        file.mkdirs();
        if (bvs == null) {
            zn = 10;
            fb = 14;
            zmn = 20;
        } else {
            zmn = bvs.zmn();
            zn = bvs.zn();
            fb = bvs.fb();
        }
        return new fs(0, zn, fb, zmn, file);
    }

    public static com.bytedance.sdk.component.btk.fs bvs() {
        return bvs;
    }
}
