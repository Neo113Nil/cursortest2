package com.bytedance.sdk.component.adexpress.dynamic.interact.pvs;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.interact.Mxy;
import java.lang.ref.SoftReference;

/* compiled from: LimitBrushTapTouch.java */
/* loaded from: classes.dex */
public class pvs implements View.OnTouchListener {
    private static int vG = 10;
    private Mxy Jd;
    private int NB;
    private float icD;
    private float pvs;
    private RectF sUS = new RectF();
    private long yiw = 0;
    private final int so = 200;
    private final int Mxy = 3;
    private SoftReference<ViewGroup> Wyp = new SoftReference<>(null);

    public pvs(Mxy mxy, int i, final ViewGroup viewGroup) {
        this.NB = vG;
        this.Jd = mxy;
        if (i > 0) {
            this.NB = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.pvs.1
                @Override // java.lang.Runnable
                public void run() {
                    pvs.this.Wyp = new SoftReference(viewGroup);
                }
            });
        }
    }

    private RectF pvs(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], r2 + view.getWidth(), iArr[1] + view.getHeight());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Mxy mxy;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.sUS = pvs(this.Wyp.get());
            this.pvs = motionEvent.getRawX();
            this.icD = motionEvent.getRawY();
            this.yiw = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.sUS;
            if (rectF != null && !rectF.contains(this.pvs, this.icD)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float abs = Math.abs(rawX - this.pvs);
            float abs2 = Math.abs(rawY - this.icD);
            int i = this.NB;
            if (abs >= i && abs2 >= i) {
                Mxy mxy2 = this.Jd;
                if (mxy2 != null) {
                    mxy2.pvs();
                }
            } else if ((System.currentTimeMillis() - this.yiw < 200 || (abs < 3.0f && abs2 < 3.0f)) && (mxy = this.Jd) != null) {
                mxy.pvs();
            }
        }
        return true;
    }
}
