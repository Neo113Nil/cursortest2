package g3;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x extends j6.i implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4218g = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f4219h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0 f4220i;

    /* renamed from: j, reason: collision with root package name */
    public Object f4221j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f4222k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Serializable f4223l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(a0 a0Var, h6.i iVar, q6.e eVar, h6.d dVar) {
        super(1, dVar);
        this.f4220i = a0Var;
        this.f4222k = iVar;
        this.f4223l = (j6.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [j6.i, q6.e] */
    @Override // j6.a
    public final h6.d create(h6.d dVar) {
        switch (this.f4218g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new x((r6.v) this.f4222k, this.f4220i, (r6.t) this.f4223l, dVar);
            default:
                return new x(this.f4220i, (h6.i) this.f4222k, (q6.e) this.f4223l, dVar);
        }
    }

    @Override // q6.c
    public final Object f(Object obj) {
        h6.d dVar = (h6.d) obj;
        switch (this.f4218g) {
        }
        return ((x) create(dVar)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Type inference failed for: r7v3, types: [j6.i, q6.e] */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r6.v vVar;
        r6.t tVar;
        c cVar;
        Object obj2;
        switch (this.f4218g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r6.t tVar2 = (r6.t) this.f4223l;
                r6.v vVar2 = (r6.v) this.f4222k;
                int i7 = this.f4219h;
                a0 a0Var = this.f4220i;
                i6.a aVar = i6.a.f4956f;
                try {
                } catch (b unused) {
                    Object obj3 = vVar2.f7968f;
                    this.f4221j = tVar2;
                    this.f4219h = 3;
                    obj = a0Var.h(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (i7 == 0) {
                    d6.a.e(obj);
                    this.f4221j = vVar2;
                    this.f4219h = 1;
                    obj = a0Var.g(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    vVar = vVar2;
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            tVar = (r6.t) ((Serializable) this.f4221j);
                            d6.a.e(obj);
                            tVar.f7966f = ((Number) obj).intValue();
                            return d6.z.f2639a;
                        }
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tVar2 = (r6.t) ((Serializable) this.f4221j);
                        d6.a.e(obj);
                        tVar2.f7966f = ((Number) obj).intValue();
                        return d6.z.f2639a;
                    }
                    vVar = (r6.v) ((Serializable) this.f4221j);
                    d6.a.e(obj);
                }
                vVar.f7968f = obj;
                h0 e9 = a0Var.e();
                this.f4221j = tVar2;
                this.f4219h = 2;
                obj = e9.a();
                if (obj == aVar) {
                    return aVar;
                }
                tVar = tVar2;
                tVar.f7966f = ((Number) obj).intValue();
                return d6.z.f2639a;
            default:
                int i8 = this.f4219h;
                a0 a0Var2 = this.f4220i;
                i6.a aVar2 = i6.a.f4956f;
                if (i8 == 0) {
                    d6.a.e(obj);
                    this.f4219h = 1;
                    obj = a0.c(a0Var2, true, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f4221j;
                            d6.a.e(obj);
                            return obj4;
                        }
                        cVar = (c) this.f4221j;
                        d6.a.e(obj);
                        obj2 = cVar.f4101b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == cVar.f4102c) {
                            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!r6.k.a(cVar.f4101b, obj)) {
                            this.f4221j = obj;
                            this.f4219h = 3;
                            if (a0Var2.h(obj, true, this) == aVar2) {
                                return aVar2;
                            }
                        }
                        return obj;
                    }
                    d6.a.e(obj);
                }
                cVar = (c) obj;
                h6.i iVar = (h6.i) this.f4222k;
                a0.e0 e0Var = new a0.e0((q6.e) this.f4223l, cVar, (h6.d) null);
                this.f4221j = cVar;
                this.f4219h = 2;
                obj = c7.a0.x(iVar, e0Var, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = cVar.f4101b;
                if ((obj2 == null ? obj2.hashCode() : 0) == cVar.f4102c) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(r6.v vVar, a0 a0Var, r6.t tVar, h6.d dVar) {
        super(1, dVar);
        this.f4222k = vVar;
        this.f4220i = a0Var;
        this.f4223l = tVar;
    }
}
