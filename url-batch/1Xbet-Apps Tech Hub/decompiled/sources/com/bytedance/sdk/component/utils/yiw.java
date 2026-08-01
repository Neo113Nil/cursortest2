package com.bytedance.sdk.component.utils;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: HackTouchDelegate.java */
/* loaded from: classes.dex */
public class yiw extends TouchDelegate {
    private boolean Jd;
    private int NB;
    private Rect icD;
    private View pvs;
    private Rect vG;

    public yiw(Rect rect, View view) {
        super(rect, view);
        this.icD = rect;
        this.NB = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        Rect rect2 = new Rect(rect);
        this.vG = rect2;
        int i = this.NB;
        rect2.inset(-i, -i);
        this.pvs = view;
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 2) {
                boolean z2 = this.Jd;
                z = z2 ? this.vG.contains(x, y) : true;
                r5 = z2;
            } else {
                if (action == 3) {
                    boolean z3 = this.Jd;
                    this.Jd = false;
                    r5 = z3;
                    z = true;
                }
                z = true;
                r5 = false;
            }
        } else if (this.icD.contains(x, y)) {
            this.Jd = true;
            z = true;
        } else {
            this.Jd = false;
            z = true;
            r5 = false;
        }
        if (!r5) {
            return false;
        }
        View view = this.pvs;
        if (z) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            float f = -(this.NB * 2);
            motionEvent.setLocation(f, f);
        }
        if (view.getVisibility() == 0) {
            return view.dispatchTouchEvent(motionEvent);
        }
        return false;
    }
}
