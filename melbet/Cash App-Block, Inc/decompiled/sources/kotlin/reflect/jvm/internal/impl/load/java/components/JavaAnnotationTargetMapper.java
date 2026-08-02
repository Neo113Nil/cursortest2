package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;

/* loaded from: classes9.dex */
public final class JavaAnnotationTargetMapper {
    public static final JavaAnnotationTargetMapper INSTANCE = new JavaAnnotationTargetMapper();
    public static final Map targetNameLists = MapsKt__MapsKt.mapOf(new Pair("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), new Pair("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), new Pair("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), new Pair("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), new Pair("FIELD", EnumSet.of(KotlinTarget.FIELD)), new Pair("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), new Pair("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), new Pair("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), new Pair("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), new Pair("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));
    public static final Map retentionNameList = MapsKt__MapsKt.mapOf(new Pair("RUNTIME", KotlinRetention.RUNTIME), new Pair("CLASS", KotlinRetention.BINARY), new Pair("SOURCE", KotlinRetention.SOURCE));

    public final ConstantValue<?> mapJavaRetentionArgument$descriptors_jvm(JavaAnnotationArgument javaAnnotationArgument) {
        JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument ? (JavaEnumValueAnnotationArgument) javaAnnotationArgument : null;
        if (javaEnumValueAnnotationArgument != null) {
            Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            KotlinRetention kotlinRetention = (KotlinRetention) retentionNameList.get(entryName != null ? entryName.asString() : null);
            if (kotlinRetention != null) {
                ClassId classId = ClassId.Companion.topLevel(StandardNames.FqNames.annotationRetention);
                Name identifier = Name.identifier(kotlinRetention.name());
                identifier.getClass();
                return new EnumValue(classId, identifier);
            }
        }
        return null;
    }

    public final Set<KotlinTarget> mapJavaTargetArgumentByName(String str) {
        EnumSet enumSet = (EnumSet) targetNameLists.get(str);
        return enumSet != null ? enumSet : EmptySet.INSTANCE;
    }

    public final ConstantValue<?> mapJavaTargetArguments$descriptors_jvm(List<? extends JavaAnnotationArgument> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof JavaEnumValueAnnotationArgument) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) it.next();
            JavaAnnotationTargetMapper javaAnnotationTargetMapper = INSTANCE;
            Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            CollectionsKt__MutableCollectionsKt.addAll(javaAnnotationTargetMapper.mapJavaTargetArgumentByName(entryName != null ? entryName.asString() : null), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            KotlinTarget kotlinTarget = (KotlinTarget) it2.next();
            ClassId classId = ClassId.Companion.topLevel(StandardNames.FqNames.annotationTarget);
            Name identifier = Name.identifier(kotlinTarget.name());
            identifier.getClass();
            arrayList3.add(new EnumValue(classId, identifier));
        }
        return new ArrayValue(arrayList3, JavaAnnotationTargetMapper$$Lambda$0.INSTANCE);
    }
}
