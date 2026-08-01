package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.oriondriftchasers.arordrft.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class l implements k.y {
    public i A;
    public h B;
    public int D;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2359f;

    /* renamed from: g, reason: collision with root package name */
    public Context f2360g;

    /* renamed from: h, reason: collision with root package name */
    public k.m f2361h;
    public final LayoutInflater i;

    /* renamed from: j, reason: collision with root package name */
    public k.x f2362j;

    /* renamed from: m, reason: collision with root package name */
    public k.a0 f2365m;

    /* renamed from: n, reason: collision with root package name */
    public int f2366n;

    /* renamed from: o, reason: collision with root package name */
    public j f2367o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f2368p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2369q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2370r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2371s;

    /* renamed from: t, reason: collision with root package name */
    public int f2372t;

    /* renamed from: u, reason: collision with root package name */
    public int f2373u;

    /* renamed from: v, reason: collision with root package name */
    public int f2374v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2375w;

    /* renamed from: y, reason: collision with root package name */
    public g f2377y;

    /* renamed from: z, reason: collision with root package name */
    public g f2378z;

    /* renamed from: k, reason: collision with root package name */
    public final int f2363k = R.layout.abc_action_menu_layout;

    /* renamed from: l, reason: collision with root package name */
    public final int f2364l = R.layout.abc_action_menu_item_layout;

    /* renamed from: x, reason: collision with root package name */
    public final SparseBooleanArray f2376x = new SparseBooleanArray();
    public final a0.a C = new a0.a(16, this);

    public l(Context context) {
        this.f2359f = context;
        this.i = LayoutInflater.from(context);
    }

    @Override // k.y
    public final void a(k.m mVar, boolean z3) {
        f();
        g gVar = this.f2378z;
        if (gVar != null && gVar.b()) {
            gVar.i.dismiss();
        }
        k.x xVar = this.f2362j;
        if (xVar != null) {
            xVar.a(mVar, z3);
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
            ActionMenuItemView actionMenuItemView = view instanceof k.z ? (k.z) view : (k.z) this.i.inflate(this.f2364l, viewGroup, false);
            actionMenuItemView.b(oVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f2365m);
            if (this.B == null) {
                this.B = new h(this);
            }
            actionMenuItemView2.setPopupCallback(this.B);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(oVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof n)) {
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
        boolean z3;
        if (e0Var.hasVisibleItems()) {
            k.e0 e0Var2 = e0Var;
            while (true) {
                k.m mVar = e0Var2.f2024z;
                if (mVar == this.f2361h) {
                    break;
                }
                e0Var2 = (k.e0) mVar;
            }
            k.o oVar = e0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f2365m;
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
                this.D = e0Var.A.f2085a;
                int size = e0Var.f2064f.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        z3 = false;
                        break;
                    }
                    MenuItem item = e0Var.getItem(i4);
                    if (item.isVisible() && item.getIcon() != null) {
                        z3 = true;
                        break;
                    }
                    i4++;
                }
                g gVar = new g(this, this.f2360g, e0Var, view);
                this.f2378z = gVar;
                gVar.f2124g = z3;
                k.u uVar = gVar.i;
                if (uVar != null) {
                    uVar.q(z3);
                }
                g gVar2 = this.f2378z;
                if (!gVar2.b()) {
                    if (gVar2.f2122e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    gVar2.d(0, 0, false, false);
                }
                k.x xVar = this.f2362j;
                if (xVar != null) {
                    xVar.d(e0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // k.y
    public final boolean e(k.o oVar) {
        return false;
    }

    public final boolean f() {
        Object obj;
        i iVar = this.A;
        if (iVar != null && (obj = this.f2365m) != null) {
            ((View) obj).removeCallbacks(iVar);
            this.A = null;
            return true;
        }
        g gVar = this.f2377y;
        if (gVar == null) {
            return false;
        }
        if (gVar.b()) {
            gVar.i.dismiss();
        }
        return true;
    }

    @Override // k.y
    public final void g(Context context, k.m mVar) {
        this.f2360g = context;
        LayoutInflater.from(context);
        this.f2361h = mVar;
        Resources resources = context.getResources();
        if (!this.f2371s) {
            this.f2370r = true;
        }
        int i = 2;
        this.f2372t = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.f2374v = i;
        int i6 = this.f2372t;
        if (this.f2370r) {
            if (this.f2367o == null) {
                j jVar = new j(this, this.f2359f);
                this.f2367o = jVar;
                if (this.f2369q) {
                    jVar.setImageDrawable(this.f2368p);
                    this.f2368p = null;
                    this.f2369q = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2367o.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i6 -= this.f2367o.getMeasuredWidth();
        } else {
            this.f2367o = null;
        }
        this.f2373u = i6;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // k.y
    public final int getId() {
        return this.f2366n;
    }

    @Override // k.y
    public final boolean h() {
        int i;
        ArrayList arrayList;
        int i4;
        boolean z3;
        l lVar = this;
        k.m mVar = lVar.f2361h;
        if (mVar != null) {
            arrayList = mVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i5 = lVar.f2374v;
        int i6 = lVar.f2373u;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) lVar.f2365m;
        int i7 = 0;
        boolean z4 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i4 = 2;
            z3 = true;
            if (i7 >= i) {
                break;
            }
            k.o oVar = (k.o) arrayList.get(i7);
            int i10 = oVar.f2107y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z4 = true;
            }
            if (lVar.f2375w && oVar.C) {
                i5 = 0;
            }
            i7++;
        }
        if (lVar.f2370r && (z4 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = lVar.f2376x;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            k.o oVar2 = (k.o) arrayList.get(i12);
            int i14 = oVar2.f2107y;
            boolean z5 = (i14 & 2) == i4 ? z3 : false;
            int i15 = oVar2.f2086b;
            if (z5) {
                View b4 = lVar.b(oVar2, null, viewGroup);
                b4.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b4.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z3);
                }
                oVar2.f(z3);
            } else if ((i14 & 1) == z3) {
                boolean z6 = sparseBooleanArray.get(i15);
                boolean z7 = ((i11 > 0 || z6) && i6 > 0) ? z3 : false;
                if (z7) {
                    View b5 = lVar.b(oVar2, null, viewGroup);
                    b5.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b5.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z7 &= i6 + i13 > 0;
                }
                if (z7 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z6) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i12; i16++) {
                        k.o oVar3 = (k.o) arrayList.get(i16);
                        if (oVar3.f2086b == i15) {
                            if ((oVar3.f2106x & 32) == 32) {
                                i11++;
                            }
                            oVar3.f(false);
                        }
                    }
                }
                if (z7) {
                    i11--;
                }
                oVar2.f(z7);
            } else {
                oVar2.f(false);
                i12++;
                i4 = 2;
                lVar = this;
                z3 = true;
            }
            i12++;
            i4 = 2;
            lVar = this;
            z3 = true;
        }
        return z3;
    }

    @Override // k.y
    public final Parcelable i() {
        k kVar = new k();
        kVar.f2355f = this.D;
        return kVar;
    }

    @Override // k.y
    public final void j(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof k) && (i = ((k) parcelable).f2355f) > 0 && (findItem = this.f2361h.findItem(i)) != null) {
            d((k.e0) findItem.getSubMenu());
        }
    }

    public final boolean k() {
        g gVar = this.f2377y;
        return gVar != null && gVar.b();
    }

    @Override // k.y
    public final void l(k.x xVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.y
    public final void m(boolean z3) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f2365m;
        ArrayList arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            k.m mVar = this.f2361h;
            if (mVar != null) {
                mVar.i();
                ArrayList l4 = this.f2361h.l();
                int size = l4.size();
                i = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    k.o oVar = (k.o) l4.get(i4);
                    if ((oVar.f2106x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        k.o itemData = childAt instanceof k.z ? ((k.z) childAt).getItemData() : null;
                        View b4 = b(oVar, childAt, viewGroup);
                        if (oVar != itemData) {
                            b4.setPressed(false);
                            b4.jumpDrawablesToCurrentState();
                        }
                        if (b4 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b4.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b4);
                            }
                            ((ViewGroup) this.f2365m).addView(b4, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f2367o) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f2365m).requestLayout();
        k.m mVar2 = this.f2361h;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.i;
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                k.p pVar = ((k.o) arrayList2.get(i5)).A;
            }
        }
        k.m mVar3 = this.f2361h;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.f2067j;
        }
        if (this.f2370r && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !((k.o) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f2367o == null) {
                this.f2367o = new j(this, this.f2359f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2367o.getParent();
            if (viewGroup3 != this.f2365m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2367o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2365m;
                j jVar = this.f2367o;
                actionMenuView.getClass();
                n j4 = ActionMenuView.j();
                j4.f2395a = true;
                actionMenuView.addView(jVar, j4);
            }
        } else {
            j jVar2 = this.f2367o;
            if (jVar2 != null) {
                Object parent = jVar2.getParent();
                Object obj = this.f2365m;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f2367o);
                }
            }
        }
        ((ActionMenuView) this.f2365m).setOverflowReserved(this.f2370r);
    }

    public final boolean n() {
        k.m mVar;
        if (!this.f2370r || k() || (mVar = this.f2361h) == null || this.f2365m == null || this.A != null) {
            return false;
        }
        mVar.i();
        if (mVar.f2067j.isEmpty()) {
            return false;
        }
        i iVar = new i(this, new g(this, this.f2360g, this.f2361h, this.f2367o));
        this.A = iVar;
        ((View) this.f2365m).post(iVar);
        return true;
    }
}
