package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.fortuneink.neonpad.R;

/* renamed from: l.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238I extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0239J f3253a;

    public C0238I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        T0.a(this, getContext());
        C0239J c0239j = new C0239J(this);
        this.f3253a = c0239j;
        c0239j.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0239J c0239j = this.f3253a;
        Drawable drawable = c0239j.f3255f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0238I c0238i = c0239j.f3254e;
        if (drawable.setState(c0238i.getDrawableState())) {
            c0238i.invalidateDrawable(drawable);
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
