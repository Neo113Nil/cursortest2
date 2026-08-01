package k;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c0 extends RatingBar {

    /* renamed from: f, reason: collision with root package name */
    public final a0 f2507f;

    public c0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        o2.a(this, getContext());
        a0 a0Var = new a0(this);
        this.f2507f = a0Var;
        a0Var.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        Bitmap bitmap = (Bitmap) this.f2507f.c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i4, 0), getMeasuredHeight());
        }
    }
}
