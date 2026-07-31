package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class e4 implements w3 {

    /* renamed from: a, reason: collision with root package name */
    private final cq2 f4487a = new cq2(new byte[5], 5);

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<l4> f4488b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private final SparseIntArray f4489c = new SparseIntArray();

    /* renamed from: d, reason: collision with root package name */
    private final int f4490d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f4 f4491e;

    public e4(f4 f4Var, int i7) {
        this.f4491e = f4Var;
        this.f4490d = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0112, code lost:
    
        if (r29.s() == 21) goto L26;
     */
    @Override // com.google.android.gms.internal.ads.w3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(dr2 dr2Var) {
        List list;
        SparseArray sparseArray;
        int i7;
        rc4 rc4Var;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        ky2 ky2Var;
        int i8;
        rc4 rc4Var2;
        SparseArray sparseArray2;
        SparseBooleanArray sparseBooleanArray3;
        j4 j4Var;
        ky2 ky2Var2;
        int i9;
        if (dr2Var.s() != 2) {
            return;
        }
        list = this.f4491e.f4973a;
        ky2 ky2Var3 = (ky2) list.get(0);
        if ((dr2Var.s() & 128) == 0) {
            return;
        }
        dr2Var.g(1);
        int w6 = dr2Var.w();
        int i10 = 3;
        dr2Var.g(3);
        dr2Var.a(this.f4487a, 2);
        this.f4487a.j(3);
        int i11 = 13;
        this.f4491e.f4988p = this.f4487a.c(13);
        dr2Var.a(this.f4487a, 2);
        int i12 = 4;
        this.f4487a.j(4);
        int i13 = 12;
        dr2Var.g(this.f4487a.c(12));
        this.f4488b.clear();
        this.f4489c.clear();
        int i14 = dr2Var.i();
        while (i14 > 0) {
            int i15 = 5;
            dr2Var.a(this.f4487a, 5);
            int c7 = this.f4487a.c(8);
            this.f4487a.j(i10);
            int c8 = this.f4487a.c(i11);
            this.f4487a.j(i12);
            int c9 = this.f4487a.c(i13);
            int k7 = dr2Var.k();
            int i16 = k7 + c9;
            String str = null;
            ArrayList arrayList = null;
            int i17 = -1;
            while (dr2Var.k() < i16) {
                int s7 = dr2Var.s();
                int k8 = dr2Var.k() + dr2Var.s();
                if (k8 > i16) {
                    break;
                }
                if (s7 == i15) {
                    long A = dr2Var.A();
                    if (A == 1094921523) {
                        i17 = 129;
                    } else if (A == 1161904947) {
                        i17 = 135;
                    } else {
                        if (A != 1094921524) {
                            if (A == 1212503619) {
                                i17 = 36;
                            }
                        }
                        i17 = 172;
                    }
                    ky2Var2 = ky2Var3;
                    i9 = w6;
                } else if (s7 == 106) {
                    ky2Var2 = ky2Var3;
                    i9 = w6;
                    i17 = 129;
                } else if (s7 == 122) {
                    ky2Var2 = ky2Var3;
                    i9 = w6;
                    i17 = 135;
                } else if (s7 != 127) {
                    if (s7 == 123) {
                        ky2Var2 = ky2Var3;
                        i9 = w6;
                        i17 = 138;
                    } else if (s7 == 10) {
                        ky2Var2 = ky2Var3;
                        str = dr2Var.F(3, c43.f3729c).trim();
                        i9 = w6;
                    } else {
                        int i18 = 3;
                        if (s7 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (dr2Var.k() < k8) {
                                String trim = dr2Var.F(i18, c43.f3729c).trim();
                                int s8 = dr2Var.s();
                                ky2 ky2Var4 = ky2Var3;
                                byte[] bArr = new byte[4];
                                dr2Var.b(bArr, 0, 4);
                                arrayList2.add(new h4(trim, s8, bArr));
                                ky2Var3 = ky2Var4;
                                w6 = w6;
                                i18 = 3;
                            }
                            ky2Var2 = ky2Var3;
                            i9 = w6;
                            arrayList = arrayList2;
                            i17 = 89;
                        } else {
                            ky2Var2 = ky2Var3;
                            i9 = w6;
                            if (s7 == 111) {
                                i17 = 257;
                            }
                        }
                        dr2Var.g(k8 - dr2Var.k());
                        ky2Var3 = ky2Var2;
                        w6 = i9;
                        i15 = 5;
                    }
                }
                dr2Var.g(k8 - dr2Var.k());
                ky2Var3 = ky2Var2;
                w6 = i9;
                i15 = 5;
            }
            ky2 ky2Var5 = ky2Var3;
            int i19 = w6;
            dr2Var.f(i16);
            i4 i4Var = new i4(i17, str, arrayList, Arrays.copyOfRange(dr2Var.h(), k7, i16));
            if (c7 == 6 || c7 == 5) {
                c7 = i4Var.f6527a;
            }
            i14 -= c9 + 5;
            sparseBooleanArray3 = this.f4491e.f4978f;
            if (!sparseBooleanArray3.get(c8)) {
                j4Var = this.f4491e.f4976d;
                l4 a7 = j4Var.a(c7, i4Var);
                this.f4489c.put(c8, c8);
                this.f4488b.put(c8, a7);
            }
            ky2Var3 = ky2Var5;
            w6 = i19;
            i10 = 3;
            i12 = 4;
            i13 = 12;
            i11 = 13;
        }
        ky2 ky2Var6 = ky2Var3;
        int i20 = w6;
        int size = this.f4489c.size();
        int i21 = 0;
        while (i21 < size) {
            int keyAt = this.f4489c.keyAt(i21);
            int valueAt = this.f4489c.valueAt(i21);
            sparseBooleanArray = this.f4491e.f4978f;
            sparseBooleanArray.put(keyAt, true);
            sparseBooleanArray2 = this.f4491e.f4979g;
            sparseBooleanArray2.put(valueAt, true);
            l4 valueAt2 = this.f4488b.valueAt(i21);
            if (valueAt2 != null) {
                rc4Var2 = this.f4491e.f4982j;
                i8 = i20;
                k4 k4Var = new k4(i8, keyAt, 8192);
                ky2Var = ky2Var6;
                valueAt2.b(ky2Var, rc4Var2, k4Var);
                sparseArray2 = this.f4491e.f4977e;
                sparseArray2.put(valueAt, valueAt2);
            } else {
                ky2Var = ky2Var6;
                i8 = i20;
            }
            i21++;
            ky2Var6 = ky2Var;
            i20 = i8;
        }
        sparseArray = this.f4491e.f4977e;
        sparseArray.remove(this.f4490d);
        this.f4491e.f4983k = 0;
        i7 = this.f4491e.f4983k;
        if (i7 == 0) {
            rc4Var = this.f4491e.f4982j;
            rc4Var.H();
            this.f4491e.f4984l = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void b(ky2 ky2Var, rc4 rc4Var, k4 k4Var) {
    }
}
