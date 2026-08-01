package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class l2 {
    public int a;
    public final ArrayList b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;

    public l2(o2 o2Var, tx txVar, vy vyVar) {
        List i;
        txVar.getClass();
        this.c = o2Var;
        this.d = txVar;
        vh vhVar = vh.f;
        this.e = vhVar;
        this.f = vhVar;
        this.b = new ArrayList();
        yo yoVar = o2Var.h;
        yoVar.getClass();
        URI g = yoVar.g();
        if (g.getHost() == null) {
            i = y70.i(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = o2Var.g.select(g);
            i = (select == null || select.isEmpty()) ? y70.i(Proxy.NO_PROXY) : y70.u(select);
        }
        this.e = i;
        this.a = 0;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            k2 k2Var = (k2) arrayList.get(i2);
            int i3 = k2Var.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = k2Var.b;
                    int i5 = k2Var.d + i4;
                    while (i4 < i5) {
                        if (f(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(k2Var.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ez) this.e).a((k2) arrayList.get(i));
        }
        l(arrayList);
        this.a = 0;
    }

    public void c() {
        ez ezVar = (ez) this.e;
        b();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k2 k2Var = (k2) arrayList.get(i);
            int i2 = k2Var.a;
            if (i2 == 1) {
                ezVar.a(k2Var);
                ezVar.d(k2Var.b, k2Var.d);
            } else if (i2 == 2) {
                ezVar.a(k2Var);
                int i3 = k2Var.b;
                int i4 = k2Var.d;
                RecyclerView recyclerView = ezVar.a;
                recyclerView.O(i3, true, i4);
                recyclerView.n0 = true;
                recyclerView.k0.c += i4;
            } else if (i2 == 4) {
                ezVar.a(k2Var);
                ezVar.c(k2Var.b, k2Var.d, k2Var.c);
            } else if (i2 == 8) {
                ezVar.a(k2Var);
                ezVar.e(k2Var.b, k2Var.d);
            }
        }
        l(arrayList);
        this.a = 0;
    }

    public void d(k2 k2Var) {
        int i;
        mx mxVar = (mx) this.c;
        int i2 = k2Var.a;
        if (i2 == 1 || i2 == 8) {
            o8.j("should not dispatch add or move for pre layout");
            return;
        }
        int m = m(k2Var.b, i2);
        int i3 = k2Var.b;
        int i4 = k2Var.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                o8.v(k2Var, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < k2Var.d; i6++) {
            int m2 = m((i * i6) + k2Var.b, k2Var.a);
            int i7 = k2Var.a;
            if (i7 == 2 ? m2 != m : !(i7 == 4 && m2 == m + 1)) {
                k2 i8 = i(k2Var.c, i7, m, i5);
                e(i8, i3);
                i8.c = null;
                mxVar.c(i8);
                if (k2Var.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                m = m2;
            } else {
                i5++;
            }
        }
        Object obj = k2Var.c;
        k2Var.c = null;
        mxVar.c(k2Var);
        if (i5 > 0) {
            k2 i9 = i(obj, k2Var.a, m, i5);
            e(i9, i3);
            i9.c = null;
            mxVar.c(i9);
        }
    }

    public void e(k2 k2Var, int i) {
        ez ezVar = (ez) this.e;
        ezVar.a(k2Var);
        int i2 = k2Var.a;
        if (i2 != 2) {
            if (i2 == 4) {
                ezVar.c(i, k2Var.d, k2Var.c);
                return;
            } else {
                o8.j("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = k2Var.d;
        RecyclerView recyclerView = ezVar.a;
        recyclerView.O(i, true, i3);
        recyclerView.n0 = true;
        recyclerView.k0.c += i3;
    }

    public int f(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            k2 k2Var = (k2) arrayList.get(i2);
            int i3 = k2Var.a;
            int i4 = k2Var.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = k2Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (k2Var.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = k2Var.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += k2Var.d;
            }
            i2++;
        }
        return i;
    }

    public boolean g() {
        return this.a < ((List) this.e).size() || !this.b.isEmpty();
    }

    public boolean h() {
        return this.b.size() > 0;
    }

    public k2 i(Object obj, int i, int i2, int i3) {
        k2 k2Var = (k2) ((mx) this.c).a();
        if (k2Var != null) {
            k2Var.a = i;
            k2Var.b = i2;
            k2Var.d = i3;
            k2Var.c = obj;
            return k2Var;
        }
        k2 k2Var2 = new k2();
        k2Var2.a = i;
        k2Var2.b = i2;
        k2Var2.d = i3;
        k2Var2.c = obj;
        return k2Var2;
    }

    public void j(k2 k2Var) {
        ez ezVar = (ez) this.e;
        ((ArrayList) this.d).add(k2Var);
        int i = k2Var.a;
        if (i == 1) {
            ezVar.d(k2Var.b, k2Var.d);
            return;
        }
        if (i == 2) {
            int i2 = k2Var.b;
            int i3 = k2Var.d;
            RecyclerView recyclerView = ezVar.a;
            recyclerView.O(i2, false, i3);
            recyclerView.n0 = true;
            return;
        }
        if (i == 4) {
            ezVar.c(k2Var.b, k2Var.d, k2Var.c);
        } else if (i == 8) {
            ezVar.e(k2Var.b, k2Var.d);
        } else {
            o8.v(k2Var, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0123 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k() {
        ArrayList arrayList;
        boolean z;
        char c;
        k2 i;
        int i2;
        int i3;
        k2 i4;
        boolean z2;
        boolean z3;
        Object obj;
        k2 k2Var;
        mx mxVar = (mx) this.c;
        ez ezVar = (ez) this.e;
        j1 j1Var = (j1) this.f;
        j1Var.getClass();
        while (true) {
            arrayList = this.b;
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((k2) arrayList.get(size)).a == 8) {
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
            int i5 = size + 1;
            l2 l2Var = (l2) j1Var.g;
            mx mxVar2 = (mx) l2Var.c;
            k2 k2Var2 = (k2) arrayList.get(size);
            k2 k2Var3 = (k2) arrayList.get(i5);
            int i6 = k2Var3.a;
            if (i6 == 1) {
                int i7 = k2Var2.d;
                int i8 = k2Var3.b;
                int i9 = i7 < i8 ? -1 : 0;
                int i10 = k2Var2.b;
                if (i10 < i8) {
                    i9++;
                }
                if (i8 <= i10) {
                    k2Var2.b = i10 + k2Var3.d;
                }
                int i11 = k2Var3.b;
                if (i11 <= i7) {
                    k2Var2.d = i7 + k2Var3.d;
                }
                k2Var3.b = i11 + i9;
                arrayList.set(size, k2Var3);
                arrayList.set(i5, k2Var2);
            } else if (i6 == 2) {
                int i12 = k2Var2.b;
                int i13 = k2Var2.d;
                int i14 = k2Var3.b;
                if (i12 < i13) {
                    if (i14 == i12 && k2Var3.d == i13 - i12) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i14 == i13 + 1 && k2Var3.d == i12 - i13) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i13 < i14) {
                    k2Var3.b = i14 - 1;
                } else {
                    int i15 = k2Var3.d;
                    if (i13 < i14 + i15) {
                        k2Var3.d = i15 - 1;
                        k2Var2.a = 2;
                        k2Var2.d = 1;
                        if (k2Var3.d == 0) {
                            arrayList.remove(i5);
                            k2Var3.c = null;
                            mxVar2.c(k2Var3);
                        }
                    }
                }
                int i16 = k2Var2.b;
                int i17 = k2Var3.b;
                if (i16 <= i17) {
                    k2Var3.b = i17 + 1;
                } else {
                    int i18 = i17 + k2Var3.d;
                    if (i16 < i18) {
                        obj = null;
                        k2 i19 = l2Var.i(null, 2, i16 + 1, i18 - i16);
                        k2Var3.d = k2Var2.b - k2Var3.b;
                        k2Var = i19;
                        if (z3) {
                            if (z2) {
                                if (k2Var != null) {
                                    int i20 = k2Var2.b;
                                    if (i20 > k2Var.b) {
                                        k2Var2.b = i20 - k2Var.d;
                                    }
                                    int i21 = k2Var2.d;
                                    if (i21 > k2Var.b) {
                                        k2Var2.d = i21 - k2Var.d;
                                    }
                                }
                                int i22 = k2Var2.b;
                                if (i22 > k2Var3.b) {
                                    k2Var2.b = i22 - k2Var3.d;
                                }
                                int i23 = k2Var2.d;
                                if (i23 > k2Var3.b) {
                                    k2Var2.d = i23 - k2Var3.d;
                                }
                            } else {
                                if (k2Var != null) {
                                    int i24 = k2Var2.b;
                                    if (i24 >= k2Var.b) {
                                        k2Var2.b = i24 - k2Var.d;
                                    }
                                    int i25 = k2Var2.d;
                                    if (i25 >= k2Var.b) {
                                        k2Var2.d = i25 - k2Var.d;
                                    }
                                }
                                int i26 = k2Var2.b;
                                if (i26 >= k2Var3.b) {
                                    k2Var2.b = i26 - k2Var3.d;
                                }
                                int i27 = k2Var2.d;
                                if (i27 >= k2Var3.b) {
                                    k2Var2.d = i27 - k2Var3.d;
                                }
                            }
                            arrayList.set(size, k2Var3);
                            if (k2Var2.b != k2Var2.d) {
                                arrayList.set(i5, k2Var2);
                            } else {
                                arrayList.remove(i5);
                            }
                            if (k2Var != null) {
                                arrayList.add(size, k2Var);
                            }
                        } else {
                            arrayList.set(size, k2Var3);
                            arrayList.remove(i5);
                            k2Var2.c = obj;
                            mxVar2.c(k2Var2);
                        }
                    }
                }
                obj = null;
                k2Var = null;
                if (z3) {
                }
            } else if (i6 == 4) {
                int i28 = k2Var2.d;
                int i29 = k2Var3.b;
                if (i28 < i29) {
                    k2Var3.b = i29 - 1;
                } else {
                    int i30 = k2Var3.d;
                    if (i28 < i29 + i30) {
                        k2Var3.d = i30 - 1;
                        i = l2Var.i(k2Var3.c, 4, k2Var2.b, 1);
                        i2 = k2Var2.b;
                        i3 = k2Var3.b;
                        if (i2 > i3) {
                            k2Var3.b = i3 + 1;
                        } else {
                            int i31 = i3 + k2Var3.d;
                            if (i2 < i31) {
                                int i32 = i31 - i2;
                                i4 = l2Var.i(k2Var3.c, 4, i2 + 1, i32);
                                k2Var3.d -= i32;
                                arrayList.set(i5, k2Var2);
                                if (k2Var3.d > 0) {
                                    arrayList.set(size, k2Var3);
                                } else {
                                    arrayList.remove(size);
                                    k2Var3.c = null;
                                    mxVar2.c(k2Var3);
                                }
                                if (i != null) {
                                    arrayList.add(size, i);
                                }
                                if (i4 != null) {
                                    arrayList.add(size, i4);
                                }
                            }
                        }
                        i4 = null;
                        arrayList.set(i5, k2Var2);
                        if (k2Var3.d > 0) {
                        }
                        if (i != null) {
                        }
                        if (i4 != null) {
                        }
                    }
                }
                i = null;
                i2 = k2Var2.b;
                i3 = k2Var3.b;
                if (i2 > i3) {
                }
                i4 = null;
                arrayList.set(i5, k2Var2);
                if (k2Var3.d > 0) {
                }
                if (i != null) {
                }
                if (i4 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        for (int i33 = 0; i33 < size2; i33++) {
            k2 k2Var4 = (k2) arrayList.get(i33);
            int i34 = k2Var4.a;
            if (i34 == 1) {
                j(k2Var4);
            } else if (i34 == 2) {
                int i35 = k2Var4.b;
                int i36 = k2Var4.d + i35;
                int i37 = i35;
                int i38 = 0;
                char c2 = 65535;
                while (i37 < i36) {
                    if (ezVar.b(i37) != null || a(i37)) {
                        if (c2 == 0) {
                            d(i(null, 2, i35, i38));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 1;
                    } else {
                        if (c2 == 1) {
                            j(i(null, 2, i35, i38));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 0;
                    }
                    if (z) {
                        i37 -= i38;
                        i36 -= i38;
                        i38 = 1;
                    } else {
                        i38++;
                    }
                    i37++;
                    c2 = c;
                }
                if (i38 != k2Var4.d) {
                    k2Var4.c = null;
                    mxVar.c(k2Var4);
                    k2Var4 = i(null, 2, i35, i38);
                }
                if (c2 == 0) {
                    d(k2Var4);
                } else {
                    j(k2Var4);
                }
            } else if (i34 == 4) {
                int i39 = k2Var4.b;
                int i40 = k2Var4.d + i39;
                int i41 = i39;
                int i42 = 0;
                char c3 = 65535;
                while (i39 < i40) {
                    if (ezVar.b(i39) != null || a(i39)) {
                        if (c3 == 0) {
                            d(i(k2Var4.c, 4, i41, i42));
                            i41 = i39;
                            i42 = 0;
                        }
                        c3 = 1;
                    } else {
                        if (c3 == 1) {
                            j(i(k2Var4.c, 4, i41, i42));
                            i41 = i39;
                            i42 = 0;
                        }
                        c3 = 0;
                    }
                    i42++;
                    i39++;
                }
                if (i42 != k2Var4.d) {
                    Object obj2 = k2Var4.c;
                    k2Var4.c = null;
                    mxVar.c(k2Var4);
                    k2Var4 = i(obj2, 4, i41, i42);
                }
                if (c3 == 0) {
                    d(k2Var4);
                } else {
                    j(k2Var4);
                }
            } else if (i34 == 8) {
                j(k2Var4);
            }
        }
        arrayList.clear();
    }

    public void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k2 k2Var = (k2) arrayList.get(i);
            k2Var.c = null;
            ((mx) this.c).c(k2Var);
        }
        arrayList.clear();
    }

    public int m(int i, int i2) {
        int i3;
        int i4;
        mx mxVar = (mx) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k2 k2Var = (k2) arrayList.get(size);
            int i5 = k2Var.a;
            int i6 = k2Var.b;
            if (i5 == 8) {
                int i7 = k2Var.d;
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
                            k2Var.b = i6 + 1;
                            k2Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            k2Var.b = i6 - 1;
                            k2Var.d = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        k2Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        k2Var.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        k2Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        k2Var.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= k2Var.d;
                } else if (i5 == 2) {
                    i += k2Var.d;
                }
            } else if (i2 == 1) {
                k2Var.b = i6 + 1;
            } else if (i2 == 2) {
                k2Var.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            k2 k2Var2 = (k2) arrayList.get(size2);
            int i8 = k2Var2.a;
            int i9 = k2Var2.d;
            if (i8 == 8) {
                if (i9 == k2Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    k2Var2.c = null;
                    mxVar.c(k2Var2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                k2Var2.c = null;
                mxVar.c(k2Var2);
            }
        }
        return i;
    }

    public l2(ez ezVar) {
        this.c = new mx(30);
        this.b = new ArrayList();
        this.d = new ArrayList();
        this.a = 0;
        this.e = ezVar;
        this.f = new j1(29, this);
    }
}
