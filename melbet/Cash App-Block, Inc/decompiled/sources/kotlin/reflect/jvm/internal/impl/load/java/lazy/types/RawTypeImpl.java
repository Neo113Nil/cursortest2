package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.StringsKt;
import org.slf4j.Marker;

/* loaded from: classes9.dex */
public final class RawTypeImpl extends FlexibleType implements RawType {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(SimpleType simpleType, SimpleType simpleType2) {
        super(simpleType, simpleType2);
        simpleType.getClass();
        simpleType2.getClass();
        KotlinTypeChecker.DEFAULT.isSubtypeOf(simpleType, simpleType2);
    }

    public static final ArrayList render$renderArguments(DescriptorRenderer descriptorRenderer, SimpleType simpleType) {
        List<TypeProjection> arguments = simpleType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10));
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(descriptorRenderer.renderTypeProjection((TypeProjection) it.next()));
        }
        return arrayList;
    }

    public static final String render$replaceArgs(String str, String str2) {
        if (!StringsKt.contains((CharSequence) str, '<', false)) {
            return str;
        }
        return StringsKt.substringBefore$default(str, '<') + '<' + str2 + '>' + StringsKt.substringAfterLast('>', str, str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public SimpleType getDelegate() {
        return getLowerBound();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        ClassifierDescriptor mo4153getDeclarationDescriptor = getConstructor().mo4153getDeclarationDescriptor();
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = null;
        Object[] objArr = 0;
        ClassDescriptor classDescriptor = mo4153getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo4153getDeclarationDescriptor : null;
        if (classDescriptor == null) {
            a$$ExternalSyntheticBUOutline0.m(getConstructor().mo4153getDeclarationDescriptor(), "Incorrect classifier: ");
            return null;
        }
        MemberScope memberScope = classDescriptor.getMemberScope(new RawSubstitution(typeParameterUpperBoundEraser, 1, objArr == true ? 1 : 0));
        memberScope.getClass();
        return memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public RawTypeImpl makeNullableAsSpecified(boolean z) {
        return new RawTypeImpl(getLowerBound().makeNullableAsSpecified(z), getUpperBound().makeNullableAsSpecified(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public FlexibleType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        KotlinType refineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getLowerBound());
        refineType.getClass();
        KotlinType refineType2 = kotlinTypeRefiner.refineType((KotlinTypeMarker) getUpperBound());
        refineType2.getClass();
        return new RawTypeImpl((SimpleType) refineType, (SimpleType) refineType2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public String render(DescriptorRenderer descriptorRenderer, DescriptorRendererOptions descriptorRendererOptions) {
        descriptorRenderer.getClass();
        descriptorRendererOptions.getClass();
        String renderType = descriptorRenderer.renderType(getLowerBound());
        String renderType2 = descriptorRenderer.renderType(getUpperBound());
        if (descriptorRendererOptions.getDebugMode()) {
            return "raw (" + renderType + ".." + renderType2 + ')';
        }
        if (getUpperBound().getArguments().isEmpty()) {
            return descriptorRenderer.renderFlexibleType(renderType, renderType2, TypeUtilsKt.getBuiltIns(this));
        }
        ArrayList render$renderArguments = render$renderArguments(descriptorRenderer, getLowerBound());
        ArrayList render$renderArguments2 = render$renderArguments(descriptorRenderer, getUpperBound());
        String joinToString$default = CollectionsKt.joinToString$default(render$renderArguments, ", ", null, null, 0, null, RawTypeImpl$$Lambda$0.INSTANCE, 30);
        ArrayList zip = CollectionsKt.zip(render$renderArguments, render$renderArguments2);
        if (!zip.isEmpty()) {
            Iterator it = zip.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.first;
                String str2 = (String) pair.second;
                if (!Intrinsics.areEqual(str, StringsKt.removePrefix("out ", str2)) && !str2.equals(Marker.ANY_MARKER)) {
                    break;
                }
            }
        }
        renderType2 = render$replaceArgs(renderType2, joinToString$default);
        String render$replaceArgs = render$replaceArgs(renderType, joinToString$default);
        return render$replaceArgs.equals(renderType2) ? render$replaceArgs : descriptorRenderer.renderFlexibleType(render$replaceArgs, renderType2, TypeUtilsKt.getBuiltIns(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public RawTypeImpl replaceAttributes(TypeAttributes typeAttributes) {
        typeAttributes.getClass();
        return new RawTypeImpl(getLowerBound().replaceAttributes(typeAttributes), getUpperBound().replaceAttributes(typeAttributes));
    }
}
