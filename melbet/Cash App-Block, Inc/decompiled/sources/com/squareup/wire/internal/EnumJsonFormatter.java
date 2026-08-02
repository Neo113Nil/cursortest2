package com.squareup.wire.internal;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireEnumConstant;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import papa.PapaEvent;

/* loaded from: classes.dex */
public final class EnumJsonFormatter implements JsonFormatter {
    public final LinkedHashMap stringToValue;
    public final Constructor unrecognizedClassConstructor;
    public final LinkedHashMap valueToString;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.squareup.wire.WireEnum[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.squareup.wire.WireEnum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.lang.annotation.Annotation[]] */
    public EnumJsonFormatter(EnumAdapter enumAdapter) {
        WireEnumConstant wireEnumConstant;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        KClass type2 = enumAdapter.getType();
        type2.getClass();
        Class javaClass = PapaEvent.getJavaClass(type2);
        ?? r2 = (WireEnum[]) javaClass.getEnumConstants();
        if (r2 == 0) {
            Class<?>[] declaredClasses = javaClass.getDeclaredClasses();
            declaredClasses.getClass();
            for (Class<?> cls : declaredClasses) {
                String simpleName = cls.getSimpleName();
                if (!simpleName.equals("Companion")) {
                    Field[] declaredFields = cls.getDeclaredFields();
                    declaredFields.getClass();
                    Field field = (Field) ArraysKt___ArraysKt.first(declaredFields);
                    if (Intrinsics.areEqual(field.getName(), "INSTANCE")) {
                        Object obj = field.get(null);
                        obj.getClass();
                        WireEnum wireEnum = (WireEnum) obj;
                        linkedHashMap.put(cls.getSimpleName(), wireEnum);
                        linkedHashMap.put(String.valueOf(wireEnum.getValue()), wireEnum);
                        linkedHashMap2.put(wireEnum, simpleName);
                        ?? annotations = cls.getAnnotations();
                        annotations.getClass();
                        int length = annotations.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                wireEnumConstant = 0;
                                break;
                            }
                            wireEnumConstant = annotations[i];
                            if (wireEnumConstant instanceof WireEnumConstant) {
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
                        constructors.getClass();
                        Object first = ArraysKt___ArraysKt.first(constructors);
                        first.getClass();
                        this.unrecognizedClassConstructor = (Constructor) first;
                    }
                }
            }
        } else {
            for (?? r5 : r2) {
                r5.getClass();
                String name = ((Enum) r5).name();
                linkedHashMap.put(name, r5);
                linkedHashMap.put(String.valueOf(r5.getValue()), r5);
                linkedHashMap2.put(r5, name);
                WireEnumConstant wireEnumConstant3 = (WireEnumConstant) javaClass.getDeclaredField(name).getAnnotation(WireEnumConstant.class);
                if (wireEnumConstant3 != null && wireEnumConstant3.declaredName().length() > 0) {
                    linkedHashMap.put(wireEnumConstant3.declaredName(), r5);
                    linkedHashMap2.put(r5, wireEnumConstant3.declaredName());
                }
            }
        }
        this.stringToValue = linkedHashMap;
        this.valueToString = linkedHashMap2;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public final WireEnum fromString(String str) {
        WireEnum wireEnum = (WireEnum) this.stringToValue.get(str);
        if (wireEnum != null) {
            return wireEnum;
        }
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull == null) {
            return null;
        }
        int intValue = intOrNull.intValue();
        Constructor constructor = this.unrecognizedClassConstructor;
        if (constructor != null) {
            return (WireEnum) constructor.newInstance(Integer.valueOf(intValue));
        }
        return null;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public final Object toStringOrNumber(Object obj) {
        WireEnum wireEnum = (WireEnum) obj;
        wireEnum.getClass();
        String str = (String) this.valueToString.get(wireEnum);
        return str == null ? Integer.valueOf(wireEnum.getValue()) : str;
    }
}
