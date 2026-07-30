package com.crrepa.band.my.health.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public class SliderView extends LinearLayout {
    private int initY;
    private ImageView ivSlider;
    private int maxBottom;
    private int minTop;
    private a sliderMoveListener;

    public interface a {
    }

    public SliderView(Context context) {
        super(context, null);
        this.minTop = 0;
        this.maxBottom = 0;
        initView(context);
    }

    private void complete() {
    }

    private void initView(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.slider_view, (ViewGroup) null);
        addView(inflate);
        this.ivSlider = (ImageView) inflate.findViewById(R.id.iv_slider);
    }

    private void onMove(int i8, int i9, int i10) {
    }

    private void sendNestedScrollChangeEvent(boolean z7) {
        org.greenrobot.eventbus.c.getDefault().post(new l0.h(z7));
    }

    private void start() {
    }

    private void touchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int y7 = (int) motionEvent.getY();
        if (action == 0) {
            this.initY = y7;
            start();
            sendNestedScrollChangeEvent(false);
            return;
        }
        if (action != 1) {
            if (action == 2) {
                int i8 = y7 - this.initY;
                int top = getTop() + i8;
                int bottom = getBottom() + i8;
                int height = getHeight() / 2;
                if (top >= this.minTop - height && bottom <= this.maxBottom) {
                    onMove(top, bottom, height);
                    return;
                }
                return;
            }
            if (action != 3) {
                return;
            }
        }
        sendNestedScrollChangeEvent(true);
        complete();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        touchEvent(motionEvent);
        return true;
    }

    public void setMaxTopBottom(int i8, int i9) {
        this.minTop = i8;
        this.maxBottom = i9;
    }

    public void setOnSliderMoveListener(a aVar) {
    }

    public void setSliderView(@DrawableRes int i8) {
        this.ivSlider.setImageResource(i8);
    }

    public void updatePosition(int i8) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(0, i8, 0, 0);
        setLayoutParams(layoutParams);
    }

    public SliderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.minTop = 0;
        this.maxBottom = 0;
        initView(context);
    }

    public SliderView(Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.minTop = 0;
        this.maxBottom = 0;
        initView(context);
    }
}
