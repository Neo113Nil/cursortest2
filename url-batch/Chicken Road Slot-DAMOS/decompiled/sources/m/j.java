package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.appsflyer.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements l.o {
    public int A;
    public int B;
    public int C;
    public boolean D;
    public g F;
    public g G;
    public f8.j0 H;
    public h I;

    /* renamed from: d, reason: collision with root package name */
    public final Context f6098d;

    /* renamed from: e, reason: collision with root package name */
    public Context f6099e;

    /* renamed from: i, reason: collision with root package name */
    public l.i f6100i;

    /* renamed from: r, reason: collision with root package name */
    public final LayoutInflater f6101r;

    /* renamed from: s, reason: collision with root package name */
    public l.n f6102s;

    /* renamed from: u, reason: collision with root package name */
    public ActionMenuView f6104u;

    /* renamed from: v, reason: collision with root package name */
    public i f6105v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f6106w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6107x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6108y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6109z;

    /* renamed from: t, reason: collision with root package name */
    public final int f6103t = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray E = new SparseBooleanArray();
    public final l.d J = new l.d(4, this);

    public j(Context context) {
        this.f6098d = context;
        this.f6101r = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v4, types: [l.p] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final View a(l.j jVar, View view, ActionMenuView actionMenuView) {
        View view2 = jVar.f5706z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((jVar.f5705y & 8) != 0 && view2 != null)) {
            ActionMenuItemView actionMenuItemView = view instanceof l.p ? (l.p) view : (l.p) this.f6101r.inflate(this.f6103t, (ViewGroup) actionMenuView, false);
            actionMenuItemView.b(jVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f6104u);
            if (this.I == null) {
                this.I = new h(this);
            }
            actionMenuItemView2.setPopupCallback(this.I);
            view3 = actionMenuItemView;
        }
        view3.setVisibility(jVar.B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof l)) {
            view3.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view3;
    }

    @Override // l.o
    public final void b(l.i iVar, boolean z10) {
        d();
        g gVar = this.G;
        if (gVar != null && gVar.b()) {
            gVar.f5716i.dismiss();
        }
        l.n nVar = this.f6102s;
        if (nVar != null) {
            nVar.b(iVar, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.o
    public final void c() {
        int i3;
        ActionMenuView actionMenuView = this.f6104u;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (actionMenuView != null) {
            l.i iVar = this.f6100i;
            if (iVar != null) {
                iVar.i();
                ArrayList k10 = this.f6100i.k();
                int size = k10.size();
                i3 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    l.j jVar = (l.j) k10.get(i10);
                    if ((jVar.f5704x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i3);
                        l.j itemData = childAt instanceof l.p ? ((l.p) childAt).getItemData() : null;
                        View a9 = a(jVar, childAt, actionMenuView);
                        if (jVar != itemData) {
                            a9.setPressed(false);
                            a9.jumpDrawablesToCurrentState();
                        }
                        if (a9 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) a9.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(a9);
                            }
                            this.f6104u.addView(a9, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i3) == this.f6105v) {
                    i3++;
                } else {
                    actionMenuView.removeViewAt(i3);
                }
            }
        }
        this.f6104u.requestLayout();
        l.i iVar2 = this.f6100i;
        if (iVar2 != null) {
            iVar2.i();
            ArrayList arrayList2 = iVar2.f5672i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((l.j) arrayList2.get(i11)).getClass();
            }
        }
        l.i iVar3 = this.f6100i;
        if (iVar3 != null) {
            iVar3.i();
            arrayList = iVar3.j;
        }
        if (this.f6108y && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((l.j) arrayList.get(0)).B;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        i iVar4 = this.f6105v;
        if (z10) {
            if (iVar4 == null) {
                this.f6105v = new i(this, this.f6098d);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f6105v.getParent();
            if (viewGroup2 != this.f6104u) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f6105v);
                }
                ActionMenuView actionMenuView2 = this.f6104u;
                i iVar5 = this.f6105v;
                actionMenuView2.getClass();
                l h10 = ActionMenuView.h();
                h10.f6120a = true;
                actionMenuView2.addView(iVar5, h10);
            }
        } else if (iVar4 != null) {
            ViewParent parent = iVar4.getParent();
            ActionMenuView actionMenuView3 = this.f6104u;
            if (parent == actionMenuView3) {
                actionMenuView3.removeView(this.f6105v);
            }
        }
        this.f6104u.setOverflowReserved(this.f6108y);
    }

    public final boolean d() {
        ActionMenuView actionMenuView;
        f8.j0 j0Var = this.H;
        if (j0Var != null && (actionMenuView = this.f6104u) != null) {
            actionMenuView.removeCallbacks(j0Var);
            this.H = null;
            return true;
        }
        g gVar = this.F;
        if (gVar == null) {
            return false;
        }
        if (gVar.b()) {
            gVar.f5716i.dismiss();
        }
        return true;
    }

    @Override // l.o
    public final void e(l.n nVar) {
        throw null;
    }

    @Override // l.o
    public final boolean f(l.j jVar) {
        return false;
    }

    @Override // l.o
    public final void g(Context context, l.i iVar) {
        this.f6099e = context;
        LayoutInflater.from(context);
        this.f6100i = iVar;
        Resources resources = context.getResources();
        if (!this.f6109z) {
            this.f6108y = true;
        }
        int i3 = 2;
        this.A = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
            i3 = 5;
        } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
            i3 = 4;
        } else if (i10 >= 360) {
            i3 = 3;
        }
        this.C = i3;
        int i12 = this.A;
        if (this.f6108y) {
            if (this.f6105v == null) {
                i iVar2 = new i(this, this.f6098d);
                this.f6105v = iVar2;
                if (this.f6107x) {
                    iVar2.setImageDrawable(this.f6106w);
                    this.f6106w = null;
                    this.f6107x = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f6105v.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.f6105v.getMeasuredWidth();
        } else {
            this.f6105v = null;
        }
        this.B = i12;
        float f3 = resources.getDisplayMetrics().density;
    }

    @Override // l.o
    public final boolean h() {
        int i3;
        ArrayList arrayList;
        int i10;
        boolean z10;
        j jVar = this;
        l.i iVar = jVar.f6100i;
        if (iVar != null) {
            arrayList = iVar.k();
            i3 = arrayList.size();
        } else {
            i3 = 0;
            arrayList = null;
        }
        int i11 = jVar.C;
        int i12 = jVar.B;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = jVar.f6104u;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= i3) {
                break;
            }
            l.j jVar2 = (l.j) arrayList.get(i13);
            int i16 = jVar2.f5705y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z11 = true;
            }
            if (jVar.D && jVar2.B) {
                i11 = 0;
            }
            i13++;
        }
        if (jVar.f6108y && (z11 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = jVar.E;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i3) {
            l.j jVar3 = (l.j) arrayList.get(i18);
            int i20 = jVar3.f5705y;
            boolean z12 = (i20 & 2) == i10 ? z10 : false;
            int i21 = jVar3.f5684b;
            if (z12) {
                View a9 = jVar.a(jVar3, null, actionMenuView);
                a9.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a9.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                jVar3.d(z10);
            } else if ((i20 & 1) == z10) {
                boolean z13 = sparseBooleanArray.get(i21);
                boolean z14 = ((i17 > 0 || z13) && i12 > 0) ? z10 : false;
                if (z14) {
                    View a10 = jVar.a(jVar3, null, actionMenuView);
                    a10.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a10.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z14 &= i12 + i19 > 0;
                }
                if (z14 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z13) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        l.j jVar4 = (l.j) arrayList.get(i22);
                        if (jVar4.f5684b == i21) {
                            if ((jVar4.f5704x & 32) == 32) {
                                i17++;
                            }
                            jVar4.d(false);
                        }
                    }
                }
                if (z14) {
                    i17--;
                }
                jVar3.d(z14);
            } else {
                jVar3.d(false);
                i18++;
                i10 = 2;
                jVar = this;
                z10 = true;
            }
            i18++;
            i10 = 2;
            jVar = this;
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.o
    public final boolean i(l.s sVar) {
        boolean z10;
        if (sVar.hasVisibleItems()) {
            l.s sVar2 = sVar;
            while (true) {
                l.i iVar = sVar2.f5729v;
                if (iVar == this.f6100i) {
                    break;
                }
                sVar2 = (l.s) iVar;
            }
            l.j jVar = sVar2.f5730w;
            ActionMenuView actionMenuView = this.f6104u;
            View view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = actionMenuView.getChildAt(i3);
                    if ((childAt instanceof l.p) && ((l.p) childAt).getItemData() == jVar) {
                        view = childAt;
                        break;
                    }
                    i3++;
                }
            }
            if (view != null) {
                sVar.f5730w.getClass();
                int size = sVar.f5670f.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z10 = false;
                        break;
                    }
                    MenuItem item = sVar.getItem(i10);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                g gVar = new g(this, this.f6099e, sVar, view);
                this.G = gVar;
                gVar.g = z10;
                l.k kVar = gVar.f5716i;
                if (kVar != null) {
                    kVar.o(z10);
                }
                g gVar2 = this.G;
                if (!gVar2.b()) {
                    if (gVar2.f5713e == null) {
                        kotlin.collections.i0.l("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    gVar2.d(0, 0, false, false);
                }
                l.n nVar = this.f6102s;
                if (nVar != null) {
                    nVar.f(sVar);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        l.i iVar;
        if (!this.f6108y) {
            return false;
        }
        g gVar = this.F;
        if ((gVar != null && gVar.b()) || (iVar = this.f6100i) == null || this.f6104u == null || this.H != null) {
            return false;
        }
        iVar.i();
        if (iVar.j.isEmpty()) {
            return false;
        }
        f8.j0 j0Var = new f8.j0(12, this, new g(this, this.f6099e, this.f6100i, this.f6105v), false);
        this.H = j0Var;
        this.f6104u.post(j0Var);
        return true;
    }

    @Override // l.o
    public final boolean k(l.j jVar) {
        return false;
    }
}
