package com.bytedance.adsdk.ugeno.core.fs;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes14.dex */
public class zmn {
    public String zmn = "GesThrough_";
    private List<MotionEvent> fs = new ArrayList();
    private Set<String> zn = Collections.synchronizedSet(new HashSet());

    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, MotionEvent motionEvent) {
        if (znVar == null || motionEvent == null || this.fs == null) {
            return;
        }
        zmn(znVar.rc(), znVar.tf(), motionEvent);
    }

    public void zmn(View view, String str, MotionEvent motionEvent) {
        if (view == null || motionEvent == null || this.fs == null) {
            return;
        }
        this.zmn = "GesThrough_".concat(String.valueOf(str));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (motionEvent.getAction() == 0) {
            zmn();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(i, i2);
        this.fs.add(obtain);
    }

    public boolean zmn(MotionEvent motionEvent) {
        if (motionEvent == null || this.zn == null) {
            return false;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        return this.zn.contains(motionEvent.getDownTime() + "_" + pointerId);
    }

    public void zmn(com.bytedance.adsdk.ugeno.fs.zn znVar) {
        if (this.fs.isEmpty() || this.zn == null) {
            Log.d(this.zmn, "motionEvents is empty or mockUniqueId is null");
        } else {
            if (znVar == null || znVar.rc() == null || znVar.rc().getRootView() == null) {
                return;
            }
            zmn(znVar.rc());
        }
    }

    public void zmn(View view) {
        if (this.fs.isEmpty() || this.zn == null) {
            Log.d(this.zmn, "motionEvents is empty or mockUniqueId is null");
            return;
        }
        if (view == null || view.getRootView() == null) {
            return;
        }
        final View rootView = view.getRootView();
        Log.d(this.zmn, "Re-dispatch motionEvents.size(): " + this.fs.size());
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.fs.zmn.1
            @Override // java.lang.Runnable
            public void run() {
                for (MotionEvent motionEvent : zmn.this.fs) {
                    if (motionEvent != null) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        zmn.this.zn.add(motionEvent.getDownTime() + "_" + pointerId);
                        rootView.dispatchTouchEvent(motionEvent);
                        motionEvent.recycle();
                    }
                }
                zmn.this.zmn();
            }
        }, 300L);
    }

    public void zmn() {
        Log.d(this.zmn, "clear all recorded motionEvents");
        List<MotionEvent> list = this.fs;
        if (list != null) {
            list.clear();
        }
    }
}
