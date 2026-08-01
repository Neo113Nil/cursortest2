package w1;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: f, reason: collision with root package name */
    public final Dialog f3586f;
    public final int g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3587i;

    public a(Dialog dialog, Rect rect) {
        this.f3586f = dialog;
        this.g = rect.left;
        this.h = rect.top;
        this.f3587i = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
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
            int i4 = this.f3587i;
            obtain.setLocation((-i4) - 1, (-i4) - 1);
        }
        view.performClick();
        return this.f3586f.onTouchEvent(obtain);
    }
}
