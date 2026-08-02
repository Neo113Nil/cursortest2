package kotlin.reflect.jvm.internal;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.Mac;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.PrefixMap;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.google.crypto.tink.mac.MacKey;
import com.google.crypto.tink.mac.internal.LegacyFullMac;
import com.google.crypto.tink.util.Bytes;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.types.AbstractKType;
import kotlin.reflect.jvm.internal.types.FlexibleKType;
import kotlin.reflect.jvm.internal.types.MutableCollectionKClassKt;
import kotlin.reflect.jvm.internal.types.SimpleKType;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public abstract class ConvertFromJavaKt {
    public static final void ActivitySectionHeader(String str, Composer composer, int i) {
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-841804834);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            long j = MooncakeTheme.getColors(gapComposer).behindBackground;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f), RecyclerView.DECELERATION_RATE, 36.0f, RecyclerView.DECELERATION_RATE, 12.0f, 5);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, (i2 & 14) | 48, 0, 4080, MooncakeTheme.getColors(gapComposer).secondaryLabel, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), MooncakeTheme.getTypography(gapComposer).identifier, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, i, 27);
        }
    }

    public static final List allTypeParameters(Class cls) {
        cls.getClass();
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.flatMap(SequencesKt__SequencesKt.generateSequence(UtilKt$$Lambda$0.INSTANCE$2, cls), UtilKt$$Lambda$0.INSTANCE$3));
    }

    public static LegacyFullMac create(KeysetHandle keysetHandle, PrimitiveRegistry$$ExternalSyntheticLambda0 primitiveRegistry$$ExternalSyntheticLambda0) {
        Bytes outputPrefix;
        List arrayList;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < ((List) keysetHandle.entries).size(); i++) {
            KeysetHandle.Entry at = keysetHandle.getAt(i);
            if (at.keyStatus.equals(KeyStatus.ENABLED)) {
                final Mac mac = (Mac) primitiveRegistry$$ExternalSyntheticLambda0.create(at);
                TransactorKt key = at.getKey();
                if (key instanceof MacKey) {
                    outputPrefix = ((MacKey) key).getOutputPrefix();
                } else {
                    if (!(key instanceof LegacyProtoKey)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + key.getClass().getName() + " with parameters " + key.getParameters());
                    }
                    outputPrefix = ((LegacyProtoKey) key).getOutputPrefix();
                }
                final int i2 = at.id;
                Object obj = new Object(mac, i2) { // from class: com.google.crypto.tink.mac.internal.WrappedMac$MacWithId
                };
                byte[] bArr = outputPrefix.data;
                if (bArr.length != 0 && bArr.length != 5) {
                    a$$ExternalSyntheticBUOutline0.m$6("PrefixMap only supports 0 and 5 byte prefixes");
                    return null;
                }
                if (hashMap.containsKey(outputPrefix)) {
                    arrayList = (List) hashMap.get(outputPrefix);
                } else {
                    arrayList = new ArrayList();
                    hashMap.put(outputPrefix, arrayList);
                }
                arrayList.add(obj);
            }
        }
        keysetHandle.getAnnotationsOrNull();
        final Mac mac2 = (Mac) primitiveRegistry$$ExternalSyntheticLambda0.create(keysetHandle.getPrimary$1());
        final int i3 = keysetHandle.getPrimary$1().id;
        new Object(mac2, i3) { // from class: com.google.crypto.tink.mac.internal.WrappedMac$MacWithId
        };
        new PrefixMap(hashMap);
        return new LegacyFullMac();
    }

    public static SimpleKType createJavaSimpleType$default(Type type2, KClassifier kClassifier, List list, boolean z) {
        return new SimpleKType(kClassifier, list, z, EmptyList.INSTANCE, null, false, false, false, null, new ConvertFromJavaKt$$Lambda$0(2, type2));
    }

    public static final KClassImpl getKotlinContainer(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (KClassImpl) Reflection.factory.getOrCreateKotlinClass((Class) genericDeclaration);
        }
        f$$ExternalSyntheticLambda0.m("Non-class container of a type parameter is not supported: ", genericDeclaration, " (", typeVariable);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final FlexibleKType toFlexibleArrayElementVarianceType(SimpleKType simpleKType, Type type2) {
        KClassifier kClassifier = simpleKType.classifier;
        List<KTypeProjection> list = simpleKType.arguments;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (KTypeProjection kTypeProjection : list) {
            KType kType = kTypeProjection.f1521type;
            if (kType != null) {
                KTypeProjection.INSTANCE.getClass();
                kTypeProjection = new KTypeProjection(kType, KVariance.OUT);
            }
            arrayList.add(kTypeProjection);
        }
        SimpleKType createJavaSimpleType$default = createJavaSimpleType$default(type2, kClassifier, arrayList, true);
        ConvertFromJavaKt$$Lambda$0 convertFromJavaKt$$Lambda$0 = new ConvertFromJavaKt$$Lambda$0(3, type2);
        boolean equals = simpleKType.equals(createJavaSimpleType$default);
        FlexibleKType flexibleKType = simpleKType;
        if (!equals) {
            flexibleKType = new FlexibleKType(simpleKType, createJavaSimpleType$default, false, convertFromJavaKt$$Lambda$0);
        }
        return flexibleKType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0224, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0229, code lost:
    
        if (r3 == false) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v22, types: [kotlin.reflect.jvm.internal.types.FlexibleKType] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static KType toKType$default(Type type2, Map map, TypeNullability typeNullability, boolean z, int i) {
        AbstractKType createJavaSimpleType$default;
        ArrayList arrayList;
        String qualifiedName;
        UtilKt$$Lambda$0 utilKt$$Lambda$0 = UtilKt$$Lambda$0.INSTANCE$5;
        UtilKt$$Lambda$0 utilKt$$Lambda$02 = UtilKt$$Lambda$0.INSTANCE$4;
        TypeNullability typeNullability2 = (i & 2) != 0 ? TypeNullability.FLEXIBLE : typeNullability;
        int i2 = 0;
        boolean z2 = (i & 4) != 0 ? false : z;
        type2.getClass();
        map.getClass();
        typeNullability2.getClass();
        FqNameUnsafe fqNameUnsafe = null;
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            if (!allTypeParameters(cls).isEmpty() && !z2) {
                KClass kotlinClass = PapaEvent.getKotlinClass(cls);
                List allTypeParameters = allTypeParameters(cls);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allTypeParameters, 10));
                Iterator it = allTypeParameters.iterator();
                while (it.hasNext()) {
                    Type[] bounds = ((TypeVariable) SequencesKt___SequencesKt.last(SequencesKt__SequencesKt.generateSequence(UtilKt$$Lambda$0.INSTANCE$1, (TypeVariable) it.next()))).getBounds();
                    bounds.getClass();
                    Type type3 = (Type) ArraysKt___ArraysKt.first(bounds);
                    KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                    type3.getClass();
                    KType kType$default = toKType$default(type3, map, null, true, 2);
                    companion.getClass();
                    arrayList2.add(KTypeProjection.Companion.invariant(kType$default));
                }
                SimpleKType createJavaSimpleType$default2 = createJavaSimpleType$default(cls, kotlinClass, arrayList2, false);
                KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(cls);
                List<TypeVariable> allTypeParameters2 = allTypeParameters(cls);
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allTypeParameters2, 10));
                for (TypeVariable typeVariable : allTypeParameters2) {
                    KTypeProjection.INSTANCE.getClass();
                    arrayList3.add(KTypeProjection.star);
                }
                SimpleKType createJavaSimpleType$default3 = createJavaSimpleType$default(cls, orCreateKotlinClass, arrayList3, true);
                return createJavaSimpleType$default2.equals(createJavaSimpleType$default3) ? createJavaSimpleType$default2 : new FlexibleKType(createJavaSimpleType$default2, createJavaSimpleType$default3, true, new ConvertFromJavaKt$$Lambda$4(cls, i2));
            }
            if (cls.isArray()) {
                KClass orCreateKotlinClass2 = Reflection.factory.getOrCreateKotlinClass(cls);
                Class<?> componentType = cls.getComponentType();
                componentType.getClass();
                return toFlexibleArrayElementVarianceType(createJavaSimpleType$default(type2, orCreateKotlinClass2, CollectionsKt__CollectionsJVMKt.listOf(toKTypeProjection(componentType, map)), false), type2);
            }
            KClass orCreateKotlinClass3 = Reflection.factory.getOrCreateKotlinClass(cls);
            List<TypeVariable> allTypeParameters3 = allTypeParameters(cls);
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allTypeParameters3, 10));
            for (TypeVariable typeVariable2 : allTypeParameters3) {
                KTypeProjection.INSTANCE.getClass();
                arrayList4.add(KTypeProjection.star);
            }
            createJavaSimpleType$default = createJavaSimpleType$default(type2, orCreateKotlinClass3, arrayList4, false);
        } else {
            if (type2 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                genericComponentType.getClass();
                KTypeProjection kTypeProjection = toKTypeProjection(genericComponentType, map);
                KType kType = kTypeProjection.f1521type;
                kType.getClass();
                return toFlexibleArrayElementVarianceType(createJavaSimpleType$default(type2, Reflection.factory.getOrCreateKotlinClass(UtilKt.createArrayType(PapaEvent.getJavaClass(KTypesJvm.getJvmErasure(kType)))), CollectionsKt__CollectionsJVMKt.listOf(kTypeProjection), false), type2);
            }
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type2;
                Type rawType = parameterizedType.getRawType();
                rawType.getClass();
                KClass orCreateKotlinClass4 = Reflection.factory.getOrCreateKotlinClass((Class) rawType);
                if (z2) {
                    List<Type> list = SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.flatMapIterable(SequencesKt__SequencesKt.generateSequence(utilKt$$Lambda$02, parameterizedType), utilKt$$Lambda$0));
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (Type type4 : list) {
                        KTypeProjection.INSTANCE.getClass();
                        arrayList.add(KTypeProjection.star);
                    }
                } else {
                    List list2 = SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.flatMapIterable(SequencesKt__SequencesKt.generateSequence(utilKt$$Lambda$02, parameterizedType), utilKt$$Lambda$0));
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(toKTypeProjection((Type) it2.next(), map));
                    }
                    arrayList = arrayList5;
                }
                createJavaSimpleType$default = createJavaSimpleType$default(type2, orCreateKotlinClass4, arrayList, false);
            } else {
                if (!(type2 instanceof TypeVariable)) {
                    if (type2 instanceof WildcardType) {
                        f$$ExternalSyntheticLambda0.m$1(type2, "Wildcard type is not possible here: ");
                        return null;
                    }
                    StringBuilder sb = new StringBuilder("Type is not supported: ");
                    sb.append(type2);
                    Class<?> cls2 = type2.getClass();
                    sb.append(" (");
                    sb.append(cls2);
                    sb.append(')');
                    throw new KotlinReflectionInternalError(sb.toString());
                }
                TypeVariable typeVariable3 = (TypeVariable) type2;
                KTypeParameterBase kTypeParameterBase = (KTypeParameterBase) map.get(typeVariable3);
                if (kTypeParameterBase == null) {
                    Iterator it3 = getKotlinContainer(typeVariable3).getTypeParameters().iterator();
                    boolean z3 = false;
                    KTypeParameterBase kTypeParameterBase2 = null;
                    while (true) {
                        if (it3.hasNext()) {
                            ?? next = it3.next();
                            if (Intrinsics.areEqual(((KTypeParameterImpl) ((KTypeParameterBase) next)).name, typeVariable3.getName())) {
                                if (z3) {
                                    break;
                                }
                                kTypeParameterBase2 = next;
                                z3 = true;
                            }
                        }
                    }
                    kTypeParameterBase = kTypeParameterBase2;
                    if (kTypeParameterBase == null) {
                        throw new KotlinReflectionInternalError("Type parameter " + typeVariable3.getName() + " is not found in " + getKotlinContainer(typeVariable3));
                    }
                }
                createJavaSimpleType$default = createJavaSimpleType$default(type2, kTypeParameterBase, EmptyList.INSTANCE, false);
            }
        }
        KClassifier kClassifier = createJavaSimpleType$default.classifier;
        KClass kClass = kClassifier instanceof KClass ? (KClass) kClassifier : null;
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        if (kClass != null && (qualifiedName = kClass.getQualifiedName()) != null) {
            fqNameUnsafe = new FqNameUnsafe(qualifiedName);
        }
        FqName readOnlyToMutable = javaToKotlinClassMap.readOnlyToMutable(fqNameUnsafe);
        if (readOnlyToMutable != null && kClass != null) {
            SimpleKType simpleKType = new SimpleKType(kClassifier, createJavaSimpleType$default.arguments, createJavaSimpleType$default.isMarkedNullable, EmptyList.INSTANCE, null, false, false, false, MutableCollectionKClassKt.getMutableCollectionKClass(kClass, readOnlyToMutable), new ConvertFromJavaKt$$Lambda$0(2, type2));
            createJavaSimpleType$default = simpleKType.equals(createJavaSimpleType$default) ? simpleKType : new FlexibleKType(simpleKType, createJavaSimpleType$default, false, new ConvertFromJavaKt$$Lambda$0(0, type2));
        }
        int ordinal = typeNullability2.ordinal();
        if (ordinal == 0) {
            return createJavaSimpleType$default;
        }
        if (ordinal == 1) {
            return createJavaSimpleType$default.makeNullableAsSpecified(true);
        }
        AbstractKType lowerBoundIfFlexible = createJavaSimpleType$default.lowerBoundIfFlexible();
        if (lowerBoundIfFlexible == null) {
            lowerBoundIfFlexible = createJavaSimpleType$default;
        }
        AbstractKType upperBoundIfFlexible = createJavaSimpleType$default.upperBoundIfFlexible();
        if (upperBoundIfFlexible != null) {
            createJavaSimpleType$default = upperBoundIfFlexible;
        }
        AbstractKType makeNullableAsSpecified = createJavaSimpleType$default.makeNullableAsSpecified(true);
        ConvertFromJavaKt$$Lambda$0 convertFromJavaKt$$Lambda$0 = new ConvertFromJavaKt$$Lambda$0(1, type2);
        makeNullableAsSpecified.getClass();
        return lowerBoundIfFlexible.equals(makeNullableAsSpecified) ? lowerBoundIfFlexible : new FlexibleKType(lowerBoundIfFlexible, makeNullableAsSpecified, false, convertFromJavaKt$$Lambda$0);
    }

    public static final List toKTypeParameters(TypeVariable[] typeVariableArr) {
        typeVariableArr.getClass();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(typeVariableArr.length);
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (TypeVariable typeVariable : typeVariableArr) {
            KClassImpl kotlinContainer = getKotlinContainer(typeVariable);
            String name = typeVariable.getName();
            name.getClass();
            linkedHashMap.put(typeVariable, new KTypeParameterImpl(null, kotlinContainer, name, KVariance.INVARIANT));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            TypeVariable typeVariable2 = (TypeVariable) entry.getKey();
            KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) entry.getValue();
            Type[] bounds = typeVariable2.getBounds();
            bounds.getClass();
            ArrayList arrayList = new ArrayList(bounds.length);
            for (Type type2 : bounds) {
                type2.getClass();
                arrayList.add(toKType$default(type2, linkedHashMap, null, false, 6));
            }
            kTypeParameterImpl.getClass();
            kTypeParameterImpl.upperBounds = arrayList;
        }
        return CollectionsKt.toList(linkedHashMap.values());
    }

    public static final KTypeProjection toKTypeProjection(Type type2, Map map) {
        if (!(type2 instanceof WildcardType)) {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            KType kType$default = toKType$default(type2, map, null, false, 6);
            companion.getClass();
            return KTypeProjection.Companion.invariant(kType$default);
        }
        WildcardType wildcardType = (WildcardType) type2;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            f$$ExternalSyntheticLambda0.m$1(type2, "Wildcard types with many bounds are not supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            Object single = ArraysKt___ArraysKt.single(lowerBounds);
            single.getClass();
            KType kType$default2 = toKType$default((Type) single, map, null, false, 6);
            companion2.getClass();
            kType$default2.getClass();
            return new KTypeProjection(kType$default2, KVariance.IN);
        }
        if (upperBounds.length != 1) {
            KTypeProjection.INSTANCE.getClass();
            return KTypeProjection.star;
        }
        KTypeProjection.Companion companion3 = KTypeProjection.INSTANCE;
        Object single2 = ArraysKt___ArraysKt.single(upperBounds);
        single2.getClass();
        KType kType$default3 = toKType$default((Type) single2, map, null, false, 6);
        companion3.getClass();
        kType$default3.getClass();
        return new KTypeProjection(kType$default3, KVariance.OUT);
    }
}
