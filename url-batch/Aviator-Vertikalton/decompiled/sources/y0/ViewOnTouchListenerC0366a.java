package y0;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0366a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f4612a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4613b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4614c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4615d;

    public ViewOnTouchListenerC0366a(Dialog dialog, Rect rect) {
        this.f4612a = dialog;
        this.f4613b = rect.left;
        this.f4614c = rect.top;
        this.f4615d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f4613b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f4614c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f4615d;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f4612a.onTouchEvent(obtain);
    }
}
