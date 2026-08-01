package com.bytedance.sdk.openadsdk.core.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* compiled from: VideoOnTouchLayout.java */
/* loaded from: classes2.dex */
public class Jd {
    private float Jd;
    private float NB;
    private final pvs pvs;
    private boolean qh;
    private int sUS;
    private int yiw;
    private final boolean icD = false;
    private boolean vG = false;
    private boolean so = true;
    private boolean Mxy = false;
    private final View.OnTouchListener Wyp = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Jd.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (Jd.this.pvs.ny()) {
                return !Jd.this.vG;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                Jd jd = Jd.this;
                jd.qh = jd.pvs(motionEvent);
                Jd.this.Jd = x;
                Jd.this.NB = y;
                Jd.this.sUS = (int) x;
                Jd.this.yiw = (int) y;
                Jd.this.so = true;
                if (Jd.this.pvs != null && Jd.this.vG) {
                    Jd.this.pvs.pvs(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x - Jd.this.sUS) > 20.0f || Math.abs(y - Jd.this.yiw) > 20.0f) {
                    Jd.this.so = false;
                }
                Jd.this.so = true;
                Jd.this.Mxy = false;
                Jd.this.Jd = 0.0f;
                Jd.this.NB = 0.0f;
                Jd.this.sUS = 0;
                if (Jd.this.pvs != null) {
                    Jd.this.pvs.pvs(view, Jd.this.so);
                }
                Jd.this.qh = false;
            } else if (action == 3) {
                Jd.this.qh = false;
            }
            return !Jd.this.vG;
        }
    };

    /* compiled from: VideoOnTouchLayout.java */
    public interface pvs {
        boolean ny();

        void pvs(View view, boolean z);
    }

    public Jd(pvs pvsVar) {
        this.pvs = pvsVar;
    }

    public void pvs(View view) {
        if (view != null) {
            view.setOnTouchListener(this.Wyp);
        }
    }

    public void pvs(boolean z) {
        this.vG = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pvs(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int vG = Pj.vG(mnm.pvs().getApplicationContext());
        int Jd = Pj.Jd(mnm.pvs().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f = vG;
        if (rawX <= f * 0.01f || rawX >= f * 0.99f) {
            return true;
        }
        float f2 = Jd;
        return rawY <= 0.01f * f2 || rawY >= f2 * 0.99f;
    }
}
