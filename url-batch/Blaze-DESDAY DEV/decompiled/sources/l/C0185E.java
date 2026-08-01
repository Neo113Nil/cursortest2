package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.winworm.neongrid.R;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185E extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0183C f2804a;

    public C0185E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        R0.a(this, getContext());
        C0183C c0183c = new C0183C(this);
        this.f2804a = c0183c;
        c0183c.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f2804a.f2798c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
