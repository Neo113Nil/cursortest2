package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class Q extends E {

    /* renamed from: b, reason: collision with root package name */
    public final String f7042b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(SerialDescriptor primitive) {
        super(primitive);
        Intrinsics.checkNotNullParameter(primitive, "primitive");
        this.f7042b = primitive.d() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f7042b;
    }
}
