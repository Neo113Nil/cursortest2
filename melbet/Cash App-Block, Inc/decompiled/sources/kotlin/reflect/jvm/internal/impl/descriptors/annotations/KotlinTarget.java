package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class KotlinTarget {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ KotlinTarget[] $VALUES;
    public static final KotlinTarget ANNOTATION_CLASS;
    public static final List ANNOTATION_CLASS_LIST;
    public static final KotlinTarget ANONYMOUS_FUNCTION;
    public static final KotlinTarget BACKING_FIELD;
    public static final KotlinTarget CLASS;
    public static final List CLASS_LIST;
    public static final KotlinTarget CLASS_ONLY;
    public static final KotlinTarget COMPANION_OBJECT;
    public static final List COMPANION_OBJECT_LIST;
    public static final KotlinTarget CONSTRUCTOR;
    public static final Companion Companion;
    public static final KotlinTarget DESTRUCTURING_DECLARATION;
    public static final KotlinTarget ENUM_CLASS;
    public static final KotlinTarget ENUM_ENTRY;
    public static final List ENUM_ENTRY_LIST;
    public static final List ENUM_LIST;
    public static final KotlinTarget EXPRESSION;
    public static final KotlinTarget FIELD;
    public static final KotlinTarget FILE;
    public static final List FILE_LIST;
    public static final KotlinTarget FUNCTION;
    public static final List FUNCTION_LIST;
    public static final KotlinTarget INITIALIZER;
    public static final KotlinTarget INTERFACE;
    public static final List INTERFACE_LIST;
    public static final KotlinTarget LAMBDA_EXPRESSION;
    public static final KotlinTarget LOCAL_CLASS;
    public static final List LOCAL_CLASS_LIST;
    public static final KotlinTarget LOCAL_FUNCTION;
    public static final KotlinTarget LOCAL_VARIABLE;
    public static final KotlinTarget MEMBER_FUNCTION;
    public static final KotlinTarget MEMBER_PROPERTY;
    public static final KotlinTarget MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE;
    public static final KotlinTarget MEMBER_PROPERTY_WITH_BACKING_FIELD;
    public static final KotlinTarget MEMBER_PROPERTY_WITH_DELEGATE;
    public static final KotlinTarget OBJECT;
    public static final List OBJECT_LIST;
    public static final KotlinTarget OBJECT_LITERAL;
    public static final KotlinTarget PROPERTY;
    public static final KotlinTarget PROPERTY_GETTER;
    public static final List PROPERTY_GETTER_LIST;
    public static final KotlinTarget PROPERTY_PARAMETER;
    public static final KotlinTarget PROPERTY_SETTER;
    public static final List PROPERTY_SETTER_LIST;
    public static final KotlinTarget STANDALONE_OBJECT;
    public static final KotlinTarget STAR_PROJECTION;
    public static final KotlinTarget TOP_LEVEL_FUNCTION;
    public static final KotlinTarget TOP_LEVEL_PROPERTY;
    public static final KotlinTarget TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE;
    public static final KotlinTarget TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD;
    public static final KotlinTarget TOP_LEVEL_PROPERTY_WITH_DELEGATE;
    public static final KotlinTarget TYPE;
    public static final KotlinTarget TYPEALIAS;
    public static final KotlinTarget TYPE_PARAMETER;
    public static final KotlinTarget TYPE_PROJECTION;
    public static final KotlinTarget VALUE_PARAMETER;
    public static final HashMap map;
    public final boolean isDefault;

    /* JADX WARN: Type inference failed for: r0v29, types: [kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget$Companion] */
    static {
        KotlinTarget kotlinTarget = new KotlinTarget("CLASS", 0, true);
        CLASS = kotlinTarget;
        KotlinTarget kotlinTarget2 = new KotlinTarget("ANNOTATION_CLASS", 1, true);
        ANNOTATION_CLASS = kotlinTarget2;
        KotlinTarget kotlinTarget3 = new KotlinTarget("TYPE_PARAMETER", 2, false);
        TYPE_PARAMETER = kotlinTarget3;
        KotlinTarget kotlinTarget4 = new KotlinTarget("PROPERTY", 3, true);
        PROPERTY = kotlinTarget4;
        KotlinTarget kotlinTarget5 = new KotlinTarget("FIELD", 4, true);
        FIELD = kotlinTarget5;
        KotlinTarget kotlinTarget6 = new KotlinTarget("LOCAL_VARIABLE", 5, true);
        LOCAL_VARIABLE = kotlinTarget6;
        KotlinTarget kotlinTarget7 = new KotlinTarget("VALUE_PARAMETER", 6, true);
        VALUE_PARAMETER = kotlinTarget7;
        KotlinTarget kotlinTarget8 = new KotlinTarget("CONSTRUCTOR", 7, true);
        CONSTRUCTOR = kotlinTarget8;
        KotlinTarget kotlinTarget9 = new KotlinTarget("FUNCTION", 8, true);
        FUNCTION = kotlinTarget9;
        KotlinTarget kotlinTarget10 = new KotlinTarget("PROPERTY_GETTER", 9, true);
        PROPERTY_GETTER = kotlinTarget10;
        KotlinTarget kotlinTarget11 = new KotlinTarget("PROPERTY_SETTER", 10, true);
        PROPERTY_SETTER = kotlinTarget11;
        KotlinTarget kotlinTarget12 = new KotlinTarget("TYPE", 11, false);
        TYPE = kotlinTarget12;
        KotlinTarget kotlinTarget13 = new KotlinTarget("EXPRESSION", 12, false);
        EXPRESSION = kotlinTarget13;
        KotlinTarget kotlinTarget14 = new KotlinTarget("FILE", 13, false);
        FILE = kotlinTarget14;
        KotlinTarget kotlinTarget15 = new KotlinTarget("TYPEALIAS", 14, false);
        TYPEALIAS = kotlinTarget15;
        KotlinTarget kotlinTarget16 = new KotlinTarget("TYPE_PROJECTION", 15, false);
        TYPE_PROJECTION = kotlinTarget16;
        KotlinTarget kotlinTarget17 = new KotlinTarget("STAR_PROJECTION", 16, false);
        STAR_PROJECTION = kotlinTarget17;
        KotlinTarget kotlinTarget18 = new KotlinTarget("PROPERTY_PARAMETER", 17, false);
        PROPERTY_PARAMETER = kotlinTarget18;
        KotlinTarget kotlinTarget19 = new KotlinTarget("CLASS_ONLY", 18, false);
        CLASS_ONLY = kotlinTarget19;
        KotlinTarget kotlinTarget20 = new KotlinTarget("OBJECT", 19, false);
        OBJECT = kotlinTarget20;
        KotlinTarget kotlinTarget21 = new KotlinTarget("STANDALONE_OBJECT", 20, false);
        STANDALONE_OBJECT = kotlinTarget21;
        KotlinTarget kotlinTarget22 = new KotlinTarget("COMPANION_OBJECT", 21, false);
        COMPANION_OBJECT = kotlinTarget22;
        KotlinTarget kotlinTarget23 = new KotlinTarget("INTERFACE", 22, false);
        INTERFACE = kotlinTarget23;
        KotlinTarget kotlinTarget24 = new KotlinTarget("ENUM_CLASS", 23, false);
        ENUM_CLASS = kotlinTarget24;
        KotlinTarget kotlinTarget25 = new KotlinTarget("ENUM_ENTRY", 24, false);
        ENUM_ENTRY = kotlinTarget25;
        KotlinTarget kotlinTarget26 = new KotlinTarget("LOCAL_CLASS", 25, false);
        LOCAL_CLASS = kotlinTarget26;
        KotlinTarget kotlinTarget27 = new KotlinTarget("LOCAL_FUNCTION", 26, false);
        LOCAL_FUNCTION = kotlinTarget27;
        KotlinTarget kotlinTarget28 = new KotlinTarget("MEMBER_FUNCTION", 27, false);
        MEMBER_FUNCTION = kotlinTarget28;
        KotlinTarget kotlinTarget29 = new KotlinTarget("TOP_LEVEL_FUNCTION", 28, false);
        TOP_LEVEL_FUNCTION = kotlinTarget29;
        KotlinTarget kotlinTarget30 = new KotlinTarget("MEMBER_PROPERTY", 29, false);
        MEMBER_PROPERTY = kotlinTarget30;
        KotlinTarget kotlinTarget31 = new KotlinTarget("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, false);
        MEMBER_PROPERTY_WITH_BACKING_FIELD = kotlinTarget31;
        KotlinTarget kotlinTarget32 = new KotlinTarget("MEMBER_PROPERTY_WITH_DELEGATE", 31, false);
        MEMBER_PROPERTY_WITH_DELEGATE = kotlinTarget32;
        KotlinTarget kotlinTarget33 = new KotlinTarget("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, false);
        MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = kotlinTarget33;
        KotlinTarget kotlinTarget34 = new KotlinTarget("TOP_LEVEL_PROPERTY", 33, false);
        TOP_LEVEL_PROPERTY = kotlinTarget34;
        KotlinTarget kotlinTarget35 = new KotlinTarget("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, false);
        TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD = kotlinTarget35;
        KotlinTarget kotlinTarget36 = new KotlinTarget("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, false);
        TOP_LEVEL_PROPERTY_WITH_DELEGATE = kotlinTarget36;
        KotlinTarget kotlinTarget37 = new KotlinTarget("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, false);
        TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = kotlinTarget37;
        KotlinTarget kotlinTarget38 = new KotlinTarget("BACKING_FIELD", 37, true);
        BACKING_FIELD = kotlinTarget38;
        KotlinTarget kotlinTarget39 = new KotlinTarget("INITIALIZER", 38, false);
        INITIALIZER = kotlinTarget39;
        KotlinTarget kotlinTarget40 = new KotlinTarget("DESTRUCTURING_DECLARATION", 39, false);
        DESTRUCTURING_DECLARATION = kotlinTarget40;
        KotlinTarget kotlinTarget41 = new KotlinTarget("LAMBDA_EXPRESSION", 40, false);
        LAMBDA_EXPRESSION = kotlinTarget41;
        KotlinTarget kotlinTarget42 = new KotlinTarget("ANONYMOUS_FUNCTION", 41, false);
        ANONYMOUS_FUNCTION = kotlinTarget42;
        KotlinTarget kotlinTarget43 = new KotlinTarget("OBJECT_LITERAL", 42, false);
        OBJECT_LITERAL = kotlinTarget43;
        KotlinTarget[] kotlinTargetArr = {kotlinTarget, kotlinTarget2, kotlinTarget3, kotlinTarget4, kotlinTarget5, kotlinTarget6, kotlinTarget7, kotlinTarget8, kotlinTarget9, kotlinTarget10, kotlinTarget11, kotlinTarget12, kotlinTarget13, kotlinTarget14, kotlinTarget15, kotlinTarget16, kotlinTarget17, kotlinTarget18, kotlinTarget19, kotlinTarget20, kotlinTarget21, kotlinTarget22, kotlinTarget23, kotlinTarget24, kotlinTarget25, kotlinTarget26, kotlinTarget27, kotlinTarget28, kotlinTarget29, kotlinTarget30, kotlinTarget31, kotlinTarget32, kotlinTarget33, kotlinTarget34, kotlinTarget35, kotlinTarget36, kotlinTarget37, kotlinTarget38, kotlinTarget39, kotlinTarget40, kotlinTarget41, kotlinTarget42, kotlinTarget43};
        $VALUES = kotlinTargetArr;
        $ENTRIES = new EnumEntriesList(kotlinTargetArr);
        Companion = new Object(null) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.Companion
        };
        map = new HashMap();
        for (KotlinTarget kotlinTarget44 : getEntries()) {
            map.put(kotlinTarget44.name(), kotlinTarget44);
        }
        EnumEntries entries = getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (((KotlinTarget) obj).isDefault) {
                arrayList.add(obj);
            }
        }
        CollectionsKt.toSet(arrayList);
        CollectionsKt.toSet(getEntries());
        KotlinTarget kotlinTarget45 = ANNOTATION_CLASS;
        KotlinTarget kotlinTarget46 = CLASS;
        ANNOTATION_CLASS_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{kotlinTarget45, kotlinTarget46});
        LOCAL_CLASS_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{LOCAL_CLASS, kotlinTarget46});
        CLASS_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{CLASS_ONLY, kotlinTarget46});
        KotlinTarget kotlinTarget47 = COMPANION_OBJECT;
        KotlinTarget kotlinTarget48 = OBJECT;
        COMPANION_OBJECT_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{kotlinTarget47, kotlinTarget48, kotlinTarget46});
        OBJECT_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{STANDALONE_OBJECT, kotlinTarget48, kotlinTarget46});
        INTERFACE_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{INTERFACE, kotlinTarget46});
        ENUM_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{ENUM_CLASS, kotlinTarget46});
        KotlinTarget kotlinTarget49 = ENUM_ENTRY;
        KotlinTarget kotlinTarget50 = PROPERTY;
        KotlinTarget kotlinTarget51 = FIELD;
        ENUM_ENTRY_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{kotlinTarget49, kotlinTarget50, kotlinTarget51});
        KotlinTarget kotlinTarget52 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = CollectionsKt__CollectionsJVMKt.listOf(kotlinTarget52);
        KotlinTarget kotlinTarget53 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = CollectionsKt__CollectionsJVMKt.listOf(kotlinTarget53);
        FUNCTION_LIST = CollectionsKt__CollectionsJVMKt.listOf(FUNCTION);
        KotlinTarget kotlinTarget54 = FILE;
        FILE_LIST = CollectionsKt__CollectionsJVMKt.listOf(kotlinTarget54);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        KotlinTarget kotlinTarget55 = VALUE_PARAMETER;
        MapsKt__MapsKt.mapOf(new Pair(annotationUseSiteTarget, kotlinTarget55), new Pair(AnnotationUseSiteTarget.FIELD, kotlinTarget51), new Pair(AnnotationUseSiteTarget.PROPERTY, kotlinTarget50), new Pair(AnnotationUseSiteTarget.FILE, kotlinTarget54), new Pair(AnnotationUseSiteTarget.PROPERTY_GETTER, kotlinTarget53), new Pair(AnnotationUseSiteTarget.PROPERTY_SETTER, kotlinTarget52), new Pair(AnnotationUseSiteTarget.RECEIVER, kotlinTarget55), new Pair(AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget55), new Pair(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget51));
    }

    public KotlinTarget(String str, int i, boolean z) {
        this.isDefault = z;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static KotlinTarget valueOf(String str) {
        return (KotlinTarget) Enum.valueOf(KotlinTarget.class, str);
    }

    public static KotlinTarget[] values() {
        return (KotlinTarget[]) $VALUES.clone();
    }
}
