package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class wq0 implements InterfaceC2004im {

    /* renamed from: a, reason: collision with root package name */
    private final long f34161a;

    /* renamed from: b, reason: collision with root package name */
    private final TreeSet<om> f34162b = new TreeSet<>(new Comparator() { // from class: com.yandex.mobile.ads.impl.Lk
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int a4;
            a4 = wq0.a((om) obj, (om) obj2);
            return a4;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    private long f34163c;

    public wq0(long j4) {
        this.f34161a = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(om omVar, om omVar2) {
        long j4 = omVar.f30094g;
        long j5 = omVar2.f30094g;
        if (j4 - j5 != 0) {
            return j4 < j5 ? -1 : 1;
        }
        if (!omVar.f30089b.equals(omVar2.f30089b)) {
            return omVar.f30089b.compareTo(omVar2.f30089b);
        }
        long j6 = omVar.f30090c - omVar2.f30090c;
        if (j6 == 0) {
            return 0;
        }
        return j6 < 0 ? -1 : 1;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1837bm.b
    public final void a(InterfaceC1837bm interfaceC1837bm, om omVar) {
        this.f34162b.add(omVar);
        this.f34163c += omVar.f30091d;
        while (this.f34163c > this.f34161a && !this.f34162b.isEmpty()) {
            interfaceC1837bm.a(this.f34162b.first());
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1837bm.b
    public final void a(om omVar) {
        this.f34162b.remove(omVar);
        this.f34163c -= omVar.f30091d;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1837bm.b
    public final void a(InterfaceC1837bm interfaceC1837bm, om omVar, om omVar2) {
        a(omVar);
        a(interfaceC1837bm, omVar2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2004im
    public final void a(InterfaceC1837bm interfaceC1837bm, long j4) {
        if (j4 != -1) {
            while (this.f34163c + j4 > this.f34161a && !this.f34162b.isEmpty()) {
                interfaceC1837bm.a(this.f34162b.first());
            }
        }
    }
}
