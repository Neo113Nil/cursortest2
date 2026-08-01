package v;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4440a;

    public p(Context context) {
        super(context);
        this.f4440a = true;
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
        this.f4440a = z2;
    }

    public void setGuidelineBegin(int i) {
        C0351e c0351e = (C0351e) getLayoutParams();
        if (this.f4440a && c0351e.f4281a == i) {
            return;
        }
        c0351e.f4281a = i;
        setLayoutParams(c0351e);
    }

    public void setGuidelineEnd(int i) {
        C0351e c0351e = (C0351e) getLayoutParams();
        if (this.f4440a && c0351e.f4283b == i) {
            return;
        }
        c0351e.f4283b = i;
        setLayoutParams(c0351e);
    }

    public void setGuidelinePercent(float f2) {
        C0351e c0351e = (C0351e) getLayoutParams();
        if (this.f4440a && c0351e.f4285c == f2) {
            return;
        }
        c0351e.f4285c = f2;
        setLayoutParams(c0351e);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
