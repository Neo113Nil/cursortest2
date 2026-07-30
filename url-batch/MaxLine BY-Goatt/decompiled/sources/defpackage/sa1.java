package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sa1 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Object g;
    public final Object h;
    public Object i;

    public sa1(da1 da1Var) {
        this.g = da1Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qa1(0, 0));
        this.a = arrayList;
        this.e = -1;
        this.h = new ArrayList();
        this.i = ah0.m;
    }

    public static sa1 a(sa1 sa1Var, int i, du duVar, fy fyVar, int i2) {
        if ((i2 & 1) != 0) {
            i = sa1Var.b;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            duVar = (du) sa1Var.h;
        }
        du duVar2 = duVar;
        if ((i2 & 4) != 0) {
            fyVar = (fy) sa1Var.i;
        }
        fy fyVar2 = fyVar;
        int i4 = sa1Var.c;
        int i5 = sa1Var.d;
        int i6 = sa1Var.e;
        fyVar2.getClass();
        return new sa1((t62) sa1Var.g, sa1Var.a, i3, duVar2, fyVar2, i4, i5, i6);
    }

    public int b() {
        return ((int) Math.sqrt((e() * 1.0d) / this.f)) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        if (r9 < r8) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lq0 c(int i) {
        int i2;
        int i3;
        int i4;
        List list;
        ArrayList arrayList = (ArrayList) this.h;
        boolean z = true;
        if (!((da1) this.g).r) {
            int i5 = this.f;
            int i6 = i * i5;
            int e = e() - i6;
            if (i5 > e) {
                i5 = e;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            if (i5 == ((List) this.i).size()) {
                list = (List) this.i;
            } else {
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i7 = 0; i7 < i5; i7++) {
                    arrayList2.add(new mw0(yj1.d(1)));
                }
                this.i = arrayList2;
                list = arrayList2;
            }
            return new lq0(i6, list);
        }
        int b = i / b();
        ArrayList arrayList3 = this.a;
        int min = Math.min(b, arrayList3.size() - 1);
        int b2 = b() * min;
        int i8 = ((qa1) arrayList3.get(min)).a;
        int i9 = ((qa1) arrayList3.get(min)).b;
        int i10 = this.b;
        if (b2 <= i10 && i10 <= i) {
            i8 = this.c;
            i9 = this.d;
            b2 = i10;
        } else if (min == this.e && (i2 = i - b2) < arrayList.size()) {
            i8 = ((Number) arrayList.get(i2)).intValue();
            b2 = i;
            i9 = 0;
        }
        if (b2 % b() == 0) {
            int b3 = b();
            int i11 = i - b2;
            if (2 <= i11) {
            }
        }
        z = false;
        if (z) {
            this.e = min;
            arrayList.clear();
        }
        if (b2 > i) {
            lh.g("currentLine > lineIndex");
            return null;
        }
        while (b2 < i && i8 < e()) {
            if (z) {
                arrayList.add(Integer.valueOf(i8));
            }
            int i12 = 0;
            while (i12 < this.f && i8 < e()) {
                if (i9 == 0) {
                    i4 = i9;
                    i9 = g(i8);
                } else {
                    i4 = 0;
                }
                i12 += i9;
                if (i12 > this.f) {
                    break;
                }
                i8++;
                i9 = i4;
            }
            b2++;
            if (b2 % b() == 0 && i8 < e()) {
                if (arrayList3.size() != b2 / b()) {
                    lh.g("invalid starting point");
                    return null;
                }
                arrayList3.add(new qa1(i8, i9));
            }
        }
        this.b = i;
        this.c = i8;
        this.d = i9;
        ArrayList arrayList4 = new ArrayList();
        int i13 = 0;
        int i14 = i8;
        while (i13 < this.f && i14 < e()) {
            if (i9 == 0) {
                int i15 = i9;
                i9 = g(i14);
                i3 = i15;
            } else {
                i3 = 0;
            }
            i13 += i9;
            if (i13 > this.f) {
                break;
            }
            i14++;
            arrayList4.add(new mw0(yj1.d(i9)));
            i9 = i3;
        }
        return new lq0(i8, arrayList4);
    }

    public int d(int i) {
        int i2;
        if (e() <= 0) {
            return 0;
        }
        if (i >= e()) {
            lh.e("ItemIndex > total count");
            return 0;
        }
        if (!((da1) this.g).r) {
            return i / this.f;
        }
        p7 p7Var = new p7(i, 3);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        qv.j(arrayList.size(), size);
        int i3 = size - 1;
        int i4 = 0;
        while (true) {
            if (i4 > i3) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + i3) >>> 1;
            int intValue = ((Number) p7Var.invoke(arrayList.get(i2))).intValue();
            if (intValue >= 0) {
                if (intValue <= 0) {
                    break;
                }
                i3 = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 < 0) {
            i2 = (-i2) - 2;
        }
        int b = b() * i2;
        int i5 = ((qa1) arrayList.get(i2)).a;
        if (i5 > i) {
            lh.e("currentItemIndex > itemIndex");
            return 0;
        }
        int i6 = 0;
        while (i5 < i) {
            int i7 = i5 + 1;
            int g = g(i5);
            i6 += g;
            int i8 = this.f;
            if (i6 >= i8) {
                if (i6 == i8) {
                    b++;
                    i6 = 0;
                } else {
                    b++;
                    i6 = g;
                }
            }
            if (b % b() == 0 && b / b() >= arrayList.size()) {
                arrayList.add(new qa1(i7 - (i6 > 0 ? 1 : 0), 0));
            }
            i5 = i7;
        }
        return g(i) + i6 > this.f ? b + 1 : b;
    }

    public int e() {
        return ((da1) this.g).q.n;
    }

    public w92 f(fy fyVar) {
        du duVar = (du) this.h;
        fyVar.getClass();
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i >= arrayList.size()) {
            lh.g("Check failed.");
            return null;
        }
        this.f++;
        if (duVar != null) {
            zi0 zi0Var = (zi0) duVar.c;
            kz0 kz0Var = (kz0) fyVar.n;
            zi0Var.getClass();
            kz0Var.getClass();
            kz0 kz0Var2 = zi0Var.b.h;
            if (kz0Var.e != kz0Var2.e || !Intrinsics.b(kz0Var.d, kz0Var2.d)) {
                ey.f(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.f != 1) {
                ey.f(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        sa1 a = a(this, i2, null, fyVar, 58);
        d41 d41Var = (d41) arrayList.get(i);
        w92 a2 = d41Var.a(a);
        if (a2 == null) {
            throw new NullPointerException("interceptor " + d41Var + " returned null");
        }
        if (duVar != null && i2 < arrayList.size() && a.f != 1) {
            ey.f(d41Var, " must call proceed() exactly once", "network interceptor ");
            return null;
        }
        if (a2.s != null) {
            return a2;
        }
        ey.f(d41Var, " returned a response with no body", "interceptor ");
        return null;
    }

    public int g(int i) {
        ra1.b = this.f;
        g41 f = ((da1) this.g).q.f(i);
        int i2 = i - f.a;
        return (int) ((mw0) ((ba1) f.c).b.invoke(ra1.a, Integer.valueOf(i2))).a;
    }

    public sa1(t62 t62Var, ArrayList arrayList, int i, du duVar, fy fyVar, int i2, int i3, int i4) {
        fyVar.getClass();
        this.g = t62Var;
        this.a = arrayList;
        this.b = i;
        this.h = duVar;
        this.i = fyVar;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
