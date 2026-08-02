package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.authenticator2.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mf implements gp {
    gd a;
    public gf b;
    final /* synthetic */ Toolbar c;

    public mf(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.gp
    public final int a() {
        return 0;
    }

    @Override // defpackage.gp
    public final Parcelable bh() {
        return null;
    }

    @Override // defpackage.gp
    public final void c(Context context, gd gdVar) {
        gf gfVar;
        gd gdVar2 = this.a;
        if (gdVar2 != null && (gfVar = this.b) != null) {
            gdVar2.t(gfVar);
        }
        this.a = gdVar;
    }

    @Override // defpackage.gp
    public final void e(go goVar) {
        throw null;
    }

    @Override // defpackage.gp
    public final boolean f() {
        return false;
    }

    @Override // defpackage.gp
    public final boolean g(gw gwVar) {
        return false;
    }

    @Override // defpackage.gp
    public final boolean h(gf gfVar) {
        Toolbar toolbar = this.c;
        View view = toolbar.h;
        if (view instanceof gh) {
            ((gh) view).a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.h);
        toolbar.removeView(toolbar.g);
        toolbar.h = null;
        ArrayList arrayList = toolbar.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.b = null;
                toolbar.requestLayout();
                gfVar.h(false);
                toolbar.v();
                return true;
            }
            toolbar.addView((View) arrayList.get(size));
        }
    }

    @Override // defpackage.gp
    public final boolean i(gf gfVar) {
        Toolbar toolbar = this.c;
        if (toolbar.g == null) {
            toolbar.g = new hz(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.g.setImageDrawable(toolbar.e);
            toolbar.g.setContentDescription(toolbar.f);
            mg mgVar = new mg();
            mgVar.a = (toolbar.m & 112) | 8388611;
            mgVar.b = 2;
            toolbar.g.setLayoutParams(mgVar);
            toolbar.g.setOnClickListener(new cx(toolbar, 3));
        }
        ViewParent parent = toolbar.g.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.g);
            }
            toolbar.addView(toolbar.g);
        }
        toolbar.h = gfVar.getActionView();
        this.b = gfVar;
        ViewParent parent2 = toolbar.h.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.h);
            }
            mg mgVar2 = new mg();
            mgVar2.a = (toolbar.m & 112) | 8388611;
            mgVar2.b = 2;
            toolbar.h.setLayoutParams(mgVar2);
            toolbar.addView(toolbar.h);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((mg) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.q.add(childAt);
            }
        }
        toolbar.requestLayout();
        gfVar.h(true);
        View view = toolbar.h;
        if (view instanceof gh) {
            ((gh) view).a.onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // defpackage.gp
    public final void j() {
        if (this.b != null) {
            gd gdVar = this.a;
            if (gdVar != null) {
                int size = gdVar.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            h(this.b);
        }
    }

    @Override // defpackage.gp
    public final void n(Parcelable parcelable) {
    }

    @Override // defpackage.gp
    public final void d(gd gdVar, boolean z) {
    }
}
