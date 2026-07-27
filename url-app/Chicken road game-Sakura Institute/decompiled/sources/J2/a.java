package J2;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class a extends b {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(File file, File file2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        super(r2);
        file2 = (i2 & 2) != 0 ? null : file2;
        str = (i2 & 4) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(file, "file");
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
    }
}
