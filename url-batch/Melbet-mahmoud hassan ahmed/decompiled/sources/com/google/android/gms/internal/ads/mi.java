package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

/* loaded from: classes.dex */
public final class mi implements ch {

    /* renamed from: w, reason: collision with root package name */
    public static final eh f8569w = new ji();

    /* renamed from: x, reason: collision with root package name */
    private static final int f8570x = zm.g("seig");

    /* renamed from: y, reason: collision with root package name */
    private static final byte[] f8571y = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: j, reason: collision with root package name */
    private int f8581j;

    /* renamed from: k, reason: collision with root package name */
    private int f8582k;

    /* renamed from: l, reason: collision with root package name */
    private long f8583l;

    /* renamed from: m, reason: collision with root package name */
    private int f8584m;

    /* renamed from: n, reason: collision with root package name */
    private rm f8585n;

    /* renamed from: o, reason: collision with root package name */
    private long f8586o;

    /* renamed from: q, reason: collision with root package name */
    private li f8588q;

    /* renamed from: r, reason: collision with root package name */
    private int f8589r;

    /* renamed from: s, reason: collision with root package name */
    private int f8590s;

    /* renamed from: t, reason: collision with root package name */
    private int f8591t;

    /* renamed from: u, reason: collision with root package name */
    private dh f8592u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f8593v;

    /* renamed from: f, reason: collision with root package name */
    private final rm f8577f = new rm(16);

    /* renamed from: b, reason: collision with root package name */
    private final rm f8573b = new rm(pm.f10272a);

    /* renamed from: c, reason: collision with root package name */
    private final rm f8574c = new rm(5);

    /* renamed from: d, reason: collision with root package name */
    private final rm f8575d = new rm();

    /* renamed from: e, reason: collision with root package name */
    private final rm f8576e = new rm(1);

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f8578g = new byte[16];

    /* renamed from: h, reason: collision with root package name */
    private final Stack<yh> f8579h = new Stack<>();

    /* renamed from: i, reason: collision with root package name */
    private final LinkedList<ki> f8580i = new LinkedList<>();

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<li> f8572a = new SparseArray<>();

    /* renamed from: p, reason: collision with root package name */
    private long f8587p = -9223372036854775807L;

