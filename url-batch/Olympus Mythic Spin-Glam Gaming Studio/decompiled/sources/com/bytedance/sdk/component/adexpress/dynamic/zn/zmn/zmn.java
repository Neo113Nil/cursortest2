package com.bytedance.sdk.component.adexpress.dynamic.zn.zmn;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* loaded from: classes5.dex */
public class zmn implements View.OnTouchListener {
    private static int zn = 10;
    private int btk;
    private com.bytedance.sdk.component.adexpress.dynamic.zn.zg fb;
    private float fs;
    private float zmn;
    private RectF hhw = new RectF();
    private long nps = 0;
    private final int zg = 200;
    private final int bvs = 3;
    private SoftReference<ViewGroup> iv = new SoftReference<>(null);

    public zmn(com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar, int i, final ViewGroup viewGroup) {
        this.btk = zn;
        this.fb = zgVar;
        if (i > 0) {
            this.btk = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.zn.zmn.zmn.1
                @Override // java.lang.Runnable
                public void run() {
                    zmn.this.iv = new SoftReference(viewGroup);
                }
            });
        }
    }

    private RectF zmn(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], r2 + view.getWidth(), iArr[1] + view.getHeight());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.hhw = zmn(this.iv.get());
            this.zmn = motionEvent.getRawX();
            this.fs = motionEvent.getRawY();
            this.nps = System.currentTimeMillis();
        } else if (action == 1) {
            RectF rectF = this.hhw;
            if (rectF != null && !rectF.contains(this.zmn, this.fs)) {
                return false;
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float abs = Math.abs(rawX - this.zmn);
            float abs2 = Math.abs(rawY - this.fs);
            int i = this.btk;
            if (abs >= i && abs2 >= i) {
                com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar2 = this.fb;
                if (zgVar2 != null) {
                    zgVar2.zmn();
                }
            } else if ((System.currentTimeMillis() - this.nps < 200 || (abs < 3.0f && abs2 < 3.0f)) && (zgVar = this.fb) != null) {
                zgVar.zmn();
            }
        }
        return true;
    }
}
