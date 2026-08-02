package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public final class ConstantValueFactory {
    public static final ConstantValueFactory INSTANCE = new ConstantValueFactory();

    public static /* synthetic */ ConstantValue createConstantValue$default(ConstantValueFactory constantValueFactory, Object obj, ModuleDescriptor moduleDescriptor, int i, Object obj2) {
        if ((i & 2) != 0) {
            moduleDescriptor = null;
        }
        return constantValueFactory.createConstantValue(obj, moduleDescriptor);
    }

    public final ArrayValue createArrayValue(List list, ModuleDescriptor moduleDescriptor, PrimitiveType primitiveType) {
        List list2 = CollectionsKt.toList(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ConstantValue createConstantValue$default = createConstantValue$default(this, it.next(), null, 2, null);
            if (createConstantValue$default != null) {
                arrayList.add(createConstantValue$default);
            }
        }
        if (moduleDescriptor == null) {
            return new ArrayValue(arrayList, new TasksKt$awaitImpl$2$2(primitiveType, 17));
        }
        SimpleType primitiveArrayKotlinType = moduleDescriptor.getBuiltIns().getPrimitiveArrayKotlinType(primitiveType);
        primitiveArrayKotlinType.getClass();
        return new TypedArrayValue(arrayList, primitiveArrayKotlinType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v26, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v33, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v38, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory] */
    public final ConstantValue<?> createConstantValue(Object obj, ModuleDescriptor moduleDescriptor) {
        ?? r0;
        ?? r02;
        ?? r03;
        ?? r04;
        if (obj instanceof Byte) {
            return new ByteValue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ShortValue(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new CharValue(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new BooleanValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new StringValue((String) obj);
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length == 0) {
                r04 = EmptyList.INSTANCE;
            } else if (length != 1) {
                r04 = new ArrayList(bArr.length);
                int length2 = bArr.length;
                while (i < length2) {
                    r04.add(Byte.valueOf(bArr[i]));
                    i++;
                }
            } else {
                r04 = CollectionsKt__CollectionsJVMKt.listOf(Byte.valueOf(bArr[0]));
            }
            return createArrayValue(r04, moduleDescriptor, PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 == 0) {
                r03 = EmptyList.INSTANCE;
            } else if (length3 != 1) {
                r03 = new ArrayList(sArr.length);
                int length4 = sArr.length;
                while (i < length4) {
                    r03.add(Short.valueOf(sArr[i]));
                    i++;
                }
            } else {
                r03 = CollectionsKt__CollectionsJVMKt.listOf(Short.valueOf(sArr[0]));
            }
            return createArrayValue(r03, moduleDescriptor, PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return createArrayValue(ArraysKt___ArraysKt.toList((int[]) obj), moduleDescriptor, PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return createArrayValue(ArraysKt___ArraysKt.toList((long[]) obj), moduleDescriptor, PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length5 = cArr.length;
            if (length5 == 0) {
                r02 = EmptyList.INSTANCE;
            } else if (length5 != 1) {
                r02 = new ArrayList(cArr.length);
                int length6 = cArr.length;
                while (i < length6) {
                    r02.add(Character.valueOf(cArr[i]));
                    i++;
                }
            } else {
                r02 = CollectionsKt__CollectionsJVMKt.listOf(Character.valueOf(cArr[0]));
            }
            return createArrayValue(r02, moduleDescriptor, PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            return createArrayValue(ArraysKt___ArraysKt.toList((float[]) obj), moduleDescriptor, PrimitiveType.FLOAT);
        }
        if (!(obj instanceof double[])) {
            if (obj instanceof boolean[]) {
                return createArrayValue(ArraysKt___ArraysKt.toList((boolean[]) obj), moduleDescriptor, PrimitiveType.BOOLEAN);
            }
            if (obj == null) {
                return new NullValue();
            }
            return null;
        }
        double[] dArr = (double[]) obj;
        int length7 = dArr.length;
        if (length7 == 0) {
            r0 = EmptyList.INSTANCE;
        } else if (length7 != 1) {
            r0 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i < length8) {
                r0.add(Double.valueOf(dArr[i]));
                i++;
            }
        } else {
            r0 = CollectionsKt__CollectionsJVMKt.listOf(Double.valueOf(dArr[0]));
        }
        return createArrayValue(r0, moduleDescriptor, PrimitiveType.DOUBLE);
    }

    public final ArrayValue createArrayValue(List<? extends ConstantValue<?>> list, KotlinType kotlinType) {
        list.getClass();
        kotlinType.getClass();
        return new TypedArrayValue(list, kotlinType);
    }
}
