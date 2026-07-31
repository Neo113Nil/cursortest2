package com.bytedance.sdk.component.bvs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.iqz;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class fb extends zn {
    private final nps btk;
    private float bvs;
    private final Context fb;
    private final int fs;
    private View.OnTouchListener hhw;
    private String iv;
    private long nps = -1;
    private float zg;
    private final View.OnTouchListener zmn;
    private final long zn;

    public fb(Context context, View.OnTouchListener onTouchListener, int i, long j, nps npsVar) {
        this.fb = context;
        this.zmn = onTouchListener;
        this.fs = i;
        this.zn = j;
        this.btk = npsVar;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.zg = x;
            this.bvs = y;
        } else if (action == 1 && zmn(x, y, this.zg, this.bvs, this.fb)) {
            if (zmn(SystemClock.elapsedRealtime())) {
                motionEvent.setAction(3);
                zmn(1, x, y);
            } else {
                zmn(0, x, y);
            }
        }
        View.OnTouchListener onTouchListener = this.zmn;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = this.hhw;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(view, motionEvent);
        }
        return false;
    }

    private boolean zmn(long j) {
        long j2 = this.nps;
        if (j2 == -1) {
            this.nps = j;
            return false;
        }
        int i = this.fs;
        if (i == 1) {
            if (j - j2 <= this.zn) {
                return true;
            }
            this.nps = j;
            return false;
        }
        if (i == 2) {
            if (j - j2 <= this.zn) {
                this.nps = j;
                return true;
            }
            this.nps = j;
        }
        return false;
    }

    private void zmn(int i, float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i);
            jSONObject2.put("click_x", f);
            jSONObject2.put("click_y", f2);
            jSONObject.put("lp_click_type", this.fs);
            jSONObject.put("lp_click_interval", this.zn);
        } catch (Throwable th) {
            iqz.zmn("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th);
        }
        if (com.bytedance.sdk.component.bvs.zmn.zmn.zmn().fs() != null) {
            com.bytedance.sdk.component.bvs.zmn.fs fs = com.bytedance.sdk.component.bvs.zmn.zmn.zmn().fs();
            nps npsVar = this.btk;
            fs.zmn(npsVar != null ? npsVar.getMaterialMeta() : null, this.iv, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    public void zmn(String str) {
        this.iv = str;
    }

    @Override // com.bytedance.sdk.component.bvs.zn
    public void zmn(View.OnTouchListener onTouchListener) {
        this.hhw = onTouchListener;
    }
}
