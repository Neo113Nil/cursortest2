package com.bytedance.adsdk.fs.zmn.fs;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class zg {
    private final List<zmn<Integer, Integer>> fs;
    private final List<zmn<com.bytedance.adsdk.fs.zn.fs.rt, Path>> zmn;
    private final List<com.bytedance.adsdk.fs.zn.fs.zg> zn;

    public zg(List<com.bytedance.adsdk.fs.zn.fs.zg> list) {
        this.zn = list;
        this.zmn = new ArrayList(list.size());
        this.fs = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.zmn.add(list.get(i).fs().zmn());
            this.fs.add(list.get(i).zn().zmn());
        }
    }

    public List<com.bytedance.adsdk.fs.zn.fs.zg> zmn() {
        return this.zn;
    }

    public List<zmn<com.bytedance.adsdk.fs.zn.fs.rt, Path>> fs() {
        return this.zmn;
    }

    public List<zmn<Integer, Integer>> zn() {
        return this.fs;
    }
}
