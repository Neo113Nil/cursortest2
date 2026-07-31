package f2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class m extends l {
    public static final File k(File file, File target, boolean z4, int i4) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new o(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z4) {
                throw new f(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new f(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new g(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                AbstractC2419b.a(fileInputStream, fileOutputStream, i4);
                AbstractC2420c.a(fileOutputStream, null);
                AbstractC2420c.a(fileInputStream, null);
                return target;
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ File l(File file, File file2, boolean z4, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 8192;
        }
        return k(file, file2, z4, i4);
    }

    public static boolean m(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z4 = true;
            for (File file2 : l.j(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z4) {
                        break;
                    }
                }
                z4 = false;
            }
            return z4;
        }
    }

    public static final File n(File file, File relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        if (j.b(relative)) {
            return relative;
        }
        String file2 = file.toString();
        Intrinsics.checkNotNullExpressionValue(file2, "toString(...)");
        if (file2.length() != 0) {
            char c4 = File.separatorChar;
            if (!StringsKt.S(file2, c4, false, 2, null)) {
                return new File(file2 + c4 + relative);
            }
        }
        return new File(file2 + relative);
    }

    public static File o(File file, String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return n(file, new File(relative));
    }
}
