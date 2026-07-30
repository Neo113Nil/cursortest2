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
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.ArrayList;
import l.SubMenuC4672D;

/* renamed from: m.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4743k implements l.x {

    /* renamed from: A, reason: collision with root package name */
    public l.z f39428A;

    /* renamed from: B, reason: collision with root package name */
    public C4741j f39429B;

    /* renamed from: C, reason: collision with root package name */
    public Drawable f39430C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f39431D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f39432E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f39433F;

    /* renamed from: G, reason: collision with root package name */
    public int f39434G;

    /* renamed from: H, reason: collision with root package name */
    public int f39435H;

    /* renamed from: I, reason: collision with root package name */
    public int f39436I;
    public boolean J;

    /* renamed from: L, reason: collision with root package name */
    public C4735g f39438L;

    /* renamed from: M, reason: collision with root package name */
    public C4735g f39439M;

    /* renamed from: N, reason: collision with root package name */
    public RunnableC4739i f39440N;

    /* renamed from: O, reason: collision with root package name */
    public C4737h f39441O;

    /* renamed from: n, reason: collision with root package name */
    public final Context f39443n;

    /* renamed from: u, reason: collision with root package name */
    public Context f39444u;

    /* renamed from: v, reason: collision with root package name */
    public l.l f39445v;

    /* renamed from: w, reason: collision with root package name */
    public final LayoutInflater f39446w;

    /* renamed from: x, reason: collision with root package name */
    public l.w f39447x;

    /* renamed from: y, reason: collision with root package name */
    public final int f39448y = C5284R.layout.abc_action_menu_layout;

    /* renamed from: z, reason: collision with root package name */
    public final int f39449z = C5284R.layout.abc_action_menu_item_layout;

    /* renamed from: K, reason: collision with root package name */
    public final SparseBooleanArray f39437K = new SparseBooleanArray();

    /* renamed from: P, reason: collision with root package name */
    public final h8.d f39442P = new h8.d(3, this);

    public C4743k(Context context) {
        this.f39443n = context;
        this.f39446w = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.y] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(l.n nVar, View view, ViewGroup viewGroup) {
        View actionView = nVar.getActionView();
        if (actionView == null || nVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof l.y ? (l.y) view : (l.y) this.f39446w.inflate(this.f39449z, viewGroup, false);
            actionMenuItemView.b(nVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f39428A);
            if (this.f39441O == null) {
                this.f39441O = new C4737h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f39441O);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(nVar.f38992V ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C4747m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // l.x
    public final boolean b(l.n nVar) {
        return false;
    }

    @Override // l.x
    public final boolean c() {
        int i;
        ArrayList arrayList;
        int i4;
        boolean z8;
        C4743k c4743k = this;
        l.l lVar = c4743k.f39445v;
        if (lVar != null) {
            arrayList = lVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i9 = c4743k.f39436I;
        int i10 = c4743k.f39435H;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c4743k.f39428A;
        int i11 = 0;
        boolean z9 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i4 = 2;
            z8 = true;
            if (i11 >= i) {
                break;
            }
            l.n nVar = (l.n) arrayList.get(i11);
            int i14 = nVar.f38988R;
            if ((i14 & 2) == 2) {
                i12++;
            } else if ((i14 & 1) == 1) {
                i13++;
            } else {
                z9 = true;
            }
            if (c4743k.J && nVar.f38992V) {
                i9 = 0;
            }
            i11++;
        }
        if (c4743k.f39432E && (z9 || i13 + i12 > i9)) {
            i9--;
        }
        int i15 = i9 - i12;
        SparseBooleanArray sparseBooleanArray = c4743k.f39437K;
        sparseBooleanArray.clear();
        int i16 = 0;
        int i17 = 0;
        while (i16 < i) {
            l.n nVar2 = (l.n) arrayList.get(i16);
            int i18 = nVar2.f38988R;
            boolean z10 = (i18 & 2) == i4 ? z8 : false;
            int i19 = nVar2.f38994u;
            if (z10) {
                View a9 = c4743k.a(nVar2, null, viewGroup);
                a9.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a9.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                if (i19 != 0) {
                    sparseBooleanArray.put(i19, z8);
                }
                nVar2.f(z8);
            } else if ((i18 & 1) == z8) {
                boolean z11 = sparseBooleanArray.get(i19);
                boolean z12 = ((i15 > 0 || z11) && i10 > 0) ? z8 : false;
                if (z12) {
                    View a10 = c4743k.a(nVar2, null, viewGroup);
                    a10.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a10.getMeasuredWidth();
                    i10 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    z12 &= i10 + i17 > 0;
                }
                if (z12 && i19 != 0) {
                    sparseBooleanArray.put(i19, true);
                } else if (z11) {
                    sparseBooleanArray.put(i19, false);
                    for (int i20 = 0; i20 < i16; i20++) {
                        l.n nVar3 = (l.n) arrayList.get(i20);
                        if (nVar3.f38994u == i19) {
                            if ((nVar3.f38987Q & 32) == 32) {
                                i15++;
                            }
                            nVar3.f(false);
                        }
                    }
                }
                if (z12) {
                    i15--;
                }
                nVar2.f(z12);
            } else {
                nVar2.f(false);
                i16++;
                i4 = 2;
                c4743k = this;
                z8 = true;
            }
            i16++;
            i4 = 2;
            c4743k = this;
            z8 = true;
        }
        return z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.x
    public final void d() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f39428A;
        ArrayList arrayList = null;
        boolean z8 = false;
        if (viewGroup != null) {
            l.l lVar = this.f39445v;
            if (lVar != null) {
                lVar.i();
                ArrayList l9 = this.f39445v.l();
                int size = l9.size();
                i = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    l.n nVar = (l.n) l9.get(i4);
                    if ((nVar.f38987Q & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        l.n itemData = childAt instanceof l.y ? ((l.y) childAt).getItemData() : null;
                        View a9 = a(nVar, childAt, viewGroup);
                        if (nVar != itemData) {
                            a9.setPressed(false);
                            a9.jumpDrawablesToCurrentState();
                        }
                        if (a9 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a9.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a9);
                            }
                            ((ViewGroup) this.f39428A).addView(a9, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f39429B) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f39428A).requestLayout();
        l.l lVar2 = this.f39445v;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f38947B;
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                l.o oVar = ((l.n) arrayList2.get(i9)).f38990T;
            }
        }
        l.l lVar3 = this.f39445v;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.f38948C;
        }
        if (this.f39432E && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z8 = !((l.n) arrayList.get(0)).f38992V;
            } else if (size3 > 0) {
                z8 = true;
            }
        }
        if (z8) {
            if (this.f39429B == null) {
                this.f39429B = new C4741j(this, this.f39443n);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f39429B.getParent();
            if (viewGroup3 != this.f39428A) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f39429B);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f39428A;
                C4741j c4741j = this.f39429B;
                actionMenuView.getClass();
                C4747m j9 = ActionMenuView.j();
                j9.f39454a = true;
                actionMenuView.addView(c4741j, j9);
            }
        } else {
            C4741j c4741j2 = this.f39429B;
            if (c4741j2 != null) {
                Object parent = c4741j2.getParent();
                Object obj = this.f39428A;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f39429B);
                }
            }
        }
        ((ActionMenuView) this.f39428A).setOverflowReserved(this.f39432E);
    }

    @Override // l.x
    public final void e(l.l lVar, boolean z8) {
        f();
        C4735g c4735g = this.f39439M;
        if (c4735g != null && c4735g.b()) {
            c4735g.i.dismiss();
        }
        l.w wVar = this.f39447x;
        if (wVar != null) {
            wVar.e(lVar, z8);
        }
    }

    public final boolean f() {
        Object obj;
        RunnableC4739i runnableC4739i = this.f39440N;
        if (runnableC4739i != null && (obj = this.f39428A) != null) {
            ((View) obj).removeCallbacks(runnableC4739i);
            this.f39440N = null;
            return true;
        }
        C4735g c4735g = this.f39438L;
        if (c4735g == null) {
            return false;
        }
        if (c4735g.b()) {
            c4735g.i.dismiss();
        }
        return true;
    }

    @Override // l.x
    public final void g(l.w wVar) {
        throw null;
    }

    @Override // l.x
    public final void h(Context context, l.l lVar) {
        this.f39444u = context;
        LayoutInflater.from(context);
        this.f39445v = lVar;
        Resources resources = context.getResources();
        if (!this.f39433F) {
            this.f39432E = true;
        }
        int i = 2;
        this.f39434G = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600 || ((i4 > 960 && i9 > 720) || (i4 > 720 && i9 > 960))) {
            i = 5;
        } else if (i4 >= 500 || ((i4 > 640 && i9 > 480) || (i4 > 480 && i9 > 640))) {
            i = 4;
        } else if (i4 >= 360) {
            i = 3;
        }
        this.f39436I = i;
        int i10 = this.f39434G;
        if (this.f39432E) {
            if (this.f39429B == null) {
                C4741j c4741j = new C4741j(this, this.f39443n);
                this.f39429B = c4741j;
                if (this.f39431D) {
                    c4741j.setImageDrawable(this.f39430C);
                    this.f39430C = null;
                    this.f39431D = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f39429B.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f39429B.getMeasuredWidth();
        } else {
            this.f39429B = null;
        }
        this.f39435H = i10;
        float f6 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.x
    public final boolean i(SubMenuC4672D subMenuC4672D) {
        boolean z8;
        if (subMenuC4672D.hasVisibleItems()) {
            SubMenuC4672D subMenuC4672D2 = subMenuC4672D;
            while (true) {
                l.l lVar = subMenuC4672D2.f38882S;
                if (lVar == this.f39445v) {
                    break;
                }
                subMenuC4672D2 = (SubMenuC4672D) lVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.f39428A;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof l.y) && ((l.y) childAt).getItemData() == subMenuC4672D2.f38883T) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                subMenuC4672D.f38883T.getClass();
                int size = subMenuC4672D.f38967y.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        z8 = false;
                        break;
                    }
                    MenuItem item = subMenuC4672D.getItem(i4);
                    if (item.isVisible() && item.getIcon() != null) {
                        z8 = true;
                        break;
                    }
                    i4++;
                }
                C4735g c4735g = new C4735g(this, this.f39444u, subMenuC4672D, view);
                this.f39439M = c4735g;
                c4735g.f39018g = z8;
                l.t tVar = c4735g.i;
                if (tVar != null) {
                    tVar.n(z8);
                }
                C4735g c4735g2 = this.f39439M;
                if (!c4735g2.b()) {
                    if (c4735g2.f39016e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c4735g2.d(0, 0, false, false);
                }
                l.w wVar = this.f39447x;
                if (wVar != null) {
                    wVar.g(subMenuC4672D);
                }
                return true;
            }
        }
        return false;
    }

    @Override // l.x
    public final boolean j(l.n nVar) {
        return false;
    }

    public final boolean k() {
        C4735g c4735g = this.f39438L;
        return c4735g != null && c4735g.b();
    }

    public final boolean l() {
        l.l lVar;
        if (!this.f39432E || k() || (lVar = this.f39445v) == null || this.f39428A == null || this.f39440N != null) {
            return false;
        }
        lVar.i();
        if (lVar.f38948C.isEmpty()) {
            return false;
        }
        RunnableC4739i runnableC4739i = new RunnableC4739i(this, new C4735g(this, this.f39444u, this.f39445v, this.f39429B));
        this.f39440N = runnableC4739i;
        ((View) this.f39428A).post(runnableC4739i);
        return true;
    }
}
