package D;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0953N;
import p0.AbstractC0954O;

/* loaded from: classes.dex */
public final class C extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1201e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1202i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1203j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1204k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1205l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1206m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(AbstractC0954O abstractC0954O, int i2, int i4, AbstractC0954O abstractC0954O2, int i5, AbstractC0954O abstractC0954O3, int i6) {
        super(1);
        this.f1200d = abstractC0954O;
        this.f1201e = i2;
        this.f1202i = i4;
        this.f1203j = abstractC0954O2;
        this.f1204k = i5;
        this.f1205l = abstractC0954O3;
        this.f1206m = i6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
        int i2 = this.f1202i;
        AbstractC0954O abstractC0954O = this.f1200d;
        if (abstractC0954O != null) {
            AbstractC0953N.f(abstractC0953N, abstractC0954O, 0, Math.round((1 + 0.0f) * ((i2 - this.f1201e) / 2.0f)));
        }
        AbstractC0954O abstractC0954O2 = this.f1203j;
        int i4 = this.f1204k;
        AbstractC0953N.f(abstractC0953N, abstractC0954O2, i4, 0);
        AbstractC0954O abstractC0954O3 = this.f1205l;
        if (abstractC0954O3 != null) {
            AbstractC0953N.f(abstractC0953N, abstractC0954O3, i4 + abstractC0954O2.f9005d, Math.round((1 + 0.0f) * ((i2 - this.f1206m) / 2.0f)));
        }
        return Unit.f7487a;
    }
}
