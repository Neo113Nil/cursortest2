package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;

/* loaded from: classes9.dex */
public final class ClassMapperLite {
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* renamed from: kotlin, reason: collision with root package name */
    public static final String f1532kotlin = CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62);
    public static final LinkedHashMap map;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D"});
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, listOf.size() - 1, 2);
        if (progressionLastElement >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f1532kotlin;
                sb.append(str);
                sb.append('/');
                sb.append((String) listOf.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listOf.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb2, (String) listOf.get(i), "Array"), "[" + ((String) listOf.get(i2)));
                if (i == progressionLastElement) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(f1532kotlin + "/Unit", GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_INTEROPERABILITY);
        map$lambda$0$add(linkedHashMap, "Any", "java/lang/Object");
        map$lambda$0$add(linkedHashMap, "Nothing", "java/lang/Void");
        map$lambda$0$add(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            map$lambda$0$add(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            map$lambda$0$add(linkedHashMap, Recorder$$ExternalSyntheticOutline2.m("collections/", str3), "java/util/" + str3);
            map$lambda$0$add(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        map$lambda$0$add(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        map$lambda$0$add(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = f1532kotlin;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            map$lambda$0$add(linkedHashMap, m, sb3.toString());
            map$lambda$0$add(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            map$lambda$0$add(linkedHashMap, Recorder$$ExternalSyntheticOutline2.m$1(str5, ".Companion"), JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), f1532kotlin, "/jvm/internal/", str5, "CompanionObject"));
        }
        map = linkedHashMap;
    }

    public static final void map$lambda$0$add(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f1532kotlin + '/' + str, "L" + str2 + ';');
    }

    public static final String mapClass(String str) {
        str.getClass();
        String str2 = (String) map.get(str);
        return str2 == null ? CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("L"), StringsKt__StringsJVMKt.replace(str, '.', '$', false), ';') : str2;
    }
}
