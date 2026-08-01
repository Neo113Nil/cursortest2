package sd;

import java.io.File;
import kotlin.io.FileWalkDirection;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class l extends k {
    public static boolean d(File file) {
        file.getClass();
        f fVar = new f(new h(file, FileWalkDirection.f5594e, null, null, null, 0, 32, null));
        while (true) {
            boolean z10 = true;
            while (fVar.hasNext()) {
                File file2 = (File) fVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z10) {
                        break;
                    }
                }
                z10 = false;
            }
            return z10;
        }
    }
}
