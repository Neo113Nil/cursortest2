package z0;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0338a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f4292a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4294c;
    public final int d;

    public ViewOnTouchListenerC0338a(Dialog dialog, Rect rect) {
        this.f4292a = dialog;
        this.f4293b = rect.left;
        this.f4294c = rect.top;
        this.d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f4293b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f4294c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.d;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f4292a.onTouchEvent(obtain);
    }
}
