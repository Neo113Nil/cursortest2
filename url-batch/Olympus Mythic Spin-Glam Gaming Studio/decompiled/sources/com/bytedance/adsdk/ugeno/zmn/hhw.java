package com.bytedance.adsdk.ugeno.zmn;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class hhw {
    private com.bytedance.adsdk.ugeno.fs.zn fb;
    private List<zmn> fs;
    private List<zn> zmn;
    private Context zn;

    public hhw(Context context, com.bytedance.adsdk.ugeno.fs.zn znVar, List<zn> list) {
        this.fb = znVar;
        this.zn = context;
        this.zmn = list;
        fb();
    }

    private void fb() {
        this.fs = new ArrayList();
        List<zn> list = this.zmn;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.zmn.size(); i++) {
            zn znVar = this.zmn.get(i);
            if (znVar != null) {
                this.fs.add(new zmn(this.zn, this.fb, znVar));
            }
        }
    }

    public void zmn() {
        List<zmn> list = this.fs;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (zmn zmnVar : this.fs) {
            if (zmnVar != null) {
                zmnVar.fb();
            }
        }
    }

    public void fs() {
        List<zmn> list = this.fs;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (zmn zmnVar : this.fs) {
            if (zmnVar != null) {
                zmnVar.zmn();
            }
        }
    }

    public void zn() {
        List<zmn> list = this.fs;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (zmn zmnVar : this.fs) {
            if (zmnVar != null) {
                zmnVar.zn();
            }
        }
    }

    public void zmn(Canvas canvas) {
        List<zmn> list = this.fs;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (zmn zmnVar : this.fs) {
            if (zmnVar != null) {
                zmnVar.zmn(canvas);
            }
        }
    }

    public void fs(Canvas canvas) {
        List<zmn> list = this.fs;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (zmn zmnVar : this.fs) {
            if (zmnVar != null) {
                zmnVar.fs(canvas);
            }
        }
    }

    public void zmn(int i, int i2) {
        List<zmn> list = this.fs;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (zmn zmnVar : this.fs) {
            if (zmnVar != null) {
                zmnVar.zmn(i, i2);
            }
        }
    }

    public zmn zmn(String str) {
        List<zmn> list = this.fs;
        if (list != null && !list.isEmpty()) {
            for (zmn zmnVar : this.fs) {
                if (zmnVar != null && TextUtils.equals(zmnVar.btk(), str)) {
                    return zmnVar;
                }
            }
        }
        return null;
    }
}
