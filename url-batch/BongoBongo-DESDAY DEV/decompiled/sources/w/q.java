package w;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class q extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4172a;

    public q(Context context) {
        super(context);
        this.f4172a = true;
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
        this.f4172a = z2;
    }

    public void setGuidelineBegin(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f4172a && eVar.f4014a == i) {
            return;
        }
        eVar.f4014a = i;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f4172a && eVar.f4016b == i) {
            return;
        }
        eVar.f4016b = i;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f2) {
        e eVar = (e) getLayoutParams();
        if (this.f4172a && eVar.f4018c == f2) {
            return;
        }
        eVar.f4018c = f2;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
