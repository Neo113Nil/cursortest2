package h1;

import e2.InterfaceC0426e;

/* renamed from: h1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0479C extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public Object f6055h;

    /* renamed from: i, reason: collision with root package name */
    public int f6056i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ boolean f6057j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ M f6058k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6059l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0479C(M m3, int i3, V1.d dVar) {
        super(2, dVar);
        this.f6058k = m3;
        this.f6059l = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C0479C) o((V1.d) obj2, bool)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0479C c0479c = new C0479C(this.f6058k, this.f6059l, dVar);
        c0479c.f6057j = ((Boolean) obj).booleanValue();
        return c0479c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        boolean z3;
        Object obj2;
        int i3;
        W1.a aVar = W1.a.f4608d;
        int i4 = this.f6056i;
        M m3 = this.f6058k;
        if (i4 == 0) {
            R1.a.e(obj);
            z3 = this.f6057j;
            this.f6057j = z3;
            this.f6056i = 1;
            obj = m3.h(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f6055h;
                R1.a.e(obj);
                i3 = ((Number) obj).intValue();
                return new C0485c(obj2 != null ? obj2.hashCode() : 0, i3, obj2);
            }
            z3 = this.f6057j;
            R1.a.e(obj);
        }
        if (!z3) {
            obj2 = obj;
            i3 = this.f6059l;
            return new C0485c(obj2 != null ? obj2.hashCode() : 0, i3, obj2);
        }
        W f3 = m3.f();
        this.f6055h = obj;
        this.f6056i = 2;
        Integer a3 = f3.a();
        if (a3 == aVar) {
            return aVar;
        }
        obj2 = obj;
        obj = a3;
        i3 = ((Number) obj).intValue();
        return new C0485c(obj2 != null ? obj2.hashCode() : 0, i3, obj2);
    }
}
