package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.EditText;
import android.widget.FrameLayout;

/* renamed from: com.unity3d.player.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065x extends AbstractC0060s {
    public boolean h;
    public Handler i;
    public RunnableC0063v j;

    @Override // com.unity3d.player.AbstractC0060s
    public final boolean c() {
        return false;
    }

    public C0065x(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context, unityPlayerForActivityOrService);
        this.h = false;
    }

    @Override // com.unity3d.player.AbstractC0060s
    public final void d() {
        if (this.h) {
            return;
        }
        FrameLayout frameLayout = this.b.getFrameLayout();
        frameLayout.addView(this.c);
        frameLayout.bringChildToFront(this.c);
        this.c.setVisibility(0);
        this.c.requestFocus();
        this.j = new RunnableC0063v(this);
        Handler handler = new Handler(Looper.getMainLooper());
        this.i = handler;
        handler.postDelayed(this.j, 400L);
        this.h = true;
    }

    @Override // com.unity3d.player.AbstractC0060s
    public final void b() {
        RunnableC0063v runnableC0063v;
        Handler handler = this.i;
        if (handler != null && (runnableC0063v = this.j) != null) {
            handler.removeCallbacks(runnableC0063v);
        }
        this.b.getFrameLayout().removeView(this.c);
        this.h = false;
        invokeOnClose();
    }

    @Override // com.unity3d.player.AbstractC0060s
    public EditText createEditText(AbstractC0060s abstractC0060s) {
        return new C0064w(this.a, abstractC0060s);
    }

    @Override // com.unity3d.player.AbstractC0060s
    public final void a(boolean z) {
        this.d = z;
        if (z) {
            this.c.setVisibility(4);
        } else {
            this.c.setVisibility(0);
        }
        this.c.invalidate();
        this.c.requestLayout();
    }
}
