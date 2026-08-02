package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.DescriptorKProperty;

/* loaded from: classes9.dex */
public final class StandardKTypes$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public static final StandardKTypes$$Lambda$0 INSTANCE$1 = new StandardKTypes$$Lambda$0(1);
    public static final StandardKTypes$$Lambda$0 INSTANCE = new StandardKTypes$$Lambda$0(0);

    public /* synthetic */ StandardKTypes$$Lambda$0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Class cls = Void.TYPE;
        switch (i) {
            case 0:
                KType kType = StandardKTypes.ANY;
                cls.getClass();
                break;
            default:
                KProperty[] kPropertyArr = DescriptorKProperty.Setter.$$delegatedProperties;
                cls.getClass();
                break;
        }
        return cls;
    }
}
