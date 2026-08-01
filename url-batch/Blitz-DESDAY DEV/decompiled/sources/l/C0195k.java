package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.winfour.neondrop.R;
import java.util.ArrayList;
import k.InterfaceC0158A;
import k.SubMenuC0162E;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195k implements k.y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3013a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3014b;

    /* renamed from: c, reason: collision with root package name */
    public k.m f3015c;
    public final LayoutInflater d;

    /* renamed from: e, reason: collision with root package name */
    public k.x f3016e;
    public InterfaceC0158A h;
    public C0193j i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3019j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3020k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3021l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3022m;

    /* renamed from: n, reason: collision with root package name */
    public int f3023n;

    /* renamed from: o, reason: collision with root package name */
    public int f3024o;

    /* renamed from: p, reason: collision with root package name */
    public int f3025p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3026q;

    /* renamed from: s, reason: collision with root package name */
    public C0187g f3028s;

    /* renamed from: t, reason: collision with root package name */
    public C0187g f3029t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0191i f3030u;

    /* renamed from: v, reason: collision with root package name */
    public C0189h f3031v;

    /* renamed from: f, reason: collision with root package name */
    public final int f3017f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f3018g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f3027r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final E.g f3032w = new E.g(28, this);

    public C0195k(Context context) {
        this.f3013a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(k.o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof k.z ? (k.z) view : (k.z) this.d.inflate(this.f3018g, viewGroup, false);
            actionMenuItemView.a(oVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f3031v == null) {
                this.f3031v = new C0189h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3031v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(oVar.f2791C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0199m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.y
    public final void b(k.m mVar, boolean z2) {
        f();
        C0187g c0187g = this.f3029t;
        if (c0187g != null && c0187g.b()) {
            c0187g.i.dismiss();
        }
        k.x xVar = this.f3016e;
        if (xVar != null) {
            xVar.b(mVar, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.y
    public final void c() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            k.m mVar = this.f3015c;
            if (mVar != null) {
                mVar.i();
                ArrayList l2 = this.f3015c.l();
                int size = l2.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    k.o oVar = (k.o) l2.get(i2);
                    if (oVar.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        k.o itemData = childAt instanceof k.z ? ((k.z) childAt).getItemData() : null;
                        View a2 = a(oVar, childAt, viewGroup);
                        if (oVar != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.h).addView(a2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.i) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.h).requestLayout();
        k.m mVar2 = this.f3015c;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                k.p pVar = ((k.o) arrayList2.get(i3)).f2789A;
            }
        }
        k.m mVar3 = this.f3015c;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.f2771j;
        }
        if (this.f3021l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((k.o) arrayList.get(0)).f2791C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new C0193j(this, this.f3013a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0193j c0193j = this.i;
                actionMenuView.getClass();
                C0199m j2 = ActionMenuView.j();
                j2.f3033a = true;
                actionMenuView.addView(c0193j, j2);
            }
        } else {
            C0193j c0193j2 = this.i;
            if (c0193j2 != null) {
                Object parent = c0193j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f3021l);
    }

    @Override // k.y
    public final boolean d(k.o oVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.y
    public final boolean e(SubMenuC0162E subMenuC0162E) {
        boolean z2;
        if (!subMenuC0162E.hasVisibleItems()) {
            return false;
        }
        SubMenuC0162E subMenuC0162E2 = subMenuC0162E;
        while (true) {
            k.m mVar = subMenuC0162E2.f2706z;
            if (mVar == this.f3015c) {
                break;
            }
            subMenuC0162E2 = (SubMenuC0162E) mVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof k.z) && ((k.z) childAt).getItemData() == subMenuC0162E2.f2705A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0162E.f2705A.getClass();
        int size = subMenuC0162E.f2769f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = subMenuC0162E.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        C0187g c0187g = new C0187g(this, this.f3014b, subMenuC0162E, view);
        this.f3029t = c0187g;
        c0187g.f2831g = z2;
        k.u uVar = c0187g.i;
        if (uVar != null) {
            uVar.o(z2);
        }
        C0187g c0187g2 = this.f3029t;
        if (!c0187g2.b()) {
            if (c0187g2.f2829e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0187g2.d(0, 0, false, false);
        }
        k.x xVar = this.f3016e;
        if (xVar != null) {
            xVar.f(subMenuC0162E);
        }
        return true;
    }

    public final boolean f() {
        Object obj;
        RunnableC0191i runnableC0191i = this.f3030u;
        if (runnableC0191i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0191i);
            this.f3030u = null;
            return true;
        }
        C0187g c0187g = this.f3028s;
        if (c0187g == null) {
            return false;
        }
        if (c0187g.b()) {
            c0187g.i.dismiss();
        }
        return true;
    }

    @Override // k.y
    public final void g(k.x xVar) {
        throw null;
    }

    @Override // k.y
    public final boolean h(k.o oVar) {
        return false;
    }

    public final boolean i() {
        C0187g c0187g = this.f3028s;
        return c0187g != null && c0187g.b();
    }

    @Override // k.y
    public final void j(Context context, k.m mVar) {
        this.f3014b = context;
        LayoutInflater.from(context);
        this.f3015c = mVar;
        Resources resources = context.getResources();
        if (!this.f3022m) {
            this.f3021l = true;
        }
        int i = 2;
        this.f3023n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f3025p = i;
        int i4 = this.f3023n;
        if (this.f3021l) {
            if (this.i == null) {
                C0193j c0193j = new C0193j(this, this.f3013a);
                this.i = c0193j;
                if (this.f3020k) {
                    c0193j.setImageDrawable(this.f3019j);
                    this.f3019j = null;
                    this.f3020k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.f3024o = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.y
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z2;
        k.m mVar = this.f3015c;
        if (mVar != null) {
            arrayList = mVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f3025p;
        int i4 = this.f3024o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.h;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= i) {
                break;
            }
            k.o oVar = (k.o) arrayList.get(i5);
            int i8 = oVar.f2813y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f3026q && oVar.f2791C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f3021l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f3027r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            k.o oVar2 = (k.o) arrayList.get(i10);
            int i12 = oVar2.f2813y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = oVar2.f2793b;
            if (z4) {
                View a2 = a(oVar2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                oVar2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View a3 = a(oVar2, null, viewGroup);
                    a3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z6 &= i4 + i11 > 0;
                }
                if (z6 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z5) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        k.o oVar3 = (k.o) arrayList.get(i14);
                        if (oVar3.f2793b == i13) {
                            if (oVar3.f()) {
                                i9++;
                            }
                            oVar3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                oVar2.g(z6);
            } else {
                oVar2.g(false);
                i10++;
                i2 = 2;
                z2 = true;
            }
            i10++;
            i2 = 2;
            z2 = true;
        }
        return z2;
    }

    public final boolean l() {
        k.m mVar;
        if (!this.f3021l || i() || (mVar = this.f3015c) == null || this.h == null || this.f3030u != null) {
            return false;
        }
        mVar.i();
        if (mVar.f2771j.isEmpty()) {
            return false;
        }
        RunnableC0191i runnableC0191i = new RunnableC0191i(this, new C0187g(this, this.f3014b, this.f3015c, this.i));
        this.f3030u = runnableC0191i;
        ((View) this.h).post(runnableC0191i);
        return true;
    }
}
