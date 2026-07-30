package P;

import kotlin.Unit;
import r6.C0853a;

/* renamed from: P.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160z implements q6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2182e;

    public /* synthetic */ C0160z(int i2, Object obj) {
        this.f2181d = i2;
        this.f2182e = obj;
    }

    @Override // q6.e
    public final Object a(Object obj, V5.b bVar) {
        switch (this.f2181d) {
            case 0:
                Q q4 = (Q) this.f2182e;
                if (q4.f2024p.k() instanceof c0) {
                    return Unit.f6114a;
                }
                Object e7 = Q.e(q4, true, bVar);
                return e7 == W5.a.f2787d ? e7 : Unit.f6114a;
            case 1:
                ((kotlin.jvm.internal.D) this.f2182e).f6152d = obj;
                throw new C0853a(this);
            default:
                ((H.a) this.f2182e).accept(obj);
                return Unit.f6114a;
        }
    }
}
