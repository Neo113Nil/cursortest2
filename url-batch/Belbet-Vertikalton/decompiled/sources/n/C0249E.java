package n;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.winpower.neonfit.R;

/* renamed from: n.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249E extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0247C f3447a;

    public C0249E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        W0.a(this, getContext());
        C0247C c0247c = new C0247C(this);
        this.f3447a = c0247c;
        c0247c.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f3447a.f3442c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
