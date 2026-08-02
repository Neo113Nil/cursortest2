package K3;

import E.A;
import E.H;
import G3.C0050a;
import G3.p;
import W.D;
import W.F;
import W.J;
import W.u;
import X.s;
import X.t;
import a.AbstractC0124a;
import a0.C0130F;
import a0.C0155v;
import a0.C0156w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import d3.q;
import f.AbstractC0410a;
import java.lang.reflect.Field;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import k.AbstractC1237x;
import k.C1227n;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public Object f1595a;

    /* renamed from: b, reason: collision with root package name */
    public int f1596b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1597c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1598d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1599e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1600f;

    public n(C0050a c0050a, t1.h routeDatabase, i iVar) {
        List j4;
        kotlin.jvm.internal.i.e(routeDatabase, "routeDatabase");
        this.f1597c = c0050a;
        this.f1598d = routeDatabase;
        q qVar = q.f8333a;
        this.f1599e = qVar;
        this.f1595a = qVar;
        this.f1600f = new ArrayList();
        p url = c0050a.f863h;
        kotlin.jvm.internal.i.e(url, "url");
        URI f4 = url.f();
        if (f4.getHost() == null) {
            j4 = H3.b.j(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = c0050a.f862g.select(f4);
            j4 = (select == null || select.isEmpty()) ? H3.b.j(Proxy.NO_PROXY) : H3.b.u(select);
        }
        this.f1599e = j4;
        this.f1596b = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r10 < r3.f3559b) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(long j4, u uVar) {
        int i4;
        ArrayDeque arrayDeque = (ArrayDeque) this.f1599e;
        PriorityQueue priorityQueue = (PriorityQueue) this.f1595a;
        if (j4 != -9223372036854775807L && (i4 = this.f1596b) != 0) {
            if (i4 != -1 && priorityQueue.size() >= this.f1596b) {
                s sVar = (s) priorityQueue.peek();
                String str = J.f3263a;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.f1598d;
            u uVar2 = arrayDeque2.isEmpty() ? new u() : (u) arrayDeque2.pop();
            uVar2.J(uVar.a());
            System.arraycopy(uVar.f3351a, uVar.f3352b, uVar2.f3351a, 0, uVar2.a());
            s sVar2 = (s) this.f1600f;
            if (sVar2 != null && j4 == sVar2.f3559b) {
                sVar2.f3558a.add(uVar2);
                return;
            }
            s sVar3 = arrayDeque.isEmpty() ? new s() : (s) arrayDeque.pop();
            ArrayList arrayList = sVar3.f3558a;
            AbstractC0124a.h(j4 != -9223372036854775807L);
            AbstractC0124a.t(arrayList.isEmpty());
            sVar3.f3559b = j4;
            arrayList.add(uVar2);
            priorityQueue.add(sVar3);
            this.f1600f = sVar3;
            int i5 = this.f1596b;
            if (i5 != -1) {
                c(i5);
                return;
            }
            return;
        }
        ((t) this.f1597c).a(j4, uVar);
    }

    public void b() {
        View view = (View) this.f1597c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((G3.h) this.f1599e) != null) {
                if (((G3.h) this.f1600f) == null) {
                    this.f1600f = new G3.h();
                }
                G3.h hVar = (G3.h) this.f1600f;
                hVar.f909c = null;
                hVar.f908b = false;
                hVar.f910d = null;
                hVar.f907a = false;
                Field field = H.f375a;
                ColorStateList a3 = A.a(view);
                if (a3 != null) {
                    hVar.f908b = true;
                    hVar.f909c = a3;
                }
                PorterDuff.Mode b4 = A.b(view);
                if (b4 != null) {
                    hVar.f907a = true;
                    hVar.f910d = b4;
                }
                if (hVar.f908b || hVar.f907a) {
                    C1227n.c(background, hVar, view.getDrawableState());
                    return;
                }
            }
            G3.h hVar2 = (G3.h) this.f1595a;
            if (hVar2 != null) {
                C1227n.c(background, hVar2, view.getDrawableState());
                return;
            }
            G3.h hVar3 = (G3.h) this.f1599e;
            if (hVar3 != null) {
                C1227n.c(background, hVar3, view.getDrawableState());
            }
        }
    }

    public void c(int i4) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f1595a;
        while (priorityQueue.size() > i4) {
            s sVar = (s) priorityQueue.poll();
            String str = J.f3263a;
            int i5 = 0;
            while (true) {
                arrayList = sVar.f3558a;
                if (i5 >= arrayList.size()) {
                    break;
                }
                ((t) this.f1597c).a(sVar.f3559b, (u) arrayList.get(i5));
                ((ArrayDeque) this.f1598d).push((u) arrayList.get(i5));
                i5++;
            }
            arrayList.clear();
            s sVar2 = (s) this.f1600f;
            if (sVar2 != null && sVar2.f3559b == sVar.f3559b) {
                this.f1600f = null;
            }
            ((ArrayDeque) this.f1599e).push(sVar);
        }
    }

    public boolean d() {
        return this.f1596b < ((List) this.f1599e).size() || !((ArrayList) this.f1600f).isEmpty();
    }

    public void e(AttributeSet attributeSet, int i4) {
        ColorStateList f4;
        View view = (View) this.f1597c;
        B1.j v = B1.j.v(view.getContext(), attributeSet, AbstractC0410a.f8488u, i4);
        TypedArray typedArray = (TypedArray) v.f202c;
        try {
            if (typedArray.hasValue(0)) {
                this.f1596b = typedArray.getResourceId(0, -1);
                C1227n c1227n = (C1227n) this.f1598d;
                Context context = view.getContext();
                int i5 = this.f1596b;
                synchronized (c1227n) {
                    f4 = c1227n.f14051a.f(context, i5);
                }
                if (f4 != null) {
                    h(f4);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList m4 = v.m(1);
                Field field = H.f375a;
                A.d(view, m4);
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode c4 = AbstractC1237x.c(typedArray.getInt(2, -1), null);
                Field field2 = H.f375a;
                A.e(view, c4);
            }
        } finally {
            v.x();
        }
    }

    public void f(int i4) {
        ColorStateList colorStateList;
        this.f1596b = i4;
        C1227n c1227n = (C1227n) this.f1598d;
        if (c1227n != null) {
            Context context = ((View) this.f1597c).getContext();
            synchronized (c1227n) {
                colorStateList = c1227n.f14051a.f(context, i4);
            }
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        b();
    }

    public void g(Runnable runnable) {
        F f4 = (F) this.f1597c;
        if (f4.f3257a.getLooper().getThread().isAlive()) {
            f4.c(runnable);
        }
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((G3.h) this.f1599e) == null) {
                this.f1599e = new G3.h();
            }
            G3.h hVar = (G3.h) this.f1599e;
            hVar.f909c = colorStateList;
            hVar.f908b = true;
        } else {
            this.f1599e = null;
        }
        b();
    }

    public void i(int i4) {
        AbstractC0124a.t(i4 >= 0);
        this.f1596b = i4;
        c(i4);
    }

    public void j(ColorStateList colorStateList) {
        if (((G3.h) this.f1595a) == null) {
            this.f1595a = new G3.h();
        }
        G3.h hVar = (G3.h) this.f1595a;
        hVar.f909c = colorStateList;
        hVar.f908b = true;
        b();
    }

    public void k(PorterDuff.Mode mode) {
        if (((G3.h) this.f1595a) == null) {
            this.f1595a = new G3.h();
        }
        G3.h hVar = (G3.h) this.f1595a;
        hVar.f910d = mode;
        hVar.f907a = true;
        b();
    }

    public void l(Object obj) {
        Object obj2 = this.f1595a;
        this.f1595a = obj;
        if (obj2.equals(obj)) {
            return;
        }
        C0130F c0130f = ((C0156w) this.f1599e).f4248a;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        c0130f.L();
        c0130f.D(1, 10, num);
        c0130f.D(2, 10, num);
        c0130f.n.e(21, new C0155v(intValue, 1));
    }

    public n(View view) {
        C1227n c1227n;
        this.f1596b = -1;
        this.f1597c = view;
        PorterDuff.Mode mode = C1227n.f14049b;
        synchronized (C1227n.class) {
            try {
                if (C1227n.f14050c == null) {
                    C1227n.b();
                }
                c1227n = C1227n.f14050c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1598d = c1227n;
    }

    public n(t tVar) {
        this.f1597c = tVar;
        this.f1598d = new ArrayDeque();
        this.f1599e = new ArrayDeque();
        this.f1595a = new PriorityQueue();
        this.f1596b = -1;
    }

    public n(Object obj, Looper looper, Looper looper2, D d4, C0156w c0156w) {
        this.f1597c = d4.a(looper, null);
        this.f1598d = d4.a(looper2, null);
        this.f1595a = obj;
        this.f1600f = obj;
        this.f1599e = c0156w;
    }
}
