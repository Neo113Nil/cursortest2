package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.fortunequest.neontrack.R;

/* renamed from: l.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209F extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0210G f3284a;

    public C0209F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        Q0.a(this, getContext());
        C0210G c0210g = new C0210G(this);
        this.f3284a = c0210g;
        c0210g.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0210G c0210g = this.f3284a;
        Drawable drawable = c0210g.f3286f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0209F c0209f = c0210g.f3285e;
        if (drawable.setState(c0209f.getDrawableState())) {
            c0209f.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3284a.f3286f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3284a.g(canvas);
    }
}
