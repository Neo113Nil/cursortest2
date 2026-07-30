package m;

import I.T;
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
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.C0742w0;
import n.C0747z;
import n.K0;
import n.L0;
import n.O0;

/* loaded from: classes.dex */
public final class g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public int f6370A;

    /* renamed from: B, reason: collision with root package name */
    public int f6371B;

    /* renamed from: D, reason: collision with root package name */
    public boolean f6373D;

    /* renamed from: E, reason: collision with root package name */
    public y f6374E;

    /* renamed from: F, reason: collision with root package name */
    public ViewTreeObserver f6375F;

    /* renamed from: G, reason: collision with root package name */
    public PopupWindow.OnDismissListener f6376G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f6377H;

    /* renamed from: e, reason: collision with root package name */
    public final Context f6378e;

    /* renamed from: i, reason: collision with root package name */
    public final int f6379i;

    /* renamed from: l, reason: collision with root package name */
    public final int f6380l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f6381m;

    /* renamed from: n, reason: collision with root package name */
    public final Handler f6382n;

    /* renamed from: q, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0679d f6385q;

    /* renamed from: r, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0680e f6386r;

    /* renamed from: v, reason: collision with root package name */
    public View f6390v;

    /* renamed from: w, reason: collision with root package name */
    public View f6391w;

    /* renamed from: x, reason: collision with root package name */
    public int f6392x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6393y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6394z;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f6383o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f6384p = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final l4.b f6387s = new l4.b(1, this);

    /* renamed from: t, reason: collision with root package name */
    public int f6388t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f6389u = 0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f6372C = false;

    public g(Context context, View view, int i2, boolean z7) {
        this.f6385q = new ViewTreeObserverOnGlobalLayoutListenerC0679d(r1, this);
        this.f6386r = new ViewOnAttachStateChangeListenerC0680e(this, r1);
        this.f6378e = context;
        this.f6390v = view;
        this.f6380l = i2;
        this.f6381m = z7;
        WeakHashMap weakHashMap = T.f1153a;
        this.f6392x = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f6379i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f6382n = new Handler();
    }

    @Override // m.z
    public final void a(m mVar, boolean z7) {
        ArrayList arrayList = this.f6384p;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (mVar == ((C0681f) arrayList.get(i2)).f6368b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i5 = i2 + 1;
        if (i5 < arrayList.size()) {
            ((C0681f) arrayList.get(i5)).f6368b.c(false);
        }
        C0681f c0681f = (C0681f) arrayList.remove(i2);
        m mVar2 = c0681f.f6368b;
        O0 o02 = c0681f.f6367a;
        mVar2.r(this);
        if (this.f6377H) {
            K0.b(o02.f6649G, null);
            o02.f6649G.setAnimationStyle(0);
        }
        o02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f6392x = ((C0681f) arrayList.get(size2 - 1)).f6369c;
        } else {
            View view = this.f6390v;
            WeakHashMap weakHashMap = T.f1153a;
            this.f6392x = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z7) {
                ((C0681f) arrayList.get(0)).f6368b.c(false);
                return;
            }
            return;
        }
        dismiss();
        y yVar = this.f6374E;
        if (yVar != null) {
            yVar.a(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f6375F;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f6375F.removeGlobalOnLayoutListener(this.f6385q);
            }
            this.f6375F = null;
        }
        this.f6391w.removeOnAttachStateChangeListener(this.f6386r);
        this.f6376G.onDismiss();
    }

    @Override // m.InterfaceC0675D
    public final boolean b() {
        ArrayList arrayList = this.f6384p;
        return arrayList.size() > 0 && ((C0681f) arrayList.get(0)).f6367a.f6649G.isShowing();
    }

    @Override // m.InterfaceC0675D
    public final void c() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f6383o;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            u((m) obj);
        }
        arrayList.clear();
        View view = this.f6390v;
        this.f6391w = view;
        if (view != null) {
            boolean z7 = this.f6375F == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f6375F = viewTreeObserver;
            if (z7) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f6385q);
            }
            this.f6391w.addOnAttachStateChangeListener(this.f6386r);
        }
    }

    @Override // m.z
    public final void d() {
        ArrayList arrayList = this.f6384p;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ListAdapter adapter = ((C0681f) obj).f6367a.f6652i.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // m.InterfaceC0675D
    public final void dismiss() {
        ArrayList arrayList = this.f6384p;
        int size = arrayList.size();
        if (size > 0) {
            C0681f[] c0681fArr = (C0681f[]) arrayList.toArray(new C0681f[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0681f c0681f = c0681fArr[i2];
                if (c0681f.f6367a.f6649G.isShowing()) {
                    c0681f.f6367a.dismiss();
                }
            }
        }
    }

    @Override // m.InterfaceC0675D
    public final C0742w0 e() {
        ArrayList arrayList = this.f6384p;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0681f) arrayList.get(arrayList.size() - 1)).f6367a.f6652i;
    }

    @Override // m.z
    public final boolean h() {
        return false;
    }

    @Override // m.z
    public final boolean i(F f7) {
        ArrayList arrayList = this.f6384p;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            C0681f c0681f = (C0681f) obj;
            if (f7 == c0681f.f6368b) {
                c0681f.f6367a.f6652i.requestFocus();
                return true;
            }
        }
        if (!f7.hasVisibleItems()) {
            return false;
        }
        l(f7);
        y yVar = this.f6374E;
        if (yVar != null) {
            yVar.i(f7);
        }
        return true;
    }

    @Override // m.z
    public final void j(y yVar) {
        this.f6374E = yVar;
    }

    @Override // m.u
    public final void l(m mVar) {
        mVar.b(this, this.f6378e);
        if (b()) {
            u(mVar);
        } else {
            this.f6383o.add(mVar);
        }
    }

    @Override // m.u
    public final void n(View view) {
        if (this.f6390v != view) {
            this.f6390v = view;
            int i2 = this.f6388t;
            WeakHashMap weakHashMap = T.f1153a;
            this.f6389u = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // m.u
    public final void o(boolean z7) {
        this.f6372C = z7;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0681f c0681f;
        ArrayList arrayList = this.f6384p;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                c0681f = null;
                break;
            }
            c0681f = (C0681f) arrayList.get(i2);
            if (!c0681f.f6367a.f6649G.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (c0681f != null) {
            c0681f.f6368b.c(false);
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

    @Override // m.u
    public final void p(int i2) {
        if (this.f6388t != i2) {
            this.f6388t = i2;
            View view = this.f6390v;
            WeakHashMap weakHashMap = T.f1153a;
            this.f6389u = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // m.u
    public final void q(int i2) {
        this.f6393y = true;
        this.f6370A = i2;
    }

    @Override // m.u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f6376G = onDismissListener;
    }

    @Override // m.u
    public final void s(boolean z7) {
        this.f6373D = z7;
    }

    @Override // m.u
    public final void t(int i2) {
        this.f6394z = true;
        this.f6371B = i2;
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
    public final void u(m mVar) {
        boolean z7;
        int i2;
        C0681f c0681f;
        View view;
        int i5;
        int i7;
        int i8;
        int width;
        MenuItem menuItem;
        j jVar;
        int i9;
        int firstVisiblePosition;
        Context context = this.f6378e;
        LayoutInflater from = LayoutInflater.from(context);
        j jVar2 = new j(mVar, from, this.f6381m, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.f6372C) {
            jVar2.f6405i = true;
        } else if (b()) {
            int size = mVar.f6415f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z7 = false;
                    break;
                }
                MenuItem item = mVar.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z7 = true;
                    break;
                }
                i10++;
            }
            jVar2.f6405i = z7;
        }
        int m2 = u.m(jVar2, context, this.f6379i);
        O0 o02 = new O0(context, null, this.f6380l);
        o02.f6688J = this.f6387s;
        o02.f6665x = this;
        o02.f6649G.setOnDismissListener(this);
        o02.f6664w = this.f6390v;
        o02.f6661t = this.f6389u;
        o02.f6648F = true;
        o02.f6649G.setFocusable(true);
        o02.f6649G.setInputMethodMode(2);
        o02.p(jVar2);
        o02.r(m2);
        o02.f6661t = this.f6389u;
        ArrayList arrayList = this.f6384p;
        if (arrayList.size() > 0) {
            c0681f = (C0681f) arrayList.get(arrayList.size() - 1);
            m mVar2 = c0681f.f6368b;
            int size2 = mVar2.f6415f.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = mVar2.getItem(i11);
                if (menuItem.hasSubMenu() && mVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i11++;
                }
            }
            if (menuItem == null) {
                i2 = 1;
                view = null;
            } else {
                C0742w0 c0742w0 = c0681f.f6367a.f6652i;
                ListAdapter adapter = c0742w0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i9 = headerViewListAdapter.getHeadersCount();
                    jVar = (j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    jVar = (j) adapter;
                    i9 = 0;
                }
                int count = jVar.getCount();
                i2 = 1;
                int i12 = 0;
                while (true) {
                    if (i12 >= count) {
                        i12 = -1;
                        break;
                    } else if (menuItem == jVar.getItem(i12)) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 != -1 && (firstVisiblePosition = (i12 + i9) - c0742w0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0742w0.getChildCount()) {
                    view = c0742w0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i13 = Build.VERSION.SDK_INT;
                C0747z c0747z = o02.f6649G;
                if (i13 <= 28) {
                    Method method = O0.f6687K;
                    if (method != null) {
                        try {
                            method.invoke(c0747z, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    L0.a(c0747z, false);
                }
                K0.a(o02.f6649G, null);
                C0742w0 c0742w02 = ((C0681f) arrayList.get(arrayList.size() - 1)).f6367a.f6652i;
                int[] iArr = new int[2];
                c0742w02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f6391w.getWindowVisibleDisplayFrame(rect);
                if (this.f6392x == i2) {
                }
                boolean z8 = i5 == 1;
                this.f6392x = i5;
                if (Build.VERSION.SDK_INT >= 26) {
                    o02.f6664w = view;
                    i8 = 0;
                    i7 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.f6390v.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    view.getLocationOnScreen(iArr3);
                    if ((this.f6389u & 7) == 5) {
                        iArr2[0] = this.f6390v.getWidth() + iArr2[0];
                        iArr3[0] = view.getWidth() + iArr3[0];
                    }
                    i7 = iArr3[0] - iArr2[0];
                    i8 = iArr3[1] - iArr2[1];
                }
                if ((this.f6389u & 5) != 5) {
                    if (z8) {
                        width = i7 + view.getWidth();
                        o02.f6655n = width;
                        o02.f6660s = true;
                        o02.f6659r = true;
                        o02.i(i8);
                    }
                    width = i7 - m2;
                    o02.f6655n = width;
                    o02.f6660s = true;
                    o02.f6659r = true;
                    o02.i(i8);
                } else if (z8) {
                    width = i7 + m2;
                    o02.f6655n = width;
                    o02.f6660s = true;
                    o02.f6659r = true;
                    o02.i(i8);
                } else {
                    m2 = view.getWidth();
                    width = i7 - m2;
                    o02.f6655n = width;
                    o02.f6660s = true;
                    o02.f6659r = true;
                    o02.i(i8);
                }
            } else {
                if (this.f6393y) {
                    o02.f6655n = this.f6370A;
                }
                if (this.f6394z) {
                    o02.i(this.f6371B);
                }
                Rect rect2 = this.f6474d;
                o02.f6647E = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C0681f(o02, mVar, this.f6392x));
            o02.c();
            C0742w0 c0742w03 = o02.f6652i;
            c0742w03.setOnKeyListener(this);
            if (c0681f == null || !this.f6373D || mVar.f6421m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0742w03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(mVar.f6421m);
            c0742w03.addHeaderView(frameLayout, null, false);
            o02.c();
            return;
        }
        i2 = 1;
        c0681f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C0681f(o02, mVar, this.f6392x));
        o02.c();
        C0742w0 c0742w032 = o02.f6652i;
        c0742w032.setOnKeyListener(this);
        if (c0681f == null) {
        }
    }
}
