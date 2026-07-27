package s0;

import kotlin.jvm.functions.Function1;

/* renamed from: s0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1159o extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X.b f10280e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1159o(X.b bVar, int i2) {
        super(1);
        this.f10279d = i2;
        this.f10280e = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10279d) {
            case 0:
                Boolean C3 = X.d.C((X.t) obj, this.f10280e.f4312a);
                return Boolean.valueOf(C3 != null ? C3.booleanValue() : true);
            default:
                Boolean C4 = X.d.C((X.t) obj, this.f10280e.f4312a);
                return Boolean.valueOf(C4 != null ? C4.booleanValue() : true);
        }
    }
}
