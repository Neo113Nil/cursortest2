package com.bytedance.adsdk.ugeno.core.fs;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.cn;
import com.bytedance.adsdk.ugeno.core.mw;
import com.bytedance.adsdk.ugeno.nps.zg;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes13.dex */
public class btk {
    private mw bvs;
    private boolean cn;
    private zmn cyb;
    private mw iv;
    private Context klz;
    private boolean mw;
    private String rc;
    private boolean rt;
    private int zmn = 0;
    private int fs = Integer.MAX_VALUE;
    private int zn = Integer.MAX_VALUE;
    private AtomicBoolean fb = new AtomicBoolean(true);
    private float btk = Float.MIN_VALUE;
    private float hhw = Float.MIN_VALUE;
    private Map<Integer, Float> nps = new HashMap();
    private Map<Integer, Float> zg = new HashMap();

    public btk(Context context, mw mwVar, boolean z, boolean z2, boolean z3) {
        this.klz = context;
        this.bvs = mwVar;
        this.mw = z;
        this.rt = z2;
        this.cn = z3;
        zn();
    }

    public btk(Context context, mw mwVar, mw mwVar2, boolean z, boolean z2, boolean z3) {
        this.klz = context;
        this.bvs = mwVar;
        this.iv = mwVar2;
        this.mw = z;
        this.rt = z2;
        this.cn = z3;
        zn();
    }

    private void zn() {
        if (this.rt) {
            this.cyb = new zmn();
        }
        mw mwVar = this.bvs;
        if (mwVar == null) {
            return;
        }
        this.zmn = mwVar.zn().optInt("slideThreshold");
        this.rc = this.bvs.zn().optString("slideDirection");
        this.fs = this.bvs.zn().optInt("frequency", Integer.MAX_VALUE);
        this.zn = this.bvs.zn().optInt("effectiveDuration", Integer.MAX_VALUE);
        Log.d("GesThrough_UGSREvent", "mFrequency: " + this.fs + ", mEffectiveDuration: " + this.zn + ", inEffectiveDuation: " + this.fb.get());
    }

