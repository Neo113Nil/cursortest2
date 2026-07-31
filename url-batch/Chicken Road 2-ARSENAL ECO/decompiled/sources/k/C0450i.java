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
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.strategylink.Row.Five.R;
import java.util.ArrayList;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450i implements j.p {

    /* renamed from: f, reason: collision with root package name */
    public final Context f5004f;

    /* renamed from: g, reason: collision with root package name */
    public Context f5005g;

    /* renamed from: h, reason: collision with root package name */
    public j.j f5006h;

    /* renamed from: i, reason: collision with root package name */
    public final LayoutInflater f5007i;

    /* renamed from: j, reason: collision with root package name */
    public j.o f5008j;

    /* renamed from: l, reason: collision with root package name */
    public ActionMenuView f5010l;

    /* renamed from: m, reason: collision with root package name */
    public C0449h f5011m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f5012n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5013o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5014p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5015q;

    /* renamed from: r, reason: collision with root package name */
    public int f5016r;

    /* renamed from: s, reason: collision with root package name */
    public int f5017s;

    /* renamed from: t, reason: collision with root package name */
    public int f5018t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5019u;

    /* renamed from: w, reason: collision with root package name */
    public C0447f f5021w;

    /* renamed from: x, reason: collision with root package name */
    public C0447f f5022x;
    public A.a y;

    /* renamed from: z, reason: collision with root package name */
    public C0448g f5023z;

    /* renamed from: k, reason: collision with root package name */
    public final int f5009k = R.layout.abc_action_menu_item_layout;

    /* renamed from: v, reason: collision with root package name */
    public final SparseBooleanArray f5020v = new SparseBooleanArray();

    /* renamed from: A, reason: collision with root package name */
    public final a6.d f5003A = new a6.d(this);

    public C0450i(Context context) {
        this.f5004f = context;
        this.f5007i = LayoutInflater.from(context);
    }

    @Override // j.p
    public final void a(j.j jVar, boolean z5) {
        e();
        C0447f c0447f = this.f5022x;
        if (c0447f != null && c0447f.b()) {
            c0447f.f4852i.dismiss();
        }
        j.o oVar = this.f5008j;
        if (oVar != null) {
            oVar.a(jVar, z5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v4, types: [j.q] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final View b(j.k kVar, View view, ActionMenuView actionMenuView) {
        View view2 = kVar.f4841z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((kVar.y & 8) != 0 && view2 != null)) {
            ActionMenuItemView actionMenuItemView = view instanceof j.q ? (j.q) view : (j.q) this.f5007i.inflate(this.f5009k, (ViewGroup) actionMenuView, false);
            actionMenuItemView.a(kVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f5010l);
            if (this.f5023z == null) {
                this.f5023z = new C0448g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f5023z);
            view3 = actionMenuItemView;
        }
        view3.setVisibility(kVar.f4816B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0452k)) {
            view3.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view3;
    }

    @Override // j.p
    public final boolean c(j.k kVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.p
    public final void d() {
        int i7;
        ActionMenuView actionMenuView = this.f5010l;
        ArrayList arrayList = null;
        boolean z5 = false;
        if (actionMenuView != null) {
            j.j jVar = this.f5006h;
            if (jVar != null) {
                jVar.i();
                ArrayList k4 = this.f5006h.k();
                int size = k4.size();
                i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    j.k kVar = (j.k) k4.get(i8);
                    if ((kVar.f4840x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i7);
                        j.k itemData = childAt instanceof j.q ? ((j.q) childAt).getItemData() : null;
                        View b7 = b(kVar, childAt, actionMenuView);
                        if (kVar != itemData) {
                            b7.setPressed(false);
                            b7.jumpDrawablesToCurrentState();
                        }
                        if (b7 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) b7.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(b7);
                            }
                            this.f5010l.addView(b7, i7);
                        }
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            while (i7 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i7) == this.f5011m) {
                    i7++;
                } else {
                    actionMenuView.removeViewAt(i7);
                }
            }
        }
        this.f5010l.requestLayout();
        j.j jVar2 = this.f5006h;
        if (jVar2 != null) {
            jVar2.i();
            ArrayList arrayList2 = jVar2.f4803i;
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                ((j.k) arrayList2.get(i9)).getClass();
            }
        }
        j.j jVar3 = this.f5006h;
        if (jVar3 != null) {
            jVar3.i();
            arrayList = jVar3.f4804j;
        }
        if (this.f5014p && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z5 = !((j.k) arrayList.get(0)).f4816B;
            } else if (size3 > 0) {
                z5 = true;
            }
        }
        if (z5) {
            if (this.f5011m == null) {
                this.f5011m = new C0449h(this, this.f5004f);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f5011m.getParent();
            if (viewGroup2 != this.f5010l) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f5011m);
                }
                ActionMenuView actionMenuView2 = this.f5010l;
                C0449h c0449h = this.f5011m;
                actionMenuView2.getClass();
                C0452k h7 = ActionMenuView.h();
                h7.f5045a = true;
                actionMenuView2.addView(c0449h, h7);
            }
        } else {
            C0449h c0449h2 = this.f5011m;
            if (c0449h2 != null) {
                ViewParent parent = c0449h2.getParent();
                ActionMenuView actionMenuView3 = this.f5010l;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f5011m);
                }
            }
        }
        this.f5010l.setOverflowReserved(this.f5014p);
    }

    public final boolean e() {
        ActionMenuView actionMenuView;
        A.a aVar = this.y;
        if (aVar != null && (actionMenuView = this.f5010l) != null) {
            actionMenuView.removeCallbacks(aVar);
            this.y = null;
            return true;
        }
        C0447f c0447f = this.f5021w;
        if (c0447f == null) {
            return false;
        }
        if (c0447f.b()) {
            c0447f.f4852i.dismiss();
        }
        return true;
    }

    @Override // j.p
    public final void f(Context context, j.j jVar) {
        this.f5005g = context;
        LayoutInflater.from(context);
        this.f5006h = jVar;
        Resources resources = context.getResources();
        if (!this.f5015q) {
            this.f5014p = true;
        }
        int i7 = 2;
        this.f5016r = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i8 > 600 || ((i8 > 960 && i9 > 720) || (i8 > 720 && i9 > 960))) {
            i7 = 5;
        } else if (i8 >= 500 || ((i8 > 640 && i9 > 480) || (i8 > 480 && i9 > 640))) {
            i7 = 4;
        } else if (i8 >= 360) {
            i7 = 3;
        }
        this.f5018t = i7;
        int i10 = this.f5016r;
        if (this.f5014p) {
            if (this.f5011m == null) {
                C0449h c0449h = new C0449h(this, this.f5004f);
                this.f5011m = c0449h;
                if (this.f5013o) {
                    c0449h.setImageDrawable(this.f5012n);
                    this.f5012n = null;
                    this.f5013o = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f5011m.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f5011m.getMeasuredWidth();
        } else {
            this.f5011m = null;
        }
        this.f5017s = i10;
        float f7 = resources.getDisplayMetrics().density;
    }

    @Override // j.p
    public final boolean g() {
        int i7;
        ArrayList arrayList;
        int i8;
        boolean z5;
        C0450i c0450i = this;
        j.j jVar = c0450i.f5006h;
        if (jVar != null) {
            arrayList = jVar.k();
            i7 = arrayList.size();
        } else {
            i7 = 0;
            arrayList = null;
        }
        int i9 = c0450i.f5018t;
        int i10 = c0450i.f5017s;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = c0450i.f5010l;
        int i11 = 0;
        boolean z6 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i8 = 2;
            z5 = true;
            if (i11 >= i7) {
                break;
            }
            j.k kVar = (j.k) arrayList.get(i11);
            int i14 = kVar.y;
            if ((i14 & 2) == 2) {
                i12++;
            } else if ((i14 & 1) == 1) {
                i13++;
            } else {
                z6 = true;
            }
            if (c0450i.f5019u && kVar.f4816B) {
                i9 = 0;
            }
            i11++;
        }
        if (c0450i.f5014p && (z6 || i13 + i12 > i9)) {
            i9--;
        }
        int i15 = i9 - i12;
        SparseBooleanArray sparseBooleanArray = c0450i.f5020v;
        sparseBooleanArray.clear();
        int i16 = 0;
        int i17 = 0;
        while (i16 < i7) {
            j.k kVar2 = (j.k) arrayList.get(i16);
            int i18 = kVar2.y;
            boolean z7 = (i18 & 2) == i8 ? z5 : false;
            int i19 = kVar2.f4818b;
            if (z7) {
                View b7 = c0450i.b(kVar2, null, actionMenuView);
                b7.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b7.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                if (i19 != 0) {
                    sparseBooleanArray.put(i19, z5);
                }
                kVar2.d(z5);
            } else if ((i18 & 1) == z5) {
                boolean z8 = sparseBooleanArray.get(i19);
                boolean z9 = ((i15 > 0 || z8) && i10 > 0) ? z5 : false;
                if (z9) {
                    View b8 = c0450i.b(kVar2, null, actionMenuView);
                    b8.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b8.getMeasuredWidth();
                    i10 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    z9 &= i10 + i17 > 0;
                }
                if (z9 && i19 != 0) {
                    sparseBooleanArray.put(i19, true);
                } else if (z8) {
                    sparseBooleanArray.put(i19, false);
                    for (int i20 = 0; i20 < i16; i20++) {
                        j.k kVar3 = (j.k) arrayList.get(i20);
                        if (kVar3.f4818b == i19) {
                            if ((kVar3.f4840x & 32) == 32) {
                                i15++;
                            }
                            kVar3.d(false);
                        }
                    }
                }
                if (z9) {
                    i15--;
                }
                kVar2.d(z9);
            } else {
                kVar2.d(false);
                i16++;
                i8 = 2;
                c0450i = this;
                z5 = true;
            }
            i16++;
            i8 = 2;
            c0450i = this;
            z5 = true;
        }
        return z5;
    }

    public final boolean h() {
        j.j jVar;
        if (!this.f5014p) {
            return false;
        }
        C0447f c0447f = this.f5021w;
        if ((c0447f != null && c0447f.b()) || (jVar = this.f5006h) == null || this.f5010l == null || this.y != null) {
            return false;
        }
        jVar.i();
        if (jVar.f4804j.isEmpty()) {
            return false;
        }
        A.a aVar = new A.a(this, new C0447f(this, this.f5005g, this.f5006h, this.f5011m), 9, false);
        this.y = aVar;
        this.f5010l.post(aVar);
        return true;
    }

    @Override // j.p
    public final boolean i(j.k kVar) {
        return false;
    }

    @Override // j.p
    public final void j(j.o oVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.p
    public final boolean k(j.t tVar) {
        boolean z5;
        if (tVar.hasVisibleItems()) {
            j.t tVar2 = tVar;
            while (true) {
                j.j jVar = tVar2.f4873v;
                if (jVar == this.f5006h) {
                    break;
                }
                tVar2 = (j.t) jVar;
            }
            j.k kVar = tVar2.f4874w;
            ActionMenuView actionMenuView = this.f5010l;
            View view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount) {
                        break;
                    }
                    View childAt = actionMenuView.getChildAt(i7);
                    if ((childAt instanceof j.q) && ((j.q) childAt).getItemData() == kVar) {
                        view = childAt;
                        break;
                    }
                    i7++;
                }
            }
            if (view != null) {
                tVar.f4874w.getClass();
                int size = tVar.f4800f.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        z5 = false;
                        break;
                    }
                    MenuItem item = tVar.getItem(i8);
                    if (item.isVisible() && item.getIcon() != null) {
                        z5 = true;
                        break;
                    }
                    i8++;
                }
                C0447f c0447f = new C0447f(this, this.f5005g, tVar, view);
                this.f5022x = c0447f;
                c0447f.f4850g = z5;
                j.l lVar = c0447f.f4852i;
                if (lVar != null) {
                    lVar.o(z5);
                }
                C0447f c0447f2 = this.f5022x;
                if (!c0447f2.b()) {
                    if (c0447f2.f4848e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0447f2.d(0, 0, false, false);
                }
                j.o oVar = this.f5008j;
                if (oVar != null) {
                    oVar.b(tVar);
                }
                return true;
            }
        }
        return false;
    }
}
