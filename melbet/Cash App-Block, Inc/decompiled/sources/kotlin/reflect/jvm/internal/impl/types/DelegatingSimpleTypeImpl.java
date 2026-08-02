package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes9.dex */
public abstract class DelegatingSimpleTypeImpl extends DelegatingSimpleType {
    public final SimpleType delegate;

    public DelegatingSimpleTypeImpl(SimpleType simpleType) {
        simpleType.getClass();
        this.delegate = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType getDelegate() {
        return this.delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType makeNullableAsSpecified(boolean z) {
        return z == isMarkedNullable() ? this : this.delegate.makeNullableAsSpecified(z).replaceAttributes(getAttributes());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return typeAttributes != getAttributes() ? new SimpleTypeWithAttributes(this, typeAttributes) : this;
    }
}
