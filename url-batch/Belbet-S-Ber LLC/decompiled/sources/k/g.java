package k;

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
import androidx.fragment.app.p0;
import com.gdmhkmf.belbet.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import l.e2;
import l.f2;
import l.h2;
import l.p1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean B;
    public x C;
    public ViewTreeObserver D;
    public PopupWindow.OnDismissListener E;
    public boolean F;

    /* renamed from: g, reason: collision with root package name */
    public final Context f2181g;
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2182j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2183k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f2184l;

    /* renamed from: t, reason: collision with root package name */
    public View f2192t;

    /* renamed from: u, reason: collision with root package name */
    public View f2193u;

    /* renamed from: v, reason: collision with root package name */
    public int f2194v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2195w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2196x;

    /* renamed from: y, reason: collision with root package name */
    public int f2197y;

    /* renamed from: z, reason: collision with root package name */
    public int f2198z;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2185m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2186n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final d f2187o = new d(0, this);

    /* renamed from: p, reason: collision with root package name */
    public final p0 f2188p = new p0(1, this);

    /* renamed from: q, reason: collision with root package name */
    public final a0.a f2189q = new a0.a(18, this);

    /* renamed from: r, reason: collision with root package name */
    public int f2190r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f2191s = 0;
    public boolean A = false;

    public g(Context context, View view, int i, int i4, boolean z4) {
        this.f2181g = context;
        this.f2192t = view;
        this.i = i;
        this.f2182j = i4;
        this.f2183k = z4;
        this.f2194v = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2184l = new Handler();
    }

    @Override // k.y
    public final void a(m mVar, boolean z4) {
        ArrayList arrayList = this.f2186n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((f) arrayList.get(i)).f2179b) {
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
            ((f) arrayList.get(i4)).f2179b.c(false);
        }
        f fVar = (f) arrayList.remove(i);
        m mVar2 = fVar.f2179b;
        h2 h2Var = fVar.f2178a;
        l.y yVar = h2Var.E;
        mVar2.r(this);
        if (this.F) {
            e2.b(yVar, null);
            yVar.setAnimationStyle(0);
        }
        h2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2194v = ((f) arrayList.get(size2 - 1)).f2180c;
        } else {
            this.f2194v = this.f2192t.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z4) {
                ((f) arrayList.get(0)).f2179b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.C;
        if (xVar != null) {
            xVar.a(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.D;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.D.removeGlobalOnLayoutListener(this.f2187o);
            }
            this.D = null;
        }
        this.f2193u.removeOnAttachStateChangeListener(this.f2188p);
        this.E.onDismiss();
    }

    @Override // k.c0
    public final boolean b() {
        ArrayList arrayList = this.f2186n;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f2178a.E.isShowing();
    }

    @Override // k.y
    public final boolean d(e0 e0Var) {
        ArrayList arrayList = this.f2186n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            f fVar = (f) obj;
            if (e0Var == fVar.f2179b) {
                fVar.f2178a.h.requestFocus();
                return true;
            }
        }
        if (!e0Var.hasVisibleItems()) {
            return false;
        }
        l(e0Var);
        x xVar = this.C;
        if (xVar != null) {
            xVar.n(e0Var);
        }
        return true;
    }

    @Override // k.c0
    public final void dismiss() {
        ArrayList arrayList = this.f2186n;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i = size - 1; i >= 0; i--) {
                f fVar = fVarArr[i];
                if (fVar.f2178a.E.isShowing()) {
                    fVar.f2178a.dismiss();
                }
            }
        }
    }

    @Override // k.c0
    public final void e() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f2185m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((m) obj);
        }
        arrayList.clear();
        View view = this.f2192t;
        this.f2193u = view;
        if (view != null) {
            boolean z4 = this.D == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.D = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2187o);
            }
            this.f2193u.addOnAttachStateChangeListener(this.f2188p);
        }
    }

    @Override // k.y
    public final void g() {
        ArrayList arrayList = this.f2186n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((f) obj).f2178a.h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.c0
    public final p1 h() {
        ArrayList arrayList = this.f2186n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f2178a.h;
    }

    @Override // k.y
    public final void i(x xVar) {
        this.C = xVar;
    }

    @Override // k.y
    public final boolean k() {
        return false;
    }

    @Override // k.u
    public final void l(m mVar) {
        mVar.b(this, this.f2181g);
        if (b()) {
            u(mVar);
        } else {
            this.f2185m.add(mVar);
        }
    }

    @Override // k.u
    public final void n(View view) {
        if (this.f2192t != view) {
            this.f2192t = view;
            this.f2191s = Gravity.getAbsoluteGravity(this.f2190r, view.getLayoutDirection());
        }
    }

    @Override // k.u
    public final void o(boolean z4) {
        this.A = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f2186n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i);
            if (!fVar.f2178a.E.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (fVar != null) {
            fVar.f2179b.c(false);
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
    public final void p(int i) {
        if (this.f2190r != i) {
            this.f2190r = i;
            this.f2191s = Gravity.getAbsoluteGravity(i, this.f2192t.getLayoutDirection());
        }
    }

    @Override // k.u
    public final void q(int i) {
        this.f2195w = true;
        this.f2197y = i;
    }

    @Override // k.u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // k.u
    public final void s(boolean z4) {
        this.B = z4;
    }

    @Override // k.u
    public final void t(int i) {
        this.f2196x = true;
        this.f2198z = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0163, code lost:
    
        if (((r9.getWidth() + r10[0]) + r5) > r11.right) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0165, code lost:
    
        r13 = 0;
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0168, code lost:
    
        r9 = 1;
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016e, code lost:
    
        if ((r10[0] - r5) < 0) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(m mVar) {
        boolean z4;
        int i;
        f fVar;
        View view;
        int i4;
        int i5;
        MenuItem menuItem;
        j jVar;
        int i6;
        int firstVisiblePosition;
        Context context = this.f2181g;
        LayoutInflater from = LayoutInflater.from(context);
        j jVar2 = new j(mVar, from, this.f2183k, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.A) {
            jVar2.f2207c = true;
        } else if (b()) {
            int size = mVar.f2215f.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    z4 = false;
                    break;
                }
                MenuItem item = mVar.getItem(i7);
                if (item.isVisible() && item.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i7++;
            }
            jVar2.f2207c = z4;
        }
        int m4 = u.m(jVar2, context, this.h);
        h2 h2Var = new h2(context, null, this.i, this.f2182j);
        h2Var.H = this.f2189q;
        h2Var.f2420u = this;
        h2Var.E.setOnDismissListener(this);
        h2Var.f2419t = this.f2192t;
        h2Var.f2416q = this.f2191s;
        h2Var.D = true;
        h2Var.E.setFocusable(true);
        h2Var.E.setInputMethodMode(2);
        h2Var.p(jVar2);
        h2Var.r(m4);
        h2Var.f2416q = this.f2191s;
        ArrayList arrayList = this.f2186n;
        if (arrayList.size() > 0) {
            fVar = (f) arrayList.get(arrayList.size() - 1);
            m mVar2 = fVar.f2179b;
            int size2 = mVar2.f2215f.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = mVar2.getItem(i8);
                if (menuItem.hasSubMenu() && mVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i8++;
                }
            }
            if (menuItem == null) {
                i = 1;
                view = null;
            } else {
                p1 p1Var = fVar.f2178a.h;
                ListAdapter adapter = p1Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i6 = headerViewListAdapter.getHeadersCount();
                    jVar = (j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    jVar = (j) adapter;
                    i6 = 0;
                }
                int count = jVar.getCount();
                i = 1;
                int i9 = 0;
                while (true) {
                    if (i9 >= count) {
                        i9 = -1;
                        break;
                    } else if (menuItem == jVar.getItem(i9)) {
                        break;
                    } else {
                        i9++;
                    }
                }
                if (i9 != -1 && (firstVisiblePosition = (i9 + i6) - p1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < p1Var.getChildCount()) {
                    view = p1Var.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i10 = Build.VERSION.SDK_INT;
                l.y yVar = h2Var.E;
                if (i10 <= 28) {
                    Method method = h2.I;
                    if (method != null) {
                        try {
                            method.invoke(yVar, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    f2.a(yVar, false);
                }
                e2.a(h2Var.E, null);
                p1 p1Var2 = ((f) arrayList.get(arrayList.size() - 1)).f2178a.h;
                int[] iArr = new int[2];
                p1Var2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f2193u.getWindowVisibleDisplayFrame(rect);
                if (this.f2194v == i) {
                }
                boolean z5 = i5 == i4;
                this.f2194v = i5;
                h2Var.f2419t = view;
                if ((this.f2191s & 5) != 5) {
                    m4 = z5 ? view.getWidth() : 0 - m4;
                } else if (!z5) {
                    m4 = 0 - view.getWidth();
                }
                h2Var.f2410k = m4;
                h2Var.f2415p = true;
                h2Var.f2414o = true;
                h2Var.j(0);
            } else {
                if (this.f2195w) {
                    h2Var.f2410k = this.f2197y;
                }
                if (this.f2196x) {
                    h2Var.j(this.f2198z);
                }
                Rect rect2 = this.f2265f;
                h2Var.C = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new f(h2Var, mVar, this.f2194v));
            h2Var.e();
            p1 p1Var3 = h2Var.h;
            p1Var3.setOnKeyListener(this);
            if (fVar == null || !this.B || mVar.f2220m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) p1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(mVar.f2220m);
            p1Var3.addHeaderView(frameLayout, null, false);
            h2Var.e();
            return;
        }
        i = 1;
        fVar = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new f(h2Var, mVar, this.f2194v));
        h2Var.e();
        p1 p1Var32 = h2Var.h;
        p1Var32.setOnKeyListener(this);
        if (fVar == null) {
        }
    }
}
