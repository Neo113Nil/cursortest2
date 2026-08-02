package B0;

import Y0.InterfaceC0126u;
import android.content.Context;
import java.util.List;

/* renamed from: B0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034l extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f161i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ N f162j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f163k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0034l(N n2, List list, H0.d dVar) {
        super(2, dVar);
        this.f162j = n2;
        this.f163k = list;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        return new C0034l(this.f162j, this.f163k, dVar);
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((C0034l) b((H0.d) obj2, (InterfaceC0126u) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f161i;
        if (i2 == 0) {
            i1.a.G(obj);
            Context context = this.f162j.f125e;
            if (context == null) {
                Q0.h.g("context");
                throw null;
            }
            B.m a2 = O.a(context);
            C0033k c0033k = new C0033k(this.f163k, null);
            this.f161i = 1;
            obj = a2.c(new L.h(c0033k, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
        }
        return obj;
    }
}
