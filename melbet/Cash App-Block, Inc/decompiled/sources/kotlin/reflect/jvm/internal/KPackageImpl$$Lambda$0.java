package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;

/* loaded from: classes9.dex */
public final class KPackageImpl$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final KPackageImpl arg$0;

    public /* synthetic */ KPackageImpl$$Lambda$0(KPackageImpl kPackageImpl, int i) {
        this.$r8$classId = i;
        this.arg$0 = kPackageImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        KPackageImpl kPackageImpl = this.arg$0;
        switch (i) {
            case 0:
                return new KPackageImpl.Data(kPackageImpl);
            default:
                return ReflectKotlinClass.Factory.create(kPackageImpl.jClass);
        }
    }
}
