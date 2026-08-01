package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.neonpulse.gridlogic.R;

/* renamed from: l.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193G extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0194H f2867a;

    public C0193G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        R0.a(this, getContext());
        C0194H c0194h = new C0194H(this);
        this.f2867a = c0194h;
        c0194h.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0194H c0194h = this.f2867a;
        Drawable drawable = c0194h.f2869f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0193G c0193g = c0194h.f2868e;
        if (drawable.setState(c0193g.getDrawableState())) {
            c0193g.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2867a.f2869f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2867a.g(canvas);
    }
}
