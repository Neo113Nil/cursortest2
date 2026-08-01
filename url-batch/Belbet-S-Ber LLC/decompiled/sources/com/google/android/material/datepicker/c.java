package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import l.j1;
import l.q2;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f1040a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1041b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1042c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1043e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1044f;

    public c(t3.a aVar, q3.a aVar2, x3.i iVar) {
        List i;
        i3.d.e(aVar2, "routeDatabase");
        this.f1041b = aVar;
        this.f1042c = aVar2;
        x2.q qVar = x2.q.f3887f;
        this.d = qVar;
        this.f1043e = qVar;
        this.f1044f = new ArrayList();
        t3.k kVar = aVar.h;
        i3.d.e(kVar, "url");
        URI g3 = kVar.g();
        if (g3.getHost() == null) {
            i = u3.b.i(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f3399g.select(g3);
            i = (select == null || select.isEmpty()) ? u3.b.i(Proxy.NO_PROXY) : u3.b.u(select);
        }
        this.d = i;
        this.f1040a = 0;
    }

    public static c e(Context context, int i) {
        b4.l.f("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, q1.a.f3156t);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList r4 = b4.l.r(context, obtainStyledAttributes, 4);
        ColorStateList r5 = b4.l.r(context, obtainStyledAttributes, 9);
        ColorStateList r6 = b4.l.r(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = obtainStyledAttributes.getResourceId(5, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(6, 0);
        o2.a aVar = new o2.a(0);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        o2.o a5 = o2.o.h(contextThemeWrapper.obtainStyledAttributes(q1.a.F), aVar).a();
        obtainStyledAttributes.recycle();
        return new c(r4, r5, r6, dimensionPixelSize, a5, rect);
    }

    public void a() {
        View view = (View) this.f1041b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((q2) this.d) != null) {
                if (((q2) this.f1044f) == null) {
                    this.f1044f = new q2();
                }
                q2 q2Var = (q2) this.f1044f;
                q2Var.f2547c = null;
                q2Var.f2546b = false;
                q2Var.d = null;
                q2Var.f2545a = false;
                WeakHashMap weakHashMap = p0.f2816a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    q2Var.f2546b = true;
                    q2Var.f2547c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    q2Var.f2545a = true;
                    q2Var.d = backgroundTintMode;
                }
                if (q2Var.f2546b || q2Var.f2545a) {
                    l.r.e(background, q2Var, view.getDrawableState());
                    return;
                }
            }
            q2 q2Var2 = (q2) this.f1043e;
            if (q2Var2 != null) {
                l.r.e(background, q2Var2, view.getDrawableState());
                return;
            }
            q2 q2Var3 = (q2) this.d;
            if (q2Var3 != null) {
                l.r.e(background, q2Var3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            g1.a aVar = (g1.a) arrayList.get(i4);
            int i5 = aVar.f1590a;
            if (i5 != 8) {
                if (i5 == 1) {
                    int i6 = aVar.f1591b;
                    int i7 = aVar.d + i6;
                    while (i6 < i7) {
                        if (h(i6, i4 + 1) == i) {
                            return true;
                        }
                        i6++;
                    }
                } else {
                    continue;
                }
            } else {
                if (h(aVar.d, i4 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((g1.p0) this.f1043e).a((g1.a) arrayList.get(i));
        }
        s(arrayList);
        this.f1040a = 0;
    }

    public void d() {
        g1.p0 p0Var = (g1.p0) this.f1043e;
        c();
        ArrayList arrayList = (ArrayList) this.f1042c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            g1.a aVar = (g1.a) arrayList.get(i);
            int i4 = aVar.f1590a;
            if (i4 == 1) {
                p0Var.a(aVar);
                p0Var.g(aVar.f1591b, aVar.d);
            } else if (i4 == 2) {
                p0Var.a(aVar);
                int i5 = aVar.f1591b;
                int i6 = aVar.d;
                RecyclerView recyclerView = p0Var.f1752a;
                recyclerView.S(i5, i6, true);
                recyclerView.f781o0 = true;
                recyclerView.f775l0.f1722c += i6;
            } else if (i4 == 4) {
                p0Var.a(aVar);
                p0Var.f(aVar.f1591b, aVar.d, aVar.f1592c);
            } else if (i4 == 8) {
                p0Var.a(aVar);
                p0Var.h(aVar.f1591b, aVar.d);
            }
        }
        s(arrayList);
        this.f1040a = 0;
    }

    public void f(g1.a aVar) {
        int i;
        m0.b bVar = (m0.b) this.f1041b;
        int i4 = aVar.f1590a;
        if (i4 == 1 || i4 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int x4 = x(aVar.f1591b, i4);
        int i5 = aVar.f1591b;
        int i6 = aVar.f1590a;
        if (i6 == 2) {
            i = 0;
        } else {
            if (i6 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i = 1;
        }
        int i7 = 1;
        for (int i8 = 1; i8 < aVar.d; i8++) {
            int x5 = x((i * i8) + aVar.f1591b, aVar.f1590a);
            int i9 = aVar.f1590a;
            if (i9 == 2 ? x5 != x4 : !(i9 == 4 && x5 == x4 + 1)) {
                g1.a n4 = n(aVar.f1592c, i9, x4, i7);
                g(n4, i5);
                n4.f1592c = null;
                bVar.c(n4);
                if (aVar.f1590a == 4) {
                    i5 += i7;
                }
                i7 = 1;
                x4 = x5;
            } else {
                i7++;
            }
        }
        Object obj = aVar.f1592c;
        aVar.f1592c = null;
        bVar.c(aVar);
        if (i7 > 0) {
            g1.a n5 = n(obj, aVar.f1590a, x4, i7);
            g(n5, i5);
            n5.f1592c = null;
            bVar.c(n5);
        }
    }

    public void g(g1.a aVar, int i) {
        g1.p0 p0Var = (g1.p0) this.f1043e;
        p0Var.a(aVar);
        int i4 = aVar.f1590a;
        if (i4 != 2) {
            if (i4 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            p0Var.f(i, aVar.d, aVar.f1592c);
        } else {
            int i5 = aVar.d;
            RecyclerView recyclerView = p0Var.f1752a;
            recyclerView.S(i, i5, true);
            recyclerView.f781o0 = true;
            recyclerView.f775l0.f1722c += i5;
        }
    }

    public int h(int i, int i4) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i4 < size) {
            g1.a aVar = (g1.a) arrayList.get(i4);
            int i5 = aVar.f1590a;
            if (i5 == 8) {
                int i6 = aVar.f1591b;
                if (i6 == i) {
                    i = aVar.d;
                } else {
                    if (i6 < i) {
                        i--;
                    }
                    if (aVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i7 = aVar.f1591b;
                if (i7 > i) {
                    continue;
                } else if (i5 == 2) {
                    int i8 = aVar.d;
                    if (i < i7 + i8) {
                        return -1;
                    }
                    i -= i8;
                } else if (i5 == 1) {
                    i += aVar.d;
                }
            }
            i4++;
        }
        return i;
    }

    public ColorStateList i() {
        q2 q2Var = (q2) this.f1043e;
        if (q2Var != null) {
            return (ColorStateList) q2Var.f2547c;
        }
        return null;
    }

    public PorterDuff.Mode j() {
        q2 q2Var = (q2) this.f1043e;
        if (q2Var != null) {
            return (PorterDuff.Mode) q2Var.d;
        }
        return null;
    }

    public boolean k() {
        return this.f1040a < ((List) this.d).size() || !((ArrayList) this.f1044f).isEmpty();
    }

    public boolean l() {
        return ((ArrayList) this.f1042c).size() > 0;
    }

    public void m(AttributeSet attributeSet, int i) {
        ColorStateList f5;
        View view = (View) this.f1041b;
        Context context = view.getContext();
        int[] iArr = f.a.f1411y;
        androidx.emoji2.text.t i4 = androidx.emoji2.text.t.i(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) i4.f473b;
        View view2 = (View) this.f1041b;
        p0.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) i4.f473b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f1040a = typedArray.getResourceId(0, -1);
                l.r rVar = (l.r) this.f1042c;
                Context context2 = view.getContext();
                int i5 = this.f1040a;
                synchronized (rVar) {
                    f5 = rVar.f2550a.f(context2, i5);
                }
                if (f5 != null) {
                    t(f5);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(i4.c(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(j1.b(typedArray.getInt(2, -1), null));
            }
            i4.k();
        } catch (Throwable th) {
            i4.k();
            throw th;
        }
    }

    public g1.a n(Object obj, int i, int i4, int i5) {
        g1.a aVar = (g1.a) ((m0.b) this.f1041b).a();
        if (aVar != null) {
            aVar.f1590a = i;
            aVar.f1591b = i4;
            aVar.d = i5;
            aVar.f1592c = obj;
            return aVar;
        }
        g1.a aVar2 = new g1.a();
        aVar2.f1590a = i;
        aVar2.f1591b = i4;
        aVar2.d = i5;
        aVar2.f1592c = obj;
        return aVar2;
    }

    public void o() {
        this.f1040a = -1;
        t(null);
        a();
    }

    public void p(int i) {
        ColorStateList colorStateList;
        this.f1040a = i;
        l.r rVar = (l.r) this.f1042c;
        if (rVar != null) {
            Context context = ((View) this.f1041b).getContext();
            synchronized (rVar) {
                colorStateList = rVar.f2550a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        t(colorStateList);
        a();
    }

    public void q(g1.a aVar) {
        g1.p0 p0Var = (g1.p0) this.f1043e;
        ((ArrayList) this.d).add(aVar);
        int i = aVar.f1590a;
        if (i == 1) {
            p0Var.g(aVar.f1591b, aVar.d);
            return;
        }
        if (i == 2) {
            int i4 = aVar.f1591b;
            int i5 = aVar.d;
            RecyclerView recyclerView = p0Var.f1752a;
            recyclerView.S(i4, i5, false);
            recyclerView.f781o0 = true;
            return;
        }
        if (i == 4) {
            p0Var.f(aVar.f1591b, aVar.d, aVar.f1592c);
        } else if (i == 8) {
            p0Var.h(aVar.f1591b, aVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        boolean z4;
        char c5;
        g1.a n4;
        int i;
        int i4;
        g1.a n5;
        boolean z5;
        boolean z6;
        int i5;
        int i6;
        int i7;
        Object obj;
        g1.a aVar;
        m0.b bVar = (m0.b) this.f1041b;
        g1.p0 p0Var = (g1.p0) this.f1043e;
        a0.a aVar2 = (a0.a) this.f1044f;
        ArrayList arrayList = (ArrayList) this.f1042c;
        aVar2.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z7 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((g1.a) arrayList.get(size)).f1590a == 8) {
                    if (z7) {
                        break;
                    }
                } else {
                    z7 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i8 = size + 1;
            c cVar = (c) aVar2.f79g;
            m0.b bVar2 = (m0.b) cVar.f1041b;
            g1.a aVar3 = (g1.a) arrayList.get(size);
            g1.a aVar4 = (g1.a) arrayList.get(i8);
            int i9 = aVar4.f1590a;
            if (i9 == 1) {
                int i10 = aVar3.d;
                int i11 = aVar4.f1591b;
                int i12 = i10 < i11 ? -1 : 0;
                int i13 = aVar3.f1591b;
                if (i13 < i11) {
                    i12++;
                }
                if (i11 <= i13) {
                    aVar3.f1591b = i13 + aVar4.d;
                }
                int i14 = aVar4.f1591b;
                if (i14 <= i10) {
                    aVar3.d = i10 + aVar4.d;
                }
                aVar4.f1591b = i14 + i12;
                arrayList.set(size, aVar4);
                arrayList.set(i8, aVar3);
            } else if (i9 == 2) {
                int i15 = aVar3.f1591b;
                int i16 = aVar3.d;
                if (i15 < i16) {
                    if (aVar4.f1591b == i15 && aVar4.d == i16 - i15) {
                        z6 = true;
                        z5 = false;
                        i5 = aVar4.f1591b;
                        if (i16 >= i5) {
                        }
                        i6 = aVar3.f1591b;
                        i7 = aVar4.f1591b;
                        if (i6 > i7) {
                        }
                        obj = null;
                        aVar = null;
                        if (z6) {
                        }
                    } else {
                        z5 = false;
                        z6 = false;
                        i5 = aVar4.f1591b;
                        if (i16 >= i5) {
                            aVar4.f1591b = i5 - 1;
                        } else {
                            int i17 = aVar4.d;
                            if (i16 < i5 + i17) {
                                aVar4.d = i17 - 1;
                                aVar3.f1590a = 2;
                                aVar3.d = 1;
                                if (aVar4.d == 0) {
                                    arrayList.remove(i8);
                                    aVar4.f1592c = null;
                                    bVar2.c(aVar4);
                                }
                            }
                        }
                        i6 = aVar3.f1591b;
                        i7 = aVar4.f1591b;
                        if (i6 > i7) {
                            aVar4.f1591b = i7 + 1;
                        } else {
                            int i18 = i7 + aVar4.d;
                            if (i6 < i18) {
                                obj = null;
                                g1.a n6 = cVar.n(null, 2, i6 + 1, i18 - i6);
                                aVar4.d = aVar3.f1591b - aVar4.f1591b;
                                aVar = n6;
                                if (z6) {
                                    arrayList.set(size, aVar4);
                                    arrayList.remove(i8);
                                    aVar3.f1592c = obj;
                                    bVar2.c(aVar3);
                                } else {
                                    if (z5) {
                                        if (aVar != null) {
                                            int i19 = aVar3.f1591b;
                                            if (i19 > aVar.f1591b) {
                                                aVar3.f1591b = i19 - aVar.d;
                                            }
                                            int i20 = aVar3.d;
                                            if (i20 > aVar.f1591b) {
                                                aVar3.d = i20 - aVar.d;
                                            }
                                        }
                                        int i21 = aVar3.f1591b;
                                        if (i21 > aVar4.f1591b) {
                                            aVar3.f1591b = i21 - aVar4.d;
                                        }
                                        int i22 = aVar3.d;
                                        if (i22 > aVar4.f1591b) {
                                            aVar3.d = i22 - aVar4.d;
                                        }
                                    } else {
                                        if (aVar != null) {
                                            int i23 = aVar3.f1591b;
                                            if (i23 >= aVar.f1591b) {
                                                aVar3.f1591b = i23 - aVar.d;
                                            }
                                            int i24 = aVar3.d;
                                            if (i24 >= aVar.f1591b) {
                                                aVar3.d = i24 - aVar.d;
                                            }
                                        }
                                        int i25 = aVar3.f1591b;
                                        if (i25 >= aVar4.f1591b) {
                                            aVar3.f1591b = i25 - aVar4.d;
                                        }
                                        int i26 = aVar3.d;
                                        if (i26 >= aVar4.f1591b) {
                                            aVar3.d = i26 - aVar4.d;
                                        }
                                    }
                                    arrayList.set(size, aVar4);
                                    if (aVar3.f1591b != aVar3.d) {
                                        arrayList.set(i8, aVar3);
                                    } else {
                                        arrayList.remove(i8);
                                    }
                                    if (aVar != null) {
                                        arrayList.add(size, aVar);
                                    }
                                }
                            }
                        }
                        obj = null;
                        aVar = null;
                        if (z6) {
                        }
                    }
                } else if (aVar4.f1591b == i16 + 1 && aVar4.d == i15 - i16) {
                    z5 = true;
                    z6 = true;
                    i5 = aVar4.f1591b;
                    if (i16 >= i5) {
                    }
                    i6 = aVar3.f1591b;
                    i7 = aVar4.f1591b;
                    if (i6 > i7) {
                    }
                    obj = null;
                    aVar = null;
                    if (z6) {
                    }
                } else {
                    z5 = true;
                    z6 = false;
                    i5 = aVar4.f1591b;
                    if (i16 >= i5) {
                    }
                    i6 = aVar3.f1591b;
                    i7 = aVar4.f1591b;
                    if (i6 > i7) {
                    }
                    obj = null;
                    aVar = null;
                    if (z6) {
                    }
                }
            } else if (i9 == 4) {
                int i27 = aVar3.d;
                int i28 = aVar4.f1591b;
                if (i27 < i28) {
                    aVar4.f1591b = i28 - 1;
                } else {
                    int i29 = aVar4.d;
                    if (i27 < i28 + i29) {
                        aVar4.d = i29 - 1;
                        n4 = cVar.n(aVar4.f1592c, 4, aVar3.f1591b, 1);
                        i = aVar3.f1591b;
                        i4 = aVar4.f1591b;
                        if (i > i4) {
                            aVar4.f1591b = i4 + 1;
                        } else {
                            int i30 = i4 + aVar4.d;
                            if (i < i30) {
                                int i31 = i30 - i;
                                n5 = cVar.n(aVar4.f1592c, 4, i + 1, i31);
                                aVar4.d -= i31;
                                arrayList.set(i8, aVar3);
                                if (aVar4.d > 0) {
                                    arrayList.set(size, aVar4);
                                } else {
                                    arrayList.remove(size);
                                    aVar4.f1592c = null;
                                    bVar2.c(aVar4);
                                }
                                if (n4 != null) {
                                    arrayList.add(size, n4);
                                }
                                if (n5 != null) {
                                    arrayList.add(size, n5);
                                }
                            }
                        }
                        n5 = null;
                        arrayList.set(i8, aVar3);
                        if (aVar4.d > 0) {
                        }
                        if (n4 != null) {
                        }
                        if (n5 != null) {
                        }
                    }
                }
                n4 = null;
                i = aVar3.f1591b;
                i4 = aVar4.f1591b;
                if (i > i4) {
                }
                n5 = null;
                arrayList.set(i8, aVar3);
                if (aVar4.d > 0) {
                }
                if (n4 != null) {
                }
                if (n5 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        for (int i32 = 0; i32 < size2; i32++) {
            g1.a aVar5 = (g1.a) arrayList.get(i32);
            int i33 = aVar5.f1590a;
            if (i33 == 1) {
                q(aVar5);
            } else if (i33 == 2) {
                int i34 = aVar5.f1591b;
                int i35 = aVar5.d + i34;
                int i36 = i34;
                int i37 = 0;
                char c6 = 65535;
                while (i36 < i35) {
                    if (p0Var.e(i36) != null || b(i36)) {
                        if (c6 == 0) {
                            f(n(null, 2, i34, i37));
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c5 = 1;
                    } else {
                        if (c6 == 1) {
                            q(n(null, 2, i34, i37));
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c5 = 0;
                    }
                    if (z4) {
                        i36 -= i37;
                        i35 -= i37;
                        i37 = 1;
                    } else {
                        i37++;
                    }
                    i36++;
                    c6 = c5;
                }
                if (i37 != aVar5.d) {
                    aVar5.f1592c = null;
                    bVar.c(aVar5);
                    aVar5 = n(null, 2, i34, i37);
                }
                if (c6 == 0) {
                    f(aVar5);
                } else {
                    q(aVar5);
                }
            } else if (i33 == 4) {
                int i38 = aVar5.f1591b;
                int i39 = aVar5.d + i38;
                int i40 = i38;
                int i41 = 0;
                char c7 = 65535;
                while (i38 < i39) {
                    if (p0Var.e(i38) != null || b(i38)) {
                        if (c7 == 0) {
                            f(n(aVar5.f1592c, 4, i40, i41));
                            i40 = i38;
                            i41 = 0;
                        }
                        c7 = 1;
                    } else {
                        if (c7 == 1) {
                            q(n(aVar5.f1592c, 4, i40, i41));
                            i40 = i38;
                            i41 = 0;
                        }
                        c7 = 0;
                    }
                    i41++;
                    i38++;
                }
                if (i41 != aVar5.d) {
                    Object obj2 = aVar5.f1592c;
                    aVar5.f1592c = null;
                    bVar.c(aVar5);
                    aVar5 = n(obj2, 4, i40, i41);
                }
                if (c7 == 0) {
                    f(aVar5);
                } else {
                    q(aVar5);
                }
            } else if (i33 == 8) {
                q(aVar5);
            }
        }
        arrayList.clear();
    }

    public void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            g1.a aVar = (g1.a) arrayList.get(i);
            aVar.f1592c = null;
            ((m0.b) this.f1041b).c(aVar);
        }
        arrayList.clear();
    }

    public void t(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((q2) this.d) == null) {
                this.d = new q2();
            }
            q2 q2Var = (q2) this.d;
            q2Var.f2547c = colorStateList;
            q2Var.f2546b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void u(ColorStateList colorStateList) {
        if (((q2) this.f1043e) == null) {
            this.f1043e = new q2();
        }
        q2 q2Var = (q2) this.f1043e;
        q2Var.f2547c = colorStateList;
        q2Var.f2546b = true;
        a();
    }

    public void v(PorterDuff.Mode mode) {
        if (((q2) this.f1043e) == null) {
            this.f1043e = new q2();
        }
        q2 q2Var = (q2) this.f1043e;
        q2Var.d = mode;
        q2Var.f2545a = true;
        a();
    }

    public void w(TextView textView) {
        ColorStateList colorStateList = (ColorStateList) this.f1042c;
        o2.j jVar = new o2.j();
        o2.j jVar2 = new o2.j();
        o2.o oVar = (o2.o) this.f1044f;
        jVar.setShapeAppearanceModel(oVar);
        jVar2.setShapeAppearanceModel(oVar);
        jVar.r((ColorStateList) this.d);
        float f5 = this.f1040a;
        ColorStateList colorStateList2 = (ColorStateList) this.f1043e;
        jVar.f2955g.f2946j = f5;
        jVar.invalidateSelf();
        o2.h hVar = jVar.f2955g;
        if (hVar.d != colorStateList2) {
            hVar.d = colorStateList2;
            jVar.onStateChange(jVar.getState());
        }
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), jVar, jVar2);
        Rect rect = (Rect) this.f1041b;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    public int x(int i, int i4) {
        int i5;
        int i6;
        m0.b bVar = (m0.b) this.f1041b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g1.a aVar = (g1.a) arrayList.get(size);
            int i7 = aVar.f1590a;
            if (i7 == 8) {
                int i8 = aVar.f1591b;
                int i9 = aVar.d;
                if (i8 < i9) {
                    i6 = i8;
                    i5 = i9;
                } else {
                    i5 = i8;
                    i6 = i9;
                }
                if (i < i6 || i > i5) {
                    if (i < i8) {
                        if (i4 == 1) {
                            aVar.f1591b = i8 + 1;
                            aVar.d = i9 + 1;
                        } else if (i4 == 2) {
                            aVar.f1591b = i8 - 1;
                            aVar.d = i9 - 1;
                        }
                    }
                } else if (i6 == i8) {
                    if (i4 == 1) {
                        aVar.d = i9 + 1;
                    } else if (i4 == 2) {
                        aVar.d = i9 - 1;
                    }
                    i++;
                } else {
                    if (i4 == 1) {
                        aVar.f1591b = i8 + 1;
                    } else if (i4 == 2) {
                        aVar.f1591b = i8 - 1;
                    }
                    i--;
                }
            } else {
                int i10 = aVar.f1591b;
                if (i10 <= i) {
                    if (i7 == 1) {
                        i -= aVar.d;
                    } else if (i7 == 2) {
                        i += aVar.d;
                    }
                } else if (i4 == 1) {
                    aVar.f1591b = i10 + 1;
                } else if (i4 == 2) {
                    aVar.f1591b = i10 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            g1.a aVar2 = (g1.a) arrayList.get(size2);
            if (aVar2.f1590a == 8) {
                int i11 = aVar2.d;
                if (i11 == aVar2.f1591b || i11 < 0) {
                    arrayList.remove(size2);
                    aVar2.f1592c = null;
                    bVar.c(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.f1592c = null;
                bVar.c(aVar2);
            }
        }
        return i;
    }

    public c(View view) {
        this.f1040a = -1;
        this.f1041b = view;
        this.f1042c = l.r.a();
    }

    public c(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, o2.o oVar, Rect rect) {
        b4.l.g(rect.left);
        b4.l.g(rect.top);
        b4.l.g(rect.right);
        b4.l.g(rect.bottom);
        this.f1041b = rect;
        this.f1042c = colorStateList2;
        this.d = colorStateList;
        this.f1043e = colorStateList3;
        this.f1040a = i;
        this.f1044f = oVar;
    }

    public c(g1.p0 p0Var) {
        this.f1041b = new m0.b(30);
        this.f1042c = new ArrayList();
        this.d = new ArrayList();
        this.f1040a = 0;
        this.f1043e = p0Var;
        this.f1044f = new a0.a(14, this);
    }
}
