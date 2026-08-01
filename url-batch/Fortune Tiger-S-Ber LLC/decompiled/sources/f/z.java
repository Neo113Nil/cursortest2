package f;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class z extends ContentFrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b0 f1655n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 b0Var, i.c cVar) {
        super(cVar, null);
        this.f1655n = b0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1655n.t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (x3 < -5 || y3 < -5 || x3 > getWidth() + 5 || y3 > getHeight() + 5) {
                b0 b0Var = this.f1655n;
                b0Var.r(b0Var.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i4) {
        setBackgroundDrawable(k3.m.w(getContext(), i4));
    }
}
