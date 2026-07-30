package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import k2.C4630a;
import n2.C4806b;
import org.json.JSONObject;
import q2.C4927z0;
import w2.InterfaceC5155c;

/* loaded from: classes2.dex */
public final class Rx implements O4, InterfaceC3426jg, InterfaceC5155c, LD, Gu, InterfaceC3701ol, InterfaceC2656Lh, InterfaceC2528Dp {

    /* renamed from: v, reason: collision with root package name */
    public static Rx f27445v;

    /* renamed from: w, reason: collision with root package name */
    public static final C3307hK f27446w = new C3307hK((byte) 0, 7);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27447n;

    /* renamed from: u, reason: collision with root package name */
    public Object f27448u;

    public /* synthetic */ Rx(int i, Object obj) {
        this.f27447n = i;
        this.f27448u = obj;
    }

    public static final Rx g(Context context) {
        Rx rx;
        synchronized (Rx.class) {
            try {
                if (f27445v == null) {
                    f27445v = new Rx(context);
                }
                rx = f27445v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rx;
    }

    @Override // com.google.android.gms.internal.ads.O4
    public long a() {
        return ((ByteBuffer) this.f27448u).capacity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.android.gms.internal.ads.Af] */
    @Override // com.google.android.gms.internal.ads.Gu
    public Object b(Object obj) {
        A2.c cVar;
        A2.b bVar;
        switch (this.f27447n) {
            case 17:
                C2953au c2953au = (C2953au) obj;
                C4237yi c4237yi = ((C2709Oj) this.f27448u).f26740d;
                Iterator it = ((ArrayList) c2953au.f29349b.f24455w).iterator();
                while (it.hasNext()) {
                    Zt zt = (Zt) it.next();
                    String str = zt.f29088a;
                    Map map = c4237yi.f35384a;
                    boolean containsKey = map.containsKey(str);
                    JSONObject jSONObject = zt.f29089b;
                    if (containsKey && jSONObject != null) {
                        C2572Gi c2572Gi = (C2572Gi) map.get(str);
                        switch (c2572Gi.f25203a) {
                            case 0:
                                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Aa)).booleanValue()) {
                                    C2748Qo c2748Qo = (C2748Qo) c2572Gi.f25204b;
                                    synchronized (c2748Qo) {
                                        c2748Qo.f27231p = jSONObject;
                                    }
                                    break;
                                } else {
                                    continue;
                                }
                            case 1:
                                A2.a aVar = null;
                                if (jSONObject.has("AvailableMemoryTier")) {
                                    int optInt = jSONObject.optInt("AvailableMemoryTier", -1);
                                    A2.b[] values = A2.b.values();
                                    int length = values.length;
                                    int i = 0;
                                    while (true) {
                                        if (i < length) {
                                            bVar = values[i];
                                            if (bVar.f24n != optInt) {
                                                i++;
                                            }
                                        } else {
                                            bVar = null;
                                        }
                                    }
                                    if (bVar != null) {
                                        ((A2.d) c2572Gi.f25204b).f31d.set(bVar);
                                    }
                                }
                                if (jSONObject.has("AvailableProcessorTier")) {
                                    int optInt2 = jSONObject.optInt("AvailableProcessorTier", -1);
                                    A2.c[] values2 = A2.c.values();
                                    int length2 = values2.length;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < length2) {
                                            cVar = values2[i4];
                                            if (cVar.f27n != optInt2) {
                                                i4++;
                                            }
                                        } else {
                                            cVar = null;
                                        }
                                    }
                                    if (cVar != null) {
                                        ((A2.d) c2572Gi.f25204b).f32e.set(cVar);
                                    }
                                }
                                if (jSONObject.has("AdvertisedMemoryTier")) {
                                    int optInt3 = jSONObject.optInt("AdvertisedMemoryTier", -1);
                                    A2.a[] values3 = A2.a.values();
                                    int length3 = values3.length;
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 < length3) {
                                            A2.a aVar2 = values3[i9];
                                            if (aVar2.f21n == optInt3) {
                                                aVar = aVar2;
                                            } else {
                                                i9++;
                                            }
                                        }
                                    }
                                    if (aVar != null) {
                                        A2.d dVar = (A2.d) c2572Gi.f25204b;
                                        synchronized (dVar) {
                                            dVar.f30c.set(aVar);
                                            dVar.f28a.getSharedPreferences("admob", 0).edit().putInt("advertised_memory_tier", aVar.f21n).apply();
                                        }
                                        break;
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            default:
                                ((C2467Af) ((C2881Yl) c2572Gi.f25204b).f28863v).a(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong(com.anythink.expressad.foundation.d.d.f18754u));
                                break;
                        }
                    } else {
                        Map map2 = c4237yi.f35385b;
                        if (map2.containsKey(str) && jSONObject != null) {
                            InterfaceC2470Ai interfaceC2470Ai = (InterfaceC2470Ai) map2.get(str);
                            HashMap hashMap = new HashMap();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String optString = jSONObject.optString(next);
                                if (optString != null) {
                                    hashMap.put(next, optString);
                                }
                            }
                            interfaceC2470Ai.a(hashMap);
                        }
                    }
                }
                return c2953au;
            default:
                C2834Vp.i((SQLiteDatabase) obj, (u2.l) this.f27448u);
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2528Dp
    public /* synthetic */ J3.a c(C2687Ne c2687Ne) {
        return ((BinderC2630Jp) ((InterfaceC3901sN) ((C4017ue) this.f27448u).f34632w).d()).H3(c2687Ne, Binder.getCallingUid());
    }

    @Override // com.google.android.gms.internal.ads.O4
    public void d(MessageDigest[] messageDigestArr, long j9, int i) {
        ByteBuffer slice;
        ByteBuffer byteBuffer = (ByteBuffer) this.f27448u;
        synchronized (byteBuffer) {
            int i4 = (int) j9;
            byteBuffer.position(i4);
            byteBuffer.limit(i4 + i);
            slice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public R3 e(J0 j02, T2 t22, int i) {
        int i4;
        C3810qm c3810qm;
        int i9 = 0;
        R3 r32 = null;
        loop0: while (true) {
            int i10 = 0;
            do {
                int i11 = i10 % 10;
                Lr lr = (Lr) this.f27448u;
                if (i11 == 0) {
                    if (i10 != 0) {
                        byte[] bArr = lr.f26233a;
                        System.arraycopy(bArr, 10, bArr, 0, 9);
                    }
                    i4 = 0;
                } else {
                    i4 = i11;
                }
                boolean z8 = true;
                int i12 = i10 == 0 ? 10 : 1;
                try {
                    int i13 = i11 + 10;
                    j02.I(lr.f26233a, i13 - i12, i12, false);
                    lr.E(i4);
                    lr.C(i13);
                    if (lr.B() < 3) {
                        int i14 = lr.f26234b;
                        int i15 = lr.f26235c;
                        throw new IndexOutOfBoundsException(D.y.n(new StringBuilder(String.valueOf(i14).length() + 17 + String.valueOf(i15).length()), "position=", i14, ", limit=", i15));
                    }
                    int O8 = lr.O();
                    int i16 = lr.f26234b - 3;
                    lr.f26234b = i16;
                    if (O8 != 4801587) {
                        if (AbstractC3194fG.b(lr.J()) != -1) {
                            break loop0;
                        }
                        if (i10 == 0) {
                            lr.A(20);
                        }
                        i10++;
                    } else {
                        lr.G(6);
                        int g9 = lr.g();
                        int i17 = g9 + 10;
                        if (r32 == null) {
                            byte[] bArr2 = new byte[i17];
                            System.arraycopy(lr.f26233a, i16, bArr2, 0, 10);
                            j02.I(bArr2, 10, g9, false);
                            ArrayList arrayList = new ArrayList();
                            Lr lr2 = new Lr(bArr2, i17);
                            if (lr2.B() < 10) {
                                AbstractC3217fl.I("Id3Decoder", "Data too short to be an ID3 tag");
                            } else {
                                int O9 = lr2.O();
                                if (O9 != 4801587) {
                                    AbstractC3217fl.I("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(O9))));
                                } else {
                                    int K8 = lr2.K();
                                    lr2.G(1);
                                    int K9 = lr2.K();
                                    int g10 = lr2.g();
                                    if (K8 == 2) {
                                        if ((K9 & 64) != 0) {
                                            AbstractC3217fl.I("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                                        }
                                        c3810qm = new C3810qm(K8, K8 >= 4 && (K9 & 128) != 0, g10);
                                    } else {
                                        if (K8 == 3) {
                                            if ((K9 & 64) != 0) {
                                                int b9 = lr2.b();
                                                lr2.G(b9);
                                                g10 -= b9 + 4;
                                            }
                                        } else if (K8 == 4) {
                                            if ((K9 & 64) != 0) {
                                                int g11 = lr2.g();
                                                lr2.G(g11 - 4);
                                                g10 -= g11;
                                            }
                                            if ((K9 & 16) != 0) {
                                                g10 -= 10;
                                            }
                                        } else {
                                            com.anythink.basead.b.c.i.s(K8, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder", new StringBuilder(String.valueOf(K8).length() + 46));
                                        }
                                        c3810qm = new C3810qm(K8, K8 >= 4 && (K9 & 128) != 0, g10);
                                    }
                                    if (c3810qm != null) {
                                        int i18 = lr2.f26234b;
                                        int i19 = c3810qm.f33872a;
                                        int i20 = i19 == 2 ? 6 : 10;
                                        boolean z9 = c3810qm.f33873b;
                                        int i21 = c3810qm.f33874c;
                                        if (z9) {
                                            i21 = AbstractC2720Pd.G(i21, lr2);
                                        }
                                        lr2.C(i18 + i21);
                                        if (AbstractC2720Pd.s(lr2, i19, i20, false)) {
                                            z8 = false;
                                        } else if (i19 != 4 || !AbstractC2720Pd.s(lr2, 4, i20, true)) {
                                            com.anythink.basead.b.c.i.s(i19, "Failed to validate ID3 tag with majorVersion=", "Id3Decoder", new StringBuilder(String.valueOf(i19).length() + 45));
                                        }
                                        while (lr2.B() >= i20) {
                                            Y1 w9 = AbstractC2720Pd.w(i19, lr2, z8, t22);
                                            if (w9 != null) {
                                                arrayList.add(w9);
                                            }
                                        }
                                        r32 = new R3(arrayList);
                                    }
                                    r32 = null;
                                }
                            }
                            c3810qm = null;
                            if (c3810qm != null) {
                            }
                            r32 = null;
                        } else {
                            j02.d(g9, false);
                        }
                        i9 += i17;
                    }
                } catch (EOFException unused) {
                }
            } while (i10 <= i);
        }
        j02.f25677y = 0;
        j02.d(i9, false);
        return r32;
    }

    @Override // w2.InterfaceC5155c
    public void f(C4630a c4630a) {
        switch (this.f27447n) {
            case 11:
                try {
                    ((InterfaceC2533Ed) this.f27448u).a(c4630a.a());
                    break;
                } catch (RemoteException e6) {
                    u2.i.d("", e6);
                    return;
                }
            default:
                try {
                    ((InterfaceC2499Cd) this.f27448u).a(c4630a.a());
                    break;
                } catch (RemoteException e9) {
                    u2.i.d("", e9);
                }
        }
    }

    public AbstractC3149eQ[] h(Handler handler, VN vn, VN vn2) {
        boolean z8 = false;
        C3267gh c3267gh = (C3267gh) this.f27448u;
        c3267gh.getClass();
        C3796qP c3796qP = C3796qP.f33728z;
        Context context = c3267gh.f31048n;
        AP ap = new AP(context);
        PA.T(!ap.f23869c);
        ap.f23869c = true;
        if (ap.f23872f == null) {
            ap.f23872f = new C3602mu(new InterfaceC3050ci[0]);
        }
        if (ap.f23871e == null) {
            if (ap.f23873g == null) {
                ap.f23873g = new C4164xG(context);
            }
            if (ap.f23870d == null) {
                ap.f23870d = T2.f27681C;
            }
            C4017ue c4017ue = new C4017ue(context);
            XO xo = context != null ? null : ap.f23868b;
            Context context2 = (Context) c4017ue.f34630u;
            if (context2 == null) {
                c4017ue.f34631v = xo;
            }
            C4164xG c4164xG = ap.f23873g;
            c4017ue.f34632w = c4164xG;
            if (c4164xG == null) {
                c4017ue.f34632w = new C4164xG(context2);
            }
            C4313b c4313b = new C4313b();
            Context context3 = (Context) c4017ue.f34630u;
            c4313b.f35811a = context3;
            C4164xG c4164xG2 = (C4164xG) c4017ue.f34632w;
            c4164xG2.getClass();
            c4313b.i = c4164xG2;
            c4313b.f35815e = (XO) c4017ue.f34631v;
            c4313b.f35812b = context3 != null ? new C4086vt(c4313b) : null;
            c4313b.f35814d = T2.f27691y;
            ap.f23871e = c4313b;
        } else {
            PA.T(ap.f23873g == null);
            PA.T(ap.f23870d == null);
        }
        GP gp = new GP(context, new C3042ca(context, z8), handler, vn2, new EP(ap));
        W w9 = new W();
        w9.f28333b = context;
        w9.f28334c = C3796qP.f33728z;
        w9.f28335d = new C3042ca(context, z8);
        w9.f28334c = c3796qP;
        w9.f28336e = handler;
        w9.f28337f = vn;
        PA.T(!w9.f28332a);
        Handler handler2 = (Handler) w9.f28336e;
        PA.T((handler2 == null && ((VN) w9.f28337f) == null) || !(handler2 == null || ((VN) w9.f28337f) == null));
        w9.f28332a = true;
        return new AbstractC3149eQ[]{gp, new X(w9)};
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
        switch (this.f27447n) {
            case 16:
                C2776Si c2776Si = (C2776Si) this.f27448u;
                Ut ut = c2776Si.f27607y;
                c2776Si.f27591A.b(true == p2.j.f39798C.f39808h.i(c2776Si.f27602n) ? 2 : 1, c2776Si.f27608z.b(c2776Si.f27606x, ut, false, "", (String) obj, ut.f28143c, null, null));
                break;
            case 25:
                ((C2612Io) obj).f25617F = true;
                ((BinderC2948ap) this.f27448u).f29326w.b();
                break;
            default:
                C2953au c2953au = (C2953au) obj;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31512O2)).booleanValue()) {
                    ((C3813qp) this.f27448u).f33890k.D(c2953au);
                    break;
                }
                break;
        }
    }

    public void m(boolean z8) {
        synchronized (Rx.class) {
            try {
                C2593Hm c2593Hm = (C2593Hm) this.f27448u;
                c2593Hm.j(Boolean.valueOf(z8), "paidv2_publisher_option");
                if (!z8) {
                    c2593Hm.w("paidv2_creation_time");
                    c2593Hm.w("paidv2_id");
                    c2593Hm.w("vendor_scoped_gpid_v2_id");
                    c2593Hm.w("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6 */
    public List n(C3398j5 c3398j5) {
        String str;
        int i;
        List list;
        Lr lr = new Lr((byte[]) c3398j5.f32085v);
        ArrayList arrayList = (C3675oC) this.f27448u;
        while (lr.B() > 0) {
            int K8 = lr.K();
            int K9 = lr.f26234b + lr.K();
            if (K8 == 134) {
                arrayList = new ArrayList();
                int K10 = lr.K() & 31;
                for (int i4 = 0; i4 < K10; i4++) {
                    String k6 = lr.k(3, StandardCharsets.UTF_8);
                    int K11 = lr.K();
                    boolean z8 = (K11 & 128) != 0;
                    if (z8) {
                        i = K11 & 63;
                        str = com.anythink.basead.exoplayer.k.o.f8599X;
                    } else {
                        str = com.anythink.basead.exoplayer.k.o.f8598W;
                        i = 1;
                    }
                    byte K12 = (byte) lr.K();
                    lr.G(1);
                    if (z8) {
                        int i9 = K12 & com.anythink.core.common.s.a.c.f16475b;
                        byte[] bArr = AbstractC4295zm.f35602a;
                        list = Collections.singletonList(i9 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C4065vP c4065vP = new C4065vP();
                    c4065vP.e(str);
                    c4065vP.f34776d = k6;
                    c4065vP.f34770L = i;
                    c4065vP.f34788q = list;
                    arrayList.add(new TP(c4065vP));
                }
            }
            lr.E(K9);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        int i = this.f27447n;
    }

    public Rx(int i) {
        this.f27447n = i;
        switch (i) {
            case 2:
                this.f27448u = new Lr(10);
                break;
            case 7:
                this.f27448u = Collections.EMPTY_LIST;
                break;
            case 13:
                this.f27448u = new WeakHashMap();
                break;
            default:
                int i4 = KK.f25952a;
                this.f27448u = new C4086vt(8, new InterfaceC4277zL[]{T2.f27680B, f27446w});
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2656Lh
    /* renamed from: a, reason: collision with other method in class */
    public void mo4a() {
        switch (this.f27447n) {
            case 23:
                ((W8) this.f27448u).d();
                break;
            default:
                J3.a a9 = ((A3) this.f27448u).a();
                String str = "persistFlags";
                if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.D8)).booleanValue()) {
                    AbstractC2720Pd.g(a9, "persistFlags", AbstractC3212fg.f30745h);
                    break;
                } else {
                    C3731pE c3731pE = new C3731pE(str, 4);
                    a9.c(new MD(0, a9, c3731pE), AbstractC3212fg.f30745h);
                    break;
                }
        }
    }

    public Rx(Context context) {
        this.f27447n = 0;
        if (C2593Hm.f25414w == null) {
            C2593Hm.f25414w = new C2593Hm(context);
        }
        this.f27448u = C2593Hm.f25414w;
    }

    public Rx(InterfaceC4284zb interfaceC4284zb) {
        Context context;
        this.f27447n = 8;
        this.f27448u = interfaceC4284zb;
        try {
            context = (Context) V2.b.A0(interfaceC4284zb.o2());
        } catch (RemoteException | NullPointerException e6) {
            u2.i.d("", e6);
            context = null;
        }
        if (context != null) {
            try {
                ((InterfaceC4284zb) this.f27448u).F(new V2.b(new C4806b(context)));
            } catch (RemoteException e9) {
                u2.i.d("", e9);
            }
        }
    }

    public Rx(C2770Sc c2770Sc, C2753Rc c2753Rc) {
        this.f27447n = 10;
        this.f27448u = c2753Rc;
        Objects.requireNonNull(c2770Sc);
    }

    public Rx(BinderC2737Qd binderC2737Qd, InterfaceC2499Cd interfaceC2499Cd) {
        this.f27447n = 12;
        this.f27448u = interfaceC2499Cd;
        Objects.requireNonNull(binderC2737Qd);
    }

    public Rx(BinderC2737Qd binderC2737Qd, InterfaceC2533Ed interfaceC2533Ed) {
        this.f27447n = 11;
        this.f27448u = interfaceC2533Ed;
        Objects.requireNonNull(binderC2737Qd);
    }

    public Rx(C2776Si c2776Si) {
        this.f27447n = 16;
        Objects.requireNonNull(c2776Si);
        this.f27448u = c2776Si;
    }

    public Rx(C2611In c2611In) {
        this.f27447n = 24;
        Objects.requireNonNull(c2611In);
        this.f27448u = c2611In;
    }

    public Rx(BinderC2948ap binderC2948ap) {
        this.f27447n = 25;
        Objects.requireNonNull(binderC2948ap);
        this.f27448u = binderC2948ap;
    }

    public Rx(C3813qp c3813qp) {
        this.f27447n = 26;
        Objects.requireNonNull(c3813qp);
        this.f27448u = c3813qp;
    }

    public Rx(ByteBuffer byteBuffer) {
        this.f27447n = 5;
        this.f27448u = byteBuffer.slice();
    }

    private final void i(Throwable th) {
    }

    private final void j(Throwable th) {
    }

    private final void k(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3426jg
    /* renamed from: b, reason: collision with other method in class */
    public void mo5b(Object obj) {
        switch (this.f27447n) {
            case 10:
                C2634Kc c2634Kc = (C2634Kc) obj;
                t2.C.k("Getting a new session for JS Engine.");
                c2634Kc.getClass();
                ((C3320hg) ((C2753Rc) this.f27448u).f683u).a(new C2804Uc(c2634Kc));
                break;
            case 18:
                ((InterfaceC2472Ak) obj).b((C4927z0) this.f27448u);
                break;
            case 19:
                ((InterfaceC2761Rk) obj).a((q2.h1) this.f27448u);
                break;
            case 20:
                ((InterfaceC3539ll) obj).M((E9) this.f27448u);
                break;
            default:
                ((InterfaceC2592Hl) obj).a((B2.u) this.f27448u);
                break;
        }
    }
}
