package com.google.android.gms.internal.ads;

import O7.AbstractC0399y;
import X.InterfaceC0406f;
import g1.C4523c;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import r7.AbstractC4979j;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class Qx {

    /* renamed from: a, reason: collision with root package name */
    public final T7.e f27277a;

    /* renamed from: b, reason: collision with root package name */
    public final Mu f27278b;

    /* renamed from: c, reason: collision with root package name */
    public final W7.d f27279c;

    /* renamed from: d, reason: collision with root package name */
    public final W7.d f27280d;

    /* renamed from: e, reason: collision with root package name */
    public final W7.d f27281e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27282f;

    /* renamed from: g, reason: collision with root package name */
    public C3659nx f27283g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27284h;
    public final InterfaceC0406f i;

    /* renamed from: j, reason: collision with root package name */
    public final C2730Pn f27285j;

    public Qx(InterfaceC0406f adQualityDataStore, C4086vt c4086vt, C2730Pn dataPinger, Dr dr) {
        kotlin.jvm.internal.h.e(adQualityDataStore, "adQualityDataStore");
        kotlin.jvm.internal.h.e(dataPinger, "dataPinger");
        this.f27285j = dataPinger;
        this.f27277a = AbstractC0399y.b(new O7.S((ExecutorService) c4086vt.f34886u));
        this.f27278b = new Mu(4);
        this.f27279c = new W7.d();
        this.f27280d = new W7.d();
        this.f27281e = new W7.d();
        this.i = adQualityDataStore;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x006c, code lost:
    
        if (r1 == r3) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.google.android.gms.internal.ads.Qx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v19, types: [W7.a] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(Qx qx, AbstractC5219c abstractC5219c) {
        Lx lx;
        ?? r42;
        W7.d dVar;
        qx.getClass();
        try {
            if (abstractC5219c instanceof Lx) {
                lx = (Lx) abstractC5219c;
                int i = lx.f26274w;
                if ((i & Integer.MIN_VALUE) != 0) {
                    lx.f26274w = i - Integer.MIN_VALUE;
                    Object obj = lx.f26272u;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    r42 = lx.f26274w;
                    q7.v vVar = q7.v.f40183a;
                    if (r42 != 0) {
                        com.bumptech.glide.f.r(obj);
                        W7.d dVar2 = qx.f27281e;
                        lx.f26271n = dVar2;
                        lx.f26274w = 1;
                        if (dVar2.c(lx) != enumC5179a) {
                            dVar = dVar2;
                        }
                        return enumC5179a;
                    }
                    if (r42 != 1) {
                        if (r42 != 2) {
                            if (r42 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.f.r(obj);
                            return vVar;
                        }
                        W7.a aVar = lx.f26271n;
                        com.bumptech.glide.f.r(obj);
                        r42 = aVar;
                        C3874rx c3874rx = (C3874rx) obj;
                        if (c3874rx != null && c3874rx.A() != 0) {
                            for (Map.Entry entry : c3874rx.B().entrySet()) {
                                C3659nx c3659nx = (C3659nx) ((C3713ox) entry.getValue()).s();
                                Object value = entry.getValue();
                                kotlin.jvm.internal.h.d(value, "<get-value>(...)");
                                C3713ox c3713ox = (C3713ox) value;
                                InterfaceC3576mL M8 = c3713ox.M();
                                Long l9 = M8 != null ? (Long) AbstractC4979j.M(M8) : null;
                                boolean z8 = false;
                                boolean z9 = c3713ox.N() > c3713ox.O() && !c3713ox.G();
                                if (l9 != null) {
                                    if (c3713ox.K() - l9.longValue() > com.anythink.basead.exoplayer.f.f7344a) {
                                        z8 = true;
                                    }
                                }
                                if (z9 || z8) {
                                    c3659nx.h();
                                    ((C3713ox) c3659nx.f30000u).W(true);
                                }
                                qx.f27285j.a((C3713ox) c3659nx.j());
                            }
                            lx.f26271n = null;
                            lx.f26274w = 3;
                            if (qx.a(lx) == enumC5179a) {
                                return enumC5179a;
                            }
                        }
                        return vVar;
                    }
                    ?? r43 = lx.f26271n;
                    com.bumptech.glide.f.r(obj);
                    dVar = r43;
                    C4523c c4523c = ((X.D) qx.i).f3538b;
                    lx.f26271n = dVar;
                    lx.f26274w = 2;
                    obj = R7.o.b(c4523c, lx);
                    r42 = dVar;
                }
            }
            if (r42 != 0) {
            }
            C4523c c4523c2 = ((X.D) qx.i).f3538b;
            lx.f26271n = dVar;
            lx.f26274w = 2;
            obj = R7.o.b(c4523c2, lx);
            r42 = dVar;
        } finally {
            ((W7.d) r42).d(null);
        }
        lx = new Lx(qx, abstractC5219c);
        Object obj2 = lx.f26272u;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        r42 = lx.f26274w;
        q7.v vVar2 = q7.v.f40183a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:12:0x0053, B:18:0x005d), top: B:11:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(Qx qx, String str, AbstractC5219c abstractC5219c) {
        Fx fx;
        int i;
        String str2;
        W7.d dVar;
        long j9;
        boolean z8;
        qx.getClass();
        try {
            if (abstractC5219c instanceof Fx) {
                fx = (Fx) abstractC5219c;
                int i4 = fx.f25059x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    fx.f25059x = i4 - Integer.MIN_VALUE;
                    Object obj = fx.f25057v;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = fx.f25059x;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj);
                        long currentTimeMillis = System.currentTimeMillis();
                        fx.f25060y = str;
                        W7.d dVar2 = qx.f27279c;
                        fx.f25055n = dVar2;
                        fx.f25056u = currentTimeMillis;
                        fx.f25059x = 1;
                        if (dVar2.c(fx) == enumC5179a) {
                            return enumC5179a;
                        }
                        str2 = str;
                        dVar = dVar2;
                        j9 = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j9 = fx.f25056u;
                        dVar = fx.f25055n;
                        str2 = fx.f25060y;
                        com.bumptech.glide.f.r(obj);
                    }
                    z8 = qx.f27282f;
                    q7.v vVar = q7.v.f40183a;
                    if (!z8) {
                        return vVar;
                    }
                    qx.f27282f = true;
                    C3659nx c3659nx = (C3659nx) C3713ox.R().s();
                    qx.f27283g = c3659nx;
                    c3659nx.h();
                    ((C3713ox) c3659nx.f30000u).S(str2);
                    c3659nx.h();
                    ((C3713ox) c3659nx.f30000u).Y(j9);
                    return vVar;
                }
            }
            z8 = qx.f27282f;
            q7.v vVar2 = q7.v.f40183a;
            if (!z8) {
            }
        } finally {
            dVar.d(null);
        }
        fx = new Fx(qx, abstractC5219c);
        Object obj2 = fx.f25057v;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = fx.f25059x;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (r10.b(r7, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x005d, code lost:
    
        if (r2.c(r0) != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[Catch: all -> 0x00aa, TRY_LEAVE, TryCatch #0 {all -> 0x00aa, blocks: (B:24:0x007f, B:26:0x0083, B:29:0x00a4, B:30:0x00a9), top: B:23:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #0 {all -> 0x00aa, blocks: (B:24:0x007f, B:26:0x0083, B:29:0x00a4, B:30:0x00a9), top: B:23:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067 A[Catch: all -> 0x00af, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00af, blocks: (B:36:0x005f, B:40:0x0067), top: B:35:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(Qx qx, AbstractC5219c abstractC5219c) {
        Bx bx;
        int i;
        W7.d dVar;
        W7.d dVar2;
        long j9;
        C3659nx c3659nx;
        qx.getClass();
        try {
            if (abstractC5219c instanceof Bx) {
                bx = (Bx) abstractC5219c;
                int i4 = bx.f24110x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    bx.f24110x = i4 - Integer.MIN_VALUE;
                    Object obj = bx.f24108v;
                    Object obj2 = EnumC5179a.f41704n;
                    i = bx.f24110x;
                    q7.v vVar = q7.v.f40183a;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj);
                        dVar = qx.f27280d;
                        bx.f24106n = dVar;
                        bx.f24110x = 1;
                    } else if (i == 1) {
                        dVar = bx.f24106n;
                        com.bumptech.glide.f.r(obj);
                    } else {
                        if (i != 2) {
                            if (i == 3) {
                                com.bumptech.glide.f.r(obj);
                                bx.f24110x = 4;
                                return qx.c(bx) != obj2 ? vVar : obj2;
                            }
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.f.r(obj);
                            return vVar;
                        }
                        j9 = bx.f24107u;
                        dVar2 = bx.f24106n;
                        com.bumptech.glide.f.r(obj);
                        try {
                            c3659nx = qx.f27283g;
                            if (c3659nx != null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3659nx.h();
                            ((C3713ox) c3659nx.f30000u).b0(j9);
                            dVar2.d(null);
                            bx.f24106n = null;
                            bx.f24110x = 3;
                        } finally {
                        }
                    }
                    if (!qx.f27284h) {
                        return vVar;
                    }
                    qx.f27284h = true;
                    dVar2.d(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    dVar2 = qx.f27279c;
                    bx.f24106n = dVar2;
                    bx.f24107u = currentTimeMillis;
                    bx.f24110x = 2;
                    if (dVar2.c(bx) != obj2) {
                        j9 = currentTimeMillis;
                        c3659nx = qx.f27283g;
                        if (c3659nx != null) {
                        }
                    }
                }
            }
            if (!qx.f27284h) {
            }
        } finally {
        }
        bx = new Bx(qx, abstractC5219c);
        Object obj3 = bx.f24108v;
        Object obj22 = EnumC5179a.f41704n;
        i = bx.f24110x;
        q7.v vVar2 = q7.v.f40183a;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x004f, code lost:
    
        if (r2.c(r0) != r1) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079 A[Catch: all -> 0x00d9, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00d9, blocks: (B:12:0x0073, B:15:0x0079, B:18:0x0085, B:20:0x0089, B:22:0x00ad, B:24:0x00bd, B:26:0x00c1, B:27:0x00d5, B:28:0x00d8, B:30:0x00dc, B:31:0x00df, B:32:0x00e0, B:33:0x00e3, B:34:0x00e4, B:36:0x00e8, B:38:0x00f2, B:40:0x00f6, B:42:0x011a, B:43:0x012e, B:44:0x0131, B:45:0x0132, B:46:0x0135, B:47:0x0136, B:49:0x013a, B:52:0x0148, B:53:0x014b, B:54:0x014c, B:55:0x014f, B:56:0x0150, B:57:0x0153), top: B:11:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0150 A[Catch: all -> 0x00d9, TryCatch #1 {all -> 0x00d9, blocks: (B:12:0x0073, B:15:0x0079, B:18:0x0085, B:20:0x0089, B:22:0x00ad, B:24:0x00bd, B:26:0x00c1, B:27:0x00d5, B:28:0x00d8, B:30:0x00dc, B:31:0x00df, B:32:0x00e0, B:33:0x00e3, B:34:0x00e4, B:36:0x00e8, B:38:0x00f2, B:40:0x00f6, B:42:0x011a, B:43:0x012e, B:44:0x0131, B:45:0x0132, B:46:0x0135, B:47:0x0136, B:49:0x013a, B:52:0x0148, B:53:0x014b, B:54:0x014c, B:55:0x014f, B:56:0x0150, B:57:0x0153), top: B:11:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0055 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(Qx qx, AbstractC5219c abstractC5219c) {
        Px px;
        int i;
        W7.d dVar;
        W7.d dVar2;
        long j9;
        C3659nx c3659nx;
        qx.getClass();
        try {
            if (abstractC5219c instanceof Px) {
                px = (Px) abstractC5219c;
                int i4 = px.f27084x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    px.f27084x = i4 - Integer.MIN_VALUE;
                    Object obj = px.f27082v;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = px.f27084x;
                    q7.v vVar = q7.v.f40183a;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj);
                        dVar = qx.f27280d;
                        px.f27080n = dVar;
                        px.f27084x = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j9 = px.f27081u;
                            dVar2 = px.f27080n;
                            com.bumptech.glide.f.r(obj);
                            try {
                                c3659nx = qx.f27283g;
                                if (c3659nx != null) {
                                    kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                    throw null;
                                }
                                if (((C3713ox) c3659nx.f30000u).Q() > 0) {
                                    C3659nx c3659nx2 = qx.f27283g;
                                    if (c3659nx2 == null) {
                                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                        throw null;
                                    }
                                    List unmodifiableList = Collections.unmodifiableList(((C3713ox) c3659nx2.f30000u).P());
                                    kotlin.jvm.internal.h.d(unmodifiableList, "getAdClickTimestampsMsList(...)");
                                    Object L8 = AbstractC4979j.L(unmodifiableList);
                                    kotlin.jvm.internal.h.d(L8, "last(...)");
                                    long longValue = j9 - ((Number) L8).longValue();
                                    C3659nx c3659nx3 = qx.f27283g;
                                    if (c3659nx3 == null) {
                                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                        throw null;
                                    }
                                    c3659nx3.h();
                                    ((C3713ox) c3659nx3.f30000u).C();
                                    if (longValue < com.anythink.basead.exoplayer.f.f7344a) {
                                        C3659nx c3659nx4 = qx.f27283g;
                                        if (c3659nx4 == null) {
                                            kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                            throw null;
                                        }
                                        int F8 = ((C3713ox) c3659nx4.f30000u).F() + 1;
                                        c3659nx4.h();
                                        ((C3713ox) c3659nx4.f30000u).U(F8);
                                    }
                                }
                                C3659nx c3659nx5 = qx.f27283g;
                                if (c3659nx5 == null) {
                                    kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                    throw null;
                                }
                                if (((C3713ox) c3659nx5.f30000u).N() > 0) {
                                    C3659nx c3659nx6 = qx.f27283g;
                                    if (c3659nx6 == null) {
                                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                        throw null;
                                    }
                                    List unmodifiableList2 = Collections.unmodifiableList(((C3713ox) c3659nx6.f30000u).M());
                                    kotlin.jvm.internal.h.d(unmodifiableList2, "getAppBackgroundTimestampsMsList(...)");
                                    Object L9 = AbstractC4979j.L(unmodifiableList2);
                                    kotlin.jvm.internal.h.d(L9, "last(...)");
                                    long longValue2 = j9 - ((Number) L9).longValue();
                                    C3659nx c3659nx7 = qx.f27283g;
                                    if (c3659nx7 == null) {
                                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                        throw null;
                                    }
                                    long I2 = ((C3713ox) c3659nx7.f30000u).I() + longValue2;
                                    c3659nx7.h();
                                    ((C3713ox) c3659nx7.f30000u).X(I2);
                                }
                                C3659nx c3659nx8 = qx.f27283g;
                                if (c3659nx8 == null) {
                                    kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                    throw null;
                                }
                                c3659nx8.h();
                                ((C3713ox) c3659nx8.f30000u).A(j9);
                                return vVar;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        dVar = px.f27080n;
                        com.bumptech.glide.f.r(obj);
                    }
                    if (qx.f27284h) {
                        return vVar;
                    }
                    qx.f27284h = false;
                    dVar.d(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    W7.d dVar3 = qx.f27279c;
                    px.f27080n = dVar3;
                    px.f27081u = currentTimeMillis;
                    px.f27084x = 2;
                    if (dVar3.c(px) != enumC5179a) {
                        dVar2 = dVar3;
                        j9 = currentTimeMillis;
                        c3659nx = qx.f27283g;
                        if (c3659nx != null) {
                        }
                    }
                    return enumC5179a;
                }
            }
            if (qx.f27284h) {
            }
        } finally {
            dVar.d(null);
        }
        px = new Px(qx, abstractC5219c);
        Object obj2 = px.f27082v;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = px.f27084x;
        q7.v vVar2 = q7.v.f40183a;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        if (r14.c(r0) != r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093 A[Catch: all -> 0x00f9, TRY_ENTER, TryCatch #1 {all -> 0x00f9, blocks: (B:26:0x008d, B:29:0x0093, B:31:0x00a1, B:33:0x00b8, B:35:0x00c6, B:38:0x00fb, B:39:0x00fe, B:40:0x00ff, B:41:0x0102, B:42:0x0103, B:43:0x0106, B:44:0x0107, B:45:0x010a), top: B:25:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107 A[Catch: all -> 0x00f9, TryCatch #1 {all -> 0x00f9, blocks: (B:26:0x008d, B:29:0x0093, B:31:0x00a1, B:33:0x00b8, B:35:0x00c6, B:38:0x00fb, B:39:0x00fe, B:40:0x00ff, B:41:0x0102, B:42:0x0103, B:43:0x0106, B:44:0x0107, B:45:0x010a), top: B:25:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(Qx qx, AbstractC5219c abstractC5219c) {
        Jx jx;
        int i;
        W7.a aVar;
        long j9;
        Object obj;
        C3659nx c3659nx;
        C3713ox c3713ox;
        qx.getClass();
        try {
            if (abstractC5219c instanceof Jx) {
                jx = (Jx) abstractC5219c;
                int i4 = jx.f25856x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    jx.f25856x = i4 - Integer.MIN_VALUE;
                    Object obj2 = jx.f25854v;
                    Object obj3 = EnumC5179a.f41704n;
                    i = jx.f25856x;
                    q7.v vVar = q7.v.f40183a;
                    W7.d dVar = qx.f27279c;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj2);
                        jx.f25852n = dVar;
                        jx.f25856x = 1;
                        if (dVar.c(jx) != obj3) {
                            aVar = dVar;
                        }
                        return obj3;
                    }
                    if (i == 1) {
                        aVar = (W7.a) jx.f25852n;
                        com.bumptech.glide.f.r(obj2);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                com.bumptech.glide.f.r(obj2);
                                return vVar;
                            }
                            c3713ox = (C3713ox) jx.f25852n;
                            com.bumptech.glide.f.r(obj2);
                            if (qx.f27285j.a(c3713ox)) {
                                String D8 = c3713ox.D();
                                kotlin.jvm.internal.h.d(D8, "getGwsQueryId(...)");
                                jx.f25852n = null;
                                jx.f25856x = 4;
                                if (qx.k(D8, jx) == obj3) {
                                    return obj3;
                                }
                            }
                            return vVar;
                        }
                        j9 = jx.f25853u;
                        Object obj4 = (W7.a) jx.f25852n;
                        com.bumptech.glide.f.r(obj2);
                        obj = obj4;
                        try {
                            c3659nx = qx.f27283g;
                            if (c3659nx != null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            long J = j9 - ((C3713ox) c3659nx.f30000u).J();
                            C3659nx c3659nx2 = qx.f27283g;
                            if (c3659nx2 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            long I2 = J - ((C3713ox) c3659nx2.f30000u).I();
                            c3659nx.h();
                            ((C3713ox) c3659nx.f30000u).T(I2);
                            C3659nx c3659nx3 = qx.f27283g;
                            if (c3659nx3 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3659nx3.h();
                            ((C3713ox) c3659nx3.f30000u).a0(j9);
                            C3659nx c3659nx4 = qx.f27283g;
                            if (c3659nx4 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3713ox = (C3713ox) c3659nx4.j();
                            ((W7.d) obj).d(null);
                            jx.f25852n = c3713ox;
                            jx.f25856x = 3;
                        } finally {
                        }
                    }
                    if (qx.f27282f) {
                        return vVar;
                    }
                    qx.f27282f = false;
                    ((W7.d) aVar).d(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    jx.f25852n = dVar;
                    jx.f25853u = currentTimeMillis;
                    jx.f25856x = 2;
                    if (dVar.c(jx) != obj3) {
                        j9 = currentTimeMillis;
                        obj = dVar;
                        c3659nx = qx.f27283g;
                        if (c3659nx != null) {
                        }
                    }
                    return obj3;
                }
            }
            if (qx.f27282f) {
            }
        } finally {
        }
        jx = new Jx(qx, abstractC5219c);
        Object obj22 = jx.f25854v;
        Object obj32 = EnumC5179a.f41704n;
        i = jx.f25856x;
        q7.v vVar2 = q7.v.f40183a;
        W7.d dVar2 = qx.f27279c;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e8, code lost:
    
        if (r14.c(r0) != r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093 A[Catch: all -> 0x0107, TRY_ENTER, TryCatch #1 {all -> 0x0107, blocks: (B:26:0x008d, B:29:0x0093, B:31:0x00a1, B:33:0x00b8, B:35:0x00c6, B:37:0x00d4, B:40:0x0109, B:41:0x010c, B:42:0x010d, B:43:0x0110, B:44:0x0111, B:45:0x0114, B:46:0x0115, B:47:0x0118, B:48:0x0119, B:49:0x011c), top: B:25:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119 A[Catch: all -> 0x0107, TryCatch #1 {all -> 0x0107, blocks: (B:26:0x008d, B:29:0x0093, B:31:0x00a1, B:33:0x00b8, B:35:0x00c6, B:37:0x00d4, B:40:0x0109, B:41:0x010c, B:42:0x010d, B:43:0x0110, B:44:0x0111, B:45:0x0114, B:46:0x0115, B:47:0x0118, B:48:0x0119, B:49:0x011c), top: B:25:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(Qx qx, AbstractC5219c abstractC5219c) {
        Nx nx;
        int i;
        W7.a aVar;
        long j9;
        Object obj;
        C3659nx c3659nx;
        C3713ox c3713ox;
        qx.getClass();
        try {
            if (abstractC5219c instanceof Nx) {
                nx = (Nx) abstractC5219c;
                int i4 = nx.f26627x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    nx.f26627x = i4 - Integer.MIN_VALUE;
                    Object obj2 = nx.f26625v;
                    Object obj3 = EnumC5179a.f41704n;
                    i = nx.f26627x;
                    q7.v vVar = q7.v.f40183a;
                    W7.d dVar = qx.f27279c;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj2);
                        nx.f26623n = dVar;
                        nx.f26627x = 1;
                        if (dVar.c(nx) != obj3) {
                            aVar = dVar;
                        }
                        return obj3;
                    }
                    if (i == 1) {
                        aVar = (W7.a) nx.f26623n;
                        com.bumptech.glide.f.r(obj2);
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                com.bumptech.glide.f.r(obj2);
                                return vVar;
                            }
                            c3713ox = (C3713ox) nx.f26623n;
                            com.bumptech.glide.f.r(obj2);
                            if (qx.f27285j.a(c3713ox)) {
                                String D8 = c3713ox.D();
                                kotlin.jvm.internal.h.d(D8, "getGwsQueryId(...)");
                                nx.f26623n = null;
                                nx.f26627x = 4;
                                if (qx.k(D8, nx) == obj3) {
                                    return obj3;
                                }
                            }
                            return vVar;
                        }
                        j9 = nx.f26624u;
                        Object obj4 = (W7.a) nx.f26623n;
                        com.bumptech.glide.f.r(obj2);
                        obj = obj4;
                        try {
                            c3659nx = qx.f27283g;
                            if (c3659nx != null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            long J = j9 - ((C3713ox) c3659nx.f30000u).J();
                            C3659nx c3659nx2 = qx.f27283g;
                            if (c3659nx2 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            long I2 = J - ((C3713ox) c3659nx2.f30000u).I();
                            c3659nx.h();
                            ((C3713ox) c3659nx.f30000u).T(I2);
                            C3659nx c3659nx3 = qx.f27283g;
                            if (c3659nx3 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3659nx3.h();
                            ((C3713ox) c3659nx3.f30000u).Z(j9);
                            C3659nx c3659nx4 = qx.f27283g;
                            if (c3659nx4 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3659nx4.h();
                            ((C3713ox) c3659nx4.f30000u).V();
                            C3659nx c3659nx5 = qx.f27283g;
                            if (c3659nx5 == null) {
                                kotlin.jvm.internal.h.k("adQualityDataBuilder");
                                throw null;
                            }
                            c3713ox = (C3713ox) c3659nx5.j();
                            ((W7.d) obj).d(null);
                            nx.f26623n = c3713ox;
                            nx.f26627x = 3;
                        } finally {
                        }
                    }
                    if (qx.f27282f) {
                        return vVar;
                    }
                    qx.f27282f = false;
                    ((W7.d) aVar).d(null);
                    long currentTimeMillis = System.currentTimeMillis();
                    nx.f26623n = dVar;
                    nx.f26624u = currentTimeMillis;
                    nx.f26627x = 2;
                    if (dVar.c(nx) != obj3) {
                        j9 = currentTimeMillis;
                        obj = dVar;
                        c3659nx = qx.f27283g;
                        if (c3659nx != null) {
                        }
                    }
                    return obj3;
                }
            }
            if (qx.f27282f) {
            }
        } finally {
        }
        nx = new Nx(qx, abstractC5219c);
        Object obj22 = nx.f26625v;
        Object obj32 = EnumC5179a.f41704n;
        i = nx.f26627x;
        q7.v vVar2 = q7.v.f40183a;
        W7.d dVar2 = qx.f27279c;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #0 {all -> 0x0068, blocks: (B:12:0x004e, B:14:0x0052, B:18:0x0062, B:19:0x0067), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[Catch: all -> 0x0068, TRY_ENTER, TryCatch #0 {all -> 0x0068, blocks: (B:12:0x004e, B:14:0x0052, B:18:0x0062, B:19:0x0067), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(Qx qx, AbstractC5219c abstractC5219c) {
        Hx hx;
        int i;
        W7.d dVar;
        long j9;
        C3659nx c3659nx;
        qx.getClass();
        try {
            if (abstractC5219c instanceof Hx) {
                hx = (Hx) abstractC5219c;
                int i4 = hx.f25470x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    hx.f25470x = i4 - Integer.MIN_VALUE;
                    Object obj = hx.f25468v;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = hx.f25470x;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj);
                        long currentTimeMillis = System.currentTimeMillis();
                        W7.d dVar2 = qx.f27279c;
                        hx.f25467u = dVar2;
                        hx.f25466n = currentTimeMillis;
                        hx.f25470x = 1;
                        if (dVar2.c(hx) == enumC5179a) {
                            return enumC5179a;
                        }
                        dVar = dVar2;
                        j9 = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j9 = hx.f25466n;
                        dVar = hx.f25467u;
                        com.bumptech.glide.f.r(obj);
                    }
                    c3659nx = qx.f27283g;
                    if (c3659nx != null) {
                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                        throw null;
                    }
                    c3659nx.h();
                    ((C3713ox) c3659nx.f30000u).B(j9);
                    dVar.d(null);
                    return q7.v.f40183a;
                }
            }
            c3659nx = qx.f27283g;
            if (c3659nx != null) {
            }
        } catch (Throwable th) {
            dVar.d(null);
            throw th;
        }
        hx = new Hx(qx, abstractC5219c);
        Object obj2 = hx.f25468v;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = hx.f25470x;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
    
        if (r8.c(r0) != r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v4, types: [W7.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC5219c abstractC5219c) {
        C4198xx c4198xx;
        EnumC5179a enumC5179a;
        int i;
        W7.d dVar;
        W7.a aVar;
        Throwable th;
        Object i4;
        try {
            if (abstractC5219c instanceof C4198xx) {
                c4198xx = (C4198xx) abstractC5219c;
                int i9 = c4198xx.f35286w;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    c4198xx.f35286w = i9 - Integer.MIN_VALUE;
                    Object obj = c4198xx.f35284u;
                    enumC5179a = EnumC5179a.f41704n;
                    i = c4198xx.f35286w;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj);
                        dVar = this.f27281e;
                        c4198xx.f35283n = dVar;
                        c4198xx.f35286w = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = c4198xx.f35283n;
                            try {
                                com.bumptech.glide.f.r(obj);
                                ((W7.d) aVar).d(null);
                                return q7.v.f40183a;
                            } catch (Throwable th2) {
                                th = th2;
                                ((W7.d) aVar).d(null);
                                throw th;
                            }
                        }
                        ?? r22 = c4198xx.f35283n;
                        com.bumptech.glide.f.r(obj);
                        dVar = r22;
                    }
                    InterfaceC0406f interfaceC0406f = this.i;
                    C4252yx c4252yx = new C4252yx(2, null);
                    c4198xx.f35283n = dVar;
                    c4198xx.f35286w = 2;
                    i4 = ((X.D) interfaceC0406f).i(c4252yx, c4198xx);
                    if (i4 != enumC5179a) {
                        aVar = dVar;
                        obj = i4;
                        ((W7.d) aVar).d(null);
                        return q7.v.f40183a;
                    }
                    return enumC5179a;
                }
            }
            InterfaceC0406f interfaceC0406f2 = this.i;
            C4252yx c4252yx2 = new C4252yx(2, null);
            c4198xx.f35283n = dVar;
            c4198xx.f35286w = 2;
            i4 = ((X.D) interfaceC0406f2).i(c4252yx2, c4198xx);
            if (i4 != enumC5179a) {
            }
            return enumC5179a;
        } catch (Throwable th3) {
            aVar = dVar;
            th = th3;
            ((W7.d) aVar).d(null);
            throw th;
        }
        c4198xx = new C4198xx(this, abstractC5219c);
        Object obj2 = c4198xx.f35284u;
        enumC5179a = EnumC5179a.f41704n;
        i = c4198xx.f35286w;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:12:0x0046, B:15:0x004c, B:17:0x0059, B:21:0x0072, B:22:0x0075, B:23:0x0078, B:24:0x007b), top: B:11:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:12:0x0046, B:15:0x004c, B:17:0x0059, B:21:0x0072, B:22:0x0075, B:23:0x0078, B:24:0x007b), top: B:11:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j9, AbstractC5219c abstractC5219c) {
        C4144wx c4144wx;
        int i;
        W7.d dVar;
        C3659nx c3659nx;
        try {
            if (abstractC5219c instanceof C4144wx) {
                c4144wx = (C4144wx) abstractC5219c;
                int i4 = c4144wx.f35100x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c4144wx.f35100x = i4 - Integer.MIN_VALUE;
                    Object obj = c4144wx.f35098v;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = c4144wx.f35100x;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj);
                        W7.d dVar2 = this.f27279c;
                        c4144wx.f35097u = dVar2;
                        c4144wx.f35096n = j9;
                        c4144wx.f35100x = 1;
                        if (dVar2.c(c4144wx) == enumC5179a) {
                            return enumC5179a;
                        }
                        dVar = dVar2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j9 = c4144wx.f35096n;
                        dVar = c4144wx.f35097u;
                        com.bumptech.glide.f.r(obj);
                    }
                    c3659nx = this.f27283g;
                    if (c3659nx != null) {
                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                        throw null;
                    }
                    long J = j9 - ((C3713ox) c3659nx.f30000u).J();
                    C3659nx c3659nx2 = this.f27283g;
                    if (c3659nx2 == null) {
                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                        throw null;
                    }
                    long I2 = J - ((C3713ox) c3659nx2.f30000u).I();
                    c3659nx.h();
                    ((C3713ox) c3659nx.f30000u).T(I2);
                    dVar.d(null);
                    return q7.v.f40183a;
                }
            }
            c3659nx = this.f27283g;
            if (c3659nx != null) {
            }
        } catch (Throwable th) {
            dVar.d(null);
            throw th;
        }
        c4144wx = new C4144wx(this, abstractC5219c);
        Object obj2 = c4144wx.f35098v;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c4144wx.f35100x;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x005b, code lost:
    
        if (r8 != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, blocks: (B:35:0x005d, B:37:0x0061, B:41:0x00a5, B:42:0x00aa), top: B:34:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[Catch: all -> 0x00a3, TRY_ENTER, TryCatch #1 {all -> 0x00a3, blocks: (B:35:0x005d, B:37:0x0061, B:41:0x00a5, B:42:0x00aa), top: B:34:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC5219c abstractC5219c) {
        Cx cx;
        int i;
        Object obj;
        C3659nx c3659nx;
        W7.d dVar;
        C3713ox c3713ox;
        W7.a aVar;
        try {
            if (abstractC5219c instanceof Cx) {
                cx = (Cx) abstractC5219c;
                int i4 = cx.f24279x;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    cx.f24279x = i4 - Integer.MIN_VALUE;
                    Object obj2 = cx.f24277v;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = cx.f24279x;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj2);
                        W7.d dVar2 = this.f27279c;
                        cx.f24275n = dVar2;
                        cx.f24279x = 1;
                        Object c4 = dVar2.c(cx);
                        obj = dVar2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar = (W7.a) cx.f24275n;
                                try {
                                    com.bumptech.glide.f.r(obj2);
                                    ((W7.d) aVar).d(null);
                                    return q7.v.f40183a;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            dVar = cx.f24276u;
                            c3713ox = (C3713ox) cx.f24275n;
                            com.bumptech.glide.f.r(obj2);
                            try {
                                InterfaceC0406f interfaceC0406f = this.i;
                                Dx dx = new Dx(c3713ox, null);
                                cx.f24275n = dVar;
                                cx.f24276u = null;
                                cx.f24279x = 3;
                                obj2 = ((X.D) interfaceC0406f).i(dx, cx);
                                if (obj2 != enumC5179a) {
                                    aVar = dVar;
                                    ((W7.d) aVar).d(null);
                                    return q7.v.f40183a;
                                }
                                return enumC5179a;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar = dVar;
                                throw th;
                            }
                        }
                        Object obj3 = (W7.a) cx.f24275n;
                        com.bumptech.glide.f.r(obj2);
                        obj = obj3;
                    }
                    c3659nx = this.f27283g;
                    if (c3659nx != null) {
                        kotlin.jvm.internal.h.k("adQualityDataBuilder");
                        throw null;
                    }
                    C3713ox c3713ox2 = (C3713ox) c3659nx.j();
                    ((W7.d) obj).d(null);
                    cx.f24275n = c3713ox2;
                    dVar = this.f27281e;
                    cx.f24276u = dVar;
                    cx.f24279x = 2;
                    if (dVar.c(cx) != enumC5179a) {
                        c3713ox = c3713ox2;
                        InterfaceC0406f interfaceC0406f2 = this.i;
                        Dx dx2 = new Dx(c3713ox, null);
                        cx.f24275n = dVar;
                        cx.f24276u = null;
                        cx.f24279x = 3;
                        obj2 = ((X.D) interfaceC0406f2).i(dx2, cx);
                        if (obj2 != enumC5179a) {
                        }
                    }
                    return enumC5179a;
                }
            }
            c3659nx = this.f27283g;
            if (c3659nx != null) {
            }
        } finally {
            ((W7.d) obj).d(null);
        }
        cx = new Cx(this, abstractC5219c);
        Object obj22 = cx.f24277v;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = cx.f24279x;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (r9.c(r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, AbstractC5219c abstractC5219c) {
        C4036ux c4036ux;
        EnumC5179a enumC5179a;
        int i;
        W7.d dVar;
        Throwable th;
        W7.a aVar;
        Object i4;
        try {
            if (abstractC5219c instanceof C4036ux) {
                c4036ux = (C4036ux) abstractC5219c;
                int i9 = c4036ux.f34683x;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    c4036ux.f34683x = i9 - Integer.MIN_VALUE;
                    Object obj = c4036ux.f34681v;
                    enumC5179a = EnumC5179a.f41704n;
                    i = c4036ux.f34683x;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj);
                        c4036ux.f34679n = str;
                        dVar = this.f27281e;
                        c4036ux.f34680u = dVar;
                        c4036ux.f34683x = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = (W7.a) c4036ux.f34679n;
                            try {
                                com.bumptech.glide.f.r(obj);
                                ((W7.d) aVar).d(null);
                                return q7.v.f40183a;
                            } catch (Throwable th2) {
                                th = th2;
                                ((W7.d) aVar).d(null);
                                throw th;
                            }
                        }
                        W7.d dVar2 = c4036ux.f34680u;
                        String str2 = (String) c4036ux.f34679n;
                        com.bumptech.glide.f.r(obj);
                        dVar = dVar2;
                        str = str2;
                    }
                    InterfaceC0406f interfaceC0406f = this.i;
                    C4090vx c4090vx = new C4090vx(str, null);
                    c4036ux.f34679n = dVar;
                    c4036ux.f34680u = null;
                    c4036ux.f34683x = 2;
                    i4 = ((X.D) interfaceC0406f).i(c4090vx, c4036ux);
                    if (i4 != enumC5179a) {
                        W7.d dVar3 = dVar;
                        obj = i4;
                        aVar = dVar3;
                        ((W7.d) aVar).d(null);
                        return q7.v.f40183a;
                    }
                    return enumC5179a;
                }
            }
            InterfaceC0406f interfaceC0406f2 = this.i;
            C4090vx c4090vx2 = new C4090vx(str, null);
            c4036ux.f34679n = dVar;
            c4036ux.f34680u = null;
            c4036ux.f34683x = 2;
            i4 = ((X.D) interfaceC0406f2).i(c4090vx2, c4036ux);
            if (i4 != enumC5179a) {
            }
            return enumC5179a;
        } catch (Throwable th3) {
            W7.d dVar4 = dVar;
            th = th3;
            aVar = dVar4;
            ((W7.d) aVar).d(null);
            throw th;
        }
        c4036ux = new C4036ux(this, abstractC5219c);
        Object obj2 = c4036ux.f34681v;
        enumC5179a = EnumC5179a.f41704n;
        i = c4036ux.f34683x;
        if (i != 0) {
        }
    }
}
