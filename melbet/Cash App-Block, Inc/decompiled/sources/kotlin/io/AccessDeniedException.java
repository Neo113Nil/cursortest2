package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/AccessDeniedException;", "Lkotlin/io/FileSystemException;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AccessDeniedException extends FileSystemException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AccessDeniedException(File file, File file2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
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
