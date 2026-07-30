package n;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.icefishing.icefish.ice.fishing.s294s.R;

/* loaded from: classes.dex */
public final class E extends SeekBar {

    /* renamed from: d, reason: collision with root package name */
    public final F f6629d;

    public E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        i1.a(this, getContext());
        F f7 = new F(this);
        this.f6629d = f7;
        f7.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        F f7 = this.f6629d;
        E e7 = f7.f6630e;
        Drawable drawable = f7.f6631f;
        if (drawable != null && drawable.isStateful() && drawable.setState(e7.getDrawableState())) {
            e7.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6629d.f6631f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f6629d.g(canvas);
    }
}
