package f2;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2421d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
