package i;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import l.C0649e;

/* renamed from: i.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539z extends ContentFrameLayout {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0500B f5495q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0539z(LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B, C0649e c0649e) {
        super(c0649e, null);
        this.f5495q = layoutInflaterFactory2C0500B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f5495q.v(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            if (x7 < -5 || y7 < -5 || x7 > getWidth() + 5 || y7 > getHeight() + 5) {
                LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B = this.f5495q;
                layoutInflaterFactory2C0500B.t(layoutInflaterFactory2C0500B.A(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i2) {
        setBackgroundDrawable(O6.g.M(getContext(), i2));
    }
}
