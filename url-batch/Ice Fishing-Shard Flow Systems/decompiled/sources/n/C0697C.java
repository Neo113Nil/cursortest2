package n;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.icefishing.icefish.ice.fishing.s294s.R;

/* renamed from: n.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0697C extends RatingBar {

    /* renamed from: d, reason: collision with root package name */
    public final C0695A f6626d;

    public C0697C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        i1.a(this, getContext());
        C0695A c0695a = new C0695A(this);
        this.f6626d = c0695a;
        c0695a.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i2, int i5) {
        super.onMeasure(i2, i5);
        Bitmap bitmap = (Bitmap) this.f6626d.f6606c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
