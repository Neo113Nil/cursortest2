package com.bytedance.sdk.openadsdk.core.zn;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.zn.zn;

/* loaded from: classes4.dex */
public class hhw {
    public static int iv = 8;
    public float zmn = -1.0f;
    public float fs = -1.0f;
    public float zn = -1.0f;
    public float fb = -1.0f;
    public long btk = -1;
    public long hhw = -1;
    public int nps = -1;
    public int zg = BackupConstant.UNFINISHED_FAIL_CODE;
    public int bvs = -1;
    public boolean rc = true;
    public SparseArray<zn.zmn> klz = new SparseArray<>();
    private float mw = 0.0f;
    private float rt = 0.0f;
    private float cn = 0.0f;
    private float cyb = 0.0f;
    private long olo = 0;
    private int kgc = 0;
    private int kw = 0;

    static {
        if (kgc.zmn() != null) {
            iv = kgc.fs();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r11.cyb <= r3) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zmn(MotionEvent motionEvent) {
        int i;
        this.zg = motionEvent.getDeviceId();
        int i2 = 0;
        this.nps = motionEvent.getToolType(0);
        this.bvs = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 1;
        if (actionMasked == 0) {
            this.kgc = (int) motionEvent.getRawX();
            this.kw = (int) motionEvent.getRawY();
            this.zmn = motionEvent.getRawX();
            this.fs = motionEvent.getRawY();
            this.btk = System.currentTimeMillis();
            this.nps = motionEvent.getToolType(0);
            this.zg = motionEvent.getDeviceId();
            this.bvs = motionEvent.getSource();
            this.cn = 0.0f;
            this.cyb = 0.0f;
            this.olo = System.currentTimeMillis();
            this.rc = true;
            this.mw = motionEvent.getX();
            this.rt = motionEvent.getY();
        } else {
            i = 3;
            if (actionMasked == 1) {
                this.zn = motionEvent.getRawX();
                this.fb = motionEvent.getRawY();
                this.hhw = System.currentTimeMillis();
                if (Math.abs(this.zn - this.kgc) >= iv || Math.abs(this.fb - this.kw) >= iv) {
                    this.rc = false;
                }
            } else if (actionMasked != 2) {
                i2 = actionMasked != 3 ? -1 : 4;
            } else {
                this.cn += Math.abs(motionEvent.getX() - this.mw);
                this.cyb += Math.abs(motionEvent.getY() - this.rt);
                this.mw = motionEvent.getX();
                this.rt = motionEvent.getY();
                if (System.currentTimeMillis() - this.olo > 200) {
                    float f = this.cn;
                    int i4 = iv;
                    if (f <= i4) {
                    }
                    this.zn = motionEvent.getRawX();
                    this.fb = motionEvent.getRawY();
                    if (Math.abs(this.zn - this.kgc) < iv || Math.abs(this.fb - this.kw) >= iv) {
                        this.rc = false;
                    }
                    i = i3;
                }
                i3 = 2;
                this.zn = motionEvent.getRawX();
                this.fb = motionEvent.getRawY();
                if (Math.abs(this.zn - this.kgc) < iv) {
                }
                this.rc = false;
                i = i3;
            }
            this.klz.put(motionEvent.getActionMasked(), new zn.zmn(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        i = i2;
        this.klz.put(motionEvent.getActionMasked(), new zn.zmn(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }
}
