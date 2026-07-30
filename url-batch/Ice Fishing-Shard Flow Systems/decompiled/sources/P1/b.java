package P1;

import D6.z;
import S1.r;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import n6.S;

/* loaded from: classes.dex */
public final class b implements S1.e {

    /* renamed from: e, reason: collision with root package name */
    public static final b f2256e = new b(1);

    /* renamed from: i, reason: collision with root package name */
    public static final b f2257i = new b(2);

    /* renamed from: l, reason: collision with root package name */
    public static final b f2258l = new b(3);

    /* renamed from: m, reason: collision with root package name */
    public static final b f2259m = new b(4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2260d;

    public /* synthetic */ b(int i2) {
        this.f2260d = i2;
    }

    @Override // S1.e
    public Object c(z zVar) {
        switch (this.f2260d) {
            case 1:
                Object d7 = zVar.d(new r(R1.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(d7, "get(...)");
                return new S((Executor) d7);
            case 2:
                Object d8 = zVar.d(new r(R1.c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(d8, "get(...)");
                return new S((Executor) d8);
            case 3:
                Object d9 = zVar.d(new r(R1.b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(d9, "get(...)");
                return new S((Executor) d9);
            default:
                Object d10 = zVar.d(new r(R1.d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(d10, "get(...)");
                return new S((Executor) d10);
        }
    }
}
