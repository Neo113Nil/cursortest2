package f1;

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
import l.m1;
import l.t2;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f1302a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1303b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1304c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1305e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1306f;

    public b(View view) {
        this.f1302a = -1;
        this.f1303b = view;
        this.f1304c = l.u.a();
    }

    public void a() {
        View view = (View) this.f1303b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((t2) this.d) != null) {
                if (((t2) this.f1306f) == null) {
                    this.f1306f = new t2();
                }
                t2 t2Var = (t2) this.f1306f;
                t2Var.f2462a = null;
                t2Var.d = false;
                t2Var.f2463b = null;
                t2Var.f2464c = false;
                WeakHashMap weakHashMap = n0.l0.f2757a;
                ColorStateList c4 = n0.d0.c(view);
                if (c4 != null) {
                    t2Var.d = true;
                    t2Var.f2462a = c4;
                }
                PorterDuff.Mode d = n0.d0.d(view);
                if (d != null) {
                    t2Var.f2464c = true;
                    t2Var.f2463b = d;
                }
                if (t2Var.d || t2Var.f2464c) {
                    l.u.e(background, t2Var, view.getDrawableState());
                    return;
                }
            }
            t2 t2Var2 = (t2) this.f1305e;
            if (t2Var2 != null) {
                l.u.e(background, t2Var2, view.getDrawableState());
                return;
            }
            t2 t2Var3 = (t2) this.d;
            if (t2Var3 != null) {
                l.u.e(background, t2Var3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = (a) arrayList.get(i4);
            int i5 = aVar.f1291a;
            if (i5 != 8) {
                if (i5 == 1) {
                    int i6 = aVar.f1292b;
                    int i7 = aVar.d + i6;
                    while (i6 < i7) {
                        if (g(i6, i4 + 1) == i) {
                            return true;
                        }
                        i6++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(aVar.d, i4 + 1) == i) {
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
            ((c0) this.f1305e).a((a) arrayList.get(i));
        }
        q(arrayList);
        this.f1302a = 0;
    }

    public void d() {
        c0 c0Var = (c0) this.f1305e;
        c();
        ArrayList arrayList = (ArrayList) this.f1304c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) arrayList.get(i);
            int i4 = aVar.f1291a;
            if (i4 == 1) {
                c0Var.a(aVar);
                c0Var.d(aVar.f1292b, aVar.d);
            } else if (i4 == 2) {
                c0Var.a(aVar);
                int i5 = aVar.f1292b;
                int i6 = aVar.d;
                RecyclerView recyclerView = c0Var.f1328a;
                recyclerView.O(i5, i6, true);
                recyclerView.f678n0 = true;
                recyclerView.f672k0.f1538c += i6;
            } else if (i4 == 4) {
                c0Var.a(aVar);
                c0Var.c(aVar.f1292b, aVar.d, aVar.f1293c);
            } else if (i4 == 8) {
                c0Var.a(aVar);
                c0Var.e(aVar.f1292b, aVar.d);
            }
        }
        q(arrayList);
        this.f1302a = 0;
    }

    public void e(a aVar) {
        int i;
        m0.b bVar = (m0.b) this.f1303b;
        int i4 = aVar.f1291a;
        if (i4 == 1 || i4 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int u3 = u(aVar.f1292b, i4);
        int i5 = aVar.f1292b;
        int i6 = aVar.f1291a;
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
            int u4 = u((i * i8) + aVar.f1292b, aVar.f1291a);
            int i9 = aVar.f1291a;
            if (i9 == 2 ? u4 != u3 : !(i9 == 4 && u4 == u3 + 1)) {
                a l4 = l(aVar.f1293c, i9, u3, i7);
                f(l4, i5);
                l4.f1293c = null;
                bVar.c(l4);
                if (aVar.f1291a == 4) {
                    i5 += i7;
                }
                i7 = 1;
                u3 = u4;
            } else {
                i7++;
            }
        }
        Object obj = aVar.f1293c;
        aVar.f1293c = null;
        bVar.c(aVar);
        if (i7 > 0) {
            a l5 = l(obj, aVar.f1291a, u3, i7);
            f(l5, i5);
            l5.f1293c = null;
            bVar.c(l5);
        }
    }

    public void f(a aVar, int i) {
        c0 c0Var = (c0) this.f1305e;
        c0Var.a(aVar);
        int i4 = aVar.f1291a;
        if (i4 != 2) {
            if (i4 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0Var.c(i, aVar.d, aVar.f1293c);
        } else {
            int i5 = aVar.d;
            RecyclerView recyclerView = c0Var.f1328a;
            recyclerView.O(i, i5, true);
            recyclerView.f678n0 = true;
            recyclerView.f672k0.f1538c += i5;
        }
    }

    public int g(int i, int i4) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i4 < size) {
            a aVar = (a) arrayList.get(i4);
            int i5 = aVar.f1291a;
            if (i5 == 8) {
                int i6 = aVar.f1292b;
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
                int i7 = aVar.f1292b;
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

    public ColorStateList h() {
        t2 t2Var = (t2) this.f1305e;
        if (t2Var != null) {
            return t2Var.f2462a;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        t2 t2Var = (t2) this.f1305e;
        if (t2Var != null) {
            return t2Var.f2463b;
        }
        return null;
    }

    public boolean j() {
        return ((ArrayList) this.f1304c).size() > 0;
    }

    public void k(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = (View) this.f1303b;
        Context context = view.getContext();
        int[] iArr = f.a.f1262y;
        androidx.emoji2.text.t w3 = androidx.emoji2.text.t.w(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) w3.f356c;
        View view2 = (View) this.f1303b;
        n0.l0.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) w3.f356c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f1302a = typedArray.getResourceId(0, -1);
                l.u uVar = (l.u) this.f1304c;
                Context context2 = view.getContext();
                int i4 = this.f1302a;
                synchronized (uVar) {
                    f2 = uVar.f2467a.f(context2, i4);
                }
                if (f2 != null) {
                    r(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                n0.d0.g(view, w3.m(1));
            }
            if (typedArray.hasValue(2)) {
                n0.d0.h(view, m1.b(typedArray.getInt(2, -1), null));
            }
            w3.y();
        } catch (Throwable th) {
            w3.y();
            throw th;
        }
    }

    public a l(Object obj, int i, int i4, int i5) {
        a aVar = (a) ((m0.b) this.f1303b).a();
        if (aVar != null) {
            aVar.f1291a = i;
            aVar.f1292b = i4;
            aVar.d = i5;
            aVar.f1293c = obj;
            return aVar;
        }
        a aVar2 = new a();
        aVar2.f1291a = i;
        aVar2.f1292b = i4;
        aVar2.d = i5;
        aVar2.f1293c = obj;
        return aVar2;
    }

    public void m() {
        this.f1302a = -1;
        r(null);
        a();
    }

    public void n(int i) {
        ColorStateList colorStateList;
        this.f1302a = i;
        l.u uVar = (l.u) this.f1304c;
        if (uVar != null) {
            Context context = ((View) this.f1303b).getContext();
            synchronized (uVar) {
                colorStateList = uVar.f2467a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        r(colorStateList);
        a();
    }

    public void o(a aVar) {
        c0 c0Var = (c0) this.f1305e;
        ((ArrayList) this.d).add(aVar);
        int i = aVar.f1291a;
        if (i == 1) {
            c0Var.d(aVar.f1292b, aVar.d);
            return;
        }
        if (i == 2) {
            int i4 = aVar.f1292b;
            int i5 = aVar.d;
            RecyclerView recyclerView = c0Var.f1328a;
            recyclerView.O(i4, i5, false);
            recyclerView.f678n0 = true;
            return;
        }
        if (i == 4) {
            c0Var.c(aVar.f1292b, aVar.d, aVar.f1293c);
        } else if (i == 8) {
            c0Var.e(aVar.f1292b, aVar.d);
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
    public void p() {
        boolean z3;
        char c4;
        a l4;
        int i;
        int i4;
        a l5;
        boolean z4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        Object obj;
        a aVar;
        m0.b bVar = (m0.b) this.f1303b;
        c0 c0Var = (c0) this.f1305e;
        a0.a aVar2 = (a0.a) this.f1306f;
        ArrayList arrayList = (ArrayList) this.f1304c;
        aVar2.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z6 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((a) arrayList.get(size)).f1291a == 8) {
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
            int i8 = size + 1;
            b bVar2 = (b) aVar2.f81g;
            m0.b bVar3 = (m0.b) bVar2.f1303b;
            a aVar3 = (a) arrayList.get(size);
            a aVar4 = (a) arrayList.get(i8);
            int i9 = aVar4.f1291a;
            if (i9 == 1) {
                int i10 = aVar3.d;
                int i11 = aVar4.f1292b;
                int i12 = i10 < i11 ? -1 : 0;
                int i13 = aVar3.f1292b;
                if (i13 < i11) {
                    i12++;
                }
                if (i11 <= i13) {
                    aVar3.f1292b = i13 + aVar4.d;
                }
                int i14 = aVar4.f1292b;
                if (i14 <= i10) {
                    aVar3.d = i10 + aVar4.d;
                }
                aVar4.f1292b = i14 + i12;
                arrayList.set(size, aVar4);
                arrayList.set(i8, aVar3);
            } else if (i9 == 2) {
                int i15 = aVar3.f1292b;
                int i16 = aVar3.d;
                if (i15 < i16) {
                    if (aVar4.f1292b == i15 && aVar4.d == i16 - i15) {
                        z5 = true;
                        z4 = false;
                        i5 = aVar4.f1292b;
                        if (i16 >= i5) {
                        }
                        i6 = aVar3.f1292b;
                        i7 = aVar4.f1292b;
                        if (i6 > i7) {
                        }
                        obj = null;
                        aVar = null;
                        if (z5) {
                        }
                    } else {
                        z4 = false;
                        z5 = false;
                        i5 = aVar4.f1292b;
                        if (i16 >= i5) {
                            aVar4.f1292b = i5 - 1;
                        } else {
                            int i17 = aVar4.d;
                            if (i16 < i5 + i17) {
                                aVar4.d = i17 - 1;
                                aVar3.f1291a = 2;
                                aVar3.d = 1;
                                if (aVar4.d == 0) {
                                    arrayList.remove(i8);
                                    aVar4.f1293c = null;
                                    bVar3.c(aVar4);
                                }
                            }
                        }
                        i6 = aVar3.f1292b;
                        i7 = aVar4.f1292b;
                        if (i6 > i7) {
                            aVar4.f1292b = i7 + 1;
                        } else {
                            int i18 = i7 + aVar4.d;
                            if (i6 < i18) {
                                obj = null;
                                a l6 = bVar2.l(null, 2, i6 + 1, i18 - i6);
                                aVar4.d = aVar3.f1292b - aVar4.f1292b;
                                aVar = l6;
                                if (z5) {
                                    arrayList.set(size, aVar4);
                                    arrayList.remove(i8);
                                    aVar3.f1293c = obj;
                                    bVar3.c(aVar3);
                                } else {
                                    if (z4) {
                                        if (aVar != null) {
                                            int i19 = aVar3.f1292b;
                                            if (i19 > aVar.f1292b) {
                                                aVar3.f1292b = i19 - aVar.d;
                                            }
                                            int i20 = aVar3.d;
                                            if (i20 > aVar.f1292b) {
                                                aVar3.d = i20 - aVar.d;
                                            }
                                        }
                                        int i21 = aVar3.f1292b;
                                        if (i21 > aVar4.f1292b) {
                                            aVar3.f1292b = i21 - aVar4.d;
                                        }
                                        int i22 = aVar3.d;
                                        if (i22 > aVar4.f1292b) {
                                            aVar3.d = i22 - aVar4.d;
                                        }
                                    } else {
                                        if (aVar != null) {
                                            int i23 = aVar3.f1292b;
                                            if (i23 >= aVar.f1292b) {
                                                aVar3.f1292b = i23 - aVar.d;
                                            }
                                            int i24 = aVar3.d;
                                            if (i24 >= aVar.f1292b) {
                                                aVar3.d = i24 - aVar.d;
                                            }
                                        }
                                        int i25 = aVar3.f1292b;
                                        if (i25 >= aVar4.f1292b) {
                                            aVar3.f1292b = i25 - aVar4.d;
                                        }
                                        int i26 = aVar3.d;
                                        if (i26 >= aVar4.f1292b) {
                                            aVar3.d = i26 - aVar4.d;
                                        }
                                    }
                                    arrayList.set(size, aVar4);
                                    if (aVar3.f1292b != aVar3.d) {
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
                        if (z5) {
                        }
                    }
                } else if (aVar4.f1292b == i16 + 1 && aVar4.d == i15 - i16) {
                    z4 = true;
                    z5 = true;
                    i5 = aVar4.f1292b;
                    if (i16 >= i5) {
                    }
                    i6 = aVar3.f1292b;
                    i7 = aVar4.f1292b;
                    if (i6 > i7) {
                    }
                    obj = null;
                    aVar = null;
                    if (z5) {
                    }
                } else {
                    z4 = true;
                    z5 = false;
                    i5 = aVar4.f1292b;
                    if (i16 >= i5) {
                    }
                    i6 = aVar3.f1292b;
                    i7 = aVar4.f1292b;
                    if (i6 > i7) {
                    }
                    obj = null;
                    aVar = null;
                    if (z5) {
                    }
                }
            } else if (i9 == 4) {
                int i27 = aVar3.d;
                int i28 = aVar4.f1292b;
                if (i27 < i28) {
                    aVar4.f1292b = i28 - 1;
                } else {
                    int i29 = aVar4.d;
                    if (i27 < i28 + i29) {
                        aVar4.d = i29 - 1;
                        l4 = bVar2.l(aVar4.f1293c, 4, aVar3.f1292b, 1);
                        i = aVar3.f1292b;
                        i4 = aVar4.f1292b;
                        if (i > i4) {
                            aVar4.f1292b = i4 + 1;
                        } else {
                            int i30 = i4 + aVar4.d;
                            if (i < i30) {
                                int i31 = i30 - i;
                                l5 = bVar2.l(aVar4.f1293c, 4, i + 1, i31);
                                aVar4.d -= i31;
                                arrayList.set(i8, aVar3);
                                if (aVar4.d > 0) {
                                    arrayList.set(size, aVar4);
                                } else {
                                    arrayList.remove(size);
                                    aVar4.f1293c = null;
                                    bVar3.c(aVar4);
                                }
                                if (l4 != null) {
                                    arrayList.add(size, l4);
                                }
                                if (l5 != null) {
                                    arrayList.add(size, l5);
                                }
                            }
                        }
                        l5 = null;
                        arrayList.set(i8, aVar3);
                        if (aVar4.d > 0) {
                        }
                        if (l4 != null) {
                        }
                        if (l5 != null) {
                        }
                    }
                }
                l4 = null;
                i = aVar3.f1292b;
                i4 = aVar4.f1292b;
                if (i > i4) {
                }
                l5 = null;
                arrayList.set(i8, aVar3);
                if (aVar4.d > 0) {
                }
                if (l4 != null) {
                }
                if (l5 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        for (int i32 = 0; i32 < size2; i32++) {
            a aVar5 = (a) arrayList.get(i32);
            int i33 = aVar5.f1291a;
            if (i33 == 1) {
                o(aVar5);
            } else if (i33 == 2) {
                int i34 = aVar5.f1292b;
                int i35 = aVar5.d + i34;
                int i36 = i34;
                int i37 = 0;
                char c5 = 65535;
                while (i36 < i35) {
                    if (c0Var.b(i36) != null || b(i36)) {
                        if (c5 == 0) {
                            e(l(null, 2, i34, i37));
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c4 = 1;
                    } else {
                        if (c5 == 1) {
                            o(l(null, 2, i34, i37));
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c4 = 0;
                    }
                    if (z3) {
                        i36 -= i37;
                        i35 -= i37;
                        i37 = 1;
                    } else {
                        i37++;
                    }
                    i36++;
                    c5 = c4;
                }
                if (i37 != aVar5.d) {
                    aVar5.f1293c = null;
                    bVar.c(aVar5);
                    aVar5 = l(null, 2, i34, i37);
                }
                if (c5 == 0) {
                    e(aVar5);
                } else {
                    o(aVar5);
                }
            } else if (i33 == 4) {
                int i38 = aVar5.f1292b;
                int i39 = aVar5.d + i38;
                int i40 = i38;
                int i41 = 0;
                char c6 = 65535;
                while (i38 < i39) {
                    if (c0Var.b(i38) != null || b(i38)) {
                        if (c6 == 0) {
                            e(l(aVar5.f1293c, 4, i40, i41));
                            i40 = i38;
                            i41 = 0;
                        }
                        c6 = 1;
                    } else {
                        if (c6 == 1) {
                            o(l(aVar5.f1293c, 4, i40, i41));
                            i40 = i38;
                            i41 = 0;
                        }
                        c6 = 0;
                    }
                    i41++;
                    i38++;
                }
                if (i41 != aVar5.d) {
                    Object obj2 = aVar5.f1293c;
                    aVar5.f1293c = null;
                    bVar.c(aVar5);
                    aVar5 = l(obj2, 4, i40, i41);
                }
                if (c6 == 0) {
                    e(aVar5);
                } else {
                    o(aVar5);
                }
            } else if (i33 == 8) {
                o(aVar5);
            }
        }
        arrayList.clear();
    }

    public void q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) arrayList.get(i);
            aVar.f1293c = null;
            ((m0.b) this.f1303b).c(aVar);
        }
        arrayList.clear();
    }

    public void r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((t2) this.d) == null) {
                this.d = new t2();
            }
            t2 t2Var = (t2) this.d;
            t2Var.f2462a = colorStateList;
            t2Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void s(ColorStateList colorStateList) {
        if (((t2) this.f1305e) == null) {
            this.f1305e = new t2();
        }
        t2 t2Var = (t2) this.f1305e;
        t2Var.f2462a = colorStateList;
        t2Var.d = true;
        a();
    }

    public void t(PorterDuff.Mode mode) {
        if (((t2) this.f1305e) == null) {
            this.f1305e = new t2();
        }
        t2 t2Var = (t2) this.f1305e;
        t2Var.f2463b = mode;
        t2Var.f2464c = true;
        a();
    }

    public int u(int i, int i4) {
        int i5;
        int i6;
        m0.b bVar = (m0.b) this.f1303b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i7 = aVar.f1291a;
            if (i7 == 8) {
                int i8 = aVar.f1292b;
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
                            aVar.f1292b = i8 + 1;
                            aVar.d = i9 + 1;
                        } else if (i4 == 2) {
                            aVar.f1292b = i8 - 1;
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
                        aVar.f1292b = i8 + 1;
                    } else if (i4 == 2) {
                        aVar.f1292b = i8 - 1;
                    }
                    i--;
                }
            } else {
                int i10 = aVar.f1292b;
                if (i10 <= i) {
                    if (i7 == 1) {
                        i -= aVar.d;
                    } else if (i7 == 2) {
                        i += aVar.d;
                    }
                } else if (i4 == 1) {
                    aVar.f1292b = i10 + 1;
                } else if (i4 == 2) {
                    aVar.f1292b = i10 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.f1291a == 8) {
                int i11 = aVar2.d;
                if (i11 == aVar2.f1292b || i11 < 0) {
                    arrayList.remove(size2);
                    aVar2.f1293c = null;
                    bVar.c(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.f1293c = null;
                bVar.c(aVar2);
            }
        }
        return i;
    }

    public b(c0 c0Var) {
        this.f1303b = new m0.b(30);
        this.f1304c = new ArrayList();
        this.d = new ArrayList();
        this.f1302a = 0;
        this.f1305e = c0Var;
        this.f1306f = new a0.a(12, this);
    }
}
