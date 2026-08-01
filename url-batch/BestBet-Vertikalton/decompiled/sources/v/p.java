package v;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4431a;

    public p(Context context) {
        super(context);
        this.f4431a = true;
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
        this.f4431a = z2;
    }

    public void setGuidelineBegin(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f4431a && eVar.f4280a == i) {
            return;
        }
        eVar.f4280a = i;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f4431a && eVar.f4282b == i) {
            return;
        }
        eVar.f4282b = i;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f2) {
        e eVar = (e) getLayoutParams();
        if (this.f4431a && eVar.f4284c == f2) {
            return;
        }
        eVar.f4284c = f2;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
