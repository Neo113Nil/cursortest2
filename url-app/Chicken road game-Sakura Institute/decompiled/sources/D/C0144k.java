package D;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z2.C1440x;

/* renamed from: D.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144k extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f1868e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0144k(String str, int i2) {
        super(1);
        this.f1867d = i2;
        this.f1868e = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = this.f1868e;
        switch (this.f1867d) {
            case 0:
                S2.e[] eVarArr = y0.s.f11639a;
                y0.t tVar = y0.q.f11615d;
                S2.e eVar = y0.s.f11639a[2];
                tVar.a((y0.i) obj, str);
                return Unit.f7487a;
            case 1:
                S2.e[] eVarArr2 = y0.s.f11639a;
                ((y0.i) obj).s(y0.q.f11608D, str);
                return Unit.f7487a;
            case 2:
                return Boolean.valueOf(Intrinsics.a((String) obj, str));
            default:
                S2.e[] eVarArr3 = y0.s.f11639a;
                ((y0.i) obj).s(y0.q.f11612a, C1440x.a(str));
                return Unit.f7487a;
        }
    }
}
