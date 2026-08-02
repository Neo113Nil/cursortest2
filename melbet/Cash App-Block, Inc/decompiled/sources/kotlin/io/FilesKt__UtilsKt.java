package kotlin.io;

import java.io.File;
import kotlin.io.FileTreeWalk;
import kotlin.io.FileTreeWalk.FileTreeWalkIterator;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public class FilesKt__UtilsKt extends FilesKt__FileTreeWalkKt {
    public static boolean deleteRecursively(File file) {
        file.getClass();
        FileTreeWalk.FileTreeWalkIterator fileTreeWalkIterator = new FileTreeWalk(file, FileWalkDirection.BOTTOM_UP, null, null, null, 0, 32, null).new FileTreeWalkIterator();
        while (true) {
            boolean z = true;
            while (fileTreeWalkIterator.hasNext()) {
                File file2 = (File) fileTreeWalkIterator.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static String getExtension(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return StringsKt.substringAfterLast('.', name, "");
    }

    public static File resolve(File file, String str) {
        int indexOf$default;
        file.getClass();
        str.getClass();
        File file2 = new File(str);
        String path = file2.getPath();
        path.getClass();
        char c = File.separatorChar;
        int i = 0;
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) path, c, 0, false, 4);
        if (indexOf$default2 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c || (indexOf$default = StringsKt.indexOf$default((CharSequence) path, c, 2, false, 4)) < 0) {
                i = 1;
            } else {
                int indexOf$default3 = StringsKt.indexOf$default((CharSequence) path, c, indexOf$default + 1, false, 4);
                i = indexOf$default3 >= 0 ? indexOf$default3 + 1 : path.length();
            }
        } else if (indexOf$default2 > 0 && path.charAt(indexOf$default2 - 1) == ':') {
            i = indexOf$default2 + 1;
        } else if (indexOf$default2 == -1 && StringsKt.endsWith$default(path, ':')) {
            i = path.length();
        }
        if (i > 0) {
            return file2;
        }
        String file3 = file.toString();
        file3.getClass();
        if (file3.length() == 0 || StringsKt.endsWith$default(file3, c)) {
            return new File(file3 + file2);
        }
        return new File(file3 + c + file2);
    }
}
