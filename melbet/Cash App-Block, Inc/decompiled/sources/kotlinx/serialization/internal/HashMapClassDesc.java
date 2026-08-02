package kotlinx.serialization.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Utf8;

/* loaded from: classes9.dex */
public final class HashMapClassDesc implements SerialDescriptor {
    public final SerialDescriptor keyDescriptor;
    public final String serialName;
    public final SerialDescriptor valueDescriptor;

    public HashMapClassDesc(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.serialName = str;
        this.keyDescriptor = serialDescriptor;
        this.valueDescriptor = serialDescriptor2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HashMapClassDesc)) {
            return false;
        }
        HashMapClassDesc hashMapClassDesc = (HashMapClassDesc) obj;
        return this.serialName.equals(hashMapClassDesc.serialName) && this.keyDescriptor.equals(hashMapClassDesc.keyDescriptor) && this.valueDescriptor.equals(hashMapClassDesc.valueDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getElementAnnotations(int i) {
        if (i >= 0) {
            return EmptyList.INSTANCE;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Illegal index ", ", "), this.serialName, " expects only non-negative indices"));
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor getElementDescriptor(int i) {
        if (i < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Illegal index ", ", "), this.serialName, " expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.keyDescriptor;
        }
        if (i2 == 1) {
            return this.valueDescriptor;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Unreached");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(String str) {
        str.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m$1(str, " is not a valid map index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getElementName(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final Utf8 getKind() {
        return StructureKind.MAP.INSTANCE;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getSerialName() {
        return this.serialName;
    }

    public final int hashCode() {
        return this.valueDescriptor.hashCode() + ((this.keyDescriptor.hashCode() + (this.serialName.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int i) {
        if (i >= 0) {
            return false;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Illegal index ", ", "), this.serialName, " expects only non-negative indices"));
        return false;
    }

    public final String toString() {
        return this.serialName + '(' + this.keyDescriptor + ", " + this.valueDescriptor + ')';
    }
}
