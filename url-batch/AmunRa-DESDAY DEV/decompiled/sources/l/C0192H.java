package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.visualfortune.eyerest.R;

/* renamed from: l.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192H extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0193I f2962a;

    public C0192H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        S0.a(this, getContext());
        C0193I c0193i = new C0193I(this);
        this.f2962a = c0193i;
        c0193i.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0193I c0193i = this.f2962a;
        Drawable drawable = c0193i.f2964f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0192H c0192h = c0193i.f2963e;
        if (drawable.setState(c0192h.getDrawableState())) {
            c0192h.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2962a.f2964f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2962a.g(canvas);
    }
}
