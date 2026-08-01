package b1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f732a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f733b;
    public final Object c;

    /* renamed from: d, reason: collision with root package name */
    public Object f734d;

    /* renamed from: e, reason: collision with root package name */
    public Object f735e;

    /* renamed from: f, reason: collision with root package name */
    public Object f736f;

    public b(c3.a aVar, a2.e eVar, g3.i iVar) {
        List i4;
        u2.c.e(eVar, "routeDatabase");
        this.c = aVar;
        this.f734d = eVar;
        n2.o oVar = n2.o.f2953f;
        this.f735e = oVar;
        this.f736f = oVar;
        this.f733b = new ArrayList();
        c3.m mVar = aVar.h;
        u2.c.e(mVar, "url");
        URI g = mVar.g();
        if (g.getHost() == null) {
            i4 = d3.c.i(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.g.select(g);
            i4 = (select == null || select.isEmpty()) ? d3.c.i(Proxy.NO_PROXY) : d3.c.u(select);
        }
        this.f735e = i4;
        this.f732a = 0;
    }

    public void a() {
        View view = (View) this.c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((c3.g) this.f734d) != null) {
                if (((c3.g) this.f736f) == null) {
                    this.f736f = new c3.g();
                }
                c3.g gVar = (c3.g) this.f736f;
                gVar.c = null;
                gVar.f1048b = false;
                gVar.f1049d = null;
                gVar.f1047a = false;
                WeakHashMap weakHashMap = k0.j0.f2752a;
                ColorStateList c = k0.b0.c(view);
                if (c != null) {
                    gVar.f1048b = true;
                    gVar.c = c;
                }
                PorterDuff.Mode d4 = k0.b0.d(view);
                if (d4 != null) {
                    gVar.f1047a = true;
                    gVar.f1049d = d4;
                }
                if (gVar.f1048b || gVar.f1047a) {
                    k.s.e(background, gVar, view.getDrawableState());
                    return;
                }
            }
            c3.g gVar2 = (c3.g) this.f735e;
            if (gVar2 != null) {
                k.s.e(background, gVar2, view.getDrawableState());
                return;
            }
            c3.g gVar3 = (c3.g) this.f734d;
            if (gVar3 != null) {
                k.s.e(background, gVar3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i4) {
        ArrayList arrayList = (ArrayList) this.f734d;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            a aVar = (a) arrayList.get(i5);
            int i6 = aVar.f726a;
            if (i6 != 8) {
                if (i6 == 1) {
                    int i7 = aVar.f727b;
                    int i8 = aVar.f728d + i7;
                    while (i7 < i8) {
                        if (g(i7, i5 + 1) == i4) {
                            return true;
                        }
                        i7++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(aVar.f728d, i5 + 1) == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f734d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((d0) this.f735e).a((a) arrayList.get(i4));
        }
        r(arrayList);
        this.f732a = 0;
    }

    public void d() {
        d0 d0Var = (d0) this.f735e;
        c();
        ArrayList arrayList = (ArrayList) this.f733b;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = (a) arrayList.get(i4);
            int i5 = aVar.f726a;
            if (i5 == 1) {
                d0Var.a(aVar);
                d0Var.d(aVar.f727b, aVar.f728d);
            } else if (i5 == 2) {
                d0Var.a(aVar);
                int i6 = aVar.f727b;
                int i7 = aVar.f728d;
                RecyclerView recyclerView = d0Var.f764a;
                recyclerView.O(i6, i7, true);
                recyclerView.f646n0 = true;
                recyclerView.f640k0.c += i7;
            } else if (i5 == 4) {
                d0Var.a(aVar);
                d0Var.c(aVar.f727b, aVar.f728d, aVar.c);
            } else if (i5 == 8) {
                d0Var.a(aVar);
                d0Var.e(aVar.f727b, aVar.f728d);
            }
        }
        r(arrayList);
        this.f732a = 0;
    }

    public void e(a aVar) {
        int i4;
        j0.b bVar = (j0.b) this.c;
        int i5 = aVar.f726a;
        if (i5 == 1 || i5 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v3 = v(aVar.f727b, i5);
        int i6 = aVar.f727b;
        int i7 = aVar.f726a;
        if (i7 == 2) {
            i4 = 0;
        } else {
            if (i7 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i4 = 1;
        }
        int i8 = 1;
        for (int i9 = 1; i9 < aVar.f728d; i9++) {
            int v4 = v((i4 * i9) + aVar.f727b, aVar.f726a);
            int i10 = aVar.f726a;
            if (i10 == 2 ? v4 != v3 : !(i10 == 4 && v4 == v3 + 1)) {
                a m4 = m(aVar.c, i10, v3, i8);
                f(m4, i6);
                m4.c = null;
                bVar.c(m4);
                if (aVar.f726a == 4) {
                    i6 += i8;
                }
                i8 = 1;
                v3 = v4;
            } else {
                i8++;
            }
        }
        Object obj = aVar.c;
        aVar.c = null;
        bVar.c(aVar);
        if (i8 > 0) {
            a m5 = m(obj, aVar.f726a, v3, i8);
            f(m5, i6);
            m5.c = null;
            bVar.c(m5);
        }
    }

    public void f(a aVar, int i4) {
        d0 d0Var = (d0) this.f735e;
        d0Var.a(aVar);
        int i5 = aVar.f726a;
        if (i5 != 2) {
            if (i5 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            d0Var.c(i4, aVar.f728d, aVar.c);
        } else {
            int i6 = aVar.f728d;
            RecyclerView recyclerView = d0Var.f764a;
            recyclerView.O(i4, i6, true);
            recyclerView.f646n0 = true;
            recyclerView.f640k0.c += i6;
        }
    }

    public int g(int i4, int i5) {
        ArrayList arrayList = (ArrayList) this.f734d;
        int size = arrayList.size();
        while (i5 < size) {
            a aVar = (a) arrayList.get(i5);
            int i6 = aVar.f726a;
            if (i6 == 8) {
                int i7 = aVar.f727b;
                if (i7 == i4) {
                    i4 = aVar.f728d;
                } else {
                    if (i7 < i4) {
                        i4--;
                    }
                    if (aVar.f728d <= i4) {
                        i4++;
                    }
                }
            } else {
                int i8 = aVar.f727b;
                if (i8 > i4) {
                    continue;
                } else if (i6 == 2) {
                    int i9 = aVar.f728d;
                    if (i4 < i8 + i9) {
                        return -1;
                    }
                    i4 -= i9;
                } else if (i6 == 1) {
                    i4 += aVar.f728d;
                }
            }
            i5++;
        }
        return i4;
    }

    public ColorStateList h() {
        c3.g gVar = (c3.g) this.f735e;
        if (gVar != null) {
            return (ColorStateList) gVar.c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        c3.g gVar = (c3.g) this.f735e;
        if (gVar != null) {
            return (PorterDuff.Mode) gVar.f1049d;
        }
        return null;
    }

    public boolean j() {
        return this.f732a < ((List) this.f735e).size() || !((ArrayList) this.f733b).isEmpty();
    }

    public boolean k() {
        return ((ArrayList) this.f733b).size() > 0;
    }

    public void l(AttributeSet attributeSet, int i4) {
        ColorStateList f4;
        View view = (View) this.c;
        Context context = view.getContext();
        int[] iArr = e.a.f1516y;
        androidx.emoji2.text.s r3 = androidx.emoji2.text.s.r(i4, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) r3.c;
        View view2 = (View) this.c;
        k0.j0.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r3.c, i4);
        try {
            if (typedArray.hasValue(0)) {
                this.f732a = typedArray.getResourceId(0, -1);
                k.s sVar = (k.s) this.f733b;
                Context context2 = view.getContext();
                int i5 = this.f732a;
                synchronized (sVar) {
                    f4 = sVar.f2641a.f(context2, i5);
                }
                if (f4 != null) {
                    s(f4);
                }
            }
            if (typedArray.hasValue(1)) {
                k0.b0.g(view, r3.h(1));
            }
            if (typedArray.hasValue(2)) {
                k0.b0.h(view, k.j1.b(typedArray.getInt(2, -1), null));
            }
            r3.t();
        } catch (Throwable th) {
            r3.t();
            throw th;
        }
    }

    public a m(Object obj, int i4, int i5, int i6) {
        a aVar = (a) ((j0.b) this.c).a();
        if (aVar != null) {
            aVar.f726a = i4;
            aVar.f727b = i5;
            aVar.f728d = i6;
            aVar.c = obj;
            return aVar;
        }
        a aVar2 = new a();
        aVar2.f726a = i4;
        aVar2.f727b = i5;
        aVar2.f728d = i6;
        aVar2.c = obj;
        return aVar2;
    }

    public void n() {
        this.f732a = -1;
        s(null);
        a();
    }

    public void o(int i4) {
        ColorStateList colorStateList;
        this.f732a = i4;
        k.s sVar = (k.s) this.f733b;
        if (sVar != null) {
            Context context = ((View) this.c).getContext();
            synchronized (sVar) {
                colorStateList = sVar.f2641a.f(context, i4);
            }
        } else {
            colorStateList = null;
        }
        s(colorStateList);
        a();
    }

    public void p(a aVar) {
        d0 d0Var = (d0) this.f735e;
        ((ArrayList) this.f734d).add(aVar);
        int i4 = aVar.f726a;
        if (i4 == 1) {
            d0Var.d(aVar.f727b, aVar.f728d);
            return;
        }
        if (i4 == 2) {
            int i5 = aVar.f727b;
            int i6 = aVar.f728d;
            RecyclerView recyclerView = d0Var.f764a;
            recyclerView.O(i5, i6, false);
            recyclerView.f646n0 = true;
            return;
        }
        if (i4 == 4) {
            d0Var.c(aVar.f727b, aVar.f728d, aVar.c);
        } else if (i4 == 8) {
            d0Var.e(aVar.f727b, aVar.f728d);
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
    public void q() {
        boolean z3;
        char c;
        a m4;
        int i4;
        int i5;
        a m5;
        boolean z4;
        boolean z5;
        int i6;
        int i7;
        int i8;
        Object obj;
        a aVar;
        j0.b bVar = (j0.b) this.c;
        d0 d0Var = (d0) this.f735e;
        a2.e eVar = (a2.e) this.f736f;
        ArrayList arrayList = (ArrayList) this.f733b;
        eVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z6 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((a) arrayList.get(size)).f726a == 8) {
                    if (z6) {
                        break;
                    }
                } else {
                    z6 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i9 = size + 1;
            b bVar2 = (b) eVar.g;
            j0.b bVar3 = (j0.b) bVar2.c;
            a aVar2 = (a) arrayList.get(size);
            a aVar3 = (a) arrayList.get(i9);
            int i10 = aVar3.f726a;
            if (i10 == 1) {
                int i11 = aVar2.f728d;
                int i12 = aVar3.f727b;
                int i13 = i11 < i12 ? -1 : 0;
                int i14 = aVar2.f727b;
                if (i14 < i12) {
                    i13++;
                }
                if (i12 <= i14) {
                    aVar2.f727b = i14 + aVar3.f728d;
                }
                int i15 = aVar3.f727b;
                if (i15 <= i11) {
                    aVar2.f728d = i11 + aVar3.f728d;
                }
                aVar3.f727b = i15 + i13;
                arrayList.set(size, aVar3);
                arrayList.set(i9, aVar2);
            } else if (i10 == 2) {
                int i16 = aVar2.f727b;
                int i17 = aVar2.f728d;
                if (i16 < i17) {
                    if (aVar3.f727b == i16 && aVar3.f728d == i17 - i16) {
                        z5 = true;
                        z4 = false;
                        i6 = aVar3.f727b;
                        if (i17 >= i6) {
                        }
                        i7 = aVar2.f727b;
                        i8 = aVar3.f727b;
                        if (i7 > i8) {
                        }
                        obj = null;
                        aVar = null;
                        if (z5) {
                        }
                    } else {
                        z4 = false;
                        z5 = false;
                        i6 = aVar3.f727b;
                        if (i17 >= i6) {
                            aVar3.f727b = i6 - 1;
                        } else {
                            int i18 = aVar3.f728d;
                            if (i17 < i6 + i18) {
                                aVar3.f728d = i18 - 1;
                                aVar2.f726a = 2;
                                aVar2.f728d = 1;
                                if (aVar3.f728d == 0) {
                                    arrayList.remove(i9);
                                    aVar3.c = null;
                                    bVar3.c(aVar3);
                                }
                            }
                        }
                        i7 = aVar2.f727b;
                        i8 = aVar3.f727b;
                        if (i7 > i8) {
                            aVar3.f727b = i8 + 1;
                        } else {
                            int i19 = i8 + aVar3.f728d;
                            if (i7 < i19) {
                                obj = null;
                                a m6 = bVar2.m(null, 2, i7 + 1, i19 - i7);
                                aVar3.f728d = aVar2.f727b - aVar3.f727b;
                                aVar = m6;
                                if (z5) {
                                    arrayList.set(size, aVar3);
                                    arrayList.remove(i9);
                                    aVar2.c = obj;
                                    bVar3.c(aVar2);
                                } else {
                                    if (z4) {
                                        if (aVar != null) {
                                            int i20 = aVar2.f727b;
                                            if (i20 > aVar.f727b) {
                                                aVar2.f727b = i20 - aVar.f728d;
                                            }
                                            int i21 = aVar2.f728d;
                                            if (i21 > aVar.f727b) {
                                                aVar2.f728d = i21 - aVar.f728d;
                                            }
                                        }
                                        int i22 = aVar2.f727b;
                                        if (i22 > aVar3.f727b) {
                                            aVar2.f727b = i22 - aVar3.f728d;
                                        }
                                        int i23 = aVar2.f728d;
                                        if (i23 > aVar3.f727b) {
                                            aVar2.f728d = i23 - aVar3.f728d;
                                        }
                                    } else {
                                        if (aVar != null) {
                                            int i24 = aVar2.f727b;
                                            if (i24 >= aVar.f727b) {
                                                aVar2.f727b = i24 - aVar.f728d;
                                            }
                                            int i25 = aVar2.f728d;
                                            if (i25 >= aVar.f727b) {
                                                aVar2.f728d = i25 - aVar.f728d;
                                            }
                                        }
                                        int i26 = aVar2.f727b;
                                        if (i26 >= aVar3.f727b) {
                                            aVar2.f727b = i26 - aVar3.f728d;
                                        }
                                        int i27 = aVar2.f728d;
                                        if (i27 >= aVar3.f727b) {
                                            aVar2.f728d = i27 - aVar3.f728d;
                                        }
                                    }
                                    arrayList.set(size, aVar3);
                                    if (aVar2.f727b != aVar2.f728d) {
                                        arrayList.set(i9, aVar2);
                                    } else {
                                        arrayList.remove(i9);
                                    }
                                    if (aVar != null) {
                                        arrayList.add(size, aVar);
                                    }
                                }
                            }
                        }
                        obj = null;
                        aVar = null;
                        if (z5) {
                        }
                    }
                } else if (aVar3.f727b == i17 + 1 && aVar3.f728d == i16 - i17) {
                    z4 = true;
                    z5 = true;
                    i6 = aVar3.f727b;
                    if (i17 >= i6) {
                    }
                    i7 = aVar2.f727b;
                    i8 = aVar3.f727b;
                    if (i7 > i8) {
                    }
                    obj = null;
                    aVar = null;
                    if (z5) {
                    }
                } else {
                    z4 = true;
                    z5 = false;
                    i6 = aVar3.f727b;
                    if (i17 >= i6) {
                    }
                    i7 = aVar2.f727b;
                    i8 = aVar3.f727b;
                    if (i7 > i8) {
                    }
                    obj = null;
                    aVar = null;
                    if (z5) {
                    }
                }
            } else if (i10 == 4) {
                int i28 = aVar2.f728d;
                int i29 = aVar3.f727b;
                if (i28 < i29) {
                    aVar3.f727b = i29 - 1;
                } else {
                    int i30 = aVar3.f728d;
                    if (i28 < i29 + i30) {
                        aVar3.f728d = i30 - 1;
                        m4 = bVar2.m(aVar3.c, 4, aVar2.f727b, 1);
                        i4 = aVar2.f727b;
                        i5 = aVar3.f727b;
                        if (i4 > i5) {
                            aVar3.f727b = i5 + 1;
                        } else {
                            int i31 = i5 + aVar3.f728d;
                            if (i4 < i31) {
                                int i32 = i31 - i4;
                                m5 = bVar2.m(aVar3.c, 4, i4 + 1, i32);
                                aVar3.f728d -= i32;
                                arrayList.set(i9, aVar2);
                                if (aVar3.f728d > 0) {
                                    arrayList.set(size, aVar3);
                                } else {
                                    arrayList.remove(size);
                                    aVar3.c = null;
                                    bVar3.c(aVar3);
                                }
                                if (m4 != null) {
                                    arrayList.add(size, m4);
                                }
                                if (m5 != null) {
                                    arrayList.add(size, m5);
                                }
                            }
                        }
                        m5 = null;
                        arrayList.set(i9, aVar2);
                        if (aVar3.f728d > 0) {
                        }
                        if (m4 != null) {
                        }
                        if (m5 != null) {
                        }
                    }
                }
                m4 = null;
                i4 = aVar2.f727b;
                i5 = aVar3.f727b;
                if (i4 > i5) {
                }
                m5 = null;
                arrayList.set(i9, aVar2);
                if (aVar3.f728d > 0) {
                }
                if (m4 != null) {
                }
                if (m5 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        for (int i33 = 0; i33 < size2; i33++) {
            a aVar4 = (a) arrayList.get(i33);
            int i34 = aVar4.f726a;
            if (i34 == 1) {
                p(aVar4);
            } else if (i34 == 2) {
                int i35 = aVar4.f727b;
                int i36 = aVar4.f728d + i35;
                int i37 = i35;
                int i38 = 0;
                char c4 = 65535;
                while (i37 < i36) {
                    if (d0Var.b(i37) != null || b(i37)) {
                        if (c4 == 0) {
                            e(m(null, 2, i35, i38));
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c = 1;
                    } else {
                        if (c4 == 1) {
                            p(m(null, 2, i35, i38));
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c = 0;
                    }
                    if (z3) {
                        i37 -= i38;
                        i36 -= i38;
                        i38 = 1;
                    } else {
                        i38++;
                    }
                    i37++;
                    c4 = c;
                }
                if (i38 != aVar4.f728d) {
                    aVar4.c = null;
                    bVar.c(aVar4);
                    aVar4 = m(null, 2, i35, i38);
                }
                if (c4 == 0) {
                    e(aVar4);
                } else {
                    p(aVar4);
                }
            } else if (i34 == 4) {
                int i39 = aVar4.f727b;
                int i40 = aVar4.f728d + i39;
                int i41 = i39;
                int i42 = 0;
                char c5 = 65535;
                while (i39 < i40) {
                    if (d0Var.b(i39) != null || b(i39)) {
                        if (c5 == 0) {
                            e(m(aVar4.c, 4, i41, i42));
                            i41 = i39;
                            i42 = 0;
                        }
                        c5 = 1;
                    } else {
                        if (c5 == 1) {
                            p(m(aVar4.c, 4, i41, i42));
                            i41 = i39;
                            i42 = 0;
                        }
                        c5 = 0;
                    }
                    i42++;
                    i39++;
                }
                if (i42 != aVar4.f728d) {
                    Object obj2 = aVar4.c;
                    aVar4.c = null;
                    bVar.c(aVar4);
                    aVar4 = m(obj2, 4, i41, i42);
                }
                if (c5 == 0) {
                    e(aVar4);
                } else {
                    p(aVar4);
                }
            } else if (i34 == 8) {
                p(aVar4);
            }
        }
        arrayList.clear();
    }

    public void r(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = (a) arrayList.get(i4);
            aVar.c = null;
            ((j0.b) this.c).c(aVar);
        }
        arrayList.clear();
    }

    public void s(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((c3.g) this.f734d) == null) {
                this.f734d = new c3.g();
            }
            c3.g gVar = (c3.g) this.f734d;
            gVar.c = colorStateList;
            gVar.f1048b = true;
        } else {
            this.f734d = null;
        }
        a();
    }

    public void t(ColorStateList colorStateList) {
        if (((c3.g) this.f735e) == null) {
            this.f735e = new c3.g();
        }
        c3.g gVar = (c3.g) this.f735e;
        gVar.c = colorStateList;
        gVar.f1048b = true;
        a();
    }

    public void u(PorterDuff.Mode mode) {
        if (((c3.g) this.f735e) == null) {
            this.f735e = new c3.g();
        }
        c3.g gVar = (c3.g) this.f735e;
        gVar.f1049d = mode;
        gVar.f1047a = true;
        a();
    }

    public int v(int i4, int i5) {
        int i6;
        int i7;
        j0.b bVar = (j0.b) this.c;
        ArrayList arrayList = (ArrayList) this.f734d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i8 = aVar.f726a;
            if (i8 == 8) {
                int i9 = aVar.f727b;
                int i10 = aVar.f728d;
                if (i9 < i10) {
                    i7 = i9;
                    i6 = i10;
                } else {
                    i6 = i9;
                    i7 = i10;
                }
                if (i4 < i7 || i4 > i6) {
                    if (i4 < i9) {
                        if (i5 == 1) {
                            aVar.f727b = i9 + 1;
                            aVar.f728d = i10 + 1;
                        } else if (i5 == 2) {
                            aVar.f727b = i9 - 1;
                            aVar.f728d = i10 - 1;
                        }
                    }
                } else if (i7 == i9) {
                    if (i5 == 1) {
                        aVar.f728d = i10 + 1;
                    } else if (i5 == 2) {
                        aVar.f728d = i10 - 1;
                    }
                    i4++;
                } else {
                    if (i5 == 1) {
                        aVar.f727b = i9 + 1;
                    } else if (i5 == 2) {
                        aVar.f727b = i9 - 1;
                    }
                    i4--;
                }
            } else {
                int i11 = aVar.f727b;
                if (i11 <= i4) {
                    if (i8 == 1) {
                        i4 -= aVar.f728d;
                    } else if (i8 == 2) {
                        i4 += aVar.f728d;
                    }
                } else if (i5 == 1) {
                    aVar.f727b = i11 + 1;
                } else if (i5 == 2) {
                    aVar.f727b = i11 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.f726a == 8) {
                int i12 = aVar2.f728d;
                if (i12 == aVar2.f727b || i12 < 0) {
                    arrayList.remove(size2);
                    aVar2.c = null;
                    bVar.c(aVar2);
                }
            } else if (aVar2.f728d <= 0) {
                arrayList.remove(size2);
                aVar2.c = null;
                bVar.c(aVar2);
            }
        }
        return i4;
    }

    public b(View view) {
        this.f732a = -1;
        this.c = view;
        this.f733b = k.s.a();
    }

    public b(d0 d0Var) {
        this.c = new j0.b(30);
        this.f733b = new ArrayList();
        this.f734d = new ArrayList();
        this.f732a = 0;
        this.f735e = d0Var;
        this.f736f = new a2.e(7, this);
    }
}
