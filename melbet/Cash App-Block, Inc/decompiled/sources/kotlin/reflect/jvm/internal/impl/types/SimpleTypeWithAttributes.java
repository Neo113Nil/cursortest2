package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes9.dex */
public final class SimpleTypeWithAttributes extends DelegatingSimpleTypeImpl {
    public final TypeAttributes attributes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleTypeWithAttributes(SimpleType simpleType, TypeAttributes typeAttributes) {
        super(simpleType);
        typeAttributes.getClass();
        this.attributes = typeAttributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes getAttributes() {
        return this.attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType replaceDelegate(SimpleType simpleType) {
        simpleType.getClass();
        return new SimpleTypeWithAttributes(simpleType, this.attributes);
    }
}
