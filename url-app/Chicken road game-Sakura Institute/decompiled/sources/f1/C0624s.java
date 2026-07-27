package f1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import y2.AbstractC1343r;

/* renamed from: f1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624s extends E2.j implements Function1 {

    /* renamed from: k, reason: collision with root package name */
    public int f6616k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0604E f6617l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0624s(C0604E c0604e, C2.a aVar) {
        super(1, aVar);
        this.f6617l = c0604e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C0624s(this.f6617l, (C2.a) obj).l(Unit.f7487a);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f6616k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            this.f6616k = 1;
            obj = this.f6617l.invoke(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return obj;
    }
}
