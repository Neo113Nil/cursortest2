package com.unity3d.player.a;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.unity3d.player.UnityPlayerForActivityOrService;

/* loaded from: classes.dex */
public final class r extends FrameLayout {
    public final UnityPlayerForActivityOrService a;
    public final com.unity3d.player.N b;

    public r(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context);
        this.a = unityPlayerForActivityOrService;
        com.unity3d.player.N n = new com.unity3d.player.N(unityPlayerForActivityOrService);
        this.b = n;
        addView(n);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.a.injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.a.injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return this.a.injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.a.injectEvent(keyEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0006f c0006f = this.b.a;
        if (c0006f == null || c0006f.a <= 0.0f) {
            return this.a.injectEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        C0006f c0006f = this.b.a;
        if (c0006f == null || c0006f.a <= 0.0f) {
            return this.a.injectEvent(motionEvent);
        }
        return false;
    }
}
