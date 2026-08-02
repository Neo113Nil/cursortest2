package T0;

import E1.N;
import W.G;
import W.J;
import W.u;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import e0.t;
import f1.C;
import f1.D;
import f1.E;
import f1.F;
import f1.z;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import y0.p;
import y0.w;

/* loaded from: classes.dex */
public final class j implements z {

    /* renamed from: a, reason: collision with root package name */
    public final int f2947a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2948b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2949c;

    /* renamed from: d, reason: collision with root package name */
    public final Cloneable f2950d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2951e;

    /* JADX WARN: Multi-variable type inference failed */
    public j(w wVar, t tVar, byte[] bArr, E2.b[] bVarArr, int i4) {
        this.f2948b = wVar;
        this.f2949c = tVar;
        this.f2950d = bArr;
        this.f2951e = bVarArr;
        this.f2947a = i4;
    }

    @Override // f1.z
    public void a(u uVar) {
        G g4;
        G g5;
        SparseArray sparseArray;
        int i4;
        W.t tVar;
        char c4;
        int i5;
        int i6;
        G g6;
        SparseArray sparseArray2 = (SparseArray) this.f2949c;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f2950d;
        W.t tVar2 = (W.t) this.f2948b;
        C c5 = (C) this.f2951e;
        SparseArray sparseArray3 = c5.f8514h;
        SparseBooleanArray sparseBooleanArray = c5.f8515i;
        B.k kVar = c5.f8512f;
        List list = c5.f8509c;
        int i7 = c5.f8507a;
        if (uVar.z() == 2) {
            if (i7 == 1 || i7 == 2 || c5.n == 1) {
                g4 = (G) list.get(0);
            } else {
                g4 = new G(((G) list.get(0)).d());
                list.add(g4);
            }
            if ((uVar.z() & 128) != 0) {
                uVar.N(1);
                int G4 = uVar.G();
                uVar.N(3);
                uVar.k(tVar2.f3345d, 0, 2);
                tVar2.q(0);
                tVar2.t(3);
                c5.f8524t = tVar2.i(13);
                uVar.k(tVar2.f3345d, 0, 2);
                tVar2.q(0);
                tVar2.t(4);
                uVar.N(tVar2.i(12));
                if (i7 == 2 && c5.f8522r == null) {
                    F a3 = kVar.a(21, new N(21, null, 0, null, J.f3264b));
                    c5.f8522r = a3;
                    if (a3 != null) {
                        a3.d(g4, c5.f8519m, new E(G4, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a4 = uVar.a();
                while (a4 > 0) {
                    uVar.k(tVar2.f3345d, 0, 5);
                    tVar2.q(0);
                    int i8 = tVar2.i(8);
                    tVar2.t(3);
                    int i9 = tVar2.i(13);
                    tVar2.t(4);
                    int i10 = tVar2.i(12);
                    int i11 = uVar.f3352b;
                    int i12 = i11 + i10;
                    int i13 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i14 = 0;
                    int i15 = a4;
                    while (true) {
                        if (uVar.f3352b >= i12) {
                            tVar = tVar2;
                            break;
                        }
                        int z = uVar.z();
                        tVar = tVar2;
                        int z4 = uVar.f3352b + uVar.z();
                        if (z4 > i12) {
                            break;
                        }
                        SparseArray sparseArray4 = sparseArray3;
                        if (z == 5) {
                            long B4 = uVar.B();
                            if (B4 == 1094921523) {
                                i13 = 129;
                            } else if (B4 == 1161904947) {
                                i13 = 135;
                            } else {
                                if (B4 != 1094921524) {
                                    if (B4 == 1212503619) {
                                        i13 = 36;
                                    }
                                }
                                i13 = 172;
                            }
                            i5 = z4;
                            i6 = G4;
                            g6 = g4;
                        } else if (z == 106) {
                            i5 = z4;
                            i6 = G4;
                            g6 = g4;
                            i13 = 129;
                        } else if (z == 122) {
                            i6 = G4;
                            g6 = g4;
                            i13 = 135;
                            i5 = z4;
                        } else {
                            if (z == 127) {
                                int z5 = uVar.z();
                                if (z5 != 21) {
                                    if (z5 == 14) {
                                        i13 = 136;
                                    } else if (z5 == 33) {
                                        i13 = 139;
                                    }
                                }
                                i13 = 172;
                            } else if (z == 123) {
                                i13 = 138;
                            } else if (z == 10) {
                                str = uVar.x(3, StandardCharsets.UTF_8).trim();
                                i5 = z4;
                                i14 = uVar.z();
                                i6 = G4;
                                g6 = g4;
                            } else {
                                if (z == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (uVar.f3352b < z4) {
                                        String trim = uVar.x(3, StandardCharsets.UTF_8).trim();
                                        uVar.z();
                                        G g7 = g4;
                                        byte[] bArr = new byte[4];
                                        uVar.k(bArr, 0, 4);
                                        arrayList2.add(new D(trim, bArr));
                                        g4 = g7;
                                        z4 = z4;
                                        G4 = G4;
                                    }
                                    i5 = z4;
                                    i6 = G4;
                                    g6 = g4;
                                    arrayList = arrayList2;
                                    i13 = 89;
                                } else {
                                    i5 = z4;
                                    i6 = G4;
                                    g6 = g4;
                                    if (z == 111) {
                                        i13 = 257;
                                    }
                                }
                                uVar.N(i5 - uVar.f3352b);
                                g4 = g6;
                                tVar2 = tVar;
                                sparseArray3 = sparseArray4;
                                G4 = i6;
                            }
                            i5 = z4;
                            i6 = G4;
                            g6 = g4;
                        }
                        uVar.N(i5 - uVar.f3352b);
                        g4 = g6;
                        tVar2 = tVar;
                        sparseArray3 = sparseArray4;
                        G4 = i6;
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i16 = G4;
                    G g8 = g4;
                    uVar.M(i12);
                    N n = new N(i13, str, i14, arrayList, Arrays.copyOfRange(uVar.f3351a, i11, i12));
                    if (i8 == 6 || i8 == 5) {
                        i8 = i13;
                    }
                    int i17 = i15 - (i10 + 5);
                    int i18 = i7 == 2 ? i8 : i9;
                    if (sparseBooleanArray.get(i18)) {
                        c4 = 21;
                    } else {
                        c4 = 21;
                        F a5 = (i7 == 2 && i8 == 21) ? c5.f8522r : kVar.a(i8, n);
                        if (i7 != 2 || i9 < sparseIntArray.get(i18, 8192)) {
                            sparseIntArray.put(i18, i9);
                            sparseArray2.put(i18, a5);
                        }
                    }
                    a4 = i17;
                    g4 = g8;
                    tVar2 = tVar;
                    sparseArray3 = sparseArray5;
                    G4 = i16;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i19 = G4;
                G g9 = g4;
                int size = sparseIntArray.size();
                int i20 = 0;
                while (i20 < size) {
                    int keyAt = sparseIntArray.keyAt(i20);
                    int valueAt = sparseIntArray.valueAt(i20);
                    sparseBooleanArray.put(keyAt, true);
                    c5.f8516j.put(valueAt, true);
                    F f4 = (F) sparseArray2.valueAt(i20);
                    if (f4 != null) {
                        if (f4 != c5.f8522r) {
                            i4 = i19;
                            g5 = g9;
                            f4.d(g5, c5.f8519m, new E(i4, keyAt, 8192));
                        } else {
                            g5 = g9;
                            i4 = i19;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, f4);
                    } else {
                        g5 = g9;
                        sparseArray = sparseArray6;
                        i4 = i19;
                    }
                    i20++;
                    sparseArray6 = sparseArray;
                    i19 = i4;
                    g9 = g5;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i7 == 2) {
                    if (c5.o) {
                        return;
                    }
                    c5.f8519m.r();
                    c5.n = 0;
                    c5.o = true;
                    return;
                }
                sparseArray7.remove(this.f2947a);
                int i21 = i7 == 1 ? 0 : c5.n - 1;
                c5.n = i21;
                if (i21 == 0) {
                    c5.f8519m.r();
                    c5.o = true;
                }
            }
        }
    }

    public j(C c4, int i4) {
        this.f2951e = c4;
        this.f2948b = new W.t(5, new byte[5]);
        this.f2949c = new SparseArray();
        this.f2950d = new SparseIntArray();
        this.f2947a = i4;
    }

    @Override // f1.z
    public void d(G g4, p pVar, E e4) {
    }
}
