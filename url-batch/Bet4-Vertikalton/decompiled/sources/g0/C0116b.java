package g0;

import K.C0014l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.AbstractC0221m0;
import l.C0234t;
import l.T0;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116b {

    /* renamed from: a, reason: collision with root package name */
    public int f2324a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2325b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2326c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2327e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2328f;

    public C0116b(View view) {
        this.f2324a = -1;
        this.f2325b = view;
        this.f2326c = C0234t.a();
    }

    public void a() {
        View view = (View) this.f2325b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((T0) this.d) != null) {
                if (((T0) this.f2328f) == null) {
                    this.f2328f = new T0();
                }
                T0 t02 = (T0) this.f2328f;
                t02.f2861c = null;
                t02.f2860b = false;
                t02.d = null;
                t02.f2859a = false;
                WeakHashMap weakHashMap = K.T.f423a;
                ColorStateList g2 = K.H.g(view);
                if (g2 != null) {
                    t02.f2860b = true;
                    t02.f2861c = g2;
                }
                PorterDuff.Mode h = K.H.h(view);
                if (h != null) {
                    t02.f2859a = true;
                    t02.d = h;
                }
                if (t02.f2860b || t02.f2859a) {
                    C0234t.e(background, t02, view.getDrawableState());
                    return;
                }
            }
            T0 t03 = (T0) this.f2327e;
            if (t03 != null) {
                C0234t.e(background, t03, view.getDrawableState());
                return;
            }
            T0 t04 = (T0) this.d;
            if (t04 != null) {
                C0234t.e(background, t04, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0115a c0115a = (C0115a) arrayList.get(i2);
            int i3 = c0115a.f2321a;
            if (i3 == 8) {
                if (g(c0115a.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0115a.f2322b;
                int i5 = c0115a.d + i4;
                while (i4 < i5) {
                    if (g(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0111C) this.f2327e).a((C0115a) arrayList.get(i));
        }
        q(arrayList);
        this.f2324a = 0;
    }

    public void d() {
        c();
        ArrayList arrayList = (ArrayList) this.f2326c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0115a c0115a = (C0115a) arrayList.get(i);
            int i2 = c0115a.f2321a;
            C0111C c0111c = (C0111C) this.f2327e;
            if (i2 == 1) {
                c0111c.a(c0115a);
                c0111c.d(c0115a.f2322b, c0115a.d);
            } else if (i2 == 2) {
                c0111c.a(c0115a);
                int i3 = c0115a.f2322b;
                int i4 = c0115a.d;
                RecyclerView recyclerView = c0111c.f2261a;
                recyclerView.R(i3, i4, true);
                recyclerView.f1574j0 = true;
                recyclerView.f1570g0.f2312c += i4;
            } else if (i2 == 4) {
                c0111c.a(c0115a);
                c0111c.c(c0115a.f2322b, c0115a.d, c0115a.f2323c);
            } else if (i2 == 8) {
                c0111c.a(c0115a);
                c0111c.e(c0115a.f2322b, c0115a.d);
            }
        }
        q(arrayList);
        this.f2324a = 0;
    }

    public void e(C0115a c0115a) {
        int i;
        J.b bVar;
        int i2 = c0115a.f2321a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int u2 = u(c0115a.f2322b, i2);
        int i3 = c0115a.f2322b;
        int i4 = c0115a.f2321a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0115a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0115a.d;
            bVar = (J.b) this.f2325b;
            if (i5 >= i7) {
                break;
            }
            int u3 = u((i * i5) + c0115a.f2322b, c0115a.f2321a);
            int i8 = c0115a.f2321a;
            if (i8 == 2 ? u3 != u2 : !(i8 == 4 && u3 == u2 + 1)) {
                C0115a l2 = l(c0115a.f2323c, i8, u2, i6);
                f(l2, i3);
                l2.f2323c = null;
                bVar.c(l2);
                if (c0115a.f2321a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                u2 = u3;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = c0115a.f2323c;
        c0115a.f2323c = null;
        bVar.c(c0115a);
        if (i6 > 0) {
            C0115a l3 = l(obj, c0115a.f2321a, u2, i6);
            f(l3, i3);
            l3.f2323c = null;
            bVar.c(l3);
        }
    }

    public void f(C0115a c0115a, int i) {
        C0111C c0111c = (C0111C) this.f2327e;
        c0111c.a(c0115a);
        int i2 = c0115a.f2321a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0111c.c(i, c0115a.d, c0115a.f2323c);
        } else {
            int i3 = c0115a.d;
            RecyclerView recyclerView = c0111c.f2261a;
            recyclerView.R(i, i3, true);
            recyclerView.f1574j0 = true;
            recyclerView.f1570g0.f2312c += i3;
        }
    }

    public int g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            C0115a c0115a = (C0115a) arrayList.get(i2);
            int i3 = c0115a.f2321a;
            if (i3 == 8) {
                int i4 = c0115a.f2322b;
                if (i4 == i) {
                    i = c0115a.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0115a.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0115a.f2322b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0115a.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0115a.d;
                }
            }
            i2++;
        }
        return i;
    }

    public ColorStateList h() {
        T0 t02 = (T0) this.f2327e;
        if (t02 != null) {
            return (ColorStateList) t02.f2861c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        T0 t02 = (T0) this.f2327e;
        if (t02 != null) {
            return (PorterDuff.Mode) t02.d;
        }
        return null;
    }

    public boolean j() {
        return ((ArrayList) this.f2326c).size() > 0;
    }

    public void k(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = (View) this.f2325b;
        Context context = view.getContext();
        int[] iArr = f.a.f2076y;
        C0014l i2 = C0014l.i(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) i2.f475b;
        View view2 = (View) this.f2325b;
        K.T.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) i2.f475b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f2324a = typedArray.getResourceId(0, -1);
                C0234t c0234t = (C0234t) this.f2326c;
                Context context2 = view.getContext();
                int i3 = this.f2324a;
                synchronized (c0234t) {
                    f2 = c0234t.f2993a.f(context2, i3);
                }
                if (f2 != null) {
                    r(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                K.H.q(view, i2.b(1));
            }
            if (typedArray.hasValue(2)) {
                K.H.r(view, AbstractC0221m0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            i2.k();
        }
    }

    public C0115a l(Object obj, int i, int i2, int i3) {
        C0115a c0115a = (C0115a) ((J.b) this.f2325b).a();
        if (c0115a != null) {
            c0115a.f2321a = i;
            c0115a.f2322b = i2;
            c0115a.d = i3;
            c0115a.f2323c = obj;
            return c0115a;
        }
        C0115a c0115a2 = new C0115a();
        c0115a2.f2321a = i;
        c0115a2.f2322b = i2;
        c0115a2.d = i3;
        c0115a2.f2323c = obj;
        return c0115a2;
    }

    public void m() {
        this.f2324a = -1;
        r(null);
        a();
    }

    public void n(int i) {
        ColorStateList colorStateList;
        this.f2324a = i;
        C0234t c0234t = (C0234t) this.f2326c;
        if (c0234t != null) {
            Context context = ((View) this.f2325b).getContext();
            synchronized (c0234t) {
                colorStateList = c0234t.f2993a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        r(colorStateList);
        a();
    }

    public void o(C0115a c0115a) {
        ((ArrayList) this.d).add(c0115a);
        int i = c0115a.f2321a;
        C0111C c0111c = (C0111C) this.f2327e;
        if (i == 1) {
            c0111c.d(c0115a.f2322b, c0115a.d);
            return;
        }
        if (i == 2) {
            int i2 = c0115a.f2322b;
            int i3 = c0115a.d;
            RecyclerView recyclerView = c0111c.f2261a;
            recyclerView.R(i2, i3, false);
            recyclerView.f1574j0 = true;
            return;
        }
        if (i == 4) {
            c0111c.c(c0115a.f2322b, c0115a.d, c0115a.f2323c);
        } else if (i == 8) {
            c0111c.e(c0115a.f2322b, c0115a.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0115a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0121 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p() {
        char c2;
        int i;
        boolean z2;
        char c3;
        C0115a l2;
        int i2;
        int i3;
        C0115a l3;
        boolean z3;
        boolean z4;
        C0115a l4;
        ArrayList arrayList = (ArrayList) this.f2326c;
        C.g gVar = (C.g) this.f2328f;
        gVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z5 = false;
            while (true) {
                c2 = 65535;
                i = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C0115a) arrayList.get(size)).f2321a != 8) {
                    z5 = true;
                } else if (z5) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i4 = size + 1;
            C0115a c0115a = (C0115a) arrayList.get(size);
            C0115a c0115a2 = (C0115a) arrayList.get(i4);
            int i5 = c0115a2.f2321a;
            if (i5 != 1) {
                C0116b c0116b = (C0116b) gVar.f115b;
                if (i5 == 2) {
                    int i6 = c0115a.f2322b;
                    int i7 = c0115a.d;
                    if (i6 < i7) {
                        z4 = c0115a2.f2322b == i6 && c0115a2.d == i7 - i6;
                        z3 = false;
                    } else if (c0115a2.f2322b == i7 + 1 && c0115a2.d == i6 - i7) {
                        z4 = true;
                        z3 = true;
                    } else {
                        z3 = true;
                        z4 = false;
                    }
                    int i8 = c0115a2.f2322b;
                    if (i7 < i8) {
                        c0115a2.f2322b = i8 - 1;
                    } else {
                        int i9 = c0115a2.d;
                        if (i7 < i8 + i9) {
                            c0115a2.d = i9 - 1;
                            c0115a.f2321a = 2;
                            c0115a.d = 1;
                            if (c0115a2.d == 0) {
                                arrayList.remove(i4);
                                c0116b.getClass();
                                c0115a2.f2323c = null;
                                ((J.b) c0116b.f2325b).c(c0115a2);
                            }
                        }
                    }
                    int i10 = c0115a.f2322b;
                    int i11 = c0115a2.f2322b;
                    if (i10 <= i11) {
                        c0115a2.f2322b = i11 + 1;
                    } else {
                        int i12 = i11 + c0115a2.d;
                        if (i10 < i12) {
                            l4 = c0116b.l(null, 2, i10 + 1, i12 - i10);
                            c0115a2.d = c0115a.f2322b - c0115a2.f2322b;
                            if (z4) {
                                if (z3) {
                                    if (l4 != null) {
                                        int i13 = c0115a.f2322b;
                                        if (i13 > l4.f2322b) {
                                            c0115a.f2322b = i13 - l4.d;
                                        }
                                        int i14 = c0115a.d;
                                        if (i14 > l4.f2322b) {
                                            c0115a.d = i14 - l4.d;
                                        }
                                    }
                                    int i15 = c0115a.f2322b;
                                    if (i15 > c0115a2.f2322b) {
                                        c0115a.f2322b = i15 - c0115a2.d;
                                    }
                                    int i16 = c0115a.d;
                                    if (i16 > c0115a2.f2322b) {
                                        c0115a.d = i16 - c0115a2.d;
                                    }
                                } else {
                                    if (l4 != null) {
                                        int i17 = c0115a.f2322b;
                                        if (i17 >= l4.f2322b) {
                                            c0115a.f2322b = i17 - l4.d;
                                        }
                                        int i18 = c0115a.d;
                                        if (i18 >= l4.f2322b) {
                                            c0115a.d = i18 - l4.d;
                                        }
                                    }
                                    int i19 = c0115a.f2322b;
                                    if (i19 >= c0115a2.f2322b) {
                                        c0115a.f2322b = i19 - c0115a2.d;
                                    }
                                    int i20 = c0115a.d;
                                    if (i20 >= c0115a2.f2322b) {
                                        c0115a.d = i20 - c0115a2.d;
                                    }
                                }
                                arrayList.set(size, c0115a2);
                                if (c0115a.f2322b != c0115a.d) {
                                    arrayList.set(i4, c0115a);
                                } else {
                                    arrayList.remove(i4);
                                }
                                if (l4 != null) {
                                    arrayList.add(size, l4);
                                }
                            } else {
                                arrayList.set(size, c0115a2);
                                arrayList.remove(i4);
                                c0116b.getClass();
                                c0115a.f2323c = null;
                                ((J.b) c0116b.f2325b).c(c0115a);
                            }
                        }
                    }
                    l4 = null;
                    if (z4) {
                    }
                } else if (i5 == 4) {
                    int i21 = c0115a.d;
                    int i22 = c0115a2.f2322b;
                    if (i21 < i22) {
                        c0115a2.f2322b = i22 - 1;
                    } else {
                        int i23 = c0115a2.d;
                        if (i21 < i22 + i23) {
                            c0115a2.d = i23 - 1;
                            l2 = c0116b.l(c0115a2.f2323c, 4, c0115a.f2322b, 1);
                            i2 = c0115a.f2322b;
                            i3 = c0115a2.f2322b;
                            if (i2 > i3) {
                                c0115a2.f2322b = i3 + 1;
                            } else {
                                int i24 = i3 + c0115a2.d;
                                if (i2 < i24) {
                                    int i25 = i24 - i2;
                                    l3 = c0116b.l(c0115a2.f2323c, 4, i2 + 1, i25);
                                    c0115a2.d -= i25;
                                    arrayList.set(i4, c0115a);
                                    if (c0115a2.d > 0) {
                                        arrayList.set(size, c0115a2);
                                    } else {
                                        arrayList.remove(size);
                                        c0116b.getClass();
                                        c0115a2.f2323c = null;
                                        ((J.b) c0116b.f2325b).c(c0115a2);
                                    }
                                    if (l2 != null) {
                                        arrayList.add(size, l2);
                                    }
                                    if (l3 != null) {
                                        arrayList.add(size, l3);
                                    }
                                }
                            }
                            l3 = null;
                            arrayList.set(i4, c0115a);
                            if (c0115a2.d > 0) {
                            }
                            if (l2 != null) {
                            }
                            if (l3 != null) {
                            }
                        }
                    }
                    l2 = null;
                    i2 = c0115a.f2322b;
                    i3 = c0115a2.f2322b;
                    if (i2 > i3) {
                    }
                    l3 = null;
                    arrayList.set(i4, c0115a);
                    if (c0115a2.d > 0) {
                    }
                    if (l2 != null) {
                    }
                    if (l3 != null) {
                    }
                }
            } else {
                int i26 = c0115a.d;
                int i27 = c0115a2.f2322b;
                int i28 = i26 < i27 ? -1 : 0;
                int i29 = c0115a.f2322b;
                if (i29 < i27) {
                    i28++;
                }
                if (i27 <= i29) {
                    c0115a.f2322b = i29 + c0115a2.d;
                }
                int i30 = c0115a2.f2322b;
                if (i30 <= i26) {
                    c0115a.d = i26 + c0115a2.d;
                }
                c0115a2.f2322b = i30 + i28;
                arrayList.set(size, c0115a2);
                arrayList.set(i4, c0115a);
            }
        }
        int size2 = arrayList.size();
        int i31 = 0;
        while (i31 < size2) {
            C0115a c0115a3 = (C0115a) arrayList.get(i31);
            int i32 = c0115a3.f2321a;
            if (i32 != 1) {
                J.b bVar = (J.b) this.f2325b;
                C0111C c0111c = (C0111C) this.f2327e;
                if (i32 == 2) {
                    int i33 = c0115a3.f2322b;
                    int i34 = c0115a3.d + i33;
                    int i35 = i33;
                    int i36 = 0;
                    char c4 = 65535;
                    while (i35 < i34) {
                        if (c0111c.b(i35) != null || b(i35)) {
                            if (c4 == 0) {
                                e(l(null, 2, i33, i36));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c3 = 1;
                        } else {
                            if (c4 == 1) {
                                o(l(null, 2, i33, i36));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c3 = 0;
                        }
                        if (z2) {
                            i35 -= i36;
                            i34 -= i36;
                            i36 = 1;
                        } else {
                            i36++;
                        }
                        i35++;
                        c4 = c3;
                    }
                    if (i36 != c0115a3.d) {
                        c0115a3.f2323c = null;
                        bVar.c(c0115a3);
                        c0115a3 = l(null, 2, i33, i36);
                    }
                    if (c4 == 0) {
                        e(c0115a3);
                    } else {
                        o(c0115a3);
                    }
                } else if (i32 == 4) {
                    int i37 = c0115a3.f2322b;
                    int i38 = c0115a3.d + i37;
                    char c5 = c2;
                    int i39 = i37;
                    int i40 = 0;
                    while (i37 < i38) {
                        if (c0111c.b(i37) != null || b(i37)) {
                            if (c5 == 0) {
                                e(l(c0115a3.f2323c, 4, i39, i40));
                                i39 = i37;
                                i40 = 0;
                            }
                            c5 = 1;
                        } else {
                            if (c5 == 1) {
                                o(l(c0115a3.f2323c, 4, i39, i40));
                                i39 = i37;
                                i40 = 0;
                            }
                            c5 = 0;
                        }
                        i40++;
                        i37++;
                    }
                    if (i40 != c0115a3.d) {
                        Object obj = c0115a3.f2323c;
                        c0115a3.f2323c = null;
                        bVar.c(c0115a3);
                        c0115a3 = l(obj, 4, i39, i40);
                    }
                    if (c5 == 0) {
                        e(c0115a3);
                    } else {
                        o(c0115a3);
                    }
                } else if (i32 == i) {
                    o(c0115a3);
                }
            } else {
                o(c0115a3);
            }
            i31++;
            c2 = 65535;
            i = 8;
        }
        arrayList.clear();
    }

    public void q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0115a c0115a = (C0115a) arrayList.get(i);
            c0115a.f2323c = null;
            ((J.b) this.f2325b).c(c0115a);
        }
        arrayList.clear();
    }

    public void r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((T0) this.d) == null) {
                this.d = new T0();
            }
            T0 t02 = (T0) this.d;
            t02.f2861c = colorStateList;
            t02.f2860b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void s(ColorStateList colorStateList) {
        if (((T0) this.f2327e) == null) {
            this.f2327e = new T0();
        }
        T0 t02 = (T0) this.f2327e;
        t02.f2861c = colorStateList;
        t02.f2860b = true;
        a();
    }

    public void t(PorterDuff.Mode mode) {
        if (((T0) this.f2327e) == null) {
            this.f2327e = new T0();
        }
        T0 t02 = (T0) this.f2327e;
        t02.d = mode;
        t02.f2859a = true;
        a();
    }

    public int u(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0115a c0115a = (C0115a) arrayList.get(size);
            int i5 = c0115a.f2321a;
            if (i5 == 8) {
                int i6 = c0115a.f2322b;
                int i7 = c0115a.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c0115a.f2322b = i6 + 1;
                            c0115a.d = i7 + 1;
                        } else if (i2 == 2) {
                            c0115a.f2322b = i6 - 1;
                            c0115a.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0115a.d = i7 + 1;
                    } else if (i2 == 2) {
                        c0115a.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0115a.f2322b = i6 + 1;
                    } else if (i2 == 2) {
                        c0115a.f2322b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0115a.f2322b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0115a.d;
                    } else if (i5 == 2) {
                        i += c0115a.d;
                    }
                } else if (i2 == 1) {
                    c0115a.f2322b = i8 + 1;
                } else if (i2 == 2) {
                    c0115a.f2322b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0115a c0115a2 = (C0115a) arrayList.get(size2);
            int i9 = c0115a2.f2321a;
            J.b bVar = (J.b) this.f2325b;
            if (i9 == 8) {
                int i10 = c0115a2.d;
                if (i10 == c0115a2.f2322b || i10 < 0) {
                    arrayList.remove(size2);
                    c0115a2.f2323c = null;
                    bVar.c(c0115a2);
                }
            } else if (c0115a2.d <= 0) {
                arrayList.remove(size2);
                c0115a2.f2323c = null;
                bVar.c(c0115a2);
            }
        }
        return i;
    }

    public C0116b(C0111C c0111c) {
        this.f2325b = new J.b(30);
        this.f2326c = new ArrayList();
        this.d = new ArrayList();
        this.f2324a = 0;
        this.f2327e = c0111c;
        this.f2328f = new C.g(25, this);
    }
}
