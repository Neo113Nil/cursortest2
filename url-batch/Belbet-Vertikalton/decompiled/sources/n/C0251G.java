package n;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.winpower.neonfit.R;

/* renamed from: n.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251G extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0252H f3451a;

    public C0251G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        W0.a(this, getContext());
        C0252H c0252h = new C0252H(this);
        this.f3451a = c0252h;
        c0252h.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0252H c0252h = this.f3451a;
        Drawable drawable = c0252h.f3453f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0251G c0251g = c0252h.e;
        if (drawable.setState(c0251g.getDrawableState())) {
            c0251g.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3451a.f3453f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3451a.g(canvas);
    }
}
