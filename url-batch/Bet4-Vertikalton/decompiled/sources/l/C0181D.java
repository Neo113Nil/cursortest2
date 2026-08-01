package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.playbag.tripgear.R;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181D extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0179B f2776a;

    public C0181D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        R0.a(this, getContext());
        C0179B c0179b = new C0179B(this);
        this.f2776a = c0179b;
        c0179b.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f2776a.f2769c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
