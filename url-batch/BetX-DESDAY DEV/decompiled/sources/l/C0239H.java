package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.luckyarcade.spinthrow.R;

/* renamed from: l.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239H extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0240I f3253a;

    public C0239H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        S0.a(this, getContext());
        C0240I c0240i = new C0240I(this);
        this.f3253a = c0240i;
        c0240i.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0240I c0240i = this.f3253a;
        Drawable drawable = c0240i.f3255f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0239H c0239h = c0240i.f3254e;
        if (drawable.setState(c0239h.getDrawableState())) {
            c0239h.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3253a.f3255f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3253a.g(canvas);
    }
}
