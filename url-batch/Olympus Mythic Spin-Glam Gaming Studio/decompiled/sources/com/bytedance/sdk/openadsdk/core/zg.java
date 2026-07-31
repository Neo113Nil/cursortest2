package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.kjb;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public class zg extends View implements kjb.zmn {
    private List<View> btk;
    private final Handler bvs;
    private View fb;
    private boolean fs;

    @Nullable
    private List<View> hhw;
    private final AtomicBoolean iv;
    private boolean klz;
    private boolean mw;
    private boolean nps;
    private ViewTreeObserver.OnGlobalLayoutListener rc;
    private final Runnable rt;
    private int zg;
    private boolean zmn;
    private zmn zn;

    public interface zmn {
        void fs();

        void zmn();

        void zmn(View view);

        void zmn(boolean z);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public zg(Context context, View view, boolean z) {
        super(kgc.zmn());
        this.bvs = new com.bytedance.sdk.component.utils.kjb(cn.fs().getLooper(), this);
        this.iv = new AtomicBoolean(true);
        this.mw = false;
        this.rt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zg.3
            @Override // java.lang.Runnable
            public void run() {
                if (zg.this.zn != null) {
                    zg.this.zn.zmn(zg.this.fb);
                }
            }
        };
        this.klz = z;
        this.fb = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.rc = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.zg.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (zg.this.mw) {
                    return;
                }
                zg.this.btk();
                zg.this.fb();
            }
        };
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        zmn zmnVar = this.zn;
        if (zmnVar != null) {
            zmnVar.zmn(z);
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.nps = false;
        fs();
        if (this.rc != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.rc);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        fs();
    }

    private void fs() {
        zmn zmnVar;
        if (!this.iv.getAndSet(false) || (zmnVar = this.zn) == null) {
            return;
        }
        zmnVar.zmn();
    }

    private void zn() {
        zmn zmnVar;
        if (this.iv.getAndSet(true) || (zmnVar = this.zn) == null) {
            return;
        }
        zmnVar.fs();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        btk();
        this.nps = true;
        zn();
        zmn(false);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        zn();
    }

    public void setRefClickViews(List<View> list) {
        this.btk = list;
    }

    public void setRefCreativeViews(@Nullable List<View> list) {
        this.hhw = list;
    }

    public void zmn() {
        zmn(this.btk, (com.bytedance.sdk.openadsdk.core.zn.zn) null);
        zmn(this.hhw, (com.bytedance.sdk.openadsdk.core.zn.zn) null);
    }

    public void zmn(List<View> list, com.bytedance.sdk.openadsdk.core.zn.zn znVar) {
        if (com.bytedance.sdk.component.utils.mw.fs(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(znVar);
                    view.setOnTouchListener(znVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fb() {
        if (!this.fs || this.zmn) {
            return;
        }
        this.zmn = true;
        this.bvs.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btk() {
        if (this.zmn) {
            this.bvs.removeCallbacksAndMessages(null);
            this.zmn = false;
        }
    }

    public void setNeedCheckingShow(boolean z) {
        this.fs = z;
        if (!z && this.zmn) {
            btk();
        } else {
            if (!z || this.zmn) {
                return;
            }
            fb();
        }
    }

    public void setCallback(zmn zmnVar) {
        this.zn = zmnVar;
    }

    public void setAdType(int i) {
        this.zg = i;
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        if (message.what == 1 && this.zmn) {
            if (hhw() && hgd.zmn(this.fb, 20, this.zg, this.klz)) {
                btk();
                this.mw = true;
                cn.zn().post(this.rt);
                zmn(true);
                return;
            }
            this.bvs.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private boolean hhw() {
        View view = this.fb;
        if (view instanceof com.bytedance.sdk.openadsdk.core.iv.phc) {
            return ((com.bytedance.sdk.openadsdk.core.iv.phc) view).bjh();
        }
        return true;
    }

    private void zmn(final boolean z) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.bvs.fs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zg.2
            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver viewTreeObserver2;
                if (zg.this.rc != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(zg.this.rc);
                    } catch (Exception unused) {
                    }
                }
                if (z) {
                    zg.this.rc = null;
                }
            }
        });
    }
}
