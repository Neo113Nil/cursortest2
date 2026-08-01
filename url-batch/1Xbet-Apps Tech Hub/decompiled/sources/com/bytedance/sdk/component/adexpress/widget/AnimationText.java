package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.adexpress.dynamic.Jd.qh;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.component.utils.uc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AnimationText extends TextSwitcher implements ViewSwitcher.ViewFactory, dyT.pvs {
    private Handler IP;
    private final int Jd;
    private int Ju;
    private float Mxy;
    private Context NB;
    private int Wyp;
    private List<String> icD;
    private int kj;
    Animation.AnimationListener pvs;
    private int qh;
    private TextView sUS;
    private int so;
    private int vG;
    private int yiw;

    public AnimationText(Context context, int i, float f, int i2, int i3) {
        super(context);
        this.icD = new ArrayList();
        this.vG = 0;
        this.Jd = 1;
        this.IP = new dyT(Looper.getMainLooper(), this);
        this.pvs = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.widget.AnimationText.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (AnimationText.this.sUS != null) {
                    AnimationText.this.sUS.setText("");
                }
            }
        };
        this.NB = context;
        this.so = i;
        this.Mxy = f;
        this.Wyp = i2;
        this.Ju = i3;
        vG();
    }

    private void vG() {
        setFactory(this);
    }

    public void setAnimationType(int i) {
        this.kj = i;
    }

    public void setAnimationDuration(int i) {
        this.yiw = i;
    }

    public void pvs() {
        int i = this.kj;
        if (i == 1) {
            setInAnimation(getContext(), uc.Wyp(this.NB, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), uc.Wyp(this.NB, "tt_text_animation_y_out"));
        } else if (i == 0) {
            setInAnimation(getContext(), uc.Wyp(this.NB, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), uc.Wyp(this.NB, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.pvs);
            getOutAnimation().setAnimationListener(this.pvs);
        }
        this.IP.sendEmptyMessage(1);
    }

    public void setAnimationText(List<String> list) {
        this.icD = list;
    }

    public void icD() {
        List<String> list = this.icD;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i = this.vG;
        this.vG = i + 1;
        this.qh = i;
        setText(this.icD.get(i));
        if (this.vG > this.icD.size() - 1) {
            this.vG = 0;
        }
    }

    public void setTextColor(int i) {
        this.so = i;
    }

    public void setTextSize(float f) {
        this.Mxy = f;
    }

    public void setMaxLines(int i) {
        this.Wyp = i;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.sUS = textView;
        textView.setTextColor(this.so);
        this.sUS.setTextSize(this.Mxy);
        this.sUS.setMaxLines(this.Wyp);
        this.sUS.setTextAlignment(this.Ju);
        return this.sUS;
    }

    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    public void pvs(Message message) {
        if (message.what != 1) {
            return;
        }
        icD();
        this.IP.sendEmptyMessageDelayed(1, this.yiw);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(qh.icD(this.icD.get(this.qh), this.Mxy, false)[0], 1073741824), i);
        } catch (Exception unused) {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.IP.removeMessages(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.IP.sendEmptyMessageDelayed(1, this.yiw);
    }
}
