package Q;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265a extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3829e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0265a(int i2, Object obj) {
        super(1);
        this.f3828d = i2;
        this.f3829e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3828d) {
            case 0:
                ?? r02 = this.f3829e;
                int size = r02.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Function1) r02.get(i2)).invoke(obj);
                }
                return Unit.f7487a;
            case 1:
                return Boolean.valueOf(Intrinsics.a(obj, this.f3829e));
            default:
                ((Number) obj).intValue();
                return this.f3829e;
        }
    }
}
