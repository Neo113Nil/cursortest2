package kotlin.reflect.jvm.internal.impl.resolve.constants;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes9.dex */
public final class StringValue extends ConstantValue<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringValue(String str) {
        super(str);
        str.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        SimpleType stringType = moduleDescriptor.getBuiltIns().getStringType();
        stringType.getClass();
        return stringType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("\""), getValue(), '\"');
    }
}
