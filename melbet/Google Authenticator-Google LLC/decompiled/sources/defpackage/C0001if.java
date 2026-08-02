package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* renamed from: if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0001if extends SeekBar {
    private final ig a;

    public C0001if(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        mb.d(this, getContext());
        ig igVar = new ig(this);
        this.a = igVar;
        igVar.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ig igVar = this.a;
        Drawable drawable = igVar.c;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        SeekBar seekBar = igVar.b;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ig igVar = this.a;
        if (igVar.c != null) {
            SeekBar seekBar = igVar.b;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = igVar.c.getIntrinsicWidth();
                int intrinsicHeight = igVar.c.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth >> 1 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight >> 1 : 1;
                igVar.c.setBounds(-i, -i2, i, i2);
                int width = (seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight();
                int save = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    igVar.c.draw(canvas);
                    canvas.translate(width / max, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
