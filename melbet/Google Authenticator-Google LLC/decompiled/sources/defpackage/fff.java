package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class fff extends ffh {
    public final Rect a;
    final Rect b;
    public int c;
    public int d;

    public fff() {
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    public float J(View view) {
        throw null;
    }

    public int K(View view) {
        throw null;
    }

    public abstract View L(List list);

    public final int N(View view) {
        if (this.d == 0) {
            return 0;
        }
        float J = J(view);
        int i = this.d;
        return pj.j((int) (J * i), 0, i);
    }

    public boolean P() {
        return false;
    }

    @Override // defpackage.ffh
    protected final void bF(CoordinatorLayout coordinatorLayout, View view, int i) {
        View L = L(coordinatorLayout.a(view));
        if (L == null) {
            coordinatorLayout.j(view, i);
            this.c = 0;
            return;
        }
        tz tzVar = (tz) view.getLayoutParams();
        Rect rect = this.a;
        rect.set(coordinatorLayout.getPaddingLeft() + tzVar.leftMargin, L.getBottom() + tzVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - tzVar.rightMargin, ((coordinatorLayout.getHeight() + L.getBottom()) - coordinatorLayout.getPaddingBottom()) - tzVar.bottomMargin);
        zz zzVar = coordinatorLayout.e;
        if (zzVar != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += zzVar.b();
            rect.right -= zzVar.c();
        }
        Rect rect2 = this.b;
        int i2 = tzVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int N = N(L);
        view.layout(rect2.left, rect2.top - N, rect2.right, rect2.bottom - N);
        this.c = rect2.top - L.getBottom();
    }

    public fff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }
}
