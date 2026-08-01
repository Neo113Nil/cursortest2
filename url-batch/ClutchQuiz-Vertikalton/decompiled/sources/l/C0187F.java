package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.clutchquizarena.app.R;

/* renamed from: l.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187F extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0188G f2861a;

    public C0187F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        Q0.a(this, getContext());
        C0188G c0188g = new C0188G(this);
        this.f2861a = c0188g;
        c0188g.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0188G c0188g = this.f2861a;
        Drawable drawable = c0188g.f2863f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0187F c0187f = c0188g.f2862e;
        if (drawable.setState(c0187f.getDrawableState())) {
            c0187f.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2861a.f2863f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2861a.g(canvas);
    }
}
