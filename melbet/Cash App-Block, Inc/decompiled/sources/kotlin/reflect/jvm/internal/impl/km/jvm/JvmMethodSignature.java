package kotlin.reflect.jvm.internal.impl.km.jvm;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class JvmMethodSignature extends JvmMemberSignature {
    public final String descriptor;
    public final String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmMethodSignature(String str, String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.name = str;
        this.descriptor = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JvmMethodSignature)) {
            return false;
        }
        JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) obj;
        return Intrinsics.areEqual(this.name, jvmMethodSignature.name) && Intrinsics.areEqual(this.descriptor, jvmMethodSignature.descriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature
    public String getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.descriptor.hashCode() + (this.name.hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature
    public String toString() {
        return getName() + getDescriptor();
    }
}
