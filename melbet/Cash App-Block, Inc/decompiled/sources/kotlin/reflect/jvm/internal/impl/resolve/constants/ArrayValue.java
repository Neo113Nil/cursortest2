package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public class ArrayValue extends ConstantValue<List<? extends ConstantValue<?>>> {
    public final Function1 computeType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrayValue(List<? extends ConstantValue<?>> list, Function1<? super ModuleDescriptor, ? extends KotlinType> function1) {
        super(list);
        list.getClass();
        function1.getClass();
        this.computeType = function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        KotlinType kotlinType = (KotlinType) this.computeType.invoke(moduleDescriptor);
        if (!KotlinBuiltIns.isArray(kotlinType) && !KotlinBuiltIns.isPrimitiveArray(kotlinType)) {
            KotlinBuiltIns.isUnsignedArrayType(kotlinType);
        }
        return kotlinType;
    }
}
