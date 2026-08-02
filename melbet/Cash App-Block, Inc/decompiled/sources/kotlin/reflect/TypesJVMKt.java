package kotlin.reflect;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.reflect.jvm.internal.KTypeParameterImpl;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import operations.logic.equals.strict.StrictEquals;
import papa.PapaEvent;
import type.JsonLogicList;
import utils.AnyUtilsKt;

/* loaded from: classes9.dex */
public abstract class TypesJVMKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.INVARIANT;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.INVARIANT;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.INVARIANT;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String access$typeToString(Type type2) {
        if (!(type2 instanceof Class)) {
            return type2.toString();
        }
        Class cls = (Class) type2;
        if (!cls.isArray()) {
            return cls.getName();
        }
        Sequence generateSequence = SequencesKt__SequencesKt.generateSequence(TypesJVMKt$typeToString$unwrap$1.INSTANCE, type2);
        return ((Class) SequencesKt___SequencesKt.last(generateSequence)).getName() + StringsKt__StringsJVMKt.repeat(SequencesKt___SequencesKt.count(generateSequence), "[]");
    }

    public static boolean compare(StrictEquals strictEquals, Object obj, Function2 function2) {
        JsonLogicList asList = AnyUtilsKt.getAsList(obj);
        List list = asList.items;
        if (list.size() == 1) {
            return false;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(asList, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(strictEquals.unwrapValue(it.next()));
        }
        return strictEquals.compareListOfTwo(arrayList, function2);
    }

    public static final Type computeJavaType(KType kType, boolean z) {
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KTypeParameterBase) {
            KTypeParameterBase kTypeParameterBase = (KTypeParameterBase) classifier;
            GenericDeclaration genericDeclaration = (GenericDeclaration) kTypeParameterBase.javaContainingDeclaration$delegate.getValue();
            if (genericDeclaration == null) {
                f$$ExternalSyntheticLambda0.m((Object) kType, "javaType is not supported for this type: ");
                return null;
            }
            TypeVariable<?>[] typeParameters = genericDeclaration.getTypeParameters();
            typeParameters.getClass();
            TypeVariable<?> typeVariable = null;
            boolean z2 = false;
            for (TypeVariable<?> typeVariable2 : typeParameters) {
                if (Intrinsics.areEqual(typeVariable2.getName(), ((KTypeParameterImpl) kTypeParameterBase).name)) {
                    if (z2) {
                        a$$ExternalSyntheticBUOutline0.m$3("Array contains more than one matching element.");
                        return null;
                    }
                    z2 = true;
                    typeVariable = typeVariable2;
                }
            }
            if (z2) {
                typeVariable.getClass();
                return typeVariable;
            }
            OptionalProvider$$ExternalSyntheticLambda0.m("Array contains no element matching the predicate.");
            return null;
        }
        if (!(classifier instanceof KClass)) {
            f$$ExternalSyntheticLambda0.m((Object) kType, "Unsupported type classifier: ");
            return null;
        }
        KClass kClass = (KClass) classifier;
        Class javaObjectType = z ? PapaEvent.getJavaObjectType(kClass) : PapaEvent.getJavaClass(kClass);
        List arguments = kType.getArguments();
        if (arguments.isEmpty()) {
            return javaObjectType;
        }
        if (!javaObjectType.isArray()) {
            return createPossiblyInnerType(arguments, javaObjectType);
        }
        if (javaObjectType.getComponentType().isPrimitive()) {
            return javaObjectType;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.singleOrNull(arguments);
        if (kTypeProjection == null) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) kType, "kotlin.Array must have exactly one type argument: ");
            return null;
        }
        KVariance kVariance = kTypeProjection.variance;
        KType kType2 = kTypeProjection.f1521type;
        int i = kVariance == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kVariance.ordinal()];
        if (i == -1 || i == 1) {
            return javaObjectType;
        }
        if (i != 2 && i != 3) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        kType2.getClass();
        Type computeJavaType = computeJavaType(kType2, false);
        return computeJavaType instanceof Class ? javaObjectType : new GenericArrayTypeImpl(computeJavaType);
    }

    public static final ParameterizedTypeImpl createPossiblyInnerType(List list, Class cls) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(getJavaType((KTypeProjection) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(getJavaType((KTypeProjection) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        ParameterizedTypeImpl createPossiblyInnerType = createPossiblyInnerType(list.subList(length, list.size()), declaringClass);
        List subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(subList, 10));
        Iterator it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(getJavaType((KTypeProjection) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, createPossiblyInnerType, arrayList3);
    }

    public static final Type getJavaType(KTypeProjection kTypeProjection) {
        KVariance kVariance = kTypeProjection.variance;
        if (kVariance == null) {
            WildcardTypeImpl.Companion.getClass();
            return WildcardTypeImpl.STAR;
        }
        KType kType = kTypeProjection.f1521type;
        kType.getClass();
        int ordinal = kVariance.ordinal();
        if (ordinal == 0) {
            return computeJavaType(kType, true);
        }
        if (ordinal == 1) {
            return new WildcardTypeImpl(null, computeJavaType(kType, true));
        }
        if (ordinal == 2) {
            return new WildcardTypeImpl(computeJavaType(kType, true), null);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static byte[] toBytes(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }
}
