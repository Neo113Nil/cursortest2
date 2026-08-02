package kotlinx.serialization.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import okio.Utf8;

/* loaded from: classes9.dex */
public abstract class TuplesKt {
    public static final KSerializer[] EMPTY_SERIALIZER_ARRAY = new KSerializer[0];
    public static final Object NULL = new Object();

    public static final int hashCodeImpl(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        serialDescriptorArr.getClass();
        int hashCode = (serialDescriptor.getSerialName().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int elementsCount = serialDescriptor.getElementsCount();
        int i = 1;
        while (true) {
            int i2 = 0;
            if (!(elementsCount > 0)) {
                break;
            }
            int i3 = elementsCount - 1;
            int i4 = i * 31;
            String serialName = serialDescriptor.getElementDescriptor(serialDescriptor.getElementsCount() - elementsCount).getSerialName();
            if (serialName != null) {
                i2 = serialName.hashCode();
            }
            i = i4 + i2;
            elementsCount = i3;
        }
        int elementsCount2 = serialDescriptor.getElementsCount();
        int i5 = 1;
        while (true) {
            if (!(elementsCount2 > 0)) {
                return (((hashCode * 31) + i) * 31) + i5;
            }
            int i6 = elementsCount2 - 1;
            int i7 = i5 * 31;
            Utf8 kind = serialDescriptor.getElementDescriptor(serialDescriptor.getElementsCount() - elementsCount2).getKind();
            i5 = i7 + (kind != null ? kind.hashCode() : 0);
            elementsCount2 = i6;
        }
    }

    public static final void throwMissingFieldException(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(serialDescriptor.getElementName(i4));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(serialDescriptor.getSerialName(), arrayList);
    }

    public static final void throwSubtypeNotRegistered(String str, KClass kClass) {
        String sb;
        kClass.getClass();
        String str2 = "in the polymorphic scope of '" + kClass.getSimpleName() + '\'';
        if (str == null) {
            sb = JsonLogicResult$Success$$ExternalSyntheticOutline0.m('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            Boxes$$ExternalSyntheticOutline1.m(m, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            m.append(kClass.getSimpleName());
            m.append("' has to be sealed and '@Serializable'.");
            sb = m.toString();
        }
        throw new SerializationException(sb);
    }

    public static final String toStringImpl(SerialDescriptor serialDescriptor) {
        return CollectionsKt.joinToString$default(RangesKt___RangesKt.until(0, serialDescriptor.getElementsCount()), ", ", serialDescriptor.getSerialName() + '(', ")", 0, null, new ForwardingFileSystem$$ExternalSyntheticLambda0(serialDescriptor, 21), 24);
    }
}
