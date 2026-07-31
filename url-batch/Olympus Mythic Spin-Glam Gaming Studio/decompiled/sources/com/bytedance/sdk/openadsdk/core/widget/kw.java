package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class kw {
    private float btk;
    private float fb;
    private int hhw;
    private int nps;
    private boolean rc;
    private final zmn zmn;
    private final boolean fs = false;
    private boolean zn = false;
    private boolean zg = true;
    private boolean bvs = false;
    private final View.OnTouchListener iv = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.kw.1
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/kw$1;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            CreativeInfoManager.onViewTouched(h.u, view, motionEvent);
            return safedk_kw$1_onTouch_1d20fffdfd037211acc4f3f73b210add(view, motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean safedk_kw$1_onTouch_1d20fffdfd037211acc4f3f73b210add(View p0, MotionEvent p1) {
            if (kw.this.zmn.nqi()) {
                return !kw.this.zn;
            }
            float x = p1.getX();
            float y = p1.getY();
            int action = p1.getAction();
            if (action == 0) {
                kw kwVar = kw.this;
                kwVar.rc = kwVar.zmn(p1);
                kw.this.fb = x;
                kw.this.btk = y;
                kw.this.hhw = (int) x;
                kw.this.nps = (int) y;
                kw.this.zg = true;
                if (kw.this.zmn != null && kw.this.zn) {
                    kw.this.zmn.zmn(p0, true);
                }
            } else if (action == 1) {
                if (Math.abs(x - kw.this.hhw) > 20.0f || Math.abs(y - kw.this.nps) > 20.0f) {
                    kw.this.zg = false;
                }
                kw.this.zg = true;
                kw.this.bvs = false;
                kw.this.fb = 0.0f;
                kw.this.btk = 0.0f;
                kw.this.hhw = 0;
                if (kw.this.zmn != null) {
                    kw.this.zmn.zmn(p0, kw.this.zg);
                }
                kw.this.rc = false;
            } else if (action == 3) {
                kw.this.rc = false;
            }
            return !kw.this.zn;
        }
    };

    public interface zmn {
        boolean nqi();

        void zmn(View view, boolean z);
    }

    public kw(zmn zmnVar) {
        this.zmn = zmnVar;
    }

    public void zmn(View view) {
        if (view != null) {
            view.setOnTouchListener(this.iv);
        }
    }

    public void zmn(boolean z) {
        this.zn = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zmn(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int zn = jy.zn(com.bytedance.sdk.openadsdk.core.kgc.zmn().getApplicationContext());
        int btk = jy.btk(com.bytedance.sdk.openadsdk.core.kgc.zmn().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f = zn;
        if (rawX <= f * 0.01f || rawX >= f * 0.99f) {
            return true;
        }
        float f2 = btk;
        return rawY <= 0.01f * f2 || rawY >= f2 * 0.99f;
    }
}
