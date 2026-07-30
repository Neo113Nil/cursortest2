package n;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class d1 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f6752a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f6753b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f6754c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f6755d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6756e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6757f;

    public d1(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f6756e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f6753b = rect3;
        Rect rect4 = new Rect();
        this.f6755d = rect4;
        Rect rect5 = new Rect();
        this.f6754c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i2 = -scaledTouchSlop;
        rect4.inset(i2, i2);
        rect5.set(rect2);
        this.f6752a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z7;
        boolean z8;
        int x7 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z9 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z8 = this.f6757f;
                if (z8 && !this.f6755d.contains(x7, y7)) {
                    z9 = z8;
                    z7 = false;
                }
            } else {
                if (action == 3) {
                    z8 = this.f6757f;
                    this.f6757f = false;
                }
                z7 = true;
                z9 = false;
            }
            z9 = z8;
            z7 = true;
        } else {
            if (this.f6753b.contains(x7, y7)) {
                this.f6757f = true;
                z7 = true;
            }
            z7 = true;
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        Rect rect = this.f6754c;
        View view = this.f6752a;
        if (!z7 || rect.contains(x7, y7)) {
            motionEvent.setLocation(x7 - rect.left, y7 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
