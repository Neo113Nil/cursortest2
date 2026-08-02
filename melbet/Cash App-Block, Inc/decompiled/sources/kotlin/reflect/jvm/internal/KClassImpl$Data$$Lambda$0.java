package kotlin.reflect.jvm.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.MapComposeViewRenderKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.ClassKind;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmClassifier;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeParameter;
import kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt;
import kotlin.reflect.jvm.internal.impl.km.jvm.KotlinClassMetadata;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.reflect.jvm.internal.types.DescriptorKType;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public final class KClassImpl$Data$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final Object arg$0;
    public final Object arg$1;

    public /* synthetic */ KClassImpl$Data$$Lambda$0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.arg$1 = obj;
        this.arg$0 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0099  */
    /* JADX WARN: Type inference failed for: r13v104 */
    /* JADX WARN: Type inference failed for: r13v105 */
    /* JADX WARN: Type inference failed for: r13v98 */
    /* JADX WARN: Type inference failed for: r1v24, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        String name;
        Class loadClass;
        Object obj;
        KType kType;
        KType kType2;
        ArrayList arrayList;
        Class loadClass2;
        KClass kClass;
        KClassImpl kClassImpl;
        Lazy lazy;
        KClassImpl.Data data;
        int i = this.$r8$classId;
        int i2 = 0;
        ArrayList arrayList2 = null;
        r4 = null;
        r4 = null;
        IOException iOException = null;
        r4 = null;
        r4 = null;
        TypeParameterTable typeParameterTable = null;
        Object obj2 = this.arg$0;
        Object obj3 = this.arg$1;
        switch (i) {
            case 0:
                KClassImpl kClassImpl2 = (KClassImpl) obj2;
                KClassImpl.Data data2 = (KClassImpl.Data) obj3;
                if (SystemPropertiesKt.loadMetadataDirectly) {
                    Metadata metadata = (Metadata) kClassImpl2.jClass.getAnnotation(Metadata.class);
                    if (metadata == null) {
                        return null;
                    }
                    KotlinClassMetadata readLenient = KotlinClassMetadata.Companion.readLenient(metadata);
                    KotlinClassMetadata.Class r13 = readLenient instanceof KotlinClassMetadata.Class ? (KotlinClassMetadata.Class) readLenient : null;
                    if (r13 != null) {
                        return r13.getKmClass();
                    }
                    return null;
                }
                ClassDescriptor descriptor = data2.getDescriptor();
                if (!(descriptor instanceof FunctionClassDescriptor)) {
                    DeserializedClassDescriptor deserializedClassDescriptor = descriptor instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) descriptor : null;
                    if (deserializedClassDescriptor != null) {
                        return ReadersKt.toKmClass$default(deserializedClassDescriptor.getClassProto(), deserializedClassDescriptor.getC().getNameResolver(), false, null, 6, null);
                    }
                    return null;
                }
                FunctionClassDescriptor functionClassDescriptor = (FunctionClassDescriptor) descriptor;
                if (functionClassDescriptor.getFunctionTypeKind() instanceof FunctionTypeKind.Function) {
                    return BuiltinsKt.createFunctionKmClass(functionClassDescriptor.getArity());
                }
                throw new KotlinReflectionInternalError("Unsupported function type kind: " + functionClassDescriptor.getFunctionTypeKind() + " (" + descriptor + ')');
            case 1:
                KClassImpl kClassImpl3 = (KClassImpl) obj2;
                KClassImpl.Data data3 = (KClassImpl.Data) obj3;
                Class cls = kClassImpl3.jClass;
                if (Intrinsics.areEqual(cls, Object.class)) {
                    return EmptyList.INSTANCE;
                }
                if (SystemPropertiesKt.useK1Implementation) {
                    Collection<KotlinType> supertypes = data3.getDescriptor().getTypeConstructor().getSupertypes();
                    supertypes.getClass();
                    ArrayList arrayList3 = new ArrayList(supertypes.size());
                    KClassImpl kClassImpl4 = KClassImpl.this;
                    for (KotlinType kotlinType : supertypes) {
                        kotlinType.getClass();
                        arrayList3.add(new DescriptorKType(kotlinType, new KClassImpl$Data$$Lambda$22(i2, kotlinType, kClassImpl4)));
                    }
                    if (!KotlinBuiltIns.isSpecialClassWithNoSupertypes(data3.getDescriptor())) {
                        if (!arrayList3.isEmpty()) {
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                KClassifier classifier = ((KType) it.next()).getClassifier();
                                KClassImpl kClassImpl5 = classifier instanceof KClassImpl ? (KClassImpl) classifier : null;
                                if (kClassImpl5 != null && (kClassImpl5.getClassKind$kotlin_reflection() == ClassKind.INTERFACE || kClassImpl5.getClassKind$kotlin_reflection() == ClassKind.ANNOTATION_CLASS)) {
                                }
                            }
                        }
                        arrayList3.add(StandardKTypes.getANY());
                    }
                    return CollectionsKt.compact(arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                KmClass kmClass = data3.getKmClass();
                List<KmType> supertypes2 = kmClass != null ? kmClass.getSupertypes() : null;
                if (supertypes2 != null) {
                    for (KmType kmType : supertypes2) {
                        KmClassifier classifier2 = kmType.getClassifier();
                        KmClassifier.Class r8 = classifier2 instanceof KmClassifier.Class ? (KmClassifier.Class) classifier2 : null;
                        if (r8 == null || (name = r8.getName()) == null) {
                            StringBuilder sb = new StringBuilder("Supertype of ");
                            sb.append(kClassImpl3);
                            KmClassifier classifier3 = kmType.getClassifier();
                            sb.append(" not a class: ");
                            sb.append(classifier3);
                            throw new KotlinReflectionInternalError(sb.toString());
                        }
                        ClassId classId = ConvertFromMetadataKt.toClassId(name);
                        loadClass = UtilKt.loadClass(ReflectClassUtilKt.getSafeClassLoader(cls), classId, 0);
                        if (loadClass == null) {
                            throw new KotlinReflectionInternalError("Unsupported superclass of " + kClassImpl3 + ": " + classId);
                        }
                        arrayList4.add(ConvertFromMetadataKt.toKType(kmType, ReflectClassUtilKt.getSafeClassLoader(cls), data3.getTypeParameterTable$kotlin_reflection(), new KClassImpl$Data$$Lambda$23(i2, kClassImpl3, loadClass, classId)));
                    }
                    if (cls.isArray()) {
                        arrayList4.add(StandardKTypes.getCLONEABLE());
                    }
                    if (Serializable.class.isAssignableFrom(cls) && !arrayList4.contains(StandardKTypes.getSERIALIZABLE())) {
                        ReflectProperties$LazySoftVal reflectProperties$LazySoftVal = data3.qualifiedName$delegate;
                        KProperty kProperty = KClassImpl.Data.$$delegatedProperties[3];
                        String str = (String) reflectProperties$LazySoftVal.invoke();
                        if (str != null && StringsKt__StringsJVMKt.startsWith(str, "kotlin.", false)) {
                            arrayList4.add(StandardKTypes.getSERIALIZABLE());
                        }
                    }
                } else {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    if (genericSuperclass != null) {
                        if (genericSuperclass.equals(Object.class)) {
                            genericSuperclass = null;
                        }
                        if (genericSuperclass != null) {
                            EmptyMap emptyMap = EmptyMap.INSTANCE;
                            emptyMap.getClass();
                            arrayList4.add(ConvertFromJavaKt.toKType$default(genericSuperclass, emptyMap, TypeNullability.NOT_NULL, false, 4));
                        }
                    }
                    Type[] genericInterfaces = cls.getGenericInterfaces();
                    genericInterfaces.getClass();
                    for (Type type2 : genericInterfaces) {
                        type2.getClass();
                        EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                        emptyMap2.getClass();
                        arrayList4.add(ConvertFromJavaKt.toKType$default(type2, emptyMap2, TypeNullability.NOT_NULL, false, 4));
                    }
                }
                if (!arrayList4.isEmpty()) {
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        KClassifier classifier4 = ((KType) it2.next()).getClassifier();
                        KClassImpl kClassImpl6 = classifier4 instanceof KClassImpl ? (KClassImpl) classifier4 : null;
                        if (kClassImpl6 != null && (kClassImpl6.getClassKind$kotlin_reflection() == ClassKind.INTERFACE || kClassImpl6.getClassKind$kotlin_reflection() == ClassKind.ANNOTATION_CLASS)) {
                        }
                        return CollectionsKt.compact(arrayList4);
                        break;
                    }
                }
                arrayList4.add(StandardKTypes.getANY());
                return CollectionsKt.compact(arrayList4);
            case 2:
                Class<?> cls2 = ((KClassImpl) obj2).jClass;
                ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(cls2);
                KmClass kmClass2 = ((KClassImpl.Data) obj3).getKmClass();
                if (kmClass2 != null) {
                    List<String> sealedSubclasses = kmClass2.getSealedSubclasses();
                    obj = new ArrayList();
                    Iterator<T> it3 = sealedSubclasses.iterator();
                    while (it3.hasNext()) {
                        KClass loadKClass = ConvertFromMetadataKt.loadKClass(safeClassLoader, (String) it3.next());
                        if (loadKClass != null) {
                            obj.add(loadKClass);
                        }
                    }
                } else {
                    Java16SealedRecordLoader java16SealedRecordLoader = Java16SealedRecordLoader.INSTANCE;
                    if (Intrinsics.areEqual(java16SealedRecordLoader.loadIsSealed(cls2), Boolean.TRUE)) {
                        Class<?>[] loadGetPermittedSubclasses = java16SealedRecordLoader.loadGetPermittedSubclasses(cls2);
                        if (loadGetPermittedSubclasses != null) {
                            arrayList2 = new ArrayList(loadGetPermittedSubclasses.length);
                            int length = loadGetPermittedSubclasses.length;
                            while (i2 < length) {
                                arrayList2.add(PapaEvent.getKotlinClass(loadGetPermittedSubclasses[i2]));
                                i2++;
                            }
                        }
                        obj = arrayList2 == null ? EmptyList.INSTANCE : arrayList2;
                    } else {
                        obj = EmptyList.INSTANCE;
                    }
                }
                obj.getClass();
                return obj;
            case 3:
                KClassImpl.Data data4 = (KClassImpl.Data) obj3;
                Class cls3 = ((KClassImpl) obj2).jClass;
                KmClass kmClass3 = data4.getKmClass();
                if (kmClass3 == null || !Attributes.isValue(kmClass3)) {
                    return null;
                }
                if (kmClass3.getInlineClassUnderlyingType() != null) {
                    KmType inlineClassUnderlyingType = kmClass3.getInlineClassUnderlyingType();
                    if (inlineClassUnderlyingType == null) {
                        return null;
                    }
                    ClassLoader classLoader = cls3.getClassLoader();
                    classLoader.getClass();
                    kType2 = ConvertFromMetadataKt.toKType(inlineClassUnderlyingType, classLoader, data4.getTypeParameterTable$kotlin_reflection(), null);
                    return kType2;
                }
                Object obj4 = null;
                for (Object obj5 : kmClass3.getProperties()) {
                    KmProperty kmProperty = (KmProperty) obj5;
                    if (Intrinsics.areEqual(kmProperty.getName(), kmClass3.getInlineClassUnderlyingPropertyName()) && kmProperty.getContextParameters().isEmpty() && kmProperty.getReceiverParameterType() == null) {
                        if (i2 != 0) {
                            a$$ExternalSyntheticBUOutline0.m$3("Collection contains more than one matching element.");
                            return null;
                        }
                        i2 = 1;
                        obj4 = obj5;
                    }
                }
                if (i2 == 0) {
                    OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                    return null;
                }
                KmType returnType = ((KmProperty) obj4).getReturnType();
                ClassLoader classLoader2 = cls3.getClassLoader();
                classLoader2.getClass();
                kType = ConvertFromMetadataKt.toKType(returnType, classLoader2, data4.getTypeParameterTable$kotlin_reflection(), null);
                return kType;
            case 4:
                KClassImpl.Data data5 = (KClassImpl.Data) obj3;
                KClassImpl kClassImpl7 = (KClassImpl) obj2;
                boolean useK1ImplementationForFakeOverrides = data5.useK1ImplementationForFakeOverrides();
                if (!useK1ImplementationForFakeOverrides) {
                    if (!useK1ImplementationForFakeOverrides) {
                        return FakeOverridesKt.getAllMembers(kClassImpl7);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal2 = data5.allNonStaticMembers$delegate;
                KProperty[] kPropertyArr = KClassImpl.Data.$$delegatedProperties;
                KProperty kProperty2 = kPropertyArr[14];
                Object invoke = reflectProperties$LazySoftVal2.invoke();
                invoke.getClass();
                ReflectProperties$LazySoftVal reflectProperties$LazySoftVal3 = data5.allStaticMembers$delegate;
                KProperty kProperty3 = kPropertyArr[15];
                Object invoke2 = reflectProperties$LazySoftVal3.invoke();
                invoke2.getClass();
                return kotlin.collections.CollectionsKt.plus((Iterable) invoke2, (Collection) invoke);
            case 5:
                KClassImpl kClassImpl8 = (KClassImpl) obj2;
                KClassImpl.Data data6 = (KClassImpl.Data) obj3;
                if (kClassImpl8.getClassKind$kotlin_reflection() == ClassKind.INTERFACE || kClassImpl8.getClassKind$kotlin_reflection() == ClassKind.OBJECT || kClassImpl8.getClassKind$kotlin_reflection() == ClassKind.COMPANION_OBJECT || kClassImpl8.getClassKind$kotlin_reflection() == ClassKind.ENUM_ENTRY) {
                    return EmptyList.INSTANCE;
                }
                if (SystemPropertiesKt.useK1Implementation || data6.getKmClass() == null) {
                    Collection constructorDescriptors = kClassImpl8.getConstructorDescriptors();
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(constructorDescriptors, 10));
                    Iterator it4 = constructorDescriptors.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(new DescriptorKFunction(kClassImpl8, (ConstructorDescriptor) it4.next()));
                    }
                    return arrayList5;
                }
                Collection constructorsMetadata = kClassImpl8.getConstructorsMetadata();
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(constructorsMetadata, 10));
                Iterator it5 = constructorsMetadata.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(ConvertFromMetadataKt.createUnboundConstructor((KmConstructor) it5.next(), kClassImpl8));
                }
                return arrayList6;
            case 6:
                Class cls4 = ((KClassImpl) obj2).jClass;
                KmClass kmClass4 = ((KClassImpl.Data) obj3).getKmClass();
                if (kmClass4 != null) {
                    ClassId classId2 = ConvertFromMetadataKt.toClassId(kmClass4.getName());
                    ClassLoader safeClassLoader2 = ReflectClassUtilKt.getSafeClassLoader(cls4);
                    List<String> nestedClasses = kmClass4.getNestedClasses();
                    arrayList = new ArrayList();
                    Iterator<T> it6 = nestedClasses.iterator();
                    while (it6.hasNext()) {
                        Name identifier = Name.identifier((String) it6.next());
                        identifier.getClass();
                        loadClass2 = UtilKt.loadClass(safeClassLoader2, classId2.createNestedClassId(identifier), 0);
                        KClass orCreateKotlinClass = loadClass2 != null ? Reflection.factory.getOrCreateKotlinClass(loadClass2) : null;
                        if (orCreateKotlinClass != null) {
                            arrayList.add(orCreateKotlinClass);
                        }
                    }
                } else {
                    Class<?>[] declaredClasses = cls4.getDeclaredClasses();
                    declaredClasses.getClass();
                    arrayList = new ArrayList();
                    int length2 = declaredClasses.length;
                    while (i2 < length2) {
                        Class<?> cls5 = declaredClasses[i2];
                        cls5.getClass();
                        arrayList.add(Reflection.factory.getOrCreateKotlinClass(cls5));
                        i2++;
                    }
                }
                return arrayList;
            case 7:
                Class cls6 = ((KClassImpl) obj2).jClass;
                KmClass kmClass5 = ((KClassImpl.Data) obj3).getKmClass();
                if (kmClass5 == null) {
                    return null;
                }
                if (Attributes.getKind(kmClass5) != ClassKind.OBJECT && Attributes.getKind(kmClass5) != ClassKind.COMPANION_OBJECT) {
                    return null;
                }
                Object obj6 = ((Attributes.getKind(kmClass5) != ClassKind.COMPANION_OBJECT || kotlin.collections.CollectionsKt.contains(CompanionObjectMapping.INSTANCE.getClassIds(), ConvertFromMetadataKt.toClassId(kmClass5.getName()).getOuterClassId())) ? cls6.getDeclaredField("INSTANCE") : cls6.getEnclosingClass().getDeclaredField(ConvertFromMetadataKt.toNonLocalSimpleName(kmClass5.getName()))).get(null);
                obj6.getClass();
                return obj6;
            case 8:
                KClassImpl.Data data7 = (KClassImpl.Data) obj3;
                KClassImpl kClassImpl9 = (KClassImpl) obj2;
                if (!SystemPropertiesKt.useK1Implementation) {
                    if (data7.getKmClass() != null) {
                        return data7.getTypeParameterTable$kotlin_reflection().getOwnTypeParameters();
                    }
                    TypeVariable[] typeParameters = kClassImpl9.jClass.getTypeParameters();
                    typeParameters.getClass();
                    return ConvertFromJavaKt.toKTypeParameters(typeParameters);
                }
                List<TypeParameterDescriptor> declaredTypeParameters = data7.getDescriptor().getDeclaredTypeParameters();
                declaredTypeParameters.getClass();
                List<TypeParameterDescriptor> list = declaredTypeParameters;
                ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (TypeParameterDescriptor typeParameterDescriptor : list) {
                    typeParameterDescriptor.getClass();
                    arrayList7.add(new KTypeParameterImpl(kClassImpl9, typeParameterDescriptor));
                }
                return arrayList7;
            case 9:
                KClassImpl.Data data8 = (KClassImpl.Data) obj3;
                KClassImpl kClassImpl10 = (KClassImpl) obj2;
                Class cls7 = kClassImpl10.jClass;
                if (data8.getKmClass() == null) {
                    return TypeParameterTable.EMPTY;
                }
                TypeParameterTable typeParameterTable2 = TypeParameterTable.EMPTY;
                KmClass kmClass6 = data8.getKmClass();
                kmClass6.getClass();
                List<KmTypeParameter> typeParameters2 = kmClass6.getTypeParameters();
                Class<?> enclosingClass = cls7.getEnclosingClass();
                if (enclosingClass != null) {
                    KmClass kmClass7 = data8.getKmClass();
                    kmClass7.getClass();
                    if (!Attributes.isInner(kmClass7)) {
                        enclosingClass = null;
                    }
                    if (enclosingClass != null) {
                        kClass = Reflection.factory.getOrCreateKotlinClass(enclosingClass);
                        kClassImpl = !(kClass instanceof KClassImpl) ? (KClassImpl) kClass : null;
                        if (kClassImpl != null && (lazy = kClassImpl.data) != null && (data = (KClassImpl.Data) lazy.getValue()) != null) {
                            typeParameterTable = data.getTypeParameterTable$kotlin_reflection();
                        }
                        return MapComposeViewRenderKt.create(typeParameters2, typeParameterTable, kClassImpl10, ReflectClassUtilKt.getSafeClassLoader(cls7));
                    }
                }
                kClass = null;
                if (!(kClass instanceof KClassImpl)) {
                }
                if (kClassImpl != null) {
                    typeParameterTable = data.getTypeParameterTable$kotlin_reflection();
                }
                return MapComposeViewRenderKt.create(typeParameters2, typeParameterTable, kClassImpl10, ReflectClassUtilKt.getSafeClassLoader(cls7));
            default:
                Http2Connection http2Connection = (Http2Connection) obj3;
                Http2Reader http2Reader = (Http2Reader) obj2;
                ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
                try {
                    try {
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (IOException e) {
                        iOException = e;
                    }
                    if (http2Reader.nextFrame(true, this)) {
                        do {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } while (http2Reader.nextFrame(false, this));
                        ErrorCode errorCode2 = ErrorCode.NO_ERROR;
                        try {
                            http2Connection.close$okhttp(errorCode2, ErrorCode.CANCEL, null);
                            this = errorCode2;
                        } catch (IOException e2) {
                            iOException = e2;
                            ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                            http2Connection.close$okhttp(errorCode3, errorCode3, iOException);
                            this = errorCode3;
                            _UtilCommonKt.closeQuietly(http2Reader);
                            return Unit.INSTANCE;
                        }
                        _UtilCommonKt.closeQuietly(http2Reader);
                        return Unit.INSTANCE;
                    }
                    try {
                        throw new IOException("Required SETTINGS preface not received");
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    this = errorCode;
                } catch (Throwable th4) {
                    th = th4;
                }
                http2Connection.close$okhttp(this, errorCode, iOException);
                _UtilCommonKt.closeQuietly(http2Reader);
                throw th;
        }
    }

    public /* synthetic */ KClassImpl$Data$$Lambda$0(KClassImpl kClassImpl, KClassImpl.Data data, int i) {
        this.$r8$classId = i;
        this.arg$0 = kClassImpl;
        this.arg$1 = data;
    }
}
