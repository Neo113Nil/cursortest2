package com.bytedance.sdk.openadsdk.core.icD;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.settings.kj;

/* compiled from: InteractionListener.java */
/* loaded from: classes2.dex */
public abstract class vG implements View.OnClickListener, View.OnTouchListener {
    private static float Jd = 0.0f;
    private static long NB = 0;
    protected static int gA = 8;
    private static float icD;
    private static float pvs;
    private static float vG;
    protected View dx;
    protected float rCZ = -1.0f;
    protected float OT = -1.0f;
    protected float ny = -1.0f;
    protected float ZhG = -1.0f;
    protected long dyT = -1;
    protected long dX = -1;
    protected int CvL = -1;
    protected int Gp = -1024;
    protected int ae = -1;
    protected boolean jlb = true;
    public SparseArray<pvs> Pj = new SparseArray<>();
    private int sUS = 0;
    private int yiw = 0;

    protected abstract void pvs(View view, float f, float f2, float f3, float f4, SparseArray<pvs> sparseArray, boolean z);

    static {
        if (mnm.pvs() != null) {
            gA = mnm.icD();
        }
        pvs = 0.0f;
        icD = 0.0f;
        vG = 0.0f;
        Jd = 0.0f;
        NB = 0L;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (kj.pvs()) {
            pvs(view, this.rCZ, this.OT, this.ny, this.ZhG, this.Pj, this.jlb);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.icD.vG.Jd <= r3) goto L19;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        this.Gp = motionEvent.getDeviceId();
        this.CvL = motionEvent.getToolType(0);
        this.ae = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 1;
        if (actionMasked != 0) {
            int i3 = 3;
            if (actionMasked == 1) {
                this.ny = motionEvent.getRawX();
                this.ZhG = motionEvent.getRawY();
                this.dX = System.currentTimeMillis();
                if (Math.abs(this.ny - this.sUS) >= gA || Math.abs(this.ZhG - this.yiw) >= gA) {
                    this.jlb = false;
                }
                Point point = new Point((int) this.ny, (int) this.ZhG);
                if (view != null && !icD.vG(view) && pvs((View) view.getParent(), point)) {
                    return true;
                }
            } else if (actionMasked != 2) {
                i3 = actionMasked != 3 ? -1 : 4;
            } else {
                vG += Math.abs(motionEvent.getX() - pvs);
                Jd += Math.abs(motionEvent.getY() - icD);
                pvs = motionEvent.getX();
                icD = motionEvent.getY();
                if (System.currentTimeMillis() - NB > 200) {
                    float f = vG;
                    int i4 = gA;
                    if (f <= i4) {
                    }
                    this.ny = motionEvent.getRawX();
                    this.ZhG = motionEvent.getRawY();
                    if (Math.abs(this.ny - this.sUS) < gA || Math.abs(this.ZhG - this.yiw) >= gA) {
                        this.jlb = false;
                    }
                    i = i2;
                }
                i2 = 2;
                this.ny = motionEvent.getRawX();
                this.ZhG = motionEvent.getRawY();
                if (Math.abs(this.ny - this.sUS) < gA) {
                }
                this.jlb = false;
                i = i2;
            }
            i = i3;
        } else {
            this.sUS = (int) motionEvent.getRawX();
            this.yiw = (int) motionEvent.getRawY();
            this.rCZ = motionEvent.getRawX();
            this.OT = motionEvent.getRawY();
            this.dyT = System.currentTimeMillis();
            this.CvL = motionEvent.getToolType(0);
            this.Gp = motionEvent.getDeviceId();
            this.ae = motionEvent.getSource();
            NB = System.currentTimeMillis();
            this.jlb = true;
            this.dx = view;
            com.bytedance.sdk.openadsdk.core.NB.vG.pvs(motionEvent);
            i = 0;
        }
        this.Pj.put(motionEvent.getActionMasked(), new pvs(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        return false;
    }

    private boolean pvs(View view, Point point) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (icD.vG(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && point.x >= iArr[0] && point.x <= iArr[0] + childAt.getWidth() && point.y >= iArr[1] && point.y <= iArr[1] + childAt.getHeight();
                }
                if (pvs(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* compiled from: InteractionListener.java */
    public static class pvs {
        public long Jd;
        public double icD;
        public int pvs;
        public double vG;

        public pvs(int i, double d, double d2, long j) {
            this.pvs = i;
            this.icD = d;
            this.vG = d2;
            this.Jd = j;
        }
    }

    public boolean yiw() {
        return this.jlb;
    }
}
