package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public final class PackageFragmentProviderImpl$$Lambda$1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final FqName arg$0;

    public /* synthetic */ PackageFragmentProviderImpl$$Lambda$1(FqName fqName, int i) {
        this.$r8$classId = i;
        this.arg$0 = fqName;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        FqName fqName = this.arg$0;
        switch (i) {
            case 0:
                FqName fqName2 = (FqName) obj;
                fqName2.getClass();
                return Boolean.valueOf(!fqName2.isRoot() && Intrinsics.areEqual(fqName2.parent(), fqName));
            default:
                Annotations annotations = (Annotations) obj;
                annotations.getClass();
                return annotations.mo4143findAnnotation(fqName);
        }
    }
}
