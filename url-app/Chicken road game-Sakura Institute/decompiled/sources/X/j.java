package X;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class j extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i2, int i4) {
        super(1);
        this.f4330d = i4;
        this.f4331e = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4330d) {
            case 0:
                Boolean C3 = d.C((t) obj, this.f4331e);
                return Boolean.valueOf(C3 != null ? C3.booleanValue() : false);
            default:
                Boolean C4 = d.C((t) obj, this.f4331e);
                return Boolean.valueOf(C4 != null ? C4.booleanValue() : false);
        }
    }
}
