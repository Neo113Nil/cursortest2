package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.RemoteException;
import android.util.SparseArray;
import android.webkit.WebView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.AbstractC4777a;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4891h;
import q2.C4903n;
import q2.C4907p;
import u2.C5107a;

/* loaded from: classes2.dex */
public final class A3 implements InterfaceC3774q3 {

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f23804A = {0, 7, 8, 15};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f23805B = {0, 119, -120, -1};

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f23806C = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: n, reason: collision with root package name */
    public Object f23807n;

    /* renamed from: u, reason: collision with root package name */
    public Object f23808u;

    /* renamed from: v, reason: collision with root package name */
    public Object f23809v;

    /* renamed from: w, reason: collision with root package name */
    public Object f23810w;

    /* renamed from: x, reason: collision with root package name */
    public Object f23811x;

    /* renamed from: y, reason: collision with root package name */
    public Object f23812y;

    /* renamed from: z, reason: collision with root package name */
    public Object f23813z;

    public A3(Context context, C2889Zc c2889Zc, C5107a c5107a, SD sd) {
        this.f23807n = new Object();
        this.f23812y = new AtomicBoolean(false);
        this.f23808u = context.getApplicationContext();
        this.f23811x = c5107a;
        this.f23810w = c2889Zc;
        this.f23813z = sd;
    }

