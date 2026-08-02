package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.SerializationPluginMetadataExtensions;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* loaded from: classes9.dex */
public final class JvmProtoBufUtil {
    public static final ExtensionRegistryLite EXTENSION_REGISTRY;
    public static final JvmProtoBufUtil INSTANCE = new JvmProtoBufUtil();

    static {
        ExtensionRegistryLite newInstance = ExtensionRegistryLite.newInstance();
        JvmProtoBuf.registerAllExtensions(newInstance);
        SerializationPluginMetadataExtensions.registerAllExtensions(newInstance);
        newInstance.getClass();
        EXTENSION_REGISTRY = newInstance;
    }

    public static /* synthetic */ JvmMemberSignature.Field getJvmFieldSignature$default(JvmProtoBufUtil jvmProtoBufUtil, ProtoBuf.Property property, NameResolver nameResolver, TypeTable typeTable, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return jvmProtoBufUtil.getJvmFieldSignature(property, nameResolver, typeTable, z);
    }

    public static final boolean isMovedFromInterfaceCompanion(ProtoBuf.Property property) {
        property.getClass();
        Flags.BooleanFlagField is_moved_from_interface_companion = JvmFlags.INSTANCE.getIS_MOVED_FROM_INTERFACE_COMPANION();
        Object extension = property.getExtension(JvmProtoBuf.flags);
        extension.getClass();
        Boolean bool = is_moved_from_interface_companion.get(((Number) extension).intValue());
        bool.getClass();
        return bool.booleanValue();
    }

    public static String mapTypeDefault(ProtoBuf.Type type2, NameResolver nameResolver) {
        if (type2.hasClassName()) {
            return ClassMapperLite.mapClass(nameResolver.getQualifiedClassName(type2.getClassName()));
        }
        return null;
    }

    public static final Pair<JvmNameResolver, ProtoBuf.Class> readClassDataFrom(byte[] bArr, String[] strArr) {
        bArr.getClass();
        strArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        INSTANCE.getClass();
        ExtensionRegistryLite extensionRegistryLite = EXTENSION_REGISTRY;
        JvmProtoBuf.StringTableTypes parseDelimitedFrom = JvmProtoBuf.StringTableTypes.parseDelimitedFrom(byteArrayInputStream, extensionRegistryLite);
        parseDelimitedFrom.getClass();
        return new Pair<>(new JvmNameResolver(parseDelimitedFrom, strArr), ProtoBuf.Class.parseFrom(byteArrayInputStream, extensionRegistryLite));
    }

