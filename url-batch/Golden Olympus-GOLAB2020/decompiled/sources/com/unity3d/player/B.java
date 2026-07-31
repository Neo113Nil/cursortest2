package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.EditText;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class B extends AbstractC1782w {

    /* renamed from: h, reason: collision with root package name */
    public boolean f21995h;

    /* renamed from: i, reason: collision with root package name */
    public Handler f21996i;

    /* renamed from: j, reason: collision with root package name */
    public RunnableC1788z f21997j;

    public B(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
        this.f21995h = false;
    }

    @Override // com.unity3d.player.AbstractC1782w, h1.Q
    public final void a() {
        if (this.f21995h) {
            return;
        }
        FrameLayout frameLayout = this.f22264b.getFrameLayout();
        frameLayout.addView(this.f22265c);
        frameLayout.bringChildToFront(this.f22265c);
        this.f22265c.setVisibility(0);
        this.f22265c.requestFocus();
        this.f21997j = new RunnableC1788z(this);
        Handler handler = new Handler(Looper.getMainLooper());
        this.f21996i = handler;
        handler.postDelayed(this.f21997j, 400L);
        this.f21995h = true;
    }

    @Override // com.unity3d.player.AbstractC1782w
    public EditText createEditText(AbstractC1782w abstractC1782w) {
        return new A(this.f22263a, abstractC1782w);
    }

    @Override // com.unity3d.player.AbstractC1782w, h1.Q
    public final void hide() {
        RunnableC1788z runnableC1788z;
        Handler handler = this.f21996i;
        if (handler != null && (runnableC1788z = this.f21997j) != null) {
            handler.removeCallbacks(runnableC1788z);
        }
        this.f22264b.getFrameLayout().removeView(this.f22265c);
        this.f21995h = false;
        invokeOnClose();
    }

    @Override // com.unity3d.player.AbstractC1782w, h1.Q
    public final boolean isConsumeOutsideTouchesEnabled() {
        return false;
    }

    @Override // com.unity3d.player.AbstractC1782w, h1.Q
    public final void setHideInputField(boolean z4) {
        this.f22266d = z4;
        if (z4) {
            this.f22265c.setVisibility(4);
        } else {
            this.f22265c.setVisibility(0);
        }
        this.f22265c.invalidate();
        this.f22265c.requestLayout();
    }
}
