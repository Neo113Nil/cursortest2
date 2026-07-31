package B;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;

/* renamed from: B.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0013n f380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f381f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N0.h f382g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f383h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f384i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ U.q f385j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f386k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0004e(InterfaceC0013n interfaceC0013n, boolean z3, N0.h hVar, boolean z4, long j3, U.q qVar, int i3) {
        super(2);
        this.f380e = interfaceC0013n;
        this.f381f = z3;
        this.f382g = hVar;
        this.f383h = z4;
        this.f384i = j3;
        this.f385j = qVar;
        this.f386k = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0143d.U(this.f386k | 1);
        N0.h hVar = this.f382g;
        boolean z3 = this.f383h;
        AbstractC0508a.h(this.f380e, this.f381f, hVar, z3, this.f384i, this.f385j, (C0167p) obj, U3);
        return R1.y.f4171a;
    }
}
