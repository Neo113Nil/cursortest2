package androidx.fragment.app;

import X.c;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.view.InterfaceC1323x;
import androidx.fragment.app.z;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.InterfaceC1354u;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import c.InterfaceC1375a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.b9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import d.AbstractC2398a;
import h0.C2435d;
import h0.InterfaceC2437f;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class FragmentManager {

    /* renamed from: S, reason: collision with root package name */
    private static boolean f12314S = false;

    /* renamed from: D, reason: collision with root package name */
    private ActivityResultLauncher f12318D;

    /* renamed from: E, reason: collision with root package name */
    private ActivityResultLauncher f12319E;

    /* renamed from: F, reason: collision with root package name */
    private ActivityResultLauncher f12320F;

    /* renamed from: H, reason: collision with root package name */
    private boolean f12322H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f12323I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f12324J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f12325K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f12326L;

    /* renamed from: M, reason: collision with root package name */
    private ArrayList f12327M;

    /* renamed from: N, reason: collision with root package name */
    private ArrayList f12328N;

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f12329O;

    /* renamed from: P, reason: collision with root package name */
    private v f12330P;

    /* renamed from: Q, reason: collision with root package name */
    private c.C0067c f12331Q;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12334b;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f12336d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f12337e;

    /* renamed from: g, reason: collision with root package name */
    private androidx.activity.w f12339g;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f12345m;

    /* renamed from: v, reason: collision with root package name */
    private androidx.fragment.app.m f12354v;

    /* renamed from: w, reason: collision with root package name */
    private androidx.fragment.app.j f12355w;

    /* renamed from: x, reason: collision with root package name */
    private Fragment f12356x;

    /* renamed from: y, reason: collision with root package name */
    Fragment f12357y;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f12333a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final y f12335c = new y();

    /* renamed from: f, reason: collision with root package name */
    private final n f12338f = new n(this);

    /* renamed from: h, reason: collision with root package name */
    private final androidx.activity.v f12340h = new b(false);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f12341i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    private final Map f12342j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    private final Map f12343k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    private final Map f12344l = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    private final o f12346n = new o(this);

    /* renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList f12347o = new CopyOnWriteArrayList();

    /* renamed from: p, reason: collision with root package name */
    private final A.a f12348p = new A.a() { // from class: androidx.fragment.app.p
        @Override // A.a
        public final void accept(Object obj) {
            FragmentManager.e(FragmentManager.this, (Configuration) obj);
        }
    };

    /* renamed from: q, reason: collision with root package name */
    private final A.a f12349q = new A.a() { // from class: androidx.fragment.app.q
        @Override // A.a
        public final void accept(Object obj) {
            FragmentManager.a(FragmentManager.this, (Integer) obj);
        }
    };

    /* renamed from: r, reason: collision with root package name */
    private final A.a f12350r = new A.a() { // from class: androidx.fragment.app.r
        @Override // A.a
        public final void accept(Object obj) {
            FragmentManager.d(FragmentManager.this, (androidx.core.app.p) obj);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    private final A.a f12351s = new A.a() { // from class: androidx.fragment.app.s
        @Override // A.a
        public final void accept(Object obj) {
            FragmentManager.c(FragmentManager.this, (androidx.core.app.z) obj);
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private final androidx.core.view.C f12352t = new c();

    /* renamed from: u, reason: collision with root package name */
    int f12353u = -1;

    /* renamed from: z, reason: collision with root package name */
    private androidx.fragment.app.l f12358z = null;

    /* renamed from: A, reason: collision with root package name */
    private androidx.fragment.app.l f12315A = new d();

    /* renamed from: B, reason: collision with root package name */
    private H f12316B = null;

    /* renamed from: C, reason: collision with root package name */
    private H f12317C = new e();

    /* renamed from: G, reason: collision with root package name */
    ArrayDeque f12321G = new ArrayDeque();

    /* renamed from: R, reason: collision with root package name */
    private Runnable f12332R = new f();

    class a implements InterfaceC1375a {
        a() {
        }

        @Override // c.InterfaceC1375a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                iArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f12321G.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfo.f12359b;
            int i5 = launchedFragmentInfo.f12360c;
            Fragment i6 = FragmentManager.this.f12335c.i(str);
            if (i6 != null) {
                i6.onRequestPermissionsResult(i5, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    class b extends androidx.activity.v {
        b(boolean z4) {
            super(z4);
        }

        @Override // androidx.activity.v
        public void handleOnBackPressed() {
            FragmentManager.this.C0();
        }
    }

    class c implements androidx.core.view.C {
        c() {
        }

        @Override // androidx.core.view.C
        public boolean a(MenuItem menuItem) {
            return FragmentManager.this.J(menuItem);
        }

        @Override // androidx.core.view.C
        public void b(Menu menu) {
            FragmentManager.this.K(menu);
        }

        @Override // androidx.core.view.C
        public void c(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.C(menu, menuInflater);
        }

        @Override // androidx.core.view.C
        public void d(Menu menu) {
            FragmentManager.this.O(menu);
        }
    }

    class d extends androidx.fragment.app.l {
        d() {
        }

        @Override // androidx.fragment.app.l
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.t0().b(FragmentManager.this.t0().f(), str, null);
        }
    }

    class e implements H {
        e() {
        }

        @Override // androidx.fragment.app.H
        public G a(ViewGroup viewGroup) {
            return new C1327b(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.a0(true);
        }
    }

    class g implements w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f12367a;

        g(Fragment fragment) {
            this.f12367a = fragment;
        }

        @Override // androidx.fragment.app.w
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.f12367a.onAttachFragment(fragment);
        }
    }

    class h implements InterfaceC1375a {
        h() {
        }

        @Override // c.InterfaceC1375a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f12321G.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfo.f12359b;
            int i4 = launchedFragmentInfo.f12360c;
            Fragment i5 = FragmentManager.this.f12335c.i(str);
            if (i5 != null) {
                i5.onActivityResult(i4, activityResult.d(), activityResult.c());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    class i implements InterfaceC1375a {
        i() {
        }

        @Override // c.InterfaceC1375a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfo = (LaunchedFragmentInfo) FragmentManager.this.f12321G.pollFirst();
            if (launchedFragmentInfo == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfo.f12359b;
            int i4 = launchedFragmentInfo.f12360c;
            Fragment i5 = FragmentManager.this.f12335c.i(str);
            if (i5 != null) {
                i5.onActivityResult(i4, activityResult.d(), activityResult.c());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    static class j extends AbstractC2398a {
        j() {
        }

        @Override // d.AbstractC2398a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent c4 = intentSenderRequest.c();
            if (c4 != null && (bundleExtra = c4.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                c4.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (c4.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest.a(intentSenderRequest.f()).b(null).c(intentSenderRequest.e(), intentSenderRequest.d()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // d.AbstractC2398a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ActivityResult c(int i4, Intent intent) {
            return new ActivityResult(i4, intent);
        }
    }

    public interface k {
        void onBackStackChanged();
    }

    interface l {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    private class m implements l {

        /* renamed from: a, reason: collision with root package name */
        final String f12371a;

        /* renamed from: b, reason: collision with root package name */
        final int f12372b;

        /* renamed from: c, reason: collision with root package name */
        final int f12373c;

        m(String str, int i4, int i5) {
            this.f12371a = str;
            this.f12372b = i4;
            this.f12373c = i5;
        }

        @Override // androidx.fragment.app.FragmentManager.l
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = FragmentManager.this.f12357y;
            if (fragment == null || this.f12372b >= 0 || this.f12371a != null || !fragment.getChildFragmentManager().Y0()) {
                return FragmentManager.this.b1(arrayList, arrayList2, this.f12371a, this.f12372b, this.f12373c);
            }
            return false;
        }
    }

    static Fragment A0(View view) {
        Object tag = view.getTag(W.b.f9591a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean G0(int i4) {
        return f12314S || Log.isLoggable("FragmentManager", i4);
    }

    private boolean H0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.p();
    }

    private boolean I0() {
        Fragment fragment = this.f12356x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f12356x.getParentFragmentManager().I0();
    }

    private void L(Fragment fragment) {
        if (fragment == null || !fragment.equals(e0(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    private void S(int i4) {
        try {
            this.f12334b = true;
            this.f12335c.d(i4);
            R0(i4, false);
            Iterator it = t().iterator();
            while (it.hasNext()) {
                ((G) it.next()).j();
            }
            this.f12334b = false;
            a0(true);
        } catch (Throwable th) {
            this.f12334b = false;
            throw th;
        }
    }

    private void V() {
        if (this.f12326L) {
            this.f12326L = false;
            q1();
        }
    }

    private void X() {
        Iterator it = t().iterator();
        while (it.hasNext()) {
            ((G) it.next()).j();
        }
    }

    private void Z(boolean z4) {
        if (this.f12334b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f12354v == null) {
            if (!this.f12325K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f12354v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z4) {
            q();
        }
        if (this.f12327M == null) {
            this.f12327M = new ArrayList();
            this.f12328N = new ArrayList();
        }
    }

    public static /* synthetic */ void a(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.I0() && num.intValue() == 80) {
            fragmentManager.F(false);
        }
    }

    private boolean a1(String str, int i4, int i5) {
        a0(false);
        Z(true);
        Fragment fragment = this.f12357y;
        if (fragment != null && i4 < 0 && str == null && fragment.getChildFragmentManager().Y0()) {
            return true;
        }
        boolean b12 = b1(this.f12327M, this.f12328N, str, i4, i5);
        if (b12) {
            this.f12334b = true;
            try {
                e1(this.f12327M, this.f12328N);
            } finally {
                r();
            }
        }
        s1();
        V();
        this.f12335c.b();
        return b12;
    }

    public static /* synthetic */ void c(FragmentManager fragmentManager, androidx.core.app.z zVar) {
        if (fragmentManager.I0()) {
            fragmentManager.N(zVar.a(), false);
        }
    }

    private static void c0(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        while (i4 < i5) {
            C1326a c1326a = (C1326a) arrayList.get(i4);
            if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                c1326a.r(-1);
                c1326a.w();
            } else {
                c1326a.r(1);
                c1326a.v();
            }
            i4++;
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, androidx.core.app.p pVar) {
        if (fragmentManager.I0()) {
            fragmentManager.G(pVar.a(), false);
        }
    }

    private void d0(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        boolean z4 = ((C1326a) arrayList.get(i4)).f12548r;
        ArrayList arrayList3 = this.f12329O;
        if (arrayList3 == null) {
            this.f12329O = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f12329O.addAll(this.f12335c.o());
        Fragment x02 = x0();
        boolean z5 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C1326a c1326a = (C1326a) arrayList.get(i6);
            x02 = !((Boolean) arrayList2.get(i6)).booleanValue() ? c1326a.x(this.f12329O, x02) : c1326a.A(this.f12329O, x02);
            z5 = z5 || c1326a.f12539i;
        }
        this.f12329O.clear();
        if (!z4 && this.f12353u >= 1) {
            for (int i7 = i4; i7 < i5; i7++) {
                ArrayList arrayList4 = ((C1326a) arrayList.get(i7)).f12533c;
                int size = arrayList4.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList4.get(i8);
                    i8++;
                    Fragment fragment = ((z.a) obj).f12551b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f12335c.r(v(fragment));
                    }
                }
            }
        }
        c0(arrayList, arrayList2, i4, i5);
        boolean booleanValue = ((Boolean) arrayList2.get(i5 - 1)).booleanValue();
        for (int i9 = i4; i9 < i5; i9++) {
            C1326a c1326a2 = (C1326a) arrayList.get(i9);
            if (booleanValue) {
                for (int size2 = c1326a2.f12533c.size() - 1; size2 >= 0; size2--) {
                    Fragment fragment2 = ((z.a) c1326a2.f12533c.get(size2)).f12551b;
                    if (fragment2 != null) {
                        v(fragment2).m();
                    }
                }
            } else {
                ArrayList arrayList5 = c1326a2.f12533c;
                int size3 = arrayList5.size();
                int i10 = 0;
                while (i10 < size3) {
                    Object obj2 = arrayList5.get(i10);
                    i10++;
                    Fragment fragment3 = ((z.a) obj2).f12551b;
                    if (fragment3 != null) {
                        v(fragment3).m();
                    }
                }
            }
        }
        R0(this.f12353u, true);
        for (G g4 : u(arrayList, i4, i5)) {
            g4.r(booleanValue);
            g4.p();
            g4.g();
        }
        while (i4 < i5) {
            C1326a c1326a3 = (C1326a) arrayList.get(i4);
            if (((Boolean) arrayList2.get(i4)).booleanValue() && c1326a3.f12428v >= 0) {
                c1326a3.f12428v = -1;
            }
            c1326a3.z();
            i4++;
        }
        if (z5) {
            g1();
        }
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.I0()) {
            fragmentManager.z(configuration, false);
        }
    }

    private void e1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            if (!((C1326a) arrayList.get(i4)).f12548r) {
                if (i5 != i4) {
                    d0(arrayList, arrayList2, i5, i4);
                }
                i5 = i4 + 1;
                if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                    while (i5 < size && ((Boolean) arrayList2.get(i5)).booleanValue() && !((C1326a) arrayList.get(i5)).f12548r) {
                        i5++;
                    }
                }
                d0(arrayList, arrayList2, i4, i5);
                i4 = i5 - 1;
            }
            i4++;
        }
        if (i5 != size) {
            d0(arrayList, arrayList2, i5, size);
        }
    }

    private int f0(String str, int i4, boolean z4) {
        ArrayList arrayList = this.f12336d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i4 < 0) {
            if (z4) {
                return 0;
            }
            return this.f12336d.size() - 1;
        }
        int size = this.f12336d.size() - 1;
        while (size >= 0) {
            C1326a c1326a = (C1326a) this.f12336d.get(size);
            if ((str != null && str.equals(c1326a.y())) || (i4 >= 0 && i4 == c1326a.f12428v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z4) {
            if (size == this.f12336d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C1326a c1326a2 = (C1326a) this.f12336d.get(size - 1);
            if ((str == null || !str.equals(c1326a2.y())) && (i4 < 0 || i4 != c1326a2.f12428v)) {
                break;
            }
            size--;
        }
        return size;
    }

    private void g1() {
        if (this.f12345m != null) {
            for (int i4 = 0; i4 < this.f12345m.size(); i4++) {
                ((k) this.f12345m.get(i4)).onBackStackChanged();
            }
        }
    }

    static int i1(int i4) {
        if (i4 == 4097) {
            return 8194;
        }
        if (i4 == 8194) {
            return 4097;
        }
        if (i4 == 8197) {
            return IronSourceConstants.NT_DESTROY;
        }
        if (i4 != 4099) {
            return i4 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    static FragmentManager j0(View view) {
        AbstractActivityC1333h abstractActivityC1333h;
        Fragment k02 = k0(view);
        if (k02 != null) {
            if (k02.isAdded()) {
                return k02.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + k02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC1333h = null;
                break;
            }
            if (context instanceof AbstractActivityC1333h) {
                abstractActivityC1333h = (AbstractActivityC1333h) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC1333h != null) {
            return abstractActivityC1333h.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private static Fragment k0(View view) {
        while (view != null) {
            Fragment A02 = A0(view);
            if (A02 != null) {
                return A02;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void l0() {
        Iterator it = t().iterator();
        while (it.hasNext()) {
            ((G) it.next()).k();
        }
    }

    private boolean m0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f12333a) {
            if (this.f12333a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f12333a.size();
                boolean z4 = false;
                for (int i4 = 0; i4 < size; i4++) {
                    z4 |= ((l) this.f12333a.get(i4)).a(arrayList, arrayList2);
                }
                return z4;
            } finally {
                this.f12333a.clear();
                this.f12354v.g().removeCallbacks(this.f12332R);
            }
        }
    }

    private v o0(Fragment fragment) {
        return this.f12330P.g(fragment);
    }

    private void o1(Fragment fragment) {
        ViewGroup q02 = q0(fragment);
        if (q02 == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (q02.getTag(W.b.f9593c) == null) {
            q02.setTag(W.b.f9593c, fragment);
        }
        ((Fragment) q02.getTag(W.b.f9593c)).setPopDirection(fragment.getPopDirection());
    }

    private void q() {
        if (N0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private ViewGroup q0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f12355w.d()) {
            View c4 = this.f12355w.c(fragment.mContainerId);
            if (c4 instanceof ViewGroup) {
                return (ViewGroup) c4;
            }
        }
        return null;
    }

    private void q1() {
        Iterator it = this.f12335c.k().iterator();
        while (it.hasNext()) {
            U0((x) it.next());
        }
    }

    private void r() {
        this.f12334b = false;
        this.f12328N.clear();
        this.f12327M.clear();
    }

    private void r1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new F("FragmentManager"));
        androidx.fragment.app.m mVar = this.f12354v;
        if (mVar != null) {
            try {
                mVar.h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e4) {
                Log.e("FragmentManager", "Failed dumping state", e4);
                throw runtimeException;
            }
        }
        try {
            W("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e5) {
            Log.e("FragmentManager", "Failed dumping state", e5);
            throw runtimeException;
        }
    }

    private void s() {
        androidx.fragment.app.m mVar = this.f12354v;
        if (mVar instanceof c0 ? this.f12335c.p().k() : mVar.f() instanceof Activity ? !((Activity) this.f12354v.f()).isChangingConfigurations() : true) {
            Iterator it = this.f12342j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).f12254b.iterator();
                while (it2.hasNext()) {
                    this.f12335c.p().d((String) it2.next());
                }
            }
        }
    }

    private void s1() {
        synchronized (this.f12333a) {
            try {
                if (this.f12333a.isEmpty()) {
                    this.f12340h.setEnabled(n0() > 0 && L0(this.f12356x));
                } else {
                    this.f12340h.setEnabled(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Set t() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f12335c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((x) it.next()).k().mContainer;
            if (viewGroup != null) {
                hashSet.add(G.o(viewGroup, y0()));
            }
        }
        return hashSet;
    }

    private Set u(ArrayList arrayList, int i4, int i5) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i4 < i5) {
            ArrayList arrayList2 = ((C1326a) arrayList.get(i4)).f12533c;
            int size = arrayList2.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                i6++;
                Fragment fragment = ((z.a) obj).f12551b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(G.n(viewGroup, this));
                }
            }
            i4++;
        }
        return hashSet;
    }

    boolean A(MenuItem menuItem) {
        if (this.f12353u < 1) {
            return false;
        }
        for (Fragment fragment : this.f12335c.o()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void B() {
        this.f12323I = false;
        this.f12324J = false;
        this.f12330P.m(false);
        S(1);
    }

    b0 B0(Fragment fragment) {
        return this.f12330P.j(fragment);
    }

    boolean C(Menu menu, MenuInflater menuInflater) {
        if (this.f12353u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z4 = false;
        for (Fragment fragment : this.f12335c.o()) {
            if (fragment != null && K0(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z4 = true;
            }
        }
        if (this.f12337e != null) {
            for (int i4 = 0; i4 < this.f12337e.size(); i4++) {
                Fragment fragment2 = (Fragment) this.f12337e.get(i4);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f12337e = arrayList;
        return z4;
    }

    void C0() {
        a0(true);
        if (this.f12340h.isEnabled()) {
            Y0();
        } else {
            this.f12339g.l();
        }
    }

    void D() {
        this.f12325K = true;
        a0(true);
        X();
        s();
        S(-1);
        Object obj = this.f12354v;
        if (obj instanceof androidx.core.content.c) {
            ((androidx.core.content.c) obj).removeOnTrimMemoryListener(this.f12349q);
        }
        Object obj2 = this.f12354v;
        if (obj2 instanceof androidx.core.content.b) {
            ((androidx.core.content.b) obj2).removeOnConfigurationChangedListener(this.f12348p);
        }
        Object obj3 = this.f12354v;
        if (obj3 instanceof androidx.core.app.w) {
            ((androidx.core.app.w) obj3).removeOnMultiWindowModeChangedListener(this.f12350r);
        }
        Object obj4 = this.f12354v;
        if (obj4 instanceof androidx.core.app.x) {
            ((androidx.core.app.x) obj4).removeOnPictureInPictureModeChangedListener(this.f12351s);
        }
        Object obj5 = this.f12354v;
        if (obj5 instanceof InterfaceC1323x) {
            ((InterfaceC1323x) obj5).removeMenuProvider(this.f12352t);
        }
        this.f12354v = null;
        this.f12355w = null;
        this.f12356x = null;
        if (this.f12339g != null) {
            this.f12340h.remove();
            this.f12339g = null;
        }
        ActivityResultLauncher activityResultLauncher = this.f12318D;
        if (activityResultLauncher != null) {
            activityResultLauncher.c();
            this.f12319E.c();
            this.f12320F.c();
        }
    }

    void D0(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        o1(fragment);
    }

    void E() {
        S(1);
    }

    void E0(Fragment fragment) {
        if (fragment.mAdded && H0(fragment)) {
            this.f12322H = true;
        }
    }

    void F(boolean z4) {
        if (z4 && (this.f12354v instanceof androidx.core.content.c)) {
            r1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.f12335c.o()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z4) {
                    fragment.mChildFragmentManager.F(true);
                }
            }
        }
    }

    public boolean F0() {
        return this.f12325K;
    }

    void G(boolean z4, boolean z5) {
        if (z5 && (this.f12354v instanceof androidx.core.app.w)) {
            r1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.f12335c.o()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z4);
                if (z5) {
                    fragment.mChildFragmentManager.G(z4, true);
                }
            }
        }
    }

    void H(Fragment fragment) {
        Iterator it = this.f12347o.iterator();
        while (it.hasNext()) {
            ((w) it.next()).a(this, fragment);
        }
    }

    void I() {
        for (Fragment fragment : this.f12335c.l()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.I();
            }
        }
    }

    boolean J(MenuItem menuItem) {
        if (this.f12353u < 1) {
            return false;
        }
        for (Fragment fragment : this.f12335c.o()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean J0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    void K(Menu menu) {
        if (this.f12353u < 1) {
            return;
        }
        for (Fragment fragment : this.f12335c.o()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    boolean K0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    boolean L0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.x0()) && L0(fragmentManager.f12356x);
    }

    void M() {
        S(5);
    }

    boolean M0(int i4) {
        return this.f12353u >= i4;
    }

    void N(boolean z4, boolean z5) {
        if (z5 && (this.f12354v instanceof androidx.core.app.x)) {
            r1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.f12335c.o()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z4);
                if (z5) {
                    fragment.mChildFragmentManager.N(z4, true);
                }
            }
        }
    }

    public boolean N0() {
        return this.f12323I || this.f12324J;
    }

    boolean O(Menu menu) {
        boolean z4 = false;
        if (this.f12353u < 1) {
            return false;
        }
        for (Fragment fragment : this.f12335c.o()) {
            if (fragment != null && K0(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z4 = true;
            }
        }
        return z4;
    }

    void O0(Fragment fragment, String[] strArr, int i4) {
        if (this.f12320F == null) {
            this.f12354v.k(fragment, strArr, i4);
            return;
        }
        this.f12321G.addLast(new LaunchedFragmentInfo(fragment.mWho, i4));
        this.f12320F.a(strArr);
    }

    void P() {
        s1();
        L(this.f12357y);
    }

    void P0(Fragment fragment, Intent intent, int i4, Bundle bundle) {
        if (this.f12318D == null) {
            this.f12354v.m(fragment, intent, i4, bundle);
            return;
        }
        this.f12321G.addLast(new LaunchedFragmentInfo(fragment.mWho, i4));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f12318D.a(intent);
    }

    void Q() {
        this.f12323I = false;
        this.f12324J = false;
        this.f12330P.m(false);
        S(7);
    }

    void Q0(Fragment fragment, IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        if (this.f12319E == null) {
            this.f12354v.n(fragment, intentSender, i4, intent, i5, i6, i7, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (G0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + fragment);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        IntentSenderRequest a4 = new IntentSenderRequest.a(intentSender).b(intent).c(i6, i5).a();
        this.f12321G.addLast(new LaunchedFragmentInfo(fragment.mWho, i4));
        if (G0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f12319E.a(a4);
    }

    void R() {
        this.f12323I = false;
        this.f12324J = false;
        this.f12330P.m(false);
        S(5);
    }

    void R0(int i4, boolean z4) {
        androidx.fragment.app.m mVar;
        if (this.f12354v == null && i4 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z4 || i4 != this.f12353u) {
            this.f12353u = i4;
            this.f12335c.t();
            q1();
            if (this.f12322H && (mVar = this.f12354v) != null && this.f12353u == 7) {
                mVar.o();
                this.f12322H = false;
            }
        }
    }

    void S0() {
        if (this.f12354v == null) {
            return;
        }
        this.f12323I = false;
        this.f12324J = false;
        this.f12330P.m(false);
        for (Fragment fragment : this.f12335c.o()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    void T() {
        this.f12324J = true;
        this.f12330P.m(true);
        S(4);
    }

    void T0(FragmentContainerView fragmentContainerView) {
        View view;
        for (x xVar : this.f12335c.k()) {
            Fragment k4 = xVar.k();
            if (k4.mContainerId == fragmentContainerView.getId() && (view = k4.mView) != null && view.getParent() == null) {
                k4.mContainer = fragmentContainerView;
                xVar.b();
            }
        }
    }

    void U() {
        S(2);
    }

    void U0(x xVar) {
        Fragment k4 = xVar.k();
        if (k4.mDeferStart) {
            if (this.f12334b) {
                this.f12326L = true;
            } else {
                k4.mDeferStart = false;
                xVar.m();
            }
        }
    }

    public void V0() {
        Y(new m(null, -1, 0), false);
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f12335c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f12337e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size2; i4++) {
                Fragment fragment = (Fragment) this.f12337e.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.f12336d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size; i5++) {
                C1326a c1326a = (C1326a) this.f12336d.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(c1326a.toString());
                c1326a.t(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f12341i.get());
        synchronized (this.f12333a) {
            try {
                int size3 = this.f12333a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i6 = 0; i6 < size3; i6++) {
                        l lVar = (l) this.f12333a.get(i6);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i6);
                        printWriter.print(": ");
                        printWriter.println(lVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f12354v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f12355w);
        if (this.f12356x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f12356x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f12353u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f12323I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f12324J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f12325K);
        if (this.f12322H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f12322H);
        }
    }

    void W0(int i4, int i5, boolean z4) {
        if (i4 >= 0) {
            Y(new m(null, i4, i5), z4);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i4);
    }

    public void X0(String str, int i4) {
        Y(new m(str, -1, i4), false);
    }

    void Y(l lVar, boolean z4) {
        if (!z4) {
            if (this.f12354v == null) {
                if (!this.f12325K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            q();
        }
        synchronized (this.f12333a) {
            try {
                if (this.f12354v == null) {
                    if (!z4) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f12333a.add(lVar);
                    k1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean Y0() {
        return a1(null, -1, 0);
    }

    public boolean Z0(int i4, int i5) {
        if (i4 >= 0) {
            return a1(null, i4, i5);
        }
        throw new IllegalArgumentException("Bad id: " + i4);
    }

    boolean a0(boolean z4) {
        Z(z4);
        boolean z5 = false;
        while (m0(this.f12327M, this.f12328N)) {
            z5 = true;
            this.f12334b = true;
            try {
                e1(this.f12327M, this.f12328N);
            } finally {
                r();
            }
        }
        s1();
        V();
        this.f12335c.b();
        return z5;
    }

    void b0(l lVar, boolean z4) {
        if (z4 && (this.f12354v == null || this.f12325K)) {
            return;
        }
        Z(z4);
        if (lVar.a(this.f12327M, this.f12328N)) {
            this.f12334b = true;
            try {
                e1(this.f12327M, this.f12328N);
            } finally {
                r();
            }
        }
        s1();
        V();
        this.f12335c.b();
    }

    boolean b1(ArrayList arrayList, ArrayList arrayList2, String str, int i4, int i5) {
        int f02 = f0(str, i4, (i5 & 1) != 0);
        if (f02 < 0) {
            return false;
        }
        for (int size = this.f12336d.size() - 1; size >= f02; size--) {
            arrayList.add((C1326a) this.f12336d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    void c1(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && isInBackStack) {
            return;
        }
        this.f12335c.u(fragment);
        if (H0(fragment)) {
            this.f12322H = true;
        }
        fragment.mRemoving = true;
        o1(fragment);
    }

    public void d1(k kVar) {
        ArrayList arrayList = this.f12345m;
        if (arrayList != null) {
            arrayList.remove(kVar);
        }
    }

    Fragment e0(String str) {
        return this.f12335c.f(str);
    }

    void f1(Fragment fragment) {
        this.f12330P.l(fragment);
    }

    void g(C1326a c1326a) {
        if (this.f12336d == null) {
            this.f12336d = new ArrayList();
        }
        this.f12336d.add(c1326a);
    }

    public Fragment g0(int i4) {
        return this.f12335c.g(i4);
    }

    x h(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            X.c.f(fragment, str);
        }
        if (G0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        x v4 = v(fragment);
        fragment.mFragmentManager = this;
        this.f12335c.r(v4);
        if (!fragment.mDetached) {
            this.f12335c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (H0(fragment)) {
                this.f12322H = true;
            }
        }
        return v4;
    }

    public Fragment h0(String str) {
        return this.f12335c.h(str);
    }

    void h1(Parcelable parcelable) {
        x xVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f12354v.f().getClassLoader());
                this.f12343k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f12354v.f().getClassLoader());
                arrayList.add((FragmentState) bundle.getParcelable(b9.h.f15456P));
            }
        }
        this.f12335c.x(arrayList);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable(b9.h.f15456P);
        if (fragmentManagerState == null) {
            return;
        }
        this.f12335c.v();
        ArrayList arrayList2 = fragmentManagerState.f12375b;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            FragmentState B4 = this.f12335c.B((String) obj, null);
            if (B4 != null) {
                Fragment f4 = this.f12330P.f(B4.f12384c);
                if (f4 != null) {
                    if (G0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + f4);
                    }
                    xVar = new x(this.f12346n, this.f12335c, f4, B4);
                } else {
                    xVar = new x(this.f12346n, this.f12335c, this.f12354v.f().getClassLoader(), r0(), B4);
                }
                Fragment k4 = xVar.k();
                k4.mFragmentManager = this;
                if (G0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k4.mWho + "): " + k4);
                }
                xVar.o(this.f12354v.f().getClassLoader());
                this.f12335c.r(xVar);
                xVar.t(this.f12353u);
            }
        }
        for (Fragment fragment : this.f12330P.i()) {
            if (!this.f12335c.c(fragment.mWho)) {
                if (G0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f12375b);
                }
                this.f12330P.l(fragment);
                fragment.mFragmentManager = this;
                x xVar2 = new x(this.f12346n, this.f12335c, fragment);
                xVar2.t(1);
                xVar2.m();
                fragment.mRemoving = true;
                xVar2.m();
            }
        }
        this.f12335c.w(fragmentManagerState.f12376c);
        if (fragmentManagerState.f12377d != null) {
            this.f12336d = new ArrayList(fragmentManagerState.f12377d.length);
            int i5 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f12377d;
                if (i5 >= backStackRecordStateArr.length) {
                    break;
                }
                C1326a b4 = backStackRecordStateArr[i5].b(this);
                if (G0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i5 + " (index " + b4.f12428v + "): " + b4);
                    PrintWriter printWriter = new PrintWriter(new F("FragmentManager"));
                    b4.u("  ", printWriter, false);
                    printWriter.close();
                }
                this.f12336d.add(b4);
                i5++;
            }
        } else {
            this.f12336d = null;
        }
        this.f12341i.set(fragmentManagerState.f12378e);
        String str3 = fragmentManagerState.f12379f;
        if (str3 != null) {
            Fragment e02 = e0(str3);
            this.f12357y = e02;
            L(e02);
        }
        ArrayList arrayList3 = fragmentManagerState.f12380g;
        if (arrayList3 != null) {
            for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                this.f12342j.put((String) arrayList3.get(i6), (BackStackState) fragmentManagerState.f12381h.get(i6));
            }
        }
        this.f12321G = new ArrayDeque(fragmentManagerState.f12382i);
    }

    public void i(w wVar) {
        this.f12347o.add(wVar);
    }

    Fragment i0(String str) {
        return this.f12335c.i(str);
    }

    public void j(k kVar) {
        if (this.f12345m == null) {
            this.f12345m = new ArrayList();
        }
        this.f12345m.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle j1() {
        BackStackRecordState[] backStackRecordStateArr;
        int size;
        Bundle bundle = new Bundle();
        l0();
        X();
        a0(true);
        this.f12323I = true;
        this.f12330P.m(true);
        ArrayList y4 = this.f12335c.y();
        ArrayList m4 = this.f12335c.m();
        if (!m4.isEmpty()) {
            ArrayList z4 = this.f12335c.z();
            ArrayList arrayList = this.f12336d;
            int i4 = 0;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                backStackRecordStateArr = null;
            } else {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i5 = 0; i5 < size; i5++) {
                    backStackRecordStateArr[i5] = new BackStackRecordState((C1326a) this.f12336d.get(i5));
                    if (G0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i5 + ": " + this.f12336d.get(i5));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f12375b = y4;
            fragmentManagerState.f12376c = z4;
            fragmentManagerState.f12377d = backStackRecordStateArr;
            fragmentManagerState.f12378e = this.f12341i.get();
            Fragment fragment = this.f12357y;
            if (fragment != null) {
                fragmentManagerState.f12379f = fragment.mWho;
            }
            fragmentManagerState.f12380g.addAll(this.f12342j.keySet());
            fragmentManagerState.f12381h.addAll(this.f12342j.values());
            fragmentManagerState.f12382i = new ArrayList(this.f12321G);
            bundle.putParcelable(b9.h.f15456P, fragmentManagerState);
            for (String str : this.f12343k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f12343k.get(str));
            }
            int size2 = m4.size();
            while (i4 < size2) {
                Object obj = m4.get(i4);
                i4++;
                FragmentState fragmentState = (FragmentState) obj;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(b9.h.f15456P, fragmentState);
                bundle.putBundle("fragment_" + fragmentState.f12384c, bundle2);
            }
        } else if (G0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    void k(Fragment fragment) {
        this.f12330P.b(fragment);
    }

    void k1() {
        synchronized (this.f12333a) {
            try {
                if (this.f12333a.size() == 1) {
                    this.f12354v.g().removeCallbacks(this.f12332R);
                    this.f12354v.g().post(this.f12332R);
                    s1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    int l() {
        return this.f12341i.getAndIncrement();
    }

    void l1(Fragment fragment, boolean z4) {
        ViewGroup q02 = q0(fragment);
        if (q02 == null || !(q02 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) q02).setDrawDisappearingViewsLast(!z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void m(androidx.fragment.app.m mVar, androidx.fragment.app.j jVar, Fragment fragment) {
        String str;
        if (this.f12354v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f12354v = mVar;
        this.f12355w = jVar;
        this.f12356x = fragment;
        if (fragment != null) {
            i(new g(fragment));
        } else if (mVar instanceof w) {
            i((w) mVar);
        }
        if (this.f12356x != null) {
            s1();
        }
        if (mVar instanceof androidx.activity.y) {
            androidx.activity.y yVar = (androidx.activity.y) mVar;
            androidx.activity.w onBackPressedDispatcher = yVar.getOnBackPressedDispatcher();
            this.f12339g = onBackPressedDispatcher;
            InterfaceC1354u interfaceC1354u = yVar;
            if (fragment != null) {
                interfaceC1354u = fragment;
            }
            onBackPressedDispatcher.i(interfaceC1354u, this.f12340h);
        }
        if (fragment != null) {
            this.f12330P = fragment.mFragmentManager.o0(fragment);
        } else if (mVar instanceof c0) {
            this.f12330P = v.h(((c0) mVar).getViewModelStore());
        } else {
            this.f12330P = new v(false);
        }
        this.f12330P.m(N0());
        this.f12335c.A(this.f12330P);
        Object obj = this.f12354v;
        if ((obj instanceof InterfaceC2437f) && fragment == null) {
            C2435d savedStateRegistry = ((InterfaceC2437f) obj).getSavedStateRegistry();
            savedStateRegistry.h("android:support:fragments", new C2435d.c() { // from class: androidx.fragment.app.t
                @Override // h0.C2435d.c
                public final Bundle a() {
                    Bundle j12;
                    j12 = FragmentManager.this.j1();
                    return j12;
                }
            });
            Bundle b4 = savedStateRegistry.b("android:support:fragments");
            if (b4 != null) {
                h1(b4);
            }
        }
        Object obj2 = this.f12354v;
        if (obj2 instanceof c.d) {
            c.c activityResultRegistry = ((c.d) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + StringUtils.PROCESS_POSTFIX_DELIMITER;
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f12318D = activityResultRegistry.m(str2 + "StartActivityForResult", new d.c(), new h());
            this.f12319E = activityResultRegistry.m(str2 + "StartIntentSenderForResult", new j(), new i());
            this.f12320F = activityResultRegistry.m(str2 + "RequestPermissions", new d.b(), new a());
        }
        Object obj3 = this.f12354v;
        if (obj3 instanceof androidx.core.content.b) {
            ((androidx.core.content.b) obj3).addOnConfigurationChangedListener(this.f12348p);
        }
        Object obj4 = this.f12354v;
        if (obj4 instanceof androidx.core.content.c) {
            ((androidx.core.content.c) obj4).addOnTrimMemoryListener(this.f12349q);
        }
        Object obj5 = this.f12354v;
        if (obj5 instanceof androidx.core.app.w) {
            ((androidx.core.app.w) obj5).addOnMultiWindowModeChangedListener(this.f12350r);
        }
        Object obj6 = this.f12354v;
        if (obj6 instanceof androidx.core.app.x) {
            ((androidx.core.app.x) obj6).addOnPictureInPictureModeChangedListener(this.f12351s);
        }
        Object obj7 = this.f12354v;
        if ((obj7 instanceof InterfaceC1323x) && fragment == null) {
            ((InterfaceC1323x) obj7).addMenuProvider(this.f12352t);
        }
    }

    void m1(Fragment fragment, AbstractC1346l.b bVar) {
        if (fragment.equals(e0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void n(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f12335c.a(fragment);
            if (G0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (H0(fragment)) {
                this.f12322H = true;
            }
        }
    }

    public int n0() {
        ArrayList arrayList = this.f12336d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void n1(Fragment fragment) {
        if (fragment == null || (fragment.equals(e0(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f12357y;
            this.f12357y = fragment;
            L(fragment2);
            L(this.f12357y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public z o() {
        return new C1326a(this);
    }

    boolean p() {
        boolean z4 = false;
        for (Fragment fragment : this.f12335c.l()) {
            if (fragment != null) {
                z4 = H0(fragment);
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    androidx.fragment.app.j p0() {
        return this.f12355w;
    }

    void p1(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public androidx.fragment.app.l r0() {
        androidx.fragment.app.l lVar = this.f12358z;
        if (lVar != null) {
            return lVar;
        }
        Fragment fragment = this.f12356x;
        return fragment != null ? fragment.mFragmentManager.r0() : this.f12315A;
    }

    public List s0() {
        return this.f12335c.o();
    }

    public androidx.fragment.app.m t0() {
        return this.f12354v;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f12356x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f12356x)));
            sb.append("}");
        } else {
            androidx.fragment.app.m mVar = this.f12354v;
            if (mVar != null) {
                sb.append(mVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f12354v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    LayoutInflater.Factory2 u0() {
        return this.f12338f;
    }

    x v(Fragment fragment) {
        x n4 = this.f12335c.n(fragment.mWho);
        if (n4 != null) {
            return n4;
        }
        x xVar = new x(this.f12346n, this.f12335c, fragment);
        xVar.o(this.f12354v.f().getClassLoader());
        xVar.t(this.f12353u);
        return xVar;
    }

    o v0() {
        return this.f12346n;
    }

    void w(Fragment fragment) {
        if (G0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (G0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f12335c.u(fragment);
            if (H0(fragment)) {
                this.f12322H = true;
            }
            o1(fragment);
        }
    }

    Fragment w0() {
        return this.f12356x;
    }

    void x() {
        this.f12323I = false;
        this.f12324J = false;
        this.f12330P.m(false);
        S(4);
    }

    public Fragment x0() {
        return this.f12357y;
    }

    void y() {
        this.f12323I = false;
        this.f12324J = false;
        this.f12330P.m(false);
        S(0);
    }

    H y0() {
        H h4 = this.f12316B;
        if (h4 != null) {
            return h4;
        }
        Fragment fragment = this.f12356x;
        return fragment != null ? fragment.mFragmentManager.y0() : this.f12317C;
    }

    void z(Configuration configuration, boolean z4) {
        if (z4 && (this.f12354v instanceof androidx.core.content.b)) {
            r1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.f12335c.o()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z4) {
                    fragment.mChildFragmentManager.z(configuration, true);
                }
            }
        }
    }

    public c.C0067c z0() {
        return this.f12331Q;
    }

    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        String f12359b;

        /* renamed from: c, reason: collision with root package name */
        int f12360c;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i4) {
                return new LaunchedFragmentInfo[i4];
            }
        }

        LaunchedFragmentInfo(String str, int i4) {
            this.f12359b = str;
            this.f12360c = i4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeString(this.f12359b);
            parcel.writeInt(this.f12360c);
        }

        LaunchedFragmentInfo(Parcel parcel) {
            this.f12359b = parcel.readString();
            this.f12360c = parcel.readInt();
        }
    }
}
