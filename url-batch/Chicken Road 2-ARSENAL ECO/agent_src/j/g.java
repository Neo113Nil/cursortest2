package j;

import D.D;
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
import com.strategylink.Row.Five.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.P;
import k.Q;

/* loaded from: classes.dex */
public final class g extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public boolean f4764A;

    /* renamed from: B, reason: collision with root package name */
    public o f4765B;

    /* renamed from: C, reason: collision with root package name */
    public ViewTreeObserver f4766C;

    /* renamed from: D, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4767D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f4768E;

    /* renamed from: g, reason: collision with root package name */
    public final Context f4769g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4770h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4771i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4772j;

    /* renamed from: k, reason: collision with root package name */
    public final Handler f4773k;

    /* renamed from: n, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0433c f4776n;

    /* renamed from: o, reason: collision with root package name */
    public final d f4777o;

    /* renamed from: s, reason: collision with root package name */
    public View f4781s;

    /* renamed from: t, reason: collision with root package name */
    public View f4782t;

    /* renamed from: u, reason: collision with root package name */
    public int f4783u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4784v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4785w;

    /* renamed from: x, reason: collision with root package name */
    public int f4786x;
    public int y;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4774l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f4775m = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final V5.g f4778p = new V5.g(10, this);

    /* renamed from: q, reason: collision with root package name */
    public int f4779q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f4780r = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4787z = false;

    public g(Context context, View view, int i7, boolean z5) {
        this.f4776n = new ViewTreeObserverOnGlobalLayoutListenerC0433c(this, r1);
        this.f4777o = new d(this, r1);
        this.f4769g = context;
        this.f4781s = view;
        this.f4771i = i7;
        this.f4772j = z5;
        Field field = D.f240a;
        this.f4783u = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f4770h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4773k = new Handler();
    }

    @Override // j.p
    public final void a(j jVar, boolean z5) {
        ArrayList arrayList = this.f4775m;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (jVar == ((f) arrayList.get(i7)).f4762b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0) {
            return;
        }
        int i8 = i7 + 1;
        if (i8 < arrayList.size()) {
            ((f) arrayList.get(i8)).f4762b.c(false);
        }
        f fVar = (f) arrayList.remove(i7);
        j jVar2 = fVar.f4762b;
        Q q6 = fVar.f4761a;
        CopyOnWriteArrayList copyOnWriteArrayList = jVar2.f4812r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.f4768E) {
            q6.f4935A.setExitTransition(null);
            q6.f4935A.setAnimationStyle(0);
        }
        q6.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f4783u = ((f) arrayList.get(size2 - 1)).f4763c;
        } else {
            View view = this.f4781s;
            Field field = D.f240a;
            this.f4783u = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z5) {
                ((f) arrayList.get(0)).f4762b.c(false);
                return;
            }
            return;
        }
        dismiss();
        o oVar = this.f4765B;
        if (oVar != null) {
            oVar.a(jVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f4766C;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f4766C.removeGlobalOnLayoutListener(this.f4776n);
            }
            this.f4766C = null;
        }
        this.f4782t.removeOnAttachStateChangeListener(this.f4777o);
        this.f4767D.onDismiss();
    }

    @Override // j.r
    public final void b() {
        if (h()) {
            return;
        }
        ArrayList arrayList = this.f4774l;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            u((j) obj);
        }
        arrayList.clear();
        View view = this.f4781s;
        this.f4782t = view;
        if (view != null) {
            boolean z5 = this.f4766C == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f4766C = viewTreeObserver;
            if (z5) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f4776n);
            }
            this.f4782t.addOnAttachStateChangeListener(this.f4777o);
        }
    }

    @Override // j.p
    public final void d() {
        ArrayList arrayList = this.f4775m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ListAdapter adapter = ((f) obj).f4761a.f4938h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override // j.r
    public final void dismiss() {
        ArrayList arrayList = this.f4775m;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                f fVar = fVarArr[i7];
                if (fVar.f4761a.f4935A.isShowing()) {
                    fVar.f4761a.dismiss();
                }
            }
        }
    }

    @Override // j.r
    public final ListView e() {
        ArrayList arrayList = this.f4775m;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f4761a.f4938h;
    }

    @Override // j.p
    public final boolean g() {
        return false;
    }

    @Override // j.r
    public final boolean h() {
        ArrayList arrayList = this.f4775m;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f4761a.f4935A.isShowing();
    }

    @Override // j.p
    public final void j(o oVar) {
        this.f4765B = oVar;
    }

    @Override // j.p
    public final boolean k(t tVar) {
        ArrayList arrayList = this.f4775m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            f fVar = (f) obj;
            if (tVar == fVar.f4762b) {
                fVar.f4761a.f4938h.requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        l(tVar);
        o oVar = this.f4765B;
        if (oVar != null) {
            oVar.b(tVar);
        }
        return true;
    }

    @Override // j.l
    public final void l(j jVar) {
        jVar.b(this, this.f4769g);
        if (h()) {
            u(jVar);
        } else {
            this.f4774l.add(jVar);
        }
    }

    @Override // j.l
    public final void n(View view) {
        if (this.f4781s != view) {
            this.f4781s = view;
            int i7 = this.f4779q;
            Field field = D.f240a;
            this.f4780r = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        }
    }

    @Override // j.l
    public final void o(boolean z5) {
        this.f4787z = z5;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f4775m;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i7);
            if (!fVar.f4761a.f4935A.isShowing()) {
                break;
            } else {
                i7++;
            }
        }
        if (fVar != null) {
            fVar.f4762b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // j.l
    public final void p(int i7) {
        if (this.f4779q != i7) {
            this.f4779q = i7;
            View view = this.f4781s;
            Field field = D.f240a;
            this.f4780r = Gravity.getAbsoluteGravity(i7, view.getLayoutDirection());
        }
    }

    @Override // j.l
    public final void q(int i7) {
        this.f4784v = true;
        this.f4786x = i7;
    }

    @Override // j.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f4767D = onDismissListener;
    }

    @Override // j.l
    public final void s(boolean z5) {
        this.f4764A = z5;
    }

    @Override // j.l
    public final void t(int i7) {
        this.f4785w = true;
        this.y = i7;
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
    public final void u(j jVar) {
        boolean z5;
        int i7;
        int i8;
        f fVar;
        View view;
        int i9;
        int i10;
        int i11;
        int width;
        MenuItem menuItem;
        h hVar;
        int i12;
        int firstVisiblePosition;
        Context context = this.f4769g;
        LayoutInflater from = LayoutInflater.from(context);
        h hVar2 = new h(jVar, from, this.f4772j, R.layout.abc_cascading_menu_item_layout);
        if (!h() && this.f4787z) {
            hVar2.f4790h = true;
        } else if (h()) {
            int size = jVar.f4800f.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z5 = false;
                    break;
                }
                MenuItem item = jVar.getItem(i13);
                if (item.isVisible() && item.getIcon() != null) {
                    z5 = true;
                    break;
                }
                i13++;
            }
            hVar2.f4790h = z5;
        }
        int m4 = l.m(hVar2, context, this.f4770h);
        Q q6 = new Q(context, this.f4771i);
        q6.f4961D = this.f4778p;
        q6.f4948r = this;
        q6.f4935A.setOnDismissListener(this);
        q6.f4947q = this.f4781s;
        q6.f4945o = this.f4780r;
        q6.f4955z = true;
        q6.f4935A.setFocusable(true);
        q6.f4935A.setInputMethodMode(2);
        q6.a(hVar2);
        Drawable background = q6.f4935A.getBackground();
        if (background != null) {
            Rect rect = q6.f4954x;
            background.getPadding(rect);
            q6.f4939i = rect.left + rect.right + m4;
        } else {
            q6.f4939i = m4;
        }
        q6.f4945o = this.f4780r;
        ArrayList arrayList = this.f4775m;
        if (arrayList.size() > 0) {
            fVar = (f) arrayList.get(arrayList.size() - 1);
            j jVar2 = fVar.f4762b;
            int size2 = jVar2.f4800f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = jVar2.getItem(i14);
                if (menuItem.hasSubMenu() && jVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i14++;
                }
            }
            if (menuItem == null) {
                i7 = 1;
                view = null;
                i8 = 0;
            } else {
                P p4 = fVar.f4761a.f4938h;
                ListAdapter adapter = p4.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i12 = headerViewListAdapter.getHeadersCount();
                    hVar = (h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    hVar = (h) adapter;
                    i12 = 0;
                }
                int count = hVar.getCount();
                i7 = 1;
                int i15 = 0;
                i8 = 0;
                while (true) {
                    if (i15 >= count) {
                        i15 = -1;
                        break;
                    } else if (menuItem == hVar.getItem(i15)) {
                        break;
                    } else {
                        i15++;
                    }
                }
                view = (i15 != -1 && (firstVisiblePosition = (i15 + i12) - p4.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < p4.getChildCount()) ? p4.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i7 = 1;
            i8 = 0;
            fVar = null;
            view = null;
        }
        if (view != null) {
            int i16 = Build.VERSION.SDK_INT;
            k.r rVar = q6.f4935A;
            if (i16 <= 28) {
                Method method = Q.f4960E;
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
            q6.f4935A.setEnterTransition(null);
            P p6 = ((f) arrayList.get(arrayList.size() - 1)).f4761a.f4938h;
            int[] iArr = new int[2];
            p6.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f4782t.getWindowVisibleDisplayFrame(rect2);
            if (this.f4783u == i7) {
            }
            int i17 = i9 == 1 ? 1 : i8;
            this.f4783u = i9;
            if (Build.VERSION.SDK_INT >= 26) {
                q6.f4947q = view;
                i11 = i8;
                i10 = i11;
            } else {
                int[] iArr2 = new int[2];
                this.f4781s.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.f4780r & 7) == 5) {
                    iArr2[i8] = this.f4781s.getWidth() + iArr2[i8];
                    iArr3[i8] = view.getWidth() + iArr3[i8];
                }
                i10 = iArr3[i8] - iArr2[i8];
                i11 = iArr3[1] - iArr2[1];
            }
            if ((this.f4780r & 5) != 5) {
                if (i17 != 0) {
                    width = i10 + view.getWidth();
                    q6.f4940j = width;
                    q6.f4944n = true;
                    q6.f4943m = true;
                    q6.f4941k = i11;
                    q6.f4942l = true;
                }
                width = i10 - m4;
                q6.f4940j = width;
                q6.f4944n = true;
                q6.f4943m = true;
                q6.f4941k = i11;
                q6.f4942l = true;
            } else if (i17 != 0) {
                width = i10 + m4;
                q6.f4940j = width;
                q6.f4944n = true;
                q6.f4943m = true;
                q6.f4941k = i11;
                q6.f4942l = true;
            } else {
                m4 = view.getWidth();
                width = i10 - m4;
                q6.f4940j = width;
                q6.f4944n = true;
                q6.f4943m = true;
                q6.f4941k = i11;
                q6.f4942l = true;
            }
        } else {
            if (this.f4784v) {
                q6.f4940j = this.f4786x;
            }
            if (this.f4785w) {
                q6.f4941k = this.y;
                q6.f4942l = true;
            }
            Rect rect3 = this.f4842f;
            q6.y = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new f(q6, jVar, this.f4783u));
        q6.b();
        P p7 = q6.f4938h;
        p7.setOnKeyListener(this);
        if (fVar == null && this.f4764A && jVar.f4806l != null) {
            boolean z6 = i8;
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, p7, z6);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(z6);
            textView.setText(jVar.f4806l);
            p7.addHeaderView(frameLayout, null, z6);
            q6.b();
        }
    }
}
