package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.winfour.neondrop.R;

/* loaded from: classes.dex */
public final class G extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final H f2859a;

    public G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        S0.a(this, getContext());
        H h = new H(this);
        this.f2859a = h;
        h.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        H h = this.f2859a;
        Drawable drawable = h.f2886f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        G g2 = h.f2885e;
        if (drawable.setState(g2.getDrawableState())) {
            g2.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2859a.f2886f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2859a.g(canvas);
    }
}
