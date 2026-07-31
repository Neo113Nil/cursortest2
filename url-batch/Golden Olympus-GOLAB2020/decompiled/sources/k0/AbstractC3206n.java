package k0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.AbstractC1281a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: k0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3206n {

    /* renamed from: a, reason: collision with root package name */
    private static AbstractC3204l f40961a = new C3194b();

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal f40962b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    static ArrayList f40963c = new ArrayList();

    public static void a(ViewGroup viewGroup, AbstractC3204l abstractC3204l) {
        if (f40963c.contains(viewGroup) || !AbstractC1281a0.T(viewGroup)) {
            return;
        }
        f40963c.add(viewGroup);
        if (abstractC3204l == null) {
            abstractC3204l = f40961a;
        }
        AbstractC3204l clone = abstractC3204l.clone();
        g(viewGroup, clone);
        C3203k.f(viewGroup, null);
        f(viewGroup, clone);
    }

    private static void b(C3203k c3203k, AbstractC3204l abstractC3204l) {
        ViewGroup d4 = c3203k.d();
        if (f40963c.contains(d4)) {
            return;
        }
        C3203k c4 = C3203k.c(d4);
        if (abstractC3204l == null) {
            if (c4 != null) {
                c4.b();
            }
            c3203k.a();
            return;
        }
        f40963c.add(d4);
        AbstractC3204l clone = abstractC3204l.clone();
        if (c4 != null && c4.e()) {
            clone.setCanRemoveViews(true);
        }
        g(d4, clone);
        c3203k.a();
        f(d4, clone);
    }

    public static void c(ViewGroup viewGroup) {
        f40963c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) d().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((AbstractC3204l) arrayList2.get(size)).forceToEnd(viewGroup);
        }
    }

    static androidx.collection.a d() {
        androidx.collection.a aVar;
        WeakReference weakReference = (WeakReference) f40962b.get();
        if (weakReference != null && (aVar = (androidx.collection.a) weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a aVar2 = new androidx.collection.a();
        f40962b.set(new WeakReference(aVar2));
        return aVar2;
    }

    public static void e(C3203k c3203k, AbstractC3204l abstractC3204l) {
        b(c3203k, abstractC3204l);
    }

    private static void f(ViewGroup viewGroup, AbstractC3204l abstractC3204l) {
        if (abstractC3204l == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC3204l, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void g(ViewGroup viewGroup, AbstractC3204l abstractC3204l) {
        ArrayList arrayList = (ArrayList) d().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((AbstractC3204l) obj).pause(viewGroup);
            }
        }
        if (abstractC3204l != null) {
            abstractC3204l.captureValues(viewGroup, true);
        }
        C3203k c4 = C3203k.c(viewGroup);
        if (c4 != null) {
            c4.b();
        }
    }

    /* renamed from: k0.n$a */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        AbstractC3204l f40964a;

        /* renamed from: b, reason: collision with root package name */
        ViewGroup f40965b;

        /* renamed from: k0.n$a$a, reason: collision with other inner class name */
        class C0224a extends AbstractC3205m {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f40966a;

            C0224a(androidx.collection.a aVar) {
                this.f40966a = aVar;
            }

            @Override // k0.AbstractC3204l.f
            public void onTransitionEnd(AbstractC3204l abstractC3204l) {
                ((ArrayList) this.f40966a.get(a.this.f40965b)).remove(abstractC3204l);
                abstractC3204l.removeListener(this);
            }
        }

        a(AbstractC3204l abstractC3204l, ViewGroup viewGroup) {
            this.f40964a = abstractC3204l;
            this.f40965b = viewGroup;
        }

        private void a() {
            this.f40965b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f40965b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!AbstractC3206n.f40963c.remove(this.f40965b)) {
                return true;
            }
            androidx.collection.a d4 = AbstractC3206n.d();
            ArrayList arrayList = (ArrayList) d4.get(this.f40965b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                d4.put(this.f40965b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f40964a);
            this.f40964a.addListener(new C0224a(d4));
            int i4 = 0;
            this.f40964a.captureValues(this.f40965b, false);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i4 < size) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    ((AbstractC3204l) obj).resume(this.f40965b);
                }
            }
            this.f40964a.playTransition(this.f40965b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            AbstractC3206n.f40963c.remove(this.f40965b);
            ArrayList arrayList = (ArrayList) AbstractC3206n.d().get(this.f40965b);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((AbstractC3204l) obj).resume(this.f40965b);
                }
            }
            this.f40964a.clearValues(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