    public static final Pair<JvmNameResolver, ProtoBuf.Function> readFunctionDataFrom(String[] strArr, String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.decodeBytes(strArr));
        INSTANCE.getClass();
        ExtensionRegistryLite extensionRegistryLite = EXTENSION_REGISTRY;
        JvmProtoBuf.StringTableTypes parseDelimitedFrom = JvmProtoBuf.StringTableTypes.parseDelimitedFrom(byteArrayInputStream, extensionRegistryLite);
        parseDelimitedFrom.getClass();
        return new Pair<>(new JvmNameResolver(parseDelimitedFrom, strArr2), ProtoBuf.Function.parseFrom(byteArrayInputStream, extensionRegistryLite));
    }

    public static final Pair<JvmNameResolver, ProtoBuf.Package> readPackageDataFrom(byte[] bArr, String[] strArr) {
        bArr.getClass();
        strArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        INSTANCE.getClass();
        ExtensionRegistryLite extensionRegistryLite = EXTENSION_REGISTRY;
        JvmProtoBuf.StringTableTypes parseDelimitedFrom = JvmProtoBuf.StringTableTypes.parseDelimitedFrom(byteArrayInputStream, extensionRegistryLite);
        parseDelimitedFrom.getClass();
        return new Pair<>(new JvmNameResolver(parseDelimitedFrom, strArr), ProtoBuf.Package.parseFrom(byteArrayInputStream, extensionRegistryLite));
    }

    public final ExtensionRegistryLite getEXTENSION_REGISTRY() {
        return EXTENSION_REGISTRY;
    }

    public final JvmMemberSignature.Method getJvmConstructorSignature(ProtoBuf.Constructor constructor, NameResolver nameResolver, TypeTable typeTable) {
        String joinToString$default;
        constructor.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmProtoBuf.JvmMethodSignature> generatedExtension = JvmProtoBuf.constructorSignature;
        generatedExtension.getClass();
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(constructor, generatedExtension);
        String string2 = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? "<init>" : nameResolver.getString(jvmMethodSignature.getName());
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
            valueParameterList.getClass();
            List<ProtoBuf.ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (ProtoBuf.ValueParameter valueParameter : list) {
                JvmProtoBufUtil jvmProtoBufUtil = INSTANCE;
                valueParameter.getClass();
                ProtoBuf.Type type2 = ProtoTypeTableUtilKt.type(valueParameter, typeTable);
                jvmProtoBufUtil.getClass();
                String mapTypeDefault = mapTypeDefault(type2, nameResolver);
                if (mapTypeDefault == null) {
                    return null;
                }
                arrayList.add(mapTypeDefault);
            }
            joinToString$default = CollectionsKt.joinToString$default(arrayList, "", "(", ")V", 0, null, null, 56);
        } else {
            joinToString$default = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new JvmMemberSignature.Method(string2, joinToString$default);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v7 java.lang.String, still in use, count: 2, list:
          (r2v7 java.lang.String) from 0x0053: IF  (r2v7 java.lang.String) == (null java.lang.String)  -> B:23:0x0055 A[HIDDEN]
          (r2v7 java.lang.String) from 0x0056: PHI (r2v8 java.lang.String) = (r2v7 java.lang.String), (r2v10 java.lang.String) binds: [B:20:0x0053, B:15:0x0042] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field getJvmFieldSignature(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r3, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r4, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r5, boolean r6) {
        /*
            r2 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.propertySignature
            r2.getClass()
            java.lang.Object r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(r3, r2)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r2 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r2
            r0 = 0
            if (r2 != 0) goto L18
            goto L55
        L18:
            boolean r1 = r2.hasField()
            if (r1 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r2 = r2.getField()
            goto L24
        L23:
            r2 = r0
        L24:
            if (r2 != 0) goto L29
            if (r6 == 0) goto L29
            goto L55
        L29:
            if (r2 == 0) goto L36
            boolean r6 = r2.hasName()
            if (r6 == 0) goto L36
            int r6 = r2.getName()
            goto L3a
        L36:
            int r6 = r3.getName()
        L3a:
            if (r2 == 0) goto L4b
            boolean r1 = r2.hasDesc()
            if (r1 == 0) goto L4b
            int r2 = r2.getDesc()
            java.lang.String r2 = r4.getString(r2)
            goto L56
        L4b:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.returnType(r3, r5)
            java.lang.String r2 = mapTypeDefault(r2, r4)
            if (r2 != 0) goto L56
        L55:
            return r0
        L56:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field r3 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field
            java.lang.String r4 = r4.getString(r6)
            r3.<init>(r4, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.getJvmFieldSignature(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable, boolean):kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature$Field");
    }

    public final JvmMemberSignature.Method getJvmMethodSignature(ProtoBuf.Function function, NameResolver nameResolver, TypeTable typeTable) {
        String concat;
        function.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmProtoBuf.JvmMethodSignature> generatedExtension = JvmProtoBuf.methodSignature;
        generatedExtension.getClass();
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) ProtoBufUtilKt.getExtensionOrNull(function, generatedExtension);
        int name = (jvmMethodSignature == null || !jvmMethodSignature.hasName()) ? function.getName() : jvmMethodSignature.getName();
        if (jvmMethodSignature == null || !jvmMethodSignature.hasDesc()) {
            List listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(ProtoTypeTableUtilKt.receiverType(function, typeTable));
            List<ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
            valueParameterList.getClass();
            List<ProtoBuf.ValueParameter> list = valueParameterList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (ProtoBuf.ValueParameter valueParameter : list) {
                valueParameter.getClass();
                arrayList.add(ProtoTypeTableUtilKt.type(valueParameter, typeTable));
            }
            ArrayList plus = CollectionsKt.plus((Iterable) arrayList, (Collection) listOfNotNull);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(plus, 10));
            Iterator it = plus.iterator();
            while (it.hasNext()) {
                ProtoBuf.Type type2 = (ProtoBuf.Type) it.next();
                INSTANCE.getClass();
                String mapTypeDefault = mapTypeDefault(type2, nameResolver);
                if (mapTypeDefault == null) {
                    return null;
                }
                arrayList2.add(mapTypeDefault);
            }
            String mapTypeDefault2 = mapTypeDefault(ProtoTypeTableUtilKt.returnType(function, typeTable), nameResolver);
            if (mapTypeDefault2 == null) {
                return null;
            }
            concat = CollectionsKt.joinToString$default(arrayList2, "", "(", ")", 0, null, null, 56).concat(mapTypeDefault2);
        } else {
            concat = nameResolver.getString(jvmMethodSignature.getDesc());
        }
        return new JvmMemberSignature.Method(nameResolver.getString(name), concat);
    }

    public static final Pair<JvmNameResolver, ProtoBuf.Class> readClassDataFrom(String[] strArr, String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        byte[] decodeBytes = BitEncoding.decodeBytes(strArr);
        decodeBytes.getClass();
        return readClassDataFrom(decodeBytes, strArr2);
    }

    public static final Pair<JvmNameResolver, ProtoBuf.Package> readPackageDataFrom(String[] strArr, String[] strArr2) {
        strArr.getClass();
        strArr2.getClass();
        byte[] decodeBytes = BitEncoding.decodeBytes(strArr);
        decodeBytes.getClass();
        return readPackageDataFrom(decodeBytes, strArr2);
    }
}
