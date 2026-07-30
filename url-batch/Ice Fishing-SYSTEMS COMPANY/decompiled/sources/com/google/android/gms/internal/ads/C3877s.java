package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3877s implements InterfaceC4260z4 {

    /* renamed from: n, reason: collision with root package name */
    public int f34149n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f34150u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f34151v;

    /* renamed from: w, reason: collision with root package name */
    public Object f34152w;

    /* renamed from: x, reason: collision with root package name */
    public Object f34153x;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r0.compareTo(r1) >= 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3877s(Context context) {
        int extensionVersion;
        boolean isSdkSandbox;
        String clientPackageName;
        this.f34149n = 0;
        this.f34150u = context.getApplicationContext();
        int i = K.b.f1473a;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 34) {
            if (i4 >= 33) {
                String CODENAME = Build.VERSION.CODENAME;
                kotlin.jvm.internal.h.d(CODENAME, "CODENAME");
                if (!"REL".equals(CODENAME)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = CODENAME.toUpperCase(locale);
                    kotlin.jvm.internal.h.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = "UpsideDownCake".toUpperCase(locale);
                    kotlin.jvm.internal.h.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                }
            }
            clientPackageName = context.getPackageName();
            this.f34151v = clientPackageName;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(34);
        if (extensionVersion >= 8) {
            isSdkSandbox = Process.isSdkSandbox();
            clientPackageName = isSdkSandbox ? B1.u.e(context.getSystemService(B1.u.i())).getClientPackageName() : context.getPackageName();
            this.f34151v = clientPackageName;
        }
        clientPackageName = context.getPackageName();
        this.f34151v = clientPackageName;
    }

    public boolean a() {
        return (this.f34149n != 2 || ((InterfaceC3401j8) this.f34152w) == null || ((M4) this.f34153x) == null) ? false : true;
    }

    public boolean b(int i) {
        return ((FO[]) this.f34150u)[i] != null;
    }

    public boolean d(C3877s c3877s, int i) {
        return c3877s != null && Objects.equals(((FO[]) this.f34150u)[i], ((FO[]) c3877s.f34150u)[i]) && Objects.equals(((InterfaceC3716p[]) this.f34151v)[i], ((InterfaceC3716p[]) c3877s.f34151v)[i]);
    }

    public C3761pr e() {
        if (!a()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", (String) this.f34151v);
        try {
            C3295h8 c3295h8 = (C3295h8) ((InterfaceC3401j8) this.f34152w);
            Parcel A02 = c3295h8.A0();
            AbstractC3241g8.c(A02, bundle);
            Parcel D02 = c3295h8.D0(A02, 1);
            Bundle bundle2 = (Bundle) AbstractC3241g8.b(D02, Bundle.CREATOR);
            D02.recycle();
            return new C3761pr(5, bundle2);
        } catch (RemoteException e6) {
            AbstractC3035cL.v("RemoteException getting install referrer information");
            this.f34149n = 0;
            throw e6;
        }
    }

    public synchronized void f() {
        C3870rt c3870rt;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31686h7)).booleanValue() && !p2.j.f39798C.f39808h.g().n().f28427j) {
            ((ArrayDeque) this.f34152w).clear();
            return;
        }
        synchronized (this) {
            try {
                if (((C3173ew) this.f34153x) == null) {
                    while (true) {
                        ArrayDeque arrayDeque = (ArrayDeque) this.f34152w;
                        if (arrayDeque.isEmpty()) {
                            break;
                        }
                        c3870rt = (C3870rt) arrayDeque.pollFirst();
                        if (c3870rt == null) {
                            break;
                        }
                        InterfaceC4195xu interfaceC4195xu = c3870rt.f34136g;
                        if (interfaceC4195xu != null) {
                            C4017ue c4017ue = (C4017ue) this.f34150u;
                            synchronized (c4017ue) {
                                C3871ru c3871ru = (C3871ru) ((ConcurrentHashMap) c4017ue.f34630u).get(interfaceC4195xu);
                                if (c3871ru == null) {
                                    break;
                                }
                                C4087vu c4087vu = (C4087vu) c4017ue.f34631v;
                                c3871ru.a();
                                if (c3871ru.f34137a.size() < c4087vu.f34894x) {
                                    break;
                                }
                            }
                        }
                    }
                    C3173ew c3173ew = new C3173ew((C4017ue) this.f34150u, (C2478Aq) this.f34151v, c3870rt);
                    this.f34153x = c3173ew;
                    C2593Hm c2593Hm = new C2593Hm(this, c3870rt);
                    synchronized (c3173ew) {
                        C3945tD y6 = C3686oN.y((YC) c3173ew.f30557d, C2538Ei.f24800m, c3870rt.f34134e);
                        y6.c(new MD(0, y6, c2593Hm), c3870rt.f34134e);
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cc  */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.gms.internal.ads.A4] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.google.android.gms.internal.ads.A4] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4260z4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(Lr lr) {
        int i;
        char c4;
        int i4;
        C4044v4 c4044v4;
        C4044v4 c4044v42;
        C4044v4 c4044v43;
        int i9;
        Er er;
        if (lr.K() == 2) {
            B4 b42 = (B4) this.f34153x;
            int i10 = 0;
            It it = (It) b42.f23970a.get(0);
            if ((lr.K() & 128) != 0) {
                lr.G(1);
                int L8 = lr.L();
                int i11 = 3;
                lr.G(3);
                Er er2 = (Er) this.f34150u;
                lr.H(er2.f24829a, 0, 2);
                er2.d(0);
                er2.f(3);
                int i12 = 13;
                b42.f23983o = er2.h(13);
                lr.H(er2.f24829a, 0, 2);
                er2.d(0);
                int i13 = 4;
                er2.f(4);
                int i14 = 12;
                lr.G(er2.h(12));
                SparseArray sparseArray = (SparseArray) this.f34151v;
                sparseArray.clear();
                SparseIntArray sparseIntArray = (SparseIntArray) this.f34152w;
                sparseIntArray.clear();
                int B8 = lr.B();
                while (true) {
                    SparseBooleanArray sparseBooleanArray = b42.f23976g;
                    if (B8 > 0) {
                        int i15 = 5;
                        lr.H(er2.f24829a, i10, 5);
                        er2.d(i10);
                        int h9 = er2.h(8);
                        er2.f(i11);
                        int h10 = er2.h(i12);
                        er2.f(i13);
                        int h11 = er2.h(i14);
                        int i16 = lr.f26234b;
                        int i17 = i16 + h11;
                        int i18 = -1;
                        String str = null;
                        ArrayList arrayList = null;
                        int i19 = 0;
                        while (lr.f26234b < i17) {
                            int K8 = lr.K();
                            int K9 = lr.f26234b + lr.K();
                            if (K9 > i17) {
                                Er er3 = er2;
                                lr.E(i17);
                                byte[] copyOfRange = Arrays.copyOfRange(lr.f26233a, i16, i17);
                                C3398j5 c3398j5 = new C3398j5();
                                c3398j5.f32083n = i19;
                                c3398j5.f32084u = arrayList != null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
                                c3398j5.f32085v = copyOfRange;
                                if (h9 != 6 || h9 == 5) {
                                    h9 = i18;
                                }
                                B8 -= h11 + 5;
                                if (sparseBooleanArray.get(h10)) {
                                    Rx rx = b42.f23973d;
                                    if (h9 != 2) {
                                        i4 = 3;
                                        i = 4;
                                        if (h9 == 3 || h9 == 4) {
                                            c4 = 128;
                                            c4044v4 = new C4044v4(new C3882s4(str, c3398j5.a(), "video/mp2t"));
                                        } else {
                                            if (h9 != 21) {
                                                if (h9 == 27) {
                                                    c4 = 128;
                                                    c4044v43 = new C4044v4(new C3667o4(new C4017ue(rx.n(c3398j5))));
                                                } else if (h9 == 36) {
                                                    c4 = 128;
                                                    c4044v43 = new C4044v4(new C3775q4(new C4017ue(rx.n(c3398j5))));
                                                } else if (h9 == 45) {
                                                    c4 = 128;
                                                    c4044v42 = new C4044v4(new C3936t4());
                                                } else if (h9 == 89) {
                                                    c4 = 128;
                                                    c4044v4 = new C4044v4(new C3237g4((List) c3398j5.f32084u));
                                                } else if (h9 == 172) {
                                                    c4 = 128;
                                                    c4044v4 = new C4044v4(new C2964b4(c3398j5.a(), 1, str, "video/mp2t"));
                                                } else if (h9 != 257) {
                                                    c4 = 128;
                                                    if (h9 != 128) {
                                                        if (h9 != 129) {
                                                            if (h9 != 138) {
                                                                if (h9 != 139) {
                                                                    switch (h9) {
                                                                        case 15:
                                                                            c4044v4 = new C4044v4(new C3127e4(str, c3398j5.a(), "video/mp2t", false));
                                                                            break;
                                                                        case 16:
                                                                            c4044v43 = new C4044v4(new C3559m4(new C3602mu(rx.n(c3398j5))));
                                                                            break;
                                                                        case 17:
                                                                            c4044v4 = new C4044v4(new C3828r4(str, c3398j5.a()));
                                                                            break;
                                                                        default:
                                                                            switch (h9) {
                                                                                case 134:
                                                                                    c4044v42 = new A4(new C3602mu(com.anythink.basead.exoplayer.k.o.ag, 2));
                                                                                    break;
                                                                                case 135:
                                                                                    break;
                                                                                case 136:
                                                                                    break;
                                                                                default:
                                                                                    c4044v4 = null;
                                                                                    break;
                                                                            }
                                                                    }
                                                                } else {
                                                                    c4044v4 = new C4044v4(new C3182f4(str, c3398j5.a(), 5408));
                                                                }
                                                            }
                                                            c4044v4 = new C4044v4(new C3182f4(str, c3398j5.a(), 4096));
                                                        }
                                                        c4044v4 = new C4044v4(new C2964b4(c3398j5.a(), 0, str, "video/mp2t"));
                                                    }
                                                } else {
                                                    c4 = 128;
                                                    c4044v42 = new A4(new C3602mu("application/vnd.dvb.ait", 2));
                                                }
                                                c4044v4 = c4044v43;
                                            } else {
                                                c4 = 128;
                                                c4044v42 = new C4044v4(new C3237g4());
                                            }
                                            c4044v4 = c4044v42;
                                        }
                                        sparseIntArray.put(h10, h10);
                                        sparseArray.put(h10, c4044v4);
                                    } else {
                                        i = 4;
                                        c4 = 128;
                                        i4 = 3;
                                    }
                                    c4044v4 = new C4044v4(new C3397j4(new C3602mu(rx.n(c3398j5)), "video/mp2t"));
                                    sparseIntArray.put(h10, h10);
                                    sparseArray.put(h10, c4044v4);
                                } else {
                                    i = 4;
                                    c4 = 128;
                                    i4 = 3;
                                }
                                i10 = 0;
                                i14 = 12;
                                i11 = i4;
                                i12 = 13;
                                i13 = i;
                                er2 = er3;
                            } else {
                                if (K8 == i15) {
                                    long P8 = lr.P();
                                    if (P8 != 1094921523) {
                                        if (P8 != 1161904947) {
                                            if (P8 != 1094921524) {
                                                if (P8 == 1212503619) {
                                                    i9 = K9;
                                                    er = er2;
                                                    i18 = 36;
                                                }
                                                i9 = K9;
                                                er = er2;
                                            }
                                            i9 = K9;
                                            er = er2;
                                            i18 = 172;
                                        }
                                        i9 = K9;
                                        i18 = 135;
                                        er = er2;
                                    }
                                    i9 = K9;
                                    er = er2;
                                    i18 = com.anythink.expressad.video.module.a.a.f21888T;
                                } else {
                                    if (K8 != 106) {
                                        if (K8 != 122) {
                                            if (K8 == 127) {
                                                int K10 = lr.K();
                                                if (K10 != 21) {
                                                    if (K10 == 14) {
                                                        i18 = 136;
                                                    } else if (K10 == 33) {
                                                        i9 = K9;
                                                        er = er2;
                                                        i18 = 139;
                                                    }
                                                    i9 = K9;
                                                }
                                                i9 = K9;
                                                er = er2;
                                                i18 = 172;
                                            } else if (K8 == 123) {
                                                i9 = K9;
                                                er = er2;
                                                i18 = 138;
                                            } else if (K8 == 10) {
                                                str = lr.k(3, StandardCharsets.UTF_8).trim();
                                                i19 = lr.K();
                                                i9 = K9;
                                            } else if (K8 == 89) {
                                                ArrayList arrayList2 = new ArrayList();
                                                while (lr.f26234b < K9) {
                                                    int i20 = K9;
                                                    String trim = lr.k(3, StandardCharsets.UTF_8).trim();
                                                    lr.K();
                                                    Er er4 = er2;
                                                    byte[] bArr = new byte[4];
                                                    lr.H(bArr, 0, 4);
                                                    arrayList2.add(new C4(trim, bArr));
                                                    K9 = i20;
                                                    er2 = er4;
                                                }
                                                i9 = K9;
                                                er = er2;
                                                arrayList = arrayList2;
                                                i18 = 89;
                                            } else {
                                                i9 = K9;
                                                er = er2;
                                                if (K8 == 111) {
                                                    i18 = 257;
                                                }
                                            }
                                            er = er2;
                                        }
                                        i9 = K9;
                                        i18 = 135;
                                        er = er2;
                                    }
                                    i9 = K9;
                                    er = er2;
                                    i18 = com.anythink.expressad.video.module.a.a.f21888T;
                                }
                                lr.G(i9 - lr.f26234b);
                                i15 = 5;
                                er2 = er;
                            }
                        }
                        Er er32 = er2;
                        lr.E(i17);
                        byte[] copyOfRange2 = Arrays.copyOfRange(lr.f26233a, i16, i17);
                        C3398j5 c3398j52 = new C3398j5();
                        c3398j52.f32083n = i19;
                        c3398j52.f32084u = arrayList != null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
                        c3398j52.f32085v = copyOfRange2;
                        if (h9 != 6) {
                        }
                        h9 = i18;
                        B8 -= h11 + 5;
                        if (sparseBooleanArray.get(h10)) {
                        }
                        i10 = 0;
                        i14 = 12;
                        i11 = i4;
                        i12 = 13;
                        i13 = i;
                        er2 = er32;
                    } else {
                        int size = sparseIntArray.size();
                        int i21 = 0;
                        while (true) {
                            SparseArray sparseArray2 = b42.f23975f;
                            if (i21 >= size) {
                                sparseArray2.remove(this.f34149n);
                                b42.f23979k.v();
                                b42.f23980l = true;
                                return;
                            }
                            int keyAt = sparseIntArray.keyAt(i21);
                            int valueAt = sparseIntArray.valueAt(i21);
                            sparseBooleanArray.put(keyAt, true);
                            b42.f23977h.put(valueAt, true);
                            E4 e42 = (E4) sparseArray.valueAt(i21);
                            if (e42 != null) {
                                e42.c(it, b42.f23979k, new D4(L8, keyAt, 8192));
                                sparseArray2.put(valueAt, e42);
                            }
                            i21++;
                        }
                    }
                }
            }
        }
    }

    public C3877s(B4 b42, int i) {
        Objects.requireNonNull(b42);
        this.f34153x = b42;
        this.f34150u = new Er(new byte[5], 5);
        this.f34151v = new SparseArray();
        this.f34152w = new SparseIntArray();
        this.f34149n = i;
    }

    public C3877s(C4017ue c4017ue, C3818qu c3818qu, C2478Aq c2478Aq) {
        this.f34149n = 1;
        this.f34150u = c4017ue;
        this.f34151v = c2478Aq;
        this.f34152w = new ArrayDeque();
        c3818qu.f33909a = new C2478Aq(6, this);
    }

    public C3877s(FO[] foArr, InterfaceC3716p[] interfaceC3716pArr, C4176xb c4176xb, r rVar) {
        int length = foArr.length;
        PA.n(length == interfaceC3716pArr.length);
        this.f34150u = foArr;
        this.f34151v = (InterfaceC3716p[]) interfaceC3716pArr.clone();
        this.f34152w = c4176xb;
        this.f34153x = rVar;
        this.f34149n = length;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4260z4
    public void c(It it, Q0 q02, D4 d42) {
    }
}
