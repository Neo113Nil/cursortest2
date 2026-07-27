package P0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class i extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f3735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f3736e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F f3737i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f3738j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ M0.k f3739k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(B b4, Function0 function0, F f4, String str, M0.k kVar) {
        super(0);
        this.f3735d = b4;
        this.f3736e = function0;
        this.f3737i = f4;
        this.f3738j = str;
        this.f3739k = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f3735d.i(this.f3736e, this.f3737i, this.f3738j, this.f3739k);
        return Unit.f7487a;
    }
}
