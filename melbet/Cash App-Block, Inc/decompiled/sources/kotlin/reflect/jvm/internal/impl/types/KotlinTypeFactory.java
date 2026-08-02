package kotlin.reflect.jvm.internal.impl.types;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import okhttp3.FormBody;

/* loaded from: classes9.dex */
public final class KotlinTypeFactory {
    public static final KotlinTypeFactory INSTANCE = new KotlinTypeFactory();

    public static final SimpleType computeExpandedType(TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> list) {
        typeAliasDescriptor.getClass();
        list.getClass();
        return new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false).expand(TypeAliasExpansion.Companion.create(null, typeAliasDescriptor, list), TypeAttributes.Companion.getEmpty());
    }

    public static final UnwrappedType flexibleType(SimpleType simpleType, SimpleType simpleType2) {
        simpleType.getClass();
        simpleType2.getClass();
        return Intrinsics.areEqual(simpleType, simpleType2) ? simpleType : new FlexibleTypeImpl(simpleType, simpleType2);
    }

    public static final SimpleType integerLiteralType(TypeAttributes typeAttributes, IntegerLiteralTypeConstructor integerLiteralTypeConstructor, boolean z) {
        typeAttributes.getClass();
        integerLiteralTypeConstructor.getClass();
        return simpleTypeWithNonTrivialMemberScope(typeAttributes, integerLiteralTypeConstructor, EmptyList.INSTANCE, z, ErrorUtils.createErrorScope(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    public static FormBody.Builder refineConstructor(TypeConstructor typeConstructor, KotlinTypeRefiner kotlinTypeRefiner, List list) {
        ClassifierDescriptor refineDescriptor;
        ClassifierDescriptor mo4153getDeclarationDescriptor = typeConstructor.mo4153getDeclarationDescriptor();
        Object obj = null;
        if (mo4153getDeclarationDescriptor == null || (refineDescriptor = kotlinTypeRefiner.refineDescriptor(mo4153getDeclarationDescriptor)) == null) {
            return null;
        }
        if (refineDescriptor instanceof TypeAliasDescriptor) {
            return new FormBody.Builder(computeExpandedType((TypeAliasDescriptor) refineDescriptor, list), obj);
        }
        TypeConstructor refine = refineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner);
        refine.getClass();
        return new FormBody.Builder(obj, refine);
    }

    public static final SimpleType simpleNotNullType(TypeAttributes typeAttributes, ClassDescriptor classDescriptor, List<? extends TypeProjection> list) {
        typeAttributes.getClass();
        classDescriptor.getClass();
        list.getClass();
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        typeConstructor.getClass();
        return simpleType$default(typeAttributes, typeConstructor, (List) list, false, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    public static final SimpleType simpleType(final TypeAttributes typeAttributes, final TypeConstructor typeConstructor, final List<? extends TypeProjection> list, final boolean z, KotlinTypeRefiner kotlinTypeRefiner) {
        MemberScope createScopeForKotlinType;
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        if (typeAttributes.isEmpty() && list.isEmpty() && !z && typeConstructor.mo4153getDeclarationDescriptor() != null) {
            ClassifierDescriptor mo4153getDeclarationDescriptor = typeConstructor.mo4153getDeclarationDescriptor();
            mo4153getDeclarationDescriptor.getClass();
            SimpleType defaultType = mo4153getDeclarationDescriptor.getDefaultType();
            defaultType.getClass();
            return defaultType;
        }
        INSTANCE.getClass();
        ClassifierDescriptor mo4153getDeclarationDescriptor2 = typeConstructor.mo4153getDeclarationDescriptor();
        if (mo4153getDeclarationDescriptor2 instanceof TypeParameterDescriptor) {
            createScopeForKotlinType = ((TypeParameterDescriptor) mo4153getDeclarationDescriptor2).getDefaultType().getMemberScope();
        } else if (mo4153getDeclarationDescriptor2 instanceof ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtilsKt.getModule(mo4153getDeclarationDescriptor2));
            }
            createScopeForKotlinType = list.isEmpty() ? ModuleAwareClassDescriptorKt.getRefinedUnsubstitutedMemberScopeIfPossible((ClassDescriptor) mo4153getDeclarationDescriptor2, kotlinTypeRefiner) : ModuleAwareClassDescriptorKt.getRefinedMemberScopeIfPossible((ClassDescriptor) mo4153getDeclarationDescriptor2, TypeConstructorSubstitution.Companion.create(typeConstructor, list), kotlinTypeRefiner);
        } else if (mo4153getDeclarationDescriptor2 instanceof TypeAliasDescriptor) {
            ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
            String name = ((TypeAliasDescriptor) mo4153getDeclarationDescriptor2).getName().toString();
            name.getClass();
            createScopeForKotlinType = ErrorUtils.createErrorScope(errorScopeKind, true, name);
        } else {
            if (!(typeConstructor instanceof IntersectionTypeConstructor)) {
                Drop$$ExternalSyntheticBUOutline0.m("Unsupported classifier: ", mo4153getDeclarationDescriptor2, " for constructor: ", typeConstructor);
                return null;
            }
            createScopeForKotlinType = ((IntersectionTypeConstructor) typeConstructor).createScopeForKotlinType();
        }
        return simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructor, list, z, createScopeForKotlinType, new Function1(typeAttributes, typeConstructor, list, z) { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$$Lambda$0
            public final TypeConstructor arg$0;
            public final List arg$1;
            public final TypeAttributes arg$2;
            public final boolean arg$3;

            {
                this.arg$0 = typeConstructor;
                this.arg$1 = list;
                this.arg$2 = typeAttributes;
                this.arg$3 = z;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinTypeRefiner kotlinTypeRefiner2 = (KotlinTypeRefiner) obj;
                kotlinTypeRefiner2.getClass();
                KotlinTypeFactory.INSTANCE.getClass();
                TypeConstructor typeConstructor2 = this.arg$0;
                List list2 = this.arg$1;
                FormBody.Builder refineConstructor = KotlinTypeFactory.refineConstructor(typeConstructor2, kotlinTypeRefiner2, list2);
                if (refineConstructor == null) {
                    return null;
                }
                SimpleType simpleType = (SimpleType) refineConstructor.names;
                if (simpleType != null) {
                    return simpleType;
                }
                TypeConstructor typeConstructor3 = (TypeConstructor) refineConstructor.values;
                typeConstructor3.getClass();
                return KotlinTypeFactory.simpleType(this.arg$2, typeConstructor3, (List<? extends TypeProjection>) list2, this.arg$3, kotlinTypeRefiner2);
            }
        });
    }

    public static /* synthetic */ SimpleType simpleType$default(SimpleType simpleType, TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            typeAttributes = simpleType.getAttributes();
        }
        if ((i & 4) != 0) {
            typeConstructor = simpleType.getConstructor();
        }
        if ((i & 8) != 0) {
            list = simpleType.getArguments();
        }
        if ((i & 16) != 0) {
            z = simpleType.isMarkedNullable();
        }
        return simpleType(simpleType, typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z);
    }

    public static final SimpleType simpleTypeWithNonTrivialMemberScope(final TypeAttributes typeAttributes, final TypeConstructor typeConstructor, final List<? extends TypeProjection> list, final boolean z, final MemberScope memberScope) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        memberScope.getClass();
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(typeConstructor, list, z, memberScope, new Function1(typeAttributes, typeConstructor, list, z, memberScope) { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$$Lambda$1
            public final TypeConstructor arg$0;
            public final List arg$1;
            public final TypeAttributes arg$2;
            public final boolean arg$3;
            public final MemberScope arg$4;

            {
                this.arg$0 = typeConstructor;
                this.arg$1 = list;
                this.arg$2 = typeAttributes;
                this.arg$3 = z;
                this.arg$4 = memberScope;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
                kotlinTypeRefiner.getClass();
                KotlinTypeFactory.INSTANCE.getClass();
                TypeConstructor typeConstructor2 = this.arg$0;
                List list2 = this.arg$1;
                FormBody.Builder refineConstructor = KotlinTypeFactory.refineConstructor(typeConstructor2, kotlinTypeRefiner, list2);
                if (refineConstructor == null) {
                    return null;
                }
                SimpleType simpleType = (SimpleType) refineConstructor.names;
                if (simpleType != null) {
                    return simpleType;
                }
                TypeConstructor typeConstructor3 = (TypeConstructor) refineConstructor.values;
                typeConstructor3.getClass();
                return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(this.arg$2, typeConstructor3, list2, this.arg$3, this.arg$4);
            }
        });
        return typeAttributes.isEmpty() ? simpleTypeImpl : new SimpleTypeWithAttributes(simpleTypeImpl, typeAttributes);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z, KotlinTypeRefiner kotlinTypeRefiner, int i, Object obj) {
        if ((i & 16) != 0) {
            kotlinTypeRefiner = null;
        }
        return simpleType(typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z, kotlinTypeRefiner);
    }

    public static final SimpleType simpleTypeWithNonTrivialMemberScope(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z, MemberScope memberScope, Function1<? super KotlinTypeRefiner, ? extends SimpleType> function1) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        memberScope.getClass();
        function1.getClass();
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(typeConstructor, list, z, memberScope, function1);
        return typeAttributes.isEmpty() ? simpleTypeImpl : new SimpleTypeWithAttributes(simpleTypeImpl, typeAttributes);
    }

    public static final SimpleType simpleType(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        return simpleType$default(typeAttributes, typeConstructor, list, z, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    public static final SimpleType simpleType(SimpleType simpleType, TypeAttributes typeAttributes, TypeConstructor typeConstructor, List<? extends TypeProjection> list, boolean z) {
        simpleType.getClass();
        typeAttributes.getClass();
        typeConstructor.getClass();
        list.getClass();
        return simpleType$default(typeAttributes, typeConstructor, list, z, (KotlinTypeRefiner) null, 16, (Object) null);
    }
}
