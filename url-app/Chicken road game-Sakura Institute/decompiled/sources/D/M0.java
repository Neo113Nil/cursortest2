package D;

import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p.C0935k;

/* loaded from: classes.dex */
public final class M0 extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f1483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1484e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0935k f1485i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ K1 f1486j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z.P f1487k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(boolean z4, boolean z5, C0935k c0935k, K1 k12, Z.P p4) {
        super(2);
        this.f1483d = z4;
        this.f1484e = z5;
        this.f1485i = c0935k;
        this.f1486j = k12;
        this.f1487k = p4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        C0216p c0216p = (C0216p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            L0.f1475a.a(this.f1483d, this.f1484e, this.f1485i, null, this.f1486j, this.f1487k, 0.0f, 0.0f, c0216p, 100663296, 200);
        }
        return Unit.f7487a;
    }
}
