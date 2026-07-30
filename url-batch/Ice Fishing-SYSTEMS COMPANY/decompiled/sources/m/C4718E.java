package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.icefishing.icefishingliveapp.C5284R;

/* renamed from: m.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4718E extends SeekBar {

    /* renamed from: n, reason: collision with root package name */
    public final C4719F f39261n;

    public C4718E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C5284R.attr.seekBarStyle);
        N0.a(getContext(), this);
        C4719F c4719f = new C4719F(this);
        this.f39261n = c4719f;
        c4719f.b(attributeSet, C5284R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C4719F c4719f = this.f39261n;
        Drawable drawable = c4719f.f39263f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C4718E c4718e = c4719f.f39262e;
        if (drawable.setState(c4718e.getDrawableState())) {
            c4718e.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f39261n.f39263f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f39261n.g(canvas);
    }
}
