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
import com.snovikpovik.vuevnxsj.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i implements k.o {

    /* renamed from: d, reason: collision with root package name */
    public final Context f4255d;

    /* renamed from: e, reason: collision with root package name */
    public Context f4256e;

    /* renamed from: f, reason: collision with root package name */
    public k.i f4257f;

    /* renamed from: g, reason: collision with root package name */
    public final LayoutInflater f4258g;

    /* renamed from: h, reason: collision with root package name */
    public k.n f4259h;

    /* renamed from: j, reason: collision with root package name */
    public ActionMenuView f4260j;

    /* renamed from: k, reason: collision with root package name */
    public h f4261k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4262l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4263m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4264n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4265o;

    /* renamed from: p, reason: collision with root package name */
    public int f4266p;

    /* renamed from: q, reason: collision with root package name */
    public int f4267q;

    /* renamed from: r, reason: collision with root package name */
    public int f4268r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4269s;

    /* renamed from: u, reason: collision with root package name */
    public f f4271u;

    /* renamed from: v, reason: collision with root package name */
    public f f4272v;

    /* renamed from: w, reason: collision with root package name */
    public b7.d f4273w;

    /* renamed from: x, reason: collision with root package name */
    public g f4274x;
    public final int i = R.layout.abc_action_menu_item_layout;

    /* renamed from: t, reason: collision with root package name */
    public final SparseBooleanArray f4270t = new SparseBooleanArray();

    /* renamed from: y, reason: collision with root package name */
    public final b1.b f4275y = new b1.b(19, this);

    public i(Context context) {
        this.f4255d = context;
        this.f4258g = LayoutInflater.from(context);
    }

    @Override // k.o
    public final void a(k.i iVar, boolean z3) {
        g();
        f fVar = this.f4272v;
        if (fVar != null && fVar.b()) {
            fVar.i.dismiss();
        }
        k.n nVar = this.f4259h;
        if (nVar != null) {
            nVar.a(iVar, z3);
        }
    }

    @Override // k.o
    public final boolean b(k.j jVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.o
    public final boolean c(k.s sVar) {
        boolean z3;
        if (sVar.hasVisibleItems()) {
            k.s sVar2 = sVar;
            while (true) {
                k.i iVar = sVar2.f4144v;
                if (iVar == this.f4257f) {
                    break;
                }
                sVar2 = (k.s) iVar;
            }
            k.j jVar = sVar2.f4145w;
            ActionMenuView actionMenuView = this.f4260j;
            View view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = actionMenuView.getChildAt(i);
                    if ((childAt instanceof k.p) && ((k.p) childAt).getItemData() == jVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                sVar.f4145w.getClass();
                int size = sVar.f4075f.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        z3 = false;
                        break;
                    }
                    MenuItem item = sVar.getItem(i8);
                    if (item.isVisible() && item.getIcon() != null) {
                        z3 = true;
                        break;
                    }
                    i8++;
                }
                f fVar = new f(this, this.f4256e, sVar, view);
                this.f4272v = fVar;
                fVar.f4122g = z3;
                k.k kVar = fVar.i;
                if (kVar != null) {
                    kVar.o(z3);
                }
                f fVar2 = this.f4272v;
                if (!fVar2.b()) {
                    if (fVar2.f4120e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    fVar2.d(0, 0, false, false);
                }
                k.n nVar = this.f4259h;
                if (nVar != null) {
                    nVar.g(sVar);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v4, types: [k.p] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final View d(k.j jVar, View view, ActionMenuView actionMenuView) {
        View view2 = jVar.f4113z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((jVar.f4112y & 8) != 0 && view2 != null)) {
            ActionMenuItemView actionMenuItemView = view instanceof k.p ? (k.p) view : (k.p) this.f4258g.inflate(this.i, (ViewGroup) actionMenuView, false);
            actionMenuItemView.b(jVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f4260j);
            if (this.f4274x == null) {
                this.f4274x = new g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f4274x);
            view3 = actionMenuItemView;
        }
        view3.setVisibility(jVar.B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof k)) {
            view3.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return view3;
    }

    @Override // k.o
    public final boolean e(k.j jVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.o
    public final void f() {
        int i;
        ActionMenuView actionMenuView = this.f4260j;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (actionMenuView != null) {
            k.i iVar = this.f4257f;
            if (iVar != null) {
                iVar.i();
                ArrayList k3 = this.f4257f.k();
                int size = k3.size();
                i = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    k.j jVar = (k.j) k3.get(i8);
                    if ((jVar.f4111x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i);
                        k.j itemData = childAt instanceof k.p ? ((k.p) childAt).getItemData() : null;
                        View d8 = d(jVar, childAt, actionMenuView);
                        if (jVar != itemData) {
                            d8.setPressed(false);
                            d8.jumpDrawablesToCurrentState();
                        }
                        if (d8 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) d8.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(d8);
                            }
                            this.f4260j.addView(d8, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i) == this.f4261k) {
                    i++;
                } else {
                    actionMenuView.removeViewAt(i);
                }
            }
        }
        this.f4260j.requestLayout();
        k.i iVar2 = this.f4257f;
        if (iVar2 != null) {
            iVar2.i();
            ArrayList arrayList2 = iVar2.i;
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                ((k.j) arrayList2.get(i9)).getClass();
            }
        }
        k.i iVar3 = this.f4257f;
        if (iVar3 != null) {
            iVar3.i();
            arrayList = iVar3.f4078j;
        }
        if (this.f4264n && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((k.j) arrayList.get(0)).B;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f4261k == null) {
                this.f4261k = new h(this, this.f4255d);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f4261k.getParent();
            if (viewGroup2 != this.f4260j) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f4261k);
                }
                ActionMenuView actionMenuView2 = this.f4260j;
                h hVar = this.f4261k;
                actionMenuView2.getClass();
                k i10 = ActionMenuView.i();
                i10.f4318a = true;
                actionMenuView2.addView(hVar, i10);
            }
        } else {
            h hVar2 = this.f4261k;
            if (hVar2 != null) {
                ViewParent parent = hVar2.getParent();
                ActionMenuView actionMenuView3 = this.f4260j;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f4261k);
                }
            }
        }
        this.f4260j.setOverflowReserved(this.f4264n);
    }

    public final boolean g() {
        ActionMenuView actionMenuView;
        b7.d dVar = this.f4273w;
        if (dVar != null && (actionMenuView = this.f4260j) != null) {
            actionMenuView.removeCallbacks(dVar);
            this.f4273w = null;
            return true;
        }
        f fVar = this.f4271u;
        if (fVar == null) {
            return false;
        }
        if (fVar.b()) {
            fVar.i.dismiss();
        }
        return true;
    }

    @Override // k.o
    public final void h(k.n nVar) {
        throw null;
    }

    @Override // k.o
    public final void i(Context context, k.i iVar) {
        this.f4256e = context;
        LayoutInflater.from(context);
        this.f4257f = iVar;
        Resources resources = context.getResources();
        if (!this.f4265o) {
            this.f4264n = true;
        }
        int i = 2;
        this.f4266p = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i8 > 600 || ((i8 > 960 && i9 > 720) || (i8 > 720 && i9 > 960))) {
            i = 5;
        } else if (i8 >= 500 || ((i8 > 640 && i9 > 480) || (i8 > 480 && i9 > 640))) {
            i = 4;
        } else if (i8 >= 360) {
            i = 3;
        }
        this.f4268r = i;
        int i10 = this.f4266p;
        if (this.f4264n) {
            if (this.f4261k == null) {
                h hVar = new h(this, this.f4255d);
                this.f4261k = hVar;
                if (this.f4263m) {
                    hVar.setImageDrawable(this.f4262l);
                    this.f4262l = null;
                    this.f4263m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f4261k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f4261k.getMeasuredWidth();
        } else {
            this.f4261k = null;
        }
        this.f4267q = i10;
        float f6 = resources.getDisplayMetrics().density;
    }

    @Override // k.o
    public final boolean j() {
        int i;
        ArrayList arrayList;
        int i8;
        boolean z3;
        i iVar = this;
        k.i iVar2 = iVar.f4257f;
        if (iVar2 != null) {
            arrayList = iVar2.k();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i9 = iVar.f4268r;
        int i10 = iVar.f4267q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = iVar.f4260j;
        int i11 = 0;
        boolean z7 = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i8 = 2;
            z3 = true;
            if (i11 >= i) {
                break;
            }
            k.j jVar = (k.j) arrayList.get(i11);
            int i14 = jVar.f4112y;
            if ((i14 & 2) == 2) {
                i12++;
            } else if ((i14 & 1) == 1) {
                i13++;
            } else {
                z7 = true;
            }
            if (iVar.f4269s && jVar.B) {
                i9 = 0;
            }
            i11++;
        }
        if (iVar.f4264n && (z7 || i13 + i12 > i9)) {
            i9--;
        }
        int i15 = i9 - i12;
        SparseBooleanArray sparseBooleanArray = iVar.f4270t;
        sparseBooleanArray.clear();
        int i16 = 0;
        int i17 = 0;
        while (i16 < i) {
            k.j jVar2 = (k.j) arrayList.get(i16);
            int i18 = jVar2.f4112y;
            boolean z8 = (i18 & 2) == i8 ? z3 : false;
            int i19 = jVar2.f4090b;
            if (z8) {
                View d8 = iVar.d(jVar2, null, actionMenuView);
                d8.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = d8.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                if (i19 != 0) {
                    sparseBooleanArray.put(i19, z3);
                }
                jVar2.d(z3);
            } else if ((i18 & 1) == z3) {
                boolean z9 = sparseBooleanArray.get(i19);
                boolean z10 = ((i15 > 0 || z9) && i10 > 0) ? z3 : false;
                if (z10) {
                    View d9 = iVar.d(jVar2, null, actionMenuView);
                    d9.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = d9.getMeasuredWidth();
                    i10 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    z10 &= i10 + i17 > 0;
                }
                if (z10 && i19 != 0) {
                    sparseBooleanArray.put(i19, true);
                } else if (z9) {
                    sparseBooleanArray.put(i19, false);
                    for (int i20 = 0; i20 < i16; i20++) {
                        k.j jVar3 = (k.j) arrayList.get(i20);
                        if (jVar3.f4090b == i19) {
                            if ((jVar3.f4111x & 32) == 32) {
                                i15++;
                            }
                            jVar3.d(false);
                        }
                    }
                }
                if (z10) {
                    i15--;
                }
                jVar2.d(z10);
            } else {
                jVar2.d(false);
                i16++;
                i8 = 2;
                iVar = this;
                z3 = true;
            }
            i16++;
            i8 = 2;
            iVar = this;
            z3 = true;
        }
        return z3;
    }

    public final boolean k() {
        k.i iVar;
        if (!this.f4264n) {
            return false;
        }
        f fVar = this.f4271u;
        if ((fVar != null && fVar.b()) || (iVar = this.f4257f) == null || this.f4260j == null || this.f4273w != null) {
            return false;
        }
        iVar.i();
        if (iVar.f4078j.isEmpty()) {
            return false;
        }
        b7.d dVar = new b7.d(3, this, new f(this, this.f4256e, this.f4257f, this.f4261k), false);
        this.f4273w = dVar;
        this.f4260j.post(dVar);
        return true;
    }
}
