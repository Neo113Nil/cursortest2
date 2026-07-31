package com.bytedance.adsdk.ugeno.fb.fb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.fb.mw;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes15.dex */
public class btk extends zn {
    private int cn;
    private AtomicBoolean cyb;
    private String kgc;
    private float klz;
    private mw kw;
    private int mw;
    private int olo;
    private float rc;
    private AtomicInteger rt;

    public btk(Context context) {
        super(context);
        this.mw = 0;
        this.rt = new AtomicInteger(Integer.MAX_VALUE);
        this.cn = Integer.MAX_VALUE;
        this.cyb = new AtomicBoolean(true);
        this.olo = 0;
        this.kgc = "up";
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fb.zn
    public boolean zmn(Object... objArr) {
        Object obj;
        Object obj2;
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        Map<String, Object> map = this.btk;
        if (map != null) {
            Object obj3 = map.get("direction");
            String str = "all";
            if (obj3 != null && !TextUtils.isEmpty(String.valueOf(obj3))) {
                str = String.valueOf(obj3);
            }
            this.kgc = str;
            Object obj4 = this.btk.get("distance");
            if (obj4 == null) {
                this.mw = 0;
            } else {
                this.mw = com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(obj4), 0);
            }
            if (this.rt.get() == Integer.MAX_VALUE && (obj2 = this.btk.get("frequency")) != null) {
                this.rt.set(com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(obj2), Integer.MAX_VALUE));
            }
            if (this.cn == Integer.MAX_VALUE && (obj = this.btk.get("effectiveDuration")) != null) {
                this.cn = com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(obj), Integer.MAX_VALUE);
            }
            Object obj5 = this.btk.get("inView");
            if (obj5 != null) {
                this.olo = com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(obj5), 0);
            }
            Log.d("GesThrough_UGSlideEvent", "mFrequency: " + this.rt + ", mEffectiveDuration: " + this.cn + ", inEffectiveDuation: " + this.cyb.get());
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        zmn();
        mw mwVar = this.kw;
        if (mwVar != null) {
            return mwVar.zmn(this.fs, motionEvent, this.zmn, this, this.kgc, this.mw, this.rt, this.olo, this.cyb.get());
        }
        return zmn(this.fs, motionEvent);
    }

    private void zmn() {
        if (this.cn == Integer.MAX_VALUE || this.fs == null || System.currentTimeMillis() - this.fs.bjh() < this.cn) {
            return;
        }
        this.cyb.set(false);
        Log.d("GesThrough_UGSlideEvent", "inEffectiveDuation -> false");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, MotionEvent motionEvent) {
        char c;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.rc = motionEvent.getX();
            this.klz = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.mw == 0 && this.zmn != null) {
                Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
                return zmn(znVar, x, y);
            }
            int fs = com.bytedance.adsdk.ugeno.nps.zg.fs(this.iv, x - this.rc);
            int fs2 = com.bytedance.adsdk.ugeno.nps.zg.fs(this.iv, y - this.klz);
            String str = this.kgc;
            switch (str.hashCode()) {
                case 3739:
                    if (str.equals("up")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 96673:
                    if (str.equals("all")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3089570:
                    if (str.equals("down")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                fs = -fs2;
            } else if (c == 1) {
                fs = fs2;
            } else if (c == 2) {
                fs = -fs;
            } else if (c != 3) {
                fs = (int) Math.abs(Math.sqrt(Math.pow(fs, 2.0d) + Math.pow(fs2, 2.0d)));
            }
            if (fs >= this.mw) {
                Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
                if (this.zmn != null) {
                    this.rc = 0.0f;
                    this.klz = 0.0f;
                    return zmn(znVar, x, y);
                }
            } else {
                Log.d("GesThrough_UGSlideEvent", "Non-slide event");
                return false;
            }
        }
        return true;
    }

    private boolean zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, float f, float f2) {
        if (this.rt.get() <= 0) {
            Log.d("GesThrough_UGSlideEvent", "frequency <= 0, no trigger slide");
            return false;
        }
        if (!this.cyb.get()) {
            Log.d("GesThrough_UGSlideEvent", "not in effective duration, no trigger slide");
            return false;
        }
        if (this.olo == 1 && !zmn(znVar.rc(), f, f2)) {
            Log.d("GesThrough_UGSlideEvent", "not in view, no trigger slide");
            return false;
        }
        Log.d("GesThrough_UGSlideEvent", "Slide event, direct handling");
        this.zmn.zmn(znVar, this.hhw, this.zn.fs(), this.zn);
        if (this.rt.get() != Integer.MAX_VALUE) {
            this.rt.decrementAndGet();
        }
        return true;
    }

    private boolean zmn(View view, float f, float f2) {
        return f >= 0.0f && f < ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }

    public void zmn(mw mwVar) {
        this.kw = mwVar;
    }
}
