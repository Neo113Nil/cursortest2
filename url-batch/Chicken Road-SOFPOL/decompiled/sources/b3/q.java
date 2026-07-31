package b3;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q extends View {

    /* renamed from: d, reason: collision with root package name */
    public boolean f1227d;

    public q(Context context) {
        super(context);
        this.f1227d = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z3) {
        this.f1227d = z3;
    }

    public void setGuidelineBegin(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f1227d && eVar.f1080a == i) {
            return;
        }
        eVar.f1080a = i;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f1227d && eVar.f1082b == i) {
            return;
        }
        eVar.f1082b = i;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f6) {
        e eVar = (e) getLayoutParams();
        if (this.f1227d && eVar.f1084c == f6) {
            return;
        }
        eVar.f1084c = f6;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
