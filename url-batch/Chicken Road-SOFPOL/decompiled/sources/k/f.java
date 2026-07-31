package k;

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
import com.snovikpovik.vuevnxsj.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.l1;
import l.m1;
import l.n1;
import l.o1;
import l.y;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public ViewTreeObserver A;
    public PopupWindow.OnDismissListener B;
    public boolean C;

    /* renamed from: e, reason: collision with root package name */
    public final Context f4042e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4043f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4044g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4045h;
    public final Handler i;

    /* renamed from: q, reason: collision with root package name */
    public View f4053q;

    /* renamed from: r, reason: collision with root package name */
    public View f4054r;

    /* renamed from: s, reason: collision with root package name */
    public int f4055s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4056t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4057u;

    /* renamed from: v, reason: collision with root package name */
    public int f4058v;

    /* renamed from: w, reason: collision with root package name */
    public int f4059w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4061y;

    /* renamed from: z, reason: collision with root package name */
    public n f4062z;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4046j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4047k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final c f4048l = new c(this, 0);

    /* renamed from: m, reason: collision with root package name */
    public final f1.e f4049m = new f1.e(3, this);

    /* renamed from: n, reason: collision with root package name */
    public final b1.b f4050n = new b1.b(18, this);

    /* renamed from: o, reason: collision with root package name */
    public int f4051o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f4052p = 0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4060x = false;

    public f(Context context, View view, int i, boolean z3) {
        this.f4042e = context;
        this.f4053q = view;
        this.f4044g = i;
        this.f4045h = z3;
        this.f4055s = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f4043f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.i = new Handler();
    }

    @Override // k.o
    public final void a(i iVar, boolean z3) {
        ArrayList arrayList = this.f4047k;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (iVar == ((e) arrayList.get(i)).f4040b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i8 = i + 1;
        if (i8 < arrayList.size()) {
            ((e) arrayList.get(i8)).f4040b.c(false);
        }
        e eVar = (e) arrayList.remove(i);
        i iVar2 = eVar.f4040b;
        o1 o1Var = eVar.f4039a;
        y yVar = o1Var.f4317y;
        CopyOnWriteArrayList copyOnWriteArrayList = iVar2.f4086r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            o oVar = (o) weakReference.get();
            if (oVar == null || oVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.C) {
            l1.b(yVar, null);
            yVar.setAnimationStyle(0);
        }
        o1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f4055s = ((e) arrayList.get(size2 - 1)).f4041c;
        } else {
            this.f4055s = this.f4053q.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z3) {
                ((e) arrayList.get(0)).f4040b.c(false);
                return;
            }
            return;
        }
        dismiss();
        n nVar = this.f4062z;
        if (nVar != null) {
            nVar.a(iVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.A.removeGlobalOnLayoutListener(this.f4048l);
            }
            this.A = null;
        }
        this.f4054r.removeOnAttachStateChangeListener(this.f4049m);
        this.B.onDismiss();
    }

    @Override // k.o
    public final boolean c(s sVar) {
        ArrayList arrayList = this.f4047k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            e eVar = (e) obj;
            if (sVar == eVar.f4040b) {
                eVar.f4039a.f4299f.requestFocus();
                return true;
            }
        }
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        l(sVar);
        n nVar = this.f4062z;
        if (nVar != null) {
            nVar.g(sVar);
        }
        return true;
    }

    @Override // k.q
    public final void d() {
        if (k()) {
            return;
        }
        ArrayList arrayList = this.f4046j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((i) obj);
        }
        arrayList.clear();
        View view = this.f4053q;
        this.f4054r = view;
        if (view != null) {
            boolean z3 = this.A == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.A = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f4048l);
            }
            this.f4054r.addOnAttachStateChangeListener(this.f4049m);
        }
    }

    @Override // k.q
    public final void dismiss() {
        ArrayList arrayList = this.f4047k;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i = size - 1; i >= 0; i--) {
                e eVar = eVarArr[i];
                if (eVar.f4039a.f4317y.isShowing()) {
                    eVar.f4039a.dismiss();
                }
            }
        }
    }

    @Override // k.o
    public final void f() {
        ArrayList arrayList = this.f4047k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((e) obj).f4039a.f4299f.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((g) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.q
    public final ListView g() {
        ArrayList arrayList = this.f4047k;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) arrayList.get(arrayList.size() - 1)).f4039a.f4299f;
    }

    @Override // k.o
    public final void h(n nVar) {
        this.f4062z = nVar;
    }

    @Override // k.o
    public final boolean j() {
        return false;
    }

    @Override // k.q
    public final boolean k() {
        ArrayList arrayList = this.f4047k;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).f4039a.f4317y.isShowing();
    }

    @Override // k.k
    public final void l(i iVar) {
        iVar.b(this, this.f4042e);
        if (k()) {
            u(iVar);
        } else {
            this.f4046j.add(iVar);
        }
    }

    @Override // k.k
    public final void n(View view) {
        if (this.f4053q != view) {
            this.f4053q = view;
            this.f4052p = Gravity.getAbsoluteGravity(this.f4051o, view.getLayoutDirection());
        }
    }

    @Override // k.k
    public final void o(boolean z3) {
        this.f4060x = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f4047k;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i);
            if (!eVar.f4039a.f4317y.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (eVar != null) {
            eVar.f4040b.c(false);
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

    @Override // k.k
    public final void p(int i) {
        if (this.f4051o != i) {
            this.f4051o = i;
            this.f4052p = Gravity.getAbsoluteGravity(i, this.f4053q.getLayoutDirection());
        }
    }

    @Override // k.k
    public final void q(int i) {
        this.f4056t = true;
        this.f4058v = i;
    }

    @Override // k.k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    @Override // k.k
    public final void s(boolean z3) {
        this.f4061y = z3;
    }

    @Override // k.k
    public final void t(int i) {
        this.f4057u = true;
        this.f4059w = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0173, code lost:
    
        if (((r9.getWidth() + r11[0]) + r5) > r10.right) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0175, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0178, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017d, code lost:
    
        if ((r11[0] - r5) < 0) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(i iVar) {
        boolean z3;
        int i;
        e eVar;
        View view;
        int i8;
        int i9;
        int i10;
        int width;
        MenuItem menuItem;
        g gVar;
        int i11;
        int firstVisiblePosition;
        Context context = this.f4042e;
        LayoutInflater from = LayoutInflater.from(context);
        g gVar2 = new g(iVar, from, this.f4045h, R.layout.abc_cascading_menu_item_layout);
        if (!k() && this.f4060x) {
            gVar2.f4065c = true;
        } else if (k()) {
            int size = iVar.f4075f.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z3 = false;
                    break;
                }
                MenuItem item = iVar.getItem(i12);
                if (item.isVisible() && item.getIcon() != null) {
                    z3 = true;
                    break;
                }
                i12++;
            }
            gVar2.f4065c = z3;
        }
        int m7 = k.m(gVar2, context, this.f4043f);
        o1 o1Var = new o1(context, this.f4044g);
        o1Var.B = this.f4050n;
        o1Var.f4308p = this;
        o1Var.f4317y.setOnDismissListener(this);
        o1Var.f4307o = this.f4053q;
        o1Var.f4305m = this.f4052p;
        o1Var.f4316x = true;
        o1Var.f4317y.setFocusable(true);
        o1Var.f4317y.setInputMethodMode(2);
        o1Var.a(gVar2);
        Drawable background = o1Var.f4317y.getBackground();
        if (background != null) {
            Rect rect = o1Var.f4314v;
            background.getPadding(rect);
            o1Var.f4300g = rect.left + rect.right + m7;
        } else {
            o1Var.f4300g = m7;
        }
        o1Var.f4305m = this.f4052p;
        ArrayList arrayList = this.f4047k;
        if (arrayList.size() > 0) {
            eVar = (e) arrayList.get(arrayList.size() - 1);
            i iVar2 = eVar.f4040b;
            int size2 = iVar2.f4075f.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = iVar2.getItem(i13);
                if (menuItem.hasSubMenu() && iVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i13++;
                }
            }
            if (menuItem == null) {
                i = 1;
            } else {
                n1 n1Var = eVar.f4039a.f4299f;
                ListAdapter adapter = n1Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i11 = headerViewListAdapter.getHeadersCount();
                    gVar = (g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    gVar = (g) adapter;
                    i11 = 0;
                }
                int count = gVar.getCount();
                i = 1;
                int i14 = 0;
                while (true) {
                    if (i14 >= count) {
                        i14 = -1;
                        break;
                    } else if (menuItem == gVar.getItem(i14)) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 != -1 && (firstVisiblePosition = (i14 + i11) - n1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < n1Var.getChildCount()) {
                    view = n1Var.getChildAt(firstVisiblePosition);
                    if (view == null) {
                        int i15 = Build.VERSION.SDK_INT;
                        y yVar = o1Var.f4317y;
                        if (i15 <= 28) {
                            Method method = o1.C;
                            if (method != null) {
                                try {
                                    method.invoke(yVar, Boolean.FALSE);
                                } catch (Exception unused) {
                                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                                }
                            }
                        } else {
                            m1.a(yVar, false);
                        }
                        l1.a(o1Var.f4317y, null);
                        n1 n1Var2 = ((e) arrayList.get(arrayList.size() - 1)).f4039a.f4299f;
                        int[] iArr = new int[2];
                        n1Var2.getLocationOnScreen(iArr);
                        Rect rect2 = new Rect();
                        this.f4054r.getWindowVisibleDisplayFrame(rect2);
                        if (this.f4055s == i) {
                        }
                        boolean z7 = i8 == 1;
                        this.f4055s = i8;
                        if (Build.VERSION.SDK_INT >= 26) {
                            o1Var.f4307o = view;
                            i10 = 0;
                            i9 = 0;
                        } else {
                            int[] iArr2 = new int[2];
                            this.f4053q.getLocationOnScreen(iArr2);
                            int[] iArr3 = new int[2];
                            view.getLocationOnScreen(iArr3);
                            if ((this.f4052p & 7) == 5) {
                                iArr2[0] = this.f4053q.getWidth() + iArr2[0];
                                iArr3[0] = view.getWidth() + iArr3[0];
                            }
                            i9 = iArr3[0] - iArr2[0];
                            i10 = iArr3[1] - iArr2[1];
                        }
                        if ((this.f4052p & 5) != 5) {
                            if (z7) {
                                width = i9 + view.getWidth();
                                o1Var.f4301h = width;
                                o1Var.f4304l = true;
                                o1Var.f4303k = true;
                                o1Var.i = i10;
                                o1Var.f4302j = true;
                            }
                            width = i9 - m7;
                            o1Var.f4301h = width;
                            o1Var.f4304l = true;
                            o1Var.f4303k = true;
                            o1Var.i = i10;
                            o1Var.f4302j = true;
                        } else if (z7) {
                            width = i9 + m7;
                            o1Var.f4301h = width;
                            o1Var.f4304l = true;
                            o1Var.f4303k = true;
                            o1Var.i = i10;
                            o1Var.f4302j = true;
                        } else {
                            m7 = view.getWidth();
                            width = i9 - m7;
                            o1Var.f4301h = width;
                            o1Var.f4304l = true;
                            o1Var.f4303k = true;
                            o1Var.i = i10;
                            o1Var.f4302j = true;
                        }
                    } else {
                        if (this.f4056t) {
                            o1Var.f4301h = this.f4058v;
                        }
                        if (this.f4057u) {
                            o1Var.i = this.f4059w;
                            o1Var.f4302j = true;
                        }
                        Rect rect3 = this.f4114d;
                        o1Var.f4315w = rect3 != null ? new Rect(rect3) : null;
                    }
                    arrayList.add(new e(o1Var, iVar, this.f4055s));
                    o1Var.d();
                    n1 n1Var3 = o1Var.f4299f;
                    n1Var3.setOnKeyListener(this);
                    if (eVar == null || !this.f4061y || iVar.f4080l == null) {
                        return;
                    }
                    FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) n1Var3, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    frameLayout.setEnabled(false);
                    textView.setText(iVar.f4080l);
                    n1Var3.addHeaderView(frameLayout, null, false);
                    o1Var.d();
                    return;
                }
            }
        } else {
            i = 1;
            eVar = null;
        }
        view = null;
        if (view == null) {
        }
        arrayList.add(new e(o1Var, iVar, this.f4055s));
        o1Var.d();
        n1 n1Var32 = o1Var.f4299f;
        n1Var32.setOnKeyListener(this);
        if (eVar == null) {
        }
    }
}
