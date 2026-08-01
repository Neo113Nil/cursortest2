package v;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4004a;

    public p(Context context) {
        super(context);
        this.f4004a = true;
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
        this.f4004a = z2;
    }

    public void setGuidelineBegin(int i) {
        C0323e c0323e = (C0323e) getLayoutParams();
        if (this.f4004a && c0323e.f3853a == i) {
            return;
        }
        c0323e.f3853a = i;
        setLayoutParams(c0323e);
    }

    public void setGuidelineEnd(int i) {
        C0323e c0323e = (C0323e) getLayoutParams();
        if (this.f4004a && c0323e.f3855b == i) {
            return;
        }
        c0323e.f3855b = i;
        setLayoutParams(c0323e);
    }

    public void setGuidelinePercent(float f2) {
        C0323e c0323e = (C0323e) getLayoutParams();
        if (this.f4004a && c0323e.f3857c == f2) {
            return;
        }
        c0323e.f3857c = f2;
        setLayoutParams(c0323e);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
