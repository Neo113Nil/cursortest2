package x;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class q extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4141a;

    public q(Context context) {
        super(context);
        this.f4141a = true;
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
        this.f4141a = z2;
    }

    public void setGuidelineBegin(int i) {
        C0304e c0304e = (C0304e) getLayoutParams();
        if (this.f4141a && c0304e.f3987a == i) {
            return;
        }
        c0304e.f3987a = i;
        setLayoutParams(c0304e);
    }

    public void setGuidelineEnd(int i) {
        C0304e c0304e = (C0304e) getLayoutParams();
        if (this.f4141a && c0304e.f3989b == i) {
            return;
        }
        c0304e.f3989b = i;
        setLayoutParams(c0304e);
    }

    public void setGuidelinePercent(float f2) {
        C0304e c0304e = (C0304e) getLayoutParams();
        if (this.f4141a && c0304e.f3991c == f2) {
            return;
        }
        c0304e.f3991c = f2;
        setLayoutParams(c0304e);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
