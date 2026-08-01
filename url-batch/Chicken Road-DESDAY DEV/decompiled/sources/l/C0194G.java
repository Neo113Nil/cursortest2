package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.playgen.securelock.R;

/* renamed from: l.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194G extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0195H f2787a;

    public C0194G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        S0.a(this, getContext());
        C0195H c0195h = new C0195H(this);
        this.f2787a = c0195h;
        c0195h.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0195H c0195h = this.f2787a;
        Drawable drawable = c0195h.f2814f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0194G c0194g = c0195h.f2813e;
        if (drawable.setState(c0194g.getDrawableState())) {
            c0194g.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2787a.f2814f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2787a.g(canvas);
    }
}
