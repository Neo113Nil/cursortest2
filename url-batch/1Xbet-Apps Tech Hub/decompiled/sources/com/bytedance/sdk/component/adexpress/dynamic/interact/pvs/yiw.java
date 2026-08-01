package com.bytedance.sdk.component.adexpress.dynamic.interact.pvs;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.interact.Mxy;
import java.lang.ref.SoftReference;

/* compiled from: UnlockTapTouch.java */
/* loaded from: classes.dex */
public class yiw implements View.OnTouchListener {
    private static int vG = 10;
    private Mxy Jd;
    private int NB;
    private float icD;
    private float pvs;
    private RectF sUS = new RectF();
    private long yiw = 0;
    private final int so = 200;
    private final int Mxy = 3;
    private SoftReference<View> Wyp = new SoftReference<>(null);

    public yiw(Mxy mxy, int i, final ViewGroup viewGroup) {
        this.NB = vG;
        this.Jd = mxy;
        if (i > 0) {
            this.NB = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.pvs.yiw.1
                @Override // java.lang.Runnable
                public void run() {
                    View findViewById = viewGroup.findViewById(2097610746);
                    yiw.this.Wyp = new SoftReference(findViewById);
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
        Mxy mxy2;
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
            int icD = com.bytedance.sdk.component.adexpress.Jd.yiw.icD(com.bytedance.sdk.component.adexpress.Jd.pvs(), Math.abs(rawX - this.pvs));
            int i = vG;
            if (abs < i || abs2 < i) {
                if ((System.currentTimeMillis() - this.yiw < 200 || (abs < 3.0f && abs2 < 3.0f)) && (mxy = this.Jd) != null) {
                    mxy.pvs();
                }
            } else if (rawX > this.pvs && icD > this.NB && (mxy2 = this.Jd) != null) {
                mxy2.pvs();
            }
        }
        return true;
    }
}
