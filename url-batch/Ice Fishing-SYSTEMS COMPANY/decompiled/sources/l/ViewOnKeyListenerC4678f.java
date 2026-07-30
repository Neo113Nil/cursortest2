package l;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.icefishing.icefishingliveapp.C5284R;
import g1.C4524d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import m.C4754p0;
import m.C4772z;
import m.D0;
import m.E0;
import m.G0;

/* renamed from: l.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC4678f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: G, reason: collision with root package name */
    public View f38913G;

    /* renamed from: H, reason: collision with root package name */
    public View f38914H;

    /* renamed from: I, reason: collision with root package name */
    public int f38915I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f38916K;

    /* renamed from: L, reason: collision with root package name */
    public int f38917L;

    /* renamed from: M, reason: collision with root package name */
    public int f38918M;

    /* renamed from: O, reason: collision with root package name */
    public boolean f38920O;

    /* renamed from: P, reason: collision with root package name */
    public w f38921P;

    /* renamed from: Q, reason: collision with root package name */
    public ViewTreeObserver f38922Q;

    /* renamed from: R, reason: collision with root package name */
    public u f38923R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f38924S;

    /* renamed from: u, reason: collision with root package name */
    public final Context f38925u;

    /* renamed from: v, reason: collision with root package name */
    public final int f38926v;

    /* renamed from: w, reason: collision with root package name */
    public final int f38927w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f38928x;

    /* renamed from: y, reason: collision with root package name */
    public final Handler f38929y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f38930z = new ArrayList();

    /* renamed from: A, reason: collision with root package name */
    public final ArrayList f38907A = new ArrayList();

    /* renamed from: B, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC4676d f38908B = new ViewTreeObserverOnGlobalLayoutListenerC4676d(0, this);

    /* renamed from: C, reason: collision with root package name */
    public final F3.p f38909C = new F3.p(2, this);

    /* renamed from: D, reason: collision with root package name */
    public final C4524d f38910D = new C4524d(24, this);

    /* renamed from: E, reason: collision with root package name */
    public int f38911E = 0;

    /* renamed from: F, reason: collision with root package name */
    public int f38912F = 0;

    /* renamed from: N, reason: collision with root package name */
    public boolean f38919N = false;

    public ViewOnKeyListenerC4678f(Context context, View view, int i, boolean z8) {
        this.f38925u = context;
        this.f38913G = view;
        this.f38927w = i;
        this.f38928x = z8;
        this.f38915I = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f38926v = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5284R.dimen.abc_config_prefDialogWidth));
        this.f38929y = new Handler();
    }

    @Override // l.InterfaceC4670B
    public final boolean a() {
        ArrayList arrayList = this.f38907A;
        return arrayList.size() > 0 && ((C4677e) arrayList.get(0)).f38904a.f39252S.isShowing();
    }

    @Override // l.x
    public final boolean c() {
        return false;
    }

    @Override // l.x
    public final void d() {
        Iterator it = this.f38907A.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C4677e) it.next()).f38904a.f39255v.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C4681i) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC4670B
    public final void dismiss() {
        ArrayList arrayList = this.f38907A;
        int size = arrayList.size();
        if (size > 0) {
            C4677e[] c4677eArr = (C4677e[]) arrayList.toArray(new C4677e[size]);
            for (int i = size - 1; i >= 0; i--) {
                C4677e c4677e = c4677eArr[i];
                if (c4677e.f38904a.f39252S.isShowing()) {
                    c4677e.f38904a.dismiss();
                }
            }
        }
    }

    @Override // l.x
    public final void e(l lVar, boolean z8) {
        ArrayList arrayList = this.f38907A;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (lVar == ((C4677e) arrayList.get(i)).f38905b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i4 = i + 1;
        if (i4 < arrayList.size()) {
            ((C4677e) arrayList.get(i4)).f38905b.c(false);
        }
        C4677e c4677e = (C4677e) arrayList.remove(i);
        c4677e.f38905b.r(this);
        boolean z9 = this.f38924S;
        G0 g02 = c4677e.f38904a;
        if (z9) {
            D0.b(g02.f39252S, null);
            g02.f39252S.setAnimationStyle(0);
        }
        g02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f38915I = ((C4677e) arrayList.get(size2 - 1)).f38906c;
        } else {
            this.f38915I = this.f38913G.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z8) {
                ((C4677e) arrayList.get(0)).f38905b.c(false);
                return;
            }
            return;
        }
        dismiss();
        w wVar = this.f38921P;
        if (wVar != null) {
            wVar.e(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f38922Q;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f38922Q.removeGlobalOnLayoutListener(this.f38908B);
            }
            this.f38922Q = null;
        }
        this.f38914H.removeOnAttachStateChangeListener(this.f38909C);
        this.f38923R.onDismiss();
    }

    @Override // l.InterfaceC4670B
    public final C4754p0 f() {
        ArrayList arrayList = this.f38907A;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C4677e) arrayList.get(arrayList.size() - 1)).f38904a.f39255v;
    }

    @Override // l.x
    public final void g(w wVar) {
        this.f38921P = wVar;
    }

    @Override // l.x
    public final boolean i(SubMenuC4672D subMenuC4672D) {
        Iterator it = this.f38907A.iterator();
        while (it.hasNext()) {
            C4677e c4677e = (C4677e) it.next();
            if (subMenuC4672D == c4677e.f38905b) {
                c4677e.f38904a.f39255v.requestFocus();
                return true;
            }
        }
        if (!subMenuC4672D.hasVisibleItems()) {
            return false;
        }
        k(subMenuC4672D);
        w wVar = this.f38921P;
        if (wVar != null) {
            wVar.g(subMenuC4672D);
        }
        return true;
    }

    @Override // l.t
    public final void k(l lVar) {
        lVar.b(this, this.f38925u);
        if (a()) {
            u(lVar);
        } else {
            this.f38930z.add(lVar);
        }
    }

    @Override // l.t
    public final void m(View view) {
        if (this.f38913G != view) {
            this.f38913G = view;
            this.f38912F = Gravity.getAbsoluteGravity(this.f38911E, view.getLayoutDirection());
        }
    }

    @Override // l.t
    public final void n(boolean z8) {
        this.f38919N = z8;
    }

    @Override // l.t
    public final void o(int i) {
        if (this.f38911E != i) {
            this.f38911E = i;
            this.f38912F = Gravity.getAbsoluteGravity(i, this.f38913G.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C4677e c4677e;
        ArrayList arrayList = this.f38907A;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c4677e = null;
                break;
            }
            c4677e = (C4677e) arrayList.get(i);
            if (!c4677e.f38904a.f39252S.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c4677e != null) {
            c4677e.f38905b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.t
    public final void p(int i) {
        this.J = true;
        this.f38917L = i;
    }

    @Override // l.t
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f38923R = (u) onDismissListener;
    }

    @Override // l.t
    public final void r(boolean z8) {
        this.f38920O = z8;
    }

    @Override // l.t
    public final void s(int i) {
        this.f38916K = true;
        this.f38918M = i;
    }

    @Override // l.InterfaceC4670B
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f38930z;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((l) it.next());
        }
        arrayList.clear();
        View view = this.f38913G;
        this.f38914H = view;
        if (view != null) {
            boolean z8 = this.f38922Q == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f38922Q = viewTreeObserver;
            if (z8) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f38908B);
            }
            this.f38914H.addOnAttachStateChangeListener(this.f38909C);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0146, code lost:
    
        if (((r8.getWidth() + r11[0]) + r5) > r9.right) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0148, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014b, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0150, code lost:
    
        if ((r11[0] - r5) < 0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(l lVar) {
        int i;
        C4677e c4677e;
        View view;
        int i4;
        int i9;
        int i10;
        int width;
        MenuItem menuItem;
        C4681i c4681i;
        int i11;
        int firstVisiblePosition;
        Context context = this.f38925u;
        LayoutInflater from = LayoutInflater.from(context);
        C4681i c4681i2 = new C4681i(lVar, from, this.f38928x, C5284R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f38919N) {
            c4681i2.f38941c = true;
        } else if (a()) {
            c4681i2.f38941c = t.t(lVar);
        }
        int l9 = t.l(c4681i2, context, this.f38926v);
        G0 g02 = new G0(context, null, this.f38927w);
        g02.f39274V = this.f38910D;
        g02.f39243I = this;
        g02.f39252S.setOnDismissListener(this);
        g02.f39242H = this.f38913G;
        g02.f39239E = this.f38912F;
        g02.f39251R = true;
        g02.f39252S.setFocusable(true);
        g02.f39252S.setInputMethodMode(2);
        g02.l(c4681i2);
        g02.n(l9);
        g02.f39239E = this.f38912F;
        ArrayList arrayList = this.f38907A;
        if (arrayList.size() > 0) {
            c4677e = (C4677e) arrayList.get(arrayList.size() - 1);
            l lVar2 = c4677e.f38905b;
            int size = lVar2.f38967y.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = lVar2.getItem(i12);
                if (menuItem.hasSubMenu() && lVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i12++;
                }
            }
            if (menuItem == null) {
                i = 1;
                view = null;
            } else {
                C4754p0 c4754p0 = c4677e.f38904a.f39255v;
                ListAdapter adapter = c4754p0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i11 = headerViewListAdapter.getHeadersCount();
                    c4681i = (C4681i) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c4681i = (C4681i) adapter;
                    i11 = 0;
                }
                int count = c4681i.getCount();
                i = 1;
                int i13 = 0;
                while (true) {
                    if (i13 >= count) {
                        i13 = -1;
                        break;
                    } else if (menuItem == c4681i.getItem(i13)) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i13 != -1 && (firstVisiblePosition = (i13 + i11) - c4754p0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c4754p0.getChildCount()) {
                    view = c4754p0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i14 = Build.VERSION.SDK_INT;
                C4772z c4772z = g02.f39252S;
                if (i14 <= 28) {
                    Method method = G0.f39273W;
                    if (method != null) {
                        try {
                            method.invoke(c4772z, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    E0.a(c4772z, false);
                }
                D0.a(g02.f39252S, null);
                C4754p0 c4754p02 = ((C4677e) arrayList.get(arrayList.size() - 1)).f38904a.f39255v;
                int[] iArr = new int[2];
                c4754p02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f38914H.getWindowVisibleDisplayFrame(rect);
                if (this.f38915I == i) {
                }
                boolean z8 = i4 == 1;
                this.f38915I = i4;
                if (Build.VERSION.SDK_INT >= 26) {
                    g02.f39242H = view;
                    i10 = 0;
                    i9 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.f38913G.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    view.getLocationOnScreen(iArr3);
                    if ((this.f38912F & 7) == 5) {
                        iArr2[0] = this.f38913G.getWidth() + iArr2[0];
                        iArr3[0] = view.getWidth() + iArr3[0];
                    }
                    i9 = iArr3[0] - iArr2[0];
                    i10 = iArr3[1] - iArr2[1];
                }
                if ((this.f38912F & 5) != 5) {
                    if (z8) {
                        width = i9 + view.getWidth();
                        g02.f39258y = width;
                        g02.f39238D = true;
                        g02.f39237C = true;
                        g02.g(i10);
                    }
                    width = i9 - l9;
                    g02.f39258y = width;
                    g02.f39238D = true;
                    g02.f39237C = true;
                    g02.g(i10);
                } else if (z8) {
                    width = i9 + l9;
                    g02.f39258y = width;
                    g02.f39238D = true;
                    g02.f39237C = true;
                    g02.g(i10);
                } else {
                    l9 = view.getWidth();
                    width = i9 - l9;
                    g02.f39258y = width;
                    g02.f39238D = true;
                    g02.f39237C = true;
                    g02.g(i10);
                }
            } else {
                if (this.J) {
                    g02.f39258y = this.f38917L;
                }
                if (this.f38916K) {
                    g02.g(this.f38918M);
                }
                Rect rect2 = this.f39010n;
                g02.f39250Q = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C4677e(g02, lVar, this.f38915I));
            g02.show();
            C4754p0 c4754p03 = g02.f39255v;
            c4754p03.setOnKeyListener(this);
            if (c4677e == null || !this.f38920O || lVar.f38951F == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(C5284R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c4754p03, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(lVar.f38951F);
            c4754p03.addHeaderView(frameLayout, null, false);
            g02.show();
            return;
        }
        i = 1;
        c4677e = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C4677e(g02, lVar, this.f38915I));
        g02.show();
        C4754p0 c4754p032 = g02.f39255v;
        c4754p032.setOnKeyListener(this);
        if (c4677e == null) {
        }
    }
}
