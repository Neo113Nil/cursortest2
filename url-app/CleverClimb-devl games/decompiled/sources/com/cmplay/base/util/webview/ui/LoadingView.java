package com.cmplay.base.util.webview.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cmplay.base.util.R;

/* loaded from: classes.dex */
public class LoadingView extends RelativeLayout {
    public static int TYPE_BIG = 0;
    public static int TYPE_BLUE = 3;
    public static int TYPE_RADAR = 2;
    public static int TYPE_SMALL = 1;
    private ImageView mLoadingCircle;
    private TextView mLoadingTv;
    private int mType;

    public void setType(int i) {
        this.mType = i;
        fresh();
    }

    private void fresh() {
        if (TYPE_BIG == this.mType) {
            this.mLoadingCircle.setImageResource(R.drawable.com_cmplay_tag_loading_circle_big);
            this.mLoadingTv.setVisibility(0);
            return;
        }
        if (TYPE_BLUE == this.mType) {
            this.mLoadingCircle.setImageResource(R.drawable.com_cmplay_tag_bule_loading);
            this.mLoadingTv.setVisibility(0);
        } else if (TYPE_SMALL == this.mType) {
            this.mLoadingCircle.setImageResource(R.drawable.com_cmplay_tag_loading_circle_small);
            this.mLoadingTv.setVisibility(8);
        } else if (TYPE_RADAR == this.mType) {
            this.mLoadingCircle.setImageResource(R.drawable.com_cmplay_tag_loading_circle_radar);
            this.mLoadingTv.setVisibility(8);
        }
    }

    public void setLoadingText(String str) {
        this.mLoadingTv.setText(str);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.com_cmplay_message_tag_loading_view, this);
        this.mLoadingCircle = (ImageView) findViewById(R.id.loading_cicle);
        this.mLoadingTv = (TextView) findViewById(R.id.loading_tv);
        startAnim();
    }

    private void startAnim() {
        RotateAnimation rotateAnimation = new RotateAnimation(359.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(800L);
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.mLoadingCircle.startAnimation(rotateAnimation);
    }

    public void setLoadingTextVisible(boolean z) {
        if (z) {
            this.mLoadingTv.setVisibility(0);
        } else {
            this.mLoadingTv.setVisibility(8);
        }
    }

    public void setLoadingTextColor(int i) {
        if (this.mLoadingTv != null) {
            this.mLoadingTv.setTextColor(i);
        }
    }

    public void setLoadingCircle(int i) {
        if (this.mLoadingCircle != null) {
            this.mLoadingCircle.setImageResource(i);
        }
    }
}
