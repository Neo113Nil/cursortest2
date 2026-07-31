package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.AbstractC1281a0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g extends t {

    /* renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f13033s;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f13034h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f13035i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f13036j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f13037k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    ArrayList f13038l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    ArrayList f13039m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    ArrayList f13040n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    ArrayList f13041o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    ArrayList f13042p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    ArrayList f13043q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    ArrayList f13044r = new ArrayList();

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f13045b;

        a(ArrayList arrayList) {
            this.f13045b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f13045b;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                j jVar = (j) obj;
                g.this.S(jVar.f13079a, jVar.f13080b, jVar.f13081c, jVar.f13082d, jVar.f13083e);
            }
            this.f13045b.clear();
            g.this.f13039m.remove(this.f13045b);
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f13047b;

        b(ArrayList arrayList) {
            this.f13047b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f13047b;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                g.this.R((i) obj);
            }
            this.f13047b.clear();
            g.this.f13040n.remove(this.f13047b);
        }
    }

    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f13049b;

        c(ArrayList arrayList) {
            this.f13049b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f13049b;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                g.this.Q((RecyclerView.E) obj);
            }
            this.f13049b.clear();
            g.this.f13038l.remove(this.f13049b);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.E f13051a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13052b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f13053c;

        d(RecyclerView.E e4, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f13051a = e4;
            this.f13052b = viewPropertyAnimator;
            this.f13053c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13052b.setListener(null);
            this.f13053c.setAlpha(1.0f);
            g.this.G(this.f13051a);
            g.this.f13043q.remove(this.f13051a);
            g.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.H(this.f13051a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.E f13055a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f13056b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13057c;

        e(RecyclerView.E e4, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f13055a = e4;
            this.f13056b = view;
            this.f13057c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13056b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13057c.setListener(null);
            g.this.A(this.f13055a);
            g.this.f13041o.remove(this.f13055a);
            g.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.B(this.f13055a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.E f13059a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13060b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f13061c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13062d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13063e;

        f(RecyclerView.E e4, int i4, View view, int i5, ViewPropertyAnimator viewPropertyAnimator) {
            this.f13059a = e4;
            this.f13060b = i4;
            this.f13061c = view;
            this.f13062d = i5;
            this.f13063e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f13060b != 0) {
                this.f13061c.setTranslationX(0.0f);
            }
            if (this.f13062d != 0) {
                this.f13061c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13063e.setListener(null);
            g.this.E(this.f13059a);
            g.this.f13042p.remove(this.f13059a);
            g.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.F(this.f13059a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g, reason: collision with other inner class name */
    class C0123g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f13065a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13066b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f13067c;

        C0123g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f13065a = iVar;
            this.f13066b = viewPropertyAnimator;
            this.f13067c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13066b.setListener(null);
            this.f13067c.setAlpha(1.0f);
            this.f13067c.setTranslationX(0.0f);
            this.f13067c.setTranslationY(0.0f);
            g.this.C(this.f13065a.f13073a, true);
            g.this.f13044r.remove(this.f13065a.f13073a);
            g.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.D(this.f13065a.f13073a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f13069a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13070b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f13071c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f13069a = iVar;
            this.f13070b = viewPropertyAnimator;
            this.f13071c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13070b.setListener(null);
            this.f13071c.setAlpha(1.0f);
            this.f13071c.setTranslationX(0.0f);
            this.f13071c.setTranslationY(0.0f);
            g.this.C(this.f13069a.f13074b, false);
            g.this.f13044r.remove(this.f13069a.f13074b);
            g.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.D(this.f13069a.f13074b, false);
        }
    }

    private static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.E f13079a;

        /* renamed from: b, reason: collision with root package name */
        public int f13080b;

        /* renamed from: c, reason: collision with root package name */
        public int f13081c;

        /* renamed from: d, reason: collision with root package name */
        public int f13082d;

        /* renamed from: e, reason: collision with root package name */
        public int f13083e;

        j(RecyclerView.E e4, int i4, int i5, int i6, int i7) {
            this.f13079a = e4;
            this.f13080b = i4;
            this.f13081c = i5;
            this.f13082d = i6;
            this.f13083e = i7;
        }
    }

    private void T(RecyclerView.E e4) {
        View view = e4.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f13043q.add(e4);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(e4, animate, view)).start();
    }

    private void W(List list, RecyclerView.E e4) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, e4) && iVar.f13073a == null && iVar.f13074b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.E e4 = iVar.f13073a;
        if (e4 != null) {
            Y(iVar, e4);
        }
        RecyclerView.E e5 = iVar.f13074b;
        if (e5 != null) {
            Y(iVar, e5);
        }
    }

    private boolean Y(i iVar, RecyclerView.E e4) {
        boolean z4 = false;
        if (iVar.f13074b == e4) {
            iVar.f13074b = null;
        } else {
            if (iVar.f13073a != e4) {
                return false;
            }
            iVar.f13073a = null;
            z4 = true;
        }
        e4.itemView.setAlpha(1.0f);
        e4.itemView.setTranslationX(0.0f);
        e4.itemView.setTranslationY(0.0f);
        C(e4, z4);
        return true;
    }

    private void Z(RecyclerView.E e4) {
        if (f13033s == null) {
            f13033s = new ValueAnimator().getInterpolator();
        }
        e4.itemView.animate().setInterpolator(f13033s);
        j(e4);
    }

    void Q(RecyclerView.E e4) {
        View view = e4.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f13041o.add(e4);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(e4, view, animate)).start();
    }

    void R(i iVar) {
        RecyclerView.E e4 = iVar.f13073a;
        View view = e4 == null ? null : e4.itemView;
        RecyclerView.E e5 = iVar.f13074b;
        View view2 = e5 != null ? e5.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f13044r.add(iVar.f13073a);
            duration.translationX(iVar.f13077e - iVar.f13075c);
            duration.translationY(iVar.f13078f - iVar.f13076d);
            duration.alpha(0.0f).setListener(new C0123g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f13044r.add(iVar.f13074b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    void S(RecyclerView.E e4, int i4, int i5, int i6, int i7) {
        View view = e4.itemView;
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if (i8 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i9 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f13042p.add(e4);
        animate.setDuration(n()).setListener(new f(e4, i8, view, i9, animate)).start();
    }

    void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.E) list.get(size)).itemView.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.E e4, List list) {
        return !list.isEmpty() || super.g(e4, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.E e4) {
        View view = e4.itemView;
        view.animate().cancel();
        int size = this.f13036j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f13036j.get(size)).f13079a == e4) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(e4);
                this.f13036j.remove(size);
            }
        }
        W(this.f13037k, e4);
        if (this.f13034h.remove(e4)) {
            view.setAlpha(1.0f);
            G(e4);
        }
        if (this.f13035i.remove(e4)) {
            view.setAlpha(1.0f);
            A(e4);
        }
        for (int size2 = this.f13040n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f13040n.get(size2);
            W(arrayList, e4);
            if (arrayList.isEmpty()) {
                this.f13040n.remove(size2);
            }
        }
        for (int size3 = this.f13039m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f13039m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f13079a == e4) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(e4);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f13039m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f13038l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f13038l.get(size5);
            if (arrayList3.remove(e4)) {
                view.setAlpha(1.0f);
                A(e4);
                if (arrayList3.isEmpty()) {
                    this.f13038l.remove(size5);
                }
            }
        }
        this.f13043q.remove(e4);
        this.f13041o.remove(e4);
        this.f13044r.remove(e4);
        this.f13042p.remove(e4);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f13036j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f13036j.get(size);
            View view = jVar.f13079a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f13079a);
            this.f13036j.remove(size);
        }
        for (int size2 = this.f13034h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.E) this.f13034h.get(size2));
            this.f13034h.remove(size2);
        }
        int size3 = this.f13035i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.E e4 = (RecyclerView.E) this.f13035i.get(size3);
            e4.itemView.setAlpha(1.0f);
            A(e4);
            this.f13035i.remove(size3);
        }
        for (int size4 = this.f13037k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f13037k.get(size4));
        }
        this.f13037k.clear();
        if (p()) {
            for (int size5 = this.f13039m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f13039m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f13079a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f13079a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f13039m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f13038l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f13038l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.E e5 = (RecyclerView.E) arrayList2.get(size8);
                    e5.itemView.setAlpha(1.0f);
                    A(e5);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f13038l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f13040n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f13040n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f13040n.remove(arrayList3);
                    }
                }
            }
            U(this.f13043q);
            U(this.f13042p);
            U(this.f13041o);
            U(this.f13044r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f13035i.isEmpty() && this.f13037k.isEmpty() && this.f13036j.isEmpty() && this.f13034h.isEmpty() && this.f13042p.isEmpty() && this.f13043q.isEmpty() && this.f13041o.isEmpty() && this.f13044r.isEmpty() && this.f13039m.isEmpty() && this.f13038l.isEmpty() && this.f13040n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void u() {
        boolean isEmpty = this.f13034h.isEmpty();
        boolean isEmpty2 = this.f13036j.isEmpty();
        boolean isEmpty3 = this.f13037k.isEmpty();
        boolean isEmpty4 = this.f13035i.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        ArrayList arrayList = this.f13034h;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            T((RecyclerView.E) obj);
        }
        this.f13034h.clear();
        if (!isEmpty2) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f13036j);
            this.f13039m.add(arrayList2);
            this.f13036j.clear();
            a aVar = new a(arrayList2);
            if (isEmpty) {
                aVar.run();
            } else {
                AbstractC1281a0.h0(((j) arrayList2.get(0)).f13079a.itemView, aVar, o());
            }
        }
        if (!isEmpty3) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.f13037k);
            this.f13040n.add(arrayList3);
            this.f13037k.clear();
            b bVar = new b(arrayList3);
            if (isEmpty) {
                bVar.run();
            } else {
                AbstractC1281a0.h0(((i) arrayList3.get(0)).f13073a.itemView, bVar, o());
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(this.f13035i);
        this.f13038l.add(arrayList4);
        this.f13035i.clear();
        c cVar = new c(arrayList4);
        if (isEmpty && isEmpty2 && isEmpty3) {
            cVar.run();
        } else {
            AbstractC1281a0.h0(((RecyclerView.E) arrayList4.get(0)).itemView, cVar, (!isEmpty ? o() : 0L) + Math.max(!isEmpty2 ? n() : 0L, isEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.t
    public boolean w(RecyclerView.E e4) {
        Z(e4);
        e4.itemView.setAlpha(0.0f);
        this.f13035i.add(e4);
        return true;
    }

    @Override // androidx.recyclerview.widget.t
    public boolean x(RecyclerView.E e4, RecyclerView.E e5, int i4, int i5, int i6, int i7) {
        if (e4 == e5) {
            return y(e4, i4, i5, i6, i7);
        }
        float translationX = e4.itemView.getTranslationX();
        float translationY = e4.itemView.getTranslationY();
        float alpha = e4.itemView.getAlpha();
        Z(e4);
        int i8 = (int) ((i6 - i4) - translationX);
        int i9 = (int) ((i7 - i5) - translationY);
        e4.itemView.setTranslationX(translationX);
        e4.itemView.setTranslationY(translationY);
        e4.itemView.setAlpha(alpha);
        if (e5 != null) {
            Z(e5);
            e5.itemView.setTranslationX(-i8);
            e5.itemView.setTranslationY(-i9);
            e5.itemView.setAlpha(0.0f);
        }
        this.f13037k.add(new i(e4, e5, i4, i5, i6, i7));
        return true;
    }

    @Override // androidx.recyclerview.widget.t
    public boolean y(RecyclerView.E e4, int i4, int i5, int i6, int i7) {
        View view = e4.itemView;
        int translationX = i4 + ((int) view.getTranslationX());
        int translationY = i5 + ((int) e4.itemView.getTranslationY());
        Z(e4);
        int i8 = i6 - translationX;
        int i9 = i7 - translationY;
        if (i8 == 0 && i9 == 0) {
            E(e4);
            return false;
        }
        if (i8 != 0) {
            view.setTranslationX(-i8);
        }
        if (i9 != 0) {
            view.setTranslationY(-i9);
        }
        this.f13036j.add(new j(e4, translationX, translationY, i6, i7));
        return true;
    }

    @Override // androidx.recyclerview.widget.t
    public boolean z(RecyclerView.E e4) {
        Z(e4);
        this.f13034h.add(e4);
        return true;
    }

    private static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.E f13073a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.E f13074b;

        /* renamed from: c, reason: collision with root package name */
        public int f13075c;

        /* renamed from: d, reason: collision with root package name */
        public int f13076d;

        /* renamed from: e, reason: collision with root package name */
        public int f13077e;

        /* renamed from: f, reason: collision with root package name */
        public int f13078f;

        private i(RecyclerView.E e4, RecyclerView.E e5) {
            this.f13073a = e4;
            this.f13074b = e5;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f13073a + ", newHolder=" + this.f13074b + ", fromX=" + this.f13075c + ", fromY=" + this.f13076d + ", toX=" + this.f13077e + ", toY=" + this.f13078f + '}';
        }

        i(RecyclerView.E e4, RecyclerView.E e5, int i4, int i5, int i6, int i7) {
            this(e4, e5);
            this.f13075c = i4;
            this.f13076d = i5;
            this.f13077e = i6;
            this.f13078f = i7;
        }
    }
}
