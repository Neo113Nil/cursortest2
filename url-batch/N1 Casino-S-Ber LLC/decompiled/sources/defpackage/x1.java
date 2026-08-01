package defpackage;

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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class x1 {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public x1(y1 y1Var, mr mrVar, gy gyVar) {
        List i;
        mrVar.getClass();
        this.b = y1Var;
        this.d = mrVar;
        di diVar = di.f;
        this.e = diVar;
        this.f = diVar;
        this.c = new ArrayList();
        jo joVar = y1Var.h;
        joVar.getClass();
        URI g = joVar.g();
        if (g.getHost() == null) {
            i = r70.i(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = y1Var.g.select(g);
            i = (select == null || select.isEmpty()) ? r70.i(Proxy.NO_PROXY) : r70.u(select);
        }
        this.e = i;
        this.a = 0;
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((cc) this.d) != null) {
                if (((cc) this.f) == null) {
                    this.f = new cc();
                }
                cc ccVar = (cc) this.f;
                ccVar.c = null;
                ccVar.b = false;
                ccVar.d = null;
                ccVar.a = false;
                WeakHashMap weakHashMap = x80.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    ccVar.b = true;
                    ccVar.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    ccVar.a = true;
                    ccVar.d = backgroundTintMode;
                }
                if (ccVar.b || ccVar.a) {
                    h4.e(background, ccVar, view.getDrawableState());
                    return;
                }
            }
            cc ccVar2 = (cc) this.e;
            if (ccVar2 != null) {
                h4.e(background, ccVar2, view.getDrawableState());
                return;
            }
            cc ccVar3 = (cc) this.d;
            if (ccVar3 != null) {
                h4.e(background, ccVar3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            w1 w1Var = (w1) arrayList.get(i2);
            int i3 = w1Var.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = w1Var.b;
                    int i5 = w1Var.d + i4;
                    while (i4 < i5) {
                        if (g(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(w1Var.d, i2 + 1) == i) {
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
            ((oy) this.e).a((w1) arrayList.get(i));
        }
        r(arrayList);
        this.a = 0;
    }

    public void d() {
        oy oyVar = (oy) this.e;
        c();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            w1 w1Var = (w1) arrayList.get(i);
            int i2 = w1Var.a;
            if (i2 == 1) {
                oyVar.a(w1Var);
                oyVar.d(w1Var.b, w1Var.d);
            } else if (i2 == 2) {
                oyVar.a(w1Var);
                int i3 = w1Var.b;
                int i4 = w1Var.d;
                RecyclerView recyclerView = oyVar.a;
                recyclerView.P(i3, i4, true);
                recyclerView.o0 = true;
                recyclerView.l0.c += i4;
            } else if (i2 == 4) {
                oyVar.a(w1Var);
                oyVar.c(w1Var.b, w1Var.d, w1Var.c);
            } else if (i2 == 8) {
                oyVar.a(w1Var);
                oyVar.e(w1Var.b, w1Var.d);
            }
        }
        r(arrayList);
        this.a = 0;
    }

    public void e(w1 w1Var) {
        int i;
        zw zwVar = (zw) this.b;
        int i2 = w1Var.a;
        if (i2 == 1 || i2 == 8) {
            t8.k("should not dispatch add or move for pre layout");
            return;
        }
        int v = v(w1Var.b, i2);
        int i3 = w1Var.b;
        int i4 = w1Var.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                t8.v(w1Var, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < w1Var.d; i6++) {
            int v2 = v((i * i6) + w1Var.b, w1Var.a);
            int i7 = w1Var.a;
            if (i7 == 2 ? v2 != v : !(i7 == 4 && v2 == v + 1)) {
                w1 m = m(w1Var.c, i7, v, i5);
                f(m, i3);
                m.c = null;
                zwVar.c(m);
                if (w1Var.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                v = v2;
            } else {
                i5++;
            }
        }
        Object obj = w1Var.c;
        w1Var.c = null;
        zwVar.c(w1Var);
        if (i5 > 0) {
            w1 m2 = m(obj, w1Var.a, v, i5);
            f(m2, i3);
            m2.c = null;
            zwVar.c(m2);
        }
    }

    public void f(w1 w1Var, int i) {
        oy oyVar = (oy) this.e;
        oyVar.a(w1Var);
        int i2 = w1Var.a;
        if (i2 != 2) {
            if (i2 == 4) {
                oyVar.c(i, w1Var.d, w1Var.c);
                return;
            } else {
                t8.k("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = w1Var.d;
        RecyclerView recyclerView = oyVar.a;
        recyclerView.P(i, i3, true);
        recyclerView.o0 = true;
        recyclerView.l0.c += i3;
    }

    public int g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            w1 w1Var = (w1) arrayList.get(i2);
            int i3 = w1Var.a;
            int i4 = w1Var.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = w1Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (w1Var.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = w1Var.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += w1Var.d;
            }
            i2++;
        }
        return i;
    }

    public ColorStateList h() {
        cc ccVar = (cc) this.e;
        if (ccVar != null) {
            return (ColorStateList) ccVar.c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        cc ccVar = (cc) this.e;
        if (ccVar != null) {
            return (PorterDuff.Mode) ccVar.d;
        }
        return null;
    }

    public boolean j() {
        return this.a < ((List) this.e).size() || !((ArrayList) this.c).isEmpty();
    }

    public boolean k() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void l(AttributeSet attributeSet, int i) {
        ColorStateList f;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = wx.z;
        a6 u = a6.u(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) u.b;
        View view2 = (View) this.b;
        x80.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) u.b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                h4 h4Var = (h4) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (h4Var) {
                    f = h4Var.a.f(context2, i2);
                }
                if (f != null) {
                    s(f);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(u.j(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(fg.b(typedArray.getInt(2, -1), null));
            }
            u.w();
        } catch (Throwable th) {
            u.w();
            throw th;
        }
    }

    public w1 m(Object obj, int i, int i2, int i3) {
        w1 w1Var = (w1) ((zw) this.b).a();
        if (w1Var != null) {
            w1Var.a = i;
            w1Var.b = i2;
            w1Var.d = i3;
            w1Var.c = obj;
            return w1Var;
        }
        w1 w1Var2 = new w1();
        w1Var2.a = i;
        w1Var2.b = i2;
        w1Var2.d = i3;
        w1Var2.c = obj;
        return w1Var2;
    }

    public void n() {
        this.a = -1;
        s(null);
        a();
    }

    public void o(int i) {
        ColorStateList colorStateList;
        this.a = i;
        h4 h4Var = (h4) this.c;
        if (h4Var != null) {
            Context context = ((View) this.b).getContext();
            synchronized (h4Var) {
                colorStateList = h4Var.a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        s(colorStateList);
        a();
    }

    public void p(w1 w1Var) {
        oy oyVar = (oy) this.e;
        ((ArrayList) this.d).add(w1Var);
        int i = w1Var.a;
        if (i == 1) {
            oyVar.d(w1Var.b, w1Var.d);
            return;
        }
        if (i == 2) {
            int i2 = w1Var.b;
            int i3 = w1Var.d;
            RecyclerView recyclerView = oyVar.a;
            recyclerView.P(i2, i3, false);
            recyclerView.o0 = true;
            return;
        }
        if (i == 4) {
            oyVar.c(w1Var.b, w1Var.d, w1Var.c);
        } else if (i == 8) {
            oyVar.e(w1Var.b, w1Var.d);
        } else {
            t8.v(w1Var, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q() {
        boolean z;
        char c;
        w1 m;
        int i;
        int i2;
        w1 m2;
        boolean z2;
        boolean z3;
        Object obj;
        w1 w1Var;
        zw zwVar = (zw) this.b;
        oy oyVar = (oy) this.e;
        mr mrVar = (mr) this.f;
        ArrayList arrayList = (ArrayList) this.c;
        mrVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((w1) arrayList.get(size)).a == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i3 = size + 1;
            x1 x1Var = (x1) mrVar.f;
            zw zwVar2 = (zw) x1Var.b;
            w1 w1Var2 = (w1) arrayList.get(size);
            w1 w1Var3 = (w1) arrayList.get(i3);
            int i4 = w1Var3.a;
            if (i4 == 1) {
                int i5 = w1Var2.d;
                int i6 = w1Var3.b;
                int i7 = i5 < i6 ? -1 : 0;
                int i8 = w1Var2.b;
                if (i8 < i6) {
                    i7++;
                }
                if (i6 <= i8) {
                    w1Var2.b = i8 + w1Var3.d;
                }
                int i9 = w1Var3.b;
                if (i9 <= i5) {
                    w1Var2.d = i5 + w1Var3.d;
                }
                w1Var3.b = i9 + i7;
                arrayList.set(size, w1Var3);
                arrayList.set(i3, w1Var2);
            } else if (i4 == 2) {
                int i10 = w1Var2.b;
                int i11 = w1Var2.d;
                int i12 = w1Var3.b;
                if (i10 < i11) {
                    if (i12 == i10 && w1Var3.d == i11 - i10) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i12 == i11 + 1 && w1Var3.d == i10 - i11) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i11 < i12) {
                    w1Var3.b = i12 - 1;
                } else {
                    int i13 = w1Var3.d;
                    if (i11 < i12 + i13) {
                        w1Var3.d = i13 - 1;
                        w1Var2.a = 2;
                        w1Var2.d = 1;
                        if (w1Var3.d == 0) {
                            arrayList.remove(i3);
                            w1Var3.c = null;
                            zwVar2.c(w1Var3);
                        }
                    }
                }
                int i14 = w1Var2.b;
                int i15 = w1Var3.b;
                if (i14 <= i15) {
                    w1Var3.b = i15 + 1;
                } else {
                    int i16 = i15 + w1Var3.d;
                    if (i14 < i16) {
                        obj = null;
                        w1 m3 = x1Var.m(null, 2, i14 + 1, i16 - i14);
                        w1Var3.d = w1Var2.b - w1Var3.b;
                        w1Var = m3;
                        if (z3) {
                            if (z2) {
                                if (w1Var != null) {
                                    int i17 = w1Var2.b;
                                    if (i17 > w1Var.b) {
                                        w1Var2.b = i17 - w1Var.d;
                                    }
                                    int i18 = w1Var2.d;
                                    if (i18 > w1Var.b) {
                                        w1Var2.d = i18 - w1Var.d;
                                    }
                                }
                                int i19 = w1Var2.b;
                                if (i19 > w1Var3.b) {
                                    w1Var2.b = i19 - w1Var3.d;
                                }
                                int i20 = w1Var2.d;
                                if (i20 > w1Var3.b) {
                                    w1Var2.d = i20 - w1Var3.d;
                                }
                            } else {
                                if (w1Var != null) {
                                    int i21 = w1Var2.b;
                                    if (i21 >= w1Var.b) {
                                        w1Var2.b = i21 - w1Var.d;
                                    }
                                    int i22 = w1Var2.d;
                                    if (i22 >= w1Var.b) {
                                        w1Var2.d = i22 - w1Var.d;
                                    }
                                }
                                int i23 = w1Var2.b;
                                if (i23 >= w1Var3.b) {
                                    w1Var2.b = i23 - w1Var3.d;
                                }
                                int i24 = w1Var2.d;
                                if (i24 >= w1Var3.b) {
                                    w1Var2.d = i24 - w1Var3.d;
                                }
                            }
                            arrayList.set(size, w1Var3);
                            if (w1Var2.b != w1Var2.d) {
                                arrayList.set(i3, w1Var2);
                            } else {
                                arrayList.remove(i3);
                            }
                            if (w1Var != null) {
                                arrayList.add(size, w1Var);
                            }
                        } else {
                            arrayList.set(size, w1Var3);
                            arrayList.remove(i3);
                            w1Var2.c = obj;
                            zwVar2.c(w1Var2);
                        }
                    }
                }
                obj = null;
                w1Var = null;
                if (z3) {
                }
            } else if (i4 == 4) {
                int i25 = w1Var2.d;
                int i26 = w1Var3.b;
                if (i25 < i26) {
                    w1Var3.b = i26 - 1;
                } else {
                    int i27 = w1Var3.d;
                    if (i25 < i26 + i27) {
                        w1Var3.d = i27 - 1;
                        m = x1Var.m(w1Var3.c, 4, w1Var2.b, 1);
                        i = w1Var2.b;
                        i2 = w1Var3.b;
                        if (i > i2) {
                            w1Var3.b = i2 + 1;
                        } else {
                            int i28 = i2 + w1Var3.d;
                            if (i < i28) {
                                int i29 = i28 - i;
                                m2 = x1Var.m(w1Var3.c, 4, i + 1, i29);
                                w1Var3.d -= i29;
                                arrayList.set(i3, w1Var2);
                                if (w1Var3.d > 0) {
                                    arrayList.set(size, w1Var3);
                                } else {
                                    arrayList.remove(size);
                                    w1Var3.c = null;
                                    zwVar2.c(w1Var3);
                                }
                                if (m != null) {
                                    arrayList.add(size, m);
                                }
                                if (m2 != null) {
                                    arrayList.add(size, m2);
                                }
                            }
                        }
                        m2 = null;
                        arrayList.set(i3, w1Var2);
                        if (w1Var3.d > 0) {
                        }
                        if (m != null) {
                        }
                        if (m2 != null) {
                        }
                    }
                }
                m = null;
                i = w1Var2.b;
                i2 = w1Var3.b;
                if (i > i2) {
                }
                m2 = null;
                arrayList.set(i3, w1Var2);
                if (w1Var3.d > 0) {
                }
                if (m != null) {
                }
                if (m2 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        for (int i30 = 0; i30 < size2; i30++) {
            w1 w1Var4 = (w1) arrayList.get(i30);
            int i31 = w1Var4.a;
            if (i31 == 1) {
                p(w1Var4);
            } else if (i31 == 2) {
                int i32 = w1Var4.b;
                int i33 = w1Var4.d + i32;
                int i34 = i32;
                int i35 = 0;
                char c2 = 65535;
                while (i34 < i33) {
                    if (oyVar.b(i34) != null || b(i34)) {
                        if (c2 == 0) {
                            e(m(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 1;
                    } else {
                        if (c2 == 1) {
                            p(m(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    c2 = c;
                }
                if (i35 != w1Var4.d) {
                    w1Var4.c = null;
                    zwVar.c(w1Var4);
                    w1Var4 = m(null, 2, i32, i35);
                }
                if (c2 == 0) {
                    e(w1Var4);
                } else {
                    p(w1Var4);
                }
            } else if (i31 == 4) {
                int i36 = w1Var4.b;
                int i37 = w1Var4.d + i36;
                int i38 = i36;
                int i39 = 0;
                char c3 = 65535;
                while (i36 < i37) {
                    if (oyVar.b(i36) != null || b(i36)) {
                        if (c3 == 0) {
                            e(m(w1Var4.c, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        c3 = 1;
                    } else {
                        if (c3 == 1) {
                            p(m(w1Var4.c, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        c3 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != w1Var4.d) {
                    Object obj2 = w1Var4.c;
                    w1Var4.c = null;
                    zwVar.c(w1Var4);
                    w1Var4 = m(obj2, 4, i38, i39);
                }
                if (c3 == 0) {
                    e(w1Var4);
                } else {
                    p(w1Var4);
                }
            } else if (i31 == 8) {
                p(w1Var4);
            }
        }
        arrayList.clear();
    }

    public void r(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            w1 w1Var = (w1) arrayList.get(i);
            w1Var.c = null;
            ((zw) this.b).c(w1Var);
        }
        arrayList.clear();
    }

    public void s(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((cc) this.d) == null) {
                this.d = new cc();
            }
            cc ccVar = (cc) this.d;
            ccVar.c = colorStateList;
            ccVar.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void t(ColorStateList colorStateList) {
        if (((cc) this.e) == null) {
            this.e = new cc();
        }
        cc ccVar = (cc) this.e;
        ccVar.c = colorStateList;
        ccVar.b = true;
        a();
    }

    public void u(PorterDuff.Mode mode) {
        if (((cc) this.e) == null) {
            this.e = new cc();
        }
        cc ccVar = (cc) this.e;
        ccVar.d = mode;
        ccVar.a = true;
        a();
    }

    public int v(int i, int i2) {
        int i3;
        int i4;
        zw zwVar = (zw) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w1 w1Var = (w1) arrayList.get(size);
            int i5 = w1Var.a;
            int i6 = w1Var.b;
            if (i5 == 8) {
                int i7 = w1Var.d;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            w1Var.b = i6 + 1;
                            w1Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            w1Var.b = i6 - 1;
                            w1Var.d = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        w1Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        w1Var.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        w1Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        w1Var.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= w1Var.d;
                } else if (i5 == 2) {
                    i += w1Var.d;
                }
            } else if (i2 == 1) {
                w1Var.b = i6 + 1;
            } else if (i2 == 2) {
                w1Var.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            w1 w1Var2 = (w1) arrayList.get(size2);
            int i8 = w1Var2.a;
            int i9 = w1Var2.d;
            if (i8 == 8) {
                if (i9 == w1Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    w1Var2.c = null;
                    zwVar.c(w1Var2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                w1Var2.c = null;
                zwVar.c(w1Var2);
            }
        }
        return i;
    }

    public x1(View view) {
        this.a = -1;
        this.b = view;
        this.c = h4.a();
    }

    public x1(oy oyVar) {
        this.b = new zw(30);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = 0;
        this.e = oyVar;
        this.f = new mr(this);
    }
}
