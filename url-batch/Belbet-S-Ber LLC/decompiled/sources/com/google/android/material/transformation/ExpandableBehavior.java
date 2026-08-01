package com.google.android.material.transformation;

import a0.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import f2.a;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends c {

    /* renamed from: a, reason: collision with root package name */
    public int f1272a = 0;

    public ExpandableBehavior() {
    }

    @Override // a0.c
    public abstract boolean b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a0.c
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (a) view2;
        boolean z4 = ((FloatingActionButton) obj).f1149t.f1436f;
        if (z4) {
            int i = this.f1272a;
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (this.f1272a != 1) {
            return false;
        }
        this.f1272a = z4 ? 1 : 2;
        r((View) obj, view, z4, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a0.c
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        a aVar;
        int i4;
        if (!view.isLaidOut()) {
            ArrayList j2 = coordinatorLayout.j(view);
            int size = j2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) j2.get(i5);
                if (b(view, view2)) {
                    aVar = (a) view2;
                    break;
                }
                i5++;
            }
            if (aVar != null) {
                boolean z4 = ((FloatingActionButton) aVar).f1149t.f1436f;
                if (!z4 ? this.f1272a == 1 : !((i4 = this.f1272a) != 0 && i4 != 2)) {
                    int i6 = z4 ? 1 : 2;
                    this.f1272a = i6;
                    view.getViewTreeObserver().addOnPreDrawListener(new v2.a(this, view, i6, aVar));
                }
            }
        }
        return false;
    }

    public abstract void r(View view, View view2, boolean z4, boolean z5);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