    public mi(int i7, vm vmVar, si siVar) {
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static yg a(List<zh> list) {
        Pair create;
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            zh zhVar = list.get(i7);
            int i8 = zhVar.f2825a;
            int i9 = ai.V;
            if (i8 == i9) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = zhVar.P0.f11225a;
                rm rmVar = new rm(bArr);
                if (rmVar.d() >= 32) {
                    rmVar.v(0);
                    if (rmVar.e() == rmVar.a() + 4 && rmVar.e() == i9) {
                        int b7 = ai.b(rmVar.e());
                        if (b7 > 1) {
                            StringBuilder sb = new StringBuilder(37);
                            sb.append("Unsupported pssh version: ");
                            sb.append(b7);
                            Log.w("PsshAtomUtil", sb.toString());
                        } else {
                            UUID uuid2 = new UUID(rmVar.l(), rmVar.l());
                            if (b7 == 1) {
                                rmVar.w(rmVar.i() * 16);
                            }
                            int i10 = rmVar.i();
                            if (i10 == rmVar.a()) {
                                byte[] bArr2 = new byte[i10];
                                rmVar.q(bArr2, 0, i10);
                                create = Pair.create(uuid2, bArr2);
                                uuid = create != null ? null : (UUID) create.first;
                                if (uuid != null) {
                                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                } else {
                                    arrayList.add(new xg(uuid, "video/mp4", bArr, false));
                                }
                            }
                        }
                    }
                }
                create = null;
                if (create != null) {
                }
                if (uuid != null) {
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new yg(arrayList);
    }

    private final void c() {
        this.f8581j = 0;
        this.f8584m = 0;
    }

    private static void g(rm rmVar, int i7, vi viVar) {
        rmVar.v(i7 + 8);
        int a7 = ai.a(rmVar.e());
        if ((a7 & 1) != 0) {
            throw new af("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z6 = (a7 & 2) != 0;
        int i8 = rmVar.i();
        int i9 = viVar.f13387e;
        if (i8 == i9) {
            Arrays.fill(viVar.f13395m, 0, i8, z6);
            viVar.a(rmVar.a());
            rmVar.q(viVar.f13398p.f11225a, 0, viVar.f13397o);
            viVar.f13398p.v(0);
            viVar.f13399q = false;
            return;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Length mismatch: ");
        sb.append(i8);
        sb.append(", ");
        sb.append(i9);
        throw new af(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:284:0x0629, code lost:
    
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x062d, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0346  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void h(long j7) {
        si a7;
        mi miVar;
        yh yhVar;
        SparseArray<li> sparseArray;
        int i7;
        int i8;
        byte[] bArr;
        vi viVar;
        int size;
        int i9;
        byte[] bArr2;
        int i10;
        yh yhVar2;
        int i11;
        byte[] bArr3;
        int i12;
        yh yhVar3;
        vi viVar2;
        List<zh> list;
        li liVar;
        int i13;
        int i14;
        long j8;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        loop0: while (true) {
            mi miVar2 = this;
            while (!miVar2.f8579h.isEmpty() && miVar2.f8579h.peek().P0 == j7) {
                yh pop = miVar2.f8579h.pop();
                int i22 = pop.f2825a;
                int i23 = 12;
                int i24 = 8;
                if (i22 == ai.C) {
                    yg a8 = a(pop.Q0);
                    yh d7 = pop.d(ai.N);
                    SparseArray sparseArray2 = new SparseArray();
                    int size2 = d7.Q0.size();
                    long j9 = -9223372036854775807L;
                    int i25 = 0;
                    while (i25 < size2) {
                        zh zhVar = d7.Q0.get(i25);
                        int i26 = zhVar.f2825a;
                        if (i26 == ai.f2823z) {
                            rm rmVar = zhVar.P0;
                            rmVar.v(i23);
                            Pair create = Pair.create(Integer.valueOf(rmVar.e()), new ii(rmVar.i() - 1, rmVar.i(), rmVar.i(), rmVar.e()));
                            sparseArray2.put(((Integer) create.first).intValue(), (ii) create.second);
                        } else if (i26 == ai.O) {
                            rm rmVar2 = zhVar.P0;
                            rmVar2.v(8);
                            j9 = ai.b(rmVar2.e()) == 0 ? rmVar2.m() : rmVar2.n();
                        }
                        i25++;
                        i23 = 12;
                    }
                    SparseArray sparseArray3 = new SparseArray();
                    int size3 = pop.R0.size();
                    for (int i27 = 0; i27 < size3; i27++) {
                        yh yhVar4 = pop.R0.get(i27);
                        if (yhVar4.f2825a == ai.E && (a7 = hi.a(yhVar4, pop.e(ai.D), j9, a8, false)) != null) {
                            sparseArray3.put(a7.f11828a, a7);
                        }
                    }
                    int size4 = sparseArray3.size();
                    if (miVar2.f8572a.size() == 0) {
                        for (int i28 = 0; i28 < size4; i28++) {
                            si siVar = (si) sparseArray3.valueAt(i28);
                            li liVar2 = new li(miVar2.f8592u.c(i28, siVar.f11829b));
                            liVar2.a(siVar, (ii) sparseArray2.get(siVar.f11828a));
                            miVar2.f8572a.put(siVar.f11828a, liVar2);
                            miVar2.f8587p = Math.max(miVar2.f8587p, siVar.f11832e);
                        }
                        miVar2.f8592u.a();
                    } else {
                        jm.e(miVar2.f8572a.size() == size4);
                        for (int i29 = 0; i29 < size4; i29++) {
                            si siVar2 = (si) sparseArray3.valueAt(i29);
                            miVar2.f8572a.get(siVar2.f11828a).a(siVar2, (ii) sparseArray2.get(siVar2.f11828a));
                        }
                    }
                } else {
                    if (i22 == ai.L) {
                        SparseArray<li> sparseArray4 = miVar2.f8572a;
                        byte[] bArr4 = miVar2.f8578g;
                        int size5 = pop.R0.size();
                        int i30 = 0;
                        while (i30 < size5) {
                            yh yhVar5 = pop.R0.get(i30);
                            if (yhVar5.f2825a == ai.M) {
                                rm rmVar3 = yhVar5.e(ai.f2821y).P0;
                                rmVar3.v(i24);
                                int a9 = ai.a(rmVar3.e());
                                li liVar3 = sparseArray4.get(rmVar3.e());
                                if (liVar3 == null) {
                                    liVar3 = null;
                                } else {
                                    if ((a9 & 1) != 0) {
                                        long n7 = rmVar3.n();
                                        vi viVar3 = liVar3.f7976a;
                                        viVar3.f13384b = n7;
                                        viVar3.f13385c = n7;
                                    }
                                    ii iiVar = liVar3.f7979d;
                                    liVar3.f7976a.f13383a = new ii((a9 & 2) != 0 ? rmVar3.i() - 1 : iiVar.f6655a, (a9 & 8) != 0 ? rmVar3.i() : iiVar.f6656b, (a9 & 16) != 0 ? rmVar3.i() : iiVar.f6657c, (a9 & 32) != 0 ? rmVar3.i() : iiVar.f6658d);
                                }
                                if (liVar3 != null) {
                                    vi viVar4 = liVar3.f7976a;
                                    long j10 = viVar4.f13400r;
                                    liVar3.b();
                                    int i31 = ai.f2819x;
                                    if (yhVar5.e(i31) != null) {
                                        rm rmVar4 = yhVar5.e(i31).P0;
                                        rmVar4.v(i24);
                                        j10 = ai.b(rmVar4.e()) == r7 ? rmVar4.n() : rmVar4.m();
                                    }
                                    List<zh> list2 = yhVar5.Q0;
                                    int size6 = list2.size();
                                    int i32 = 0;
                                    int i33 = 0;
                                    int i34 = 0;
                                    while (i34 < size6) {
                                        SparseArray<li> sparseArray5 = sparseArray4;
                                        zh zhVar2 = list2.get(i34);
                                        int i35 = size5;
                                        long j11 = j10;
                                        if (zhVar2.f2825a == ai.A) {
                                            rm rmVar5 = zhVar2.P0;
                                            rmVar5.v(12);
                                            int i36 = rmVar5.i();
                                            if (i36 > 0) {
                                                i32 += i36;
                                                i33++;
                                            }
                                        }
                                        i34++;
                                        size5 = i35;
                                        sparseArray4 = sparseArray5;
                                        j10 = j11;
                                    }
                                    sparseArray = sparseArray4;
                                    i7 = size5;
                                    long j12 = j10;
                                    liVar3.f7982g = 0;
                                    liVar3.f7981f = 0;
                                    liVar3.f7980e = 0;
                                    vi viVar5 = liVar3.f7976a;
                                    viVar5.f13386d = i33;
                                    viVar5.f13387e = i32;
                                    int[] iArr = viVar5.f13389g;
                                    if (iArr == null || iArr.length < i33) {
                                        viVar5.f13388f = new long[i33];
                                        viVar5.f13389g = new int[i33];
                                    }
                                    int[] iArr2 = viVar5.f13390h;
                                    if (iArr2 == null || iArr2.length < i32) {
                                        int i37 = (i32 * 125) / 100;
                                        viVar5.f13390h = new int[i37];
                                        viVar5.f13391i = new int[i37];
                                        viVar5.f13392j = new long[i37];
                                        viVar5.f13393k = new boolean[i37];
                                        viVar5.f13395m = new boolean[i37];
                                    }
                                    int i38 = 0;
                                    int i39 = 0;
                                    int i40 = 0;
                                    while (i38 < size6) {
                                        zh zhVar3 = list2.get(i38);
                                        if (zhVar3.f2825a == ai.A) {
                                            int i41 = i40 + 1;
                                            rm rmVar6 = zhVar3.P0;
                                            rmVar6.v(8);
                                            int a10 = ai.a(rmVar6.e());
                                            si siVar3 = liVar3.f7978c;
                                            list = list2;
                                            vi viVar6 = liVar3.f7976a;
                                            ii iiVar2 = viVar6.f13383a;
                                            i13 = size6;
                                            viVar6.f13389g[i40] = rmVar6.i();
                                            long[] jArr = viVar6.f13388f;
                                            yhVar2 = pop;
                                            long j13 = viVar6.f13384b;
                                            jArr[i40] = j13;
                                            if ((a10 & 1) != 0) {
                                                i12 = i30;
                                                yhVar3 = yhVar5;
                                                viVar2 = viVar4;
                                                jArr[i40] = j13 + rmVar6.e();
                                            } else {
                                                i12 = i30;
                                                yhVar3 = yhVar5;
                                                viVar2 = viVar4;
                                            }
                                            int i42 = a10 & 4;
                                            int i43 = iiVar2.f6658d;
                                            if (i42 != 0) {
                                                i43 = rmVar6.i();
                                            }
                                            int i44 = a10 & 256;
                                            int i45 = a10 & 512;
                                            int i46 = a10 & 1024;
                                            int i47 = a10 & 2048;
                                            long[] jArr2 = siVar3.f11836i;
                                            int i48 = i43;
                                            if (jArr2 != null) {
                                                bArr3 = bArr4;
                                                if (jArr2.length == 1 && jArr2[0] == 0) {
                                                    i14 = i38;
                                                    j8 = zm.j(siVar3.f11837j[0], 1000L, siVar3.f11830c);
                                                    int[] iArr3 = viVar6.f13390h;
                                                    int[] iArr4 = viVar6.f13391i;
                                                    long[] jArr3 = viVar6.f13392j;
                                                    liVar = liVar3;
                                                    boolean[] zArr = viVar6.f13393k;
                                                    i11 = i14;
                                                    i15 = viVar6.f13389g[i40] + i39;
                                                    long j14 = siVar3.f11830c;
                                                    long j15 = i40 <= 0 ? viVar6.f13400r : j12;
                                                    while (i39 < i15) {
                                                        int i49 = i44 != 0 ? rmVar6.i() : iiVar2.f6656b;
                                                        if (i45 != 0) {
                                                            i16 = i15;
                                                            i17 = rmVar6.i();
                                                        } else {
                                                            i16 = i15;
                                                            i17 = iiVar2.f6657c;
                                                        }
                                                        if (i39 == 0) {
                                                            if (i42 != 0) {
                                                                i18 = i42;
                                                                i19 = i48;
                                                                i39 = 0;
                                                                int i50 = i44;
                                                                if (i47 == 0) {
                                                                    i20 = i45;
                                                                    i21 = i46;
                                                                    iArr4[i39] = (int) ((rmVar6.e() * 1000) / j14);
                                                                } else {
                                                                    i20 = i45;
                                                                    i21 = i46;
                                                                    iArr4[i39] = 0;
                                                                }
                                                                jArr3[i39] = zm.j(j15, 1000L, j14) - j8;
                                                                iArr3[i39] = i17;
                                                                zArr[i39] = 1 != (((i19 >> 16) & 1) ^ 1);
                                                                j15 += i49;
                                                                i39++;
                                                                i15 = i16;
                                                                i42 = i18;
                                                                i44 = i50;
                                                                i45 = i20;
                                                                i46 = i21;
                                                            } else {
                                                                i39 = 0;
                                                            }
                                                        }
                                                        if (i46 != 0) {
                                                            i18 = i42;
                                                            i19 = rmVar6.e();
                                                        } else {
                                                            i18 = i42;
                                                            i19 = iiVar2.f6658d;
                                                        }
                                                        int i502 = i44;
                                                        if (i47 == 0) {
                                                        }
                                                        jArr3[i39] = zm.j(j15, 1000L, j14) - j8;
                                                        iArr3[i39] = i17;
                                                        zArr[i39] = 1 != (((i19 >> 16) & 1) ^ 1);
                                                        j15 += i49;
                                                        i39++;
                                                        i15 = i16;
                                                        i42 = i18;
                                                        i44 = i502;
                                                        i45 = i20;
                                                        i46 = i21;
                                                    }
                                                    viVar6.f13400r = j15;
                                                    i40 = i41;
                                                    i39 = i15;
                                                }
                                            } else {
                                                bArr3 = bArr4;
                                            }
                                            i14 = i38;
                                            j8 = 0;
                                            int[] iArr32 = viVar6.f13390h;
                                            int[] iArr42 = viVar6.f13391i;
                                            long[] jArr32 = viVar6.f13392j;
                                            liVar = liVar3;
                                            boolean[] zArr2 = viVar6.f13393k;
                                            i11 = i14;
                                            i15 = viVar6.f13389g[i40] + i39;
                                            long j142 = siVar3.f11830c;
                                            if (i40 <= 0) {
                                            }
                                            while (i39 < i15) {
                                            }
                                            viVar6.f13400r = j15;
                                            i40 = i41;
                                            i39 = i15;
                                        } else {
                                            yhVar2 = pop;
                                            i11 = i38;
                                            bArr3 = bArr4;
                                            i12 = i30;
                                            yhVar3 = yhVar5;
                                            viVar2 = viVar4;
                                            list = list2;
                                            liVar = liVar3;
                                            i13 = size6;
                                        }
                                        i38 = i11 + 1;
                                        list2 = list;
                                        size6 = i13;
                                        pop = yhVar2;
                                        i30 = i12;
                                        yhVar5 = yhVar3;
                                        viVar4 = viVar2;
                                        bArr4 = bArr3;
                                        liVar3 = liVar;
                                    }
                                    yhVar = pop;
                                    byte[] bArr5 = bArr4;
                                    i8 = i30;
                                    vi viVar7 = viVar4;
                                    li liVar4 = liVar3;
                                    zh e7 = yhVar5.e(ai.f2780d0);
                                    if (e7 != null) {
                                        viVar = viVar7;
                                        ti tiVar = liVar4.f7978c.f11835h[viVar.f13383a.f6655a];
                                        rm rmVar7 = e7.P0;
                                        int i51 = tiVar.f12221a;
                                        rmVar7.v(8);
                                        if ((ai.a(rmVar7.e()) & 1) == 1) {
                                            rmVar7.w(8);
                                        }
                                        int g7 = rmVar7.g();
                                        int i52 = rmVar7.i();
                                        int i53 = viVar.f13387e;
                                        if (i52 != i53) {
                                            StringBuilder sb = new StringBuilder(41);
                                            sb.append("Length mismatch: ");
                                            sb.append(i52);
                                            sb.append(", ");
                                            sb.append(i53);
                                            throw new af(sb.toString());
                                        }
                                        if (g7 == 0) {
                                            boolean[] zArr3 = viVar.f13395m;
                                            i10 = 0;
                                            for (int i54 = 0; i54 < i52; i54++) {
                                                int g8 = rmVar7.g();
                                                i10 += g8;
                                                zArr3[i54] = g8 > i51;
                                            }
                                        } else {
                                            i10 = g7 * i52;
                                            Arrays.fill(viVar.f13395m, 0, i52, g7 > i51);
                                        }
                                        viVar.a(i10);
                                    } else {
                                        viVar = viVar7;
                                    }
                                    zh e8 = yhVar5.e(ai.f2782e0);
                                    if (e8 != null) {
                                        rm rmVar8 = e8.P0;
                                        rmVar8.v(8);
                                        int e9 = rmVar8.e();
                                        if ((ai.a(e9) & 1) == 1) {
                                            rmVar8.w(8);
                                        }
                                        int i55 = rmVar8.i();
                                        if (i55 != 1) {
                                            StringBuilder sb2 = new StringBuilder(40);
                                            sb2.append("Unexpected saio entry count: ");
                                            sb2.append(i55);
                                            throw new af(sb2.toString());
                                        }
                                        viVar.f13385c += ai.b(e9) == 0 ? rmVar8.m() : rmVar8.n();
                                    }
                                    zh e10 = yhVar5.e(ai.f2790i0);
                                    if (e10 != null) {
                                        g(e10.P0, 0, viVar);
                                    }
                                    zh e11 = yhVar5.e(ai.f2784f0);
                                    zh e12 = yhVar5.e(ai.f2786g0);
                                    if (e11 != null && e12 != null) {
                                        rm rmVar9 = e11.P0;
                                        rm rmVar10 = e12.P0;
                                        rmVar9.v(8);
                                        int e13 = rmVar9.e();
                                        int e14 = rmVar9.e();
                                        int i56 = f8570x;
                                        if (e14 == i56) {
                                            if (ai.b(e13) == 1) {
                                                rmVar9.w(4);
                                            }
                                            if (rmVar9.e() != 1) {
                                                throw new af("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            rmVar10.v(8);
                                            int e15 = rmVar10.e();
                                            if (rmVar10.e() == i56) {
                                                int b7 = ai.b(e15);
                                                if (b7 == 1) {
                                                    if (rmVar10.m() == 0) {
                                                        throw new af("Variable length decription in sgpd found (unsupported)");
                                                    }
                                                } else if (b7 >= 2) {
                                                    rmVar10.w(4);
                                                }
                                                if (rmVar10.m() != 1) {
                                                    throw new af("Entry count in sgpd != 1 (unsupported).");
                                                }
                                                rmVar10.w(2);
                                                if (rmVar10.g() == 1) {
                                                    int g9 = rmVar10.g();
                                                    byte[] bArr6 = new byte[16];
                                                    rmVar10.q(bArr6, 0, 16);
                                                    viVar.f13394l = true;
                                                    viVar.f13396n = new ti(true, g9, bArr6);
                                                }
                                                size = yhVar5.Q0.size();
                                                i9 = 0;
                                                while (i9 < size) {
                                                    zh zhVar4 = yhVar5.Q0.get(i9);
                                                    if (zhVar4.f2825a == ai.f2788h0) {
                                                        rm rmVar11 = zhVar4.P0;
                                                        rmVar11.v(8);
                                                        bArr2 = bArr5;
                                                        rmVar11.q(bArr2, 0, 16);
                                                        if (Arrays.equals(bArr2, f8571y)) {
                                                            g(rmVar11, 16, viVar);
                                                        }
                                                    } else {
                                                        bArr2 = bArr5;
                                                    }
                                                    i9++;
                                                    bArr5 = bArr2;
                                                }
                                                bArr = bArr5;
                                                i24 = 8;
                                                bArr4 = bArr;
                                                size5 = i7;
                                                sparseArray4 = sparseArray;
                                                pop = yhVar;
                                                r7 = true;
                                                i30 = i8 + 1;
                                            }
                                        }
                                    }
                                    size = yhVar5.Q0.size();
                                    i9 = 0;
                                    while (i9 < size) {
                                    }
                                    bArr = bArr5;
                                    i24 = 8;
                                    bArr4 = bArr;
                                    size5 = i7;
                                    sparseArray4 = sparseArray;
                                    pop = yhVar;
                                    r7 = true;
                                    i30 = i8 + 1;
                                }
                            }
                            yhVar = pop;
                            sparseArray = sparseArray4;
                            i7 = size5;
                            i8 = i30;
                            bArr = bArr4;
                            bArr4 = bArr;
                            size5 = i7;
                            sparseArray4 = sparseArray;
                            pop = yhVar;
                            r7 = true;
                            i30 = i8 + 1;
                        }
                        yg a11 = a(pop.Q0);
                        if (a11 != null) {
                            miVar = this;
                            int size7 = miVar.f8572a.size();
                            for (int i57 = 0; i57 < size7; i57++) {
                                li valueAt = miVar.f8572a.valueAt(i57);
                                valueAt.f7977b.b(valueAt.f7978c.f11833f.g(a11));
                            }
                        }
                    } else {
                        miVar = miVar2;
                        if (!miVar.f8579h.isEmpty()) {
                            miVar.f8579h.peek().f(pop);
                        }
                    }
                    miVar2 = miVar;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void b(long j7, long j8) {
        int size = this.f8572a.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f8572a.valueAt(i7).b();
        }
        this.f8580i.clear();
        this.f8579h.clear();
        c();
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final boolean d(bh bhVar) {
        return ri.a(bhVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x007f, code lost:
    
        r2 = r24.f8588q;
        r3 = r2.f7976a;
        r5 = r3.f13390h;
        r9 = r2.f7980e;
        r5 = r5[r9];
        r24.f8589r = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x008d, code lost:
    
        if (r3.f13394l == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x008f, code lost:
    
        r5 = r3.f13398p;
        r10 = r3.f13383a.f6655a;
        r11 = r3.f13396n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0097, code lost:
    
        if (r11 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x009a, code lost:
    
        r11 = r2.f7978c.f11835h[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x00a0, code lost:
    
        r10 = r11.f12221a;
        r3 = r3.f13395m[r9];
        r9 = r24.f8576e;
        r11 = r9.f11225a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x00aa, code lost:
    
        if (true == r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x00ac, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x00b0, code lost:
    
        r11[0] = (byte) (r12 | r10);
        r9.v(0);
        r2 = r2.f7977b;
        r2.c(r24.f8576e, 1);
        r2.c(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x00c1, code lost:
    
        if (r3 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x00c3, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x00d5, code lost:
    
        r24.f8590s = r10;
        r5 = r24.f8589r + r10;
        r24.f8589r = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x00e6, code lost:
    
        if (r24.f8588q.f7978c.f11834g != 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x00e8, code lost:
    
        r24.f8589r = r5 - 8;
        r1.i(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x00ef, code lost:
    
        r24.f8581j = 4;
        r24.f8591t = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x00f4, code lost:
    
        r2 = r24.f8588q;
        r3 = r2.f7976a;
        r5 = r2.f7978c;
        r9 = r2.f7977b;
        r2 = r2.f7980e;
        r6 = r5.f11838k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0100, code lost:
    
        if (r6 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0102, code lost:
    
        r4 = r24.f8590s;
        r6 = r24.f8589r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0106, code lost:
    
        if (r4 >= r6) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0108, code lost:
    
        r24.f8590s += r9.d(r1, r6 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0169, code lost:
    
        r10 = (r3.f13392j[r2] + r3.f13391i[r2]) * 1000;
        r1 = r3.f13394l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0179, code lost:
    
        if (true == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x017b, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x017f, code lost:
    
        r12 = r4 | (r3.f13393k[r2] ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0185, code lost:
    
        if (r1 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0187, code lost:
    
        r1 = r3.f13396n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0189, code lost:
    
        if (r1 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x018b, code lost:
    
        r1 = r5.f11835h[r3.f13383a.f6655a];
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0193, code lost:
    
        r2 = r24.f8588q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0197, code lost:
    
        if (r1 == r2.f7984i) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0199, code lost:
    
        r2 = new com.google.android.gms.internal.ads.kh(1, r1.f12222b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01a3, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x01a7, code lost:
    
        r2 = r24.f8588q;
        r2.f7983h = r15;
        r2.f7984i = r1;
        r9.a(r10, r12, r24.f8589r, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x01b9, code lost:
    
        if (r24.f8580i.isEmpty() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01bb, code lost:
    
        r1 = r24.f8588q;
        r1.f7980e++;
        r2 = r1.f7981f + 1;
        r1.f7981f = r2;
        r3 = r3.f13389g;
        r4 = r1.f7982g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01cd, code lost:
    
        if (r2 != r3[r4]) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01cf, code lost:
    
        r1.f7982g = r4 + 1;
        r1.f7981f = 0;
        r24.f8588q = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01d7, code lost:
    
        r24.f8581j = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01da, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01db, code lost:
    
        r2 = r24.f8580i.removeFirst().f7519a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01e6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x01a1, code lost:
    
        r2 = r2.f7983h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x01a5, code lost:
    
        r1 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x017d, code lost:
    
        r4 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0113, code lost:
    
        r10 = r24.f8574c.f11225a;
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r4 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0126, code lost:
    
        if (r24.f8590s >= r24.f8589r) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0128, code lost:
    
        r11 = r24.f8591t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x012a, code lost:
    
        if (r11 != 0) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x015a, code lost:
    
        r11 = r9.d(r1, r11, false);
        r24.f8590s += r11;
        r24.f8591t -= r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x012c, code lost:
    
        r1.h(r10, r6, r4, false);
        r24.f8574c.v(0);
        r24.f8591t = r24.f8574c.i() - 1;
        r24.f8573b.v(0);
        r9.c(r24.f8573b, 4);
        r9.c(r24.f8574c, 1);
        r24.f8590s += 5;
        r24.f8589r += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x00c5, code lost:
    
        r3 = r5.j();
        r5.w(-2);
        r3 = (r3 * 6) + 2;
        r2.c(r5, r3);
        r10 = (r10 + 1) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x00ae, code lost:
    
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x00de, code lost:
    
        r24.f8590s = 0;
     */
    @Override // com.google.android.gms.internal.ads.ch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(bh bhVar, hh hhVar) {
        int i7;
        long d7;
        long n7;
        long n8;
        bh bhVar2 = bhVar;
        while (true) {
            int i8 = this.f8581j;
            int i9 = 0;
            if (i8 == 0) {
                if (this.f8584m == 0) {
                    if (!bhVar2.h(this.f8577f.f11225a, 0, 8, true)) {
                        return -1;
                    }
                    this.f8584m = 8;
                    this.f8577f.v(0);
                    this.f8583l = this.f8577f.m();
                    this.f8582k = this.f8577f.e();
                }
                long j7 = this.f8583l;
                if (j7 == 1) {
                    bhVar2.h(this.f8577f.f11225a, 8, 8, false);
                    this.f8584m += 8;
                    j7 = this.f8577f.n();
                    this.f8583l = j7;
                }
                if (j7 < this.f8584m) {
                    throw new af("Atom size less than header length (unsupported).");
                }
                long d8 = bhVar.d() - this.f8584m;
                if (this.f8582k == ai.L) {
                    int size = this.f8572a.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        vi viVar = this.f8572a.valueAt(i10).f7976a;
                        viVar.f13385c = d8;
                        viVar.f13384b = d8;
                    }
                }
                int i11 = this.f8582k;
                if (i11 == ai.f2789i) {
                    this.f8588q = null;
                    this.f8586o = d8 + this.f8583l;
                    if (!this.f8593v) {
                        this.f8592u.b(new ih(this.f8587p));
                        this.f8593v = true;
                    }
                    this.f8581j = 2;
                } else if (i11 == ai.C || i11 == ai.E || i11 == ai.F || i11 == ai.G || i11 == ai.H || i11 == ai.L || i11 == ai.M || i11 == ai.N || i11 == ai.Q) {
                    d7 = (bhVar.d() + this.f8583l) - 8;
                    this.f8579h.add(new yh(this.f8582k, d7));
                    if (this.f8583l == this.f8584m) {
                        h(d7);
                    } else {
                        c();
                    }
                } else {
                    if (i11 == ai.T || i11 == ai.S || i11 == ai.D || i11 == ai.B || i11 == ai.U || i11 == ai.f2819x || i11 == ai.f2821y || i11 == ai.P || i11 == ai.f2823z || i11 == ai.A || i11 == ai.V || i11 == ai.f2780d0 || i11 == ai.f2782e0 || i11 == ai.f2790i0 || i11 == ai.f2788h0 || i11 == ai.f2784f0 || i11 == ai.f2786g0 || i11 == ai.R || i11 == ai.O || i11 == ai.G0) {
                        if (this.f8584m != 8) {
                            throw new af("Leaf atom defines extended atom size (unsupported).");
                        }
                        long j8 = this.f8583l;
                        if (j8 > 2147483647L) {
                            throw new af("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        rm rmVar = new rm((int) j8);
                        this.f8585n = rmVar;
                        System.arraycopy(this.f8577f.f11225a, 0, rmVar.f11225a, 0, 8);
                    } else {
                        if (this.f8583l > 2147483647L) {
                            throw new af("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f8585n = null;
                    }
                    i7 = 1;
                    this.f8581j = i7;
                }
            } else if (i8 != 1) {
                long j9 = Long.MAX_VALUE;
                if (i8 != 2) {
                    if (i8 != 3) {
                        break;
                    }
                    if (this.f8588q != null) {
                        break;
                    }
                    SparseArray<li> sparseArray = this.f8572a;
                    int size2 = sparseArray.size();
                    li liVar = null;
                    for (int i12 = 0; i12 < size2; i12++) {
                        li valueAt = sparseArray.valueAt(i12);
                        int i13 = valueAt.f7982g;
                        vi viVar2 = valueAt.f7976a;
                        if (i13 != viVar2.f13386d) {
                            long j10 = viVar2.f13388f[i13];
                            if (j10 < j9) {
                                liVar = valueAt;
                                j9 = j10;
                            }
                        }
                    }
                    if (liVar == null) {
                        int d9 = (int) (this.f8586o - bhVar.d());
                        if (d9 < 0) {
                            throw new af("Offset to end of mdat was negative.");
                        }
                        bhVar2.i(d9, false);
                        c();
                    } else {
                        int d10 = (int) (liVar.f7976a.f13388f[liVar.f7982g] - bhVar.d());
                        if (d10 < 0) {
                            Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            d10 = 0;
                        }
                        bhVar2.i(d10, false);
                        this.f8588q = liVar;
                    }
                } else {
                    int size3 = this.f8572a.size();
                    li liVar2 = null;
                    for (int i14 = 0; i14 < size3; i14++) {
                        vi viVar3 = this.f8572a.valueAt(i14).f7976a;
                        if (viVar3.f13399q) {
                            long j11 = viVar3.f13385c;
                            if (j11 < j9) {
                                liVar2 = this.f8572a.valueAt(i14);
                                j9 = j11;
                            }
                        }
                    }
                    if (liVar2 == null) {
                        i7 = 3;
                        this.f8581j = i7;
                    } else {
                        int d11 = (int) (j9 - bhVar.d());
                        if (d11 < 0) {
                            throw new af("Offset to encryption data was negative.");
                        }
                        bhVar2.i(d11, false);
                        vi viVar4 = liVar2.f7976a;
                        bhVar2.h(viVar4.f13398p.f11225a, 0, viVar4.f13397o, false);
                        viVar4.f13398p.v(0);
                        viVar4.f13399q = false;
                    }
                }
            } else {
                int i15 = ((int) this.f8583l) - this.f8584m;
                rm rmVar2 = this.f8585n;
                if (rmVar2 != null) {
                    bhVar2.h(rmVar2.f11225a, 8, i15, false);
                    zh zhVar = new zh(this.f8582k, this.f8585n);
                    long d12 = bhVar.d();
                    if (this.f8579h.isEmpty()) {
                        if (zhVar.f2825a == ai.B) {
                            rm rmVar3 = zhVar.P0;
                            rmVar3.v(8);
                            int e7 = rmVar3.e();
                            rmVar3.w(4);
                            long m7 = rmVar3.m();
                            if (ai.b(e7) == 0) {
                                n7 = rmVar3.m();
                                n8 = rmVar3.m();
                            } else {
                                n7 = rmVar3.n();
                                n8 = rmVar3.n();
                            }
                            long j12 = d12 + n8;
                            long j13 = n7;
                            long j14 = zm.j(j13, 1000000L, m7);
                            rmVar3.w(2);
                            int j15 = rmVar3.j();
                            int[] iArr = new int[j15];
                            long[] jArr = new long[j15];
                            long[] jArr2 = new long[j15];
                            long[] jArr3 = new long[j15];
                            long j16 = j14;
                            while (i9 < j15) {
                                int e8 = rmVar3.e();
                                if ((e8 & Integer.MIN_VALUE) != 0) {
                                    throw new af("Unhandled indirect reference");
                                }
                                long m8 = rmVar3.m();
                                iArr[i9] = e8 & Integer.MAX_VALUE;
                                jArr[i9] = j12;
                                jArr3[i9] = j16;
                                j13 += m8;
                                int i16 = j15;
                                long[] jArr4 = jArr2;
                                long[] jArr5 = jArr3;
                                j16 = zm.j(j13, 1000000L, m7);
                                jArr4[i9] = j16 - jArr5[i9];
                                rmVar3.w(4);
                                j12 += iArr[i9];
                                i9++;
                                jArr = jArr;
                                jArr3 = jArr5;
                                jArr2 = jArr4;
                                j15 = i16;
                            }
                            Pair create = Pair.create(Long.valueOf(j14), new ah(iArr, jArr, jArr2, jArr3));
                            ((Long) create.first).longValue();
                            this.f8592u.b((jh) create.second);
                            this.f8593v = true;
                        }
                        bhVar2 = bhVar;
                    } else {
                        this.f8579h.peek().g(zhVar);
                    }
                } else {
                    bhVar2.i(i15, false);
                }
                d7 = bhVar.d();
                h(d7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void f(dh dhVar) {
        this.f8592u = dhVar;
    }
}
