package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e1 implements oc4 {
    public static final vc4 E = new vc4() { // from class: com.google.android.gms.internal.ads.z0
        @Override // com.google.android.gms.internal.ads.vc4
        public final /* synthetic */ oc4[] a(Uri uri, Map map) {
            return uc4.a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.vc4
        public final oc4[] zza() {
            vc4 vc4Var = e1.E;
            return new oc4[]{new e1(0, null)};
        }
    };
    private static final byte[] F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final c0 G;
    private boolean D;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f4432f;

    /* renamed from: g, reason: collision with root package name */
    private final dr2 f4433g;

    /* renamed from: l, reason: collision with root package name */
    private int f4438l;

    /* renamed from: m, reason: collision with root package name */
    private int f4439m;

    /* renamed from: n, reason: collision with root package name */
    private long f4440n;

    /* renamed from: o, reason: collision with root package name */
    private int f4441o;

    /* renamed from: p, reason: collision with root package name */
    private dr2 f4442p;

    /* renamed from: q, reason: collision with root package name */
    private long f4443q;

    /* renamed from: r, reason: collision with root package name */
    private int f4444r;

    /* renamed from: v, reason: collision with root package name */
    private c1 f4448v;

    /* renamed from: w, reason: collision with root package name */
    private int f4449w;

    /* renamed from: x, reason: collision with root package name */
    private int f4450x;

    /* renamed from: y, reason: collision with root package name */
    private int f4451y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f4452z;

    /* renamed from: a, reason: collision with root package name */
    private final List<c0> f4427a = Collections.unmodifiableList(Collections.emptyList());

    /* renamed from: h, reason: collision with root package name */
    private final ye4 f4434h = new ye4();

    /* renamed from: i, reason: collision with root package name */
    private final dr2 f4435i = new dr2(16);

    /* renamed from: c, reason: collision with root package name */
    private final dr2 f4429c = new dr2(th2.f12217a);

    /* renamed from: d, reason: collision with root package name */
    private final dr2 f4430d = new dr2(5);

    /* renamed from: e, reason: collision with root package name */
    private final dr2 f4431e = new dr2();

    /* renamed from: j, reason: collision with root package name */
    private final ArrayDeque<o0> f4436j = new ArrayDeque<>();

    /* renamed from: k, reason: collision with root package name */
    private final ArrayDeque<b1> f4437k = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<c1> f4428b = new SparseArray<>();

    /* renamed from: t, reason: collision with root package name */
    private long f4446t = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    private long f4445s = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    private long f4447u = -9223372036854775807L;
    private rc4 A = rc4.f11105a;
    private td4[] B = new td4[0];
    private td4[] C = new td4[0];

    static {
        bf4 bf4Var = new bf4();
        bf4Var.s("application/x-emsg");
        G = bf4Var.y();
    }

    public e1(int i7, ky2 ky2Var) {
        byte[] bArr = new byte[16];
        this.f4432f = bArr;
        this.f4433g = new dr2(bArr);
    }

    private static int a(int i7) {
        if (i7 >= 0) {
            return i7;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(i7);
        throw dz.a(sb.toString(), null);
    }

    private static u74 b(List<p0> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            p0 p0Var = list.get(i7);
            if (p0Var.f10494a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] h7 = p0Var.f9963b.h();
                UUID a7 = l1.a(h7);
                if (a7 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new u64(a7, null, "video/mp4", h7));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new u74(arrayList);
    }

    private final void d() {
        this.f4438l = 0;
        this.f4441o = 0;
    }

    private static void f(dr2 dr2Var, int i7, q1 q1Var) {
        dr2Var.f(i7 + 8);
        int m7 = dr2Var.m() & 16777215;
        if ((m7 & 1) != 0) {
            throw dz.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z6 = (m7 & 2) != 0;
        int v6 = dr2Var.v();
        if (v6 == 0) {
            Arrays.fill(q1Var.f10527m, 0, q1Var.f10519e, false);
            return;
        }
        int i8 = q1Var.f10519e;
        if (v6 == i8) {
            Arrays.fill(q1Var.f10527m, 0, v6, z6);
            q1Var.b(dr2Var.i());
            dr2Var.b(q1Var.f10529o.h(), 0, q1Var.f10529o.l());
            q1Var.f10529o.f(0);
            q1Var.f10530p = false;
            return;
        }
        StringBuilder sb = new StringBuilder(80);
        sb.append("Senc sample count ");
        sb.append(v6);
        sb.append(" is different from fragment sample count");
        sb.append(i8);
        throw dz.a(sb.toString(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x032a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void i(long j7) {
        e1 e1Var;
        SparseArray<c1> sparseArray;
        o0 o0Var;
        int i7;
        int i8;
        byte[] bArr;
        int i9;
        byte[] bArr2;
        byte[] bArr3;
        int i10;
        boolean z6;
        int i11;
        o0 o0Var2;
        byte[] bArr4;
        q1 q1Var;
        List<p0> list;
        int i12;
        int i13;
        int i14;
        o0 o0Var3;
        c1 c1Var;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        y0 y0Var;
        int[] iArr;
        final e1 e1Var2 = this;
        while (!e1Var2.f4436j.isEmpty() && e1Var2.f4436j.peek().f9410b == j7) {
            o0 pop = e1Var2.f4436j.pop();
            int i24 = pop.f10494a;
            int i25 = 12;
            int i26 = 8;
            if (i24 == 1836019574) {
                u74 b7 = b(pop.f9411c);
                o0 c7 = pop.c(1836475768);
                Objects.requireNonNull(c7);
                SparseArray sparseArray2 = new SparseArray();
                int size = c7.f9411c.size();
                long j8 = -9223372036854775807L;
                int i27 = 0;
                while (i27 < size) {
                    p0 p0Var = c7.f9411c.get(i27);
                    int i28 = p0Var.f10494a;
                    if (i28 == 1953654136) {
                        dr2 dr2Var = p0Var.f9963b;
                        dr2Var.f(i25);
                        Pair create = Pair.create(Integer.valueOf(dr2Var.m()), new y0(dr2Var.m() - 1, dr2Var.m(), dr2Var.m(), dr2Var.m()));
                        sparseArray2.put(((Integer) create.first).intValue(), (y0) create.second);
                    } else if (i28 == 1835362404) {
                        dr2 dr2Var2 = p0Var.f9963b;
                        dr2Var2.f(8);
                        j8 = q0.a(dr2Var2.m()) == 0 ? dr2Var2.A() : dr2Var2.B();
                    }
                    i27++;
                    i25 = 12;
                }
                List<r1> c8 = x0.c(pop, new fd4(), j8, b7, false, false, new e43() { // from class: com.google.android.gms.internal.ads.a1
                    @Override // com.google.android.gms.internal.ads.e43
                    public final Object apply(Object obj) {
                        return (o1) obj;
                    }
                });
                int size2 = c8.size();
                if (e1Var2.f4428b.size() == 0) {
                    for (int i29 = 0; i29 < size2; i29++) {
                        r1 r1Var = c8.get(i29);
                        o1 o1Var = r1Var.f10957a;
                        e1Var2.f4428b.put(o1Var.f9425a, new c1(e1Var2.A.r(i29, o1Var.f9426b), r1Var, j(sparseArray2, o1Var.f9425a)));
                        e1Var2.f4446t = Math.max(e1Var2.f4446t, o1Var.f9429e);
                    }
                    e1Var2.A.H();
                } else {
                    wu1.f(e1Var2.f4428b.size() == size2);
                    for (int i30 = 0; i30 < size2; i30++) {
                        r1 r1Var2 = c8.get(i30);
                        o1 o1Var2 = r1Var2.f10957a;
                        e1Var2.f4428b.get(o1Var2.f9425a).h(r1Var2, j(sparseArray2, o1Var2.f9425a));
                    }
                }
            } else {
                if (i24 == 1836019558) {
                    SparseArray<c1> sparseArray3 = e1Var2.f4428b;
                    byte[] bArr5 = e1Var2.f4432f;
                    int size3 = pop.f9412d.size();
                    int i31 = 0;
                    while (i31 < size3) {
                        o0 o0Var4 = pop.f9412d.get(i31);
                        if (o0Var4.f10494a == 1953653094) {
                            p0 d7 = o0Var4.d(1952868452);
                            Objects.requireNonNull(d7);
                            dr2 dr2Var3 = d7.f9963b;
                            dr2Var3.f(i26);
                            int m7 = dr2Var3.m() & 16777215;
                            c1 c1Var2 = sparseArray3.get(dr2Var3.m());
                            if (c1Var2 == null) {
                                c1Var2 = null;
                            } else {
                                if ((m7 & 1) != 0) {
                                    long B = dr2Var3.B();
                                    q1 q1Var2 = c1Var2.f3679b;
                                    q1Var2.f10516b = B;
                                    q1Var2.f10517c = B;
                                }
                                y0 y0Var2 = c1Var2.f3682e;
                                c1Var2.f3679b.f10515a = new y0((m7 & 2) != 0 ? dr2Var3.m() - 1 : y0Var2.f14472a, (m7 & 8) != 0 ? dr2Var3.m() : y0Var2.f14473b, (m7 & 16) != 0 ? dr2Var3.m() : y0Var2.f14474c, (m7 & 32) != 0 ? dr2Var3.m() : y0Var2.f14475d);
                            }
                            if (c1Var2 != null) {
                                q1 q1Var3 = c1Var2.f3679b;
                                long j9 = q1Var3.f10531q;
                                boolean z7 = q1Var3.f10532r;
                                c1Var2.i();
                                c1Var2.f3689l = true;
                                p0 d8 = o0Var4.d(1952867444);
                                if (d8 != null) {
                                    dr2 dr2Var4 = d8.f9963b;
                                    dr2Var4.f(i26);
                                    q1Var3.f10531q = q0.a(dr2Var4.m()) == 1 ? dr2Var4.B() : dr2Var4.A();
                                    q1Var3.f10532r = true;
                                } else {
                                    q1Var3.f10531q = j9;
                                    q1Var3.f10532r = z7;
                                }
                                List<p0> list2 = o0Var4.f9411c;
                                int size4 = list2.size();
                                int i32 = 0;
                                int i33 = 0;
                                int i34 = 0;
                                while (true) {
                                    i9 = 1953658222;
                                    if (i32 >= size4) {
                                        break;
                                    }
                                    p0 p0Var2 = list2.get(i32);
                                    SparseArray<c1> sparseArray4 = sparseArray3;
                                    if (p0Var2.f10494a == 1953658222) {
                                        dr2 dr2Var5 = p0Var2.f9963b;
                                        dr2Var5.f(12);
                                        int v6 = dr2Var5.v();
                                        if (v6 > 0) {
                                            i34 += v6;
                                            i33++;
                                        }
                                    }
                                    i32++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                c1Var2.f3685h = 0;
                                c1Var2.f3684g = 0;
                                c1Var2.f3683f = 0;
                                q1 q1Var4 = c1Var2.f3679b;
                                q1Var4.f10518d = i33;
                                q1Var4.f10519e = i34;
                                if (q1Var4.f10521g.length < i33) {
                                    q1Var4.f10520f = new long[i33];
                                    q1Var4.f10521g = new int[i33];
                                }
                                if (q1Var4.f10522h.length < i34) {
                                    int i35 = (i34 * 125) / 100;
                                    q1Var4.f10522h = new int[i35];
                                    q1Var4.f10523i = new int[i35];
                                    q1Var4.f10524j = new long[i35];
                                    q1Var4.f10525k = new boolean[i35];
                                    q1Var4.f10527m = new boolean[i35];
                                }
                                int i36 = 0;
                                int i37 = 0;
                                int i38 = 0;
                                while (true) {
                                    long j10 = 0;
                                    if (i36 >= size4) {
                                        break;
                                    }
                                    p0 p0Var3 = list2.get(i36);
                                    if (p0Var3.f10494a == i9) {
                                        int i39 = i38 + 1;
                                        dr2 dr2Var6 = p0Var3.f9963b;
                                        dr2Var6.f(8);
                                        int m8 = dr2Var6.m() & 16777215;
                                        list = list2;
                                        o1 o1Var3 = c1Var2.f3681d.f10957a;
                                        i12 = size3;
                                        q1 q1Var5 = c1Var2.f3679b;
                                        i14 = size4;
                                        y0 y0Var3 = q1Var5.f10515a;
                                        int i40 = n13.f8865a;
                                        q1Var5.f10521g[i38] = dr2Var6.v();
                                        long[] jArr = q1Var5.f10520f;
                                        o0Var2 = pop;
                                        bArr4 = bArr5;
                                        long j11 = q1Var5.f10516b;
                                        jArr[i38] = j11;
                                        if ((m8 & 1) != 0) {
                                            i11 = i36;
                                            jArr[i38] = j11 + dr2Var6.m();
                                        } else {
                                            i11 = i36;
                                        }
                                        int i41 = m8 & 4;
                                        int i42 = y0Var3.f14475d;
                                        if (i41 != 0) {
                                            i42 = dr2Var6.m();
                                        }
                                        int i43 = m8 & 256;
                                        int i44 = m8 & 512;
                                        int i45 = m8 & 1024;
                                        int i46 = m8 & 2048;
                                        int i47 = i42;
                                        long[] jArr2 = o1Var3.f9432h;
                                        i13 = i31;
                                        if (jArr2 != null) {
                                            o0Var3 = o0Var4;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                i15 = i46;
                                                c1Var = c1Var2;
                                                j10 = n13.Z(((long[]) n13.c(o1Var3.f9433i))[0], 1000000L, o1Var3.f9427c);
                                                int[] iArr2 = q1Var5.f10522h;
                                                int[] iArr3 = q1Var5.f10523i;
                                                long[] jArr3 = q1Var5.f10524j;
                                                q1Var = q1Var3;
                                                boolean[] zArr = q1Var5.f10525k;
                                                i16 = q1Var5.f10521g[i38] + i37;
                                                long j12 = o1Var3.f9427c;
                                                int[] iArr4 = iArr3;
                                                long j13 = q1Var5.f10531q;
                                                while (i37 < i16) {
                                                    if (i43 != 0) {
                                                        i17 = i43;
                                                        i18 = dr2Var6.m();
                                                    } else {
                                                        i17 = i43;
                                                        i18 = y0Var3.f14473b;
                                                    }
                                                    a(i18);
                                                    if (i44 != 0) {
                                                        i19 = i44;
                                                        i20 = dr2Var6.m();
                                                    } else {
                                                        i19 = i44;
                                                        i20 = y0Var3.f14474c;
                                                    }
                                                    a(i20);
                                                    if (i45 != 0) {
                                                        i21 = i41;
                                                        i22 = dr2Var6.m();
                                                    } else {
                                                        i21 = i41;
                                                        if (i37 == 0) {
                                                            if (i41 != 0) {
                                                                i22 = i47;
                                                                i37 = 0;
                                                            } else {
                                                                i37 = 0;
                                                            }
                                                        }
                                                        i22 = y0Var3.f14475d;
                                                    }
                                                    int i48 = i16;
                                                    if (i15 != 0) {
                                                        i23 = i15;
                                                        y0Var = y0Var3;
                                                        iArr4[i37] = (int) ((dr2Var6.m() * 1000000) / j12);
                                                    } else {
                                                        i23 = i15;
                                                        y0Var = y0Var3;
                                                        iArr4[i37] = 0;
                                                    }
                                                    long Z = n13.Z(j13, 1000000L, j12) - j10;
                                                    jArr3[i37] = Z;
                                                    if (q1Var5.f10532r) {
                                                        iArr = iArr4;
                                                    } else {
                                                        iArr = iArr4;
                                                        jArr3[i37] = Z + c1Var.f3681d.f10964h;
                                                    }
                                                    iArr2[i37] = i20;
                                                    zArr[i37] = 1 == (((i22 >> 16) & 1) ^ 1);
                                                    j13 += i18;
                                                    i37++;
                                                    iArr4 = iArr;
                                                    i43 = i17;
                                                    i44 = i19;
                                                    i41 = i21;
                                                    i16 = i48;
                                                    y0Var3 = y0Var;
                                                    i15 = i23;
                                                }
                                                q1Var5.f10531q = j13;
                                                i38 = i39;
                                                i37 = i16;
                                            }
                                        } else {
                                            o0Var3 = o0Var4;
                                        }
                                        i15 = i46;
                                        c1Var = c1Var2;
                                        int[] iArr22 = q1Var5.f10522h;
                                        int[] iArr32 = q1Var5.f10523i;
                                        long[] jArr32 = q1Var5.f10524j;
                                        q1Var = q1Var3;
                                        boolean[] zArr2 = q1Var5.f10525k;
                                        i16 = q1Var5.f10521g[i38] + i37;
                                        long j122 = o1Var3.f9427c;
                                        int[] iArr42 = iArr32;
                                        long j132 = q1Var5.f10531q;
                                        while (i37 < i16) {
                                        }
                                        q1Var5.f10531q = j132;
                                        i38 = i39;
                                        i37 = i16;
                                    } else {
                                        i11 = i36;
                                        o0Var2 = pop;
                                        bArr4 = bArr5;
                                        q1Var = q1Var3;
                                        list = list2;
                                        i12 = size3;
                                        i13 = i31;
                                        i14 = size4;
                                        o0Var3 = o0Var4;
                                        c1Var = c1Var2;
                                    }
                                    c1Var2 = c1Var;
                                    list2 = list;
                                    size3 = i12;
                                    size4 = i14;
                                    pop = o0Var2;
                                    bArr5 = bArr4;
                                    i31 = i13;
                                    o0Var4 = o0Var3;
                                    q1Var3 = q1Var;
                                    i9 = 1953658222;
                                    i36 = i11 + 1;
                                }
                                o0Var = pop;
                                byte[] bArr6 = bArr5;
                                q1 q1Var6 = q1Var3;
                                i7 = size3;
                                i8 = i31;
                                o0 o0Var5 = o0Var4;
                                o1 o1Var4 = c1Var2.f3681d.f10957a;
                                y0 y0Var4 = q1Var6.f10515a;
                                Objects.requireNonNull(y0Var4);
                                p1 a7 = o1Var4.a(y0Var4.f14472a);
                                p0 d9 = o0Var5.d(1935763834);
                                if (d9 != null) {
                                    Objects.requireNonNull(a7);
                                    dr2 dr2Var7 = d9.f9963b;
                                    int i49 = a7.f9986d;
                                    dr2Var7.f(8);
                                    if ((dr2Var7.m() & 1) == 1) {
                                        dr2Var7.g(8);
                                    }
                                    int s7 = dr2Var7.s();
                                    int v7 = dr2Var7.v();
                                    int i50 = q1Var6.f10519e;
                                    if (v7 > i50) {
                                        StringBuilder sb = new StringBuilder(78);
                                        sb.append("Saiz sample count ");
                                        sb.append(v7);
                                        sb.append(" is greater than fragment sample count");
                                        sb.append(i50);
                                        throw dz.a(sb.toString(), null);
                                    }
                                    if (s7 == 0) {
                                        boolean[] zArr3 = q1Var6.f10527m;
                                        i10 = 0;
                                        for (int i51 = 0; i51 < v7; i51++) {
                                            int s8 = dr2Var7.s();
                                            i10 += s8;
                                            zArr3[i51] = s8 > i49;
                                        }
                                        z6 = false;
                                    } else {
                                        boolean z8 = s7 > i49;
                                        i10 = s7 * v7;
                                        z6 = false;
                                        Arrays.fill(q1Var6.f10527m, 0, v7, z8);
                                    }
                                    Arrays.fill(q1Var6.f10527m, v7, q1Var6.f10519e, z6);
                                    if (i10 > 0) {
                                        q1Var6.b(i10);
                                    }
                                }
                                p0 d10 = o0Var5.d(1935763823);
                                if (d10 != null) {
                                    dr2 dr2Var8 = d10.f9963b;
                                    dr2Var8.f(8);
                                    int m9 = dr2Var8.m();
                                    if ((m9 & 1) == 1) {
                                        dr2Var8.g(8);
                                    }
                                    int v8 = dr2Var8.v();
                                    if (v8 != 1) {
                                        StringBuilder sb2 = new StringBuilder(40);
                                        sb2.append("Unexpected saio entry count: ");
                                        sb2.append(v8);
                                        throw dz.a(sb2.toString(), null);
                                    }
                                    q1Var6.f10517c += q0.a(m9) == 0 ? dr2Var8.A() : dr2Var8.B();
                                }
                                p0 d11 = o0Var5.d(1936027235);
                                if (d11 != null) {
                                    f(d11.f9963b, 0, q1Var6);
                                }
                                String str = a7 != null ? a7.f9984b : null;
                                dr2 dr2Var9 = null;
                                dr2 dr2Var10 = null;
                                for (int i52 = 0; i52 < o0Var5.f9411c.size(); i52++) {
                                    p0 p0Var4 = o0Var5.f9411c.get(i52);
                                    dr2 dr2Var11 = p0Var4.f9963b;
                                    int i53 = p0Var4.f10494a;
                                    if (i53 == 1935828848) {
                                        dr2Var11.f(12);
                                        if (dr2Var11.m() == 1936025959) {
                                            dr2Var9 = dr2Var11;
                                        }
                                    } else if (i53 == 1936158820) {
                                        dr2Var11.f(12);
                                        if (dr2Var11.m() == 1936025959) {
                                            dr2Var10 = dr2Var11;
                                        }
                                    }
                                }
                                if (dr2Var9 != null && dr2Var10 != null) {
                                    dr2Var9.f(8);
                                    int m10 = dr2Var9.m();
                                    dr2Var9.g(4);
                                    if (q0.a(m10) == 1) {
                                        dr2Var9.g(4);
                                    }
                                    if (dr2Var9.m() != 1) {
                                        throw dz.c("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    dr2Var10.f(8);
                                    int a8 = q0.a(dr2Var10.m());
                                    dr2Var10.g(4);
                                    if (a8 == 1) {
                                        if (dr2Var10.A() == 0) {
                                            throw dz.c("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (a8 >= 2) {
                                        dr2Var10.g(4);
                                    }
                                    if (dr2Var10.A() != 1) {
                                        throw dz.c("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    dr2Var10.g(1);
                                    int s9 = dr2Var10.s();
                                    int i54 = (s9 & 240) >> 4;
                                    int i55 = s9 & 15;
                                    if (dr2Var10.s() == 1) {
                                        int s10 = dr2Var10.s();
                                        byte[] bArr7 = new byte[16];
                                        dr2Var10.b(bArr7, 0, 16);
                                        if (s10 == 0) {
                                            int s11 = dr2Var10.s();
                                            byte[] bArr8 = new byte[s11];
                                            dr2Var10.b(bArr8, 0, s11);
                                            bArr3 = bArr8;
                                        } else {
                                            bArr3 = null;
                                        }
                                        q1Var6.f10526l = true;
                                        q1Var6.f10528n = new p1(true, str, s10, bArr7, i54, i55, bArr3);
                                    }
                                }
                                int size5 = o0Var5.f9411c.size();
                                int i56 = 0;
                                while (i56 < size5) {
                                    p0 p0Var5 = o0Var5.f9411c.get(i56);
                                    if (p0Var5.f10494a == 1970628964) {
                                        dr2 dr2Var12 = p0Var5.f9963b;
                                        dr2Var12.f(8);
                                        bArr2 = bArr6;
                                        dr2Var12.b(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, F)) {
                                            f(dr2Var12, 16, q1Var6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i56++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                bArr5 = bArr;
                                size3 = i7;
                                pop = o0Var;
                                i26 = 8;
                                i31 = i8 + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        o0Var = pop;
                        i7 = size3;
                        i8 = i31;
                        bArr = bArr5;
                        bArr5 = bArr;
                        size3 = i7;
                        pop = o0Var;
                        i26 = 8;
                        i31 = i8 + 1;
                        sparseArray3 = sparseArray;
                    }
                    u74 b8 = b(pop.f9411c);
                    e1Var = this;
                    if (b8 != null) {
                        int size6 = e1Var.f4428b.size();
                        for (int i57 = 0; i57 < size6; i57++) {
                            c1 valueAt = e1Var.f4428b.valueAt(i57);
                            o1 o1Var5 = valueAt.f3681d.f10957a;
                            y0 y0Var5 = valueAt.f3679b.f10515a;
                            int i58 = n13.f8865a;
                            p1 a9 = o1Var5.a(y0Var5.f14472a);
                            u74 a10 = b8.a(a9 != null ? a9.f9984b : null);
                            bf4 b9 = valueAt.f3681d.f10957a.f9430f.b();
                            b9.b(a10);
                            valueAt.f3678a.b(b9.y());
                        }
                    }
                    if (e1Var.f4445s != -9223372036854775807L) {
                        int size7 = e1Var.f4428b.size();
                        for (int i59 = 0; i59 < size7; i59++) {
                            c1 valueAt2 = e1Var.f4428b.valueAt(i59);
                            long j14 = e1Var.f4445s;
                            int i60 = valueAt2.f3683f;
                            while (true) {
                                q1 q1Var7 = valueAt2.f3679b;
                                if (i60 < q1Var7.f10519e && q1Var7.a(i60) < j14) {
                                    if (valueAt2.f3679b.f10525k[i60]) {
                                        valueAt2.f3686i = i60;
                                    }
                                    i60++;
                                }
                            }
                        }
                        e1Var.f4445s = -9223372036854775807L;
                    }
                } else {
                    e1Var = e1Var2;
                    if (!e1Var.f4436j.isEmpty()) {
                        e1Var.f4436j.peek().e(pop);
                    }
                }
                e1Var2 = e1Var;
            }
        }
        d();
    }

    private static final y0 j(SparseArray<y0> sparseArray, int i7) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        y0 y0Var = sparseArray.get(i7);
        Objects.requireNonNull(y0Var);
        return y0Var;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean c(pc4 pc4Var) {
        return n1.a(pc4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0099, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x009c, code lost:
    
        if (r33.f4438l != 3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x009e, code lost:
    
        r3 = r2.b();
        r33.f4449w = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00a8, code lost:
    
        if (r2.f3683f >= r2.f3686i) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00aa, code lost:
    
        ((com.google.android.gms.internal.ads.jc4) r1).p(r3, false);
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00b3, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00b6, code lost:
    
        r3 = r2.f3679b.f10529o;
        r1 = r1.f9986d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00bc, code lost:
    
        if (r1 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00be, code lost:
    
        r3.g(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00c9, code lost:
    
        if (r2.f3679b.c(r2.f3683f) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00cb, code lost:
    
        r3.g(r3.w() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00d8, code lost:
    
        if (r2.k() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00da, code lost:
    
        r33.f4448v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00dc, code lost:
    
        r33.f4438l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00de, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00e7, code lost:
    
        if (r2.f3681d.f10957a.f9431g != 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00e9, code lost:
    
        r33.f4449w = r3 - 8;
        ((com.google.android.gms.internal.ads.jc4) r1).p(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0103, code lost:
    
        if ("audio/ac4".equals(r2.f3681d.f10957a.f9430f.f3660l) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0105, code lost:
    
        r33.f4450x = r2.c(r33.f4449w, 7);
        com.google.android.gms.internal.ads.wb4.b(r33.f4449w, r33.f4433g);
        com.google.android.gms.internal.ads.rd4.b(r2.f3678a, r33.f4433g, 7);
        r3 = r33.f4450x + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0126, code lost:
    
        r33.f4450x = r3;
        r33.f4449w += r3;
        r33.f4438l = 4;
        r33.f4451y = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0120, code lost:
    
        r3 = r2.c(r33.f4449w, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0132, code lost:
    
        r3 = r2.f3681d.f10957a;
        r5 = r2.f3678a;
        r10 = r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x013e, code lost:
    
        if (r3.f9434j != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0140, code lost:
    
        r3 = r33.f4450x;
        r4 = r33.f4449w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0144, code lost:
    
        if (r3 >= r4) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0146, code lost:
    
        r33.f4450x += com.google.android.gms.internal.ads.rd4.a(r5, r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0239, code lost:
    
        r20 = r2.a();
        r1 = r2.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0241, code lost:
    
        if (r1 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0243, code lost:
    
        r23 = r1.f9985c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x024a, code lost:
    
        r5.a(r10, r20, r33.f4449w, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x025d, code lost:
    
        if (r33.f4437k.isEmpty() != false) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x025f, code lost:
    
        r1 = r33.f4437k.removeFirst();
        r33.f4444r -= r1.f3151b;
        r3 = r1.f3150a + r10;
        r5 = r33.B;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0275, code lost:
    
        if (r8 >= r6) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0277, code lost:
    
        r5[r8].a(r3, 1, r1.f3151b, r33.f4444r, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x028f, code lost:
    
        if (r2.k() != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0291, code lost:
    
        r33.f4448v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0293, code lost:
    
        r33.f4438l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0248, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0151, code lost:
    
        r6 = r33.f4430d.h();
        r6[0] = 0;
        r6[1] = 0;
        r6[2] = 0;
        r13 = r3.f9434j;
        r14 = r13 + 1;
        r13 = 4 - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0169, code lost:
    
        if (r33.f4450x >= r33.f4449w) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x016b, code lost:
    
        r12 = r33.f4451y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x016f, code lost:
    
        if (r12 != 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0171, code lost:
    
        ((com.google.android.gms.internal.ads.jc4) r1).m(r6, r13, r14, r9);
        r33.f4430d.f(r9);
        r12 = r33.f4430d.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0182, code lost:
    
        if (r12 <= 0) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0184, code lost:
    
        r33.f4451y = r12 - 1;
        r33.f4429c.f(r9);
        com.google.android.gms.internal.ads.rd4.b(r5, r33.f4429c, 4);
        com.google.android.gms.internal.ads.rd4.b(r5, r33.f4430d, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x019b, code lost:
    
        if (r33.C.length <= 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x019d, code lost:
    
        r12 = r3.f9430f.f3660l;
        r17 = r6[4];
        r9 = com.google.android.gms.internal.ads.th2.f12217a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x01ab, code lost:
    
        if ("video/avc".equals(r12) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01af, code lost:
    
        if ((r17 & 31) == r4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x01b2, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x01c3, code lost:
    
        r33.f4452z = r9;
        r33.f4450x += 5;
        r33.f4449w += r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0235, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x01b8, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x01bf, code lost:
    
        if (((r17 & 126) >> r8) != 39) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x01c2, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x01d7, code lost:
    
        throw com.google.android.gms.internal.ads.dz.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x01da, code lost:
    
        if (r33.f4452z == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x01dc, code lost:
    
        r33.f4431e.c(r12);
        ((com.google.android.gms.internal.ads.jc4) r1).m(r33.f4431e.h(), 0, r33.f4451y, false);
        com.google.android.gms.internal.ads.rd4.b(r5, r33.f4431e, r33.f4451y);
        r4 = r33.f4451y;
        r8 = com.google.android.gms.internal.ads.th2.b(r33.f4431e.h(), r33.f4431e.l());
        r33.f4431e.f("video/hevc".equals(r3.f9430f.f3660l) ? 1 : 0);
        r33.f4431e.e(r8);
        com.google.android.gms.internal.ads.gc4.a(r10, r33.f4431e, r33.C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0229, code lost:
    
        r33.f4450x += r4;
        r33.f4451y -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0223, code lost:
    
        r4 = com.google.android.gms.internal.ads.rd4.a(r5, r1, r12, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x071b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.oc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(pc4 pc4Var, md4 md4Var) {
        long b7;
        int i7;
        long b8;
        dr2 dr2Var;
        boolean z6;
        boolean z7;
        long j7;
        long Z;
        long A;
        String str;
        String str2;
        long j8;
        long B;
        long B2;
        pc4 pc4Var2 = pc4Var;
        while (true) {
            int i8 = this.f4438l;
            int i9 = 1;
            ?? r9 = 0;
            if (i8 == 0) {
                if (this.f4441o == 0) {
                    if (!pc4Var2.m(this.f4435i.h(), 0, 8, true)) {
                        return -1;
                    }
                    this.f4441o = 8;
                    this.f4435i.f(0);
                    this.f4440n = this.f4435i.A();
                    this.f4439m = this.f4435i.m();
                }
                long j9 = this.f4440n;
                if (j9 == 1) {
                    ((jc4) pc4Var2).m(this.f4435i.h(), 8, 8, false);
                    this.f4441o += 8;
                    b7 = this.f4435i.B();
                } else {
                    if (j9 == 0) {
                        long c7 = pc4Var.c();
                        if (c7 == -1 && !this.f4436j.isEmpty()) {
                            c7 = this.f4436j.peek().f9410b;
                        }
                        if (c7 != -1) {
                            b7 = (c7 - pc4Var.b()) + this.f4441o;
                        }
                    }
                    if (this.f4440n >= this.f4441o) {
                        throw dz.c("Atom size less than header length (unsupported).");
                    }
                    long b9 = pc4Var.b() - this.f4441o;
                    int i10 = this.f4439m;
                    if ((i10 == 1836019558 || i10 == 1835295092) && !this.D) {
                        this.A.p(new od4(this.f4446t, b9));
                        this.D = true;
                    }
                    if (this.f4439m == 1836019558) {
                        int size = this.f4428b.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            q1 q1Var = this.f4428b.valueAt(i11).f3679b;
                            q1Var.f10517c = b9;
                            q1Var.f10516b = b9;
                        }
                    }
                    int i12 = this.f4439m;
                    if (i12 == 1835295092) {
                        this.f4448v = null;
                        this.f4443q = b9 + this.f4440n;
                        i7 = 2;
                    } else if (i12 == 1836019574 || i12 == 1953653099 || i12 == 1835297121 || i12 == 1835626086 || i12 == 1937007212 || i12 == 1836019558 || i12 == 1953653094 || i12 == 1836475768 || i12 == 1701082227) {
                        b8 = (pc4Var.b() + this.f4440n) - 8;
                        this.f4436j.push(new o0(this.f4439m, b8));
                        if (this.f4440n == this.f4441o) {
                            i(b8);
                        } else {
                            d();
                        }
                    } else {
                        if (i12 == 1751411826 || i12 == 1835296868 || i12 == 1836476516 || i12 == 1936286840 || i12 == 1937011556 || i12 == 1937011827 || i12 == 1668576371 || i12 == 1937011555 || i12 == 1937011578 || i12 == 1937013298 || i12 == 1937007471 || i12 == 1668232756 || i12 == 1937011571 || i12 == 1952867444 || i12 == 1952868452 || i12 == 1953196132 || i12 == 1953654136 || i12 == 1953658222 || i12 == 1886614376 || i12 == 1935763834 || i12 == 1935763823 || i12 == 1936027235 || i12 == 1970628964 || i12 == 1935828848 || i12 == 1936158820 || i12 == 1701606260 || i12 == 1835362404 || i12 == 1701671783) {
                            if (this.f4441o != 8) {
                                throw dz.c("Leaf atom defines extended atom size (unsupported).");
                            }
                            long j10 = this.f4440n;
                            if (j10 > 2147483647L) {
                                throw dz.c("Leaf atom with length > 2147483647 (unsupported).");
                            }
                            dr2Var = new dr2((int) j10);
                            System.arraycopy(this.f4435i.h(), 0, dr2Var.h(), 0, 8);
                        } else {
                            if (this.f4440n > 2147483647L) {
                                throw dz.c("Skipping atom with length > 2147483647 (unsupported).");
                            }
                            dr2Var = null;
                        }
                        this.f4442p = dr2Var;
                        i7 = 1;
                    }
                    this.f4438l = i7;
                }
                this.f4440n = b7;
                if (this.f4440n >= this.f4441o) {
                }
            } else if (i8 != 1) {
                long j11 = Long.MAX_VALUE;
                if (i8 != 2) {
                    c1 c1Var = this.f4448v;
                    if (c1Var != null) {
                        break;
                    }
                    SparseArray<c1> sparseArray = this.f4428b;
                    int size2 = sparseArray.size();
                    long j12 = Long.MAX_VALUE;
                    c1 c1Var2 = null;
                    for (int i13 = 0; i13 < size2; i13++) {
                        c1 valueAt = sparseArray.valueAt(i13);
                        z6 = valueAt.f3689l;
                        if (z6 || valueAt.f3683f != valueAt.f3681d.f10958b) {
                            z7 = valueAt.f3689l;
                            if (!z7 || valueAt.f3685h != valueAt.f3679b.f10518d) {
                                long d7 = valueAt.d();
                                if (d7 < j12) {
                                    c1Var2 = valueAt;
                                    j12 = d7;
                                }
                            }
                        }
                    }
                    if (c1Var2 == null) {
                        int b10 = (int) (this.f4443q - pc4Var.b());
                        if (b10 < 0) {
                            throw dz.a("Offset to end of mdat was negative.", null);
                        }
                        ((jc4) pc4Var2).p(b10, false);
                        d();
                    } else {
                        int d8 = (int) (c1Var2.d() - pc4Var.b());
                        if (d8 < 0) {
                            Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            d8 = 0;
                        }
                        ((jc4) pc4Var2).p(d8, false);
                        this.f4448v = c1Var2;
                        c1Var = c1Var2;
                    }
                } else {
                    int size3 = this.f4428b.size();
                    c1 c1Var3 = null;
                    for (int i14 = 0; i14 < size3; i14++) {
                        q1 q1Var2 = this.f4428b.valueAt(i14).f3679b;
                        if (q1Var2.f10530p) {
                            long j13 = q1Var2.f10517c;
                            if (j13 < j11) {
                                c1Var3 = this.f4428b.valueAt(i14);
                                j11 = j13;
                            }
                        }
                    }
                    if (c1Var3 == null) {
                        i7 = 3;
                        this.f4438l = i7;
                    } else {
                        int b11 = (int) (j11 - pc4Var.b());
                        if (b11 < 0) {
                            throw dz.a("Offset to encryption data was negative.", null);
                        }
                        jc4 jc4Var = (jc4) pc4Var2;
                        jc4Var.p(b11, false);
                        q1 q1Var3 = c1Var3.f3679b;
                        jc4Var.m(q1Var3.f10529o.h(), 0, q1Var3.f10529o.l(), false);
                        q1Var3.f10529o.f(0);
                        q1Var3.f10530p = false;
                    }
                }
            } else {
                int i15 = ((int) this.f4440n) - this.f4441o;
                dr2 dr2Var2 = this.f4442p;
                if (dr2Var2 != null) {
                    ((jc4) pc4Var2).m(dr2Var2.h(), 8, i15, false);
                    p0 p0Var = new p0(this.f4439m, dr2Var2);
                    long b12 = pc4Var.b();
                    if (this.f4436j.isEmpty()) {
                        int i16 = p0Var.f10494a;
                        if (i16 == 1936286840) {
                            dr2 dr2Var3 = p0Var.f9963b;
                            dr2Var3.f(8);
                            int m7 = dr2Var3.m();
                            dr2Var3.g(4);
                            long A2 = dr2Var3.A();
                            if (q0.a(m7) == 0) {
                                B = dr2Var3.A();
                                B2 = dr2Var3.A();
                            } else {
                                B = dr2Var3.B();
                                B2 = dr2Var3.B();
                            }
                            long j14 = b12 + B2;
                            long Z2 = n13.Z(B, 1000000L, A2);
                            dr2Var3.g(2);
                            int w6 = dr2Var3.w();
                            int[] iArr = new int[w6];
                            long[] jArr = new long[w6];
                            long[] jArr2 = new long[w6];
                            long[] jArr3 = new long[w6];
                            long j15 = Z2;
                            int i17 = 0;
                            while (i17 < w6) {
                                int m8 = dr2Var3.m();
                                if ((m8 & Integer.MIN_VALUE) != 0) {
                                    throw dz.a("Unhandled indirect reference", null);
                                }
                                long A3 = dr2Var3.A();
                                iArr[i17] = m8 & Integer.MAX_VALUE;
                                jArr[i17] = j14;
                                jArr3[i17] = j15;
                                long j16 = B + A3;
                                long[] jArr4 = jArr3;
                                int i18 = i17;
                                long[] jArr5 = jArr2;
                                j15 = n13.Z(j16, 1000000L, A2);
                                jArr5[i18] = j15 - jArr4[i18];
                                dr2Var3.g(4);
                                j14 += r1[i18];
                                i17 = i18 + 1;
                                iArr = iArr;
                                jArr = jArr;
                                jArr2 = jArr5;
                                jArr3 = jArr4;
                                w6 = w6;
                                B = j16;
                            }
                            Pair create = Pair.create(Long.valueOf(Z2), new hc4(iArr, jArr, jArr2, jArr3));
                            this.f4447u = ((Long) create.first).longValue();
                            this.A.p((pd4) create.second);
                            this.D = true;
                        } else if (i16 == 1701671783) {
                            dr2 dr2Var4 = p0Var.f9963b;
                            if (this.B.length != 0) {
                                dr2Var4.f(8);
                                int a7 = q0.a(dr2Var4.m());
                                if (a7 == 0) {
                                    String D = dr2Var4.D((char) 0);
                                    Objects.requireNonNull(D);
                                    String D2 = dr2Var4.D((char) 0);
                                    Objects.requireNonNull(D2);
                                    long A4 = dr2Var4.A();
                                    long Z3 = n13.Z(dr2Var4.A(), 1000000L, A4);
                                    long j17 = this.f4447u;
                                    j7 = j17 != -9223372036854775807L ? j17 + Z3 : -9223372036854775807L;
                                    Z = n13.Z(dr2Var4.A(), 1000L, A4);
                                    A = dr2Var4.A();
                                    str = D;
                                    str2 = D2;
                                    j8 = Z3;
                                } else if (a7 != 1) {
                                    StringBuilder sb = new StringBuilder(46);
                                    sb.append("Skipping unsupported emsg version: ");
                                    sb.append(a7);
                                    Log.w("FragmentedMp4Extractor", sb.toString());
                                } else {
                                    long A5 = dr2Var4.A();
                                    long Z4 = n13.Z(dr2Var4.B(), 1000000L, A5);
                                    long Z5 = n13.Z(dr2Var4.A(), 1000L, A5);
                                    long A6 = dr2Var4.A();
                                    String D3 = dr2Var4.D((char) 0);
                                    Objects.requireNonNull(D3);
                                    String D4 = dr2Var4.D((char) 0);
                                    Objects.requireNonNull(D4);
                                    Z = Z5;
                                    j7 = Z4;
                                    A = A6;
                                    str = D3;
                                    str2 = D4;
                                    j8 = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[dr2Var4.i()];
                                dr2Var4.b(bArr, 0, dr2Var4.i());
                                dr2 dr2Var5 = new dr2(this.f4434h.a(new xe4(str, str2, Z, A, bArr)));
                                int i19 = dr2Var5.i();
                                for (td4 td4Var : this.B) {
                                    dr2Var5.f(0);
                                    td4Var.e(dr2Var5, i19);
                                }
                                if (j7 == -9223372036854775807L) {
                                    this.f4437k.addLast(new b1(j8, i19));
                                    this.f4444r += i19;
                                } else {
                                    for (td4 td4Var2 : this.B) {
                                        td4Var2.a(j7, 1, i19, 0, null);
                                    }
                                }
                            }
                        }
                        pc4Var2 = pc4Var;
                    } else {
                        this.f4436j.peek().f(p0Var);
                    }
                } else {
                    ((jc4) pc4Var2).p(i15, false);
                }
                b8 = pc4Var.b();
                i(b8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void g(rc4 rc4Var) {
        this.A = rc4Var;
        d();
        td4[] td4VarArr = new td4[2];
        this.B = td4VarArr;
        int i7 = 0;
        td4[] td4VarArr2 = (td4[]) n13.B(td4VarArr, 0);
        this.B = td4VarArr2;
        for (td4 td4Var : td4VarArr2) {
            td4Var.b(G);
        }
        this.C = new td4[this.f4427a.size()];
        int i8 = 100;
        while (i7 < this.C.length) {
            int i9 = i8 + 1;
            td4 r7 = this.A.r(i8, 3);
            r7.b(this.f4427a.get(i7));
            this.C[i7] = r7;
            i7++;
            i8 = i9;
        }
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void h(long j7, long j8) {
        int size = this.f4428b.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f4428b.valueAt(i7).i();
        }
        this.f4437k.clear();
        this.f4444r = 0;
        this.f4445s = j8;
        this.f4436j.clear();
        d();
    }
}
