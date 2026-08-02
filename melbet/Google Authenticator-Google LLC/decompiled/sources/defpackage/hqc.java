package defpackage;

import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hqc {
    public static final hoq a = new hoq();

    public static void a(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }
}
