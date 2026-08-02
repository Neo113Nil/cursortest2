package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* loaded from: classes9.dex */
public final class AbbreviatedType extends DelegatingSimpleType {
    public final SimpleType abbreviation;
    public final SimpleType delegate;

    public AbbreviatedType(SimpleType simpleType, SimpleType simpleType2) {
        simpleType.getClass();
        simpleType2.getClass();
        this.delegate = simpleType;
        this.abbreviation = simpleType2;
    }

    public final SimpleType getAbbreviation() {
        return this.abbreviation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final SimpleType getDelegate() {
        return this.delegate;
    }

    public final SimpleType getExpandedType() {
        return this.delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public AbbreviatedType makeNullableAsSpecified(boolean z) {
        return new AbbreviatedType(this.delegate.makeNullableAsSpecified(z), this.abbreviation.makeNullableAsSpecified(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public AbbreviatedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        KotlinType refineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) this.delegate);
        refineType.getClass();
        KotlinType refineType2 = kotlinTypeRefiner.refineType((KotlinTypeMarker) this.abbreviation);
        refineType2.getClass();
        return new AbbreviatedType((SimpleType) refineType, (SimpleType) refineType2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new AbbreviatedType(this.delegate.replaceAttributes(typeAttributes), this.abbreviation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public AbbreviatedType replaceDelegate(SimpleType simpleType) {
        simpleType.getClass();
        return new AbbreviatedType(simpleType, this.abbreviation);
    }
}
