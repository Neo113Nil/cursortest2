package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.fortuneink.neonpad.R;

/* renamed from: l.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236G extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0234E f3225a;

    public C0236G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        T0.a(this, getContext());
        C0234E c0234e = new C0234E(this);
        this.f3225a = c0234e;
        c0234e.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f3225a.f3218c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
