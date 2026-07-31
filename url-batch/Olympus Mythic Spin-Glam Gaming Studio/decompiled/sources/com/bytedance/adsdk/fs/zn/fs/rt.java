package com.bytedance.adsdk.fs.zn.fs;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class rt {
    private PointF fs;
    private final List<com.bytedance.adsdk.fs.zn.zmn> zmn;
    private boolean zn;

    public rt(PointF pointF, boolean z, List<com.bytedance.adsdk.fs.zn.zmn> list) {
        this.fs = pointF;
        this.zn = z;
        this.zmn = new ArrayList(list);
    }

    public rt() {
        this.zmn = new ArrayList();
    }

    public void zmn(float f, float f2) {
        if (this.fs == null) {
            this.fs = new PointF();
        }
        this.fs.set(f, f2);
    }

    public PointF zmn() {
        return this.fs;
    }

    public void zmn(boolean z) {
        this.zn = z;
    }

    public boolean fs() {
        return this.zn;
    }

    public List<com.bytedance.adsdk.fs.zn.zmn> zn() {
        return this.zmn;
    }

    public void zmn(rt rtVar, rt rtVar2, float f) {
        if (this.fs == null) {
            this.fs = new PointF();
        }
        this.zn = rtVar.fs() || rtVar2.fs();
        if (rtVar.zn().size() != rtVar2.zn().size()) {
            rtVar.zn().size();
            rtVar2.zn().size();
        }
        int min = Math.min(rtVar.zn().size(), rtVar2.zn().size());
        if (this.zmn.size() < min) {
            for (int size = this.zmn.size(); size < min; size++) {
                this.zmn.add(new com.bytedance.adsdk.fs.zn.zmn());
            }
        } else if (this.zmn.size() > min) {
            for (int size2 = this.zmn.size() - 1; size2 >= min; size2--) {
                List<com.bytedance.adsdk.fs.zn.zmn> list = this.zmn;
                list.remove(list.size() - 1);
            }
        }
        PointF zmn = rtVar.zmn();
        PointF zmn2 = rtVar2.zmn();
        zmn(com.bytedance.adsdk.fs.hhw.btk.zmn(zmn.x, zmn2.x, f), com.bytedance.adsdk.fs.hhw.btk.zmn(zmn.y, zmn2.y, f));
        for (int size3 = this.zmn.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.fs.zn.zmn zmnVar = rtVar.zn().get(size3);
            com.bytedance.adsdk.fs.zn.zmn zmnVar2 = rtVar2.zn().get(size3);
            PointF zmn3 = zmnVar.zmn();
            PointF fs = zmnVar.fs();
            PointF zn = zmnVar.zn();
            PointF zmn4 = zmnVar2.zmn();
            PointF fs2 = zmnVar2.fs();
            PointF zn2 = zmnVar2.zn();
            this.zmn.get(size3).zmn(com.bytedance.adsdk.fs.hhw.btk.zmn(zmn3.x, zmn4.x, f), com.bytedance.adsdk.fs.hhw.btk.zmn(zmn3.y, zmn4.y, f));
            this.zmn.get(size3).fs(com.bytedance.adsdk.fs.hhw.btk.zmn(fs.x, fs2.x, f), com.bytedance.adsdk.fs.hhw.btk.zmn(fs.y, fs2.y, f));
            this.zmn.get(size3).zn(com.bytedance.adsdk.fs.hhw.btk.zmn(zn.x, zn2.x, f), com.bytedance.adsdk.fs.hhw.btk.zmn(zn.y, zn2.y, f));
        }
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.zmn.size() + "closed=" + this.zn + '}';
    }
}