    public void zmn() {
        if (this.zn == Integer.MAX_VALUE) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.fs.btk.1
            @Override // java.lang.Runnable
            public void run() {
                btk.this.fb.set(false);
                Log.d("GesThrough_UGSREvent", "inEffectiveDuation -> false");
            }
        }, this.zn);
    }

    public void fs() {
        this.btk = Float.MIN_VALUE;
        this.hhw = Float.MIN_VALUE;
        this.nps.clear();
        this.zg.clear();
    }

    private void zmn(int i) {
        this.nps.remove(Integer.valueOf(i));
        this.zg.remove(Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r14 != 6) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean fs(cn cnVar, com.bytedance.adsdk.ugeno.fs.zn znVar, MotionEvent motionEvent, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                        int pointerId2 = motionEvent.getPointerId(i);
                        if (this.nps.containsKey(Integer.valueOf(pointerId2)) && this.zg.containsKey(Integer.valueOf(pointerId2))) {
                            Log.d("GesThrough_UGSREvent", "ACTION_CANCEL for pointer ".concat(String.valueOf(pointerId2)));
                            zmn(pointerId2);
                        }
                    }
                    return false;
                }
                if (actionMasked != 5) {
                }
            }
            if (!this.nps.containsKey(Integer.valueOf(pointerId)) || !this.zg.containsKey(Integer.valueOf(pointerId))) {
                Log.d("GesThrough_UGSREvent", "No DOWN event for pointer " + pointerId + ", don't handle");
                return false;
            }
            float floatValue = this.nps.get(Integer.valueOf(pointerId)).floatValue();
            float floatValue2 = this.zg.get(Integer.valueOf(pointerId)).floatValue();
            float x = motionEvent.getX(actionIndex);
            float y = motionEvent.getY(actionIndex);
            Log.d("GesThrough_UGSREvent", "ACTION_UP/POINTER_UP for pointer " + pointerId + " from (" + floatValue + ", " + floatValue2 + ") to (" + x + ", " + y + ")");
            if (this.mw && Math.abs(x - floatValue) <= 10.0f && Math.abs(y - floatValue2) <= 10.0f && cnVar != null) {
                zmn(pointerId);
                cnVar.zmn(this.iv, znVar, znVar);
                return true;
            }
            if (this.zmn == 0 && cnVar != null) {
                zmn(pointerId);
                zmn(cnVar, this.bvs, znVar);
                return true;
            }
            int fs = zg.fs(this.klz, x - floatValue);
            int fs2 = zg.fs(this.klz, y - floatValue2);
            if (TextUtils.equals(this.rc, "up")) {
                fs = -fs2;
            } else if (TextUtils.equals(this.rc, "down")) {
                fs = fs2;
            } else if (TextUtils.equals(this.rc, "left")) {
                fs = -fs;
            } else if (!TextUtils.equals(this.rc, "right")) {
                fs = (int) Math.abs(Math.sqrt(Math.pow(fs, 2.0d) + Math.pow(fs2, 2.0d)));
            }
            if (fs >= this.zmn) {
                Log.d("GesThrough_UGSREvent", "Slide event for pointer " + pointerId + ", direct handling");
                if (cnVar != null) {
                    zmn(pointerId);
                    zmn(cnVar, this.bvs, znVar);
                    return true;
                }
                return true;
            }
            zmn(pointerId);
            Log.d("GesThrough_UGSREvent", "Non-slide event for pointer ".concat(String.valueOf(pointerId)));
            zmn(znVar);
            return false;
        }
        this.nps.put(Integer.valueOf(pointerId), Float.valueOf(motionEvent.getX(actionIndex)));
        this.zg.put(Integer.valueOf(pointerId), Float.valueOf(motionEvent.getY(actionIndex)));
        Log.d("GesThrough_UGSREvent", "ACTION_DOWN/POINTER_DOWN for pointer " + pointerId + " at (" + this.nps.get(Integer.valueOf(pointerId)) + ", " + this.zg.get(Integer.valueOf(pointerId)) + ")");
        return true;
    }

    private boolean zn(cn cnVar, com.bytedance.adsdk.ugeno.fs.zn znVar, MotionEvent motionEvent, boolean z) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.btk = motionEvent.getX();
            this.hhw = motionEvent.getY();
        } else {
            if (action != 1) {
                if (action == 3) {
                    if (this.btk == Float.MIN_VALUE || this.hhw == Float.MIN_VALUE) {
                        Log.d("GesThrough_UGSREvent", "Sequence CANCEL, don't handle");
                        return false;
                    }
                    Log.d("GesThrough_UGSREvent", "Sequence CANCEL, processed as UP event");
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.mw && Math.abs(x - this.btk) <= 10.0f && Math.abs(y - this.hhw) <= 10.0f && cnVar != null) {
                fs();
                cnVar.zmn(this.iv, znVar, znVar);
                return true;
            }
            if (this.zmn == 0 && cnVar != null) {
                fs();
                zmn(cnVar, this.bvs, znVar);
                return true;
            }
            int fs = zg.fs(this.klz, x - this.btk);
            int fs2 = zg.fs(this.klz, y - this.hhw);
            if (TextUtils.equals(this.rc, "up")) {
                fs = -fs2;
            } else if (TextUtils.equals(this.rc, "down")) {
                fs = fs2;
            } else if (TextUtils.equals(this.rc, "left")) {
                fs = -fs;
            } else if (!TextUtils.equals(this.rc, "right")) {
                fs = (int) Math.abs(Math.sqrt(Math.pow(fs, 2.0d) + Math.pow(fs2, 2.0d)));
            }
            if (fs >= this.zmn) {
                Log.d("GesThrough_UGSREvent", "Right-slide event, direct handling");
                if (cnVar != null) {
                    fs();
                    zmn(cnVar, this.bvs, znVar);
                    return true;
                }
                fs();
            } else {
                fs();
                Log.d("GesThrough_UGSREvent", "Non-right-slide event");
                zmn(znVar);
                return false;
            }
        }
        return true;
    }

    public boolean zmn(cn cnVar, com.bytedance.adsdk.ugeno.fs.zn znVar, MotionEvent motionEvent, boolean z) {
        zmn zmnVar = this.cyb;
        if (zmnVar != null) {
            if (zmnVar.zmn(motionEvent)) {
                Log.d("GesThrough_UGSREvent", "mockEvent，skip");
                return false;
            }
            this.cyb.zmn(znVar, motionEvent);
        }
        if (this.cn) {
            return fs(cnVar, znVar, motionEvent, z);
        }
        return zn(cnVar, znVar, motionEvent, z);
    }

    private void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar) {
        if (this.cyb != null) {
            Log.d("GesThrough_UGSREvent", "need gesture through, replayGestureMotions");
            this.cyb.zmn(znVar);
        }
    }

    private void zmn(cn cnVar, mw mwVar, com.bytedance.adsdk.ugeno.fs.zn znVar) {
        if (this.fs <= 0) {
            Log.d("GesThrough_UGSREvent", "frequency <= 0, no trigger slide");
            zmn(znVar);
        } else {
            if (!this.fb.get()) {
                Log.d("GesThrough_UGSREvent", "not in effective duration, no trigger slide");
                zmn(znVar);
                return;
            }
            cnVar.zmn(mwVar, znVar, znVar);
            int i = this.fs;
            if (i != Integer.MAX_VALUE) {
                this.fs = i - 1;
            }
        }
    }
}
