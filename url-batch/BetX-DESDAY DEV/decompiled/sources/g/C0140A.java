package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: g.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0140A extends ContentFrameLayout {
    public final /* synthetic */ LayoutInflaterFactory2C0142C i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0140A(LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C, j.d dVar) {
        super(dVar, null);
        this.i = layoutInflaterFactory2C0142C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.i.v(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5) {
                LayoutInflaterFactory2C0142C layoutInflaterFactory2C0142C = this.i;
                layoutInflaterFactory2C0142C.t(layoutInflaterFactory2C0142C.A(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(q1.d.z(getContext(), i));
    }
}
