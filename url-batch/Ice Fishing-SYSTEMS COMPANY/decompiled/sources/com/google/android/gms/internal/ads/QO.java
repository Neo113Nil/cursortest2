package com.google.android.gms.internal.ads;

import android.media.metrics.PlaybackMetrics;
import android.util.Base64;
import java.util.HashMap;
import java.util.Random;

/* loaded from: classes2.dex */
public final class QO {

    /* renamed from: h, reason: collision with root package name */
    public static final Random f27149h = new Random();

    /* renamed from: d, reason: collision with root package name */
    public UO f27153d;

    /* renamed from: f, reason: collision with root package name */
    public String f27155f;

    /* renamed from: a, reason: collision with root package name */
    public final Y7 f27150a = new Y7();

    /* renamed from: b, reason: collision with root package name */
    public final L7 f27151b = new L7();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f27152c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public AbstractC3832r8 f27154e = AbstractC3832r8.f33969a;

    /* renamed from: g, reason: collision with root package name */
    public long f27156g = -1;

    public final synchronized String a(AbstractC3832r8 abstractC3832r8, BQ bq) {
        return e(abstractC3832r8.o(bq.f24043a, this.f27151b).f26108c, bq).f26921a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r2 < r6) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(KO ko) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        long j9;
        try {
            if (this.f27153d == null) {
                throw null;
            }
            AbstractC3832r8 abstractC3832r8 = ko.f25960b;
            if (!abstractC3832r8.g()) {
                BQ bq = ko.f25962d;
                if (bq != null) {
                    long j10 = bq.f24046d;
                    if (j10 != -1) {
                        PO po = (PO) this.f27152c.get(this.f27155f);
                        if (po != null) {
                            j9 = po.f26923c;
                            if (j9 != -1) {
                            }
                        }
                        j9 = this.f27156g + 1;
                    }
                    PO po2 = (PO) this.f27152c.get(this.f27155f);
                    if (po2 != null) {
                        if (po2.f26923c == -1) {
                            if (po2.f26922b == ko.f25961c) {
                            }
                        }
                    }
                }
                int i = ko.f25961c;
                PO e6 = e(i, bq);
                if (this.f27155f == null) {
                    this.f27155f = e6.f26921a;
                }
                if (bq != null && bq.b()) {
                    Object obj = bq.f24043a;
                    long j11 = bq.f24046d;
                    int i4 = bq.f24044b;
                    PO e9 = e(i, new BQ(obj, j11, i4));
                    if (!e9.f26925e) {
                        e9.f26925e = true;
                        L7 l72 = this.f27151b;
                        abstractC3832r8.o(obj, l72);
                        l72.f26111f.a(i4).getClass();
                        Math.max(0L, AbstractC3548lu.t(0L) + AbstractC3548lu.t(0L));
                    }
                }
                if (!e6.f26925e) {
                    e6.f26925e = true;
                }
                if (e6.f26921a.equals(this.f27155f) && !e6.f26926f) {
                    e6.f26926f = true;
                    UO uo = this.f27153d;
                    String str = e6.f26921a;
                    uo.getClass();
                    BQ bq2 = ko.f25962d;
                    if (bq2 == null || !bq2.b()) {
                        uo.k();
                        uo.f27975C = str;
                        playerName = TO.o().setPlayerName("AndroidXMedia3");
                        playerVersion = playerName.setPlayerVersion("1.10.0");
                        uo.f27976D = playerVersion;
                        uo.g(ko.f25960b, bq2);
                    }
                }
            }
        } finally {
        }
    }

    public final void c(KO ko) {
        BQ bq;
        boolean g9 = ko.f25960b.g();
        HashMap hashMap = this.f27152c;
        if (g9) {
            String str = this.f27155f;
            if (str != null) {
                PO po = (PO) hashMap.get(str);
                po.getClass();
                d(po);
                return;
            }
            return;
        }
        PO po2 = (PO) hashMap.get(this.f27155f);
        int i = ko.f25961c;
        BQ bq2 = ko.f25962d;
        this.f27155f = e(i, bq2).f26921a;
        b(ko);
        if (bq2 == null || !bq2.b()) {
            return;
        }
        long j9 = bq2.f24046d;
        if (po2 != null && po2.f26923c == j9 && (bq = po2.f26924d) != null) {
            if (bq.f24044b == bq2.f24044b) {
                if (bq.f24045c == bq2.f24045c) {
                    return;
                }
            }
        }
        e(i, new BQ(j9, bq2.f24043a));
    }

    public final void d(PO po) {
        long j9 = po.f26923c;
        if (j9 != -1 && po.f26925e) {
            this.f27156g = j9;
        }
        this.f27155f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r13 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PO e(int i, BQ bq) {
        long j9;
        long j10;
        long j11;
        HashMap hashMap = this.f27152c;
        long j12 = Long.MAX_VALUE;
        PO po = null;
        for (PO po2 : hashMap.values()) {
            if (po2.f26923c == -1 && i == po2.f26922b && bq != null) {
                QO qo = po2.f26927g;
                PO po3 = (PO) qo.f27152c.get(qo.f27155f);
                if (po3 != null) {
                    j11 = po3.f26923c;
                }
                j11 = 1 + qo.f27156g;
                long j13 = bq.f24046d;
                if (j13 >= j11) {
                    po2.f26923c = j13;
                }
            }
            BQ bq2 = po2.f26924d;
            if (bq != null) {
                long j14 = bq.f24046d;
                if (j14 != -1) {
                    if (bq2 != null) {
                        j9 = -1;
                        if (j14 == bq2.f24046d && bq.f24044b == bq2.f24044b && bq.f24045c == bq2.f24045c) {
                            j10 = po2.f26923c;
                            if (j10 == j9) {
                            }
                            po = po2;
                            j12 = j10;
                        }
                    } else if (!bq.b()) {
                        j9 = -1;
                        if (j14 == po2.f26923c) {
                            j10 = po2.f26923c;
                            if (j10 == j9 || j10 < j12) {
                                po = po2;
                                j12 = j10;
                            } else if (j10 == j12) {
                                String str = AbstractC3548lu.f32613a;
                                if (po.f26924d != null && bq2 != null) {
                                    po = po2;
                                }
                            }
                        }
                    }
                }
            }
            j9 = -1;
            if (i == po2.f26922b) {
                j10 = po2.f26923c;
                if (j10 == j9) {
                }
                po = po2;
                j12 = j10;
            }
        }
        if (po != null) {
            return po;
        }
        byte[] bArr = new byte[12];
        f27149h.nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 10);
        PO po4 = new PO(this, encodeToString, i, bq);
        hashMap.put(encodeToString, po4);
        return po4;
    }
}
