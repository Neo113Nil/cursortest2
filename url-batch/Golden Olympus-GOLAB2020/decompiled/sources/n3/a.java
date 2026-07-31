package n3;

import f2.i;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {
    public static final File a(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (!file.exists() || i.m(file)) {
            return file;
        }
        throw new IOException("Can't delete " + file);
    }

    public static final File b(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException(file + " is not a directory");
            }
        } else if (!file.mkdirs()) {
            throw new IOException("Can't create " + file);
        }
        return file;
    }

    public static final File c(File file, File dest) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(dest, "dest");
        if (file.renameTo(dest)) {
            return file;
        }
        throw new IOException("Can't rename " + file + " to " + dest);
    }
}
