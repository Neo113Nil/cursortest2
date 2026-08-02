package l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class d0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f9782a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f9783b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f9784c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f9785d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9786e;
    public boolean f;

    public d0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f9786e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f9783b = rect3;
        Rect rect4 = new Rect();
        this.f9785d = rect4;
        Rect rect5 = new Rect();
        this.f9784c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i3 = -scaledTouchSlop;
        rect4.inset(i3, i3);
        rect5.set(rect2);
        this.f9782a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z2 = this.f;
                if (z2 && !this.f9785d.contains(x3, y3)) {
                    z3 = z2;
                    z = false;
                }
            } else {
                if (action == 3) {
                    z2 = this.f;
                    this.f = false;
                }
                z = true;
                z3 = false;
            }
            z3 = z2;
            z = true;
        } else {
            if (this.f9783b.contains(x3, y3)) {
                this.f = true;
                z = true;
            }
            z = true;
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        Rect rect = this.f9784c;
        View view = this.f9782a;
        if (!z || rect.contains(x3, y3)) {
            motionEvent.setLocation(x3 - rect.left, y3 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
