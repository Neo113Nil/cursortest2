package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.TuplesKt;
import okio.Utf8;

/* loaded from: classes3.dex */
public final class WrappedSerialDescriptor implements SerialDescriptor {
    public final SerialDescriptor original;
    public final String serialName;

    public WrappedSerialDescriptor(String str, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.serialName = str;
        this.original = serialDescriptor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrappedSerialDescriptor)) {
            return false;
        }
        WrappedSerialDescriptor wrappedSerialDescriptor = (WrappedSerialDescriptor) obj;
        return this.serialName.equals(wrappedSerialDescriptor.serialName) && Intrinsics.areEqual(this.original, wrappedSerialDescriptor.original);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.original.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getElementAnnotations(int i) {
        return this.original.getElementAnnotations(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor getElementDescriptor(int i) {
        return this.original.getElementDescriptor(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(String str) {
        str.getClass();
        return this.original.getElementIndex(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getElementName(int i) {
        return this.original.getElementName(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.original.getElementsCount();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final Utf8 getKind() {
        return this.original.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String getSerialName() {
        return this.serialName;
    }

    public final int hashCode() {
        return this.original.hashCode() + (this.serialName.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int i) {
        return this.original.isElementOptional(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.original.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isNullable() {
        return this.original.isNullable();
    }

    public final String toString() {
        return TuplesKt.toStringImpl(this);
    }
}
