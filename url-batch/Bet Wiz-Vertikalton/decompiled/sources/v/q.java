package v;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class q extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4024a;

    public q(Context context) {
        super(context);
        this.f4024a = true;
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
        this.f4024a = z2;
    }

    public void setGuidelineBegin(int i) {
        C0318e c0318e = (C0318e) getLayoutParams();
        if (this.f4024a && c0318e.f3870a == i) {
            return;
        }
        c0318e.f3870a = i;
        setLayoutParams(c0318e);
    }

    public void setGuidelineEnd(int i) {
        C0318e c0318e = (C0318e) getLayoutParams();
        if (this.f4024a && c0318e.f3872b == i) {
            return;
        }
        c0318e.f3872b = i;
        setLayoutParams(c0318e);
    }

    public void setGuidelinePercent(float f2) {
        C0318e c0318e = (C0318e) getLayoutParams();
        if (this.f4024a && c0318e.f3874c == f2) {
            return;
        }
        c0318e.f3874c = f2;
        setLayoutParams(c0318e);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
