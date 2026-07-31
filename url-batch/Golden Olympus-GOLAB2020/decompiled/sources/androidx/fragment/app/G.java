package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.e;
import androidx.core.view.AbstractC1281a0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
abstract class G {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f12397a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f12398b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f12399c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    boolean f12400d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f12401e = false;

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f12402b;

        a(d dVar) {
            this.f12402b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (G.this.f12398b.contains(this.f12402b)) {
                this.f12402b.e().a(this.f12402b.f().mView);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f12404b;

        b(d dVar) {
            this.f12404b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            G.this.f12398b.remove(this.f12404b);
            G.this.f12399c.remove(this.f12404b);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12406a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f12407b;

        static {
            int[] iArr = new int[e.b.values().length];
            f12407b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12407b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12407b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f12406a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12406a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12406a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12406a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static class d extends e {

        /* renamed from: h, reason: collision with root package name */
        private final x f12408h;

        d(e.c cVar, e.b bVar, x xVar, androidx.core.os.e eVar) {
            super(cVar, bVar, xVar.k(), eVar);
            this.f12408h = xVar;
        }

        @Override // androidx.fragment.app.G.e
        public void c() {
            super.c();
            this.f12408h.m();
        }

        @Override // androidx.fragment.app.G.e
        void l() {
            if (g() != e.b.ADDING) {
                if (g() == e.b.REMOVING) {
                    Fragment k4 = this.f12408h.k();
                    View requireView = k4.requireView();
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView.findFocus() + " on view " + requireView + " for Fragment " + k4);
                    }
                    requireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment k5 = this.f12408h.k();
            View findFocus = k5.mView.findFocus();
            if (findFocus != null) {
                k5.setFocusedView(findFocus);
                if (FragmentManager.G0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k5);
                }
            }
            View requireView2 = f().requireView();
            if (requireView2.getParent() == null) {
                this.f12408h.b();
                requireView2.setAlpha(0.0f);
            }
            if (requireView2.getAlpha() == 0.0f && requireView2.getVisibility() == 0) {
                requireView2.setVisibility(4);
            }
            requireView2.setAlpha(k5.getPostOnViewCreatedAlpha());
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private c f12409a;

        /* renamed from: b, reason: collision with root package name */
        private b f12410b;

        /* renamed from: c, reason: collision with root package name */
        private final Fragment f12411c;

        /* renamed from: d, reason: collision with root package name */
        private final List f12412d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private final HashSet f12413e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        private boolean f12414f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f12415g = false;

        class a implements e.a {
            a() {
            }

            @Override // androidx.core.os.e.a
            public void a() {
                e.this.b();
            }
        }

        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c b(int i4) {
                if (i4 == 0) {
                    return VISIBLE;
                }
                if (i4 == 4) {
                    return INVISIBLE;
                }
                if (i4 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i4);
            }

            static c c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            void a(View view) {
                int i4 = c.f12406a[ordinal()];
                if (i4 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i4 == 2) {
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i4 == 3) {
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i4 != 4) {
                    return;
                }
                if (FragmentManager.G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        e(c cVar, b bVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f12409a = cVar;
            this.f12410b = bVar;
            this.f12411c = fragment;
            eVar.b(new a());
        }

        final void a(Runnable runnable) {
            this.f12412d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f12414f = true;
            if (this.f12413e.isEmpty()) {
                c();
                return;
            }
            ArrayList arrayList = new ArrayList(this.f12413e);
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((androidx.core.os.e) obj).a();
            }
        }

        public void c() {
            if (this.f12415g) {
                return;
            }
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f12415g = true;
            Iterator it = this.f12412d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void d(androidx.core.os.e eVar) {
            if (this.f12413e.remove(eVar) && this.f12413e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f12409a;
        }

        public final Fragment f() {
            return this.f12411c;
        }

        b g() {
            return this.f12410b;
        }

        final boolean h() {
            return this.f12414f;
        }

        final boolean i() {
            return this.f12415g;
        }

        public final void j(androidx.core.os.e eVar) {
            l();
            this.f12413e.add(eVar);
        }

        final void k(c cVar, b bVar) {
            int i4 = c.f12407b[bVar.ordinal()];
            if (i4 == 1) {
                if (this.f12409a == c.REMOVED) {
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f12411c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f12410b + " to ADDING.");
                    }
                    this.f12409a = c.VISIBLE;
                    this.f12410b = b.ADDING;
                    return;
                }
                return;
            }
            if (i4 == 2) {
                if (FragmentManager.G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f12411c + " mFinalState = " + this.f12409a + " -> REMOVED. mLifecycleImpact  = " + this.f12410b + " to REMOVING.");
                }
                this.f12409a = c.REMOVED;
                this.f12410b = b.REMOVING;
                return;
            }
            if (i4 == 3 && this.f12409a != c.REMOVED) {
                if (FragmentManager.G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f12411c + " mFinalState = " + this.f12409a + " -> " + cVar + ". ");
                }
                this.f12409a = cVar;
            }
        }

        abstract void l();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f12409a + "} {mLifecycleImpact = " + this.f12410b + "} {mFragment = " + this.f12411c + "}";
        }
    }

    G(ViewGroup viewGroup) {
        this.f12397a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, x xVar) {
        synchronized (this.f12398b) {
            try {
                androidx.core.os.e eVar = new androidx.core.os.e();
                e h4 = h(xVar.k());
                if (h4 != null) {
                    h4.k(cVar, bVar);
                    return;
                }
                d dVar = new d(cVar, bVar, xVar, eVar);
                this.f12398b.add(dVar);
                dVar.a(new a(dVar));
                dVar.a(new b(dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private e h(Fragment fragment) {
        ArrayList arrayList = this.f12398b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            e eVar = (e) obj;
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        ArrayList arrayList = this.f12399c;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            e eVar = (e) obj;
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    static G n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.y0());
    }

    static G o(ViewGroup viewGroup, H h4) {
        Object tag = viewGroup.getTag(W.b.f9592b);
        if (tag instanceof G) {
            return (G) tag;
        }
        G a4 = h4.a(viewGroup);
        viewGroup.setTag(W.b.f9592b, a4);
        return a4;
    }

    private void q() {
        ArrayList arrayList = this.f12398b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            e eVar = (e) obj;
            if (eVar.g() == e.b.ADDING) {
                eVar.k(e.c.b(eVar.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    void b(e.c cVar, x xVar) {
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + xVar.k());
        }
        a(cVar, e.b.ADDING, xVar);
    }

    void c(x xVar) {
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + xVar.k());
        }
        a(e.c.GONE, e.b.NONE, xVar);
    }

    void d(x xVar) {
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + xVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, xVar);
    }

    void e(x xVar) {
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + xVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, xVar);
    }

    abstract void f(List list, boolean z4);

    void g() {
        if (this.f12401e) {
            return;
        }
        if (!AbstractC1281a0.S(this.f12397a)) {
            j();
            this.f12400d = false;
            return;
        }
        synchronized (this.f12398b) {
            try {
                if (!this.f12398b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f12399c);
                    this.f12399c.clear();
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        e eVar = (e) obj;
                        if (FragmentManager.G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f12399c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f12398b);
                    this.f12398b.clear();
                    this.f12399c.addAll(arrayList2);
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        ((e) obj2).l();
                    }
                    f(arrayList2, this.f12400d);
                    this.f12400d = false;
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void j() {
        String str;
        String str2;
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean S3 = AbstractC1281a0.S(this.f12397a);
        synchronized (this.f12398b) {
            try {
                q();
                ArrayList arrayList = this.f12398b;
                int size = arrayList.size();
                int i4 = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    ((e) obj).l();
                }
                ArrayList arrayList2 = new ArrayList(this.f12399c);
                int size2 = arrayList2.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList2.get(i6);
                    i6++;
                    e eVar = (e) obj2;
                    if (FragmentManager.G0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (S3) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f12397a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(eVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    eVar.b();
                }
                ArrayList arrayList3 = new ArrayList(this.f12398b);
                int size3 = arrayList3.size();
                while (i4 < size3) {
                    Object obj3 = arrayList3.get(i4);
                    i4++;
                    e eVar2 = (e) obj3;
                    if (FragmentManager.G0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (S3) {
                            str = "";
                        } else {
                            str = "Container " + this.f12397a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(eVar2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    eVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void k() {
        if (this.f12401e) {
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f12401e = false;
            g();
        }
    }

    e.b l(x xVar) {
        e h4 = h(xVar.k());
        e.b g4 = h4 != null ? h4.g() : null;
        e i4 = i(xVar.k());
        return (i4 == null || !(g4 == null || g4 == e.b.NONE)) ? g4 : i4.g();
    }

    public ViewGroup m() {
        return this.f12397a;
    }

    void p() {
        synchronized (this.f12398b) {
            try {
                q();
                this.f12401e = false;
                int size = this.f12398b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e eVar = (e) this.f12398b.get(size);
                    e.c c4 = e.c.c(eVar.f().mView);
                    e.c e4 = eVar.e();
                    e.c cVar = e.c.VISIBLE;
                    if (e4 == cVar && c4 != cVar) {
                        this.f12401e = eVar.f().isPostponed();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void r(boolean z4) {
        this.f12400d = z4;
    }
}
