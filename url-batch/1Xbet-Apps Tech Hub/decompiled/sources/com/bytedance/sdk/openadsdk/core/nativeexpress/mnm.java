package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.Wyp;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* compiled from: ViewGestureDetector.java */
/* loaded from: classes2.dex */
public class mnm extends GestureDetector {
    private final com.bytedance.sdk.openadsdk.core.icD.sUS icD;
    private final pvs pvs;

    public mnm(Context context) {
        this(context, new pvs());
    }

    public mnm(Context context, pvs pvsVar) {
        super(context, pvsVar);
        this.pvs = pvsVar;
        this.icD = new com.bytedance.sdk.openadsdk.core.icD.sUS();
        setIsLongpressEnabled(false);
    }

    void pvs() {
        this.pvs.pvs();
    }

    public boolean icD() {
        return this.pvs.icD();
    }

    public com.bytedance.sdk.openadsdk.core.model.Wyp pvs(Context context, View view, View view2) {
        if (this.icD == null) {
            return new Wyp.pvs().pvs();
        }
        return new Wyp.pvs().sUS(this.icD.pvs).NB(this.icD.icD).Jd(this.icD.vG).vG(this.icD.Jd).icD(this.icD.NB).pvs(this.icD.sUS).icD(Pj.pvs(view)).pvs(Pj.pvs(view2)).vG(Pj.vG(view)).Jd(Pj.vG(view2)).Jd(this.icD.yiw).NB(this.icD.so).sUS(this.icD.Mxy).pvs(this.icD.kj).icD(com.bytedance.sdk.openadsdk.core.so.icD().pvs() ? 1 : 2).pvs("vessel").pvs(Pj.NB(context)).vG(Pj.yiw(context)).icD(Pj.sUS(context)).pvs();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.icD.pvs(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    /* compiled from: ViewGestureDetector.java */
    static class pvs extends GestureDetector.SimpleOnGestureListener {
        boolean pvs = false;

        pvs() {
        }

        void pvs() {
            this.pvs = false;
        }

        boolean icD() {
            return this.pvs;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.pvs = true;
            return super.onSingleTapUp(motionEvent);
        }
    }
}