    public static C3881s3 c(Er er, int i) {
        int h9;
        int h10;
        int i4;
        int i9;
        int i10 = 8;
        int h11 = er.h(8);
        er.f(8);
        int i11 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] g9 = g();
        int[] j9 = j();
        int i12 = i - 2;
        while (i12 > 0) {
            int h12 = er.h(i10);
            int h13 = er.h(i10);
            int[] iArr2 = (h13 & 128) != 0 ? iArr : (h13 & 64) != 0 ? g9 : j9;
            if ((h13 & 1) != 0) {
                i4 = er.h(i10);
                i9 = er.h(i10);
                h9 = er.h(i10);
                h10 = er.h(i10);
                i12 -= 6;
            } else {
                int h14 = er.h(6) << 2;
                int h15 = er.h(4) << 4;
                i12 -= 4;
                h9 = er.h(4) << 4;
                h10 = er.h(2) << 6;
                i4 = h14;
                i9 = h15;
            }
            if (i4 == 0) {
                h10 = 255;
            }
            if (i4 == 0) {
                h9 = i11;
            }
            if (i4 == 0) {
                i9 = i11;
            }
            int i13 = 255 - (h10 & com.anythink.basead.exoplayer.k.p.f8630b);
            double d2 = i4;
            String str = AbstractC3548lu.f32613a;
            double d3 = i9 - 128;
            double d9 = h9 - 128;
            iArr2[h12] = k((byte) i13, Math.max(0, Math.min((int) ((1.402d * d3) + d2), com.anythink.basead.exoplayer.k.p.f8630b)), Math.max(0, Math.min((int) ((d2 - (0.34414d * d9)) - (d3 * 0.71414d)), com.anythink.basead.exoplayer.k.p.f8630b)), Math.max(0, Math.min((int) ((d9 * 1.772d) + d2), com.anythink.basead.exoplayer.k.p.f8630b)));
            i11 = 0;
            h11 = h11;
            j9 = j9;
            i10 = 8;
        }
        return new C3881s3(h11, iArr, g9, j9);
    }

    public static C3989u3 d(Er er) {
        byte[] bArr;
        int h9 = er.h(16);
        er.f(4);
        int h10 = er.h(2);
        boolean g9 = er.g();
        er.f(1);
        byte[] bArr2 = AbstractC3548lu.f32614b;
        if (h10 == 1) {
            er.f(er.h(8) * 16);
        } else if (h10 == 0) {
            int h11 = er.h(16);
            int h12 = er.h(16);
            if (h11 > 0) {
                bArr2 = new byte[h11];
                PA.T(er.f24831c == 0);
                System.arraycopy(er.f24829a, er.f24830b, bArr2, 0, h11);
                er.f24830b += h11;
                er.m();
            }
            if (h12 > 0) {
                bArr = new byte[h12];
                PA.T(er.f24831c == 0);
                System.arraycopy(er.f24829a, er.f24830b, bArr, 0, h12);
                er.f24830b += h12;
                er.m();
                return new C3989u3(h9, g9, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C3989u3(h9, g9, bArr2, bArr);
    }

    public static JSONObject f(Context context, C5107a c5107a) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) AbstractC2632Ka.f25983f.r()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", c5107a.f41217n);
            jSONObject.put("mf", AbstractC2632Ka.f25984g.r());
            jSONObject.put("cl", "910357297");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", W2.c.d(context, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i4 = i & 4;
            int i9 = i & 2;
            int i10 = i & 1;
            if (i < 8) {
                iArr[i] = k(com.anythink.basead.exoplayer.k.p.f8630b, 1 != i10 ? 0 : 255, i9 != 0 ? 255 : 0, i4 != 0 ? 255 : 0);
            } else {
                int i11 = com.anythink.expressad.video.module.a.a.f21886R;
                int i12 = 1 != i10 ? 0 : 127;
                int i13 = i9 != 0 ? 127 : 0;
                if (i4 == 0) {
                    i11 = 0;
                }
                iArr[i] = k(com.anythink.basead.exoplayer.k.p.f8630b, i12, i13, i11);
            }
        }
        return iArr;
    }

    public static int[] j() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i4 = com.anythink.basead.exoplayer.k.p.f8630b;
            if (i < 8) {
                int i9 = i & 2;
                int i10 = i & 4;
                int i11 = 1 != (i & 1) ? 0 : 255;
                int i12 = i9 != 0 ? 255 : 0;
                if (i10 == 0) {
                    i4 = 0;
                }
                iArr[i] = k(63, i11, i12, i4);
            } else {
                int i13 = i & 136;
                if (i13 == 0) {
                    iArr[i] = k(com.anythink.basead.exoplayer.k.p.f8630b, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i13 == 8) {
                    iArr[i] = k(com.anythink.expressad.video.module.a.a.f21886R, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i13 == 128) {
                    iArr[i] = k(com.anythink.basead.exoplayer.k.p.f8630b, (1 != (i & 1) ? 0 : 43) + com.anythink.expressad.video.module.a.a.f21886R + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + com.anythink.expressad.video.module.a.a.f21886R + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + com.anythink.expressad.video.module.a.a.f21886R + ((i & 64) == 0 ? 0 : 85));
                } else if (i13 == 136) {
                    iArr[i] = k(com.anythink.basead.exoplayer.k.p.f8630b, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int k(int i, int i4, int i9, int i10) {
        return (i << 24) | (i4 << 16) | (i9 << 8) | i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ff A[LOOP:3: B:82:0x0164->B:94:0x01ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void l(byte[] bArr, int[] iArr, int i, int i4, int i9, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z8;
        int h9;
        char c4;
        boolean z9;
        int i10;
        int i11;
        int h10;
        int i12;
        boolean z10;
        int i13;
        int h11;
        int h12;
        int i14;
        int i15;
        boolean z11;
        int h13;
        Paint paint2 = paint;
        Er er = new Er(bArr, bArr.length);
        int i16 = i4;
        int i17 = i9;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (er.b() != 0) {
            int h14 = er.h(8);
            if (h14 != 240) {
                int i18 = 3;
                int i19 = 4;
                switch (h14) {
                    case 16:
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArr6 == null) {
                                bArr3 = f23804A;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr6;
                            }
                            z8 = false;
                            while (true) {
                                h9 = er.h(2);
                                if (h9 != 0) {
                                }
                                c4 = 4;
                                if (i11 != 0) {
                                }
                                i12 = i16;
                                i16 = i12 + i11;
                                if (!z9) {
                                }
                                paint2 = paint;
                                z8 = z9;
                            }
                        } else if (bArr4 == null) {
                            bArr3 = f23805B;
                            bArr2 = bArr3;
                            z8 = false;
                            while (true) {
                                h9 = er.h(2);
                                if (h9 != 0) {
                                    z9 = z8;
                                    i10 = h9;
                                    i11 = 1;
                                } else {
                                    if (er.g()) {
                                        h10 = er.h(3) + 3;
                                        i10 = er.h(2);
                                    } else if (er.g()) {
                                        z9 = z8;
                                        i11 = 1;
                                        i10 = 0;
                                    } else {
                                        int h15 = er.h(2);
                                        if (h15 == 0) {
                                            c4 = 4;
                                            z9 = true;
                                            i10 = 0;
                                            i11 = 0;
                                        } else if (h15 == 1) {
                                            c4 = 4;
                                            z9 = z8;
                                            i11 = 2;
                                            i10 = 0;
                                        } else if (h15 == 2) {
                                            c4 = 4;
                                            z9 = z8;
                                            i11 = er.h(4) + 12;
                                            i10 = er.h(2);
                                        } else if (h15 != 3) {
                                            z9 = z8;
                                            i10 = 0;
                                            i11 = 0;
                                        } else {
                                            h10 = er.h(8) + 29;
                                            i10 = er.h(2);
                                        }
                                        if (i11 != 0 || paint2 == null) {
                                            i12 = i16;
                                        } else {
                                            int i20 = i17 + 1;
                                            float f6 = i17;
                                            if (bArr2 != 0) {
                                                i10 = bArr2[i10];
                                            }
                                            paint2.setColor(iArr[i10]);
                                            i12 = i16;
                                            canvas.drawRect(i16, f6, i16 + i11, i20, paint2);
                                        }
                                        i16 = i12 + i11;
                                        if (!z9) {
                                            er.k();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z8 = z9;
                                        }
                                    }
                                    z9 = z8;
                                    i11 = h10;
                                }
                                c4 = 4;
                                if (i11 != 0) {
                                }
                                i12 = i16;
                                i16 = i12 + i11;
                                if (!z9) {
                                }
                            }
                        } else {
                            bArr2 = bArr4;
                            z8 = false;
                            while (true) {
                                h9 = er.h(2);
                                if (h9 != 0) {
                                }
                                c4 = 4;
                                if (i11 != 0) {
                                }
                                i12 = i16;
                                i16 = i12 + i11;
                                if (!z9) {
                                }
                                paint2 = paint;
                                z8 = z9;
                            }
                        }
                    case 17:
                        byte[] bArr7 = i == 3 ? bArr5 == null ? f23806C : bArr5 : null;
                        boolean z12 = false;
                        while (true) {
                            int h16 = er.h(i19);
                            if (h16 != 0) {
                                z10 = z12;
                                i13 = 1;
                            } else if (er.g()) {
                                if (er.g()) {
                                    int h17 = er.h(2);
                                    if (h17 == 0) {
                                        z10 = z12;
                                        i13 = 1;
                                    } else if (h17 == 1) {
                                        z10 = z12;
                                        i13 = 2;
                                    } else if (h17 == 2) {
                                        h11 = er.h(i19) + 9;
                                        h12 = er.h(i19);
                                    } else if (h17 != i18) {
                                        z10 = z12;
                                        h16 = 0;
                                        i13 = 0;
                                    } else {
                                        h11 = er.h(8) + 25;
                                        h12 = er.h(i19);
                                    }
                                    h16 = 0;
                                } else {
                                    h11 = er.h(2) + i19;
                                    h12 = er.h(i19);
                                }
                                i13 = h11;
                                h16 = h12;
                                z10 = z12;
                            } else {
                                int h18 = er.h(i18);
                                if (h18 != 0) {
                                    z10 = z12;
                                    i13 = h18 + 2;
                                    h16 = 0;
                                } else {
                                    z10 = true;
                                    h16 = 0;
                                    i13 = 0;
                                }
                            }
                            if (i13 == 0 || paint2 == null) {
                                i14 = i16;
                                i15 = i18;
                            } else {
                                int i21 = i17 + 1;
                                int i22 = i18;
                                float f9 = i17;
                                if (bArr7 != 0) {
                                    h16 = bArr7[h16];
                                }
                                paint2.setColor(iArr[h16]);
                                i15 = i22;
                                i14 = i16;
                                canvas.drawRect(i16, f9, i16 + i13, i21, paint2);
                            }
                            i16 = i14 + i13;
                            if (z10) {
                                er.k();
                                continue;
                            } else {
                                i18 = i15;
                                z12 = z10;
                                i19 = 4;
                            }
                        }
                    case 18:
                        int i23 = i16;
                        boolean z13 = false;
                        while (true) {
                            int h19 = er.h(8);
                            if (h19 != 0) {
                                z11 = z13;
                                h13 = 1;
                            } else if (er.g()) {
                                z11 = z13;
                                h13 = er.h(7);
                                h19 = er.h(8);
                            } else {
                                int h20 = er.h(7);
                                if (h20 != 0) {
                                    z11 = z13;
                                    h13 = h20;
                                    h19 = 0;
                                } else {
                                    z11 = true;
                                    h19 = 0;
                                    h13 = 0;
                                }
                            }
                            if (h13 != 0 && paint2 != null) {
                                paint2.setColor(iArr[h19]);
                                canvas.drawRect(i23, i17, i23 + h13, i17 + 1, paint2);
                            }
                            i23 += h13;
                            if (z11) {
                                i16 = i23;
                                continue;
                            } else {
                                z13 = z11;
                            }
                        }
                    default:
                        switch (h14) {
                            case 32:
                                bArr6 = m(4, 4, er);
                                break;
                            case 33:
                                bArr4 = m(4, 8, er);
                                break;
                            case 34:
                                bArr5 = m(16, 8, er);
                                break;
                            default:
                                continue;
                        }
                }
            } else {
                i17 += 2;
                i16 = i4;
            }
            paint2 = paint;
        }
    }

    public static byte[] m(int i, int i4, Er er) {
        byte[] bArr = new byte[i];
        for (int i9 = 0; i9 < i; i9++) {
            bArr[i9] = (byte) er.h(i4);
        }
        return bArr;
    }

    public J3.a a() {
        synchronized (this.f23807n) {
            try {
                if (((SharedPreferences) this.f23809v) == null) {
                    this.f23809v = ((Context) this.f23808u).getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = (SharedPreferences) this.f23809v;
        long j9 = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        p2.j.f39798C.f39810k.getClass();
        if (System.currentTimeMillis() - j9 < ((Long) AbstractC2632Ka.f25985h.r()).longValue()) {
            return OD.f26665u;
        }
        return C3686oN.A(((C2889Zc) this.f23810w).a(f((Context) this.f23808u, (C5107a) this.f23811x)), new C2670Me(0, this), ((Boolean) AbstractC2632Ka.f25989m.r()).booleanValue() ? (SD) this.f23813z : AbstractC3212fg.f30745h);
    }

    public void b() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            q2.g1 b9 = q2.g1.b();
            C4903n c4903n = C4907p.f40108g.f40110b;
            Context context = (Context) this.f23808u;
            String str = (String) this.f23809v;
            BinderC3317hd binderC3317hd = (BinderC3317hd) this.f23812y;
            c4903n.getClass();
            q2.K k6 = (q2.K) new C4891h(c4903n, context, b9, str, binderC3317hd).d(context, false);
            this.f23807n = k6;
            if (k6 != null) {
                q2.F0 f02 = (q2.F0) this.f23810w;
                f02.f39943n = currentTimeMillis;
                k6.W1(new G8((AbstractC4777a) this.f23811x, str));
                q2.K k9 = (q2.K) this.f23807n;
                ((q2.f1) this.f23813z).getClass();
                k9.f0(q2.f1.a(context, f02));
            }
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3774q3
    public void e(byte[] bArr, int i, int i4, X1.b bVar) {
        C4259z3 c4259z3;
        C3558m3 c3558m3;
        char c4;
        char c9;
        char c10;
        int i9;
        C3935t3 c3935t3;
        ArrayList arrayList;
        C4259z3 c4259z32;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C4151x3 c4151x3;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z8 = true;
        Er er = new Er(bArr, i + i4);
        er.d(i);
        while (true) {
            int b9 = er.b();
            c4259z3 = (C4259z3) this.f23812y;
            if (b9 >= 48 && er.h(8) == 15) {
                int h9 = er.h(8);
                int h10 = er.h(16);
                int h11 = er.h(16);
                int c11 = er.c() + h11;
                if (h11 * 8 > er.b()) {
                    AbstractC3217fl.I("DvbParser", "Data field length exceeds limit");
                    er.f(er.b());
                } else {
                    switch (h9) {
                        case 16:
                            if (h10 == c4259z3.f35436a) {
                                C3826r2 c3826r2 = c4259z3.i;
                                er.h(8);
                                int h12 = er.h(4);
                                int h13 = er.h(2);
                                er.f(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i19 = h11 - 2; i19 > 0; i19 -= 6) {
                                    int h14 = er.h(8);
                                    er.f(8);
                                    sparseArray.put(h14, new C4097w3(er.h(16), er.h(16)));
                                }
                                C3826r2 c3826r22 = new C3826r2();
                                c3826r22.f33936n = h12;
                                c3826r22.f33937u = h13;
                                c3826r22.f33938v = sparseArray;
                                if (h13 != 0) {
                                    c4259z3.i = c3826r22;
                                    c4259z3.f35438c.clear();
                                    c4259z3.f35439d.clear();
                                    c4259z3.f35440e.clear();
                                    break;
                                } else if (c3826r2 != null && c3826r2.f33936n != h12) {
                                    c4259z3.i = c3826r22;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            C3826r2 c3826r23 = c4259z3.i;
                            if (h10 == c4259z3.f35436a && c3826r23 != null) {
                                int h15 = er.h(8);
                                er.f(4);
                                boolean g9 = er.g();
                                er.f(3);
                                int h16 = er.h(16);
                                int h17 = er.h(16);
                                er.h(3);
                                int h18 = er.h(3);
                                er.f(2);
                                int h19 = er.h(8);
                                int h20 = er.h(8);
                                int h21 = er.h(4);
                                int h22 = er.h(2);
                                er.f(2);
                                int i20 = h11 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i20 > 0) {
                                    int h23 = er.h(16);
                                    int h24 = er.h(2);
                                    er.h(2);
                                    int h25 = er.h(12);
                                    er.f(4);
                                    int h26 = er.h(12);
                                    int i21 = i20 - 6;
                                    if (h24 == 1 || h24 == 2) {
                                        er.h(8);
                                        er.h(8);
                                        i20 -= 8;
                                    } else {
                                        i20 = i21;
                                    }
                                    sparseArray2.put(h23, new C4205y3(h25, h26));
                                }
                                C4151x3 c4151x32 = new C4151x3(h15, g9, h16, h17, h18, h19, h20, h21, h22, sparseArray2);
                                SparseArray sparseArray3 = c4259z3.f35438c;
                                if (c3826r23.f33937u == 0 && (c4151x3 = (C4151x3) sparseArray3.get(h15)) != null) {
                                    int i22 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = c4151x3.f35118j;
                                        if (i22 < sparseArray4.size()) {
                                            c4151x32.f35118j.put(sparseArray4.keyAt(i22), (C4205y3) sparseArray4.valueAt(i22));
                                            i22++;
                                        }
                                    }
                                }
                                sparseArray3.put(c4151x32.f35110a, c4151x32);
                                break;
                            }
                            break;
                        case 18:
                            if (h10 == c4259z3.f35436a) {
                                C3881s3 c12 = c(er, h11);
                                c4259z3.f35439d.put(c12.f34181a, c12);
                                break;
                            } else if (h10 == c4259z3.f35437b) {
                                C3881s3 c13 = c(er, h11);
                                c4259z3.f35441f.put(c13.f34181a, c13);
                                break;
                            }
                            break;
                        case 19:
                            if (h10 == c4259z3.f35436a) {
                                C3989u3 d2 = d(er);
                                c4259z3.f35440e.put(d2.f34524a, d2);
                                break;
                            } else if (h10 == c4259z3.f35437b) {
                                C3989u3 d3 = d(er);
                                c4259z3.f35442g.put(d3.f34524a, d3);
                                break;
                            }
                            break;
                        case 20:
                            if (h10 == c4259z3.f35436a) {
                                er.f(4);
                                boolean g10 = er.g();
                                er.f(3);
                                int h27 = er.h(16);
                                int h28 = er.h(16);
                                if (g10) {
                                    int h29 = er.h(16);
                                    int h30 = er.h(16);
                                    int h31 = er.h(16);
                                    i15 = h30;
                                    i16 = er.h(16);
                                    i18 = h31;
                                    i17 = h29;
                                } else {
                                    i15 = h27;
                                    i16 = h28;
                                    i17 = 0;
                                    i18 = 0;
                                }
                                c4259z3.f35443h = new C3935t3(h27, h28, i17, i15, i18, i16);
                                break;
                            }
                            break;
                    }
                    er.l(c11 - er.c());
                }
            }
        }
        C3826r2 c3826r24 = c4259z3.i;
        if (c3826r24 == null) {
            SB sb = UB.f27942u;
            c3558m3 = new C3558m3(C3675oC.f33115x, com.anythink.basead.exoplayer.b.f6539b, com.anythink.basead.exoplayer.b.f6539b);
        } else {
            C3935t3 c3935t32 = c4259z3.f35443h;
            if (c3935t32 == null) {
                c3935t32 = (C3935t3) this.f23810w;
            }
            Bitmap bitmap = (Bitmap) this.f23813z;
            Canvas canvas = (Canvas) this.f23809v;
            if (bitmap == null || c3935t32.f34339a + 1 != bitmap.getWidth() || c3935t32.f34340b + 1 != ((Bitmap) this.f23813z).getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(c3935t32.f34339a + 1, c3935t32.f34340b + 1, Bitmap.Config.ARGB_8888);
                this.f23813z = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i23 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) c3826r24.f33938v;
                if (i23 < sparseArray5.size()) {
                    canvas.save();
                    C4097w3 c4097w3 = (C4097w3) sparseArray5.valueAt(i23);
                    C4151x3 c4151x33 = (C4151x3) c4259z3.f35438c.get(sparseArray5.keyAt(i23));
                    int i24 = c4097w3.f34918a + c3935t32.f34341c;
                    int i25 = c4097w3.f34919b + c3935t32.f34343e;
                    int i26 = c4151x33.f35112c;
                    int i27 = i24 + i26;
                    int min = Math.min(i27, c3935t32.f34342d);
                    boolean z9 = z8;
                    int i28 = c4151x33.f35113d;
                    int i29 = i25 + i28;
                    canvas.clipRect(i24, i25, min, Math.min(i29, c3935t32.f34344f));
                    SparseArray sparseArray6 = c4259z3.f35439d;
                    int i30 = c4151x33.f35115f;
                    C3881s3 c3881s3 = (C3881s3) sparseArray6.get(i30);
                    if (c3881s3 == null && (c3881s3 = (C3881s3) c4259z3.f35441f.get(i30)) == null) {
                        c3881s3 = (C3881s3) this.f23811x;
                    }
                    C3826r2 c3826r25 = c3826r24;
                    int i31 = 0;
                    while (true) {
                        SparseArray sparseArray7 = c4151x33.f35118j;
                        int i32 = i23;
                        if (i31 < sparseArray7.size()) {
                            int keyAt = sparseArray7.keyAt(i31);
                            C4205y3 c4205y3 = (C4205y3) sparseArray7.valueAt(i31);
                            Canvas canvas2 = canvas;
                            C3989u3 c3989u3 = (C3989u3) c4259z3.f35440e.get(keyAt);
                            if (c3989u3 == null) {
                                c3989u3 = (C3989u3) c4259z3.f35442g.get(keyAt);
                            }
                            C3989u3 c3989u32 = c3989u3;
                            if (c3989u32 != null) {
                                Paint paint = c3989u32.f34525b ? null : (Paint) this.f23807n;
                                c4259z32 = c4259z3;
                                int i33 = c4205y3.f35301a + i24;
                                int i34 = c4205y3.f35302b + i25;
                                int i35 = i24;
                                int i36 = c4151x33.f35114e;
                                i14 = i31;
                                Paint paint2 = paint;
                                int i37 = i25;
                                int[] iArr = i36 == 3 ? c3881s3.f34184d : i36 == 2 ? c3881s3.f34183c : c3881s3.f34182b;
                                i11 = i35;
                                arrayList = arrayList2;
                                i12 = i26;
                                i10 = i37;
                                c3935t3 = c3935t32;
                                i13 = i27;
                                l(c3989u32.f34526c, iArr, i36, i33, i34, paint2, canvas2);
                                l(c3989u32.f34527d, iArr, i36, i33, i34 + 1, paint2, canvas2);
                            } else {
                                c3935t3 = c3935t32;
                                arrayList = arrayList2;
                                c4259z32 = c4259z3;
                                i10 = i25;
                                i11 = i24;
                                i12 = i26;
                                i13 = i27;
                                i14 = i31;
                            }
                            i31 = i14 + 1;
                            i24 = i11;
                            i27 = i13;
                            i26 = i12;
                            i25 = i10;
                            canvas = canvas2;
                            i23 = i32;
                            c4259z3 = c4259z32;
                            arrayList2 = arrayList;
                            c3935t32 = c3935t3;
                        } else {
                            C3935t3 c3935t33 = c3935t32;
                            ArrayList arrayList3 = arrayList2;
                            C4259z3 c4259z33 = c4259z3;
                            Canvas canvas3 = canvas;
                            int i38 = i25;
                            int i39 = i24;
                            int i40 = i26;
                            int i41 = i27;
                            float f6 = i38;
                            float f9 = i39;
                            if (c4151x33.f35111b) {
                                int i42 = c4151x33.f35114e;
                                if (i42 == 3) {
                                    i9 = c3881s3.f34184d[c4151x33.f35116g];
                                    c10 = 2;
                                } else {
                                    c10 = 2;
                                    i9 = i42 == 2 ? c3881s3.f34183c[c4151x33.f35117h] : c3881s3.f34182b[c4151x33.i];
                                }
                                Paint paint3 = (Paint) this.f23808u;
                                paint3.setColor(i9);
                                float f10 = i41;
                                c9 = c10;
                                c4 = 3;
                                canvas = canvas3;
                                canvas.drawRect(f9, f6, f10, i29, paint3);
                            } else {
                                canvas = canvas3;
                                c4 = 3;
                                c9 = 2;
                            }
                            Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) this.f23813z, i39, i38, i40, i28);
                            float f11 = c3935t33.f34339a;
                            float f12 = c3935t33.f34340b;
                            arrayList3.add(new C2522Dj(null, null, null, createBitmap2, f6 / f12, 0, 0, f9 / f11, 0, Integer.MIN_VALUE, -3.4028235E38f, i40 / f11, i28 / f12, Integer.MIN_VALUE, 0.0f, 0));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            arrayList2 = arrayList3;
                            c4259z3 = c4259z33;
                            c3935t32 = c3935t33;
                            i23 = i32 + 1;
                            z8 = z9;
                            c3826r24 = c3826r25;
                        }
                    }
                } else {
                    c3558m3 = new C3558m3(arrayList2, com.anythink.basead.exoplayer.b.f6539b, com.anythink.basead.exoplayer.b.f6539b);
                }
            }
        }
        bVar.mo2b(c3558m3);
    }

    public C4167xJ h() {
        Mt mt;
        Mt mt2;
        C4221yJ c4221yJ = (C4221yJ) this.f23807n;
        if (c4221yJ == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        Mt mt3 = (Mt) this.f23809v;
        if (mt3 == null || (mt = (Mt) this.f23810w) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        Mt mt4 = (Mt) this.f23808u;
        if (mt4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        Mt mt5 = (Mt) this.f23811x;
        if (mt5 == null || (mt2 = (Mt) this.f23812y) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        Mt mt6 = (Mt) this.f23813z;
        if (mt6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = c4221yJ.f35337b.f34971b;
        BigInteger bigInteger2 = (BigInteger) mt3.f26393u;
        if (!bigInteger2.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        BigInteger bigInteger3 = (BigInteger) mt.f26393u;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger2.multiply(bigInteger3).equals(c4221yJ.f35338c)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger4 = BigInteger.ONE;
        BigInteger subtract = bigInteger2.subtract(bigInteger4);
        BigInteger subtract2 = bigInteger3.subtract(bigInteger4);
        if (!bigInteger.multiply((BigInteger) mt4.f26393u).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(bigInteger4)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply((BigInteger) mt5.f26393u).mod(subtract).equals(bigInteger4)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply((BigInteger) mt2.f26393u).mod(subtract2).equals(bigInteger4)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger3.multiply((BigInteger) mt6.f26393u).mod(bigInteger2).equals(bigInteger4)) {
            return new C4167xJ((C4221yJ) this.f23807n, (Mt) this.f23809v, (Mt) this.f23810w, (Mt) this.f23808u, (Mt) this.f23811x, (Mt) this.f23812y, (Mt) this.f23813z);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public FJ i() {
        Mt mt;
        Mt mt2;
        GJ gj = (GJ) this.f23807n;
        if (gj == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        Mt mt3 = (Mt) this.f23809v;
        if (mt3 == null || (mt = (Mt) this.f23810w) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        Mt mt4 = (Mt) this.f23808u;
        if (mt4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        Mt mt5 = (Mt) this.f23811x;
        if (mt5 == null || (mt2 = (Mt) this.f23812y) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        Mt mt6 = (Mt) this.f23813z;
        if (mt6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = gj.f25135b.f24695b;
        BigInteger bigInteger2 = (BigInteger) mt3.f26393u;
        if (!bigInteger2.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        BigInteger bigInteger3 = (BigInteger) mt.f26393u;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger2.multiply(bigInteger3).equals(gj.f25136c)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger4 = BigInteger.ONE;
        BigInteger subtract = bigInteger2.subtract(bigInteger4);
        BigInteger subtract2 = bigInteger3.subtract(bigInteger4);
        if (!bigInteger.multiply((BigInteger) mt4.f26393u).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(bigInteger4)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply((BigInteger) mt5.f26393u).mod(subtract).equals(bigInteger4)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply((BigInteger) mt2.f26393u).mod(subtract2).equals(bigInteger4)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger3.multiply((BigInteger) mt6.f26393u).mod(bigInteger2).equals(bigInteger4)) {
            return new FJ((GJ) this.f23807n, (Mt) this.f23809v, (Mt) this.f23810w, (Mt) this.f23808u, (Mt) this.f23811x, (Mt) this.f23812y, (Mt) this.f23813z);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public /* synthetic */ A3(boolean z8) {
        this.f23807n = null;
        this.f23808u = null;
        this.f23809v = null;
        this.f23810w = null;
        this.f23811x = null;
        this.f23812y = null;
        this.f23813z = null;
    }

    public A3() {
        this.f23812y = new s.k();
        this.f23813z = new s.k();
    }

    public A3(Context context, String str, q2.F0 f02, AbstractC4777a abstractC4777a) {
        this.f23812y = new BinderC3317hd();
        this.f23808u = context;
        this.f23809v = str;
        this.f23810w = f02;
        this.f23811x = abstractC4777a;
        this.f23813z = q2.f1.f40041a;
    }

    public A3(C3582ma c3582ma, WebView webView, String str, String str2, Vv vv) {
        this.f23809v = new ArrayList();
        this.f23810w = new HashMap();
        this.f23807n = c3582ma;
        this.f23808u = webView;
        this.f23813z = vv;
        this.f23812y = str;
        this.f23811x = str2;
    }
}
