package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: P0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260b extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f3707e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0260b(y yVar, int i2) {
        super(1);
        this.f3706d = i2;
        this.f3707e = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3706d) {
            case 0:
                y yVar = this.f3707e;
                yVar.show();
                return new C0259a(0, yVar);
            default:
                y yVar2 = this.f3707e;
                if (yVar2.f3776k.f3768a) {
                    yVar2.f3775j.invoke();
                }
                return Unit.f7487a;
        }
    }
}
