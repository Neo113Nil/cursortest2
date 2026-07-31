package com.bytedance.sdk.openadsdk.core.iv;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.klz;
import com.bytedance.sdk.openadsdk.utils.jy;

/* loaded from: classes9.dex */
public class rp extends GestureDetector {
    private final com.bytedance.sdk.openadsdk.core.zn.hhw fs;
    private final zmn zmn;

    public rp(Context context) {
        this(context, new zmn());
    }

    public rp(Context context, zmn zmnVar) {
        super(context, zmnVar);
        this.zmn = zmnVar;
        this.fs = new com.bytedance.sdk.openadsdk.core.zn.hhw();
        setIsLongpressEnabled(false);
    }

    void zmn() {
        this.zmn.zmn();
    }

    public boolean fs() {
        return this.zmn.fs();
    }

    public com.bytedance.sdk.openadsdk.core.model.klz zmn(Context context, View view) {
        if (this.fs == null) {
            return new klz.zmn().zmn();
        }
        return new klz.zmn().hhw(this.fs.zmn).btk(this.fs.fs).fb(this.fs.zn).zn(this.fs.fb).fs(this.fs.btk).zmn(this.fs.hhw).zmn(jy.zmn(view)).fs(jy.zn(view)).fb(this.fs.nps).btk(this.fs.zg).hhw(this.fs.bvs).zmn(this.fs.klz).fs(com.bytedance.sdk.openadsdk.core.iv.fs().zmn() ? 1 : 2).zmn("vessel").zmn(jy.zg(context)).zn(jy.iv(context)).fs(jy.bvs(context)).zmn();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.fs.zmn(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    static class zmn extends GestureDetector.SimpleOnGestureListener {
        boolean zmn = false;

        zmn() {
        }

        void zmn() {
            this.zmn = false;
        }

        boolean fs() {
            return this.zmn;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.zmn = true;
            return super.onSingleTapUp(motionEvent);
        }
    }
}
