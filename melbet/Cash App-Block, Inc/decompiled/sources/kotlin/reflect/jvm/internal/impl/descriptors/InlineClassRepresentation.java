package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;

/* loaded from: classes9.dex */
public final class InlineClassRepresentation<Type extends RigidTypeMarker> extends ValueClassRepresentation<Type> {
    public final Name underlyingPropertyName;
    public final RigidTypeMarker underlyingType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassRepresentation(Name name, Type type2) {
        super(null);
        name.getClass();
        type2.getClass();
        this.underlyingPropertyName = name;
        this.underlyingType = type2;
    }

    public final Name getUnderlyingPropertyName() {
        return this.underlyingPropertyName;
    }

    public final Type getUnderlyingType() {
        return (Type) this.underlyingType;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.underlyingPropertyName + ", underlyingType=" + this.underlyingType + ')';
    }
}
