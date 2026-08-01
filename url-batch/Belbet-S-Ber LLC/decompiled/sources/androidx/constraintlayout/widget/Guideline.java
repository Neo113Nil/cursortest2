package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import y.e;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: f, reason: collision with root package name */
    public boolean f381f;

    public Guideline(Context context) {
        super(context);
        this.f381f = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z4) {
        this.f381f = z4;
    }

    public void setGuidelineBegin(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f381f && eVar.f3962a == i) {
            return;
        }
        eVar.f3962a = i;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f381f && eVar.f3964b == i) {
            return;
        }
        eVar.f3964b = i;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f5) {
        e eVar = (e) getLayoutParams();
        if (this.f381f && eVar.f3966c == f5) {
            return;
        }
        eVar.f3966c = f5;
        setLayoutParams(eVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f381f = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
