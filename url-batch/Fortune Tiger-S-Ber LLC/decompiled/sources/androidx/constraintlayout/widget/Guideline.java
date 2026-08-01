package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import v.e;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: f, reason: collision with root package name */
    public boolean f272f;

    public Guideline(Context context) {
        super(context);
        this.f272f = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z3) {
        this.f272f = z3;
    }

    public void setGuidelineBegin(int i4) {
        e eVar = (e) getLayoutParams();
        if (this.f272f && eVar.f3445a == i4) {
            return;
        }
        eVar.f3445a = i4;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i4) {
        e eVar = (e) getLayoutParams();
        if (this.f272f && eVar.f3446b == i4) {
            return;
        }
        eVar.f3446b = i4;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f4) {
        e eVar = (e) getLayoutParams();
        if (this.f272f && eVar.c == f4) {
            return;
        }
        eVar.c = f4;
        setLayoutParams(eVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f272f = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
    }
}
