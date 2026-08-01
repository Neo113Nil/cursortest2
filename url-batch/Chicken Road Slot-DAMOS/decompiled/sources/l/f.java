package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.appsflyer.R;
import d2.a2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m.e1;
import m.f1;
import m.g1;
import m.h1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View B;
    public View C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public boolean J;
    public n K;
    public ViewTreeObserver L;
    public PopupWindow.OnDismissListener M;
    public boolean N;

    /* renamed from: e, reason: collision with root package name */
    public final Context f5647e;

    /* renamed from: i, reason: collision with root package name */
    public final int f5648i;

    /* renamed from: r, reason: collision with root package name */
    public final int f5649r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5650s;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f5651t;

    /* renamed from: w, reason: collision with root package name */
    public final c f5654w;

    /* renamed from: y, reason: collision with root package name */
    public final d f5656y;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f5652u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f5653v = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final a2 f5655x = new a2(3, this);

    /* renamed from: z, reason: collision with root package name */
    public int f5657z = 0;
    public int A = 0;
    public boolean I = false;

    public f(Context context, View view, int i3, boolean z10) {
        this.f5654w = new c(this, r1);
        this.f5656y = new d(r1, this);
        this.f5647e = context;
        this.B = view;
        this.f5649r = i3;
        this.f5650s = z10;
        this.D = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f5648i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f5651t = new Handler();
    }

    @Override // l.q
    public final void a() {
        if (j()) {
            return;
        }
        ArrayList arrayList = this.f5652u;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            u((i) obj);
        }
        arrayList.clear();
        View view = this.B;
        this.C = view;
        if (view != null) {
            boolean z10 = this.L == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.L = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f5654w);
            }
            this.C.addOnAttachStateChangeListener(this.f5655x);
        }
    }

    @Override // l.o
    public final void b(i iVar, boolean z10) {
        ArrayList arrayList = this.f5653v;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (iVar == ((e) arrayList.get(i3)).f5645b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return;
        }
        int i10 = i3 + 1;
        if (i10 < arrayList.size()) {
            ((e) arrayList.get(i10)).f5645b.c(false);
        }
        e eVar = (e) arrayList.remove(i3);
        i iVar2 = eVar.f5645b;
        h1 h1Var = eVar.f5644a;
        m.s sVar = h1Var.J;
        CopyOnWriteArrayList copyOnWriteArrayList = iVar2.f5680r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            o oVar = (o) weakReference.get();
            if (oVar == null || oVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.N) {
            e1.b(sVar, null);
            sVar.setAnimationStyle(0);
        }
        h1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.D = ((e) arrayList.get(size2 - 1)).f5646c;
        } else {
            this.D = this.B.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((e) arrayList.get(0)).f5645b.c(false);
                return;
            }
            return;
        }
        dismiss();
        n nVar = this.K;
        if (nVar != null) {
            nVar.b(iVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.L;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.L.removeGlobalOnLayoutListener(this.f5654w);
            }
            this.L = null;
        }
        this.C.removeOnAttachStateChangeListener(this.f5655x);
        this.M.onDismiss();
    }

    @Override // l.o
    public final void c() {
        ArrayList arrayList = this.f5653v;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ListAdapter adapter = ((e) obj).f5644a.f6041i.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((g) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.q
    public final ListView d() {
        ArrayList arrayList = this.f5653v;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) arrayList.get(arrayList.size() - 1)).f5644a.f6041i;
    }

    @Override // l.q
    public final void dismiss() {
        ArrayList arrayList = this.f5653v;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                e eVar = eVarArr[i3];
                if (eVar.f5644a.J.isShowing()) {
                    eVar.f5644a.dismiss();
                }
            }
        }
    }

    @Override // l.o
    public final void e(n nVar) {
        this.K = nVar;
    }

    @Override // l.o
    public final boolean h() {
        return false;
    }

    @Override // l.o
    public final boolean i(s sVar) {
        ArrayList arrayList = this.f5653v;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            e eVar = (e) obj;
            if (sVar == eVar.f5645b) {
                eVar.f5644a.f6041i.requestFocus();
                return true;
            }
        }
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        l(sVar);
        n nVar = this.K;
        if (nVar != null) {
            nVar.f(sVar);
        }
        return true;
    }

    @Override // l.q
    public final boolean j() {
        ArrayList arrayList = this.f5653v;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).f5644a.J.isShowing();
    }

    @Override // l.k
    public final void l(i iVar) {
        iVar.b(this, this.f5647e);
        if (j()) {
            u(iVar);
        } else {
            this.f5652u.add(iVar);
        }
    }

    @Override // l.k
    public final void n(View view) {
        if (this.B != view) {
            this.B = view;
            this.A = Gravity.getAbsoluteGravity(this.f5657z, view.getLayoutDirection());
        }
    }

    @Override // l.k
    public final void o(boolean z10) {
        this.I = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f5653v;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i3);
            if (!eVar.f5644a.J.isShowing()) {
                break;
            } else {
                i3++;
            }
        }
        if (eVar != null) {
            eVar.f5645b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.k
    public final void p(int i3) {
        if (this.f5657z != i3) {
            this.f5657z = i3;
            this.A = Gravity.getAbsoluteGravity(i3, this.B.getLayoutDirection());
        }
    }

    @Override // l.k
    public final void q(int i3) {
        this.E = true;
        this.G = i3;
    }

    @Override // l.k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.M = onDismissListener;
    }

    @Override // l.k
    public final void s(boolean z10) {
        this.J = z10;
    }

    @Override // l.k
    public final void t(int i3) {
        this.F = true;
        this.H = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0189  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.LayoutInflater] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(i iVar) {
        boolean z10;
        boolean z11;
        View view;
        e eVar;
        int i3;
        int i10;
        int i11;
        int width;
        MenuItem menuItem;
        g gVar;
        int i12;
        int firstVisiblePosition;
        Context context = this.f5647e;
        ?? from = LayoutInflater.from(context);
        g gVar2 = new g(iVar, from, this.f5650s, R.layout.abc_cascading_menu_item_layout);
        if (!j() && this.I) {
            gVar2.f5660c = true;
        } else if (j()) {
            int size = iVar.f5670f.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = iVar.getItem(i13);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i13++;
            }
            gVar2.f5660c = z10;
        }
        int m10 = k.m(gVar2, context, this.f5648i);
        h1 h1Var = new h1(context, this.f5649r);
        h1Var.M = this.f5656y;
        h1Var.A = this;
        m.s sVar = h1Var.J;
        sVar.setOnDismissListener(this);
        h1Var.f6050z = this.B;
        h1Var.f6048x = this.A;
        h1Var.I = true;
        sVar.setFocusable(true);
        sVar.setInputMethodMode(2);
        h1Var.b(gVar2);
        Drawable background = sVar.getBackground();
        if (background != null) {
            Rect rect = h1Var.G;
            background.getPadding(rect);
            h1Var.f6042r = rect.left + rect.right + m10;
        } else {
            h1Var.f6042r = m10;
        }
        h1Var.f6048x = this.A;
        ArrayList arrayList = this.f5653v;
        if (arrayList.size() > 0) {
            eVar = (e) arrayList.get(arrayList.size() - 1);
            i iVar2 = eVar.f5645b;
            int size2 = iVar2.f5670f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = iVar2.getItem(i14);
                if (menuItem.hasSubMenu() && iVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i14++;
                }
            }
            if (menuItem == null) {
                view = null;
                z11 = 0;
            } else {
                g1 g1Var = eVar.f5644a.f6041i;
                ListAdapter adapter = g1Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i12 = headerViewListAdapter.getHeadersCount();
                    gVar = (g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    gVar = (g) adapter;
                    i12 = 0;
                }
                int count = gVar.getCount();
                int i15 = 0;
                z11 = 0;
                z11 = 0;
                while (true) {
                    if (i15 >= count) {
                        i15 = -1;
                        break;
                    } else if (menuItem == gVar.getItem(i15)) {
                        break;
                    } else {
                        i15++;
                    }
                }
                view = (i15 != -1 && (firstVisiblePosition = (i15 + i12) - g1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < g1Var.getChildCount()) ? g1Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            z11 = 0;
            view = null;
            eVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = h1.N;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[z11] = Boolean.FALSE;
                        method.invoke(sVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                f1.a(sVar, z11);
            }
            e1.a(sVar, null);
            g1 g1Var2 = ((e) arrayList.get(arrayList.size() - 1)).f5644a.f6041i;
            int[] iArr = new int[2];
            g1Var2.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.C.getWindowVisibleDisplayFrame(rect2);
            if (this.D == 1) {
                if (g1Var2.getWidth() + iArr[0] + m10 > rect2.right) {
                    i3 = 0;
                    boolean z12 = i3 != 1;
                    this.D = i3;
                    if (Build.VERSION.SDK_INT < 26) {
                        h1Var.f6050z = view;
                        i11 = 0;
                        i10 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.B.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.A & 7) == 5) {
                            iArr2[0] = this.B.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        }
                        i10 = iArr3[0] - iArr2[0];
                        i11 = iArr3[1] - iArr2[1];
                    }
                    if ((this.A & 5) == 5) {
                        if (z12) {
                            width = i10 + view.getWidth();
                            h1Var.f6043s = width;
                            h1Var.f6047w = true;
                            h1Var.f6046v = true;
                            h1Var.f6044t = i11;
                            h1Var.f6045u = true;
                        }
                        width = i10 - m10;
                        h1Var.f6043s = width;
                        h1Var.f6047w = true;
                        h1Var.f6046v = true;
                        h1Var.f6044t = i11;
                        h1Var.f6045u = true;
                    } else if (z12) {
                        width = i10 + m10;
                        h1Var.f6043s = width;
                        h1Var.f6047w = true;
                        h1Var.f6046v = true;
                        h1Var.f6044t = i11;
                        h1Var.f6045u = true;
                    } else {
                        m10 = view.getWidth();
                        width = i10 - m10;
                        h1Var.f6043s = width;
                        h1Var.f6047w = true;
                        h1Var.f6046v = true;
                        h1Var.f6044t = i11;
                        h1Var.f6045u = true;
                    }
                }
                i3 = 1;
                if (i3 != 1) {
                }
                this.D = i3;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.A & 5) == 5) {
                }
            } else {
                if (iArr[0] - m10 >= 0) {
                    i3 = 0;
                    if (i3 != 1) {
                    }
                    this.D = i3;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.A & 5) == 5) {
                    }
                }
                i3 = 1;
                if (i3 != 1) {
                }
                this.D = i3;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.A & 5) == 5) {
                }
            }
        } else {
            if (this.E) {
                h1Var.f6043s = this.G;
            }
            if (this.F) {
                h1Var.f6044t = this.H;
                h1Var.f6045u = true;
            }
            Rect rect3 = this.f5707d;
            h1Var.H = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new e(h1Var, iVar, this.D));
        h1Var.a();
        g1 g1Var3 = h1Var.f6041i;
        g1Var3.setOnKeyListener(this);
        if (eVar == null && this.J && iVar.f5674l != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, g1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(iVar.f5674l);
            g1Var3.addHeaderView(frameLayout, null, false);
            h1Var.a();
        }
    }
}
