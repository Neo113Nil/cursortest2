package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.IntConsumer;
import k2.C4630a;
import k2.EnumC4631b;
import q2.C4885e;
import q2.C4903n;
import q2.C4907p;
import t0.AbstractC5051n;
import u2.C5107a;
import w2.InterfaceC5160h;

/* renamed from: com.google.android.gms.internal.ads.ue, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4017ue implements InterfaceC3612n3, InterfaceC3426jg, InterfaceC5160h, w2.k, w2.m, InterfaceC2639Kh, Gu, InterfaceC2779Sl, Bt, InterfaceC3273gn {

    /* renamed from: x, reason: collision with root package name */
    public static InterfaceC2722Pf f34626x;

    /* renamed from: y, reason: collision with root package name */
    public static final B f34627y;

    /* renamed from: z, reason: collision with root package name */
    public static final B f34628z;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34629n;

    /* renamed from: u, reason: collision with root package name */
    public Object f34630u;

    /* renamed from: v, reason: collision with root package name */
    public Object f34631v;

    /* renamed from: w, reason: collision with root package name */
    public Object f34632w;

    static {
        long j9 = com.anythink.basead.exoplayer.b.f6539b;
        f34627y = new B(2, j9);
        f34628z = new B(3, j9);
    }

    public /* synthetic */ C4017ue(int i, Object obj) {
        this.f34629n = i;
        this.f34630u = obj;
    }

    public static String A(Context context) {
        File file = new File(context.getPackageResourcePath());
        if (!file.exists() || !file.canRead()) {
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[16384];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                for (int read = fileInputStream.read(bArr); read != -1; read = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, read);
                }
                HC f6 = HC.f25322f.f();
                byte[] digest = messageDigest.digest();
                String g9 = f6.g(digest.length, digest);
                fileInputStream.close();
                return g9;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public ArrayList B() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f34631v).iterator();
        while (it.hasNext()) {
            String str = (String) q2.r.f40116e.f40119c.a((C3151ea) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        AbstractC3035cL.z(arrayList2, new C3398j5("gad:dynamite_module:experiment_id", "", 4));
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30641A);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30642B);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30643C);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30644D);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30645E);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30660U);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30646F);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30652M);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30653N);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30654O);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30655P);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30656Q);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30657R);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30658S);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30659T);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30647G);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30648H);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30649I);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.J);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30650K);
        AbstractC3035cL.z(arrayList2, AbstractC3194fG.f30651L);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public ArrayList C() {
        ArrayList B8 = B();
        Iterator it = ((ArrayList) this.f34632w).iterator();
        while (it.hasNext()) {
            String str = (String) q2.r.f40116e.f40119c.a((C3151ea) it.next());
            if (!TextUtils.isEmpty(str)) {
                B8.add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        AbstractC3035cL.z(arrayList, AbstractC2720Pd.f26987x);
        B8.addAll(arrayList);
        return B8;
    }

    public void D() {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31713k7)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            C4087vu c4087vu = (C4087vu) this.f34631v;
            sb.append(c4087vu.f34892v);
            sb.append(" PoolCollection");
            StringBuilder sb2 = new StringBuilder("\n\tPool does not exist: ");
            J4 j42 = (J4) this.f34632w;
            sb2.append(j42.f25730c);
            sb2.append("\n\tNew pools created: ");
            sb2.append(j42.f25728a);
            sb2.append("\n\tPools removed: ");
            sb2.append(j42.f25729b);
            sb2.append("\n\tEntries added: ");
            sb2.append(j42.f25732e);
            sb2.append("\n\tNo entries retrieved: ");
            sb2.append(j42.f25731d);
            sb2.append("\n");
            sb.append(sb2.toString());
            int i = 0;
            for (Map.Entry entry : ((ConcurrentHashMap) this.f34630u).entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((InterfaceC4195xu) entry.getKey()).hashCode());
                sb.append("    ");
                int i4 = 0;
                while (true) {
                    C3871ru c3871ru = (C3871ru) entry.getValue();
                    c3871ru.a();
                    if (i4 >= c3871ru.f34137a.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i4++;
                }
                C3871ru c3871ru2 = (C3871ru) entry.getValue();
                c3871ru2.a();
                for (int size = c3871ru2.f34137a.size(); size < c4087vu.f34894x; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                C3871ru c3871ru3 = (C3871ru) entry.getValue();
                StringBuilder sb3 = new StringBuilder("Created: ");
                Eu eu = c3871ru3.f34140d;
                sb3.append(eu.f24842a);
                sb3.append(" Last accessed: ");
                sb3.append(eu.f24844c);
                sb3.append(" Accesses: ");
                sb3.append(eu.f24845d);
                sb3.append("\nEntries retrieved: Valid: ");
                sb3.append(eu.f24846e);
                sb3.append(" Stale: ");
                sb3.append(eu.f24847f);
                sb.append(sb3.toString());
                sb.append("\n");
            }
            while (i < c4087vu.f34893w) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            String sb4 = sb.toString();
            int i9 = t2.C.f40822b;
            u2.i.a(sb4);
        }
    }

    public JD E(C2687Ne c2687Ne, InterfaceC2528Dp interfaceC2528Dp, InterfaceC2528Dp interfaceC2528Dp2, CD cd) {
        String str = c2687Ne.f26582w;
        t2.G g9 = p2.j.f39798C.f39803c;
        boolean e6 = t2.G.e(str);
        C3157eg c3157eg = (C3157eg) this.f34630u;
        return C3686oN.v(C3686oN.y(C3686oN.y(JD.s(e6 ? C3686oN.l(new C2494Bp(1)) : C3686oN.v(interfaceC2528Dp.c(c2687Ne), ExecutionException.class, C2538Ei.f24795g, c3157eg)), C2538Ei.f24793e, c3157eg), cd, c3157eg), C2494Bp.class, new C2889Zc(this, interfaceC2528Dp2, c2687Ne, cd, 3), c3157eg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3612n3
    public int a() {
        return ((long[]) this.f34632w).length;
    }

    @Override // com.google.android.gms.internal.ads.Gu
    public Object b(Object obj) {
        switch (this.f34629n) {
            case 12:
                return n((C2647Kp) obj);
            default:
                C2834Vp c2834Vp = (C2834Vp) this.f34630u;
                c2834Vp.getClass();
                c2834Vp.f28310u.execute(new RunnableC3771q0((SQLiteDatabase) obj, (String) this.f34632w, (u2.l) this.f34631v, 7));
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3612n3
    public ArrayList c(long j9) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.f34630u;
            if (i >= list.size()) {
                break;
            }
            int i4 = i + i;
            long[] jArr = (long[]) this.f34631v;
            if (jArr[i4] <= j9 && j9 < jArr[i4 + 1]) {
                U3 u32 = (U3) list.get(i);
                C2522Dj c2522Dj = u32.f27919a;
                if (c2522Dj.f24535e == -3.4028235E38f) {
                    arrayList2.add(u32);
                } else {
                    arrayList.add(c2522Dj);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, C2959b.f29362G);
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            C2522Dj c2522Dj2 = ((U3) arrayList2.get(i9)).f27919a;
            arrayList.add(new C2522Dj(c2522Dj2.f24531a, c2522Dj2.f24532b, c2522Dj2.f24533c, c2522Dj2.f24534d, (-1) - i9, 1, c2522Dj2.f24537g, c2522Dj2.f24538h, c2522Dj2.i, c2522Dj2.f24541l, c2522Dj2.f24542m, c2522Dj2.f24539j, c2522Dj2.f24540k, c2522Dj2.f24543n, c2522Dj2.f24544o, c2522Dj2.f24545p));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    public Ut d() {
        return (Ut) this.f34631v;
    }

    public void e() {
        O2.w.d("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 44);
        sb.append("Adapter called onAdFailedToLoad with error 0.");
        u2.i.a(sb.toString());
        try {
            ((InterfaceC3693od) this.f34630u).l0(0);
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    public void f(C4630a c4630a) {
        O2.w.d("#008 Must be called on the main UI thread.");
        int i = c4630a.f38688a;
        int length = String.valueOf(i).length();
        String str = c4630a.f38689b;
        int length2 = String.valueOf(str).length();
        String str2 = c4630a.f38690c;
        StringBuilder sb = new StringBuilder(length + 71 + length2 + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        u2.i.a(sb.toString());
        try {
            ((InterfaceC3693od) this.f34630u).d3(c4630a.a());
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    public void g(C4630a c4630a) {
        O2.w.d("#008 Must be called on the main UI thread.");
        int i = c4630a.f38688a;
        int length = String.valueOf(i).length();
        String str = c4630a.f38689b;
        int length2 = String.valueOf(str).length();
        String str2 = c4630a.f38690c;
        StringBuilder sb = new StringBuilder(length + 71 + length2 + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        u2.i.a(sb.toString());
        try {
            ((InterfaceC3693od) this.f34630u).d3(c4630a.a());
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2779Sl
    public void h(boolean z8, Context context, C4293zk c4293zk) {
        C3334hu c3334hu;
        try {
            C3656nu c3656nu = (C3656nu) ((C3598mq) this.f34630u).f32761b;
            c3656nu.b(z8);
            int i = ((C5107a) ((C2529Dq) this.f34632w).f24574d).f41219v;
            int intValue = ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31744o1)).intValue();
            InterfaceC3531ld interfaceC3531ld = c3656nu.f33064a;
            if (i < intValue) {
                try {
                    interfaceC3531ld.g();
                    return;
                } finally {
                }
            } else {
                try {
                    interfaceC3531ld.T1(new V2.b(context));
                    return;
                } finally {
                }
            }
        } catch (C3334hu e6) {
            int i4 = t2.C.f40822b;
            u2.i.e("Cannot show interstitial.");
            throw new C2762Rl(e6.getCause());
        }
        int i42 = t2.C.f40822b;
        u2.i.e("Cannot show interstitial.");
        throw new C2762Rl(e6.getCause());
    }

    public void i(C4630a c4630a) {
        O2.w.d("#008 Must be called on the main UI thread.");
        int i = c4630a.f38688a;
        int length = String.valueOf(i).length();
        String str = c4630a.f38689b;
        int length2 = String.valueOf(str).length();
        String str2 = c4630a.f38690c;
        StringBuilder sb = new StringBuilder(length + 71 + length2 + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        u2.i.a(sb.toString());
        try {
            ((InterfaceC3693od) this.f34630u).d3(c4630a.a());
        } catch (RemoteException e6) {
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    public JD j(InterfaceC3592mk interfaceC3592mk) {
        J3.a c4;
        J3.a u7;
        C4017ue c4017ue = (C4017ue) this.f34630u;
        SD sd = (SD) this.f34631v;
        C3602mu c3602mu = new C3602mu(c4017ue, interfaceC3592mk, sd);
        C4194xt c4194xt = (C4194xt) c3602mu.f32776w;
        if (c4194xt == null) {
            if (((Boolean) AbstractC2768Sa.f27572a.r()).booleanValue()) {
                C2709Oj a9 = interfaceC3592mk.a();
                Lu lu = Lu.GET_CACHE_KEY;
                Ku r9 = a9.f26739c.a(a9.i.d(), lu).h(new C2936ad(3, a9, (C4087vu) c4017ue.f34631v)).r();
                r9.c(new MD(0, r9, new C3562m7(13, a9)), a9.f26745j);
                u7 = C3686oN.u(C3686oN.A(JD.s(r9), new C4140wt(c3602mu, 1), sd), C2494Bp.class, new C4140wt(c3602mu, 0), sd);
            } else {
                C4194xt c4194xt2 = new C4194xt(null, c3602mu.A());
                c3602mu.f32776w = c4194xt2;
                u7 = C3686oN.c(c4194xt2);
            }
            c4 = C3686oN.A(u7, J2.f25705q, sd);
        } else {
            c4 = C3686oN.c(c4194xt);
        }
        return C3686oN.u(C3686oN.y(JD.s(c4), new C2936ad(13, this, interfaceC3592mk), sd), Exception.class, new J2(16), sd);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2639Kh
    public void k(String str, int i, String str2, boolean z8) {
        W8 w82 = (W8) this.f34632w;
        C3327hn c3327hn = (C3327hn) this.f34630u;
        if (z8) {
            q2.a1 a1Var = c3327hn.f31256a.f30898a;
            if (a1Var != null) {
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) this.f34631v;
                if (interfaceC3858rh.g() != null) {
                    interfaceC3858rh.g().H3(a1Var);
                }
            }
            w82.d();
            return;
        }
        c3327hn.getClass();
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Html video Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        w82.b(new C3059cr(1, AbstractC5051n.g(sb, ", Failing URL: ", str2)));
    }

    public void l(Q0 q02, D4 d42) {
        int i = 0;
        while (true) {
            InterfaceC3448k1[] interfaceC3448k1Arr = (InterfaceC3448k1[]) this.f34631v;
            if (i >= interfaceC3448k1Arr.length) {
                return;
            }
            d42.a();
            d42.b();
            InterfaceC3448k1 x3 = q02.x(d42.f24337d, 3);
            TP tp = (TP) ((List) this.f34630u).get(i);
            String str = tp.f27776o;
            boolean z8 = true;
            if (!com.anythink.basead.exoplayer.k.o.f8598W.equals(str) && !com.anythink.basead.exoplayer.k.o.f8599X.equals(str)) {
                z8 = false;
            }
            PA.M(z8, "Invalid closed caption MIME type provided: %s", str);
            String str2 = tp.f27763a;
            if (str2 == null) {
                d42.b();
                str2 = d42.f24338e;
            }
            C4065vP c4065vP = new C4065vP();
            c4065vP.f34773a = str2;
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

    public void m(InterfaceC3572mH interfaceC3572mH, Uri uri, Map map, long j9, long j10, PQ pq) {
        boolean z8;
        boolean z9 = true;
        J0 j02 = new J0(interfaceC3572mH, j9, j10);
        this.f34632w = j02;
        if (((O0) this.f34631v) != null) {
            return;
        }
        O0[] d2 = ((R0) this.f34630u).d(uri, map);
        int length = d2.length;
        SB sb = UB.f27942u;
        AbstractC2720Pd.p(length, "expectedSize");
        RB rb = new RB(length);
        if (length == 1) {
            this.f34631v = d2[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                O0 o02 = d2[i];
                try {
                } catch (EOFException unused) {
                    z8 = ((O0) this.f34631v) != null || j02.f25675w == j9;
                } catch (Throwable th) {
                    if (((O0) this.f34631v) == null && j02.f25675w != j9) {
                        z9 = false;
                    }
                    PA.T(z9);
                    j02.f25677y = 0;
                    throw th;
                }
                if (o02.b(j02)) {
                    this.f34631v = o02;
                    j02.f25677y = 0;
                    break;
                } else {
                    rb.b(o02.d());
                    z8 = ((O0) this.f34631v) != null || j02.f25675w == j9;
                    PA.T(z8);
                    j02.f25677y = 0;
                    i++;
                }
            }
            if (((O0) this.f34631v) == null) {
                Iterator it = AbstractC2655Lg.s(UB.o(d2), Rz.f27458e).iterator();
                StringBuilder sb2 = new StringBuilder();
                AbstractC2655Lg.t(sb2, it, ", ");
                String sb3 = sb2.toString();
                throw new C3096dR(D.y.o(new StringBuilder(sb3.length() + 58), "None of the available extractors (", sb3, ") could read the stream."), rb.f());
            }
        }
        ((O0) this.f34631v).a(pq);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0296, code lost:
    
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r2.append("Received error HTTP response code: ");
        r2.append(r0);
        u2.i.f(r2.toString());
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r3.append("Received error HTTP response code: ");
        r3.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02d1, code lost:
    
        throw new com.google.android.gms.internal.ads.C3275gp(1, r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x020f, code lost:
    
        r13.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02f4, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2664Lp n(C2647Kp c2647Kp) {
        int i;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        BufferedOutputStream bufferedOutputStream;
        C4017ue c4017ue = this;
        String str = c2647Kp.f26037a;
        int i4 = c2647Kp.f26038b;
        HashMap hashMap = c2647Kp.f26039c;
        byte[] bArr = c2647Kp.f26040d;
        String str2 = c2647Kp.f26041e;
        p2.j.f39798C.f39810k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            C2664Lp c2664Lp = new C2664Lp();
            c2664Lp.f26222a = 0;
            c2664Lp.f26223b = new HashMap();
            c2664Lp.f26224c = "";
            c2664Lp.f26225d = -1L;
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31654e3)).booleanValue() && C4907p.f40108g.f40111c) {
                c2664Lp.f26222a = 410;
                return c2664Lp;
            }
            String str3 = (String) c4017ue.f34631v;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 13);
            sb.append("SDK version: ");
            sb.append(str3);
            String sb2 = sb.toString();
            int i9 = t2.C.f40822b;
            u2.i.e(sb2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 39);
            sb3.append("AdRequestServiceImpl: Sending request: ");
            sb3.append(str);
            u2.i.a(sb3.toString());
            URL url = new URL(str);
            HashMap hashMap2 = new HashMap();
            int i10 = 0;
            while (true) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                String str4 = (String) c4017ue.f34632w;
                if (str4 != null) {
                    httpURLConnection.setRequestMethod(str4);
                }
                try {
                    try {
                        p2.j.f39798C.f39803c.B((Context) c4017ue.f34630u, str3, httpURLConnection, i4);
                        for (Iterator it = hashMap.entrySet().iterator(); it.hasNext(); it = it) {
                            Map.Entry entry = (Map.Entry) it.next();
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        u2.f fVar = new u2.f();
                        try {
                            fVar.a(httpURLConnection, bArr);
                            i = i4;
                        } catch (Throwable th) {
                            u2.i.d("Network request logging failed.", th);
                            i = i4;
                            p2.j.f39798C.f39808h.e("HttpRequestFunction.logAdRequest", th);
                        }
                        int length = bArr.length;
                        int i11 = 1;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream.write(bArr);
                                    S2.b.c(bufferedOutputStream);
                                } catch (Throwable th2) {
                                    th = th2;
                                    S2.b.c(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedOutputStream = null;
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        Iterator<Map.Entry<String, List<String>>> it2 = httpURLConnection.getHeaderFields().entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<String, List<String>> next = it2.next();
                            int i12 = i11;
                            String key = next.getKey();
                            Iterator<Map.Entry<String, List<String>>> it3 = it2;
                            List<String> value = next.getValue();
                            if (hashMap2.containsKey(key)) {
                                ((List) hashMap2.get(key)).addAll(value);
                            } else {
                                hashMap2.put(key, new ArrayList(value));
                                hashMap = hashMap;
                            }
                            it2 = it3;
                            i11 = i12;
                        }
                        int i13 = i11;
                        HashMap hashMap3 = hashMap;
                        fVar.b(httpURLConnection, responseCode);
                        c2664Lp.f26222a = responseCode;
                        c2664Lp.f26223b = hashMap2;
                        c2664Lp.f26224c = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                            } catch (Throwable th4) {
                                th = th4;
                                inputStreamReader = null;
                            }
                            try {
                                t2.G g9 = p2.j.f39798C.f39803c;
                                StringBuilder sb4 = new StringBuilder(8192);
                                char[] cArr = new char[2048];
                                while (true) {
                                    int read = inputStreamReader2.read(cArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    sb4.append(cArr, 0, read);
                                }
                                String sb5 = sb4.toString();
                                S2.b.c(inputStreamReader2);
                                if (u2.f.c() && sb5 != null) {
                                    fVar.e("onNetworkResponseBody", new h8.d(10, sb5.getBytes()));
                                }
                                c2664Lp.f26224c = sb5;
                                if (TextUtils.isEmpty(sb5)) {
                                    if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31831x6)).booleanValue()) {
                                        throw new C3275gp(3);
                                    }
                                }
                                p2.j.f39798C.f39810k.getClass();
                                c2664Lp.f26225d = SystemClock.elapsedRealtime() - elapsedRealtime;
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = inputStreamReader2;
                                S2.b.c(inputStreamReader);
                                throw th;
                            }
                        } else {
                            if (responseCode < 300 || responseCode >= 400) {
                                break;
                            }
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (TextUtils.isEmpty(headerField)) {
                                u2.i.f("No location header to follow redirect.");
                                throw new C3275gp(1, "No location header to follow redirect");
                            }
                            C3151ea c3151ea = AbstractC3368ia.T8;
                            q2.r rVar = q2.r.f40116e;
                            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                                try {
                                    url = new URI(headerField).toURL();
                                } catch (URISyntaxException e6) {
                                    throw new C3275gp(e6.getMessage(), e6);
                                }
                            } else {
                                url = new URL(headerField);
                            }
                            i10++;
                            if (i10 > ((Integer) rVar.f40119c.a(AbstractC3368ia.f31675g6)).intValue()) {
                                u2.i.f("Too many redirects.");
                                throw new C3275gp(i13, "Too many redirects");
                            }
                            httpURLConnection.disconnect();
                            c4017ue = this;
                            i4 = i;
                            hashMap = hashMap3;
                        }
                    } catch (C3275gp e9) {
                        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.x9)).booleanValue()) {
                            throw e9;
                        }
                        p2.j.f39798C.f39810k.getClass();
                        c2664Lp.f26225d = SystemClock.elapsedRealtime() - elapsedRealtime;
                    }
                } catch (Throwable th6) {
                    httpURLConnection.disconnect();
                    throw th6;
                }
            }
        } catch (IOException e10) {
            String valueOf = String.valueOf(e10.getMessage());
            int i14 = t2.C.f40822b;
            String concat = "Error while connecting to ad server: ".concat(valueOf);
            u2.i.f(concat);
            throw new C3275gp(concat, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public /* bridge */ /* synthetic */ Object o() {
        return null;
    }

    public void p(E2.b bVar) {
        InterfaceC2722Pf interfaceC2722Pf;
        V2.b bVar2;
        InterfaceC2722Pf interfaceC2722Pf2;
        q2.d1 a9;
        long currentTimeMillis = System.currentTimeMillis();
        Context context = (Context) this.f34630u;
        synchronized (C4017ue.class) {
            try {
                if (f34626x == null) {
                    C4903n c4903n = C4907p.f40108g.f40110b;
                    BinderC3317hd binderC3317hd = new BinderC3317hd();
                    c4903n.getClass();
                    f34626x = (InterfaceC2722Pf) new C4885e(c4903n, context, binderC3317hd).d(context, false);
                }
                interfaceC2722Pf = f34626x;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC2722Pf == null) {
            bVar.onFailure("Internal Error, query info generator is null.");
            return;
        }
        V2.b bVar3 = new V2.b(context);
        q2.F0 f02 = (q2.F0) this.f34632w;
        if (f02 == null) {
            bVar2 = bVar3;
            interfaceC2722Pf2 = interfaceC2722Pf;
            a9 = new q2.d1(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, currentTimeMillis, 0L, -1);
        } else {
            bVar2 = bVar3;
            interfaceC2722Pf2 = interfaceC2722Pf;
            f02.f39943n = currentTimeMillis;
            a9 = q2.f1.a(context, f02);
        }
        try {
            interfaceC2722Pf2.G1(bVar2, new C2790Tf(null, ((EnumC4631b) this.f34631v).name(), null, a9), new BinderC3963te(this, bVar));
        } catch (RemoteException unused) {
            bVar.onFailure("Internal Error.");
        }
    }

    public synchronized void q(InterfaceC4195xu interfaceC4195xu, C4141wu c4141wu) {
        try {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f34630u;
            C3871ru c3871ru = (C3871ru) concurrentHashMap.get(interfaceC4195xu);
            p2.j.f39798C.f39810k.getClass();
            c4141wu.f35088d = System.currentTimeMillis();
            if (c3871ru == null) {
                C4087vu c4087vu = (C4087vu) this.f34631v;
                C3871ru c3871ru2 = new C3871ru(c4087vu.f34894x, c4087vu.f34895y * 1000);
                if (concurrentHashMap.size() == c4087vu.f34893w) {
                    int i = c4087vu.f34889C;
                    int i4 = i - 1;
                    InterfaceC4195xu interfaceC4195xu2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long j9 = Long.MAX_VALUE;
                    if (i4 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((C3871ru) entry.getValue()).f34140d.f24842a < j9) {
                                j9 = ((C3871ru) entry.getValue()).f34140d.f24842a;
                                interfaceC4195xu2 = (InterfaceC4195xu) entry.getKey();
                            }
                        }
                        if (interfaceC4195xu2 != null) {
                            concurrentHashMap.remove(interfaceC4195xu2);
                        }
                    } else if (i4 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((C3871ru) entry2.getValue()).f34140d.f24844c < j9) {
                                j9 = ((C3871ru) entry2.getValue()).f34140d.f24844c;
                                interfaceC4195xu2 = (InterfaceC4195xu) entry2.getKey();
                            }
                        }
                        if (interfaceC4195xu2 != null) {
                            concurrentHashMap.remove(interfaceC4195xu2);
                        }
                    } else if (i4 == 2) {
                        int i9 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((C3871ru) entry3.getValue()).f34140d.f24845d < i9) {
                                i9 = ((C3871ru) entry3.getValue()).f34140d.f24845d;
                                interfaceC4195xu2 = (InterfaceC4195xu) entry3.getKey();
                            }
                        }
                        if (interfaceC4195xu2 != null) {
                            concurrentHashMap.remove(interfaceC4195xu2);
                        }
                    }
                    J4 j42 = (J4) this.f34632w;
                    j42.f25729b++;
                    ((C3925su) j42.f25733f).f34326u = true;
                }
                concurrentHashMap.put(interfaceC4195xu, c3871ru2);
                J4 j43 = (J4) this.f34632w;
                j43.f25728a++;
                ((C3925su) j43.f25733f).f34325n = true;
                c3871ru = c3871ru2;
            }
            Eu eu = c3871ru.f34140d;
            eu.getClass();
            p2.j.f39798C.f39810k.getClass();
            eu.f24844c = System.currentTimeMillis();
            eu.f24845d++;
            c3871ru.a();
            LinkedList linkedList = c3871ru.f34137a;
            if (linkedList.size() != c3871ru.f34138b) {
                linkedList.add(c4141wu);
            }
            J4 j44 = (J4) this.f34632w;
            j44.f25732e++;
            C3925su c3925su = (C3925su) j44.f25733f;
            C3925su clone = c3925su.clone();
            c3925su.f34325n = false;
            c3925su.f34326u = false;
            Du du = c3871ru.f34140d.f24843b;
            Du clone2 = du.clone();
            du.f24601n = false;
            du.f24602u = 0;
            C4265z9 A8 = E9.A();
            C4157x9 B8 = C4211y9.B();
            B8.h();
            ((C4211y9) B8.f30000u).C();
            C9 B9 = D9.B();
            boolean z8 = clone.f34325n;
            B9.h();
            ((D9) B9.f30000u).C(z8);
            boolean z9 = clone.f34326u;
            B9.h();
            ((D9) B9.f30000u).D(z9);
            int i10 = clone2.f24602u;
            B9.h();
            ((D9) B9.f30000u).A(i10);
            B8.h();
            ((C4211y9) B8.f30000u).A((D9) B9.j());
            A8.h();
            ((E9) A8.f30000u).B((C4211y9) B8.j());
            c4141wu.f35085a.a().f26742f.M((E9) A8.j());
            D();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void r(q2.d1 d1Var, int i) {
        this.f34632w = null;
        Mr mr = new Mr(i);
        C3761pr c3761pr = new C3761pr(this);
        ((Q8) this.f34630u).e(d1Var, (String) this.f34631v, mr, c3761pr);
    }

    public long s() {
        J0 j02 = (J0) this.f34632w;
        if (j02 != null) {
            return j02.f25675w;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3612n3
    public long t(int i) {
        PA.n(i >= 0);
        long[] jArr = (long[]) this.f34632w;
        PA.n(i < jArr.length);
        return jArr[i];
    }

    public JE u() {
        Mu mu;
        C3791qK b9;
        ME me = (ME) this.f34630u;
        if (me == null || (mu = (Mu) this.f34631v) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (me.f26313a != ((C3791qK) mu.f26395u).f33687a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (me.a() && ((Integer) this.f34632w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((ME) this.f34630u).a() && ((Integer) this.f34632w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        LE le = ((ME) this.f34630u).f26315c;
        if (le == LE.f26126x) {
            b9 = AbstractC3571mG.f32676a;
        } else if (le == LE.f26125w) {
            b9 = AbstractC3571mG.a(((Integer) this.f34632w).intValue());
        } else {
            if (le != LE.f26124v) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(((ME) this.f34630u).f26315c)));
            }
            b9 = AbstractC3571mG.b(((Integer) this.f34632w).intValue());
        }
        return new JE((ME) this.f34630u, (Mu) this.f34631v, b9, (Integer) this.f34632w);
    }

    public RE v() {
        Mu mu;
        C3791qK b9;
        TE te = (TE) this.f34630u;
        if (te == null || (mu = (Mu) this.f34631v) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (te.f27728a != ((C3791qK) mu.f26395u).f33687a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (te.a() && ((Integer) this.f34632w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((TE) this.f34630u).a() && ((Integer) this.f34632w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        GE ge = ((TE) this.f34630u).f27729b;
        if (ge == GE.f25121j) {
            b9 = AbstractC3571mG.f32676a;
        } else if (ge == GE.i) {
            b9 = AbstractC3571mG.a(((Integer) this.f34632w).intValue());
        } else {
            if (ge != GE.f25120h) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(((TE) this.f34630u).f27729b)));
            }
            b9 = AbstractC3571mG.b(((Integer) this.f34632w).intValue());
        }
        return new RE((TE) this.f34630u, (Mu) this.f34631v, b9, (Integer) this.f34632w);
    }

    public JG w() {
        Mu mu;
        C3791qK a9;
        LG lg = (LG) this.f34630u;
        if (lg == null || (mu = (Mu) this.f34631v) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (lg.f26132a != ((C3791qK) mu.f26395u).f33687a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (lg.a() && ((Integer) this.f34632w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((LG) this.f34630u).a() && ((Integer) this.f34632w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C3731pE c3731pE = ((LG) this.f34630u).f26134c;
        if (c3731pE == C3731pE.f33362K) {
            a9 = AbstractC3571mG.f32676a;
        } else if (c3731pE == C3731pE.J || c3731pE == C3731pE.f33361I) {
            a9 = AbstractC3571mG.a(((Integer) this.f34632w).intValue());
        } else {
            if (c3731pE != C3731pE.f33360H) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(((LG) this.f34630u).f26134c)));
            }
            a9 = AbstractC3571mG.b(((Integer) this.f34632w).intValue());
        }
        return new JG((LG) this.f34630u, (Mu) this.f34631v, a9, (Integer) this.f34632w);
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public /* bridge */ /* synthetic */ J3.a x(C2593Hm c2593Hm, At at) {
        return j(null);
    }

    public NG y() {
        Mu mu;
        C3791qK a9;
        RG rg = (RG) this.f34630u;
        if (rg == null || (mu = (Mu) this.f34631v) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (rg.f27327a != ((C3791qK) mu.f26395u).f33687a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (rg.a() && ((Integer) this.f34632w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((RG) this.f34630u).a() && ((Integer) this.f34632w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        QG qg = ((RG) this.f34630u).f27329c;
        if (qg == QG.f27135e) {
            a9 = AbstractC3571mG.f32676a;
        } else if (qg == QG.f27134d || qg == QG.f27133c) {
            a9 = AbstractC3571mG.a(((Integer) this.f34632w).intValue());
        } else {
            if (qg != QG.f27132b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(((RG) this.f34630u).f27329c)));
            }
            a9 = AbstractC3571mG.b(((Integer) this.f34632w).intValue());
        }
        return new NG((RG) this.f34630u, (Mu) this.f34631v, a9, (Integer) this.f34632w);
    }

    public C4221yJ z() {
        C3791qK a9;
        if (((C4113wJ) this.f34630u) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f34631v;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int bitLength = bigInteger.bitLength();
        C4113wJ c4113wJ = (C4113wJ) this.f34630u;
        int i = c4113wJ.f34970a;
        if (bitLength != i) {
            throw new GeneralSecurityException(D.y.n(new StringBuilder(String.valueOf(bitLength).length() + 56 + String.valueOf(i).length()), "Got modulus size ", bitLength, ", but parameters requires modulus size ", i));
        }
        if (c4113wJ.a() && ((Integer) this.f34632w) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C4113wJ) this.f34630u).a() && ((Integer) this.f34632w) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C4059vJ c4059vJ = ((C4113wJ) this.f34630u).f34972c;
        if (c4059vJ == C4059vJ.f34751e) {
            a9 = AbstractC3571mG.f32676a;
        } else if (c4059vJ == C4059vJ.f34750d || c4059vJ == C4059vJ.f34749c) {
            a9 = AbstractC3571mG.a(((Integer) this.f34632w).intValue());
        } else {
            if (c4059vJ != C4059vJ.f34748b) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(((C4113wJ) this.f34630u).f34972c)));
            }
            a9 = AbstractC3571mG.b(((Integer) this.f34632w).intValue());
        }
        return new C4221yJ((C4113wJ) this.f34630u, (BigInteger) this.f34631v, a9, (Integer) this.f34632w);
    }

    public /* synthetic */ C4017ue(int i, boolean z8) {
        this.f34629n = i;
        this.f34630u = null;
        this.f34631v = null;
        this.f34632w = null;
    }

    public C4017ue(Q8 q82, String str) {
        this.f34629n = 15;
        this.f34630u = q82;
        this.f34631v = str;
    }

    public C4017ue(C3854rd c3854rd, C3801qd c3801qd, InterfaceC3962td interfaceC3962td) {
        this.f34629n = 9;
        this.f34631v = c3854rd;
        this.f34632w = c3801qd;
        this.f34630u = interfaceC3962td;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3426jg
    /* renamed from: b */
    public /* synthetic */ void mo5b(Object obj) {
        Zu zu;
        switch (this.f34629n) {
            case 6:
                t2.C.k("loadNewJavascriptEngine (success): Trying to acquire lock");
                c7.m mVar = (c7.m) this.f34632w;
                synchronized (mVar.f5721d) {
                    try {
                        t2.C.k("loadNewJavascriptEngine (success): Lock acquired");
                        mVar.f5720c = 0;
                        C2770Sc c2770Sc = (C2770Sc) mVar.f5725h;
                        if (c2770Sc != null && ((C2770Sc) this.f34630u) != c2770Sc) {
                            t2.C.k("New JS engine is loaded, marking previous one as destroyable.");
                            ((C2770Sc) mVar.f5725h).u();
                        }
                        mVar.f5725h = (C2770Sc) this.f34630u;
                        if (((Boolean) AbstractC2547Fa.f24967d.r()).booleanValue() && (zu = (Zu) mVar.f5724g) != null) {
                            Vu vu = (Vu) this.f34631v;
                            vu.b(true);
                            zu.b(vu.m());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                t2.C.k("loadNewJavascriptEngine (success): Lock released");
                return;
            default:
                ((EQ) obj).m(0, ((NP) this.f34630u).f26543a, (C3958tQ) this.f34631v, (C4228yQ) this.f34632w);
                return;
        }
    }

    public /* synthetic */ C4017ue(Object obj, Object obj2, Object obj3, int i) {
        this.f34629n = i;
        this.f34630u = obj;
        this.f34631v = obj2;
        this.f34632w = obj3;
    }

    public C4017ue(int i) {
        int i4 = 0;
        this.f34629n = i;
        switch (i) {
            case 5:
                this.f34630u = new ArrayList();
                this.f34631v = new ArrayList();
                this.f34632w = new ArrayList();
                break;
            case 18:
                this.f34631v = new ArrayDeque();
                this.f34632w = null;
                this.f34630u = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
            default:
                String str = AbstractC3548lu.f32613a;
                this.f34630u = new I(i4, Executors.newSingleThreadExecutor(new ThreadFactoryC3062cu("ExoPlayer:Loader:ProgressiveMediaPeriod")));
                break;
        }
    }

    public C4017ue(Context context) {
        this.f34629n = 26;
        this.f34630u = context != null ? context.getApplicationContext() : null;
        if (context == null) {
            this.f34631v = XO.f28642f;
        }
    }

    public C4017ue(Context context, Executor executor, C3615n6 c3615n6, C3761pr c3761pr) {
        this.f34629n = 4;
        this.f34631v = c3761pr;
        this.f34632w = c3615n6;
        this.f34630u = C3686oN.p(new T6(0, this, context), executor);
    }

    public C4017ue(c7.m mVar, C2770Sc c2770Sc, Vu vu) {
        this.f34629n = 6;
        this.f34630u = c2770Sc;
        this.f34631v = vu;
        Objects.requireNonNull(mVar);
        this.f34632w = mVar;
    }

    public C4017ue(C4017ue c4017ue, SD sd) {
        this.f34629n = 16;
        this.f34632w = new Dr((byte) 0, 9);
        this.f34630u = c4017ue;
        this.f34631v = sd;
    }

    public C4017ue(C2529Dq c2529Dq, C3598mq c3598mq, Ut ut) {
        this.f34629n = 14;
        this.f34630u = c3598mq;
        this.f34631v = ut;
        Objects.requireNonNull(c2529Dq);
        this.f34632w = c2529Dq;
    }

    public C4017ue(C4087vu c4087vu) {
        this.f34629n = 17;
        this.f34630u = new ConcurrentHashMap(c4087vu.f34894x);
        this.f34631v = c4087vu;
        this.f34632w = new J4();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.cO, java.lang.Object] */
    public /* synthetic */ C4017ue(C3093dO c3093dO, Context context) {
        this.f34629n = 25;
        Objects.requireNonNull(c3093dO);
        this.f34632w = c3093dO;
        this.f34630u = new WeakReference(context);
        ?? r02 = new IntConsumer() { // from class: com.google.android.gms.internal.ads.cO
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                C3093dO c3093dO2 = (C3093dO) C4017ue.this.f34632w;
                if (c3093dO2.f30010E0) {
                    return;
                }
                c3093dO2.M1(1, 19, Integer.valueOf(i));
            }
        };
        this.f34631v = r02;
        context.registerDeviceIdChangeListener(new I(2, c3093dO.f30024O.A(c3093dO.f30022M, null)), r02);
    }

    public C4017ue(ArrayList arrayList) {
        this.f34629n = 2;
        this.f34630u = Collections.unmodifiableList(new ArrayList(arrayList));
        int size = arrayList.size();
        this.f34631v = new long[size + size];
        for (int i = 0; i < arrayList.size(); i++) {
            U3 u32 = (U3) arrayList.get(i);
            long[] jArr = (long[]) this.f34631v;
            int i4 = i + i;
            jArr[i4] = u32.f27920b;
            jArr[i4 + 1] = u32.f27921c;
        }
        long[] jArr2 = (long[]) this.f34631v;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f34632w = copyOf;
        Arrays.sort(copyOf);
    }

    public C4017ue(List list) {
        this.f34629n = 3;
        this.f34630u = list;
        this.f34631v = new InterfaceC3448k1[list.size()];
        this.f34632w = new C2728Pl(new Vx(4, this));
    }
}
