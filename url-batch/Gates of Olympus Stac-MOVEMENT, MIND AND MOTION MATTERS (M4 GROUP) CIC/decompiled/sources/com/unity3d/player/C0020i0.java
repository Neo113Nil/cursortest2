package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;

/* renamed from: com.unity3d.player.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0020i0 extends FrameLayout {
    private C0013f a;
    private UnityPlayer b;
    private K c;

    public C0020i0(Context context, UnityPlayer unityPlayer) {
        super(context);
        int i;
        this.c = new K(context);
        this.b = unityPlayer;
        C0013f c0013f = new C0013f(context, unityPlayer);
        this.a = c0013f;
        c0013f.setId(context.getResources().getIdentifier("unitySurfaceView", "id", context.getPackageName()));
        if (a()) {
            this.a.getHolder().setFormat(-3);
            this.a.setZOrderOnTop(true);
            i = 0;
        } else {
            this.a.getHolder().setFormat(-1);
            i = ViewCompat.MEASURED_STATE_MASK;
        }
        setBackgroundColor(i);
        this.a.getHolder().addCallback(new SurfaceHolderCallbackC0018h0(this));
        this.a.setFocusable(true);
        this.a.setFocusableInTouchMode(true);
        this.a.setContentDescription(a(context));
        addView(this.a, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    private static String a(Context context) {
        return context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName()));
    }

    private static boolean a() {
        Activity activity = UnityPlayer.currentActivity;
        if (activity == null) {
            return false;
        }
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{android.R.attr.windowIsTranslucent});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    final void a(float f) {
        this.a.a(f);
    }

    public final void b() {
        K k = this.c;
        UnityPlayer unityPlayer = this.b;
        J j = k.b;
        if (j != null && j.getParent() != null) {
            unityPlayer.removeView(k.b);
        }
        this.c.b = null;
    }

    public final boolean c() {
        C0013f c0013f = this.a;
        return c0013f != null && c0013f.a();
    }
}
