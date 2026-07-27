package r;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class x extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i2, int i4) {
        super(0);
        this.f9574d = i2;
        this.f9575e = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new v(this.f9574d, this.f9575e);
    }
}
