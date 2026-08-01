package k;

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
import com.gglhk.bofio.fortunetiger.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class k implements j.y {
    public h A;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2567f;
    public Context g;
    public j.m h;

    /* renamed from: i, reason: collision with root package name */
    public final LayoutInflater f2568i;

    /* renamed from: j, reason: collision with root package name */
    public j.x f2569j;

    /* renamed from: m, reason: collision with root package name */
    public j.a0 f2572m;

    /* renamed from: n, reason: collision with root package name */
    public j f2573n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2574o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2575p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2576q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2577r;

    /* renamed from: s, reason: collision with root package name */
    public int f2578s;

    /* renamed from: t, reason: collision with root package name */
    public int f2579t;

    /* renamed from: u, reason: collision with root package name */
    public int f2580u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2581v;

    /* renamed from: x, reason: collision with root package name */
    public g f2583x;

    /* renamed from: y, reason: collision with root package name */
    public g f2584y;

    /* renamed from: z, reason: collision with root package name */
    public i f2585z;

    /* renamed from: k, reason: collision with root package name */
    public final int f2570k = R.layout.abc_action_menu_layout;

    /* renamed from: l, reason: collision with root package name */
    public final int f2571l = R.layout.abc_action_menu_item_layout;

    /* renamed from: w, reason: collision with root package name */
    public final SparseBooleanArray f2582w = new SparseBooleanArray();
    public final a2.e B = new a2.e(19, this);

    public k(Context context) {
        this.f2567f = context;
        this.f2568i = LayoutInflater.from(context);
    }

    @Override // j.y
    public final void a(j.m mVar, boolean z3) {
        c();
        g gVar = this.f2584y;
        if (gVar != null && gVar.b()) {
            gVar.f2250j.dismiss();
        }
        j.x xVar = this.f2569j;
        if (xVar != null) {
            xVar.a(mVar, z3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View b(j.o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof j.z ? (j.z) view : (j.z) this.f2568i.inflate(this.f2571l, viewGroup, false);
            actionMenuItemView.b(oVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f2572m);
            if (this.A == null) {
                this.A = new h(this);
            }
            actionMenuItemView2.setPopupCallback(this.A);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(oVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    public final boolean c() {
        Object obj;
        i iVar = this.f2585z;
        if (iVar != null && (obj = this.f2572m) != null) {
            ((View) obj).removeCallbacks(iVar);
            this.f2585z = null;
            return true;
        }
        g gVar = this.f2583x;
        if (gVar == null) {
            return false;
        }
        if (gVar.b()) {
            gVar.f2250j.dismiss();
        }
        return true;
    }

    @Override // j.y
    public final boolean d(j.o oVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.y
    public final void e() {
        int i4;
        ViewGroup viewGroup = (ViewGroup) this.f2572m;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            j.m mVar = this.h;
            if (mVar != null) {
                mVar.i();
                ArrayList l4 = this.h.l();
                int size = l4.size();
                i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    j.o oVar = (j.o) l4.get(i5);
                    if ((oVar.f2231x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i4);
                        j.o itemData = childAt instanceof j.z ? ((j.z) childAt).getItemData() : null;
                        View b2 = b(oVar, childAt, viewGroup);
                        if (oVar != itemData) {
                            b2.setPressed(false);
                            b2.jumpDrawablesToCurrentState();
                        }
                        if (b2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b2);
                            }
                            ((ViewGroup) this.f2572m).addView(b2, i4);
                        }
                        i4++;
                    }
                }
            } else {
                i4 = 0;
            }
            while (i4 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i4) == this.f2573n) {
                    i4++;
                } else {
                    viewGroup.removeViewAt(i4);
                }
            }
        }
        ((View) this.f2572m).requestLayout();
        j.m mVar2 = this.h;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.f2194i;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                j.p pVar = ((j.o) arrayList2.get(i6)).A;
            }
        }
        j.m mVar3 = this.h;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.f2195j;
        }
        if (this.f2576q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((j.o) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f2573n == null) {
                this.f2573n = new j(this, this.f2567f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2573n.getParent();
            if (viewGroup3 != this.f2572m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2573n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2572m;
                j jVar = this.f2573n;
                actionMenuView.getClass();
                m j4 = ActionMenuView.j();
                j4.f2595a = true;
                actionMenuView.addView(jVar, j4);
            }
        } else {
            j jVar2 = this.f2573n;
            if (jVar2 != null) {
                Object parent = jVar2.getParent();
                Object obj = this.f2572m;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f2573n);
                }
            }
        }
        ((ActionMenuView) this.f2572m).setOverflowReserved(this.f2576q);
    }

    public final boolean f() {
        g gVar = this.f2583x;
        return gVar != null && gVar.b();
    }

    @Override // j.y
    public final void g(Context context, j.m mVar) {
        this.g = context;
        LayoutInflater.from(context);
        this.h = mVar;
        Resources resources = context.getResources();
        if (!this.f2577r) {
            this.f2576q = true;
        }
        int i4 = 2;
        this.f2578s = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i5 > 600 || ((i5 > 960 && i6 > 720) || (i5 > 720 && i6 > 960))) {
            i4 = 5;
        } else if (i5 >= 500 || ((i5 > 640 && i6 > 480) || (i5 > 480 && i6 > 640))) {
            i4 = 4;
        } else if (i5 >= 360) {
            i4 = 3;
        }
        this.f2580u = i4;
        int i7 = this.f2578s;
        if (this.f2576q) {
            if (this.f2573n == null) {
                j jVar = new j(this, this.f2567f);
                this.f2573n = jVar;
                if (this.f2575p) {
                    jVar.setImageDrawable(this.f2574o);
                    this.f2574o = null;
                    this.f2575p = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2573n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i7 -= this.f2573n.getMeasuredWidth();
        } else {
            this.f2573n = null;
        }
        this.f2579t = i7;
        float f4 = resources.getDisplayMetrics().density;
    }

    @Override // j.y
    public final boolean h() {
        int i4;
        ArrayList arrayList;
        int i5;
        boolean z3;
        k kVar = this;
        j.m mVar = kVar.h;
        if (mVar != null) {
            arrayList = mVar.l();
            i4 = arrayList.size();
        } else {
            i4 = 0;
            arrayList = null;
        }
        int i6 = kVar.f2580u;
        int i7 = kVar.f2579t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) kVar.f2572m;
        int i8 = 0;
        boolean z4 = false;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = 2;
            z3 = true;
            if (i8 >= i4) {
                break;
            }
            j.o oVar = (j.o) arrayList.get(i8);
            int i11 = oVar.f2232y;
            if ((i11 & 2) == 2) {
                i9++;
            } else if ((i11 & 1) == 1) {
                i10++;
            } else {
                z4 = true;
            }
            if (kVar.f2581v && oVar.C) {
                i6 = 0;
            }
            i8++;
        }
        if (kVar.f2576q && (z4 || i10 + i9 > i6)) {
            i6--;
        }
        int i12 = i6 - i9;
        SparseBooleanArray sparseBooleanArray = kVar.f2582w;
        sparseBooleanArray.clear();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i4) {
            j.o oVar2 = (j.o) arrayList.get(i13);
            int i15 = oVar2.f2232y;
            boolean z5 = (i15 & 2) == i5 ? z3 : false;
            int i16 = oVar2.f2212b;
            if (z5) {
                View b2 = kVar.b(oVar2, null, viewGroup);
                b2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b2.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                if (i16 != 0) {
                    sparseBooleanArray.put(i16, z3);
                }
                oVar2.f(z3);
            } else if ((i15 & 1) == z3) {
                boolean z6 = sparseBooleanArray.get(i16);
                boolean z7 = ((i12 > 0 || z6) && i7 > 0) ? z3 : false;
                if (z7) {
                    View b4 = kVar.b(oVar2, null, viewGroup);
                    b4.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b4.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z7 &= i7 + i14 > 0;
                }
                if (z7 && i16 != 0) {
                    sparseBooleanArray.put(i16, true);
                } else if (z6) {
                    sparseBooleanArray.put(i16, false);
                    for (int i17 = 0; i17 < i13; i17++) {
                        j.o oVar3 = (j.o) arrayList.get(i17);
                        if (oVar3.f2212b == i16) {
                            if ((oVar3.f2231x & 32) == 32) {
                                i12++;
                            }
                            oVar3.f(false);
                        }
                    }
                }
                if (z7) {
                    i12--;
                }
                oVar2.f(z7);
            } else {
                oVar2.f(false);
                i13++;
                i5 = 2;
                kVar = this;
                z3 = true;
            }
            i13++;
            i5 = 2;
            kVar = this;
            z3 = true;
        }
        return z3;
    }

    @Override // j.y
    public final boolean i(j.o oVar) {
        return false;
    }

    @Override // j.y
    public final void j(j.x xVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.y
    public final boolean k(j.e0 e0Var) {
        boolean z3;
        if (e0Var.hasVisibleItems()) {
            j.e0 e0Var2 = e0Var;
            while (true) {
                j.m mVar = e0Var2.f2156z;
                if (mVar == this.h) {
                    break;
                }
                e0Var2 = (j.e0) mVar;
            }
            j.o oVar = e0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f2572m;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i4);
                    if ((childAt instanceof j.z) && ((j.z) childAt).getItemData() == oVar) {
                        view = childAt;
                        break;
                    }
                    i4++;
                }
            }
            if (view != null) {
                e0Var.A.getClass();
                int size = e0Var.f2193f.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        z3 = false;
                        break;
                    }
                    MenuItem item = e0Var.getItem(i5);
                    if (item.isVisible() && item.getIcon() != null) {
                        z3 = true;
                        break;
                    }
                    i5++;
                }
                g gVar = new g(this, this.g, e0Var, view);
                this.f2584y = gVar;
                gVar.h = z3;
                j.u uVar = gVar.f2250j;
                if (uVar != null) {
                    uVar.o(z3);
                }
                g gVar2 = this.f2584y;
                if (!gVar2.b()) {
                    if (gVar2.f2248f == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    gVar2.d(0, 0, false, false);
                }
                j.x xVar = this.f2569j;
                if (xVar != null) {
                    xVar.i(e0Var);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        j.m mVar;
        if (!this.f2576q || f() || (mVar = this.h) == null || this.f2572m == null || this.f2585z != null) {
            return false;
        }
        mVar.i();
        if (mVar.f2195j.isEmpty()) {
            return false;
        }
        i iVar = new i(this, new g(this, this.g, this.h, this.f2573n));
        this.f2585z = iVar;
        ((View) this.f2572m).post(iVar);
        return true;
    }
}
