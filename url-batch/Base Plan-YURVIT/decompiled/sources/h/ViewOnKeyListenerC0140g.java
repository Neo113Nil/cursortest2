package h;

import B0.E;
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
import com.crane.slab.beam.R;
import i.M;
import i.N;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import y.x;

/* renamed from: h.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0140g extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public o f1978A;

    /* renamed from: B, reason: collision with root package name */
    public ViewTreeObserver f1979B;

    /* renamed from: C, reason: collision with root package name */
    public PopupWindow.OnDismissListener f1980C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1981D;

    /* renamed from: f, reason: collision with root package name */
    public final Context f1982f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1983g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1984h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1985i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f1986j;

    /* renamed from: m, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0136c f1989m;

    /* renamed from: n, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0137d f1990n;

    /* renamed from: r, reason: collision with root package name */
    public View f1994r;

    /* renamed from: s, reason: collision with root package name */
    public View f1995s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1996u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1997v;

    /* renamed from: w, reason: collision with root package name */
    public int f1998w;

    /* renamed from: x, reason: collision with root package name */
    public int f1999x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2001z;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1987k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1988l = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final E f1991o = new E(17, this);

    /* renamed from: p, reason: collision with root package name */
    public int f1992p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f1993q = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2000y = false;

    public ViewOnKeyListenerC0140g(Context context, View view, int i2, boolean z2) {
        this.f1989m = new ViewTreeObserverOnGlobalLayoutListenerC0136c(this, r1);
        this.f1990n = new ViewOnAttachStateChangeListenerC0137d(this, r1);
        this.f1982f = context;
        this.f1994r = view;
        this.f1984h = i2;
        this.f1985i = z2;
        Field field = x.f3160a;
        this.t = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f1983g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1986j = new Handler();
    }

    @Override // h.p
    public final void a(MenuC0143j menuC0143j, boolean z2) {
        ArrayList arrayList = this.f1988l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuC0143j == ((C0139f) arrayList.get(i2)).f1976b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((C0139f) arrayList.get(i3)).f1976b.c(false);
        }
        C0139f c0139f = (C0139f) arrayList.remove(i2);
        MenuC0143j menuC0143j2 = c0139f.f1976b;
        N n2 = c0139f.f1975a;
        CopyOnWriteArrayList copyOnWriteArrayList = menuC0143j2.f2026r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.f1981D) {
            n2.f2155z.setExitTransition(null);
            n2.f2155z.setAnimationStyle(0);
        }
        n2.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.t = ((C0139f) arrayList.get(size2 - 1)).f1977c;
        } else {
            View view = this.f1994r;
            Field field = x.f3160a;
            this.t = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0139f) arrayList.get(0)).f1976b.c(false);
                return;
            }
            return;
        }
        dismiss();
        o oVar = this.f1978A;
        if (oVar != null) {
            oVar.a(menuC0143j, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1979B;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1979B.removeGlobalOnLayoutListener(this.f1989m);
            }
            this.f1979B = null;
        }
        this.f1995s.removeOnAttachStateChangeListener(this.f1990n);
        this.f1980C.onDismiss();
    }

    @Override // h.p
    public final void b(o oVar) {
        this.f1978A = oVar;
    }

    @Override // h.r
    public final void c() {
        if (j()) {
            return;
        }
        ArrayList arrayList = this.f1987k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            u((MenuC0143j) obj);
        }
        arrayList.clear();
        View view = this.f1994r;
        this.f1995s = view;
        if (view != null) {
            boolean z2 = this.f1979B == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1979B = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1989m);
            }
            this.f1995s.addOnAttachStateChangeListener(this.f1990n);
        }
    }

    @Override // h.p
    public final void d() {
        ArrayList arrayList = this.f1988l;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ListAdapter adapter = ((C0139f) obj).f1975a.f2137g.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0141h) adapter).notifyDataSetChanged();
        }
    }

    @Override // h.r
    public final void dismiss() {
        ArrayList arrayList = this.f1988l;
        int size = arrayList.size();
        if (size > 0) {
            C0139f[] c0139fArr = (C0139f[]) arrayList.toArray(new C0139f[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0139f c0139f = c0139fArr[i2];
                if (c0139f.f1975a.f2155z.isShowing()) {
                    c0139f.f1975a.dismiss();
                }
            }
        }
    }

    @Override // h.r
    public final ListView e() {
        ArrayList arrayList = this.f1988l;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0139f) arrayList.get(arrayList.size() - 1)).f1975a.f2137g;
    }

    @Override // h.p
    public final boolean g() {
        return false;
    }

    @Override // h.r
    public final boolean j() {
        ArrayList arrayList = this.f1988l;
        return arrayList.size() > 0 && ((C0139f) arrayList.get(0)).f1975a.f2155z.isShowing();
    }

    @Override // h.p
    public final boolean k(t tVar) {
        ArrayList arrayList = this.f1988l;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            C0139f c0139f = (C0139f) obj;
            if (tVar == c0139f.f1976b) {
                c0139f.f1975a.f2137g.requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        l(tVar);
        o oVar = this.f1978A;
        if (oVar != null) {
            oVar.n(tVar);
        }
        return true;
    }

    @Override // h.l
    public final void l(MenuC0143j menuC0143j) {
        menuC0143j.b(this, this.f1982f);
        if (j()) {
            u(menuC0143j);
        } else {
            this.f1987k.add(menuC0143j);
        }
    }

    @Override // h.l
    public final void n(View view) {
        if (this.f1994r != view) {
            this.f1994r = view;
            int i2 = this.f1992p;
            Field field = x.f3160a;
            this.f1993q = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // h.l
    public final void o(boolean z2) {
        this.f2000y = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0139f c0139f;
        ArrayList arrayList = this.f1988l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0139f = null;
                break;
            }
            c0139f = (C0139f) arrayList.get(i2);
            if (!c0139f.f1975a.f2155z.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0139f != null) {
            c0139f.f1976b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // h.l
    public final void p(int i2) {
        if (this.f1992p != i2) {
            this.f1992p = i2;
            View view = this.f1994r;
            Field field = x.f3160a;
            this.f1993q = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // h.l
    public final void q(int i2) {
        this.f1996u = true;
        this.f1998w = i2;
    }

    @Override // h.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f1980C = onDismissListener;
    }

    @Override // h.l
    public final void s(boolean z2) {
        this.f2001z = z2;
    }

    @Override // h.l
    public final void t(int i2) {
        this.f1997v = true;
        this.f1999x = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x017b, code lost:
    
        if (((r7.getWidth() + r11[r16]) + r5) > r9.right) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x017d, code lost:
    
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0181, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0186, code lost:
    
        if ((r11[r16] - r5) < 0) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(MenuC0143j menuC0143j) {
        boolean z2;
        int i2;
        int i3;
        C0139f c0139f;
        View view;
        int i4;
        int i5;
        int i6;
        int width;
        MenuItem menuItem;
        C0141h c0141h;
        int i7;
        int firstVisiblePosition;
        Context context = this.f1982f;
        LayoutInflater from = LayoutInflater.from(context);
        C0141h c0141h2 = new C0141h(menuC0143j, from, this.f1985i, R.layout.abc_cascading_menu_item_layout);
        if (!j() && this.f2000y) {
            c0141h2.f2004g = true;
        } else if (j()) {
            int size = menuC0143j.f2014f.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    z2 = false;
                    break;
                }
                MenuItem item = menuC0143j.getItem(i8);
                if (item.isVisible() && item.getIcon() != null) {
                    z2 = true;
                    break;
                }
                i8++;
            }
            c0141h2.f2004g = z2;
        }
        int m2 = l.m(c0141h2, context, this.f1983g);
        N n2 = new N(context, this.f1984h);
        n2.f2160C = this.f1991o;
        n2.f2147q = this;
        n2.f2155z.setOnDismissListener(this);
        n2.f2146p = this.f1994r;
        n2.f2144n = this.f1993q;
        n2.f2154y = true;
        n2.f2155z.setFocusable(true);
        n2.f2155z.setInputMethodMode(2);
        n2.a(c0141h2);
        Drawable background = n2.f2155z.getBackground();
        if (background != null) {
            Rect rect = n2.f2152w;
            background.getPadding(rect);
            n2.f2138h = rect.left + rect.right + m2;
        } else {
            n2.f2138h = m2;
        }
        n2.f2144n = this.f1993q;
        ArrayList arrayList = this.f1988l;
        if (arrayList.size() > 0) {
            c0139f = (C0139f) arrayList.get(arrayList.size() - 1);
            MenuC0143j menuC0143j2 = c0139f.f1976b;
            int size2 = menuC0143j2.f2014f.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC0143j2.getItem(i9);
                if (menuItem.hasSubMenu() && menuC0143j == menuItem.getSubMenu()) {
                    break;
                } else {
                    i9++;
                }
            }
            if (menuItem == null) {
                i2 = 1;
                view = null;
                i3 = 0;
            } else {
                M m3 = c0139f.f1975a.f2137g;
                ListAdapter adapter = m3.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i7 = headerViewListAdapter.getHeadersCount();
                    c0141h = (C0141h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0141h = (C0141h) adapter;
                    i7 = 0;
                }
                int count = c0141h.getCount();
                i2 = 1;
                int i10 = 0;
                i3 = 0;
                while (true) {
                    if (i10 >= count) {
                        i10 = -1;
                        break;
                    } else if (menuItem == c0141h.getItem(i10)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                view = (i10 != -1 && (firstVisiblePosition = (i10 + i7) - m3.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m3.getChildCount()) ? m3.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i2 = 1;
            i3 = 0;
            c0139f = null;
            view = null;
        }
        if (view != null) {
            int i11 = Build.VERSION.SDK_INT;
            i.r rVar = n2.f2155z;
            if (i11 <= 28) {
                Method method = N.f2159D;
                if (method != null) {
                    try {
                        method.invoke(rVar, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                rVar.setTouchModal(false);
            }
            n2.f2155z.setEnterTransition(null);
            M m4 = ((C0139f) arrayList.get(arrayList.size() - 1)).f1975a.f2137g;
            int[] iArr = new int[2];
            m4.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f1995s.getWindowVisibleDisplayFrame(rect2);
            if (this.t == i2) {
            }
            int i12 = i4 == 1 ? 1 : i3;
            this.t = i4;
            if (Build.VERSION.SDK_INT >= 26) {
                n2.f2146p = view;
                i6 = i3;
                i5 = i6;
            } else {
                int[] iArr2 = new int[2];
                this.f1994r.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.f1993q & 7) == 5) {
                    iArr2[i3] = this.f1994r.getWidth() + iArr2[i3];
                    iArr3[i3] = view.getWidth() + iArr3[i3];
                }
                i5 = iArr3[i3] - iArr2[i3];
                i6 = iArr3[1] - iArr2[1];
            }
            if ((this.f1993q & 5) != 5) {
                if (i12 != 0) {
                    width = i5 + view.getWidth();
                    n2.f2139i = width;
                    n2.f2143m = true;
                    n2.f2142l = true;
                    n2.f2140j = i6;
                    n2.f2141k = true;
                }
                width = i5 - m2;
                n2.f2139i = width;
                n2.f2143m = true;
                n2.f2142l = true;
                n2.f2140j = i6;
                n2.f2141k = true;
            } else if (i12 != 0) {
                width = i5 + m2;
                n2.f2139i = width;
                n2.f2143m = true;
                n2.f2142l = true;
                n2.f2140j = i6;
                n2.f2141k = true;
            } else {
                m2 = view.getWidth();
                width = i5 - m2;
                n2.f2139i = width;
                n2.f2143m = true;
                n2.f2142l = true;
                n2.f2140j = i6;
                n2.f2141k = true;
            }
        } else {
            if (this.f1996u) {
                n2.f2139i = this.f1998w;
            }
            if (this.f1997v) {
                n2.f2140j = this.f1999x;
                n2.f2141k = true;
            }
            Rect rect3 = this.f2055e;
            n2.f2153x = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new C0139f(n2, menuC0143j, this.t));
        n2.c();
        M m5 = n2.f2137g;
        m5.setOnKeyListener(this);
        if (c0139f == null && this.f2001z && menuC0143j.f2020l != null) {
            boolean z3 = i3;
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, m5, z3);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(z3);
            textView.setText(menuC0143j.f2020l);
            m5.addHeaderView(frameLayout, null, z3);
            n2.c();
        }
    }
}
