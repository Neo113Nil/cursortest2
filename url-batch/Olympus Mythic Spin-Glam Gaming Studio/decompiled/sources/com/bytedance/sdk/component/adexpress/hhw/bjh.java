package com.bytedance.sdk.component.adexpress.hhw;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes12.dex */
public class bjh extends LinearLayout {
    private LinearLayout btk;
    private zmn fb;
    private com.bytedance.sdk.component.utils.uqh fs;
    private com.bytedance.adsdk.fs.hhw hhw;
    private com.bytedance.sdk.component.adexpress.dynamic.fb.iv nps;
    private TextView zmn;
    private TextView zn;

    public interface zmn {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public bjh(@NonNull Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.fb.iv ivVar) {
        super(context);
        this.nps = ivVar;
        zmn(context, view);
    }

    private void zmn(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.btk = (LinearLayout) findViewById(2097610722);
        this.zmn = (TextView) findViewById(2097610719);
        this.zn = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.fs.hhw hhwVar = (com.bytedance.adsdk.fs.hhw) findViewById(2097610706);
        this.hhw = hhwVar;
        hhwVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.hhw.setImageAssetsFolder("images/");
        this.hhw.zmn(true);
    }

    public void setShakeText(String str) {
        this.zn.setText(str);
    }

    public LinearLayout getWriggleLayout() {
        return this.btk;
    }

    public View getWriggleProgressIv() {
        return this.hhw;
    }

    public TextView getTopTextView() {
        return this.zmn;
    }

    public void setOnShakeViewListener(zmn zmnVar) {
        this.fb = zmnVar;
    }

    public void zmn() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.hhw.bjh.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    bjh.this.hhw.zmn();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.fs == null) {
                this.fs = new com.bytedance.sdk.component.utils.uqh(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.hhw.bjh.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.fb.iv ivVar = this.nps;
            if (ivVar != null) {
                ivVar.zn();
                this.nps.btk();
                this.nps.hhw();
                this.nps.zg();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.fs.hhw hhwVar = this.hhw;
            if (hhwVar != null) {
                hhwVar.btk();
            }
        } catch (Exception unused) {
        }
    }
}
