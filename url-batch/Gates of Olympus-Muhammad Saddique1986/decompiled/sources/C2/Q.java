package C2;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class Q extends E {

    /* renamed from: b, reason: collision with root package name */
    public final String f720b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(SerialDescriptor serialDescriptor) {
        super(serialDescriptor);
        f2.j.f(serialDescriptor, "primitive");
        this.f720b = serialDescriptor.d() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d() {
        return this.f720b;
    }
}
