package j;

import E.H;
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
import com.rockchicken.pump.up.road.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C1187K;
import k.C1188L;
import k.C1230q;

/* loaded from: classes.dex */
public final class g extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f13620b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13621c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13622d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13623e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f13624f;

    /* renamed from: i, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1170c f13627i;

    /* renamed from: j, reason: collision with root package name */
    public final d f13628j;
    public View n;
    public View o;

    /* renamed from: p, reason: collision with root package name */
    public int f13632p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13633q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13634r;

    /* renamed from: s, reason: collision with root package name */
    public int f13635s;

    /* renamed from: t, reason: collision with root package name */
    public int f13636t;
    public boolean v;

    /* renamed from: w, reason: collision with root package name */
    public o f13638w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f13639x;

    /* renamed from: y, reason: collision with root package name */
    public PopupWindow.OnDismissListener f13640y;
    public boolean z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f13625g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f13626h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final e0.t f13629k = new e0.t(this);

    /* renamed from: l, reason: collision with root package name */
    public int f13630l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f13631m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13637u = false;

    public g(Context context, View view, int i4, boolean z) {
        this.f13627i = new ViewTreeObserverOnGlobalLayoutListenerC1170c(this, r1);
        this.f13628j = new d(this, r1);
        this.f13620b = context;
        this.n = view;
        this.f13622d = i4;
        this.f13623e = z;
        Field field = H.f375a;
        this.f13632p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f13621c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f13624f = new Handler();
    }

    @Override // j.p
    public final boolean b() {
        return false;
    }

    @Override // j.r
    public final boolean c() {
        ArrayList arrayList = this.f13626h;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f13617a.v.isShowing();
    }

    @Override // j.p
    public final void d(j jVar, boolean z) {
        ArrayList arrayList = this.f13626h;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (jVar == ((f) arrayList.get(i4)).f13618b) {
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
            ((f) arrayList.get(i5)).f13618b.c(false);
        }
        f fVar = (f) arrayList.remove(i4);
        j jVar2 = fVar.f13618b;
        C1188L c1188l = fVar.f13617a;
        CopyOnWriteArrayList copyOnWriteArrayList = jVar2.f13663s;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.z) {
            c1188l.v.setExitTransition(null);
            c1188l.v.setAnimationStyle(0);
        }
        c1188l.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f13632p = ((f) arrayList.get(size2 - 1)).f13619c;
        } else {
            View view = this.n;
            Field field = H.f375a;
            this.f13632p = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((f) arrayList.get(0)).f13618b.c(false);
                return;
            }
            return;
        }
        dismiss();
        o oVar = this.f13638w;
        if (oVar != null) {
            oVar.d(jVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f13639x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f13639x.removeGlobalOnLayoutListener(this.f13627i);
            }
            this.f13639x = null;
        }
        this.o.removeOnAttachStateChangeListener(this.f13628j);
        this.f13640y.onDismiss();
    }

    @Override // j.r
    public final void dismiss() {
        ArrayList arrayList = this.f13626h;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                f fVar = fVarArr[i4];
                if (fVar.f13617a.v.isShowing()) {
                    fVar.f13617a.dismiss();
                }
            }
        }
    }

    @Override // j.p
    public final void e(o oVar) {
        this.f13638w = oVar;
    }

    @Override // j.p
    public final boolean f(t tVar) {
        ArrayList arrayList = this.f13626h;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            f fVar = (f) obj;
            if (tVar == fVar.f13618b) {
                fVar.f13617a.f13925c.requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        k(tVar);
        o oVar = this.f13638w;
        if (oVar != null) {
            oVar.r(tVar);
        }
        return true;
    }

    @Override // j.p
    public final void g() {
        ArrayList arrayList = this.f13626h;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ListAdapter adapter = ((f) obj).f13617a.f13925c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override // j.r
    public final ListView h() {
        ArrayList arrayList = this.f13626h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f13617a.f13925c;
    }

    @Override // j.l
    public final void k(j jVar) {
        jVar.b(this, this.f13620b);
        if (c()) {
            t(jVar);
        } else {
            this.f13625g.add(jVar);
        }
    }

    @Override // j.l
    public final void m(View view) {
        if (this.n != view) {
            this.n = view;
            int i4 = this.f13630l;
            Field field = H.f375a;
            this.f13631m = Gravity.getAbsoluteGravity(i4, view.getLayoutDirection());
        }
    }

    @Override // j.l
    public final void n(boolean z) {
        this.f13637u = z;
    }

    @Override // j.l
    public final void o(int i4) {
        if (this.f13630l != i4) {
            this.f13630l = i4;
            View view = this.n;
            Field field = H.f375a;
            this.f13631m = Gravity.getAbsoluteGravity(i4, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f13626h;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i4);
            if (!fVar.f13617a.v.isShowing()) {
                break;
            } else {
                i4++;
            }
        }
        if (fVar != null) {
            fVar.f13618b.c(false);
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

    @Override // j.l
    public final void p(int i4) {
        this.f13633q = true;
        this.f13635s = i4;
    }

    @Override // j.l
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.f13640y = onDismissListener;
    }

    @Override // j.l
    public final void r(boolean z) {
        this.v = z;
    }

    @Override // j.l
    public final void s(int i4) {
        this.f13634r = true;
        this.f13636t = i4;
    }

    @Override // j.r
    public final void show() {
        if (c()) {
            return;
        }
        ArrayList arrayList = this.f13625g;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            t((j) obj);
        }
        arrayList.clear();
        View view = this.n;
        this.o = view;
        if (view != null) {
            boolean z = this.f13639x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f13639x = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f13627i);
            }
            this.o.addOnAttachStateChangeListener(this.f13628j);
        }
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
    public final void t(j jVar) {
        boolean z;
        int i4;
        int i5;
        f fVar;
        View view;
        int i6;
        int i7;
        int i8;
        int width;
        MenuItem menuItem;
        h hVar;
        int i9;
        int firstVisiblePosition;
        Context context = this.f13620b;
        LayoutInflater from = LayoutInflater.from(context);
        h hVar2 = new h(jVar, from, this.f13623e, R.layout.abc_cascading_menu_item_layout);
        if (!c() && this.f13637u) {
            hVar2.f13643c = true;
        } else if (c()) {
            int size = jVar.f13652f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = jVar.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i10++;
            }
            hVar2.f13643c = z;
        }
        int l4 = l.l(hVar2, context, this.f13621c);
        C1188L c1188l = new C1188L(context, this.f13622d);
        c1188l.f13944y = this.f13629k;
        c1188l.f13935m = this;
        c1188l.v.setOnDismissListener(this);
        c1188l.f13934l = this.n;
        c1188l.f13932j = this.f13631m;
        c1188l.f13941u = true;
        c1188l.v.setFocusable(true);
        c1188l.v.setInputMethodMode(2);
        c1188l.a(hVar2);
        Drawable background = c1188l.v.getBackground();
        if (background != null) {
            Rect rect = c1188l.f13939s;
            background.getPadding(rect);
            c1188l.f13926d = rect.left + rect.right + l4;
        } else {
            c1188l.f13926d = l4;
        }
        c1188l.f13932j = this.f13631m;
        ArrayList arrayList = this.f13626h;
        if (arrayList.size() > 0) {
            fVar = (f) arrayList.get(arrayList.size() - 1);
            j jVar2 = fVar.f13618b;
            int size2 = jVar2.f13652f.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = jVar2.getItem(i11);
                if (menuItem.hasSubMenu() && jVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i11++;
                }
            }
            if (menuItem == null) {
                i4 = 1;
                view = null;
                i5 = 0;
            } else {
                C1187K c1187k = fVar.f13617a.f13925c;
                ListAdapter adapter = c1187k.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i9 = headerViewListAdapter.getHeadersCount();
                    hVar = (h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    hVar = (h) adapter;
                    i9 = 0;
                }
                int count = hVar.getCount();
                i4 = 1;
                int i12 = 0;
                i5 = 0;
                while (true) {
                    if (i12 >= count) {
                        i12 = -1;
                        break;
                    } else if (menuItem == hVar.getItem(i12)) {
                        break;
                    } else {
                        i12++;
                    }
                }
                view = (i12 != -1 && (firstVisiblePosition = (i12 + i9) - c1187k.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c1187k.getChildCount()) ? c1187k.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i4 = 1;
            i5 = 0;
            fVar = null;
            view = null;
        }
        if (view != null) {
            int i13 = Build.VERSION.SDK_INT;
            C1230q c1230q = c1188l.v;
            if (i13 <= 28) {
                Method method = C1188L.z;
                if (method != null) {
                    try {
                        method.invoke(c1230q, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                c1230q.setTouchModal(false);
            }
            c1188l.v.setEnterTransition(null);
            C1187K c1187k2 = ((f) arrayList.get(arrayList.size() - 1)).f13617a.f13925c;
            int[] iArr = new int[2];
            c1187k2.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.o.getWindowVisibleDisplayFrame(rect2);
            if (this.f13632p == i4) {
            }
            int i14 = i6 == 1 ? 1 : i5;
            this.f13632p = i6;
            if (Build.VERSION.SDK_INT >= 26) {
                c1188l.f13934l = view;
                i8 = i5;
                i7 = i8;
            } else {
                int[] iArr2 = new int[2];
                this.n.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.f13631m & 7) == 5) {
                    iArr2[i5] = this.n.getWidth() + iArr2[i5];
                    iArr3[i5] = view.getWidth() + iArr3[i5];
                }
                i7 = iArr3[i5] - iArr2[i5];
                i8 = iArr3[1] - iArr2[1];
            }
            if ((this.f13631m & 5) != 5) {
                if (i14 != 0) {
                    width = i7 + view.getWidth();
                    c1188l.f13927e = width;
                    c1188l.f13931i = true;
                    c1188l.f13930h = true;
                    c1188l.f13928f = i8;
                    c1188l.f13929g = true;
                }
                width = i7 - l4;
                c1188l.f13927e = width;
                c1188l.f13931i = true;
                c1188l.f13930h = true;
                c1188l.f13928f = i8;
                c1188l.f13929g = true;
            } else if (i14 != 0) {
                width = i7 + l4;
                c1188l.f13927e = width;
                c1188l.f13931i = true;
                c1188l.f13930h = true;
                c1188l.f13928f = i8;
                c1188l.f13929g = true;
            } else {
                l4 = view.getWidth();
                width = i7 - l4;
                c1188l.f13927e = width;
                c1188l.f13931i = true;
                c1188l.f13930h = true;
                c1188l.f13928f = i8;
                c1188l.f13929g = true;
            }
        } else {
            if (this.f13633q) {
                c1188l.f13927e = this.f13635s;
            }
            if (this.f13634r) {
                c1188l.f13928f = this.f13636t;
                c1188l.f13929g = true;
            }
            Rect rect3 = this.f13690a;
            c1188l.f13940t = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new f(c1188l, jVar, this.f13632p));
        c1188l.show();
        C1187K c1187k3 = c1188l.f13925c;
        c1187k3.setOnKeyListener(this);
        if (fVar == null && this.v && jVar.f13658l != null) {
            boolean z4 = i5;
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, c1187k3, z4);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(z4);
            textView.setText(jVar.f13658l);
            c1187k3.addHeaderView(frameLayout, null, z4);
            c1188l.show();
        }
    }
}
