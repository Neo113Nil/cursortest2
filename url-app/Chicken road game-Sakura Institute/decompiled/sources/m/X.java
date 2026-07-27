package m;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p0.InterfaceC0980p;

/* loaded from: classes.dex */
public final class X extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z f8052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(Z z4, int i2) {
        super(0);
        this.f8051d = i2;
        this.f8052e = z4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8051d) {
            case 0:
                InterfaceC0980p interfaceC0980p = (InterfaceC0980p) this.f8052e.f8060G.getValue();
                return new Y.c(interfaceC0980p != null ? interfaceC0980p.Q(0L) : 9205357640488583168L);
            case 1:
                return new Y.c(this.f8052e.f8062I);
            default:
                this.f8052e.D0();
                return Unit.f7487a;
        }
    }
}
