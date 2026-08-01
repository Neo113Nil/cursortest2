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
import com.gdmhkmf.belbet.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j implements k.y {
    public g A;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2462f;

    /* renamed from: g, reason: collision with root package name */
    public Context f2463g;
    public k.m h;
    public final LayoutInflater i;

    /* renamed from: j, reason: collision with root package name */
    public k.x f2464j;

    /* renamed from: m, reason: collision with root package name */
    public k.a0 f2467m;

    /* renamed from: n, reason: collision with root package name */
    public i f2468n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2469o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2470p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2471q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2472r;

    /* renamed from: s, reason: collision with root package name */
    public int f2473s;

    /* renamed from: t, reason: collision with root package name */
    public int f2474t;

    /* renamed from: u, reason: collision with root package name */
    public int f2475u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2476v;

    /* renamed from: x, reason: collision with root package name */
    public f f2478x;

    /* renamed from: y, reason: collision with root package name */
    public f f2479y;

    /* renamed from: z, reason: collision with root package name */
    public h f2480z;

    /* renamed from: k, reason: collision with root package name */
    public final int f2465k = R.layout.abc_action_menu_layout;

    /* renamed from: l, reason: collision with root package name */
    public final int f2466l = R.layout.abc_action_menu_item_layout;

    /* renamed from: w, reason: collision with root package name */
    public final SparseBooleanArray f2477w = new SparseBooleanArray();
    public final a0.a B = new a0.a(20, this);

    public j(Context context) {
        this.f2462f = context;
        this.i = LayoutInflater.from(context);
    }

    @Override // k.y
    public final void a(k.m mVar, boolean z4) {
        e();
        f fVar = this.f2479y;
        if (fVar != null && fVar.b()) {
            fVar.f2273j.dismiss();
        }
        k.x xVar = this.f2464j;
        if (xVar != null) {
            xVar.a(mVar, z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View b(k.o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof k.z ? (k.z) view : (k.z) this.i.inflate(this.f2466l, viewGroup, false);
            actionMenuItemView.b(oVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f2467m);
            if (this.A == null) {
                this.A = new g(this);
            }
            actionMenuItemView2.setPopupCallback(this.A);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(oVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof l)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // k.y
    public final boolean c(k.o oVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.y
    public final boolean d(k.e0 e0Var) {
        boolean z4;
        if (e0Var.hasVisibleItems()) {
            k.e0 e0Var2 = e0Var;
            while (true) {
                k.m mVar = e0Var2.f2177z;
                if (mVar == this.h) {
                    break;
                }
                e0Var2 = (k.e0) mVar;
            }
            k.o oVar = e0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f2467m;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof k.z) && ((k.z) childAt).getItemData() == oVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                e0Var.A.getClass();
                int size = e0Var.f2215f.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        z4 = false;
                        break;
                    }
                    MenuItem item = e0Var.getItem(i4);
                    if (item.isVisible() && item.getIcon() != null) {
                        z4 = true;
                        break;
                    }
                    i4++;
                }
                f fVar = new f(this, this.f2463g, e0Var, view);
                this.f2479y = fVar;
                fVar.h = z4;
                k.u uVar = fVar.f2273j;
                if (uVar != null) {
                    uVar.o(z4);
                }
                f fVar2 = this.f2479y;
                if (!fVar2.b()) {
                    if (fVar2.f2271f == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    fVar2.d(0, 0, false, false);
                }
                k.x xVar = this.f2464j;
                if (xVar != null) {
                    xVar.n(e0Var);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        Object obj;
        h hVar = this.f2480z;
        if (hVar != null && (obj = this.f2467m) != null) {
            ((View) obj).removeCallbacks(hVar);
            this.f2480z = null;
            return true;
        }
        f fVar = this.f2478x;
        if (fVar == null) {
            return false;
        }
        if (fVar.b()) {
            fVar.f2273j.dismiss();
        }
        return true;
    }

    @Override // k.y
    public final boolean f(k.o oVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.y
    public final void g() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f2467m;
        ArrayList arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            k.m mVar = this.h;
            if (mVar != null) {
                mVar.i();
                ArrayList l4 = this.h.l();
                int size = l4.size();
                i = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    k.o oVar = (k.o) l4.get(i4);
                    if ((oVar.f2254x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        k.o itemData = childAt instanceof k.z ? ((k.z) childAt).getItemData() : null;
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
                            ((ViewGroup) this.f2467m).addView(b2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f2468n) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f2467m).requestLayout();
        k.m mVar2 = this.h;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.i;
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                k.p pVar = ((k.o) arrayList2.get(i5)).A;
            }
        }
        k.m mVar3 = this.h;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.f2217j;
        }
        if (this.f2471q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !((k.o) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f2468n == null) {
                this.f2468n = new i(this, this.f2462f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2468n.getParent();
            if (viewGroup3 != this.f2467m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2468n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2467m;
                i iVar = this.f2468n;
                actionMenuView.getClass();
                l j2 = ActionMenuView.j();
                j2.f2493a = true;
                actionMenuView.addView(iVar, j2);
            }
        } else {
            i iVar2 = this.f2468n;
            if (iVar2 != null) {
                Object parent = iVar2.getParent();
                Object obj = this.f2467m;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f2468n);
                }
            }
        }
        ((ActionMenuView) this.f2467m).setOverflowReserved(this.f2471q);
    }

    public final boolean h() {
        f fVar = this.f2478x;
        return fVar != null && fVar.b();
    }

    @Override // k.y
    public final void i(k.x xVar) {
        throw null;
    }

    @Override // k.y
    public final void j(Context context, k.m mVar) {
        this.f2463g = context;
        LayoutInflater.from(context);
        this.h = mVar;
        Resources resources = context.getResources();
        if (!this.f2472r) {
            this.f2471q = true;
        }
        int i = 2;
        this.f2473s = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600 || ((i4 > 960 && i5 > 720) || (i4 > 720 && i5 > 960))) {
            i = 5;
        } else if (i4 >= 500 || ((i4 > 640 && i5 > 480) || (i4 > 480 && i5 > 640))) {
            i = 4;
        } else if (i4 >= 360) {
            i = 3;
        }
        this.f2475u = i;
        int i6 = this.f2473s;
        if (this.f2471q) {
            if (this.f2468n == null) {
                i iVar = new i(this, this.f2462f);
                this.f2468n = iVar;
                if (this.f2470p) {
                    iVar.setImageDrawable(this.f2469o);
                    this.f2469o = null;
                    this.f2470p = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2468n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i6 -= this.f2468n.getMeasuredWidth();
        } else {
            this.f2468n = null;
        }
        this.f2474t = i6;
        float f5 = resources.getDisplayMetrics().density;
    }

    @Override // k.y
    public final boolean k() {
        int i;
        ArrayList arrayList;
        int i4;
        boolean z4;
        j jVar = this;
        k.m mVar = jVar.h;
        if (mVar != null) {
            arrayList = mVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i5 = jVar.f2475u;
        int i6 = jVar.f2474t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) jVar.f2467m;
        int i7 = 0;
        boolean z5 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i4 = 2;
            z4 = true;
            if (i7 >= i) {
                break;
            }
            k.o oVar = (k.o) arrayList.get(i7);
            int i10 = oVar.f2255y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z5 = true;
            }
            if (jVar.f2476v && oVar.C) {
                i5 = 0;
            }
            i7++;
        }
        if (jVar.f2471q && (z5 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = jVar.f2477w;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            k.o oVar2 = (k.o) arrayList.get(i12);
            int i14 = oVar2.f2255y;
            boolean z6 = (i14 & 2) == i4 ? z4 : false;
            int i15 = oVar2.f2235b;
            if (z6) {
                View b2 = jVar.b(oVar2, null, viewGroup);
                b2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b2.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z4);
                }
                oVar2.f(z4);
            } else if ((i14 & 1) == z4) {
                boolean z7 = sparseBooleanArray.get(i15);
                boolean z8 = ((i11 > 0 || z7) && i6 > 0) ? z4 : false;
                if (z8) {
                    View b5 = jVar.b(oVar2, null, viewGroup);
                    b5.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b5.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z8 &= i6 + i13 > 0;
                }
                if (z8 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z7) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i12; i16++) {
                        k.o oVar3 = (k.o) arrayList.get(i16);
                        if (oVar3.f2235b == i15) {
                            if ((oVar3.f2254x & 32) == 32) {
                                i11++;
                            }
                            oVar3.f(false);
                        }
                    }
                }
                if (z8) {
                    i11--;
                }
                oVar2.f(z8);
            } else {
                oVar2.f(false);
                i12++;
                i4 = 2;
                jVar = this;
                z4 = true;
            }
            i12++;
            i4 = 2;
            jVar = this;
            z4 = true;
        }
        return z4;
    }

    public final boolean l() {
        k.m mVar;
        if (!this.f2471q || h() || (mVar = this.h) == null || this.f2467m == null || this.f2480z != null) {
            return false;
        }
        mVar.i();
        if (mVar.f2217j.isEmpty()) {
            return false;
        }
        h hVar = new h(this, new f(this, this.f2463g, this.h, this.f2468n));
        this.f2480z = hVar;
        ((View) this.f2467m).post(hVar);
        return true;
    }
}
