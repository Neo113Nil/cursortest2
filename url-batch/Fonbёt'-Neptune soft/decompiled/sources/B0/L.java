package B0;

import Y0.InterfaceC0126u;
import android.content.Context;

/* loaded from: classes.dex */
public final class L extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f117i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f118j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ N f119k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f120l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(String str, N n2, long j2, H0.d dVar) {
        super(2, dVar);
        this.f118j = str;
        this.f119k = n2;
        this.f120l = j2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        return new L(this.f118j, this.f119k, this.f120l, dVar);
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((L) b((H0.d) obj2, (InterfaceC0126u) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f117i;
        if (i2 == 0) {
            i1.a.G(obj);
            L.d dVar = new L.d(this.f118j);
            Context context = this.f119k.f125e;
            if (context == null) {
                Q0.h.g("context");
                throw null;
            }
            B.m a2 = O.a(context);
            K k2 = new K(dVar, this.f120l, null);
            this.f117i = 1;
            if (a2.c(new L.h(k2, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
        }
        return F0.h.f469a;
    }
}
