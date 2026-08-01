package v;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4156a;

    public p(Context context) {
        super(context);
        this.f4156a = true;
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
        this.f4156a = z2;
    }

    public void setGuidelineBegin(int i) {
        C0310e c0310e = (C0310e) getLayoutParams();
        if (this.f4156a && c0310e.f4007a == i) {
            return;
        }
        c0310e.f4007a = i;
        setLayoutParams(c0310e);
    }

    public void setGuidelineEnd(int i) {
        C0310e c0310e = (C0310e) getLayoutParams();
        if (this.f4156a && c0310e.f4009b == i) {
            return;
        }
        c0310e.f4009b = i;
        setLayoutParams(c0310e);
    }

    public void setGuidelinePercent(float f2) {
        C0310e c0310e = (C0310e) getLayoutParams();
        if (this.f4156a && c0310e.f4011c == f2) {
            return;
        }
        c0310e.f4011c = f2;
        setLayoutParams(c0310e);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
