package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.glasspulse.glasspulse.R;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184D extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0182B f2819a;

    public C0184D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        Q0.a(this, getContext());
        C0182B c0182b = new C0182B(this);
        this.f2819a = c0182b;
        c0182b.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f2819a.f2813c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
