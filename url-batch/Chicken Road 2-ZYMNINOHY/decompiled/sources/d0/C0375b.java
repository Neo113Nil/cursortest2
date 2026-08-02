package d0;

import E.AbstractC0005f;
import E1.X;
import T.C0096n;
import T.C0097o;
import T.F;
import T.U;
import W.J;
import Y.A;
import a.AbstractC0124a;
import a0.C0144j;
import a0.Q;
import a0.p0;
import android.util.Pair;
import android.util.SparseArray;
import e0.C0391a;
import e0.C0393c;
import e0.C0396f;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q0.C1372n;
import q0.C1375q;
import q0.InterfaceC1382y;
import q0.InterfaceC1383z;
import q0.b0;
import q0.c0;
import q0.d0;
import q0.j0;
import r0.AbstractC1390a;
import r0.C1396g;
import r0.C1398i;
import r0.InterfaceC1397h;
import t0.C1427b;
import t0.t;
import v2.G;
import v2.I;
import v2.a0;
import v2.r;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375b implements InterfaceC1383z, c0, InterfaceC1397h {

    /* renamed from: a, reason: collision with root package name */
    public final int f8093a;

    /* renamed from: b, reason: collision with root package name */
    public final L3.h f8094b;

    /* renamed from: c, reason: collision with root package name */
    public final A f8095c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.i f8096d;

    /* renamed from: e, reason: collision with root package name */
    public final C1427b f8097e;

    /* renamed from: f, reason: collision with root package name */
    public final G1.c f8098f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8099g;

    /* renamed from: h, reason: collision with root package name */
    public final u0.o f8100h;

    /* renamed from: i, reason: collision with root package name */
    public final B1.j f8101i;

    /* renamed from: j, reason: collision with root package name */
    public final j0 f8102j;

    /* renamed from: k, reason: collision with root package name */
    public final C0374a[] f8103k;

    /* renamed from: l, reason: collision with root package name */
    public final C0144j f8104l;

    /* renamed from: m, reason: collision with root package name */
    public final p f8105m;
    public final f0.e o;

    /* renamed from: p, reason: collision with root package name */
    public final f0.e f8106p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC1382y f8107q;

    /* renamed from: t, reason: collision with root package name */
    public C1372n f8110t;

    /* renamed from: u, reason: collision with root package name */
    public C0393c f8111u;
    public int v;

    /* renamed from: w, reason: collision with root package name */
    public List f8112w;

    /* renamed from: y, reason: collision with root package name */
    public long f8114y;
    public static final Pattern z = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: A, reason: collision with root package name */
    public static final Pattern f8092A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: x, reason: collision with root package name */
    public boolean f8113x = true;

    /* renamed from: r, reason: collision with root package name */
    public C1398i[] f8108r = new C1398i[0];

    /* renamed from: s, reason: collision with root package name */
    public m[] f8109s = new m[0];
    public final IdentityHashMap n = new IdentityHashMap();

    public C0375b(int i4, C0393c c0393c, G1.c cVar, int i5, L3.h hVar, A a3, f0.i iVar, f0.e eVar, C1427b c1427b, f0.e eVar2, long j4, u0.o oVar, B1.j jVar, C0144j c0144j, C0377d c0377d, b0.i iVar2) {
        int i6;
        int i7;
        int[][] iArr;
        boolean[] zArr;
        C0097o[][] c0097oArr;
        C0097o[] c0097oArr2;
        C0396f c4;
        Integer num;
        this.f8093a = i4;
        this.f8111u = c0393c;
        this.f8098f = cVar;
        this.v = i5;
        this.f8094b = hVar;
        this.f8095c = a3;
        this.f8096d = iVar;
        this.f8106p = eVar;
        this.f8097e = c1427b;
        this.o = eVar2;
        this.f8099g = j4;
        this.f8100h = oVar;
        this.f8101i = jVar;
        this.f8104l = c0144j;
        boolean z4 = true;
        this.f8105m = new p(c0393c, c0377d, jVar);
        int i8 = 0;
        c0144j.getClass();
        G g4 = I.f15571b;
        a0 a0Var = a0.f15605e;
        this.f8110t = new C1372n(a0Var, a0Var);
        e0.h b4 = c0393c.b(i5);
        List list = b4.f8381d;
        this.f8112w = list;
        List list2 = b4.f8380c;
        int size = list2.size();
        HashMap hashMap = new HashMap(r.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i9 = 0; i9 < size; i9++) {
            hashMap.put(Long.valueOf(((C0391a) list2.get(i9)).f8336a), Integer.valueOf(i9));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i9));
            arrayList.add(arrayList2);
            sparseArray.put(i9, arrayList2);
        }
        int i10 = 0;
        while (i10 < size) {
            C0391a c0391a = (C0391a) list2.get(i10);
            List list3 = c0391a.f8340e;
            List list4 = c0391a.f8341f;
            boolean z5 = z4;
            C0396f c5 = c("http://dashif.org/guidelines/trickmode", list3);
            c5 = c5 == null ? c("http://dashif.org/guidelines/trickmode", list4) : c5;
            int intValue = (c5 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(c5.f8372b)))) == null || !a(c0391a, (C0391a) list2.get(num.intValue()))) ? i10 : num.intValue();
            if (intValue == i10 && (c4 = c("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = c4.f8372b;
                String str2 = J.f3263a;
                String[] split = str.split(StringUtils.COMMA, -1);
                int length = split.length;
                for (int i11 = i8; i11 < length; i11++) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(split[i11])));
                    if (num2 != null && a(c0391a, (C0391a) list2.get(num2.intValue()))) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i10) {
                List list5 = (List) sparseArray.get(i10);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i10, list6);
                arrayList.remove(list5);
            }
            i10++;
            z4 = z5;
            i8 = 0;
        }
        boolean z6 = z4;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i12 = 0; i12 < size2; i12++) {
            int[] F4 = O3.d.F((Collection) arrayList.get(i12));
            iArr2[i12] = F4;
            Arrays.sort(F4);
        }
        boolean[] zArr2 = new boolean[size2];
        C0097o[][] c0097oArr3 = new C0097o[size2][];
        int i13 = 0;
        int i14 = 0;
        while (i13 < size2) {
            int[] iArr3 = iArr2[i13];
            int length2 = iArr3.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((C0391a) list2.get(iArr3[i15])).f8338c;
                iArr = iArr2;
                for (int i16 = 0; i16 < list7.size(); i16++) {
                    if (!((e0.m) list7.get(i16)).f8397d.isEmpty()) {
                        zArr2[i13] = z6;
                        i14++;
                        break;
                    }
                }
                i15++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i13];
            int length3 = iArr4.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length3) {
                    zArr = zArr2;
                    c0097oArr = c0097oArr3;
                    c0097oArr2 = new C0097o[0];
                    break;
                }
                int i18 = iArr4[i17];
                C0391a c0391a2 = (C0391a) list2.get(i18);
                List list8 = ((C0391a) list2.get(i18)).f8339d;
                int[] iArr5 = iArr4;
                int i19 = 0;
                while (i19 < list8.size()) {
                    C0396f c0396f = (C0396f) list8.get(i19);
                    zArr = zArr2;
                    c0097oArr = c0097oArr3;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(c0396f.f8371a)) {
                        C0096n c0096n = new C0096n();
                        c0096n.f2831m = F.n("application/cea-608");
                        c0096n.f2819a = AbstractC0005f.p(new StringBuilder(), c0391a2.f8336a, ":cea608");
                        c0097oArr2 = n(c0396f, z, new C0097o(c0096n));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(c0396f.f8371a)) {
                        C0096n c0096n2 = new C0096n();
                        c0096n2.f2831m = F.n("application/cea-708");
                        c0096n2.f2819a = AbstractC0005f.p(new StringBuilder(), c0391a2.f8336a, ":cea708");
                        c0097oArr2 = n(c0396f, f8092A, new C0097o(c0096n2));
                        break;
                    }
                    i19++;
                    c0097oArr3 = c0097oArr;
                    zArr2 = zArr;
                }
                i17++;
                iArr4 = iArr5;
            }
            c0097oArr[i13] = c0097oArr2;
            if (c0097oArr2.length != 0) {
                i14++;
            }
            i13++;
            c0097oArr3 = c0097oArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        C0097o[][] c0097oArr4 = c0097oArr3;
        int size3 = list.size() + i14 + size2;
        U[] uArr = new U[size3];
        C0374a[] c0374aArr = new C0374a[size3];
        int i20 = 0;
        int i21 = 0;
        while (i20 < size2) {
            int[] iArr7 = iArr6[i20];
            ArrayList arrayList3 = new ArrayList();
            for (int i22 : iArr7) {
                arrayList3.addAll(((C0391a) list2.get(i22)).f8338c);
            }
            int size4 = arrayList3.size();
            C0097o[] c0097oArr5 = new C0097o[size4];
            int i23 = 0;
            while (i23 < size4) {
                int i24 = size2;
                C0097o c0097o = ((e0.m) arrayList3.get(i23)).f8394a;
                int i25 = i21;
                C0096n a4 = c0097o.a();
                a4.f2818N = iVar.d(c0097o);
                c0097oArr5[i23] = new C0097o(a4);
                i23++;
                size2 = i24;
                i21 = i25;
            }
            int i26 = size2;
            int i27 = i21;
            C0391a c0391a3 = (C0391a) list2.get(iArr7[0]);
            long j5 = c0391a3.f8336a;
            String l4 = j5 != -1 ? Long.toString(j5) : AbstractC0005f.j(i20, "unset:");
            int i28 = i27 + 1;
            if (zArr3[i20]) {
                i6 = i27 + 2;
            } else {
                i6 = i28;
                i28 = -1;
            }
            if (c0097oArr4[i20].length != 0) {
                i7 = i6 + 1;
            } else {
                i7 = i6;
                i6 = -1;
            }
            k(hVar, c0097oArr5);
            List list9 = list2;
            uArr[i27] = new U(l4, c0097oArr5);
            int i29 = c0391a3.f8337b;
            G g5 = I.f15571b;
            a0 a0Var2 = a0.f15605e;
            C0374a c0374a = new C0374a(i29, 0, iArr7, i27, i28, i6, -1, a0Var2);
            int i30 = i27;
            c0374aArr[i30] = c0374a;
            int i31 = -1;
            if (i28 != -1) {
                String z7 = AbstractC0005f.z(l4, ":emsg");
                C0096n c0096n3 = new C0096n();
                c0096n3.f2819a = z7;
                c0096n3.f2831m = F.n("application/x-emsg");
                uArr[i28] = new U(z7, new C0097o(c0096n3));
                C0374a c0374a2 = new C0374a(5, 1, iArr7, i30, -1, -1, -1, a0Var2);
                i30 = i30;
                c0374aArr[i28] = c0374a2;
                i31 = -1;
            }
            if (i6 != i31) {
                String z8 = AbstractC0005f.z(l4, ":cc");
                c0374aArr[i6] = new C0374a(3, 1, iArr7, i30, -1, -1, -1, I.l(c0097oArr4[i20]));
                k(hVar, c0097oArr4[i20]);
                uArr[i6] = new U(z8, c0097oArr4[i20]);
            }
            i20++;
            size2 = i26;
            i21 = i7;
            list2 = list9;
        }
        int i32 = 0;
        while (i32 < list.size()) {
            e0.g gVar = (e0.g) list.get(i32);
            C0096n c0096n4 = new C0096n();
            c0096n4.f2819a = gVar.a();
            c0096n4.f2831m = F.n("application/x-emsg");
            uArr[i21] = new U(gVar.a() + StringUtils.PROCESS_POSTFIX_DELIMITER + i32, new C0097o(c0096n4));
            G g6 = I.f15571b;
            c0374aArr[i21] = new C0374a(5, 2, new int[0], -1, -1, -1, i32, a0.f15605e);
            i32++;
            i21++;
        }
        Pair create = Pair.create(new j0(uArr), c0374aArr);
        this.f8102j = (j0) create.first;
        this.f8103k = (C0374a[]) create.second;
    }

    public static boolean a(C0391a c0391a, C0391a c0391a2) {
        int i4 = c0391a.f8337b;
        List list = c0391a.f8338c;
        int i5 = c0391a2.f8337b;
        List list2 = c0391a2.f8338c;
        if (i4 == i5) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            C0097o c0097o = ((e0.m) list.get(0)).f8394a;
            C0097o c0097o2 = ((e0.m) list2.get(0)).f8394a;
            int i6 = c0097o.f2861f & (-16385);
            int i7 = c0097o2.f2861f & (-16385);
            if (Objects.equals(c0097o.f2859d, c0097o2.f2859d) && i6 == i7) {
                return true;
            }
        }
        return false;
    }

    public static C0396f c(String str, List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            C0396f c0396f = (C0396f) list.get(i4);
            if (str.equals(c0396f.f8371a)) {
                return c0396f;
            }
        }
        return null;
    }

    public static void k(L3.h hVar, C0097o[] c0097oArr) {
        for (int i4 = 0; i4 < c0097oArr.length; i4++) {
            C0097o c0097o = c0097oArr[i4];
            X x4 = (X) hVar.f1681c;
            if (x4.f555a && ((a2.i) x4.f556b).f(c0097o)) {
                C0096n a3 = c0097o.a();
                String str = c0097o.f2866k;
                a3.f2831m = F.n("application/x-media3-cues");
                a3.f2816K = ((a2.i) x4.f556b).c(c0097o);
                StringBuilder sb = new StringBuilder();
                sb.append(c0097o.n);
                sb.append(str != null ? " ".concat(str) : "");
                a3.f2828j = sb.toString();
                a3.f2834r = Long.MAX_VALUE;
                c0097o = new C0097o(a3);
            }
            c0097oArr[i4] = c0097o;
        }
    }

    public static C0097o[] n(C0396f c0396f, Pattern pattern, C0097o c0097o) {
        String str = c0396f.f8372b;
        if (str == null) {
            return new C0097o[]{c0097o};
        }
        String str2 = J.f3263a;
        String[] split = str.split(";", -1);
        C0097o[] c0097oArr = new C0097o[split.length];
        for (int i4 = 0; i4 < split.length; i4++) {
            Matcher matcher = pattern.matcher(split[i4]);
            if (!matcher.matches()) {
                return new C0097o[]{c0097o};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            C0096n a3 = c0097o.a();
            a3.f2819a = c0097o.f2856a + StringUtils.PROCESS_POSTFIX_DELIMITER + parseInt;
            a3.f2815J = parseInt;
            a3.f2822d = matcher.group(2);
            c0097oArr[i4] = new C0097o(a3);
        }
        return c0097oArr;
    }

    @Override // q0.InterfaceC1383z
    public final long b(long j4, p0 p0Var) {
        for (C1398i c1398i : this.f8108r) {
            if (c1398i.f15152a == 2) {
                return c1398i.f15156e.b(j4, p0Var);
            }
        }
        return j4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [d0.o] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v13, types: [v2.I] */
    @Override // q0.InterfaceC1383z
    public final long d(t[] tVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j4) {
        int i4;
        U u4;
        boolean z4;
        int[] iArr;
        int[] iArr2;
        int i5;
        int i6;
        int i7;
        U u5;
        a0 a0Var;
        int i8;
        ?? r31;
        boolean z5;
        t[] tVarArr2 = tVarArr;
        int[] iArr3 = new int[tVarArr2.length];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i4 = -1;
            if (i10 >= tVarArr2.length) {
                break;
            }
            t tVar = tVarArr2[i10];
            if (tVar != null) {
                iArr3[i10] = this.f8102j.b(tVar.c());
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            u4 = null;
            if (i11 >= tVarArr2.length) {
                break;
            }
            if (tVarArr2[i11] == null || !zArr[i11]) {
                b0 b0Var = b0VarArr[i11];
                if (b0Var instanceof C1398i) {
                    ((C1398i) b0Var).B(this);
                } else if (b0Var instanceof C1396g) {
                    C1396g c1396g = (C1396g) b0Var;
                    C1398i c1398i = c1396g.f15151e;
                    boolean[] zArr3 = c1398i.f15155d;
                    int i12 = c1396g.f15149c;
                    AbstractC0124a.t(zArr3[i12]);
                    c1398i.f15155d[i12] = false;
                }
                b0VarArr[i11] = null;
            }
            i11++;
        }
        int i13 = 0;
        while (true) {
            z4 = true;
            if (i13 >= tVarArr2.length) {
                break;
            }
            b0 b0Var2 = b0VarArr[i13];
            if ((b0Var2 instanceof C1375q) || (b0Var2 instanceof C1396g)) {
                int g4 = g(iArr3, i13);
                if (g4 == -1) {
                    z5 = b0VarArr[i13] instanceof C1375q;
                } else {
                    b0 b0Var3 = b0VarArr[i13];
                    z5 = (b0Var3 instanceof C1396g) && ((C1396g) b0Var3).f15147a == b0VarArr[g4];
                }
                if (!z5) {
                    b0 b0Var4 = b0VarArr[i13];
                    if (b0Var4 instanceof C1396g) {
                        C1396g c1396g2 = (C1396g) b0Var4;
                        C1398i c1398i2 = c1396g2.f15151e;
                        boolean[] zArr4 = c1398i2.f15155d;
                        int i14 = c1396g2.f15149c;
                        AbstractC0124a.t(zArr4[i14]);
                        c1398i2.f15155d[i14] = false;
                    }
                    b0VarArr[i13] = null;
                }
            }
            i13++;
        }
        int i15 = 0;
        while (i15 < tVarArr2.length) {
            t tVar2 = tVarArr2[i15];
            if (tVar2 == null) {
                iArr2 = iArr3;
                i5 = i9;
                i6 = i15;
            } else {
                b0 b0Var5 = b0VarArr[i15];
                if (b0Var5 == null) {
                    zArr2[i15] = z4;
                    C0374a c0374a = this.f8103k[iArr3[i15]];
                    int i16 = c0374a.f8086c;
                    if (i16 == 0) {
                        int i17 = c0374a.f8089f;
                        ?? r29 = i17 != i4 ? z4 ? 1 : 0 : i9;
                        if (r29 != 0) {
                            u5 = this.f8102j.a(i17);
                            i7 = z4 ? 1 : 0;
                        } else {
                            i7 = i9;
                            u5 = u4;
                        }
                        int i18 = c0374a.f8090g;
                        if (i18 != i4) {
                            a0Var = this.f8103k[i18].f8091h;
                        } else {
                            G g5 = I.f15571b;
                            a0Var = a0.f15605e;
                        }
                        int size = a0Var.size() + i7;
                        C0097o[] c0097oArr = new C0097o[size];
                        int[] iArr4 = new int[size];
                        if (r29 != 0) {
                            c0097oArr[i9] = u5.f2708d[i9];
                            iArr4[i9] = 5;
                            i8 = z4 ? 1 : 0;
                        } else {
                            i8 = i9;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i19 = i9; i19 < a0Var.size(); i19++) {
                            C0097o c0097o = (C0097o) a0Var.get(i19);
                            c0097oArr[i8] = c0097o;
                            iArr4[i8] = 3;
                            arrayList.add(c0097o);
                            i8 += z4 ? 1 : 0;
                        }
                        if (!this.f8111u.f8349d || r29 == 0) {
                            r31 = u4;
                        } else {
                            p pVar = this.f8105m;
                            r31 = new o(pVar, pVar.f8197a);
                        }
                        L3.h hVar = this.f8094b;
                        u0.o oVar = this.f8100h;
                        C0393c c0393c = this.f8111u;
                        G1.c cVar = this.f8098f;
                        int i20 = this.v;
                        int[] iArr5 = c0374a.f8084a;
                        int i21 = c0374a.f8085b;
                        long j5 = this.f8099g;
                        int[] iArr6 = iArr3;
                        A a3 = this.f8095c;
                        Y.h f4 = ((Y.g) hVar.f1682d).f();
                        if (a3 != null) {
                            f4.y(a3);
                        }
                        l lVar = new l((X) hVar.f1681c, oVar, c0393c, cVar, i20, iArr5, tVar2, i21, f4, j5, hVar.f1680b, r29, arrayList, r31);
                        Object obj = r31;
                        iArr2 = iArr6;
                        u4 = null;
                        i6 = i15;
                        C1398i c1398i3 = new C1398i(c0374a.f8085b, iArr4, c0097oArr, lVar, this, this.f8101i, j4, this.f8096d, this.f8106p, this.f8097e, this.o, this.f8113x, null);
                        synchronized (this) {
                            this.n.put(c1398i3, obj);
                        }
                        b0VarArr[i6] = c1398i3;
                    } else {
                        iArr2 = iArr3;
                        i6 = i15;
                        if (i16 == 2) {
                            i5 = 0;
                            b0VarArr[i6] = new m((e0.g) this.f8112w.get(c0374a.f8087d), tVar2.c().f2708d[0], this.f8111u.f8349d);
                        }
                    }
                    i5 = 0;
                } else {
                    iArr2 = iArr3;
                    i5 = i9;
                    i6 = i15;
                    if (b0Var5 instanceof C1398i) {
                        ((l) ((C1398i) b0Var5).f15156e).f8178j = tVar2;
                    }
                }
            }
            i15 = i6 + 1;
            tVarArr2 = tVarArr;
            i9 = i5;
            iArr3 = iArr2;
            i4 = -1;
            z4 = true;
        }
        int[] iArr7 = iArr3;
        ?? r6 = i9;
        int i22 = r6 == true ? 1 : 0;
        while (i22 < tVarArr.length) {
            if (b0VarArr[i22] != null || tVarArr[i22] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                C0374a c0374a2 = this.f8103k[iArr[i22]];
                if (c0374a2.f8086c == 1) {
                    int g6 = g(iArr, i22);
                    if (g6 != -1) {
                        C1398i c1398i4 = (C1398i) b0VarArr[g6];
                        int i23 = c0374a2.f8085b;
                        boolean[] zArr5 = c1398i4.f15155d;
                        q0.a0[] a0VarArr = c1398i4.n;
                        for (int i24 = r6 == true ? 1 : 0; i24 < a0VarArr.length; i24++) {
                            if (c1398i4.f15153b[i24] == i23) {
                                AbstractC0124a.t(!zArr5[i24]);
                                zArr5[i24] = true;
                                a0VarArr[i24].G(j4, true);
                                b0VarArr[i22] = new C1396g(c1398i4, c1398i4, a0VarArr[i24], i24);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    b0VarArr[i22] = new C1375q();
                    i22++;
                    iArr7 = iArr;
                }
            }
            i22++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = b0VarArr.length;
        for (int i25 = r6 == true ? 1 : 0; i25 < length; i25++) {
            b0 b0Var6 = b0VarArr[i25];
            if (b0Var6 instanceof C1398i) {
                arrayList2.add((C1398i) b0Var6);
            } else if (b0Var6 instanceof m) {
                arrayList3.add((m) b0Var6);
            }
        }
        C1398i[] c1398iArr = new C1398i[arrayList2.size()];
        this.f8108r = c1398iArr;
        arrayList2.toArray(c1398iArr);
        m[] mVarArr = new m[arrayList3.size()];
        this.f8109s = mVarArr;
        arrayList3.toArray(mVarArr);
        C0144j c0144j = this.f8104l;
        AbstractList u6 = r.u(arrayList2, new b0.c(16));
        c0144j.getClass();
        this.f8110t = new C1372n(arrayList2, u6);
        if (this.f8113x) {
            this.f8113x = r6;
            this.f8114y = j4;
        }
        return j4;
    }

    @Override // q0.d0
    public final long e() {
        return this.f8110t.e();
    }

    @Override // q0.InterfaceC1383z
    public final void f(InterfaceC1382y interfaceC1382y, long j4) {
        this.f8107q = interfaceC1382y;
        interfaceC1382y.m(this);
    }

    public final int g(int[] iArr, int i4) {
        int i5 = iArr[i4];
        if (i5 != -1) {
            C0374a[] c0374aArr = this.f8103k;
            int i6 = c0374aArr[i5].f8088e;
            for (int i7 = 0; i7 < iArr.length; i7++) {
                int i8 = iArr[i7];
                if (i8 == i6 && c0374aArr[i8].f8086c == 0) {
                    return i7;
                }
            }
        }
        return -1;
    }

    @Override // q0.InterfaceC1383z
    public final void h() {
        this.f8100h.a();
    }

    @Override // q0.InterfaceC1383z
    public final long i(long j4) {
        for (C1398i c1398i : this.f8108r) {
            c1398i.C(j4);
        }
        for (m mVar : this.f8109s) {
            int b4 = J.b(mVar.f8184c, j4, true);
            mVar.f8188g = b4;
            mVar.f8189h = (mVar.f8185d && b4 == mVar.f8184c.length) ? j4 : -9223372036854775807L;
        }
        return j4;
    }

    @Override // q0.InterfaceC1383z
    public final void j(long j4) {
        for (C1398i c1398i : this.f8108r) {
            c1398i.j(j4);
        }
    }

    @Override // q0.d0
    public final boolean l() {
        return this.f8110t.l();
    }

    @Override // q0.InterfaceC1383z
    public final long q() {
        C1398i[] c1398iArr = this.f8108r;
        int length = c1398iArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            C1398i c1398i = c1398iArr[i4];
            c1398i.getClass();
            try {
                if (c1398i.f15172x) {
                    return this.f8114y;
                }
            } finally {
                c1398i.f15172x = false;
            }
        }
        return -9223372036854775807L;
    }

    @Override // q0.c0
    public final void s(d0 d0Var) {
        this.f8107q.s(this);
    }

    @Override // q0.InterfaceC1383z
    public final j0 t() {
        return this.f8102j;
    }

    @Override // q0.d0
    public final long u() {
        return this.f8110t.u();
    }

    @Override // q0.d0
    public final boolean v(Q q4) {
        return this.f8110t.v(q4);
    }

    @Override // q0.d0
    public final void w(long j4) {
        int i4;
        C1398i[] c1398iArr = this.f8108r;
        int length = c1398iArr.length;
        int i5 = 0;
        while (i5 < length) {
            C1398i c1398i = c1398iArr[i5];
            if (!c1398i.f15160i.d()) {
                long d4 = this.f8111u.d(this.v);
                q0.a0 a0Var = c1398i.f15164m;
                AbstractC0124a.t(!c1398i.f15160i.d());
                if (!c1398i.y() && d4 != -9223372036854775807L && !c1398i.f15162k.isEmpty()) {
                    AbstractC1390a s4 = c1398i.s();
                    long j5 = s4.f15114l;
                    if (j5 == -9223372036854775807L) {
                        j5 = s4.f15145h;
                    }
                    if (j5 > d4) {
                        long q4 = a0Var.q();
                        if (q4 > d4) {
                            a0Var.l(Math.max(d4, a0Var.r() + 1));
                            q0.a0[] a0VarArr = c1398i.n;
                            int length2 = a0VarArr.length;
                            int i6 = 0;
                            while (i6 < length2) {
                                q0.a0 a0Var2 = a0VarArr[i6];
                                a0Var2.l(Math.max(d4, a0Var2.r() + 1));
                                i6++;
                                i5 = i5;
                            }
                            i4 = i5;
                            c1398i.f15158g.i(c1398i.f15152a, d4, q4);
                            i5 = i4 + 1;
                        }
                    }
                }
            }
            i4 = i5;
            i5 = i4 + 1;
        }
        this.f8110t.w(j4);
    }
}
