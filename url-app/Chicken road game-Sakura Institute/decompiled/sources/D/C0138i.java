package D;

import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: D.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138i extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f1819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f1820e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f1821i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z.P f1822j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f1823k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f1824l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f1825m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f1826n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f1827o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Function2 f1828p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ O.a f1829q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0138i(Function2 function2, Function2 function22, Function2 function23, Z.P p4, long j4, float f4, long j5, long j6, long j7, Function2 function24, O.a aVar) {
        super(2);
        this.f1819d = function2;
        this.f1820e = function22;
        this.f1821i = function23;
        this.f1822j = p4;
        this.f1823k = j4;
        this.f1824l = f4;
        this.f1825m = j5;
        this.f1826n = j6;
        this.f1827o = j7;
        this.f1828p = function24;
        this.f1829q = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            O.a b4 = O.f.b(1163543932, new C0135h(this.f1828p, this.f1829q, 1), c0216p);
            int i2 = F.c.f2376a;
            AbstractC0150m.a(b4, null, this.f1819d, this.f1820e, this.f1821i, this.f1822j, this.f1823k, this.f1824l, M.d(26, c0216p), this.f1825m, this.f1826n, this.f1827o, c0216p, 6, 0);
        }
        return Unit.f7487a;
    }
}
