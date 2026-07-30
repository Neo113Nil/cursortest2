package y;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public abstract class c {
    public static final boolean a(String str) {
        s.checkNotNullParameter(str, "<this>");
        return s.areEqual(str, "en_us") || s.areEqual(str, "zh_cn");
    }

    public static final String b(String str) {
        s.checkNotNullParameter(str, "<this>");
        int hashCode = str.hashCode();
        if (hashCode == 93072369) {
            return str.equals("ar_il") ? "ara" : "zh";
        }
        if (hashCode == 96647668) {
            return !str.equals("en_us") ? "zh" : "en";
        }
        if (hashCode != 115862300) {
            return "zh";
        }
        str.equals("zh_cn");
        return "zh";
    }
}
