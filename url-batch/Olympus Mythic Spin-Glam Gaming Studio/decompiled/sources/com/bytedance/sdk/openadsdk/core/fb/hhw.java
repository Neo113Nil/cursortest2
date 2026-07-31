package com.bytedance.sdk.openadsdk.core.fb;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.hgd;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes15.dex */
public class hhw extends com.bytedance.adsdk.ugeno.hhw.zmn<View> implements kjb.zmn {
    private long btk;
    private zmn bvs;
    private final Handler fb;
    private boolean hhw;
    private final Runnable iv;
    private boolean nps;
    private final ViewTreeObserver.OnScrollChangedListener rc;
    private fs zg;

    public interface fs {
        void zmn(boolean z);
    }

    public interface zmn {
        void zmn(boolean z);
    }

    @Override // com.bytedance.adsdk.ugeno.hhw.zmn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        if (message.what == 1) {
            nps();
        }
    }

    private void nps() {
        boolean zmn2 = hgd.zmn(this, 50, -1, false);
        this.nps = zmn2;
        if (zmn2 == this.hhw) {
            return;
        }
        this.hhw = zmn2;
        nu.zmn(this.iv);
    }

    public hhw(Context context) {
        super(context);
        this.fb = new kjb(cn.fs().getLooper(), this);
        this.hhw = true;
        this.nps = true;
        this.iv = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fb.hhw.1
            @Override // java.lang.Runnable
            public void run() {
                if (hhw.this.bvs != null) {
                    hhw.this.bvs.zmn(hhw.this.nps);
                }
            }
        };
        this.rc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.fb.hhw.2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - hhw.this.btk > 500) {
                    hhw.this.btk = elapsedRealtime;
                    hhw.this.fb.sendEmptyMessageDelayed(1, 500L);
                }
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.rc);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.rc);
        }
    }

    public void setSwiperWindowFocusChangedListener(fs fsVar) {
        this.zg = fsVar;
    }

    public void setSwiperVisibleChangeListener(zmn zmnVar) {
        this.bvs = zmnVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        fs fsVar = this.zg;
        if (fsVar != null) {
            fsVar.zmn(z);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.hhw.zmn
    public View rc(int i) {
        return (View) this.zmn.get(i);
    }
}
