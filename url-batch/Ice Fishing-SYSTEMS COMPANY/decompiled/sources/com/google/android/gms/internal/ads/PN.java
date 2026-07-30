package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class PN implements InterfaceC3525lO {

    /* renamed from: p, reason: collision with root package name */
    public static final C3675oC f26906p;

    /* renamed from: a, reason: collision with root package name */
    public final Y7 f26907a;

    /* renamed from: b, reason: collision with root package name */
    public final L7 f26908b;

    /* renamed from: c, reason: collision with root package name */
    public final C4201y f26909c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26910d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26911e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26912f;

    /* renamed from: g, reason: collision with root package name */
    public final long f26913g;

    /* renamed from: h, reason: collision with root package name */
    public final long f26914h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f26915j;

    /* renamed from: k, reason: collision with root package name */
    public final long f26916k;

    /* renamed from: l, reason: collision with root package name */
    public final long f26917l;

    /* renamed from: m, reason: collision with root package name */
    public final C3944tC f26918m;

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f26919n;

    /* renamed from: o, reason: collision with root package name */
    public long f26920o;

    static {
        SB sb = UB.f27942u;
        Object[] objArr = {"file", "content", "data", "android.resource", com.anythink.basead.exoplayer.j.y.f8426a, "asset"};
        PA.o(objArr, 6);
        f26906p = UB.p(objArr, 6);
    }

    public PN() {
        C4201y c4201y = new C4201y();
        C3944tC c3944tC = C3944tC.f34377z;
        l(1000, 0, "bufferForPlaybackMs", "0");
        l(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        l(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        l(com.anythink.basead.exoplayer.d.f6920b, 1000, "minBufferMs", "bufferForPlaybackMs");
        l(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        l(com.anythink.basead.exoplayer.d.f6920b, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        l(com.anythink.basead.exoplayer.d.f6920b, com.anythink.basead.exoplayer.d.f6920b, "maxBufferMs", "minBufferMs");
        l(com.anythink.basead.exoplayer.d.f6920b, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        l(0, 0, "backBufferDurationMs", "0");
        this.f26907a = new Y7();
        this.f26908b = new L7();
        this.f26909c = c4201y;
        long u7 = AbstractC3548lu.u(50000L);
        this.f26910d = u7;
        long u9 = AbstractC3548lu.u(1000L);
        this.f26911e = u9;
        this.f26912f = u7;
        this.f26913g = u7;
        this.f26914h = u9;
        this.i = u9;
        this.f26915j = AbstractC3548lu.u(com.anythink.basead.exoplayer.i.a.f8040f);
        this.f26916k = u9;
        this.f26917l = AbstractC3548lu.u(0L);
        this.f26919n = new ConcurrentHashMap();
        this.f26918m = C3944tC.a(c3944tC);
        this.f26920o = -1L;
    }

    public static void l(int i, int i4, String str, String str2) {
        if (!(i >= i4)) {
            throw new IllegalArgumentException(AbstractC3194fG.u("%s cannot be less than %s", str, str2));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final void a(VO vo) {
        ConcurrentHashMap concurrentHashMap = this.f26919n;
        ON on = (ON) concurrentHashMap.get(vo);
        if (on != null) {
            int i = on.f26687a - 1;
            on.f26687a = i;
            if (i == 0) {
                concurrentHashMap.remove(vo);
                j();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.f26920o = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final void b(VO vo) {
        ConcurrentHashMap concurrentHashMap = this.f26919n;
        ON on = (ON) concurrentHashMap.get(vo);
        if (on != null) {
            int i = on.f26687a - 1;
            on.f26687a = i;
            if (i == 0) {
                concurrentHashMap.remove(vo);
                j();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final void c(C3417jO c3417jO, InterfaceC3716p[] interfaceC3716pArr) {
        ConcurrentHashMap concurrentHashMap = this.f26919n;
        VO vo = c3417jO.f32106a;
        Integer num = (Integer) this.f26918m.get(vo.f28245a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        ON on = (ON) concurrentHashMap.get(vo);
        on.getClass();
        if (intValue == -1) {
            boolean k6 = k(c3417jO);
            int length = interfaceC3716pArr.length;
            int i = 0;
            int i4 = 0;
            while (true) {
                int i9 = com.anythink.basead.exoplayer.b.aY;
                if (i >= length) {
                    break;
                }
                InterfaceC3716p interfaceC3716p = interfaceC3716pArr[i];
                if (interfaceC3716p != null) {
                    int i10 = interfaceC3716p.a().f23999c;
                    if (i10 != -1) {
                        if (i10 == 0) {
                            i9 = 144310272;
                        } else if (i10 != 1) {
                            i9 = i10 != 2 ? i10 != 4 ? 131072 : 26214400 : k6 ? 19660800 : 131072000;
                        }
                    }
                    i4 += i9;
                }
                i++;
            }
            String str = AbstractC3548lu.f32613a;
            intValue = Math.max(com.anythink.basead.exoplayer.b.aY, Math.min(i4, 210239488));
        }
        on.f26689c = intValue;
        j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final InterfaceC3985u d(VO vo) {
        return new C3602mu(this, vo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final boolean e(C3417jO c3417jO) {
        long j9;
        boolean z8;
        int i;
        boolean z9 = c3417jO.f32111f;
        boolean k6 = k(c3417jO);
        long j10 = c3417jO.f32109d;
        float f6 = c3417jO.f32110e;
        String str = AbstractC3548lu.f32613a;
        if (f6 != 1.0f) {
            j10 = Math.round(j10 / f6);
        }
        if (z9) {
            if (k6) {
                j9 = this.f26916k;
                z8 = true;
            } else {
                j9 = this.f26915j;
                z8 = false;
            }
        } else if (k6) {
            j9 = this.i;
            z8 = true;
        } else {
            j9 = this.f26914h;
            z8 = false;
        }
        long j11 = c3417jO.f32112g;
        if (j11 != com.anythink.basead.exoplayer.b.f6539b) {
            j9 = Math.min(j11 / 2, j9);
        }
        if (j9 > 0 && j10 < j9) {
            if (!z8) {
                VO vo = c3417jO.f32106a;
                ON on = (ON) this.f26919n.get(vo);
                on.getClass();
                synchronized (on) {
                    i = on.f26690d;
                }
                int i4 = i * com.anythink.basead.exoplayer.b.aX;
                ON on2 = (ON) this.f26919n.get(vo);
                on2.getClass();
                if (i4 >= on2.f26689c) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final long f() {
        return this.f26917l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final boolean g(C3417jO c3417jO) {
        int i;
        boolean z8;
        boolean z9;
        int i4;
        ConcurrentHashMap concurrentHashMap = this.f26919n;
        VO vo = c3417jO.f32106a;
        ON on = (ON) concurrentHashMap.get(vo);
        on.getClass();
        ON on2 = (ON) this.f26919n.get(vo);
        on2.getClass();
        synchronized (on2) {
            i = on2.f26690d;
        }
        int i9 = i * com.anythink.basead.exoplayer.b.aX;
        ON on3 = (ON) this.f26919n.get(vo);
        on3.getClass();
        int i10 = on3.f26689c;
        if (vo.equals(VO.f28244c)) {
            return i9 < i10;
        }
        boolean k6 = k(c3417jO);
        long j9 = k6 ? this.f26911e : this.f26910d;
        long j10 = k6 ? this.f26913g : this.f26912f;
        float f6 = c3417jO.f32110e;
        if (f6 > 1.0f) {
            j9 = Math.min(AbstractC3548lu.y(j9, f6), j10);
        }
        long j11 = c3417jO.f32109d;
        if (j11 < Math.max(j9, 500000L)) {
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            if (runtime.totalMemory() >= maxMemory) {
                long freeMemory = runtime.freeMemory();
                C4201y c4201y = this.f26909c;
                synchronized (c4201y) {
                    i4 = c4201y.f35294v * com.anythink.basead.exoplayer.b.aX;
                }
                if (freeMemory + i4 < maxMemory / 25) {
                    z8 = false;
                    z9 = k6 ? i9 < i10 : !(!z8 && i9 >= i10);
                    on.f26688b = z9;
                    if (!z9 && k6 && !z8) {
                        AbstractC3217fl.y("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
                    }
                    if (!on.f26688b && j11 < 500000) {
                        AbstractC3217fl.I("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    }
                }
            }
            z8 = true;
            if (k6) {
            }
            on.f26688b = z9;
            if (!z9) {
                AbstractC3217fl.y("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!on.f26688b) {
                AbstractC3217fl.I("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j10 || i9 >= i10) {
            on.f26688b = false;
        }
        return on.f26688b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final boolean h() {
        Iterator it = this.f26919n.values().iterator();
        while (it.hasNext()) {
            if (((ON) it.next()).f26688b) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3525lO
    public final void i(VO vo) {
        long id = Thread.currentThread().getId();
        long j9 = this.f26920o;
        PA.U("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j9 == -1 || j9 == id);
        this.f26920o = id;
        ConcurrentHashMap concurrentHashMap = this.f26919n;
        ON on = (ON) concurrentHashMap.get(vo);
        if (on == null) {
            ON on2 = new ON();
            on2.f26687a = 1;
            concurrentHashMap.put(vo, on2);
        } else {
            on.f26687a++;
        }
        ON on3 = (ON) concurrentHashMap.get(vo);
        on3.getClass();
        Integer num = (Integer) this.f26918m.get(vo.f28245a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (intValue == -1) {
            intValue = com.anythink.basead.exoplayer.b.aY;
        }
        on3.f26689c = intValue;
        on3.f26688b = false;
    }

    public final void j() {
        ConcurrentHashMap concurrentHashMap = this.f26919n;
        boolean isEmpty = concurrentHashMap.isEmpty();
        C4201y c4201y = this.f26909c;
        int i = 0;
        if (isEmpty) {
            synchronized (c4201y) {
                c4201y.C(0);
            }
        } else {
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                i += ((ON) it.next()).f26689c;
            }
            c4201y.C(i);
        }
    }

    public final boolean k(C3417jO c3417jO) {
        Object obj = c3417jO.f32108c.f24043a;
        L7 l72 = this.f26908b;
        AbstractC3832r8 abstractC3832r8 = c3417jO.f32107b;
        N0 n02 = abstractC3832r8.b(abstractC3832r8.o(obj, l72).f26108c, this.f26907a, 0L).f28795b.f30939b;
        if (n02 == null) {
            return false;
        }
        String scheme = n02.f26409a.getScheme();
        return TextUtils.isEmpty(scheme) || f26906p.contains(scheme);
    }
}
