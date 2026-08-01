package v;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3973a;

    public p(Context context) {
        super(context);
        this.f3973a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.f3973a = z2;
    }

    public void setGuidelineBegin(int i) {
        C0366e c0366e = (C0366e) getLayoutParams();
        if (this.f3973a && c0366e.f3822a == i) {
            return;
        }
        c0366e.f3822a = i;
        setLayoutParams(c0366e);
    }

    public void setGuidelineEnd(int i) {
        C0366e c0366e = (C0366e) getLayoutParams();
        if (this.f3973a && c0366e.f3824b == i) {
            return;
        }
        c0366e.f3824b = i;
        setLayoutParams(c0366e);
    }

    public void setGuidelinePercent(float f2) {
        C0366e c0366e = (C0366e) getLayoutParams();
        if (this.f3973a && c0366e.f3826c == f2) {
            return;
        }
        c0366e.f3826c = f2;
        setLayoutParams(c0366e);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
