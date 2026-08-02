package k;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: k.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1205b0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f13972a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f13973b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f13974c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f13975d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13976e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13977f;

    public C1205b0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f13976e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f13973b = rect3;
        Rect rect4 = new Rect();
        this.f13975d = rect4;
        Rect rect5 = new Rect();
        this.f13974c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i4 = -scaledTouchSlop;
        rect4.inset(i4, i4);
        rect5.set(rect2);
        this.f13972a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z4;
        int x4 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z5 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z4 = this.f13977f;
                if (z4 && !this.f13975d.contains(x4, y4)) {
                    z5 = z4;
                    z = false;
                }
            } else {
                if (action == 3) {
                    z4 = this.f13977f;
                    this.f13977f = false;
                }
                z = true;
                z5 = false;
            }
            z5 = z4;
            z = true;
        } else {
            if (this.f13973b.contains(x4, y4)) {
                this.f13977f = true;
                z = true;
            }
            z = true;
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        Rect rect = this.f13974c;
        View view = this.f13972a;
        if (!z || rect.contains(x4, y4)) {
            motionEvent.setLocation(x4 - rect.left, y4 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
