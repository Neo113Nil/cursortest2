package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.winfour.winrandom.R;

/* renamed from: m.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189G extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0190H f2919a;

    public C0189G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        X0.a(this, getContext());
        C0190H c0190h = new C0190H(this);
        this.f2919a = c0190h;
        c0190h.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0190H c0190h = this.f2919a;
        Drawable drawable = c0190h.f2922f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0189G c0189g = c0190h.f2921e;
        if (drawable.setState(c0189g.getDrawableState())) {
            c0189g.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2919a.f2922f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2919a.g(canvas);
    }
}
