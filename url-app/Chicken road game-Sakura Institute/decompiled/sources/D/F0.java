package D;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0953N;
import p0.AbstractC0954O;

/* loaded from: classes.dex */
public final class F0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1247e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1248i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1249j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1250k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1251l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1252m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1253n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1254o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(AbstractC0954O abstractC0954O, AbstractC0954O abstractC0954O2, int i2, int i4, AbstractC0954O abstractC0954O3, int i5, int i6, int i7, int i8) {
        super(1);
        this.f1246d = abstractC0954O;
        this.f1247e = abstractC0954O2;
        this.f1248i = i2;
        this.f1249j = i4;
        this.f1250k = abstractC0954O3;
        this.f1251l = i5;
        this.f1252m = i6;
        this.f1253n = i7;
        this.f1254o = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
        AbstractC0954O abstractC0954O = this.f1246d;
        if (abstractC0954O != null) {
            AbstractC0953N.f(abstractC0953N, abstractC0954O, (this.f1253n - abstractC0954O.f9005d) / 2, (this.f1254o - abstractC0954O.f9006e) / 2);
        }
        AbstractC0953N.f(abstractC0953N, this.f1247e, this.f1248i, this.f1249j);
        AbstractC0953N.f(abstractC0953N, this.f1250k, this.f1251l, this.f1252m);
        return Unit.f7487a;
    }
}
