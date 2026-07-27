package c;

import E2.j;
import M2.E;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: c.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527g extends j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0529i f5712k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f5713l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E f5714m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0527g(C0529i c0529i, boolean z4, E e4, C2.a aVar) {
        super(2, aVar);
        this.f5712k = c0529i;
        this.f5713l = z4;
        this.f5714m = e4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0527g) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0527g(this.f5712k, this.f5713l, this.f5714m, aVar);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [M2.m, kotlin.jvm.functions.Function0] */
    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        C0529i c0529i = this.f5712k;
        boolean z4 = this.f5713l;
        c0529i.f5586a = z4;
        ?? r4 = c0529i.f5588c;
        if (r4 != 0) {
            r4.invoke();
        }
        if (!z4) {
            E e4 = this.f5714m;
            C0526f c0526f = (C0526f) e4.f3580d;
            if (c0526f != null) {
                c0526f.f5710b.g(null, false);
            }
            e4.f3580d = null;
        }
        return Unit.f7487a;
    }
}
