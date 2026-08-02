package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.slf4j.Marker;

/* loaded from: classes9.dex */
public final class DescriptorRendererImpl$$Lambda$4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final DescriptorRendererImpl arg$0;

    public /* synthetic */ DescriptorRendererImpl$$Lambda$4(DescriptorRendererImpl descriptorRendererImpl, int i) {
        this.$r8$classId = i;
        this.arg$0 = descriptorRendererImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        DescriptorRendererImpl descriptorRendererImpl = this.arg$0;
        switch (i) {
            case 0:
                TypeProjection typeProjection = (TypeProjection) obj;
                int i2 = DescriptorRendererImpl.$r8$clinit;
                typeProjection.getClass();
                if (typeProjection.isStarProjection()) {
                    return Marker.ANY_MARKER;
                }
                KotlinType type2 = typeProjection.getType();
                type2.getClass();
                String renderType = descriptorRendererImpl.renderType(type2);
                if (typeProjection.getProjectionKind() == Variance.INVARIANT) {
                    return renderType;
                }
                return typeProjection.getProjectionKind() + ' ' + renderType;
            default:
                KotlinType kotlinType = (KotlinType) obj;
                int i3 = DescriptorRendererImpl.$r8$clinit;
                kotlinType.getClass();
                return descriptorRendererImpl.renderType(kotlinType);
        }
    }
}
