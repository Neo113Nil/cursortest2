package k0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.e;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import k0.AbstractC3204l;

/* renamed from: k0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3197e extends androidx.fragment.app.C {

    /* renamed from: k0.e$a */
    class a extends AbstractC3204l.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f40926a;

        a(Rect rect) {
            this.f40926a = rect;
        }
    }

    /* renamed from: k0.e$c */
    class c extends AbstractC3205m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f40931a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f40932b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f40933c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f40934d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f40935e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f40936f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f40931a = obj;
            this.f40932b = arrayList;
            this.f40933c = obj2;
            this.f40934d = arrayList2;
            this.f40935e = obj3;
            this.f40936f = arrayList3;
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionEnd(AbstractC3204l abstractC3204l) {
            abstractC3204l.removeListener(this);
        }

        @Override // k0.AbstractC3205m, k0.AbstractC3204l.f
        public void onTransitionStart(AbstractC3204l abstractC3204l) {
            Object obj = this.f40931a;
            if (obj != null) {
                C3197e.this.w(obj, this.f40932b, null);
            }
            Object obj2 = this.f40933c;
            if (obj2 != null) {
                C3197e.this.w(obj2, this.f40934d, null);
            }
            Object obj3 = this.f40935e;
            if (obj3 != null) {
                C3197e.this.w(obj3, this.f40936f, null);
            }
        }
    }

    /* renamed from: k0.e$d */
    class d implements e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3204l f40938a;

        d(AbstractC3204l abstractC3204l) {
            this.f40938a = abstractC3204l;
        }

        @Override // androidx.core.os.e.a
        public void a() {
            this.f40938a.cancel();
        }
    }

    /* renamed from: k0.e$f */
    class f extends AbstractC3204l.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f40942a;

        f(Rect rect) {
            this.f40942a = rect;
        }
    }

    private static boolean v(AbstractC3204l abstractC3204l) {
        return (androidx.fragment.app.C.i(abstractC3204l.getTargetIds()) && androidx.fragment.app.C.i(abstractC3204l.getTargetNames()) && androidx.fragment.app.C.i(abstractC3204l.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.C
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC3204l) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.C
    public void b(Object obj, ArrayList arrayList) {
        AbstractC3204l abstractC3204l = (AbstractC3204l) obj;
        if (abstractC3204l == null) {
            return;
        }
        int i4 = 0;
        if (abstractC3204l instanceof C3208p) {
            C3208p c3208p = (C3208p) abstractC3204l;
            int s4 = c3208p.s();
            while (i4 < s4) {
                b(c3208p.r(i4), arrayList);
                i4++;
            }
            return;
        }
        if (v(abstractC3204l) || !androidx.fragment.app.C.i(abstractC3204l.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i4 < size) {
            abstractC3204l.addTarget((View) arrayList.get(i4));
            i4++;
        }
    }

    @Override // androidx.fragment.app.C
    public void c(ViewGroup viewGroup, Object obj) {
        AbstractC3206n.a(viewGroup, (AbstractC3204l) obj);
    }

    @Override // androidx.fragment.app.C
    public boolean e(Object obj) {
        return obj instanceof AbstractC3204l;
    }

    @Override // androidx.fragment.app.C
    public Object f(Object obj) {
        if (obj != null) {
            return ((AbstractC3204l) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.C
    public Object j(Object obj, Object obj2, Object obj3) {
        AbstractC3204l abstractC3204l = (AbstractC3204l) obj;
        AbstractC3204l abstractC3204l2 = (AbstractC3204l) obj2;
        AbstractC3204l abstractC3204l3 = (AbstractC3204l) obj3;
        if (abstractC3204l != null && abstractC3204l2 != null) {
            abstractC3204l = new C3208p().p(abstractC3204l).p(abstractC3204l2).x(1);
        } else if (abstractC3204l == null) {
            abstractC3204l = abstractC3204l2 != null ? abstractC3204l2 : null;
        }
        if (abstractC3204l3 == null) {
            return abstractC3204l;
        }
        C3208p c3208p = new C3208p();
        if (abstractC3204l != null) {
            c3208p.p(abstractC3204l);
        }
        c3208p.p(abstractC3204l3);
        return c3208p;
    }

    @Override // androidx.fragment.app.C
    public Object k(Object obj, Object obj2, Object obj3) {
        C3208p c3208p = new C3208p();
        if (obj != null) {
            c3208p.p((AbstractC3204l) obj);
        }
        if (obj2 != null) {
            c3208p.p((AbstractC3204l) obj2);
        }
        if (obj3 != null) {
            c3208p.p((AbstractC3204l) obj3);
        }
        return c3208p;
    }

    @Override // androidx.fragment.app.C
    public void m(Object obj, View view, ArrayList arrayList) {
        ((AbstractC3204l) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.C
    public void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC3204l) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.C
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC3204l) obj).setEpicenterCallback(new f(rect));
        }
    }

    @Override // androidx.fragment.app.C
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((AbstractC3204l) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.C
    public void q(Fragment fragment, Object obj, androidx.core.os.e eVar, Runnable runnable) {
        AbstractC3204l abstractC3204l = (AbstractC3204l) obj;
        eVar.b(new d(abstractC3204l));
        abstractC3204l.addListener(new C0223e(runnable));
    }

    @Override // androidx.fragment.app.C
    public void s(Object obj, View view, ArrayList arrayList) {
        C3208p c3208p = (C3208p) obj;
        List<View> targets = c3208p.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.fragment.app.C.d(targets, (View) arrayList.get(i4));
        }
        targets.add(view);
        arrayList.add(view);
        b(c3208p, arrayList);
    }

    @Override // androidx.fragment.app.C
    public void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C3208p c3208p = (C3208p) obj;
        if (c3208p != null) {
            c3208p.getTargets().clear();
            c3208p.getTargets().addAll(arrayList2);
            w(c3208p, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.C
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        C3208p c3208p = new C3208p();
        c3208p.p((AbstractC3204l) obj);
        return c3208p;
    }

    public void w(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC3204l abstractC3204l = (AbstractC3204l) obj;
        int i4 = 0;
        if (abstractC3204l instanceof C3208p) {
            C3208p c3208p = (C3208p) abstractC3204l;
            int s4 = c3208p.s();
            while (i4 < s4) {
                w(c3208p.r(i4), arrayList, arrayList2);
                i4++;
            }
            return;
        }
        if (v(abstractC3204l)) {
            return;
        }
        List<View> targets = abstractC3204l.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i4 < size) {
                abstractC3204l.addTarget((View) arrayList2.get(i4));
                i4++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC3204l.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    /* renamed from: k0.e$b */
    class b implements AbstractC3204l.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f40928a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f40929b;

        b(View view, ArrayList arrayList) {
            this.f40928a = view;
            this.f40929b = arrayList;
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionEnd(AbstractC3204l abstractC3204l) {
            abstractC3204l.removeListener(this);
            this.f40928a.setVisibility(8);
            int size = this.f40929b.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((View) this.f40929b.get(i4)).setVisibility(0);
            }
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionStart(AbstractC3204l abstractC3204l) {
            abstractC3204l.removeListener(this);
            abstractC3204l.addListener(this);
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionCancel(AbstractC3204l abstractC3204l) {
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionPause(AbstractC3204l abstractC3204l) {
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionResume(AbstractC3204l abstractC3204l) {
        }
    }

    /* renamed from: k0.e$e, reason: collision with other inner class name */
    class C0223e implements AbstractC3204l.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f40940a;

        C0223e(Runnable runnable) {
            this.f40940a = runnable;
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionEnd(AbstractC3204l abstractC3204l) {
            this.f40940a.run();
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionCancel(AbstractC3204l abstractC3204l) {
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionPause(AbstractC3204l abstractC3204l) {
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionResume(AbstractC3204l abstractC3204l) {
        }

        @Override // k0.AbstractC3204l.f
        public void onTransitionStart(AbstractC3204l abstractC3204l) {
        }
    }
}
