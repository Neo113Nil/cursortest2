package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.playbag.tripgear.R;

/* renamed from: l.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183F extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0184G f2779a;

    public C0183F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        R0.a(this, getContext());
        C0184G c0184g = new C0184G(this);
        this.f2779a = c0184g;
        c0184g.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0184G c0184g = this.f2779a;
        Drawable drawable = c0184g.f2806f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0183F c0183f = c0184g.f2805e;
        if (drawable.setState(c0183f.getDrawableState())) {
            c0183f.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2779a.f2806f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2779a.g(canvas);
    }
}
