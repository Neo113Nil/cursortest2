package b2;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: f, reason: collision with root package name */
    public final Dialog f724f;

    /* renamed from: g, reason: collision with root package name */
    public final int f725g;

    /* renamed from: h, reason: collision with root package name */
    public final int f726h;
    public final int i;

    public a(Dialog dialog, Rect rect) {
        this.f724f = dialog;
        this.f725g = rect.left;
        this.f726h = rect.top;
        this.i = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f725g;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f726h, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.i;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f724f.onTouchEvent(obtain);
    }
}
