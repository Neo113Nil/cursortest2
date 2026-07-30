package com.google.android.gms.internal.ads;

import O2.InterfaceC0365b;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.ECPoint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q2.AbstractBinderC4882c0;
import q2.InterfaceC4884d0;
import t0.AbstractC5051n;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.mu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3602mu implements InterfaceC3392j, InterfaceC4260z4, InterfaceC0365b, InterfaceC3373ig, InterfaceC3701ol, InterfaceC2639Kh, InterfaceC2779Sl, InterfaceC3985u, InterfaceC3273gn {

    /* renamed from: x, reason: collision with root package name */
    public static C3602mu f32772x;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32773n;

    /* renamed from: u, reason: collision with root package name */
    public Object f32774u;

    /* renamed from: v, reason: collision with root package name */
    public Object f32775v;

    /* renamed from: w, reason: collision with root package name */
    public Object f32776w;

    public /* synthetic */ C3602mu(int i, Object obj, Object obj2) {
        this.f32773n = i;
        this.f32774u = obj;
        this.f32775v = obj2;
    }

    public static C3602mu e(Context context) {
        synchronized (C3602mu.class) {
            try {
                C3602mu c3602mu = f32772x;
                if (c3602mu != null) {
                    return c3602mu;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) AbstractC2649La.f26164b.r()).longValue();
                InterfaceC4884d0 interfaceC4884d0 = null;
                if (longValue > 0 && longValue <= 254730000) {
                    try {
                        interfaceC4884d0 = AbstractBinderC4882c0.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e6) {
                        int i = t2.C.f40822b;
                        u2.i.d("Failed to retrieve lite SDK info.", e6);
                    }
                }
                C3602mu c3602mu2 = new C3602mu(applicationContext, interfaceC4884d0);
                f32772x = c3602mu2;
                return c3602mu2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void n(C3602mu c3602mu, MF mf) {
        long[] jArr = (long[]) c3602mu.f32774u;
        C3602mu c3602mu2 = mf.f26316a;
        long[] jArr2 = (long[]) c3602mu2.f32774u;
        long[] jArr3 = mf.f26317b;
        AbstractC3217fl.U(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) c3602mu.f32775v;
        long[] jArr5 = (long[]) c3602mu2.f32775v;
        long[] jArr6 = (long[]) c3602mu2.f32776w;
        AbstractC3217fl.U(jArr4, jArr5, jArr6);
        AbstractC3217fl.U((long[]) c3602mu.f32776w, jArr6, jArr3);
    }

    public C4249yu A() {
        C3226fu d2 = ((InterfaceC3592mk) this.f32775v).d();
        C4087vu c4087vu = (C4087vu) ((C4017ue) this.f32774u).f34631v;
        C2738Qe a9 = new C2721Pe(c4087vu.f34890n).a();
        return new C4249yu(d2.f30901d, d2.f30904g, a9.f27188j, c4087vu.f34896z, d2.f30907k);
    }

    public void B() {
        try {
            ((BinderC2630Jp) ((InterfaceC3901sN) this.f32774u).d()).p0(((C5107a) this.f32775v).f41217n);
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Bf)).booleanValue()) {
                C2593Hm a9 = ((C3165eo) this.f32776w).a();
                a9.r(NativeAdvancedJsUtils.f18064p, "ptard");
                a9.r("ptard", "l");
                a9.s();
            }
        } catch (RemoteException | NullPointerException e6) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Cf)).booleanValue()) {
                p2.j.f39798C.f39808h.d("Preconnect Local", e6);
            }
        }
    }

    public void C(C3931t c3931t) {
        VO vo = (VO) ((HashMap) this.f32774u).remove(c3931t);
        vo.getClass();
        ON on = (ON) ((PN) this.f32776w).f26919n.get(vo);
        if (on != null) {
            synchronized (on) {
                on.f26690d--;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3985u
    public synchronized C3931t a() {
        C3931t a9;
        PN pn = (PN) this.f32776w;
        C4201y c4201y = pn.f26909c;
        HashMap hashMap = (HashMap) this.f32774u;
        a9 = c4201y.a();
        VO vo = (VO) this.f32775v;
        hashMap.put(a9, vo);
        ON on = (ON) pn.f26919n.get(vo);
        if (on != null) {
            synchronized (on) {
                on.f26690d++;
            }
        }
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3701ol, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public /* synthetic */ void mo2b(Object obj) {
        switch (this.f32773n) {
            case 8:
                ((InterfaceC3915sk) obj).i((BinderC2772Se) this.f32774u, (String) this.f32775v, (String) this.f32776w);
                break;
            default:
                ((EQ) obj).l(0, ((NP) this.f32774u).f26543a, (C3958tQ) this.f32775v, (C4228yQ) this.f32776w);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4260z4
    public void c(It it, Q0 q02, D4 d42) {
        this.f32775v = it;
        d42.a();
        d42.b();
        InterfaceC3448k1 x3 = q02.x(d42.f24337d, 5);
        this.f32776w = x3;
        x3.e((TP) this.f32774u);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    public Ut d() {
        return (Ut) this.f32775v;
    }

    public void f(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f32774u = Integer.valueOf(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3392j
    public C3675oC g(int i, B8 b82, int[] iArr) {
        SB sb = UB.f27942u;
        AbstractC2720Pd.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i4 = 0;
        int i9 = 0;
        while (i4 < b82.f23997a) {
            int i10 = i;
            B8 b83 = b82;
            C3340i c3340i = new C3340i(i10, b83, i4, (C3286h) this.f32774u, iArr[i4], (String) this.f32775v, (String) this.f32776w);
            int length = objArr.length;
            int i11 = i9 + 1;
            int d2 = PB.d(length, i11);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i9] = c3340i;
            i4++;
            i9 = i11;
            i = i10;
            b82 = b83;
        }
        return UB.p(objArr, i9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    public void h(boolean z8, Context context, C4293zk c4293zk) {
        try {
            L2.i iVar = p2.j.f39798C.f39802b;
            L2.i.y(context, (AdOverlayInfoParcel) ((C3320hg) this.f32774u).f31242n.get(), true, (C3165eo) ((C2563Fq) this.f32776w).f25032f);
        } catch (Exception unused) {
        }
    }

    public void i(Q0 q02, D4 d42) {
        int i = 0;
        while (true) {
            InterfaceC3448k1[] interfaceC3448k1Arr = (InterfaceC3448k1[]) this.f32775v;
            if (i >= interfaceC3448k1Arr.length) {
                return;
            }
            d42.a();
            d42.b();
            InterfaceC3448k1 x3 = q02.x(d42.f24337d, 3);
            TP tp = (TP) ((List) this.f32774u).get(i);
            String str = tp.f27776o;
            boolean z8 = true;
            if (!com.anythink.basead.exoplayer.k.o.f8598W.equals(str) && !com.anythink.basead.exoplayer.k.o.f8599X.equals(str)) {
                z8 = false;
            }
            PA.M(z8, "Invalid closed caption MIME type provided: %s", str);
            C4065vP c4065vP = new C4065vP();
            d42.b();
            c4065vP.f34773a = d42.f24338e;
            c4065vP.d("video/mp2t");
            c4065vP.e(str);
            c4065vP.f34777e = tp.f27767e;
            c4065vP.f34776d = tp.f27766d;
            c4065vP.f34770L = tp.f27759M;
            c4065vP.f34788q = tp.f27779r;
            x3.e(new TP(c4065vP));
            interfaceC3448k1Arr[i] = x3;
            i++;
        }
    }

    @Override // O2.InterfaceC0365b
    public void j() {
        com.bumptech.glide.manager.o oVar = (com.bumptech.glide.manager.o) this.f32776w;
        synchronized (oVar.f23625w) {
            try {
                if (oVar.f23623u) {
                    return;
                }
                oVar.f23623u = true;
                T8 t82 = (T8) oVar.f23624v;
                if (t82 == null) {
                    return;
                }
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                U8 u82 = (U8) this.f32774u;
                W8 w82 = (W8) this.f32775v;
                w82.f31242n.c(new MD(w82, c3157eg.a(new RunnableC3956tO(this, t82, u82, w82, 2)), 6, false), AbstractC3212fg.f30745h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2639Kh
    public void k(String str, int i, String str2, boolean z8) {
        C3327hn c3327hn = (C3327hn) this.f32774u;
        c3327hn.getClass();
        boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31505N4)).booleanValue();
        W8 w82 = (W8) this.f32776w;
        C3226fu c3226fu = c3327hn.f31256a;
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f32775v;
        if (!booleanValue) {
            q2.a1 a1Var = c3226fu.f30898a;
            if (a1Var != null && interfaceC3858rh.g() != null) {
                interfaceC3858rh.g().H3(a1Var);
            }
            w82.d();
            return;
        }
        if (z8) {
            q2.a1 a1Var2 = c3226fu.f30898a;
            if (a1Var2 != null && interfaceC3858rh.g() != null) {
                interfaceC3858rh.g().H3(a1Var2);
            }
            w82.d();
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Native Video WebView failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        w82.b(new C3059cr(1, AbstractC5051n.g(sb, ", Failing URL: ", str2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(Wt wt, Ut ut, int i, C3652nq c3652nq, long j9) {
        String str;
        C2593Hm a9 = ((C3165eo) this.f32776w).a();
        a9.r("gqi", wt.f28491b);
        a9.i(ut);
        a9.r(NativeAdvancedJsUtils.f18064p, "adapter_status");
        a9.r("adapter_l", String.valueOf(j9));
        a9.r(com.anythink.expressad.f.a.b.bI, Integer.toString(i));
        C2747Qn c2747Qn = null;
        if (c3652nq != null) {
            a9.r("arec", Integer.toString(c3652nq.f33032u.f40122n));
            String message = c3652nq.getMessage();
            Pattern pattern = ((C3494ku) this.f32774u).f32485a;
            if (pattern != null && message != null) {
                Matcher matcher = pattern.matcher(message);
                if (matcher.find()) {
                    str = matcher.group();
                    if (str != null) {
                        a9.r("areec", str);
                    }
                }
            }
            str = null;
            if (str != null) {
            }
        }
        Iterator it = ut.f28175t.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2747Qn b9 = ((C2764Rn) this.f32775v).b((String) it.next());
            if (b9 != null) {
                c2747Qn = b9;
                break;
            }
        }
        if (c2747Qn != null) {
            a9.r("ancn", c2747Qn.f27213a);
            C2754Rd c2754Rd = c2747Qn.f27214b;
            if (c2754Rd != null) {
                a9.r("adapter_v", c2754Rd.toString());
            }
            C2754Rd c2754Rd2 = c2747Qn.f27215c;
            if (c2754Rd2 != null) {
                a9.r("adapter_sv", c2754Rd2.toString());
            }
        }
        a9.s();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4260z4
    public void m(Lr lr) {
        long a9;
        long j9;
        ((It) this.f32775v).getClass();
        String str = AbstractC3548lu.f32613a;
        It it = (It) this.f32775v;
        synchronized (it) {
            try {
                long j10 = it.f25649c;
                a9 = j10 != com.anythink.basead.exoplayer.b.f6539b ? j10 + it.f25648b : it.a();
            } finally {
            }
        }
        It it2 = (It) this.f32775v;
        synchronized (it2) {
            j9 = it2.f25648b;
        }
        if (a9 == com.anythink.basead.exoplayer.b.f6539b || j9 == com.anythink.basead.exoplayer.b.f6539b) {
            return;
        }
        TP tp = (TP) this.f32774u;
        if (j9 != tp.f27781t) {
            C4065vP c4065vP = new C4065vP(tp);
            c4065vP.f34790s = j9;
            TP tp2 = new TP(c4065vP);
            this.f32774u = tp2;
            ((InterfaceC3448k1) this.f32776w).e(tp2);
        }
        int B8 = lr.B();
        ((InterfaceC3448k1) this.f32776w).a(B8, lr);
        ((InterfaceC3448k1) this.f32776w).b(a9, 1, B8, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3985u
    public synchronized void o() {
        ((PN) this.f32776w).f26909c.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3985u
    public synchronized void p(C3931t c3931t) {
        ((PN) this.f32776w).f26909c.p(c3931t);
        C(c3931t);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3985u
    public synchronized void q(E2 e22) {
        ((PN) this.f32776w).f26909c.q(e22);
        while (e22 != null) {
            C3931t c3931t = (C3931t) e22.f24634v;
            c3931t.getClass();
            C(c3931t);
            e22 = (E2) e22.f24635w;
            if (e22 == null || ((C3931t) e22.f24634v) == null) {
                e22 = null;
            }
        }
    }

    public void r(int i) {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(D.y.j(i, "Invalid tag size for AesCmacParameters: ", new StringBuilder(String.valueOf(i).length() + 40)));
        }
        this.f32775v = Integer.valueOf(i);
    }

    public void s(long j9, Lr lr) {
        if (lr.B() < 9) {
            return;
        }
        int b9 = lr.b();
        int b10 = lr.b();
        int K8 = lr.K();
        if (b9 == 434 && b10 == 1195456820 && K8 == 3) {
            ((C2728Pl) this.f32776w).k(j9, lr);
        }
    }

    public byte[] t() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        long[] jArr13 = new long[10];
        long[] jArr14 = (long[]) this.f32776w;
        AbstractC3217fl.Y(jArr4, jArr14);
        AbstractC3217fl.Y(jArr13, jArr4);
        AbstractC3217fl.Y(jArr12, jArr13);
        AbstractC3217fl.U(jArr5, jArr12, jArr14);
        AbstractC3217fl.U(jArr6, jArr5, jArr4);
        AbstractC3217fl.Y(jArr12, jArr6);
        AbstractC3217fl.U(jArr7, jArr12, jArr5);
        AbstractC3217fl.Y(jArr12, jArr7);
        AbstractC3217fl.Y(jArr13, jArr12);
        AbstractC3217fl.Y(jArr12, jArr13);
        AbstractC3217fl.Y(jArr13, jArr12);
        AbstractC3217fl.Y(jArr12, jArr13);
        AbstractC3217fl.U(jArr8, jArr12, jArr7);
        AbstractC3217fl.Y(jArr12, jArr8);
        AbstractC3217fl.Y(jArr13, jArr12);
        for (int i = 2; i < 10; i += 2) {
            AbstractC3217fl.Y(jArr12, jArr13);
            AbstractC3217fl.Y(jArr13, jArr12);
        }
        AbstractC3217fl.U(jArr9, jArr13, jArr8);
        AbstractC3217fl.Y(jArr12, jArr9);
        AbstractC3217fl.Y(jArr13, jArr12);
        for (int i4 = 2; i4 < 20; i4 += 2) {
            AbstractC3217fl.Y(jArr12, jArr13);
            AbstractC3217fl.Y(jArr13, jArr12);
        }
        AbstractC3217fl.U(jArr12, jArr13, jArr9);
        AbstractC3217fl.Y(jArr13, jArr12);
        AbstractC3217fl.Y(jArr12, jArr13);
        for (int i9 = 2; i9 < 10; i9 += 2) {
            AbstractC3217fl.Y(jArr13, jArr12);
            AbstractC3217fl.Y(jArr12, jArr13);
        }
        AbstractC3217fl.U(jArr10, jArr12, jArr8);
        AbstractC3217fl.Y(jArr12, jArr10);
        AbstractC3217fl.Y(jArr13, jArr12);
        for (int i10 = 2; i10 < 50; i10 += 2) {
            AbstractC3217fl.Y(jArr12, jArr13);
            AbstractC3217fl.Y(jArr13, jArr12);
        }
        AbstractC3217fl.U(jArr11, jArr13, jArr10);
        AbstractC3217fl.Y(jArr13, jArr11);
        AbstractC3217fl.Y(jArr12, jArr13);
        for (int i11 = 2; i11 < 100; i11 += 2) {
            AbstractC3217fl.Y(jArr13, jArr12);
            AbstractC3217fl.Y(jArr12, jArr13);
        }
        AbstractC3217fl.U(jArr13, jArr12, jArr11);
        AbstractC3217fl.Y(jArr12, jArr13);
        AbstractC3217fl.Y(jArr13, jArr12);
        for (int i12 = 2; i12 < 50; i12 += 2) {
            AbstractC3217fl.Y(jArr12, jArr13);
            AbstractC3217fl.Y(jArr13, jArr12);
        }
        AbstractC3217fl.U(jArr12, jArr13, jArr10);
        AbstractC3217fl.Y(jArr13, jArr12);
        AbstractC3217fl.Y(jArr12, jArr13);
        AbstractC3217fl.Y(jArr13, jArr12);
        AbstractC3217fl.Y(jArr12, jArr13);
        AbstractC3217fl.Y(jArr13, jArr12);
        AbstractC3217fl.U(jArr, jArr13, jArr6);
        AbstractC3217fl.U(jArr2, (long[]) this.f32774u, jArr);
        AbstractC3217fl.U(jArr3, (long[]) this.f32775v, jArr);
        byte[] c02 = AbstractC3217fl.c0(jArr3);
        c02[31] = (byte) (((AbstractC3217fl.c0(jArr2)[0] & 1) << 7) ^ c02[31]);
        return c02;
    }

    public String toString() {
        switch (this.f32773n) {
            case 18:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f32774u);
                sb.append('{');
                C2593Hm c2593Hm = (C2593Hm) ((C2593Hm) this.f32775v).f25416u;
                String str = "";
                while (c2593Hm != null) {
                    Object obj = c2593Hm.f25417v;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    c2593Hm = (C2593Hm) c2593Hm.f25416u;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Wt u() {
        return (Wt) ((C2953au) this.f32774u).f29349b.f24454v;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(InterfaceC3423jd interfaceC3423jd) {
        InterfaceC3423jd adapterCreator;
        boolean booleanValue = ((Boolean) AbstractC2649La.f26163a.r()).booleanValue();
        AtomicReference atomicReference = (AtomicReference) this.f32776w;
        if (!booleanValue) {
            while (!atomicReference.compareAndSet(null, interfaceC3423jd) && atomicReference.get() == null) {
            }
            return;
        }
        InterfaceC4884d0 interfaceC4884d0 = (InterfaceC4884d0) this.f32775v;
        if (interfaceC4884d0 != null) {
            try {
                adapterCreator = interfaceC4884d0.getAdapterCreator();
            } catch (RemoteException unused) {
            }
            if (adapterCreator == null) {
                adapterCreator = interfaceC3423jd;
            }
            while (!atomicReference.compareAndSet(null, adapterCreator) && atomicReference.get() == null) {
            }
            return;
        }
        adapterCreator = null;
        if (adapterCreator == null) {
        }
        while (!atomicReference.compareAndSet(null, adapterCreator)) {
        }
    }

    public NE w() {
        Mu mu;
        C3791qK b9;
        QE qe = (QE) this.f32774u;
        if (qe == null || (mu = (Mu) this.f32775v) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (qe.f27130a != ((C3791qK) mu.f26395u).f33687a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (qe.a() && ((Integer) this.f32776w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((QE) this.f32774u).a() && ((Integer) this.f32776w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3731pE c3731pE = ((QE) this.f32774u).f27131b;
        if (c3731pE == C3731pE.f33353A) {
            b9 = AbstractC3571mG.f32676a;
        } else if (c3731pE == C3731pE.f33367z) {
            b9 = AbstractC3571mG.a(((Integer) this.f32776w).intValue());
        } else {
            if (c3731pE != C3731pE.f33366y) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(((QE) this.f32774u).f27131b)));
            }
            b9 = AbstractC3571mG.b(((Integer) this.f32776w).intValue());
        }
        return new NE((QE) this.f32774u, (Mu) this.f32775v, b9, (Integer) this.f32776w);
    }

    public LG x() {
        Integer num = (Integer) this.f32774u;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f32775v) != null) {
            return new LG(num.intValue(), ((Integer) this.f32775v).intValue(), (C3731pE) this.f32776w);
        }
        throw new GeneralSecurityException("tag size not set");
    }

    public C3412jJ y() {
        C3791qK a9;
        C3306hJ c3306hJ = (C3306hJ) this.f32774u;
        if (c3306hJ == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = (ECPoint) this.f32775v;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        PF.a(eCPoint, c3306hJ.f31223b.f30980b.getCurve());
        if (((C3306hJ) this.f32774u).a() && ((Integer) this.f32776w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C3306hJ) this.f32774u).a() && ((Integer) this.f32776w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        LE le = ((C3306hJ) this.f32774u).f31225d;
        if (le == LE.f26123G) {
            a9 = AbstractC3571mG.f32676a;
        } else if (le == LE.f26122F || le == LE.f26121E) {
            a9 = AbstractC3571mG.a(((Integer) this.f32776w).intValue());
        } else {
            if (le != LE.f26120D) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(((C3306hJ) this.f32774u).f31225d.f26130u));
            }
            a9 = AbstractC3571mG.b(((Integer) this.f32776w).intValue());
        }
        return new C3412jJ((C3306hJ) this.f32774u, (ECPoint) this.f32775v, a9, (Integer) this.f32776w);
    }

    public GJ z() {
        C3791qK a9;
        if (((EJ) this.f32774u) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f32775v;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int bitLength = bigInteger.bitLength();
        EJ ej = (EJ) this.f32774u;
        int i = ej.f24694a;
        if (bitLength != i) {
            throw new GeneralSecurityException(D.y.n(new StringBuilder(String.valueOf(bitLength).length() + 56 + String.valueOf(i).length()), "Got modulus size ", bitLength, ", but parameters requires modulus size ", i));
        }
        if (ej.a() && ((Integer) this.f32776w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((EJ) this.f32774u).a() && ((Integer) this.f32776w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        DJ dj = ((EJ) this.f32774u).f24696c;
        if (dj == DJ.f24415e) {
            a9 = AbstractC3571mG.f32676a;
        } else if (dj == DJ.f24414d || dj == DJ.f24413c) {
            a9 = AbstractC3571mG.a(((Integer) this.f32776w).intValue());
        } else {
            if (dj != DJ.f24412b) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(((EJ) this.f32774u).f24696c)));
            }
            a9 = AbstractC3571mG.b(((Integer) this.f32776w).intValue());
        }
        return new GJ((EJ) this.f32774u, (BigInteger) this.f32775v, a9, (Integer) this.f32776w);
    }

    public /* synthetic */ C3602mu(int i, boolean z8) {
        this.f32773n = i;
        this.f32774u = null;
        this.f32775v = null;
        this.f32776w = null;
    }

    public C3602mu(Context context, C3157eg c3157eg, C3157eg c3157eg2, InterfaceC3901sN interfaceC3901sN, C5107a c5107a, C3761pr c3761pr, C3165eo c3165eo) {
        this.f32773n = 11;
        this.f32774u = interfaceC3901sN;
        this.f32775v = c5107a;
        this.f32776w = c3165eo;
    }

    public C3602mu(Context context, C5107a c5107a, C2914a9 c2914a9, C2593Hm c2593Hm) {
        this.f32773n = 12;
        this.f32774u = context;
        this.f32776w = c5107a;
        this.f32775v = c2914a9;
    }

    public C3602mu(C4017ue c4017ue, InterfaceC3592mk interfaceC3592mk, SD sd) {
        this.f32773n = 16;
        this.f32774u = c4017ue;
        this.f32775v = interfaceC3592mk;
    }

    public C3602mu(C2953au c2953au, Ut ut, String str) {
        this.f32773n = 7;
        this.f32774u = c2953au;
        this.f32775v = ut;
        this.f32776w = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public /* synthetic */ C3602mu(Object obj, Object obj2, Object obj3, int i) {
        this.f32773n = i;
        this.f32774u = obj;
        this.f32775v = obj2;
        this.f32776w = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3602mu(int i) {
        this(new long[10], new long[10], new long[10], 20);
        this.f32773n = i;
        switch (i) {
            case 21:
                this.f32774u = null;
                this.f32775v = null;
                this.f32776w = C3731pE.f33362K;
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3373ig, com.google.android.gms.internal.ads.InterfaceC3152eb, com.google.android.gms.internal.ads.Kr
    /* renamed from: a */
    public void mo0a() {
        Zu zu;
        t2.C.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        c7.m mVar = (c7.m) this.f32776w;
        synchronized (mVar.f5721d) {
            try {
                t2.C.k("loadNewJavascriptEngine (failure): Lock acquired");
                mVar.f5720c = 1;
                t2.C.k("Failed loading new engine. Marking new engine destroyable.");
                ((C2770Sc) this.f32774u).u();
                if (((Boolean) AbstractC2547Fa.f24967d.r()).booleanValue() && (zu = (Zu) mVar.f5724g) != null) {
                    Vu vu = (Vu) this.f32775v;
                    vu.h("Failed loading new engine");
                    vu.b(false);
                    zu.b(vu.m());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        t2.C.k("loadNewJavascriptEngine (failure): Lock released");
    }

    public C3602mu(Context context, InterfaceC4884d0 interfaceC4884d0) {
        this.f32773n = 0;
        this.f32776w = new AtomicReference();
        this.f32774u = context;
        this.f32775v = interfaceC4884d0;
    }

    public C3602mu(c7.m mVar, C2770Sc c2770Sc, Vu vu) {
        this.f32773n = 6;
        this.f32774u = c2770Sc;
        this.f32775v = vu;
        Objects.requireNonNull(mVar);
        this.f32776w = mVar;
    }

    public C3602mu(com.bumptech.glide.manager.o oVar, U8 u82, W8 w82) {
        this.f32773n = 4;
        this.f32774u = u82;
        this.f32775v = w82;
        this.f32776w = oVar;
    }

    public C3602mu(C4133wm c4133wm, C3165eo c3165eo) {
        this.f32773n = 15;
        this.f32774u = c4133wm;
        Fr fr = new Fr(c3165eo);
        this.f32775v = fr;
        this.f32776w = new Jr(fr, c4133wm.f35065e);
    }

    public C3602mu(C2563Fq c2563Fq, C3320hg c3320hg, Ut ut) {
        this.f32773n = 13;
        this.f32774u = c3320hg;
        this.f32775v = ut;
        Objects.requireNonNull(c2563Fq);
        this.f32776w = c2563Fq;
    }

    public C3602mu(PN pn, VO vo) {
        this.f32773n = 24;
        Objects.requireNonNull(pn);
        this.f32776w = pn;
        this.f32774u = new HashMap();
        this.f32775v = vo;
    }

    public /* synthetic */ C3602mu(C4119wP c4119wP) {
        this.f32773n = 25;
        Objects.requireNonNull(c4119wP);
        this.f32776w = c4119wP;
        Handler p6 = AbstractC3548lu.p();
        this.f32774u = p6;
        C4011uP c4011uP = new C4011uP(this);
        this.f32775v = c4011uP;
        c4119wP.f34984a.registerStreamEventCallback(new K(p6, 2), c4011uP);
    }

    public C3602mu(String str, int i) {
        this.f32773n = i;
        switch (i) {
            case 18:
                C2593Hm c2593Hm = new C2593Hm(26, false);
                this.f32775v = c2593Hm;
                this.f32776w = c2593Hm;
                this.f32774u = str;
                break;
            default:
                C4065vP c4065vP = new C4065vP();
                c4065vP.d("video/mp2t");
                c4065vP.e(str);
                this.f32774u = new TP(c4065vP);
                break;
        }
    }

    public C3602mu(List list) {
        this.f32773n = 3;
        this.f32774u = list;
        this.f32775v = new InterfaceC3448k1[list.size()];
        C2728Pl c2728Pl = new C2728Pl(new C3562m7(4, this));
        this.f32776w = c2728Pl;
        c2728Pl.j(3);
    }

    public C3602mu(InterfaceC3050ci[] interfaceC3050ciArr) {
        this.f32773n = 26;
        HP hp = new HP();
        hp.f25367m = 0;
        hp.f25369o = 0;
        hp.f25370p = 0;
        byte[] bArr = AbstractC3548lu.f32614b;
        hp.f25368n = bArr;
        hp.f25371q = bArr;
        C3160ej c3160ej = new C3160ej();
        c3160ej.f30464c = 1.0f;
        c3160ej.f30465d = 1.0f;
        C3751ph c3751ph = C3751ph.f33430e;
        c3160ej.f30466e = c3751ph;
        c3160ej.f30467f = c3751ph;
        c3160ej.f30468g = c3751ph;
        c3160ej.f30469h = c3751ph;
        ByteBuffer byteBuffer = InterfaceC3050ci.f29732a;
        c3160ej.f30471k = byteBuffer;
        c3160ej.f30472l = byteBuffer;
        c3160ej.f30463b = -1;
        InterfaceC3050ci[] interfaceC3050ciArr2 = {hp, c3160ej};
        this.f32774u = interfaceC3050ciArr2;
        System.arraycopy(interfaceC3050ciArr, 0, interfaceC3050ciArr2, 0, 0);
        this.f32775v = hp;
        this.f32776w = c3160ej;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3602mu(MF mf) {
        this(20);
        this.f32773n = 20;
        n(this, mf);
    }

    public C3602mu(C3602mu c3602mu) {
        this.f32773n = 20;
        this.f32774u = Arrays.copyOf((long[]) c3602mu.f32774u, 10);
        this.f32775v = Arrays.copyOf((long[]) c3602mu.f32775v, 10);
        this.f32776w = Arrays.copyOf((long[]) c3602mu.f32776w, 10);
    }

    @Override // O2.InterfaceC0365b
    public void onConnectionSuspended(int i) {
    }
}
