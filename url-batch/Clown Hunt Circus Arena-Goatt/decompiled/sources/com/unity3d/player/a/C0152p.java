package com.unity3d.player.a;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.unity3d.player.UnityPlayerForActivityOrService;
import com.unity3d.player.V;

/* renamed from: com.unity3d.player.a.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152p extends FrameLayout {
    public final UnityPlayerForActivityOrService a;
    public final V b;

    public C0152p(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context);
        this.a = unityPlayerForActivityOrService;
        V v = new V(unityPlayerForActivityOrService);
        this.b = v;
        addView(v);
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
        C0143g c0143g = this.b.a;
        if (c0143g == null || c0143g.a <= 0.0f) {
            return this.a.injectEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        C0143g c0143g = this.b.a;
        if (c0143g == null || c0143g.a <= 0.0f) {
            return this.a.injectEvent(motionEvent);
        }
        return false;
    }
}
