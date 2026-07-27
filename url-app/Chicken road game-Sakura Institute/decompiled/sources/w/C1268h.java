package w;

import G.C0192d;
import G.C0216p;
import Z.InterfaceC0324v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: w.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1268h extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S.o f11211e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A0.L f11212i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f11213j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11214k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f11215l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f11216m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f11217n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0324v f11218o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f11219p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11220q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1268h(String str, S.o oVar, A0.L l4, Function1 function1, int i2, boolean z4, int i4, int i5, InterfaceC0324v interfaceC0324v, int i6, int i7) {
        super(2);
        this.f11210d = str;
        this.f11211e = oVar;
        this.f11212i = l4;
        this.f11213j = function1;
        this.f11214k = i2;
        this.f11215l = z4;
        this.f11216m = i4;
        this.f11217n = i5;
        this.f11218o = interfaceC0324v;
        this.f11219p = i6;
        this.f11220q = i7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f11219p | 1);
        int i2 = this.f11216m;
        M.a(this.f11210d, this.f11211e, this.f11212i, this.f11213j, this.f11214k, this.f11215l, i2, this.f11217n, this.f11218o, (C0216p) obj, U3, this.f11220q);
        return Unit.f7487a;
    }
}
