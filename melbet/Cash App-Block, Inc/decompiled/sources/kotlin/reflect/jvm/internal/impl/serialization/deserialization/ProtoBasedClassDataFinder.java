package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes9.dex */
public final class ProtoBasedClassDataFinder implements ClassDataFinder {
    public final LinkedHashMap classIdToProto;
    public final Function1 classSource;
    public final BinaryVersion metadataVersion;
    public final NameResolver nameResolver;

    public ProtoBasedClassDataFinder(ProtoBuf.PackageFragment packageFragment, NameResolver nameResolver, BinaryVersion binaryVersion, Function1<? super ClassId, ? extends SourceElement> function1) {
        packageFragment.getClass();
        nameResolver.getClass();
        binaryVersion.getClass();
        function1.getClass();
        this.nameResolver = nameResolver;
        this.metadataVersion = binaryVersion;
        this.classSource = function1;
        List<ProtoBuf.Class> class_List = packageFragment.getClass_List();
        class_List.getClass();
        List<ProtoBuf.Class> list = class_List;
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        for (Object obj : list) {
            linkedHashMap.put(NameResolverUtilKt.getClassId(this.nameResolver, ((ProtoBuf.Class) obj).getFqName()), obj);
        }
        this.classIdToProto = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public ClassData findClassData(ClassId classId) {
        classId.getClass();
        ProtoBuf.Class r0 = (ProtoBuf.Class) this.classIdToProto.get(classId);
        if (r0 == null) {
            return null;
        }
        return new ClassData(this.nameResolver, r0, this.metadataVersion, (SourceElement) this.classSource.invoke(classId));
    }

    public final Collection<ClassId> getAllClassIds() {
        return this.classIdToProto.keySet();
    }
}
