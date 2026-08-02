package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes9.dex */
public final class PackagePartScopeCache {
    public final ConcurrentHashMap cache;
    public final ReflectKotlinClassFinder kotlinClassFinder;
    public final DeserializedDescriptorResolver resolver;

    public PackagePartScopeCache(DeserializedDescriptorResolver deserializedDescriptorResolver, ReflectKotlinClassFinder reflectKotlinClassFinder) {
        deserializedDescriptorResolver.getClass();
        reflectKotlinClassFinder.getClass();
        this.resolver = deserializedDescriptorResolver;
        this.kotlinClassFinder = reflectKotlinClassFinder;
        this.cache = new ConcurrentHashMap();
    }

    public final MemberScope getPackagePartScope(ReflectKotlinClass reflectKotlinClass) {
        Collection listOf;
        reflectKotlinClass.getClass();
        ClassId classId = reflectKotlinClass.getClassId();
        ConcurrentHashMap concurrentHashMap = this.cache;
        Object obj = concurrentHashMap.get(classId);
        if (obj == null) {
            FqName packageFqName = reflectKotlinClass.getClassId().getPackageFqName();
            KotlinClassHeader.Kind kind = reflectKotlinClass.getClassHeader().getKind();
            KotlinClassHeader.Kind kind2 = KotlinClassHeader.Kind.MULTIFILE_CLASS;
            DeserializedDescriptorResolver deserializedDescriptorResolver = this.resolver;
            if (kind == kind2) {
                List<String> multifilePartNames = reflectKotlinClass.getClassHeader().getMultifilePartNames();
                listOf = new ArrayList();
                for (String str : multifilePartNames) {
                    ClassId.Companion companion = ClassId.Companion;
                    FqName fqNameForTopLevelClassMaybeWithDollars = JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars();
                    fqNameForTopLevelClassMaybeWithDollars.getClass();
                    KotlinJvmBinaryClass findKotlinClass = KotlinClassFinderKt.findKotlinClass(this.kotlinClassFinder, companion.topLevel(fqNameForTopLevelClassMaybeWithDollars), deserializedDescriptorResolver.getComponents().getConfiguration().getMetadataVersion());
                    if (findKotlinClass != null) {
                        listOf.add(findKotlinClass);
                    }
                }
            } else {
                listOf = CollectionsKt__CollectionsJVMKt.listOf(reflectKotlinClass);
            }
            EmptyPackageFragmentDescriptor emptyPackageFragmentDescriptor = new EmptyPackageFragmentDescriptor(deserializedDescriptorResolver.getComponents().getModuleDescriptor(), packageFqName);
            ArrayList arrayList = new ArrayList();
            Iterator it = listOf.iterator();
            while (it.hasNext()) {
                MemberScope createKotlinPackagePartScope = deserializedDescriptorResolver.createKotlinPackagePartScope(emptyPackageFragmentDescriptor, (KotlinJvmBinaryClass) it.next());
                if (createKotlinPackagePartScope != null) {
                    arrayList.add(createKotlinPackagePartScope);
                }
            }
            List list = CollectionsKt.toList(arrayList);
            MemberScope create = ChainedMemberScope.Companion.create("package " + packageFqName + " (" + reflectKotlinClass + ')', list);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(classId, create);
            obj = putIfAbsent == null ? create : putIfAbsent;
        }
        obj.getClass();
        return (MemberScope) obj;
    }
}
