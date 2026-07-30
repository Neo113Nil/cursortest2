package c6;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310a extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0310a(File file, File file2, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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
