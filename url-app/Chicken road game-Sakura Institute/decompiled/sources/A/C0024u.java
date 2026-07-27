package A;

import kotlin.jvm.functions.Function0;
import y2.InterfaceC1335j;

/* renamed from: A.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024u extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0020p f190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f191e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f192i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V f193j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f194k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0024u(C0020p c0020p, int i2, int i4, V v4, InterfaceC1335j interfaceC1335j) {
        super(0);
        this.f190d = c0020p;
        this.f191e = i2;
        this.f192i = i4;
        this.f193j = v4;
        this.f194k = interfaceC1335j;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, y2.j] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int intValue = ((Number) this.f194k.getValue()).intValue();
        V v4 = this.f193j;
        boolean z4 = v4.d() == 1;
        C0020p c0020p = this.f190d;
        A0.I i2 = (A0.I) c0020p.f175e;
        int i4 = this.f191e;
        long k4 = i2.k(i4);
        int i5 = A0.K.f300c;
        int i6 = (int) (k4 >> 32);
        int e4 = i2.e(i6);
        int i7 = i2.f290b.f355f;
        if (e4 != intValue) {
            i6 = intValue >= i7 ? i2.h(i7 - 1) : i2.h(intValue);
        }
        int i8 = (int) (k4 & 4294967295L);
        if (i2.e(i8) != intValue) {
            i8 = intValue >= i7 ? i2.d(i7 - 1, false) : i2.d(intValue, false);
        }
        int i9 = this.f192i;
        if (i6 == i9) {
            return c0020p.a(i8);
        }
        if (i8 == i9) {
            return c0020p.a(i6);
        }
        if (!(v4.f61b ^ z4) ? i4 >= i6 : i4 > i8) {
            i6 = i8;
        }
        return c0020p.a(i6);
    }
}
