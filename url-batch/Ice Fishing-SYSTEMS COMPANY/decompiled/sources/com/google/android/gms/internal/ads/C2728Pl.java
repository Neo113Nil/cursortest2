package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import g.AbstractC4518a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import m.AbstractC4742j0;
import m.C4758s;

/* renamed from: com.google.android.gms.internal.ads.Pl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2728Pl {

    /* renamed from: a, reason: collision with root package name */
    public int f27029a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27030b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27031c;

    /* renamed from: d, reason: collision with root package name */
    public Object f27032d;

    /* renamed from: e, reason: collision with root package name */
    public Object f27033e;

    /* renamed from: f, reason: collision with root package name */
    public Object f27034f;

    public C2728Pl(Looper looper, Looper looper2, T2 t22, C2929aO c2929aO) {
        this.f27030b = t22.A(looper, null);
        this.f27031c = t22.A(looper2, null);
        this.f27033e = 0;
        this.f27034f = 0;
        this.f27032d = c2929aO;
    }

    public void a() {
        View view = (View) this.f27030b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((e8.h) this.f27032d) != null) {
                if (((e8.h) this.f27034f) == null) {
                    this.f27034f = new e8.h();
                }
                e8.h hVar = (e8.h) this.f27034f;
                hVar.f37401c = null;
                hVar.f37400b = false;
                hVar.f37402d = null;
                hVar.f37399a = false;
                WeakHashMap weakHashMap = O.X.f2240a;
                ColorStateList g9 = O.L.g(view);
                if (g9 != null) {
                    hVar.f37400b = true;
                    hVar.f37401c = g9;
                }
                PorterDuff.Mode h9 = O.L.h(view);
                if (h9 != null) {
                    hVar.f37399a = true;
                    hVar.f37402d = h9;
                }
                if (hVar.f37400b || hVar.f37399a) {
                    C4758s.e(background, hVar, view.getDrawableState());
                    return;
                }
            }
            e8.h hVar2 = (e8.h) this.f27033e;
            if (hVar2 != null) {
                C4758s.e(background, hVar2, view.getDrawableState());
                return;
            }
            e8.h hVar3 = (e8.h) this.f27032d;
            if (hVar3 != null) {
                C4758s.e(background, hVar3, view.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        e8.h hVar = (e8.h) this.f27033e;
        if (hVar != null) {
            return (ColorStateList) hVar.f37401c;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        e8.h hVar = (e8.h) this.f27033e;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f37402d;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i) {
        ColorStateList f6;
        View view = (View) this.f27030b;
        Context context = view.getContext();
        int[] iArr = AbstractC4518a.f37842z;
        m.Q0 p6 = m.Q0.p(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) p6.f39326c;
        View view2 = (View) this.f27030b;
        O.X.n(view2, view2.getContext(), iArr, attributeSet, (TypedArray) p6.f39326c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f27029a = typedArray.getResourceId(0, -1);
                C4758s c4758s = (C4758s) this.f27031c;
                Context context2 = view.getContext();
                int i4 = this.f27029a;
                synchronized (c4758s) {
                    f6 = c4758s.f39494a.f(context2, i4);
                }
                if (f6 != null) {
                    g(f6);
                }
            }
            if (typedArray.hasValue(1)) {
                O.L.q(view, p6.f(1));
            }
            if (typedArray.hasValue(2)) {
                O.L.r(view, AbstractC4742j0.b(typedArray.getInt(2, -1), null));
            }
            p6.q();
        } catch (Throwable th) {
            p6.q();
            throw th;
        }
    }

    public void e() {
        this.f27029a = -1;
        g(null);
        a();
    }

    public void f(int i) {
        ColorStateList colorStateList;
        this.f27029a = i;
        C4758s c4758s = (C4758s) this.f27031c;
        if (c4758s != null) {
            Context context = ((View) this.f27030b).getContext();
            synchronized (c4758s) {
                colorStateList = c4758s.f39494a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((e8.h) this.f27032d) == null) {
                this.f27032d = new e8.h();
            }
            e8.h hVar = (e8.h) this.f27032d;
            hVar.f37401c = colorStateList;
            hVar.f37400b = true;
        } else {
            this.f27032d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (((e8.h) this.f27033e) == null) {
            this.f27033e = new e8.h();
        }
        e8.h hVar = (e8.h) this.f27033e;
        hVar.f37401c = colorStateList;
        hVar.f37400b = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (((e8.h) this.f27033e) == null) {
            this.f27033e = new e8.h();
        }
        e8.h hVar = (e8.h) this.f27033e;
        hVar.f37402d = mode;
        hVar.f37399a = true;
        a();
    }

    public void j(int i) {
        PA.T(i >= 0);
        this.f27029a = i;
        l(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r8 < r0.f35331u) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(long j9, Lr lr) {
        if (j9 != com.anythink.basead.exoplayer.b.f6539b) {
            int i = this.f27029a;
            if (i != 0) {
                PriorityQueue priorityQueue = (PriorityQueue) this.f27033e;
                if (i != -1 && priorityQueue.size() >= this.f27029a) {
                    C4214yC c4214yC = (C4214yC) priorityQueue.peek();
                    String str = AbstractC3548lu.f32613a;
                }
                ArrayDeque arrayDeque = (ArrayDeque) this.f27031c;
                Lr lr2 = arrayDeque.isEmpty() ? new Lr() : (Lr) arrayDeque.pop();
                lr2.y(lr.B());
                System.arraycopy(lr.f26233a, lr.f26234b, lr2.f26233a, 0, lr2.B());
                C4214yC c4214yC2 = (C4214yC) this.f27034f;
                if (c4214yC2 != null && j9 == c4214yC2.f35331u) {
                    c4214yC2.f35330n.add(lr2);
                    return;
                }
                ArrayDeque arrayDeque2 = (ArrayDeque) this.f27032d;
                C4214yC c4214yC3 = arrayDeque2.isEmpty() ? new C4214yC() : (C4214yC) arrayDeque2.pop();
                ArrayList arrayList = c4214yC3.f35330n;
                PA.T(arrayList.isEmpty());
                c4214yC3.f35331u = j9;
                arrayList.add(lr2);
                priorityQueue.add(c4214yC3);
                this.f27034f = c4214yC3;
                int i4 = this.f27029a;
                if (i4 != -1) {
                    l(i4);
                    return;
                }
                return;
            }
        } else {
            j9 = -9223372036854775807L;
        }
        ((NC) this.f27030b).e(j9, lr);
    }

    public void l(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.f27033e;
            if (priorityQueue.size() <= i) {
                return;
            }
            C4214yC c4214yC = (C4214yC) priorityQueue.poll();
            String str = AbstractC3548lu.f32613a;
            int i4 = 0;
            while (true) {
                arrayList = c4214yC.f35330n;
                if (i4 >= arrayList.size()) {
                    break;
                }
                ((NC) this.f27030b).e(c4214yC.f35331u, (Lr) arrayList.get(i4));
                ((ArrayDeque) this.f27031c).push((Lr) arrayList.get(i4));
                i4++;
            }
            arrayList.clear();
            C4214yC c4214yC2 = (C4214yC) this.f27034f;
            if (c4214yC2 != null && c4214yC2.f35331u == c4214yC.f35331u) {
                this.f27034f = null;
            }
            ((ArrayDeque) this.f27032d).push(c4214yC);
        }
    }

    public void m(Object obj) {
        Object obj2 = this.f27033e;
        this.f27033e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        C2929aO c2929aO = (C2929aO) this.f27032d;
        c2929aO.getClass();
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        C3093dO c3093dO = c2929aO.f29202n;
        c3093dO.P0();
        c3093dO.M1(1, 10, num);
        c3093dO.M1(2, 10, num);
        C3307hK c3307hK = new C3307hK(intValue);
        C3759pp c3759pp = c3093dO.f30013G;
        c3759pp.c(21, c3307hK);
        c3759pp.d();
    }

    public C2728Pl(NC nc) {
        this.f27030b = nc;
        this.f27031c = new ArrayDeque();
        this.f27032d = new ArrayDeque();
        this.f27033e = new PriorityQueue();
        this.f27029a = -1;
    }

    public C2728Pl(View view) {
        this.f27029a = -1;
        this.f27030b = view;
        this.f27031c = C4758s.a();
    }
}
