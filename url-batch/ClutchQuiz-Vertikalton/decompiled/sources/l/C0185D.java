package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.clutchquizarena.app.R;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185D extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0183B f2834a;

    public C0185D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        Q0.a(this, getContext());
        C0183B c0183b = new C0183B(this);
        this.f2834a = c0183b;
        c0183b.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f2834a.f2828c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
