package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;

/* loaded from: classes9.dex */
public class DeserializedPackageMemberScope extends DeserializedMemberScope {
    public final String debugName;
    public final PackageFragmentDescriptor packageDescriptor;
    public final FqName packageFqName;
    public final ProtoBuf.Package proto;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DeserializedPackageMemberScope(PackageFragmentDescriptor packageFragmentDescriptor, ProtoBuf.Package r9, NameResolver nameResolver, BinaryVersion binaryVersion, DeserializedContainerSource deserializedContainerSource, DeserializationComponents deserializationComponents, String str, Function0<? extends Collection<Name>> function0) {
        super(r0, r2, r3, r4, function0);
        packageFragmentDescriptor.getClass();
        r9.getClass();
        nameResolver.getClass();
        binaryVersion.getClass();
        deserializationComponents.getClass();
        str.getClass();
        function0.getClass();
        ProtoBuf.TypeTable typeTable = r9.getTypeTable();
        typeTable.getClass();
        TypeTable typeTable2 = new TypeTable(typeTable);
        VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = r9.getVersionRequirementTable();
        versionRequirementTable.getClass();
        DeserializationContext createContext = deserializationComponents.createContext(packageFragmentDescriptor, nameResolver, typeTable2, companion.create(versionRequirementTable), binaryVersion, deserializedContainerSource);
        List<ProtoBuf.Function> functionList = r9.getFunctionList();
        functionList.getClass();
        List<ProtoBuf.Property> propertyList = r9.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf.TypeAlias> typeAliasList = r9.getTypeAliasList();
        typeAliasList.getClass();
        this.packageDescriptor = packageFragmentDescriptor;
        this.proto = r9;
        this.debugName = str;
        this.packageFqName = packageFragmentDescriptor.getFqName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final void addEnumEntryDescriptors(ArrayList arrayList, Function1 function1) {
        function1.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final ClassId createClassId(Name name) {
        name.getClass();
        return new ClassId(this.packageFqName, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public ClassifierDescriptor mo4154getContributedClassifier(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        mo4157recordLookup(name, lookupLocation);
        return super.mo4154getContributedClassifier(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public List<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        descriptorKindFilter.getClass();
        function1.getClass();
        Collection computeDescriptors = computeDescriptors(descriptorKindFilter, function1, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories = getC().getComponents().getFictitiousClassDescriptorFactories();
        ArrayList arrayList = new ArrayList();
        Iterator<ClassDescriptorFactory> it = fictitiousClassDescriptorFactories.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(it.next().getAllContributedClassesIfPossible(this.packageFqName), arrayList);
        }
        return CollectionsKt.plus((Iterable) arrayList, computeDescriptors);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set getNonDeclaredClassifierNames() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set getNonDeclaredFunctionNames() {
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final Set getNonDeclaredVariableNames() {
        return EmptySet.INSTANCE;
    }

    public final ProtoBuf.Package getProto() {
        return this.proto;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    public final boolean hasClass(Name name) {
        name.getClass();
        if (getClassNames$deserialization().contains(name)) {
            return true;
        }
        Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories = getC().getComponents().getFictitiousClassDescriptorFactories();
        if ((fictitiousClassDescriptorFactories instanceof Collection) && ((Collection) fictitiousClassDescriptorFactories).isEmpty()) {
            return false;
        }
        Iterator<ClassDescriptorFactory> it = fictitiousClassDescriptorFactories.iterator();
        while (it.hasNext()) {
            if (it.next().shouldCreateClass(this.packageFqName, name)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public void mo4157recordLookup(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, this.packageDescriptor, name);
    }

    public String toString() {
        return this.debugName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public /* bridge */ /* synthetic */ Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        return getContributedDescriptors(descriptorKindFilter, (Function1<? super Name, Boolean>) function1);
    }
}
