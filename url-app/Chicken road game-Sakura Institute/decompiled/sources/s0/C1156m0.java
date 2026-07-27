package s0;

import Z.AbstractC0307d;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.chicken.road.kedro.laqer.R;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s0.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1156m0 extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public boolean f10265d;

    public C1156m0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(Z.r rVar, R0 r02, long j4) {
        super.drawChild(AbstractC0307d.a(rVar), r02, j4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            Intrinsics.d(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((R0) childAt).f10124n) {
                this.f10265d = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f10265d = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f10265d) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i2, int i4, int i5, int i6) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i4) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
