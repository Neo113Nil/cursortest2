package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.hj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3323hj implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31249a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f31250b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f31251c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f31252d;

    public /* synthetic */ C3323hj(C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, int i) {
        this.f31249a = i;
        this.f31250b = c4009uN;
        this.f31251c = c4009uN2;
        this.f31252d = c4009uN3;
    }

    public C2863Xk a() {
        return new C2863Xk((ScheduledExecutorService) this.f31250b.d(), (S2.a) this.f31251c.d(), (C3165eo) this.f31252d.d());
    }

    public Qr b() {
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new Qr(c3157eg, this.f31250b.d(), this.f31251c.d(), this.f31252d.d(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f31249a) {
            case 0:
                return a();
            case 1:
                return new C3602mu((C3494ku) this.f31250b.d(), (C2764Rn) this.f31251c.d(), (C3165eo) this.f31252d.d(), 14);
            case 2:
                return b();
            case 3:
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                C3923ss c3923ss = new C3923ss(c3157eg, 2);
                C3869rs c3869rs = (C3869rs) this.f31250b.d();
                List list = (List) this.f31251c.d();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f31252d.d();
                if (list.contains("24")) {
                    return new Sr(c3869rs, ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Fd)).intValue(), scheduledExecutorService);
                }
                return new Sr(c3923ss, ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Fd)).intValue(), scheduledExecutorService);
            case 4:
                return new St((Pt) this.f31250b.d(), (Jt) this.f31251c.d(), (C3008bu) this.f31252d.d());
            case 5:
                return new Kz((File) this.f31250b.d(), (Cw) this.f31251c.d(), (C4158xA) this.f31252d.d());
            case 6:
                File file = (File) this.f31250b.d();
                Ay ay = (Ay) this.f31251c.d();
                final C4158xA c4158xA = (C4158xA) this.f31252d.d();
                My G7 = My.G();
                final int i = 0;
                XA xa = new XA() { // from class: com.google.android.gms.internal.ads.fA
                    @Override // com.google.android.gms.internal.ads.XA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i) {
                            case 0:
                                c4158xA.d(15308, th);
                                return My.G();
                            case 1:
                                c4158xA.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4158xA.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4158xA.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4158xA.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4158xA.d(15308, th);
                                return My.G();
                            case 6:
                                c4158xA.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4158xA.d(20309, th);
                                return new byte[0];
                            default:
                                c4158xA.d(20308, th);
                                return My.G();
                        }
                    }
                };
                ay.getClass();
                return new C4307zy(file, ay.f23934a, new C4086vt(4, G7), xa);
            case 7:
                File file2 = (File) this.f31250b.d();
                Ay ay2 = (Ay) this.f31251c.d();
                final C4158xA c4158xA2 = (C4158xA) this.f31252d.d();
                final int i4 = 2;
                return ay2.a(file2, new byte[0], new XA() { // from class: com.google.android.gms.internal.ads.fA
                    @Override // com.google.android.gms.internal.ads.XA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i4) {
                            case 0:
                                c4158xA2.d(15308, th);
                                return My.G();
                            case 1:
                                c4158xA2.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4158xA2.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4158xA2.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4158xA2.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4158xA2.d(15308, th);
                                return My.G();
                            case 6:
                                c4158xA2.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4158xA2.d(20309, th);
                                return new byte[0];
                            default:
                                c4158xA2.d(20308, th);
                                return My.G();
                        }
                    }
                });
            case 8:
                File file3 = (File) this.f31250b.d();
                Ay ay3 = (Ay) this.f31251c.d();
                final C4158xA c4158xA3 = (C4158xA) this.f31252d.d();
                final int i9 = 4;
                return ay3.a(file3, new byte[0], new XA() { // from class: com.google.android.gms.internal.ads.fA
                    @Override // com.google.android.gms.internal.ads.XA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i9) {
                            case 0:
                                c4158xA3.d(15308, th);
                                return My.G();
                            case 1:
                                c4158xA3.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4158xA3.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4158xA3.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4158xA3.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4158xA3.d(15308, th);
                                return My.G();
                            case 6:
                                c4158xA3.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4158xA3.d(20309, th);
                                return new byte[0];
                            default:
                                c4158xA3.d(20308, th);
                                return My.G();
                        }
                    }
                });
            case 9:
                File file4 = (File) this.f31250b.d();
                Ay ay4 = (Ay) this.f31251c.d();
                final C4158xA c4158xA4 = (C4158xA) this.f31252d.d();
                My G8 = My.G();
                final int i10 = 5;
                XA xa2 = new XA() { // from class: com.google.android.gms.internal.ads.fA
                    @Override // com.google.android.gms.internal.ads.XA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i10) {
                            case 0:
                                c4158xA4.d(15308, th);
                                return My.G();
                            case 1:
                                c4158xA4.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4158xA4.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4158xA4.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4158xA4.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4158xA4.d(15308, th);
                                return My.G();
                            case 6:
                                c4158xA4.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4158xA4.d(20309, th);
                                return new byte[0];
                            default:
                                c4158xA4.d(20308, th);
                                return My.G();
                        }
                    }
                };
                ay4.getClass();
                return new C4307zy(file4, ay4.f23934a, new C4086vt(4, G8), xa2);
            case 10:
                File file5 = (File) this.f31250b.d();
                Ay ay5 = (Ay) this.f31251c.d();
                final C4158xA c4158xA5 = (C4158xA) this.f31252d.d();
                final int i11 = 1;
                return ay5.a(file5, new byte[0], new XA() { // from class: com.google.android.gms.internal.ads.fA
                    @Override // com.google.android.gms.internal.ads.XA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i11) {
                            case 0:
                                c4158xA5.d(15308, th);
                                return My.G();
                            case 1:
                                c4158xA5.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4158xA5.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4158xA5.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4158xA5.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4158xA5.d(15308, th);
                                return My.G();
                            case 6:
                                c4158xA5.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4158xA5.d(20309, th);
                                return new byte[0];
                            default:
                                c4158xA5.d(20308, th);
                                return My.G();
                        }
                    }
                });
            case 11:
                File file6 = (File) this.f31250b.d();
                Ay ay6 = (Ay) this.f31251c.d();
                final C4158xA c4158xA6 = (C4158xA) this.f31252d.d();
                final int i12 = 3;
                return ay6.a(file6, new byte[0], new XA() { // from class: com.google.android.gms.internal.ads.fA
                    @Override // com.google.android.gms.internal.ads.XA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i12) {
                            case 0:
                                c4158xA6.d(15308, th);
                                return My.G();
                            case 1:
                                c4158xA6.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4158xA6.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4158xA6.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4158xA6.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4158xA6.d(15308, th);
                                return My.G();
                            case 6:
                                c4158xA6.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4158xA6.d(20309, th);
                                return new byte[0];
                            default:
                                c4158xA6.d(20308, th);
                                return My.G();
                        }
                    }
                });
            case 12:
                File file7 = (File) this.f31250b.d();
                Ay ay7 = (Ay) this.f31251c.d();
                final C4158xA c4158xA7 = (C4158xA) this.f31252d.d();
                My G9 = My.G();
                final int i13 = 8;
                XA xa3 = new XA() { // from class: com.google.android.gms.internal.ads.fA
                    @Override // com.google.android.gms.internal.ads.XA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i13) {
                            case 0:
                                c4158xA7.d(15308, th);
                                return My.G();
                            case 1:
                                c4158xA7.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4158xA7.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4158xA7.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4158xA7.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4158xA7.d(15308, th);
                                return My.G();
                            case 6:
                                c4158xA7.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4158xA7.d(20309, th);
                                return new byte[0];
                            default:
                                c4158xA7.d(20308, th);
                                return My.G();
                        }
                    }
                };
                ay7.getClass();
                return new C4307zy(file7, ay7.f23934a, new C4086vt(4, G9), xa3);
            case 13:
                File file8 = (File) this.f31250b.d();
                Ay ay8 = (Ay) this.f31251c.d();
                final C4158xA c4158xA8 = (C4158xA) this.f31252d.d();
                final int i14 = 6;
                return ay8.a(file8, new byte[0], new XA() { // from class: com.google.android.gms.internal.ads.fA
                    @Override // com.google.android.gms.internal.ads.XA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i14) {
                            case 0:
                                c4158xA8.d(15308, th);
                                return My.G();
                            case 1:
                                c4158xA8.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4158xA8.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4158xA8.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4158xA8.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4158xA8.d(15308, th);
                                return My.G();
                            case 6:
                                c4158xA8.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4158xA8.d(20309, th);
                                return new byte[0];
                            default:
                                c4158xA8.d(20308, th);
                                return My.G();
                        }
                    }
                });
            default:
                File file9 = (File) this.f31250b.d();
                Ay ay9 = (Ay) this.f31251c.d();
                final C4158xA c4158xA9 = (C4158xA) this.f31252d.d();
                final int i15 = 7;
                return ay9.a(file9, new byte[0], new XA() { // from class: com.google.android.gms.internal.ads.fA
                    @Override // com.google.android.gms.internal.ads.XA
                    public final /* synthetic */ Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        switch (i15) {
                            case 0:
                                c4158xA9.d(15308, th);
                                return My.G();
                            case 1:
                                c4158xA9.d(15310, th);
                                return new byte[0];
                            case 2:
                                c4158xA9.d(15310, th);
                                return new byte[0];
                            case 3:
                                c4158xA9.d(15309, th);
                                return new byte[0];
                            case 4:
                                c4158xA9.d(15309, th);
                                return new byte[0];
                            case 5:
                                c4158xA9.d(15308, th);
                                return My.G();
                            case 6:
                                c4158xA9.d(20310, th);
                                return new byte[0];
                            case 7:
                                c4158xA9.d(20309, th);
                                return new byte[0];
                            default:
                                c4158xA9.d(20308, th);
                                return My.G();
                        }
                    }
                });
        }
    }
}
