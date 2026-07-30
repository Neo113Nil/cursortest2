package o7;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r0 extends e0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f6938b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(SerialDescriptor serialDescriptor) {
        super(serialDescriptor);
        r6.k.f(serialDescriptor, "primitive");
        this.f6938b = serialDescriptor.b() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String b() {
        return this.f6938b;
    }
}
