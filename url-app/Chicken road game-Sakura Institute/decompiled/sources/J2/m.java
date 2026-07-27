package J2;

import java.io.File;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class m extends l {
    public static boolean d(File start) {
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(start, "<this>");
        FileWalkDirection direction = FileWalkDirection.f7500e;
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
        g gVar = new g(new i(start, direction, null, null, null, 0, 32, null));
        while (true) {
            boolean z4 = true;
            while (gVar.hasNext()) {
                File file = (File) gVar.next();
                if (file.delete() || !file.exists()) {
                    if (z4) {
                        break;
                    }
                }
                z4 = false;
            }
            return z4;
        }
    }
}
