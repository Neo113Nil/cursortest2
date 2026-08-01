package com.bytedance.sdk.openadsdk.core.icD;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import com.bytedance.sdk.openadsdk.core.mnm;

/* compiled from: TouchInfoHelper.java */
/* loaded from: classes2.dex */
public class sUS {
    private static float IP = 0.0f;
    private static float Ju = 0.0f;
    public static int Wyp = 8;
    private static float bNS;
    private static float mnm;
    private static long vA;
    public float pvs = -1.0f;
    public float icD = -1.0f;
    public float vG = -1.0f;
    public float Jd = -1.0f;
    public long NB = -1;
    public long sUS = -1;
    public int yiw = -1;
    public int so = -1024;
    public int Mxy = -1;
    public boolean qh = true;
    public SparseArray<vG.pvs> kj = new SparseArray<>();
    private int cR = 0;
    private int zM = 0;

    static {
        if (mnm.pvs() != null) {
            Wyp = mnm.icD();
        }
        Ju = 0.0f;
        IP = 0.0f;
        bNS = 0.0f;
        mnm = 0.0f;
        vA = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.icD.sUS.mnm <= r3) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pvs(MotionEvent motionEvent) {
        int i;
        this.so = motionEvent.getDeviceId();
        int i2 = 0;
        this.yiw = motionEvent.getToolType(0);
        this.Mxy = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 1;
        if (actionMasked == 0) {
            this.cR = (int) motionEvent.getRawX();
            this.zM = (int) motionEvent.getRawY();
            this.pvs = motionEvent.getRawX();
            this.icD = motionEvent.getRawY();
            this.NB = System.currentTimeMillis();
            this.yiw = motionEvent.getToolType(0);
            this.so = motionEvent.getDeviceId();
            this.Mxy = motionEvent.getSource();
            vA = System.currentTimeMillis();
            this.qh = true;
        } else {
            if (actionMasked == 1) {
                this.vG = motionEvent.getRawX();
                this.Jd = motionEvent.getRawY();
                this.sUS = System.currentTimeMillis();
                if (Math.abs(this.vG - this.cR) >= Wyp || Math.abs(this.Jd - this.zM) >= Wyp) {
                    this.qh = false;
                }
                i = 3;
            } else if (actionMasked != 2) {
                i2 = actionMasked != 3 ? -1 : 4;
            } else {
                bNS += Math.abs(motionEvent.getX() - Ju);
                mnm += Math.abs(motionEvent.getY() - IP);
                Ju = motionEvent.getX();
                IP = motionEvent.getY();
                if (System.currentTimeMillis() - vA > 200) {
                    float f = bNS;
                    int i4 = Wyp;
                    if (f <= i4) {
                    }
                    this.vG = motionEvent.getRawX();
                    this.Jd = motionEvent.getRawY();
                    if (Math.abs(this.vG - this.cR) < Wyp || Math.abs(this.Jd - this.zM) >= Wyp) {
                        this.qh = false;
                    }
                    i = i3;
                }
                i3 = 2;
                this.vG = motionEvent.getRawX();
                this.Jd = motionEvent.getRawY();
                if (Math.abs(this.vG - this.cR) < Wyp) {
                }
                this.qh = false;
                i = i3;
            }
            this.kj.put(motionEvent.getActionMasked(), new vG.pvs(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        i = i2;
        this.kj.put(motionEvent.getActionMasked(), new vG.pvs(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }
}
