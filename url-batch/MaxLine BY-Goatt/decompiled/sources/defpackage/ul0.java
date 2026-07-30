package defpackage;

import java.io.File;
import kotlin.io.FileWalkDirection;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ul0 extends tl0 {
    public static boolean d(File file) {
        file.getClass();
        ml0 ml0Var = new ml0(new ol0(file, FileWalkDirection.n, null, null, null, 0, 32, null));
        while (true) {
            boolean z = true;
            while (ml0Var.hasNext()) {
                File file2 = (File) ml0Var.next();
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

    public static File e(File file) {
        int v;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        path.getClass();
        char c = File.separatorChar;
        int i = 0;
        int v2 = up2.v(path, c, 0, 4);
        if (v2 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c || (v = up2.v(path, c, 2, 4)) < 0) {
                i = 1;
            } else {
                int v3 = up2.v(path, c, v + 1, 4);
                i = v3 >= 0 ? v3 + 1 : path.length();
            }
        } else if (v2 > 0 && path.charAt(v2 - 1) == ':') {
            i = v2 + 1;
        } else if (v2 == -1 && up2.s(path, ':')) {
            i = path.length();
        }
        if (i > 0) {
            return file2;
        }
        String file3 = file.toString();
        file3.getClass();
        if (file3.length() == 0 || up2.s(file3, c)) {
            return new File(file3 + file2);
        }
        return new File(file3 + c + file2);
    }
}
