package P;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class H extends X5.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public Serializable f1983d;

    /* renamed from: e, reason: collision with root package name */
    public int f1984e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.D f1985i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f1986l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.C f1987m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(kotlin.jvm.internal.D d7, Q q4, kotlin.jvm.internal.C c7, V5.b bVar) {
        super(1, bVar);
        this.f1985i = d7;
        this.f1986l = q4;
        this.f1987m = c7;
    }

    @Override // X5.a
    public final V5.b create(V5.b bVar) {
        return new H(this.f1985i, this.f1986l, this.f1987m, bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((H) create((V5.b) obj)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r9 != r0) goto L30;
     */
    @Override // X5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.D d7;
        kotlin.jvm.internal.C c7;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f1984e;
        kotlin.jvm.internal.C c8 = this.f1987m;
        kotlin.jvm.internal.D d8 = this.f1985i;
        Q q4 = this.f1986l;
        try {
        } catch (C0137b unused) {
            Object obj2 = d8.f6152d;
            this.f1983d = c8;
            this.f1984e = 3;
            obj = q4.j(obj2, true, this);
        }
        if (i2 == 0) {
            V6.b.P(obj);
            this.f1983d = d8;
            this.f1984e = 1;
            obj = q4.i(this);
            if (obj == aVar) {
                return aVar;
            }
            d7 = d8;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    c7 = (kotlin.jvm.internal.C) this.f1983d;
                    V6.b.P(obj);
                    c7.f6151d = ((Number) obj).intValue();
                    return Unit.f6114a;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c8 = (kotlin.jvm.internal.C) this.f1983d;
                V6.b.P(obj);
                c8.f6151d = ((Number) obj).intValue();
                return Unit.f6114a;
            }
            d7 = (kotlin.jvm.internal.D) this.f1983d;
            V6.b.P(obj);
        }
        d7.f6152d = obj;
        l0 g7 = q4.g();
        this.f1983d = c8;
        this.f1984e = 2;
        obj = g7.a();
        if (obj == aVar) {
            return aVar;
        }
        c7 = c8;
        c7.f6151d = ((Number) obj).intValue();
        return Unit.f6114a;
    }
}
