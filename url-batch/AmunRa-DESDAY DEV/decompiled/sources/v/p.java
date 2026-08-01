package v;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4100a;

    public p(Context context) {
        super(context);
        this.f4100a = true;
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
        this.f4100a = z2;
    }

    public void setGuidelineBegin(int i) {
        C0320e c0320e = (C0320e) getLayoutParams();
        if (this.f4100a && c0320e.f3951a == i) {
            return;
        }
        c0320e.f3951a = i;
        setLayoutParams(c0320e);
    }

    public void setGuidelineEnd(int i) {
        C0320e c0320e = (C0320e) getLayoutParams();
        if (this.f4100a && c0320e.f3953b == i) {
            return;
        }
        c0320e.f3953b = i;
        setLayoutParams(c0320e);
    }

    public void setGuidelinePercent(float f2) {
        C0320e c0320e = (C0320e) getLayoutParams();
        if (this.f4100a && c0320e.f3955c == f2) {
            return;
        }
        c0320e.f3955c = f2;
        setLayoutParams(c0320e);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
