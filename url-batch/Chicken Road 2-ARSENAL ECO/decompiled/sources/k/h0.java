package k;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class h0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f4997a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f4998b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f4999c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f5000d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5001e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5002f;

    public h0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f5001e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f4998b = rect3;
        Rect rect4 = new Rect();
        this.f5000d = rect4;
        Rect rect5 = new Rect();
        this.f4999c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i7 = -scaledTouchSlop;
        rect4.inset(i7, i7);
        rect5.set(rect2);
        this.f4997a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        int x6 = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z7 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z6 = this.f5002f;
                if (z6 && !this.f5000d.contains(x6, y)) {
                    z7 = z6;
                    z5 = false;
                }
            } else {
                if (action == 3) {
                    z6 = this.f5002f;
                    this.f5002f = false;
                }
                z5 = true;
                z7 = false;
            }
            z7 = z6;
            z5 = true;
        } else {
            if (this.f4998b.contains(x6, y)) {
                this.f5002f = true;
                z5 = true;
            }
            z5 = true;
            z7 = false;
        }
        if (!z7) {
            return false;
        }
        Rect rect = this.f4999c;
        View view = this.f4997a;
        if (!z5 || rect.contains(x6, y)) {
            motionEvent.setLocation(x6 - rect.left, y - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
