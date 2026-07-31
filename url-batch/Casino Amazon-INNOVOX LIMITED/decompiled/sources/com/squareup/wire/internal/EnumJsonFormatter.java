package com.squareup.wire.internal;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireEnumConstant;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: EnumJsonFormatter.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/wire/internal/EnumJsonFormatter;", "E", "Lcom/squareup/wire/WireEnum;", "Lcom/squareup/wire/internal/JsonFormatter;", "adapter", "Lcom/squareup/wire/EnumAdapter;", "<init>", "(Lcom/squareup/wire/EnumAdapter;)V", "stringToValue", "", "", "valueToString", "unrecognizedClassConstructor", "Ljava/lang/reflect/Constructor;", "fromString", "value", "(Ljava/lang/String;)Lcom/squareup/wire/WireEnum;", "toStringOrNumber", "", "(Lcom/squareup/wire/WireEnum;)Ljava/lang/Object;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnumJsonFormatter<E extends WireEnum> implements JsonFormatter<E> {
    private final Map<String, E> stringToValue;
    private Constructor<E> unrecognizedClassConstructor;
    private final Map<E, String> valueToString;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.squareup.wire.WireEnum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    public EnumJsonFormatter(EnumAdapter<E> adapter) {
        WireEnumConstant wireEnumConstant;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        KClass<?> type = adapter.getType();
        Intrinsics.checkNotNull(type);
        Class javaClass = JvmClassMappingKt.getJavaClass((KClass) type);
        Intrinsics.checkNotNull(javaClass, "null cannot be cast to non-null type java.lang.Class<E of com.squareup.wire.internal.EnumJsonFormatter>");
        WireEnum[] wireEnumArr = (WireEnum[]) javaClass.getEnumConstants();
        if (wireEnumArr == null) {
            Iterator it = ArrayIteratorKt.iterator(javaClass.getDeclaredClasses());
            while (it.hasNext()) {
                Class cls = (Class) it.next();
                String simpleName = cls.getSimpleName();
                if (!Intrinsics.areEqual(simpleName, "Companion")) {
                    Field[] declaredFields = cls.getDeclaredFields();
                    Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
                    Field field = (Field) ArraysKt.first(declaredFields);
                    if (Intrinsics.areEqual(field.getName(), "INSTANCE")) {
                        Object obj = field.get(null);
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type E of com.squareup.wire.internal.EnumJsonFormatter");
                        WireEnum wireEnum = (WireEnum) obj;
                        linkedHashMap.put(cls.getSimpleName(), wireEnum);
                        linkedHashMap.put(String.valueOf(wireEnum.getValue()), wireEnum);
                        linkedHashMap2.put(wireEnum, simpleName);
                        Annotation[] annotations = cls.getAnnotations();
                        Intrinsics.checkNotNullExpressionValue(annotations, "getAnnotations(...)");
                        Annotation[] annotationArr = annotations;
                        int length = annotationArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                wireEnumConstant = 0;
                                break;
                            }
                            wireEnumConstant = annotationArr[i];
                            if (((Annotation) wireEnumConstant) instanceof WireEnumConstant) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        WireEnumConstant wireEnumConstant2 = wireEnumConstant instanceof WireEnumConstant ? wireEnumConstant : null;
                        if (wireEnumConstant2 != null && wireEnumConstant2.declaredName().length() > 0) {
                            linkedHashMap.put(wireEnumConstant2.declaredName(), wireEnum);
                            linkedHashMap2.put(wireEnum, wireEnumConstant2.declaredName());
                        }
                    } else {
                        Constructor<?>[] constructors = cls.getConstructors();
                        Intrinsics.checkNotNullExpressionValue(constructors, "getConstructors(...)");
                        Object first = ArraysKt.first(constructors);
                        Intrinsics.checkNotNull(first, "null cannot be cast to non-null type java.lang.reflect.Constructor<E of com.squareup.wire.internal.EnumJsonFormatter>");
                        this.unrecognizedClassConstructor = (Constructor) first;
                    }
                }
            }
        } else {
            Iterator it2 = ArrayIteratorKt.iterator(wireEnumArr);
            while (it2.hasNext()) {
                ?? r3 = (WireEnum) it2.next();
                Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Enum<*>");
                String name = ((Enum) r3).name();
                linkedHashMap.put(name, r3);
                linkedHashMap.put(String.valueOf(r3.getValue()), r3);
                linkedHashMap2.put(r3, name);
                WireEnumConstant wireEnumConstant3 = (WireEnumConstant) javaClass.getDeclaredField(name).getAnnotation(WireEnumConstant.class);
                if (wireEnumConstant3 != null && wireEnumConstant3.declaredName().length() > 0) {
                    linkedHashMap.put(wireEnumConstant3.declaredName(), r3);
                    linkedHashMap2.put(r3, wireEnumConstant3.declaredName());
                }
            }
        }
        this.stringToValue = linkedHashMap;
        this.valueToString = linkedHashMap2;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public E fromString(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        E e = this.stringToValue.get(value);
        if (e != null) {
            return e;
        }
        Constructor<E> constructor = this.unrecognizedClassConstructor;
        if (constructor != null) {
            return constructor.newInstance(Integer.valueOf(Integer.parseInt(value)));
        }
        return null;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Object toStringOrNumber(E value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String str = this.valueToString.get(value);
        return str == null ? Integer.valueOf(value.getValue()) : str;
    }
}
