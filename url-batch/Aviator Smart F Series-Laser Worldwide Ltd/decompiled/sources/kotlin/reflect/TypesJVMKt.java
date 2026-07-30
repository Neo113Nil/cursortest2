package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import okhttp3.HttpUrl;

/* loaded from: classes4.dex */
public abstract class TypesJVMKt {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type computeJavaType(q qVar, boolean z7) {
        Object singleOrNull;
        f classifier = qVar.getClassifier();
        if (classifier instanceof r) {
            return new u((r) classifier);
        }
        if (!(classifier instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + qVar);
        }
        d dVar = (d) classifier;
        Class javaObjectType = z7 ? e6.a.getJavaObjectType(dVar) : e6.a.getJavaClass(dVar);
        List<s> arguments = qVar.getArguments();
        if (arguments.isEmpty()) {
            return javaObjectType;
        }
        if (!javaObjectType.isArray()) {
            return createPossiblyInnerType(javaObjectType, arguments);
        }
        if (javaObjectType.getComponentType().isPrimitive()) {
            return javaObjectType;
        }
        singleOrNull = CollectionsKt___CollectionsKt.singleOrNull((List<? extends Object>) arguments);
        s sVar = (s) singleOrNull;
        if (sVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + qVar);
        }
        KVariance component1 = sVar.component1();
        q component2 = sVar.component2();
        int i8 = component1 == null ? -1 : a.$EnumSwitchMapping$0[component1.ordinal()];
        if (i8 == -1 || i8 == 1) {
            return javaObjectType;
        }
        if (i8 != 2 && i8 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        kotlin.jvm.internal.s.checkNotNull(component2);
        Type computeJavaType$default = computeJavaType$default(component2, false, 1, null);
        return computeJavaType$default instanceof Class ? javaObjectType : new kotlin.reflect.a(computeJavaType$default);
    }

    static /* synthetic */ Type computeJavaType$default(q qVar, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        return computeJavaType(qVar, z7);
    }

    private static final Type createPossiblyInnerType(Class<?> cls, List<s> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<s> list2 = list;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(getJavaType((s) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<s> list3 = list;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(getJavaType((s) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type createPossiblyInnerType = createPossiblyInnerType(declaringClass, list.subList(length, list.size()));
        List<s> subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(subList, 10));
        Iterator<T> it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(getJavaType((s) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, createPossiblyInnerType, arrayList3);
    }

    public static final Type getJavaType(q qVar) {
        kotlin.jvm.internal.s.checkNotNullParameter(qVar, "<this>");
        return computeJavaType$default(qVar, false, 1, null);
    }

    public static /* synthetic */ void getJavaType$annotations(q qVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String typeToString(Type type) {
        String name;
        kotlin.sequences.m generateSequence;
        Object last;
        int count;
        String repeat;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            generateSequence = SequencesKt__SequencesKt.generateSequence(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
            StringBuilder sb = new StringBuilder();
            last = SequencesKt___SequencesKt.last(generateSequence);
            sb.append(((Class) last).getName());
            count = SequencesKt___SequencesKt.count(generateSequence);
            repeat = kotlin.text.t.repeat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, count);
            sb.append(repeat);
            name = sb.toString();
        } else {
            name = cls.getName();
        }
        kotlin.jvm.internal.s.checkNotNullExpressionValue(name, "{\n        if (type.isArr…   } else type.name\n    }");
        return name;
    }

    private static final Type getJavaType(s sVar) {
        KVariance variance = sVar.getVariance();
        if (variance == null) {
            return v.Companion.getSTAR();
        }
        q type = sVar.getType();
        kotlin.jvm.internal.s.checkNotNull(type);
        int i8 = a.$EnumSwitchMapping$0[variance.ordinal()];
        if (i8 == 1) {
            return new v(null, computeJavaType(type, true));
        }
        if (i8 == 2) {
            return computeJavaType(type, true);
        }
        if (i8 == 3) {
            return new v(computeJavaType(type, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static /* synthetic */ void getJavaType$annotations(s sVar) {
    }
}
