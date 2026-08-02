package kotlin.reflect.jvm.internal.impl.load.kotlin;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes9.dex */
public final class SignatureBuildingComponents {
    public static final SignatureBuildingComponents INSTANCE = new SignatureBuildingComponents();

    public final String[] constructors(String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final Set<String> inClass(String str, String... strArr) {
        str.getClass();
        strArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public final Set<String> inJavaLang(String str, String... strArr) {
        str.getClass();
        strArr.getClass();
        return inClass(javaLang(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final Set<String> inJavaUtil(String str, String... strArr) {
        str.getClass();
        strArr.getClass();
        return inClass(javaUtil(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final String javaFunction(String str) {
        str.getClass();
        return "java/util/function/" + str;
    }

    public final String javaLang(String str) {
        str.getClass();
        return "java/lang/" + str;
    }

    public final String javaUtil(String str) {
        str.getClass();
        return "java/util/" + str;
    }

    public final String javaUtilConcurrentAtomic(String str) {
        str.getClass();
        return "java/util/concurrent/atomic/" + str;
    }

    public final String jvmDescriptor(String str, List<String> list, String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(CollectionsKt.joinToString$default(list, "", null, null, 0, null, SignatureBuildingComponents$$Lambda$0.INSTANCE, 30));
        sb.append(')');
        if (str2.length() > 1) {
            str2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(';', "L", str2);
        }
        sb.append(str2);
        return sb.toString();
    }

    public final String signature(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str + '.' + str2;
    }
}
