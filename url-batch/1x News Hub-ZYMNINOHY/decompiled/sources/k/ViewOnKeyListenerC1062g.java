package k;

import E.A;
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
import com.fc.barca.football.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.M;
import l.N;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1062g extends AbstractC1067l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f9571b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9572c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9573d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9574e;
    public final Handler f;

    /* renamed from: i, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1058c f9577i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC1059d f9578j;

    /* renamed from: n, reason: collision with root package name */
    public View f9582n;
    public View o;

    /* renamed from: p, reason: collision with root package name */
    public int f9583p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9584q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9585r;

    /* renamed from: s, reason: collision with root package name */
    public int f9586s;

    /* renamed from: t, reason: collision with root package name */
    public int f9587t;
    public boolean v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC1070o f9589w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f9590x;

    /* renamed from: y, reason: collision with root package name */
    public C1068m f9591y;
    public boolean z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f9575g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f9576h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final b0.s f9579k = new b0.s(this);

    /* renamed from: l, reason: collision with root package name */
    public int f9580l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f9581m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9588u = false;

    public ViewOnKeyListenerC1062g(Context context, View view, int i3, boolean z) {
        this.f9577i = new ViewTreeObserverOnGlobalLayoutListenerC1058c(this, r0);
        this.f9578j = new ViewOnAttachStateChangeListenerC1059d(this, r0);
        this.f9571b = context;
        this.f9582n = view;
        this.f9573d = i3;
        this.f9574e = z;
        Field field = A.f243a;
        this.f9583p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f9572c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // k.InterfaceC1071p
    public final void a(MenuC1065j menuC1065j, boolean z) {
        ArrayList arrayList = this.f9576h;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (menuC1065j == ((C1061f) arrayList.get(i3)).f9569b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return;
        }
        int i4 = i3 + 1;
        if (i4 < arrayList.size()) {
            ((C1061f) arrayList.get(i4)).f9569b.c(false);
        }
        C1061f c1061f = (C1061f) arrayList.remove(i3);
        CopyOnWriteArrayList copyOnWriteArrayList = c1061f.f9569b.f9613s;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1071p interfaceC1071p = (InterfaceC1071p) weakReference.get();
            if (interfaceC1071p == null || interfaceC1071p == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z2 = this.z;
        N n3 = c1061f.f9568a;
        if (z2) {
            n3.v.setExitTransition(null);
            n3.v.setAnimationStyle(0);
        }
        n3.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f9583p = ((C1061f) arrayList.get(size2 - 1)).f9570c;
        } else {
            View view = this.f9582n;
            Field field = A.f243a;
            this.f9583p = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C1061f) arrayList.get(0)).f9569b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1070o interfaceC1070o = this.f9589w;
        if (interfaceC1070o != null) {
            interfaceC1070o.a(menuC1065j, true);
        }
        ViewTreeObserver viewTreeObserver = this.f9590x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f9590x.removeGlobalOnLayoutListener(this.f9577i);
            }
            this.f9590x = null;
        }
        this.o.removeOnAttachStateChangeListener(this.f9578j);
        this.f9591y.onDismiss();
    }

    @Override // k.InterfaceC1071p
    public final boolean c(SubMenuC1075t subMenuC1075t) {
        Iterator it = this.f9576h.iterator();
        while (it.hasNext()) {
            C1061f c1061f = (C1061f) it.next();
            if (subMenuC1075t == c1061f.f9569b) {
                c1061f.f9568a.f9735c.requestFocus();
                return true;
            }
        }
        if (!subMenuC1075t.hasVisibleItems()) {
            return false;
        }
        l(subMenuC1075t);
        InterfaceC1070o interfaceC1070o = this.f9589w;
        if (interfaceC1070o != null) {
            interfaceC1070o.d(subMenuC1075t);
        }
        return true;
    }

    @Override // k.InterfaceC1073r
    public final void d() {
        if (k()) {
            return;
        }
        ArrayList arrayList = this.f9575g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC1065j) it.next());
        }
        arrayList.clear();
        View view = this.f9582n;
        this.o = view;
        if (view != null) {
            boolean z = this.f9590x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f9590x = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f9577i);
            }
            this.o.addOnAttachStateChangeListener(this.f9578j);
        }
    }

    @Override // k.InterfaceC1073r
    public final void dismiss() {
        ArrayList arrayList = this.f9576h;
        int size = arrayList.size();
        if (size > 0) {
            C1061f[] c1061fArr = (C1061f[]) arrayList.toArray(new C1061f[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C1061f c1061f = c1061fArr[i3];
                if (c1061f.f9568a.v.isShowing()) {
                    c1061f.f9568a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC1071p
    public final void f() {
        Iterator it = this.f9576h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C1061f) it.next()).f9568a.f9735c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1063h) adapter).notifyDataSetChanged();
        }
    }

    @Override // k.InterfaceC1073r
    public final ListView g() {
        ArrayList arrayList = this.f9576h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1061f) arrayList.get(arrayList.size() - 1)).f9568a.f9735c;
    }

    @Override // k.InterfaceC1071p
    public final void h(InterfaceC1070o interfaceC1070o) {
        this.f9589w = interfaceC1070o;
    }

    @Override // k.InterfaceC1071p
    public final boolean j() {
        return false;
    }

    @Override // k.InterfaceC1073r
    public final boolean k() {
        ArrayList arrayList = this.f9576h;
        return arrayList.size() > 0 && ((C1061f) arrayList.get(0)).f9568a.v.isShowing();
    }

    @Override // k.AbstractC1067l
    public final void l(MenuC1065j menuC1065j) {
        menuC1065j.b(this, this.f9571b);
        if (k()) {
            v(menuC1065j);
        } else {
            this.f9575g.add(menuC1065j);
        }
    }

    @Override // k.AbstractC1067l
    public final void n(View view) {
        if (this.f9582n != view) {
            this.f9582n = view;
            int i3 = this.f9580l;
            Field field = A.f243a;
            this.f9581m = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC1067l
    public final void o(boolean z) {
        this.f9588u = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1061f c1061f;
        ArrayList arrayList = this.f9576h;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                c1061f = null;
                break;
            }
            c1061f = (C1061f) arrayList.get(i3);
            if (!c1061f.f9568a.v.isShowing()) {
                break;
            } else {
                i3++;
            }
        }
        if (c1061f != null) {
            c1061f.f9569b.c(false);
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

    @Override // k.AbstractC1067l
    public final void p(int i3) {
        if (this.f9580l != i3) {
            this.f9580l = i3;
            View view = this.f9582n;
            Field field = A.f243a;
            this.f9581m = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // k.AbstractC1067l
    public final void q(int i3) {
        this.f9584q = true;
        this.f9586s = i3;
    }

    @Override // k.AbstractC1067l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f9591y = (C1068m) onDismissListener;
    }

    @Override // k.AbstractC1067l
    public final void s(boolean z) {
        this.v = z;
    }

    @Override // k.AbstractC1067l
    public final void t(int i3) {
        this.f9585r = true;
        this.f9587t = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0160, code lost:
    
        if (((r8.getWidth() + r11[r16]) + r5) > r10.right) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0162, code lost:
    
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0166, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
    
        if ((r11[r16] - r5) < 0) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(MenuC1065j menuC1065j) {
        int i3;
        int i4;
        C1061f c1061f;
        View view;
        int i5;
        int i6;
        int i7;
        int width;
        MenuItem menuItem;
        C1063h c1063h;
        int i8;
        int firstVisiblePosition;
        Context context = this.f9571b;
        LayoutInflater from = LayoutInflater.from(context);
        C1063h c1063h2 = new C1063h(menuC1065j, from, this.f9574e, R.layout.abc_cascading_menu_item_layout);
        if (!k() && this.f9588u) {
            c1063h2.f9594c = true;
        } else if (k()) {
            c1063h2.f9594c = AbstractC1067l.u(menuC1065j);
        }
        int m3 = AbstractC1067l.m(c1063h2, context, this.f9572c);
        N n3 = new N(context, this.f9573d);
        n3.f9755y = this.f9579k;
        n3.f9744m = this;
        n3.v.setOnDismissListener(this);
        n3.f9743l = this.f9582n;
        n3.f9741j = this.f9581m;
        n3.f9751u = true;
        n3.v.setFocusable(true);
        n3.v.setInputMethodMode(2);
        n3.c(c1063h2);
        Drawable background = n3.v.getBackground();
        if (background != null) {
            Rect rect = n3.f9749s;
            background.getPadding(rect);
            n3.f9736d = rect.left + rect.right + m3;
        } else {
            n3.f9736d = m3;
        }
        n3.f9741j = this.f9581m;
        ArrayList arrayList = this.f9576h;
        if (arrayList.size() > 0) {
            c1061f = (C1061f) arrayList.get(arrayList.size() - 1);
            MenuC1065j menuC1065j2 = c1061f.f9569b;
            int size = menuC1065j2.f.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC1065j2.getItem(i9);
                if (menuItem.hasSubMenu() && menuC1065j == menuItem.getSubMenu()) {
                    break;
                } else {
                    i9++;
                }
            }
            if (menuItem == null) {
                i3 = 1;
                view = null;
                i4 = 0;
            } else {
                M m4 = c1061f.f9568a.f9735c;
                ListAdapter adapter = m4.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i8 = headerViewListAdapter.getHeadersCount();
                    c1063h = (C1063h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c1063h = (C1063h) adapter;
                    i8 = 0;
                }
                int count = c1063h.getCount();
                i3 = 1;
                int i10 = 0;
                i4 = 0;
                while (true) {
                    if (i10 >= count) {
                        i10 = -1;
                        break;
                    } else if (menuItem == c1063h.getItem(i10)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                view = (i10 != -1 && (firstVisiblePosition = (i10 + i8) - m4.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m4.getChildCount()) ? m4.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i3 = 1;
            i4 = 0;
            c1061f = null;
            view = null;
        }
        if (view != null) {
            int i11 = Build.VERSION.SDK_INT;
            l.r rVar = n3.v;
            if (i11 <= 28) {
                Method method = N.z;
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
            n3.v.setEnterTransition(null);
            M m5 = ((C1061f) arrayList.get(arrayList.size() - 1)).f9568a.f9735c;
            int[] iArr = new int[2];
            m5.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.o.getWindowVisibleDisplayFrame(rect2);
            if (this.f9583p == i3) {
            }
            int i12 = i5 == 1 ? 1 : i4;
            this.f9583p = i5;
            if (Build.VERSION.SDK_INT >= 26) {
                n3.f9743l = view;
                i7 = i4;
                i6 = i7;
            } else {
                int[] iArr2 = new int[2];
                this.f9582n.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.f9581m & 7) == 5) {
                    iArr2[i4] = this.f9582n.getWidth() + iArr2[i4];
                    iArr3[i4] = view.getWidth() + iArr3[i4];
                }
                i6 = iArr3[i4] - iArr2[i4];
                i7 = iArr3[1] - iArr2[1];
            }
            if ((this.f9581m & 5) != 5) {
                if (i12 != 0) {
                    width = i6 + view.getWidth();
                    n3.f9737e = width;
                    n3.f9740i = true;
                    n3.f9739h = true;
                    n3.f = i7;
                    n3.f9738g = true;
                }
                width = i6 - m3;
                n3.f9737e = width;
                n3.f9740i = true;
                n3.f9739h = true;
                n3.f = i7;
                n3.f9738g = true;
            } else if (i12 != 0) {
                width = i6 + m3;
                n3.f9737e = width;
                n3.f9740i = true;
                n3.f9739h = true;
                n3.f = i7;
                n3.f9738g = true;
            } else {
                m3 = view.getWidth();
                width = i6 - m3;
                n3.f9737e = width;
                n3.f9740i = true;
                n3.f9739h = true;
                n3.f = i7;
                n3.f9738g = true;
            }
        } else {
            if (this.f9584q) {
                n3.f9737e = this.f9586s;
            }
            if (this.f9585r) {
                n3.f = this.f9587t;
                n3.f9738g = true;
            }
            Rect rect3 = this.f9640a;
            n3.f9750t = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new C1061f(n3, menuC1065j, this.f9583p));
        n3.d();
        M m6 = n3.f9735c;
        m6.setOnKeyListener(this);
        if (c1061f == null && this.v && menuC1065j.f9607l != null) {
            boolean z = i4;
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, m6, z);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(z);
            textView.setText(menuC1065j.f9607l);
            m6.addHeaderView(frameLayout, null, z);
            n3.d();
        }
    }
}
