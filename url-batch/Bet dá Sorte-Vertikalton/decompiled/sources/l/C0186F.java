package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.glasspulse.glasspulse.R;

/* renamed from: l.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186F extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0187G f2846a;

    public C0186F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        Q0.a(this, getContext());
        C0187G c0187g = new C0187G(this);
        this.f2846a = c0187g;
        c0187g.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0187G c0187g = this.f2846a;
        Drawable drawable = c0187g.f2848f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0186F c0186f = c0187g.f2847e;
        if (drawable.setState(c0186f.getDrawableState())) {
            c0186f.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2846a.f2848f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2846a.g(canvas);
    }
}
