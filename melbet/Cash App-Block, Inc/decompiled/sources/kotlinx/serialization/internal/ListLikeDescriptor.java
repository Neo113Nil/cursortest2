package kotlinx.serialization.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import okio.Utf8;

/* loaded from: classes3.dex */
public abstract class ListLikeDescriptor implements SerialDescriptor {
    public final SerialDescriptor elementDescriptor;

    public ListLikeDescriptor(SerialDescriptor serialDescriptor) {
        this.elementDescriptor = serialDescriptor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListLikeDescriptor)) {
            return false;
        }
        ListLikeDescriptor listLikeDescriptor = (ListLikeDescriptor) obj;
        return Intrinsics.areEqual(this.elementDescriptor, listLikeDescriptor.elementDescriptor) && Intrinsics.areEqual(getSerialName(), listLikeDescriptor.getSerialName());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getElementAnnotations(int i) {
        if (i >= 0) {
            return EmptyList.INSTANCE;
        }
        Drop$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Illegal index ", ", "), getSerialName(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor getElementDescriptor(int i) {
        if (i >= 0) {
            return this.elementDescriptor;
        }
        Drop$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Illegal index ", ", "), getSerialName(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(String str) {
        str.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m$1(str, " is not a valid list index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getElementName(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final Utf8 getKind() {
        return StructureKind.MAP.INSTANCE$1;
    }

    public final int hashCode() {
        return getSerialName().hashCode() + (this.elementDescriptor.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int i) {
        if (i >= 0) {
            return false;
        }
        Drop$$ExternalSyntheticBUOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Illegal index ", ", "), getSerialName(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return getSerialName() + '(' + this.elementDescriptor + ')';
    }
}
