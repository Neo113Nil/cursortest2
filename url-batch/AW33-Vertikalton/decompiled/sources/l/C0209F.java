package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.luckycalc.loanfinance.R;

/* renamed from: l.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209F extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0207D f2852a;

    public C0209F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        S0.a(this, getContext());
        C0207D c0207d = new C0207D(this);
        this.f2852a = c0207d;
        c0207d.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f2852a.f2846c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
