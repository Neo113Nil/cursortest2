package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import h.AbstractC0112a;
import k.C0149c;

/* loaded from: classes.dex */
public final class y extends ContentFrameLayout {
    public final /* synthetic */ A i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a2, C0149c c0149c) {
        super(c0149c, null);
        this.i = a2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.i.t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5) {
                A a2 = this.i;
                a2.r(a2.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC0112a.l(getContext(), i));
    }
}
