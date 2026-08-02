package kotlinx.serialization.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.paging.internal.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.UIntArray;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind$ENUM;
import okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3;
import okio.Utf8;

/* loaded from: classes9.dex */
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {
    public final Lazy elementDescriptors$delegate;
    public final SerialKind$ENUM kind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(String str, int i) {
        super(str, null, i);
        str.getClass();
        this.kind = SerialKind$ENUM.INSTANCE;
        this.elementDescriptors$delegate = LazyKt.lazy(new Http2Connection$$ExternalSyntheticLambda3(i, str, this, 12));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.getKind() == SerialKind$ENUM.INSTANCE && Intrinsics.areEqual(this.serialName, serialDescriptor.getSerialName()) && Intrinsics.areEqual(EnumsKt.cachedSerialNames(this), EnumsKt.cachedSerialNames(serialDescriptor));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor getElementDescriptor(int i) {
        return ((SerialDescriptor[]) this.elementDescriptors$delegate.getValue())[i];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final Utf8 getKind() {
        return this.kind;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        int hashCode = this.serialName.hashCode();
        UIntArray.Iterator iterator = new UIntArray.Iterator(this);
        int i = 1;
        while (iterator.hasNext()) {
            int i2 = i * 31;
            String str = (String) iterator.next();
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final String toString() {
        return CollectionsKt.joinToString$default(new CopyOnWriteArrayList(this, 2), ", ", CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder(), this.serialName, '('), ")", 0, null, null, 56);
    }
}
