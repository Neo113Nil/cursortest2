package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Libraries.CBUtility;

/* loaded from: classes.dex */
public abstract class z extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected v f3888a;

    /* renamed from: b, reason: collision with root package name */
    private aa f3889b;

    /* renamed from: c, reason: collision with root package name */
    private int f3890c;

    protected abstract View a();

    protected abstract int b();

    public z(Context context, v vVar) {
        super(context);
        this.f3888a = vVar;
        this.f3890c = 1;
        a(context);
    }

    public void a(int i) {
        RelativeLayout.LayoutParams layoutParams;
        this.f3890c = i;
        setClickable(false);
        int b2 = b();
        switch (this.f3890c) {
            case 0:
                layoutParams = new RelativeLayout.LayoutParams(-1, CBUtility.a(b2, getContext()));
                layoutParams.addRule(10);
                this.f3889b.b(1);
                break;
            case 1:
                layoutParams = new RelativeLayout.LayoutParams(-1, CBUtility.a(b2, getContext()));
                layoutParams.addRule(12);
                this.f3889b.b(4);
                break;
            case 2:
                layoutParams = new RelativeLayout.LayoutParams(CBUtility.a(b2, getContext()), -1);
                layoutParams.addRule(9);
                this.f3889b.b(8);
                break;
            case 3:
                layoutParams = new RelativeLayout.LayoutParams(CBUtility.a(b2, getContext()), -1);
                layoutParams.addRule(11);
                this.f3889b.b(2);
                break;
            default:
                layoutParams = null;
                break;
        }
        setLayoutParams(layoutParams);
    }

    private void a(Context context) {
        Context context2 = getContext();
        setGravity(17);
        this.f3889b = new aa(context2);
        this.f3889b.a(-1);
        this.f3889b.setBackgroundColor(-855638017);
        addView(this.f3889b, new RelativeLayout.LayoutParams(-1, -1));
        addView(a(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public void a(boolean z) {
        a(z, 500L);
    }

    private void a(final boolean z, long j) {
        this.f3888a.C = z;
        if (z && getVisibility() == 0) {
            return;
        }
        if (z || getVisibility() != 8) {
            Runnable runnable = new Runnable() { // from class: com.chartboost.sdk.impl.z.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!z) {
                        z.this.setVisibility(8);
                        z.this.clearAnimation();
                    }
                    synchronized (z.this.f3888a.g) {
                        z.this.f3888a.g.remove(z.this);
                    }
                }
            };
            if (z) {
                setVisibility(0);
            }
            float a2 = CBUtility.a(b(), getContext());
            TranslateAnimation translateAnimation = null;
            switch (this.f3890c) {
                case 0:
                    translateAnimation = new TranslateAnimation(0.0f, 0.0f, z ? -a2 : 0.0f, z ? 0.0f : -a2);
                    break;
                case 1:
                    float f = z ? a2 : 0.0f;
                    if (z) {
                        a2 = 0.0f;
                    }
                    translateAnimation = new TranslateAnimation(0.0f, 0.0f, f, a2);
                    break;
                case 2:
                    translateAnimation = new TranslateAnimation(z ? -a2 : 0.0f, z ? 0.0f : -a2, 0.0f, 0.0f);
                    break;
                case 3:
                    float f2 = z ? a2 : 0.0f;
                    if (z) {
                        a2 = 0.0f;
                    }
                    translateAnimation = new TranslateAnimation(f2, a2, 0.0f, 0.0f);
                    break;
            }
            translateAnimation.setDuration(j);
            translateAnimation.setFillAfter(!z);
            startAnimation(translateAnimation);
            synchronized (this.f3888a.g) {
                this.f3888a.g.put(this, runnable);
            }
            this.f3888a.f3650a.postDelayed(runnable, j);
        }
    }
}
