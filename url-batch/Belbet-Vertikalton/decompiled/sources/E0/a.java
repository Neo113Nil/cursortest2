package E0;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f297a;

    /* renamed from: b, reason: collision with root package name */
    public final int f298b;

    /* renamed from: c, reason: collision with root package name */
    public final int f299c;

    /* renamed from: d, reason: collision with root package name */
    public final int f300d;

    public a(Dialog dialog, Rect rect) {
        this.f297a = dialog;
        this.f298b = rect.left;
        this.f299c = rect.top;
        this.f300d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f298b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f299c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f300d;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f297a.onTouchEvent(obtain);
    }
}
