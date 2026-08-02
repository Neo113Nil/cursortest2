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
import com.rockchicken.pump.up.road.R;
import java.util.ArrayList;

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1218i implements j.p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14012a;

    /* renamed from: b, reason: collision with root package name */
    public Context f14013b;

    /* renamed from: c, reason: collision with root package name */
    public j.j f14014c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f14015d;

    /* renamed from: e, reason: collision with root package name */
    public j.o f14016e;

    /* renamed from: g, reason: collision with root package name */
    public ActionMenuView f14018g;

    /* renamed from: h, reason: collision with root package name */
    public C1216h f14019h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f14020i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14021j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14022k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14023l;

    /* renamed from: m, reason: collision with root package name */
    public int f14024m;
    public int n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14025p;

    /* renamed from: r, reason: collision with root package name */
    public C1212f f14027r;

    /* renamed from: s, reason: collision with root package name */
    public C1212f f14028s;

    /* renamed from: t, reason: collision with root package name */
    public B.a f14029t;

    /* renamed from: u, reason: collision with root package name */
    public C1214g f14030u;

    /* renamed from: f, reason: collision with root package name */
    public final int f14017f = R.layout.abc_action_menu_item_layout;

    /* renamed from: q, reason: collision with root package name */
    public final SparseBooleanArray f14026q = new SparseBooleanArray();
    public final e0.t v = new e0.t(this);

    public C1218i(Context context) {
        this.f14012a = context;
        this.f14015d = LayoutInflater.from(context);
    }

    @Override // j.p
    public final boolean a(j.k kVar) {
        return false;
    }

    @Override // j.p
    public final boolean b() {
        int i4;
        ArrayList arrayList;
        int i5;
        boolean z;
        C1218i c1218i = this;
        j.j jVar = c1218i.f14014c;
        if (jVar != null) {
            arrayList = jVar.k();
            i4 = arrayList.size();
        } else {
            i4 = 0;
            arrayList = null;
        }
        int i6 = c1218i.o;
        int i7 = c1218i.n;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = c1218i.f14018g;
        int i8 = 0;
        boolean z4 = false;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = 2;
            z = true;
            if (i8 >= i4) {
                break;
            }
            j.k kVar = (j.k) arrayList.get(i8);
            int i11 = kVar.f13689y;
            if ((i11 & 2) == 2) {
                i9++;
            } else if ((i11 & 1) == 1) {
                i10++;
            } else {
                z4 = true;
            }
            if (c1218i.f14025p && kVar.f13667B) {
                i6 = 0;
            }
            i8++;
        }
        if (c1218i.f14022k && (z4 || i10 + i9 > i6)) {
            i6--;
        }
        int i12 = i6 - i9;
        SparseBooleanArray sparseBooleanArray = c1218i.f14026q;
        sparseBooleanArray.clear();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i4) {
            j.k kVar2 = (j.k) arrayList.get(i13);
            int i15 = kVar2.f13689y;
            boolean z5 = (i15 & 2) == i5 ? z : false;
            int i16 = kVar2.f13669b;
            if (z5) {
                View c4 = c1218i.c(kVar2, null, actionMenuView);
                c4.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = c4.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                if (i16 != 0) {
                    sparseBooleanArray.put(i16, z);
                }
                kVar2.d(z);
            } else if ((i15 & 1) == z) {
                boolean z6 = sparseBooleanArray.get(i16);
                boolean z7 = ((i12 > 0 || z6) && i7 > 0) ? z : false;
                if (z7) {
                    View c5 = c1218i.c(kVar2, null, actionMenuView);
                    c5.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = c5.getMeasuredWidth();
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
                        j.k kVar3 = (j.k) arrayList.get(i17);
                        if (kVar3.f13669b == i16) {
                            if ((kVar3.f13688x & 32) == 32) {
                                i12++;
                            }
                            kVar3.d(false);
                        }
                    }
                }
                if (z7) {
                    i12--;
                }
                kVar2.d(z7);
            } else {
                kVar2.d(false);
                i13++;
                i5 = 2;
                c1218i = this;
                z = true;
            }
            i13++;
            i5 = 2;
            c1218i = this;
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v4, types: [j.q] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final View c(j.k kVar, View view, ActionMenuView actionMenuView) {
        View view2 = kVar.z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((kVar.f13689y & 8) != 0 && view2 != null)) {
            ActionMenuItemView actionMenuItemView = view instanceof j.q ? (j.q) view : (j.q) this.f14015d.inflate(this.f14017f, (ViewGroup) actionMenuView, false);
            actionMenuItemView.c(kVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f14018g);
            if (this.f14030u == null) {
                this.f14030u = new C1214g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f14030u);
            view3 = actionMenuItemView;
        }
        view3.setVisibility(kVar.f13667B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C1222k)) {
            view3.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view3;
    }

    @Override // j.p
    public final void d(j.j jVar, boolean z) {
        h();
        C1212f c1212f = this.f14028s;
        if (c1212f != null && c1212f.b()) {
            c1212f.f13700i.dismiss();
        }
        j.o oVar = this.f14016e;
        if (oVar != null) {
            oVar.d(jVar, z);
        }
    }

    @Override // j.p
    public final void e(j.o oVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.p
    public final boolean f(j.t tVar) {
        boolean z;
        if (tVar.hasVisibleItems()) {
            j.t tVar2 = tVar;
            while (true) {
                j.j jVar = tVar2.f13720w;
                if (jVar == this.f14014c) {
                    break;
                }
                tVar2 = (j.t) jVar;
            }
            j.k kVar = tVar2.f13721x;
            ActionMenuView actionMenuView = this.f14018g;
            View view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= childCount) {
                        break;
                    }
                    View childAt = actionMenuView.getChildAt(i4);
                    if ((childAt instanceof j.q) && ((j.q) childAt).getItemData() == kVar) {
                        view = childAt;
                        break;
                    }
                    i4++;
                }
            }
            if (view != null) {
                tVar.f13721x.getClass();
                int size = tVar.f13652f.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = tVar.getItem(i5);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i5++;
                }
                C1212f c1212f = new C1212f(this, this.f14013b, tVar, view);
                this.f14028s = c1212f;
                c1212f.f13698g = z;
                j.l lVar = c1212f.f13700i;
                if (lVar != null) {
                    lVar.n(z);
                }
                C1212f c1212f2 = this.f14028s;
                if (!c1212f2.b()) {
                    if (c1212f2.f13696e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c1212f2.d(0, 0, false, false);
                }
                j.o oVar = this.f14016e;
                if (oVar != null) {
                    oVar.r(tVar);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.p
    public final void g() {
        int i4;
        ActionMenuView actionMenuView = this.f14018g;
        ArrayList arrayList = null;
        boolean z = false;
        if (actionMenuView != null) {
            j.j jVar = this.f14014c;
            if (jVar != null) {
                jVar.i();
                ArrayList k4 = this.f14014c.k();
                int size = k4.size();
                i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    j.k kVar = (j.k) k4.get(i5);
                    if ((kVar.f13688x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i4);
                        j.k itemData = childAt instanceof j.q ? ((j.q) childAt).getItemData() : null;
                        View c4 = c(kVar, childAt, actionMenuView);
                        if (kVar != itemData) {
                            c4.setPressed(false);
                            c4.jumpDrawablesToCurrentState();
                        }
                        if (c4 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) c4.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(c4);
                            }
                            this.f14018g.addView(c4, i4);
                        }
                        i4++;
                    }
                }
            } else {
                i4 = 0;
            }
            while (i4 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i4) == this.f14019h) {
                    i4++;
                } else {
                    actionMenuView.removeViewAt(i4);
                }
            }
        }
        this.f14018g.requestLayout();
        j.j jVar2 = this.f14014c;
        if (jVar2 != null) {
            jVar2.i();
            ArrayList arrayList2 = jVar2.f13655i;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ((j.k) arrayList2.get(i6)).getClass();
            }
        }
        j.j jVar3 = this.f14014c;
        if (jVar3 != null) {
            jVar3.i();
            arrayList = jVar3.f13656j;
        }
        if (this.f14022k && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((j.k) arrayList.get(0)).f13667B;
            } else if (size3 > 0) {
                z = true;
            }
        }
        if (z) {
            if (this.f14019h == null) {
                this.f14019h = new C1216h(this, this.f14012a);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f14019h.getParent();
            if (viewGroup2 != this.f14018g) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f14019h);
                }
                ActionMenuView actionMenuView2 = this.f14018g;
                C1216h c1216h = this.f14019h;
                actionMenuView2.getClass();
                C1222k h2 = ActionMenuView.h();
                h2.f14036c = true;
                actionMenuView2.addView(c1216h, h2);
            }
        } else {
            C1216h c1216h2 = this.f14019h;
            if (c1216h2 != null) {
                ViewParent parent = c1216h2.getParent();
                ActionMenuView actionMenuView3 = this.f14018g;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f14019h);
                }
            }
        }
        this.f14018g.setOverflowReserved(this.f14022k);
    }

    public final boolean h() {
        ActionMenuView actionMenuView;
        B.a aVar = this.f14029t;
        if (aVar != null && (actionMenuView = this.f14018g) != null) {
            actionMenuView.removeCallbacks(aVar);
            this.f14029t = null;
            return true;
        }
        C1212f c1212f = this.f14027r;
        if (c1212f == null) {
            return false;
        }
        if (c1212f.b()) {
            c1212f.f13700i.dismiss();
        }
        return true;
    }

    @Override // j.p
    public final void i(Context context, j.j jVar) {
        this.f14013b = context;
        LayoutInflater.from(context);
        this.f14014c = jVar;
        Resources resources = context.getResources();
        if (!this.f14023l) {
            this.f14022k = true;
        }
        int i4 = 2;
        this.f14024m = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.o = i4;
        int i7 = this.f14024m;
        if (this.f14022k) {
            if (this.f14019h == null) {
                C1216h c1216h = new C1216h(this, this.f14012a);
                this.f14019h = c1216h;
                if (this.f14021j) {
                    c1216h.setImageDrawable(this.f14020i);
                    this.f14020i = null;
                    this.f14021j = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f14019h.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i7 -= this.f14019h.getMeasuredWidth();
        } else {
            this.f14019h = null;
        }
        this.n = i7;
        float f4 = resources.getDisplayMetrics().density;
    }

    @Override // j.p
    public final boolean j(j.k kVar) {
        return false;
    }

    public final boolean k() {
        j.j jVar;
        if (!this.f14022k) {
            return false;
        }
        C1212f c1212f = this.f14027r;
        if ((c1212f != null && c1212f.b()) || (jVar = this.f14014c) == null || this.f14018g == null || this.f14029t != null) {
            return false;
        }
        jVar.i();
        if (jVar.f13656j.isEmpty()) {
            return false;
        }
        B.a aVar = new B.a(this, new C1212f(this, this.f14013b, this.f14014c, this.f14019h), 15, false);
        this.f14029t = aVar;
        this.f14018g.post(aVar);
        j.o oVar = this.f14016e;
        if (oVar == null) {
            return true;
        }
        oVar.r(null);
        return true;
    }
}
