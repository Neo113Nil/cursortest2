package j;

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
import com.gglhk.bofio.fortunetiger.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k.e2;
import k.f2;
import k.h2;
import k.p1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean B;
    public x C;
    public ViewTreeObserver D;
    public PopupWindow.OnDismissListener E;
    public boolean F;
    public final Context g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2159i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2160j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2161k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f2162l;

    /* renamed from: t, reason: collision with root package name */
    public View f2170t;

    /* renamed from: u, reason: collision with root package name */
    public View f2171u;

    /* renamed from: v, reason: collision with root package name */
    public int f2172v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2173w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2174x;

    /* renamed from: y, reason: collision with root package name */
    public int f2175y;

    /* renamed from: z, reason: collision with root package name */
    public int f2176z;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2163m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f2164n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final d f2165o = new d(0, this);

    /* renamed from: p, reason: collision with root package name */
    public final p0 f2166p = new p0(1, this);

    /* renamed from: q, reason: collision with root package name */
    public final a2.e f2167q = new a2.e(17, this);

    /* renamed from: r, reason: collision with root package name */
    public int f2168r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f2169s = 0;
    public boolean A = false;

    public g(Context context, View view, int i4, int i5, boolean z3) {
        this.g = context;
        this.f2170t = view;
        this.f2159i = i4;
        this.f2160j = i5;
        this.f2161k = z3;
        this.f2172v = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2162l = new Handler();
    }

    @Override // j.y
    public final void a(m mVar, boolean z3) {
        ArrayList arrayList = this.f2164n;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (mVar == ((f) arrayList.get(i4)).f2158b) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 < 0) {
            return;
        }
        int i5 = i4 + 1;
        if (i5 < arrayList.size()) {
            ((f) arrayList.get(i5)).f2158b.c(false);
        }
        f fVar = (f) arrayList.remove(i4);
        m mVar2 = fVar.f2158b;
        h2 h2Var = fVar.f2157a;
        k.z zVar = h2Var.E;
        mVar2.r(this);
        if (this.F) {
            e2.b(zVar, null);
            zVar.setAnimationStyle(0);
        }
        h2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2172v = ((f) arrayList.get(size2 - 1)).c;
        } else {
            this.f2172v = this.f2170t.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z3) {
                ((f) arrayList.get(0)).f2158b.c(false);
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
                this.D.removeGlobalOnLayoutListener(this.f2165o);
            }
            this.D = null;
        }
        this.f2171u.removeOnAttachStateChangeListener(this.f2166p);
        this.E.onDismiss();
    }

    @Override // j.c0
    public final boolean b() {
        ArrayList arrayList = this.f2164n;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f2157a.E.isShowing();
    }

    @Override // j.c0
    public final void c() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f2163m;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            u((m) obj);
        }
        arrayList.clear();
        View view = this.f2170t;
        this.f2171u = view;
        if (view != null) {
            boolean z3 = this.D == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.D = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2165o);
            }
            this.f2171u.addOnAttachStateChangeListener(this.f2166p);
        }
    }

    @Override // j.c0
    public final void dismiss() {
        ArrayList arrayList = this.f2164n;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                f fVar = fVarArr[i4];
                if (fVar.f2157a.E.isShowing()) {
                    fVar.f2157a.dismiss();
                }
            }
        }
    }

    @Override // j.y
    public final void e() {
        ArrayList arrayList = this.f2164n;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ListAdapter adapter = ((f) obj).f2157a.h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // j.c0
    public final p1 f() {
        ArrayList arrayList = this.f2164n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f2157a.h;
    }

    @Override // j.y
    public final boolean h() {
        return false;
    }

    @Override // j.y
    public final void j(x xVar) {
        this.C = xVar;
    }

    @Override // j.y
    public final boolean k(e0 e0Var) {
        ArrayList arrayList = this.f2164n;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            f fVar = (f) obj;
            if (e0Var == fVar.f2158b) {
                fVar.f2157a.h.requestFocus();
                return true;
            }
        }
        if (!e0Var.hasVisibleItems()) {
            return false;
        }
        l(e0Var);
        x xVar = this.C;
        if (xVar != null) {
            xVar.i(e0Var);
        }
        return true;
    }

    @Override // j.u
    public final void l(m mVar) {
        mVar.b(this, this.g);
        if (b()) {
            u(mVar);
        } else {
            this.f2163m.add(mVar);
        }
    }

    @Override // j.u
    public final void n(View view) {
        if (this.f2170t != view) {
            this.f2170t = view;
            this.f2169s = Gravity.getAbsoluteGravity(this.f2168r, view.getLayoutDirection());
        }
    }

    @Override // j.u
    public final void o(boolean z3) {
        this.A = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f2164n;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i4);
            if (!fVar.f2157a.E.isShowing()) {
                break;
            } else {
                i4++;
            }
        }
        if (fVar != null) {
            fVar.f2158b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // j.u
    public final void p(int i4) {
        if (this.f2168r != i4) {
            this.f2168r = i4;
            this.f2169s = Gravity.getAbsoluteGravity(i4, this.f2170t.getLayoutDirection());
        }
    }

    @Override // j.u
    public final void q(int i4) {
        this.f2173w = true;
        this.f2175y = i4;
    }

    @Override // j.u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.E = onDismissListener;
    }

    @Override // j.u
    public final void s(boolean z3) {
        this.B = z3;
    }

    @Override // j.u
    public final void t(int i4) {
        this.f2174x = true;
        this.f2176z = i4;
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
        boolean z3;
        int i4;
        f fVar;
        View view;
        int i5;
        int i6;
        MenuItem menuItem;
        j jVar;
        int i7;
        int firstVisiblePosition;
        Context context = this.g;
        LayoutInflater from = LayoutInflater.from(context);
        j jVar2 = new j(mVar, from, this.f2161k, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.A) {
            jVar2.c = true;
        } else if (b()) {
            int size = mVar.f2193f.size();
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
            jVar2.c = z3;
        }
        int m4 = u.m(jVar2, context, this.h);
        h2 h2Var = new h2(context, null, this.f2159i, this.f2160j);
        h2Var.H = this.f2167q;
        h2Var.f2521u = this;
        h2Var.E.setOnDismissListener(this);
        h2Var.f2520t = this.f2170t;
        h2Var.f2517q = this.f2169s;
        h2Var.D = true;
        h2Var.E.setFocusable(true);
        h2Var.E.setInputMethodMode(2);
        h2Var.p(jVar2);
        h2Var.r(m4);
        h2Var.f2517q = this.f2169s;
        ArrayList arrayList = this.f2164n;
        if (arrayList.size() > 0) {
            fVar = (f) arrayList.get(arrayList.size() - 1);
            m mVar2 = fVar.f2158b;
            int size2 = mVar2.f2193f.size();
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
                i4 = 1;
                view = null;
            } else {
                p1 p1Var = fVar.f2157a.h;
                ListAdapter adapter = p1Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i7 = headerViewListAdapter.getHeadersCount();
                    jVar = (j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    jVar = (j) adapter;
                    i7 = 0;
                }
                int count = jVar.getCount();
                i4 = 1;
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
                if (i10 != -1 && (firstVisiblePosition = (i10 + i7) - p1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < p1Var.getChildCount()) {
                    view = p1Var.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i11 = Build.VERSION.SDK_INT;
                k.z zVar = h2Var.E;
                if (i11 <= 28) {
                    Method method = h2.I;
                    if (method != null) {
                        try {
                            method.invoke(zVar, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    f2.a(zVar, false);
                }
                e2.a(h2Var.E, null);
                p1 p1Var2 = ((f) arrayList.get(arrayList.size() - 1)).f2157a.h;
                int[] iArr = new int[2];
                p1Var2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f2171u.getWindowVisibleDisplayFrame(rect);
                if (this.f2172v == i4) {
                }
                boolean z4 = i6 == i5;
                this.f2172v = i6;
                h2Var.f2520t = view;
                if ((this.f2169s & 5) != 5) {
                    m4 = z4 ? view.getWidth() : 0 - m4;
                } else if (!z4) {
                    m4 = 0 - view.getWidth();
                }
                h2Var.f2511k = m4;
                h2Var.f2516p = true;
                h2Var.f2515o = true;
                h2Var.i(0);
            } else {
                if (this.f2173w) {
                    h2Var.f2511k = this.f2175y;
                }
                if (this.f2174x) {
                    h2Var.i(this.f2176z);
                }
                Rect rect2 = this.f2242f;
                h2Var.C = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new f(h2Var, mVar, this.f2172v));
            h2Var.c();
            p1 p1Var3 = h2Var.h;
            p1Var3.setOnKeyListener(this);
            if (fVar == null || !this.B || mVar.f2198m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) p1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(mVar.f2198m);
            p1Var3.addHeaderView(frameLayout, null, false);
            h2Var.c();
            return;
        }
        i4 = 1;
        fVar = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new f(h2Var, mVar, this.f2172v));
        h2Var.c();
        p1 p1Var32 = h2Var.h;
        p1Var32.setOnKeyListener(this);
        if (fVar == null) {
        }
    }
}
