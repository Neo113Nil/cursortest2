package P;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;

/* loaded from: classes.dex */
public final class K extends X5.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public Object f1993d;

    /* renamed from: e, reason: collision with root package name */
    public int f1994e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Q f1995i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f1996l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X5.j f1997m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(Q q4, CoroutineContext coroutineContext, Function2 function2, V5.b bVar) {
        super(1, bVar);
        this.f1995i = q4;
        this.f1996l = coroutineContext;
        this.f1997m = (X5.j) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X5.j, kotlin.jvm.functions.Function2] */
    @Override // X5.a
    public final V5.b create(V5.b bVar) {
        return new K(this.f1995i, this.f1996l, this.f1997m, bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((K) create((V5.b) obj)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [X5.j, kotlin.jvm.functions.Function2] */
    @Override // X5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0139d c0139d;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f1994e;
        Q q4 = this.f1995i;
        if (i2 == 0) {
            V6.b.P(obj);
            this.f1994e = 1;
            obj = Q.f(q4, true, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f1993d;
                    V6.b.P(obj);
                    return obj2;
                }
                c0139d = (C0139d) this.f1993d;
                V6.b.P(obj);
                Object obj3 = c0139d.f2066b;
                if ((obj3 != null ? obj3.hashCode() : 0) != c0139d.f2067c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (!Intrinsics.a(c0139d.f2066b, obj)) {
                    this.f1993d = obj;
                    this.f1994e = 3;
                    if (q4.j(obj, true, this) == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
            V6.b.P(obj);
        }
        c0139d = (C0139d) obj;
        J j = new J(this.f1997m, c0139d, null);
        this.f1993d = c0139d;
        this.f1994e = 2;
        obj = AbstractC0792z.t(this.f1996l, j, this);
    }
}
