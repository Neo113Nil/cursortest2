package com.bytedance.sdk.openadsdk.core.zn;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes15.dex */
public abstract class zn implements View.OnClickListener, View.OnTouchListener {
    protected static int am = 8;
    protected View so;
    protected float iqz = -1.0f;
    protected float phc = -1.0f;
    protected float doe = -1.0f;
    protected float nqi = -1.0f;
    protected long uqh = -1;
    protected long bjh = -1;
    protected int rp = -1;
    protected int kjb = BackupConstant.UNFINISHED_FAIL_CODE;
    protected int zak = -1;
    protected boolean yj = true;
    public SparseArray<zmn> ev = new SparseArray<>();
    private float zmn = 0.0f;
    private float fs = 0.0f;
    private float zn = 0.0f;
    private float fb = 0.0f;
    private long btk = 0;
    private int hhw = 0;
    private int nps = 0;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/zn/zn;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(h.u, view);
        safedk_zn_onClick_a383f9180df16511a16137608671d087(view);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/zn/zn;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
        return safedk_zn_onTouch_8f224b34c41cd139b829cba924926790(view, motionEvent);
    }

    protected abstract void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zmn> sparseArray, boolean z);

    static {
        if (kgc.zmn() != null) {
            am = kgc.fs();
        }
    }

    public void safedk_zn_onClick_a383f9180df16511a16137608671d087(View p0) {
        if (com.bytedance.sdk.openadsdk.core.settings.nps.zmn()) {
            zmn(p0, this.iqz, this.phc, this.doe, this.nqi, this.ev, this.yj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r11.fb <= r3) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean safedk_zn_onTouch_8f224b34c41cd139b829cba924926790(View p0, MotionEvent p1) {
        this.kjb = p1.getDeviceId();
        this.rp = p1.getToolType(0);
        this.zak = p1.getSource();
        int actionMasked = p1.getActionMasked();
        int i = 1;
        if (actionMasked != 0) {
            int i2 = 3;
            if (actionMasked == 1) {
                this.doe = p1.getRawX();
                this.nqi = p1.getRawY();
                this.bjh = System.currentTimeMillis();
                if (Math.abs(this.doe - this.hhw) >= am || Math.abs(this.nqi - this.nps) >= am) {
                    this.yj = false;
                }
                Point point = new Point((int) this.doe, (int) this.nqi);
                if (p0 != null && !fs.zn(p0) && zmn((View) p0.getParent(), point)) {
                    return true;
                }
            } else if (actionMasked != 2) {
                i2 = actionMasked != 3 ? -1 : 4;
            } else {
                this.zn += Math.abs(p1.getX() - this.zmn);
                this.fb += Math.abs(p1.getY() - this.fs);
                this.zmn = p1.getX();
                this.fs = p1.getY();
                if (System.currentTimeMillis() - this.btk > 200) {
                    float f = this.zn;
                    int i3 = am;
                    if (f <= i3) {
                    }
                    this.doe = p1.getRawX();
                    this.nqi = p1.getRawY();
                    if (Math.abs(this.doe - this.hhw) < am || Math.abs(this.nqi - this.nps) >= am) {
                        this.yj = false;
                    }
                }
                i = 2;
                this.doe = p1.getRawX();
                this.nqi = p1.getRawY();
                if (Math.abs(this.doe - this.hhw) < am) {
                }
                this.yj = false;
            }
            i = i2;
        } else {
            this.hhw = (int) p1.getRawX();
            this.nps = (int) p1.getRawY();
            this.iqz = p1.getRawX();
            this.phc = p1.getRawY();
            this.uqh = System.currentTimeMillis();
            this.rp = p1.getToolType(0);
            this.kjb = p1.getDeviceId();
            this.zak = p1.getSource();
            this.zn = 0.0f;
            this.fb = 0.0f;
            this.btk = System.currentTimeMillis();
            this.yj = true;
            this.so = p0;
            com.bytedance.sdk.openadsdk.core.klz.zn.zmn(p1);
            this.zmn = p1.getX();
            this.fs = p1.getY();
            i = 0;
        }
        this.ev.put(p1.getActionMasked(), new zmn(i, p1.getSize(), p1.getPressure(), System.currentTimeMillis()));
        return false;
    }

    private boolean zmn(View view, Point point) {
        int i;
        int i2;
        int i3;
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (fs.zn(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i = point.x) >= (i2 = iArr[0]) && i <= i2 + childAt.getWidth() && (i3 = point.y) >= (i4 = iArr[1]) && i3 <= i4 + childAt.getHeight();
                }
                if (zmn(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static class zmn {
        public long fb;
        public double fs;
        public int zmn;
        public double zn;

        public zmn(int i, double d, double d2, long j) {
            this.zmn = i;
            this.fs = d;
            this.zn = d2;
            this.fb = j;
        }
    }

    public boolean hhw() {
        return this.yj;
    }
}
