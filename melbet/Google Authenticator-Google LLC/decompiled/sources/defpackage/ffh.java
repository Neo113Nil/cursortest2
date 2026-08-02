package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ffh extends tw {
    private int a;
    private jjv b;

    public ffh() {
        this.a = 0;
    }

    public final int U() {
        jjv jjvVar = this.b;
        if (jjvVar != null) {
            return jjvVar.a;
        }
        return 0;
    }

    public final boolean V(int i) {
        jjv jjvVar = this.b;
        if (jjvVar != null) {
            return jjvVar.R(i);
        }
        this.a = i;
        return false;
    }

    protected void bF(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.j(view, i);
    }

    @Override // defpackage.tw
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        bF(coordinatorLayout, view, i);
        jjv jjvVar = this.b;
        if (jjvVar == null) {
            jjvVar = new jjv(view);
            this.b = jjvVar;
        }
        View view2 = (View) jjvVar.d;
        jjvVar.c = view2.getTop();
        jjvVar.b = view2.getLeft();
        this.b.Q();
        int i2 = this.a;
        if (i2 == 0) {
            return true;
        }
        this.b.R(i2);
        this.a = 0;
        return true;
    }

    public ffh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
