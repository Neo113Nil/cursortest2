package D;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import p0.InterfaceC0947H;

/* loaded from: classes.dex */
public final class G0 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1280e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f1281i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1282j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1283k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f1284l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f1285m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1286n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1287o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f1288p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC0954O f1289q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1290r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f1291s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1292t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0947H f1293u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(AbstractC0954O abstractC0954O, boolean z4, float f4, AbstractC0954O abstractC0954O2, int i2, float f5, float f6, AbstractC0954O abstractC0954O3, int i4, float f7, AbstractC0954O abstractC0954O4, int i5, float f8, int i6, InterfaceC0947H interfaceC0947H) {
        super(1);
        this.f1279d = abstractC0954O;
        this.f1280e = z4;
        this.f1281i = f4;
        this.f1282j = abstractC0954O2;
        this.f1283k = i2;
        this.f1284l = f5;
        this.f1285m = f6;
        this.f1286n = abstractC0954O3;
        this.f1287o = i4;
        this.f1288p = f7;
        this.f1289q = abstractC0954O4;
        this.f1290r = i5;
        this.f1291s = f8;
        this.f1292t = i6;
        this.f1293u = interfaceC0947H;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
        float f4 = this.f1288p;
        float f5 = this.f1285m;
        AbstractC0954O abstractC0954O = this.f1279d;
        if (abstractC0954O != null) {
            AbstractC0953N.f(abstractC0953N, abstractC0954O, (this.f1292t - abstractC0954O.f9005d) / 2, O2.c.a((f4 - this.f1293u.l(H0.f1311e)) + f5));
        }
        if (this.f1280e || this.f1281i != 0.0f) {
            AbstractC0953N.f(abstractC0953N, this.f1282j, this.f1283k, O2.c.a(this.f1284l + f5));
        }
        AbstractC0953N.f(abstractC0953N, this.f1286n, this.f1287o, O2.c.a(f4 + f5));
        AbstractC0953N.f(abstractC0953N, this.f1289q, this.f1290r, O2.c.a(this.f1291s + f5));
        return Unit.f7487a;
    }
}
