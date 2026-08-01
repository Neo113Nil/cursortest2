package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
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
import androidx.fragment.app.p0;
import com.oriondriftchasers.arordrft.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.h2;
import l.i2;
import l.k2;
import l.s1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public x B;
    public ViewTreeObserver C;
    public PopupWindow.OnDismissListener D;
    public boolean E;

    /* renamed from: g, reason: collision with root package name */
    public final Context f2028g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2029h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2030j;

    /* renamed from: k, reason: collision with root package name */
    public final Handler f2031k;

    /* renamed from: s, reason: collision with root package name */
    public View f2039s;

    /* renamed from: t, reason: collision with root package name */
    public View f2040t;

    /* renamed from: u, reason: collision with root package name */
    public int f2041u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2042v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2043w;

    /* renamed from: x, reason: collision with root package name */
    public int f2044x;

    /* renamed from: y, reason: collision with root package name */
    public int f2045y;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2032l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2033m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final d f2034n = new d(0, this);

    /* renamed from: o, reason: collision with root package name */
    public final p0 f2035o = new p0(1, this);

    /* renamed from: p, reason: collision with root package name */
    public final a0.a f2036p = new a0.a(14, this);

    /* renamed from: q, reason: collision with root package name */
    public int f2037q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2038r = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2046z = false;

    public g(Context context, View view, int i, boolean z3) {
        this.f2028g = context;
        this.f2039s = view;
        this.i = i;
        this.f2030j = z3;
        this.f2041u = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2029h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2031k = new Handler();
    }

    @Override // k.y
    public final void a(m mVar, boolean z3) {
        ArrayList arrayList = this.f2033m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((f) arrayList.get(i)).f2026b) {
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
            ((f) arrayList.get(i4)).f2026b.c(false);
        }
        f fVar = (f) arrayList.remove(i);
        m mVar2 = fVar.f2026b;
        k2 k2Var = fVar.f2025a;
        l.b0 b0Var = k2Var.E;
        mVar2.r(this);
        if (this.E) {
            h2.b(b0Var, null);
            b0Var.setAnimationStyle(0);
        }
        k2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2041u = ((f) arrayList.get(size2 - 1)).f2027c;
        } else {
            this.f2041u = this.f2039s.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z3) {
                ((f) arrayList.get(0)).f2026b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.B;
        if (xVar != null) {
            xVar.a(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.C;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.C.removeGlobalOnLayoutListener(this.f2034n);
            }
            this.C = null;
        }
        this.f2040t.removeOnAttachStateChangeListener(this.f2035o);
        this.D.onDismiss();
    }

    @Override // k.c0
    public final boolean b() {
        ArrayList arrayList = this.f2033m;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f2025a.E.isShowing();
    }

    @Override // k.y
    public final boolean d(e0 e0Var) {
        ArrayList arrayList = this.f2033m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            f fVar = (f) obj;
            if (e0Var == fVar.f2026b) {
                fVar.f2025a.f2286h.requestFocus();
                return true;
            }
        }
        if (!e0Var.hasVisibleItems()) {
            return false;
        }
        n(e0Var);
        x xVar = this.B;
        if (xVar != null) {
            xVar.d(e0Var);
        }
        return true;
    }

    @Override // k.c0
    public final void dismiss() {
        ArrayList arrayList = this.f2033m;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i = size - 1; i >= 0; i--) {
                f fVar = fVarArr[i];
                if (fVar.f2025a.E.isShowing()) {
                    fVar.f2025a.dismiss();
                }
            }
        }
    }

    @Override // k.c0
    public final void f() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f2032l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w((m) obj);
        }
        arrayList.clear();
        View view = this.f2039s;
        this.f2040t = view;
        if (view != null) {
            boolean z3 = this.C == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.C = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2034n);
            }
            this.f2040t.addOnAttachStateChangeListener(this.f2035o);
        }
    }

    @Override // k.y
    public final boolean h() {
        return false;
    }

    @Override // k.y
    public final Parcelable i() {
        return null;
    }

    @Override // k.c0
    public final s1 k() {
        ArrayList arrayList = this.f2033m;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f2025a.f2286h;
    }

    @Override // k.y
    public final void l(x xVar) {
        this.B = xVar;
    }

    @Override // k.y
    public final void m(boolean z3) {
        ArrayList arrayList = this.f2033m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((f) obj).f2025a.f2286h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.u
    public final void n(m mVar) {
        mVar.b(this, this.f2028g);
        if (b()) {
            w(mVar);
        } else {
            this.f2032l.add(mVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f2033m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i);
            if (!fVar.f2025a.E.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (fVar != null) {
            fVar.f2026b.c(false);
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

    @Override // k.u
    public final void p(View view) {
        if (this.f2039s != view) {
            this.f2039s = view;
            this.f2038r = Gravity.getAbsoluteGravity(this.f2037q, view.getLayoutDirection());
        }
    }

    @Override // k.u
    public final void q(boolean z3) {
        this.f2046z = z3;
    }

    @Override // k.u
    public final void r(int i) {
        if (this.f2037q != i) {
            this.f2037q = i;
            this.f2038r = Gravity.getAbsoluteGravity(i, this.f2039s.getLayoutDirection());
        }
    }

    @Override // k.u
    public final void s(int i) {
        this.f2042v = true;
        this.f2044x = i;
    }

    @Override // k.u
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override // k.u
    public final void u(boolean z3) {
        this.A = z3;
    }

    @Override // k.u
    public final void v(int i) {
        this.f2043w = true;
        this.f2045y = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0161, code lost:
    
        if (((r9.getWidth() + r11[0]) + r5) > r10.right) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0163, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0166, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016b, code lost:
    
        if ((r11[0] - r5) < 0) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(m mVar) {
        boolean z3;
        int i;
        f fVar;
        View view;
        int i4;
        int i5;
        int i6;
        int width;
        MenuItem menuItem;
        j jVar;
        int i7;
        int firstVisiblePosition;
        Context context = this.f2028g;
        LayoutInflater from = LayoutInflater.from(context);
        j jVar2 = new j(mVar, from, this.f2030j, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.f2046z) {
            jVar2.f2056c = true;
        } else if (b()) {
            int size = mVar.f2064f.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    z3 = false;
                    break;
                }
                MenuItem item = mVar.getItem(i8);
                if (item.isVisible() && item.getIcon() != null) {
                    z3 = true;
                    break;
                }
                i8++;
            }
            jVar2.f2056c = z3;
        }
        int o4 = u.o(jVar2, context, this.f2029h);
        k2 k2Var = new k2(context, null, this.i, 0);
        k2Var.H = this.f2036p;
        k2Var.f2298u = this;
        k2Var.E.setOnDismissListener(this);
        k2Var.f2297t = this.f2039s;
        k2Var.f2294q = this.f2038r;
        k2Var.D = true;
        k2Var.E.setFocusable(true);
        k2Var.E.setInputMethodMode(2);
        k2Var.o(jVar2);
        k2Var.r(o4);
        k2Var.f2294q = this.f2038r;
        ArrayList arrayList = this.f2033m;
        if (arrayList.size() > 0) {
            fVar = (f) arrayList.get(arrayList.size() - 1);
            m mVar2 = fVar.f2026b;
            int size2 = mVar2.f2064f.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = mVar2.getItem(i9);
                if (menuItem.hasSubMenu() && mVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i9++;
                }
            }
            if (menuItem == null) {
                i = 1;
                view = null;
            } else {
                s1 s1Var = fVar.f2025a.f2286h;
                ListAdapter adapter = s1Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i7 = headerViewListAdapter.getHeadersCount();
                    jVar = (j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    jVar = (j) adapter;
                    i7 = 0;
                }
                int count = jVar.getCount();
                i = 1;
                int i10 = 0;
                while (true) {
                    if (i10 >= count) {
                        i10 = -1;
                        break;
                    } else if (menuItem == jVar.getItem(i10)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 != -1 && (firstVisiblePosition = (i10 + i7) - s1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < s1Var.getChildCount()) {
                    view = s1Var.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i11 = Build.VERSION.SDK_INT;
                l.b0 b0Var = k2Var.E;
                if (i11 <= 28) {
                    Method method = k2.I;
                    if (method != null) {
                        try {
                            method.invoke(b0Var, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    i2.a(b0Var, false);
                }
                h2.a(k2Var.E, null);
                s1 s1Var2 = ((f) arrayList.get(arrayList.size() - 1)).f2025a.f2286h;
                int[] iArr = new int[2];
                s1Var2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f2040t.getWindowVisibleDisplayFrame(rect);
                if (this.f2041u == i) {
                }
                boolean z4 = i4 == 1;
                this.f2041u = i4;
                if (Build.VERSION.SDK_INT >= 26) {
                    k2Var.f2297t = view;
                    i6 = 0;
                    i5 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.f2039s.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    view.getLocationOnScreen(iArr3);
                    if ((this.f2038r & 7) == 5) {
                        iArr2[0] = this.f2039s.getWidth() + iArr2[0];
                        iArr3[0] = view.getWidth() + iArr3[0];
                    }
                    i5 = iArr3[0] - iArr2[0];
                    i6 = iArr3[1] - iArr2[1];
                }
                if ((this.f2038r & 5) != 5) {
                    if (z4) {
                        width = i5 + view.getWidth();
                        k2Var.f2288k = width;
                        k2Var.f2293p = true;
                        k2Var.f2292o = true;
                        k2Var.n(i6);
                    }
                    width = i5 - o4;
                    k2Var.f2288k = width;
                    k2Var.f2293p = true;
                    k2Var.f2292o = true;
                    k2Var.n(i6);
                } else if (z4) {
                    width = i5 + o4;
                    k2Var.f2288k = width;
                    k2Var.f2293p = true;
                    k2Var.f2292o = true;
                    k2Var.n(i6);
                } else {
                    o4 = view.getWidth();
                    width = i5 - o4;
                    k2Var.f2288k = width;
                    k2Var.f2293p = true;
                    k2Var.f2292o = true;
                    k2Var.n(i6);
                }
            } else {
                if (this.f2042v) {
                    k2Var.f2288k = this.f2044x;
                }
                if (this.f2043w) {
                    k2Var.n(this.f2045y);
                }
                Rect rect2 = this.f2117f;
                k2Var.C = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new f(k2Var, mVar, this.f2041u));
            k2Var.f();
            s1 s1Var3 = k2Var.f2286h;
            s1Var3.setOnKeyListener(this);
            if (fVar == null || !this.A || mVar.f2070m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) s1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(mVar.f2070m);
            s1Var3.addHeaderView(frameLayout, null, false);
            k2Var.f();
            return;
        }
        i = 1;
        fVar = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new f(k2Var, mVar, this.f2041u));
        k2Var.f();
        s1 s1Var32 = k2Var.f2286h;
        s1Var32.setOnKeyListener(this);
        if (fVar == null) {
        }
    }

    @Override // k.y
    public final void j(Parcelable parcelable) {
    }
}
