package D;

import a.AbstractC0345a;
import b0.InterfaceC0496d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class X extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f1672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f1673e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(float f4, long j4) {
        super(1);
        this.f1672d = f4;
        this.f1673e = j4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC0496d interfaceC0496d = (InterfaceC0496d) obj;
        float f4 = this.f1672d;
        float f5 = 2;
        interfaceC0496d.o(this.f1673e, AbstractC0345a.c(0.0f, interfaceC0496d.L(f4) / f5), AbstractC0345a.c(Y.f.d(interfaceC0496d.h()), interfaceC0496d.L(f4) / f5), interfaceC0496d.L(f4), 0, 1.0f, null, 3);
        return Unit.f7487a;
    }
}
