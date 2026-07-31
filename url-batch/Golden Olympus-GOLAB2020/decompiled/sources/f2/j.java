package f2;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
class j {
    private static final int a(String str) {
        int b02;
        char c4 = File.separatorChar;
        int b03 = StringsKt.b0(str, c4, 0, false, 4, null);
        if (b03 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c4 || (b02 = StringsKt.b0(str, c4, 2, false, 4, null)) < 0) {
                return 1;
            }
            int b04 = StringsKt.b0(str, c4, b02 + 1, false, 4, null);
            return b04 >= 0 ? b04 + 1 : str.length();
        }
        if (b03 > 0 && str.charAt(b03 - 1) == ':') {
            return b03 + 1;
        }
        if (b03 == -1 && StringsKt.S(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final boolean b(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return a(path) > 0;
    }
}
