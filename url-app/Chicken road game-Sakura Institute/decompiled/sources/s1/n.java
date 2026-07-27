package s1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1183B f10541e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(C1183B c1183b, int i2) {
        super(1);
        this.f10540d = i2;
        this.f10541e = c1183b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10540d) {
            case 0:
                v destination = (v) obj;
                Intrinsics.checkNotNullParameter(destination, "destination");
                return Boolean.valueOf(!this.f10541e.f10448m.containsKey(Integer.valueOf(destination.f10575l)));
            default:
                v destination2 = (v) obj;
                Intrinsics.checkNotNullParameter(destination2, "destination");
                return Boolean.valueOf(!this.f10541e.f10448m.containsKey(Integer.valueOf(destination2.f10575l)));
        }
    }
}
