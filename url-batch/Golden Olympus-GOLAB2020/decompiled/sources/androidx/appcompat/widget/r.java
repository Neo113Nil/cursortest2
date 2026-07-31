package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import e.AbstractC2405a;

/* loaded from: classes.dex */
public class r extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    private final C1267p f10966a;

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2405a.f36179F);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        Bitmap b4 = this.f10966a.b();
        if (b4 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b4.getWidth() * getNumStars(), i4, 0), getMeasuredHeight());
        }
    }

    public r(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        V.a(this, getContext());
        C1267p c1267p = new C1267p(this);
        this.f10966a = c1267p;
        c1267p.c(attributeSet, i4);
    }
}
