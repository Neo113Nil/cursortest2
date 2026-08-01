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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class f2 {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public f2(n2 n2Var, kz kzVar, n70 n70Var) {
        List i;
        kzVar.getClass();
        this.b = n2Var;
        this.d = kzVar;
        wm wmVar = wm.f;
        this.e = wmVar;
        this.f = wmVar;
        this.c = new ArrayList();
        ou ouVar = n2Var.h;
        ouVar.getClass();
        URI g = ouVar.g();
        if (g.getHost() == null) {
            i = zk0.i(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = n2Var.g.select(g);
            i = (select == null || select.isEmpty()) ? zk0.i(Proxy.NO_PROXY) : zk0.u(select);
        }
        this.e = i;
        this.a = 0;
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((me) this.d) != null) {
                if (((me) this.f) == null) {
                    this.f = new me();
                }
                me meVar = (me) this.f;
                meVar.c = null;
                meVar.b = false;
                meVar.d = null;
                meVar.a = false;
                WeakHashMap weakHashMap = hm0.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    meVar.b = true;
                    meVar.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    meVar.a = true;
                    meVar.d = backgroundTintMode;
                }
                if (meVar.b || meVar.a) {
                    a5.e(background, meVar, view.getDrawableState());
                    return;
                }
            }
            me meVar2 = (me) this.e;
            if (meVar2 != null) {
                a5.e(background, meVar2, view.getDrawableState());
                return;
            }
            me meVar3 = (me) this.d;
            if (meVar3 != null) {
                a5.e(background, meVar3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            e2 e2Var = (e2) arrayList.get(i2);
            int i3 = e2Var.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = e2Var.b;
                    int i5 = e2Var.d + i4;
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
                if (g(e2Var.d, i2 + 1) == i) {
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
            ((w70) this.e).a((e2) arrayList.get(i));
        }
        r(arrayList);
        this.a = 0;
    }

    public void d() {
        w70 w70Var = (w70) this.e;
        c();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e2 e2Var = (e2) arrayList.get(i);
            int i2 = e2Var.a;
            if (i2 == 1) {
                w70Var.a(e2Var);
                w70Var.d(e2Var.b, e2Var.d);
            } else if (i2 == 2) {
                w70Var.a(e2Var);
                int i3 = e2Var.b;
                int i4 = e2Var.d;
                RecyclerView recyclerView = w70Var.a;
                recyclerView.P(i3, i4, true);
                recyclerView.o0 = true;
                recyclerView.l0.c += i4;
            } else if (i2 == 4) {
                w70Var.a(e2Var);
                w70Var.c(e2Var.b, e2Var.d, e2Var.c);
            } else if (i2 == 8) {
                w70Var.a(e2Var);
                w70Var.e(e2Var.b, e2Var.d);
            }
        }
        r(arrayList);
        this.a = 0;
    }

    public void e(e2 e2Var) {
        int i;
        f60 f60Var = (f60) this.b;
        int i2 = e2Var.a;
        if (i2 == 1 || i2 == 8) {
            s9.k("should not dispatch add or move for pre layout");
            return;
        }
        int v = v(e2Var.b, i2);
        int i3 = e2Var.b;
        int i4 = e2Var.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                s9.v(e2Var, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < e2Var.d; i6++) {
            int v2 = v((i * i6) + e2Var.b, e2Var.a);
            int i7 = e2Var.a;
            if (i7 == 2 ? v2 != v : !(i7 == 4 && v2 == v + 1)) {
                e2 m = m(e2Var.c, i7, v, i5);
                f(m, i3);
                m.c = null;
                f60Var.c(m);
                if (e2Var.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                v = v2;
            } else {
                i5++;
            }
        }
        Object obj = e2Var.c;
        e2Var.c = null;
        f60Var.c(e2Var);
        if (i5 > 0) {
            e2 m2 = m(obj, e2Var.a, v, i5);
            f(m2, i3);
            m2.c = null;
            f60Var.c(m2);
        }
    }

    public void f(e2 e2Var, int i) {
        w70 w70Var = (w70) this.e;
        w70Var.a(e2Var);
        int i2 = e2Var.a;
        if (i2 != 2) {
            if (i2 == 4) {
                w70Var.c(i, e2Var.d, e2Var.c);
                return;
            } else {
                s9.k("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = e2Var.d;
        RecyclerView recyclerView = w70Var.a;
        recyclerView.P(i, i3, true);
        recyclerView.o0 = true;
        recyclerView.l0.c += i3;
    }

    public int g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            e2 e2Var = (e2) arrayList.get(i2);
            int i3 = e2Var.a;
            int i4 = e2Var.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = e2Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (e2Var.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = e2Var.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += e2Var.d;
            }
            i2++;
        }
        return i;
    }

    public ColorStateList h() {
        me meVar = (me) this.e;
        if (meVar != null) {
            return (ColorStateList) meVar.c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        me meVar = (me) this.e;
        if (meVar != null) {
            return (PorterDuff.Mode) meVar.d;
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
        int[] iArr = d70.z;
        s6 t = s6.t(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) t.b;
        View view2 = (View) this.b;
        hm0.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) t.b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                a5 a5Var = (a5) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (a5Var) {
                    f = a5Var.a.f(context2, i2);
                }
                if (f != null) {
                    s(f);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(t.i(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(rk.b(typedArray.getInt(2, -1), null));
            }
            t.v();
        } catch (Throwable th) {
            t.v();
            throw th;
        }
    }

    public e2 m(Object obj, int i, int i2, int i3) {
        e2 e2Var = (e2) ((f60) this.b).a();
        if (e2Var != null) {
            e2Var.a = i;
            e2Var.b = i2;
            e2Var.d = i3;
            e2Var.c = obj;
            return e2Var;
        }
        e2 e2Var2 = new e2();
        e2Var2.a = i;
        e2Var2.b = i2;
        e2Var2.d = i3;
        e2Var2.c = obj;
        return e2Var2;
    }

    public void n() {
        this.a = -1;
        s(null);
        a();
    }

    public void o(int i) {
        ColorStateList colorStateList;
        this.a = i;
        a5 a5Var = (a5) this.c;
        if (a5Var != null) {
            Context context = ((View) this.b).getContext();
            synchronized (a5Var) {
                colorStateList = a5Var.a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        s(colorStateList);
        a();
    }

    public void p(e2 e2Var) {
        w70 w70Var = (w70) this.e;
        ((ArrayList) this.d).add(e2Var);
        int i = e2Var.a;
        if (i == 1) {
            w70Var.d(e2Var.b, e2Var.d);
            return;
        }
        if (i == 2) {
            int i2 = e2Var.b;
            int i3 = e2Var.d;
            RecyclerView recyclerView = w70Var.a;
            recyclerView.P(i2, i3, false);
            recyclerView.o0 = true;
            return;
        }
        if (i == 4) {
            w70Var.c(e2Var.b, e2Var.d, e2Var.c);
        } else if (i == 8) {
            w70Var.e(e2Var.b, e2Var.d);
        } else {
            s9.v(e2Var, "Unknown update op type for ");
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
        e2 m;
        int i;
        int i2;
        e2 m2;
        boolean z2;
        boolean z3;
        Object obj;
        e2 e2Var;
        f60 f60Var = (f60) this.b;
        w70 w70Var = (w70) this.e;
        kz kzVar = (kz) this.f;
        ArrayList arrayList = (ArrayList) this.c;
        kzVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((e2) arrayList.get(size)).a == 8) {
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
            f2 f2Var = (f2) kzVar.f;
            f60 f60Var2 = (f60) f2Var.b;
            e2 e2Var2 = (e2) arrayList.get(size);
            e2 e2Var3 = (e2) arrayList.get(i3);
            int i4 = e2Var3.a;
            if (i4 == 1) {
                int i5 = e2Var2.d;
                int i6 = e2Var3.b;
                int i7 = i5 < i6 ? -1 : 0;
                int i8 = e2Var2.b;
                if (i8 < i6) {
                    i7++;
                }
                if (i6 <= i8) {
                    e2Var2.b = i8 + e2Var3.d;
                }
                int i9 = e2Var3.b;
                if (i9 <= i5) {
                    e2Var2.d = i5 + e2Var3.d;
                }
                e2Var3.b = i9 + i7;
                arrayList.set(size, e2Var3);
                arrayList.set(i3, e2Var2);
            } else if (i4 == 2) {
                int i10 = e2Var2.b;
                int i11 = e2Var2.d;
                int i12 = e2Var3.b;
                if (i10 < i11) {
                    if (i12 == i10 && e2Var3.d == i11 - i10) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i12 == i11 + 1 && e2Var3.d == i10 - i11) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i11 < i12) {
                    e2Var3.b = i12 - 1;
                } else {
                    int i13 = e2Var3.d;
                    if (i11 < i12 + i13) {
                        e2Var3.d = i13 - 1;
                        e2Var2.a = 2;
                        e2Var2.d = 1;
                        if (e2Var3.d == 0) {
                            arrayList.remove(i3);
                            e2Var3.c = null;
                            f60Var2.c(e2Var3);
                        }
                    }
                }
                int i14 = e2Var2.b;
                int i15 = e2Var3.b;
                if (i14 <= i15) {
                    e2Var3.b = i15 + 1;
                } else {
                    int i16 = i15 + e2Var3.d;
                    if (i14 < i16) {
                        obj = null;
                        e2 m3 = f2Var.m(null, 2, i14 + 1, i16 - i14);
                        e2Var3.d = e2Var2.b - e2Var3.b;
                        e2Var = m3;
                        if (z3) {
                            if (z2) {
                                if (e2Var != null) {
                                    int i17 = e2Var2.b;
                                    if (i17 > e2Var.b) {
                                        e2Var2.b = i17 - e2Var.d;
                                    }
                                    int i18 = e2Var2.d;
                                    if (i18 > e2Var.b) {
                                        e2Var2.d = i18 - e2Var.d;
                                    }
                                }
                                int i19 = e2Var2.b;
                                if (i19 > e2Var3.b) {
                                    e2Var2.b = i19 - e2Var3.d;
                                }
                                int i20 = e2Var2.d;
                                if (i20 > e2Var3.b) {
                                    e2Var2.d = i20 - e2Var3.d;
                                }
                            } else {
                                if (e2Var != null) {
                                    int i21 = e2Var2.b;
                                    if (i21 >= e2Var.b) {
                                        e2Var2.b = i21 - e2Var.d;
                                    }
                                    int i22 = e2Var2.d;
                                    if (i22 >= e2Var.b) {
                                        e2Var2.d = i22 - e2Var.d;
                                    }
                                }
                                int i23 = e2Var2.b;
                                if (i23 >= e2Var3.b) {
                                    e2Var2.b = i23 - e2Var3.d;
                                }
                                int i24 = e2Var2.d;
                                if (i24 >= e2Var3.b) {
                                    e2Var2.d = i24 - e2Var3.d;
                                }
                            }
                            arrayList.set(size, e2Var3);
                            if (e2Var2.b != e2Var2.d) {
                                arrayList.set(i3, e2Var2);
                            } else {
                                arrayList.remove(i3);
                            }
                            if (e2Var != null) {
                                arrayList.add(size, e2Var);
                            }
                        } else {
                            arrayList.set(size, e2Var3);
                            arrayList.remove(i3);
                            e2Var2.c = obj;
                            f60Var2.c(e2Var2);
                        }
                    }
                }
                obj = null;
                e2Var = null;
                if (z3) {
                }
            } else if (i4 == 4) {
                int i25 = e2Var2.d;
                int i26 = e2Var3.b;
                if (i25 < i26) {
                    e2Var3.b = i26 - 1;
                } else {
                    int i27 = e2Var3.d;
                    if (i25 < i26 + i27) {
                        e2Var3.d = i27 - 1;
                        m = f2Var.m(e2Var3.c, 4, e2Var2.b, 1);
                        i = e2Var2.b;
                        i2 = e2Var3.b;
                        if (i > i2) {
                            e2Var3.b = i2 + 1;
                        } else {
                            int i28 = i2 + e2Var3.d;
                            if (i < i28) {
                                int i29 = i28 - i;
                                m2 = f2Var.m(e2Var3.c, 4, i + 1, i29);
                                e2Var3.d -= i29;
                                arrayList.set(i3, e2Var2);
                                if (e2Var3.d > 0) {
                                    arrayList.set(size, e2Var3);
                                } else {
                                    arrayList.remove(size);
                                    e2Var3.c = null;
                                    f60Var2.c(e2Var3);
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
                        arrayList.set(i3, e2Var2);
                        if (e2Var3.d > 0) {
                        }
                        if (m != null) {
                        }
                        if (m2 != null) {
                        }
                    }
                }
                m = null;
                i = e2Var2.b;
                i2 = e2Var3.b;
                if (i > i2) {
                }
                m2 = null;
                arrayList.set(i3, e2Var2);
                if (e2Var3.d > 0) {
                }
                if (m != null) {
                }
                if (m2 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        for (int i30 = 0; i30 < size2; i30++) {
            e2 e2Var4 = (e2) arrayList.get(i30);
            int i31 = e2Var4.a;
            if (i31 == 1) {
                p(e2Var4);
            } else if (i31 == 2) {
                int i32 = e2Var4.b;
                int i33 = e2Var4.d + i32;
                int i34 = i32;
                int i35 = 0;
                char c2 = 65535;
                while (i34 < i33) {
                    if (w70Var.b(i34) != null || b(i34)) {
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
                if (i35 != e2Var4.d) {
                    e2Var4.c = null;
                    f60Var.c(e2Var4);
                    e2Var4 = m(null, 2, i32, i35);
                }
                if (c2 == 0) {
                    e(e2Var4);
                } else {
                    p(e2Var4);
                }
            } else if (i31 == 4) {
                int i36 = e2Var4.b;
                int i37 = e2Var4.d + i36;
                int i38 = i36;
                int i39 = 0;
                char c3 = 65535;
                while (i36 < i37) {
                    if (w70Var.b(i36) != null || b(i36)) {
                        if (c3 == 0) {
                            e(m(e2Var4.c, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        c3 = 1;
                    } else {
                        if (c3 == 1) {
                            p(m(e2Var4.c, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        c3 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != e2Var4.d) {
                    Object obj2 = e2Var4.c;
                    e2Var4.c = null;
                    f60Var.c(e2Var4);
                    e2Var4 = m(obj2, 4, i38, i39);
                }
                if (c3 == 0) {
                    e(e2Var4);
                } else {
                    p(e2Var4);
                }
            } else if (i31 == 8) {
                p(e2Var4);
            }
        }
        arrayList.clear();
    }

    public void r(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e2 e2Var = (e2) arrayList.get(i);
            e2Var.c = null;
            ((f60) this.b).c(e2Var);
        }
        arrayList.clear();
    }

    public void s(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((me) this.d) == null) {
                this.d = new me();
            }
            me meVar = (me) this.d;
            meVar.c = colorStateList;
            meVar.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void t(ColorStateList colorStateList) {
        if (((me) this.e) == null) {
            this.e = new me();
        }
        me meVar = (me) this.e;
        meVar.c = colorStateList;
        meVar.b = true;
        a();
    }

    public void u(PorterDuff.Mode mode) {
        if (((me) this.e) == null) {
            this.e = new me();
        }
        me meVar = (me) this.e;
        meVar.d = mode;
        meVar.a = true;
        a();
    }

    public int v(int i, int i2) {
        int i3;
        int i4;
        f60 f60Var = (f60) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e2 e2Var = (e2) arrayList.get(size);
            int i5 = e2Var.a;
            int i6 = e2Var.b;
            if (i5 == 8) {
                int i7 = e2Var.d;
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
                            e2Var.b = i6 + 1;
                            e2Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            e2Var.b = i6 - 1;
                            e2Var.d = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        e2Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        e2Var.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        e2Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        e2Var.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= e2Var.d;
                } else if (i5 == 2) {
                    i += e2Var.d;
                }
            } else if (i2 == 1) {
                e2Var.b = i6 + 1;
            } else if (i2 == 2) {
                e2Var.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            e2 e2Var2 = (e2) arrayList.get(size2);
            int i8 = e2Var2.a;
            int i9 = e2Var2.d;
            if (i8 == 8) {
                if (i9 == e2Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    e2Var2.c = null;
                    f60Var.c(e2Var2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                e2Var2.c = null;
                f60Var.c(e2Var2);
            }
        }
        return i;
    }

    public f2(View view) {
        this.a = -1;
        this.b = view;
        this.c = a5.a();
    }

    public f2(w70 w70Var) {
        this.b = new f60(30);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = 0;
        this.e = w70Var;
        this.f = new kz(this);
    }
}
