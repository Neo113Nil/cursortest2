package com.dancingbogo.skyrolline.webview.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dancingbogo.skyrolline.R;

/* loaded from: classes2.dex */
public class LoadingView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f4635a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f4636b;

    /* renamed from: c, reason: collision with root package name */
    private a f4637c;

    public enum a {
        BIG,
        SMALL,
        RADAR
    }

    public void setType(a aVar) {
        this.f4637c = aVar;
        a();
    }

    private void a() {
        if (a.BIG == this.f4637c) {
            this.f4635a.setImageResource(R.drawable.rolling_sky_tag_loading_circle_big);
            this.f4636b.setVisibility(0);
        } else if (a.SMALL == this.f4637c) {
            this.f4635a.setImageResource(R.drawable.rolling_sky_tag_loading_circle_small);
            this.f4636b.setVisibility(8);
        } else if (a.RADAR == this.f4637c) {
            this.f4635a.setImageResource(R.drawable.rolling_sky_tag_loading_circle_radar);
            this.f4636b.setVisibility(8);
        }
    }

    public void setLoadingText(String str) {
        this.f4636b.setText(str);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.message_tag_loading_view, this);
        this.f4635a = (ImageView) findViewById(R.id.loading_cicle);
        this.f4636b = (TextView) findViewById(R.id.loading_tv);
        b();
    }

    private void b() {
        RotateAnimation rotateAnimation = new RotateAnimation(359.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(800L);
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.f4635a.startAnimation(rotateAnimation);
    }

    public void setLoadingTextVisible(boolean z) {
        if (z) {
            this.f4636b.setVisibility(0);
        } else {
            this.f4636b.setVisibility(8);
        }
    }

    public void setLoadingTextColor(int i) {
        if (this.f4636b != null) {
            this.f4636b.setTextColor(i);
        }
    }

    public void setLoadingCircle(int i) {
        if (this.f4635a != null) {
            this.f4635a.setImageResource(i);
        }
    }
}
