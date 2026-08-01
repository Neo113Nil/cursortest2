package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.fortunequest.neontrack.R;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0207D extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0205B f3257a;

    public C0207D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        Q0.a(this, getContext());
        C0205B c0205b = new C0205B(this);
        this.f3257a = c0205b;
        c0205b.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f3257a.f3251c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
