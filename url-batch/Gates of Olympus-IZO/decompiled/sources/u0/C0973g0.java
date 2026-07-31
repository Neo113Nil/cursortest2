package u0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import b0.AbstractC0272e;
import b0.InterfaceC0285r;
import com.gates.olympus.miruv.R;

/* renamed from: u0.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0973g0 extends ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public boolean f8328d;

    public C0973g0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(InterfaceC0285r interfaceC0285r, F0 f02, long j3) {
        super.drawChild(AbstractC0272e.a(interfaceC0285r), f02, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            Z1.i.d(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((F0) childAt).f8170k) {
                this.f8328d = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f8328d = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f8328d) {
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
