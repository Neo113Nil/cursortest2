package n;

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
import com.icefishing.icefish.ice.fishing.s294s.R;
import i.C0511M;
import java.util.ArrayList;
import m.InterfaceC0672A;
import m.InterfaceC0673B;

/* renamed from: n.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0716j implements m.z {

    /* renamed from: A, reason: collision with root package name */
    public C0708f f6793A;

    /* renamed from: B, reason: collision with root package name */
    public C0708f f6794B;

    /* renamed from: C, reason: collision with root package name */
    public RunnableC0712h f6795C;

    /* renamed from: D, reason: collision with root package name */
    public C0710g f6796D;

    /* renamed from: d, reason: collision with root package name */
    public final Context f6798d;

    /* renamed from: e, reason: collision with root package name */
    public Context f6799e;

    /* renamed from: i, reason: collision with root package name */
    public m.m f6800i;

    /* renamed from: l, reason: collision with root package name */
    public final LayoutInflater f6801l;

    /* renamed from: m, reason: collision with root package name */
    public m.y f6802m;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC0673B f6805p;

    /* renamed from: q, reason: collision with root package name */
    public C0714i f6806q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f6807r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6808s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6809t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6810u;

    /* renamed from: v, reason: collision with root package name */
    public int f6811v;

    /* renamed from: w, reason: collision with root package name */
    public int f6812w;

    /* renamed from: x, reason: collision with root package name */
    public int f6813x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6814y;

    /* renamed from: n, reason: collision with root package name */
    public final int f6803n = R.layout.abc_action_menu_layout;

    /* renamed from: o, reason: collision with root package name */
    public final int f6804o = R.layout.abc_action_menu_item_layout;

    /* renamed from: z, reason: collision with root package name */
    public final SparseBooleanArray f6815z = new SparseBooleanArray();

    /* renamed from: E, reason: collision with root package name */
    public final C0511M f6797E = new C0511M(6, this);

    public C0716j(Context context) {
        this.f6798d = context;
        this.f6801l = LayoutInflater.from(context);
    }

    @Override // m.z
    public final void a(m.m mVar, boolean z7) {
        c();
        C0708f c0708f = this.f6794B;
        if (c0708f != null && c0708f.b()) {
            c0708f.f6484i.dismiss();
        }
        m.y yVar = this.f6802m;
        if (yVar != null) {
            yVar.a(mVar, z7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [m.A] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View b(m.o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0672A ? (InterfaceC0672A) view : (InterfaceC0672A) this.f6801l.inflate(this.f6804o, viewGroup, false);
            actionMenuItemView.a(oVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f6805p);
            if (this.f6796D == null) {
                this.f6796D = new C0710g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f6796D);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(oVar.f6439C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0720l)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    public final boolean c() {
        Object obj;
        RunnableC0712h runnableC0712h = this.f6795C;
        if (runnableC0712h != null && (obj = this.f6805p) != null) {
            ((View) obj).removeCallbacks(runnableC0712h);
            this.f6795C = null;
            return true;
        }
        C0708f c0708f = this.f6793A;
        if (c0708f == null) {
            return false;
        }
        if (c0708f.b()) {
            c0708f.f6484i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m.z
    public final void d() {
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.f6805p;
        ArrayList arrayList = null;
        boolean z7 = false;
        if (viewGroup != null) {
            m.m mVar = this.f6800i;
            if (mVar != null) {
                mVar.i();
                ArrayList l7 = this.f6800i.l();
                int size = l7.size();
                i2 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    m.o oVar = (m.o) l7.get(i5);
                    if ((oVar.f6462x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i2);
                        m.o itemData = childAt instanceof InterfaceC0672A ? ((InterfaceC0672A) childAt).getItemData() : null;
                        View b7 = b(oVar, childAt, viewGroup);
                        if (oVar != itemData) {
                            b7.setPressed(false);
                            b7.jumpDrawablesToCurrentState();
                        }
                        if (b7 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b7.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b7);
                            }
                            ((ViewGroup) this.f6805p).addView(b7, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f6806q) {
                    i2++;
                } else {
                    viewGroup.removeViewAt(i2);
                }
            }
        }
        ((View) this.f6805p).requestLayout();
        m.m mVar2 = this.f6800i;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.f6418i;
            int size2 = arrayList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                m.p pVar = ((m.o) arrayList2.get(i7)).f6437A;
            }
        }
        m.m mVar3 = this.f6800i;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.j;
        }
        if (this.f6809t && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z7 = !((m.o) arrayList.get(0)).f6439C;
            } else if (size3 > 0) {
                z7 = true;
            }
        }
        if (z7) {
            if (this.f6806q == null) {
                this.f6806q = new C0714i(this, this.f6798d);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f6806q.getParent();
            if (viewGroup3 != this.f6805p) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f6806q);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f6805p;
                C0714i c0714i = this.f6806q;
                actionMenuView.getClass();
                C0720l i8 = ActionMenuView.i();
                i8.f6832a = true;
                actionMenuView.addView(c0714i, i8);
            }
        } else {
            C0714i c0714i2 = this.f6806q;
            if (c0714i2 != null) {
                Object parent = c0714i2.getParent();
                Object obj = this.f6805p;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f6806q);
                }
            }
        }
        ((ActionMenuView) this.f6805p).setOverflowReserved(this.f6809t);
    }

    public final boolean e() {
        C0708f c0708f = this.f6793A;
        return c0708f != null && c0708f.b();
    }

    @Override // m.z
    public final boolean f(m.o oVar) {
        return false;
    }

    @Override // m.z
    public final void g(Context context, m.m mVar) {
        this.f6799e = context;
        LayoutInflater.from(context);
        this.f6800i = mVar;
        Resources resources = context.getResources();
        if (!this.f6810u) {
            this.f6809t = true;
        }
        int i2 = 2;
        this.f6811v = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i7 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i5 > 600 || ((i5 > 960 && i7 > 720) || (i5 > 720 && i7 > 960))) {
            i2 = 5;
        } else if (i5 >= 500 || ((i5 > 640 && i7 > 480) || (i5 > 480 && i7 > 640))) {
            i2 = 4;
        } else if (i5 >= 360) {
            i2 = 3;
        }
        this.f6813x = i2;
        int i8 = this.f6811v;
        if (this.f6809t) {
            if (this.f6806q == null) {
                C0714i c0714i = new C0714i(this, this.f6798d);
                this.f6806q = c0714i;
                if (this.f6808s) {
                    c0714i.setImageDrawable(this.f6807r);
                    this.f6807r = null;
                    this.f6808s = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f6806q.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i8 -= this.f6806q.getMeasuredWidth();
        } else {
            this.f6806q = null;
        }
        this.f6812w = i8;
        float f7 = resources.getDisplayMetrics().density;
    }

    @Override // m.z
    public final boolean h() {
        int i2;
        ArrayList arrayList;
        int i5;
        boolean z7;
        C0716j c0716j = this;
        m.m mVar = c0716j.f6800i;
        if (mVar != null) {
            arrayList = mVar.l();
            i2 = arrayList.size();
        } else {
            i2 = 0;
            arrayList = null;
        }
        int i7 = c0716j.f6813x;
        int i8 = c0716j.f6812w;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0716j.f6805p;
        int i9 = 0;
        boolean z8 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = 2;
            z7 = true;
            if (i9 >= i2) {
                break;
            }
            m.o oVar = (m.o) arrayList.get(i9);
            int i12 = oVar.f6463y;
            if ((i12 & 2) == 2) {
                i10++;
            } else if ((i12 & 1) == 1) {
                i11++;
            } else {
                z8 = true;
            }
            if (c0716j.f6814y && oVar.f6439C) {
                i7 = 0;
            }
            i9++;
        }
        if (c0716j.f6809t && (z8 || i11 + i10 > i7)) {
            i7--;
        }
        int i13 = i7 - i10;
        SparseBooleanArray sparseBooleanArray = c0716j.f6815z;
        sparseBooleanArray.clear();
        int i14 = 0;
        int i15 = 0;
        while (i14 < i2) {
            m.o oVar2 = (m.o) arrayList.get(i14);
            int i16 = oVar2.f6463y;
            boolean z9 = (i16 & 2) == i5 ? z7 : false;
            int i17 = oVar2.f6441b;
            if (z9) {
                View b7 = c0716j.b(oVar2, null, viewGroup);
                b7.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b7.getMeasuredWidth();
                i8 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                if (i17 != 0) {
                    sparseBooleanArray.put(i17, z7);
                }
                oVar2.f(z7);
            } else if ((i16 & 1) == z7) {
                boolean z10 = sparseBooleanArray.get(i17);
                boolean z11 = ((i13 > 0 || z10) && i8 > 0) ? z7 : false;
                if (z11) {
                    View b8 = c0716j.b(oVar2, null, viewGroup);
                    b8.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b8.getMeasuredWidth();
                    i8 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z11 &= i8 + i15 > 0;
                }
                if (z11 && i17 != 0) {
                    sparseBooleanArray.put(i17, true);
                } else if (z10) {
                    sparseBooleanArray.put(i17, false);
                    for (int i18 = 0; i18 < i14; i18++) {
                        m.o oVar3 = (m.o) arrayList.get(i18);
                        if (oVar3.f6441b == i17) {
                            if ((oVar3.f6462x & 32) == 32) {
                                i13++;
                            }
                            oVar3.f(false);
                        }
                    }
                }
                if (z11) {
                    i13--;
                }
                oVar2.f(z11);
            } else {
                oVar2.f(false);
                i14++;
                i5 = 2;
                c0716j = this;
                z7 = true;
            }
            i14++;
            i5 = 2;
            c0716j = this;
            z7 = true;
        }
        return z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m.z
    public final boolean i(m.F f7) {
        boolean z7;
        if (f7.hasVisibleItems()) {
            m.F f8 = f7;
            while (true) {
                m.m mVar = f8.f6344A;
                if (mVar == this.f6800i) {
                    break;
                }
                f8 = (m.F) mVar;
            }
            m.o oVar = f8.f6345B;
            ViewGroup viewGroup = (ViewGroup) this.f6805p;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if ((childAt instanceof InterfaceC0672A) && ((InterfaceC0672A) childAt).getItemData() == oVar) {
                        view = childAt;
                        break;
                    }
                    i2++;
                }
            }
            if (view != null) {
                f7.f6345B.getClass();
                int size = f7.f6415f.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        z7 = false;
                        break;
                    }
                    MenuItem item = f7.getItem(i5);
                    if (item.isVisible() && item.getIcon() != null) {
                        z7 = true;
                        break;
                    }
                    i5++;
                }
                C0708f c0708f = new C0708f(this, this.f6799e, f7, view);
                this.f6794B = c0708f;
                c0708f.f6482g = z7;
                m.u uVar = c0708f.f6484i;
                if (uVar != null) {
                    uVar.o(z7);
                }
                C0708f c0708f2 = this.f6794B;
                if (!c0708f2.b()) {
                    if (c0708f2.f6480e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0708f2.d(0, 0, false, false);
                }
                m.y yVar = this.f6802m;
                if (yVar != null) {
                    yVar.i(f7);
                }
                return true;
            }
        }
        return false;
    }

    @Override // m.z
    public final void j(m.y yVar) {
        throw null;
    }

    @Override // m.z
    public final boolean k(m.o oVar) {
        return false;
    }

    public final boolean l() {
        m.m mVar;
        if (!this.f6809t || e() || (mVar = this.f6800i) == null || this.f6805p == null || this.f6795C != null) {
            return false;
        }
        mVar.i();
        if (mVar.j.isEmpty()) {
            return false;
        }
        RunnableC0712h runnableC0712h = new RunnableC0712h(this, new C0708f(this, this.f6799e, this.f6800i, this.f6806q));
        this.f6795C = runnableC0712h;
        ((View) this.f6805p).post(runnableC0712h);
        return true;
    }
}
