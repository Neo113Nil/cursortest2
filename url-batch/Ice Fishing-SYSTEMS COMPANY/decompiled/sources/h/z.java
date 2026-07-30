package h;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import k.C4616d;

/* loaded from: classes.dex */
public final class z extends ContentFrameLayout {

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4535B f38141B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B, C4616d c4616d) {
        super(c4616d, null);
        this.f38141B = layoutInflaterFactory2C4535B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f38141B.v(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x3 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            if (x3 < -5 || y6 < -5 || x3 > getWidth() + 5 || y6 > getHeight() + 5) {
                LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B = this.f38141B;
                layoutInflaterFactory2C4535B.t(layoutInflaterFactory2C4535B.B(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(com.bumptech.glide.f.h(getContext(), i));
    }
}
