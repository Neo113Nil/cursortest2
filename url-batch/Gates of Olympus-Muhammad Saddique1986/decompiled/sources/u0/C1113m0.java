package u0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import b0.AbstractC0335d;
import com.gatesof.olympus.martu.marku.R;

/* renamed from: u0.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1113m0 extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public boolean f9405d;

    public C1113m0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(b0.r rVar, Q0 q0, long j3) {
        super.drawChild(AbstractC0335d.a(rVar), q0, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f2.j.d(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((Q0) childAt).f9257k) {
                this.f9405d = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f9405d = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f9405d) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
    }
}
