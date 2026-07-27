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
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.chickyneer.roadway.R;
import java.util.ArrayList;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1237i implements k.o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10868a;

    /* renamed from: b, reason: collision with root package name */
    public Context f10869b;

    /* renamed from: c, reason: collision with root package name */
    public k.i f10870c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f10871d;

    /* renamed from: e, reason: collision with root package name */
    public k.n f10872e;

    /* renamed from: g, reason: collision with root package name */
    public ActionMenuView f10874g;

    /* renamed from: h, reason: collision with root package name */
    public C1236h f10875h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f10876i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10877j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10878k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10879l;

    /* renamed from: m, reason: collision with root package name */
    public int f10880m;

    /* renamed from: n, reason: collision with root package name */
    public int f10881n;

    /* renamed from: o, reason: collision with root package name */
    public int f10882o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10883p;

    /* renamed from: r, reason: collision with root package name */
    public C1234f f10885r;

    /* renamed from: s, reason: collision with root package name */
    public C1234f f10886s;

    /* renamed from: t, reason: collision with root package name */
    public A0.a f10887t;

    /* renamed from: u, reason: collision with root package name */
    public C1235g f10888u;

    /* renamed from: f, reason: collision with root package name */
    public final int f10873f = R.layout.abc_action_menu_item_layout;

    /* renamed from: q, reason: collision with root package name */
    public final SparseBooleanArray f10884q = new SparseBooleanArray();

    /* renamed from: v, reason: collision with root package name */
    public final U.e f10889v = new U.e(this);

    public C1237i(Context context) {
        this.f10868a = context;
        this.f10871d = LayoutInflater.from(context);
    }

    @Override // k.o
    public final void a(k.i iVar, boolean z) {
        g();
        C1234f c1234f = this.f10886s;
        if (c1234f != null && c1234f.b()) {
            c1234f.f10643i.dismiss();
        }
        k.n nVar = this.f10872e;
        if (nVar != null) {
            nVar.a(iVar, z);
        }
    }

    @Override // k.o
    public final boolean b(k.j jVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.o
    public final boolean c(k.s sVar) {
        boolean z;
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        k.s sVar2 = sVar;
        while (true) {
            k.i iVar = sVar2.f10665v;
            if (iVar == this.f10870c) {
                break;
            }
            sVar2 = (k.s) iVar;
        }
        ActionMenuView actionMenuView = this.f10874g;
        View view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = actionMenuView.getChildAt(i2);
                if ((childAt instanceof k.p) && ((k.p) childAt).getItemData() == sVar2.f10666w) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        sVar.f10666w.getClass();
        int size = sVar.f10591f.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z = false;
                break;
            }
            MenuItem item = sVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i3++;
        }
        C1234f c1234f = new C1234f(this, this.f10869b, sVar, view);
        this.f10886s = c1234f;
        c1234f.f10641g = z;
        k.k kVar = c1234f.f10643i;
        if (kVar != null) {
            kVar.o(z);
        }
        C1234f c1234f2 = this.f10886s;
        if (!c1234f2.b()) {
            if (c1234f2.f10639e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c1234f2.d(0, 0, false, false);
        }
        k.n nVar = this.f10872e;
        if (nVar != null) {
            nVar.g(sVar);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [k.p] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View d(k.j jVar, View view, ActionMenuView actionMenuView) {
        View view2 = jVar.z;
        if (view2 == null) {
            view2 = null;
        }
        if (view2 == null || jVar.c()) {
            ActionMenuItemView actionMenuItemView = view instanceof k.p ? (k.p) view : (k.p) this.f10871d.inflate(this.f10873f, (ViewGroup) actionMenuView, false);
            actionMenuItemView.a(jVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f10874g);
            if (this.f10888u == null) {
                this.f10888u = new C1235g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f10888u);
            view2 = actionMenuItemView;
        }
        view2.setVisibility(jVar.f10607B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C1239k)) {
            view2.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view2;
    }

    @Override // k.o
    public final boolean e(k.j jVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.o
    public final void f() {
        int i2;
        ActionMenuView actionMenuView = this.f10874g;
        ArrayList arrayList = null;
        boolean z = false;
        if (actionMenuView != null) {
            k.i iVar = this.f10870c;
            if (iVar != null) {
                iVar.i();
                ArrayList k3 = this.f10870c.k();
                int size = k3.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    k.j jVar = (k.j) k3.get(i3);
                    if (jVar.d()) {
                        View childAt = actionMenuView.getChildAt(i2);
                        k.j itemData = childAt instanceof k.p ? ((k.p) childAt).getItemData() : null;
                        View d6 = d(jVar, childAt, actionMenuView);
                        if (jVar != itemData) {
                            d6.setPressed(false);
                            d6.jumpDrawablesToCurrentState();
                        }
                        if (d6 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) d6.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(d6);
                            }
                            this.f10874g.addView(d6, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i2) == this.f10875h) {
                    i2++;
                } else {
                    actionMenuView.removeViewAt(i2);
                }
            }
        }
        this.f10874g.requestLayout();
        k.i iVar2 = this.f10870c;
        if (iVar2 != null) {
            iVar2.i();
            ArrayList arrayList2 = iVar2.f10594i;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ((k.j) arrayList2.get(i6)).getClass();
            }
        }
        k.i iVar3 = this.f10870c;
        if (iVar3 != null) {
            iVar3.i();
            arrayList = iVar3.f10595j;
        }
        if (this.f10878k && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((k.j) arrayList.get(0)).f10607B;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.f10875h == null) {
                this.f10875h = new C1236h(this, this.f10868a);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f10875h.getParent();
            if (viewGroup2 != this.f10874g) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f10875h);
                }
                ActionMenuView actionMenuView2 = this.f10874g;
                C1236h c1236h = this.f10875h;
                actionMenuView2.getClass();
                C1239k h3 = ActionMenuView.h();
                h3.f10895c = true;
                actionMenuView2.addView(c1236h, h3);
            }
        } else {
            C1236h c1236h2 = this.f10875h;
            if (c1236h2 != null) {
                ViewParent parent = c1236h2.getParent();
                ActionMenuView actionMenuView3 = this.f10874g;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f10875h);
                }
            }
        }
        this.f10874g.setOverflowReserved(this.f10878k);
    }

    public final boolean g() {
        ActionMenuView actionMenuView;
        A0.a aVar = this.f10887t;
        if (aVar != null && (actionMenuView = this.f10874g) != null) {
            actionMenuView.removeCallbacks(aVar);
            this.f10887t = null;
            return true;
        }
        C1234f c1234f = this.f10885r;
        if (c1234f == null) {
            return false;
        }
        if (c1234f.b()) {
            c1234f.f10643i.dismiss();
        }
        return true;
    }

    @Override // k.o
    public final void h(k.n nVar) {
        throw null;
    }

    @Override // k.o
    public final void i(Context context, k.i iVar) {
        this.f10869b = context;
        LayoutInflater.from(context);
        this.f10870c = iVar;
        Resources resources = context.getResources();
        if (!this.f10879l) {
            this.f10878k = true;
        }
        int i2 = 2;
        this.f10880m = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i6 > 720) || (i3 > 720 && i6 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i6 > 480) || (i3 > 480 && i6 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f10882o = i2;
        int i7 = this.f10880m;
        if (this.f10878k) {
            if (this.f10875h == null) {
                C1236h c1236h = new C1236h(this, this.f10868a);
                this.f10875h = c1236h;
                if (this.f10877j) {
                    c1236h.setImageDrawable(this.f10876i);
                    this.f10876i = null;
                    this.f10877j = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f10875h.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i7 -= this.f10875h.getMeasuredWidth();
        } else {
            this.f10875h = null;
        }
        this.f10881n = i7;
        float f3 = resources.getDisplayMetrics().density;
    }

    @Override // k.o
    public final boolean j() {
        int i2;
        ArrayList arrayList;
        int i3;
        boolean z;
        k.i iVar = this.f10870c;
        if (iVar != null) {
            arrayList = iVar.k();
            i2 = arrayList.size();
        } else {
            i2 = 0;
            arrayList = null;
        }
        int i6 = this.f10882o;
        int i7 = this.f10881n;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f10874g;
        int i8 = 0;
        boolean z5 = false;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i3 = 2;
            z = true;
            if (i8 >= i2) {
                break;
            }
            k.j jVar = (k.j) arrayList.get(i8);
            int i11 = jVar.f10632y;
            if ((i11 & 2) == 2) {
                i9++;
            } else if ((i11 & 1) == 1) {
                i10++;
            } else {
                z5 = true;
            }
            if (this.f10883p && jVar.f10607B) {
                i6 = 0;
            }
            i8++;
        }
        if (this.f10878k && (z5 || i10 + i9 > i6)) {
            i6--;
        }
        int i12 = i6 - i9;
        SparseBooleanArray sparseBooleanArray = this.f10884q;
        sparseBooleanArray.clear();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i2) {
            k.j jVar2 = (k.j) arrayList.get(i13);
            int i15 = jVar2.f10632y;
            boolean z6 = (i15 & 2) == i3 ? z : false;
            int i16 = jVar2.f10609b;
            if (z6) {
                View d6 = d(jVar2, null, actionMenuView);
                d6.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = d6.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                if (i16 != 0) {
                    sparseBooleanArray.put(i16, z);
                }
                jVar2.f(z);
            } else if ((i15 & 1) == z) {
                boolean z7 = sparseBooleanArray.get(i16);
                boolean z8 = ((i12 > 0 || z7) && i7 > 0) ? z : false;
                if (z8) {
                    View d7 = d(jVar2, null, actionMenuView);
                    d7.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = d7.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z8 &= i7 + i14 > 0;
                }
                if (z8 && i16 != 0) {
                    sparseBooleanArray.put(i16, true);
                } else if (z7) {
                    sparseBooleanArray.put(i16, false);
                    for (int i17 = 0; i17 < i13; i17++) {
                        k.j jVar3 = (k.j) arrayList.get(i17);
                        if (jVar3.f10609b == i16) {
                            if (jVar3.d()) {
                                i12++;
                            }
                            jVar3.f(false);
                        }
                    }
                }
                if (z8) {
                    i12--;
                }
                jVar2.f(z8);
            } else {
                jVar2.f(false);
                i13++;
                i3 = 2;
                z = true;
            }
            i13++;
            i3 = 2;
            z = true;
        }
        return z;
    }

    public final boolean k() {
        k.i iVar;
        if (!this.f10878k) {
            return false;
        }
        C1234f c1234f = this.f10885r;
        if ((c1234f != null && c1234f.b()) || (iVar = this.f10870c) == null || this.f10874g == null || this.f10887t != null) {
            return false;
        }
        iVar.i();
        if (iVar.f10595j.isEmpty()) {
            return false;
        }
        A0.a aVar = new A0.a(this, 28, new C1234f(this, this.f10869b, this.f10870c, this.f10875h));
        this.f10887t = aVar;
        this.f10874g.post(aVar);
        k.n nVar = this.f10872e;
        if (nVar == null) {
            return true;
        }
        nVar.g(null);
        return true;
    }
}
