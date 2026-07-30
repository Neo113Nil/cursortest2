package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0515x;
import androidx.lifecycle.EnumC0506n;
import androidx.lifecycle.EnumC0507o;
import androidx.lifecycle.InterfaceC0511t;
import androidx.lifecycle.InterfaceC0513v;
import com.google.android.gms.internal.ads.CL;
import com.icefishing.icefishingliveapp.C5284R;
import f0.AbstractC4489d;
import f0.C4486a;
import f0.C4488c;
import i0.C4572b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import t0.AbstractC5051n;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final S0.c f5017a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.i f5018b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0485s f5019c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5020d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f5021e = -1;

    public V(S0.c cVar, S0.i iVar, AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s) {
        this.f5017a = cVar;
        this.f5018b = iVar;
        this.f5019c = abstractComponentCallbacksC0485s;
    }

    public final void a() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        if (E8) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0485s);
        }
        Bundle bundle = abstractComponentCallbacksC0485s.f5172u;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        abstractComponentCallbacksC0485s.f5151M.K();
        abstractComponentCallbacksC0485s.f5164n = 3;
        abstractComponentCallbacksC0485s.f5160V = false;
        abstractComponentCallbacksC0485s.l();
        if (!abstractComponentCallbacksC0485s.f5160V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0485s + " did not call through to super.onActivityCreated()");
        }
        if (N.E(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0485s);
        }
        if (abstractComponentCallbacksC0485s.f5162X != null) {
            Bundle bundle3 = abstractComponentCallbacksC0485s.f5172u;
            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0485s.f5174v;
            if (sparseArray != null) {
                abstractComponentCallbacksC0485s.f5162X.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0485s.f5174v = null;
            }
            abstractComponentCallbacksC0485s.f5160V = false;
            abstractComponentCallbacksC0485s.w(bundle4);
            if (!abstractComponentCallbacksC0485s.f5160V) {
                throw new d0("Fragment " + abstractComponentCallbacksC0485s + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0485s.f5162X != null) {
                abstractComponentCallbacksC0485s.f5171t0.a(EnumC0506n.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0485s.f5172u = null;
        O o9 = abstractComponentCallbacksC0485s.f5151M;
        o9.f4954E = false;
        o9.f4955F = false;
        o9.f4960L.f5002f = false;
        o9.t(4);
        this.f5017a.a(abstractComponentCallbacksC0485s, bundle2, false);
    }

    public final void b() {
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s;
        View view;
        View view2;
        int i = -1;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = this.f5019c;
        View view3 = abstractComponentCallbacksC0485s2.f5161W;
        while (true) {
            abstractComponentCallbacksC0485s = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(C5284R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s3 = tag instanceof AbstractComponentCallbacksC0485s ? (AbstractComponentCallbacksC0485s) tag : null;
            if (abstractComponentCallbacksC0485s3 != null) {
                abstractComponentCallbacksC0485s = abstractComponentCallbacksC0485s3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s4 = abstractComponentCallbacksC0485s2.f5152N;
        if (abstractComponentCallbacksC0485s != null && !abstractComponentCallbacksC0485s.equals(abstractComponentCallbacksC0485s4)) {
            int i4 = abstractComponentCallbacksC0485s2.f5154P;
            C4488c c4488c = AbstractC4489d.f37549a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(abstractComponentCallbacksC0485s2);
            sb.append(" within the view of parent fragment ");
            sb.append(abstractComponentCallbacksC0485s);
            sb.append(" via container with ID ");
            AbstractC4489d.b(new C4486a(abstractComponentCallbacksC0485s2, AbstractC5051n.e(i4, " without using parent's childFragmentManager", sb)));
            AbstractC4489d.a(abstractComponentCallbacksC0485s2).getClass();
        }
        S0.i iVar = this.f5018b;
        iVar.getClass();
        ViewGroup viewGroup = abstractComponentCallbacksC0485s2.f5161W;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) iVar.f2901u;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0485s2);
            int i9 = indexOf - 1;
            while (true) {
                if (i9 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s5 = (AbstractComponentCallbacksC0485s) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0485s5.f5161W == viewGroup && (view = abstractComponentCallbacksC0485s5.f5162X) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s6 = (AbstractComponentCallbacksC0485s) arrayList.get(i9);
                    if (abstractComponentCallbacksC0485s6.f5161W == viewGroup && (view2 = abstractComponentCallbacksC0485s6.f5162X) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i9--;
                }
            }
        }
        abstractComponentCallbacksC0485s2.f5161W.addView(abstractComponentCallbacksC0485s2.f5162X, i);
    }

    public final void c() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        if (E8) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0485s);
        }
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = abstractComponentCallbacksC0485s.f5181z;
        V v6 = null;
        S0.i iVar = this.f5018b;
        if (abstractComponentCallbacksC0485s2 != null) {
            V v9 = (V) ((HashMap) iVar.f2902v).get(abstractComponentCallbacksC0485s2.f5178x);
            if (v9 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0485s + " declared target fragment " + abstractComponentCallbacksC0485s.f5181z + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0485s.f5140A = abstractComponentCallbacksC0485s.f5181z.f5178x;
            abstractComponentCallbacksC0485s.f5181z = null;
            v6 = v9;
        } else {
            String str = abstractComponentCallbacksC0485s.f5140A;
            if (str != null && (v6 = (V) ((HashMap) iVar.f2902v).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0485s);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC5051n.g(sb, abstractComponentCallbacksC0485s.f5140A, " that does not belong to this FragmentManager!"));
            }
        }
        if (v6 != null) {
            v6.k();
        }
        N n9 = abstractComponentCallbacksC0485s.f5149K;
        abstractComponentCallbacksC0485s.f5150L = n9.f4980t;
        abstractComponentCallbacksC0485s.f5152N = n9.f4982v;
        S0.c cVar = this.f5017a;
        cVar.i(abstractComponentCallbacksC0485s, false);
        ArrayList arrayList = abstractComponentCallbacksC0485s.f5177w0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0483p) it.next()).a();
        }
        arrayList.clear();
        abstractComponentCallbacksC0485s.f5151M.b(abstractComponentCallbacksC0485s.f5150L, abstractComponentCallbacksC0485s.a(), abstractComponentCallbacksC0485s);
        abstractComponentCallbacksC0485s.f5164n = 0;
        abstractComponentCallbacksC0485s.f5160V = false;
        abstractComponentCallbacksC0485s.n(abstractComponentCallbacksC0485s.f5150L.f5188u);
        if (!abstractComponentCallbacksC0485s.f5160V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0485s + " did not call through to super.onAttach()");
        }
        Iterator it2 = abstractComponentCallbacksC0485s.f5149K.f4973m.iterator();
        while (it2.hasNext()) {
            ((T) it2.next()).a(abstractComponentCallbacksC0485s);
        }
        O o9 = abstractComponentCallbacksC0485s.f5151M;
        o9.f4954E = false;
        o9.f4955F = false;
        o9.f4960L.f5002f = false;
        o9.t(0);
        cVar.d(abstractComponentCallbacksC0485s, false);
    }

    public final int d() {
        Object obj;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        if (abstractComponentCallbacksC0485s.f5149K == null) {
            return abstractComponentCallbacksC0485s.f5164n;
        }
        int i = this.f5021e;
        int ordinal = abstractComponentCallbacksC0485s.f5169r0.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0485s.f5145F) {
            if (abstractComponentCallbacksC0485s.f5146G) {
                i = Math.max(this.f5021e, 2);
                View view = abstractComponentCallbacksC0485s.f5162X;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f5021e < 4 ? Math.min(i, abstractComponentCallbacksC0485s.f5164n) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0485s.f5143D) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0485s.f5161W;
        if (viewGroup != null) {
            C0477j f6 = C0477j.f(viewGroup, abstractComponentCallbacksC0485s.f());
            f6.getClass();
            a0 d2 = f6.d(abstractComponentCallbacksC0485s);
            int i4 = d2 != null ? d2.f5059b : 0;
            Iterator it = f6.f5105c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                a0 a0Var = (a0) obj;
                if (kotlin.jvm.internal.h.a(a0Var.f5060c, abstractComponentCallbacksC0485s) && !a0Var.f5063f) {
                    break;
                }
            }
            a0 a0Var2 = (a0) obj;
            r5 = a0Var2 != null ? a0Var2.f5059b : 0;
            int i9 = i4 == 0 ? -1 : c0.f5083a[AbstractC5088e.d(i4)];
            if (i9 != -1 && i9 != 1) {
                r5 = i4;
            }
        }
        if (r5 == 2) {
            i = Math.min(i, 6);
        } else if (r5 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0485s.f5144E) {
            i = abstractComponentCallbacksC0485s.k() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (abstractComponentCallbacksC0485s.Y && abstractComponentCallbacksC0485s.f5164n < 5) {
            i = Math.min(i, 4);
        }
        if (N.E(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + abstractComponentCallbacksC0485s);
        }
        return i;
    }

    public final void e() {
        Bundle bundle;
        boolean E8 = N.E(3);
        final AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        if (E8) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0485s);
        }
        Bundle bundle2 = abstractComponentCallbacksC0485s.f5172u;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0485s.f5167p0) {
            abstractComponentCallbacksC0485s.f5164n = 1;
            Bundle bundle4 = abstractComponentCallbacksC0485s.f5172u;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC0485s.f5151M.Q(bundle);
            O o9 = abstractComponentCallbacksC0485s.f5151M;
            o9.f4954E = false;
            o9.f4955F = false;
            o9.f4960L.f5002f = false;
            o9.t(1);
            return;
        }
        S0.c cVar = this.f5017a;
        cVar.k(abstractComponentCallbacksC0485s, bundle3, false);
        abstractComponentCallbacksC0485s.f5151M.K();
        abstractComponentCallbacksC0485s.f5164n = 1;
        abstractComponentCallbacksC0485s.f5160V = false;
        abstractComponentCallbacksC0485s.f5170s0.a(new InterfaceC0511t() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.InterfaceC0511t
            public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
                View view;
                if (enumC0506n != EnumC0506n.ON_STOP || (view = AbstractComponentCallbacksC0485s.this.f5162X) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        abstractComponentCallbacksC0485s.o(bundle3);
        abstractComponentCallbacksC0485s.f5167p0 = true;
        if (abstractComponentCallbacksC0485s.f5160V) {
            abstractComponentCallbacksC0485s.f5170s0.e(EnumC0506n.ON_CREATE);
            cVar.e(abstractComponentCallbacksC0485s, bundle3, false);
        } else {
            throw new d0("Fragment " + abstractComponentCallbacksC0485s + " did not call through to super.onCreate()");
        }
    }

    public final void f() {
        String str;
        int i = 1;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        if (abstractComponentCallbacksC0485s.f5145F) {
            return;
        }
        if (N.E(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0485s);
        }
        Bundle bundle = abstractComponentCallbacksC0485s.f5172u;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater s3 = abstractComponentCallbacksC0485s.s(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC0485s.f5161W;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i4 = abstractComponentCallbacksC0485s.f5154P;
            if (i4 != 0) {
                if (i4 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0485s + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0485s.f5149K.f4981u.t(i4);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0485s.f5147H) {
                        try {
                            str = abstractComponentCallbacksC0485s.y().getResources().getResourceName(abstractComponentCallbacksC0485s.f5154P);
                        } catch (Resources.NotFoundException unused) {
                            str = com.anythink.core.common.v.m.f16967e;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0485s.f5154P) + " (" + str + ") for fragment " + abstractComponentCallbacksC0485s);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C4488c c4488c = AbstractC4489d.f37549a;
                    AbstractC4489d.b(new f0.e(abstractComponentCallbacksC0485s, viewGroup, 1));
                    AbstractC4489d.a(abstractComponentCallbacksC0485s).getClass();
                }
            }
        }
        abstractComponentCallbacksC0485s.f5161W = viewGroup;
        abstractComponentCallbacksC0485s.x(s3, viewGroup, bundle2);
        if (abstractComponentCallbacksC0485s.f5162X != null) {
            if (N.E(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC0485s);
            }
            abstractComponentCallbacksC0485s.f5162X.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0485s.f5162X.setTag(C5284R.id.fragment_container_view_tag, abstractComponentCallbacksC0485s);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0485s.f5156R) {
                abstractComponentCallbacksC0485s.f5162X.setVisibility(8);
            }
            View view = abstractComponentCallbacksC0485s.f5162X;
            WeakHashMap weakHashMap = O.X.f2240a;
            if (view.isAttachedToWindow()) {
                O.J.c(abstractComponentCallbacksC0485s.f5162X);
            } else {
                View view2 = abstractComponentCallbacksC0485s.f5162X;
                view2.addOnAttachStateChangeListener(new F3.p(i, view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC0485s.f5172u;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC0485s.f5151M.t(2);
            this.f5017a.p(abstractComponentCallbacksC0485s, abstractComponentCallbacksC0485s.f5162X, bundle2, false);
            int visibility = abstractComponentCallbacksC0485s.f5162X.getVisibility();
            abstractComponentCallbacksC0485s.b().f5137j = abstractComponentCallbacksC0485s.f5162X.getAlpha();
            if (abstractComponentCallbacksC0485s.f5161W != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0485s.f5162X.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0485s.b().f5138k = findFocus;
                    if (N.E(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + abstractComponentCallbacksC0485s);
                    }
                }
                abstractComponentCallbacksC0485s.f5162X.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0485s.f5164n = 2;
    }

    public final void g() {
        AbstractComponentCallbacksC0485s f6;
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        if (E8) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0485s);
        }
        boolean z8 = true;
        boolean z9 = abstractComponentCallbacksC0485s.f5144E && !abstractComponentCallbacksC0485s.k();
        S0.i iVar = this.f5018b;
        if (z9) {
            iVar.q(abstractComponentCallbacksC0485s.f5178x, null);
        }
        if (!z9) {
            S s3 = (S) iVar.f2904x;
            if (!((s3.f4997a.containsKey(abstractComponentCallbacksC0485s.f5178x) && s3.f5000d) ? s3.f5001e : true)) {
                String str = abstractComponentCallbacksC0485s.f5140A;
                if (str != null && (f6 = iVar.f(str)) != null && f6.f5158T) {
                    abstractComponentCallbacksC0485s.f5181z = f6;
                }
                abstractComponentCallbacksC0485s.f5164n = 0;
                return;
            }
        }
        C0489w c0489w = abstractComponentCallbacksC0485s.f5150L;
        if (c0489w != null) {
            z8 = ((S) iVar.f2904x).f5001e;
        } else {
            AbstractActivityC0490x abstractActivityC0490x = c0489w.f5188u;
            if (abstractActivityC0490x != null) {
                z8 = true ^ abstractActivityC0490x.isChangingConfigurations();
            }
        }
        if (z9 || z8) {
            ((S) iVar.f2904x).b(abstractComponentCallbacksC0485s);
        }
        abstractComponentCallbacksC0485s.f5151M.k();
        abstractComponentCallbacksC0485s.f5170s0.e(EnumC0506n.ON_DESTROY);
        abstractComponentCallbacksC0485s.f5164n = 0;
        abstractComponentCallbacksC0485s.f5160V = false;
        abstractComponentCallbacksC0485s.f5167p0 = false;
        abstractComponentCallbacksC0485s.f5160V = true;
        if (!abstractComponentCallbacksC0485s.f5160V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0485s + " did not call through to super.onDestroy()");
        }
        this.f5017a.f(abstractComponentCallbacksC0485s, false);
        Iterator it = iVar.i().iterator();
        while (it.hasNext()) {
            V v6 = (V) it.next();
            if (v6 != null) {
                String str2 = abstractComponentCallbacksC0485s.f5178x;
                AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = v6.f5019c;
                if (str2.equals(abstractComponentCallbacksC0485s2.f5140A)) {
                    abstractComponentCallbacksC0485s2.f5181z = abstractComponentCallbacksC0485s;
                    abstractComponentCallbacksC0485s2.f5140A = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0485s.f5140A;
        if (str3 != null) {
            abstractComponentCallbacksC0485s.f5181z = iVar.f(str3);
        }
        iVar.p(this);
    }

    public final void h() {
        View view;
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        if (E8) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0485s);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0485s.f5161W;
        if (viewGroup != null && (view = abstractComponentCallbacksC0485s.f5162X) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0485s.f5151M.t(1);
        if (abstractComponentCallbacksC0485s.f5162X != null) {
            X x3 = abstractComponentCallbacksC0485s.f5171t0;
            x3.b();
            if (x3.f5033w.f5290d.compareTo(EnumC0507o.f5278v) >= 0) {
                abstractComponentCallbacksC0485s.f5171t0.a(EnumC0506n.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0485s.f5164n = 1;
        abstractComponentCallbacksC0485s.f5160V = false;
        abstractComponentCallbacksC0485s.q();
        if (!abstractComponentCallbacksC0485s.f5160V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0485s + " did not call through to super.onDestroyView()");
        }
        s.l lVar = ((C4572b) new Y2.e(abstractComponentCallbacksC0485s.getViewModelStore(), C4572b.f38273b).t(C4572b.class)).f38274a;
        if (lVar.f40413v > 0) {
            throw D.y.g(lVar.f40412u[0]);
        }
        abstractComponentCallbacksC0485s.f5148I = false;
        this.f5017a.r(abstractComponentCallbacksC0485s, false);
        abstractComponentCallbacksC0485s.f5161W = null;
        abstractComponentCallbacksC0485s.f5162X = null;
        abstractComponentCallbacksC0485s.f5171t0 = null;
        abstractComponentCallbacksC0485s.f5173u0.e(null);
        abstractComponentCallbacksC0485s.f5146G = false;
    }

    public final void i() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        if (E8) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0485s);
        }
        abstractComponentCallbacksC0485s.f5164n = -1;
        abstractComponentCallbacksC0485s.f5160V = false;
        abstractComponentCallbacksC0485s.r();
        if (!abstractComponentCallbacksC0485s.f5160V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0485s + " did not call through to super.onDetach()");
        }
        O o9 = abstractComponentCallbacksC0485s.f5151M;
        if (!o9.f4956G) {
            o9.k();
            abstractComponentCallbacksC0485s.f5151M = new O();
        }
        this.f5017a.g(abstractComponentCallbacksC0485s, false);
        abstractComponentCallbacksC0485s.f5164n = -1;
        abstractComponentCallbacksC0485s.f5150L = null;
        abstractComponentCallbacksC0485s.f5152N = null;
        abstractComponentCallbacksC0485s.f5149K = null;
        if (!abstractComponentCallbacksC0485s.f5144E || abstractComponentCallbacksC0485s.k()) {
            S s3 = (S) this.f5018b.f2904x;
            if (!((s3.f4997a.containsKey(abstractComponentCallbacksC0485s.f5178x) && s3.f5000d) ? s3.f5001e : true)) {
                return;
            }
        }
        if (N.E(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0485s);
        }
        abstractComponentCallbacksC0485s.h();
    }

    public final void j() {
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        if (abstractComponentCallbacksC0485s.f5145F && abstractComponentCallbacksC0485s.f5146G && !abstractComponentCallbacksC0485s.f5148I) {
            if (N.E(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0485s);
            }
            Bundle bundle = abstractComponentCallbacksC0485s.f5172u;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC0485s.x(abstractComponentCallbacksC0485s.s(bundle2), null, bundle2);
            View view = abstractComponentCallbacksC0485s.f5162X;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0485s.f5162X.setTag(C5284R.id.fragment_container_view_tag, abstractComponentCallbacksC0485s);
                if (abstractComponentCallbacksC0485s.f5156R) {
                    abstractComponentCallbacksC0485s.f5162X.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC0485s.f5172u;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC0485s.f5151M.t(2);
                this.f5017a.p(abstractComponentCallbacksC0485s, abstractComponentCallbacksC0485s.f5162X, bundle2, false);
                abstractComponentCallbacksC0485s.f5164n = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        S0.i iVar = this.f5018b;
        boolean z8 = this.f5020d;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        if (z8) {
            if (N.E(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0485s);
                return;
            }
            return;
        }
        try {
            this.f5020d = true;
            boolean z9 = false;
            while (true) {
                int d2 = d();
                int i = abstractComponentCallbacksC0485s.f5164n;
                int i4 = 3;
                if (d2 == i) {
                    if (!z9 && i == -1 && abstractComponentCallbacksC0485s.f5144E && !abstractComponentCallbacksC0485s.k()) {
                        if (N.E(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0485s);
                        }
                        ((S) iVar.f2904x).b(abstractComponentCallbacksC0485s);
                        iVar.p(this);
                        if (N.E(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0485s);
                        }
                        abstractComponentCallbacksC0485s.h();
                    }
                    if (abstractComponentCallbacksC0485s.f5166o0) {
                        if (abstractComponentCallbacksC0485s.f5162X != null && (viewGroup = abstractComponentCallbacksC0485s.f5161W) != null) {
                            C0477j f6 = C0477j.f(viewGroup, abstractComponentCallbacksC0485s.f());
                            if (abstractComponentCallbacksC0485s.f5156R) {
                                f6.getClass();
                                if (N.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0485s);
                                }
                                f6.a(3, 1, this);
                            } else {
                                f6.getClass();
                                if (N.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0485s);
                                }
                                f6.a(2, 1, this);
                            }
                        }
                        N n9 = abstractComponentCallbacksC0485s.f5149K;
                        if (n9 != null && abstractComponentCallbacksC0485s.f5143D && N.F(abstractComponentCallbacksC0485s)) {
                            n9.f4953D = true;
                        }
                        abstractComponentCallbacksC0485s.f5166o0 = false;
                        abstractComponentCallbacksC0485s.f5151M.n();
                    }
                    this.f5020d = false;
                    return;
                }
                if (d2 <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            abstractComponentCallbacksC0485s.f5164n = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0485s.f5146G = false;
                            abstractComponentCallbacksC0485s.f5164n = 2;
                            break;
                        case 3:
                            if (N.E(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0485s);
                            }
                            if (abstractComponentCallbacksC0485s.f5162X != null && abstractComponentCallbacksC0485s.f5174v == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0485s.f5162X != null && (viewGroup2 = abstractComponentCallbacksC0485s.f5161W) != null) {
                                C0477j f9 = C0477j.f(viewGroup2, abstractComponentCallbacksC0485s.f());
                                f9.getClass();
                                if (N.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0485s);
                                }
                                f9.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0485s.f5164n = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0485s.f5164n = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0485s.f5162X != null && (viewGroup3 = abstractComponentCallbacksC0485s.f5161W) != null) {
                                C0477j f10 = C0477j.f(viewGroup3, abstractComponentCallbacksC0485s.f());
                                int visibility = abstractComponentCallbacksC0485s.f5162X.getVisibility();
                                if (visibility == 0) {
                                    i4 = 2;
                                } else if (visibility == 4) {
                                    i4 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                f10.getClass();
                                CL.o(i4, "finalState");
                                if (N.E(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0485s);
                                }
                                f10.a(i4, 2, this);
                            }
                            abstractComponentCallbacksC0485s.f5164n = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0485s.f5164n = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z9 = true;
            }
        } catch (Throwable th) {
            this.f5020d = false;
            throw th;
        }
    }

    public final void l() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        if (E8) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0485s);
        }
        abstractComponentCallbacksC0485s.f5151M.t(5);
        if (abstractComponentCallbacksC0485s.f5162X != null) {
            abstractComponentCallbacksC0485s.f5171t0.a(EnumC0506n.ON_PAUSE);
        }
        abstractComponentCallbacksC0485s.f5170s0.e(EnumC0506n.ON_PAUSE);
        abstractComponentCallbacksC0485s.f5164n = 6;
        abstractComponentCallbacksC0485s.f5160V = true;
        this.f5017a.h(abstractComponentCallbacksC0485s, false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        Bundle bundle = abstractComponentCallbacksC0485s.f5172u;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0485s.f5172u.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0485s.f5172u.putBundle("savedInstanceState", new Bundle());
        }
        abstractComponentCallbacksC0485s.f5174v = abstractComponentCallbacksC0485s.f5172u.getSparseParcelableArray("viewState");
        abstractComponentCallbacksC0485s.f5176w = abstractComponentCallbacksC0485s.f5172u.getBundle("viewRegistryState");
        U u7 = (U) abstractComponentCallbacksC0485s.f5172u.getParcelable(com.anythink.core.express.b.a.f17684b);
        if (u7 != null) {
            abstractComponentCallbacksC0485s.f5140A = u7.f5007E;
            abstractComponentCallbacksC0485s.f5141B = u7.f5008F;
            abstractComponentCallbacksC0485s.f5163Z = u7.f5009G;
        }
        if (abstractComponentCallbacksC0485s.f5163Z) {
            return;
        }
        abstractComponentCallbacksC0485s.Y = true;
    }

    public final void n() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        if (E8) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0485s);
        }
        r rVar = abstractComponentCallbacksC0485s.f5165n0;
        View view = rVar == null ? null : rVar.f5138k;
        if (view != null) {
            if (view != abstractComponentCallbacksC0485s.f5162X) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0485s.f5162X) {
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (N.E(2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(abstractComponentCallbacksC0485s);
                sb.append(" resulting in focused view ");
                sb.append(abstractComponentCallbacksC0485s.f5162X.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        abstractComponentCallbacksC0485s.b().f5138k = null;
        abstractComponentCallbacksC0485s.f5151M.K();
        abstractComponentCallbacksC0485s.f5151M.x(true);
        abstractComponentCallbacksC0485s.f5164n = 7;
        abstractComponentCallbacksC0485s.f5160V = false;
        abstractComponentCallbacksC0485s.f5160V = true;
        if (!abstractComponentCallbacksC0485s.f5160V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0485s + " did not call through to super.onResume()");
        }
        C0515x c0515x = abstractComponentCallbacksC0485s.f5170s0;
        EnumC0506n enumC0506n = EnumC0506n.ON_RESUME;
        c0515x.e(enumC0506n);
        if (abstractComponentCallbacksC0485s.f5162X != null) {
            abstractComponentCallbacksC0485s.f5171t0.f5033w.e(enumC0506n);
        }
        O o9 = abstractComponentCallbacksC0485s.f5151M;
        o9.f4954E = false;
        o9.f4955F = false;
        o9.f4960L.f5002f = false;
        o9.t(7);
        this.f5017a.l(abstractComponentCallbacksC0485s, false);
        this.f5018b.q(abstractComponentCallbacksC0485s.f5178x, null);
        abstractComponentCallbacksC0485s.f5172u = null;
        abstractComponentCallbacksC0485s.f5174v = null;
        abstractComponentCallbacksC0485s.f5176w = null;
    }

    public final void o() {
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        if (abstractComponentCallbacksC0485s.f5162X == null) {
            return;
        }
        if (N.E(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0485s + " with view " + abstractComponentCallbacksC0485s.f5162X);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0485s.f5162X.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0485s.f5174v = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0485s.f5171t0.f5034x.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0485s.f5176w = bundle;
    }

    public final void p() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        if (E8) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0485s);
        }
        abstractComponentCallbacksC0485s.f5151M.K();
        abstractComponentCallbacksC0485s.f5151M.x(true);
        abstractComponentCallbacksC0485s.f5164n = 5;
        abstractComponentCallbacksC0485s.f5160V = false;
        abstractComponentCallbacksC0485s.u();
        if (!abstractComponentCallbacksC0485s.f5160V) {
            throw new d0("Fragment " + abstractComponentCallbacksC0485s + " did not call through to super.onStart()");
        }
        C0515x c0515x = abstractComponentCallbacksC0485s.f5170s0;
        EnumC0506n enumC0506n = EnumC0506n.ON_START;
        c0515x.e(enumC0506n);
        if (abstractComponentCallbacksC0485s.f5162X != null) {
            abstractComponentCallbacksC0485s.f5171t0.f5033w.e(enumC0506n);
        }
        O o9 = abstractComponentCallbacksC0485s.f5151M;
        o9.f4954E = false;
        o9.f4955F = false;
        o9.f4960L.f5002f = false;
        o9.t(5);
        this.f5017a.n(abstractComponentCallbacksC0485s, false);
    }

    public final void q() {
        boolean E8 = N.E(3);
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s = this.f5019c;
        if (E8) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0485s);
        }
        O o9 = abstractComponentCallbacksC0485s.f5151M;
        o9.f4955F = true;
        o9.f4960L.f5002f = true;
        o9.t(4);
        if (abstractComponentCallbacksC0485s.f5162X != null) {
            abstractComponentCallbacksC0485s.f5171t0.a(EnumC0506n.ON_STOP);
        }
        abstractComponentCallbacksC0485s.f5170s0.e(EnumC0506n.ON_STOP);
        abstractComponentCallbacksC0485s.f5164n = 4;
        abstractComponentCallbacksC0485s.f5160V = false;
        abstractComponentCallbacksC0485s.v();
        if (abstractComponentCallbacksC0485s.f5160V) {
            this.f5017a.o(abstractComponentCallbacksC0485s, false);
            return;
        }
        throw new d0("Fragment " + abstractComponentCallbacksC0485s + " did not call through to super.onStop()");
    }

    public V(S0.c cVar, S0.i iVar, ClassLoader classLoader, G g9, Bundle bundle) {
        this.f5017a = cVar;
        this.f5018b = iVar;
        U u7 = (U) bundle.getParcelable(com.anythink.core.express.b.a.f17684b);
        AbstractComponentCallbacksC0485s a9 = g9.a(u7.f5010n);
        a9.f5178x = u7.f5011u;
        a9.f5145F = u7.f5012v;
        a9.f5147H = true;
        a9.f5153O = u7.f5013w;
        a9.f5154P = u7.f5014x;
        a9.f5155Q = u7.f5015y;
        a9.f5158T = u7.f5016z;
        a9.f5144E = u7.f5003A;
        a9.f5157S = u7.f5004B;
        a9.f5156R = u7.f5005C;
        a9.f5169r0 = EnumC0507o.values()[u7.f5006D];
        a9.f5140A = u7.f5007E;
        a9.f5141B = u7.f5008F;
        a9.f5163Z = u7.f5009G;
        this.f5019c = a9;
        a9.f5172u = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a9.B(bundle2);
        if (N.E(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a9);
        }
    }

    public V(S0.c cVar, S0.i iVar, AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s, Bundle bundle) {
        this.f5017a = cVar;
        this.f5018b = iVar;
        this.f5019c = abstractComponentCallbacksC0485s;
        abstractComponentCallbacksC0485s.f5174v = null;
        abstractComponentCallbacksC0485s.f5176w = null;
        abstractComponentCallbacksC0485s.J = 0;
        abstractComponentCallbacksC0485s.f5146G = false;
        abstractComponentCallbacksC0485s.f5143D = false;
        AbstractComponentCallbacksC0485s abstractComponentCallbacksC0485s2 = abstractComponentCallbacksC0485s.f5181z;
        abstractComponentCallbacksC0485s.f5140A = abstractComponentCallbacksC0485s2 != null ? abstractComponentCallbacksC0485s2.f5178x : null;
        abstractComponentCallbacksC0485s.f5181z = null;
        abstractComponentCallbacksC0485s.f5172u = bundle;
        abstractComponentCallbacksC0485s.f5180y = bundle.getBundle("arguments");
    }
}
