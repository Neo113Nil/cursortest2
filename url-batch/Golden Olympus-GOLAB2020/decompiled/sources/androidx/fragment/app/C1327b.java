package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.e;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.AbstractC1291f0;
import androidx.core.view.M;
import androidx.fragment.app.AbstractC1334i;
import androidx.fragment.app.G;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1327b extends G {

    /* renamed from: androidx.fragment.app.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12430a;

        static {
            int[] iArr = new int[G.e.c.values().length];
            f12430a = iArr;
            try {
                iArr[G.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12430a[G.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12430a[G.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12430a[G.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$b, reason: collision with other inner class name */
    class RunnableC0106b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f12431b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G.e f12432c;

        RunnableC0106b(List list, G.e eVar) {
            this.f12431b = list;
            this.f12432c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12431b.contains(this.f12432c)) {
                this.f12431b.remove(this.f12432c);
                C1327b.this.s(this.f12432c);
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$c */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f12434a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f12435b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f12436c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G.e f12437d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f12438e;

        c(ViewGroup viewGroup, View view, boolean z4, G.e eVar, k kVar) {
            this.f12434a = viewGroup;
            this.f12435b = view;
            this.f12436c = z4;
            this.f12437d = eVar;
            this.f12438e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f12434a.endViewTransition(this.f12435b);
            if (this.f12436c) {
                this.f12437d.e().a(this.f12435b);
            }
            this.f12438e.a();
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f12437d + " has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$d */
    class d implements e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animator f12440a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G.e f12441b;

        d(Animator animator, G.e eVar) {
            this.f12440a = animator;
            this.f12441b = eVar;
        }

        @Override // androidx.core.os.e.a
        public void a() {
            this.f12440a.end();
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f12441b + " has been canceled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$e */
    class e implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ G.e f12443a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f12444b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f12445c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f12446d;

        /* renamed from: androidx.fragment.app.b$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f12444b.endViewTransition(eVar.f12445c);
                e.this.f12446d.a();
            }
        }

        e(G.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.f12443a = eVar;
            this.f12444b = viewGroup;
            this.f12445c = view;
            this.f12446d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f12444b.post(new a());
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f12443a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f12443a + " has reached onAnimationStart.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$f */
    class f implements e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f12449a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f12450b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f12451c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ G.e f12452d;

        f(View view, ViewGroup viewGroup, k kVar, G.e eVar) {
            this.f12449a = view;
            this.f12450b = viewGroup;
            this.f12451c = kVar;
            this.f12452d = eVar;
        }

        @Override // androidx.core.os.e.a
        public void a() {
            this.f12449a.clearAnimation();
            this.f12450b.endViewTransition(this.f12449a);
            this.f12451c.a();
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f12452d + " has been cancelled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$g */
    class g implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ G.e f12454b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G.e f12455c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f12456d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f12457e;

        g(G.e eVar, G.e eVar2, boolean z4, androidx.collection.a aVar) {
            this.f12454b = eVar;
            this.f12455c = eVar2;
            this.f12456d = z4;
            this.f12457e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            A.a(this.f12454b.f(), this.f12455c.f(), this.f12456d, this.f12457e, false);
        }
    }

    /* renamed from: androidx.fragment.app.b$h */
    class h implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f12459b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f12460c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Rect f12461d;

        h(C c4, View view, Rect rect) {
            this.f12459b = c4;
            this.f12460c = view;
            this.f12461d = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12459b.h(this.f12460c, this.f12461d);
        }
    }

    /* renamed from: androidx.fragment.app.b$i */
    class i implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f12463b;

        i(ArrayList arrayList) {
            this.f12463b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            A.d(this.f12463b, 4);
        }
    }

    /* renamed from: androidx.fragment.app.b$j */
    class j implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f12465b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G.e f12466c;

        j(m mVar, G.e eVar) {
            this.f12465b = mVar;
            this.f12466c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12465b.a();
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f12466c + "has completed");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$k */
    private static class k extends l {

        /* renamed from: c, reason: collision with root package name */
        private boolean f12468c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f12469d;

        /* renamed from: e, reason: collision with root package name */
        private AbstractC1334i.a f12470e;

        k(G.e eVar, androidx.core.os.e eVar2, boolean z4) {
            super(eVar, eVar2);
            this.f12469d = false;
            this.f12468c = z4;
        }

        AbstractC1334i.a e(Context context) {
            if (this.f12469d) {
                return this.f12470e;
            }
            AbstractC1334i.a b4 = AbstractC1334i.b(context, b().f(), b().e() == G.e.c.VISIBLE, this.f12468c);
            this.f12470e = b4;
            this.f12469d = true;
            return b4;
        }
    }

    /* renamed from: androidx.fragment.app.b$l */
    private static class l {

        /* renamed from: a, reason: collision with root package name */
        private final G.e f12471a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.os.e f12472b;

        l(G.e eVar, androidx.core.os.e eVar2) {
            this.f12471a = eVar;
            this.f12472b = eVar2;
        }

        void a() {
            this.f12471a.d(this.f12472b);
        }

        G.e b() {
            return this.f12471a;
        }

        androidx.core.os.e c() {
            return this.f12472b;
        }

        boolean d() {
            G.e.c c4 = G.e.c.c(this.f12471a.f().mView);
            G.e.c e4 = this.f12471a.e();
            if (c4 == e4) {
                return true;
            }
            G.e.c cVar = G.e.c.VISIBLE;
            return (c4 == cVar || e4 == cVar) ? false : true;
        }
    }

    /* renamed from: androidx.fragment.app.b$m */
    private static class m extends l {

        /* renamed from: c, reason: collision with root package name */
        private final Object f12473c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f12474d;

        /* renamed from: e, reason: collision with root package name */
        private final Object f12475e;

        m(G.e eVar, androidx.core.os.e eVar2, boolean z4, boolean z5) {
            super(eVar, eVar2);
            if (eVar.e() == G.e.c.VISIBLE) {
                this.f12473c = z4 ? eVar.f().getReenterTransition() : eVar.f().getEnterTransition();
                this.f12474d = z4 ? eVar.f().getAllowReturnTransitionOverlap() : eVar.f().getAllowEnterTransitionOverlap();
            } else {
                this.f12473c = z4 ? eVar.f().getReturnTransition() : eVar.f().getExitTransition();
                this.f12474d = true;
            }
            if (!z5) {
                this.f12475e = null;
            } else if (z4) {
                this.f12475e = eVar.f().getSharedElementReturnTransition();
            } else {
                this.f12475e = eVar.f().getSharedElementEnterTransition();
            }
        }

        private C f(Object obj) {
            if (obj == null) {
                return null;
            }
            C c4 = A.f12222a;
            if (c4 != null && c4.e(obj)) {
                return c4;
            }
            C c5 = A.f12223b;
            if (c5 != null && c5.e(obj)) {
                return c5;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        C e() {
            C f4 = f(this.f12473c);
            C f5 = f(this.f12475e);
            if (f4 == null || f5 == null || f4 == f5) {
                return f4 != null ? f4 : f5;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f12473c + " which uses a different Transition  type than its shared element transition " + this.f12475e);
        }

        public Object g() {
            return this.f12475e;
        }

        Object h() {
            return this.f12473c;
        }

        public boolean i() {
            return this.f12475e != null;
        }

        boolean j() {
            return this.f12474d;
        }
    }

    C1327b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List list, List list2, boolean z4, Map map) {
        G.e eVar;
        k kVar;
        View view;
        ViewGroup m4 = m();
        Context context = m4.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i4 = 0;
        boolean z5 = false;
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            if (kVar2.d()) {
                kVar2.a();
            } else {
                AbstractC1334i.a e4 = kVar2.e(context);
                if (e4 == null) {
                    kVar2.a();
                } else {
                    Animator animator = e4.f12488b;
                    if (animator == null) {
                        arrayList.add(kVar2);
                    } else {
                        G.e b4 = kVar2.b();
                        Fragment f4 = b4.f();
                        if (Boolean.TRUE.equals(map.get(b4))) {
                            if (FragmentManager.G0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + f4 + " as this Fragment was involved in a Transition.");
                            }
                            kVar2.a();
                        } else {
                            boolean z6 = b4.e() == G.e.c.GONE;
                            if (z6) {
                                list2.remove(b4);
                            }
                            View view2 = f4.mView;
                            m4.startViewTransition(view2);
                            ViewGroup viewGroup = m4;
                            m4 = viewGroup;
                            animator.addListener(new c(viewGroup, view2, z6, b4, kVar2));
                            animator.setTarget(view2);
                            animator.start();
                            if (FragmentManager.G0(2)) {
                                Log.v("FragmentManager", "Animator from operation " + b4 + " has started.");
                            }
                            kVar2.c().b(new d(animator, b4));
                            z5 = true;
                        }
                    }
                }
            }
        }
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            k kVar3 = (k) obj;
            G.e b5 = kVar3.b();
            Fragment f5 = b5.f();
            if (z4) {
                if (FragmentManager.G0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f5 + " as Animations cannot run alongside Transitions.");
                }
                kVar3.a();
            } else if (z5) {
                if (FragmentManager.G0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f5 + " as Animations cannot run alongside Animators.");
                }
                kVar3.a();
            } else {
                View view3 = f5.mView;
                Animation animation = (Animation) A.h.f(((AbstractC1334i.a) A.h.f(kVar3.e(context))).f12487a);
                if (b5.e() != G.e.c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar3.a();
                    eVar = b5;
                    kVar = kVar3;
                    view = view3;
                } else {
                    m4.startViewTransition(view3);
                    AbstractC1334i.b bVar = new AbstractC1334i.b(animation, m4, view3);
                    eVar = b5;
                    kVar = kVar3;
                    view = view3;
                    bVar.setAnimationListener(new e(eVar, m4, view, kVar));
                    view.startAnimation(bVar);
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + eVar + " has started.");
                    }
                }
                kVar.c().b(new f(view, m4, kVar, eVar));
            }
        }
    }

    private Map x(List list, List list2, boolean z4, G.e eVar, G.e eVar2) {
        String str;
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Object obj;
        Rect rect;
        String str3;
        View view;
        View view2;
        Object obj2;
        Object obj3;
        G.e eVar3;
        View view3;
        Rect rect2;
        ArrayList arrayList5;
        androidx.collection.a aVar;
        View view4;
        ArrayList arrayList6;
        int i4;
        View view5;
        boolean z5 = z4;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        C c4 = null;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (!mVar.d()) {
                C e4 = mVar.e();
                if (c4 == null) {
                    c4 = e4;
                } else if (e4 != null && c4 != e4) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (c4 == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                m mVar2 = (m) it2.next();
                hashMap.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
        } else {
            View view6 = new View(m().getContext());
            Rect rect3 = new Rect();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            androidx.collection.a aVar2 = new androidx.collection.a();
            Iterator it3 = list.iterator();
            Object obj4 = null;
            View view7 = null;
            boolean z6 = false;
            while (true) {
                str = "FragmentManager";
                if (!it3.hasNext()) {
                    break;
                }
                m mVar3 = (m) it3.next();
                if (!mVar3.i() || eVar == null || eVar2 == null) {
                    view3 = view6;
                    rect2 = rect3;
                    arrayList5 = arrayList7;
                    aVar = aVar2;
                    view4 = view7;
                    arrayList6 = arrayList8;
                } else {
                    Object u4 = c4.u(c4.f(mVar3.g()));
                    ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                    ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                    ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                    int i5 = 0;
                    while (i5 < sharedElementTargetNames.size()) {
                        int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i5));
                        ArrayList<String> arrayList9 = sharedElementTargetNames;
                        if (indexOf != -1) {
                            sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i5));
                        }
                        i5++;
                        sharedElementTargetNames = arrayList9;
                    }
                    ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                    if (z5) {
                        eVar.f().getEnterTransitionCallback();
                        eVar2.f().getExitTransitionCallback();
                    } else {
                        eVar.f().getExitTransitionCallback();
                        eVar2.f().getEnterTransitionCallback();
                    }
                    int i6 = 0;
                    for (int size = sharedElementSourceNames.size(); i6 < size; size = size) {
                        aVar2.put(sharedElementSourceNames.get(i6), sharedElementTargetNames2.get(i6));
                        i6++;
                    }
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        int i7 = 0;
                        for (int size2 = sharedElementTargetNames2.size(); i7 < size2; size2 = size2) {
                            String str4 = sharedElementTargetNames2.get(i7);
                            Log.v("FragmentManager", "Name: " + str4);
                            i7++;
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        int i8 = 0;
                        for (int size3 = sharedElementSourceNames.size(); i8 < size3; size3 = size3) {
                            String str5 = sharedElementSourceNames.get(i8);
                            Log.v("FragmentManager", "Name: " + str5);
                            i8++;
                        }
                    }
                    androidx.collection.a aVar3 = new androidx.collection.a();
                    u(aVar3, eVar.f().mView);
                    aVar3.s(sharedElementSourceNames);
                    aVar2.s(aVar3.keySet());
                    androidx.collection.a aVar4 = new androidx.collection.a();
                    u(aVar4, eVar2.f().mView);
                    aVar4.s(sharedElementTargetNames2);
                    aVar4.s(aVar2.values());
                    A.c(aVar2, aVar4);
                    v(aVar3, aVar2.keySet());
                    v(aVar4, aVar2.values());
                    if (aVar2.isEmpty()) {
                        arrayList7.clear();
                        arrayList8.clear();
                        view3 = view6;
                        rect2 = rect3;
                        arrayList5 = arrayList7;
                        aVar = aVar2;
                        arrayList6 = arrayList8;
                        obj4 = null;
                        z5 = z4;
                        arrayList7 = arrayList5;
                        arrayList8 = arrayList6;
                        aVar2 = aVar;
                        rect3 = rect2;
                        view6 = view3;
                    } else {
                        aVar = aVar2;
                        A.a(eVar2.f(), eVar.f(), z5, aVar3, true);
                        view4 = view7;
                        M.a(m(), new g(eVar2, eVar, z5, aVar4));
                        arrayList7.addAll(aVar3.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            i4 = 0;
                        } else {
                            i4 = 0;
                            View view8 = (View) aVar3.get((String) sharedElementSourceNames.get(0));
                            c4.p(u4, view8);
                            view4 = view8;
                        }
                        arrayList8.addAll(aVar4.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view5 = (View) aVar4.get((String) sharedElementTargetNames2.get(i4))) != null) {
                            M.a(m(), new h(c4, view5, rect3));
                            z6 = true;
                        }
                        c4.s(u4, view6, arrayList7);
                        rect2 = rect3;
                        ArrayList arrayList10 = arrayList7;
                        view3 = view6;
                        c4.n(u4, null, null, null, null, u4, arrayList8);
                        arrayList6 = arrayList8;
                        Boolean bool = Boolean.TRUE;
                        hashMap.put(eVar, bool);
                        hashMap.put(eVar2, bool);
                        arrayList5 = arrayList10;
                        obj4 = u4;
                    }
                }
                view7 = view4;
                z5 = z4;
                arrayList7 = arrayList5;
                arrayList8 = arrayList6;
                aVar2 = aVar;
                rect3 = rect2;
                view6 = view3;
            }
            G.e eVar4 = eVar;
            G.e eVar5 = eVar2;
            View view9 = view6;
            ArrayList arrayList11 = arrayList7;
            androidx.collection.a aVar5 = aVar2;
            View view10 = view7;
            Rect rect4 = rect3;
            ArrayList arrayList12 = arrayList8;
            ArrayList arrayList13 = new ArrayList();
            Iterator it4 = list.iterator();
            Object obj5 = null;
            Object obj6 = null;
            while (it4.hasNext()) {
                m mVar4 = (m) it4.next();
                if (mVar4.d()) {
                    hashMap.put(mVar4.b(), Boolean.FALSE);
                    mVar4.a();
                } else {
                    Object f4 = c4.f(mVar4.h());
                    G.e b4 = mVar4.b();
                    boolean z7 = obj4 != null && (b4 == eVar4 || b4 == eVar5);
                    if (f4 == null) {
                        if (!z7) {
                            hashMap.put(b4, Boolean.FALSE);
                            mVar4.a();
                        }
                        str3 = str;
                        view = view9;
                        arrayList4 = arrayList11;
                        arrayList2 = arrayList12;
                        rect = rect4;
                        arrayList3 = arrayList13;
                        view2 = view10;
                    } else {
                        Rect rect5 = rect4;
                        ArrayList arrayList14 = new ArrayList();
                        ArrayList arrayList15 = arrayList13;
                        t(arrayList14, b4.f().mView);
                        if (z7) {
                            if (b4 == eVar4) {
                                arrayList14.removeAll(arrayList11);
                            } else {
                                arrayList14.removeAll(arrayList12);
                            }
                        }
                        if (arrayList14.isEmpty()) {
                            c4.a(f4, view9);
                            str3 = str;
                            view = view9;
                            arrayList2 = arrayList12;
                            obj3 = obj5;
                            obj2 = obj6;
                            eVar3 = b4;
                            view2 = view10;
                            arrayList3 = arrayList15;
                            arrayList4 = arrayList11;
                            obj = f4;
                            rect = rect5;
                        } else {
                            c4.b(f4, arrayList14);
                            arrayList2 = arrayList12;
                            String str6 = str;
                            arrayList3 = arrayList15;
                            arrayList4 = arrayList11;
                            obj = f4;
                            rect = rect5;
                            str3 = str6;
                            view = view9;
                            view2 = view10;
                            obj2 = obj6;
                            obj3 = obj5;
                            c4.n(obj, f4, arrayList14, null, null, null, null);
                            if (b4.e() == G.e.c.GONE) {
                                eVar3 = b4;
                                list2.remove(eVar3);
                                ArrayList arrayList16 = new ArrayList(arrayList14);
                                arrayList16.remove(eVar3.f().mView);
                                c4.m(obj, eVar3.f().mView, arrayList16);
                                M.a(m(), new i(arrayList14));
                            } else {
                                eVar3 = b4;
                            }
                        }
                        if (eVar3.e() == G.e.c.VISIBLE) {
                            arrayList3.addAll(arrayList14);
                            if (z6) {
                                c4.o(obj, rect);
                            }
                        } else {
                            c4.p(obj, view2);
                        }
                        hashMap.put(eVar3, Boolean.TRUE);
                        if (mVar4.j()) {
                            obj3 = c4.k(obj3, obj, null);
                        } else {
                            obj2 = c4.k(obj2, obj, null);
                        }
                        obj5 = obj3;
                        obj6 = obj2;
                    }
                    arrayList11 = arrayList4;
                    eVar4 = eVar;
                    eVar5 = eVar2;
                    rect4 = rect;
                    arrayList13 = arrayList3;
                    view10 = view2;
                    view9 = view;
                    str = str3;
                    arrayList12 = arrayList2;
                }
            }
            String str7 = str;
            ArrayList arrayList17 = arrayList11;
            ArrayList arrayList18 = arrayList12;
            ArrayList arrayList19 = arrayList13;
            Object j4 = c4.j(obj5, obj6, obj4);
            if (j4 != null) {
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    m mVar5 = (m) it5.next();
                    if (!mVar5.d()) {
                        Object h4 = mVar5.h();
                        G.e b5 = mVar5.b();
                        boolean z8 = obj4 != null && (b5 == eVar || b5 == eVar2);
                        if (h4 == null && !z8) {
                            str2 = str7;
                        } else if (AbstractC1281a0.T(m())) {
                            str2 = str7;
                            c4.q(mVar5.b().f(), j4, mVar5.c(), new j(mVar5, b5));
                        } else {
                            if (FragmentManager.G0(2)) {
                                str2 = str7;
                                Log.v(str2, "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b5);
                            } else {
                                str2 = str7;
                            }
                            mVar5.a();
                        }
                        str7 = str2;
                    }
                }
                String str8 = str7;
                if (AbstractC1281a0.T(m())) {
                    A.d(arrayList19, 4);
                    ArrayList l4 = c4.l(arrayList18);
                    if (FragmentManager.G0(2)) {
                        Log.v(str8, ">>>>> Beginning transition <<<<<");
                        Log.v(str8, ">>>>> SharedElementFirstOutViews <<<<<");
                        int size4 = arrayList17.size();
                        int i9 = 0;
                        while (i9 < size4) {
                            Object obj7 = arrayList17.get(i9);
                            i9++;
                            View view11 = (View) obj7;
                            Log.v(str8, "View: " + view11 + " Name: " + AbstractC1281a0.K(view11));
                        }
                        arrayList = arrayList17;
                        Log.v(str8, ">>>>> SharedElementLastInViews <<<<<");
                        int size5 = arrayList18.size();
                        int i10 = 0;
                        while (i10 < size5) {
                            Object obj8 = arrayList18.get(i10);
                            i10++;
                            View view12 = (View) obj8;
                            Log.v(str8, "View: " + view12 + " Name: " + AbstractC1281a0.K(view12));
                        }
                    } else {
                        arrayList = arrayList17;
                    }
                    c4.c(m(), j4);
                    ArrayList arrayList20 = arrayList;
                    c4.r(m(), arrayList20, arrayList18, l4, aVar5);
                    A.d(arrayList19, 0);
                    c4.t(obj4, arrayList20, arrayList18);
                    return hashMap;
                }
            }
        }
        return hashMap;
    }

    private void y(List list) {
        Fragment f4 = ((G.e) list.get(list.size() - 1)).f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            G.e eVar = (G.e) it.next();
            eVar.f().mAnimationInfo.f12291c = f4.mAnimationInfo.f12291c;
            eVar.f().mAnimationInfo.f12292d = f4.mAnimationInfo.f12292d;
            eVar.f().mAnimationInfo.f12293e = f4.mAnimationInfo.f12293e;
            eVar.f().mAnimationInfo.f12294f = f4.mAnimationInfo.f12294f;
        }
    }

    @Override // androidx.fragment.app.G
    void f(List list, boolean z4) {
        int i4;
        Iterator it = list.iterator();
        G.e eVar = null;
        G.e eVar2 = null;
        while (it.hasNext()) {
            G.e eVar3 = (G.e) it.next();
            G.e.c c4 = G.e.c.c(eVar3.f().mView);
            int i5 = a.f12430a[eVar3.e().ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                if (c4 == G.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i5 == 4 && c4 != G.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "Executing operations from " + eVar + " to " + eVar2);
        }
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        y(list);
        Iterator it2 = list.iterator();
        while (true) {
            i4 = 0;
            r11 = false;
            boolean z5 = false;
            if (!it2.hasNext()) {
                break;
            }
            G.e eVar4 = (G.e) it2.next();
            androidx.core.os.e eVar5 = new androidx.core.os.e();
            eVar4.j(eVar5);
            arrayList.add(new k(eVar4, eVar5, z4));
            androidx.core.os.e eVar6 = new androidx.core.os.e();
            eVar4.j(eVar6);
            if (z4) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, eVar6, z4, z5));
                    eVar4.a(new RunnableC0106b(arrayList3, eVar4));
                }
                z5 = true;
                arrayList2.add(new m(eVar4, eVar6, z4, z5));
                eVar4.a(new RunnableC0106b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, eVar6, z4, z5));
                    eVar4.a(new RunnableC0106b(arrayList3, eVar4));
                }
                z5 = true;
                arrayList2.add(new m(eVar4, eVar6, z4, z5));
                eVar4.a(new RunnableC0106b(arrayList3, eVar4));
            }
        }
        Map x4 = x(arrayList2, arrayList3, z4, eVar, eVar2);
        w(arrayList, arrayList3, x4.containsValue(Boolean.TRUE), x4);
        int size = arrayList3.size();
        while (i4 < size) {
            Object obj = arrayList3.get(i4);
            i4++;
            s((G.e) obj);
        }
        arrayList3.clear();
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + eVar + " to " + eVar2);
        }
    }

    void s(G.e eVar) {
        eVar.e().a(eVar.f().mView);
    }

    void t(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (AbstractC1291f0.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    void u(Map map, View view) {
        String K3 = AbstractC1281a0.K(view);
        if (K3 != null) {
            map.put(K3, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(androidx.collection.a aVar, Collection collection) {
        Iterator it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(AbstractC1281a0.K((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }
}
