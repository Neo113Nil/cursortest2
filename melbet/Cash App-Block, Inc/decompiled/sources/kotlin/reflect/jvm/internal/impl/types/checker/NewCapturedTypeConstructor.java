package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.KotlinKParameter$$Lambda$1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.types.DescriptorKType$$Lambda$1;

/* loaded from: classes9.dex */
public final class NewCapturedTypeConstructor implements CapturedTypeConstructor {
    public final Lazy _supertypes$delegate;
    public final NewCapturedTypeConstructor original;
    public final TypeProjection projection;
    public Function0 supertypesComputation;
    public final TypeParameterDescriptor typeParameter;

    public NewCapturedTypeConstructor(TypeProjection typeProjection, Function0<? extends List<? extends UnwrappedType>> function0, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor) {
        typeProjection.getClass();
        this.projection = typeProjection;
        this.supertypesComputation = function0;
        this.original = newCapturedTypeConstructor;
        this.typeParameter = typeParameterDescriptor;
        this._supertypes$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new KotlinKParameter$$Lambda$1(this, 1));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NewCapturedTypeConstructor.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.original;
        if (newCapturedTypeConstructor2 != null) {
            this = newCapturedTypeConstructor2;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.original;
        if (newCapturedTypeConstructor3 != null) {
            obj = newCapturedTypeConstructor3;
        }
        return this == obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinType type2 = getProjection().getType();
        type2.getClass();
        return TypeUtilsKt.getBuiltIns(type2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo4153getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public TypeProjection getProjection() {
        return this.projection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<UnwrappedType> getSupertypes() {
        List<UnwrappedType> list = (List) this._supertypes$delegate.getValue();
        return list == null ? EmptyList.INSTANCE : list;
    }

    public int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.original;
        return newCapturedTypeConstructor != null ? newCapturedTypeConstructor.hashCode() : super.hashCode();
    }

    public final void initializeSupertypes(List<? extends UnwrappedType> list) {
        list.getClass();
        this.supertypesComputation = new FunctionDescriptorImpl.AnonymousClass2(list, 2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public NewCapturedTypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        TypeProjection refine = getProjection().refine(kotlinTypeRefiner);
        refine.getClass();
        DescriptorKType$$Lambda$1 descriptorKType$$Lambda$1 = this.supertypesComputation != null ? new DescriptorKType$$Lambda$1(1, this, kotlinTypeRefiner) : null;
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.original;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new NewCapturedTypeConstructor(refine, descriptorKType$$Lambda$1, newCapturedTypeConstructor, this.typeParameter);
    }

    public String toString() {
        return "CapturedType(" + getProjection() + ')';
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, Function0 function0, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : newCapturedTypeConstructor, (i & 8) != 0 ? null : typeParameterDescriptor);
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, List list, NewCapturedTypeConstructor newCapturedTypeConstructor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, list, (i & 4) != 0 ? null : newCapturedTypeConstructor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor(TypeProjection typeProjection, List<? extends UnwrappedType> list, NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this(typeProjection, new FunctionDescriptorImpl.AnonymousClass2(list, 1), newCapturedTypeConstructor, null, 8, null);
        typeProjection.getClass();
        list.getClass();
    }
}
