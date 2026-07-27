package M;

import java.util.concurrent.atomic.AtomicInteger;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class O extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.r f1606a;

    /* renamed from: b, reason: collision with root package name */
    public int f1607b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1608c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f1609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P f1610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1612g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(kotlin.jvm.internal.r rVar, P p5, Object obj, boolean z, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1609d = rVar;
        this.f1610e = p5;
        this.f1611f = obj;
        this.f1612g = z;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        O o2 = new O(this.f1609d, this.f1610e, this.f1611f, this.f1612g, interfaceC1218d);
        o2.f1608c = obj;
        return o2;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((a0) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // m4.AbstractC1293a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.r rVar;
        a0 a0Var;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1607b;
        kotlin.jvm.internal.r rVar2 = this.f1609d;
        Object obj2 = this.f1611f;
        P p5 = this.f1610e;
        if (i2 == 0) {
            e5.g.y(obj);
            a0 a0Var2 = (a0) this.f1608c;
            j0 g6 = p5.g();
            this.f1608c = a0Var2;
            this.f1606a = rVar2;
            this.f1607b = 1;
            Integer num = new Integer(((AtomicInteger) g6.f1707b.f5783b).incrementAndGet());
            if (num == enumC1260a) {
                return enumC1260a;
            }
            rVar = rVar2;
            a0Var = a0Var2;
            obj = num;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e5.g.y(obj);
                if (this.f1612g) {
                    p5.f1620h.h(new C0075d(obj2 != null ? obj2.hashCode() : 0, rVar2.f10740a, obj2));
                }
                return f4.v.f5689a;
            }
            rVar = this.f1606a;
            a0Var = (a0) this.f1608c;
            e5.g.y(obj);
        }
        rVar.f10740a = ((Number) obj).intValue();
        this.f1608c = null;
        this.f1606a = null;
        this.f1607b = 2;
        if (a0Var.b(obj2, this) == enumC1260a) {
            return enumC1260a;
        }
        if (this.f1612g) {
        }
        return f4.v.f5689a;
    }
}
