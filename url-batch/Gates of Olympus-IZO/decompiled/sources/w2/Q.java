package w2;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class Q extends E {

    /* renamed from: b, reason: collision with root package name */
    public final String f8633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(SerialDescriptor serialDescriptor) {
        super(serialDescriptor);
        Z1.i.f(serialDescriptor, "primitive");
        this.f8633b = serialDescriptor.d() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f8633b;
    }
}
