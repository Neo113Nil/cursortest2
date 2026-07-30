package g;

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
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.aurifaber.valuta.rotatus.signum.modulus.R;
import h.L;
import h.M;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import w.x;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0135g extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public o f1945A;

    /* renamed from: B, reason: collision with root package name */
    public ViewTreeObserver f1946B;

    /* renamed from: C, reason: collision with root package name */
    public m f1947C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1948D;

    /* renamed from: f, reason: collision with root package name */
    public final Context f1949f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1950g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1951h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1952i;

    /* renamed from: j, reason: collision with root package name */
    public final Handler f1953j;

    /* renamed from: m, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0131c f1956m;

    /* renamed from: n, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0132d f1957n;
    public View r;

    /* renamed from: s, reason: collision with root package name */
    public View f1961s;

    /* renamed from: t, reason: collision with root package name */
    public int f1962t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1963u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1964v;

    /* renamed from: w, reason: collision with root package name */
    public int f1965w;

    /* renamed from: x, reason: collision with root package name */
    public int f1966x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1968z;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1954k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1955l = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final A.j f1958o = new A.j(19, this);

    /* renamed from: p, reason: collision with root package name */
    public int f1959p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f1960q = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1967y = false;

    public ViewOnKeyListenerC0135g(Context context, View view, int i2, boolean z2) {
        this.f1956m = new ViewTreeObserverOnGlobalLayoutListenerC0131c(this, r0);
        this.f1957n = new ViewOnAttachStateChangeListenerC0132d(this, r0);
        this.f1949f = context;
        this.r = view;
        this.f1951h = i2;
        this.f1952i = z2;
        Field field = x.f3075a;
        this.f1962t = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f1950g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f1953j = new Handler();
    }

    @Override // g.p
    public final void a(j jVar, boolean z2) {
        ArrayList arrayList = this.f1955l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (jVar == ((C0134f) arrayList.get(i2)).f1943b) {
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
            ((C0134f) arrayList.get(i3)).f1943b.c(false);
        }
        C0134f c0134f = (C0134f) arrayList.remove(i2);
        CopyOnWriteArrayList copyOnWriteArrayList = c0134f.f1943b.r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z3 = this.f1948D;
        M m2 = c0134f.f1942a;
        if (z3) {
            m2.f2124z.setExitTransition(null);
            m2.f2124z.setAnimationStyle(0);
        }
        m2.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f1962t = ((C0134f) arrayList.get(size2 - 1)).f1944c;
        } else {
            View view = this.r;
            Field field = x.f3075a;
            this.f1962t = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C0134f) arrayList.get(0)).f1943b.c(false);
                return;
            }
            return;
        }
        dismiss();
        o oVar = this.f1945A;
        if (oVar != null) {
            oVar.a(jVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1946B;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1946B.removeGlobalOnLayoutListener(this.f1956m);
            }
            this.f1946B = null;
        }
        this.f1961s.removeOnAttachStateChangeListener(this.f1957n);
        this.f1947C.onDismiss();
    }

    @Override // g.p
    public final void b() {
        Iterator it = this.f1955l.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0134f) it.next()).f1942a.f2106g.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0136h) adapter).notifyDataSetChanged();
        }
    }

    @Override // g.r
    public final boolean c() {
        ArrayList arrayList = this.f1955l;
        return arrayList.size() > 0 && ((C0134f) arrayList.get(0)).f1942a.f2124z.isShowing();
    }

    @Override // g.p
    public final boolean d(t tVar) {
        Iterator it = this.f1955l.iterator();
        while (it.hasNext()) {
            C0134f c0134f = (C0134f) it.next();
            if (tVar == c0134f.f1943b) {
                c0134f.f1942a.f2106g.requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        l(tVar);
        o oVar = this.f1945A;
        if (oVar != null) {
            oVar.m(tVar);
        }
        return true;
    }

    @Override // g.r
    public final void dismiss() {
        ArrayList arrayList = this.f1955l;
        int size = arrayList.size();
        if (size > 0) {
            C0134f[] c0134fArr = (C0134f[]) arrayList.toArray(new C0134f[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0134f c0134f = c0134fArr[i2];
                if (c0134f.f1942a.f2124z.isShowing()) {
                    c0134f.f1942a.dismiss();
                }
            }
        }
    }

    @Override // g.r
    public final ListView e() {
        ArrayList arrayList = this.f1955l;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0134f) arrayList.get(arrayList.size() - 1)).f1942a.f2106g;
    }

    @Override // g.p
    public final void f(o oVar) {
        this.f1945A = oVar;
    }

    @Override // g.r
    public final void g() {
        if (c()) {
            return;
        }
        ArrayList arrayList = this.f1954k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((j) it.next());
        }
        arrayList.clear();
        View view = this.r;
        this.f1961s = view;
        if (view != null) {
            boolean z2 = this.f1946B == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1946B = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1956m);
            }
            this.f1961s.addOnAttachStateChangeListener(this.f1957n);
        }
    }

    @Override // g.p
    public final boolean h() {
        return false;
    }

    @Override // g.l
    public final void l(j jVar) {
        jVar.b(this, this.f1949f);
        if (c()) {
            v(jVar);
        } else {
            this.f1954k.add(jVar);
        }
    }

    @Override // g.l
    public final void n(View view) {
        if (this.r != view) {
            this.r = view;
            int i2 = this.f1959p;
            Field field = x.f3075a;
            this.f1960q = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // g.l
    public final void o(boolean z2) {
        this.f1967y = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0134f c0134f;
        ArrayList arrayList = this.f1955l;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0134f = null;
                break;
            }
            c0134f = (C0134f) arrayList.get(i2);
            if (!c0134f.f1942a.f2124z.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0134f != null) {
            c0134f.f1943b.c(false);
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

    @Override // g.l
    public final void p(int i2) {
        if (this.f1959p != i2) {
            this.f1959p = i2;
            View view = this.r;
            Field field = x.f3075a;
            this.f1960q = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // g.l
    public final void q(int i2) {
        this.f1963u = true;
        this.f1965w = i2;
    }

    @Override // g.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f1947C = (m) onDismissListener;
    }

    @Override // g.l
    public final void s(boolean z2) {
        this.f1968z = z2;
    }

    @Override // g.l
    public final void t(int i2) {
        this.f1964v = true;
        this.f1966x = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(j jVar) {
        C0134f c0134f;
        View view;
        int i2;
        char c2;
        int i3;
        int i4;
        int width;
        MenuItem menuItem;
        C0136h c0136h;
        int i5;
        int firstVisiblePosition;
        Context context = this.f1949f;
        LayoutInflater from = LayoutInflater.from(context);
        C0136h c0136h2 = new C0136h(jVar, from, this.f1952i, R.layout.abc_cascading_menu_item_layout);
        if (!c() && this.f1967y) {
            c0136h2.f1971g = true;
        } else if (c()) {
            c0136h2.f1971g = l.u(jVar);
        }
        int m2 = l.m(c0136h2, context, this.f1950g);
        M m3 = new M(context, this.f1951h);
        m3.f2129C = this.f1958o;
        m3.f2116q = this;
        m3.f2124z.setOnDismissListener(this);
        m3.f2115p = this.r;
        m3.f2113n = this.f1960q;
        m3.f2123y = true;
        m3.f2124z.setFocusable(true);
        m3.f2124z.setInputMethodMode(2);
        m3.a(c0136h2);
        Drawable background = m3.f2124z.getBackground();
        if (background != null) {
            Rect rect = m3.f2121w;
            background.getPadding(rect);
            m3.f2107h = rect.left + rect.right + m2;
        } else {
            m3.f2107h = m2;
        }
        m3.f2113n = this.f1960q;
        ArrayList arrayList = this.f1955l;
        if (arrayList.size() > 0) {
            c0134f = (C0134f) arrayList.get(arrayList.size() - 1);
            j jVar2 = c0134f.f1943b;
            int size = jVar2.f1981f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = jVar2.getItem(i6);
                if (menuItem.hasSubMenu() && jVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (menuItem != null) {
                L l2 = c0134f.f1942a.f2106g;
                ListAdapter adapter = l2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i5 = headerViewListAdapter.getHeadersCount();
                    c0136h = (C0136h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0136h = (C0136h) adapter;
                    i5 = 0;
                }
                int count = c0136h.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (menuItem == c0136h.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 != -1 && (firstVisiblePosition = (i7 + i5) - l2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < l2.getChildCount()) {
                    view = l2.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            c0134f = null;
            view = null;
        }
        if (view != null) {
            int i8 = Build.VERSION.SDK_INT;
            h.r rVar = m3.f2124z;
            if (i8 <= 28) {
                Method method = M.f2128D;
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
            m3.f2124z.setEnterTransition(null);
            L l3 = ((C0134f) arrayList.get(arrayList.size() - 1)).f1942a.f2106g;
            int[] iArr = new int[2];
            l3.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f1961s.getWindowVisibleDisplayFrame(rect2);
            if (this.f1962t == 1) {
                if (l3.getWidth() + iArr[0] + m2 > rect2.right) {
                    i2 = 0;
                    boolean z2 = i2 != 1;
                    this.f1962t = i2;
                    if (Build.VERSION.SDK_INT < 26) {
                        m3.f2115p = view;
                        i4 = 0;
                        i3 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.r.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.f1960q & 7) == 5) {
                            c2 = 0;
                            iArr2[0] = this.r.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        } else {
                            c2 = 0;
                        }
                        i3 = iArr3[c2] - iArr2[c2];
                        i4 = iArr3[1] - iArr2[1];
                    }
                    if ((this.f1960q & 5) == 5) {
                        if (z2) {
                            width = i3 + view.getWidth();
                            m3.f2108i = width;
                            m3.f2112m = true;
                            m3.f2111l = true;
                            m3.f2109j = i4;
                            m3.f2110k = true;
                        }
                        width = i3 - m2;
                        m3.f2108i = width;
                        m3.f2112m = true;
                        m3.f2111l = true;
                        m3.f2109j = i4;
                        m3.f2110k = true;
                    } else if (z2) {
                        width = i3 + m2;
                        m3.f2108i = width;
                        m3.f2112m = true;
                        m3.f2111l = true;
                        m3.f2109j = i4;
                        m3.f2110k = true;
                    } else {
                        m2 = view.getWidth();
                        width = i3 - m2;
                        m3.f2108i = width;
                        m3.f2112m = true;
                        m3.f2111l = true;
                        m3.f2109j = i4;
                        m3.f2110k = true;
                    }
                }
                i2 = 1;
                if (i2 != 1) {
                }
                this.f1962t = i2;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.f1960q & 5) == 5) {
                }
            } else {
                if (iArr[0] - m2 >= 0) {
                    i2 = 0;
                    if (i2 != 1) {
                    }
                    this.f1962t = i2;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.f1960q & 5) == 5) {
                    }
                }
                i2 = 1;
                if (i2 != 1) {
                }
                this.f1962t = i2;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.f1960q & 5) == 5) {
                }
            }
        } else {
            if (this.f1963u) {
                m3.f2108i = this.f1965w;
            }
            if (this.f1964v) {
                m3.f2109j = this.f1966x;
                m3.f2110k = true;
            }
            Rect rect3 = this.f2022e;
            m3.f2122x = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new C0134f(m3, jVar, this.f1962t));
        m3.g();
        L l4 = m3.f2106g;
        l4.setOnKeyListener(this);
        if (c0134f == null && this.f1968z && jVar.f1987l != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) l4, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(jVar.f1987l);
            l4.addHeaderView(frameLayout, null, false);
            m3.g();
        }
    }
}
