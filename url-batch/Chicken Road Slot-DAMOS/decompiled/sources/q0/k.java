package q0;

import c2.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.l0;
import n0.n1;
import s.d0;
import s.v;
import s.w;
import s.x;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final h f7760a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f7761b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f7762c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f7763d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f7764e;

    /* renamed from: f, reason: collision with root package name */
    public w f7765f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f7766h;

    /* renamed from: i, reason: collision with root package name */
    public int f7767i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f7768k;

    /* renamed from: l, reason: collision with root package name */
    public int f7769l;

    /* renamed from: m, reason: collision with root package name */
    public int f7770m;

    /* renamed from: n, reason: collision with root package name */
    public int f7771n;

    /* renamed from: o, reason: collision with root package name */
    public int f7772o;

    /* renamed from: p, reason: collision with root package name */
    public final r f7773p;

    /* renamed from: q, reason: collision with root package name */
    public final r f7774q;

    /* renamed from: r, reason: collision with root package name */
    public final r f7775r;

    /* renamed from: s, reason: collision with root package name */
    public w f7776s;

    /* renamed from: t, reason: collision with root package name */
    public int f7777t;

    /* renamed from: u, reason: collision with root package name */
    public int f7778u;

    /* renamed from: v, reason: collision with root package name */
    public int f7779v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7780w;

    /* renamed from: x, reason: collision with root package name */
    public v f7781x;

    public k(h hVar) {
        this.f7760a = hVar;
        int[] iArr = hVar.f7746d;
        this.f7761b = iArr;
        Object[] objArr = hVar.f7748i;
        this.f7762c = objArr;
        this.f7763d = hVar.f7754w;
        this.f7764e = hVar.f7755x;
        this.f7765f = hVar.f7756y;
        int i3 = hVar.f7747e;
        this.g = i3;
        this.f7766h = (iArr.length / 5) - i3;
        int i10 = hVar.f7749r;
        this.f7768k = i10;
        this.f7769l = objArr.length - i10;
        this.f7770m = i3;
        this.f7773p = new r();
        this.f7774q = new r();
        this.f7775r = new r();
        this.f7778u = i3;
        this.f7779v = -1;
    }

    public static int i(int i3, int i10, int i11, int i12) {
        return i3 > i10 ? -(((i12 - i11) - i3) + 1) : i3;
    }

    public static void z(k kVar) {
        int i3 = kVar.f7779v;
        int r9 = kVar.r(i3);
        int[] iArr = kVar.f7761b;
        int i10 = (r9 * 5) + 1;
        int i11 = iArr[i10];
        if ((i11 & 134217728) != 0) {
            return;
        }
        int i12 = (i11 & (-134217729)) | 134217728;
        iArr[i10] = i12;
        if ((67108864 & i12) != 0) {
            return;
        }
        kVar.T(kVar.E(iArr, i3));
    }

    public final void A(h hVar, int i3) {
        if (this.f7771n <= 0) {
            n0.m.a("Check failed");
        }
        if (i3 == 0 && this.f7777t == 0 && this.f7760a.f7747e == 0) {
            int[] iArr = hVar.f7746d;
            int i10 = iArr[(i3 * 5) + 3];
            int i11 = hVar.f7747e;
            if (i10 == i11) {
                int[] iArr2 = this.f7761b;
                Object[] objArr = this.f7762c;
                ArrayList arrayList = this.f7763d;
                HashMap hashMap = this.f7764e;
                w wVar = this.f7765f;
                Object[] objArr2 = hVar.f7748i;
                int i12 = hVar.f7749r;
                HashMap hashMap2 = hVar.f7755x;
                w wVar2 = hVar.f7756y;
                this.f7761b = iArr;
                this.f7762c = objArr2;
                this.f7763d = hVar.f7754w;
                this.g = i11;
                this.f7766h = (iArr.length / 5) - i11;
                this.f7768k = i12;
                this.f7769l = objArr2.length - i12;
                this.f7770m = i11;
                this.f7764e = hashMap2;
                this.f7765f = wVar2;
                hVar.f7746d = iArr2;
                hVar.f7747e = 0;
                hVar.f7748i = objArr;
                hVar.f7749r = 0;
                hVar.f7754w = arrayList;
                hVar.f7755x = hashMap;
                hVar.f7756y = wVar;
                return;
            }
        }
        k f3 = hVar.f();
        try {
            z4.w.F(f3, i3, this, true, true, false);
            f3.e(true);
        } catch (Throwable th) {
            f3.e(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.f7761b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        kotlin.collections.v.c(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        kotlin.collections.v.c(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i3) {
        b bVar;
        int i10;
        b bVar2;
        int i11;
        int i12;
        int i13 = this.f7766h;
        int i14 = this.g;
        if (i14 != i3) {
            if (!this.f7763d.isEmpty()) {
                int o6 = o() - this.f7766h;
                ArrayList arrayList = this.f7763d;
                if (i14 < i3) {
                    for (int a9 = j.a(arrayList, i14, o6); a9 < this.f7763d.size() && (i11 = (bVar2 = (b) this.f7763d.get(a9)).f7722a) < 0 && (i12 = i11 + o6) < i3; a9++) {
                        bVar2.f7722a = i12;
                    }
                } else {
                    for (int a10 = j.a(arrayList, i3, o6); a10 < this.f7763d.size() && (i10 = (bVar = (b) this.f7763d.get(a10)).f7722a) >= 0; a10++) {
                        bVar.f7722a = -(o6 - i10);
                    }
                }
            }
            if (i3 < i14) {
                i14 = i3 + i13;
            }
            int o10 = o();
            if (i14 >= o10) {
                n0.m.a("Check failed");
            }
            while (i14 < o10) {
                int i15 = (i14 * 5) + 2;
                int i16 = this.f7761b[i15];
                int p4 = i16 > -2 ? i16 : (p() + i16) - (-2);
                if (p4 >= i3) {
                    p4 = -((p() - p4) - (-2));
                }
                if (p4 != i16) {
                    this.f7761b[i15] = p4;
                }
                i14++;
                if (i14 == i3) {
                    i14 += i13;
                }
            }
        }
        this.g = i3;
    }

    public final void C(int i3, int i10) {
        int i11 = this.f7769l;
        int i12 = this.f7768k;
        int i13 = this.f7770m;
        if (i12 != i3) {
            Object[] objArr = this.f7762c;
            if (i3 < i12) {
                System.arraycopy(objArr, i3, objArr, i3 + i11, i12 - i3);
            } else {
                int i14 = i12 + i11;
                System.arraycopy(objArr, i14, objArr, i12, (i3 + i11) - i14);
            }
        }
        int min = Math.min(i10 + 1, p());
        if (i13 != min) {
            int length = this.f7762c.length - i11;
            if (min < i13) {
                int r9 = r(min);
                int r10 = r(i13);
                int i15 = this.g;
                while (r9 < r10) {
                    int i16 = (r9 * 5) + 4;
                    int i17 = this.f7761b[i16];
                    if (i17 < 0) {
                        n0.m.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f7761b[i16] = -((length - i17) + 1);
                    r9++;
                    if (r9 == i15) {
                        r9 += this.f7766h;
                    }
                }
            } else {
                int r11 = r(i13);
                int r12 = r(min);
                while (r11 < r12) {
                    int i18 = (r11 * 5) + 4;
                    int i19 = this.f7761b[i18];
                    if (i19 >= 0) {
                        n0.m.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f7761b[i18] = i19 + length + 1;
                    r11++;
                    if (r11 == this.g) {
                        r11 += this.f7766h;
                    }
                }
            }
            this.f7770m = min;
        }
        this.f7768k = i3;
    }

    public final Object D(int i3) {
        int r9 = r(i3);
        int[] iArr = this.f7761b;
        if ((iArr[(r9 * 5) + 1] & 1073741824) != 0) {
            return this.f7762c[h(g(iArr, r9))];
        }
        return null;
    }

    public final int E(int[] iArr, int i3) {
        int i10 = iArr[(r(i3) * 5) + 2];
        return i10 > -2 ? i10 : (p() + i10) - (-2);
    }

    public final Object F(Object obj) {
        if (this.f7771n > 0) {
            x(1, this.f7779v);
        }
        Object[] objArr = this.f7762c;
        int i3 = this.f7767i;
        this.f7767i = i3 + 1;
        Object obj2 = objArr[h(i3)];
        if (this.f7767i > this.j) {
            n0.m.a("Writing to an invalid slot");
        }
        this.f7762c[h(this.f7767i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i3;
        v vVar = this.f7781x;
        if (vVar != null) {
            while (vVar.f8390b != 0) {
                int T = k7.e.T(vVar);
                int r9 = r(T);
                int i10 = T + 1;
                int u2 = u(T) + T;
                while (true) {
                    if (i10 >= u2) {
                        i3 = 0;
                        break;
                    } else {
                        if ((this.f7761b[(r(i10) * 5) + 1] & 201326592) != 0) {
                            i3 = 1;
                            break;
                        }
                        i10 += u(i10);
                    }
                }
                int[] iArr = this.f7761b;
                int i11 = (r9 * 5) + 1;
                int i12 = iArr[i11];
                if (((67108864 & i12) != 0 ? 1 : 0) != i3) {
                    iArr[i11] = (i3 << 26) | ((-67108865) & i12);
                    int E = E(iArr, T);
                    if (E >= 0) {
                        k7.e.e(vVar, E);
                    }
                }
            }
        }
    }

    public final boolean H() {
        if (this.f7771n != 0) {
            n0.m.a("Cannot remove group while inserting");
        }
        int i3 = this.f7777t;
        int i10 = this.f7767i;
        int g = g(this.f7761b, r(i3));
        int L = L();
        O(this.f7779v);
        v vVar = this.f7781x;
        if (vVar != null) {
            while (true) {
                int i11 = vVar.f8390b;
                if (i11 == 0) {
                    break;
                }
                if (i11 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                if (vVar.f8389a[0] < i3) {
                    break;
                }
                k7.e.T(vVar);
            }
        }
        boolean I = I(i3, this.f7777t - i3);
        J(g, this.f7767i - g, i3 - 1);
        this.f7777t = i3;
        this.f7767i = i10;
        this.f7772o -= L;
        return I;
    }

    public final boolean I(int i3, int i10) {
        if (i10 > 0) {
            ArrayList arrayList = this.f7763d;
            B(i3);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f7764e;
                int i11 = i3 + i10;
                int a9 = j.a(this.f7763d, i11, o() - this.f7766h);
                if (a9 >= this.f7763d.size()) {
                    a9--;
                }
                int i12 = a9 + 1;
                int i13 = 0;
                while (a9 >= 0) {
                    b bVar = (b) this.f7763d.get(a9);
                    int c10 = c(bVar);
                    if (c10 < i3) {
                        break;
                    }
                    if (c10 < i11) {
                        bVar.f7722a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i13 == 0) {
                            i13 = a9 + 1;
                        }
                        i12 = a9;
                    }
                    a9--;
                }
                r0 = i12 < i13;
                if (r0) {
                    this.f7763d.subList(i12, i13).clear();
                }
            }
            this.g = i3;
            this.f7766h += i10;
            int i14 = this.f7770m;
            if (i14 > i3) {
                this.f7770m = Math.max(i3, i14 - i10);
            }
            int i15 = this.f7778u;
            if (i15 >= this.g) {
                this.f7778u = i15 - i10;
            }
            int i16 = this.f7779v;
            if (i16 >= 0 && (this.f7761b[(r(i16) * 5) + 1] & 67108864) != 0) {
                T(i16);
            }
        }
        return r0;
    }

    public final void J(int i3, int i10, int i11) {
        if (i10 > 0) {
            int i12 = this.f7769l;
            int i13 = i3 + i10;
            C(i13, i11);
            this.f7768k = i3;
            this.f7769l = i12 + i10;
            Arrays.fill(this.f7762c, i3, i13, (Object) null);
            int i14 = this.j;
            if (i14 >= i3) {
                this.j = i14 - i10;
            }
        }
    }

    public final Object K(int i3, int i10, Object obj) {
        int N = N(this.f7761b, r(i3));
        int g = g(this.f7761b, r(i3 + 1));
        int i11 = N + i10;
        if (i11 < N || i11 >= g) {
            n0.m.a("Write to an invalid slot index " + i10 + " for group " + i3);
        }
        int h10 = h(i11);
        Object[] objArr = this.f7762c;
        Object obj2 = objArr[h10];
        objArr[h10] = obj;
        return obj2;
    }

    public final int L() {
        int r9 = r(this.f7777t);
        int i3 = this.f7777t;
        int[] iArr = this.f7761b;
        int i10 = r9 * 5;
        int i11 = iArr[i10 + 3] + i3;
        this.f7777t = i11;
        this.f7767i = g(iArr, r(i11));
        int i12 = this.f7761b[i10 + 1];
        if ((1073741824 & i12) != 0) {
            return 1;
        }
        return i12 & 67108863;
    }

    public final void M() {
        int i3 = this.f7778u;
        this.f7777t = i3;
        this.f7767i = g(this.f7761b, r(i3));
    }

    public final int N(int[] iArr, int i3) {
        if (i3 >= o()) {
            return this.f7762c.length - this.f7769l;
        }
        int b10 = j.b(iArr, i3);
        return b10 < 0 ? (this.f7762c.length - this.f7769l) + b10 + 1 : b10;
    }

    public final c O(int i3) {
        b R;
        HashMap hashMap = this.f7764e;
        if (hashMap == null || (R = R(i3)) == null) {
            return null;
        }
        return (c) hashMap.get(R);
    }

    public final void P() {
        if (this.f7771n != 0) {
            n0.m.a("Key must be supplied when inserting");
        }
        n0.e eVar = n0.k.f6729a;
        Q(0, eVar, eVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(int i3, Object obj, Object obj2, boolean z10) {
        int i10;
        int i11 = this.f7779v;
        Object[] objArr = this.f7771n > 0;
        this.f7775r.c(this.f7772o);
        n0.e eVar = n0.k.f6729a;
        if (objArr == true) {
            int i12 = this.f7777t;
            int g = g(this.f7761b, r(i12));
            w(1);
            this.f7767i = g;
            this.j = g;
            int r9 = r(i12);
            int i13 = obj != eVar ? 1 : 0;
            int i14 = (z10 || obj2 == eVar) ? 0 : 1;
            int i15 = i(g, this.f7768k, this.f7769l, this.f7762c.length);
            if (i15 >= 0 && this.f7770m < i12) {
                i15 = -(((this.f7762c.length - this.f7769l) - i15) + 1);
            }
            int[] iArr = this.f7761b;
            int i16 = this.f7779v;
            int i17 = r9 * 5;
            iArr[i17] = i3;
            iArr[i17 + 1] = ((z10 ? 1 : 0) << 30) | (i13 << 29) | (i14 << 28);
            iArr[i17 + 2] = i16;
            iArr[i17 + 3] = 0;
            iArr[i17 + 4] = i15;
            int i18 = (z10 ? 1 : 0) + i13 + i14;
            if (i18 > 0) {
                x(i18, i12);
                Object[] objArr2 = this.f7762c;
                int i19 = this.f7767i;
                if (z10) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                if (i13 != 0) {
                    objArr2[i19] = obj;
                    i19++;
                }
                if (i14 != 0) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                this.f7767i = i19;
            }
            this.f7772o = 0;
            i10 = i12 + 1;
            this.f7779v = i12;
            this.f7777t = i10;
            if (i11 >= 0) {
                O(i11);
            }
        } else {
            this.f7773p.c(i11);
            this.f7774q.c((o() - this.f7766h) - this.f7778u);
            int i20 = this.f7777t;
            int r10 = r(i20);
            if (!Intrinsics.a(obj2, eVar)) {
                if (z10) {
                    U(this.f7777t, obj2);
                } else {
                    S(obj2);
                }
            }
            this.f7767i = N(this.f7761b, r10);
            this.j = g(this.f7761b, r(this.f7777t + 1));
            int[] iArr2 = this.f7761b;
            int i21 = r10 * 5;
            this.f7772o = iArr2[i21 + 1] & 67108863;
            this.f7779v = i20;
            this.f7777t = i20 + 1;
            i10 = i20 + iArr2[i21 + 3];
        }
        this.f7778u = i10;
    }

    public final b R(int i3) {
        ArrayList arrayList;
        int e2;
        if (i3 < 0 || i3 >= p() || (e2 = j.e((arrayList = this.f7763d), i3, p())) < 0) {
            return null;
        }
        return (b) arrayList.get(e2);
    }

    public final void S(Object obj) {
        int r9 = r(this.f7777t);
        int i3 = (r9 * 5) + 1;
        if ((this.f7761b[i3] & 268435456) == 0) {
            n0.m.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f7762c;
        int[] iArr = this.f7761b;
        objArr[h(Integer.bitCount(iArr[i3] >> 29) + g(iArr, r9))] = obj;
    }

    public final void T(int i3) {
        if (i3 >= 0) {
            v vVar = this.f7781x;
            if (vVar == null) {
                vVar = new v();
                this.f7781x = vVar;
            }
            k7.e.e(vVar, i3);
        }
    }

    public final void U(int i3, Object obj) {
        int r9 = r(i3);
        int[] iArr = this.f7761b;
        if (r9 >= iArr.length || (iArr[(r9 * 5) + 1] & 1073741824) == 0) {
            n0.m.a("Updating the node of a group at " + i3 + " that was not created with as a node group");
        }
        this.f7762c[h(g(this.f7761b, r9))] = obj;
    }

    public final void a(int i3) {
        if (i3 < 0) {
            n0.m.a("Cannot seek backwards");
        }
        if (this.f7771n > 0) {
            n1.b("Cannot call seek() while inserting");
        }
        if (i3 == 0) {
            return;
        }
        int i10 = this.f7777t + i3;
        if (i10 < this.f7779v || i10 > this.f7778u) {
            n0.m.a("Cannot seek outside the current group (" + this.f7779v + '-' + this.f7778u + ')');
        }
        this.f7777t = i10;
        int g = g(this.f7761b, r(i10));
        this.f7767i = g;
        this.j = g;
    }

    public final b b(int i3) {
        ArrayList arrayList = this.f7763d;
        int e2 = j.e(arrayList, i3, p());
        if (e2 >= 0) {
            return (b) arrayList.get(e2);
        }
        if (i3 > this.g) {
            i3 = -(p() - i3);
        }
        b bVar = new b(i3);
        arrayList.add(-(e2 + 1), bVar);
        return bVar;
    }

    public final int c(b bVar) {
        int i3 = bVar.f7722a;
        return i3 < 0 ? p() + i3 : i3;
    }

    public final void d() {
        int i3 = this.f7771n;
        this.f7771n = i3 + 1;
        if (i3 == 0) {
            this.f7774q.c((o() - this.f7766h) - this.f7778u);
        }
    }

    public final void e(boolean z10) {
        this.f7780w = true;
        if (z10 && this.f7773p.f1653b == 0) {
            B(p());
            C(this.f7762c.length - this.f7769l, this.g);
            int i3 = this.f7768k;
            Arrays.fill(this.f7762c, i3, this.f7769l + i3, (Object) null);
            G();
        }
        int[] iArr = this.f7761b;
        int i10 = this.g;
        Object[] objArr = this.f7762c;
        int i11 = this.f7768k;
        ArrayList arrayList = this.f7763d;
        HashMap hashMap = this.f7764e;
        w wVar = this.f7765f;
        h hVar = this.f7760a;
        if (!hVar.f7752u) {
            n1.a("Unexpected writer close()");
        }
        hVar.f7752u = false;
        hVar.f7746d = iArr;
        hVar.f7747e = i10;
        hVar.f7748i = objArr;
        hVar.f7749r = i11;
        hVar.f7754w = arrayList;
        hVar.f7755x = hashMap;
        hVar.f7756y = wVar;
    }

    public final int f(int i3) {
        return g(this.f7761b, r(i3));
    }

    public final int g(int[] iArr, int i3) {
        if (i3 >= o()) {
            return this.f7762c.length - this.f7769l;
        }
        int i10 = iArr[(i3 * 5) + 4];
        return i10 < 0 ? (this.f7762c.length - this.f7769l) + i10 + 1 : i10;
    }

    public final int h(int i3) {
        return (this.f7769l * (i3 < this.f7768k ? 0 : 1)) + i3;
    }

    public final void j() {
        d0 d0Var;
        boolean z10 = this.f7771n > 0;
        int i3 = this.f7777t;
        int i10 = this.f7778u;
        int i11 = this.f7779v;
        int r9 = r(i11);
        int i12 = this.f7772o;
        int i13 = i3 - i11;
        int i14 = r9 * 5;
        int i15 = i14 + 1;
        boolean z11 = (this.f7761b[i15] & 1073741824) != 0;
        r rVar = this.f7775r;
        if (z10) {
            w wVar = this.f7776s;
            if (wVar != null && (d0Var = (d0) wVar.b(i11)) != null) {
                Object[] objArr = d0Var.f8284a;
                int i16 = d0Var.f8285b;
                for (int i17 = 0; i17 < i16; i17++) {
                    F(objArr[i17]);
                }
            }
            int[] iArr = this.f7761b;
            iArr[i14 + 3] = i13;
            j.c(r9, i12, iArr);
            int b10 = rVar.b();
            if (z11) {
                i12 = 1;
            }
            this.f7772o = b10 + i12;
            int E = E(this.f7761b, i11);
            this.f7779v = E;
            int p4 = E < 0 ? p() : r(E + 1);
            int g = p4 >= 0 ? g(this.f7761b, p4) : 0;
            this.f7767i = g;
            this.j = g;
            return;
        }
        if (i3 != i10) {
            n0.m.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f7761b;
        int i18 = i14 + 3;
        int i19 = iArr2[i18];
        int i20 = iArr2[i15] & 67108863;
        iArr2[i18] = i13;
        j.c(r9, i12, iArr2);
        int b11 = this.f7773p.b();
        this.f7778u = (o() - this.f7766h) - this.f7774q.b();
        this.f7779v = b11;
        int E2 = E(this.f7761b, i11);
        int b12 = rVar.b();
        this.f7772o = b12;
        if (E2 == b11) {
            this.f7772o = b12 + (z11 ? 0 : i12 - i20);
            return;
        }
        int i21 = i13 - i19;
        int i22 = z11 ? 0 : i12 - i20;
        if (i21 != 0 || i22 != 0) {
            while (E2 != 0 && E2 != b11 && (i22 != 0 || i21 != 0)) {
                int r10 = r(E2);
                if (i21 != 0) {
                    int[] iArr3 = this.f7761b;
                    int i23 = (r10 * 5) + 3;
                    iArr3[i23] = iArr3[i23] + i21;
                }
                if (i22 != 0) {
                    int[] iArr4 = this.f7761b;
                    j.c(r10, (iArr4[(r10 * 5) + 1] & 67108863) + i22, iArr4);
                }
                int[] iArr5 = this.f7761b;
                if ((iArr5[(r10 * 5) + 1] & 1073741824) != 0) {
                    i22 = 0;
                }
                E2 = E(iArr5, E2);
            }
        }
        this.f7772o += i22;
    }

    public final void k() {
        if (this.f7771n <= 0) {
            n1.b("Unbalanced begin/end insert");
        }
        int i3 = this.f7771n - 1;
        this.f7771n = i3;
        if (i3 == 0) {
            if (this.f7775r.f1653b != this.f7773p.f1653b) {
                n0.m.a("startGroup/endGroup mismatch while inserting");
            }
            this.f7778u = (o() - this.f7766h) - this.f7774q.b();
        }
    }

    public final void l(int i3) {
        boolean z10 = false;
        if (!(this.f7771n <= 0)) {
            n0.m.a("Cannot call ensureStarted() while inserting");
        }
        int i10 = this.f7779v;
        if (i10 != i3) {
            if (i3 >= i10 && i3 < this.f7778u) {
                z10 = true;
            }
            if (!z10) {
                n0.m.a("Started group at " + i3 + " must be a subgroup of the group at " + i10);
            }
            int i11 = this.f7777t;
            int i12 = this.f7767i;
            int i13 = this.j;
            this.f7777t = i3;
            P();
            this.f7777t = i11;
            this.f7767i = i12;
            this.j = i13;
        }
    }

    public final void m(int i3, int i10, int i11) {
        if (i3 >= this.g) {
            i3 = -((p() - i3) + 2);
        }
        while (i11 < i10) {
            this.f7761b[(r(i11) * 5) + 2] = i3;
            int i12 = this.f7761b[(r(i11) * 5) + 3] + i11;
            m(i11, i12, i11 + 1);
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x012d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(int i3, Function2 function2) {
        int i10;
        int i11;
        int i12;
        Function2 function22 = function2;
        int E = E(this.f7761b, i3);
        int p4 = p();
        int u2 = u(i3) + i3;
        int i13 = i3;
        x xVar = null;
        v vVar = null;
        loop0: while (i13 < u2) {
            int f3 = f(i13);
            int i14 = i13 + 1;
            int f10 = f(i14);
            while (f3 < f10) {
                Object obj = this.f7762c[h(f3)];
                if (obj instanceof l0) {
                    l0 l0Var = (l0) obj;
                    if (!(l0Var instanceof l0)) {
                        l0Var = null;
                    }
                    if (l0Var == null) {
                        n0.m.b("Inconsistent composition");
                        throw new hd.d();
                    }
                    int i15 = l0Var.f6746b;
                    if (i15 >= 0) {
                        int u10 = u(i13) + i13;
                        int i16 = i14;
                        int i17 = 0;
                        while (i16 < u10 && i17 < i15) {
                            int r9 = r(i16);
                            int i18 = E;
                            int[] iArr = this.f7761b;
                            int i19 = r9 * 5;
                            i16 = iArr[i19 + 3] + i16;
                            if (i16 < u10 && (iArr[i19 + 1] & 536870912) == 0) {
                                i17++;
                            }
                            E = i18;
                        }
                        i12 = E;
                        if (xVar == null) {
                            int[] iArr2 = s.m.f8345a;
                            xVar = new x();
                        }
                        if (vVar == null) {
                            vVar = new v();
                        }
                        xVar.a(i16);
                        vVar.a(i16);
                        vVar.a(f3);
                        f3++;
                        E = i12;
                    }
                }
                i12 = E;
                function22.invoke(Integer.valueOf(f3), obj);
                f3++;
                E = i12;
            }
            int i20 = E;
            E = i14 < p4 ? E(this.f7761b, i14) : -1;
            if (E != i13) {
                int i21 = i20;
                while (true) {
                    if (vVar == null || xVar == null || !xVar.e(i13)) {
                        i10 = p4;
                    } else {
                        int i22 = vVar.f8390b;
                        int i23 = i22 / 2;
                        int i24 = 0;
                        int i25 = 0;
                        while (i24 < i23) {
                            int i26 = i24 * 2;
                            int i27 = p4;
                            int b10 = vVar.b(i26);
                            if (b10 == i13) {
                                int b11 = vVar.b(i26 + 1);
                                function22.invoke(Integer.valueOf(b11), this.f7762c[h(b11)]);
                            } else if (i26 != i25) {
                                int i28 = i25 + 1;
                                vVar.d(i25, b10);
                                i25 += 2;
                                vVar.d(i28, vVar.b(i26 + 1));
                            } else {
                                i25 += 2;
                            }
                            i24++;
                            function22 = function2;
                            p4 = i27;
                        }
                        i10 = p4;
                        if (i25 != i22) {
                            if (i25 < 0 || i25 > (i11 = vVar.f8390b) || i22 < 0 || i22 > i11) {
                                break loop0;
                            }
                            if (i22 < i25) {
                                a1.e("The end index must be < start index");
                                return;
                            } else if (i22 != i25) {
                                if (i22 < i11) {
                                    int[] iArr3 = vVar.f8389a;
                                    kotlin.collections.v.c(i25, i22, i11, iArr3, iArr3);
                                }
                                vVar.f8390b -= i22 - i25;
                            }
                        }
                    }
                    if (i13 != i3 && i21 != E) {
                        i13 = i21;
                        p4 = i10;
                        i21 = E(this.f7761b, i21);
                        function22 = function2;
                    }
                }
            } else {
                i10 = p4;
            }
            function22 = function2;
            i13 = i14;
            p4 = i10;
        }
    }

    public final int o() {
        return this.f7761b.length / 5;
    }

    public final int p() {
        return o() - this.f7766h;
    }

    public final Object q(int i3) {
        int r9 = r(i3);
        int[] iArr = this.f7761b;
        int i10 = (r9 * 5) + 1;
        if ((iArr[i10] & 268435456) == 0) {
            return n0.k.f6729a;
        }
        return this.f7762c[Integer.bitCount(iArr[i10] >> 29) + g(iArr, r9)];
    }

    public final int r(int i3) {
        return (this.f7766h * (i3 < this.g ? 0 : 1)) + i3;
    }

    public final int s(int i3) {
        return this.f7761b[r(i3) * 5];
    }

    public final Object t(int i3) {
        int r9 = r(i3);
        int[] iArr = this.f7761b;
        int i10 = r9 * 5;
        int i11 = iArr[i10 + 1];
        if ((536870912 & i11) == 0) {
            return null;
        }
        return this.f7762c[Integer.bitCount(i11 >> 30) + iArr[i10 + 4]];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f7777t + " end=" + this.f7778u + " size = " + p() + " gap=" + this.g + '-' + (this.g + this.f7766h) + ')';
    }

    public final int u(int i3) {
        return this.f7761b[(r(i3) * 5) + 3];
    }

    public final boolean v(int i3, int i10) {
        int o6;
        int u2;
        if (i10 == this.f7779v) {
            o6 = this.f7778u;
        } else {
            r rVar = this.f7773p;
            if (i10 > rVar.a(0)) {
                u2 = u(i10);
            } else {
                int[] iArr = rVar.f1652a;
                int min = Math.min(iArr.length, rVar.f1653b);
                int i11 = 0;
                while (true) {
                    if (i11 >= min) {
                        i11 = -1;
                        break;
                    }
                    if (iArr[i11] == i10) {
                        break;
                    }
                    i11++;
                }
                if (i11 < 0) {
                    u2 = u(i10);
                } else {
                    o6 = (o() - this.f7766h) - this.f7774q.f1652a[i11];
                }
            }
            o6 = u2 + i10;
        }
        return i3 > i10 && i3 < o6;
    }

    public final void w(int i3) {
        if (i3 > 0) {
            int i10 = this.f7777t;
            B(i10);
            int i11 = this.g;
            int i12 = this.f7766h;
            int[] iArr = this.f7761b;
            int length = iArr.length / 5;
            int i13 = length - i12;
            if (i12 < i3) {
                int max = Math.max(Math.max(length * 2, i13 + i3), 32);
                int[] iArr2 = new int[max * 5];
                int i14 = max - i13;
                kotlin.collections.v.c(0, 0, i11 * 5, iArr, iArr2);
                kotlin.collections.v.c((i11 + i14) * 5, (i12 + i11) * 5, length * 5, iArr, iArr2);
                this.f7761b = iArr2;
                i12 = i14;
            }
            int i15 = this.f7778u;
            if (i15 >= i11) {
                this.f7778u = i15 + i3;
            }
            int i16 = i11 + i3;
            this.g = i16;
            this.f7766h = i12 - i3;
            int i17 = i(i13 > 0 ? f(i10 + i3) : 0, this.f7770m >= i11 ? this.f7768k : 0, this.f7769l, this.f7762c.length);
            for (int i18 = i11; i18 < i16; i18++) {
                this.f7761b[(i18 * 5) + 4] = i17;
            }
            int i19 = this.f7770m;
            if (i19 >= i11) {
                this.f7770m = i19 + i3;
            }
        }
    }

    public final void x(int i3, int i10) {
        if (i3 > 0) {
            C(this.f7767i, i10);
            int i11 = this.f7768k;
            int i12 = this.f7769l;
            if (i12 < i3) {
                Object[] objArr = this.f7762c;
                int length = objArr.length;
                int i13 = length - i12;
                int max = Math.max(Math.max(length * 2, i13 + i3), 32);
                Object[] objArr2 = new Object[max];
                for (int i14 = 0; i14 < max; i14++) {
                    objArr2[i14] = null;
                }
                int i15 = max - i13;
                int i16 = i12 + i11;
                System.arraycopy(objArr, 0, objArr2, 0, i11);
                System.arraycopy(objArr, i16, objArr2, i11 + i15, length - i16);
                this.f7762c = objArr2;
                i12 = i15;
            }
            int i17 = this.j;
            if (i17 >= i11) {
                this.j = i17 + i3;
            }
            this.f7768k = i11 + i3;
            this.f7769l = i12 - i3;
        }
    }

    public final boolean y(int i3) {
        return (this.f7761b[(r(i3) * 5) + 1] & 1073741824) != 0;
    }
}
