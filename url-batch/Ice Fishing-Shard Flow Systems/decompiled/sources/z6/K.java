package z6;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1081v f8748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(C1081v c1081v, int i2) {
        super(0);
        this.f8747d = i2;
        this.f8748e = c1081v;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [R5.h, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i2 = this.f8747d;
        C1081v c1081v = this.f8748e;
        switch (i2) {
            case 0:
                return Integer.valueOf(J.c(c1081v, (x6.e[]) c1081v.f8824h.getValue()));
            case 1:
                C1082w c1082w = c1081v.f8818b;
                return c1082w != null ? new w6.a[]{c1082w.f8826a} : J.f8746b;
            default:
                return J.b(c1081v.f8818b != null ? new ArrayList(0) : null);
        }
    }
}
