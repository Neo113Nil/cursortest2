package c6;

import java.io.File;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public class l extends k {
    public static boolean d(File start) {
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(start, "<this>");
        FileWalkDirection direction = FileWalkDirection.f6148e;
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
        f fVar = new f(new h(start, direction, null, null, null, 0, 32, null));
        while (true) {
            boolean z7 = true;
            while (fVar.hasNext()) {
                File file = (File) fVar.next();
                if (file.delete() || !file.exists()) {
                    if (z7) {
                        break;
                    }
                }
                z7 = false;
            }
            return z7;
        }
    }

    public static String e(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String missingDelimiterValue = file.getName();
        Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "getName(...)");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(".", "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int A7 = StringsKt.A(6, missingDelimiterValue, ".");
        if (A7 == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(0, A7);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
}
