package defpackage;

import java.io.File;
import kotlin.io.FileWalkDirection;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class ty extends sy {
    public static boolean d(File file) {
        file.getClass();
        ly lyVar = new ly(new ny(file, FileWalkDirection.e, null, null, null, 0, 32, null));
        while (true) {
            boolean z = true;
            while (lyVar.hasNext()) {
                File file2 = (File) lyVar.next();
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
}
