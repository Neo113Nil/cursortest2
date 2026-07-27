package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class s extends r {
    public static Double d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (k.f7541b.b(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
