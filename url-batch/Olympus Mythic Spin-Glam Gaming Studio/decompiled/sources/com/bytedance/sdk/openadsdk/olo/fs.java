package com.bytedance.sdk.openadsdk.olo;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class fs {
    public static int btk = 3;
    public static int fb = 2;
    public static int fs = 0;
    public static int zmn = -1;
    public static int zn = 1;
    private int hhw = zmn;
    private long nps = 0;
    private long zg = 0;
    private final List<zn> bvs = new ArrayList();
    private long iv = 0;

    public void zmn(long j) {
        this.hhw = fs;
        this.nps = j;
    }

    public void fs(long j) {
        int i;
        int i2 = this.hhw;
        if (i2 == zmn || i2 == (i = btk)) {
            return;
        }
        this.hhw = i;
        this.zg = j;
    }

    public void zn(long j) {
        int i;
        int i2 = this.hhw;
        if (i2 == zmn || i2 == (i = fb) || i2 == btk) {
            return;
        }
        this.hhw = i;
        this.iv = j;
    }

    public void fb(long j) {
        int i = this.hhw;
        if (i == zmn || i != fb) {
            return;
        }
        this.hhw = zn;
        this.bvs.add(new zn(this.iv, j));
        this.iv = 0L;
    }

    public long zmn(long j, long j2) {
        long j3;
        long j4;
        long fs2;
        long j5 = this.zg;
        if (j5 != 0 && j > j5) {
            return 0L;
        }
        int i = 0;
        for (zn znVar : this.bvs) {
            if (znVar.fs() > j) {
                if (j < znVar.zmn()) {
                    j4 = i;
                    fs2 = znVar.fs() - znVar.zmn();
                } else {
                    j4 = i;
                    fs2 = znVar.fs() - j;
                }
                i = (int) (j4 + fs2);
            }
        }
        long j6 = this.nps;
        if (j6 < j) {
            long j7 = this.iv;
            if (j7 == 0) {
                j7 = this.zg;
                if (j7 == 0) {
                    j3 = j2 - j;
                }
            } else if (j7 <= j) {
                return 0L;
            }
            return (j7 - j) - i;
        }
        long j8 = this.iv;
        if (j8 == 0) {
            j8 = this.zg;
            if (j8 == 0) {
                j3 = j2 - j6;
            }
        } else if (j8 <= j6) {
            return 0L;
        }
        return (j8 - j6) - i;
        return j3 - i;
    }

    public int zmn() {
        return this.hhw;
    }
}
