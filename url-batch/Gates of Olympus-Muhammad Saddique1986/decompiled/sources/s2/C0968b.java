package s2;

import R1.y;
import e2.InterfaceC0424c;
import e2.InterfaceC0427f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0968b implements InterfaceC0427f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8365f;

    public /* synthetic */ C0968b(Object obj, int i3, Object obj2) {
        this.f8363d = i3;
        this.f8364e = obj;
        this.f8365f = obj2;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f8363d) {
            case 0:
                v2.a.a((InterfaceC0424c) this.f8364e, this.f8365f, (V1.i) obj3);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y2.c.f10399g;
                y2.b bVar = (y2.b) this.f8365f;
                Object obj4 = bVar.f10397e;
                y2.c cVar = (y2.c) this.f8364e;
                atomicReferenceFieldUpdater.set(cVar, obj4);
                cVar.e(bVar.f10397e);
                break;
        }
        return y.f4171a;
    }
}
