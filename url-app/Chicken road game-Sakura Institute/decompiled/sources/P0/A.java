package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class A extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M2.D f3676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B f3677e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M0.i f3678i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f3679j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f3680k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(M2.D d4, B b4, M0.i iVar, long j4, long j5) {
        super(0);
        this.f3676d = d4;
        this.f3677e = b4;
        this.f3678i = iVar;
        this.f3679j = j4;
        this.f3680k = j5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        B b4 = this.f3677e;
        E positionProvider = b4.getPositionProvider();
        M0.k parentLayoutDirection = b4.getParentLayoutDirection();
        this.f3676d.f3579d = positionProvider.a(this.f3678i, this.f3679j, parentLayoutDirection, this.f3680k);
        return Unit.f7487a;
    }
}
