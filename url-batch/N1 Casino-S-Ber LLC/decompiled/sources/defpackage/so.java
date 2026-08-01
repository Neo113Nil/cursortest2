package defpackage;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class so implements View.OnTouchListener {
    public final Dialog f;
    public final int g;
    public final int h;
    public final int i;

    public so(Dialog dialog, Rect rect) {
        this.f = dialog;
        this.g = rect.left;
        this.h = rect.top;
        this.i = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.g;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.h, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            float f = (-this.i) - 1;
            obtain.setLocation(f, f);
        }
        view.performClick();
        return this.f.onTouchEvent(obtain);
    }
}
