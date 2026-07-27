package k3;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s0.C1166s;

/* loaded from: classes.dex */
public final /* synthetic */ class e extends M2.m implements Function2 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7437o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(i2, i4, cls, obj, str, str2);
        this.f7437o = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        switch (this.f7437o) {
            case 0:
                SerialDescriptor p02 = (SerialDescriptor) obj;
                int intValue = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(p02, "p0");
                f fVar = (f) this.f3591e;
                fVar.getClass();
                boolean z4 = !p02.j(intValue) && p02.h(intValue).f();
                fVar.f7439b = z4;
                return Boolean.valueOf(z4);
            default:
                return Boolean.valueOf(C1166s.g((C1166s) this.f3591e, (X.b) obj, (Y.d) obj2));
        }
    }
}
