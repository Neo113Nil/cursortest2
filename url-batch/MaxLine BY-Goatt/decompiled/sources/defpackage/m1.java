package defpackage;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m1 extends hl0 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m1(File file, File file2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        super(r5.toString());
        file2 = (i & 2) != 0 ? null : file2;
        str = (i & 4) != 0 ? null : str;
        file.getClass();
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
    }
}
