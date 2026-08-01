package sd;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(File file, File file2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        super(r5.toString());
        file2 = (i3 & 2) != 0 ? null : file2;
        str = (i3 & 4) != 0 ? null : str;
        file.getClass();
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        if (str != null) {
            sb2.append(": ".concat(str));
        }
    }
}
