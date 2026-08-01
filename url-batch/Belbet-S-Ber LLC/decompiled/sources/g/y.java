package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class y extends ContentFrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0 f1576n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, j.c cVar) {
        super(cVar, null);
        this.f1576n = a0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1576n.s(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x4 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (x4 < -5 || y4 < -5 || x4 > getWidth() + 5 || y4 > getHeight() + 5) {
                a0 a0Var = this.f1576n;
                a0Var.p(a0Var.x(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(b4.d.y(getContext(), i));
    }
}
