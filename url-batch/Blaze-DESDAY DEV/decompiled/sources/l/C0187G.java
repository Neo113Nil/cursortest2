package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.winworm.neongrid.R;

/* renamed from: l.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187G extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0188H f2831a;

    public C0187G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        R0.a(this, getContext());
        C0188H c0188h = new C0188H(this);
        this.f2831a = c0188h;
        c0188h.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0188H c0188h = this.f2831a;
        Drawable drawable = c0188h.f2833f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0187G c0187g = c0188h.f2832e;
        if (drawable.setState(c0187g.getDrawableState())) {
            c0187g.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2831a.f2833f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2831a.g(canvas);
    }
}
