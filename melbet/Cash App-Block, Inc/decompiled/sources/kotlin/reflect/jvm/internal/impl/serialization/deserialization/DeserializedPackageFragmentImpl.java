package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {
    public DeserializedPackageMemberScope _memberScope;
    public ProtoBuf.PackageFragment _proto;
    public final ProtoBasedClassDataFinder classDataFinder;
    public final DeserializedContainerSource containerSource;
    public final BinaryVersion metadataVersion;
    public final NameResolverImpl nameResolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor moduleDescriptor, ProtoBuf.PackageFragment packageFragment, BinaryVersion binaryVersion, DeserializedContainerSource deserializedContainerSource) {
        super(fqName, storageManager, moduleDescriptor);
        fqName.getClass();
        storageManager.getClass();
        moduleDescriptor.getClass();
        packageFragment.getClass();
        binaryVersion.getClass();
        this.metadataVersion = binaryVersion;
        this.containerSource = deserializedContainerSource;
        ProtoBuf.StringTable strings = packageFragment.getStrings();
        strings.getClass();
        ProtoBuf.QualifiedNameTable qualifiedNames = packageFragment.getQualifiedNames();
        qualifiedNames.getClass();
        NameResolverImpl nameResolverImpl = new NameResolverImpl(strings, qualifiedNames);
        this.nameResolver = nameResolverImpl;
        this.classDataFinder = new ProtoBasedClassDataFinder(packageFragment, nameResolverImpl, binaryVersion, new TasksKt$awaitImpl$2$2(this, 21));
        this._proto = packageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public MemberScope getMemberScope() {
        DeserializedPackageMemberScope deserializedPackageMemberScope = this._memberScope;
        if (deserializedPackageMemberScope != null) {
            return deserializedPackageMemberScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_memberScope");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public void initialize(DeserializationComponents deserializationComponents) {
        deserializationComponents.getClass();
        ProtoBuf.PackageFragment packageFragment = this._proto;
        if (packageFragment == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this._proto = null;
        ProtoBuf.Package r4 = packageFragment.getPackage();
        r4.getClass();
        this._memberScope = new DeserializedPackageMemberScope(this, r4, this.nameResolver, this.metadataVersion, this.containerSource, deserializationComponents, "scope of " + this, new KotlinKPropertyN$$Lambda$0(this, 23));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public ProtoBasedClassDataFinder getClassDataFinder() {
        return this.classDataFinder;
    }
}
