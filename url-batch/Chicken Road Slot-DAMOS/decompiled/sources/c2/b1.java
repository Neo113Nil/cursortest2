package c2;

import android.net.Uri;
import com.google.android.gms.internal.measurement.cg;
import com.google.android.gms.internal.measurement.dd;
import com.google.android.gms.internal.measurement.e7;
import com.google.android.gms.internal.measurement.hg;
import com.google.android.gms.internal.measurement.ie;
import com.google.android.gms.internal.measurement.j2;
import com.google.android.gms.internal.measurement.l5;
import com.google.android.gms.internal.measurement.oe;
import com.google.android.gms.internal.measurement.tf;
import com.google.android.gms.internal.measurement.ve;
import com.google.android.gms.internal.measurement.xd;
import com.google.android.gms.internal.measurement.zd;
import com.google.android.gms.internal.measurement.ze;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1490a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1491b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1492c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1493d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1494e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1495f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1496h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1497i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public Object f1498k;

    public b1(String str, f8.o0 o0Var, ze zeVar, Executor executor, zd zdVar, a8.i iVar, com.google.android.gms.internal.measurement.h1 h1Var) {
        this.f1490a = 1;
        this.f1497i = new Object();
        this.j = new c6.e(6);
        this.f1498k = null;
        this.f1491b = str;
        this.f1492c = f8.l0.e(o0Var);
        this.f1493d = zeVar;
        this.f1494e = new f8.w0(executor);
        this.f1495f = zdVar;
        this.g = iVar;
        this.f1496h = h1Var;
    }

    public static final void a(b1 b1Var, d1.k kVar, i1 i1Var) {
        for (d1.k kVar2 = kVar.f3309s; kVar2 != null; kVar2 = kVar2.f3309s) {
            if (kVar2 == ((a1) b1Var.f1492c)) {
                g0 s3 = ((g0) b1Var.f1491b).s();
                i1Var.D = s3 != null ? (q) s3.S.f1493d : null;
                b1Var.f1494e = i1Var;
                return;
            } else {
                if ((kVar2.f3307i & 2) != 0) {
                    return;
                }
                kVar2.H(i1Var);
            }
        }
    }

    public static d1.k b(d1.j jVar, d1.k kVar) {
        d1.k kVar2;
        if (jVar instanceof x0) {
            kVar2 = ((x0) jVar).d();
            kVar2.f3307i = j1.f(kVar2);
        } else {
            b bVar = new b();
            bVar.f3307i = j1.d(jVar);
            bVar.C = jVar;
            new HashSet();
            kVar2 = bVar;
        }
        if (kVar2.B) {
            z1.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        kVar2.f3313w = true;
        d1.k kVar3 = kVar.f3310t;
        if (kVar3 != null) {
            kVar3.f3309s = kVar2;
            kVar2.f3310t = kVar3;
        }
        kVar.f3310t = kVar2;
        kVar2.f3309s = kVar;
        return kVar2;
    }

    public static d1.k c(d1.k kVar) {
        boolean z10 = kVar.B;
        if (z10) {
            s.c0 c0Var = j1.f1591a;
            if (!z10) {
                z1.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            j1.a(kVar, -1, 2);
            kVar.F();
            kVar.z();
        }
        d1.k kVar2 = kVar.f3310t;
        d1.k kVar3 = kVar.f3309s;
        if (kVar2 != null) {
            kVar2.f3309s = kVar3;
            kVar.f3310t = null;
        }
        if (kVar3 != null) {
            kVar3.f3310t = kVar2;
            kVar.f3309s = null;
        }
        kVar3.getClass();
        return kVar3;
    }

    public static void h(d1.j jVar, d1.j jVar2, d1.k kVar) {
        if ((jVar instanceof x0) && (jVar2 instanceof x0)) {
            kVar.getClass();
            ((x0) jVar2).e(kVar);
            if (kVar.B) {
                j1.c(kVar);
                return;
            } else {
                kVar.f3314x = true;
                return;
            }
        }
        if (!(kVar instanceof b)) {
            z1.a.b("Unknown Modifier.Node type");
            return;
        }
        b bVar = (b) kVar;
        boolean z10 = bVar.B;
        if (z10) {
            if (!z10) {
                z1.a.b("unInitializeModifier called on unattached node");
            }
            if ((bVar.f3307i & 8) != 0) {
                k.v(bVar).C();
            }
        }
        bVar.C = jVar2;
        bVar.f3307i = j1.d(jVar2);
        if (bVar.B) {
            bVar.I(false);
        }
        if (kVar.B) {
            j1.c(kVar);
        } else {
            kVar.f3314x = true;
        }
    }

    public boolean d(int i3) {
        return (i3 & ((d1.k) this.g).f3308r) != 0;
    }

    public void e() {
        for (d1.k kVar = (d1.k) this.g; kVar != null; kVar = kVar.f3310t) {
            kVar.E();
            if (kVar.f3313w) {
                s.c0 c0Var = j1.f1591a;
                if (!kVar.B) {
                    z1.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                j1.a(kVar, -1, 1);
            }
            if (kVar.f3314x) {
                j1.c(kVar);
            }
            kVar.f3313w = false;
            kVar.f3314x = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0191, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0196, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a0, code lost:
    
        if (r14 <= r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a2, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a4, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b0, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b2, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bd, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c1, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c3, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c5, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c7, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cd, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cf, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b9, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0194, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018d, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x017b, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0179, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026a, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0154, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d0, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0150, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0157, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0159, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015b, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016b, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0170, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0182, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0188, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018a, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018f, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(int i3, o0.e eVar, o0.e eVar2, d1.k kVar, boolean z10) {
        int i10;
        o0.e eVar3;
        o0.e eVar4;
        int i11;
        int[] iArr;
        int[] iArr2;
        char c10;
        char c11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        z0 z0Var = (z0) this.f1498k;
        if (z0Var == null) {
            i10 = i3;
            eVar3 = eVar;
            eVar4 = eVar2;
            z0Var = new z0(this, kVar, i10, eVar3, eVar4, z10);
            this.f1498k = z0Var;
        } else {
            i10 = i3;
            eVar3 = eVar;
            eVar4 = eVar2;
            z0Var.f1705a = kVar;
            z0Var.f1706b = i10;
            z0Var.f1707c = eVar3;
            z0Var.f1708d = eVar4;
            z0Var.f1709e = z10;
        }
        b1 b1Var = z0Var.f1710f;
        int i17 = eVar3.f7319i - i10;
        int i18 = eVar4.f7319i - i10;
        char c12 = 2;
        int i19 = ((i17 + i18) + 1) / 2;
        r rVar = new r(i19 * 3);
        r rVar2 = new r(i19 * 4);
        int i20 = 0;
        rVar2.e(0, i17, 0, i18);
        int i21 = (i19 * 2) + 1;
        int[] iArr3 = new int[i21];
        int[] iArr4 = new int[i21];
        int[] iArr5 = new int[5];
        while (true) {
            int i22 = rVar2.f1653b;
            if (i22 == 0) {
                break;
            }
            char c13 = c12;
            int[] iArr6 = rVar2.f1652a;
            int i23 = i20;
            int i24 = i22 - 1;
            rVar2.f1653b = i24;
            int i25 = iArr6[i24];
            int i26 = i22 - 2;
            rVar2.f1653b = i26;
            int i27 = iArr6[i26];
            int i28 = i22 - 3;
            rVar2.f1653b = i28;
            int i29 = iArr6[i28];
            int i30 = i22 - 4;
            rVar2.f1653b = i30;
            int i31 = iArr6[i30];
            int i32 = i29 - i31;
            int i33 = i21;
            int i34 = i25 - i27;
            int[] iArr7 = iArr3;
            if (i32 >= 1 && i34 >= 1) {
                int i35 = 1;
                int i36 = ((i32 + i34) + 1) / 2;
                int i37 = i33 / 2;
                int i38 = i37 + 1;
                iArr7[i38] = i31;
                iArr4[i38] = i29;
                int i39 = i23;
                while (i39 < i36) {
                    int i40 = i32 - i34;
                    int i41 = i36;
                    iArr = iArr4;
                    int i42 = -i39;
                    int i43 = (Math.abs(i40) & 1) == i35 ? 1 : i23;
                    int i44 = i42;
                    while (true) {
                        if (i44 > i39) {
                            break;
                        }
                        if (i44 != i42) {
                            if (i44 != i39) {
                                i12 = i44;
                                iArr2 = iArr5;
                            } else {
                                i12 = i44;
                                iArr2 = iArr5;
                            }
                            i13 = iArr7[(i12 - 1) + i37];
                            i14 = i13 + 1;
                            int i45 = ((i14 - i31) + i27) - i12;
                            int i46 = i45 - ((i39 == 0 ? 1 : i23) & (i14 != i13 ? 1 : i23));
                            int i47 = i13;
                            i15 = i45;
                            while (i14 < i29 && i15 < i25 && z0Var.a(i14, i15)) {
                                i14++;
                                i15++;
                            }
                            iArr7[i37 + i12] = i14;
                            if (i43 == 0) {
                                int i48 = i15;
                                int i49 = i40 - i12;
                                i16 = i32;
                                if (i49 >= i42 + 1 && i49 <= i39 - 1 && iArr[i37 + i49] <= i14) {
                                    iArr2[i23] = i47;
                                    iArr2[1] = i46;
                                    iArr2[c13] = i14;
                                    iArr2[3] = i48;
                                    iArr2[4] = i23;
                                    c10 = 1;
                                    break;
                                }
                            } else {
                                i16 = i32;
                            }
                            i44 = i12 + 2;
                            iArr5 = iArr2;
                            i32 = i16;
                        } else {
                            i12 = i44;
                            iArr2 = iArr5;
                        }
                        i13 = iArr7[i12 + 1 + i37];
                        i14 = i13;
                        int i452 = ((i14 - i31) + i27) - i12;
                        int i462 = i452 - ((i39 == 0 ? 1 : i23) & (i14 != i13 ? 1 : i23));
                        int i472 = i13;
                        i15 = i452;
                        while (i14 < i29) {
                            i14++;
                            i15++;
                        }
                        iArr7[i37 + i12] = i14;
                        if (i43 == 0) {
                        }
                        i44 = i12 + 2;
                        iArr5 = iArr2;
                        i32 = i16;
                    }
                    if (Math.min(iArr2[c13] - iArr2[i23], iArr2[3] - iArr2[c10]) > 0) {
                        int i50 = iArr2[i23];
                        int i51 = iArr2[c10];
                        int i52 = iArr2[3] - i51;
                        int i53 = iArr2[c13] - i50;
                        if (i52 != i53) {
                            i53 = Math.min(i53, i52);
                            int i54 = iArr2[4];
                            int i55 = i54 != 0 ? 1 : i23;
                            int i56 = iArr2[3];
                            c11 = 1;
                            int i57 = iArr2[1];
                            int i58 = i56 - i57;
                            int i59 = iArr2[c13];
                            int i60 = iArr2[i23];
                            int i61 = i50 + (((i58 > i59 - i60 ? 1 : i23) | i55) ^ 1);
                            i51 += (((i56 - i57 > i59 - i60 ? 1 : i23) ^ 1) | (i54 != 0 ? 1 : i23)) ^ 1;
                            i50 = i61;
                        } else {
                            c11 = 1;
                        }
                        rVar.d(i50, i51, i53);
                    } else {
                        c11 = c10;
                    }
                    rVar2.e(i31, iArr2[i23], i27, iArr2[c11]);
                    rVar2.e(iArr2[c13], i29, iArr2[3], i25);
                    c12 = c13;
                    i20 = i23;
                    i21 = i33;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c12 = c13;
            i20 = i23;
            i21 = i33;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i62 = i20;
        int i63 = rVar.f1653b;
        if (i63 % 3 != 0) {
            z1.a.b("Array size not a multiple of 3");
        }
        if (i63 > 3) {
            i11 = i62;
            rVar.f(i11, i63 - 3);
        } else {
            i11 = i62;
        }
        rVar.d(i17, i18, i11);
        int i64 = i11;
        int i65 = i64;
        int i66 = i65;
        while (i64 < rVar.f1653b) {
            int[] iArr8 = rVar.f1652a;
            int i67 = iArr8[i64];
            int i68 = iArr8[i64 + 2];
            int i69 = i67 - i68;
            int i70 = iArr8[i64 + 1] - i68;
            i64 += 3;
            while (i65 < i69) {
                d1.k kVar2 = z0Var.f1705a.f3310t;
                kVar2.getClass();
                if ((kVar2.f3307i & 2) != 0) {
                    i1 i1Var = kVar2.f3312v;
                    i1Var.getClass();
                    i1 i1Var2 = i1Var.D;
                    i1 i1Var3 = i1Var.C;
                    i1Var3.getClass();
                    if (i1Var2 != null) {
                        i1Var2.C = i1Var3;
                    }
                    i1Var3.D = i1Var2;
                    a(b1Var, z0Var.f1705a, i1Var3);
                }
                z0Var.f1705a = c(kVar2);
                i65++;
            }
            while (i66 < i70) {
                d1.k b10 = b((d1.j) z0Var.f1708d.f7317d[z0Var.f1706b + i66], z0Var.f1705a);
                z0Var.f1705a = b10;
                if (z0Var.f1709e) {
                    d1.k kVar3 = b10.f3310t;
                    kVar3.getClass();
                    i1 i1Var4 = kVar3.f3312v;
                    i1Var4.getClass();
                    v f3 = k.f(z0Var.f1705a);
                    if (f3 != null) {
                        x xVar = new x((g0) b1Var.f1491b, f3);
                        z0Var.f1705a.H(xVar);
                        a(b1Var, z0Var.f1705a, xVar);
                        xVar.D = i1Var4.D;
                        xVar.C = i1Var4;
                        i1Var4.D = xVar;
                    } else {
                        z0Var.f1705a.H(i1Var4);
                    }
                    z0Var.f1705a.y();
                    z0Var.f1705a.E();
                    d1.k kVar4 = z0Var.f1705a;
                    s.c0 c0Var = j1.f1591a;
                    if (!kVar4.B) {
                        z1.a.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    j1.a(kVar4, -1, 1);
                } else {
                    b10.f3313w = true;
                }
                i66++;
            }
            while (true) {
                int i71 = i68 - 1;
                if (i68 > 0) {
                    d1.k kVar5 = z0Var.f1705a.f3310t;
                    kVar5.getClass();
                    z0Var.f1705a = kVar5;
                    o0.e eVar5 = z0Var.f1707c;
                    int i72 = z0Var.f1706b;
                    d1.j jVar = (d1.j) eVar5.f7317d[i72 + i65];
                    d1.j jVar2 = (d1.j) z0Var.f1708d.f7317d[i72 + i66];
                    if (!Intrinsics.a(jVar, jVar2)) {
                        h(jVar, jVar2, z0Var.f1705a);
                    }
                    i65++;
                    i66++;
                    i68 = i71;
                }
            }
        }
        int i73 = i11;
        for (d1.k kVar6 = ((z1) this.f1495f).f3309s; kVar6 != null && kVar6 != ((a1) this.f1492c); kVar6 = kVar6.f3309s) {
            i73 |= kVar6.f3307i;
            kVar6.f3308r = i73;
        }
    }

    public void g() {
        x xVar;
        g0 g0Var = (g0) this.f1491b;
        i1 i1Var = (q) this.f1493d;
        for (d1.k kVar = ((z1) this.f1495f).f3309s; kVar != null; kVar = kVar.f3309s) {
            v f3 = k.f(kVar);
            if (f3 != null) {
                i1 i1Var2 = kVar.f3312v;
                if (i1Var2 != null) {
                    x xVar2 = (x) i1Var2;
                    v vVar = xVar2.f1701d0;
                    xVar2.c1(f3);
                    xVar = xVar2;
                    if (vVar != kVar) {
                        o1 o1Var = xVar2.Y;
                        xVar = xVar2;
                        if (o1Var != null) {
                            ((d2.i1) o1Var).c();
                            xVar = xVar2;
                        }
                    }
                } else {
                    x xVar3 = new x(g0Var, f3);
                    kVar.H(xVar3);
                    xVar = xVar3;
                }
                i1Var.D = xVar;
                xVar.C = i1Var;
                i1Var = xVar;
            } else {
                kVar.H(i1Var);
            }
        }
        g0 s3 = g0Var.s();
        i1Var.D = s3 != null ? (q) s3.S.f1493d : null;
        this.f1494e = i1Var;
    }

    public ListenableFuture i(dd ddVar, Executor executor) {
        ListenableFuture listenableFuture;
        synchronized (this.f1497i) {
            ListenableFuture listenableFuture2 = (ListenableFuture) this.f1498k;
            if (listenableFuture2 != null && listenableFuture2.isDone()) {
                try {
                    f8.l0.b((ListenableFuture) this.f1498k);
                } catch (ExecutionException unused) {
                    this.f1498k = null;
                }
            }
            if (((ListenableFuture) this.f1498k) == null) {
                this.f1498k = f8.l0.e(((c6.e) this.j).q(cg.a(new ve(this, 0)), (f8.w0) this.f1494e));
            }
            listenableFuture = (ListenableFuture) this.f1498k;
        }
        return ((c6.e) this.j).q(cg.a(new e7(this, listenableFuture, ddVar, executor, 2)), f8.d0.f4128d);
    }

    public com.google.android.gms.internal.measurement.o0 j(Uri uri) {
        ze zeVar = (ze) this.f1493d;
        String str = (String) this.f1491b;
        zd zdVar = (zd) this.f1495f;
        try {
            try {
                com.google.android.gms.internal.measurement.h1 h1Var = (com.google.android.gms.internal.measurement.h1) this.f1496h;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5);
                sb2.append("Read ");
                sb2.append(str);
                String sb3 = sb2.toString();
                h1Var.getClass();
                tf d10 = com.google.android.gms.internal.measurement.h1.d(sb3);
                try {
                    InputStream d11 = hg.d(zdVar.b(uri));
                    try {
                        com.google.android.gms.internal.measurement.k1 a9 = ((com.google.android.gms.internal.measurement.j1) ((j2) zeVar.f3049a.s(7))).a(d11, zeVar.f3050b);
                        if (d11 != null) {
                            d11.close();
                        }
                        d10.close();
                        return a9;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        d10.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                xd b10 = zdVar.b(uri);
                if (b10.f2985a.b(b10.f2988d)) {
                    throw e2;
                }
                return zeVar.f3049a;
            }
        } catch (IOException e9) {
            throw com.google.android.gms.internal.measurement.h.a(zdVar, uri, e9, str);
        }
    }

    public void k(Uri uri, Object obj) {
        String str = (String) this.f1491b;
        zd zdVar = (zd) this.f1495f;
        Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            com.google.android.gms.internal.measurement.h1 h1Var = (com.google.android.gms.internal.measurement.h1) this.f1496h;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6);
            sb2.append("Write ");
            sb2.append(str);
            String sb3 = sb2.toString();
            h1Var.getClass();
            tf d10 = com.google.android.gms.internal.measurement.h1.d(sb3);
            try {
                l5 l5Var = new l5(7);
                try {
                    xd b10 = zdVar.b(build);
                    ArrayList a9 = b10.a(b10.f2985a.c(b10.f2988d));
                    new l5[]{l5Var}[0].d(a9);
                    OutputStream outputStream = (OutputStream) a9.get(0);
                    try {
                        ((com.google.android.gms.internal.measurement.o0) obj).b(outputStream);
                        if (((ie) l5Var.f2500i) == null) {
                            throw new androidx.datastore.preferences.protobuf.k("Cannot sync underlying stream");
                        }
                        ((OutputStream) l5Var.f2499e).flush();
                        ((ie) l5Var.f2500i).f2408d.getFD().sync();
                        outputStream.close();
                        d10.close();
                        xd b11 = zdVar.b(build);
                        xd b12 = zdVar.b(uri);
                        oe oeVar = b11.f2985a;
                        if (oeVar != b12.f2985a) {
                            throw new androidx.datastore.preferences.protobuf.k("Cannot rename file across backends");
                        }
                        oeVar.e(b11.f2988d, b12.f2988d);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    throw com.google.android.gms.internal.measurement.h.a(zdVar, uri, e2, str);
                }
            } finally {
            }
        } catch (IOException e9) {
            xd b13 = zdVar.b(build);
            if (b13.f2985a.b(b13.f2988d)) {
                try {
                    xd b14 = zdVar.b(build);
                    b14.f2985a.d(b14.f2988d);
                } catch (IOException e10) {
                    e9.addSuppressed(e10);
                }
            }
            throw e9;
        }
    }

    public String toString() {
        switch (this.f1490a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("[");
                d1.k kVar = (d1.k) this.g;
                z1 z1Var = (z1) this.f1495f;
                if (kVar == z1Var) {
                    sb2.append("]");
                } else {
                    while (true) {
                        if (kVar != null && kVar != z1Var) {
                            sb2.append(String.valueOf(kVar));
                            if (kVar.f3310t == z1Var) {
                                sb2.append("]");
                            } else {
                                sb2.append(",");
                                kVar = kVar.f3310t;
                            }
                        }
                    }
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public b1(g0 g0Var) {
        this.f1490a = 0;
        this.f1491b = g0Var;
        a1 a1Var = new a1();
        a1Var.f3308r = -1;
        this.f1492c = a1Var;
        q qVar = new q(g0Var);
        this.f1493d = qVar;
        this.f1494e = qVar;
        z1 z1Var = qVar.f1639d0;
        this.f1495f = z1Var;
        this.g = z1Var;
        this.j = new o0.e(new d1.l[16]);
    }
}
