package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import k2.EnumC4631b;
import u2.C5107a;

/* loaded from: classes2.dex */
public final class Lv extends AbstractBinderC3186f8 implements q2.S {

    /* renamed from: n, reason: collision with root package name */
    public final Mv f26269n;

    /* renamed from: u, reason: collision with root package name */
    public final Gv f26270u;

    public Lv(Mv mv, Gv gv) {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
        this.f26269n = mv;
        this.f26270u = gv;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        q2.N n9 = null;
        r5 = null;
        r5 = null;
        q2.W0 w02 = null;
        q2.P p6 = null;
        switch (i) {
            case 1:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(q2.W0.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    n9 = queryLocalInterface instanceof q2.N ? (q2.N) queryLocalInterface : new q2.N(readStrongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback", 2);
                }
                AbstractC3241g8.f(parcel);
                G3(createTypedArrayList, n9);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                AbstractC3241g8.f(parcel);
                boolean H32 = H3(readString);
                parcel2.writeNoException();
                parcel2.writeInt(H32 ? 1 : 0);
                return true;
            case 3:
                String readString2 = parcel.readString();
                AbstractC3241g8.f(parcel);
                InterfaceC3211ff I32 = I3(readString2);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, I32);
                return true;
            case 4:
                String readString3 = parcel.readString();
                AbstractC3241g8.f(parcel);
                boolean J32 = J3(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(J32 ? 1 : 0);
                return true;
            case 5:
                String readString4 = parcel.readString();
                AbstractC3241g8.f(parcel);
                K8 K32 = K3(readString4);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, K32);
                return true;
            case 6:
                String readString5 = parcel.readString();
                AbstractC3241g8.f(parcel);
                boolean L32 = L3(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(L32 ? 1 : 0);
                return true;
            case 7:
                String readString6 = parcel.readString();
                AbstractC3241g8.f(parcel);
                q2.K M32 = M3(readString6);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, M32);
                return true;
            case 8:
                BinderC3317hd.G3(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString7 = parcel.readString();
                q2.W0 w03 = (q2.W0) AbstractC3241g8.b(parcel, q2.W0.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    p6 = queryLocalInterface2 instanceof q2.P ? (q2.P) queryLocalInterface2 : new q2.P(readStrongBinder2, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2", 2);
                }
                AbstractC3241g8.f(parcel);
                boolean N32 = N3(readString7, w03, p6);
                parcel2.writeNoException();
                parcel2.writeInt(N32 ? 1 : 0);
                return true;
            case 10:
                int readInt = parcel.readInt();
                String readString8 = parcel.readString();
                AbstractC3241g8.f(parcel);
                boolean O32 = O3(readInt, readString8);
                parcel2.writeNoException();
                parcel2.writeInt(O32 ? 1 : 0);
                return true;
            case 11:
                String readString9 = parcel.readString();
                AbstractC3241g8.f(parcel);
                q2.K k6 = (q2.K) this.f26270u.b(q2.K.class, readString9, EnumC4631b.INTERSTITIAL);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, k6);
                return true;
            case 12:
                String readString10 = parcel.readString();
                AbstractC3241g8.f(parcel);
                K8 k82 = (K8) this.f26270u.b(K8.class, readString10, EnumC4631b.APP_OPEN_AD);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, k82);
                return true;
            case 13:
                String readString11 = parcel.readString();
                AbstractC3241g8.f(parcel);
                InterfaceC3211ff interfaceC3211ff = (InterfaceC3211ff) this.f26270u.b(InterfaceC3211ff.class, readString11, EnumC4631b.REWARDED);
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, interfaceC3211ff);
                return true;
            case 14:
                int readInt2 = parcel.readInt();
                String readString12 = parcel.readString();
                AbstractC3241g8.f(parcel);
                EnumC4631b a9 = EnumC4631b.a(readInt2);
                if (a9 != null) {
                    Gv gv = this.f26270u;
                    HashMap hashMap = gv.f25242a;
                    synchronized (hashMap) {
                        try {
                            if (hashMap.containsKey(a9)) {
                                Hv hv = (Hv) ((Map) hashMap.get(a9)).get(readString12);
                                Mt mt = gv.f25244c;
                                gv.f25248g.getClass();
                                mt.x("pgc", System.currentTimeMillis(), readString12, hv == null ? null : hv.r(), a9, hv == null ? -1 : hv.s(), hv != null ? hv.t() : -1, 1);
                                if (hv != null) {
                                    w02 = (q2.W0) hv.f25450e.get();
                                }
                            }
                        } finally {
                        }
                    }
                }
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, w02);
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                AbstractC3241g8.f(parcel);
                Gv gv2 = this.f26270u;
                gv2.getClass();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = gv2.f25242a;
                EnumC4631b a10 = EnumC4631b.a(readInt3);
                synchronized (hashMap3) {
                    if (a10 != null) {
                        try {
                            if (hashMap3.containsKey(a10)) {
                                for (Hv hv2 : ((Map) hashMap3.get(a10)).values()) {
                                    hashMap2.put(hv2.f25456l, (q2.W0) hv2.f25450e.get());
                                }
                                Mt mt2 = gv2.f25244c;
                                gv2.f25248g.getClass();
                                mt2.x("pgcs", System.currentTimeMillis(), null, null, a10, -1, -1, hashMap2.size());
                            }
                        } finally {
                        }
                    }
                }
                Bundle bundle = new Bundle();
                for (Map.Entry entry : hashMap2.entrySet()) {
                    String str = (String) entry.getKey();
                    q2.W0 w04 = (q2.W0) entry.getValue();
                    Parcel obtain = Parcel.obtain();
                    w04.writeToParcel(obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    bundle.putByteArray(str, marshall);
                }
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, bundle);
                return true;
            case 16:
                int readInt4 = parcel.readInt();
                String readString13 = parcel.readString();
                AbstractC3241g8.f(parcel);
                EnumC4631b a11 = EnumC4631b.a(readInt4);
                if (a11 != null) {
                    Gv gv3 = this.f26270u;
                    HashMap hashMap4 = gv3.f25242a;
                    synchronized (hashMap4) {
                        try {
                            if (hashMap4.containsKey(a11)) {
                                Hv hv3 = (Hv) ((Map) hashMap4.get(a11)).get(readString13);
                                int t9 = hv3 != null ? hv3.t() : 0;
                                Mt mt3 = gv3.f25244c;
                                gv3.f25248g.getClass();
                                mt3.x("pnav", System.currentTimeMillis(), readString13, hv3 != null ? hv3.r() : null, a11, hv3 != null ? hv3.s() : -1, t9, 1);
                                r6 = t9;
                            }
                        } finally {
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(r6);
                return true;
            case 17:
                int readInt5 = parcel.readInt();
                String readString14 = parcel.readString();
                AbstractC3241g8.f(parcel);
                EnumC4631b a12 = EnumC4631b.a(readInt5);
                if (a12 != null) {
                    Gv gv4 = this.f26270u;
                    HashMap hashMap5 = gv4.f25242a;
                    synchronized (hashMap5) {
                        try {
                            if (hashMap5.containsKey(a12)) {
                                Hv hv4 = (Hv) ((Map) hashMap5.get(a12)).remove(readString14);
                                if (hv4 != null) {
                                    hv4.f25452g.set(false);
                                    hv4.f25460p.set(false);
                                    Ev ev = gv4.i;
                                    if (ev != null) {
                                        ev.d(hv4);
                                    }
                                    int t10 = hv4.t();
                                    Queue queue = hv4.f25454j;
                                    synchronized (queue) {
                                        queue.clear();
                                    }
                                    Mt mt4 = gv4.f25244c;
                                    gv4.f25248g.getClass();
                                    mt4.x("pd", System.currentTimeMillis(), readString14, hv4.r(), a12, hv4.s(), t10, 1);
                                    r6 = 1;
                                }
                            }
                        } finally {
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(r6);
                return true;
            case 18:
                int readInt6 = parcel.readInt();
                AbstractC3241g8.f(parcel);
                O(readInt6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e3, code lost:
    
        r7 = 0;
        r9 = u2.d.f41224b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ed, code lost:
    
        if (r0.containsKey(r6) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ef, code lost:
    
        r7 = r0.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f3, code lost:
    
        r0.put((java.util.EnumMap) r6, (k2.EnumC4631b) java.lang.Integer.valueOf(((java.lang.Integer) r7).intValue() + 1));
        r8 = new com.google.android.gms.internal.ads.Nv(new com.google.android.gms.internal.ads.C3602mu(17, r5, r6));
        r5 = r4.f39989w;
        r2.f26403h.getClass();
        r4.m(r5, java.lang.System.currentTimeMillis(), r8, "1");
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a6 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:4:0x0004, B:7:0x0091, B:8:0x00a0, B:10:0x00a6, B:15:0x00be, B:17:0x00c2, B:18:0x00c9, B:19:0x00d2, B:22:0x00e2, B:23:0x00e3, B:25:0x00ef, B:26:0x00f3, B:33:0x0122, B:38:0x0123, B:41:0x000f, B:43:0x0013, B:58:0x0033, B:59:0x0038, B:61:0x003e, B:64:0x0043, B:65:0x0085, B:68:0x004f, B:69:0x006e, B:45:0x0014, B:51:0x0018, B:47:0x0030, B:54:0x0029, B:21:0x00d3), top: B:3:0x0004, inners: #1, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G3(ArrayList arrayList, q2.N n9) {
        Iterator it;
        Mv mv = this.f26269n;
        synchronized (mv) {
            try {
                if (!mv.f26402g.getAndSet(true)) {
                    if (mv.f26401f == null) {
                        synchronized (mv) {
                            if (mv.f26401f == null) {
                                try {
                                    mv.f26401f = (ConnectivityManager) mv.f26400e.getSystemService("connectivity");
                                } catch (ClassCastException e6) {
                                    int i = t2.C.f40822b;
                                    u2.i.g("Failed to get connectivity manager", e6);
                                }
                            }
                        }
                    }
                    if (S2.b.f() || mv.f26401f == null) {
                        mv.i = new AtomicInteger(((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31482L)).intValue());
                    } else {
                        try {
                            mv.f26401f.registerDefaultNetworkCallback(new Q0.h(mv));
                        } catch (RuntimeException e9) {
                            int i4 = t2.C.f40822b;
                            u2.i.g("Failed to register network callback", e9);
                            mv.i = new AtomicInteger(((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31482L)).intValue());
                        }
                    }
                    p2.j.f39798C.f39807g.i(new P8(mv));
                }
                ArrayList d2 = mv.d(arrayList);
                EnumMap enumMap = new EnumMap(EnumC4631b.class);
                it = d2.iterator();
                while (it.hasNext()) {
                    q2.W0 w02 = (q2.W0) it.next();
                    String str = w02.f39986n;
                    EnumC4631b a9 = EnumC4631b.a(w02.f39987u);
                    Hv a10 = mv.f26398c.a(w02, n9);
                    if (a9 != null && a10 != null) {
                        AtomicInteger atomicInteger = mv.i;
                        if (atomicInteger != null) {
                            a10.p(atomicInteger.get());
                        }
                        Mt mt = mv.f26399d;
                        a10.f25461q = mt;
                        String a11 = Mv.a(str, a9);
                        synchronized (mv) {
                            a10.f25458n.submit(new Pv(a10, 0));
                            mv.f26396a.put(a11, a10);
                        }
                    }
                }
                Mt mt2 = mv.f26399d;
                mv.f26403h.getClass();
                mt2.s(enumMap, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        if (S2.b.f()) {
        }
        mv.i = new AtomicInteger(((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31482L)).intValue());
        p2.j.f39798C.f39807g.i(new P8(mv));
        ArrayList d22 = mv.d(arrayList);
        EnumMap enumMap2 = new EnumMap(EnumC4631b.class);
        it = d22.iterator();
        while (it.hasNext()) {
        }
        Mt mt22 = mv.f26399d;
        mv.f26403h.getClass();
        mt22.s(enumMap2, System.currentTimeMillis());
    }

    public final boolean H3(String str) {
        boolean e6;
        Mv mv = this.f26269n;
        synchronized (mv) {
            e6 = mv.e(str, EnumC4631b.REWARDED);
        }
        return e6;
    }

    public final InterfaceC3211ff I3(String str) {
        InterfaceC3211ff interfaceC3211ff;
        Mv mv = this.f26269n;
        synchronized (mv) {
            interfaceC3211ff = (InterfaceC3211ff) mv.f(InterfaceC3211ff.class, str, EnumC4631b.REWARDED);
        }
        return interfaceC3211ff;
    }

    public final boolean J3(String str) {
        boolean e6;
        Mv mv = this.f26269n;
        synchronized (mv) {
            e6 = mv.e(str, EnumC4631b.APP_OPEN_AD);
        }
        return e6;
    }

    public final K8 K3(String str) {
        K8 k82;
        Mv mv = this.f26269n;
        synchronized (mv) {
            k82 = (K8) mv.f(K8.class, str, EnumC4631b.APP_OPEN_AD);
        }
        return k82;
    }

    public final boolean L3(String str) {
        boolean e6;
        Mv mv = this.f26269n;
        synchronized (mv) {
            e6 = mv.e(str, EnumC4631b.INTERSTITIAL);
        }
        return e6;
    }

    public final q2.K M3(String str) {
        q2.K k6;
        Mv mv = this.f26269n;
        synchronized (mv) {
            k6 = (q2.K) mv.f(q2.K.class, str, EnumC4631b.INTERSTITIAL);
        }
        return k6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean N3(String str, q2.W0 w02, q2.P p6) {
        boolean z8;
        q2.W0 w03;
        EnumC4631b a9;
        Hv hv;
        EnumC4631b enumC4631b;
        Gv gv;
        HashMap hashMap;
        boolean z9;
        Hv hv2;
        HashMap hashMap2;
        int i;
        String str2 = str;
        Gv gv2 = this.f26270u;
        if (!gv2.f25247f.getAndSet(true)) {
            if (gv2.f25246e == null) {
                synchronized (gv2) {
                    if (gv2.f25246e == null) {
                        try {
                            gv2.f25246e = (ConnectivityManager) gv2.f25245d.getSystemService("connectivity");
                        } catch (ClassCastException e6) {
                            int i4 = t2.C.f40822b;
                            u2.i.g("Failed to get connectivity manager", e6);
                        }
                    }
                }
            }
            if (!S2.b.f() || gv2.f25246e == null) {
                gv2.f25249h = new AtomicInteger(((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31482L)).intValue());
            } else {
                try {
                    gv2.f25246e.registerDefaultNetworkCallback(new Q0.h(gv2));
                } catch (RuntimeException e9) {
                    int i9 = t2.C.f40822b;
                    u2.i.g("Failed to register network callback", e9);
                    gv2.f25249h = new AtomicInteger(((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31482L)).intValue());
                }
            }
            p2.j.f39798C.f39807g.i(new P8(gv2));
        }
        EnumC4631b a10 = EnumC4631b.a(w02.f39987u);
        if (a10 != null) {
            HashMap hashMap3 = gv2.f25242a;
            synchronized (hashMap3) {
                try {
                    if (hashMap3.containsKey(a10)) {
                        if (!((Map) hashMap3.get(a10)).containsKey(str2)) {
                            if (gv2.c(a10)) {
                                if (w02.f39990x) {
                                    if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31552T)).booleanValue()) {
                                        t2.E e10 = gv2.f25250j;
                                        e10.i();
                                        synchronized (e10.f40830a) {
                                            i = e10.f40829G;
                                        }
                                        if (i > 0) {
                                            if (i <= 0) {
                                                i = w02.f39989w;
                                            }
                                            String str3 = w02.f39986n;
                                            boolean z10 = w02.f39990x;
                                            w03 = new q2.W0(str3, w02.f39987u, w02.f39988v, i, z10);
                                            Sv sv = gv2.f25243b;
                                            sv.getClass();
                                            a9 = EnumC4631b.a(w03.f39987u);
                                            if (a9 != null) {
                                                int ordinal = a9.ordinal();
                                                C5107a c5107a = sv.f27638b;
                                                if (ordinal == 1) {
                                                    enumC4631b = a10;
                                                    gv = gv2;
                                                    hashMap = hashMap3;
                                                    int i10 = c5107a.f41219v;
                                                    Iv b9 = sv.b();
                                                    ClientApi clientApi = sv.f27641e;
                                                    Context context = sv.f27637a;
                                                    C3602mu c3602mu = sv.f27642f;
                                                    str2 = str;
                                                    hv2 = new Hv(str2, clientApi, context, i10, c3602mu, w03, p6, sv.f27639c, sv.f27640d, b9, sv.f27643g, sv.f27644h, 1);
                                                    hashMap2 = c3602mu;
                                                } else if (ordinal == 2) {
                                                    enumC4631b = a10;
                                                    gv = gv2;
                                                    hashMap = hashMap3;
                                                    int i11 = c5107a.f41219v;
                                                    Iv b10 = sv.b();
                                                    ClientApi clientApi2 = sv.f27641e;
                                                    Context context2 = sv.f27637a;
                                                    C3602mu c3602mu2 = sv.f27642f;
                                                    str2 = str;
                                                    hv2 = new Hv(str2, clientApi2, context2, i11, c3602mu2, w03, p6, sv.f27639c, sv.f27640d, b10, sv.f27643g, sv.f27644h, 2);
                                                    hashMap2 = c3602mu2;
                                                } else if (ordinal == 5) {
                                                    int i12 = c5107a.f41219v;
                                                    Iv b11 = sv.b();
                                                    ClientApi clientApi3 = sv.f27641e;
                                                    Context context3 = sv.f27637a;
                                                    C3602mu c3602mu3 = sv.f27642f;
                                                    gv = gv2;
                                                    enumC4631b = a10;
                                                    hashMap = hashMap3;
                                                    hv2 = new Hv(str2, clientApi3, context3, i12, c3602mu3, w03, p6, sv.f27639c, sv.f27640d, b11, sv.f27643g, sv.f27644h, 0);
                                                    str2 = str;
                                                    hashMap2 = c3602mu3;
                                                }
                                                hv = hv2;
                                                hashMap3 = hashMap2;
                                                if (hv != null) {
                                                    AtomicInteger atomicInteger = gv.f25249h;
                                                    if (atomicInteger != null) {
                                                        hv.p(atomicInteger.get());
                                                    }
                                                    Mt mt = gv.f25244c;
                                                    hv.f25461q = mt;
                                                    synchronized (hashMap) {
                                                        EnumC4631b enumC4631b2 = enumC4631b;
                                                        if (((Map) hashMap.get(enumC4631b2)).containsKey(str2) || !gv.c(enumC4631b2)) {
                                                            z8 = false;
                                                            return z8;
                                                        }
                                                        ((Map) hashMap.get(enumC4631b2)).put(str2, hv);
                                                        Ev ev = gv.i;
                                                        if (ev != null) {
                                                            LinkedHashMap linkedHashMap = ev.f24851d;
                                                            String g9 = Ev.g(str2, enumC4631b2);
                                                            synchronized (linkedHashMap) {
                                                                if (linkedHashMap.containsKey(g9)) {
                                                                    z9 = true;
                                                                } else {
                                                                    linkedHashMap.put(g9, hv);
                                                                    z9 = true;
                                                                    ev.f24853f.execute(new Bv(ev, hv, 1));
                                                                }
                                                            }
                                                        } else {
                                                            z9 = true;
                                                            hv.f25458n.submit(new Pv(hv, 0));
                                                        }
                                                        C3602mu c3602mu4 = new C3602mu(17, w03.f39986n, enumC4631b2);
                                                        c3602mu4.f32776w = str2;
                                                        Nv nv = new Nv(c3602mu4);
                                                        int i13 = w03.f39989w;
                                                        gv.f25248g.getClass();
                                                        mt.m(i13, System.currentTimeMillis(), nv, "2");
                                                        return z9;
                                                    }
                                                }
                                            }
                                            hv = null;
                                            enumC4631b = a10;
                                            gv = gv2;
                                            hashMap = hashMap3;
                                            hashMap3 = hashMap3;
                                            if (hv != null) {
                                            }
                                        }
                                    }
                                }
                                w03 = w02;
                                Sv sv2 = gv2.f25243b;
                                sv2.getClass();
                                a9 = EnumC4631b.a(w03.f39987u);
                                if (a9 != null) {
                                }
                                hv = null;
                                enumC4631b = a10;
                                gv = gv2;
                                hashMap = hashMap3;
                                hashMap3 = hashMap3;
                                if (hv != null) {
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
        }
        z8 = false;
        return z8;
    }

    @Override // q2.S
    public final void O(int i) {
        Gv gv = this.f26270u;
        gv.getClass();
        EnumC4631b a9 = EnumC4631b.a(i);
        if (a9 == null) {
            return;
        }
        HashMap hashMap = gv.f25242a;
        synchronized (hashMap) {
            try {
                if (hashMap.containsKey(a9)) {
                    Map map = (Map) hashMap.get(a9);
                    int size = map.size();
                    if (size == 0) {
                        return;
                    }
                    UB n9 = UB.n(map.values());
                    map.clear();
                    int size2 = n9.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        Hv hv = (Hv) n9.get(i4);
                        if (hv != null) {
                            hv.f25452g.set(false);
                            hv.f25460p.set(false);
                            Ev ev = gv.i;
                            if (ev != null) {
                                ev.d(hv);
                            }
                            Queue queue = hv.f25454j;
                            synchronized (queue) {
                                queue.clear();
                            }
                            String valueOf = String.valueOf(hv.f25456l);
                            int i9 = t2.C.f40822b;
                            u2.i.e("Destroyed ad preloader for preloadId: ".concat(valueOf));
                        }
                    }
                    String concat = "Destroyed all ad preloaders for ad format: ".concat(a9.toString());
                    int i10 = t2.C.f40822b;
                    u2.i.e(concat);
                    Mt mt = gv.f25244c;
                    gv.f25248g.getClass();
                    mt.x("pda", System.currentTimeMillis(), null, null, a9, -1, -1, size);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean O3(int i, String str) {
        Nv nv;
        EnumC4631b a9 = EnumC4631b.a(i);
        if (a9 == null) {
            return false;
        }
        Gv gv = this.f26270u;
        gv.f25248g.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = gv.f25242a;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(a9)) {
                    return false;
                }
                Hv hv = (Hv) ((Map) hashMap.get(a9)).get(str);
                String o9 = hv == null ? null : hv.o();
                boolean z8 = o9 != null && a9.equals(hv.q());
                Long valueOf = z8 ? Long.valueOf(System.currentTimeMillis()) : null;
                if (hv == null) {
                    nv = null;
                } else {
                    C3602mu c3602mu = new C3602mu(17, hv.r(), a9);
                    c3602mu.f32776w = str;
                    nv = new Nv(c3602mu);
                }
                gv.f25244c.u(hv == null ? 0 : hv.s(), hv != null ? hv.t() : 0, currentTimeMillis, valueOf, o9, nv, "2");
                return z8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q2.S
    public final void m2(BinderC3317hd binderC3317hd) {
    }
}
