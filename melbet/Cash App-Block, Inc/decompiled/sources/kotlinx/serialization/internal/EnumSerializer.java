package kotlinx.serialization.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import papa.InteractionRuleClient$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class EnumSerializer implements KSerializer {
    public final /* synthetic */ int $r8$classId = 1;
    public final Lazy descriptor$delegate;
    public Object overriddenDescriptor;
    public final Object values;

    public EnumSerializer(String str, Object obj) {
        obj.getClass();
        this.values = obj;
        this.overriddenDescriptor = EmptyList.INSTANCE;
        this.descriptor$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new InteractionRuleClient$$ExternalSyntheticLambda0(16, str, this));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i = this.$r8$classId;
        Object obj = this.values;
        switch (i) {
            case 0:
                Enum[] enumArr = (Enum[]) obj;
                int decodeEnum = decoder.decodeEnum(getDescriptor());
                if (decodeEnum >= 0 && decodeEnum < enumArr.length) {
                    return enumArr[decodeEnum];
                }
                throw new SerializationException(decodeEnum + " is not among valid " + getDescriptor().getSerialName() + " enum values, values size is " + enumArr.length);
            default:
                SerialDescriptor descriptor = getDescriptor();
                CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
                int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
                if (decodeElementIndex != -1) {
                    throw new SerializationException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(decodeElementIndex, "Unexpected index "));
                }
                beginStructure.endStructure(descriptor);
                return obj;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.$r8$classId) {
        }
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Enum r5 = (Enum) obj;
                r5.getClass();
                Enum[] enumArr = (Enum[]) this.values;
                int indexOf = ArraysKt___ArraysKt.indexOf(enumArr, r5);
                if (indexOf != -1) {
                    encoder.encodeEnum(getDescriptor(), indexOf);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r5);
                String serialName = getDescriptor().getSerialName();
                String arrays = Arrays.toString(enumArr);
                arrays.getClass();
                sb.append(" is not a valid enum ");
                sb.append(serialName);
                sb.append(", must be one of ");
                sb.append(arrays);
                throw new SerializationException(sb.toString());
            default:
                obj.getClass();
                encoder.beginStructure(getDescriptor()).endStructure(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumSerializer(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        obj.getClass();
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this.overriddenDescriptor = asList;
    }

    public EnumSerializer(String str, Enum[] enumArr) {
        str.getClass();
        enumArr.getClass();
        this.values = enumArr;
        this.descriptor$delegate = LazyKt.lazy(new InteractionRuleClient$$ExternalSyntheticLambda0(15, this, str));
    }
}
