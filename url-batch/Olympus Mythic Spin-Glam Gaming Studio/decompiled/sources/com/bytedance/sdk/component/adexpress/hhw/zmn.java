package com.bytedance.sdk.component.adexpress.hhw;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.utils.kjb;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class zmn extends TextSwitcher implements ViewSwitcher.ViewFactory, kjb.zmn {
    private Context btk;
    private float bvs;
    private final int fb;
    private List<String> fs;
    private TextView hhw;
    private int iv;
    private int klz;
    private int mw;
    private int nps;
    private int rc;
    private Handler rt;
    private int zg;
    Animation.AnimationListener zmn;
    private int zn;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    public zmn(Context context, int i, float f, int i2, int i3) {
        super(context);
        this.fs = new ArrayList();
        this.zn = 0;
        this.fb = 1;
        this.rt = new kjb(Looper.getMainLooper(), this);
        this.zmn = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.hhw.zmn.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (zmn.this.hhw != null) {
                    zmn.this.hhw.setText("");
                }
            }
        };
        this.btk = context;
        this.zg = i;
        this.bvs = f;
        this.iv = i2;
        this.mw = i3;
        zn();
    }

    private void zn() {
        setFactory(this);
    }

    public void setAnimationType(int i) {
        this.klz = i;
    }

    public void setAnimationDuration(int i) {
        this.nps = i;
    }

    public void zmn() {
        int i = this.klz;
        if (i == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.doe.bvs(this.btk, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.doe.bvs(this.btk, "tt_text_animation_y_out"));
        } else if (i == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.doe.bvs(this.btk, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.doe.bvs(this.btk, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.zmn);
            getOutAnimation().setAnimationListener(this.zmn);
        }
        this.rt.sendEmptyMessage(1);
    }

    public void setAnimationText(List<String> list) {
        this.fs = list;
    }

    public void fs() {
        List<String> list = this.fs;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i = this.zn;
        this.zn = i + 1;
        this.rc = i;
        setText(this.fs.get(i));
        if (this.zn > this.fs.size() - 1) {
            this.zn = 0;
        }
    }

    public void setTextColor(int i) {
        this.zg = i;
    }

    public void setTextSize(float f) {
        this.bvs = f;
    }

    public void setMaxLines(int i) {
        this.iv = i;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.hhw = textView;
        textView.setTextColor(this.zg);
        this.hhw.setTextSize(this.bvs);
        this.hhw.setMaxLines(this.iv);
        this.hhw.setTextAlignment(this.mw);
        return this.hhw;
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        if (message.what != 1) {
            return;
        }
        fs();
        this.rt.sendEmptyMessageDelayed(1, this.nps);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.btk.rc.fs(this.fs.get(this.rc), this.bvs, false)[0], 1073741824), i);
        } catch (Exception unused) {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.rt.removeMessages(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.rt.sendEmptyMessageDelayed(1, this.nps);
    }
}
