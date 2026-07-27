package A;

import kotlin.jvm.functions.Function0;

/* renamed from: A.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025v extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0020p f195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f196e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0025v(C0020p c0020p, int i2) {
        super(0);
        this.f195d = c0020p;
        this.f196e = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(((A0.I) this.f195d.f175e).e(this.f196e));
    }
}
