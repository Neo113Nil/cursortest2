package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.neonpulse.gridlogic.R;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191E extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0189C f2840a;

    public C0191E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        R0.a(this, getContext());
        C0189C c0189c = new C0189C(this);
        this.f2840a = c0189c;
        c0189c.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f2840a.f2834c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
