package kotlin.reflect.jvm.internal;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.datefilterbar.views.DateFilterBarKt;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.time.format.DateTimeFormatter;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.types.AbstractKType;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class DescriptorKCallable$$Lambda$6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final Object arg$0;
    public final int arg$1;

    public DescriptorKCallable$$Lambda$6(int i, MutableState mutableState) {
        this.$r8$classId = 2;
        this.arg$1 = i;
        this.arg$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = this.arg$1;
        Object obj = this.arg$0;
        switch (i) {
            case 0:
                return (ParameterDescriptor) ((List) obj).get(i2);
            case 1:
                ((Function1) obj).invoke(Integer.valueOf(i2));
                return Unit.INSTANCE;
            case 2:
                DateTimeFormatter dateTimeFormatter = DateFilterBarKt.monthSelectedFormatter;
                Integer num = (Integer) ((MutableState) obj).getValue();
                return Boolean.valueOf(num != null && i2 == num.intValue());
            case 3:
                AbstractKType abstractKType = (AbstractKType) ((Function0) obj).invoke();
                Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConvertFromJavaKt$$Lambda$4(abstractKType, 16));
                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = abstractKType.computeJavaType;
                Type type2 = reflectProperties$LazySoftVal != null ? (Type) reflectProperties$LazySoftVal.invoke() : null;
                if (type2 instanceof Class) {
                    Class cls = (Class) type2;
                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    componentType.getClass();
                    return componentType;
                }
                if (type2 instanceof GenericArrayType) {
                    if (i2 != 0) {
                        f$$ExternalSyntheticLambda0.m$1(abstractKType, "Array type has been queried for a non-0th argument: ");
                        return null;
                    }
                    Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                    genericComponentType.getClass();
                    return genericComponentType;
                }
                if (!(type2 instanceof ParameterizedType)) {
                    f$$ExternalSyntheticLambda0.m$1(abstractKType, "Non-generic type has been queried for arguments: ");
                    return null;
                }
                Type type3 = (Type) ((List) lazy.getValue()).get(i2);
                if (!(type3 instanceof WildcardType)) {
                    return type3;
                }
                WildcardType wildcardType = (WildcardType) type3;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                lowerBounds.getClass();
                Type type4 = (Type) ArraysKt___ArraysKt.firstOrNull(lowerBounds);
                if (type4 == null) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    upperBounds.getClass();
                    type4 = (Type) ArraysKt___ArraysKt.first(upperBounds);
                }
                Type type5 = type4;
                type5.getClass();
                return type5;
            default:
                ValueParameterDescriptor valueParameterDescriptor = ((CallableMemberDescriptor) obj).getValueParameters().get(i2);
                valueParameterDescriptor.getClass();
                return valueParameterDescriptor;
        }
    }

    public /* synthetic */ DescriptorKCallable$$Lambda$6(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.arg$0 = obj;
        this.arg$1 = i;
    }
}
