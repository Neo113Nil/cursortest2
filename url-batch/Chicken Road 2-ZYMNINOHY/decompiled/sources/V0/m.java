package V0;

import W.InterfaceC0113f;
import W.InterfaceC0118k;
import W.u;
import a.AbstractC0124a;
import b0.C0255a;
import java.util.HashMap;
import q0.C1353B;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements InterfaceC0113f, InterfaceC0118k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f3211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3212c;

    public /* synthetic */ m(n nVar, long j4, int i4) {
        this.f3212c = nVar;
        this.f3211b = j4;
        this.f3210a = i4;
    }

    @Override // W.InterfaceC0113f
    public void accept(Object obj) {
        n nVar = (n) this.f3212c;
        a aVar = (a) obj;
        nVar.f3220h.getClass();
        byte[] m4 = a2.i.m(aVar.f3184c, aVar.f3182a);
        u uVar = nVar.f3215c;
        uVar.getClass();
        uVar.K(m4.length, m4);
        nVar.f3213a.a(m4.length, uVar);
        long j4 = aVar.f3183b;
        long j5 = this.f3211b;
        if (j4 == -9223372036854775807L) {
            AbstractC0124a.t(nVar.f3220h.f2872s == Long.MAX_VALUE);
        } else {
            long j6 = nVar.f3220h.f2872s;
            j5 = j6 == Long.MAX_VALUE ? j5 + j4 : j4 + j6;
        }
        nVar.f3213a.e(j5, this.f3210a | 1, m4.length, 0, null);
    }

    @Override // W.InterfaceC0118k
    public void invoke(Object obj) {
        C0255a c0255a = (C0255a) this.f3212c;
        b0.h hVar = (b0.h) obj;
        HashMap hashMap = hVar.f5303h;
        HashMap hashMap2 = hVar.f5304i;
        C1353B c1353b = c0255a.f5260d;
        if (c1353b != null) {
            String c4 = hVar.f5298c.c(c0255a.f5258b, c1353b);
            Long l4 = (Long) hashMap2.get(c4);
            Long l5 = (Long) hashMap.get(c4);
            hashMap2.put(c4, Long.valueOf((l4 == null ? 0L : l4.longValue()) + this.f3211b));
            hashMap.put(c4, Long.valueOf((l5 != null ? l5.longValue() : 0L) + this.f3210a));
        }
    }

    public /* synthetic */ m(C0255a c0255a, int i4, long j4, long j5) {
        this.f3212c = c0255a;
        this.f3210a = i4;
        this.f3211b = j4;
    }
}
