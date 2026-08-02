package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hq {
    final kee e;
    private final wq f = new wr(30);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int c = 0;
    final brn d = new brn(this, (byte[]) null);

    public hq(kee keeVar) {
        this.e = keeVar;
    }

    private final int l(int i, int i2) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            hp hpVar = (hp) arrayList.get(size);
            int i3 = hpVar.a;
            if (i3 == 8) {
                int i4 = hpVar.b;
                int i5 = hpVar.d;
                int i6 = i4 < i5 ? i5 : i4;
                int i7 = i4 < i5 ? i4 : i5;
                if (i < i7 || i > i6) {
                    if (i < i4) {
                        if (i2 == 1) {
                            hpVar.b = i4 + 1;
                            hpVar.d = i5 + 1;
                        } else if (i2 == 2) {
                            hpVar.b = i4 - 1;
                            hpVar.d = i5 - 1;
                        }
                    }
                } else if (i7 == i4) {
                    if (i2 == 1) {
                        hpVar.d = i5 + 1;
                    } else if (i2 == 2) {
                        hpVar.d = i5 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        hpVar.b = i4 + 1;
                    } else if (i2 == 2) {
                        hpVar.b = i4 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = hpVar.b;
                if (i8 <= i) {
                    if (i3 == 1) {
                        i -= hpVar.d;
                    } else if (i3 == 2) {
                        i += hpVar.d;
                    }
                } else if (i2 == 1) {
                    hpVar.b = i8 + 1;
                } else if (i2 == 2) {
                    hpVar.b = i8 - 1;
                }
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return i;
            }
            hp hpVar2 = (hp) arrayList.get(size2);
            if (hpVar2.a == 8) {
                int i9 = hpVar2.d;
                if (i9 == hpVar2.b || i9 < 0) {
                    arrayList.remove(size2);
                    g(hpVar2);
                }
            } else if (hpVar2.d <= 0) {
                arrayList.remove(size2);
                g(hpVar2);
            }
        }
    }

    private final void m(hp hpVar) {
        int i;
        int i2 = hpVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int l = l(hpVar.b, i2);
        int i3 = hpVar.b;
        int i4 = hpVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                Objects.toString(hpVar);
                throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(hpVar)));
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < hpVar.d; i6++) {
            int l2 = l(hpVar.b + (i * i6), hpVar.a);
            int i7 = hpVar.a;
            if (i7 == 2 ? l2 != l : !(i7 == 4 && l2 == l + 1)) {
                hp b = b(i7, l, i5, hpVar.c);
                e(b, i3);
                g(b);
                if (hpVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                l = l2;
            } else {
                i5++;
            }
        }
        Object obj = hpVar.c;
        g(hpVar);
        if (i5 > 0) {
            hp b2 = b(hpVar.a, l, i5, obj);
            e(b2, i3);
            g(b2);
        }
    }

    private final void n(hp hpVar) {
        this.b.add(hpVar);
        int i = hpVar.a;
        if (i == 1) {
            this.e.y(hpVar.b, hpVar.d);
            return;
        }
        if (i == 2) {
            kee keeVar = this.e;
            int i2 = hpVar.b;
            int i3 = hpVar.d;
            RecyclerView recyclerView = (RecyclerView) keeVar.a;
            recyclerView.N(i2, i3, false);
            recyclerView.N = true;
            return;
        }
        if (i == 4) {
            this.e.x(hpVar.b, hpVar.d, hpVar.c);
        } else if (i == 8) {
            this.e.z(hpVar.b, hpVar.d);
        } else {
            Objects.toString(hpVar);
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(hpVar)));
        }
    }

    private final boolean o(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            hp hpVar = (hp) arrayList.get(i2);
            int i4 = hpVar.a;
            if (i4 == 8) {
                if (a(hpVar.d, i3) == i) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = hpVar.b;
                int i6 = hpVar.d + i5;
                while (i5 < i6) {
                    if (a(i5, i3) == i) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
            i2 = i3;
        }
        return false;
    }

    final int a(int i, int i2) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (i2 < size) {
            hp hpVar = (hp) arrayList.get(i2);
            int i3 = hpVar.a;
            if (i3 == 8) {
                int i4 = hpVar.b;
                if (i4 == i) {
                    i = hpVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (hpVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = hpVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = hpVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += hpVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final hp b(int i, int i2, int i3, Object obj) {
        hp hpVar = (hp) this.f.a();
        if (hpVar == null) {
            return new hp(i, i2, i3, obj);
        }
        hpVar.a = i;
        hpVar.b = i2;
        hpVar.d = i3;
        hpVar.c = obj;
        return hpVar;
    }

    public final void c() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.w((hp) arrayList.get(i));
        }
        h(arrayList);
        this.c = 0;
    }

    public final void d() {
        c();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hp hpVar = (hp) arrayList.get(i);
            int i2 = hpVar.a;
            if (i2 == 1) {
                kee keeVar = this.e;
                keeVar.w(hpVar);
                keeVar.y(hpVar.b, hpVar.d);
            } else if (i2 == 2) {
                kee keeVar2 = this.e;
                keeVar2.w(hpVar);
                keeVar2.A(hpVar.b, hpVar.d);
            } else if (i2 == 4) {
                kee keeVar3 = this.e;
                keeVar3.w(hpVar);
                keeVar3.x(hpVar.b, hpVar.d, hpVar.c);
            } else if (i2 == 8) {
                kee keeVar4 = this.e;
                keeVar4.w(hpVar);
                keeVar4.z(hpVar.b, hpVar.d);
            }
        }
        h(arrayList);
        this.c = 0;
    }

    final void e(hp hpVar, int i) {
        kee keeVar = this.e;
        keeVar.w(hpVar);
        int i2 = hpVar.a;
        if (i2 == 2) {
            keeVar.A(i, hpVar.d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            keeVar.x(i, hpVar.d, hpVar.c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0115 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        ArrayList arrayList;
        int i;
        boolean z;
        char c;
        hp b;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        hp b2;
        while (true) {
            arrayList = this.a;
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((hp) arrayList.get(size)).a != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                } else {
                    z4 = false;
                }
                size--;
            }
            hp hpVar = null;
            if (size == -1) {
                break;
            }
            brn brnVar = this.d;
            int i6 = size + 1;
            hp hpVar2 = (hp) arrayList.get(size);
            hp hpVar3 = (hp) arrayList.get(i6);
            int i7 = hpVar3.a;
            if (i7 == 1) {
                int i8 = hpVar2.d;
                int i9 = hpVar3.b;
                i = i8 >= i9 ? 0 : -1;
                int i10 = hpVar2.b;
                if (i10 < i9) {
                    i++;
                }
                if (i9 <= i10) {
                    hpVar2.b = i10 + hpVar3.d;
                }
                int i11 = hpVar3.b;
                if (i11 <= i8) {
                    hpVar2.d = i8 + hpVar3.d;
                }
                hpVar3.b = i11 + i;
                arrayList.set(size, hpVar3);
                arrayList.set(i6, hpVar2);
            } else if (i7 == 2) {
                int i12 = hpVar2.b;
                int i13 = hpVar2.d;
                if (i12 < i13) {
                    if (hpVar3.b == i12 && hpVar3.d == i13 - i12) {
                        z3 = true;
                        z2 = false;
                        i4 = hpVar3.b;
                        if (i13 >= i4) {
                        }
                        i5 = hpVar2.b;
                        if (i5 > i4) {
                        }
                        b2 = null;
                        if (z3) {
                        }
                    } else {
                        z2 = false;
                        z3 = false;
                        i4 = hpVar3.b;
                        if (i13 >= i4) {
                            i4--;
                            hpVar3.b = i4;
                        } else {
                            int i14 = hpVar3.d;
                            if (i13 < i4 + i14) {
                                hpVar3.d = i14 - 1;
                                hpVar2.a = 2;
                                hpVar2.d = 1;
                                if (hpVar3.d == 0) {
                                    arrayList.remove(i6);
                                    ((hq) brnVar.a).g(hpVar3);
                                }
                            }
                        }
                        i5 = hpVar2.b;
                        if (i5 > i4) {
                            hpVar3.b = i4 + 1;
                        } else {
                            int i15 = i4 + hpVar3.d;
                            if (i5 < i15) {
                                b2 = ((hq) brnVar.a).b(2, i5 + 1, i15 - i5, null);
                                hpVar3.d = hpVar2.b - hpVar3.b;
                                if (z3) {
                                    arrayList.set(size, hpVar3);
                                    arrayList.remove(i6);
                                    ((hq) brnVar.a).g(hpVar2);
                                } else {
                                    if (z2) {
                                        if (b2 != null) {
                                            int i16 = hpVar2.b;
                                            if (i16 > b2.b) {
                                                hpVar2.b = i16 - b2.d;
                                            }
                                            int i17 = hpVar2.d;
                                            if (i17 > b2.b) {
                                                hpVar2.d = i17 - b2.d;
                                            }
                                            hpVar = b2;
                                        }
                                        int i18 = hpVar2.b;
                                        if (i18 > hpVar3.b) {
                                            hpVar2.b = i18 - hpVar3.d;
                                        }
                                        int i19 = hpVar2.d;
                                        if (i19 > hpVar3.b) {
                                            hpVar2.d = i19 - hpVar3.d;
                                        }
                                    } else {
                                        if (b2 != null) {
                                            int i20 = hpVar2.b;
                                            if (i20 >= b2.b) {
                                                hpVar2.b = i20 - b2.d;
                                            }
                                            int i21 = hpVar2.d;
                                            if (i21 >= b2.b) {
                                                hpVar2.d = i21 - b2.d;
                                            }
                                            hpVar = b2;
                                        }
                                        int i22 = hpVar2.b;
                                        if (i22 >= hpVar3.b) {
                                            hpVar2.b = i22 - hpVar3.d;
                                        }
                                        int i23 = hpVar2.d;
                                        if (i23 >= hpVar3.b) {
                                            hpVar2.d = i23 - hpVar3.d;
                                        }
                                    }
                                    arrayList.set(size, hpVar3);
                                    if (hpVar2.b != hpVar2.d) {
                                        arrayList.set(i6, hpVar2);
                                    } else {
                                        arrayList.remove(i6);
                                    }
                                    if (hpVar != null) {
                                        arrayList.add(size, hpVar);
                                    }
                                }
                            }
                        }
                        b2 = null;
                        if (z3) {
                        }
                    }
                } else if (hpVar3.b == i13 + 1 && hpVar3.d == i12 - i13) {
                    z2 = true;
                    z3 = true;
                    i4 = hpVar3.b;
                    if (i13 >= i4) {
                    }
                    i5 = hpVar2.b;
                    if (i5 > i4) {
                    }
                    b2 = null;
                    if (z3) {
                    }
                } else {
                    z2 = true;
                    z3 = false;
                    i4 = hpVar3.b;
                    if (i13 >= i4) {
                    }
                    i5 = hpVar2.b;
                    if (i5 > i4) {
                    }
                    b2 = null;
                    if (z3) {
                    }
                }
            } else if (i7 == 4) {
                int i24 = hpVar2.d;
                int i25 = hpVar3.b;
                if (i24 < i25) {
                    hpVar3.b = i25 - 1;
                } else {
                    int i26 = hpVar3.d;
                    if (i24 < i25 + i26) {
                        hpVar3.d = i26 - 1;
                        b = ((hq) brnVar.a).b(4, hpVar2.b, 1, hpVar3.c);
                        i2 = hpVar2.b;
                        i3 = hpVar3.b;
                        if (i2 > i3) {
                            hpVar3.b = i3 + 1;
                        } else {
                            int i27 = i3 + hpVar3.d;
                            if (i2 < i27) {
                                int i28 = i27 - i2;
                                hpVar = ((hq) brnVar.a).b(4, i2 + 1, i28, hpVar3.c);
                                hpVar3.d -= i28;
                            }
                        }
                        arrayList.set(i6, hpVar2);
                        if (hpVar3.d <= 0) {
                            arrayList.set(size, hpVar3);
                        } else {
                            arrayList.remove(size);
                            ((hq) brnVar.a).g(hpVar3);
                        }
                        if (b != null) {
                            arrayList.add(size, b);
                        }
                        if (hpVar == null) {
                            arrayList.add(size, hpVar);
                        }
                    }
                }
                b = null;
                i2 = hpVar2.b;
                i3 = hpVar3.b;
                if (i2 > i3) {
                }
                arrayList.set(i6, hpVar2);
                if (hpVar3.d <= 0) {
                }
                if (b != null) {
                }
                if (hpVar == null) {
                }
            }
        }
        int size2 = arrayList.size();
        int i29 = 0;
        while (i29 < size2) {
            hp hpVar4 = (hp) arrayList.get(i29);
            int i30 = hpVar4.a;
            if (i30 == 1) {
                n(hpVar4);
            } else if (i30 == 2) {
                int i31 = hpVar4.b;
                int i32 = hpVar4.d + i31;
                int i33 = i31;
                int i34 = 0;
                char c2 = 65535;
                while (i33 < i32) {
                    if (this.e.v(i33) != null || o(i33)) {
                        if (c2 == 0) {
                            m(b(2, i31, i34, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 1;
                    } else {
                        if (c2 == 1) {
                            n(b(2, i31, i34, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 0;
                    }
                    if (z) {
                        i33 -= i34;
                        i32 -= i34;
                        i34 = 1;
                    } else {
                        i34++;
                    }
                    i33++;
                    c2 = c;
                }
                if (i34 != hpVar4.d) {
                    g(hpVar4);
                    hpVar4 = b(2, i31, i34, null);
                }
                if (c2 == 0) {
                    m(hpVar4);
                } else {
                    n(hpVar4);
                }
            } else if (i30 == 4) {
                int i35 = hpVar4.b;
                int i36 = hpVar4.d + i35;
                int i37 = i35;
                int i38 = 0;
                while (i35 < i36) {
                    if (this.e.v(i35) != null || o(i35)) {
                        if (i == 0) {
                            m(b(4, i37, i38, hpVar4.c));
                            i37 = i35;
                            i38 = 0;
                        }
                        i = 1;
                    } else {
                        if (i == 1) {
                            n(b(4, i37, i38, hpVar4.c));
                            i37 = i35;
                            i38 = 0;
                        }
                        i = 0;
                    }
                    i38++;
                    i35++;
                }
                if (i38 != hpVar4.d) {
                    Object obj = hpVar4.c;
                    g(hpVar4);
                    hpVar4 = b(4, i37, i38, obj);
                }
                if (i == 0) {
                    m(hpVar4);
                } else {
                    n(hpVar4);
                }
            } else if (i30 == 8) {
                n(hpVar4);
            }
            i29++;
            i = -1;
        }
        arrayList.clear();
    }

    public final void g(hp hpVar) {
        hpVar.c = null;
        this.f.b(hpVar);
    }

    final void h(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            g((hp) list.get(i));
        }
        list.clear();
    }

    public final void i() {
        h(this.a);
        h(this.b);
        this.c = 0;
    }

    public final boolean j(int i) {
        return (this.c & i) != 0;
    }

    public final boolean k() {
        return this.a.size() > 0;
    }
}
