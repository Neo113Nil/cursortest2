package com.stripe.android.core.model.serializers;

import java.util.LinkedHashMap;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import okhttp3.internal.Tags;

/* loaded from: classes8.dex */
public abstract class EnumIgnoreUnknownSerializer implements KSerializer {
    public final Enum defaultValue;
    public final PrimitiveSerialDescriptor descriptor;
    public final LinkedHashMap lookup;
    public final LinkedHashMap revLookup;

    public EnumIgnoreUnknownSerializer(Enum[] enumArr, Enum r10) {
        String name;
        String name2;
        enumArr.getClass();
        r10.getClass();
        this.defaultValue = r10;
        String qualifiedName = Reflection.factory.getOrCreateKotlinClass(ArraysKt___ArraysKt.first(enumArr).getClass()).getQualifiedName();
        qualifiedName.getClass();
        this.descriptor = Tags.PrimitiveSerialDescriptor(qualifiedName, PrimitiveKind$INT.INSTANCE$8);
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(enumArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        for (Enum r5 : enumArr) {
            SerialName serialName = (SerialName) r5.getClass().getField(r5.name()).getAnnotation(SerialName.class);
            if (serialName == null || (name2 = serialName.value()) == null) {
                name2 = r5.name();
            }
            linkedHashMap.put(r5, name2);
        }
        this.lookup = linkedHashMap;
        int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(enumArr.length);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
        for (Enum r1 : enumArr) {
            SerialName serialName2 = (SerialName) r1.getClass().getField(r1.name()).getAnnotation(SerialName.class);
            if (serialName2 == null || (name = serialName2.value()) == null) {
                name = r1.name();
            }
            linkedHashMap2.put(name, r1);
        }
        this.revLookup = linkedHashMap2;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Enum r2 = (Enum) this.revLookup.get(decoder.decodeString());
        return r2 == null ? this.defaultValue : r2;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Enum r2 = (Enum) obj;
        r2.getClass();
        encoder.encodeString((String) MapsKt__MapsKt.getValue(this.lookup, r2));
    }
}
