package w;

import G.C0192d;
import G.C0216p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1261a extends M2.p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S.o f11131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11132e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11133i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261a(S.o oVar, int i2, int i4) {
        super(2);
        this.f11131d = oVar;
        this.f11132e = i2;
        this.f11133i = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0192d.U(this.f11132e | 1);
        int i2 = this.f11133i;
        AbstractC1264d.b(this.f11131d, (C0216p) obj, U3, i2);
        return Unit.f7487a;
    }
}
