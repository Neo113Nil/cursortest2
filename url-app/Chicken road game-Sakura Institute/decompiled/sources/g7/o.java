package g7;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public int f4508g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f7.f[] f4509h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4510i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f4511j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e7.e f4512k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f7.f[] fVarArr, int i7, AtomicInteger atomicInteger, e7.e eVar, h6.d dVar) {
        super(2, dVar);
        this.f4509h = fVarArr;
        this.f4510i = i7;
        this.f4511j = atomicInteger;
        this.f4512k = eVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        return new o(this.f4509h, this.f4510i, this.f4511j, this.f4512k, dVar);
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((o) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f4508g;
        AtomicInteger atomicInteger = this.f4511j;
        e7.e eVar = this.f4512k;
        try {
            if (i7 == 0) {
                d6.a.e(obj);
                f7.f[] fVarArr = this.f4509h;
                int i8 = this.f4510i;
                f7.f fVar = fVarArr[i8];
                n nVar = new n(eVar, i8);
                this.f4508g = 1;
                Object b9 = fVar.b(nVar, this);
                i6.a aVar = i6.a.f4956f;
                if (b9 == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d6.a.e(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                r4.a.q(eVar);
            }
            return d6.z.f2639a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                r4.a.q(eVar);
            }
        }
    }
}
