package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import j.C0149c;

/* loaded from: classes.dex */
public final class x extends ContentFrameLayout {
    public final /* synthetic */ z i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, C0149c c0149c) {
        super(c0149c, null);
        this.i = zVar;
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
                z zVar = this.i;
                zVar.r(zVar.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(T.d.t(getContext(), i));
    }
}
