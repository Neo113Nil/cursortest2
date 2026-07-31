package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class m extends l {
    public static Double j(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (f.f41278b.d(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Float k(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (f.f41278b.d(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
