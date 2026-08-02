package kotlin.reflect.jvm.internal.types;

import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final class DescriptorKType$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final DescriptorKType arg$0;

    public /* synthetic */ DescriptorKType$$Lambda$0(DescriptorKType descriptorKType, int i) {
        this.$r8$classId = i;
        this.arg$0 = descriptorKType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DescriptorKType descriptorKType = this.arg$0;
        switch (i) {
            case 0:
                return descriptorKType.convert(descriptorKType.f1540type);
            default:
                return descriptorKType;
        }
    }
}
