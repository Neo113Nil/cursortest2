package A;

import a.AbstractC0345a;
import kotlin.jvm.functions.Function0;

/* renamed from: A.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006b extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0019o f106e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0006b(InterfaceC0019o interfaceC0019o, int i2) {
        super(0);
        this.f105d = i2;
        this.f106e = interfaceC0019o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f105d) {
        }
        return Boolean.valueOf(AbstractC0345a.z(this.f106e.a()));
    }
}
