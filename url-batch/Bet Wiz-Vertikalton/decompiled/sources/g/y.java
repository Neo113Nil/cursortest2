package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import j.C0141c;

/* loaded from: classes.dex */
public final class y extends ContentFrameLayout {
    public final /* synthetic */ LayoutInflaterFactory2C0116A i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A, C0141c c0141c) {
        super(c0141c, null);
        this.i = layoutInflaterFactory2C0116A;
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
                LayoutInflaterFactory2C0116A layoutInflaterFactory2C0116A = this.i;
                layoutInflaterFactory2C0116A.p(layoutInflaterFactory2C0116A.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(x1.l.z(getContext(), i));
    }
}
