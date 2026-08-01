package x;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4701a;

    public p(Context context) {
        super(context);
        this.f4701a = true;
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
        this.f4701a = z2;
    }

    public void setGuidelineBegin(int i) {
        C0414e c0414e = (C0414e) getLayoutParams();
        if (this.f4701a && c0414e.f4548a == i) {
            return;
        }
        c0414e.f4548a = i;
        setLayoutParams(c0414e);
    }

    public void setGuidelineEnd(int i) {
        C0414e c0414e = (C0414e) getLayoutParams();
        if (this.f4701a && c0414e.f4550b == i) {
            return;
        }
        c0414e.f4550b = i;
        setLayoutParams(c0414e);
    }

    public void setGuidelinePercent(float f2) {
        C0414e c0414e = (C0414e) getLayoutParams();
        if (this.f4701a && c0414e.f4552c == f2) {
            return;
        }
        c0414e.f4552c = f2;
        setLayoutParams(c0414e);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
