package D;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import p0.InterfaceC0947H;

/* loaded from: classes.dex */
public final class v1 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f2056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f2057e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0947H f2058i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2059j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2060k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Integer f2061l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Integer f2062m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(AbstractC0954O abstractC0954O, AbstractC0954O abstractC0954O2, InterfaceC0947H interfaceC0947H, int i2, int i4, Integer num, Integer num2) {
        super(1);
        this.f2056d = abstractC0954O;
        this.f2057e = abstractC0954O2;
        this.f2058i = interfaceC0947H;
        this.f2059j = i2;
        this.f2060k = i4;
        this.f2061l = num;
        this.f2062m = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
        AbstractC0954O abstractC0954O = this.f2057e;
        int i2 = this.f2060k;
        AbstractC0954O abstractC0954O2 = this.f2056d;
        if (abstractC0954O2 != null && abstractC0954O != null) {
            Integer num = this.f2061l;
            Intrinsics.c(num);
            int intValue = num.intValue();
            Integer num2 = this.f2062m;
            Intrinsics.c(num2);
            int intValue2 = num2.intValue();
            float f4 = intValue == intValue2 ? z1.f2129d : z1.f2130e;
            InterfaceC0947H interfaceC0947H = this.f2058i;
            int l4 = interfaceC0947H.l(F.r.f2498a) + interfaceC0947H.l(f4);
            int h02 = (interfaceC0947H.h0(z1.f2131f) + abstractC0954O.f9006e) - intValue;
            int i4 = abstractC0954O2.f9005d;
            int i5 = this.f2059j;
            int i6 = (i2 - intValue2) - l4;
            AbstractC0953N.f(abstractC0953N, abstractC0954O2, (i5 - i4) / 2, i6);
            AbstractC0953N.f(abstractC0953N, abstractC0954O, (i5 - abstractC0954O.f9005d) / 2, i6 - h02);
        } else if (abstractC0954O2 != null) {
            float f5 = z1.f2126a;
            AbstractC0953N.f(abstractC0953N, abstractC0954O2, 0, (i2 - abstractC0954O2.f9006e) / 2);
        } else if (abstractC0954O != null) {
            float f6 = z1.f2126a;
            AbstractC0953N.f(abstractC0953N, abstractC0954O, 0, (i2 - abstractC0954O.f9006e) / 2);
        }
        return Unit.f7487a;
    }
}
